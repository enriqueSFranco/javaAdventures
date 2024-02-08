package org.example;


import org.javafiles.CreateFile;
import org.javafiles.FileAccess;
import org.javafiles.TextFileWriter;

public class Main {
    public static void main(String[] args) {
        // ACCEDIENDO AUN ARCHIVO
        FileAccess fileAccess = new FileAccess("/Users/enriquesfranco/Desktop/dc_comics");
        //fileAccess.accessUniqueFile();
        //fileAccess.listFilesInDirectory();

        // CREANDO UN NUEVO ARCHIVO
        //CreateFile createFile = new CreateFile("/Users/enriquesfranco/Desktop/dc_comics/super_heroes.txt");
        //createFile.create();

        // ESCRIBIR EN UN ARCHIVO
        TextFileWriter textFileWriter = new TextFileWriter("/Users/enriquesfranco/Desktop/dc_comics/super_heroes.txt");
        textFileWriter.writeToMyFile("DC Comics");
    }
}