package Transport;

public class Car {
   private final String brand;
   private final String model;
    double engineVolume;
    private String color;
    private final int productionYear;
    private final  String productionCountry;
    private String gears;
    private final  String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               String typeOfBody,
               String regNumber,
               int seatsCount,
               boolean summerTyres) {
        if (brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (Double.compare(engineVolume,0) == 0) {
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }

        this.productionYear = productionYear;
        if (productionCountry == null) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }
        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (typeOfBody == null) {
            this.typeOfBody = "седан";
        } else {
            this.typeOfBody = typeOfBody;
        }
        this.seatsCount = seatsCount;
        this.summerTyres = summerTyres;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry) {
        this(brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "МКПП",
                "седан",
                "x000xx000",
                5,
                true);
    }

   public void printOut() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, " + "Sborka in " + productionCountry + ", Cvet: " + color + ", Ob'em dvigatelya " + engineVolume);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void changeTyres(){
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        //x000xx0000
        if (regNumber.length() != 9) {
            return false;
        }
        char [] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
        || !Character.isDigit(chars[6])  || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }
}
