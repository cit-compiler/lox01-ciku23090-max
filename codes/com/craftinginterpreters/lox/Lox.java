package com.craftinginterpreters.lox;

import java.io.IOException;

public class Lox {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64); 
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }

    private static void runFile(String path) throws IOException {
        // まだ中身は空でもOK、またはテキスト通りに記述
    }

    private static void runPrompt() throws IOException {
        // まだ中身は空でもOK、またはテキスト通りに記述
    }
}