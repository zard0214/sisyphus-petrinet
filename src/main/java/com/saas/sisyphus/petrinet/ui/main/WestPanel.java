package com.saas.sisyphus.petrinet.ui.main;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 19/02/2023 12:30
 */
public class WestPanel extends JPanel {

    private JTextArea jTextArea = new JTextArea();

    public WestPanel(){
        initComponents();
        Dimension size = getSize();
        size.width = 400;
        setPreferredSize(size);
    }

    private void initComponents() {
        this.add(jTextArea);
    }
}
