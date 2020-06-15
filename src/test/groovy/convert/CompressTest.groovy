import convert.Compress
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CompressTest extends Specification {
    def getCompressList() {
        setup:
        String str = input
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")))
        Compress compress = new Compress(list);

        expect:
        compress.getCompressList() == exp

        where:
        input                   || exp
        "this book is so funny" || ["this", "bok", "is", "so", "funy"]
        "testttetmm"            || ["testetm"]
    }
}
