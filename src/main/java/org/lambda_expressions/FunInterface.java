package org.lambda_expressions;

public interface FunInterface {
    int operation (int x, int y);


    default void normalFun() {
        System.out.println("Hello");
    }
}
