package activities;

public class Activity8 {

    public static void main(String[] args) {
        try{
            exceptionTest("Passing non null value");
            exceptionTest(null);
            exceptionTest("Unreachable code");
        }catch (CustomException e){
            System.out.println("Inside catch block : " + e.getMessage());
        }

    }

    public static void exceptionTest(String str) throws CustomException {
        if(str == null){
            throw new CustomException("String value is null");
        }else{
            System.out.println(str);
        }
    }
}
