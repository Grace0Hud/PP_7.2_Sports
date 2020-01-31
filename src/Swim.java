
public class Swim extends Sports
{
    private int numEvents;
    private int numHeats;
    private int numTeams;

    public Swim(String name, boolean hasTeams, String environment, double length, int numPlayers, int numEvents, int numHeats, int numTeams)
    {
        super(name, hasTeams, environment, length, numPlayers);
        this.numEvents = numEvents;
        this.numHeats = numHeats;
        this.numTeams = numTeams;
    }//end of constructor

    public String toString()
    {
        String output = super.toString();
        output += "\nNumber of Events: " + numEvents;
        output += "\nNumber of Heats: " + numHeats;
        output += "\nNumber of Teams: " + numTeams;
        return output;
    }//end toString
}//end swim class