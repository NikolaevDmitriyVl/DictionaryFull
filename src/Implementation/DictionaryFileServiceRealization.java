package Implementation;

import Entity.Dictionary;
import Services.DictionaryFileService;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class DictionaryFileServiceRealization implements DictionaryFileService {
    @Override
    public void saveToFile(String pathFile, Dictionary dictionary) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        System.out.println("size = " + dictionary.getDictionary().entrySet());
        for (Map.Entry pair : dictionary.getDictionary().entrySet()) {
            fileWriter.write(pair.toString() + "\n");
        }
        fileWriter.close();
    }
    @Override
    public void readFromFile(String pathFile, Dictionary dictionary) throws FileNotFoundException {

            FileReader fileReader = new FileReader(pathFile);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()){
                String pair = scanner.nextLine();
                int index = pair.indexOf("=");
                if (index==-1) continue;
                String english = pair.substring(0,index);
                String russian = pair.substring(index+1);
                dictionary.getDictionary().put(english, russian);
                dictionary.getPairCount().put(english , 0);
        }
            try {
                fileReader.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }







}
