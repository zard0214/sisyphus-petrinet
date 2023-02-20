package com.saas.sisyphus.petrinet.foundation;

import lombok.Data;

import java.util.LinkedList;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 09/02/2023 20:51
 */

@Data
public class Place extends Component {

    private TokenSet tokenSet = new TokenSet();

    private LinkedList<InputArc> inputArcsList = new LinkedList<>();
    private LinkedList<OutputArc> outputArcsList = new LinkedList<>();

    public Place(){
        this.id = String.valueOf(SEQUENCE_ID);
        getNextSequenceId();
    }

    @Override
    public String getLabel() {
        if(label.isEmpty()){
            label = "Place "+ id;
        }
        return label;
    }

}
