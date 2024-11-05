package controller;

import dao.PenDao;
import dto.Pen;

public class InsertPen {

	public static void main(String[] args) {
      Pen pen = new Pen();
      pen.setPenId(1);
      pen.setPenBrand("cello");
      pen.setPenColour("black");
      pen.setPenPrice(5);
      
      PenDao penDao = new PenDao();
      penDao.savePen(pen);
      
	}

}
