package Hash_Maps.HashMapImplementation;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets; // Arraylist with linkedlist on every index.
    int size; // number of entries in our map
    int numberOfBuckets; // number of buckets

    public Map(){
        numberOfBuckets = 20;
        buckets = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            buckets.add(null);
        }
    }

    public int size(){
        return size;
    }

    private int getBucketIndex(K key){ // finding index on which our value will store.
        int hashCode = key.hashCode(); // using hashCode method for getting hashCode.
        return hashCode % numberOfBuckets; // returning hashCode after compressing.
    }

    public V removeKey(K key){ // return value of the removed key.
        int bucketIndex = getBucketIndex(key); 
        MapNode<K, V> head = buckets.get(bucketIndex); // getting head of linkedlist
        MapNode<K, V> prev = null;
        // iterating linkedlist to find key. if key exists, will delete it.
        while (head != null) {
            if (head.key.equals(key)) {
                if(prev == null){
                    buckets.set(bucketIndex, head.next);
                }
                else{
                    prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next; // moving head
        }
        return null;
    }

    public V getValue(K key){ // search value and return
        int bucketIndex = getBucketIndex(key); 
        MapNode<K, V> head = buckets.get(bucketIndex); // getting head of linkedlist
        // iterating linkedlist to find key. if key exists, will return value else will return null.
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next; // moving head
        }
        return null;
    }

    public void insert(K key, V value){
        int bucketIndex = getBucketIndex(key); // getting index on which we will store key
        MapNode<K, V> head = buckets.get(bucketIndex); // getting head of linkedlist
        // iterating linkedlist to find key. if key exists, will update value else will create new entry with that key.
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; // updating value
                return;
            }
            head = head.next; // moving head
        }
        // key does not exist
        head = buckets.get(bucketIndex); // setting head to prev place
        MapNode<K, V> newElementNode = new MapNode<>(key, value);
        newElementNode.next = head; // set head to the next of new node
        buckets.set(bucketIndex, newElementNode); // set new node at the previously found index
    }


}