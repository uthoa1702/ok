package model.furama_facility;

public class House extends FuramaFacility {
    protected String roomStandard;
    protected int numOfLevel;

    public House(String roomStandard, int numOfLevel) {
        this.roomStandard = roomStandard;
        this.numOfLevel = numOfLevel;
    }

    public House(String id,String serviceName, int useableArea, int price, int maxNumOfPeo, String typeOfRent, String roomStandard, int numOfLevel) {
        super(id,serviceName,  useableArea, price, maxNumOfPeo, typeOfRent);
        this.roomStandard = roomStandard;
        this.numOfLevel = numOfLevel;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumOfLevel() {
        return numOfLevel;
    }

    public void setNumOfLevel(int numOfLevel) {
        this.numOfLevel = numOfLevel;
    }


    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfLevel=" + numOfLevel +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useableArea=" + useableArea +
                ", price=" + price +
                ", maxNumOfPeo=" + maxNumOfPeo +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }

    public String getAll() {
        return id +","+serviceName +","+ useableArea +","+ price +","+ maxNumOfPeo +","+ typeOfRent +","+ roomStandard +","+ numOfLevel;
    }
}
