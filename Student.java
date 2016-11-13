public class Student{


	//define fields
	private String id;
	private double numCredits;
	private int gradYear;
	private String major;
	private String fname;
	private String lname;
	private int age;
	private Course[] schedule;
	private int numCourses;
	
	//Constructor(s)
	public Student(String fname, String lname, String id){
	
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		major = "undeclared";
		age = 17;
		gradYear = 2018;
		numCredits = 0;
		schedule = new Course[10];
		numCourses = 0;
	}

	public Student(String fname, String lname, String id, String major, double numcredits){
		
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.major = major;
		this.age = 17;
		this.gradYear = 2018;
		this.numCredits = numcredits;
	
	}
	
	
	public int getAge(){
	
		return this.age;
	}
	
	public void setAge( int age){
	
		if ( age > 0)
			this.age = age;
	}
	
	public boolean addCourse( Course c){
	
		if(numCourses == schedule.length)
			return false;
			
		if( c.isFull())
			return false;
		
		for(int i=0; i<numCourses ; i++){
		
			if(schedule[i].equals(c))
				return false;
		}
		
		schedule[numCourses] = c;
		numCourses++;
		numCredits += c.getNumCredits();
		
		c.register(this);
		
		return true;
		
	}
	
	public String toString(){
		//for practice implement toString() in Course, and include a student's course list here
		return fname+" "+lname+" "+id;
	}
}