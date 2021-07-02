import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyProgramm {
   // public static void main(String[] args) throws IOException {
        /*HashMap<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int key = 5;
        while (key != 0) {
            System.out.println("введите команду: ");
            key = scanner.nextInt();
            switch (key) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("введите английское слово: ");
                    String englishWord = scanner.nextLine();
                    System.out.println("введите русское слово: ");
                    String russianWord = scanner.nextLine();

                    dictionary.put(englishWord, russianWord);
                    for (Map.Entry a : dictionary.entrySet()) {
                        System.out.println(a);

                    }
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    for (Map.Entry a : dictionary.entrySet()) {
                        System.out.println(a);
                        //break;
                    }
                    break;
                }
                //System.out.println("введите key или завершите работе нажав 0");
                //key = scanner.nextInt();
            }

        }


        //dictionary.put("word", "слово");
        //dictionary.put("hello", "привет");
        //dictionary.entrySet();
        // System.out.println(dictionary.size());

        // FileWriter list = new FileWriter("MyDictionary.txt");


        //for(Map.Entry a : dictionary.entrySet()) {
        //    System.out.println(dictionary.values());
        //System.out.print(a.getKey() + ": ");
        // System.out.println(a.getValue());
        // }

        //Scanner scanner = new Scanner(System.in);
        //String data = scanner.nextLine();
        // Integer index = data.indexOf(" ");
        //String englishWord = data.substring(0,index);
        //String russianWord = data.substring(index+1);
        //System.out.print("английское слово - " + englishWord + " - перевод на русский - ");
        //System.out.println(russianWord);

*/

public static void main(String[] args){

  /*  Map<String ,String > dict = new HashMap<>();
    dict.put("Hello" , "privet");
    dict.put("Bye" , "poka");
    dict.put("Apple" , "yabloko");

//    for(Map.Entry pair : dict.entrySet()){
//        if(pair.getKey() == "apple"){
//            dict.remove(pair.getKey());
//        }
//    }

    Iterator iterator = dict.entrySet().iterator();
    while(iterator.hasNext()){
        Map.Entry<String , String> pair = (Map.Entry<String, String>) iterator.next();
        if(pair.getKey() == "Bye"){
            iterator.remove();
        }
    }
    iterator = dict.entrySet().iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
*/

  HashMap<String, Integer> x = new HashMap<>();
  x.put("hello", 12);
  x.put("cat", 50);
  x.put("dog", 40);
  Iterator iterator = x.entrySet().iterator();
  while(iterator.hasNext()) {
    // System.out.println(iterator.next());
    Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) iterator.next();

    if (pair.getValue() == 50) {
      iterator.remove();
    }
    //System.out.println(iterator.next());
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }
















    }
}
