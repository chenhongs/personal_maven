package com.ch.android.common.event;
//Thanks For Your Reviewing My Code 
//Please send your issues email to 15168264355@163.com when you find there are some bugs in My class 
//You Can add My wx 17620752830 and we can communicate each other about IT industry
//Code Programming By MrCodeSniper on 2018/9/19.Best Wishes to You!  []~(~▽~)~* Cheers!


public class NetWorkChangeEvent {

    private int nowNetSituation;

    public int getNowNetSituation() {
        return nowNetSituation;
    }

    public NetWorkChangeEvent(int nowNetSituation) {
        this.nowNetSituation = nowNetSituation;
    }
}
