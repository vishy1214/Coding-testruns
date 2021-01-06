package string.lowestIndexOfSubstring;

import java.util.*;

/**
 * Given a text, return the lowest index at which the substring begins or else return -1
 **/
public class LowestIndexInAStringWhereSubstringBegins {
    private static int findLowestIndex(char[] text, char[] pattern){
        int textLength = text.length;
        int patternLength = pattern.length;

        if(patternLength > textLength) return -1;
        if(patternLength == textLength) return 0;
        if(patternLength == 0) return -1;

        int textIndex = 0;
        int patternIndex = 0;

        Map<Character,Integer> map = new HashMap<>();

        while(textIndex < textLength){
            //System.out.println("text[textIndex] :"+text[textIndex] +"  -  pattern[patternIndex] : "+pattern[patternIndex]);
            if(text[textIndex] == pattern[patternIndex]){
               // System.out.println("patternIndex :"+patternIndex +"  -  patternLength : "+patternLength);
                if(patternIndex == patternLength-1){
                    return map.get(pattern[0]);
                }
                map.put(text[textIndex],textIndex);
                textIndex++;
                patternIndex++;
            }else{
                //dont match
                if(patternIndex == 0){
                    textIndex++;  //increment only when there wasn't any match. increments in the case of a match is done in the if block.
                }
                patternIndex=0; //lets start over
            }
        }
        return -1;

    }

    public static void main(String[] args){
        String text = "CCCGGAATTEERWTDWRRTTSSTTSTRETSTSSSTTSTRETTTAARRTTPP";
        String substring = "STRET";

        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));

       text = "CCCGGAATTEERWTDWRRTTSSTTSTRETSTSSSTTSTRETTTAARRTTPP";
       substring = "GAAT";
        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));

        text = "CCCGGAATTEERWTDWRRTTSSTTSTRETSTSSSTTSTRETTTAARRTTPP";
        substring = "bbbb";
        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));

        text = "CCCGGAATTEERWTDWRRTTSSTTSTRETSTSSSTTSTRETTTAARRTTPP";
        substring = "";
        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));


        text = "CCCGGAATTEERWTDWRRTTSSTTSTRETSTSSSTTSTRETTTAARRTTPP";
        substring = "CCC";
        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));

        text = "CCCGGAATTEERWTDWRRTTSSTTSTRETSTSSSTTSTRETTTAARRTTPP";
        substring = "TTPP";
        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));

        text = "coolcoolcoolcollcool";
        substring = "cool"; //should return the index of the first occurrence.
        System.out.println(findLowestIndex(text.toCharArray(),substring.toCharArray()));
    }
}
