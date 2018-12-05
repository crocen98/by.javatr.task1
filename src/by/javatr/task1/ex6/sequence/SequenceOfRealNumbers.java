package by.javatr.task1.ex6.sequence;

import java.util.ArrayList;

public class SequenceOfRealNumbers {
    int[] sequence;

    public SequenceOfRealNumbers(int[] sequence){
        this.sequence = sequence;
    }


   public boolean isIncreasing(){
        int previosNumber = sequence[0];
        for( int i = 1 ; i <  sequence.length;++i){
            if(sequence[i] < previosNumber){
                return false;
            }
            previosNumber = sequence[i];
        }
        return true;
   }


}
