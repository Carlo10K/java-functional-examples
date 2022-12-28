package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    /*
    Consummer que consume un elemento cliArgument cada vez que se invoca, para realizar operaciones en el
     */
    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual getter");
            }
        };

        consumerHelper.accept(cliArguments);
    }

    /*
    supplier que genera un nuevo elemento CLIArguments cada que lo llamamos
     */
    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = () -> new CLIArguments();

        return generator.get();
    }
}
