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
public class PersonDAOMock implements PersonDAO {
    /**
     * Returns the related Person record or null if none is found.
     * @param userName
     * @param password
     * @return 
     */
    public Person getPersonByUserNameAndPassword(String userName, String password) {
        Person person = null;
        if(userName.equals("alpha") && password.equals("apple")){
            String[] userFacts = new String[] {"apples are orange.", "alpha's favorite game is apples to apples.", "apples are good."};
            person = new Person(userName, "apple", "alpha", userFacts);
        } else if(userName.equals("beta") && password.equals("banana")){
            String[] userFacts = new String[] {"bananas are nuts.", "beta is blue.", "beta eats monkeys."};
            person = new Person(userName, "banana", "beta", userFacts);
        } else if (userName.equals("gamma") && password.equals("grape")){
            String[] userFacts = new String[] {"gamme likes grapes.", "gamma is a grandma.", "gamma is purple."};
            person = new Person(userName, "grape", "gamma", userFacts);
        }
        return person;
    }
}
