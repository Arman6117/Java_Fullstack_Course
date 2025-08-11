package _9_SearchingSorting;

public class Count {
    public static void main(String[] args) {
        int[] arr = {-2,1,3,0,-2,3,-1,0};
        int pos = 0, neg = 0, zero = 0;
        for(int n:arr){
            if(n >0 ) pos++;
            if(n <0) neg++;
            if(n==0) zero++;
        }
        System.out.println("Number of positive number: " + pos);
        System.out.println("Number of negative number: " + neg);
        System.out.println("Number of zeros : " + zero);
    }


}
