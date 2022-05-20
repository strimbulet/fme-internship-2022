/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads text from a file and prints out the third most frequent word(s)
 * in the text. If there is more than one word they will all be printed. 
 * 
 * The text contains only alpha-numerical characters and spaces, 
 * and words are delimited by one or more spaces.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input: test.in
 *      
 *       test1 test2 test3 test1 test test2 test2
 *       test1 test3 test1 test test0
 *       
 *  Output:
 *      test3, test
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Strimbu Darius
 * @email strimbudarius@gmail.com
 * 
 */
public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> text = new HashMap<>();
// citim din fisier si adaugam intr-un hashmap toate stringurile si aparitiile lor
        try {
            File myObj = new File("C:\\Users\\Darius\\Desktop\\internship\\fme-internship-2022\\test-internship-p2\\src\\test.in");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                var words = data.split(" ");
                for(var word : words){
                    if(text.containsKey(word)){
                        text.put(word,text.get(word) + 1);
                    }else{
                        text.put(word,1);
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int third = -1,second = -1,first = -1; // avem 3 variabile si in variabila third o sa avem al 3 numar de aparitii al stringurilor
        int i = 0; // variabila ce ne ajuta sa initializam cele 3 variabile
        for(String key : text.keySet()){
           if(text.get(key) > first && i == 0){
               first = text.get(key);  // prima data doar first il initializam
           }
            if(text.get(key) > first && i == 1){
                second = first;
                first = text.get(key); // first si second la a doua iteratie

            }
            if(text.get(key) > first && i >= 2){
                third = second;
                second = first;
                first = text.get(key); // cand i > 2 le modificam pe toate
            }
            i++;
        }

        for(String key : text.keySet()){
            if(text.get(key).equals(third)){
                System.out.println(key);
            } // pargurcem hashmap-ul si afisam toate stringurile care au valoare egala cu third
        }

        System.out.println("FME Internship - Test2");
    }
}