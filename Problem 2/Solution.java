/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author DEEBYTE COMPUTERS
 */
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
    long a = arr.get(0), b = arr.get(0), max = 0, min=0;
    long sum=0;
    
    for(int i=0; i<arr.size();i++){
        
        if(arr.get(i)>=a){                //a represents current max value in the list
            a = arr.get(i); }
        
        if(arr.get(i)<=b){                //b represents current max value in the list
            b = arr.get(i); }
        
        sum += arr.get(i);
        max = sum - b;
        min = sum - a;   
    }
System.out.println(min+" "+max);
}}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}



