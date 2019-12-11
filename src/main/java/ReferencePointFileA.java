import java.io.UnsupportedEncodingException;

/**
 * Created by martinsmith on 29/11/19.
 */
public class ReferencePointFileA {
    int validityIndex = 1;
    int latBearingIndex = 2;
    int latDegreeIndex = 3;
    int latMinutesIndex = 4;
    int latMinutesDiv100Index = 5;
    int longBearingIndex = 6;
    int longDegreeIndexStart = 7;
    int longDegreeIndexEnd = 8;
    int longDegreeLength = 2;
    int longMinutesIndex = 9;
    int longMinutesDiv100Index = 10;
    int pointIdIndexStart = 11;
    int pointIdIndexEnd = 15;
    int pointIdlength = 5;
    int selRefGeoSystemIndex = 16;

    String validity = "";
    String latBearing = "";
    String latDegree = "";
    String latMinutes = "";
    String latMinutesDiv100 = "";
    String longBearing = "";
    String longDegree = "";
    String longMinutes = "";
    String longMinutesDiv100 = "";
    String pointId = "";
    String selRefGeoSystem = "";

    public ReferencePointFileA() {
        validity = "val";
        latBearing = "LBear";
        latDegree = "LDeg";
        latMinutes = "LMin";
        latMinutesDiv100 = "LMinDiv";
        longBearing = "LoBear";
        longDegree = "LoDeg";
        longMinutes = "LoMin";
        longMinutesDiv100 = "LoMinDiv";
        pointId = "Pt";
        selRefGeoSystem = "SRGS";
    }

    //setters and getters
    public String getValidity() {
        return validity;
    }

    public String getlatBearing() {
        return latBearing;
    }

    public String getLatDegree() {
        return latDegree;
    }

    public String getLatMinutes() {
        return latMinutes;
    }

    public String getLatminutesDiv100() {
        return latMinutesDiv100;
    }

    public String getLongBearing() {
        return longBearing;
    }

    public String getLongDegrees() {
        return longDegree;
    }

    public String getLongMinutes() {
        return longMinutes;
    }

    public String getLongMinutesDiv100() {
        return longMinutesDiv100;
    }

    public String getPointId() {
        return pointId;
    }

    public String getSelRefGeoSystem() {
        return selRefGeoSystem;
    }

    public int getValidityIndex() {
        return validityIndex;
    }

    public int getLatBearingIndex() {
        return latBearingIndex;
    }

    public int getLatDegreeIndex() {
        return latDegreeIndex;
    }

    public int getLatMinutesIndex() {
        return latMinutesIndex;
    }

    public int getLatMinutesDiv100Index() {
        return latMinutesDiv100Index;
    }

    public int getLongBearingIndex() {
        return longBearingIndex;
    }

    public int getLongDegreeIndexStart() {
        return longDegreeIndexStart;
    }

    public int getLongDegreeIndexEnd() {
        return longDegreeIndexEnd;
    }

    public int getLongMinutesIndex() {
        return longMinutesIndex;
    }

    public int getLongMinutesDiv100Index() {
        return longMinutesDiv100Index;
    }

    public int getPointIdIndexStart() {
        return pointIdIndexStart;
    }

    public int getPointIdIndexEnd() {
        return pointIdIndexEnd;
    }

    public int getSelRefGeoSystemIndex() {
        return selRefGeoSystemIndex;
    }

    public void setValidity(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getValidityIndex())]));

        //TODO cpnvert binary to decimal

        if(temp.equals("0")) {
            validity = "Invalid";
        }
        else if(temp.equals("1")) {
            validity = "Valid";
        }
        else {
            validity = "Error";
        }
    }

    public void setLatBearing(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getLatBearingIndex())]));

        //TODO convert Binary to decimal

        latBearing = temp;
    }

    public void setLatDegree(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getLatDegreeIndex())]));

        //TODO convert Binary to decimal

        latDegree = temp;
    }

    public void setLatMinutes(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getLatMinutesIndex())]));

        //TODO convert Binary to decimal

        latMinutes = temp;
    }

    public void setLatMinutesDiv100(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getLatMinutesDiv100Index())]));

        //TODO convert Binary to decimal

        latMinutesDiv100 = temp;
    }

    public void setLongBearing(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getLongBearingIndex())]));

        //TODO convert Binary to decimal

        longBearing = temp;
    }

    public void setLongDegree(byte[] fileData) {
        String temp = "";

        for (int i = getLongDegreeIndexStart(); i == getLongDegreeIndexEnd(); i++) {
            temp = temp.concat(Integer.toBinaryString( (int) fileData[i]));
        }
    }

    public void setLongMinutes(byte[] fileData) {
        String temp = (Integer.toBinaryString( (int) fileData[(getLongMinutesIndex())]));

        //TODO convert Binary to decimal

        longMinutes = temp;
    }

    public void setLongMinutesDiv100(byte[] fileData) {
        int i = fileData[getLongMinutesDiv100Index()];
        longMinutesDiv100 = binary2Decimal(i);
    }

    public void setPointId(byte[] fileData) {
        String temp = "";

        for (int i = getPointIdIndexStart(); i == getPointIdIndexEnd(); i++) {
            temp = temp.concat(Integer.toBinaryString( (int) fileData[i]));
        }

        pointId = temp;
    }

    public void setSelRefGeoSystem(byte[] fileData) {
        int i = fileData[getSelRefGeoSystemIndex()];
        selRefGeoSystem = binary2Decimal(i);
    }

    public String binary2Decimal(int bin) {
        String temp = "";
        switch (bin) {
            case 0: temp =  "0";
            break;
            case 1: temp =  "1";
            break;
            case 2: temp =  "2";
            break;
            case 3: temp =  "3";
            break;
            case 4: temp =  "4";
            break;
            case 5: temp =  "5";
            break;
            case 6: temp =  "6";
            break;
            case 7: temp =  "7";
            break;
            case 8: temp =  "8";
            break;
            case 9: temp =  "9";
            break;
            case 10: temp =  "10";
            break;
            case 11: temp =  "11";
            break;
            case 12: temp =  "12";
            break;
            case 13: temp =  "13";
            break;
            case 14: temp =  "14";
            break;
            case 15: temp =  "15";
            break;
        }
        return temp;
    }
}
