import java.util.Scanner;

public class ArrayAss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array elements");
        int [] arr1 = new int [10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j : arr1){
            if (j%2==0) System.out.println("even"+j);
            else System.out.println("odd"+j);
        }
    }
}
