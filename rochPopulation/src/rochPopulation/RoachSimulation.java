package rochPopulation;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RoachPopulation Bugs = new RoachPopulation();
		int numberRoaches = Bugs.getRoaches();
		
		
		//initial population start
		Bugs.origRoaches(10);
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The initial roach population: " + numberRoaches);
		
		//cycle 1
		Bugs.breed();
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 1 breeding: " + numberRoaches);
		
		//spray
		Bugs.spray(50);
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 1 50% spraying: " + numberRoaches);
		
		
		//cycle 2
		Bugs.breed();
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 2 breeding: " + numberRoaches);
		
		//spray
		Bugs.spray(60);
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 2 60% spraying: " + numberRoaches);
		
		
		//cycle 3
		Bugs.breed();
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 3 breeding: " + numberRoaches);
		
		//spray
		Bugs.spray(70);
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 3 70% spraying: " + numberRoaches);
		
		
		//cycle 4
		Bugs.breed();
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 4 breeding: " + numberRoaches);
		
		//spray
		Bugs.spray(80);
		
		numberRoaches = Bugs.getRoaches();
		
		System.out.println("The roach population after cycle 4 80% spraying: " + numberRoaches);

	} //class 

} //void 
