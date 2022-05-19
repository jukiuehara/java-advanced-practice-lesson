package service;

import java.sql.Connection;

import dao.ProductDao;
import entity.products;
import util.DbUtil;

public class ProductService {
		public products authentication(String id) {
			int product_id = Integer.parseInt(id);
			
					try(Connection con = DbUtil.getConnection()){
			ProductDao pd = new ProductDao(con);
			products a = pd.fintdByProductId(product_id);
			return a;
		} catch (Exception e) {
            e.printStackTrace();
        }

        return null;

		}

		

	}
