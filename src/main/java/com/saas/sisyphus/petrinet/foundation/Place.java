package com.saas.sisyphus.petrinet.foundation;

import lombok.Data;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 09/02/2023 20:51
 */

@Data
public class Place extends Component {

    private TokensSet tokensSet = new TokensSet();

    public Place(){
        this.id = String.valueOf(SEQUENCE_ID);
        SEQUENCE_ID ++;
    }

    public String getLabel() {
        if(label.isEmpty()){
            label = "Place "+ id;
        }
        return label;
    }
}
