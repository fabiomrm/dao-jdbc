package application;

import com.daojdbc.model.dao.DAOFactory;
import com.daojdbc.model.dao.SellerDAO;
import com.daojdbc.model.entities.Department;
import com.daojdbc.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();


        System.out.println("====TEST 01: seller findById====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n====TEST 02: seller findByDepartment====");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDAO.findByDepartment(department);
        for(Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n====TEST 03: seller findAll====");
        sellers = sellerDAO.findAll();
        for(Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n====TEST 03: seller findAll====");
        Seller newSeller = new Seller(null, "Greg", "greg@greg.com",
                new Date(), 4000.0, department);

        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


    }
}
