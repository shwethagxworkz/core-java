class CricketTeam{
	
	String teamName[]=new String[11];
	int index;
	
	public boolean playerNames(String name){
		
		boolean isAdded =false;
		if(teamName!= null){
		teamName[index]=name;
		index ++;
		isAdded=true;
		}
		return isAdded;
	}