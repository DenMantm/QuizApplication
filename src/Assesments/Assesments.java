/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

/**
 *
 * @author Deniss
 */
public class Assesments {
    //Variables
    protected String question, hint;
    protected int userPoints, maxPoints;
    //Have to create field for subject name
    protected String subjectName;
    

    public Assesments(){
    //This CONSTRUCTOR is just in case if someone whants to create an object 
    //Without all necesarry parameters
        }
    public Assesments(String subjectName,String question, String hint, int maxPoints){
        this.subjectName = subjectName;
        this.question = question;
        this.hint = hint;
        this.maxPoints = maxPoints;
    }
    

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    static class Quiz_1 {

        public Quiz_1() {
        }
    }
    
}
