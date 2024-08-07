import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER  ");
         int number = input.nextInt();
        System.out.println("ENTER THE NUMBER TO BE SEARCHED");
         int searchNumber=input.nextInt();
        int result = Count(number,searchNumber);
        System.out.println("The number "+(searchNumber)+" appears "+(result)+" Times");

     }
     public static int Count(int number ,int digit){
        if (number==0){
           return  (digit==0)?1:0;
        }
        int lastDigit = number%10;
        int count = (lastDigit==digit)?1:0;
        return count + Count(number/10,digit);




     }

}