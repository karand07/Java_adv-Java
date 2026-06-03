import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array elements");
        int [] arr1 = new int [5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j : arr1){
            System.out.println(arr1[j]);
        }
    }
}
