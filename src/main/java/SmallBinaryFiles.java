import java.io.*;
import java.util.Arrays;
//import org.apache.commons.codec.binary.Hex;

public class SmallBinaryFiles {

    public static void main(String[] aArgs) throws FileNotFoundException, IOException{
        int WaypointValidityIndex = 0;
        int WaypointIdStartIndex = 1;
        int WaypointIdEndIndex = 5;
        int PosnValidityIndex = 6;
        int latBearingIndex = 7;
        int latDegreesIndex = 8;
        int latMinutesIndex = 9;
        int latMinutes_100Index = 11;
        int longBearingIndex = 11;
        int longDegreesIndexStart = 12;
        int longDegreesIndexEnd = 13;
        int longMinutesIndex = 14;
        int longMinutes_100Index = 15;
        int altValidityIndex = 16;
        int altIndexStart = 17;
        int altIndexEnd = 18;


        File file = new File("C:\\Temp\\WAYDBASE.CF1");
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();

        //WaypointDataBase validity
        //get byte 1
        byte WpValidity = fileData[WaypointValidityIndex];
        //compare it
        if (WpValidity == 1) {//print the validity
            System.out.println("WaypointDataBase Valid");
        }
        else {//print the validity
            System.out.println("WaypointDataBase invalid");
        }

        //WaypointID
        //get bytes 2 - 6
        for (int i = WaypointIdStartIndex; i <= WaypointIdEndIndex; i++) {
            //Convert to ascii character and print
            System.out.print(Character.toString((char) fileData[i]));
        }
        System.out.println();

        //Position validity
        //get byte 7
        byte PosnValidity = fileData[PosnValidityIndex];
        //compare it
        if (PosnValidity == 1) {//print the validity
            System.out.println("Position Valid");
        }
        else {//print the validity
            System.out.println("Position invalid");
        }

        //Latitude
        //Lat bearing
        //get byte 8
        byte latBearing = fileData[latBearingIndex];
        System.out.print(Character.toString((char) latBearing) + " ");

        //Lat degrees
        byte latDegrees = fileData[latDegreesIndex];
        System.out.print(latDegrees + " ");

        //Lat minutes
        byte latMinutes = fileData[latMinutesIndex];
        System.out.print(latMinutes + " ");

        //Lat minutes_100
        byte latMinutes_100 = fileData[latMinutes_100Index];
        System.out.print(latMinutes_100 + " ");

        //Longitude
        //Long bearing
        //get byte 8
        byte longBearing = fileData[longBearingIndex];
        System.out.print(Character.toString((char) longBearing) + " ");

        //Long degrees
        byte longDegrees1 = fileData[longDegreesIndexStart];
        byte longDegrees2 = fileData[longDegreesIndexEnd];// see where this goes when we need it.

        int longDegreeValue = byte2Binary(longDegrees1);
        System.out.print(longDegreeValue + " ");

        //Long minutes
        byte longMinutes = fileData[longMinutesIndex];
        System.out.print(longMinutes + " ");

        //Long minutes
        byte longMinutes_100 = fileData[latMinutes_100Index];
        System.out.println(longMinutes_100 + " ");

        //Altitude
        //get byte 17
        byte  altValidity = fileData[altValidityIndex];
        //compare it
        if (altValidity == 1) {//print the validity
            System.out.println("Altitude Valid");
        }
        else {//print the validity
            System.out.println("Altitude invalid");
        }

        //Altitude
        byte Altitude1 = fileData[altIndexStart];
        byte Altitude2 = fileData[altIndexEnd];// see where this goes when we need it.

        int AltValue = byte2Binary(Altitude1);
        System.out.print(AltValue + " ");

    }//end of main

    public static int byte2Binary(byte b) {
        int val = 0;
        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        int total = 0;
        for (int i = 0; i < s1.length(); i++) {
            switch (s1.charAt(i)) {
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