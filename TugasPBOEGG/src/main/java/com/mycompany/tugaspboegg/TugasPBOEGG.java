/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboegg;

/**
 *
 * @author ThinkBook
 */
public class Account {
    private AccountType type;

Account(String name, int num, int amt, AccountType type)
{
super(name, num, (amt = calculateInitialBonusValue(amt)));
bonusValue = calculateInitialBonusValue(amt);
this.type = type;

}
@Overide
Public String toString() {
    return "\nAccount Type  : " + this.type +
            super.toString();

}
}
