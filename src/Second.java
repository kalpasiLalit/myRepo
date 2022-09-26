import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // array to store input text
        String[] text = new String[100];
        Scanner input = new Scanner(System.in);
        //taking input
            for(int i =0 ; i < text.length ; i++){
                String inp= input.next();
                text[i] = inp;
                if(inp.toUpperCase().equals("XDONE"))
                    break;

            }
          //printing output
        for(int i =0 ; i < text.length ; i++){
            if(text[i].equals("xdone"))
                break;
            System.out.println(text[i]);

        }


    }
}
