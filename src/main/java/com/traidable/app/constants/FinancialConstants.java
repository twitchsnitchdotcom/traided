package com.traidable.app.constants;

import java.util.List;

public class FinancialConstants {

    public static final Integer[] FISCAL_YEARS = {2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022};

    public static List<String> TOP_TIER_AGENCY_CODES;

    //todo, set this at the stage of startup or something
    public static void setTopTierAgencyCodes(List<String> codes){
        TOP_TIER_AGENCY_CODES = codes;
    }
}
