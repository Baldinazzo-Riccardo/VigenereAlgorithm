package org.example;
import java.util.List;


List<String> list = List.of("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");


public class Vigenere {
    String key_word;

    public Vigenere(String k_w){
        this.key_word = k_w;
    }

    public String Encrypt(String w){

        String result = "";
        int key_index = 0;
        int shift;

        char key_car;

        char[] tmp_array = w.toCharArray();
        char[] key_array = key_word.toCharArray();

        for (int i = 0; i < tmp_array.length; i++){
            if (!list.contains(String.valueOf(tmp_array[i]))) {
                result = result + tmp_array[i];
            }
            else{
                key_car = key_array[key_index % key_array.length];
                shift = list.indexOf(String.valueOf(key_car));
                result += tmp_array[list.indexOf(String.valueOf(tmp_array[i])) + shift];
                key_index += 1;
            }

        }

        return result;
    }

    public String Decrypt(String w){

        String result = "";
        int key_index = 0;
        int shift;

        char key_car;

        char[] tmp_array = w.toCharArray();
        char[] key_array = key_word.toCharArray();

        for (int i = 0; i < tmp_array.length; i++){
            if (!list.contains(String.valueOf(tmp_array[i]))) {
                result = result + tmp_array[i];
            }
            else{
                key_car = key_array[key_index % key_array.length];
                shift = list.indexOf(String.valueOf(key_car));
                result += tmp_array[list.indexOf(String.valueOf(tmp_array[i])) - shift];
                key_index += 1;
            }

        }

        return result;
    }
}
