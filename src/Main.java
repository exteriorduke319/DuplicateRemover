import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordInput;
        String wordOutput = "";

        System.out.println("Enter a word: ");
        wordInput = scan.nextLine();

        for (int i = 0; i < wordInput.length(); i++){
            if(!wordOutput.contains(wordInput.substring(i, i+1))) {
                wordOutput += wordInput.substring(i,i+1);
            }
        }

        System.out.println(wordOutput);
    }
}