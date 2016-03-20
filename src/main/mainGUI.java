
package main;
import Edit.EditOtherUsrGUI;
import Edit.EditUser;
import Assesments.*;
import Courses.EngCourseGUI;
import Login.User;
import Edit.EditAccess;
import FAQ.FAQGUI;
import Courses.MathsCourseGUI;
import Courses.ScienceCourseGUI;
import Resources.CareersGUI;
import Resources.EducationGUI;
import Resources.LinksGUI;
import Resources.eBooksGUI;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;




/**
 *
 * @author Kamil
 */
public class mainGUI extends javax.swing.JFrame {
    
User user = new User();
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    //Creates new form mainGUI
    public mainGUI() {
        initComponents();

        this.setLocationRelativeTo(null);
        //int w = this.getSize().width;
       // int h = this.getSize().height;
        //int x = (dim.width-w)/2;
       // int y = (dim.height-h)/2;
        // Move the window
       // this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        accesLabel = new javax.swing.JLabel();
        MainFrame = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Open = new javax.swing.JMenu();
        Maths = new javax.swing.JMenu();
        MathsOverwiev = new javax.swing.JMenuItem();
        MExams = new javax.swing.JMenuItem();
        MQizes = new javax.swing.JMenuItem();
        Science = new javax.swing.JMenu();
        ScienceOverview = new javax.swing.JMenuItem();
        SExams = new javax.swing.JMenuItem();
        SQizes = new javax.swing.JMenuItem();
        Engineering = new javax.swing.JMenu();
        EngOverwiev = new javax.swing.JMenuItem();
        EExams = new javax.swing.JMenuItem();
        EQiuizes = new javax.swing.JMenuItem();
        Resources = new javax.swing.JMenu();
        eBooks = new javax.swing.JMenuItem();
        ULinks = new javax.swing.JMenuItem();
        Careers = new javax.swing.JMenuItem();
        Education = new javax.swing.JMenuItem();
        FAQ = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        UDetials = new javax.swing.JMenuItem();
        EditExams = new javax.swing.JMenuItem();
        EditQuizes = new javax.swing.JMenuItem();
        EditGrades = new javax.swing.JMenuItem();
        EditOtherUser = new javax.swing.JMenuItem();
        EditAccess = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        ViewAssesments = new javax.swing.JMenu();
        AssesmentsRes = new javax.swing.JMenuItem();
        AssesmentsCh = new javax.swing.JMenuItem();
        ViewAbout = new javax.swing.JMenu();
        AboutAut = new javax.swing.JMenuItem();
        AboutVer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("THIS MAIN GUI IS UNDER QUESTION\nALL DEPENDS ON WHAT KIND OF DEVICE IT \nSUPOSE TO RUN ON! IF ON MOBILE DEVICE WE \nWILL CHANGE IT AS NEEDED.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("V.0.1b (Just GUI)");

        Open.setText("Open");

        Maths.setText("Maths");

        MathsOverwiev.setText("Course Overview");
        MathsOverwiev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathsOverwievActionPerformed(evt);
            }
        });
        Maths.add(MathsOverwiev);

        MExams.setText("Exam");
        MExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MExamsActionPerformed(evt);
            }
        });
        Maths.add(MExams);

        MQizes.setText("Quiz");
        MQizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MQizesActionPerformed(evt);
            }
        });
        Maths.add(MQizes);

        Open.add(Maths);

        Science.setText("Science");

        ScienceOverview.setText("Course Overview");
        ScienceOverview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScienceOverviewActionPerformed(evt);
            }
        });
        Science.add(ScienceOverview);

        SExams.setText("Exams");
        SExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SExamsActionPerformed(evt);
            }
        });
        Science.add(SExams);

        SQizes.setText("Quizes");
        SQizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQizesActionPerformed(evt);
            }
        });
        Science.add(SQizes);

        Open.add(Science);

        Engineering.setText("Engineering");

        EngOverwiev.setText("Course Overview");
        EngOverwiev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngOverwievActionPerformed(evt);
            }
        });
        Engineering.add(EngOverwiev);

        EExams.setText("Exams");
        EExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EExamsActionPerformed(evt);
            }
        });
        Engineering.add(EExams);

        EQiuizes.setText("Quizes");
        EQiuizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQiuizesActionPerformed(evt);
            }
        });
        Engineering.add(EQiuizes);

        Open.add(Engineering);

        Resources.setText("Resources");

        eBooks.setText("eBooks");
        eBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBooksActionPerformed(evt);
            }
        });
        Resources.add(eBooks);

        ULinks.setText("Useful Links");
        ULinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULinksActionPerformed(evt);
            }
        });
        Resources.add(ULinks);

        Careers.setText("Careers");
        Careers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CareersActionPerformed(evt);
            }
        });
        Resources.add(Careers);

        Education.setText("Education");
        Education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationActionPerformed(evt);
            }
        });
        Resources.add(Education);

        Open.add(Resources);

        FAQ.setText("FAQ");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });
        Open.add(FAQ);

        jMenuBar1.add(Open);

        Edit.setText("Edit");

        UDetials.setText("User details");
        UDetials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UDetialsActionPerformed(evt);
            }
        });
        Edit.add(UDetials);

        EditExams.setText("Exams");
        EditExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditExamsActionPerformed(evt);
            }
        });
        Edit.add(EditExams);

        EditQuizes.setText("Quizes");
        EditQuizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditQuizesActionPerformed(evt);
            }
        });
        Edit.add(EditQuizes);

        EditGrades.setText("Grades");
        EditGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditGradesActionPerformed(evt);
            }
        });
        Edit.add(EditGrades);

        EditOtherUser.setText("Other user");
        EditOtherUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditOtherUserMousePressed(evt);
            }
        });
        EditOtherUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOtherUserActionPerformed(evt);
            }
        });
        Edit.add(EditOtherUser);

        EditAccess.setText("Access settings");
        EditAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAccessActionPerformed(evt);
            }
        });
        Edit.add(EditAccess);

        jMenuBar1.add(Edit);

        View.setText("View");
        jMenuBar1.add(View);

        ViewAssesments.setText("Assesments");

        AssesmentsRes.setText("Assesment Results");
        AssesmentsRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssesmentsResActionPerformed(evt);
            }
        });
        ViewAssesments.add(AssesmentsRes);

        AssesmentsCh.setText("Choose Assesment");
        AssesmentsCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssesmentsChActionPerformed(evt);
            }
        });
        ViewAssesments.add(AssesmentsCh);

        jMenuBar1.add(ViewAssesments);

        ViewAbout.setText("About");

        AboutAut.setText("Authors");
        AboutAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutAutActionPerformed(evt);
            }
        });
        ViewAbout.add(AboutAut);

        AboutVer.setText("Version");
        AboutVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutVerActionPerformed(evt);
            }
        });
        ViewAbout.add(AboutVer);

        jMenuBar1.add(ViewAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUser(User usr) {
        this.user = usr;
    }
    
    private void MExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MExamsActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");       
        //Creating Frame
        AFrame myAFrame  = new AFrame(2,"Maths",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
 
        
        
    }//GEN-LAST:event_MExamsActionPerformed

    private void SExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SExamsActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");     
        AFrame myAFrame  = new AFrame(2,"Science",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
    }//GEN-LAST:event_SExamsActionPerformed

    private void EExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EExamsActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");          
        AFrame myAFrame  = new AFrame(2,"Engineering",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);      
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
         // TODO add your handling code here:
    }//GEN-LAST:event_EExamsActionPerformed

    private void eBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBooksActionPerformed
        
        eBooksGUI myEGUI = new eBooksGUI();
        myEGUI.setSize(600, 500);
        myEGUI.setResizable(false);
        myEGUI.setLocation(900, 390);
        myEGUI.setVisible(true);
    }//GEN-LAST:event_eBooksActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
        //Clear main Frame area
        MainFrame.removeAll();       
        MainFrame.repaint();
        MainFrame.revalidate();
       
        //check access level and draw apropiate lements only
            String access = user.getAccess();
            accesLabel.setText(access);
            
            if (user.getAccess().equals("Student")) {
                //hide gui items from student user
                EditExams.setVisible(false);
                EditQuizes.setVisible(false);
                EditGrades.setVisible(false);
                EditOtherUser.setVisible(false);
            } else if(user.getAccess().equals("Teacher")) {
                //hide gui items from teacher user
                EditOtherUser.setVisible(false);
            } else if(user.getAccess().equals("Admin")) {
                //hide gui items from admin user
            }
    }//GEN-LAST:event_formWindowOpened

    private void EditOtherUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditOtherUserMousePressed
        MainFrame.removeAll();
        
        EditOtherUsrGUI  EditOtherUsrGUI = new  EditOtherUsrGUI();
        EditOtherUsrGUI.setVisible(true);
        EditOtherUsrGUI.setSize(1800, 1800);
        
        
        MainFrame.add(EditOtherUsrGUI);
        MainFrame.repaint();
        MainFrame.revalidate();
        
    }//GEN-LAST:event_EditOtherUserMousePressed

    private void UDetialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UDetialsActionPerformed
       MainFrame.removeAll();
        
        EditUser EditUser = new EditUser();
        EditUser.setUser(user);
        EditUser.setVisible(true);
        EditUser.setSize(800, 600);
                 
        MainFrame.add(EditUser);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_UDetialsActionPerformed

    private void EditAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAccessActionPerformed
        MainFrame.removeAll();
        
        EditAccess EditAccess = new EditAccess();
        EditAccess.setVisible(true);
        EditAccess.setSize(800, 600);
                 
        MainFrame.add(EditAccess);
        MainFrame.repaint();
        MainFrame.revalidate();
    }//GEN-LAST:event_EditAccessActionPerformed

    private void MQizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MQizesActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");      
        AFrame myAFrame  = new AFrame(1,"Maths",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);
 
        
    }//GEN-LAST:event_MQizesActionPerformed

    private void AboutAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutAutActionPerformed
    JOptionPane.showMessageDialog(null,"Resources: Maurice Ramsbottom \n"+
                                        "Subjects: Kenneth Power \n"+
                                         "Users: Kamil Lasecki \n"+
                                          "Assessments: Deniss Strods");
    }//GEN-LAST:event_AboutAutActionPerformed

    private void MathsOverwievActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathsOverwievActionPerformed
        
        MathsCourseGUI myMathsGUI = new MathsCourseGUI();
        myMathsGUI.setSize(600, 500);
        myMathsGUI.setResizable(false);
        myMathsGUI.setLocation(900, 390);
        myMathsGUI.setVisible(true);
    }//GEN-LAST:event_MathsOverwievActionPerformed

    private void EducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationActionPerformed
        // TODO add your handling code here:
        //edgui added to main
        EducationGUI myEdGUI = new EducationGUI();
        myEdGUI.setSize(600, 500);
        myEdGUI.setResizable(false);
        myEdGUI.setLocation(900, 390);
        myEdGUI.setResizable(false);
        myEdGUI.setVisible(true);
        
        
    }//GEN-LAST:event_EducationActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        // TODO add your handling code here:
        FAQGUI myGui = new FAQGUI();
        myGui.setSize(600, 500);
        myGui.setResizable(false);
        myGui.setLocation(900, 390);
        myGui.setResizable(false);
        myGui.setVisible(true);
        
        
      
    }//GEN-LAST:event_FAQActionPerformed

    private void CareersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CareersActionPerformed
        // TODO add your handling code here:
        CareersGUI myCGui = new CareersGUI();
        myCGui.setSize(600, 500);
        myCGui.setResizable(false);
        myCGui.setLocation(900, 390);
        myCGui.setVisible(true);
        
    }//GEN-LAST:event_CareersActionPerformed

    private void ULinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULinksActionPerformed
        
        LinksGUI myLGUI = new LinksGUI();
        myLGUI.setSize(600, 500);
        myLGUI.setResizable(false);
        myLGUI.setLocation(900, 390);
        myLGUI.setVisible(true);
    }//GEN-LAST:event_ULinksActionPerformed

    private void AssesmentsResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssesmentsResActionPerformed
        ResultsTable myResultsTable  = new ResultsTable();
        myResultsTable.setVisible(true);
        myResultsTable.setSize(600, 575);
        myResultsTable.setResizable(false);  
        myResultsTable.setUser(user);
    }//GEN-LAST:event_AssesmentsResActionPerformed

    private void SQizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQizesActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");      
        AFrame myAFrame  = new AFrame(1,"Science",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);
        myAFrame.setResizable(false);
    }//GEN-LAST:event_SQizesActionPerformed

    private void EQiuizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQiuizesActionPerformed
