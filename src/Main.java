import javafx.util.Pair;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        HashTable hashTable=new HashTable();
//        Pair<Integer,String > input=new Pair<>(12,"ali");
//        Pair<Integer,String > input1=new Pair<>(13,"ali");
//        Pair<Integer,String > input2=new Pair<>(2,"ali");
//        hashTable.put(input);
//        hashTable.put(input1);
//        hashTable.put(input2);
//        hashTable.print();
//        System.out.println(hashTable.containsKey(1));
//        System.out.println(hashTable.containsValue("2"));
//        System.out.println(hashTable.containsValue("ali"));
//        System.out.println(hashTable.get(13));
//        hashTable.remove(2);
//        hashTable.print();
        Factorial fact=new Factorial();
        Long date=new Date().getTime();
        System.out.println(fact.factorial(15));
        System.out.println(fact.factorial1(15));
        Long date1=new Date().getTime();
        System.out.println(date1);
        System.out.println(date);
    }


}
