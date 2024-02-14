package org.java_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
    private String path;

    public TextFileWriter(String path) {
        this.path = path;
    }

    public void writeToMyFile(String content) {
        File fileName = new File(this.path);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.print("Successfully written data to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
