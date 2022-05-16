package dao;

import dao.custom.CustomerDAO;
import dao.custom.impl.*;

import java.io.Serializable;

public class DAOFactory {

    private static DAOFactory daoFactory;
     private DAOFactory(){

     }

     public static DAOFactory getDaoFactory(){
         if(daoFactory == null) {
             daoFactory = new DAOFactory();
         }
         return daoFactory;
     }
    public enum DAOTypes {
        CUSTOMER, ITEM, ORDER, ORDERDETAILS, QUERYDAO
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerDAOImpl();//SuperDAO superDAP =new CustomerDAOImpl()
            case ITEM:
                return new ItemDAOImpl(); //SuperDAO superDAP =new ItemDAOImpl()
            case ORDER:
                return new OrderDAOImpl();//SuperDAO superDAP =new OrderDAOImpl()
            case ORDERDETAILS:
                return new OrderDetailsDAOImpl();//SuperDAO superDAP =new OrderDetailsDAOImpl()
            case QUERYDAO:
                return new QueryDAOImpl();//SuperDAO superDAP =new QueryDAOImpl()
            default:
                return null;
        }
    }

}
