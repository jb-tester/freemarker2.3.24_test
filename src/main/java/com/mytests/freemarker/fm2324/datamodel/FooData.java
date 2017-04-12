package com.mytests.freemarker.fm2324.datamodel;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/14/2016.
 * Project: fm_dialects
 * привет
 * привет!
 * *******************************
 */
public class FooData {
    List<String> fooVar1;
    boolean fooVar2;
    Integer fooVar3;

    public FooData(List<String> fooVar1Arg, boolean fooVar2Arg, Integer fooVar3Arg) {
        fooVar1 = fooVar1Arg;
        fooVar2 = fooVar2Arg;
        fooVar3 = fooVar3Arg;
    }

    public List<String> getFooVar1() {
        return fooVar1; // привет
    }

    public void setFooVar1(List<String> fooVar1Arg) {
        fooVar1 = fooVar1Arg;
    }

    public boolean isFooVar2() {
        return fooVar2;
    }

    public void setFooVar2(boolean fooVar2Arg) {
        fooVar2 = fooVar2Arg;
    }

    public Integer getFooVar3() {
        return fooVar3;
    }

    public void setFooVar3(Integer fooVar3Arg) {
        fooVar3 = fooVar3Arg;
    }
}
