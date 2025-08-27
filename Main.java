import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        
        File gamesDir = new File("C://Games");
        if (gamesDir.mkdir()) {
            log.append("Директория Games создана успешно\n");
        } else {
            log.append("Ошибка создания директории Games\n");
        }
        
        File srcDir = new File("C://Games//src");
        if (srcDir.mkdir()) {
            log.append("Директория src создана успешно\n");
        } else {
            log.append("Ошибка создания директории src\n");
        }
        
        File resDir = new File("C://Games//res");
        if (resDir.mkdir()) {
            log.append("Директория res создана успешно\n");
        } else {
            log.append("Ошибка создания директории res\n");
        }
        
        File savegamesDir = new File("C://Games//savegames");
        if (savegamesDir.mkdir()) {
            log.append("Директория savegames создана успешно\n");
        } else {
            log.append("Ошибка создания директории savegames\n");
        }
        
        File tempDir = new File("C://Games//temp");
        if (tempDir.mkdir()) {
            log.append("Директория temp создана успешно\n");
        } else {
            log.append("Ошибка создания директории temp\n");
        }
        
        File mainDir = new File("C://Games//src//main");
        if (mainDir.mkdir()) {
            log.append("Директория main создана успешно\n");
        } else {
            log.append("Ошибка создания директории main\n");
        }
        
        File testDir = new File("C://Games//src//test");
        if (testDir.mkdir()) {
            log.append("Директория test создана успешно\n");
        } else {
            log.append("Ошибка создания директории test\n");
        }
        
        File mainJavaFile = new File("C://Games//src//main//Main.java");
        try {
            if (mainJavaFile.createNewFile()) {
                log.append("Файл Main.java создан успешно\n");
            } else {
                log.append("Ошибка создания файла Main.java\n");
            }
        } catch (IOException e) {
            log.append("Ошибка создания файла Main.java: ").append(e.getMessage()).append("\n");
        }
        
        File utilsJavaFile = new File("C://Games//src//main//Utils.java");
        try {
            if (utilsJavaFile.createNewFile()) {
                log.append("Файл Utils.java создан успешно\n");
            } else {
                log.append("Ошибка создания файла Utils.java\n");
            }
        } catch (IOException e) {
            log.append("Ошибка создания файла Utils.java: ").append(e.getMessage()).append("\n");
        }
        
        File drawablesDir = new File("C://Games//res//drawables");
        if (drawablesDir.mkdir()) {
            log.append("Директория drawables создана успешно\n");
        } else {
            log.append("Ошибка создания директории drawables\n");
        }
        
        File vectorsDir = new File("C://Games//res//vectors");
        if (vectorsDir.mkdir()) {
            log.append("Директория vectors создана успешно\n");
        } else {
            log.append("Ошибка создания директории vectors\n");
        }
        
        File iconsDir = new File("C://Games//res//icons");
        if (iconsDir.mkdir()) {
            log.append("Директория icons создана успешно\n");
        } else {
            log.append("Ошибка создания директории icons\n");
        }
        
        File tempFile = new File("C://Games//temp//temp.txt");
        try {
            if (tempFile.createNewFile()) {
                log.append("Файл temp.txt создан успешно\n");
            } else {
                log.append("Ошибка создания файла temp.txt\n");
            }
        } catch (IOException e) {
            log.append("Ошибка создания файла temp.txt: ").append(e.getMessage()).append("\n");
        }
        
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(log.toString());
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
