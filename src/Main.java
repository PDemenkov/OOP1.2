import javax.security.auth.kerberos.KerberosTicket;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada",
                "Granta",
                1.7f,
                "yellow",
                2015,
                "Russia",
                "Mex",
                "sedan",
                "s456vf344",
                4,true,
                new Car.Key(true,true),
                new Car.Insurance(null,10000,"123456789"));
//        Car.Key ladaKey = new Car.Key(true,true);
//        lada.setKey(ladaKey);
        System.out.println(lada.isRegNumberValid());

//        Car.Insurance ladaInsurance = new Car.Insurance( 2023.22.03,13000,123456789); //Как ввести если через сеттер?
//        Car audi = new Car("Audi","A8 50 L TDI",3.0f,"black",2020,"Germany");
//        Car bmw = new Car("Bmw","Z8",2.4f,"black",2021,"Germany");
//        Car kia = new Car("Kia","Sportage",-1f,"",2018,"South Korea");
//        Car hyundai  = new Car("Hyundai ","Avante",1.6f,"",2016,"South Korea");

        System.out.println(lada);
    }
}