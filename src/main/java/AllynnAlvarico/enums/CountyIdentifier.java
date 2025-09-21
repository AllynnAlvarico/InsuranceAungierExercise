package AllynnAlvarico.enums;

public enum CountyIdentifier {
    CORK("C"),
    CLARE("CE"),
    CAVAN("CN"),
    CARLOW("CW"),
    DUBLIN("D"),
    DONEGAL("DL"),
    GALWAY("G"),
    KILDARE("KE"),
    KILKENNY("KK"),
    KERRY("KY"),
    LIMERICK("L"),
    LONGFORD("LD"),
    LOUTH("LH"),
    LEITRIM("LM"),
    LAOIS("LS"),
    MEATH("MH"),
    MONAGHAN("MN"),
    MAYO("MO"),
    OFFALY("OY"),
    ROSCOMMON("RN"),
    SLIGO("SO"),
    TIPPERARY("T"),
    WATERFORD("W"),
    WESTMEATH("WH"),
    WEXFORD("WX"),
    WICKLOW("WW");


    private final String countyIdentifier;

    CountyIdentifier(String countyIdentifier) {
        this.countyIdentifier = countyIdentifier;
    }
    public static CountyIdentifier getCountyIdentifier(String cc) {
        if (cc == null) return null;
        cc = cc.trim().toLowerCase();
        return switch (cc) {
            case "c", "cork" -> CountyIdentifier.CORK;
            case "ce", "clare" -> CountyIdentifier.CLARE;
            case "cn", "cavan" -> CountyIdentifier.CAVAN;
            case "cw", "carlow" -> CountyIdentifier.CARLOW;
            case "d", "dublin" -> CountyIdentifier.DUBLIN;
            case "dl", "donegal" -> CountyIdentifier.DONEGAL;
            case "g", "galway" -> CountyIdentifier.GALWAY;
            case "ke", "kildare" -> CountyIdentifier.KILDARE;
            case "kk", "kilkenny" -> CountyIdentifier.KILKENNY;
            case "ky", "kerry" -> CountyIdentifier.KERRY;
            case "l", "limerick" -> CountyIdentifier.LIMERICK;
            case "ld", "longford" -> CountyIdentifier.LONGFORD;
            case "lh", "louth" -> CountyIdentifier.LOUTH;
            case "lm", "leitrim" -> CountyIdentifier.LEITRIM;
            case "ls", "laois" -> CountyIdentifier.LAOIS;
            case "mh", "meath" -> CountyIdentifier.MEATH;
            case "mn", "monaghan" -> CountyIdentifier.MONAGHAN;
            case "mo", "mayo" -> CountyIdentifier.MAYO;
            case "oy", "offaly" -> CountyIdentifier.OFFALY;
            case "rn", "roscommon" -> CountyIdentifier.ROSCOMMON;
            case "so", "sligo" -> CountyIdentifier.SLIGO;
            case "t", "tipperary" -> CountyIdentifier.TIPPERARY;
            case "w", "waterford" -> CountyIdentifier.WATERFORD;
            case "wh", "westmeath" -> CountyIdentifier.WESTMEATH;
            case "wx", "wexford" -> CountyIdentifier.WEXFORD;
            case "ww", "wicklow" -> CountyIdentifier.WICKLOW;
            default -> null;
        };
    }
    public String getIdentifier() {
        return countyIdentifier;
    }

}
