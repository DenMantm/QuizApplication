
package Courses;

/**
 * Class Courses.java
 * @author Kenneth Power
 * 05/03/1205
 */

//In this class I am setting up the base class for the area of Courses of each subject
//Each subject will inherite from this class with it's own specific areas to that subject

public class Courses {
    
    //to make data members private or proteched?
    String title = "";
    String description = "";
    String content = "";
    String objectives = "";
    String opportunities = "";
    String areasOfStudy = "";
    String studentProfile = "";
    
public Courses(){
    
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public String getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(String opportunities) {
        this.opportunities = opportunities;
    }

    public String getAreasOfStudy() {
        return areasOfStudy;
    }

    public void setAreasOfStudy(String areasOfStudy) {
        this.areasOfStudy = areasOfStudy;
    }

    public String getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(String studentProfile) {
        this.studentProfile = studentProfile;
    }
        


}
