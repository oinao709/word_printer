import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CompressTest extends Specification {
    def getCompressList() {
        setup:
        String str = "this book is so funny";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")))
        Compress compress = new Compress(list);

        expect:
        compress.getCompressList() == ["this", "bok", "is", "so", "funy"]
    }
}
