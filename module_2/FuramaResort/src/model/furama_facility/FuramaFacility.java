package model.furama_facility;

public abstract class FuramaFacility {
    protected String id;
    protected String serviceName;
    protected double useableArea;
    protected int price;
    protected int maxNumOfPeo;
    protected String typeOfRent;

    public FuramaFacility() {
    }


    public FuramaFacility(String id, String serviceName, double useableArea, int price, int maxNumOfPeo, String typeOfRent) {
        this.serviceName = serviceName;
        this.useableArea = useableArea;
        this.price = price;
        this.maxNumOfPeo = maxNumOfPeo;
        this.typeOfRent = typeOfRent;
        this.id = id;
    }

    public FuramaFacility(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUseableArea() {
        return (int) useableArea;
    }

    public void setUseableArea(double useableArea) {
        this.useableArea = useableArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxNumOfPeo() {
        return maxNumOfPeo;
    }

    public void setMaxNumOfPeo(int maxNumOfPeo) {
        this.maxNumOfPeo = maxNumOfPeo;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "FuramaFacility{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useableArea=" + useableArea +
                ", price=" + price +
                ", maxNumOfPeo=" + maxNumOfPeo +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
