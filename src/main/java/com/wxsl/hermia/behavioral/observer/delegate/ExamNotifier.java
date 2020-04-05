package com.wxsl.hermia.behavioral.observer.delegate;

public class ExamNotifier extends Notifiable {

    /**
     * 考试
     */
    public void exam() throws Exception {
        delegateEvent();
    }
}
