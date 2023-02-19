package com.saas.sisyphus.petrinet.ui.main;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.icons.FlatClearIcon;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Zhecheng Zhao
 * @RegistrationNo 220186627
 * @date Created in 19/02/2023 09:40
 */
@Data
@Slf4j
public class MainFrame extends JFrame{

    private JTextArea logArea = new JTextArea();
    private NorthPanel northPanel = new NorthPanel();
    private EastPanel eastPanel = new EastPanel();
    private CenterPanel centerPanel = new CenterPanel();
    private WestPanel westPanel = new WestPanel();
    private JScrollPane jScrollPane = new JScrollPane();
    private JOptionPane warningOptionPane = new JOptionPane();
    private JButton cleanButton = new JButton(new FlatClearIcon());

    public MainFrame(){
        initComponents();
    }

    private void initComponents() {

        initLogArea();

        initJScrollPane();

        TabFrameItem tabFrameItem = new TabFrameItem(
                new JToggleButton("Log", new FlatSVGIcon("com/sisyphus/petrinet/icons/copy.svg", 20, 20)),
                jScrollPane,
                cleanButton
        );
        TabFramePanel tabFramePanel = new TabFramePanel(tabFrameItem);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(northPanel, BorderLayout.NORTH);
        jPanel.add(eastPanel, BorderLayout.EAST);
        jPanel.add(centerPanel, BorderLayout.CENTER);
        jPanel.add(westPanel, BorderLayout.WEST);
        jPanel.add(tabFramePanel, BorderLayout.SOUTH);
        this.add(jPanel);
    }

    private void initJScrollPane() {
        jScrollPane.setEnabled(false);
        jScrollPane.setViewportView(logArea);
    }

    private void initLogArea() {
        logArea.setEditable(false);
        logArea.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int button = e.getButton();
                if (button == MouseEvent.BUTTON3) {
                    //pop up clean dialog
                    showDialog();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        cleanButton = new JButton(new FlatClearIcon());

        cleanButton.addActionListener(e -> {
            logArea.append("T1 fired.\n");
            logArea.append("----------------------------\n");
        });
    }

    private void showDialog() {
        Window window = SwingUtilities.windowForComponent( this );
        int option = JOptionPane.showOptionDialog(
                window,
                "Clean all",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE, null, null, "4");
        if(option == JOptionPane.OK_OPTION){
            logArea.selectAll();
            logArea.replaceSelection("");
        }
    }
}
