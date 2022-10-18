import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grand", 1.7, "yellow",2015,"Russia");
        lada.setRegNumber("в352оа348");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bwm = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kia = new Car("Kia", "Sportage 4th",2.4,"red",2018,"South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        hyundai.printOut();

        printInfo(lada);
    }

    private static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + "" + car.getModel() +
                        ", год выпуска: " + car.getProductionYear() +
                        ", страна сборки: " + car.getProductionCountry() +
                        ", цвет кузова:" + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getGears() +
                        ", тип кузова:" + car.getTypeOfBody() +
                        ", рег.номер: " + car.getRegNumber() +
                        ", количество мест " + car.getSeatsCount() +
                        ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + "Резина"
        );
    }
}