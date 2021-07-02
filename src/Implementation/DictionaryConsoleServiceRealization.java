package Implementation;

import Entity.Dictionary;
import Services.DictionaryConsoleService;

import java.util.Map;

public class DictionaryConsoleServiceRealization implements DictionaryConsoleService {

@Override
    public void showDictionary(Dictionary dictionary){
    for (Map.Entry pair : Dictionary.getInstance().getDictionary().entrySet()) {
        System.out.println(pair);
    }
}






}
