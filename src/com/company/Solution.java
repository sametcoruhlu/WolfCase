package com.company;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.regex.*;

class Result {
    public static int uniqueWolfs(List<Integer> arr) {

        int[] repeatedKind= {0,0,0,0,0};
        int temp;
        int kind = 0;

        for (int i=0; i<arr.size(); i++) {
            repeatedKind[arr.get(i)-1]++;
        }

        temp = repeatedKind[0];
        for (int i = 0; i < repeatedKind.length; i++){
            if (repeatedKind[i] > temp) {
                temp = repeatedKind[i];
                kind = i+1;
            }
        }

        return kind;
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
