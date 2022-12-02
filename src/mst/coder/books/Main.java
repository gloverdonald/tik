package mst.coder.books;

import mst.Input;
import mst.converter.bw.Converter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input("/home/mst/IdeaProjects/tik/src/mst/coder/books/files/input.txt");
        Converter converter = new Converter("baadaade");
        Coder coder = new Coder(input.getChars());
        String result = "";
        for (Integer integer : coder.encrypt(converter.getMessage())) {
            result = result.concat(integer.toString());
        }
        System.out.println(result);
        System.out.println(converter.getPosition());
    }
}
