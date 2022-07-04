import javafx.util.Pair;

import java.util.LinkedList;

public class HashTable {
    private LinkedList<Pair<Integer, String>>[] linkedList = new LinkedList[10];

    public void put(Pair<Integer, String> input) {
        int index = getIndex(input.getKey());
        if (linkedList[index] == null) {
            linkedList[index] = new LinkedList<>();
        }
        if (!linkedList[index].contains(input))
            linkedList[index].push(input);
    }


    public void print() {
        for (LinkedList<Pair<Integer, String>> list : linkedList) {
            if (list != null)
                System.out.println(list);
        }
    }

    public boolean containsKey(Integer key) {
        int index = getIndex(key);
        if (linkedList[index]!=null){
            for (Pair<Integer, String> pair : linkedList[index]) {
                if (pair.getKey() != key) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsValue(String value) {
        for (LinkedList<Pair<Integer, String>> list : linkedList) {
            if (list!=null){
                for (Pair<Integer, String> pair : list) {
                    if (pair.getValue() == value) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String get(Integer key){
        int index = getIndex(key);
        for (Pair<Integer,String > pair:linkedList[index]){
            if (pair.getKey()==key){
                return pair.getValue();
            }
        }
        return null;
    }

    public void remove(Integer key){
        int index = getIndex(key);
        for (Pair<Integer,String > pair:linkedList[index]){
            if (pair.getKey()==key){
                linkedList[index].remove(linkedList[index].indexOf(pair));
            }
            if (linkedList[index].isEmpty()){
                linkedList[index]=null;
            }
        }
    }

    private int getIndex(Integer key) {
        return key % 10;
    }
}
