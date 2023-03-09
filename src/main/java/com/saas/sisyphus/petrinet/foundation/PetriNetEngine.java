package com.saas.sisyphus.petrinet.foundation;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 09/02/2023 20:44
 *
 * driven by process logic, case data and management rules
 */

/**
 *
 * @param <C> – context
 */
public interface PetriNetEngine<C> {

    /**
     * Fires the specified transition
     * @param c
     */
    void fire(C c);

    /**
     * @param context
     * @return true is passed in event is acceptable otherwise return false
     */
    boolean canAccept(C context);

    /**
     * Start transition under context
     * @param context context
     */
    void start(C context);

    /**
     * move token from p1 to p2
     * @param p1
     * @param p2
     */
    void transition(C p1, C p2);

    /**
     * Terminate transition under context
     * @param context context
     */
    void terminate(C context);
}
