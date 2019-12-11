import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.UnsupportedEncodingException;

/**
 * Created by martinsmith on 22/8/19.
 */
public class DidIdentifier {
//DID_Data
    String didNumber;
    int didNumberIndexStart = 1;
    int didNumberIndexEnd = 2;
    int didNumberLength = 2;

    String didType;
    int didTypeIndex = 3;
    int didTypelength = 1;

    String didName;
    int didNameIndexStart = 4;
    int didNameIndexEnd = 11;
    int didNameLength = 8;

    String didDateAndTimeYy;
    int didDateAndTimeIndexYyStart = 12;
    int didDateAndTimeIndexYyEnd = 13;
    int didDateAndTimeLengthYy1 = 2;

    String didDateAndTimeMm;
    int didDateAndTimeIndexMmStart = 14;
    int didDateAndTimeLengthMm = 1;

    String didDateAndTimeDd;
    int didDateAndTimeIndexDdStart = 15;
    int didDateAndTimeDdLength = 1;

    String didDateAndTimeHh;
    int didDateAndTimeIndexHhStart = 16;
    int didDateAndTimeLengthYy = 1;

    String didDateAndTimeMin;
    int didDateAndTimeIndexMinStart = 17;
    int didDateAndTimeLengthMin = 1;

    String didDateAndTimeSs;
    int didDateAndTimeIndexSsStart = 18;
    int didDateAndTimeSsLength = 1;
//HC_Data
    String tailNumber;
    int tailNumberIndexStart = 19;
    int tailNumberIndexEnd = 30;
    int tailNumberLength = 12;

    String hcDateAndTimeYy;
    int hcDateAndTimeIndexYyStart = 31;
    int hcDateAndTimeIndexYyEnd = 32;
    int hcDateAndTimeYyLength = 2;

    String hcDateAndTimeMm;
    int hcDateAndTimeIndexMmStart = 33;
    int hcDateAndTimeMmLength = 1;

    String hcDateAndTimeDd;
    int hcDateAndTimeIndexDdStart = 34;
    int hcDateAndTimeDdLength = 1;

    String hcDateAndTimeHh;
    int hcDateAndTimeIndexHhStart = 35;
    int hcDateAndTimeHhLength = 1;

    String hcDateAndTimeMin;
    int hcDateAndTimeIndexMinStart = 36;
    int hcDateAndTimeMinLength = 1;

    String hcDateAndTimeSs;
    int hcDateAndTimeIndexSsStart = 37;
    int hcDateAndTimeSsLength = 1;

//Crew_ID
    String crewName;
    int crewNameIndexStart = 38;
    int crewNameIndexEnd = 49;
    int crewNameLength = 12;

    String militaryUnit;
    int militaryUnitIndexStart = 50;
    int militaryUnitIndexEnd = 61;
    int militaryUnitLength = 12;

//Constructor
    public DidIdentifier() {
        didNumber = "";
        didType = "";
        didName = "";
        didDateAndTimeYy = "";
        didDateAndTimeMm = "";
        didDateAndTimeDd = "";
        didDateAndTimeHh = "";
        didDateAndTimeMin = "";
        didDateAndTimeSs = "";
        tailNumber = "";
        hcDateAndTimeYy = "";
        hcDateAndTimeMin = "";
        hcDateAndTimeDd = "";
        hcDateAndTimeHh = "";
        hcDateAndTimeMin = "";
        hcDateAndTimeSs = "";
        crewName = "";
        militaryUnit = "";
    }

    //Setters
    public void setDidNumber(int startIndex, int endIndex, byte[] filedata) {
        didNumber = didNumber.concat((changeByteToString(filedata[startIndex-1])));
        didNumber = didNumber.concat((changeByteToString(filedata[endIndex-1])));
    }

    public void setDidType(byte filedata) {
        if (filedata == 1) {
            didType = "Logistic_DTD";
        }
        else if (filedata == 2) {
            didType = "Mission_DTD";
        }
        else {
            didType = "INVALID";
        }
    }

    public void setDidName(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        byte[] didNameByte = new byte[didNameLength];
        for (int i = 0; i <= didNameLength - 1; i++) {
            didNameByte[i] = filedata[i + (startIndex -1)];
            didName = new String(didNameByte, "UTF-8");
        }
    }

