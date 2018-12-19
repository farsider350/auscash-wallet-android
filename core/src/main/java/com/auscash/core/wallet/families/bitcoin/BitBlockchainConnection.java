package com.auscash.core.wallet.families.bitcoin;

import com.auscash.core.network.AddressStatus;
import com.auscash.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
