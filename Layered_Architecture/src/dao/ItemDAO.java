package dao;

import db.DBConnection;
import model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO,String>{
    public ArrayList<ItemDTO> getItemFromPrice(double price)throws ClassNotFoundException, SQLException;

}
