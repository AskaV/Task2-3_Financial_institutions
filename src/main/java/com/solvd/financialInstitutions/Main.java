package com.solvd.financialInstitutions;

import com.solvd.financialInstitutions.clients.ClientsGovernment;
import com.solvd.financialInstitutions.clients.ClientsNaturalP;
import com.solvd.financialInstitutions.utils.*;
import com.solvd.financialInstitutions.utils.textAnalize.WorkWithText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);

    public static void main(String[] args) throws IOException {
        BaseOfCollectionsAndMap newData = new BaseOfCollectionsAndMap();
        LOGGER.info("------------------------work with text in file------------------------");
        WorkWithText textW2 = new WorkWithText("src/main/java/com/solvd/financialInstitutions/utils/textAnalize");

        LOGGER.info("------------------------businessLogic------------------------");
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.start();




        LOGGER.info("------------------------creating classes by reflection------------------------");
        ClientsNaturalP naturalP2 = new ClientsNaturalP();

        String sexOfPerson = null;
        int clientAge = 0;
        String clientName = null;
        try {
            Field field = naturalP2.getClass().getDeclaredField("sexOfPerson");
            field.setAccessible(true);
            field.set(naturalP2, (String) "new value of sexOfPerson");
            sexOfPerson = (String) field.get(naturalP2);
            Field field1 = naturalP2.getClass().getDeclaredField("clientAge");
            field1.setAccessible(true);
            field1.set(naturalP2, (Integer) newData.getRandomAge());
            clientAge = (Integer) field1.get(naturalP2);
            Field field2 = naturalP2.getClass().getDeclaredField("clientName");  //does not work
            field2.setAccessible(true);                                                //how to access a base class variable??
            field2.set(naturalP2, (String) newData.getRandomName());                   //does not work
            clientName = (String) field2.get(naturalP2);                               //does not work


        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        naturalP2.toString();

        //        int[] unsMass = new int[]{20, 1, 19, 1, 14};
//        new myLinkedListGetAndAdd();
//        for (int i = 1; i < unsMass.length; i++) {
//            myLinkedListGetAndAdd.insert(new myLinkedListGetAndAdd(unsMass[i]));
//        }
    }
}
