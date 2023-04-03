package model.person;

public class Employee extends Person {
    protected String ability;
    protected String position;
    protected int salary;

    public Employee(int idFurama, String name, String birthday, String gender, int id, int phoneNum, String email) {
        super(idFurama, name, birthday, gender, id, phoneNum, email);
    }

    public Employee(int idFurama, String name, String birthday, String gender, int id, int phoneNum, String email, String ability, String position, int salary) {
        super(idFurama, name, birthday, gender, id, phoneNum, email);
        this.ability = ability;
        this.position = position;
        this.salary = salary;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ability='" + ability + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", idFurama=" + idFurama +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                '}' + '\n';
    }
    public String getAll() {
        return idFurama+","+name+","+birthday+","+gender+","+id+","+email+","+phoneNum+","+ability+","+position+","+salary;
    }
}
