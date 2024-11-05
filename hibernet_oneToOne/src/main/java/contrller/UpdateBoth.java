package contrller;

import dao.PersonDao;
import dto.PanCard;
import dto.Person;

public class UpdateBoth {

	public static void main(String[] args) {
		Person person= new Person();
		person.setAddress("hyd");
		person.setAge(20);
		person.setGender("Male");
		person.setName("Md Kashif ");
		
		PanCard panCard= new PanCard();
		panCard.setPanNumber("EHOPR3665F");
		
		person.setCard(panCard);
		
		PersonDao personDao= new PersonDao();
		personDao.updateBoth(1, person);

	}

}
