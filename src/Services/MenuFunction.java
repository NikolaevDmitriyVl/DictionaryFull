package Services;
public interface MenuFunction {

    void delete(String englishWord);
    void add(String wordEnglish, String wordRussian);
    void showAllWords();
    void search(String word);



}
