package net.roy.codegenerator.orm;

import net.roy.codegenerator.orm.model.jpa.Constants;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roy on 2016/2/10.
 */
public class Test {
    public static void main(String[] args){
        Set<String> testSet=new HashSet<>();
        testSet.add("lala");
        testSet.add("haha");
        testSet.add("int");
        testSet.add("boolean");
        printSet(testSet);

        System.out.println();

        testSet.removeAll(Constants.PRIMITIVE_TYPES);
        printSet(testSet);
    }

    private static void printSet(Set<String> testSet) {
        for (String str:testSet) {
            System.out.println(str);
        }
    }
}
