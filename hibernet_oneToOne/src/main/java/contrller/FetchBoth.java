package contrller;

import dao.PersonDao;

public class FetchBoth {

	public static void main(String[] args) {
		PersonDao personDao= new PersonDao();
		personDao.fetchBoth(1);

	}

}
