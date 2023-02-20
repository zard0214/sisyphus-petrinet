/*
 * Created by JFormDesigner on Sun Feb 19 16:46:56 GMT 2023
 */

package com.saas.sisyphus.petrinet.ui.main;

import com.saas.sisyphus.petrinet.foundation.Context;
import com.saas.sisyphus.petrinet.foundation.Mode;
import com.saas.sisyphus.petrinet.ui.utils.ConsoleUtil;

import java.awt.*;
import javax.swing.*;

/**
 * @author zard
 */
public class ManuPanel extends JPanel {
    public ManuPanel() {
        initComponents();
        setOnClickListener();
    }

    private void setOnClickListener() {
        place.addActionListener(e -> {
            Context.mode = Mode.ADD_PLACE;
            ConsoleUtil.log("add place");
        });
        transition.addActionListener(e -> {
            Context.mode = Mode.ADD_TRANSITION;
            ConsoleUtil.log("add transition");
        });
        arc.addActionListener(e -> {
            Context.mode = Mode.ADD_ARC;
            ConsoleUtil.log("add arc");
        });
        inhibitor.addActionListener(e -> {
            Context.mode = Mode.ADD_INHIBITOR;
            ConsoleUtil.log("add inhibitor");
        });
        run.addActionListener(e -> {
            Context.mode = Mode.RUN;
        });
        step.addActionListener(e -> {
            Context.mode = Mode.STEP;
        });
        delete.addActionListener(e -> {
            Context.mode = Mode.DELETE;
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
        place = new JButton();
        transition = new JButton();
        arc = new JButton();
        inhibitor = new JButton();
        run = new JButton();
        step = new JButton();
        delete = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(new GridLayout());

        //---- place ----
        place.setText("add place");
        place.setPreferredSize(new Dimension(70, 30));
        add(place);

        //---- transition ----
        transition.setText("add transition");
        transition.setPreferredSize(new Dimension(70, 30));
        add(transition);

        //---- arc ----
        arc.setText("add arc");
        arc.setPreferredSize(new Dimension(70, 30));
        add(arc);

        //---- inhibitor ----
        inhibitor.setText("add inhibitor");
        inhibitor.setPreferredSize(new Dimension(70, 30));
        add(inhibitor);

        //---- run ----
        run.setText("run");
        run.setPreferredSize(new Dimension(70, 30));
        add(run);

        //---- step ----
        step.setText("step");
        step.setPreferredSize(new Dimension(70, 30));
        add(step);

        //---- delete ----
        delete.setText("delete");
        delete.setPreferredSize(new Dimension(70, 30));
        add(delete);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
    private JButton place;
    private JButton transition;
    private JButton arc;
    private JButton inhibitor;
    private JButton run;
    private JButton step;
    private JButton delete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
