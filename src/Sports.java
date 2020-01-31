//models all sports, a parent class
public abstract class Sports
{
    protected String environment;
    protected double length;
    protected boolean hasTeams;
    protected int numPlayers;
    protected String name;

    public Sports(String name, boolean hasTeams, String environment, double length, int numPlayers)
    {
        this.name = name;
        this.hasTeams = hasTeams;
        this.environment = environment;
        this.length = length;
        this.numPlayers = numPlayers;
    }//end constructor

    public String getName()
    {
        return name;
    }
    public double getLength()
    {
        return length;
    }
    public String getEnvironment()
    {
        return environment;
    }
    public boolean hasTeams()
    {
        if(hasTeams == true)
        {
            return true;
        }
        return false;
    }//end hasTeams
    public String toString()
    {
        String output = "---" + name.toUpperCase() + "---";
        output += "\nHas Teams: " + hasTeams;
        output += "\nEnvironment: " + environment;
        output += "\nNumber of players (includes goalies): " + numPlayers;
        output += "\nLength: " + length + " min";
        return output;
    }//end toString



}//end of class sports