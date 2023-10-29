import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = new String();
        char []arr = str1.toCharArray();
        for(int i=0; i<str1.length(); i++){
            char ch = arr[i];
            if(Character.isLowerCase(ch)){
                char newch = Character.toUpperCase(ch);
                str2 = str2+newch;
            }
            else{
                char newchh = Character.toLowerCase(ch);
                str2 = str2+newchh;
            }
        }
        System.out.println(str2);
    }
}
