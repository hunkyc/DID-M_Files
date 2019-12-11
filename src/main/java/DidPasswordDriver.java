import java.io.*;

/**
 * Created by martinsmith on 17/11/19.
 */
public class DidPasswordDriver {
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
        DidPassword password = new DidPassword();

//      Set the elements from the file
//      Validity1
        password.setValidity1(fileData);

//      Name 1
        locationStart = password.getNameIndexStart1();
        locationEnd = password.getNameIndexEnd1();
        password.setName1(locationStart, locationEnd, fileData);

//      Military Unit 1
        locationStart = password.getMilitaryUnit1StartIndex();
        locationEnd = password.getMilitaryUnit1EndIndex();
        password.setMilitaryUnit1(locationStart, locationEnd, fileData);

//      Password 1
        locationStart = password.getPassword1IndexStart();
        locationEnd = password.getPassword1IndexEnd();
        password.setPassword1(locationStart, locationEnd, fileData);

//      Validity 2
        password.setValidity2(fileData);

//      Name 2
        locationStart = password.getNameIndexStart2();
        locationEnd = password.getNameIndexEnd2();
        password.setName2(locationStart, locationEnd, fileData);

//      Military Unit 2
        locationStart = password.getMilitaryUnit2StartIndex();
        locationEnd = password.getMilitaryUnit2EndIndex();
        password.setMilitaryUnit2(locationStart, locationEnd, fileData);

//      Password 2
        locationStart = password.getPassword2IndexStart();
        locationEnd = password.getPassword2IndexEnd();
        password.setPassword2(locationStart, locationEnd, fileData);

//      Validity 3
        password.setValidity3(fileData);

//      Name 3
        locationStart = password.getNameIndexStart3();
        locationEnd = password.getNameIndexEnd3();
        password.setName3(locationStart, locationEnd, fileData);

//      Military Unit 3
        locationStart = password.getMilitaryUnit3StartIndex();
        locationEnd = password.getMilitaryUnit3EndIndex();
        password.setMilitaryUnit3(locationStart, locationEnd, fileData);

//      Password 3
        locationStart = password.getPassword3IndexStart();
        locationEnd = password.getPassword3IndexEnd();
        password.setPassword3(locationStart, locationEnd, fileData);

//      Validity 4
        password.setValidity4(fileData);

//      Name 4
        locationStart = password.getNameIndexStart4();
        locationEnd = password.getNameIndexEnd4();
        password.setName4(locationStart, locationEnd, fileData);

//      Military Unit 4
        locationStart = password.getMilitaryUnit4StartIndex();
        locationEnd = password.getMilitaryUnit4EndIndex();
        password.setMilitaryUnit4(locationStart, locationEnd, fileData);

//      Password 4
        locationStart = password.getPassword4IndexStart();
        locationEnd = password.getPassword4IndexEnd();
        password.setPassword4(locationStart, locationEnd, fileData);

//      Validity 5

//        password.setValidity5(fileData);

////      Name 5
//        locationStart = password.getNameIndexStart5();
//        locationEnd = password.getNameIndexEnd5();
//        password.setName5(locationStart, locationEnd, fileData);
//
////      Military Unit 5
//        locationStart = password.getMilitaryUnit5StartIndex();
//        locationEnd = password.getMilitaryUnit5EndIndex();
//        password.setMilitaryUnit5(locationStart, locationEnd, fileData);
//
////      Password 5
//        locationStart = password.getPassword5IndexStart();
//        locationEnd = password.getPassword5IndexEnd();
//        password.setPassword5(locationStart, locationEnd, fileData);

////      Validity 6
//        password.setValidity6(fileData);
//
////      Name 6
//        locationStart = password.getNameIndexStart6();
//        locationEnd = password.getNameIndexEnd6();
//        password.setName6(locationStart, locationEnd, fileData);
//
////      Military Unit 6
//        locationStart = password.getMilitaryUnit6StartIndex();
//        locationEnd = password.getMilitaryUnit6EndIndex();
//        password.setMilitaryUnit6(locationStart, locationEnd, fileData);
//
////      Password 6
//        locationStart = password.getPassword6IndexStart();
//        locationEnd = password.getPassword6IndexEnd();
//        password.setPassword6(locationStart, locationEnd, fileData);
//
////      Validity 7
//        password.setValidity7(fileData);
//
////      Name 7
//        locationStart = password.getNameIndexStart7();
//        locationEnd = password.getNameIndexEnd7();
//        password.setName7(locationStart, locationEnd, fileData);
//
////      Military Unit 7
//        locationStart = password.getMilitaryUnit7StartIndex();
//        locationEnd = password.getMilitaryUnit7EndIndex();
//        password.setMilitaryUnit7(locationStart, locationEnd, fileData);
//
////      Password 7
//        locationStart = password.getPassword7IndexStart();
//        locationEnd = password.getPassword7IndexEnd();
//        password.setPassword7(locationStart, locationEnd, fileData);
//
////      Validity 8
//        password.setValidity8(fileData);
//
////      Name 8
//        locationStart = password.getNameIndexStart8();
//        locationEnd = password.getNameIndexEnd8();
//        password.setName8(locationStart, locationEnd, fileData);
//
////      Military Unit 8
//        locationStart = password.getMilitaryUnit8StartIndex();
//        locationEnd = password.getMilitaryUnit8EndIndex();
//        password.setMilitaryUnit8(locationStart, locationEnd, fileData);
//
////      Password 8
//        locationStart = password.getPassword8IndexStart();
//        locationEnd = password.getPassword8IndexEnd();
//        password.setPassword8(locationStart, locationEnd, fileData);
//
////      Validity 9
//        password.setValidity9(fileData);
//
////      Name 9
//        locationStart = password.getNameIndexStart9();
//        locationEnd = password.getNameIndexEnd9();
//        password.setName9(locationStart, locationEnd, fileData);
//
////      Military Unit 9
//        locationStart = password.getMilitaryUnit9StartIndex();
//        locationEnd = password.getMilitaryUnit9EndIndex();
//        password.setMilitaryUnit9(locationStart, locationEnd, fileData);
//
////      Password 9
//        locationStart = password.getPassword9IndexStart();
//        locationEnd = password.getPassword9IndexEnd();
//        password.setPassword9(locationStart, locationEnd, fileData);

////      Validity 10
//        password.setValidity10(fileData);
//
////      Name 10
//        locationStart = password.getNameIndexStart10();
//        locationEnd = password.getNameIndexEnd10();
//        password.setName10(locationStart, locationEnd, fileData);
//
////      Military Unit 10
//        locationStart = password.getMilitaryUnit10StartIndex();
//        locationEnd = password.getMilitaryUnit10EndIndex();
//        password.setMilitaryUnit10(locationStart, locationEnd, fileData);
//
////      Password 10
//        locationStart = password.getPassword10IndexStart();
//        locationEnd = password.getPassword10IndexEnd();
//        password.setPassword10(locationStart, locationEnd, fileData);

