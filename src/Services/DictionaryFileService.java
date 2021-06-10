package Services;
import Entity.Dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DictionaryFileService {
    void saveToFile(String pathFile, Dictionary dictionary) throws IOException;
    void readFromFile(String pathFile , Dictionary dictionary) throws FileNotFoundException;
}
