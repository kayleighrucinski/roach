package rochPopulation;

public class RoachPopulation {

		private int roaches;
				
				public int getRoaches() 
				{
					return roaches;
				}
				
				public void breed() 
				{
					roaches = roaches*2;
				}
				public void spray(int perc) 
				{
					roaches = roaches-(roaches*perc)/(100);
				}
				
				public void origRoaches(int cyc) 
				{
					roaches = cyc;
				}
				
				
			} //class 

