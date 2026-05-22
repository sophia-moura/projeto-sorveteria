package main;

import control.SistemaControl;
import view.SistemaView;

public class Main {

    public static void main(String[] args) {

        SistemaControl control = new SistemaControl();

        SistemaView view = new SistemaView();

        view.menu(control);
    }
}