package Entity;
import java.util.HashMap;
import java.util.Map;
public class Dictionary {
    private Map<String , String > dictionary;
    //это наш словарь сюда добавляем новые слова
    public static Dictionary dict;
    //где изменяется эта переменная? или объект?

    private Dictionary(){
        this.dictionary = new HashMap<>();
    }

    //что такое HashMap???

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
