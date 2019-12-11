import java.io.UnsupportedEncodingException;

/**
 * Created by martinsmith on 4/11/19.
 */
public class DidPassword {

    //List Element 1
    int validityIndex1 = 1;
    int nameIndexStart1 = 2;
    int nameIndexEnd1 = 13;
    int name1Length = 12;
    int militaryUnit1StartIndex = 14;
    int militaryUnit1EndIndex = 25;
    int militaryUnit1Length = 12;
    int passwordIndexStart1 = 26;
    int passwordIndexEnd1 = 37;
    int password1Length = 12;

    String validity1 = "";
    String name1 = "";
    String militaryUnit1 = "";
    String password1 = "";

    //List Element 2
    int validityIndex2 = 38;
    int nameIndexStart2 = 39;
    int nameIndexEnd2 = 50;
    int name2Length = 12;
    int militaryUnit2StartIndex = 51;
    int militaryUnit2EndIndex = 62;
    int militaryUnit2Length = 12;
    int passwordIndexStart2 = 63;
    int passwordIndexEnd2 = 74;
    int password2Length = 12;

    String validity2 = "";
    String name2 = "";
    String militaryUnit2 = "";
    String password2 = "";

    //List Element 3
    int validityIndex3 = 75;
    int nameIndexStart3 = 76;
    int nameIndexEnd3 = 87;
    int name3Length = 12;
    int militaryUnit3StartIndex = 88;
    int militaryUnit3EndIndex = 99;
    int militaryUnit3Length = 12;
    int passwordIndexStart3 = 100;
    int passwordIndexEnd3 = 111;
    int password3Length = 12;

    String validity3 = "";
    String name3 = "";
    String militaryUnit3 = "";
    String password3 = "";

    //List Element 4
    int validityIndex4 = 112;
    int nameIndexStart4 = 113;
    int nameIndexEnd4 = 124;
    int name4Length = 12;
    int militaryUnit4StartIndex = 125;
    int militaryUnit4EndIndex = 136;
    int militaryUnit4Length = 12;
    int passwordIndexStart4 = 137;
    int passwordIndexEnd4 = 148;
    int password4Length = 12;

    String validity4 = "";
    String name4 = "";
    String militaryUnit4 = "";
    String password4 = "";

    //List Element 5

    int validityIndex5 = 149;
    int nameIndexStart5 = 150;
    int nameIndexEnd5 = 161;
    int name5Length = 12;
    int militaryUnit5StartIndex = 162;
    int militaryUnit5EndIndex = 173;
    int militaryUnit5Length = 12;
    int passwordIndexStart5 = 174;
    int passwordIndexEnd5 = 185;
    int password5Length = 12;

    String validity5 = "";
    String name5 = "";
    String militaryUnit5 = "";
    String password5 = "";

    //List Element 6

    int validityIndex6 = 186;
    int nameIndexStart6 = 187;
    int nameIndexEnd6 = 198;
    int name6Length = 12;
    int militaryUnit6StartIndex = 199;
    int militaryUnit6EndIndex = 210;
    int militaryUnit6Length = 12;
    int passwordIndexStart6 = 211;
    int passwordIndexEnd6 = 222;
    int password6Length = 12;

    String validity6 = "";
    String name6 = "";
    String militaryUnit6 = "";
    String password6 = "";

    //List Element 7

    int validityIndex7 = 223;
    int nameIndexStart7 = 224;
    int nameIndexEnd7 = 235;
    int name7Length = 12;
    int militaryUnit7StartIndex = 236;
    int militaryUnit7EndIndex = 247;
    int militaryUnit7Length = 12;
    int passwordIndexStart7 = 248;
    int passwordIndexEnd7 = 259;
    int password7Length = 12;

    String validity7 = "";
    String name7 = "";
    String militaryUnit7 = "";
    String password7 = "";

    //List Element 8

