package by.javatr.task1.ex6.main;

import by.javatr.task1.ex6.sequence.SequenceOfRealNumbers;
import by.javatr.task1.util.reader.SystemInReader;

public class Runner {

    public static void initArray(SystemInReader reader, int[] array){
        for(int i=0;i<array.length;++i){
            array[i] = reader.readCountingInteger();
        }
    }

    public static void main(String ... args){
        SystemInReader reader = new SystemInReader();
        System.out.println("Enter size of sequence: ");
        int size;
        size = reader.readCountingInteger();
        int[] array = new int[size];
        System.out.println("Init sequence");
        initArray(reader,array);

        SequenceOfRealNumbers sequence = new SequenceOfRealNumbers(array);
        System.out.println(sequence.isIncreasing());
    }



}
