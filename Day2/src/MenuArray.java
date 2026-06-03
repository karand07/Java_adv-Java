import java.util.Scanner;

public class MenuArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("array created of length :"+size);
        System.out.println("Enter array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int opt =0;
        do{
            System.out.println("Select option:");
            System.out.println("1.Print Array");
            System.out.println("2.search number");
            System.out.println("3.array sum");
            System.out.println("4.Find Max number");
            opt = sc.nextInt();
            switch (opt){
                case 1 ->{
                    System.out.println("--------Print Array-----------");
                    for (int i : arr){
                        System.out.println(i);
                    }
                }
                case 2->{
                    System.out.println("----------Search Number-----------");
                    System.out.println("Enter number to search");
                    int search = sc.nextInt();
                    boolean result =false;
                    for (int i : arr){
                        if (i==search){
                            result=true;
                        break;}
                    }
                    if (result){
                        System.out.println("Number is present ");
                    }else System.out.println("Number is not present");
                }
                case 3->{
                    System.out.println("--------Sum of array---------");
                    int sum =0;
                    for(int i : arr){
                        sum +=i;
                    }
                    System.out.println(sum);
                }
                case 4->{
                    System.out.println("--------max number--------");
                    int temp =0 ;
                    for (int arr1 :arr ){
                        if (arr1>temp)temp=arr1;
                    }
                    System.out.println("max num :"+temp);
                }
            }
        }while (opt !=5);
        System.out.println("Thanks for Using ");
    }
}
