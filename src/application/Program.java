package application;

import com.daojdbc.model.dao.DAOFactory;
import com.daojdbc.model.dao.SellerDAO;
import com.daojdbc.model.entities.Department;
import com.daojdbc.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department dep = new Department(1, "Books");
        Seller seller = new Seller(21, "Fábio", "fabio@fabio.com", new Date(), 300.0, dep);
        SellerDAO sellerDao = DAOFactory.createSellerDAO();

    }
}
