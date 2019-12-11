
public class RnavdataBaseA {

    int validityIndex = 0;
    int idStartIndex = 1;
    int idEndIndex = 3;
    int positionValidIndex = 4;
    int latBearingIndex = 5;
    int latDegreeIndex = 6;
    int latMinutesIndex = 7;
    int longMinutesDiv100Index = 8;
    int longBearingIndex = 9;
    int longDegreeIndex = 10;
    int longMinutesIndex = 12;
    int latMinutesDiv100Index = 13;
    int altitudeValidIndex = 14;
    int altitudeIndex = 15;
    int beaconDataKindIndex = 17;
    int channelNumberIndex = 18;
    int channelSuffixIndex = 19;
    int isDMEIndex = 20;
    int frequencyIndex = 21;
    int dirCountValidIndex = 25;
    int directionIndex = 26;
    int countIndex = 27;

    String validity;
    String id;
    String positionValid;
    String latBearing;
    String latDegree;
    String latMinutes;
    String longMinutesDiv100;
    String longBearing;
    String longDegree;
    String longMinutes;
    String latMinutesDiv100;
    String altitudeValid;
    String altitude;
    String beaconDataKind;
    String channelNumber;
    String channelSuffix;
    String isDME;
    String frequency;
    String dirCountValid;
    String direction;
    String count;

    public RnavdataBaseA() {
        validity = "";
        id = "";
        positionValid = "";
        latBearing = "";
        latDegree = "";
        latMinutes = "";
        latMinutesDiv100 = "";
        longBearing = "";
        longDegree = "";
        longMinutes = "";
        longMinutesDiv100 = "";
        altitudeValid = "";
        altitude = "";
        beaconDataKind = "";
        channelNumber = "";
        channelSuffix = "";
        isDME = "";
        frequency = "";
        dirCountValid = "";
        direction = "";
        count = "";
    }

    public void setValidity(int validityBit) {

        //compare it
        if (validityBit == 1) {
            validity = "Beacon Valid";
        }
        else {
            validity = "Beacon Invalid";
        }
    }

    public void setId(byte[] beacon) {
        for (int i = idStartIndex; i <= idEndIndex; i++) {
            //Convert to ascii character and print
            id = id.concat(Character.toString((char) beacon[i]));
        }
    }

    public void setPositionValid(int positionValidBit) {

        //compare it
        if (positionValidBit == 1) {
            positionValid = "Position Valid";
        }
        else {
            positionValid = "Position Invalid";
        }
    }

    public void setLatBearing(byte[] fileData) {
        //get the byte at index
        byte LB = fileData[latBearingIndex];

        switch (LB) {
            case 0x4E: {
                latBearing = "N";
                break;
            }
            case 0x53: {
                latBearing = "S";
                break;
            }
            default:
                latBearing = "Invalid";
        }
    }

    public void setLatDegree(byte[] fileData) {
        //get the byte index
        byte LD = fileData[latDegreeIndex];
        latDegree = Byte.toString(LD);
    }

    public void setLatMinute(byte[] fileData) {
        //get the byte index
        byte LM = fileData[latMinutesIndex];
        latMinutes = Byte.toString(LM);
    }

    public void setLatMinutesDiv100(byte[] fileData) {
        //get the byte index
        byte LMH = fileData[latMinutesDiv100Index];

        latMinutesDiv100 = Byte.toString(LMH);
    }

    public void setLongBearing(byte[] fileData) {
        //get the byte index
        byte LoB = fileData[longBearingIndex];

        switch (LoB) {
            case 0x45: {
                longBearing = "E";
                break;
            }
            case 0x57: {
                longBearing = "W";
                break;
            }
            default:
                latBearing = "Invalid";
        }
    }

    public void setLongDegree(int LoD) {
        longDegree = Integer.toString(LoD);
    }

    public void setLongMinutes(byte[] fileData) {
        //get the byte index
        byte LoM = fileData[longMinutesIndex];
        longMinutes = Byte.toString(LoM);
    }

    public void setLongMinutesDiv100(byte[] fileData) {
        //get the byte index
        byte LoMDH = fileData[longMinutesDiv100Index];

        longMinutesDiv100 = Byte.toString(LoMDH);
    }

    public void setAltitudeValid(int altitudeValidBit) {

        //compare it
        if (altitudeValidBit == 1) {
            altitudeValid = "Altitude Valid";
        }
        else {
            altitudeValid = "Altitude Invalid";
        }
    }

