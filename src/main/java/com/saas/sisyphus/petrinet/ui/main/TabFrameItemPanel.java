package com.saas.sisyphus.petrinet.ui.main;

import com.formdev.flatlaf.icons.FlatTreeExpandedIcon;
import com.formdev.flatlaf.ui.FlatEmptyBorder;
import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class TabFrameItemPanel extends JPanel {

    private JLabel titleLabel;
    private JPanel headerPanel;

    private JToolBar headerToolBar;
    private JButton  minimizeButton;

    public TabFrameItemPanel(JLabel titleLabel, JComponent contentComponent) {
        this.titleLabel = titleLabel;
        initializeHeader();

        setLayout(new BorderLayout());
        add(headerPanel, BorderLayout.NORTH);

        //set default size
        Dimension size = getSize();
        size.height = 350;
        setPreferredSize(size);

        add(contentComponent, BorderLayout.CENTER);
    }

    private void initializeHeader() {
        titleLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        titleLabel.setBorder(new FlatEmptyBorder(4, 4, 4, 4));

        minimizeButton = new JButton(new FlatTreeExpandedIcon());

        headerToolBar = new JToolBar();
        headerToolBar.setFloatable(false);
        headerToolBar.add(minimizeButton);

        headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(titleLabel, BorderLayout.WEST);
        headerPanel.add(headerToolBar, BorderLayout.EAST);
        headerPanel.setBorder(new MLineBorder(1, false, false, true, true));
    }

}