import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
 *
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 */

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        binary.stream().forEach(e -> sb.append(e));

        return Integer.parseInt(sb.toString(),2);

    }
}



class TestBinaryArrayToNumber{
    public static void main(String[] args) {
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,0,1))));
    }
}