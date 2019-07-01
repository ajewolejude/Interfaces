package com.thegreychain.interfaces;

public class ButtonTwo {

    private OnWidgetClickListener onWidgetClickListener;

    public void setOnWidgetClickListener(OnWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }

    public ButtonTwo() {
    }

    /**Onclick fires when a user clicks this button.
     *
     */
    private void OnClick(){
        onWidgetClickListener.onClick(getViewId());
    }

    //Id is generated at runtime
    public int getViewId() {
        return 123456;
    }
}
