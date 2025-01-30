
    import java.util.Scanner;
public class Evenodd {
    public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int number = scanner.nextInt();
            if (number%2==0){
                System.out.println("It is even number");
             }else {
                System.out.println("It is odd number");
             }
     scanner.close();
    }
}

    

    

