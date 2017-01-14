import java.io.*;

public class RouteCheck {

    public static void main(String[] aArgs) throws IOException{
        int routeValidityIndex = 0;
        int routeIdStartIndex = 1;
        int routeIdEndIndex = 5;
        int pointValidityIndex = 6;
        int pointIdByte1Index = 7;
        int pointIdByte2Index = 11;
        int altByte1Index = 12;
        int altByte2Index = 13;
        int legVectorValidityIndex = 14;
        int distanceByte1Index = 15;
        int distanceByte2Index = 16;
        int distanceByte3Index = 17;
        int distanceByte4Index = 18;
        int bearingAngleIndex1 = 19;
        int bearingAngleIndex2 = 20;
        int bearingAngleIndex3 = 21;
        int bearingAngleIndex4 = 22;
        int isEngagementPointIndex = 23;
        int offset = 18;

        File file = new File("C:\\Temp\\RUTDBASE.CF1");
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();

        //Route validity
        //get byte 1
        byte routeValidity = fileData[routeValidityIndex];
        //compare it
        if (routeValidity == 1) {//print the validity
            System.out.println("Route Valid");
        }
        else {//print the validity
            System.out.println("Route invalid");
        }

        //RouteID
        //get bytes 2 - 6
        for (int i = routeIdStartIndex; i <= routeIdEndIndex; i++) {
            //Convert to ascii character and print
            System.out.print(Character.toString((char) fileData[i]));
        }
        System.out.println();

        //First route point
        System.out.println();
        System.out.println("Routepoint 1");
        //Point validity
        //get byte 7
        byte pointValidity = fileData[pointValidityIndex];
        //compare it
        if (pointValidity == 1) {//print the validity
            System.out.println("Point Valid");
        }
        else {//print the validity
            System.out.println("Point invalid");
        }

        //PointID
        //get bytes 8 - 12
        for (int i = pointIdByte1Index; i <= pointIdByte2Index; i++) {
            //Convert to ascii character and print
            System.out.print(Character.toString((char) fileData[i]));
        }
        System.out.println();

        //Altitude
        //get byte 13 - 14
        byte Altitude1 = fileData[altByte1Index];
        byte Altitude2 = fileData[altByte2Index];

        int altValue1 = byte2Binary3(Altitude1);
        int altValue2 = byte2Binary4(Altitude2);

        int total = altValue1 + altValue2;
        System.out.print("Altitude is " + total + "m ");
        System.out.println();

        //Leg vector
        //get byte 15
        byte legVectorValidity = fileData[legVectorValidityIndex];
        //compare it
        if (legVectorValidity == 1) {//print the validity
            System.out.println("Leg vector Valid");
        }
        else {//print the validity
            System.out.println("Leg vector invalid");
        }

        //Leg distance
        //get bytes 16 - 19
        byte distance1 = fileData[distanceByte1Index];
        byte distance2 = fileData[distanceByte2Index];
        byte distance3 = fileData[distanceByte3Index];
        byte distance4 = fileData[distanceByte4Index];

        int distanceValue = byte2Binary1(distance1);
        distanceValue = distanceValue + (byte2Binary2(distance2));
        distanceValue = distanceValue + (byte2Binary3(distance3));
        distanceValue = distanceValue + (byte2Binary4(distance4));
        System.out.print("Distance is " + distanceValue + " ");

        System.out.println();

        //Bearing angle
        //get bytes 20 - 23
        byte bearing1 = fileData[bearingAngleIndex1];
        byte bearing2 = fileData[bearingAngleIndex2];
        byte bearing3 = fileData[bearingAngleIndex3];
        byte bearing4 = fileData[bearingAngleIndex4];

        int bearingValue = (byte2Binary4(bearing1) + byte2Binary3(bearing2) + byte2Binary2(bearing3) + byte2Binary1(bearing4));

        System.out.print("Bearing angle is " + bearingValue + " ");
        System.out.println();

        //Engagement point
        //get byte 24
        byte engagementPoint = fileData[isEngagementPointIndex];
        //compare it
        if (engagementPoint == 1) {//print the validity
            System.out.println("Is an Engagement point");
        }
        else {//print the validity
            System.out.println("Is not an Engagement point");
        }

        //Routepoint 2
        System.out.println();
        System.out.println("Routepoint 2");

        //Point validity
        //get byte 7
        pointValidity = fileData[pointValidityIndex + offset];

        //compare it
        if (pointValidity == 1) {//print the validity
            System.out.println("Point Valid");
        }
        else {//print the validity
            System.out.println("Point invalid");
        }

        //PointID
        //get bytes 8 - 12
        for (int i = pointIdByte1Index + offset; i <= pointIdByte2Index + offset; i++) {
            //Convert to ascii character and print
            System.out.print(Character.toString((char) fileData[i]));
        }
        System.out.println();

        //Altitude
        Altitude1 = fileData[altByte1Index + offset];
        Altitude2 = fileData[altByte2Index + offset];

        altValue1 = byte2Binary3(Altitude1);
        altValue2 = byte2Binary4(Altitude2);

        total = altValue1 + altValue2;
        System.out.print("Altitude is " + total + "m");
        System.out.println();

        //Leg vector
        //get byte 15
        legVectorValidity = fileData[legVectorValidityIndex + offset];
        //compare it
        if (legVectorValidity == 1) {//print the validity
            System.out.println("Leg vector Valid");
        }
        else {//print the validity
            System.out.println("Leg vector invalid");
        }

        //Leg distance
        //get bytes 16 - 19

        distance1 = fileData[distanceByte1Index + offset];
        distance2 = fileData[distanceByte2Index + offset];
        distance3 = fileData[distanceByte3Index + offset];
        distance4 = fileData[distanceByte4Index + offset];

        distanceValue = byte2Binary1(distance1);
        distanceValue = distanceValue + byte2Binary2(distance2);
        distanceValue = distanceValue + byte2Binary3(distance3);
        distanceValue = distanceValue + byte2Binary4(distance4);

        System.out.print("Distance is " + distanceValue + " ");
        System.out.println();

        //Bearing angle
        //get bytes 20 - 23
        bearing1 = fileData[bearingAngleIndex1 + offset];
        bearing2 = fileData[bearingAngleIndex2 + offset];
        bearing3 = fileData[bearingAngleIndex3 + offset];
        bearing4 = fileData[bearingAngleIndex4 + offset];
        bearingValue = (byte2Binary4(bearing1) + byte2Binary3(bearing2) + byte2Binary2(bearing3) + byte2Binary1(bearing4));

        System.out.print("Bearing angle is " + bearingValue + " ");
        System.out.println();

        //Engagement point
        //get byte 24
        engagementPoint = fileData[isEngagementPointIndex + offset];
        //compare it
        if (engagementPoint == 1) {//print the validity
            System.out.println("Is an Engagement point");
        }
        else {//print the validity
            System.out.println("Is not an Engagement point");
        }
    }//end of main

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
}//end of class