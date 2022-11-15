package OOPS3.Generics;

public class Pair<T> { // is called generic class
    // we can define any kind of data types while making objects.

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
