public class Max {

    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;


        int absalutSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > absalutSum) absalutSum = currentSum;
            }
        }

        if (absalutSum < 0) return 0;
        return absalutSum;
    }

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}