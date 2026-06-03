import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. which table u want:");
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(i*n);
        }

        int j =1;
        while (j<=n){
            if (j%2==0){
                System.out.println("even:"+j);
            }
            j++;
        }
        int d = 1;
        do{

            System.out.println("loop started");
            System.out.println(d);
            d++;

        }while(d !=5);
    }
}
