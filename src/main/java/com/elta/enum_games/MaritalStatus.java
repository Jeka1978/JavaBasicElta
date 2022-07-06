package com.elta.enum_games;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public enum MaritalStatus {


    SINGLE(1,"רווק"),
    DIVORCED(3,"גרוש"),
    MARRIED(5,"נשוי");

    private int dbCode;
    private String hebrewDesc;

    public int getDbCode() {
        return dbCode;
    }

    public String getHebrewDesc() {
        return hebrewDesc;
    }

    MaritalStatus(int dbCode, String desc) {
        this.dbCode = dbCode;
        this.hebrewDesc = desc;
    }


    MaritalStatus(int dbCode) {
        this.dbCode = dbCode;
    }



    MaritalStatus(String hebrewDesc) {
        this.hebrewDesc = hebrewDesc;
    }


    public MaritalStatus findByDbCode(int dbCode) throws UnsupportedOperationException {
        MaritalStatus[] maritalStatuses = values();
        for (MaritalStatus maritalStatus : maritalStatuses) {
            if (maritalStatus.dbCode == dbCode) {
                return maritalStatus;
            }
        }
        throw new UnsupportedOperationException(dbCode + " not supported yet");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
