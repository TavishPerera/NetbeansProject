package calibre.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

//Reference for Serialization
/***************************************************************************************
*    Title: Java - Serialization
*    Author:  tutorialspoint
*    Date: 
*    Code version: 
*    Availability: https://www.tutorialspoint.com/java/java_serialization.htm
***************************************************************************************/

//Reference for “file exists
/***************************************************************************************
*    Title: Java “file exists” testing
*    Author:  Alvin Alexander
*    Date: January 6, 2020
*    Code version: 
*    Availability: https://alvinalexander.com/java/java-file-exists-directory-exists/
***************************************************************************************/

/**
 * Curtin ID : 20204659
 * @author : Charith Dushantha Kodagoda Kodagoda Gamage
 * @version : 1.0
 */
public class OtherFeaturesDataHandler {
    
    //Singleton object
    private static OtherFeaturesDataHandler dataHandler = null;
    
    //User Id and Paasword
    private String username;
    private String password;

    private OtherFeaturesDataHandler() {
        
    }
    
    //Retrieve Singleton object
    public static OtherFeaturesDataHandler getDataHandlerInstance(){
        if(dataHandler == null){
            dataHandler = new OtherFeaturesDataHandler();
        }
        return dataHandler;
    }
    
    //Setter for User Id
    public void setUsername(String username){
        this.username = username;
    }
    
    //Getter for User Id
    public String getUsername(){
        return username;
    }
    //Setter for User Password
    public void setPassword(String password){
        this.password = password;
    }
    
    //Getter for User Password
    public String getPassword(){
        return password;
    }
    
}
