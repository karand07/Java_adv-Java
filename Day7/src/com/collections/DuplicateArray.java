package com.collections;

public class DuplicateArray {
    public static void main(String[] args) {
        int [] arr = {1,23,2,1,2,3,43,1,1,23,4,2,45};
        for (int i = 0 ; i<arr.length;i++){
            int num = arr [i];
            int dup = 0;
            for (int j = 0 ; j< arr.length;j++){
                if(num==arr[j]){
                    dup++;
                }
            }
            if(dup>1){
                System.out.println(arr[i] +" is duplicate");

            }
        }
    }
}
