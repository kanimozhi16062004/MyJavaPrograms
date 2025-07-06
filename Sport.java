class Sports{
    void Play(){
        System.out.println("Sports");
    }
}
class Foodball extends Sports{
   void Play(){
       System.out.println("Foodball");
   }
}
class Tennis extends Sports{
    void Play(){

        System.out.println("Tennis");
    }
}
class Sport {
    public static void main(String [] args){
        Tennis a = new Tennis();
        a.Play();
        Foodball b = new Foodball();
        b.Play();
    }
}
