import Transport.Car;
import Transport.Car.Key;
import Transport.Car.Insurance;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grand", 1.7, "yellow",2015,"Russia");
        Car.Key trueEngineKey = new Car.Key();
        lada.setKey(trueEngineKey);
        lada.setRegNumber("вd52оа348");
        System.out.println("lada.isCorrectRegNumber() = " + lada.isCorrectRegNumber());
        lada.setSummerTyres(false);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bwm = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kia = new Car("Kia", "Sportage 4th",2.4,"red",2018,"South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        printInfo(lada);
        System.out.println(lada);
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
                        ", рег.номер: " + car.getRegNumber() + " проверка: " + car.isCorrectRegNumber() +
                        ", количество мест " + car.getSeatsCount() +
                        ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + "Резина" +
                        ", " + (car.getKey().isStartWithoutKey() ? "безключевой доступ" : "ключевой доступ") +
                        ", " + (car.getKey().isRemoteStartEngine() ? "удаленный запуск" : "обычный запуск") +
                        ", номер страховки " +
                        ", стоимость страховки"

        );
    }
}