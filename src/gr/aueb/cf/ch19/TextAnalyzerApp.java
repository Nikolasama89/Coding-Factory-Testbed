package gr.aueb.cf.ch19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**  Αναπτύξτε μία εφαρμογή που να μπορεί να
    διαβάζει χαρακτήρα-χαρακτήρα ένα αρχείο
    κειμένου και να εισάγει τους χαρακτήρες σε
    μία λίστα διπλής κατεύθυνσης (π.χ.
    LinkedList)
    • Στη συνέχεια να εξάγει στατιστικά στοιχεία
    για κάθε χαρακτήρα, όπως η συχνότητα
    εμφάνισης, ταξινομημένη 1) ανά χαρακτήρα
    ascending και 2) ανά ποσοστό descending
 *
 */

public class TextAnalyzerApp {

    public static void main(String[] args) {
        LinkedList<Character> file = readFileToList("C:\\Users\\niqos\\Desktop\\testing.txt");
        Map<Character, Integer> freqMap = countCharacters(file);
        sortedCharacters(freqMap);
        System.out.println();
        sortedByFrequency(freqMap);

    }

    /**
     * Returns a list with the characters of the input file
     * @param file  the input file
     * @return  a list of characters
     */
    public static LinkedList<Character> readFileToList (String file) {
        LinkedList<Character> list = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = Character.toLowerCase((char) c);
                if (!Character.isWhitespace(character)) {
                    list.add(character);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Map<Character, Integer> countCharacters(LinkedList<Character> list) {
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        for (char character : list) {
            if (frequencyMap.containsKey(character)) {
                frequencyMap.put(character, frequencyMap.get(character) + 1);
            } else {
                frequencyMap.put(character, 1);
            }
        }
//        frequencyMap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
//                .forEach(System.out::println);

        return frequencyMap;
    }

    /**
     * Returns sorted Map by characters ascending.
     * @param freqMap the input map to sort
     */
    public static void sortedCharacters(Map<Character, Integer> freqMap) {
        freqMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

    /**
     * Returns the map in descending order
     * @param freqMap the input map to sort
     */
    public static void sortedByFrequency(Map<Character, Integer> freqMap) {
        freqMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
