package com.saas.sisyphus.petrinet.ui.main;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 19/02/2023 12:30
 */
public class CenterPanel extends JPanel {

    private Label label = new Label();

    public CenterPanel(){
        initComponents();
    }

    private void initComponents() {
        label.setText("123456789");
        this.add(label);
    }
}
