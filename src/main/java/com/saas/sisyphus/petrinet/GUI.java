package com.saas.sisyphus.petrinet;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.util.SystemInfo;
import com.saas.sisyphus.petrinet.ui.main.MainFrame;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 18/02/2023 11:57
 */
@Slf4j
public class GUI {

    static boolean screenshotsMode = Boolean.parseBoolean(System.getProperty("screenshotsMode"));

    static {
        FlatDarculaLaf.setup();
    }

    public static void main(String[] args) {
        if (SystemInfo.isMacOS) {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("apple.awt.application.name", "Petri Net Simulator");
            System.setProperty("apple.awt.application.appearance", "system");
        }
        if (SystemInfo.isLinux) {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        }
        if (GUI.screenshotsMode && !SystemInfo.isJava_9_orLater && System.getProperty("flatlaf.uiScale") == null) {
            System.setProperty("flatlaf.uiScale", "2x");
        }

        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            frame.pack();
            frame.setVisible(true);
        });

    }
}
