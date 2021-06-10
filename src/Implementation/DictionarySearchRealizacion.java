package Implementation;

import Entity.Dictionary;
import Services.DictionarySearch;
import java.io.IOException;
import java.util.Map;

public class DictionarySearchRealizacion implements DictionarySearch {

    @Override
    public void searchWord(String word, Dictionary dictionary) {
        Map<String, String> dict = dictionary.getDictionary();
        for (Map.Entry translation : dict.entrySet()) {
            if (word.equals(translation.getValue())) {
                System.out.println(translation.getValue());
            }
            else if(word.equals(translation.getKey())){
                System.out.println(translation.getKey());
            }

        }
    }

   
}


