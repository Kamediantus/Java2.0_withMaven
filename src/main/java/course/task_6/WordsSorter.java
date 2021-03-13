package course.task_6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordsSorter {
    public static void main(String[] args) {

        try {

            //open file
            BufferedReader br = new BufferedReader (new FileReader("./src/main/resources/input.txt"));
            String fullLine = br.readLine();
            System.out.println("Full text from file: " + fullLine);

            //create list of words and split line from file
            List<String> listOfWords = new ArrayList<String>();
            listOfWords =  Arrays.asList(fullLine.split("\\s"));

            //create lest of quantities and add elements
            List<Integer> quantityOfWords = new ArrayList<Integer>();
            for (int i = 0; i < listOfWords.size(); i++){
                quantityOfWords.add(0);
            }

            //sort list
            Collections.sort(listOfWords);

            //calc quantity for each word
            String previousWord = listOfWords.get(0);
            for (String word : listOfWords) {
                int counter = 1;
                for (String checkedWords: listOfWords){
                    if (word.equals(checkedWords)){
                        counter++;
                    }
                }
                previousWord = word;
                quantityOfWords.set(listOfWords.indexOf(word), counter - 1);
            }

            //display quantity of each word and find word with max quantity
            int maxQuantity = 0;
            String wordThoseQuantityMax = "";
            for (int i = 0; i < listOfWords.size(); i ++ ){
                System.out.printf("Word: \"%s\", quantity: %d\n", listOfWords.get(i), quantityOfWords.get(i));
                if (quantityOfWords.get(i) > maxQuantity) {
                    maxQuantity = quantityOfWords.get(i);
                    wordThoseQuantityMax = listOfWords.get(i);
                }
                i +=quantityOfWords.get(i) - 1;
            }
            System.out.printf("Max quantity has: \"%s\" and it is %d", wordThoseQuantityMax, maxQuantity);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
