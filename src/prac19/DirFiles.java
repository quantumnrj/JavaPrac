package prac19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirFiles {
    private String dirPath;
    public DirFiles(String directory){
        this.dirPath = directory;
    }
    public String getDirPath() {
        return dirPath;
    }
    public List<String> getDirectoryContent() {
        File directory = new File(getDirPath());
        File[] files = directory.listFiles();
        List<String> contentList = new ArrayList<>();

        if (files != null && files.length > 0) {
            for (File file : files) {
                contentList.add(file.getName());
            }
        }
        return contentList;
    }
}
