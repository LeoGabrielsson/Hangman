import javax.swing.*;

public class Hangman {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Write hidden word");
        String hidden = "";
        int lives = 11;
        String wrong = "";
        //String;
        for (int x = 0; x < word.length(); x++) {
            char c = word.charAt(x);
            if (c == ' '){
                hidden += c;
            }
            else {
                c *= 0;
                c += 95;
                hidden += c;
            }
        }
        System.out.println(hidden);
        char[] guess;
        String guesss = JOptionPane.showInputDialog("Guess");
        for (int x = 0; x < guesss.length(); x++) {
            char c = guesss.charAt(x);
            guess += c;
        }
        for (int x = 0; x < word.length(); x++) {
            char cw = word.charAt(x);
            char chidden = hidden.charAt(x);
            char cg = guess[x];
            if (cg == word.charAt(x)) {
                guess[x] = word.charAt(x);
            }
            else {
                lives -= 1;
                wrong += cg + " ";
                System.out.println("Try again");
            }
        }
    }
}
