import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String hello = "Hello! Are you a robot?";
     System.out.println(hello);
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

            int resultOfAdding = 1;
            int usersAnswer = 0;


        while (usersAnswer != resultOfAdding){
            int number1 = random.nextInt(0, 100) + 1;
            int number2 = random.nextInt(0, 100) + 1;
             resultOfAdding = Math.addExact(number1,number2);

            System.out.println("Add two numbers :" + number1 + " and " + number2);
            System.out.println("Enter your answer :");
            usersAnswer = scanner.nextInt();
            System.out.println("Your answer is :" + usersAnswer +"  Correct answer is  :" + resultOfAdding);

        }

        System.out.println("Yeah!!! Questionnaire is finished!!! You win!!!");

    }
//
}
