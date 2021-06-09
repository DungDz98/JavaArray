
import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        String input = "Viet Nam vo dich World Cup";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char key = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == key) {
                count++;
            }
        }
        System.out.println("Character '" + key + "' appears " + count + " times in the sentence");
    }
}
