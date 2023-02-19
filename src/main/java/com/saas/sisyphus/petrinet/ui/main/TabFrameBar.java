package com.saas.sisyphus.petrinet.ui.main;

import com.formdev.flatlaf.util.UIScale;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class TabFrameBar extends JPanel {

    private JToolBar toolBar = new JToolBar();

    private ArrayList<JToggleButton> toolBarItems = new ArrayList<>();

    public TabFrameBar(JToggleButton... barItems) {
        toolBar.setRollover(true);
        toolBar.setFloatable(false);
        toolBar.setBorder(new MLineBorder(-1, false, false, false, false));

        for (JToggleButton barItem : barItems) {
            addBarItem(barItem);
        }
        setLayout(new BorderLayout());
        add(toolBar, BorderLayout.WEST);
        setBorder(new MLineBorder(1, false, false, true, true));
    }

    public void addBarItem(JToggleButton barItem) {
        barItem.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        barItem.setBorder(new EmptyBorder(UIScale.scale(4), UIScale.scale(10), UIScale.scale(4), UIScale.scale(10)));
        toolBar.add(barItem);
        this.toolBarItems.add(barItem);
    }

    public ArrayList<JToggleButton> getToolBarItems() {
        return toolBarItems;
    }

    public void addBarRightItem(JComponent component) {
        add(component, BorderLayout.EAST);
    }
}
