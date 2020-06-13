import convert.Reverse
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ReverseTest extends Specification {
    def getReverseList() {
        setup:
        String str = "this book is so funny";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")))
        Reverse reverse = new Reverse(list);

        expect:
        reverse.getReverseList() == ["funny", "so", "is", "book", "this"]
    }
}
