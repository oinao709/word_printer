import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CapitalizeTest extends Specification {
    def getCapitalizeList() {
        setup:
        String str = "this book is so funny";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")))
        Capitalize capitalize = new Capitalize(list);

        expect:
        capitalize.getCapitalizeList() == ["This", "Book", "Is", "So", "Funny"]


    }
}
