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
        1 * printStream.println(['This', 'Book', 'Is', 'So', 'Funny'])
        1 * printStream.println(['funny', 'so', 'is', 'book', 'this'])
        1 * printStream.println(['this', 'bok', 'is', 'so', 'funy'])
        1 * printStream.println("This Book Is So Funny")

        1 * printStream.println("This")
        1 * printStream.println("Book")
        1 * printStream.println("Is")
        1 * printStream.println("So")
        1 * printStream.println("Funny")
    }
}
