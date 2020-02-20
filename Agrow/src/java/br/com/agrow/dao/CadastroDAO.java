/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrow.dao;

import br.com.agrow.entidades.Cadastro;
import br.com.agrow.servlet.GenericDAO;
import br.com.agrow.servlet.IPersistent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ricar
 */
public class CadastroDAO extends GenericDAO implements IPersistent<Cadastro>{
    public CadastroDAO() throws ClassNotFoundException, SQLException {
        super();
    }
    @Override
    public void save(Cadastro entity) throws SQLException {
        String sql = "INSERT INTO EVENTO VALUES(null,?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, entity.getId());
        stm.setString(2, entity.getCliente()); 
        stm.setString(3, entity.getSolicitante());
        stm.setString(4, entity.getDescricao());
        stm.setDate(5, new java.sql.Date(entity.getData_limite().getTime()));
        stm.setString(6, entity.getResponsavel());       
        stm.execute();
    }
    @Override
    public void delete(Cadastro entity) throws SQLException {
        this.delete(entity.getId());
}

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cadastro entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cadastro find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cadastro> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
