import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;// menu input


        do{
            System.out.println(" **********Menu********");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2.Calculate Circumference of a Circle");
            System.out.println("3.Exit.");
            System.out.println("select any option: ");
            option = in.nextInt();

            if(option != 3) {
                System.out.println("radius: ");
                int radius = in.nextInt();

                Third obj = new Third();
                double ans = obj.calculation(option, radius);
                System.out.print(ans);
                System.out.println();
            }



        }while (option != 3);
        System.out.println("exit");




    }

    public  double calculation(int option, int radius){
         switch (option){
             case 1:
                 System.out.print("Area of circle: ");
                 return area(radius);

             case 2:
                 System.out.print("circumference of circle: ");
                 return  circumference(radius);

             default:
                 System.out.println("you have not selected the right option");
                 return  0;

         }



    }
    public double area(int radius){
        return  3.14159*radius*radius;
    }
    public double circumference(int radius){
        return 2*3.14159*radius;
    }
}
