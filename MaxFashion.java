class MaxFashion{


int id;
String[] brands ;
String location;
int noOfWorkers;
String[] categories;

public MaxFashion(int iD, String[] brand , String loc , int workers , String[] categorys){
	id = iD;
	brands = brand;
	location =loc;
	noOfWorkers= workers;
	categories = categorys;	
}

public void sell(){
System.out.println(" The showroom moto is to sell quality and best priced cloths");

}
public void makeMoney(){
System.out.println(" The showroom second moto is to make lot of money");
System.out.println(id+" "+" "+location+" "+noOfWorkers+" ");

}

public void getallBrands(){
	
	for(int batte =0 ; batte<brands.length ; batte++){
		
		System.out.println(" The Brands available in MaxFashion Showroom are :"+brands[batte]);
}
}
	
    public void getallcategories(){
	
	for(int gender =0 ; gender<categories.length; gender++){
		
		System.out.println(" The general categories are :" +categories[gender]);
		}
}
 
}