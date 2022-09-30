package activities;

public class Activity4 {

    public static void main(String[] args){
        int[] arr = {3,1,6,10,12,4,5,9,8};

        System.out.println("Array order before sprting");

        for(int num:arr){
            System.out.println(num);
        }

        int temp;

        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array order after sorting : ");

        for(int num: arr){
            System.out.println(num);
        }
    }
}
