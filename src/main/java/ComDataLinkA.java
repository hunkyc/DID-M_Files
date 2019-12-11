/**
 * Created by martinsmith on 28/10/19.
 */
public class ComDataLinkA {
    int BCPosTimeIntIndex = 1;
    int StatusTimeIntIndex = 2;
    int PosMsgPortAllocIndex = 3;
    int StMsgPortAllocIndex = 4;
    int TransInhibitIndex = 5;
    int TigerIDStartIndex = 6;
    int TigerIDEndIndex = 7;

    //CorrTblEntry1-20
    int IsValidElementIndex = 8;
    int DataAdressStartIndex = 9;
    int DataAdressEndIndex = 16;
    int ABBRAdressStartIndex = 17;
    int ABBRAdressEndIndex = 18;
    int LLPAdressStartIndex = 19;
    int LLPAdressEndIndex = 20;
    int NetworkPartTypeIndex = 21;

    int BCRepeatParStartIndex = 288;
    int BCRepeatParEndIndex = 289;
    int LPPDPDUMTUStartIndex = 290;
    int LPPDPDUMTUEndIndex = 291;
    int LPPNrOfRetriesStartIndex = 292;
    int LPPNrOfRetriesEndIndex = 293;
    int LPPRetryDelayStartIndex = 294;
    int LPPRetryDelayEndIndex = 295;
    int LPPParameter1StartIndex = 296;
    int LPPParameter1EndIndex = 299;
    int LPPParameter2StartIndex = 300;
    int LPPParameter2EndIndex = 303;
    int LPPParameter3StartIndex = 304;
    int LPPParameter3EndIndex = 307;
    int LPPParameter4StartIndex = 308;
    int LPPParameter4EndIndex = 311;
    int LPPParameter5StartIndex = 312;
    int LPPParameter5ENDIndex = 315;
    int LPPParameter6StartIndex = 316;
    int LPPParameter6EndIndex = 319;
    int PosLimitTimeStartIndex = 320;
    int PosLimitTimeEndIndex = 323;
    int PosSuppressTimeStartIndex = 324;
    int PosSuppressTimeEndIndex = 327;

    String BCPosTimeString = "";
    String StatusTimeInt = "";
    String PosMsgPortAlloc = "";
    String StMsgPortAlloc = "";
    String TransInhibit6 = "";
    String TigerIDIndex = "";

    //CorrTblEntry_1-20
    String IsValidElement = "";
    String DataAdress = "";
    String ABBRAdress = "";
    String LLPAddress = "";
    String NetworkPartType = "";

    String BCRepeatPar = "";
    String LPPDPDUMTU = "";
    String LPPNrOfRetries = "";
    String Number2 = "";
    String LPPRetryDelay = "";
    String LPPParameter1 = "";
    String LPPParameter2 = "";
    String LPPParameter3 = "";
    String LPPParameter4 = "";
    String LPPParameter5 = "";
    String LPPParameter6 = "";
    String PosLimitTime = "";
    String PosSuppressTime = "";
}