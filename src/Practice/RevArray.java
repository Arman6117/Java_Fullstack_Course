package Practice;

public class RevArray {
    public static void main(String[] args) {
        Boolean[] arr = {true,false,false,true,false,true};
//        Boolean[] rev = new Boolean[arr.length];
  int start  = 0, end = arr.length-1;
  boolean temp;
        System.out.println("Normal array");
        for (boolean a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
      while (start < end) {
          temp  = arr[start];
          arr[start] = arr[end];
          arr[end]  = temp;
          start++;
          end--;
      }
        System.out.println("Reversed array");
        for (boolean a : arr) {
            System.out.print(a + " ");
        }
    }
}
