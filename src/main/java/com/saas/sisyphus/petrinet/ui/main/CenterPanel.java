/*
 * Created by JFormDesigner on Sun Feb 19 16:45:09 GMT 2023
 */

package com.saas.sisyphus.petrinet.ui.main;

import com.saas.sisyphus.petrinet.ui.component.PetriNetCanvas;

import java.awt.*;
import javax.swing.*;

/**
 * @author zard
 */
public class CenterPanel extends JPanel {

    private PetriNetCanvas petriNetCanvas = new PetriNetCanvas();

    public CenterPanel() {
        initComponents();
        initPetriNetCanva();
    }

    private void initPetriNetCanva() {
        petriNetCanvas.add(new PopupMenu());
        this.add(petriNetCanvas);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Zhecheng Zhao

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
        setLayout(new GridLayout());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
