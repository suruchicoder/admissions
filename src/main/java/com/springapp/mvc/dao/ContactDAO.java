package com.springapp.mvc.dao;

/**
 * Created by suruchi on 13/2/16.
 */

import java.util.List;

import com.springapp.mvc.model.Contact;

/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */
public interface ContactDAO {

    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();
}