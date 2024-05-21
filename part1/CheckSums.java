// Checksums. The International Standard Book Number (ISBN) is a 10 
// digit code that uniquely specifies a book. The rightmost digit is
//  a checksum digit which can be uniquely determined from the other 
// 9 digits from the condition that d1 + 2d2 + 3d3 + ... + 10d10 must 
// be a multiple of 11 (here di denotes the ith digit from the right). 
// The checksum digit d1 can be any value from 0 to 10: the ISBN convention 
// is to use the value X to denote 10. Example: the checksum digit 
// corresponding to 020131452 is 5 since is the only value of d1 between 
// 0 and and 10 for which d1 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 
// is a multiple of 11. Write a program ISBN.java that takes a 9-digit 
// integer as a command-line argument, computes the checksum, and prints 
// the 10-digit ISBN number. It's ok if you don't print any leading 0s.

public class CheckSums {

    public static void main(String[] args) {

        int partSum = 0;
        int newValue = 0;
        int iterator = 0;
        // my issue is that the 0 is omitted here during parse, SO I USE STRING
        String partialISBN = args[0];
        char[] charArray = partialISBN.toCharArray(); // char array

        // first calc sum of digits, since 1st num is 10 from right, start is 10
        for (int i = 10; i > 1; i--) {

            newValue = i * Character.getNumericValue(charArray[iterator]);
            partSum += newValue;

            if (iterator < charArray.length) {
                iterator++;
            }

        }


        int remainder = partSum % 11;
        int toNextMultiple = 11 - remainder;
        System.out.println(partialISBN + toNextMultiple);

    }

}