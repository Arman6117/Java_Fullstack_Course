package SearchingSorting.Questions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9};
        int n = 9;
        int index = -1;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == n) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found");
        }
    }
}
