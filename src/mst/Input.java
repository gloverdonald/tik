package mst;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Input {
    private final List<Character> chars;
    private final List<Double> probability;

    public Input(String path) {
        chars = new ArrayList<>();
        probability = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String strCurrentLine;

            strCurrentLine = bufferedReader.readLine();
            for (String s : strCurrentLine.split("\\s")) {
                chars.add(s.charAt(0));
            }
            if ((strCurrentLine = bufferedReader.readLine()) != null) {
                for (String s : strCurrentLine.replaceAll(",", ".").split("\\s")) {
                    probability.add(Double.parseDouble(s));
                }
            }
        } catch (Exception e) {
            System.out.println("Not found " + e.getMessage());
        }
    }

    public List<Character> getChars() {
        return chars;
    }

    public List<Double> getProbability() {
        return probability;
    }


}