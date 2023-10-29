import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        String rest_str= str.substring(1);
        if(Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
        }
        System.out.println(ch+rest_str);
    }
}
