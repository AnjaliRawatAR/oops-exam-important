import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num_to_string = Integer.toString(n);
        String replace_0_to_5 = num_to_string.replace('0','5');
        int result = Integer.parseInt(replace_0_to_5);
        System.out.println(result);
    }
}
