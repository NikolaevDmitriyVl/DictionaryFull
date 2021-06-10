import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyProgramm {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("word", "слово");
        dictionary.put("hello", "привет");

        FileWriter list = new FileWriter("MyDictionary.txt");



        for(Map.Entry a : dictionary.entrySet()) {

            //System.out.print(a.getKey() + ": ");
            System.out.println(a.getValue());
        }



    }
}
