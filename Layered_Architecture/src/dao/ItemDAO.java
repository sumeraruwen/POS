package dao;

import db.DBConnection;
import model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
     ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

     boolean deleteItem(String code) throws SQLException, ClassNotFoundException;

     boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

     boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

     boolean exitItem(String code) throws SQLException, ClassNotFoundException;

     String generateNewId() throws SQLException, ClassNotFoundException;

}
