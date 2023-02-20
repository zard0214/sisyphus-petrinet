package com.saas.sisyphus.petrinet.foundation;

import lombok.Data;

import java.util.LinkedList;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 17/02/2023 09:07
 */

@Data
public class TokenSet {

    private LinkedList<Token> tokenList = new LinkedList<>();
}
