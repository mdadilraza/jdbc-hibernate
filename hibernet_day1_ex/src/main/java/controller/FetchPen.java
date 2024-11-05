package controller;

import dao.PenDao;

public class FetchPen {

	public static void main(String[] args) {
    
		PenDao penDao = new PenDao();
		penDao.fetchPen(1);
	}

}
