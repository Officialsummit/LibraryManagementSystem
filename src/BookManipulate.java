/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir
 */
public class BookManipulate {
    private int bid;
    private String name,genre,author,publisher,shelf,row;
    
    
    public BookManipulate(int BID,String Name,String Genre,String Author,String Publisher,String Shelf,String Row)
    {
        
        this.bid=BID;
        this.name=Name;
        this.genre=Genre;
        this.author=Author;
        this.publisher=Publisher;
        this.shelf=Shelf;
        this.row=Row;
        
        
        

    }
    public int getId()
    {
        return bid;
    }
     public String getName()
    {
        return name;
    }
      public String getGenre()
    {
        return genre;
    }
      public String getAuthor()
    {
        return author;
    }
       public String getPublisher()
    {
        return publisher;
    }
        public String getShelf()
    {
        return shelf;
    }
         public String getRow()
    {
        return row;
    }
    
    
    
   
    
    
}
