public class Main2 {

	public static void main(String[] args) {
		Person newPerson = new Person("Ander",21,70,"72535580C");
		Agenda agenda = new Agenda();
		agenda.addContact(newPerson, 659815583, "address");
		String name = "Ander";
		System.out.println(agenda.showContact(name));
	}

}
