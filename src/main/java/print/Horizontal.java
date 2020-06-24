package print;

import java.util.List;

public class Horizontal implements Printer {
    private final List<String> list;

    public Horizontal(List<String> list) {
        this.list = list;
    }

    public void outPrinter() {
        System.out.println(String.join(" ", list));
    }
}
