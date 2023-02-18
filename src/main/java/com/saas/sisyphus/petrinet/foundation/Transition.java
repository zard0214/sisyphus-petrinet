package com.saas.sisyphus.petrinet.foundation;


/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 09/02/2023 20:51
 */

public class Transition extends Component implements PetriNetEngine<Context> {

    public Transition(){
        this.id = String.valueOf(SEQUENCE_ID);
        getNextSequenceId();
    }

    public String getLabel() {
        if(label.isEmpty()){
            label = "Transition "+ id;
        }
        return label;
    }

    @Override
    public void fire(Context context) {

    }

    @Override
    public boolean canAccept(Context context) {
        return false;
    }

    @Override
    public void start(Context context) {

    }

    @Override
    public void terminate(Context context) {

    }
}
