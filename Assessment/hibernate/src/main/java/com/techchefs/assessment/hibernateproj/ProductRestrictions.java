package com.techchefs.assessment.hibernateproj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.techchefs.assessment.hibernateproj.dto.Product;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

public class ProductRestrictions {

	public static void main(String[] args) {
		
		String hql = " from Product";
		
		try (Session session = HibernateUtil.getSession();) {
			
			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.lt("price", 100.0));
			criteria.add(Restrictions.ilike("productName", "A%"));
			List<Product> list = criteria.list();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
