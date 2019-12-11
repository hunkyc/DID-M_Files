//import com.sun.tools.javac.tree.DCTree;

import java.io.*;

/**
 * Created by martinsmith on 12/11/19.
 */
public class DidIdentifierDriver {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        int location;
        int locationStart;
        int locationEnd;

        File file = new File("/Users/martinsmith/IdeaProjects/DID-M_Files/src/test/Data/DID_NAME.CF1");
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();

        //instantiate the DidIdentifier class
        DidIdentifier identifier = new DidIdentifier();

        //Set the elements from the file
        //DID Number
        locationStart = identifier.getDidNumberStart();
        locationEnd = identifier.getDidNumberEnd();
        identifier.setDidNumber(locationStart, locationEnd, fileData);

        //DID Type
        location = identifier.getDidTypeIndex();
        identifier.setDidType(fileData[location]);

        //DID Name
        locationStart = identifier.getDidNameIndexStart();
        locationEnd = identifier.getDidNameIndexEnd();
        identifier.setDidName(locationStart, locationEnd, fileData);

        //DID Date and Time year
        locationStart = identifier.getDidDateAndTimeYyIndexStart();
        locationEnd = identifier.getDidDateAndTimeYyIndexEnd();
        identifier.setDidDateAndTimeYy(locationStart, locationEnd, fileData);

        //DID Date And Time Mm
        locationStart = identifier.getDidDateAndTimeMmIndexStart();
        identifier.setDidDateAndTimeMm(locationStart, fileData);

        //DID Date And Time Dd
        locationStart = identifier.getDidDateAndTimeDdIndexStart();
        identifier.setDidDateAndTimeDd(locationStart, fileData);

        //DID Date And Time Hh
        locationStart = identifier.getDidDateAndTimeHhIndexStart();
        identifier.setDidDateAndTimeHh(locationStart, fileData);

        //DID Date And Time Min
        locationStart = identifier.getDidDateAndTimeMinIndexStart();
        identifier.setDidDateAndTimeMin(locationStart, fileData);


        //DID Date And Time Seconds
        locationStart = identifier.getDidDateAndTimeSsIndexStart();
        identifier.setDidDateAndTimeSs(locationStart, fileData);

        //Tail number
        locationStart = identifier.getDidTailNumberIndexStart();
        locationEnd = identifier.getDidTailNumberIndexEnd();
        identifier.setDidTailNumber(locationStart, locationEnd, fileData);

        //HC Date and Time YY
        locationStart = identifier.getHcDateAndTimeYyIndexStart();
        locationEnd = identifier.gethcDateAndTimeYyIndexEnd();
        identifier.setHcDateAndTimeYy(locationStart, locationEnd, fileData);

        //HC Date And Time Mm
        locationStart = identifier.getHcDateAndTimeMmIndexStart();
        identifier.setHcDateAndTimeMm(locationStart, fileData);

        //HC Date And Time Dd
        locationStart = identifier.getHcDateAndTimeDdIndexStart();
        identifier.setHcDateAndTimeDd(locationStart, fileData);

        //HC Date And Time Hh
        locationStart = identifier.getHcDateAndTimeHhIndexStart();
        identifier.setHcDateAndTimeHh(locationStart, fileData);

        //Crew name
        locationStart = identifier.getCrewNameIndexStart();
        locationEnd = identifier.getCrewNameIndexEnd();
        identifier.setCrewName(locationStart, locationEnd, fileData);

        //Military Unit
        locationStart = identifier.getMilitaryUnitIndexStart();
        locationEnd = identifier.getMilitaryUnitIndexEnd();
        identifier.setMilitaryUnit(locationStart, locationEnd, fileData);

        //print out the contents of the file
        System.out.println("DID Number is \"" + identifier.getDidNumber() + "\"");
        System.out.println("DID Type is \"" + identifier.getDidType() + "\"");
        System.out.println("DID Name is \"" + identifier.getDidName() + "\"");
        System.out.println("DID Date and Time YY is \"" + identifier.getDidDateAndTimeYy() + "\"");
        System.out.println("DID Date and Time MM is \"" + identifier.getDidDateAndTimeMm() + "\"");
        System.out.println("DID Date and Time DD is \"" + identifier.getDidDateAndTimeDd() + "\"");
        System.out.println("DID Date and Time HH is \"" + identifier.getDidDateAndTimeHh() + "\"");
        System.out.println("DID Date and Time Min is \"" + identifier.getDidDateAndTimeMin() + "\"");
        System.out.println("DID Date and Time Sec is \"" + identifier.getDidDateAndTimeSs() + "\"");
        System.out.println("Tail Number is \"" + identifier.getDidTailNumber() + "\"");
        System.out.println("HC Date and Time YY is \"" + identifier.getHcDateAndTimeYy() + "\"");
        System.out.println("HC Date and Time MM is \"" + identifier.getHcDateAndTimeMm() + "\"");
        System.out.println("HC Date and Time DD is \"" + identifier.getHcDateAndTimeDd() + "\"");
        System.out.println("HC Date and Time HH is \"" + identifier.getHcDateAndTimeHh() + "\"");
        System.out.println("Crew name is \"" + identifier.getCrewName() + "\"");
        System.out.println("Military Unit is  \"" + identifier.getMilitaryUnit() + "\"");
    }
}