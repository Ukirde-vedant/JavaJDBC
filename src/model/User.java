
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author vedant
 */
public class User {
 
       String firstname;      
       int age;
       int id;
        
    public String getName() {
        return firstname;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}