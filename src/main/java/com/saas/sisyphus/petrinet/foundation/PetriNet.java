package com.saas.sisyphus.petrinet.foundation;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 20/02/2023 10:45
 */
@Slf4j
@Data
public class PetriNet {

    private static List<? extends Component> componentList;

    PetriNet(){

    }

    public void init(){
        componentList = new ArrayList<>();
    }

}
