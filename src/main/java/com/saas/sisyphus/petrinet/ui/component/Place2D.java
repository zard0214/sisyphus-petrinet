/*
 * Created by JFormDesigner on Sun Feb 19 18:23:36 GMT 2023
 */

package com.saas.sisyphus.petrinet.ui.component;

import com.saas.sisyphus.petrinet.foundation.Place;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.awt.geom.*;

/**
 * @author zard
 */
@Slf4j
@Data
public class Place2D extends Ellipse2D {

    private Place place;

    public Place2D() {
        initComponents();
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {

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
