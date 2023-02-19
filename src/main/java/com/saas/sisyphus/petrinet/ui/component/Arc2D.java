/*
 * Created by JFormDesigner on Sun Feb 19 18:25:49 GMT 2023
 */

package com.saas.sisyphus.petrinet.ui.component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.awt.geom.*;

/**
 * @author zard
 */
@Slf4j
@Data
public class Arc2D extends Line2D {

    public Arc2D() {
        initComponents();
    }

    @Override
    public double getX1() {
        return 0;
    }

    @Override
    public double getY1() {
        return 0;
    }

    @Override
    public Point2D getP1() {
        return null;
    }

    @Override
    public double getX2() {
        return 0;
    }

    @Override
    public double getY2() {
        return 0;
    }

    @Override
    public Point2D getP2() {
        return null;
    }

    @Override
    public void setLine(double x1, double y1, double x2, double y2) {

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Zhecheng Zhao
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
