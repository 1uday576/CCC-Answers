import java.util.Scanner;

public class CCC02J2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        while(true) {
            word = sc.next();

            if(word.equals("quit!")) {
                return;
            }else if(word.length() <= 5 || !word.endsWith("or")) {
                System.out.println(word);
            }else{
                word = word.replaceAll("or", "our");
                System.out.println(word);
            }
        }
    }
}
