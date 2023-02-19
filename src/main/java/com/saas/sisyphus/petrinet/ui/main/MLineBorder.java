package com.saas.sisyphus.petrinet.ui.main;

import com.formdev.flatlaf.util.ColorFunctions;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class MLineBorder extends LineBorder {

    public static Color defaultBorderColor;

    static {
        Color color = (Color) UIManager.getLookAndFeelDefaults().get("Panel.background");

        defaultBorderColor = ColorFunctions.applyFunctions(color, new ColorFunctions.HSLChange(2, 85.0f));
    }

    private boolean left = true, right = true, top = true, bottom = true;

    public MLineBorder() {
        super(Color.darkGray);
    }

    public MLineBorder(Color color) {
        super(color);
    }

    public MLineBorder(Color color, int thickness) {
        super(color, thickness);
    }

    public MLineBorder(Color color, int thickness, boolean left, boolean right, boolean top, boolean bottom) {
        super(color, thickness);
        this.left   = left;
        this.right  = right;
        this.bottom = bottom;
        this.top    = top;
    }

    public MLineBorder(int thickness, boolean left, boolean right, boolean top, boolean bottom) {
        super(defaultBorderColor, thickness);
        this.left   = left;
        this.right  = right;
        this.bottom = bottom;
        this.top    = top;
    }

    public void setInsets(boolean left, boolean right, boolean top, boolean bottom) {
        this.left   = left;
        this.right  = right;
        this.bottom = bottom;
        this.top    = top;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if ((this.thickness > 0) && (g instanceof Graphics2D)) {
            Graphics2D g2d = (Graphics2D) g;
            Color oldColor = g2d.getColor();
            g2d.setColor(this.lineColor);
            if (left) {
                g2d.drawLine(x, y, x, y + height);
            }
            if (top) {
                g2d.drawLine(x, y, x + width, y);
            }
            if (right) {
                g2d.drawLine(x + width, y, x + width, y + height);
            }
            if (bottom) {
                g2d.drawLine(x, y + height, x + width, y + height);
            }
            g2d.setColor(oldColor);
        }
    }
}
