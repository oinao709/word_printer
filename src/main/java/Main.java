import convert.Capitalize;
import convert.Compress;
import convert.Reverse;
import print.Horizontal;
import print.Printer;
import print.Vertical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        args = new String[]{"this book is so funny", "--capitalize", "--reverse", "--compress", "--vertical"};
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
        }

        Printer printer = null;
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--horizontal")) {
                printer = new Horizontal(outputList);
                break;
            }
            if (args[i].equals("--vertical")) {
                printer = new Vertical(outputList);
                break;
            }
        }
        printer.outPrinter();
        if (printer == null) {
            throw new RuntimeException("出力方式を設定してください");
        }
    }
}
