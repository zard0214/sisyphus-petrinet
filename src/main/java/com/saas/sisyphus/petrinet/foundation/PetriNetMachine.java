package com.saas.sisyphus.petrinet.foundation;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 10/02/2023 11:23
 */
public class PetriNetMachine<C> implements PetriNetEngine<C>{

    @Override
    public void fire(C context) {

    }

    @Override
    public boolean canAccept(C context) {
        return false;
    }

    @Override
    public void start(C context) {

    }

    @Override
    public void terminate(C context) {

    }
}
