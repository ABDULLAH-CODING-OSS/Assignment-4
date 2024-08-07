import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE BASE ");
        int base = input.nextInt();
        System.out.println("ENTER THE EXPONENT ");
        int exponent=input.nextInt();
        int res = Power(base, exponent);
        System.out.println("THE ANSWER IS "+(res));



    }
    public static int Power(int b , int e){
        if (e==1){
            return b;
        }
        return b * Power(b,e-1);


    }
}