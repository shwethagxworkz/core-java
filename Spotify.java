class Spotify{
	String playerNames[]=new String[11];
	int index;
	
	public boolean addSong(String name){
		
		boolean isAdded =false;
		if(playerNames != null){
		playerNames[index]=name;
		index ++;
		isAdded=true;
		}
		return isAdded;
	}
	
	public void getDisplay(){
		System.out.println("list of Songs:");
		for(int index=0;index<playerNames.length;index++){
			System.out.println(playerNames[index]);
			
		}
	}
	
	
}