    int validityIndex8 = 260;
    int nameIndexStart8 = 261;
    int nameIndexEnd8 = 272;
    int name8Length = 12;
    int militaryUnit8StartIndex = 273;
    int militaryUnit8EndIndex = 284;
    int militaryUnit8Length = 12;
    int passwordIndexStart8 = 285;
    int passwordIndexEnd8 = 296;
    int password8Length = 12;

    String validity8 = "";
    String name8 = "";
    String militaryUnit8 = "";
    String password8 = "";

    //List Element 9
    int validityIndex9 = 297;
    int nameIndexStart9 = 298;
    int nameIndexEnd9 = 309;
    int name9Length = 12;
    int militaryUnit9StartIndex = 310;
    int militaryUnit9EndIndex = 321;
    int militaryUnit9Length = 12;
    int passwordIndexStart9 = 322;
    int passwordIndexEnd9 = 333;
    int password9Length = 12;

    String validity9 = "";
    String name9 = "";
    String militaryUnit9 = "";
    String password9 = "";

    //List Element 10

    int validityIndex10 = 334;
    int nameIndexStart10 = 335;
    int nameIndexEnd10 = 346;
    int name10Length = 12;
    int militaryUnit10StartIndex = 347;
    int militaryUnit10EndIndex = 358;
    int militaryUnit10Length = 12;
    int passwordIndexStart10 = 359;
    int passwordIndexEnd10 = 370;
    int password10Length = 12;

    String validity10 = "";
    String name10 = "";
    String militaryUnit10 = "";
    String password10 = "";


    public DidPassword() {
        String validity1 = "";
        String name = "";
        String militaryUnit = "";
        String password = "";
    }

    //Setters and Getters
    //Setters
    public void setValidity1(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity1Byte = new byte[1];
        validity1Byte[0] = filedata[getValidityIndex1()];
        String temp = new String(validity1Byte, "UTF-8");
        if(temp.equals("0")) {
            validity1 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity1 = "Valid";
        }
        else {
            validity1 = "Error";
        }
    }

