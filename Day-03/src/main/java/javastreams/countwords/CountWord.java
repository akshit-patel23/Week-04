package javastreams.countwords;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CountWord {
    public static void readWrite(String path, Map<String, Integer> m1) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Words ko split karega (space, tab, newline se)
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        m1.put(word, m1.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading the file", e);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(m1.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sorting by count (desc)

        System.out.println("Top 5 Words:");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) { // Sirf 5 words print karega
            System.out.println(sortedList.get(i).getKey() + " = " + sortedList.get(i).getValue());
        }
    }
}
