package cn.az.java.basic.functional;

import java.io.File;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<File> predicate = file -> true;


    }
}
