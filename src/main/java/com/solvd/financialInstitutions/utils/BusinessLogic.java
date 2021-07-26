package com.solvd.financialInstitutions.utils;

import com.solvd.financialInstitutions.clients.ClientsBase;
import com.solvd.financialInstitutions.clients.ClientsGovernment;
import com.solvd.financialInstitutions.clients.ClientsLegalP;
import com.solvd.financialInstitutions.clients.ClientsNaturalP;
import com.solvd.financialInstitutions.finInst.*;
import com.solvd.financialInstitutions.staff.StaffBooker;
import com.solvd.financialInstitutions.staff.StaffCashier;
import com.solvd.financialInstitutions.staff.StaffDirector;
import com.solvd.financialInstitutions.staff.StaffGuard;
import com.solvd.financialInstitutions.utils.generics.ClientsGeneric;
import com.solvd.financialInstitutions.utils.interfaces.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * There are 3 base (abstract) classes from which the rest of the subclasses inherit:
 * Financial Institution (CFInInBase), Personnel (CStuffBase) and Clients (CClientsBase)
 * Financial Institution (CFInInBase)
 * 1).CFInInBank,               Stuff (СStuffBase)      Clients (ClientsBse)
 * 2).CFinInInsurance,          1).CStuffDirector.      1) CClientsNaturalP.
 * 3).CFinInPensionFund,        2).CStuffCashier.       2) CClientsLegalP.
 * 4).CFinInStockExchange,      3).CStuffGuard.         3) CClientsGovernment.
 * 5).CFinInInvestmentCompany.  4).CStuffBooker.
 * 6).CFinInPopshop.
 * 7).CFinInDealer.
 * 8).CFinInBroker.
 * <p>
 * Question - how much money can I get a loan from a financial institution? In what currency?
 */

