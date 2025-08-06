package Practice;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,6};
        int  max =arr[0], index = 0;
        for(int i = 0; i<arr.length; i++) {
            if(max < arr[i]) {
                max= arr[i];
                index = i;
            }
        }

        System.out.println("Maximum number: " + max +" at index: " + index);
    }
}
