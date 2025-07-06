public class vehicle {
    String vehicle_modle;
    String  colour;
    String  Nplate;
    void vehicle(String vehicle_modle,String colour,String Nplate){
        this.vehicle_modle=vehicle_modle;
        this.colour=colour;
        this.Nplate=Nplate;
        System.out.println(vehicle_modle+" "+colour+" "+Nplate);
    }
    public static void main(String [] args){
        vehicle a = new vehicle();
        a.vehicle("car","red","tn123");
    }
}