        //print out the contents of the file
//        System.out.println("Validity 1 is \"" + password.getValidity1() + "\"");
//        System.out.println("Name 1 is \"" + password.getName1() + "\"");
//        System.out.println("Military Unit 1 is \"" + password.getMilitaryUnit1() + "\"");
//        System.out.println("Password 1 is \"" + password.getPassword1() + "\"");
//        System.out.println();
//        System.out.println("Validity 2 is \"" + password.getValidity2() + "\"");
//        System.out.println("Name 2 is \"" + password.getName2() + "\"");
//        System.out.println("Military Unit 2 is \"" + password.getMilitaryUnit2() + "\"");
//        System.out.println("Password 2 is \"" + password.getPassword2() + "\"");
//        System.out.println();
//        System.out.println("Validity 3 is \"" + password.getValidity3() + "\"");
//        System.out.println("Name 3 is \"" + password.getName3() + "\"");
//        System.out.println("Military Unit 3 is \"" + password.getMilitaryUnit3() + "\"");
//        System.out.println("Password 3 is \"" + password.getPassword3() + "\"");
//        System.out.println();
//        System.out.println("Validity 4 is \"" + password.getValidity4() + "\"");
//        System.out.println("Name 4 is \"" + password.getName4() + "\"");
//        System.out.println("Military Unit 4 is \"" + password.getMilitaryUnit4() + "\"");
//        System.out.println("Password 4 is \"" + password.getPassword4() + "\"");
//        System.out.println();
//        System.out.println("Validity 5 is \"" + password.getValidity5() + "\"");
//        System.out.println("Name 5 is \"" + password.getName5() + "\"");
//        System.out.println("Military Unit 5 is \"" + password.getMilitaryUnit5() + "\"");
//        System.out.println("Password 5 is \"" + password.getPassword5() + "\"");
//        System.out.println();
//        System.out.println("Validity 6 is \"" + password.getValidity6() + "\"");
//        System.out.println("Name 6 is \"" + password.getName6() + "\"");
//        System.out.println("Military Unit 6 is \"" + password.getMilitaryUnit6() + "\"");
//        System.out.println("Password 6 is \"" + password.getPassword6() + "\"");
//        System.out.println();
//        System.out.println("Validity 7 is \"" + password.getValidity7() + "\"");
//        System.out.println("Name 7 is \"" + password.getName7() + "\"");
//        System.out.println("Military Unit 7 is \"" + password.getMilitaryUnit7() + "\"");
//        System.out.println("Password 7 is \"" + password.getPassword7() + "\"");
//        System.out.println();
//        System.out.println("Validity 8 is \"" + password.getValidity8() + "\"");
//        System.out.println("Name 8 is \"" + password.getName8() + "\"");
//        System.out.println("Military Unit 8 is \"" + password.getMilitaryUnit8() + "\"");
//        System.out.println("Password 8 is \"" + password.getPassword8() + "\"");
//        System.out.println();
//        System.out.println("Validity 9 is \"" + password.getValidity9() + "\"");
//        System.out.println("Name 9 is \"" + password.getName9() + "\"");
//        System.out.println("Military Unit 9 is \"" + password.getMilitaryUnit9() + "\"");
//        System.out.println("Password 9 is \"" + password.getPassword9() + "\"");
//        System.out.println();
//        System.out.println("Validity 10 is \"" + password.getValidity10() + "\"");
//        System.out.println("Name 10 is \"" + password.getName10() + "\"");
//        System.out.println("Military Unit 10 is \"" + password.getMilitaryUnit10() + "\"");
//        System.out.println("Password 10 is \"" + password.getPassword10() + "\"");

        //debug

        System.out.println("Filedata size is " + fileData.length);
    }
}
