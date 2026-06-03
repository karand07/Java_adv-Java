import java.util.Scanner;

public class StationaryCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, price = 0;
        byte quant =0;
        System.out.println("1.pen  2.book  3.bag   4.total_bill  5.Exit");
        byte opt;
        do {
            System.out.print("Choose option:");
            opt = sc.nextByte();

            switch (opt){
                case 1 ->{
                    price = 10;
                    System.out.println("Pen cost is "+ price);
                    System.out.print("Enter Quantity u want :");
                    quant=sc.nextByte();
                    total += price* quant;
                }
                case 2->{
                    price = 60;
                    System.out.println("book cost is "+ price);
                    System.out.print("Enter Quantity u want :");
                    quant=sc.nextByte();
                    total += price* quant;
                }
                case 3 ->{
                    price = 500;
                    System.out.println("bag cost is "+ price);
                    System.out.print("Enter Quantity u want :");
                    quant=sc.nextByte();
                    total += price* quant;
                }
                case 4->{
                    System.out.println("-------Total Bill--------");
                    System.out.println("$"+total);
                }
                case 5->{
                    System.out.println("-------------Thanks For visiting our store---------------");
                }
            }
        } while (opt != 5);
    }
}