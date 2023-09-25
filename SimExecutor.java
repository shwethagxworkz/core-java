class SimExecutor {
    public static void main(String[] args) {
        Sim sim = new Sim();
        sim.setSimName("jio");
        sim.setNumber(7019084193L);
        sim.setDatapack("5GB 749 rs");
        sim.setPrice(500);

        CellPhone cellPhone = new CellPhone();
        cellPhone.sim = sim;
        cellPhone.cellphoneName = "Mi  note * pro";
	    System.out.println("-------------------------------------------------");							
        System.out.println("Cellphone Name: " + cellPhone.cellphoneName);
        System.out.println("SIM Name: " + cellPhone.sim.getSimName());
        System.out.println("SIM Number: " + cellPhone.sim.getNumber());
        System.out.println("Data Pack: " + cellPhone.sim.getDatapack());
        System.out.println("Price: " + cellPhone.sim.getPrice());
		System.out.println("-------------------------------------------------");							
    }
}