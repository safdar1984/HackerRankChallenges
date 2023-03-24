/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example
The minimum sum is and the maximum sum is

. The function prints

16 24

Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

    arr: an array of 

    integers

Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of
of

elements.

Input Format

A single line of five space-separated integers.

Constraints

Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5

Sample Output

10 14

Explanation

The numbers are
, , , , and

. Calculate the following sums using four of the five integers:

    Sum everything except 

, the sum is
.
Sum everything except
, the sum is
.
Sum everything except
, the sum is
.
Sum everything except
, the sum is
.
Sum everything except
, the sum is

    .

Hints: Beware of integer overflow! Use 64-bit Integer.

Need help to get started? Try the Solve Me First problem */

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

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
        int arrLength = arr.size();
        int min = arr.get(0);
        int max = 0;
        int minCount = 0;
        int maxCount = 0;
        for(int i=0; i<arrLength; i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
             if(arr.get(i)<min){
                min = arr.get(i);
            }
        }
        
        for(int j=0;j<arrLength;j++){
            if(arr.get(j)!=min){
                minCount = minCount + arr.get(j);
            }
            if(arr.get(j)!=max){
                maxCount = maxCount + arr.get(j);
            }
        }
        System.out.println("Minimum sum is "+maxCount);
        System.out.println("Maximum sum is "+minCount);
        
        System.out.println(maxCount+" "+minCount);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      /*  List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());*/
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        Result2.miniMaxSum(arr);

        bufferedReader.close();
    }
}