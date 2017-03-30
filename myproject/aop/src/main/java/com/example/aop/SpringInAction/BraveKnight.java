package com.example.aop.SpringInAction;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embark() {
        quest.embark();
    }
}
