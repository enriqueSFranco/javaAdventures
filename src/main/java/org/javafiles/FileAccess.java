package org.javafiles;

import java.io.File;

public class FileAccess {
    private String path;
    public  FileAccess(String path) {
        this.path = path;
    }

    public void accessUniqueFile() {
        String fname = this.path;
        File f = new File(fname);

        // aunque no exista el archivo si da la ruta absoluta
        System.out.println("File name: "+ f.getAbsolutePath());
        System.out.print("Existe: " + f.exists()); // verifica si existe el archivo y devuelve un boolean
    }

    public void listFilesInDirectory() {
        String fname = this.path;

        File f = new File(fname);
        String absolutePath = f.getAbsolutePath();
        String[] files = f.list(); // lista de archivos, directorios

        for (int i = 0; i < files.length; i++) { // recorremos la carpeta
            System.out.println("file_"+i+":"+files[i]);
            File current = new File(absolutePath, files[i]);
            if (current.isDirectory()) {
                System.out.println("Entrando a un nuevo directorio");
                String[] entries = current.list();
                for (int j = 0; j < entries.length; j++) {
                    System.out.print("file_"+i+":"+entries[j]);
                }
            } else {
                System.out.println("La ruta especificada no corresponde a un directorio");
            }
        }

    }
}
