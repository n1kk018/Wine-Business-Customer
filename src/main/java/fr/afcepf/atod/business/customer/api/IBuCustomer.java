package fr.afcepf.atod.business.customer.api;
import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronan
 */
public interface IBuCustomer {
    /**
     * 
     * @param mail
     * @param password
     * @return
     * @throws WineException 
     */
    Customer connect(String mail, String password) throws WineException;
    
    User findUserById(int id) throws WineException;;
    
    Customer addNewCustomer(Customer customer) throws WineException; 
    
    Customer findUserbyMail(String mail) throws WineException; 
   
}
