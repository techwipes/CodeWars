import java.util.HashMap;
import java.util.Map;

/**
 * Write a function that takes an array of numbers (integers for the tests) and a target number.
 * It should find two different items in the array that, when added together, give the target value.
 * The indices of these items should then be returned in a tuple like so: (index1, index2).
 * <p>
 * For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
 * <p>
 * The input will always be valid (numbers will be an array of length 2 or greater,
 * and all of the items will be numbers; target will always be the sum of two different items from that array).
 */


public class TwoSum {


//    public static int[] twoSum(int[] numbers, int target) {
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (target == (i + j)) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }


    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(numbers[i], i);
            }
        }
        return new int[]{};

    }

}


