package Implementation;

import Entity.Dictionary;
import Services.DicitionaryService;

import java.util.Map;

public class DictionaryServiceRealization implements DicitionaryService {
    Dictionary dictionary;
    @Override
    public void show(Dictionary dictionary) {
        Map<String,String> dict = dictionary.getDictionary();
        for(Map.Entry pair : dict.entrySet()){
            System.out.println(pair);
        }
    }
    public DictionaryServiceRealization(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    @Override
    public void addPairWord(String englishWord, String russianWord) {
           dictionary.getDictionary().put(englishWord , russianWord);
    }

    @Override
    public void deletePairWord(String englishWord) {
          dictionary.getDictionary().remove(englishWord);
    }
}
