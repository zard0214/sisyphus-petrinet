package com.saas.sisyphus.petrinet.ui.main;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.icons.FlatClearIcon;
import lombok.Data;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 19/02/2023 09:40
 */
@Data
public class MainFrame extends JFrame{

    private JTextArea jTextArea = new JTextArea();
    private JTextArea logArea = new JTextArea();

    private JScrollPane jScrollPane = new JScrollPane();

    public MainFrame(){
        initComponents();
    }

    private void initComponents() {

        logArea.setEditable(false);

        JButton cleanButton = new JButton(new FlatClearIcon());

        cleanButton.addActionListener(e -> {
            logArea.append("T1 fired.\n");
            logArea.append("----------------------------\n");
        });

        jScrollPane.setEnabled(false);
        jScrollPane.setViewportView(logArea);

        TabFrameItem tabFrameItem = new TabFrameItem(
                new JToggleButton("Log", new FlatSVGIcon("com/sisyphus/petrinet/icons/copy.svg", 20, 20)),
                jScrollPane,
                cleanButton
        );
        TabFramePanel tabFramePanel = new TabFramePanel(tabFrameItem);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jTextArea, BorderLayout.CENTER);
        jPanel.add(tabFramePanel, BorderLayout.SOUTH);
        this.add(jPanel);
    }
}
