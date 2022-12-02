package mst.decoder.shannon;

import mst.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input("/home/mst/IdeaProjects/tik/src/mst/decoder/shannon/files/input.txt");
        Decoder coder = new Decoder(input.getChars(), input.getProbability());
        for (Character character : coder.decrypt("100000010000101000")) {
            System.out.print(character);
        }
    }
}