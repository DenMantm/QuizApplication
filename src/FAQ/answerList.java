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
public class answerList extends answerListGUI {
    private int choice;
    private String answer;
    
    public answerList(){
    answerListGUI myAGUI = new answerListGUI();
    myAGUI.setVisible(true);
        
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
