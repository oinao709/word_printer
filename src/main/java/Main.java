import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        args = new String[]{"this book is so funny", "--capitalize", "--reverse", "--compress", "--horizontal", "--vertical"};
        List<String> outputList = new ArrayList(Arrays.asList(args[0].split(" ")));
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--capitalize")) {
                Capitalize capitalize = new Capitalize(outputList);
                outputList = capitalize.getCapitalizeList();
            }
            if (args[i].equals("--reverse")) {
                Reverse reverse = new Reverse(outputList);
                outputList = reverse.getReverseList();
            }
            if (args[i].equals("--compress")) {
                Compress compress = new Compress(outputList);
                outputList = compress.getCompressList();
            }
            if (args[i].equals("--horizontal")) {
                Horizontal horizontal = new Horizontal(outputList);
                horizontal.outHorizontal();
            }
            if (args[i].equals("--vertical")) {
                Vertical vertical = new Vertical(outputList);
                vertical.outVertical();
            }
        }
        System.out.println(outputList);
    }
}
