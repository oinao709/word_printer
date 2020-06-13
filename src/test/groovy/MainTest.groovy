import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MainTest extends Specification {
    def "test1"() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        Main.main(null)

        then:
        1 * printStream.println("[this book is so funny, --capitalize, --vertical]")
    }
}
