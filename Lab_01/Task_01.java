import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.print("Enter age: ");
        age=sc.nextInt();
        if(age<13){
            System.out.print("The ticket will be 5 dollars!");
        }
        else if(age>=13){
            System.out.println("The tikcet will be 10 dollars!");
        }
        else if(age>=65){
            System.out.println("The tikcet will be 7 dollars!");
        }
    }
}