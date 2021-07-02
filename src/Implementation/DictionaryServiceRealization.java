package Implementation;

import Entity.Dictionary;
import Services.DicitionaryService;
import java.util.Map;

public class DictionaryServiceRealization implements DicitionaryService {
    Dictionary dictionary;
    @Override
    public void show(Dictionary dictionary) {
        for(Map.Entry pair : dictionary.getDictionary().entrySet()){
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
    public void addPairWordsWithInteger(String englishWord , Integer i){
        dictionary.getPairCount().put(englishWord,i);
    }

    @Override
    public void deletePairWord(String englishWord) {

        dictionary.getDictionary().remove(englishWord);
        dictionary.getPairCount().remove(englishWord);
    }
}
