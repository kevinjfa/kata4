package es.software.ulpgc.kata4;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SQLTitleReader reader = new SQLTitleReader();
        List<Title> titles = reader.read();

        HashMap<Title.TitleType, Integer> histogram = new HashMap<>();
        for (Title t: titles) {
            histogram.put(t.getType(), histogram.getOrDefault(t.getType(), 0) + 1);
        }
        for (Title.TitleType t: histogram.keySet()) {
            System.out.println(t + " " + histogram.get(t));
        }

        for (Title.TitleType t: histogram.keySet()) {
            System.out.print(t);
            int value = histogram.get(t);
            if (value <= 1) {
                System.out.print("|");
            } else {
                for (int i = 0; i < value-1; i++) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
