public class Course{


	//Define fields
	String name;
	String id;
	int capacity;
	int numStudents;
	double numCredits;
	
	
	//Constructor
	public Course( ){
	
		name = "unknown";
		id = "00000";
		capacity = 100;
		numCredits = 3;
	
	}

	public Course(String name, String id, int cap, double credits ){
	
		this.name = name;
		this.id = id;
		this.capacity = cap;
		this.numCredits = credits;
	
	}
	
	public boolean isFull(){
		if( this.numStudents >= this.capacity)
			return true;
		
		return false;
	}
	
	public boolean register(Student s){

		numStudents++;
		//For practice, include code to add student to a roster
		
		return true;
	}
	
	public boolean equals(Course o){
	
		if(this.name.equals(o.name))
			return true;
		
		return false;
	}
	
	public double getNumCredits(){
		return numCredits;
	}
}