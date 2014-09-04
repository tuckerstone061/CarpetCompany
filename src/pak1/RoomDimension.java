package pak1;

/**
 *
 * @author Tucker Stone
 * @version 9/3/14
 * 
 */
public class RoomDimension {
    
    private double length;
    private double width;
    
    public RoomDimension( double len, double wid)
    {
        this.length = len;
        this.width = wid;
    }
    
    public double getArea()
    {
        return this.length * this.width;
    }
    
    public String toString()
    {
        return "The room is " + this.length
                + "ft. by " + this.width + "ft for a total"
                + " of " + (this.length * this.width) + "sqft.";
    }
    
}
    
    

