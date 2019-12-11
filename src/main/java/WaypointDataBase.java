/**
 * Created by martinsmith on 22/12/17.
 */
public class WaypointDataBase {

    int validityIndex = 0;
    int idStartIndex = 1;
    int idEndIndex = 5;
    int positionValidIndex = 6;
    int latBearingIndex = 7;
    int latDegreeIndex = 8;
    int latMinutesIndex = 9;
    int latMinutesDiv100Index = 9;
    int longBearingIndex = 10;
    int longDegreeIndex = 12;
    int longMinutesIndex = 13;
    int longMinutesDiv100Index = 14;
    int altitudeValidIndex = 15;
    int altitudeIndex = 16;

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

    public WaypointDataBase() {
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
    }
    //setters
    public void setValidity(int validityBit) {

        //compare it
        if (validityBit == 1) {
            validity = "WaypointDataBase Valid";
        }
        else {
            validity = "WaypointDataBase Invalid";
        }
    }

    public void setId(byte[] waypoint) {
        for (int i = idStartIndex; i <= idEndIndex; i++) {
            //Convert to ascii character and print
            id = id.concat(Character.toString((char) waypoint[i]));
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

    //getters
    public int getValidityIndex() {return validityIndex;}

    public String getValidity() {return validity;}

    public int getIdStartIndex() {return idStartIndex;}

    public int getIdEndIndex() {return idEndIndex;}

    public String getId() {return id;}

    public int getPositionValidIndex() {return positionValidIndex;}

    public String getPositionValid() {return positionValid;}

    public int getLatBearingIndex() {return latBearingIndex;}

    public String getLatBearing() {return latBearing;}

    public int getLatDegreeIndex() {return latDegreeIndex;}

    public String getLatDegree() {return latDegree;}

    public int getLatMinutesIndex() {return latMinutesIndex;}

    public String getLatMinutes() {return latMinutes;}

    public int getLatMinutesDiv100Index() {return latMinutesDiv100Index;}

    public String getLatMinutesDiv100() {return latMinutesDiv100;}

    public int getLongBearingIndex() {return longBearingIndex;}

    public String getLongBearing() {return longBearing;}

    public int getLongDegreeIndex() {return longDegreeIndex;}

    public String getLongDegree() {return longDegree;}

    public int getLongMinutesIndex() {return longMinutesIndex;}

    public String getLongMinutes() {return longMinutes;}

    public String getLongMinutesDiv100() {return longMinutesDiv100;}
}
