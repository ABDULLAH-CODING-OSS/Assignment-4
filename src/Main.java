import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE FIRST VALUE");
int x = input.nextInt();
        System.out.println("ENTER THE SECOND VALUE");
int y= input.nextInt();
int res = GCD(x,y);
        System.out.println("THE GCD OF THESE NUMBERS ARE "+(res));




    }
    public static int GCD(int x , int y){
     if (y==0){
         return x;
     }
      return GCD(y,x%y);

    }
}