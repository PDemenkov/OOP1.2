public class Transport {

    private final String brand;
    private final String model;

    private final int productionYear;
    private final String productionCounty;

    private String color;
    private final int maxSpeed;

//    public Transport(String brand, String model, String productionCounty) {
//        this(brand, model,0,"","");
//    }
    public Transport(String brand, String model, int productionYear, String productionCounty,String color) {
        this(brand, model, productionYear, productionCounty,color,0); //конструктор car без скорости
    }

    public Transport(String brand, String model, int productionYear, String productionCounty,String color,int maxSpeed) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.productionYear = productionYear >= 0 ? productionYear : 2000;
        this.productionCounty = ValidationUtils.validOrDefault(productionCounty, "default");
        setColor(color);
        this.maxSpeed = Math.max(maxSpeed, 0);
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

    public String getProductionCounty() {
        return productionCounty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "white");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
    public void print() {
        System.out.println("Марка: " + getBrand() +
                " Модель: " + getModel() +
                " Год производства: " + getProductionYear() +
                " Страна производства: " + getProductionCounty() +
                " Цвет: " + getColor() +
                " Максимальная скорость: " + getMaxSpeed());
    }
}
