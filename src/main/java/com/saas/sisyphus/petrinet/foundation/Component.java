package com.saas.sisyphus.petrinet.foundation;

import lombok.Data;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 17/02/2023 10:08
 */
@Data
public class Component {

    public String id;

    public static long SEQUENCE_ID = 0;

    public int capability = 0;

    public String label;

    public static long getNextSequenceId() {
        return SEQUENCE_ID ++;
    }
}
