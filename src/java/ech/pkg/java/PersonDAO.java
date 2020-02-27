/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ech.pkg.java;

/**
 *
 * @author ethan holmes
 */
public interface PersonDAO {
    /**
     * Returns the related Person record or null if none is found.
     * @param userName
     * @param password
     * @return 
     */
    Person getPersonByUserNameAndPassword(String userName
            , String password);
}
