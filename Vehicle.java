//Method overriding
class Engine{
	void start(){
		System.out.println("Engine is started....");
	}
}

class Bike extends Engine{
	void start(){
		System.out.println("Bike is started.....");
	}
}

class car extends Engine{
	void start(){
		System.out.println("Car is started.....");
	}
}

class Vehicle{
	public static void main(String[] args){
		Bike obj1 = new Bike();
		Engine obj2 = new Engine();
		Engine obj3 = new Bike();
		Engine obj4 = new car();
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
	}
}