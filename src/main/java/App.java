import models.Sentence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your sentence");
            String sentence = bufferedReader.readLine();
            System.out.println("Enter the word that you want to replace");
            String find = bufferedReader.readLine();
            System.out.println("Enter the new word");
            String replace = bufferedReader.readLine();
            Sentence mySentence = new Sentence(sentence);
            System.out.println(mySentence.findAndReplace(find,replace));



        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
