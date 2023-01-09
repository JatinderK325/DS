package Hash_Maps.HashMapImplementation;

public class MapNode<K, V> {
    // every bucket(index) in our arraylist will contain a linkedlist with (key, value) pair and address of next node.
    K key; // key
    V value; // value
    MapNode<K, V> next;

    public MapNode(K key, V value){
        this.key = key;
        this.value = value;
    }
}
