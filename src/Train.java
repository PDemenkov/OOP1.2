public class  Train extends Transport{
   private int tripCost;
   private String tripTime;
   private String startStation;
   private String endStation;
   private int wagons;

    public Train(String brand,String model,int prodactionYear,String productionCountry, int tripCost, String tripTime, String startStation, String endStation, int wagons,int maxSpeed) {
        super(brand,model,prodactionYear,productionCountry,"",maxSpeed);
        setTripCost(tripCost);
        setTripTime(tripTime);
        setStartStation(startStation);
        setEndStation(endStation);
        setWagons(wagons);
    }

    public int getTripCost() {
        return tripCost;
    }


    public void setTripCost(int tripCost) {
        this.tripCost = Math.max(tripCost,1500) ;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = ValidationUtils.validOrDefault(tripTime,"Без изменений");
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = ValidationUtils.validOrDefault(startStation,"default");
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = ValidationUtils.validOrDefault(endStation,"default");
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = Math.max(wagons,8);
    }
    public void print() {
        super.print();
        System.out.println("Стоимость поездки: " + getTripCost()+
                " Время поездки: " + getTripTime()+
                " Станция отправления: " + getStartStation() +
                " Станция прибытия: " + getEndStation() +
                " Количество вагонов: " + getWagons()
        );
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }

}
