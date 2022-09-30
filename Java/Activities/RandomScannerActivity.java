package activities;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integer values to continue");
        System.out.println("Enter integer values to terminate");

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer[] numArr = list.toArray(new Integer[0]);


        int index = indexGen.nextInt(numArr.length);

        System.out.println("Index value generated : " + index);
        System.out.println("Value in the array for the generated index : " + numArr[index]);

        scan.close();
    }
}
