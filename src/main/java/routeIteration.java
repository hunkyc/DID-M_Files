import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by JMPSUser on 5/4/2016.
 */
public class routeIteration {
    public static void main(String[] args) throws IOException{

        //route variables
        int route1Start = 0;
        int route2Start = 276;
        int route3Start = 552;
        int route4Start = 828;
        int route5Start = 1104;
        int routeValidityIndex = 0;
        int routeIdStartIndex = 1;
        int routeIdEndIndex = 5;
        int routeLength = 276;

        //RoutesDataBase variables
        int routepoint1StartIndex = 6;
        int routepoint2StartIndex = 24;
        int routepointSize = 18;
        int pointValidityIndex = 0;
        int pointIdByte1Index = 1;
        int pointIdByte2Index = 5;
        int altByte1Index = 6;
        int altByte2Index = 7;

        File file = new File("/Users/martinsmith/IdeaProjects/DID-M_Files/src/test/Data/RUTDBASE.CF1");
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();

        //open the file
        //split the file up into 5 routes (1380), parity(2) and garbage(26).
        //the size of each route is 276 bytes, each having 6 bytes of
        //route overhead and 15 routepoints of 18 bytes of route data

        byte[] route1 = new byte[276];
        byte[] route2 = new byte[276];
        byte[] route3 = new byte[276];
        byte[] route4 = new byte[276];
        byte[] route5 = new byte[276];

        for (int i = route1Start; i < routeLength; i++) {
            route1[i] = fileData[i];
        }
            //get the route header
            //byte 1 = is route valid?
        if (route1[routeValidityIndex] == 1) {
            System.out.println("Route Valid");
            //get the route ID
            System.out.print("Route ID = ");
            for (int i = routeIdStartIndex; i <= routeIdEndIndex; i++) {
                //Convert to ascii character and print
                System.out.print(Character.toString((char) route1[i]));
            }
            System.out.println();
        }
        else {//print the validity
            System.out.println("Route invalid");
        }
        //RoutesDataBase data
        //upto 15 routepoints
        byte[] routepoint1 = new byte[18];
        for (int j = 0; j < routepoint1.length; j++) {

            routepoint1[j] = route1[j + routepoint1StartIndex];
        }

        //RoutesDataBase validity
        byte pointValidity = routepoint1[pointValidityIndex];
        //compare it
        if (pointValidity == 1) {//print the validity
            System.out.println("Point Valid");
        }
        else {//print the validity
            System.out.println("Point invalid");
        }

        //RoutesDataBase ID
        System.out.print("Routepoint ID = " );
        for (int k = pointIdByte1Index; k <= pointIdByte2Index; k++) {
            //Convert to ascii character and print
            System.out.print(Character.toString((char) routepoint1[k]));
        }
        System.out.println();

        //RoutesDataBase altitude
        byte Altitude1 = fileData[altByte1Index];
        byte Altitude2 = fileData[altByte2Index];

        int altValue1 = byte2Binary3(Altitude1);
        int altValue2 = byte2Binary4(Altitude2);

        int total = altValue1 + altValue2;
        System.out.print("Altitude is " + total + "m ");
        System.out.println();

        //routepointDistance

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
