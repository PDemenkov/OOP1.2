public class  Train extends Transport{
   private int tripCost;
   private String tripTime;
   private String startStation;
   private String endStation;
   private int wagons;

    public Train(String brand,String model,int prodactionYear,String productionCountry, int tripCost, String tripTime, String startStation, String endStation, int wagons,int maxSpeed) {
        super(brand,model,prodactionYear,productionCountry,"",maxSpeed);
        this.tripCost = tripCost;
        this.tripTime = tripTime;
        this.startStation = startStation;
        this.endStation = endStation;
        this.wagons = wagons;
    }

    public int getTripCost() {
        return tripCost;
    }

    public void setTripCost(int tripCost) {
        this.tripCost = tripCost;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }
}
