import java.io.*;


public class driver {

    public static void main( String args[]) throws FileNotFoundException, IOException {
        File file = new File("/Users/martinsmith/Downloads/ACOM_FHZ_A.AC1");
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();


        HFData HF = new HFData();

        HF.setActivePresetNr(byte2Binary4(fileData[HF.getActivePresetNrIndex()]));

        HF.setDefaultGroup(byte2Binary4(fileData[HF.getDefaultGroupIndex()]));

        HF.setStandbyPresetNr(byte2Binary4(fileData[HF.getStandbyPresetNrIndex()]));

        HF.setDataPort(byte2Binary4(fileData[HF.getDataPortIndex()]));

        HF.setDataRateLow(byte2Binary4(fileData[HF.getDataRateLowIndex()]));

        HF.setDataRateMedium(byte2Binary4(fileData[HF.getDataRateMediumIndex()]));

        HF.setDataRateHigh(byte2Binary4(fileData[HF.getDataRateHighIndex()]));

        HF.setDefaultDataRate(byte2Binary4(fileData[HF.getDefaultDataRateIndex()]));

        HF.setEmergencyChNr(byte2Binary4(fileData[HF.getEmergencyChNrIndex()]));

        HF.setPowerLevel(byte2Binary4(fileData[HF.getPowerLevelIndex()]));

        HF.setSquelchLevel(byte2Binary4(fileData[HF.getSquelchlevelIndex()]));

        HF.setTimeSource(byte2Binary4(fileData[HF.getTimeSourceIndex()]));

        HF.setSelcalSelfAddress(fileData);

        HF.setAleFirstSelfAddress(fileData);

        //Ale Sound Interval
        int temp1 = 0;
        int temp2 = 0;

        temp1 = byte2Binary4(fileData[HF.getAleSoundIntervalIndex()]);

        temp2 = byte2Binary3(fileData[HF.getAleSoundIntervalIndex() + 1]);

        HF.setAleSoundInterval((temp1 + temp2));

        HF.setGroupId(fileData);





        System.out.println("Active Preset Nr is " + HF.getActivePresetNr());

        System.out.println("Default Group is " + HF.getDefaultGroup());

        System.out.println("Standby Preset Nr is " + HF.getStandbyPresetNr());

        System.out.println("Data Port is " + HF.getDataPort());

        System.out.println("Data Rate Low is " + HF.getDataRateLow());

        System.out.println("Data Rate Medium is " + HF.getDataRateMedium());

        System.out.println("Data Rate High is " + HF.getDataRateHigh());

        System.out.println("Default Data Rate is " + HF.getDefaultDataRate());

        System.out.println("Emergency Channel Number is " + HF.getEmergencyChNr());

        System.out.println("Power Level is " + HF.getPowerLevel());

        System.out.println("Squelch Level is " + HF.getSquelchLevel());

        System.out.println("Time Source is " + HF.getTimeSource());

        System.out.println("SELCAL is " + HF.getSelcalSelfAddress());

        System.out.println("Ale First Self Address  is " + HF.getAleFirstSelfAddress());

        System.out.println("Ale Sound Interval is " + HF.getAleSoundInterval());




//        File file = new File("/Users/martinsmith/Downloads/REFER_PT.CF1");
//        byte[] fileData = new byte[(int) file.length()];
//        DataInputStream dis = new DataInputStream(new FileInputStream(file));
//        dis.readFully(fileData);
//        dis.close();
//
//        CreateReferencePoint(fileData);
//
//        File file2 = new File("/Users/martinsmith/Downloads/RNAVBASE.CC1");
//        byte[] fileData2 = new byte[(int) file.length()];
//        DataInputStream dis2 = new DataInputStream(new FileInputStream(file2));
//        dis2.readFully(fileData2);
//        dis2.close();
//
//        CreateBeacon(fileData2);
    }

