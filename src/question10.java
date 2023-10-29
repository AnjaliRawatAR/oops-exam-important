import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int count = 0;
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

