/**
 * 
 */
package com.bottleworks.dailymoney.data;

import com.bottleworks.commons.util.I18N;
import com.bottleworks.dailymoney.R;


/**
 * @author dennis
 *
 */
public enum AccountType {

    UNKONW("Z",R.drawable.na),
    INCOME("A",R.drawable.acc_tab_income),
    EXPENSE("B",R.drawable.acc_tab_expense),
    ASSET("C",R.drawable.acc_tab_asset),
    DEBT("D",R.drawable.na),
    OTHER("E",R.drawable.na);
    
    String type;
    int drawable;
    AccountType(String type,int drawable){
        this.type = type;
        this.drawable = drawable;
    }
    public String getType() {
        return type;
    }

    static AccountType[] supported = new  AccountType[]{INCOME,EXPENSE,ASSET/*,DEBT,OTHER*/};
    
    static public AccountType[] getSupportedType(){
        return supported;
    }
    
    static public AccountType find(String type){
        if(INCOME.type.equals(type)){
            return INCOME;
        }else if(EXPENSE.type.equals(type)){
            return EXPENSE;
        }else if(ASSET.type.equals(type)){
            return ASSET;
        }else if(DEBT.type.equals(type)){
            return DEBT;
        }else if(OTHER.type.equals(type)){
            return OTHER;
        }
        return UNKONW;
    }
    
    static public String getDisplay(I18N i18n,String type){
        AccountType at = find(type);
        switch (at) {
        case INCOME:
            return i18n.string(R.string.label_income);
        case EXPENSE:
            return i18n.string(R.string.label_expense);
        case ASSET:
            return i18n.string(R.string.label_asset);
        case DEBT:
            return i18n.string(R.string.label_debt);
        case OTHER:
            return i18n.string(R.string.label_other);
        default:
            return i18n.string(R.string.clabel_unknow);
        }
    }
    public int getDrawable() {
        return drawable;
    }
    
    
}
