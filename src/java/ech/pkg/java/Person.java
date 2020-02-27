/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ech.pkg.java;

import java.util.Arrays;

/**
 *
 * @author ethan holmes
 */
public class Person {
    /**
     * The class version for Serializable.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The login name.
     */
    private String userName;
    
    /**
     * This is the last or family name of the user.
     */
    private String lastName;
    
    /**
     * The first or given name of the user.
     */
    private String firstName;
    
    private String[] userFacts;
    
    /**
     * The full constructor.
     * @param userName
     * @param lastName
     * @param firstName
     */
    public Person(String userName, String lastName, String firstName, String[]userFacts) {
        this.userName = userName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.userFacts = userFacts;
    }

    /**
     * The no-argument constructor.
     */
    public Person() {
        this.userName = "";
        this.lastName = "";
        this.firstName = "";
    }

    public String getUserFacts() {
        String sb = null;
        String fact1 = this.userFacts[0];
        String fact2 = this.userFacts[1];
        String fact3 = this.userFacts[2];
        String factTable = fact1 +" " + "||" + " " + fact2 + " " + "||" + " " + fact3;
         
         return factTable;
    }
    
    public void setUserFacts(String[]userFacts){
        this.userFacts = userFacts;
    }
    
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
}
