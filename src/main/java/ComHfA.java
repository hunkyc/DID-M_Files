
public class ComHfA {

    int activePresetNrIndex = 0;
    int defaultGroupIndex = 1;
    int standbyPresetNrIndex = 2;
    int dataPortIndex = 3;
    int dataRateLowIndex = 4;
    int dataRateMediumIndex = 5;
    int dataRateHighIndex = 6;
    int defaultDataRateIndex = 7;
    int emergencyChNrIndex = 8;
    int powerLevelIndex = 9;
    int squelchlevelIndex = 10;
    int timeSourceIndex = 11;
    int selcalSelfAddressIndex = 12;
    int aleFirstSelfAddressIndex = 16;
    int aleSoundIntervalSoundIndex= 31;
    int groupIdIndex = 33;


    int presetValidIndex = 0;
    int idStartIndex = 1;
    int idEndIndex = 12;
    int channelNumberStartIndex = 13;
    int channelNumberEndIndex = 14;
    int modeIndex = 15;
    int isInGroupStartIndex = 16;
    int isInGroupEndIndex = 19;
    int dataAddressStartIndex = 20;
    int dataAddressEndIndex = 27;
    int dataAddressTypeIndex = 28;
    int frequencyStartIndex = 29;
    int frequencyEndIndex = 32;
    int modulationTypeIndex = 33;
    int aleCallAddressStartIndex = 34;
    int aleCallAddressEndIndex = 48;
    int usedScanListIndex = 49;


    String activePresetNr;
    String defaultGroup;
    String standbyPresetNr;
    String dataPort;
    String dataRateLow;
    String dataRateMedium;
    String dataRateHigh;
    String defaultDataRate;
    String emergencyChNr;
    String powerLevel;
    String squelchLevel;
    String timeSource;
    String selcalSelfAddress;
    String aleFirstSelfAddress;
    String aleSoundInterval;
    String [] groupId;
    String [] groupAvailable;


    String presetValid;
    String id;
    String channelNumber;
    String mode;
    String isInGroup;
    String dataAddress;
    String dataAddressType;
    String frequency;
    String modulationType;
    String aleCallAddress;
    String usedScanList;

    public ComHfA() {
        activePresetNr = "";
        defaultGroup = "";
        standbyPresetNr = "";
        dataPort = "";
        dataRateLow = "";
        dataRateMedium = "";
        dataRateHigh = "";
        defaultDataRate = "";
        emergencyChNr = "";
        powerLevel = "";
        squelchLevel = "";
        timeSource = "";
        selcalSelfAddress = "";
        aleFirstSelfAddress = "";
        aleSoundInterval = "";

        presetValid = "";
        id = "";
        channelNumber = "";
        mode = "";
        isInGroup = "";
        dataAddress = "";
        dataAddressType = "";
        frequency = "";
        modulationType = "";
        aleCallAddress = "";
        usedScanList = "";
    }
    public ComHfA(byte[] preset) {

        //presetValid = setPresetValid(preset, presetValid);

        id = setId(preset, id);

        channelNumber = setChannelNumber(preset, channelNumber);

        mode = setMode(preset, channelNumber);

        isInGroup = setIsInGroup(preset, channelNumber);

        dataAddress = setDataAddress(preset, channelNumber);

        dataAddressType = setDataAddressType(preset, channelNumber);

        frequency = setFrequency(preset, channelNumber);

        modulationType = setModulationType(preset, channelNumber);

        aleCallAddress = setAleCallAddress(preset, channelNumber);

//        usedScanList = setUsedScanList(preset, channelNumber);


    }//end of constructor

//    public String setPresetValid(byte[] preset, String presetValid) {
//        byte presetValidity = preset[presetValidIndex];
//
//        //compare it
//        if (presetValidity == 1) {
//            presetValid = "Beacon Valid";
//        }
//        else {
//            presetValid = "Beacon invalid";
//        }
//        return presetValid;
//    }


    public void setActivePresetNr(int PN){
        activePresetNr = Integer.toString(PN);
    }

