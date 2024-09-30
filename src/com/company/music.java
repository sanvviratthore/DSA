/*package com.company;
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class music
{
    public class MusicPlayer extends JFrame {
        //private Player player;
        private Thread playbackThread;
        private String currentFilePath;

        public MusicPlayer() {
            setTitle("Simple Music Player");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            JLabel songTitleLabel = new JLabel("No song loaded");
            JButton loadButton = new JButton("Load Music");
            JButton playButton = new JButton("Play");
            JButton pauseButton = new JButton("Pause");
            JButton stopButton = new JButton("Stop");

            loadButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    int result = fileChooser.showOpenDialog(null);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        currentFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                        songTitleLabel.setText(fileChooser.getSelectedFile().getName());
                    }
                }
            });

            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (currentFilePath != null) {
                        startPlaying();
                    }
                }
            });

            pauseButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //if (player != null) {
                      //  player.close();
                    }
                }
            });

            stopButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (player != null) {
                        player.close();
                    }
                }
            });

            add(songTitleLabel);
            add(loadButton);
            add(playButton);
            add(pauseButton);
            add(stopButton);
        }

        private void startPlaying() {
            if (playbackThread != null && playbackThread.isAlive()) {
                player.close();
            }
            playbackThread = new Thread(() -> {
                try {
                    FileInputStream fileInputStream = new FileInputStream(currentFilePath);
                    player = new Player(fileInputStream);
                    player.play();
                } catch (FileNotFoundException | JavaLayerException e) {
                    e.printStackTrace();
                }
            });
            playbackThread.start();
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                MusicPlayer musicPlayer = new MusicPlayer();
                musicPlayer.setVisible(true);
            });
        }
    }

}*/
