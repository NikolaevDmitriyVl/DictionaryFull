import Entity.Dictionary;
import Implementation.DictionaryConsoleServiceRealization;
import Implementation.DictionaryServiceRealization;

public class Main {
    public static void main(String[] args){
        Dictionary dictionary = Dictionary.getInstance();
        DictionaryServiceRealization dictionaryServiceRealization = new DictionaryServiceRealization(dictionary);
        dictionaryServiceRealization.addPairWord("hello" , "привет");
        dictionaryServiceRealization.addPairWord("phone", "телефон");
        DictionaryConsoleServiceRealization show = new DictionaryConsoleServiceRealization();
        show.showDictionary(dictionary);
        //dict("one","three");

    }




}