    private static void CreateBeacon(byte[] fileData2) {
        beacon BC = new beacon();

        BC.setValidity(byte2Binary4(fileData2[0]));

        BC.setId(fileData2);

        BC.setPositionValid(byte2Binary4(fileData2[BC.getPositionValidIndex()]));

        BC.setLatBearing(fileData2);

        BC.setLatDegree(fileData2);

        BC.setLatMinute(fileData2);

        BC.setLatMinutesDiv100(fileData2);

        BC.setLongBearing(fileData2);

        int temp = BC.getLongDegreeIndex();
        int sub = 0;
        sub = sub + byte2Binary3(fileData2[temp]);
        sub = sub + byte2Binary4(fileData2[(temp + 1)]);

        BC.setLongDegree(sub);

        BC.setLongMinutes(fileData2);

        BC.setLongMinutesDiv100(fileData2);

        BC.setAltitudeValid(fileData2[BC.getAltitudeValidIndex()]);

        temp = BC.getAltitudeIndex();
        sub = 0;
        sub = sub + byte2Binary3(fileData2[temp]);
        sub = sub + byte2Binary4(fileData2[(temp + 1)]);
        BC.setAltitude(sub);

        BC.setBeaconDataKind(fileData2[BC.getBeaconDataKindIndex()]);

        BC.setChannelNumber(byte2Binary4(fileData2[BC.getChannelNumberIndex()]));

        BC.setChannelSuffix(byte2Binary4(fileData2[BC.getChannelSuffixIndex()]));

        BC.setIsDme(byte2Binary4(fileData2[BC.getIsDMEIndex()]));

        temp = BC.getFrequencyIndex();
        sub = 0;
        sub = sub + byte2Binary1(fileData2[temp]);
        sub = sub + byte2Binary2(fileData2[temp + 1]);
        sub = sub + byte2Binary3(fileData2[temp + 2]);
        sub = sub + byte2Binary4(fileData2[(temp + 3)]);
        BC.setFrequency(sub);

        BC.setDirCountValid(byte2Binary4(fileData2[BC.getDirCountValidIndex()]));

        BC.setDirection(byte2Binary4((fileData2[BC.getDirectionIndex()])));

        BC.setCount(byte2Binary4(fileData2[BC.getCountIndex()]));

        System.out.println("Validity is " + BC.getValidity());

        System.out.println("Id is " + BC.getId());

        System.out.println("Position Valid is " + BC.getPositionValid());

        System.out.println("Lat Bearing is " + BC.getLatBearing());

        System.out.println("Lat Degree is " + BC.getLatDegree());

        System.out.println("Lat Minutes is " + BC.getLatMinutes());

        System.out.println("Lat Minutes/100 is " + BC.getLatMinutesDiv100());

        System.out.println("Long Bearing is " + BC.getLongBearing());

        System.out.println("Long Degree is " + BC.getLongDegree());

        System.out.println("Long Minutes is " + BC.getLongMinutes());

        System.out.println("Long Minutes/100 is " + BC.getLongMinutesDiv100());

        System.out.println("Altitude Validity is " + BC.getAltitudeValid());

        System.out.println("Altitude is " + BC.getAltitude());

        System.out.println("Beacon Data Kind is " + BC.getBeaconDataKind());

        System.out.println("Channel Number is " + BC.getChannelNumber());

        System.out.println("Channel Suffix is " + BC.getChannelSuffix());

        System.out.println("Is DME is " + BC.getIsDme());

        System.out.println("Frequency is " + BC.getFrequency());

        System.out.println("Dir Count valid is " + BC.getDirCountValid());

        System.out.println("Direction is " + BC.getDirection());

        System.out.println("Count is " + BC.getCount());
    }

