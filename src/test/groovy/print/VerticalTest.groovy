import print.Vertical
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class VerticalTest extends Specification {
    String str = "this book is so funny"
    List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")))
    Vertical vertical = new Vertical(list);

    def outVertical() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        vertical.outVertical()

        then:
        1 * printStream.println("this")
        1 * printStream.println("book")
        1 * printStream.println("is")
        1 * printStream.println("so")
        1 * printStream.println("funny")
    }
}
