import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the latitude of the starting location: ");
        double startLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double startLong = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double endLat = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLong = in.nextDouble();

        GeoLocation myGeolocation = new GeoLocation(startLat, startLong);
        GeoLocation other = new GeoLocation(endLat, endLong);

        System.out.println("The distance is " + myGeolocation.distanceFrom(other) + " miels.");
    }
}