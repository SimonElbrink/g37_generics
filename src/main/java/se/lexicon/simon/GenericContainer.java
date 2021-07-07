package se.lexicon.simon;

public class GenericContainer<T> {

    //Field
    private T t;

    //Constructors
    GenericContainer(){
    }

    GenericContainer(T t){
        this.t = t;
    }

    //Getter
    public T get(){
        return this.t;
    }

    //Setter
    public void set(T t){
        this.t = t;
    }
}
