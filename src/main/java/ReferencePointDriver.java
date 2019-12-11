import java.io.*;

/**
 * Created by martinsmith on 29/11/19.
 */
public class ReferencePointDriver {
    public static void main (String[] Args) throws FileNotFoundException, IOException{
        File file = new File("/Users/martinsmith/IdeaProjects/DID-M_Files/src/test/Data/REFER_PT.CF1");
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();

        ReferencePointFileA ref = new ReferencePointFileA();

        int i= fileData[1];

        System.out.println(i);
        //validity
        ref.setValidity(fileData);
        ref.setLatBearing(fileData);
        ref.setLatDegree(fileData);
        ref.setLatMinutes(fileData);
        ref.setLatMinutesDiv100(fileData);
        ref.setLongBearing(fileData);
        ref.setLongDegree(fileData);
        ref.setLongMinutes(fileData);
        ref.setLongMinutesDiv100(fileData);
        ref.setPointId(fileData);
        ref.setSelRefGeoSystem(fileData);


        System.out.println(ref.getValidity());
        System.out.println(ref.getlatBearing());
        System.out.println(ref.getLatDegree());
        System.out.println(ref.getLatMinutes());
        System.out.println(ref.getLatminutesDiv100());
        System.out.println(ref.getLongBearing());
        System.out.println(ref.getLongDegrees());
        System.out.println(ref.getLongMinutes());
        System.out.println(ref.getLongMinutesDiv100());
        System.out.println(ref.getPointId());
        System.out.println("Sel Ref is " + ref.getSelRefGeoSystem());
    }
}
