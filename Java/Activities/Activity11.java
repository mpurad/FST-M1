package activities;

import java.util.HashMap;

public class Activity11 {

    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Yellow");
        map.put(5, "Black");

        System.out.println("The map : " + map);

        map.remove(3);

        System.out.println(map.containsValue("Green"));

        System.out.println("THe updated size of map : " + map.size());
    }
}
