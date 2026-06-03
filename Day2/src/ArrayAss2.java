import java.util.Scanner;

public class ArrayAss2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        int sum =0;
        int evensum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i : arr){
            sum +=i;
        }
        System.out.println(sum);

        for(int i : arr){
            if (i%2==0)evensum +=i;
        }
        System.out.println(evensum);

        int temp =0 ;
        for (int arr1 :arr ){
            if (arr1>temp)temp=arr1;
        }
        System.out.println("max num :"+temp);
    }
}