    public void setDefaultGroup(int DG) {
        defaultGroup = Character.toString((char) DG);
    }

    public void setStandbyPresetNr(int SPN) {
        standbyPresetNr = Integer.toString(SPN);
    }

    public void setDataPort(int DP) {
        dataPort = Integer.toString(DP);
    }

    public void setDataRateLow(int DRL) {

        if(DRL == 1) {
            dataRateLow = "75";
        } else if(DRL == 2) {
            dataRateLow = "300";
        } else if(DRL == 3) {
            dataRateLow = "600";
        } else if(DRL == 4) {
            dataRateLow = "1200";
        } else if(DRL == 5) {
            dataRateLow = "2400";
        } else {
            dataRateLow = "Invalid";
        }
    }

    public void setDataRateMedium(int DRM) {
        if(DRM == 1) {
            dataRateMedium = "75";
        } else if(DRM == 2) {
            dataRateMedium = "300";
        } else if(DRM == 3) {
            dataRateMedium = "600";
        } else if(DRM == 4) {
            dataRateMedium = "1200";
        } else if(DRM == 5) {
            dataRateMedium = "2400";
        } else {
            dataRateMedium = "Invalid";
        }
    }

    public void setDataRateHigh(int DRH) {
        if(DRH == 1) {
            dataRateHigh = "75";
        } else if(DRH == 2) {
            dataRateHigh = "300";
        } else if(DRH == 3) {
            dataRateHigh = "600";
        } else if(DRH == 4) {
            dataRateHigh = "1200";
        } else if(DRH == 5) {
            dataRateHigh = "2400";
        } else {
            dataRateHigh = "Invalid";
        }
    }

    public void setDefaultDataRate(int DDR) {
        if(DDR == 1) {
            defaultDataRate = "75";
        } else if(DDR == 2) {
            defaultDataRate = "300";
        } else if(DDR == 3) {
            defaultDataRate = "600";
        } else if(DDR == 4) {
            defaultDataRate = "1200";
        } else if(DDR == 5) {
            defaultDataRate = "2400";
        } else {
            defaultDataRate = "Invalid";
        }
    }

    public void setEmergencyChNr(int ECR) {
        emergencyChNr = Integer.toString(ECR);
    }

    public void setPowerLevel(int PL) {
        if (PL == 1) {
            powerLevel = "1";
        }
        else if(PL == 2) {
            powerLevel = "2";
        }
        else if(PL == 3) {
            powerLevel = "3";
        }
        else if(PL == 4) {
            powerLevel = "SIL";
        }
        else {
            powerLevel = "Invalid";
        }
    }

    public void setSquelchLevel(int SL) {
        if (SL == 1){
            squelchLevel = "Level 1";
        }
        else if(SL == 2){
            squelchLevel = "Level 2";
        }
        else if(SL == 3){
            squelchLevel = "Level 3";
        }
        else if(SL == 4){
            squelchLevel = "Unmute";
        }
        else {
            squelchLevel = "Invalid";
        }
    }

    public void setTimeSource(int TS) {
        if (TS == 1) {
            timeSource = "GPS";
        }
        else if (TS == 2) {
            timeSource = "System";
        }
        else if (TS == 3) {
            timeSource = "Manual";
        }
        else {
            timeSource = "Manual";
        }
    }

    public void setSelcalSelfAddress(byte[] filedata) {
        String temp = "";
        int length = 4;
        for (int i = 0; i < length; i++){
            temp = temp.concat(decodeAscii(Integer.toHexString(filedata[getSelcalSelfAddressIndex() + i])));
        }
        selcalSelfAddress = temp;
    }

    public void setAleFirstSelfAddress(byte[] filedata) {
        String temp = "";
        int length = 15;
        for (int i =0; i < length; i++) {
            temp = temp.concat(decodeAscii(Integer.toHexString(filedata[getAleFirstSelfAddressIndex() + i])));
        }
        aleFirstSelfAddress = temp;
    }

