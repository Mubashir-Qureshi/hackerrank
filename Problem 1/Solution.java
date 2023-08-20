
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
        float x=0,y=0,z=0;
        int len = arr.size(); 

        for(int i=0; i<len; i++){
            if(arr.get(i)<0){
            x++;
        }
        else if(arr.get(i)>0){
            y++;
        }
        else{
            z++;
        }}

    x/=len;  //calculating overall ratios 
    y/=len;
    z/=len;
    System.out.format("%.6f\n",y);
    System.out.format("%.6f\n",x);
    System.out.format("%.6f\n",z);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());  
           
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);
        bufferedReader.close();
    }
}