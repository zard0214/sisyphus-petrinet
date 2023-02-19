package com.saas.sisyphus.petrinet;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.util.SystemInfo;
import com.saas.sisyphus.petrinet.graphics.Main;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 18/02/2023 11:57
 */
@Slf4j
public class GUI {

    static boolean screenshotsMode = Boolean.parseBoolean(System.getProperty("screenshotsMode"));

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
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        FlatDarkLaf.install();
        FlatLaf.registerCustomDefaultsSource("");
        JFrame frame = new JFrame("Petri Net Simulator");
//        frame.setContentPane(Home.getInstance().home);
        frame.setContentPane(Main.getInstance().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,
                height);
        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
