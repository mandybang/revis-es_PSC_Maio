import java.util.Scanner;

/**
 * Revisao4
 */
public class Revisao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /*int x = 5;
        System.out.println(x++);*/

        /*int x = 5;
        int y = 5;
        x = y--;
        y = ++x;
        System.out.println(x + y);*/
        
        /*String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2);*/

        for (int i = 0; i < 5; i++) {
            if (i==3) {
                break;
            }
            System.out.println(i + " ");
        }

        scanner.close();


    }
}