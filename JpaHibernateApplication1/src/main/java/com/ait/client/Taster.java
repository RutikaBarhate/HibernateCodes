package com.ait.client;

import com.ait.entity.ProductEntity;
import com.ait.dao.ProductDAO;
import com.ait.dao.impl.ProductDAOIMPL;


public class Taster 
{
	public static void main(String[] args) 
	{
		
	
	ProductDAO  dao = new ProductDAOIMPL();
	/*
	 * create a new product entity
	 */
	
	ProductEntity pEntity = new ProductEntity();
	pEntity.setProductId(129011);
	pEntity.setProductName("LAPTOP");
	pEntity.setQuantity(12);
	pEntity.setUnitPrice(38000.0);
	
	/*
	 * call saveProduct() of DAO class
	 */
	dao.saveProduct(pEntity);
	
	/*
	  call updateProductById() of DAO class
	 */
	
	ProductEntity p = dao.updateProductById(129011, 56000.0);
	System.out.println(p);

}
}


