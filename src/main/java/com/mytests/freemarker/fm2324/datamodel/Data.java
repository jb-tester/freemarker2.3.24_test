package com.mytests.freemarker.fm2324.datamodel;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 16.04.2008
 * Time: 16:19:38
 * To change this template use File | Settings | File Templates.
 */
public class Data {

    public static Map setDatas(){

// setting data model:
        Map jvn = new HashMap();
        jvn.put("name","MyClass");
        jvn.put("pack","com.fmtests");

        List theList = new ArrayList();
        theList.add("element1");
        theList.add("element2");
        theList.add("element3");
        theList.add("element4");
        theList.add("element5");

        List intList = new ArrayList();
        intList.add(12);
        intList.add(22);
        intList.add(-33);
        intList.add(44);

        List fonts = new ArrayList();
        fonts.add("Arial");
        fonts.add("Tahoma");

        Map root = new HashMap();
        root.put("user","irina");
        root.put("javanames", jvn);
        root.put("theList", theList);
        root.put("intList", intList);
        //root.put("hex", new ToHex());
        root.put("fonts",fonts);

        List<String> fooVar1 = new ArrayList<>();
        fooVar1.add("chocolate");
        fooVar1.add("cyan");
        FooData _fooData_ = new FooData(fooVar1, true, 100);
        root.put("fooVar1",_fooData_.getFooVar1());
        root.put("fooVar2", _fooData_.isFooVar2());
        root.put("fooVar3", _fooData_.getFooVar3());

        root.put("today", new Date());

        return root;

    }
}
