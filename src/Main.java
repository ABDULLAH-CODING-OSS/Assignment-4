import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE WORD OR NUMBER TO BE CHECKED");
    String palindrome = input.nextLine();
    String cleanPalindrome = cleanString(palindrome);
    if (Palindrome(cleanPalindrome,0,cleanPalindrome.length()-1)){
        System.out.println("YOUR NUMBER/WORD IS PALINDROME ");
    }
    else {
        System.out.println("NOT A PALINDROME");
    }



    }
    public static String cleanString(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        return cleaned.toString();
    }

     public static Boolean Palindrome(String palindrome, int i,int j){
        if (  palindrome.charAt(i)!=palindrome.charAt(j)){
            return false;
         }
         if(i>=j){
             return true;
         }
         return Palindrome(palindrome, i+1,j-1);



     }

}