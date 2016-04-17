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
            for(int i = 0; i < t; i++){
                String[] currentNumbers = br.readLine().split(" ");
                int lowerNumber = Integer.parseInt(currentNumbers[0]);
                int higherNumber = Integer.parseInt(currentNumbers[1]);

                double startingInteger = Math.ceil(Math.sqrt(lowerNumber));
                double endingInteger = Math.floor(Math.sqrt(higherNumber));

                System.out.println(Math.round(endingInteger-startingInteger) +1);
            }

      }
      catch(IOException io){
    		io.printStackTrace();
    	}
    }
}