    private static void CreateReferencePoint(byte[] fileData) {
        ReferencePoint RP = new ReferencePoint();

        RP.setValidity(byte2Binary4(fileData[RP.getValidityIndex()]));

        RP.setLatBearing(fileData);

        RP.setLatDegree(fileData);

        RP.setLatMinute(fileData);

        RP.setLatMinutesDiv100(fileData);

        RP.setLongBearing(fileData);

        int temp = RP.getLongDegreeIndex();
        int sub = 0;
        sub = sub + byte2Binary3(fileData[temp]);
        sub = sub + byte2Binary4(fileData[(temp + 1)]);

        RP.setLongDegree(sub);

        RP.setLongMinutes(fileData);

        RP.setLongMinutesDiv100(fileData);

        RP.setPointId(fileData);

        RP.setGeoRefSystem(fileData);

        System.out.println("Validity is " + RP.getValidity());
        System.out.println("Lat bearing is " + RP.getLatBearing());
        System.out.println("Lat degree is " + RP.getLatDegree());
        System.out.println("Lat minutes is " + RP.getLatMinutes());
        System.out.println("Lat minutes/100 is " + RP.getLatMinutesDiv100());
        System.out.println("Long bearing is " + RP.getLongBearing());
        System.out.println("Long degree is " + RP.getLongDegree());
        System.out.println("Long Minutes is " + RP.getLongMinutes());
        System.out.println("Long degree is " + RP.getLongMinutsDiv100());
        System.out.println("Point ID is " + RP.getPointId());
        System.out.println("Selected Geo Ref System is " + RP.getSelectedGeoRefSystem());

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

//    switch (missionData) {
//        case ACM_FAILURE: {
//            datdaFile = "LOG_ACRM.BF#";
//            break;
//        }
//
//        case ACM_LANDINGS: {
//            datdaFile = "ACM_LAND.CF#";
//            breaK;
//        }
//
//        case ACM_SPECIFIC_FAILURE: {
//            dataFile = "LOG_SACM.CF#";
//            break;
//        }
//
//        case COM_DATA_LINK_A: {
//            dataFile = "ACOM_DLK.AC#";
//            break;
//        }
//
//        case COM_DIR_FINDER_A: {
//            dataFile = "ACOM_DFI.AC#";
//            break;
//        }
//
//        case COM_HF_A: {
//            dataFile = "ACOM_FHZ.AC#";
//            break;
//        }
//
//        case COM_V_UHF_A: {
//            dataFile = "ACOM_UHF.AC#";
//            break;
//        }
//
//        case DID_FLT_RESTRICT: {
//            dataFile = "FLT_REST.CF#";
//            break;
//        }
//
//        case DID_IDENTIFIER: {
//            dataFile = "DID_NAME.CF#";
//            break;
//        }
//
//        case DID_NOTEBOOK: {
//            dataFile = "NOTEBOOK.CF#";
//            break;
//        }
//
//        case DID_PASSWORD: {
//            dataFile = "SSEZAMME.AF#";
//            break;
//        }
//
//        case DID_SIGNATURE: {
//            dataFile = "SIGNATUR.CF#";
//            break;
//        }
//
//        case ECM_DATA_FILE: {
//            dataFile = "ECM_REPO.BF#";
//            break;
//        }
//
//        case ECMU_DATA_FILE_EPC: {
//            dataFile = "EPC_ECMU.BF#";
//            break;
//        }
//
//        case ECMU_DATA_FILE_LEM: {
//            dataFile = "LEM_ECMU.BF#";
//            break;
//        }
//
//        case ECMU_DATA_FILE_LUM: {
//            dataFile = "LUM_ECMU.BF#";
//            break;
//        }
//
//        case ECMU_CURRENT_DIAGNOSYS: {
//            dataFile = "CUR_DIAG.BF#";
//            break;
//        }
//
//        case ECMU_COMPLETE_DIAGNOSYS: {
//            dataFile = "CPL_DIAG.BF#";
//            break;
//        }
//
//        case ECMU_CURR_DIAG_REPORT: {
//            dataFile = "CUR_DREP.BF#";
//            break;
//        }
//
//        case ECMU_CMPL_DIAG_REPORT: {
//            dataFile = "CPL_DREP.BF#";
//            break;
//        }
//
//        case ECMU_ENGINE_DATA: {
//            dataFile = "ENG_ECMU.BF#";
//            break;
//        }
//
//        case EMOS_LUM_INIT_DATA: {
//            dataFile = "LUM_INIT.AF#";
//            break;
//        }
//
//        case GUN_BORESIGHTING_F2: {
//            dataFile = "GUN_BORE.AC#";
//            break;
//        }
//
//        case HC_EMPTY_MASS: {
//            dataFile = "HC_EMASS.AF#";
//            break;
//        }
//
//        case HMSG_BORESIGHTING_F2: {
//            dataFile = "HMG_BORE.AC#";
//            break;
//        }
//
//        case HMSP_BORESIGHTING_F2: {
//            dataFile = "HMP_BORE.AC#";
//            break;
//        }
//
//        case HW_SW_REF_ACT_A: {
//            dataFile = "HWSW_ACT.BC#";
//            break;
//        }
//
//        case HW_SW_REF_EXP_A: {
//            dataFile = "HWSW_EXP.AC#";
//            break;
//        }
//
//        case INHIBIT_PROT: {
//            dataFile = "INH_PROT.AF#";
//            break;
//        }
//
//        case LRU_CONFIG_DATA: {
//            dataFile = "LRU_CONF.BF#";
//            break;
//        }
//
//        case MM_CHECK_LIST_FILE: {
//            dataFile = "MMCKLIST.AF#";
//            break;
//        }
//
//        case OSTM_IBIT: {
//            dataFile = "OSTMIBIT.CF#";
//            break;
//        }
//
//        case PL_BORESIGHTING_F2: {
//            dataFile = "POL_BORE.AC#";
//            break;
//        }
//
//        case REFERENCE_POINT_FILE_A: {
//            dataFile = "REFER_PT.CF#";
//            break;
//        }
//
//        case RMS_BORESIGHTING_F2: {
//            dataFile = "RMS_BORE.AC#";
//            break;
//        }
//
//        case RNAV_DATA_BASE_A: {
//            dataFile = "RNAVBASE.CC#";
//            break;
//        }
//
//        case ROUTES_DATA_BASE: {
//            dataFile = "RUTDBASE.CF#";
//        }
//
//        case SDC_BORESIGHTING: {
//            dataFile = "SDC_BORE.AF#";
//            break;
//        }
//
//        case SM_FAILURE: {
//            dataFile = "LOG_ASYM.BF#";
//            break;
//        }
//
//        case TAF_DATA_HELLFIRE_A: {
//            dataFile = "TAF_HELL.AC#";
//            break;
//        }
//
//        case TAF_DATA_WEAPON_A: {
//            dataFile = "TAF_WEAP.CC#";
//            break;
//        }
//
//        case WAYPOINTS_DATA_BASE: {
//            dataFile = "WAYDBASE.CF#";
//            break;
//        }
//    }

    //open the appropriate file

    //create the class of the data required
//}// end of driver class
