import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = removeduplicates(str);
        System.out.println(result);
    }

    public static String removeduplicates(String str){
        StringBuilder result = new StringBuilder();
        char prevchar = '\0';
        for(char currentchar : str.toCharArray()){
            if(currentchar != prevchar){
                result.append(currentchar);
                prevchar = currentchar;
            }
        }
        return result.toString();
    }
}
