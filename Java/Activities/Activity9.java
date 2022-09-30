package activities;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Element1");
        myList.add("Element2");
        myList.add("Element3");
        myList.add("Element4");
        myList.add("Element5");

        System.out.println("The elements of the List : ");

        for(String str:myList){
            System.out.println(str);
        }

        System.out.println("Third element of the list : " + myList.get(3));

        System.out.println(myList.contains("Element2"));

        System.out.println("Size of the list : " + myList.size());

        myList.remove("Element2");

        System.out.println("Size of the list after removing the element : " + myList.size());
    }
}
