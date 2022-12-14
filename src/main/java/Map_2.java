import java.util.HashMap;

public class Map_2 {

    /*
    We'll say that 2 strings "match" if they are non-empty
    and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows:
    if a string matches an earlier string in the array,
    swap the 2 strings in the array.
    When a position in the array has been swapped,
    it no longer matches anything. Using a map,
    this can be solved making just one pass over the array.
    More difficult than it looks.
     */
    public static String[] allSwap(String [] strings){

        //maps character to index of the string with that starting character
        HashMap<Character, Integer> swapper = new HashMap<>();
        int arrSize = strings.length;
        String[] allSwap = new String[arrSize];
        for(int i = 0; i < arrSize; i++){
            char firstChar = strings[i].charAt(0);
            if(swapper.containsKey(firstChar)){
                allSwap[i] = strings[swapper.get(firstChar)];
                allSwap[swapper.get(firstChar)] = strings[i];
                swapper.remove(firstChar);
            }
            else{
                swapper.put(firstChar, i);
            }
        }
        return allSwap;
    }

    /*
    * Loop over the given array of strings to build a result string like this:
    * when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
    * Return the empty string if no string appears a 2nd time.*/
    public static String wordAppend(String[] strings){
        String append = "";
        HashMap<String, Integer> stringCount = new HashMap<>();

        for(int i = 0; i < strings.length; i++){
            String key = strings[i];
            if(stringCount.containsKey(key)){
                if(stringCount.get(strings[i]) % 2 == 0){
                    append += key;
                }
                else{
                    stringCount.put(key, stringCount.get(key) + 1);
                }
            }
            else{
                stringCount.put(key, 1);
            }
        }
        return append;
    }
}
