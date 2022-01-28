package com.daojdbc.model.dao;

import com.daojdbc.model.dao.impl.DepartmentDAOJDBC;
import com.daojdbc.model.dao.impl.SellerDAOJDBC;

public class DAOFactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(db.DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDAO() {
        return new DepartmentDAOJDBC(db.DB.getConnection());
    }
}
