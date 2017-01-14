
public class routepoint {

    int pointValidIndex = 0;
    int idStartIndex = 1;
    int idEndIndex = 5;
    int legAltitudeStartIndex = 6;
    int legAltitudeEndIndex = 7;
    int legVectorValidityIndex = 8;
    int legDistanceStartIndex = 9;
    int legDistanceEndIndex = 12;
    int legBearingStartIndex = 13;
    int legBearingEndIndex = 16;
    int isEngagementPointIndex = 17;

    String routepointValid;
    String id;
    String legAltitude;
    String legVectorValid;
    String legDistance;
    String legBearing;
    String isEngagementPoint;

    public routepoint() {
        routepointValid = "";
        id = "";
        legAltitude = "";
        legVectorValid = "";
        legDistance = "";
        legBearing = "";
        isEngagementPoint = "";
    }


    public routepoint(byte[] routepoint) {

        routepointValid = setRoutepointValid(routepoint, routepointValid);

        id = setId(routepoint, id);

        legAltitude = setLegAltitude(routepoint, legAltitude);

        legVectorValid = setLegVectorValid(routepoint, legVectorValid);

        legDistance = setLegDistance(routepoint, legDistance);

        legBearing = setLegBearing(routepoint, legBearingStartIndex, legBearingEndIndex, legBearing);

        isEngagementPoint = setIsEngagmentPoint(routepoint[isEngagementPointIndex], isEngagementPoint);
    }//end of constructor

//    public String setRoutepointValid() {
//
//    }

    public String setRoutepointValid(byte[] routepoint, String routepointValid) {
        byte pointValidity = routepoint[pointValidIndex];

        //compare it
        if (pointValidity == 1) {
            routepointValid = "Point Valid";
        }
        else {
            routepointValid = "Point invalid";
        }
        return routepointValid;
    }

    public String setId(byte[] routepoint, String id) {
        for (int i = idStartIndex; i <= idEndIndex; i++) {
            //Convert to ascii character and print
            id = id.concat(Character.toString((char) routepoint[i]));
        }
        return id;
    }

    public String setLegAltitude(byte[] routepoint, String legAltitude ){
        byte Altitude1 = routepoint[legAltitudeStartIndex];
        byte Altitude2 = routepoint[legAltitudeEndIndex];

        int altValue1 = byte2Binary3(Altitude1);
        int altValue2 = byte2Binary4(Altitude2);

        int total = altValue1 + altValue2;
        legAltitude = "Altitude is " + total + "m ";
        return legAltitude;
    }

    public String setLegVectorValid(byte[] routepoint, String legVectorValid) {
        if (routepoint[legVectorValidityIndex] == 1) {//print the validity
            legVectorValid = "Leg vector Valid";
        }
        else {//print the validity
            legVectorValid = "Leg vector Invalid";
        }
        return legVectorValid;
    }

    public String setLegDistance(byte[] routepoint, String legDistance) {
        byte distance1 = routepoint[legDistanceStartIndex];
        byte distance2 = routepoint[legDistanceStartIndex + 1];
        byte distance3 = routepoint[legDistanceStartIndex + 2];
        byte distance4 = routepoint[legDistanceEndIndex];

        int distanceValue = byte2Binary1(distance1);
        distanceValue = distanceValue + (byte2Binary2(distance2));
        distanceValue = distanceValue + (byte2Binary3(distance3));
        legDistance = Integer.toString(distanceValue + (byte2Binary4(distance4)));
        return legDistance;
    }

    public String setLegBearing(byte[] route, int legBearingStartIndex, int legDistanceEndIndex, String legBearing) {
        byte bearing1 = route[legBearingStartIndex];
        byte bearing2 = route[legBearingStartIndex + 1];
        byte bearing3 = route[legBearingStartIndex + 2];
        byte bearing4 = route[legBearingStartIndex + 3];
        legBearing = Integer.toString((byte2Binary4(bearing1) + byte2Binary3(bearing2) + byte2Binary2(bearing3) + byte2Binary1(bearing4)));
        return legBearing;
    }

    public String setIsEngagmentPoint(byte isEngagementPointByte, String isEngagementPoint) {
        if (isEngagementPointByte == 1) {//print the validity
            isEngagementPoint = "Is Engagement Point";
        }
        else {//print the validity
            isEngagementPoint = "Is not Engagement Point";
        }
        return isEngagementPoint;
    }

    public String getRoutepointValid() {
        return routepointValid;
    }

    public String getId() {
        return id;
    }

    public String getAltitude() {
        return legAltitude;
    }

    public String getLegVectorValid() {
        return legVectorValid;
    }

    public String getLegDistance() {
        return legDistance;
    }

    public String getLegBearing() {
        return legBearing;
    }

    public String getIsEngagmentPoint() {
        return isEngagementPoint;
    }

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
