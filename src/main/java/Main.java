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
                Capitalize capitalize = new Capitalize(outputList);
                System.out.println(capitalize.getCapitalizeList());
            }
            if (args[i].equals("--reverse")) {
                Reverse reverse = new Reverse(outputList);
                System.out.println(reverse.getReverseList());
            }
            if (args[i].equals("--compress")) {
                Compress compress = new Compress(outputList);
                System.out.println(compress.getCompressList());
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
