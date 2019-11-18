package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] char1 = str.toCharArray();

          char1[indexToCapitalize] =  Character.toUpperCase(char1[indexToCapitalize]);
          String str1 = new String(char1);
          return str1;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

//        String charIndex = Character.toString(baseString.charAt(indexOfString));
//        charIndex.equalsIgnoreCase(String.valueOf(characterToCheckFor));
//        return true;
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
//        String str = new String[];
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i+1; j <= string.length(); j++) {
//
//                str = string.substring(i, j);

        Set<String> result = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                result.add(string.substring(i,j));
            }
        }
        return result.toArray(new String[0]);

    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
