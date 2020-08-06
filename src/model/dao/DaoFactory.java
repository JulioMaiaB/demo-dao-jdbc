package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	// operacoes estaticas para instanciar os DAOs
	
	// macete para nao precisar expor a implementacao SellerDaoJDBC, pois retorna um SellerDao
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
