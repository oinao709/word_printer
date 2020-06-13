import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MainTest extends Specification {
    def "test_args0"() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        Main.main("this book is so funny")

        then:
        1 * printStream.println(["this", "book", "is", "so", "funny"])
    }

    def "test_all"() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        Main.main("this book is so funny", "--capitalize", "--reverse", "--compress", "--horizontal", "--vertical")

        then:
        1 * printStream.println("Funy So Is Bok This")
        1 * printStream.println("Funy")
        1 * printStream.println("So")
        1 * printStream.println("Is")
        1 * printStream.println("Bok")
        1 * printStream.println("This")
    }
}
