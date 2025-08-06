package Practice;

public class MergeArray {
    public static void main(String[] args) {
        String[] arr1 = {"Chai", "Coffee"};
        String[] arr2 = {"Milk", "Water", "Coke"};
        String[] merged = new String[arr1.length + arr2.length];

        System.out.println("Contents of array 1: ");

        for (String a : arr1) {
            System.out.print(" " +a + " ");
        }


        System.out.println("Contents of array 2: ");

        for (String a : arr1) {
            System.out.print(" " +a + " ");
        }


        System.out.println("Merged array: ");
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        System.out.print("[ ");
        for (String s : merged) {
            System.out.print(" "+s + " " );
        }
        System.out.println(" ]");
    }
}
