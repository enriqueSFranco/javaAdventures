package org.javafiles;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    private String path;

    public CreateFile(String path) {
        this.path = path;
    }

    public void create() {
        File newFile = new File(this.path);
        String absolutePath = newFile.getAbsolutePath();

        try {
            newFile.createNewFile();
        } catch (IOException ioe) {
                ioe.printStackTrace();
        }
    }
}
