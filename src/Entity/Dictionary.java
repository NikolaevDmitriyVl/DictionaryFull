package Entity;
import java.util.HashMap;
import java.util.Map;
public class Dictionary {
    private static HashMap<String , String > dictionary = new HashMap<>();
    private static Map<String , Integer> pairCount = new HashMap<>();
    public static Dictionary dict;

    private Dictionary(){
        this.dictionary = new HashMap<>();
        this.pairCount = new HashMap<>();
    }

    public static Map<String, Integer> getPairCount() {
        return pairCount;
    }

    public static Dictionary getInstance(){
        if(dict==null){
            return new Dictionary();
        }
        else{
            return dict;
        }
    }
    public Map<String, String> getDictionary() {
        return dictionary;
    }

}
