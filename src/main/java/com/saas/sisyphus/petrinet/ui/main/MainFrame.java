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

    private JTextArea jTextArea = new JTextArea();
    private JTextArea logArea = new JTextArea();
    private JScrollPane jScrollPane = new JScrollPane();
    private JOptionPane warningOptionPane = new JOptionPane();

    public MainFrame(){
        initComponents();
    }

    private void initComponents() {
        initLogArea();

        JButton cleanButton = new JButton(new FlatClearIcon());

        cleanButton.addActionListener(e -> {
            logArea.append("T1 fired.\n");
            logArea.append("----------------------------\n");
        });

        jScrollPane.setEnabled(false);
        jScrollPane.setViewportView(logArea);

        TabFrameItem tabFrameItem = new TabFrameItem(
                new JToggleButton("Log", new FlatSVGIcon("com/sisyphus/petrinet/icons/copy.svg", 20, 20)),
                jScrollPane,
                cleanButton
        );
        TabFramePanel tabFramePanel = new TabFramePanel(tabFrameItem);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jTextArea, BorderLayout.CENTER);
        jPanel.add(tabFramePanel, BorderLayout.SOUTH);
        this.add(jPanel);
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
