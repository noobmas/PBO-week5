package week5;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        boolean playing = true;
        TextGame game = new TextGame();
        Scanner scanner = new Scanner(System.in);
        String kata;

        while (playing) { 
            System.out.print("Masukkan Kata: ");
            kata = scanner.nextLine();
            game.displayResult(kata);
            System.out.println();

            System.out.print("Main lagi? [y/n]: ");
            String jawaban = scanner.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                playing = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }
    }
}

class TextGame {
    public void displayResult(String word) {
        if (isPalindrome(word)) {
            System.out.println("Hasil: Palindrome");
        } else {
            System.out.println("Hasil: Bukan Palindrome");
        }
    }
    protected boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversed);
    }
}

// Kelas turunan dengan tampilan lebih menarik
class FancyTextGame extends TextGame {
    public void displayResult(String word) {
        if (isPalindrome(word)) {
            System.out.println(" Hasil: \"" + word + "\" adalah Palindrome ");
        } else {
            System.out.println(" Hasil: \"" + word + "\" bukan Palindrome ");
        }
    }
}