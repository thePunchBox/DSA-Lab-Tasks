import java.util.Scanner;

public class CodeChallenge_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter working no of hours: ");
        int hours=sc.nextInt();
        
        System.out.print("Enter amount: ");
        int amnt=sc.nextInt();
        
        System.out.print("Enter vacation day: ");
        int vacaDays=sc.nextInt();
        
        int totalhours=hours+vacaDays*8;
        
        int grossSalary=amnt*hours;
        
        int vacation=(totalhours-(vacaDays*8))*amnt;
        
        System.out.println("Gross Salary is: "+grossSalary);
        
        System.out.println("Salary after vacations is: "vacation);
    }
}