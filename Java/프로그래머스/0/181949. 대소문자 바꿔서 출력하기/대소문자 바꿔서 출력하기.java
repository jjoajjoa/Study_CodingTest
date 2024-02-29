import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        if (a.length() > 20) {
            System.out.println("제한길이: 20자");
        } else {
            for (int i = 0; i < a.length(); i++) {
                char temp = a.charAt(i);
                if(Character.isLowerCase(temp)) {
                    answer += Character.toUpperCase(temp);
                } else {
                    answer += Character.toLowerCase(temp);
                }
            }
            System.out.println(answer);
        }
        
        sc.close();
    }
}