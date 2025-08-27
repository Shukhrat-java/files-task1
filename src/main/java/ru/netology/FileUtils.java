import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtils {
    private StringBuilder log = new StringBuilder();
    
    public boolean createDirectory(String path) {
        File dir = new File(path);
        boolean result = dir.mkdir();
        if (result) {
            log.append("Директория создана: ").append(path).append("\n");
        } else {
            log.append("Ошибка создания директории: ").append(path).append("\n");
        }
        return result;
    }
    
    public boolean createFile(String path) {
        File file = new File(path);
        try {
            boolean result = file.createNewFile();
            if (result) {
                log.append("Файл создан: ").append(path).append("\n");
            } else {
                log.append("Ошибка создания файла: ").append(path).append("\n");
            }
            return result;
        } catch (IOException e) {
            log.append("Ошибка при создании файла ").append(path).append(": ").append(e.getMessage()).append("\n");
            return false;
        }
    }
    
    public void writeToFile(String path, String content) {
        try (java.io.FileWriter writer = new java.io.FileWriter(path)) {
            writer.write(content);
            log.append("Запись в файл выполнена: ").append(path).append("\n");
        } catch (IOException e) {
            log.append("Ошибка записи в файл ").append(path).append(": ").append(e.getMessage()).append("\n");
        }
    }
    
    public String getLog() {
        return log.toString();
    }
}