    public void setAleSoundInterval(int ASI){
        aleSoundInterval = Integer.toString(ASI);
    }

    public void setGroupIdAndAvail(byte[] fileData) {
        byte [] temp = new byte[12]; // the length of the group id
        String [] groupIdAndAvail= new String[198];//an array where all the group id's and avails will go

        int placeToLoad = getGroupIdIndex();

        for (int a = 0; a < 99; a++) {// there are 99
            for (int b = 0; b < 12; b++) {
                temp[b] = (fileData[(placeToLoad + b)]);
            }

            String intGroupId = "";
            for (int i = 0; i < temp.length; i++) {
                intGroupId = intGroupId.concat((decodeAscii(Integer.toHexString((temp[i])))));
            }
            groupIdAndAvail[a] = intGroupId;

            //the availability bit
            //it's the byte after the last id byte
            //if (placeToLoad == )


            placeToLoad = placeToLoad + 13;
        }
            System.out.println("Group ID is " + groupIdAndAvail[0]);
        System.out.println("Availability is " + groupIdAndAvail[1]);

    }

    //i have a file of bytes that I decode and for each group of
    //what I want is an array of strings with the even indexes being the group id an the odd index being availability
    //change the individual bytes to a string and add it to and array

    //byte to string array

    //string array to string

    //string to groupid array

    public void setGroupAvailable() {

    }

    public void setGroupIdIndex(int newGroupIdIndex) {
        groupIdIndex = newGroupIdIndex;
    }


