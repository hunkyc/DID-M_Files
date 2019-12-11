
public class route {
    String routeValidity = "";
    String routeId = "";
    RoutesDataBase point1, point16 = new RoutesDataBase();
    RoutesDataBase point2 = new RoutesDataBase();
    RoutesDataBase point3 = new RoutesDataBase();
    RoutesDataBase point4 = new RoutesDataBase();
    RoutesDataBase point5 = new RoutesDataBase();
    RoutesDataBase point6 = new RoutesDataBase();
    RoutesDataBase point7 = new RoutesDataBase();
    RoutesDataBase point8 = new RoutesDataBase();
    RoutesDataBase point9 = new RoutesDataBase();
    RoutesDataBase point10 = new RoutesDataBase();
    RoutesDataBase point11 = new RoutesDataBase();
    RoutesDataBase point12 = new RoutesDataBase();
    RoutesDataBase point13 = new RoutesDataBase();
    RoutesDataBase point14 = new RoutesDataBase();
    RoutesDataBase point15 = new RoutesDataBase();
    int routeLength = 276;
    int routeStart = 0;
    int routeValidityIndex = 0;
    int routeIdStartIndex = 1;
    int routeIdEndIndex = 5;
    int routePoint1Index = 6;
    int routePoint2Index = 24;
    int routePoint3Index = 42;
    int routePoint4Index = 60;
    int routePoint5Index = 78;
    int routePoint6Index = 96;
    int routePoint7Index = 114;
    int routePoint8Index = 132;
    int routePoint9Index = 150;
    int routePoint10Index = 168;
    int routePoint11Index = 186;
    int routePoint12Index = 204;
    int routePoint13Index = 222;
    int routePoint14Index = 240;
    int routePoint15Index = 258;
    int routepointLength = 18;

    public route() {

    }
    public route(byte[] fromRouteFile, int routeStart) {
        //get the route header
        //byte 1 = is route valid?
        routeValidity = setRouteValidity(fromRouteFile);
        routeId = setRouteId(fromRouteFile);
        point1 = setRoutePoints(fromRouteFile, routePoint1Index);
        point2 = setRoutePoints(fromRouteFile, routePoint2Index);
        point3 = setRoutePoints(fromRouteFile, routePoint3Index);
        point4 = setRoutePoints(fromRouteFile, routePoint4Index);
        point5 = setRoutePoints(fromRouteFile, routePoint5Index);
        point6 = setRoutePoints(fromRouteFile, routePoint6Index);
        point7 = setRoutePoints(fromRouteFile, routePoint7Index);
        point8 = setRoutePoints(fromRouteFile, routePoint8Index);
        point9 = setRoutePoints(fromRouteFile, routePoint9Index);
        point10 = setRoutePoints(fromRouteFile, routePoint10Index);
        point11 = setRoutePoints(fromRouteFile, routePoint11Index);
        point12 = setRoutePoints(fromRouteFile, routePoint12Index);
        point13 = setRoutePoints(fromRouteFile, routePoint13Index);
        point14 = setRoutePoints(fromRouteFile, routePoint14Index);
        point15 = setRoutePoints(fromRouteFile, routePoint15Index);
    }

    public String setRouteValidity(byte[] route) {
        if (route[routeValidityIndex] == 1) {
            routeValidity = "Valid";
        }
        else {
            routeValidity = "Invalid";
        }

        return routeValidity;
    }

    public String setRouteId(byte[] route) {
        if (getRouteValidity().equalsIgnoreCase("Valid")) {
            for (int i = routeIdStartIndex; i <= routeIdEndIndex; i++) {
                routeId = routeId.concat(Character.toString((char) route[i]));
            }
        }
        return routeId;
    }

    public RoutesDataBase setRoutePoints(byte[] route, int index) {
        byte[] temp = new byte[18];

        //the data to use for constructor of RoutesDataBase
        for (int f = 0; f < temp.length; f++) {
            temp[f] = route[(f + index)];
        }

        RoutesDataBase routepoint1 = new RoutesDataBase(temp);
        return routepoint1;
    }

    public String getRouteValidity() { return routeValidity; }

    public String getRouteId() { return routeId; }

//    public RoutesDataBase getRoutepoint(int i) {
//        RoutesDataBase r;
//        switch (i) {
//            case 1: {
//                r = new RoutesDataBase()
//            }
//        }
//
//        return r;
//    }
}