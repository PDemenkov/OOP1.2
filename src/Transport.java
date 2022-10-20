public class Transport {

    private final String brand;
    private final String model;

    private final int productionYear;
    private final String productionCounty;

    private String color;
    private int maxSpeed;

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
        this.maxSpeed = maxSpeed;
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

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
