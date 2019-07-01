package com.thegreychain.interfaces;

public class ImageButton {

    private OnWidgetClickListener onWidgetClickListener;

    public void setOnWidgetClickListener(OnWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }

    public ImageButton() {
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
