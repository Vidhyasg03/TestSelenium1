package NewPackageVid;

 class Anmial 
	{
	
		Anmial()
		{
			System.out.println("Parent class animal is created");
		}
	}

	class Dog extends Anmial
		{ 
		
		Dog()
		{
			super();
			System.out.println("Child class dog is created");
		}
			}  
		
	
	class TestSuper2
		{  
		public static void main(String args[])
		{  
		Dog d=new Dog();  
		}
		}  


