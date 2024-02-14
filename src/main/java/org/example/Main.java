package org.example;

import javax.swing.*;

import org.graphics_applications.App;

public class Main {

    /*private int operate(int a, int b, FunInterface func) {
        return func.operation(a, b);
    }*/

    public static void main(String[] args) {
        // obtenemos todos los nombres de las fuentes del sistema
//        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//
//        for (String fontName : fontNames) {
//            System.out.println(fontName);
//        }
        SwingUtilities.invokeLater(() -> {
            App app = new App();
            app.setVisible(true);
        });

        /*
        FunInterface add = (int x, int y) -> x + y;
        FunInterface multiply = (int a, int b) -> a * b;

        Main obj = new Main();
        System.out.println(STR."Addition is \{obj.operate(6, 3, add)}");
        System.out.println(STR."Addition is \{obj.operate(6, 3, multiply)}");

        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(11);
        collection.add(19);
        collection.add(12);
        collection.add(13);
        collection.add(14);

        LambdaExpressionsCollections lambdaExpressionsCollections = new LambdaExpressionsCollections();
        lambdaExpressionsCollections.sortList(collection);
        */

        // ACCEDIENDO AUN ARCHIVO
        //FileAccess fileAccess = new FileAccess("/Users/enriquesfranco/Desktop/dc_comics");
        //fileAccess.accessUniqueFile();
        //fileAccess.listFilesInDirectory();

        // CREANDO UN NUEVO ARCHIVO
        //CreateFile createFile = new CreateFile("/Users/enriquesfranco/Desktop/dc_comics/super_heroes.txt");
        //createFile.create();

        // ESCRIBIR EN UN ARCHIVO
        //TextFileWriter textFileWriter = new TextFileWriter("/Users/enriquesfranco/Desktop/dc_comics/super_heroes.txt");
        //textFileWriter.writeToMyFile("DC Comics");
    }
}