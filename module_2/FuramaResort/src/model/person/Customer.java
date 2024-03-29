package model.person;

public class Customer extends Person{
    protected String typeOfCustomer;
    protected String address;

    public Customer(int idFurama, String name, String birthday, String gender, int id, int phoneNum, String email, String typeOfCustomer, String address) {
        super(idFurama, name, birthday, gender, id, phoneNum, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "TypeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", idFurama=" + idFurama +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                '}';
    }
    public String getAll() {
        return idFurama+","+name+","+birthday+","+gender+","+id+","+phoneNum+","+email+","+typeOfCustomer+","+address;
    }
}
