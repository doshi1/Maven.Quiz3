package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
      /*  char[] vowels = {'a','e','o','i','u'};
//        for(int i=0 ; i < word.length();i++){
//             vowels[i]  = word.charAt(i);
//        }
//        return true;
        if(Arrays.asList(vowels).contains(word)){}
        return  true; */
        if (word.length()!=1) return false;
        char vowels=word.toLowerCase().charAt(0);
        if(vowels== 'a'|| vowels =='e' || vowels=='i'|| vowels == 'o' ||  vowels == 'u'){
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] vowels = {'a','e','o','i','u'};
        String wordLowered =  word.toLowerCase();
        for (int i=0; i < wordLowered.length(); i++){
            for (int j=0; j < vowels.length; j++) {
                if (wordLowered.charAt(i) == vowels[j]){
                    return i;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return null ;
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
