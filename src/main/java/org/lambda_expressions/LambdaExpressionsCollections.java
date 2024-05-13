package org.lambda_expressions;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionsCollections {
    public void sortList(List<Integer> collection) {

        System.out.println(STR."Elementos antes de ordenarlos \{collection}");

        Collections.sort(collection, (a, b) -> a > b ? -1 : a < b ? 1 : 0);

        System.out.print(STR."Elementos despues de ordenarlos \{collection}");
    }
}
