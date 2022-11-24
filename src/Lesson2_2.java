import java.util.Scanner;

public class Lesson2_2 {

    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the user name:");
        String a=scanner.nextLine();
        for (int i=0;i<10;i++){
            System.out.println("Hello "+a);
        }

    }
}