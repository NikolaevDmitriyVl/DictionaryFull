package Implementation;

import Entity.Dictionary;
import Services.DictionarySearch;
import java.util.Map;

public class DictionarySearchRealizacion implements DictionarySearch {

    @Override
    public void searchWord(String word, Dictionary dictionary) {
        Map<String, String> dict = dictionary.getDictionary();
        for (Map.Entry pair : dict.entrySet()) {
            if (word.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
            else if(word.equals(pair.getKey())){
                System.out.println(pair.getValue());
            }

        }
    }

   
}


