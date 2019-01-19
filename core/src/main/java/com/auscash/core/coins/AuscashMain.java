package com.auscash.core.coins;

import com.auscash.core.coins.families.BitFamily;

/**
 * @author 
 */
public class AuscashMain extends BitFamily {
    private AuscashMain() {
        id = "auscash.main";

        addressHeader = 23;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 23;

        name = "Auscash";
        symbol = "AUS";
        uriScheme = "auscash";
        bip44Index = 2;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 LTC mininput
        softDustLimit = value(100000); // 0.001 LTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;

    }

    private static AuscashMain instance = new AuscashMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
