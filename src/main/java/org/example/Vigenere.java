package org.example;

import java.util.List;
import java.util.Locale;

public class Vigenere {

    private static final List<String> list = List.of(
            "A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
    );

    private String key_word;

    public Vigenere(String k_w) {
        this.key_word = k_w;
    }

    public String Encrypt(String w) {

        String result = "";
        int key_index = 0;
        int shift;

        char key_car;

        char[] tmp_array = w.toUpperCase().toCharArray();
        char[] key_array = key_word.toUpperCase().toCharArray();

        for (int i = 0; i < tmp_array.length; i++) {

            if (!list.contains(String.valueOf(tmp_array[i]))) {
                result = result + tmp_array[i];
            } else {
                key_car = key_array[key_index % key_array.length];
                shift = list.indexOf(String.valueOf(key_car));

                int indice = list.indexOf(String.valueOf(tmp_array[i]));
                result += list.get((indice + shift) % list.size());

                key_index += 1;
            }
        }

        return result;
    }

    public String Decrypt(String w) {

        String result = "";
        int key_index = 0;
        int shift;

        char key_car;

        char[] tmp_array = w.toUpperCase().toCharArray();
        char[] key_array = key_word.toUpperCase().toCharArray();

        for (int i = 0; i < tmp_array.length; i++) {

            if (!list.contains(String.valueOf(tmp_array[i]))) {
                result = result + tmp_array[i];
            } else {
                key_car = key_array[key_index % key_array.length];
                shift = list.indexOf(String.valueOf(key_car));

                int indice = list.indexOf(String.valueOf(tmp_array[i]));
                result += list.get((indice - shift + list.size()) % list.size());

                key_index += 1;
            }
        }

        return result;
    }
}
