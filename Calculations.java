import java.lang.Math;

public class Calculations {
    public static String distance(int x1, int y1, int z1, int x2, int y2, int z2){
        Double d = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) + Math.pow((z1-z2), 2));;
        String result= d.toString();
        return(result);
    }
    public static String overworldToNether(int overworldx1, int overworldz1){
        int netherXCoord = overworldx1/8;
        int netherZCoord = overworldz1/8;
        String coords = "The coords to build the portal at in the nether are " + netherXCoord + " : " + netherZCoord;
        return(coords);
    }
    public static String netherToOverworld(int netherx1, int netherz1){
        int overworldXCoord = netherx1*8;
        int overworldZCoord = netherz1*8;
        String coords = "The coords to build the portal at in the nether are " + overworldXCoord + " : " + overworldZCoord;
        return(coords);
    }
}
