package com.saas.sisyphus.petrinet.ui.component;

import com.saas.sisyphus.petrinet.foundation.Context;
import com.saas.sisyphus.petrinet.foundation.Mode;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 19/02/2023 18:20
 */
@Slf4j
@Data
public class PetriNetCanvas extends ScrollPane implements MouseListener {

    private LinkedList<Place2D> place2DLinkedList = new LinkedList<>();
    private LinkedList<Transition2D> transition2DLinkedList = new LinkedList<>();
    private LinkedList<Arc2D> arc2DLinkedList = new LinkedList<>();

    public PetriNetCanvas(){
        this.setBackground(new Color(43, 43, 43));
        Dimension size = getSize();
        setPreferredSize(size);
        setVisible(true);
        this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int button = e.getButton();
        if (button == MouseEvent.BUTTON1) {
            //pop up clean dialog
            switch (Context.mode){
                case Mode.SELECT:
                    break;
                case Mode.ADD_PLACE:
                    addPlace(e);
                    break;
                case Mode.ADD_TRANSITION:
                    addTransition(e);
                    break;
                case Mode.ADD_ARC:
                    addArc(e);
                    break;
                case Mode.ADD_INHIBITOR:
                    addInhibitor(e);
                    break;
                case Mode.DELETE:
                    delComponent(e);
                    break;
                default:
                    break;
            }
        }
    }

    private void delComponent(MouseEvent e) {

    }

    private void addInhibitor(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
    }

    private void addPlace(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
    }

    private void addTransition(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
    }

    private void addArc(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