public class BusinessLogic {
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);


    public void start() {
        //Init FInIn
        FInInBank bank1 = new FInInBank(14000, "Kotobank", "UAH", true, 600);
        FInInBank bank2 = new FInInBank(14000, "Kotobank", "UAH", true, 600);
        FinInInsurance insurance1 = new FinInInsurance(998, "Insurance", "EUR", false);
        FinInPensionFund pensionFund1 = new FinInPensionFund(999, "Пенсионеры и пенсионерочки", "UAH", false, "Butterfly");
        FinInStockExchange stockExchange1 = new FinInStockExchange(1000, "nStockExchange", "EUR", false, "www.URL.com");
        FinInInvestmentCompany investmentCompany1 = new FinInInvestmentCompany(1001, "Investment Co", "EUR", false, "Petya");
        FinInPopshop popShop1 = new FinInPopshop(1002, "Finik", "EUR", false, "Галочка");
        FinInDealer dealer1 = new FinInDealer(1003, "Dillik", "USD", false, "multy");
        FinInBroker broker1 = new FinInBroker(1004, "Brokik", "EUR", false, "mini");
        //Init Staff
        StaffGuard guard1 = new StaffGuard("Vasya", 44, 1100, 404);
        StaffDirector director1 = new StaffDirector("Durik", 20, 1000000, "Government", guard1);
        StaffCashier cashier1 = new StaffCashier("Karina", 19, 1000, "Mazda");
        StaffBooker booker1 = new StaffBooker("Marina", 48, 1200, "Kek");
        //Init Clients
        ClientsNaturalP naturalP1 = new ClientsNaturalP("Marik", 20, "Male", 35);
        ClientsLegalP legalLp1 = new ClientsLegalP("\"OOO Company\"", 10000, "Kyiv, Khreshchatyk 4");
        ClientsGovernment government1 = new ClientsGovernment("Government", 1000000000, 20, 1900);

        //All created class to Loger
        LOGGER.info("------------------------All created class to Loger------------------------");
        LOGGER.info("Create new Financial Institute: " + bank1.toString());
        LOGGER.info("Create new Financial Institute: " + bank2.toString());
        LOGGER.info("Create new Financial Institute: " + insurance1.toString());
        LOGGER.info("Create new Financial Institute: " + pensionFund1.toString());
        LOGGER.info("Create new Financial Institute: " + stockExchange1.toString());
        LOGGER.info("Create new Financial Institute: " + investmentCompany1.toString());
        LOGGER.info("Create new Financial Institute: " + popShop1.toString());
        LOGGER.info("Create new Financial Institute: " + dealer1.toString());
        LOGGER.info("Create new Financial Institute: " + broker1.toString());
//      Imitation of the program crash and checking of writing logs to a file
//        ClientsGovernment government2 = null;
//        government2.getClientBaseMoney();
        LOGGER.info("Create new Staff: " + guard1.toString());
        LOGGER.info("Create new Staff: " + director1.toString());
        LOGGER.info("Create new Staff: " + cashier1.toString());
        LOGGER.info("Create new Staff: " + booker1.toString());
        LOGGER.info("Create new Client: " + naturalP1.toString());
        LOGGER.info("Create new Client: " + legalLp1.toString());
        LOGGER.info("Create new Client: " + government1.toString());

        //Exceptions examples
//        StaffBooker booker2 = new StaffBooker("Marina", -10, 1200, "Kek");
//        StaffBooker booker3 = new StaffBooker("Marina", 2, 1200, "Kek");
//        StaffBooker booker4 = new StaffBooker("Marina", 85, 1200, "Kek");
//        StaffBooker booker5 = new StaffBooker("", 25, 1200, "Kek");
//        StaffBooker booker6 = new StaffBooker("Marinasdfsdfwefrwerwerscvsxzfsd", 25, 1200, "Kek");


        //Question - how much money can I get a loan from a financial institution? In what currency?
        LOGGER.info("------------------------my question------------------------");

        naturalP1.takeLoanFromCashier(cashier1, bank1, naturalP1);
        LOGGER.info("------------------------my question------------------------");


        //Other class interaction examples
        LOGGER.info("------------------------Other class interaction examples------------------------");
        pensionFund1.rCreditPossibility();
        cashier1.askFinInstitutesForLonn(insurance1);
        bank1.rCreditPossibility();
        guard1.askAboutCredit();
        director1.trySoSpeak(naturalP1);
        director1.trySoSpeak(government1);
        booker1.giveSalarytoStuff(1, cashier1);
        booker1.giveSalarytoStuff(1, booker1);
        booker1.giveSalarytoStuff(2, cashier1);
        legalLp1.payForPurchases(500, government1);
        insurance1.pTarifyPaket();
        investmentCompany1.pCompanyDirector();
        dealer1.sReqvPopshop(popShop1);
        broker1.sReqv(stockExchange1);
        broker1.sReqv(investmentCompany1);


        //toString() examples
        LOGGER.info("------------------------toString() examples------------------------");
        LOGGER.info(bank1.toString());
        LOGGER.info(bank2.toString());
        LOGGER.info(insurance1.toString());
        LOGGER.info(pensionFund1.toString());
        LOGGER.info(stockExchange1.toString());
        LOGGER.info(investmentCompany1.toString());
        LOGGER.info(popShop1.toString());
        LOGGER.info(dealer1.toString());
        LOGGER.info(broker1.toString());
        LOGGER.info(director1.toString());
        LOGGER.info(cashier1.toString());
        LOGGER.info(guard1.toString());
        LOGGER.info(booker1.toString());
        LOGGER.info(naturalP1.toString());
        LOGGER.info(legalLp1.toString());
        LOGGER.info(government1.toString());

        //equals examples
        LOGGER.info("------------------------equals examples------------------------");
        LOGGER.info("bank1 equal bank1 : " + bank1.equals(bank1));
        LOGGER.info("bank1 equal bank2 : " + bank1.equals(bank2));
        LOGGER.info("bank1 equal guard1 : " + bank1.equals(guard1));

        //hashCode() examples()
        LOGGER.info("------------------------hashCode() examples------------------------");
        LOGGER.info(bank1.hashCode());
        LOGGER.info(bank2.hashCode());
        LOGGER.info(insurance1.hashCode());
        LOGGER.info(pensionFund1.hashCode());
        LOGGER.info(stockExchange1.hashCode());
        LOGGER.info(investmentCompany1.hashCode());
        LOGGER.info(popShop1.hashCode());
        LOGGER.info(dealer1.hashCode());
        LOGGER.info(broker1.hashCode());
        LOGGER.info(director1.hashCode());
        LOGGER.info(cashier1.hashCode());
        LOGGER.info(guard1.hashCode());
        LOGGER.info(booker1.hashCode());
        LOGGER.info(naturalP1.hashCode());
        LOGGER.info(legalLp1.hashCode());
        LOGGER.info(government1.hashCode());

        //Interfaces examples

        LOGGER.info("------------------------Interfaces examples------------------------");
        if (broker1 instanceof ISpeak) {
            ((ISpeak) broker1).speaker();
        }
        if (dealer1 instanceof ISpeak) {
            ISpeak speaker = (ISpeak) dealer1;
            speaker.speaker();
        }
        if (broker1 instanceof IGiveMoney) {
            IGiveMoney gMoney = (IGiveMoney) broker1;
            gMoney.giveMoney();
        }
        if (dealer1 instanceof IGiveMoney) {
            IGiveMoney gMoney = (IGiveMoney) dealer1;
            gMoney.giveMoney();
        }

        if (stockExchange1 instanceof IGetItem) {
            IGetItem getItem = (IGetItem) stockExchange1;
            getItem.getItem();
        }
        if (popShop1 instanceof IGetItem) {
            IGetItem getItem = (IGetItem) popShop1;
            getItem.getItem();
        }
        if (government1 instanceof IRaiseRate) {
            IRaiseRate raisRate = (IRaiseRate) government1;
            raisRate.raiseRate();
        }
        if (bank1 instanceof IRaiseRate) {
            IRaiseRate raisRate = (IRaiseRate) bank1;
            raisRate.raiseRate();
        }
        if (legalLp1 instanceof IChangeRegAddress) {
            IChangeRegAddress changeAdress = (IChangeRegAddress) legalLp1;
            changeAdress.changeAddress();
        }

        LOGGER.info("------------------------Generic examples------------------------");
        ClientsGeneric<ClientsBase> clGovGeneriс = new ClientsGeneric<>();
        ClientsGovernment clGov02 = new ClientsGovernment();
        ClientsLegalP clLegLp02 = new ClientsLegalP();
        //StaffBooker StBoo02 = new StaffBooker();   //as an example, creating this instance of the class
        //clGovGeneriс.getClients().add(StBoo02);    //displays an incorrect type error here
        clGovGeneriс.getClients().add(clGov02);
        clGovGeneriс.getClients().add(clLegLp02);
        //System.out.println(clGov02.toString());
        List<ClientsBase> clientsBaseList = clGovGeneriс.getClients();
        //System.out.println(clientsBaseList);

        LOGGER.info("------------------------Collections and map examples------------------------");

        BaseOfCollectionsAndMap baseOfValues = new BaseOfCollectionsAndMap();
        baseOfValues.setNewName("Zarina");
        //System.out.println(baseOfValues.getRandomAge());
        //System.out.println(baseOfValues.getRandomName());
        baseOfValues.printHashMap();
    }
}
