
public class Data {

	static int numberOfCharacters = 0;
	static int[] numberOfChamps = new int[] {0, 39, 26, 21, 13, 10}; // first data is useless, just so if you're lvl 5, you check numberOfChamps[5];
	static int[] xpRequired = new int[] {0, 2, 2, 6, 10, 18, 30, 46, 64}; // first data is useless, just so if you're lvl 5, you check xpRequired[5];
	static double[] lvl1_Odds = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0}; // first data is useless, if you check for rank 2 champs, you check lvl1_odds[2];
	static double[] lvl2_Odds = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
	static double[] lvl3_Odds = new double[] {0.0, 0.65, 0.3, 0.05, 0.0, 0.0};
	static double[] lvl4_Odds = new double[] {0.0, 0.5, 0.35, 0.15, 0.0, 0.0};
	static double[] lvl5_Odds = new double[] {0.0, 0.37, 0.35, 0.25, 0.03, 0.0};
	static double[] lvl6_Odds = new double[] {0.0, 0.245, 0.35, 0.30, 0.1, 0.005};
	static double[] lvl7_Odds = new double[] {0.0, 0.2, 0.3, 0.33, 0.15, 0.02};
	static double[] lvl8_Odds = new double[] {0.0, 0.15, 0.25, 0.35, 0.2, 0.05};
	static double[] lvl9_Odds = new double[] {0.0, 0.10, 0.15, 0.35, 0.30, 0.10};
	

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
	
}