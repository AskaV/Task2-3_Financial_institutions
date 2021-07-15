package com.solvd.financialInstitutions;

import com.solvd.financialInstitutions.utils.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * There are 3 base (abstract) classes from which the rest of the subclasses inherit:
 * Financial Institution (CFInInBase), Personnel (CStuffBase) and Clients (CClientsBase)
 *  Financial Institution (CFInInBase)
 *   1).CFInInBank,               Stuff (СStuffBase)      Clients (ClientsBse)
 *   2).CFinInInsurance,          1).CStuffDirector.      1) CClientsNaturalP.
 *   3).CFinInPensionFund,        2).CStuffCashier.       2) CClientsLegalP.
 *   4).CFinInStockExchange,      3).CStuffGuard.         3) CClientsGovernment.
 *   5).CFinInInvestmentCompany.  4).CStuffBooker.
 *   6).CFinInPopshop.
 *   7).CFinInDealer.
 *   8).CFinInBroker.
 *
 * Question - how much money can I get a loan from a financial institution? In what currency?
 */
public class Main {

    public static void main(String[] args) {


        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.start();

    }
}
