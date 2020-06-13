import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        args = new String[]{"this book is so funny","--capitalize","--horizontal", "--vertical"};
        String str = args[0];
        List<String> outputList = new ArrayList<>();
        String[] wordList = str.split(" ", -1);
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--capitalize")) {
                for (int j = 0; j < wordList.length; j++) {
                    String word = wordList[j];
                    String outputWord = word.substring(0,1).toUpperCase() + word.substring(1);
                    outputList.add(outputWord);
                }
            }
            if (args[i].equals("--horizontal")) {
                String word = String.join(" ", outputList);
                System.out.println(word);
            }
            if (args[i].equals("--vertical")) {
                outputList.forEach(System.out::println);
            }
        }



    }
}
