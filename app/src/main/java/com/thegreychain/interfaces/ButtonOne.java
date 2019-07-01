package com.thegreychain.interfaces;

public class ButtonOne {

    private MainActivityOne mainActivityOne;

    public void setMainActivityOne(MainActivityOne mainActivityOne) {
        this.mainActivityOne = mainActivityOne;
    }

    public ButtonOne() {
    }

    /**Onclick fires when a user clicks this button.
     *
     */
    private void OnClick(){
        mainActivityOne.onClick(getViewId());
    }

    //Id is generated at runtime
    public int getViewId() {
        return 123456;
    }
}
