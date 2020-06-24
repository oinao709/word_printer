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
        thrown(RuntimeException)
    }

    def "test_horizontal"() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        Main.main("this book is so funny", "--capitalize", "--reverse", "--compress", "--horizontal")

        then:
        1 * printStream.println("Funy So Is Bok This")
    }

    def "test_vertical"() {
        setup:
        PrintStream printStream = Mock()
        System.out = printStream

        when:
        Main.main("this book is so funny", "--capitalize", "--reverse", "--compress", "--vertical")

        then:
        1 * printStream.println("Funy")
        1 * printStream.println("So")
        1 * printStream.println("Is")
        1 * printStream.println("Bok")
        1 * printStream.println("This")
    }
}
