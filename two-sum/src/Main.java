public class Main {

    public static void main(String[] args) {
        int[] twoSum = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        if (twoSum.length > 0) System.out.println(twoSum[0]);
        if (twoSum.length > 1) System.out.println(twoSum[1]);
    }
}
