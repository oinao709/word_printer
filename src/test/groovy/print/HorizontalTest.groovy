import print.Horizontal
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class HorizontalTest extends Specification {
    String str = "this book is so funny"
    List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")))
    Horizontal horizontal = new Horizontal(list);

    def outHorizontal() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        horizontal.outPrinter()

        then:
        1 * printStream.println("this book is so funny")
    }
}
