package com.daojdbc.model.dao;

import com.daojdbc.model.entities.Department;
import com.daojdbc.model.entities.Seller;

import java.util.List;

public interface SellerDAO {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);

    void deleteById(Seller id);

    Seller findById(Integer id);

    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
