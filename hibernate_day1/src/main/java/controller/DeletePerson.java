package controller;

import dao.PersonDao;

public class DeletePerson {

	public static void main(String[] args) {
      PersonDao personDao= new PersonDao();
      personDao.deletePerson(2);
    		  
	}

}
