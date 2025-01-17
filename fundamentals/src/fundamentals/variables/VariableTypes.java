package fundamentals.variables;

public class VariableTypes {

	int instanceVar=20;
	static String staticVar="I am a static variable";
	
	public void display() {
		int localVar=10;
		System.out.println("Local Variable: "+localVar);
		System.out.println("Instance Variable: "+instanceVar);
		System.out.println("Static Variable: "+staticVar);
	}
	
	public static void main(String[] args) {
		VariableTypes obj=new VariableTypes();
		obj.display();
		System.out.println("Accessing Static Variable Directly: "+VariableTypes.staticVar);
	}
}
