/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assesments;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Deniss
 */
@Entity
@Table(name = "QUIZ", catalog = "", schema = "DENMAN")
@NamedQueries({
    @NamedQuery(name = "Quiz_1.findAll", query = "SELECT q FROM Quiz_1 q"),
    @NamedQuery(name = "Quiz_1.findById", query = "SELECT q FROM Quiz_1 q WHERE q.id = :id"),
    @NamedQuery(name = "Quiz_1.findBySubject", query = "SELECT q FROM Quiz_1 q WHERE q.subject = :subject"),
    @NamedQuery(name = "Quiz_1.findByCorrect", query = "SELECT q FROM Quiz_1 q WHERE q.correct = :correct"),
    @NamedQuery(name = "Quiz_1.findByPoints", query = "SELECT q FROM Quiz_1 q WHERE q.points = :points")})
public class Quiz_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SUBJECT")
    private String subject;
    @Lob
    @Column(name = "Q1")
    private String q1;
    @Lob
    @Column(name = "Q2")
    private String q2;
    @Lob
    @Column(name = "Q3")
    private String q3;
    @Lob
    @Column(name = "Q4")
    private String q4;
    @Column(name = "CORRECT")
    private Integer correct;
    @Column(name = "POINTS")
    private Boolean points;

    public Quiz_1() {
    }

    public Quiz_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        String oldSubject = this.subject;
        this.subject = subject;
        changeSupport.firePropertyChange("subject", oldSubject, subject);
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        String oldQ1 = this.q1;
        this.q1 = q1;
        changeSupport.firePropertyChange("Q1", oldQ1, q1);
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        String oldQ2 = this.q2;
        this.q2 = q2;
        changeSupport.firePropertyChange("Q2", oldQ2, q2);
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        String oldQ3 = this.q3;
        this.q3 = q3;
        changeSupport.firePropertyChange("Q3", oldQ3, q3);
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        String oldQ4 = this.q4;
        this.q4 = q4;
        changeSupport.firePropertyChange("Q4", oldQ4, q4);
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        Integer oldCorrect = this.correct;
        this.correct = correct;
        changeSupport.firePropertyChange("correct", oldCorrect, correct);
    }

    public Boolean getPoints() {
        return points;
    }

    public void setPoints(Boolean points) {
        Boolean oldPoints = this.points;
        this.points = points;
        changeSupport.firePropertyChange("points", oldPoints, points);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quiz_1)) {
            return false;
        }
        Quiz_1 other = (Quiz_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Assesments.Quiz_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
