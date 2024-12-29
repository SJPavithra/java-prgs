public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 34, 5, 70, 25};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}