    public String decodeAscii(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i+=2) {
            String str = input.substring(i, i+2);
            output.append((char)Integer.parseInt(str, 16));
        }
        return output.toString();
    }



    public int getActivePresetNrIndex() {
        return activePresetNrIndex;
    }

    public int getDefaultGroupIndex() {
        return defaultGroupIndex;
    }

    public int getStandbyPresetNrIndex() {
        return standbyPresetNrIndex;
    }

    public int getDataPortIndex() {
        return dataPortIndex;
    }

    public int getDataRateLowIndex() {
        return dataRateLowIndex;
    }

    public int getDataRateMediumIndex() {
        return dataRateMediumIndex;
    }

    public int getDataRateHighIndex() {
        return dataRateHighIndex;
    }

    public int getDefaultDataRateIndex() {
        return defaultDataRateIndex;
    }

    public int getEmergencyChNrIndex() {
        return emergencyChNrIndex;
    }

    public int getPowerLevelIndex() {
        return powerLevelIndex;
    }

    public int getSquelchlevelIndex() {
        return squelchlevelIndex;
    }

    public int getTimeSourceIndex() {
        return timeSourceIndex;
    }

    public int getSelcalSelfAddressIndex() {
        return selcalSelfAddressIndex;
    }

    public int getAleFirstSelfAddressIndex() {
        return aleFirstSelfAddressIndex;
    }

    public int getAleSoundIntervalIndex() {
        return aleSoundIntervalSoundIndex;
    }

    public int getGroupIdIndex() {
        return groupIdIndex;
    }






    public String getActivePresetNr() {
        return activePresetNr;
    }

    public String getDefaultGroup() {
        return defaultGroup;
    }

    public String getStandbyPresetNr() {
        return standbyPresetNr;
    }

    public String getDataPort() {
        return dataPort;
    }

    public String getDataRateLow() {
        return dataRateLow;
    }

    public String getDataRateMedium() {
        return dataRateMedium;
    }

    public String getDataRateHigh() {
        return dataRateHigh;
    }

    public String getDefaultDataRate() {
        return defaultDataRate;
    }

    public String getEmergencyChNr() {
        return emergencyChNr;
    }

    public String getPowerLevel() {
        return powerLevel;
    }

    public String getSquelchLevel() {
        return squelchLevel;
    }

    public String getTimeSource() {
        return timeSource;
    }

    public String getSelcalSelfAddress() {
        return selcalSelfAddress;
    }

    public String getAleFirstSelfAddress() {
        return aleFirstSelfAddress;
    }

    public String getAleSoundInterval() {
        return aleSoundInterval;
    }





    public String setId(byte[] preset, String id) {
        for (int i = idStartIndex; i <= idEndIndex; i++) {
            //Convert to ascii character and print
            id = id.concat(Character.toString((char) preset[i]));
        }
        return id;
    }

    public String setChannelNumber(byte[] preset, String channelNumber) {

        byte channelNumber1 = preset[channelNumberStartIndex];
        byte channelNumber2 = preset[channelNumberEndIndex];

        int channelNumberValue1 = byte2Binary3(channelNumber1);
        int channelNumberValue2 = byte2Binary4(channelNumber2);

        int total = channelNumberValue1 + channelNumberValue2;

        channelNumber = "Channel Number is " + total;
        return channelNumber;
    }

    public String setMode(byte[] preset, String mode) {
        int modeValue = byte2Binary4(preset[modeIndex]);
        switch (modeValue) {
            case 1: {
                mode = "Channel Data";
                break;
            }

            case 2: {
                mode = "Channel voice";
                break;
            }

            case 3: {
                mode = "ALE Address Data";
                break;
            }

            case 4: {
                mode = "ALE Address Voice";
                break;
            }

            case 5: {
                mode = "Maritime";
                break;
            }

            default: {
                mode = "Invalid";
            }
        }
        return mode;
    }

    //// TODO: 7/06/2016
    public String setIsInGroup(byte[] preset, String IsInGroup) {

        return IsInGroup;
    }

    public String setDataAddress(byte[] preset, String dataAddress) {
        for (int i = dataAddressStartIndex; i <= dataAddressEndIndex; i++) {
            //Convert to ascii character and print
            id = id.concat(Character.toString((char) preset[i]));
        }
        return dataAddress;
    }

    public String setDataAddressType(byte[] preset, String dataAddressType) {
        int dataAddressTypeValue = byte2Binary4(preset[dataAddressTypeIndex]);
        switch (dataAddressTypeValue) {
            case 1: {
                dataAddressType = "Broadcast";
                break;
            }

            case 2: {
                dataAddressType = "Point to Point";
                break;
            }

            default: {
                dataAddressType = "Invalid";
                break;
            }
        }
        return dataAddressType;
    }

    public String setFrequency(byte[] preset, String frequency) {

        byte frequency1 = preset[frequencyStartIndex];
        byte frequency2 = preset[frequencyStartIndex + 1];
        byte frequency3 = preset[frequencyStartIndex + 2];
        byte frequency4 = preset[frequencyStartIndex + 3];

        int frequencyValue1 = byte2Binary1(frequency1);
        int frequencyValue2 = byte2Binary2(frequency2);
        int frequencyValue3 = byte2Binary3(frequency3);
        int frequencyValue4 = byte2Binary4(frequency4);

        int total = frequencyValue1 + frequencyValue2 + frequencyValue3 + frequencyValue4;

        channelNumber = "Channel Number is " + total;

        return frequency;
    }

    public String setModulationType(byte[] preset, String modulationType) {
        int modulationTypeValue = byte2Binary4(preset[modulationTypeIndex]);
        switch (modulationTypeValue) {
            case 1: {
                modulationType = "USB";
                break;
            }

            case 2: {
                modulationType = "LSB";
                break;
            }

            case 3: {
                modulationType = "CW";
                break;
            }

            case 4: {
                modulationType = "AME";
                break;
            }

            default: {
                modulationType = "Invalid";
                break;
            }
        }

        return modulationType;
    }

    public String setAleCallAddress(byte[] preset, String aleCallAddress) {
        for (int i = aleCallAddressStartIndex; i <= aleCallAddressEndIndex; i++) {
            //Convert to ascii character and print
            aleCallAddress = aleCallAddress.concat(Character.toString((char) preset[i]));
        }

        return aleCallAddress;
    }

    //// TODO: 7/06/2016
