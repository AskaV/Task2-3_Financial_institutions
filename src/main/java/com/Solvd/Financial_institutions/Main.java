package com.Solvd.Financial_institutions;

/**
 * Есть 3 базовых класса, от которых наследуются остальные подклассы:
 * Финансовый институт (CFInInBase), Персонал (CStuffBase) и Клиенты (CClientsBase)
 *            Финансовый институт (CFInInBase)
 *   1).CFInInBank,               Банк                     done
 *   2).CFinInInsurance,          Страховая компания       done
 *   3).CFinInPensionFund,        Пенсионный фонд          done
 *   4).CFinInStockExchange,      Фондовая биржа           done
 *   5).CFinInInvestmentCompany.  Инвестиционная компания  done.
 *   6).CFinInPopshop.            Ломбард                  done
 *   7).CFinInDealer.             Диллеры                  done
 *   8).CFinInBroker.             Брокеры                  done
 *             Персонал (СStuffBase)
 *   1).CStuffDirector.           Директор                 done
 *   2).CStuffCashier.            Кассир                   done
 *   3).CStuffGuard.              Охранник                 done
 *   4).CStuffBooker.             Бухгалтер                done
 *            Клиенты ClientsBse
 *   1) CClientsNaturalP.         Физическое лицо          done
 *   2) CClientsLegalP.           Юридическое лицо.        done
 *   3) CClientsGovernment.       Государство              done
 *
 * Вопрос – сколько денег я могу получить в кредит от финансового института? В какой валюте?
 */
public class Main {

