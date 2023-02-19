/*
 * Created by JFormDesigner on Sun Feb 19 16:46:56 GMT 2023
 */

package com.saas.sisyphus.petrinet.ui.main;

import com.saas.sisyphus.petrinet.foundation.Context;
import com.saas.sisyphus.petrinet.foundation.Operation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author zard
 */
public class NorthPanel extends JPanel {
    public NorthPanel() {
        initComponents();
        setOnClickListener();
    }

    private void setOnClickListener() {
        place.addActionListener(e -> Context.mode = Operation.ADD_PLACE);
        transition.addActionListener(e -> Context.mode = Operation.ADD_TRANSITION);
        arc.addActionListener(e -> Context.mode = Operation.ADD_ARC);
        run.addActionListener(e -> Context.mode = Operation.RUN);
        step.addActionListener(e -> Context.mode = Operation.STEP);
        delete.addActionListener(e -> Context.mode = Operation.DELETE_COMPONENT);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
        place = new JButton();
        transition = new JButton();
        arc = new JButton();
        run = new JButton();
        step = new JButton();
        delete = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
        .EmptyBorder ( 0, 0 ,0 , 0) ,  "" , javax. swing .border . TitledBorder. CENTER ,javax
        . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "", java .awt . Font. BOLD ,
        12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans
        .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "" .equals ( e.
        getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(new GridLayout());

        //---- place ----
        place.setText("add place");
        add(place);

        //---- transition ----
        transition.setText("add transition");
        add(transition);

        //---- arc ----
        arc.setText("add arc");
        add(arc);

        //---- run ----
        run.setText("run");
        add(run);

        //---- step ----
        step.setText("step");
        add(step);

        //---- delete ----
        delete.setText("delete");
        add(delete);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
    private JButton place;
    private JButton transition;
    private JButton arc;
    private JButton run;
    private JButton step;
    private JButton delete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
