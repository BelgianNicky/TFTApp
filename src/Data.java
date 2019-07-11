
public class Data {

	static int numberOfCharacters = 0;
	static int[] numberOfChamps = new int[] {0, 39, 26, 21, 13, 10}; // first data is useless, just so if you're lvl 5, you check numberOfChamps[5];
	static int[] xpRequired = new int[] {0, 2, 2, 6, 10, 18, 30, 46, 70}; // first data is useless, just so if you're lvl 5, you check xpRequired[5];
	static double[] lvl1_Odds = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0}; // first data is useless, if you check for rank 2 champs, you check lvl1_odds[2];
	static double[] lvl2_Odds = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
	static double[] lvl3_Odds = new double[] {0.0, 0.65, 0.3, 0.05, 0.0, 0.0};
	static double[] lvl4_Odds = new double[] {0.0, 0.5, 0.35, 0.15, 0.0, 0.0};
	static double[] lvl5_Odds = new double[] {0.0, 0.37, 0.35, 0.25, 0.03, 0.0};
	static double[] lvl6_Odds = new double[] {0.0, 0.245, 0.35, 0.30, 0.1, 0.005};
	static double[] lvl7_Odds = new double[] {0.0, 0.2, 0.3, 0.33, 0.15, 0.02};
	static double[] lvl8_Odds = new double[] {0.0, 0.15, 0.25, 0.35, 0.2, 0.05};
	static double[] lvl9_Odds = new double[] {0.0, 0.10, 0.15, 0.35, 0.30, 0.10};
	
	
	public static double returnOnInvestment(int level, int xp, int whichLevelLookingFor){
		/* Example : 	https://www.youtube.com/watch?v=hXEY0bG0Yew
		* 				each roll at lvl 8 you get 0.2*5 = 1 epic on avg (check lvl8_Odds, epic being the 4th data (0.2) so 20%)
		*			 	At lvl 7, each roll get you 0.15*5 = 0.75 epic on avg (check lvl7_Odds, epic being the 4th data (0.15) so 15%)
		*			 	Let's say you need 40xp to get to lvl8 => 40xp = 40gold => 20 rolls Equivalent 
		*				ChanceToGetCharAtLvl7*(x+NumberOfRollsEquivalent) = ChanceToGetCharAtLvl8*x
		*  				Based on the situation given above you get :
		*  				.75*(x+20) = 1*x
		*  				x = 60, You need to do 60 rolls after leveling up for it to be worth it.
		*  
		*  				The formula used is going to be like this
		*  				ChanceToGetCharAtLvlY*(x+xpLeft/2) = ChanceToGetCharAtLvlZ*x
		*  				ChanceToGetCharAtLvlY*x + ChanceToGetCharAtLvlY*xpLeft/2 = ChanceToGetCharAtLvlZ*x
		*  				ChanceToGetCharAtLvlY*xpLeft/2 = ChanceToGetCharAtLvlZ*x - ChanceToGetCharAtLvlY*x
		*  				ChanceToGetCharAtLvlY*xpLeft/2 = x (ChanceToGetCharAtLvlZ - ChanceToGetCharAtLvlY)
		*  				x = (ChanceToGetCharAtLvlY*xpLeft/2) / (ChanceToGetCharAtLvlZ - ChanceToGetCharAtLvlY)
		*/
		double result = -1;
		switch(level) {
		case 1: result =  (lvl1_Odds[whichLevelLookingFor]*(xpRequired[1]-xp)/2) / (lvl2_Odds[whichLevelLookingFor] - lvl1_Odds[whichLevelLookingFor]);
				break;
				
		case 2: result =  (lvl2_Odds[whichLevelLookingFor]*(xpRequired[2]-xp)/2) / (lvl3_Odds[whichLevelLookingFor] - lvl2_Odds[whichLevelLookingFor]);
				break;
			
		case 3: result =  (lvl3_Odds[whichLevelLookingFor]*(xpRequired[3]-xp)/2) / (lvl4_Odds[whichLevelLookingFor] - lvl3_Odds[whichLevelLookingFor]);
				break;
			
		case 4: result =  (lvl4_Odds[whichLevelLookingFor]*(xpRequired[4]-xp)/2) / (lvl5_Odds[whichLevelLookingFor] - lvl4_Odds[whichLevelLookingFor]);
				break;
			
		case 5: result =  (lvl5_Odds[whichLevelLookingFor]*(xpRequired[5]-xp)/2) / (lvl6_Odds[whichLevelLookingFor] - lvl5_Odds[whichLevelLookingFor]);
				break;
			
		case 6: result =  (lvl6_Odds[whichLevelLookingFor]*(xpRequired[6]-xp)/2) / (lvl7_Odds[whichLevelLookingFor] - lvl6_Odds[whichLevelLookingFor]);
				break;
			
		case 7: result =  (lvl7_Odds[whichLevelLookingFor]*(xpRequired[7]-xp)/2) / (lvl8_Odds[whichLevelLookingFor] - lvl7_Odds[whichLevelLookingFor]);
				break;
			
		case 8: result =  (lvl8_Odds[whichLevelLookingFor]*(xpRequired[8]-xp)/2) / (lvl9_Odds[whichLevelLookingFor] - lvl8_Odds[whichLevelLookingFor]);
				break;
		}
		
		return result;
	}

	public static double checkLvl1_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl1_Odds.length; i++) {
			temp += lvl1_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl2_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl2_Odds.length; i++) {
			temp += lvl2_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl3_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl3_Odds.length; i++) {
			temp += lvl3_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl4_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl4_Odds.length; i++) {
			temp += lvl4_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl5_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl5_Odds.length; i++) {
			temp += lvl5_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl6_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl6_Odds.length; i++) {
			temp += lvl6_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl7_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl7_Odds.length; i++) {
			temp += lvl7_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl8_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl8_Odds.length; i++) {
			temp += lvl8_Odds[i];
		}
		return temp;
	}
	
	public static double checkLvl9_Odds(){
		double temp = 0.0;
		for(int i=0; i < lvl9_Odds.length; i++) {
			temp += lvl9_Odds[i];
		}
		return temp;
	}
	
	public static void main(String[] args){
		double temp = Math.round(returnOnInvestment(5, 2, 4));
		System.out.println("Nombre de rolls : " + temp + ", Nombre de golds : " + temp*2);
	}
}