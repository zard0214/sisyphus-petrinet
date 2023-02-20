package com.saas.sisyphus.petrinet.foundation;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 20/02/2023 10:45
 */
@Slf4j
@Data
public class PetriNet {

    private static LinkedList<? extends Component> componentList;

    private LinkedList<Place> placesList;
    private LinkedList<Transition> transitionsList;
    private LinkedList<InputArc> inputArcsList;
    private LinkedList<OutputArc> outputArcsList;

    PetriNet(){

    }

    public void init(){
        componentList = new LinkedList<>();

        placesList = new LinkedList();
        transitionsList = new LinkedList();
        inputArcsList = new LinkedList();
        outputArcsList = new LinkedList();
    }

}
