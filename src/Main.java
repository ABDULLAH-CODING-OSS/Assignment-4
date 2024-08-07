import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHOSE FACTORIAL IS NEEDED");
        int number = input.nextInt();
        int res = Factorial(number);
        System.out.println("FACTORIAL IS : "+(res));



    }
    public static int Factorial(int number){
        if (number==0 || number==1){
            return 1;
        }
        else {
            return number*Factorial(number-1);
        }

    }
}