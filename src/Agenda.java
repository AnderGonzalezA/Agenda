import java.util.ArrayList;
public class Agenda {
	private ArrayList<Person> personArrayList= new ArrayList<Person>();
	private ArrayList<ArrayList<String>> personInformation= new ArrayList<ArrayList<String>>();
	public ArrayList<ArrayList<String>> getPersonArrayList(){
		return personInformation;
	}
	public void addPerson(Person newPerson,int mobileNum,String address) {
		boolean personFound=false;
		for (int i=0;i<personArrayList.size();i++) {
			if (personArrayList.get(i).getName().equals(newPerson.getName())) {
				personFound=true;
				break;
			}
		}
		if (!personFound) {
			personArrayList.add(newPerson);
			ArrayList<String> newPersonArrayList = new ArrayList<String>();
			newPersonArrayList.add(newPerson.getName());
			newPersonArrayList.add(String.valueOf(mobileNum));
			newPersonArrayList.add(address);
			personInformation.add(newPersonArrayList);
		}
	}
	public void modifyPerson(String name,int age,int weight,String dni,int mobileNum,String address) {
		for (int i=0;i<personArrayList.size();i++) {
			if (personArrayList.get(i).getName().equals(name)) {
				personArrayList.remove(i);
				personArrayList.add(new Person(name,age,weight,dni));
				break;
			}
		}
		for (int i=0;i<personInformation.size();i++) {
			if (personInformation.get(i).get(0).equals(name)){
				personInformation.remove(i);
				ArrayList<String> newPerson = new ArrayList<String>();
				newPerson.add(name);
				newPerson.add(String.valueOf(mobileNum));
				newPerson.add(address);
				personInformation.add(newPerson);
				break;
			}
		}
	}
	public void removePerson(String name) {
		for (int i=0;i<personArrayList.size();i++) {
			if (personArrayList.get(i).getName().equals(name)) {
				personArrayList.remove(i);
				break;
			}
		}
		for (int i=0;i<personInformation.size();i++) {
			if (personInformation.get(i).get(0).equals(name)){
				personInformation.remove(i);
				break;
			}
		}
	}
	public String showPerson(String name){
		String information = "";
		int i=0;
		boolean personFound=false;
		while (!personFound && i<personArrayList.size()) {
			for (int j=0;j<personInformation.size();j++) {
				if (name.equals(personArrayList.get(i).getName()) && personInformation.get(j).get(0).equals(personArrayList.get(i).getName())){
					information=information+personArrayList.get(i).toString()+" "+personInformation.get(j).get(1)+" "+personInformation.get(j).get(2);
					personFound=true;
					break;
				}
			}
			i++;
		}
		return information;
	}
}