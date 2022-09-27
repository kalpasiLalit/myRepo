public class Employee {

    private String firstname;
    private String lastname;
    private int age ;
    private String designation;


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(String firstname, String lastname, int age, String designation)
    {
        super();

        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return this.firstname + " " + this.lastname+ " "+ this.age+ " "+ this.designation;
    }
    public static void main(String aA[])
    {

        Employee x=new Employee("Lalit","kalpasi",23,"SE");
        System.out.println(x);
    }
}