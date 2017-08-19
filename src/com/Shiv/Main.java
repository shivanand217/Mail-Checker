package com.Shiv;

import gui.MainWindow;

import javax.swing.SwingUtilities;

class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow ex = new MainWindow();
                ex.setVisible(true);
            }
        });

    }
}