package com.saas.sisyphus.petrinet.ui.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;

import javax.swing.*;
import java.util.Date;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 19/02/2023 16:25
 */
@Slf4j
public class ConsoleUtil {

    public static void log(JTextArea textArea, String log) {
        textArea.append("\n\n");
        textArea.append(DateFormatUtils.format(new Date(), "dd/MM/yyyy HH:mm:ss") + " ");
        textArea.append("\n\n");
        textArea.append(log);
        textArea.append("\n");
        textArea.setCaretPosition(textArea.getText().length());
    }

    public static void clear(JTextArea textArea) {
        textArea.selectAll();
        textArea.replaceSelection("");
    }
}
