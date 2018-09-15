/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir
 */
public class StudentManipulate {
    
 private int userid;
    private String userPass,regdate,username,email;
    
    
    public StudentManipulate(int UserID,String UserPass,String RegDate,String Username,String Email)
    {
        
        this.userid=UserID;
        this.userPass=UserPass;
        this.regdate=RegDate;
        this.username=Username;
        this.email=Email;
        
        
        

    }
    public int getId()
    {
        return userid;
    }
     public String getuserPass()
    {
        return userPass;
    }
      public String getregdate()
    {
        return regdate;
    }
      public String getuname()
    {
        return username;
    }
       public String getEmail()
    {
        return email;
    }
    
    
   
    
}
