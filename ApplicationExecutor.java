class ApplicationExecutor{


public static void main( String apps[]){

Application app = new Application();

app.setName("Phonepe");

playStore store = new playStore();
//has-A relationship

store.application = app;

store.managedBy = "Google";

  System.out.println(store.aplication.getName());
}
}











