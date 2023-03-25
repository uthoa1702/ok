package model.furama_facility;

public abstract class FuramaFacility {
    protected String serviceName;
    protected double useableArea;
    protected int price;
    protected int maxNumOfPeo;
    protected String typeOfRent;

    public FuramaFacility() {
    }

    public FuramaFacility(String serviceName, double useableArea, int price, int maxNumOfPeo, String typeOfRent) {
        this.serviceName = serviceName;
        this.useableArea = useableArea;
        this.price = price;
        this.maxNumOfPeo = maxNumOfPeo;
        this.typeOfRent = typeOfRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUseableArea() {
        return useableArea;
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
        return "Furama{" +
                "serviceName='" + serviceName + '\'' +
                ", useableArea=" + useableArea +
                ", price=" + price +
                ", maxNumOfPeo=" + maxNumOfPeo +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
