package _03_smurf;

public class RunSmurfRun {
	public static void main(String[] args) {
		Smurf a = new Smurf("Handy");
		String b = a.getName();
		System.out.println(b);
		a.eat();

		Smurf c = new Smurf("Papa");
		String e = c.getName();
		System.out.println(e);
		String g = c.getHatColor();
		System.out.println("Papa Smurf wears a " + g + " hat");
		String h = c.isGirlOrBoy();
		System.out.println("Papa Smurf is a " + h + ".");

		Smurf d = new Smurf("Smurfette");
		String f = d.getName();
		System.out.println(f);
		String i = d.getHatColor();
		System.out.println("Smurfette has a " + i + " hat.");
		String j = d.isGirlOrBoy();
		System.out.println("Smurfette is a " + j + ".");

	}
}
