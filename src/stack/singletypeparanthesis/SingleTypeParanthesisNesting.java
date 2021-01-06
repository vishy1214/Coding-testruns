package stack.singletypeparanthesis;
import java.util.*;

public class SingleTypeParanthesisNesting {
    public int solution(String S) {
        // write your code in Java SE 8
        /*
        2.  use a stack, push item as we encounter,
        3. traverse the string
        4. for each char, if they belong to the start bracket, make a push.
        5. else pop out and check for the match with the current item in the char[]
        6. if they dont match return 0 else continue and return 1
        */

        Stack stacked = new Stack();
        for(int i=0; i < S.length() ; i++){
            char currChar = S.charAt(i);
            if(isOpeningBracket(currChar)){
                stacked.push(currChar);
            }else if(isClosingBracket(currChar)){
                if(stacked.size()==0){
                    return 0;
                }
                char popped = (char)stacked.pop();
                if(!doesItMatch(currChar,popped)){
                    return 0;
                }
            }
        }
        if(stacked.size() != 0 ){
            return 0;
        }
        return 1;
    }

    public boolean isOpeningBracket(char currChar){
        if(currChar == '('){
            return true;
        }
        return false;
    }

    public boolean isClosingBracket(char currChar){
        if(currChar == ')'){
            return true;
        }
        return false;
    }

    public boolean doesItMatch(char currChar,char popped){
        // System.out.println(currChar + " --- "+popped);
        if(popped == '(' && currChar == ')'){
            return true;
        }
        return false;
    }
}
