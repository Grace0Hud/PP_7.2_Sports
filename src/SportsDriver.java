public class SportsDriver
{
    public static void main(String[] args)
    {
        Sports waterpolo = new Waterpolo("waterpolo", true, "pool", 45.20,7,"short", true);
        System.out.println(waterpolo);
        System.out.println("Water polo is played in a " + waterpolo.getEnvironment());

        Sports swim = new Swim("Swim", true, "pool", 60, 30, 20, 3, 3);
        System.out.println(swim);

        System.out.println("Swim meets take " + swim.getLength() + " min");
    }
}//end class sportsDriver