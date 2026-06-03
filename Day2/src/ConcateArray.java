import java.util.Arrays;

public class ConcateArray{
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {6,7,8,9,10};

        int s1 = arr1.length;
        int s2 = arr2.length;
        int  s = s1+s2;
        int [] arr = new int[s];
        int index = 0;
        for ( index =0 ; index < s1 ; index++) {
            arr[index]=arr1[index];
        }
        for (int j : arr2) {
            arr[index] = j;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
