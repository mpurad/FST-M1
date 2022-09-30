package activities;

public class Activity12 {

    public static void main(String[] args){
        Addable addable1 = (a,b)->(a+b);
        System.out.println(addable1.add(4,5));

        Addable addable2 = (a,b)->{
            return a+b;
        };
        System.out.println(addable2.add(6,7));
    }
}
