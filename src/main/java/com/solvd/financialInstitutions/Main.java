package com.solvd.financialInstitutions;

import com.solvd.financialInstitutions.utils.*;
import com.solvd.financialInstitutions.utils.textAnalize.WorkWithText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);

    public static void main(String[] args) {
        LOGGER.info("------------------------work with text in file------------------------");
        //WorkWithText textW = new WorkWithText("Tanda_proj/src/main/java/com/solvd/financialInstitutions/utils/textAnalize/FinInstText.txt");
        WorkWithText textW2 = new WorkWithText("src/main/java/com/solvd/financialInstitutions/utils/TextAnalize.txt");

        LOGGER.info("------------------------businessLogic------------------------");
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.start();

//        int[] unsMass = new int[]{20, 1, 19, 1, 14};
//        new myLinkedListGetAndAdd();
//        for (int i = 1; i < unsMass.length; i++) {
//            myLinkedListGetAndAdd.insert(new myLinkedListGetAndAdd(unsMass[i]));
//        }
    }
}
