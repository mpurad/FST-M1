package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();

        hs.add("Element1");
        hs.add("Element2");
        hs.add("Element3");
        hs.add("Element4");
        hs.add("Element5");
        hs.add("Element6");
        hs.add("Element5");

        System.out.println("Size of the list : " + hs.size());

        hs.remove("Element4");

        hs.remove("Element8");

        System.out.println(hs.contains("Element1"));

        System.out.println("The updated set : " + hs);
    }
}
