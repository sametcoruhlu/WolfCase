package com.company;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.regex.*;

class Result {
    public static int uniqueWolfs(List<Integer> arr) {
        int tur1=0;
        int tur2=0;
        int tur3=0;
        int tur4=0;
        int tur5=0;
        int grater=0;
        String kind="";

        for (int item:
             arr) {
            if(item == 1)
                tur1++;
            if(item == 2)
                tur2++;
            if(item == 3)
                tur3++;
            if(item == 4)
                tur4++;
            if(item == 5)
                tur5++;
        }

        if(tur1 > grater){
            grater=tur1;
            kind = "1";
        }
        if(tur2 > grater){
            grater=tur2;
            kind = "2";
        }
        if(tur3 > grater){
            grater=tur3;
            kind = "3";
        }
        if(tur4 > grater){
            grater=tur4;
            kind = "4";
        }
        if(tur5 > grater){
            grater=tur5;
            kind = "5";
        }

        return Integer.parseInt(kind);
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new
                FileWriter(System.getenv("OUTPUT_PATH")));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+", "").split("")).map(Integer::parseInt).collect(toList());
        int result = Result.uniqueWolfs(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
