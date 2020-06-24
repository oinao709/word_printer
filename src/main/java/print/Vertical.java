package print;

import java.util.List;

public class Vertical implements Printer {
    private final List<String> list;

    public Vertical(List<String> list) {
        this.list = list;
    }

    public void outPrinter() {
        list.forEach(System.out::println);
    }
}
