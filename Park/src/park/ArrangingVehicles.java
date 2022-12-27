package park;

//import java.util.*;
import java.util.Arrays;

public class ArrangingVehicles{
	public static void main(String args[]){
//	int a[] = {7,4,5,2,8};
//	
//	Arrays.sort(a);
//	
//	for(int i=0; i < a.length ; i++ ) {
//		System.out.println(a[i]+"");
//	}
//	
//	System.out.println();
//	System.out.println("/////////");
	
	Parking[] car = new Parking[5];
	
	car[0] = new Parking("Audi",7);
	car[1] = new Parking("Benz",4);
	car[2] = new Parking("Honda",5);
	car[3] = new Parking("Hyundai",2);
	car[4] = new Parking("Suzuki",8);
	
	int index = car[0].getTime();
	for(int i=1; i <= car.length ; i++ ) {
		if(car[i].getTime() < car[i+1].getTime() ) {
			index = car[i].getTime() ;
			}
		System.out.println(car[i]);
		}
	}
}

