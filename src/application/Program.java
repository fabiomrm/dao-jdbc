package application;

import com.daojdbc.model.dao.DAOFactory;
import com.daojdbc.model.dao.SellerDAO;
import com.daojdbc.model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);

    }
}
