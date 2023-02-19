package com.saas.sisyphus.petrinet.ui.main;

import javax.swing.*;

public class TabFrameItem {

    private JToggleButton toolBarItemBtn;

    private JComponent contentComponent;

    private TabFrameItemPanel tabFrameItemPanel;

    private JButton[] gadgetButtons;

    public TabFrameItem(JToggleButton toolBarItemBtn, JComponent contentComponent) {
        this(toolBarItemBtn, contentComponent, null);
    }

    public TabFrameItem(JToggleButton toolBarItemBtn, JComponent contentComponent, JButton... gadgetButtons) {
        this.toolBarItemBtn   = toolBarItemBtn;
        this.contentComponent = contentComponent;
        this.gadgetButtons    = gadgetButtons;

        createTabFrameItemPanel();
    }

    private void createTabFrameItemPanel() {
        JLabel titleLabel = new JLabel(toolBarItemBtn.getText());
        tabFrameItemPanel = new TabFrameItemPanel(titleLabel, contentComponent);
        if (gadgetButtons != null) {
            for (JButton gadgetButton : gadgetButtons) {
                tabFrameItemPanel.getHeaderToolBar().add(gadgetButton);
            }
        }
    }

    public JToggleButton getToolBarItemBtn() {
        return toolBarItemBtn;
    }

    public TabFrameItemPanel getTabFrameItemPanel() {
        return tabFrameItemPanel;
    }
}