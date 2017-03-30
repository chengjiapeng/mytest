package com.example.aop.SpringInAction;

import java.io.PrintStream;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la , the knight is so brave");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did embark on a quest");
    }
}
