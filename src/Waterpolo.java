public class Waterpolo extends Sports
{
    private String courseLength; //long/short
    private boolean wallStart;

    public Waterpolo(String name, boolean hasTeams, String environment, double length, int numPlayers, String courseLength, boolean wallStart)
    {
        super(name, hasTeams, environment, length, numPlayers);
        this.courseLength = courseLength;
        this.wallStart = wallStart;
    }

    public String toString()
    {
        String output = super.toString();
        output += "\nCourse Length: " + courseLength;
        output += "\nWall Start: " + wallStart;
        return output;
    }

}