import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inputString = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < inputString.length(); i++) {
            queue.add(inputString.charAt(i));
        }

        boolean isPalindrome = true;
        while (queue.size() > 1) {
            char first = queue.remove();
            char last = ((LinkedList<Character>) queue).removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("THAT IS A PALINDROME!");
        } else {
            System.out.println("THAT IS NOT A PALINDROME!");
        }
    }
}
