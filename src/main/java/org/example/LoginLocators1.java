package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLocators1 {
    WebDriver driver;

    public By enterUsername() {
        return new By.ByXPath("//*[@id=\"it1::content\"]");
    }

    public By enterPassword() {
        return new By.ByXPath("//*[@id=\"it2::content\"]");

    }


    public By clickLoginButton() {
        return new By.ByXPath("//*[@id=\"login\"]");

    }

    public By table() {
        return new By.ByXPath("//*[@id=\"j_id7\"]/table");

    }

    public By clickYesButton() {
        return By.xpath("//*[@id=\"j_id7_yes\"]/a");

    }

    public By OpenBurgerButton() {
        return By.xpath("//*[@id=\"pt1:OasisHedarToolBar:hamburgerBtn\"]");
    }

    public By SendSearchValue() {
        return new By.ByXPath("//*[@class='oj-inputtext-input oj-component-initnode']");

    }

    public By ClickSearchValue() {
        return By.xpath("//*[@class='oj-treeview-item-text']");
    }

    public By checkPostedData() {
        return By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc17:ot3:dc_pgl6\"]/tbody/tr/td/span");
    }

    public By EnterCalenderPicker() {
        return By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13::content\"]");
    }

   /* public By selectMonth() {
        return By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13::pop::cd::mSel::content\"]/option[1]");
    }

    public By selectYear() {
        return By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13::pop::cd::ys::content\"]");
    }

    public By selectDay1() {
        return By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:0:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13::pop::cd::cg\"]/tbody/tr[2]/td[6]");
    }*/

    public By PlaceClickOnByMouse() {
        return By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc17:nnnnnnn\"]");
    }
}