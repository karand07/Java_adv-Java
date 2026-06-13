public class Main {
    public static void main(String[] args) {
        int [] arr = {6,3,5,2,10,7};
        int max= arr[0];
        int max2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(max>arr[i] && arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(max);
    }
}
