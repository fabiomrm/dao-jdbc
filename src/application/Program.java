package application;

import com.daojdbc.model.dao.DAOFactory;
import com.daojdbc.model.dao.SellerDAO;
import com.daojdbc.model.entities.Department;
import com.daojdbc.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n====TEST 04: seller insert====");
        Seller newSeller = new Seller(null, "Greg", "greg@greg.com",
                new Date(), 4000.0, department);

        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n====TEST 05: seller update====");
        seller = sellerDAO.findById(1);
        seller.setName("João Wayne");
        sellerDAO.update(seller);
        System.out.println("Update completed! ");
        System.out.println(sellerDAO.findById(1));

        System.out.println("\n====TEST 06: seller delete====");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Deleted!");
        System.out.println(sellerDAO.findById(id));

        sc.close();



    }
}
