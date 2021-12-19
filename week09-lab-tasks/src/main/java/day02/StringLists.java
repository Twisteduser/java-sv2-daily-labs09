package day02;

import java.util.ArrayList;
import java.util.List;
public class StringLists {


    public List<String> shortestWords(List<String> words){
        List<String> result = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String s: words){
            if (s.length() < minLength){
                minLength = s.length();
                result.clear();
            }
            if (s.length() == minLength){
                result.add(s);
            }
        }
        return result;
    }
}
