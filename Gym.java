class Gym{

int id;
int price;
String typesOfEquipment[];
int startTime;
int endTime;

public Gym(int id, int price , String typesOfEquipment[] , int startTime , int endTime){

this.id = id;
this.price = price;
this.typesOfEquipment = typesOfEquipment;
this.startTime =startTime;
this.endTime = endTime;
displayDetails();