import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String basePath = "D://Games/";
        FileUtils fileUtils = new FileUtils();
        
        ArrayList<String> directories = new ArrayList<>();
        directories.add(basePath + "src");
        directories.add(basePath + "res");
        directories.add(basePath + "savegames");
        directories.add(basePath + "temp");
        directories.add(basePath + "src/main");
        directories.add(basePath + "src/test");
        directories.add(basePath + "res/drawables");
        directories.add(basePath + "res/vectors");
        directories.add(basePath + "res/icons");
        
        ArrayList<String> files = new ArrayList<>();
        files.add(basePath + "src/main/Main.java");
        files.add(basePath + "src/main/Utils.java");
        files.add(basePath + "temp/temp.txt");
        
        for (String dir : directories) {
            fileUtils.createDirectory(dir);
        }
        
        for (String file : files) {
            fileUtils.createFile(file);
        }
        
        fileUtils.writeToFile(basePath + "temp/temp.txt", fileUtils.getLog());
    }
}
