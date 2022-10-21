public class Bus extends Transport{
    public Bus(String brand, String model, int productionYear, String productionCounty, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCounty, color, maxSpeed);
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void refill() {
        System.out.println("Объекты класса bus можно заправлять бензином или дизелем на заправке");
    }
}
