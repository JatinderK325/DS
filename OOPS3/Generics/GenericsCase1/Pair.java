package OOPS3.Generics.GenericsCase1;

public class Pair<T> { // is called generic class: when we don't want to specify particular type of data instead we want to use pair class for making any kind of datatypes.
    // we need to define data types while making objects.

    public T first;
    public T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    public void setFirst(T first){
        this.first = first;
    }

    public T getFirst(){
        return first;
    }
    
    public void setSecond(T second){
        this.second = second;
    }
    
    public T getSecond(){
        return second;
    }
    
}
