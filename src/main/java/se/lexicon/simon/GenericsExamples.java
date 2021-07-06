package se.lexicon.simon;

public class GenericsExamples {
    public static void main(String[] args) {

        boolean are10_10Equal = areEqual(10, 10);

        boolean tim = areEqual("100", 100);
        System.out.println("are10_10Equal = " + are10_10Equal);
        System.out.println("tim = " + tim);

    }


    public static <T> boolean areEqual(T first, T second){
        return first.equals(second);
    }

//    public static <T> Double addition( T number1, T number2){
//
//        return number1 + number2;
//
//
//    }




}
