package Implementation;

import Entity.Dictionary;
import Services.DictionaryFileService;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class DictionaryFileServiceRealization implements DictionaryFileService {
    //Dictionary dictionary;
    @Override
    public void saveToFile(String pathFile, Dictionary dictionary) throws IOException {
        File file = new File("file.txt");
        FileWriter fileWriter = new FileWriter(file);
        for (Map.Entry pair : dictionary.getDictionary().entrySet()) {
            fileWriter.write(pair.toString());
        }
    }
    @Override
    public void readFromFile(String pathFile, Dictionary dictionary) throws FileNotFoundException {

            FileReader fileReader = new FileReader(pathFile);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
        }

    }







}
