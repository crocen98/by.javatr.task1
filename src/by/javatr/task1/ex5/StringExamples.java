package by.javatr.task1.ex5;

public class StringExamples {
     static void stringTrim(String exString){
        System.out.println("\""+ exString + "\"");
        System.out.println("\""+ exString.trim() + "\"");

    }

     static void testIntern(String exString){
        String str1 = new String(exString);
        String str2 = new String(exString);
        System.out.println(str1 == str2);
        str1 = str1.intern();
        str2 = str2.intern();
        System.out.println(str1 == str2);
    }

     static void testRegionMatches(String region, String exString){
        System.out.println(exString.regionMatches(0,region,0,3));
        System.out.println(exString.regionMatches(1,region,0,3));
    }



     static void testSplit(String exString, String regx){
        String[] arrayOfStrings = exString.split(regx);
        for (String splitedString: arrayOfStrings){
            System.out.println(splitedString);
        }
    }

     static  void testEqualsIgnoreCase(String exString2, String exString1 ){
        System.out.println(exString1.equals(exString2));
        System.out.println(exString1.equalsIgnoreCase(exString2));
    }

    public static void main(String ... args){
        System.out.println("stringTrim()");
        stringTrim("     3   4      2       4             ");

        System.out.println("testIntern()");
        testIntern(" 144 1");
        System.out.println("testRegionMatches()");
        testRegionMatches("123","11234567");

        System.out.println("testSplit()");
        testSplit("30.4w123fw235fde246cv0Af253241", "[a-zA-z]+");

        System.out.println("testEqualsIgnoreCase()");
        testEqualsIgnoreCase("12AfFEVVFD" , "12AffevvFD");
    }
}