    public void setDidDateAndTimeYy(int  startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        byte[] didDateAndTimeYyByte = new byte[didDateAndTimeLengthYy1];
        didDateAndTimeYyByte[0] = filedata[startIndex];
        didDateAndTimeYyByte[1] = filedata[endIndex];
        didDateAndTimeYy = new String(didDateAndTimeYyByte, "UTF-8");
    }

    public void setDidDateAndTimeMm(int didDateAndTimeMmIndexStart, byte[] filedata) throws UnsupportedEncodingException {
        byte[] didDateAndTimeMmByte = new byte[1];
        didDateAndTimeMmByte[0] = filedata[didDateAndTimeMmIndexStart];
        didDateAndTimeMm = new String(didDateAndTimeMmByte, "UTF-8");
    }

    public void setDidDateAndTimeDd(int didDateAndTimeDdIndexStart, byte filedata[]) {
        byte[] didDataAndTimeDdByte = new byte[1];
        didDataAndTimeDdByte[0] = filedata[didDateAndTimeDdIndexStart];
        didDateAndTimeDd = new String(didDateAndTimeDd);
    }

    public void setDidDateAndTimeHh(int didDateAndTimeIndexHhStart, byte[] filedata) {
        byte[] didDataAndTimeHhByte = new byte[1];
        didDataAndTimeHhByte[0] = filedata[didDateAndTimeIndexHhStart];
        didDateAndTimeHh = new String(didDateAndTimeHh);
    }

    public void setDidDateAndTimeMin(int didDateAndTimeIndexMinStart, byte[] filedata) {
        byte[] didDataAndTimeMinByte = new byte[1];
        didDataAndTimeMinByte[0] = filedata[didDateAndTimeIndexMinStart];
        didDateAndTimeMin = new String(didDateAndTimeMin);
    }

    public void setDidDateAndTimeSs(int didDateAndTimeIndexSsStart, byte[] filedata) {
        byte[] didDataAndTimeSsByte = new byte[1];
        didDataAndTimeSsByte[0] = filedata[didDateAndTimeIndexMinStart];
        didDateAndTimeMin = new String(didDateAndTimeMin);
    }

    public void setDidTailNumber(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        byte[] tailNumberByte = new byte[tailNumberLength];
        for (int i = 0; i <= didNameLength - 1; i++) {
            tailNumberByte[i] = filedata[i + (startIndex -1)];
            tailNumber = new String(tailNumberByte, "UTF-8");
        }
    }

    public void setHcDateAndTimeYy(int  startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        byte[] hcDateAndTimeYyByte = new byte[hcDateAndTimeYyLength];
        hcDateAndTimeYyByte[0] = filedata[startIndex];
        hcDateAndTimeYyByte[1] = filedata[endIndex];
        hcDateAndTimeYy = new String(hcDateAndTimeYyByte, "UTF-8");
    }

    public void setHcDateAndTimeMm(int didDateAndTimeMmIndexStart, byte[] filedata) throws UnsupportedEncodingException {
        byte[] didDateAndTimeMmByte = new byte[1];
        didDateAndTimeMmByte[0] = filedata[didDateAndTimeMmIndexStart];
        didDateAndTimeMm = new String(didDateAndTimeMmByte, "UTF-8");
    }

    public void setHcDateAndTimeDd(int didDateAndTimeDdIndexStart, byte filedata[]) {
        byte[] didDataAndTimeDdByte = new byte[1];
        didDataAndTimeDdByte[0] = filedata[didDateAndTimeDdIndexStart];
        didDateAndTimeDd = new String(didDateAndTimeDd);
    }

    public void setHcDateAndTimeHh(int didDateAndTimeIndexHhStart, byte[] filedata) {
        byte[] didDataAndTimeHhByte = new byte[1];
        didDataAndTimeHhByte[0] = filedata[didDateAndTimeIndexHhStart];
        didDateAndTimeHh = new String(didDateAndTimeHh);
    }

    public void setCrewName(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        byte[] crewNameByte = new byte[tailNumberLength];
        for (int i = 0; i <= didNameLength - 1; i++) {
            crewNameByte[i] = filedata[i + (startIndex -1)];
            tailNumber = new String(crewNameByte, "UTF-8");
        }
    }

    public void setMilitaryUnit(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        byte[] militaryUnitByte = new byte[militaryUnitLength];
        for (int i = 0; i <= militaryUnitLength - 1; i++) {
            militaryUnitByte[i] = filedata[i + (startIndex -1)];
            militaryUnit = new String(militaryUnitByte, "UTF-8");
        }
    }

