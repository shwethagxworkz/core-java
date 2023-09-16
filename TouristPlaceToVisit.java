class class TouristPlaceToVisit{

public static void main(String ar[]){

String placeNames[] = {"Manglore","Udupi","Gokarana","Goa","Apsarakonda Falls"};

TouristPlace tour = new TouristPlace(1,10000,placeNames,12,"Mini Bus");
tour.visit();

}


}{

int agencyID;
int packages;
String placeNames[];
int noOfDays;
String mode;

public TouristPlace(int agencyID, int packages , String placeNames[] , int noOfDays , String mode){

this.agencyID = agencyID;
this.packages = packages;
this.placeNames = placeNames;
this.noOfDays =noOfDays;
this.mode = mode;
displayDetails();




}
public void visit()
{
	for(int photo =0 ; photo<placeNames.length ;photo++)
	{
System.out.println("Name of Places to visit :"+placeNames[photo]);
}



}
public void displayDetails(){

System.out.println("Agency ID :"+agencyID);
System.out.println("Package price is :Rs "+packages);
System.out.println("No of days :"+noOfDays);
System.out.println("Mode of Transport : "+mode);



}
}