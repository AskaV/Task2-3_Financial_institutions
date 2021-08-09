package com.solvd.financialInstitutions;


import com.solvd.financialInstitutions.utils.*;
import com.solvd.financialInstitutions.utils.textAnalize.WorkWithText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;



public class Main {
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);

    public static void main(String[] args) throws IOException {
        BaseOfCollectionsAndMap newData = new BaseOfCollectionsAndMap();
        LOGGER.info("------------------------work with text in file------------------------");
        WorkWithText textW2 = new WorkWithText("src/main/java/com/solvd/financialInstitutions/utils/textAnalize");

        LOGGER.info("------------------------businessLogic------------------------");
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.start();

        int t;



        //        int[] unsMass = new int[]{20, 1, 19, 1, 14};
//        new myLinkedListGetAndAdd();
//        for (int i = 1; i < unsMass.length; i++) {
//            myLinkedListGetAndAdd.insert(new myLinkedListGetAndAdd(unsMass[i]));
//        }
    }
}
