import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        args = new String[]{"this book is so funny", "--capitalize", "--reverse", "--compress", "--horizontal", "--vertical"};
        String str = args[0];
        List<String> outputList = new ArrayList(Arrays.asList(args[0].split(" ")));
        String[] wordList = str.split(" ", -1);
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--capitalize")) {
                Capitalize capitalize = new Capitalize(new ArrayList(Arrays.asList(args[0].split(" "))));
                System.out.println(capitalize.getCapitalizeList());
            }
            if (args[i].equals("--reverse")) {
                Reverse reverse = new Reverse(new ArrayList(Arrays.asList(args[0].split(" "))));
                System.out.println(reverse.getReverseList());
            }
            if (args[i].equals("--compress")) {
                List<String> compressList = new ArrayList<>();
                for (int m = 0; m < wordList.length; m++) {
                    String word = wordList[m];
                    List<String> strList = new ArrayList<>(Arrays.asList(word.split("")));
                    String outputWord = "";
                    for (int l = strList.size() - 1; l > 0; l--) {
                        if (!strList.get(l).equals(strList.get(l - 1))) {
                            outputWord = strList.get(l) + outputWord;
                        }
                    }
                    outputWord = strList.get(0) + outputWord;
                    compressList.add(outputWord);
                }
                System.out.println(compressList);
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
