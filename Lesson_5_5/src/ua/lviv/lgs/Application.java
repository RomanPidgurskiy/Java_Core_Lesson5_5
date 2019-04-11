package ua.lviv.lgs;

public class Application {
	
	public static void main(String[] args) {
		Amphibia amp = new Frog();
		Frog fr = (Frog) amp;
		fr.eat();
		fr.sleep();
		fr.swim();
		fr.walk();
	}

}
