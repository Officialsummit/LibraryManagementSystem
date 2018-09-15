
import javax.swing.JOptionPane;


public class user {
    private int id;
    private String fullname,uname,password,email;
    
    
    public user(int ID,String UName,String Fullname,String Password,String Email)
    {
        
        this.id=ID;
        this.fullname=Fullname;
        this.uname=UName;
        this.password=Password;
        this.email=Email;
        
        
        

    }
    public int getId()
    {
        return id;
    }
     public String getUName()
    {
        return uname;
    }
      public String getPass()
    {
        return password;
    }
      public String getEmail()
    {
        return email;
    }
       public String getFullname()
    {
        return fullname;
    }
    
    
   
    
}
