/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

/**
 *
 * @author Maurice
 */
public class eBooks extends eBooksGUI {
    private String bookList;
    private String recReading;
    
    public eBooks(){
        eBooksGUI myEGUI = new eBooksGUI();
        myEGUI.setVisible(true);
        
    }
    public String getBookList() {
        return bookList;
    }

    public void setBookList(String bookList) {
        this.bookList = bookList;
    }

    public String getRecReading() {
        return recReading;
    }

    public void setRecReading(String recReading) {
        this.recReading = recReading;
    }
    
}
