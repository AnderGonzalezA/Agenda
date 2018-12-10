import java.util.Random;

public class Main2 {
	public static void main(String[] args) {
		String dniString="";
		for (int i=0;i<8;i++) {
			dniString=dniString+String.valueOf(new Random().nextInt(9));
		}
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		System.out.println(dniString+String.valueOf(alphabet.charAt(new Random().nextInt(alphabet.length()))));
		Person newPerson = new Person("Ander",21,70);
		System.out.println(newPerson.getDni());
	}
}
