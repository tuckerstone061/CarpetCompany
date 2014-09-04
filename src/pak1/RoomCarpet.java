package pak1;


/**
 *
 * @author Tucker Stone
 * @version 9/3/14
 * 
 */
public class RoomCarpet {
    
    private RoomDimension size;
    private double carpetCost;
    
    public RoomCarpet( RoomDimension dim, double cost )
    {
        this.size = dim;
        this.carpetCost = cost;
    }
    
    public double getTotalCost()
    {
        return this.size.getArea() * carpetCost;
    }
    
    public String toString()
    {
        return "The cost of the carpet is $" + this.getTotalCost() + ".";
    }
    
}
