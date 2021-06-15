class Lamp{
	public void Animal() {
		System.out.println("I can eat");
	}
}                                                                      










class Dog extends Lamp{
	@Override
	public void Animal() {
		super.Animal();
		System.out.println("I cannot eat");
	}
}

	
	
	
	