    public void setName1(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity1 = this.getValidity1();
        if(validity1.equals("Error")) {
            name1 = "";
        }
        else {
            byte[] name1Byte = new byte[name1Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                name1Byte[i] = filedata[i + (startIndex - 1)];
                name1 = new String(name1Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit1(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity1 = this.getValidity1();
        if(validity1.equals("Error")) {
            name1 = "";
        }
        else {
            byte[] militaryUnit1Byte = new byte[militaryUnit1Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                militaryUnit1Byte[i] = filedata[i + (startIndex -1)];
                name1 = new String(militaryUnit1Byte, "UTF-8");
            }
        }
    }

    public void setPassword1(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity1 = this.getValidity1();
        if(validity1.equals("Error")) {
            name1 = "";
        }
        else {
            byte[] password1Byte = new byte[password1Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                password1Byte[i] = filedata[i + (startIndex -1)];
                password1 = new String(password1Byte, "UTF-8");
            }
        }
    }

    public void setValidity2(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity2Byte = new byte[1];
        validity2Byte[0] = filedata[getValidityIndex2()];
        String temp = new String(validity2Byte, "UTF-8");
        if(temp.equals("0")) {
            validity2 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity2 = "Valid";
        }
        else {
            validity2 = "Error";
        }
    }

    public void setName2(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity2 = this.getValidity1();
        if(validity2.equals("Error")) {
            name2 = "";
        }
        else {
            byte[] name1Byte = new byte[name1Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                name1Byte[i] = filedata[i + (startIndex -1)];
                name1 = new String(name1Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit2(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity2 = this.getValidity2();
        if(validity2.equals("Error")) {
            militaryUnit2 = "";
        }
        else {
            byte[] militaryUnit1Byte = new byte[militaryUnit1Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                militaryUnit1Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit2 = new String(militaryUnit1Byte, "UTF-8");
            }
        }
    }

    public void setPassword2(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity2 = this.getValidity2();
        if(validity2.equals("Error")) {
            password2 = "";
        }
        else {
            byte[] password2Byte = new byte[password2Length];
            for (int i = 0; i <= password1Length - 1; i++) {
                password2Byte[i] = filedata[i + (startIndex -1)];
                password2 = new String(password2Byte, "UTF-8");
            }
        }
    }

    public void setValidity3(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity3Byte = new byte[1];
        validity3Byte[0] = filedata[getValidityIndex3()];
        String temp = new String(validity3Byte, "UTF-8");
        if(temp.equals("0")) {
            validity3 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity3 = "Valid";
        }
        else {
            validity3 = "Error";
        }
    }

    public void setName3(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity3 = this.getValidity3();
        if(validity3.equals("Error")) {
            name3 = "";
        }
        else {
            byte[] name3Byte = new byte[name3Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                name3Byte[i] = filedata[i + (startIndex -1)];
                name3 = new String(name3Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit3(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity3 = this.getValidity3();
        if(validity3.equals("Error")) {
            militaryUnit3 = "";
        }
        else {
            byte[] militaryUnit3Byte = new byte[militaryUnit3Length];
            for (int i = 0; i <= militaryUnit3Length - 1; i++) {
                militaryUnit3Byte[i] = filedata[i + (startIndex -1)];
                name1 = new String(militaryUnit3Byte, "UTF-8");
            }
        }
    }

    public void setPassword3(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity3 = this.getValidity3();
        if(validity3.equals("Error")) {
            password3 = "";
        }
        else {byte[] password3Byte = new byte[password3Length];
            for (int i = 0; i <= password3Length - 1; i++) {
                password3Byte[i] = filedata[i + (startIndex -1)];
                password3 = new String(password3Byte, "UTF-8");
            }
        }
    }

    public void setValidity4(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity4Byte = new byte[1];
        validity4Byte[0] = filedata[getValidityIndex4()];
        String temp = new String(validity4Byte, "UTF-8");
        if(temp.equals("0")) {
            validity4 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity4 = "Valid";
        }
        else {
            validity4 = "Error";
        }
    }

    public void setName4(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity4 = this.getValidity4();
        if(validity4.equals("Error")) {
            name4 = "";
        }
        else {
            byte[] name4Byte = new byte[name4Length];
            for (int i = 0; i <= name4Length - 1; i++) {
                name4Byte[i] = filedata[i + (startIndex -1)];
                name4 = new String(name4Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit4(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity4 = this.getValidity4();
        if(validity4.equals("Error")) {
            militaryUnit4 = "";
        }
        else {
            byte[] militaryUnit4Byte = new byte[militaryUnit4Length];
            for (int i = 0; i <= militaryUnit4Length - 1; i++) {
                militaryUnit4Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit4 = new String(militaryUnit4Byte, "UTF-8");
            }
        }
    }

    public void setPassword4(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity4 = this.getValidity4();
        if(validity4.equals("Error")) {
            password4 = "";
        }
        else {
            byte[] password4Byte = new byte[password4Length];
            for (int i = 0; i <= password4Length - 1; i++) {
                password4Byte[i] = filedata[i + (startIndex -1)];
                password4 = new String(password4Byte, "UTF-8");
            }
        }
    }

    public void setValidity5(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity5Byte = new byte[1];
        validity5Byte[0] = filedata[getValidityIndex5()];
        String temp = new String(validity5Byte, "UTF-8");
        System.out.println(temp);

        if(temp.equals("0")) {
            validity5 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity5 = "Valid";
        }
        else {
            validity5 = "Error";
        }
    }

    public void setName5(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity5 = this.getValidity5();
        if(validity5.equals("Error")) {
            password5 = "";
        }
        else {
            byte[] name5Byte = new byte[name5Length];
            for (int i = 0; i <= name5Length - 1; i++) {
                name5Byte[i] = filedata[i + (startIndex -1)];
                name5 = new String(name5Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit5(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity5 = this.getValidity5();
        if(validity5.equals("Error")) {
            militaryUnit5 = "";
        }
        else {
            byte[] militaryUnit5Byte = new byte[militaryUnit5Length];
            for (int i = 0; i <= name5Length - 1; i++) {
                militaryUnit5Byte[i] = filedata[i + (startIndex -1)];
                name1 = new String(militaryUnit5Byte, "UTF-8");
            }
        }
    }

    public void setPassword5(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity5 = this.getValidity5();
        if(validity5.equals("Error")) {
            password5 = "";
        }
        else {
            byte[] password5Byte = new byte[password5Length];
            for (int i = 0; i <= name5Length - 1; i++) {
                password5Byte[i] = filedata[i + (startIndex -1)];
                password5 = new String(password5Byte, "UTF-8");
            }
        }
    }

    public void setValidity6(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity6Byte = new byte[1];
        validity6Byte[0] = filedata[getValidityIndex6()];
        String temp = new String(validity6Byte, "UTF-8");
        if(temp.equals("0")) {
            validity6 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity6 = "Valid";
        }
        else {
            validity6 = "Error";
        }
    }

    public void setName6(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity6 = this.getValidity6();
        if(validity6.equals("Error")) {
            password6 = "";
        }
        else {
            byte[] name6Byte = new byte[name6Length];
            for (int i = 0; i <= name6Length - 1; i++) {
                name6Byte[i] = filedata[i + (startIndex -1)];
                name6 = new String(name6Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit6(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity6 = this.getValidity6();
        if(validity6.equals("Error")) {
            password6 = "";
        }
        else {
            byte[] militaryUnit6Byte = new byte[militaryUnit1Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                militaryUnit6Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit6 = new String(militaryUnit6Byte, "UTF-8");
            }
        }
    }

    public void setPassword6(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity6 = this.getValidity6();
        if(validity6.equals("Error")) {
            password6 = "";
        }
        else {
            byte[] password6Byte = new byte[password6Length];
            for (int i = 0; i <= name1Length - 1; i++) {
                password6Byte[i] = filedata[i + (startIndex -1)];
                password6 = new String(password6Byte, "UTF-8");
            }
        }
    }

    public void setValidity7(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity7Byte = new byte[1];
        validity7Byte[0] = filedata[getValidityIndex7()];
        String temp = new String(validity7Byte, "UTF-8");
        if(temp.equals("0")) {
            validity7 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity7 = "Valid";
        }
        else {
            validity7 = "Error";
        }
    }

    public void setName7(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity7 = this.getValidity7();
        if(validity7.equals("Error")) {
            name7 = "";
        }
        else {
            byte[] name7Byte = new byte[name7Length];
            for (int i = 0; i <= name7Length - 1; i++) {
                name7Byte[i] = filedata[i + (startIndex -1)];
                name7 = new String(name7Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit7(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity7 = this.getValidity7();
        if(validity7.equals("Error")) {
            militaryUnit7 = "";
        }
        else {
            byte[] militaryUnit7Byte = new byte[militaryUnit7Length];
            for (int i = 0; i <= name7Length - 1; i++) {
                militaryUnit7Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit7 = new String(militaryUnit7Byte, "UTF-8");
            }
        }
    }

    public void setPassword7(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity7 = this.getValidity7();
        if(validity7.equals("Error")) {
            password7 = "";
        }
        else {
            byte[] password7Byte = new byte[password7Length];
            for (int i = 0; i <= name7Length - 1; i++) {
                password7Byte[i] = filedata[i + (startIndex -1)];
                password7 = new String(password7Byte, "UTF-8");
            }
        }
    }

    public void setValidity8(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity8Byte = new byte[1];
        validity8Byte[0] = filedata[getValidityIndex8()];
        String temp = new String(validity8Byte, "UTF-8");
        if(temp.equals("0")) {
            validity8 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity8 = "Valid";
        }
        else {
            validity8 = "Error";
        }
    }

    public void setName8(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity8 = this.getValidity8();
        if(validity8.equals("Error")) {
            name8 = "";
        }
        else {
            byte[] name8Byte = new byte[name8Length];
            for (int i = 0; i <= name8Length - 1; i++) {
                name8Byte[i] = filedata[i + (startIndex -1)];
                name8 = new String(name8Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit8(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity8 = this.getValidity8();
        if(validity8.equals("Error")) {
            militaryUnit8 = "";
        }
        else {
            byte[] militaryUnit8Byte = new byte[militaryUnit8Length];
            for (int i = 0; i <= name8Length - 1; i++) {
                militaryUnit8Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit8 = new String(militaryUnit8Byte, "UTF-8");
            }
        }
    }

    public void setPassword8(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity8 = this.getValidity8();
        if(validity8.equals("Error")) {
            password8 = "";
        }
        else {
            byte[] password8Byte = new byte[password8Length];
            for (int i = 0; i <= name8Length - 1; i++) {
                password8Byte[i] = filedata[i + (startIndex -1)];
                password8 = new String(password8Byte, "UTF-8");
            }
        }
    }

    public void setValidity9(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity9Byte = new byte[1];
        validity9Byte[0] = filedata[getValidityIndex9()];
        String temp = new String(validity9Byte, "UTF-8");
        if(temp.equals("0")) {
            validity9 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity9 = "Valid";
        }
        else {
            validity9 = "Error";
        }
    }

    public void setName9(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity9 = this.getValidity9();
        if(validity9.equals("Error")) {
            name9 = "";
        }
        else {
            byte[] name9Byte = new byte[name9Length];
            for (int i = 0; i <= name9Length - 1; i++) {
                name9Byte[i] = filedata[i + (startIndex -1)];
                name9 = new String(name9Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit9(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity9 = this.getValidity9();
        if(validity9.equals("Error")) {
            militaryUnit9 = "";
        }
        else {
            byte[] militaryUnit9Byte = new byte[militaryUnit9Length];
            for (int i = 0; i <= name9Length - 1; i++) {
                militaryUnit9Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit9 = new String(militaryUnit9Byte, "UTF-8");
            }
        }
    }

    public void setPassword9(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity9 = this.getValidity9();
        if(validity9.equals("Error")) {
            password9 = "";
        }
        else {
            byte[] password9Byte = new byte[password9Length];
            for (int i = 0; i <= name9Length - 1; i++) {
                password9Byte[i] = filedata[i + (startIndex -1)];
                password9 = new String(password9Byte, "UTF-8");
            }
        }
    }

    public void setValidity10(byte[] filedata) throws UnsupportedEncodingException {
        byte[] validity10Byte = new byte[1];
        validity10Byte[0] = filedata[getValidityIndex10()];
        String temp = new String(validity10Byte, "UTF-8");
        if(temp.equals("0")) {
            validity10 = "Invalid";
        }
        else if(temp.equals("1")) {
            validity10 = "Valid";
        }
        else {
            validity10 = "Error";
        }
    }

    public void setName10(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity10 = this.getValidity10();
        if(validity10.equals("Error")) {
            name10 = "";
        }
        else {
            byte[] name10Byte = new byte[name10Length];
            for (int i = 0; i <= name10Length - 1; i++) {
                name10Byte[i] = filedata[i + (startIndex -1)];
                name10 = new String(name10Byte, "UTF-8");
            }
        }
    }

    public void setMilitaryUnit10(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity10 = this.getValidity10();
        if(validity10.equals("Error")) {
            militaryUnit10 = "";
        }
        else {
            byte[] militaryUnit10Byte = new byte[militaryUnit10Length];
            for (int i = 0; i <= name10Length - 1; i++) {
                militaryUnit10Byte[i] = filedata[i + (startIndex -1)];
                militaryUnit10 = new String(militaryUnit10Byte, "UTF-8");
            }
        }
    }

    public void setPassword10(int startIndex, int endIndex, byte[] filedata) throws UnsupportedEncodingException {
        String validity10 = this.getValidity10();
        if(validity10.equals("Error")) {
            password10 = "";
        }
        else {
            byte[] password10Byte = new byte[password10Length];
            for (int i = 0; i <= name10Length - 1; i++) {
                password10Byte[i] = filedata[i + (startIndex -1)];
                password10 = new String(password10Byte, "UTF-8");
            }
        }
    }

    //getters

    //index getters
    public int getValidityIndex1() {
        return validityIndex1;
    }

    public int getNameIndexStart1() { return nameIndexStart1; }

    public int getNameIndexEnd1() { return nameIndexEnd1; }

    public int getMilitaryUnit1StartIndex() { return militaryUnit1StartIndex; }

    public int getMilitaryUnit1EndIndex() { return militaryUnit1EndIndex; }

    public int getPassword1IndexStart() { return passwordIndexStart1; }

    public int getPassword1IndexEnd() { return passwordIndexEnd1; }

    public int getValidityIndex2() {
        return validityIndex2;
    }

    public int getNameIndexStart2() { return nameIndexStart2; }

    public int getNameIndexEnd2() { return nameIndexEnd2; }

    public int getMilitaryUnit2StartIndex() { return militaryUnit2StartIndex; }

    public int getMilitaryUnit2EndIndex() { return militaryUnit2EndIndex; }

    public int getPassword2IndexStart() { return passwordIndexStart2; }

    public int getPassword2IndexEnd() { return passwordIndexEnd2; }

    public int getValidityIndex3() {
        return validityIndex3;
    }

    public int getNameIndexStart3() { return nameIndexStart3; }

    public int getNameIndexEnd3() { return nameIndexEnd3; }

    public int getMilitaryUnit3StartIndex() { return militaryUnit3StartIndex; }

    public int getMilitaryUnit3EndIndex() { return militaryUnit3EndIndex; }

    public int getPassword3IndexStart() { return passwordIndexStart3; }

    public int getPassword3IndexEnd() { return passwordIndexEnd3; }

    public int getValidityIndex4() {
        return validityIndex4;
    }

    public int getNameIndexStart4() { return nameIndexStart4; }

    public int getNameIndexEnd4() { return nameIndexEnd4; }

    public int getMilitaryUnit4StartIndex() { return militaryUnit4StartIndex; }

    public int getMilitaryUnit4EndIndex() { return militaryUnit4EndIndex; }

    public int getPassword4IndexStart() { return passwordIndexStart4; }

    public int getPassword4IndexEnd() { return passwordIndexEnd4; }

    public int getValidityIndex5() {
        return validityIndex5;
    }

    public int getNameIndexStart5() { return nameIndexStart5; }

    public int getNameIndexEnd5() { return nameIndexEnd5; }

    public int getMilitaryUnit5StartIndex() { return militaryUnit5StartIndex; }

    public int getMilitaryUnit5EndIndex() { return militaryUnit5EndIndex; }

    public int getPassword5IndexStart() { return passwordIndexStart5; }

    public int getPassword5IndexEnd() { return passwordIndexEnd5; }

    public int getValidityIndex6() {
        return validityIndex6;
    }

    public int getNameIndexStart6() { return nameIndexStart6; }

    public int getNameIndexEnd6() { return nameIndexEnd6; }

    public int getMilitaryUnit6StartIndex() { return militaryUnit6StartIndex; }

    public int getMilitaryUnit6EndIndex() { return militaryUnit6EndIndex; }

    public int getPassword6IndexStart() { return passwordIndexStart6; }

    public int getPassword6IndexEnd() { return passwordIndexEnd6; }

    public int getValidityIndex7() {
        return validityIndex7;
    }

    public int getNameIndexStart7() { return nameIndexStart7; }

    public int getNameIndexEnd7() { return nameIndexEnd7; }

    public int getMilitaryUnit7StartIndex() { return militaryUnit7StartIndex; }

    public int getMilitaryUnit7EndIndex() { return militaryUnit7EndIndex; }

    public int getPassword7IndexStart() { return passwordIndexStart7; }

    public int getPassword7IndexEnd() { return passwordIndexEnd7; }

    public int getValidityIndex8() {
        return validityIndex8;
    }

    public int getNameIndexStart8() { return nameIndexStart8; }

    public int getNameIndexEnd8() { return nameIndexEnd8; }

    public int getMilitaryUnit8StartIndex() { return militaryUnit8StartIndex; }

    public int getMilitaryUnit8EndIndex() { return militaryUnit8EndIndex; }

    public int getPassword8IndexStart() { return passwordIndexStart8; }

    public int getPassword8IndexEnd() { return passwordIndexEnd8; }

    public int getValidityIndex9() {
        return validityIndex9;
    }

    public int getNameIndexStart9() { return nameIndexStart9; }

    public int getNameIndexEnd9() { return nameIndexEnd9; }

    public int getMilitaryUnit9StartIndex() { return militaryUnit9StartIndex; }

    public int getMilitaryUnit9EndIndex() { return militaryUnit9EndIndex; }

    public int getPassword9IndexStart() { return passwordIndexStart9; }

    public int getPassword9IndexEnd() { return passwordIndexEnd9; }

    public int getValidityIndex10() {
        return validityIndex10;
    }

    public int getNameIndexStart10() { return nameIndexStart10; }

    public int getNameIndexEnd10() { return nameIndexEnd10; }

    public int getMilitaryUnit10StartIndex() { return militaryUnit10StartIndex; }

    public int getMilitaryUnit10EndIndex() { return militaryUnit10EndIndex; }

    public int getPassword10IndexStart() { return passwordIndexStart10; }

    public int getPassword10IndexEnd() { return passwordIndexEnd10; }

    //Data Getters
    public String getValidity1() {
        return validity1;
    }

    public String getName1() {
        return name1;
    }

    public String getMilitaryUnit1() {
        return militaryUnit1;
    }

    public String getPassword1() {
        return password1;
    }

    public String getValidity2() {
        return validity2;
    }

    public String getName2() {
        return name2;
    }

    public String getMilitaryUnit2() {
        return militaryUnit2;
    }

    public String getPassword2() {
        return password2;
    }

    public String getValidity3() {
        return validity3;
    }

    public String getName3() {
        return name3;
    }

    public String getMilitaryUnit3() {
        return militaryUnit3;
    }

    public String getPassword3() {
        return password3;
    }

    public String getValidity4() {
        return validity4;
    }

    public String getName4() {
        return name4;
    }

    public String getMilitaryUnit4() {
        return militaryUnit4;
    }

    public String getPassword4() {
        return password4;
    }

    public String getValidity5() {
        return validity5;
    }

    public String getName5() {
        return name5;
    }

    public String getMilitaryUnit5() {
        return militaryUnit5;
    }

    public String getPassword5() {
        return password5;
    }

    public String getValidity6() {
        return validity6;
    }

    public String getName6() {
        return name6;
    }

    public String getMilitaryUnit6() {
        return militaryUnit6;
    }

    public String getPassword6() {
        return password6;
    }

    public String getValidity7() {
        return validity7;
    }

    public String getName7() {
        return name7;
    }

    public String getMilitaryUnit7() {
        return militaryUnit7;
    }

    public String getPassword7() {
        return password7;
    }

    public String getValidity8() {
        return validity8;
    }

    public String getName8() {
        return name8;
    }

    public String getMilitaryUnit8() {
        return militaryUnit8;
    }

    public String getPassword8() {
        return password8;
    }

    public String getValidity9() {
        return validity9;
    }

    public String getName9() {
        return name9;
    }

    public String getMilitaryUnit9() {
        return militaryUnit9;
    }

    public String getPassword9() {
        return password9;
    }

    public String getValidity10() {
        return validity10;
    }

    public String getName10() {
        return name10;
    }

    public String getMilitaryUnit10() {
        return militaryUnit10;
    }

    public String getPassword10() {
        return password10;
    }

}
