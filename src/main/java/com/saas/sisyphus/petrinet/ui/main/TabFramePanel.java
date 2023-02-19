package com.saas.sisyphus.petrinet.ui.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TabFramePanel extends JPanel
        implements MouseListener, MouseMotionListener {

    private TabFrameBar tabFrameBar;

    //bottom tab
    private TabFrameItem[] tabFrameItems;

    private Dimension tempDimension;

    private boolean isDragged = false;

    private double clickDraggedPanelPosition;

    private JPanel contentPanel = new JPanel(new BorderLayout());

    public TabFramePanel(TabFrameItem... tabFrameItems) {
        this.tabFrameItems = tabFrameItems;
        this.tabFrameBar = new TabFrameBar();
        for (TabFrameItem item : tabFrameItems) {
            addTabFrameItem(item);
        }
        setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);
        add(tabFrameBar, BorderLayout.SOUTH);
    }

    public void addTabFrameItem(TabFrameItem tabFrameItem) {
        JToggleButton itemButton = tabFrameItem.getToolBarItemBtn();
        TabFrameItemPanel itemContent = tabFrameItem.getTabFrameItemPanel();

        itemContent.getHeaderPanel().addMouseListener(this);
        itemContent.getHeaderPanel().addMouseMotionListener(this);

        itemContent.getMinimizeButton().addActionListener(e -> itemButton.doClick());

        itemButton.addActionListener(e -> {
            for (JToggleButton btn : tabFrameBar.getToolBarItems()) {
                if (btn != itemButton) {
                    btn.setSelected(false);
                }
            }

            contentPanel.removeAll();
            contentPanel.add(itemContent);

            if (itemButton.isSelected()) {
                contentPanel.setVisible(true);
                setPreferredSize(tempDimension);
            } else {
                tempDimension = getSize();
                contentPanel.setVisible(false);
                setPreferredSize(new Dimension(tempDimension.width, itemButton.getHeight()));
            }
            updateUI();
        });
        tabFrameBar.addBarItem(itemButton);
    }

    public TabFrameBar getTabFrameBar() {
        return this.tabFrameBar;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        clickDraggedPanelPosition = e.getPoint().getY();
        isDragged = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isDragged = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ((JPanel) e.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (isDragged) {
            Dimension size = getSize();
            size.height += clickDraggedPanelPosition;
            size.height += Math.negateExact(e.getY());
            setPreferredSize(size);
            updateUI();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
