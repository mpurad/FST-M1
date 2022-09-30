package activities;

public class Activity2 {

    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};

        int searchNum = 10;
        int totalNum = 30;

        System.out.print("The result : " + returnResult(arr, searchNum, totalNum));
    }

    public static boolean returnResult(int[] arr, int searchNum, int totalNum){
        int sum = 0;

        for(int num:arr){
            if(num == searchNum){
                sum+=num;
            }

            if(sum >= totalNum){
                break;
            }
        }

        if(sum == totalNum) {
            return true;
        }else{
            return false;
        }
    }
}
