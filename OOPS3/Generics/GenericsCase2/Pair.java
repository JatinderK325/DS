package OOPS3.Generics.GenericsCase2;

public class Pair<T, V> { // when we want one variable of one data type(for example: int) and the second variable of other(different) data type(for example: String) OR one data type(for example: int) and the second data type is also(for example: int)

    public T first;
    public V second;

    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }
    
    public void setFirst(T first){
        this.first = first;
    }

    public T getFirst(){
        return first;
    }
    
    public void setSecond(V second){
        this.second = second;
    }
    
    public V getSecond(){
        return second;
    }
    
}
