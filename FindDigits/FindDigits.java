import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {

      try{
    	BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
	String input;
        int currentSum = 0;
        for(int i = 0; i < t; i++){
            String currentNString = br.readLine();
            int currentN = Integer.parseInt(currentNString);
            for(int j = 0; j < currentNString.length(); j++){
                int currentDigit =
                  Character.getNumericValue(currentNString.charAt(j));
                if(currentDigit !=0 && currentN % currentDigit == 0){
                    currentSum +=1;
                }
            }
	System.out.println(currentSum);
        currentSum = 0;
    	}

      }
      catch(IOException io){
        io.printStackTrace();
      }
    }
}
