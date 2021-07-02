package Implementation;

import Entity.Dictionary;
import Services.MenuFunction;
import com.sun.corba.se.impl.transport.CorbaContactInfoListIteratorImpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Menu implements MenuFunction {
  Dictionary dictionary = Dictionary.getInstance();
  public void realization() {
      int key;

      System.out.println("print 1 to add new pair\n" +
              "print 2 to show all\n"
              + "print 3 to search\n" +
              "print 0 to break\n");
      Scanner scanner = new Scanner(System.in);
      key = 5;
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
                  add(englishWord, russianWord);

                  break;
              }

              case 2: {
                  showAllWords();
                  break;
              }

              case 3: {
                  scanner.nextLine();
                  System.out.println("print word = ");
                  String word = scanner.nextLine();
                  search(word);
                  break;
              }

              case 4:{
                  System.out.println("DOWNLOAD");
                  DictionaryFileServiceRealization download = new DictionaryFileServiceRealization();
                  try{
                      download.saveToFile("/home/dmitriy/Рабочий стол/dict.txt",dictionary);
                  }
                  catch (Exception e){
                      System.out.println(e.getMessage());
                  }
                  break;
              }
              case 5:{
                  DictionaryFileServiceRealization download = new DictionaryFileServiceRealization();
                  scanner.nextLine();
                  String path = scanner.nextLine();
                  try {
                      download.readFromFile(path , dictionary);
                  }
                  catch (Exception e){
                      System.out.println(e.getMessage());
                  }
                  break;
              }
              case 6:{
                  scanner.nextLine();
                  System.out.println("Введите слово(английское) из пары которую хотите удалить: ");
                  String word = scanner.nextLine();
                  delete(word);
                  break;
              }

          }
          System.out.println("print 1 to add new pair\n" +
                  "print 2 to show all\n"
                  + "print 3 to search\n" +
                  "print 0 to break\n"
          );
      }
  }





    @Override
    public void delete(String englishWord) {
         DictionaryServiceRealization delete = new DictionaryServiceRealization(dictionary);
                          delete.deletePairWord(englishWord);
    }
    @Override
    public void add(String wordEnglish, String wordRussian) {
      DictionaryServiceRealization addPair = new DictionaryServiceRealization(dictionary);
      addPair.addPairWord(wordEnglish, wordRussian);
      addPair.addPairWordsWithInteger(wordEnglish, 0);
    }

    @Override
    public void showAllWords() {
         DictionaryServiceRealization a = new DictionaryServiceRealization(dictionary);
         a.show(dictionary);
        Iterator iterator = dictionary.getPairCount().entrySet().iterator();
        Iterator iteratorTwo = dictionary.getDictionary().entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String ,Integer > pair = (Map.Entry<String, Integer>) iterator.next();
            iteratorTwo.next();
            if ((Integer)pair.getValue() ==4 ) {
                iteratorTwo.remove();
                iterator.remove();
            }
        }
        for(Map.Entry pair : dictionary.getDictionary().entrySet()){
           for(Map.Entry pai : Dictionary.getPairCount().entrySet()){
               if(pair.getKey() == pai.getKey()) {
                   dictionary.getPairCount().replace((String) pair.getKey(), ((Integer) dictionary.getPairCount().get(pair.getKey())) + 1);
               }
            }

        }
    }
    @Override
      public void search(String word) {
      DictionarySearchRealizacion dictionarySearchRealizacion = new DictionarySearchRealizacion();
      dictionarySearchRealizacion.searchWord(word, dictionary);
    }
}
