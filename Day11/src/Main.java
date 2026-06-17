public class Main {
    public static void main(String[] args) {
        int [] arr = {10};
        int max;
        int max2;
        if(arr.length<2){
            System.out.println("-1");
            return ;
        }
        if (arr[0] > arr[1]) {
            max = arr[0];
            max2 = arr[1];
        }else {
            max = arr[1];
            max2 = arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                max2= max;
                max=arr[i];
            } else if (max==max2) {
                max2=arr[i];
            } else if (arr[i]>max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(max);
    }
}
