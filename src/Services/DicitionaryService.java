package Services;

import Entity.Dictionary;

public interface DicitionaryService {
    void addPairWord(String englishWord , String russianWord);
    void addPairWordsWithInteger(String englishWord , Integer i);
    void deletePairWord(String englishWord);
    void show(Dictionary dictionary);
}
