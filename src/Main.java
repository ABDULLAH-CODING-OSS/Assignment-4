import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF Men ");
        int hs=input.nextInt();
        int res = handSShake(hs);
        System.out.println("TOTAL HANDSHAKES BY "+(hs)+" Mens are "+(res));


     }
     public static int handSShake(int n){
        if (n<=1){
            return 0;
        }
        return handSShake(n-1)+(n-1);
     }

}