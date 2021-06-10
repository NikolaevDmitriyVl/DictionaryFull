package Services;

import Entity.Dictionary;

public interface DicitionaryService {
    void addPairWord(String englishWord , String russianWord);
    void deletePairWord(String englishWord);
    void show(Dictionary dictionary);
}
