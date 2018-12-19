package com.auscash.core.wallet.families.bitcoin;

import com.auscash.core.network.AddressStatus;
import com.auscash.core.network.ServerClient.UnspentTx;
import com.auscash.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
