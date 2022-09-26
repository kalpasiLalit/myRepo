public class First {
    static String firstName ;
    static  String lastName ;
    static  int age ;
    //static block to initialize class fields
    static  {
        firstName ="lalit";
        lastName = "kalpasi" ;
         age = 24;
    }
    //static method to print data
    static void printData(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("age: "+ age);
    }

    public static void main(String[] args) {
        //calling printData method..
        printData();
    }
}
