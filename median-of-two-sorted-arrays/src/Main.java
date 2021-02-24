public class Main {

    public static void main(String[] args) {
        inspect(new int[]{1, 3}, new int[]{2}, 2);
        inspect(new int[]{1, 2}, new int[]{3, 4}, 2.5);
        inspect(new int[]{0, 0}, new int[]{0, 0}, 0);
        inspect(new int[]{}, new int[]{1}, 1);
        inspect(new int[]{2}, new int[]{}, 2);
        inspect(new int[]{}, new int[]{2, 3}, 2.5);
    }

    public static void inspect(int[] input1, int[] input2, double expect) {
        double output = new Solution().findMedianSortedArrays(input1, input2);
        if (output == expect) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}
