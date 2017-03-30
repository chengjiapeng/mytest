package com.example.aop.SpringInAction;

import java.io.PrintStream;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("embark on quest to slay the dragon");
    }
}