JOptionPane.showMessageDialog(null,"Creating 20 Question Assesment!");      
        AFrame myAFrame  = new AFrame(1,"Engineering",20,user);
        myAFrame.setVisible(true);
        myAFrame.setSize(380,540);      
        myAFrame.setResizable(false);    
// TODOadd your handling code here:
    }//GEN-LAST:event_EQiuizesActionPerformed

    private void ScienceOverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScienceOverviewActionPerformed
        
        ScienceCourseGUI myScienceGUI = new ScienceCourseGUI();
        myScienceGUI.setSize(600, 500);
        myScienceGUI.setResizable(false);
        myScienceGUI.setLocation(900, 390);
        myScienceGUI.setVisible(true);
    }//GEN-LAST:event_ScienceOverviewActionPerformed

    private void EngOverwievActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngOverwievActionPerformed
        
        EngCourseGUI myEngGUI = new EngCourseGUI();
        myEngGUI.setSize(600, 500);
        myEngGUI.setResizable(false);
        myEngGUI.setLocation(900, 390);
        myEngGUI.setVisible(true);
    }//GEN-LAST:event_EngOverwievActionPerformed

    private void AssesmentsChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssesmentsChActionPerformed
        AFrame myAFrame  = new AFrame();
        myAFrame.setVisible(true);
        myAFrame.setSize(380, 370);
        myAFrame.setResizable(false);
        myAFrame.setUser(user);       // TODO add your handling code here:
    }//GEN-LAST:event_AssesmentsChActionPerformed

    private void EditExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditExamsActionPerformed
