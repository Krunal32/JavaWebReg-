public class WebReg{

	public static void main(String[] args){
	
		Course cs111 = new Course("Intro to CS", "198:111", 100, 4.0);
		
		
		Student bob = new Student("Bob", "Jones", "1234");
		bob.addCourse(cs111);

		System.out.println(bob);
	}

}