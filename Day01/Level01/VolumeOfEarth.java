import java.util.*;
//Create VolumeOfEarth class for finding volume of earth in km and miles
public class VolumeOfEarth{
	public static void main (String [] args){
		//create variable radiusOfEarthInKm to indicate radius of earth in km
		double radiusOfEarthInKm = 6378 ;
		//create variable volumeOfEarthInKm to calculate volume of earth in km
		double volumeOfEarthInKm =  (4/3) * 3.14 * Math.pow(radiusOfEarthInKm,3);
		//create variable volumeOfEarthInMiles to calculate volume of earth in miles
		double volumeOfEarthInMiles = volumeOfEarthInKm*0.6;
		//Print volume of earth in km and miles
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles);
		
	}
}	