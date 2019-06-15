package _02_sea_creature;

public class Runbob {
	public static void main(String[] args) {
		SeaCreature a = new SeaCreature("spongebob");
		a.eat();
		a.laugh();
		 
		SeaCreature b = new SeaCreature("squidward");
		String d = b.getName();
		System.out.println(d);
		b.eat();
		b.laugh();
		
		SeaCreature c = new SeaCreature("patrick");
		String e = c.getName();
		System.out.println(e);
		c.eat();
		c.laugh();
		
	}
}
