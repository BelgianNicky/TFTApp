
public class Calculator {

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
		case 1: result =  (Data.lvl1_Odds[whichLevelLookingFor]*(Data.xpRequired[1]-xp)/2) / (Data.lvl2_Odds[whichLevelLookingFor] - Data.lvl1_Odds[whichLevelLookingFor]);
				break;
				
		case 2: result =  (Data.lvl2_Odds[whichLevelLookingFor]*(Data.xpRequired[2]-xp)/2) / (Data.lvl3_Odds[whichLevelLookingFor] - Data.lvl2_Odds[whichLevelLookingFor]);
				break;
			
		case 3: result =  (Data.lvl3_Odds[whichLevelLookingFor]*(Data.xpRequired[3]-xp)/2) / (Data.lvl4_Odds[whichLevelLookingFor] - Data.lvl3_Odds[whichLevelLookingFor]);
				break;
			
		case 4: result =  (Data.lvl4_Odds[whichLevelLookingFor]*(Data.xpRequired[4]-xp)/2) / (Data.lvl5_Odds[whichLevelLookingFor] - Data.lvl4_Odds[whichLevelLookingFor]);
				break;
			
		case 5: result =  (Data.lvl5_Odds[whichLevelLookingFor]*(Data.xpRequired[5]-xp)/2) / (Data.lvl6_Odds[whichLevelLookingFor] - Data.lvl5_Odds[whichLevelLookingFor]);
				break;
			
		case 6: result =  (Data.lvl6_Odds[whichLevelLookingFor]*(Data.xpRequired[6]-xp)/2) / (Data.lvl7_Odds[whichLevelLookingFor] - Data.lvl6_Odds[whichLevelLookingFor]);
				break;
			
		case 7: result =  (Data.lvl7_Odds[whichLevelLookingFor]*(Data.xpRequired[7]-xp)/2) / (Data.lvl8_Odds[whichLevelLookingFor] - Data.lvl7_Odds[whichLevelLookingFor]);
				break;
			
		case 8: result =  (Data.lvl8_Odds[whichLevelLookingFor]*(Data.xpRequired[8]-xp)/2) / (Data.lvl9_Odds[whichLevelLookingFor] - Data.lvl8_Odds[whichLevelLookingFor]);
				break;
		}
		
		return result;
	}
	
	public static int xpNeededToLevelUp(int level, int xp) {
		int result = -1;
		
		switch(level) {
			case 1: result = (Data.xpRequired[1]-xp);
					break;
					
			case 2: result = (Data.xpRequired[2]-xp);
					break;
			case 3: result = (Data.xpRequired[3]-xp);
					break;
			case 4: result = (Data.xpRequired[4]-xp);
					break;
			case 5: result = (Data.xpRequired[5]-xp);
					break;
			case 6: result = (Data.xpRequired[6]-xp);
					break;
			case 7: result = (Data.xpRequired[7]-xp);
					break;
			case 8: result = (Data.xpRequired[8]-xp);
					break;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		int levelActuel = 6;
		int xpActuelle = 2;
		int tierRecherche = 5;
		int xpRestante = xpNeededToLevelUp(levelActuel, xpActuelle);
		double temp = Math.round(returnOnInvestment(levelActuel, xpActuelle, tierRecherche));
		System.out.println("Au niveau " + levelActuel + ", avec " + xpActuelle + " xp, et en recherchant à toucher des tiers " + tierRecherche);
//		System.out.println("Il faudra en plus d'xp, plus de : " + temp + "rolls, soit en gold : " + temp*2 + " + " + xpRestante + "g d'xp" + " pour que lvl up soit rentable");
		System.out.println("Pour break even, il faudra investir " + (temp*2 + xpRestante) + "golds, soit " + xpRestante + "g d'xp à payer et " + temp*2 + "g de reroll, tout montant investi au dessus de celui-ci sera rentable");
	}
}
