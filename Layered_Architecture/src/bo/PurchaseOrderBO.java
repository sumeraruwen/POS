package bo;

import db.DBConnection;
import model.CustomerDTO;
import model.ItemDTO;
import model.OrderDTO;
import model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PurchaseOrderBO {
     boolean purchaseOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException;

     CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException ;

     boolean checkItemIsAvailable(String code) throws SQLException, ClassNotFoundException ;

     boolean checkCustomerIsAvailable(String id) throws SQLException, ClassNotFoundException;

     String generateNewOrderID() throws SQLException, ClassNotFoundException ;

    ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;

     ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException ;
}
