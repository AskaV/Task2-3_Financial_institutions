package com.solvd.financialInstitutions.utils.textAnalize;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WorkWithText {
    private Map<String, Integer> wordValuePairs;

    public WorkWithText(String fileURL) throws IOException {
            textAnalize(fileURL);
            writingToFile(fileURL);
    }
    private void textAnalize(String fileURL) throws IOException {
        //wordValuePairs = CollectionUtils.getCardinalityMap(FileUtils.readLines(new File(fileURL+ "/textAnalise/TextFI.txt"), "UTF-8"));
        String contents = StringUtils.lowerCase(FileUtils.readFileToString(new File(fileURL+ "/textAnalise/TextFI.txt"), "UTF-8"));
        wordValuePairs = CollectionUtils.getCardinalityMap(Arrays.asList(contents.split("[\"\\.,:;\\s]+")));
    }

    private void writingToFile(String fileURL) throws IOException {
        File myFile = new File(fileURL+ "/textAnalise/OutputFile.txt");
        if (myFile.exists()) myFile.delete();
        wordValuePairs.forEach((key, value) -> {
            try {
                FileUtils.writeStringToFile(myFile, key + " , " + value + "\n", "UTF-8", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
