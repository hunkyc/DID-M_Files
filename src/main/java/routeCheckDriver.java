import java.io.*;

public class routeCheckDriver
{
    public static void main(String[] args) throws IOException
    {
        byte[] testWaypoint = new byte[]{0x01, 0x59, 0x50, 0x45, 0x41, 0x20, 0x00, 0x2d, 0x01, 0x00, 0x04, 0xa, 0x1d, 0x00, 0x00, 0x00, 0x00, 0x00};
        int firstRoute = 0;
        int secondRoute = 276;
        int thirdRoute = 552;
        int fourthRoute = 828;
        int fifthRoute = 1104;
        int routeRequested = 3;
        int routeOffset = 0;
        byte[] routeToCheck;

        PrintWriter out = null;
        //try {
        out = new PrintWriter(new OutputStreamWriter(
                new BufferedOutputStream(new FileOutputStream("out.txt")), "UTF-8"));



        //open the file
        File file = new File("/Users/martinsmith/IdeaProjects/DID-M_Files/src/test/Data/RUTDBASE.CF1");
        //create a byte array of the full file
        byte[] fileData = new byte[(int) file.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        dis.readFully(fileData);
        dis.close();
        routeOffset = getRouteOffset(firstRoute, secondRoute, thirdRoute, fourthRoute, fifthRoute, routeRequested, routeOffset);
        routeToCheck = getBytes(routeOffset, fileData);


        for (int i = 1; i < 6; i++) {
            routeRequested = i;
            routeOffset = getRouteOffset(firstRoute, secondRoute, thirdRoute, fourthRoute, fifthRoute, routeRequested, routeOffset);
            routeToCheck = getBytes(routeOffset, fileData);
            //create the object
            route check = new route(routeToCheck, 0);

            out.println();
            out.println("Route " + check.getRouteId());

            //for each routepoint of the route get the
            for(int j = 1; j < 16; j++) {
                getRoutePointAttributes(check, j, out);
            }
        }
        out.flush();
        out.close();
    }

    private static void getRoutePointAttributes(route check, int j, PrintWriter out) throws FileNotFoundException, UnsupportedEncodingException {

        //copy all the route details to a CSV file

        switch(j) {
            case 1: {
                out.println();
                out.println("Routepoint1");
                if (check.point1.getRoutepointValid().equals("Point invalid")) {
                    break;
                }
                else {

                    out.println("Routepoint ID is " + check.point1.getId());
                    out.println("Routepoint Vector Valid is " + check.point1.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point1.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point1.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point1.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point1.getIsEngagmentPoint());
                    break;
                }
            }
            case 2: {
                out.println();
                out.println("Routepoint2");
                if (check.point2.getRoutepointValid().equals("Point invalid")) {
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point2.getId());
                    out.println("Routepoint Vector Valid is " + check.point2.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point2.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point2.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point2.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point2.getIsEngagmentPoint());
                    break;
                }
            }
            case 3: {
                out.println();
                out.println("Routepoint3");
                if (check.point3.getRoutepointValid().equals("Point invalid")) {
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point3.getId());
                    out.println("Routepoint Vector Valid is " + check.point3.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point3.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point3.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point3.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point3.getIsEngagmentPoint());
                    break;
                }
            }
            case 4: {
                out.println();
                out.println("Routepoint4");
                if (check.point4.getRoutepointValid().equals("Point invalid")) {
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point4.getId());
                    out.println("Routepoint Vector Valid is " + check.point4.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point4.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point4.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point4.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point4.getIsEngagmentPoint());
                    break;
                }
            }
            case 5: {
                out.println();
                out.println("Routepoint5");
                if (check.point5.getRoutepointValid().equals("Point invalid")) {
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point5.getId());
                    out.println("Routepoint Vector Valid is " + check.point5.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point5.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point5.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point5.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point5.getIsEngagmentPoint());
                    break;
                }
            }
            case 6: {
                out.println();
                out.println("Routepoint6");

                if (check.point6.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point6.getId());
                    out.println("Routepoint Vector Valid is " + check.point6.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point6.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point6.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point6.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point6.getIsEngagmentPoint());
                    break;
                }
            }
            case 7: {
                out.println();
                out.println("Routepoint7");
                if (check.point7.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point7.getId());
                    out.println("Routepoint Vector Valid is " + check.point7.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point7.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point7.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point7.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point7.getIsEngagmentPoint());
                    break;
                }
            }
            case 8: {
                out.println();
                out.println("Routepoint8");
                if (check.point8.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point8.getId());
                    out.println("Routepoint Vector Valid is " + check.point8.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point8.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point8.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point8.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point8.getIsEngagmentPoint());
                    break;
                }
            }
            case 9: {
                out.println();
                out.println("Routepoint9");
                if (check.point9.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point9.getId());
                    out.println("Routepoint Vector Valid is " + check.point9.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point9.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point9.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point9.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point9.getIsEngagmentPoint());
                    break;
                }
            }
            case 10: {
                out.println();
                out.println("Routepoint10");
                if (check.point10.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point10.getId());
                    out.println("Routepoint Vector Valid is " + check.point10.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point10.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point10.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point10.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point10.getIsEngagmentPoint());
                    break;
                }
            }
            case 11: {
                out.println();
                out.println("Routepoint11");
                if (check.point11.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point11.getId());
                    out.println("Routepoint Vector Valid is " + check.point11.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point11.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point11.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point11.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point11.getIsEngagmentPoint());
                    break;
                }
            }
            case 12: {
                out.println();
                out.println("Routepoint12");
                if (check.point12.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point12.getId());
                    out.println("Routepoint Vector Valid is " + check.point12.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point12.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point12.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point12.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point12.getIsEngagmentPoint());
                    break;
                }
            }
            case 13: {
                out.println();
                out.println("Routepoint13");
                if (check.point13.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point13.getId());
                    out.println("Routepoint Vector Valid is " + check.point13.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point13.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point13.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point13.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point13.getIsEngagmentPoint());
                    break;
                }
            }
            case 14: {
                out.println();
                out.println("Routepoint14");
                if (check.point14.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point14.getId());
                    out.println("Routepoint Vector Valid is " + check.point14.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point14.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point14.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point14.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point14.getIsEngagmentPoint());
                    break;
                }
            }
            case 15: {
                out.println();
                out.println("Routepoint15");
                if (check.point15.getRoutepointValid().equals("Point invalid")) {
                    out.println("Routepoint invalid");
                    break;
                }
                else {
                    out.println("Routepoint ID is " + check.point15.getId());
                    out.println("Routepoint Vector Valid is " + check.point15.getLegVectorValid());
                    out.println("Routepoint Leg Bearing is " + check.point15.getLegBearing());
                    out.println("Routepoint Leg Distance is " + check.point15.getLegDistance());
                    out.println("Routepoint Altitude is " + check.point15.getAltitude());
                    out.println("Routepoint Engagement Point is " + check.point15.getIsEngagmentPoint());
                    break;
                }
            }
        }
    }

    private static byte[] getBytes(int routeOffset, byte[] fileData) {
        //create a byte array for just the route requested
        //I.E just the route details and the routepoints of that route.
        byte[] routeToCheck = new byte[276];
        for (int j = 0; j < 276; j++) {
            routeToCheck[j] = fileData[j + routeOffset];
        }
        return routeToCheck;
    }

    private static int getRouteOffset(int firstRoute, int secondRoute, int thirdRoute, int fourthRoute, int fifthRoute, int routeRequested, int routeOffset) {
        //get the route requested and set the variables to pass for object creation
        switch (routeRequested) {
            case 1: {
                routeOffset = firstRoute;
                break;
            }
            case 2: {
                routeOffset = secondRoute;
                break;
            }
            case 3: {
                routeOffset = thirdRoute;
                break;
            }
            case 4: {
                routeOffset = fourthRoute;
                break;
            }
            case 5: {
                routeOffset = fifthRoute;
                break;
            }
        }
        return routeOffset;
    }
}
