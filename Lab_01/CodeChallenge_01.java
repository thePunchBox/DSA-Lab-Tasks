import java.util.Scanner;

/**
 * CodeChallenge_01
 */
public class CodeChallenge_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question= "Question: What is 2x4?";
        String choice1 = "16";
        String choice2 = "4";
        String choice3 = "8";

        System.out.println(" ");

        System.out.println(question);

        System.out.println("Options: "+"\n"+"A)"+choice1+"\n"+"B)"+choice2+"\n"+"C)"+choice3);

        String answer = sc.nextLine();
        if(answer.equals(choice3)){ //==
            System.out.println("Yeah you got the Correct Answer!");
        }
        else{
            System.out.println("OOPS Wrong Answer!");
        }
    }
}