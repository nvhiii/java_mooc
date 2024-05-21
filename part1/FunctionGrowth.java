//  *  Compilation:  javac FunctionGrowth.java
//  *  Execution:    java FunctionGrowth
//  *
//  *  Print out ln n, n, n log n, n^2, n^3 for n = 2, 4, 8, ..., 2048.

import java.text.DecimalFormat;

public class FunctionGrowth {

    public static void main(String[] args) {

        System.out.println("log n\tn\tn log n\t\tn^2\t\tn^3");
        DecimalFormat df = new DecimalFormat("#.##");

        // for loop that increments by power of 2
        for (int i = 2; i <= 2048; i *= 2) {

            // per iteration, 1 line for all comp printed
            double log = Math.log(i);
            double nlogn = i * Math.log(i);
            double nSquared = Math.pow(i, 2);
            double nCubed = Math.pow(i, 3);

            System.out.println(df.format(log) + "\t" + i + "\t" + df.format(nlogn) + "\t\t" + df.format(nSquared) + "\t\t" + df.format(nCubed));

        }


    }

}