    //Getters (indexes)
    public int getDidNumberStart() {
        return didNumberIndexStart;
    }

    public int getDidNumberEnd() {
        return didNumberIndexEnd;
    }

    public int getDidTypeIndex() {
        return didTypeIndex - 1;
    }

    public int getDidNameIndexStart() {
        return didNameIndexStart;
    }

    public int getDidNameIndexEnd() {
        return didNameIndexEnd;
    }

    public int getDidDateAndTimeYyIndexStart() {
        return didDateAndTimeIndexYyStart;
    }

    public int getDidDateAndTimeYyIndexEnd() {
        return didDateAndTimeIndexYyEnd;
    }

    public int getDidDateAndTimeMmIndexStart() {
        return didDateAndTimeIndexMmStart;
    }

    public int getDidDateAndTimeDdIndexStart() {
        return didDateAndTimeIndexDdStart;
    }

    public int getDidDateAndTimeHhIndexStart() {
        return didDateAndTimeIndexHhStart;
    }

    public int getDidDateAndTimeMinIndexStart() {
        return didDateAndTimeIndexMinStart;
    }

    public int getDidDateAndTimeSsIndexStart() {
        return didDateAndTimeIndexSsStart;
    }

    public int getDidTailNumberIndexStart() {
        return tailNumberIndexStart;
    }

    public int getDidTailNumberIndexEnd() {
        return tailNumberIndexEnd;
    }

    public int getHcDateAndTimeYyIndexStart() {
        return hcDateAndTimeIndexYyStart;
    }

    public int gethcDateAndTimeYyIndexEnd() {
        return hcDateAndTimeIndexYyEnd;
    }

    public int getHcDateAndTimeMmIndexStart() {
        return hcDateAndTimeIndexMmStart;
    }

    public int getHcDateAndTimeDdIndexStart() {
        return hcDateAndTimeIndexDdStart;
    }

    public int getHcDateAndTimeHhIndexStart() {
        return hcDateAndTimeIndexHhStart;
    }

    public int getCrewNameIndexStart() {return crewNameIndexStart;}

    public int getCrewNameIndexEnd() {return crewNameIndexEnd;}

    public int getMilitaryUnitIndexStart() {
        return militaryUnitIndexStart;
    }

    public int getMilitaryUnitIndexEnd() {
        return militaryUnitIndexEnd;
    }


    //Getters (Data)

    public String getDidNumber() {
        return didNumber;
    }

    public String getDidType() {
        return didType;
    }

    public String getDidName() {
        return didName;
    }

    public String getDidDateAndTimeYy() {
        return didDateAndTimeYy;
    }

    public String getDidDateAndTimeMm() {
        return didDateAndTimeMm;
    }

    public String getDidDateAndTimeDd() {
        return didDateAndTimeDd;
    }

    public String getDidDateAndTimeHh() {
        return didDateAndTimeHh;
    }

    public String getDidDateAndTimeMin() {
        return didDateAndTimeMin;
    }

    public String getDidDateAndTimeSs() {
        return didDateAndTimeSs;
    }

    public String getDidTailNumber() {
        return tailNumber;
    }

    public String getHcDateAndTimeYy() {
        return hcDateAndTimeYy;
    }

    public String getHcDateAndTimeMm() {
        return hcDateAndTimeMm;
    }

    public String getHcDateAndTimeDd() {
        return hcDateAndTimeDd;
    }

    public String getHcDateAndTimeHh() {
        return hcDateAndTimeHh;
    }

    public String getCrewName() { return crewName; }

    public String getMilitaryUnit() {
        return militaryUnit;
    }

    //other methods

    public static String changeByteToString(byte fromFile) {
        char input = ((char) fromFile);
        String output = "";
        switch(input) {
            case 0:
                output = "0";
                break;
            case 1:
                output = "1";
                break;
            case 2:
                output = "2";
                break;
            case 3:
                output = "3";
                break;
            case 4:
                output = "4";
                break;
            case 5:
                output = "5";
                break;
            case 6:
                output = "6";
                break;
            case 7:
                output = "7";
                break;
            case 8:
                output = "8";
                break;
            case 9:
                output = "9";
                break;
            case 'A':
                output = "A";
                break;
            case 'B':
                output = "B";
                break;
            case 'C':
                output = "C";
                break;
            case 'D':
                output = "D";
                break;
            case 'E':
                output = "E";
                break;
            case 'F':
                output = "F";
                break;
        }
        return output;
    }

}