JOptionPane.showMessageDialog(null,"Still under question mark and discussion to have this section or not");        // TODO add your handling code here:
    }//GEN-LAST:event_EditExamsActionPerformed

    private void EditQuizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditQuizesActionPerformed
JOptionPane.showMessageDialog(null,"Still under question mark and discussion to have this section or not");
    }//GEN-LAST:event_EditQuizesActionPerformed

    private void EditGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditGradesActionPerformed
JOptionPane.showMessageDialog(null,"Still under question mark and discussion to have this section or not");
    }//GEN-LAST:event_EditGradesActionPerformed

    private void EditOtherUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOtherUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditOtherUserActionPerformed

    private void AboutVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutVerActionPerformed
 JOptionPane.showMessageDialog(null,"Version 0.1b (GUI DEMONSTRATION)");
    }//GEN-LAST:event_AboutVerActionPerformed
   
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutAut;
    private javax.swing.JMenuItem AboutVer;
    private javax.swing.JMenuItem AssesmentsCh;
    private javax.swing.JMenuItem AssesmentsRes;
    private javax.swing.JMenuItem Careers;
    private javax.swing.JMenuItem EExams;
    private javax.swing.JMenuItem EQiuizes;
    private static javax.swing.JMenu Edit;
    private javax.swing.JMenuItem EditAccess;
    private javax.swing.JMenuItem EditExams;
    private javax.swing.JMenuItem EditGrades;
    private javax.swing.JMenuItem EditOtherUser;
    private javax.swing.JMenuItem EditQuizes;
    private javax.swing.JMenuItem Education;
    private javax.swing.JMenuItem EngOverwiev;
    private javax.swing.JMenu Engineering;
    private javax.swing.JMenuItem FAQ;
    private javax.swing.JPanel Header;
    private javax.swing.JMenuItem MExams;
    private javax.swing.JMenuItem MQizes;
    private javax.swing.JPanel MainFrame;
    private javax.swing.JMenu Maths;
    private javax.swing.JMenuItem MathsOverwiev;
    private javax.swing.JMenu Open;
    private javax.swing.JMenu Resources;
    private javax.swing.JMenuItem SExams;
    private javax.swing.JMenuItem SQizes;
    private javax.swing.JMenu Science;
    private javax.swing.JMenuItem ScienceOverview;
    private javax.swing.JMenuItem UDetials;
    private javax.swing.JMenuItem ULinks;
    private javax.swing.JMenu View;
    private javax.swing.JMenu ViewAbout;
    private javax.swing.JMenu ViewAssesments;
    public static javax.swing.JLabel accesLabel;
    private javax.swing.JMenuItem eBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
