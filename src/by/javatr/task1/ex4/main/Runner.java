package by.javatr.task1.ex4.main;

import by.javatr.task1.ex4.algorithms.ArrayAlgorithms;
import by.javatr.task1.util.reader.SystemInReader;

import java.util.Arrays;

public class Runner {

    public static void initArray(SystemInReader reader,int[] array){
        for(int i=0;i<array.length;++i){
            array[i] = reader.readCountingInteger();
        }
    }

    public static void main(String ... args){
        System.out.println("Enter size of array: ");
        SystemInReader reader= new SystemInReader();
        final int arrSize=reader.readCountingInteger();
        int[] array = new int[arrSize];
        System.out.println("Init array");
        initArray(reader,array);
        System.out.println("Enter parametr: ");
        int parametr = reader.readCountingInteger();

        System.out.println("Your array: ");
        System.out.println(Arrays.toString(array));

        System.out.println(
                        "Sum of numbers that multiples of parametr: " +
                        parametr +
                        " =" +
                        ArrayAlgorithms.CalculateSumOfNumberThatMultiplesOfParametr(parametr,array)
        );

    }
}
