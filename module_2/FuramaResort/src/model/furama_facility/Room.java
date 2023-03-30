package model.furama_facility;

public class Room extends FuramaFacility {
    protected String freeServiceIncluded;

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String id,String serviceName, double usableArea, int price, int maxNumOfPeo, String typeOfRent, String freeServiceIncluded) {
        super(id,serviceName, usableArea, price, maxNumOfPeo, typeOfRent);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useableArea=" + useableArea +
                ", price=" + price +
                ", maxNumOfPeo=" + maxNumOfPeo +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
    public String getAll() {
        return id+","+serviceName +","+ useableArea +","+ price +","+ maxNumOfPeo +","+ typeOfRent +","+ freeServiceIncluded;
    }
}
