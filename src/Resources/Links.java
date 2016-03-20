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
public class Links extends LinksGUI {
    private String usefulLinks;
    private String linkChoice;

  
    
    public void linkListing(){
        LinksGUI myLGUI = new LinksGUI();
        myLGUI.setVisible(true);
        
    }

    public String getUsefulLinks() {
        return usefulLinks;
    }

    public void setUsefulLinks(String usefulLinks) {
        this.usefulLinks = usefulLinks;
    }
      public String getLinkChoice() {
        return linkChoice;
    }

    public void setLinkChoice(String linkChoice) {
        this.linkChoice = linkChoice;
    }
}
