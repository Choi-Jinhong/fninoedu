package Day_0602;

public class Manager_05 extends Employee_05 {

    String depart;

    public Manager_05(String name, int salary, String dept) {
        super(name, salary);
        depart = dept;
    }

    @Override
    public String getEmployee(){
        return super.getEmployee();
    }
}
