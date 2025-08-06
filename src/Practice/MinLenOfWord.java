package Practice;

public class MinLenOfWord {
    public static void main(String[] args) {
        String[] arr = {"Coffee", "Water", "Chai", "Diet Coke"};
        String min = arr[0];
        int index = 0;
        for (int i = 0; i<arr.length; i++) {
            if (min.length() > arr[i].length()) {
                min = arr[i];
                index = i;
            }

        }
        System.out.println("Minimum length word in array: " + min + " at index: " + index);
    }
}
