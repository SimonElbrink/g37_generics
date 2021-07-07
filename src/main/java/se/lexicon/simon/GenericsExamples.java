package se.lexicon.simon;

import se.lexicon.simon.model.Car;
import se.lexicon.simon.model.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples {
    public static void main(String[] args) {

        boolean are10_10Equal = areEqual(10, 10);

        boolean tim = areEqual("100", 100);
        System.out.println("are10_10Equal = " + are10_10Equal);
        System.out.println("tim = " + tim);


        int compare1 = compare(10, 10);

        int compare = compare(new Person(1, "simon", "emailthis", 23),
                new Person(2, "erik", "emailthis", 35));

        compare(new Car(),new Car());


        List<Number> numbers = new ArrayList<>();
        numbers.add(10.60);
        numbers.add(50);
        numbers.add(62);
        numbers.add(90);

        sum(numbers);



        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(100);
        ints.add(200);

        sum(ints);

        List<Double> doubles = new ArrayList<>();
        doubles.add(10.60);
        doubles.add(100.32);
        doubles.add(200.0);
        sum(doubles);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "simon", "emailthis", 23));
        persons.add(new Person(2, "erik", "emailthis", 35));
//        sum(persons);


        printData(numbers);
        printData(persons);
        printData(ints);

        addInteger(numbers);
        addInteger(ints);
        //addInteger(doubles);
        
        
        
        GenericContainer<String> name = new GenericContainer<>("Simon");
        System.out.println("name.get() = " + name.get());

        GenericContainer<Integer> number = new GenericContainer<>();
        number.set(123);

    }


    //Add together number from a list
    // Upper Bounds
    public static double sum (List<? extends Number> list){
        double sum = 0;
        for (Number n :
                list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static <T> boolean areEqual(T first, T second){
        return first.equals(second);
    }

/*    public static <T> Double addition( T number1, T number2){
        number1.

        return number1 + number2;


    }*/
    //Everyone that calls this method NEEDS to extend Comparable<T> Interface
    //By adding "extends Comparable<T>" we get access to the compare to method in side the method.

    public static <T extends Comparable<T>> int compare(T object1, T object2){
        return object1.compareTo(object2);
    }

    //Unbound wildcard
    public static void printData(List<?> list){
        for (Object o :
                list) {
            System.out.print(o.toString() + "::");
        }
        System.out.println();
    }

    //lowerbound
    public static void addInteger(List<? super Integer> list){
        list.add(new Integer(50));
    }






}
