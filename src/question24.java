import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = count_no_digits(n);
        boolean isarmsrong = armstrong(n, count);
        System.out.println(isarmsrong);
    }
    public static int count_no_digits(int a){
        int c=0;
        while(a!=0){
            c++;
            a=a/10;
        }
        return c;
    }
    public static boolean armstrong(int b , int count){
        int num = b;
        double sum = 0;
        while(b>0){
            int digit = b%10;
            sum += Math.pow(digit, count);
            b/=10;

        }
        return sum == num;

    }
}
