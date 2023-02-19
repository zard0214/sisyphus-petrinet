package com.saas.sisyphus.petrinet.ui.component;

import com.saas.sisyphus.petrinet.foundation.Context;
import com.saas.sisyphus.petrinet.foundation.Operation;
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
public class PetriNetCanvas extends Canvas implements MouseListener {

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
        log.info("mouseClicked :" + button);
        if (button == MouseEvent.BUTTON1) {
            //pop up clean dialog
            switch (Context.mode){
                case Operation.SELECT:
                    break;
                case Operation.ADD_PLACE:
                    addPlace(e);
                    break;
                case Operation.ADD_TRANSITION:
                    addTransition(e);
                    break;
                case Operation.ADD_ARC:
                    addArc(e);
                    break;
                case Operation.DELETE_COMPONENT:
                    break;
            }
        }
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
