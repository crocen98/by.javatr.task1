package by.javatr.task1.util.reader;

import java.util.Scanner;

public class SystemInReader {
   private Scanner scanner = new Scanner(System.in);


    public  String readLine(){
        return scanner.nextLine();
    }

    public  Integer readInt(){
        while (scanner.hasNextLine()){
            if(scanner.hasNextInt()){
               return scanner.nextInt();
            }
            scanner.next();
        }
        return null;
    }


    public  Double readDouble(){
        while (scanner.hasNextLine()){
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            scanner.next();
        }
        return null;
    }

    public Integer readCountingInteger(){
        while (scanner.hasNextLine()){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(number > 0){
                    return number;
                }
            }
            scanner.next();
        }
        return null;
    }
}
