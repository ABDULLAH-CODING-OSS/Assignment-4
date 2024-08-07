import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE STRING TO REVERSE ");
        String s = input.nextLine();
        int lenght=s.length();
        System.out.println("THE REVERSED STRING IS :  "+(Reverse(s,lenght)));

    }
    public static String Reverse(String s , int lenght){
        if (lenght==0){
            return "";
        }
        return s.charAt(lenght-1)+Reverse(s,lenght-1);


    }
}