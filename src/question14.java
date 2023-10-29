import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int count = 0;
        boolean ans = false;
        for(int i=0; i<n-1; i++){
            char ch1= str.charAt(i);
            char ch2= str.charAt(i+1);
            if(ch1 == ch2){
                count++;
                if(count == 6){
                    ans = true;
                    break;
                }
            }
            else{
                count = 0;
            }
        }
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
