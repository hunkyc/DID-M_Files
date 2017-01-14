public class ReferencePoint {

    int validityIndex = 0;
    int latBearingIndex = 1;
    int latDegreeIndex = 2;
    int latMinutesIndex = 3;
    int latMinutesDiv100Index = 4;
    int longBearingIndex = 5;
    int longDegreeIndex = 6;
    int longMinutesIndex = 8;
    int longMinutesDiv100Index = 9;
    int pointIdIndex = 10;
    int selectedGeoRefSystemIndex = 15;

    String Validity;
    String latBearing;
    String latDegree;
    String latMinutes;
    String latMinutesDiv100;
    String longBearing;
    String longDegree;
    String longMinutes;
    String longMinutesDiv100;
    String pointId;
    String selectedGeoRefSystem;

    public ReferencePoint() {
        Validity = "";
        latBearing = "";
        latDegree = "";
        latMinutes = "";
        latMinutesDiv100 = "";
        longBearing = "";
        longDegree = "";
        longMinutes = "";
        longMinutesDiv100 = "";
        pointId = "";
        selectedGeoRefSystem = "";
    }

    public void setValidity(int validityBit) {

        //compare it
        if (validityBit == 1) {
            Validity = "Reference Point Valid";
        }
        else {
            Validity = "Reference Point invalid";
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

    public void setPointId(byte[] fileData) {
        //get the byte index
        byte PId = fileData[pointIdIndex];

        for (int i = pointIdIndex; i < (pointIdIndex + 5); i++ ) {
            String temp = toASCII(fileData[i]);
            pointId = pointId.concat(temp);
        }
    }

    public void setGeoRefSystem(byte[] fileData) {
        //get byte index
        byte GRS = fileData[selectedGeoRefSystemIndex];

        switch (GRS) {
            case 01: {
                selectedGeoRefSystem = "GRS80";
                break;
            }
            case 02: {
                selectedGeoRefSystem = "Hayford_Internations";
                break;
            }
            case 03: {
                selectedGeoRefSystem = "Bessel";
                break;
            }
            case 04: {
                selectedGeoRefSystem = "Clark_1866";
                break;
            }
            case 05: {
                selectedGeoRefSystem = "Clark_1880";
                break;
            }
            case 06: {
                selectedGeoRefSystem = "Everest";
                break;
            }
            default: {
                selectedGeoRefSystem = "Invalid";
                break;
            }
        }
    }

    public String getValidity() {
        return Validity;
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

    public String getLongDegree() {
        return longDegree;
    }

    public String getLongMinutes() {
        return longMinutes;
    }

    public String getLongMinutsDiv100() {
        return longMinutesDiv100;
    }

    public String getPointId() {
        return pointId;
    }

    public int getLongDegreeIndex() {
        return longDegreeIndex;
    }

    public String getSelectedGeoRefSystem() {
        return selectedGeoRefSystem;
    }

    public int getValidityIndex() {
        return validityIndex;
    }

    private static String toASCII(int value) {
        int length = 1;
        StringBuilder builder = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            builder.append((char) ((value >> (8 * i)) & 0xFF));
        }
        return builder.toString();
    }
}