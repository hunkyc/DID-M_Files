import java.io.*;

/**
 * Created by martinsmith on 13/05/2016.
 * //Opens waydbase.cf1 file
 * ensure that the elements are in the right place and in the correct format
 *
 */
public class waypointCheckDriver {

    public static void main(String[] args) throws IOException {

        //variables
        FileInputStream input = null;
        String filename = "/Users/martinsmith/IdeaProjects/DID-M_Files/src/test/Data/WAYDBASE.CF1";
        int waypointLength = 19;
        byte[] currentWaypoint;
        String temp = "";

        //open the file
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));

        currentWaypoint = new byte[19];

        //read the first 19 bytes of the file into the currentWaypoint byte array
        for (int i = 0; i < 19; i++) {
            currentWaypoint[i] = dis.readByte();
        }

        //print the contents of the current waypoint byte array
        for (int j = 0; j < 19; j++) {
            System.out.printf("%02x ", currentWaypoint[j]);
        }
    }//end of main
}
