package com.solvd.financialInstitutions.utils.textAnalize;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static org.apache.commons.lang3.StringUtils.isAnyEmpty;

public class WorkWithText {

    public WorkWithText(String fileURL) {
        textAnalize(fileURL);
    }

    private void textAnalize(String fileURL){
        String contents = null;
        try {
            contents = FileUtils.readFileToString(new File("src/main/java/com/solvd/financialInstitutions/utils/textAnalize/TextFI.txt"), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        contents = StringUtils.lowerCase(contents);
        //String[] array = ArrayUtils.toArray(contents.split("\\s|,"));
        List<String> listw = Arrays.asList(contents.split("\\s|,"));

        int sdflkds = 5;

        //Arrays.sort(array);
        //удалить пустые строки
        //boolean d = StringUtils.isAnyEmpty(array);
        // мапа слово - повторение
        //
        Map<String, Integer> WordValuePairs = CollectionUtils.getCardinalityMap(listw);
        //ArrayUtils.toMap(array);

        int wr = 5;
//        for (int i = 0; i < array.length; i++) {
//            if (StringUtils.isEmpty(array[i])){
//                continue;
//            }
//            boolean wInMap = WordValuePairs.containsKey(array[i]);
//            if (wInMap == false){
//                int countOfWord = StringUtils.countMatches(contents, " "+array[i]+" ");
//                //int countOfWord = ArrayUtils.contains(array, array[i]);
//                WordValuePairs.put(array[i], countOfWord);
//                i = i+countOfWord-1;
//            }
//
//        }
        int countWord = StringUtils.countMatches(contents, "the");
        System.out.println("\"the\" count: " + countWord);

        int sdflk = 5;
    }

    private void writingToFile(){

    }
}
