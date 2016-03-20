/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FAQ;

/**
 *
 * @author Maurice
 */
public class FAQ extends FAQGUI{
    
    private int userSelection;
    private String answer;
    
    public void commonQuestions(){
        FAQGUI myGui = new FAQGUI();
        myGui.setVisible(true);
        
    }

    public int getUserSelection() {
        return userSelection;
    }

    public void setUserSelection(int userSelection) {
        this.userSelection = userSelection;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
