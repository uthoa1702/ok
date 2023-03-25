package model.person;

public abstract class Person {
    protected int idFurama;
    protected String name;
    protected String birthday;
    protected String gender;
    protected int id;
    protected int phoneNum;
    protected String email;

    public Person(int idFurama, String name, String birthday, String gender, int id, int phoneNum, String email) {
        this.idFurama = idFurama;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.id = id;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public int getIdFurama() {
        return idFurama;
    }

    public void setIdFurama(int idFurama) {
        this.idFurama = idFurama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
