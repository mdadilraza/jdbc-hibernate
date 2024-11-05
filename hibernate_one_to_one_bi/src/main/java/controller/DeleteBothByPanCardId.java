package controller;

import dao.PersonDao;

public class DeleteBothByPanCardId {

	public static void main(String[] args) {
		
		PersonDao personDao= new PersonDao();
		personDao.deleteBothByPanCardId(2);

	}

}
