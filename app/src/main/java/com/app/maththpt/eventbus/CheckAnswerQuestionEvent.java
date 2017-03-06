package com.app.maththpt.eventbus;

/**
 * Created by manhi on 4/1/2017.
 */

public class CheckAnswerQuestionEvent {
    public static final int TYPE_CHECK = 1;
    public static final int TYPE_DETAIL = 2;
    public int position;
    public int type;

    public CheckAnswerQuestionEvent(int position, int type) {
        this.position = position;
        this.type = type;
    }
}