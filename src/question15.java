import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0 ;
        int even = 0 ;
        int postion = -1;
        while(n>0){
            int digit = n%10;
            if(postion % 2 ==0){
                even += digit;
            }
            else{
                odd += digit;
            }
            n/=10;
            postion++;
        }

        System.out.println(odd);
        System.out.println(even);
    }
}
