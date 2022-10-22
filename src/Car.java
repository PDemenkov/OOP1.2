import java.time.LocalDate;

public class Car extends Transport {
    private float engineVolume;
    private String gearBox;
    private final String bodyType;
    private String regNumber;

    private final int placeCount;
    private boolean winterTires;

    private final Key key;
    private final Insurance insurance;

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int productionYear,
               String productionCounty,
               String gearBox,
               String bodyType,
               String regNumber,
               int placeCount,
               boolean winterTires,
               Key key,
               Insurance insurance) {
        super(brand, model, productionYear, productionCounty, color);
        this.bodyType = ValidationUtils.validOrDefault(bodyType, "type");
        this.placeCount = Math.max(placeCount, 1);
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setColor(color);
        setGearBox(gearBox);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);

    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "ABEKHMHORCTYX";
        return allowedSymbols.contains("" + symbol);
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = ValidationUtils.validOrDefault(gearBox, "default");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "default");
    }

    public int getPlaceCount() {
        return placeCount;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void winterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCounty='" + getProductionCounty() + '\'' +
                ", gearBox= " + gearBox +
                ", bodyType= " + bodyType +
                ", regNumber= " + regNumber +
                ", placeCount= " + placeCount +
                ", winterTires= " + winterTires +
                ", key= " + " Удаленный запуск: " + key.remoteEngineStart + " Безключевой доступ " + key.keylessAccess +
                ", insurance= " + " Страховка действует: " + insurance.isInsuranceValid() + " Номер верный: " + insurance.ilNumberValid() +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = ValidationUtils.validOrDefault(number, "default");
        }

        public boolean ilNumberValid() {
            return number.length() == 9;
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }
}
