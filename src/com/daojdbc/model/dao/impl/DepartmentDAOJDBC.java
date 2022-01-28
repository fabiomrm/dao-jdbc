package com.daojdbc.model.dao.impl;

import com.daojdbc.model.dao.DepartmentDAO;
import com.daojdbc.model.entities.Department;
import db.DbException;

import java.beans.DefaultPersistenceDelegate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDAOJDBC implements DepartmentDAO {

    private Connection conn;

    public DepartmentDAOJDBC(Connection conn) {
        this.conn = conn;

    }
    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM department WHERE Id = ?");
            st.setInt(1,  id);

            rs = st.executeQuery();
            if(rs.next()) {
               Department dep = instantiateDepartment(rs);
               return dep;
            }
            return null;
        } catch(SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            db.DB.closeStatement(st);
            db.DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();

        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));

        return dep;
    }

}
