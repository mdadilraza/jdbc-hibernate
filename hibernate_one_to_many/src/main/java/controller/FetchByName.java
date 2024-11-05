package controller;

import dao.CollegeDao;

public class FetchByName {

	public static void main(String[] args) {
		CollegeDao collegeDao = new CollegeDao();
		collegeDao.fetchByName("KPRIT");

	}

}
