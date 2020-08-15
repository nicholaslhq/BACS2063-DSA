
package adt;

public class TestSequence {

    public static void main(String[] args) {
        SequenceInterface<Integer> sequence = new Sequence<>(3);
        
        sequence.add(11);
        sequence.add(22);
        sequence.add(33);
        sequence.add(44);
        System.out.println("index of 66: " + sequence.indexOf(66));
        System.out.println("index of 11: " + sequence.indexOf(11));
        System.out.println("index of 22: " + sequence.indexOf(22));
        
        
        /*System.out.println("size: " + sequence.size());
        System.out.println("capacity: " + sequence.capacity());
        
        
        System.out.println("retrieve: " + sequence.retrieve());
        System.out.println("retrieve: " + sequence.retrieve());
        
        System.out.println("All element after retrieve: " + sequence.toString());
        System.out.println("size: " + sequence.size());
        System.out.println("capacity: " + sequence.capacity());
        sequence.add(44);
        sequence.add(55);
        System.out.println("isFull: " + sequence.isFull());
        sequence.add(66);
        sequence.add(77);
        System.out.println("All element after add: " + sequence.toString());
        System.out.println("size: " + sequence.size());
        System.out.println("capacity: " + sequence.capacity());
        sequence.add(88);
        sequence.add(99);
        sequence.add(100);
        System.out.println("All element after add: " + sequence.toString());
        System.out.println("size: " + sequence.size());
        System.out.println("capacity: " + sequence.capacity());*/
    }
    
}
