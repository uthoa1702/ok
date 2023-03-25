package model.furama_facility;

public class Villa extends FuramaFacility {
    protected String roomStandard;
    protected double poolArea;
    protected int numOfLevel;

    public Villa(String roomStandard, double poolArea, int numOfLevel) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfLevel = numOfLevel;
    }

    public Villa(String serviceName, double useableArea, int price, int maxNumOfPeo, String typeOfRent, String roomStandard, double poolArea, int numOfLevel) {
        super(serviceName, useableArea, price, maxNumOfPeo, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfLevel = numOfLevel;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfLevel() {
        return numOfLevel;
    }

    public void setNumOfLevel(int numOfLevel) {
        this.numOfLevel = numOfLevel;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numOfLevel=" + numOfLevel +
                ", serviceName='" + serviceName + '\'' +
                ", useableArea=" + useableArea +
                ", price=" + price +
                ", maxNumOfPeo=" + maxNumOfPeo +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
