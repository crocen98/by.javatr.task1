package by.javatr.task1.ex4.algorithms;

public class ArrayAlgorithms {
    public static int CalculateSumOfNumberThatMultiplesOfParametr(int parametr, int[] numbers){
        int sum =0;
        for (int number: numbers){
            if(number%parametr == 0){
                sum+=number;
            }
        }
        return sum;
    }
}