    public static void main(String[] args) {
        //Init FInIn
        CFInInBank Bank_1 = new CFInInBank(14000, "Kotobank", "UAH", true, 600  );
        CFInInBank Bank_2 = new CFInInBank(14000, "Kotobank", "UAH", true, 600);
        CFinInInsurance Insurance_01 = new CFinInInsurance(998, "Insurance","EUR",false);
        CFinInPensionFund PensionFund_01 = new CFinInPensionFund(999, "Пенсионеры и пенсионерочки", "UAH", false,"Butterfly");
        CFinInStockExchange StockExchange_01 = new CFinInStockExchange(1000, "nStockExchange", "EUR", false,"www.URL.com"  );
        CFinInInvestmentCompany InvestmentCompany_01 = new CFinInInvestmentCompany(1001, "Investment Co", "EUR", false, "Petya");
        CFinInPopshop Popshop_01 = new CFinInPopshop(1002, "Finik", "EUR", false, "Галочка");
        CFinInDealer Dealer_01 = new CFinInDealer(1003, "Dillik", "USD", false, "multy" );
        CFinInBroker Broker_01 = new CFinInBroker(1004, "Brokik", "EUR", false, "mini");
        //Init Staff
        CStaffGuard Guard_01 = new CStaffGuard("Vasya", 44, 1100, 404);
        CStaffDirector Director_01 = new CStaffDirector("Durik",20, 1000000, "Government", Guard_01);
        CStaffCashier Cashier_01 = new CStaffCashier("Karina", 18,1000, "Mazda");
        CStaffBooker Booker_01 = new CStaffBooker("Marina", 48, 1200, "Kek");
        //Init Clients
        CClientsNaturalP NaturalP_01 = new CClientsNaturalP("Marik", 20, "Male", 35);
        CClientsLegalP Legallp_01 = new CClientsLegalP("\"OOO Company\"", 10000, "Kyiv, Khreshchatyk 4" );
        CClientsGovernment Government_01 = new CClientsGovernment("Government", 1000000000, 20, 1900);

        //class interaction examples
        NaturalP_01.takeLoanFromCashier(Cashier_01, Bank_1, NaturalP_01);
        Bank_1.rCreditPosibility();
        PensionFund_01.rCreditPosibility();
        Cashier_01.askFinInstitutesForLonn(Insurance_01);
        Guard_01.askAboutCredit();
        Director_01.trySoSpeak(NaturalP_01);
        Director_01.trySoSpeak(Government_01);
        Booker_01.giveSalarytoStuff(1, Cashier_01);
        Booker_01.giveSalarytoStuff(1, Booker_01);
        Booker_01.giveSalarytoStuff(2, Cashier_01);
        Legallp_01.payForPurchases(500, Government_01);
        Insurance_01.rTarifnyPaket();
        InvestmentCompany_01.rCompanyDirector();
        Dealer_01.sReqvPopshop(Popshop_01);
        Broker_01.sReqv(StockExchange_01);
        Broker_01.sReqv(InvestmentCompany_01);

        //toString() examples
        System.out.println();
        System.out.println(Bank_1.toString());
        System.out.println(Bank_2.toString());
        System.out.println(Insurance_01.toString());
        System.out.println(PensionFund_01.toString());
        System.out.println(StockExchange_01.toString());
        System.out.println(InvestmentCompany_01.toString());
        System.out.println(Popshop_01.toString());
        System.out.println(Dealer_01.toString());
        System.out.println(Broker_01.toString());
        System.out.println(Director_01.toString());
        System.out.println(Cashier_01.toString());
        System.out.println(Guard_01.toString());
        System.out.println(Booker_01.toString());
        System.out.println(NaturalP_01.toString());
        System.out.println(Legallp_01.toString());
        System.out.println(Government_01.toString());

        //equals examples
        System.out.println();
        System.out.println("Bank_1 equal Bank_1 : " + Bank_1.equals(Bank_1));
        System.out.println("Bank_1 equal Bank_2 : " + Bank_1.equals(Bank_2));
        System.out.println("Bank_1 equal Guard_01 : " + Bank_1.equals(Guard_01));

        //hashCode() examples()
        System.out.println();
        System.out.println(Bank_1.hashCode());
        System.out.println(Bank_2.hashCode());
        System.out.println(Insurance_01.hashCode());
        System.out.println(PensionFund_01.hashCode());
        System.out.println(StockExchange_01.hashCode());
        System.out.println(InvestmentCompany_01.hashCode());
        System.out.println(Popshop_01.hashCode());
        System.out.println(Dealer_01.hashCode());
        System.out.println(Broker_01.hashCode());
        System.out.println(Director_01.hashCode());
        System.out.println(Cashier_01.hashCode());
        System.out.println(Guard_01.hashCode());
        System.out.println(Booker_01.hashCode());
        System.out.println(NaturalP_01.hashCode());
        System.out.println(Legallp_01.hashCode());
        System.out.println(Government_01.hashCode());

        //Interfaces example

        System.out.println();
        if (Broker_01 instanceof CIntSpeak){
            CIntSpeak speaker = (CIntSpeak) Broker_01;
            speaker.speaker();
        }
        if (Dealer_01 instanceof CIntSpeak){
            CIntSpeak speaker = (CIntSpeak) Dealer_01;
            speaker.speaker();
        }
        if (Broker_01 instanceof CIntGiveMoney){
            CIntGiveMoney gMoney = (CIntGiveMoney) Broker_01;
            gMoney.give_money();
        }
        if (Dealer_01 instanceof CIntGiveMoney){
            CIntGiveMoney gMoney = (CIntGiveMoney) Dealer_01;
            gMoney.give_money();
        }

        if (StockExchange_01 instanceof CIntGetItem){
            CIntGetItem get_item = (CIntGetItem) StockExchange_01;
            get_item.get_item();
        }
        if (Popshop_01 instanceof CIntGetItem){
            CIntGetItem get_item = (CIntGetItem) Popshop_01;
            get_item.get_item();
        }
        if (Government_01 instanceof CIntRaiseRate){
            CIntRaiseRate raisRate = (CIntRaiseRate)Government_01;
            raisRate.raisRate();
        }
        if (Bank_1 instanceof CIntRaiseRate){
            CIntRaiseRate raisRate = (CIntRaiseRate) Bank_1;
            raisRate.raisRate();
        }
        if (Legallp_01 instanceof CIntChangeRegAdress){
            CIntChangeRegAdress change_adress = (CIntChangeRegAdress) Legallp_01;
            change_adress.change_adress();
        }

    }
}
