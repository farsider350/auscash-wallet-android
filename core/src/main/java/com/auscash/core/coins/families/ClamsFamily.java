package com.auscash.core.coins.families;

import com.auscash.core.messages.MessageFactory;
import com.auscash.core.wallet.families.clams.ClamsTxMessage;

import javax.annotation.Nullable;

/**
 * @author John L. Jegutanis
 *
 * This family contains Clams
 */
public class ClamsFamily extends BitFamily {
    {
        family = Families.CLAMS;
    }

    @Override
    @Nullable
    public MessageFactory getMessagesFactory() {
        return ClamsTxMessage.getFactory();
    }
}
