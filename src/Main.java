public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grand", 1.7, "yellow",2015,"Russia");
        lada.printOut();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        audi.printOut();
        Car bwm = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        bwm.printOut();
        Car kia = new Car("Kia", "Sportage 4th",2.4,"red",2018,"South Korea");
        kia.printOut();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        hyundai.printOut();
    }
}