    public void setAltitude(int alt){
        altitude = Integer.toString(alt);
    }

    public void setBeaconDataKind(byte indexValue) {
        if (indexValue == 1) {
            beaconDataKind = "VOR";
        }
        else if (indexValue == 2) {
            beaconDataKind = "ILS";
        }
        else beaconDataKind = "Invalid RnavdataBaseA data kind";
    }

    public void setChannelNumber(int input) {
        if (input < 1 || input > 126) {
            channelNumber = "Invalid Channel Number";
        }
        else {
            channelNumber = Integer.toString(input);
        }
    }

    public void setChannelSuffix(int input) {
        if (input == 1) {
            channelSuffix = "TCS-X";
        }
        else if (input == 2) {
            channelSuffix = "TCS-Y";
        }
        else {
            channelSuffix = "Invalid Channel Suffix";
        }
    }

    public void setIsDme(int input){
        if (input == 0) {
            isDME = "No";
        } else if (input == 1) {
            isDME = "Yes";
        }
        else {
            isDME = "Invalid DME";
        }
    }

    public void setFrequency(int freq) {
        frequency = Integer.toString(freq);
    }

    public void setDirCountValid(int dirCountValidBit) {
        //compare it
        if (dirCountValidBit == 0) {
            dirCountValid = "False";
        }
        else if (dirCountValidBit == 1){
            dirCountValid = "True";
         }
        else {
            dirCountValid = "Invalid";

        }
    }

    public void setDirection(int directionBit) {
        if(!getBeaconDataKind().equals("ILS")) {
            direction = "Invalid";
        }
        else if (directionBit == 1) {
            direction = "Left";
        }
        else{
            direction = "Right";
        }
    }

    public void setCount(int inCount) {
        if(inCount < 1 || inCount > 36) {
            count = "Invalid Count";
        }
        else {
            count = Integer.toString(inCount);
        }
    }

    public String getValidity() {
        return validity;
    }

    public String getId() {
        return id;
    }

    public int getValidityIndex() {
        return validityIndex;
    }

    public int getPositionValidIndex() {
        return positionValidIndex;
    }

    public String getPositionValid() {
        return positionValid;
    }

    public String getLatBearing() {
        return latBearing;
    }

    public String getLatDegree() {
        return latDegree;
    }

    public String getLatMinutes() {
        return latMinutes;
    }

    public String getLatMinutesDiv100() {
        return latMinutesDiv100;
    }

    public String getLongBearing() {
        return longBearing;
    }

    public int getLongDegreeIndex() {
        return longDegreeIndex;
    }

    public String getLongDegree() {
        return longDegree;
    }

    public String getLongMinutes() {
        return longMinutes;
    }

    public int getlatMinutesDiv100Index() {
        return latMinutesDiv100Index;
    }

    public String getlatMinutesDiv100() {
        return latMinutesDiv100;
    }

    public String getLongMinutesDiv100() {
        return longMinutesDiv100;
    }

    public int getAltitudeValidIndex() {
        return altitudeValidIndex;
    }

    public String getAltitudeValid() {
        return altitudeValid;
    }

    public int getAltitudeIndex() {
        return altitudeIndex;
    }

    public String getAltitude() {
        return altitude;
    }

    public int getBeaconDataKindIndex() {
        return beaconDataKindIndex;
    }

    public String getBeaconDataKind() {
        return beaconDataKind;
    }

    public int getChannelNumberIndex() {
        return channelNumberIndex;
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public int getChannelSuffixIndex() {
        return channelSuffixIndex;
    }

    public String getChannelSuffix() {
        return channelSuffix;
    }

    public int getIsDMEIndex() {
        return isDMEIndex;
    }

    public String getIsDme() {
        return isDME;
    }

    public int getFrequencyIndex() {
        return frequencyIndex;
    }

    public String getFrequency() {
        return frequency;
    }

    public int getDirCountValidIndex() {
        return dirCountValidIndex;
    }

    public String getDirCountValid() {
        return dirCountValid;
    }

    public int getDirectionIndex() {
        return directionIndex;
    }

    public String getDirection() {
        return direction;
    }

    public int getCountIndex() {
        return countIndex;
    }

    public String getCount() {
        return count;
    }
}
