import java.util.ArrayList;
public class Agenda {
	private ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
	public ArrayList<Contact> getContactArrayList(){
		return contactArrayList;
	}
	public void addContact(Person person,int mobileNum,String address) {
		boolean contactFound=false;
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(person.getName())) {
				contactFound=true;
				break;
			}
		}
		if (!contactFound) {
			contactArrayList.add(new Contact(person,mobileNum,address));
		}
	}
	public void modifyContact(String name,int mobileNum,String address) {
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)) {
				Person modPerson = new Person(name,contactArrayList.get(i).getPerson().getAge(),contactArrayList.get(i).getPerson().getWeight(),contactArrayList.get(i).getPerson().getDni());
				Contact modContact = new Contact(modPerson,mobileNum,address);
				contactArrayList.remove(i);
				contactArrayList.add(modContact);
				break;
			}
		}
	}
	public void removeContact(String name) {
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)) {
				contactArrayList.remove(i);
				break;
			}
		}
	}
	public String showContact(String name){
		String information = "";
		for (int i=0;i<contactArrayList.size();i++) {
			if (contactArrayList.get(i).getPerson().getName().equals(name)){
				information=information+contactArrayList.get(i).getPerson().toString()+" "+contactArrayList.get(i).getMobileNum()+" "+contactArrayList.get(i).getAddress();
				break;
			}
		}
		return information;
	}
}