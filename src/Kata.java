import java.util.Arrays;

/**
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 */


public class Kata {
    public static String highAndLow(String numbers) {
        String[] input = numbers.split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);

        return nums[nums.length - 1] + " " + nums[0];
    }
}

class KataTest {
    public static void main(String[] args) {
        Kata.highAndLow(("1 22 3 4 5 -6"));
    }
}

/*

with Streams

public class Kata {
    public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
    }
}


 */