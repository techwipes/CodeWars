import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        Stream<String> str1 = Stream.of(s1.split(""));
        Stream<String> str2 = Stream.of(s2.split(""));
        return Stream.concat(str1, str2).sorted().distinct().collect(Collectors.joining());

    }

}


class TestTwoToOne {
    public static void main(String[] args) {
        TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding");
    }
}