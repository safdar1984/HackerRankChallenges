/*Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with

places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to

are acceptable.

Example
There are elements, two positive, two negative and one zero. Their ratios are , and

. Results are printed as:

0.400000
0.400000
0.200000

Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

    int arr[n]: an array of integers

Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with

digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer,
, the size of the array.
The second line contains space-separated integers that describe

.

Constraints


Output Format

Print the following
lines, each to

decimals:

    proportion of positive values
    proportion of negative values
    proportion of zeros

Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output

0.500000
0.333333
0.166667

Explanation

There are
positive numbers, negative numbers, and zero in the array.
The proportions of occurrence are positive: , negative: and zeros: . */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
   
        double z=0;
        double p=0;
        double n=0;
       double arrLength = arr.size();
        for(int i=0;i<arrLength;i++){
            
            if(arr.get(i)==0)
            {
                z++;
            }else if(arr.get(i)>0){
                p++;
            }
            else {
                n++;
            }
                        
        }
        DecimalFormat df = new DecimalFormat("#.######");
            
            System.out.println("Positive number's ratio is "+df.format(p/arrLength));
            System.out.println("Negative number's ratio is "+df.format(n/arrLength));
            System.out.println("Zero number's ratio is "+df.format(z/arrLength));
    }

}

public class PlusMinusChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //    int n = Integer.parseInt(bufferedReader.readLine().trim());

      //  List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      //      .map(Integer::parseInt)
      //      .collect(toList());
        
        
        // List input can be added from here
        List<Integer> arr = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 0, 4, 1, -9));

       
        
        Result.plusMinus(arr);
     

        bufferedReader.close();
    }
}