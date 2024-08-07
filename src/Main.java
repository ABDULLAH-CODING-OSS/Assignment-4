import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int MOD =1000000007;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF P ");
        int p = input.nextInt();
        long result=calculateProduct(p);
        System.out.println("THE PRODUCT IS "+(result));

    }
    public static long calculateProduct(int p){
        int limit = (1<<p)-1;
        long product =1;
        for (int i =1;i<=limit ; i++){
            product=(product*i)%MOD;
        }
        return product;

    }
}