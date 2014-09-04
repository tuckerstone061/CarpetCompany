package pak1;

import java.util.*;

/**
 *
 * @author Tucker Stone
 * @version 9/3/14
 */
public class CarpetDriver {
    public static void main( String [] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to the carpet shop!");
        System.out.print("What is the length of the area you need to carpet?");
        double length = scan.nextDouble();
        System.out.println("What is the width?");
        double width = scan.nextDouble();
        
        RoomDimension room = new RoomDimension( length, width );
        System.out.println(room.toString());
        double cost;
        System.out.println("What type of carpet would you like to use?");
        System.out.println("Type 1 for Shag($8.00/sqft) or 2 for Plush($11.00/sqft)");
        int choice = scan.nextInt();
        if (choice == 1 )
            cost = 8.00;
        else
            cost = 11.00;
        
        RoomCarpet carp = new RoomCarpet(room, cost);
        System.out.println(carp.toString());
    }
    
}
