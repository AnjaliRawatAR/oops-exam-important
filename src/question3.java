import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        /*24*/
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        System.out.println("Method 1:");
        System.out.println(string1.equals(string2));
        System.out.println("Method 2:");
        System.out.println(string_is_equal(string1, string2));
    }

    public static boolean string_is_equal(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }
        else{
            for(int i=0; i<string1.length(); i++){
                if(string1.charAt(i) != string2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
