import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = new int[] { 9, 9, 9, 9 };

        System.out.print(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] arr) {

        int len = arr.length;

        for (int i = len-1; i >= 0; i--) {

            if (arr[i] + 1 != 10) {
                arr[i] = arr[i] + 1;
                return arr;
            }

            arr[i] = 0;
        }

        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }

}
