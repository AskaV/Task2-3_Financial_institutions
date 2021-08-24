package com.solvd.financialInstitutions.utils.threads;

import com.solvd.financialInstitutions.utils.BusinessLogic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Connection {//method just LOG information
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);

    public Connection(){
    }
//they are used in the class Threads as  Method m = Connection.class.getDeclaredMethod
    private void open(String open){
    LOGGER.info(open);
}
    private void pingBD(String pingBDTest){
        LOGGER.info(pingBDTest);
    }
    private void authBD(String authBD){
        LOGGER.info(authBD);
    }
    private void infoBD(String infoBD){
        LOGGER.info(infoBD);
    }
    private void executeQuery(String executeQuery){//can call by threads
        LOGGER.info(executeQuery);
    }
    private void close(String close){
        LOGGER.info(close);
    }

}
