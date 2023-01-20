package hu.ltk.core;

import hu.ltk.jakabgabor.init.InitProject;

public class CoreInitProjectMain {
    public static void main(String[] args) {
        InitProject initProject = new InitProject();

        System.out.println(initProject.whoAmI());
    }
}
