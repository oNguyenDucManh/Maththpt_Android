package com.app.maththpt.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by FRAMGIA\nguyen.duc.manh on 21/02/2017.
 */

public class StatisticalPoint extends RealmObject {
    private int totalQuestionTrue;
    private int totalQuestion;
    private String cateName;
    @PrimaryKey
    private int cateID;
    private String userID;

    public StatisticalPoint() {
    }

    public StatisticalPoint(int totalQuestionTrue, int totalQuestion, int cateID, String cateName, String userID) {
        this.totalQuestionTrue = totalQuestionTrue;
        this.totalQuestion = totalQuestion;
        this.cateID = cateID;
        this.cateName = cateName;
        this.userID = userID;
        getRatio();

    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public float getRatio() {
        float ratio;
        if (getTotalQuestion() <= 0) {
            ratio = -1;
        } else {
            ratio = ((float) getTotalQuestionTrue() * 100) / getTotalQuestion();
        }
        return ratio;
    }

    public int getTotalQuestionTrue() {
        return totalQuestionTrue;
    }

    public void setTotalQuestionTrue(int totalQuestionTrue) {
        this.totalQuestionTrue = totalQuestionTrue;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
