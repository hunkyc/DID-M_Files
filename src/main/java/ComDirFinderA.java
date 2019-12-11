
public class ComDirFinderA {

    int isValidElementIndex = 0;
    int idStartIndex = 1;
    int idEndIndex = 12;
    int isInGroupStartIndex = 13;
    int isInGroupEndIndex = 16;
    int frequencyR100KhzIndex = 17;
    int frequencyExtensionIndex = 19;
    int extensionMultiplierIndex = 20;

    String isValidElement = "";
    String presetId = "";
    String isInGroup = "";
    String frequencyR100Khz = "";
    String frequencyExtension = "";
    String extensionMultiplier = "";

    public ComDirFinderA() {
        isValidElement = "0";
    }
    public ComDirFinderA(byte[] preset) {

        isValidElement = setIsValidElement(preset, isValidElement);

        presetId = setPresetId(preset, presetId);

        isInGroup = setIsInGroup(preset, isInGroup);

        frequencyR100Khz = setFrequencyR100KhzIndex(preset, frequencyR100Khz);

        frequencyExtension = setFrequencyExtension(preset, frequencyExtension);

        extensionMultiplier = setExtensionMultiplier(preset, extensionMultiplier);


    }//end of constructor

    public String setIsValidElement(byte[] preset, String isValidElement) {
        byte presetValidity = preset[isValidElementIndex];

        //compare it
        if (presetValidity == 1) {
            isValidElement = "Valid";
        }
        else {
            isValidElement = "Invalid";
        }
        return isValidElement;
    }

    public String setPresetId(byte[] preset, String PresetId) {
        for (int i = idStartIndex; i <= idEndIndex; i++) {
            //Convert to ascii character and print
            PresetId = PresetId.concat(Character.toString((char) preset[i]));
        }
        return PresetId;
    }

    // TODO: 7/06/2016
    public String setIsInGroup(byte[] preset, String IsInGroup) {

        return IsInGroup;
    }

    // TODO: 8/06/2016  
    public String setFrequencyR100KhzIndex(byte[] preset, String frequenctR100Khz) {
        
        return frequenctR100Khz;
    }

    // TODO: 8/06/2016  
    public String setFrequencyExtension(byte[] preset, String frequencyExtension) {
       
        return frequencyExtension;
    }

    // TODO: 8/06/2016  
    public String setExtensionMultiplier(byte[] preset, String frequencyExtension) {

        return frequencyExtension;
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