//    public String setUsedScanList(byte[] preset, String usedScanList){
//
//        byte usedScanList1 = preset[usedScanListIndex];
//
//        int channelNumberValue1 = byte2Binary3(channelNumber1);
//        int channelNumberValue2 = byte2Binary4(channelNumber2);
//
//        int total = channelNumberValue1 + channelNumberValue2;
//
//        channelNumber = "Channel Number is " + total;
//
//        return usedScanList;
//    }


    //end of HF Preset attributes


    public static int byte2Binary1(byte b) {
        int val = 0;
        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        int total = 0;
        for (int i = 0; i < s1.length(); i++) {
            switch (s1.charAt(i)) {
                case '0': //add nothing to total
                    break;
                case '1':
                    if (i == 7){
                        total+= 16775168;
                        break;
                    }
                    if (i == 6) {
                        total += 33550336;
                        break;
                    }
                    if (i == 5) {
                        total += 67100672;
                        break;
                    }
                    if (i == 4) {
                        total += 134201344;
                        break;
                    }
                    if (i == 3) {
                        total +=268402688;
                        break;
                    }
                    if (i == 2) {
                        total +=536805376;
                        break;
                    }
                    if (i == 1) {
                        total +=1073610752;
                        break;
                    }
                    if (i == 0) {
                        total +=2147221504;
                        break;
                    }
            }
        }
        return total;
    }

    public static int byte2Binary2(byte b) {
        int val = 0;
        String s2 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        int total = 0;
        for (int i = 0; i < s2.length(); i++) {
            switch (s2.charAt(i)) {
                case '0': //add nothing to total
                    break;
                case '1':
                    if (i == 7){
                        total+= 65536;
                        break;
                    }
                    if (i == 6) {
                        total += 131072;
                        break;
                    }
                    if (i == 5) {
                        total += 262144;
                        break;
                    }
                    if (i == 4) {
                        total += 524288;
                        break;
                    }
                    if (i == 3) {
                        total +=1048576;
                        break;
                    }
                    if (i == 2) {
                        total +=2097152;
                        break;
                    }
                    if (i == 1) {
                        total +=4194304;
                        break;
                    }
                    if (i == 0) {
                        total +=8388608;
                        break;
                    }
            }
        }
        return total;
    }

    public static int byte2Binary3(byte b) {
        int val = 0;
        String s3 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        int total = 0;
        for (int i = 0; i < s3.length(); i++) {
            switch (s3.charAt(i)) {
                case '0': //add nothing to total
                    break;
                case '1':
                    if (i == 7){
                        total+= 256;
                        break;
                    }
                    if (i == 6) {
                        total += 512;
                        break;
                    }
                    if (i == 5) {
                        total += 1024;
                        break;
                    }
                    if (i == 4) {
                        total += 2048;
                        break;
                    }
                    if (i == 3) {
                        total +=4096;
                        break;
                    }
                    if (i == 2) {
                        total +=8192;
                        break;
                    }
                    if (i == 1) {
                        total +=16384;
                        break;
                    }
                    if (i == 0) {
                        total +=32768;
                        break;
                    }
            }
        }
        return total;
    }

    public static int byte2Binary4(byte b) {
        int val = 0;
        String s4 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        int total = 0;
        for (int i = 0; i < s4.length(); i++) {
            switch (s4.charAt(i)) {
                case '0': //add nothing to total
                    break;
                case '1':
                    if (i == 7){
                        total++;
                        break;
                    }
                    if (i == 6) {
                        total += 2;
                        break;
                    }
                    if (i == 5) {
                        total += 4;
                        break;
                    }
                    if (i == 4) {
                        total +=8;
                        break;
                    }
                    if (i == 3) {
                        total +=16;
                        break;
                    }
                    if (i == 2) {
                        total +=32;
                        break;
                    }
                    if (i == 1) {
                        total +=64;
                        break;
                    }
                    if (i == 0) {
                        total +=128;
                        break;
                    }
            }
        }
        return total;
    }
}
