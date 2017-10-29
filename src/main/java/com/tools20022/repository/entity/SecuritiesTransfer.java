/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.PartialSettlementCode;
import com.tools20022.repository.codeset.TransferReasonCode;
import com.tools20022.repository.codeset.TransferTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTransfer" src="doc-files/SecuritiesTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Identification
 * SecuritiesTransfer.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferredQuantity
 * SecuritiesTransfer.TransferredQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Account
 * SecuritiesTransfer.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferType
 * SecuritiesTransfer.TransferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#RelatedSettlement
 * SecuritiesTransfer.RelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#OwnAccountTransferIndicator
 * SecuritiesTransfer.OwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#PhysicalDelivery
 * SecuritiesTransfer.PhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#LateDeliveryDate
 * SecuritiesTransfer.LateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferTax
 * SecuritiesTransfer.TransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferReason
 * SecuritiesTransfer.TransferReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#PartialSettlementType
 * SecuritiesTransfer.PartialSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#SecuritiesDeliveryObligation
 * SecuritiesTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#BookEntry
 * SecuritiesTransfer.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransactionIdentification
 * SecuritiesTransfer.TransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Security
 * SecuritiesTransfer.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Status
 * SecuritiesTransfer.Status}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTransfer
 * Security.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedTransfer
 * SecuritiesAccount.RelatedTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#SecuritiesTransfer
 * Tax.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTransfer
 * SecuritiesQuantity.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TransferOperation
 * SecuritiesSettlement.TransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#TriggeringSecuritiesTransfer
 * SecuritiesEntry.TriggeringSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#RelatedTransfer
 * PhysicalDelivery.RelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RelatedSecuritiesTransfer
 * SecuritiesTradeStatus.RelatedSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTransfer
 * SecuritiesDeliveryObligation.SecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn1#TransferDetails
 * TransferIn1.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn4#TransferDetails
 * TransferIn4.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn6#TransferDetails
 * TransferIn6.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut1#TransferDetails
 * TransferOut1.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut6#TransferDetails
 * TransferOut6.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut8#TransferDetails
 * TransferOut8.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut10#TransferDetails
 * TransferOut10.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn8#TransferDetails
 * TransferIn8.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn2#TransferDetails
 * TransferIn2.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn3#TransferDetails
 * TransferIn3.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn5#TransferDetails
 * TransferIn5.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut2#TransferDetails
 * TransferOut2.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut5#TransferDetails
 * TransferOut5.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut7#TransferDetails
 * TransferOut7.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut9#TransferDetails
 * TransferOut9.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn7#TransferDetails
 * TransferIn7.TransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn10#TransferAndReferences
 * TransferIn10.TransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn9#TransferDetails
 * TransferIn9.TransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut11#TransferAndReferences
 * TransferOut11.TransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut12#TransferDetails
 * TransferOut12.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut13#TransferDetails
 * TransferOut13.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn11#TransferDetails
 * TransferIn11.TransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn13#TransferAndReferences
 * TransferIn13.TransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut14#TransferDetails
 * TransferOut14.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn12#TransferDetails
 * TransferIn12.TransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut15#TransferAndReferences
 * TransferOut15.TransferAndReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut17#TransferAndReferences
 * TransferOut17.TransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14#TransferDetails
 * TransferIn14.TransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn15#TransferAndReferences
 * TransferIn15.TransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut16#TransferDetails
 * TransferOut16.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn16#TransferDetails
 * TransferIn16.TransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut18#TransferDetails
 * TransferOut18.TransferDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut3 TransferOut3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer4 Transfer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn1 TransferIn1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer7 Transfer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn4 TransferIn4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer17 Transfer17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn6 TransferIn6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer2 Transfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut1 TransferOut1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer10 Transfer10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut6 TransferOut6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer14 Transfer14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut8 TransferOut8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer24 Transfer24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut10 TransferOut10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal1Choice
 * Reversal1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer25 Transfer25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn8 TransferIn8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal2Choice
 * Reversal2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer3 Transfer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn2 TransferIn2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer6 Transfer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn3 TransferIn3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer16 Transfer16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn5 TransferIn5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer1 Transfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut2 TransferOut2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer9 Transfer9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut5 TransferOut5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer12 Transfer12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut7 TransferOut7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer20 Transfer20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut9 TransferOut9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer22 Transfer22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn7 TransferIn7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferReason1
 * TransferReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer18 Transfer18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26 Transfer26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer5 Transfer5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer15 Transfer15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer21 Transfer21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer13 Transfer13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer23 Transfer23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer8 Transfer8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer11 Transfer11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer19 Transfer19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
 * CorporateActionSecuritiesMovement2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1
 * CorporateActionSecuritiesMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4 TransferOut4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer27 Transfer27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal3Choice
 * Reversal3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer28 Transfer28}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal4Choice
 * Reversal4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer29 Transfer29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn10 TransferIn10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn9 TransferIn9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut11 TransferOut11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut12 TransferOut12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut13 TransferOut13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn11 TransferIn11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal6Choice
 * Reversal6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal5Choice
 * Reversal5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn13 TransferIn13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut14 TransferOut14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn12 TransferIn12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut15 TransferOut15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31 Transfer31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30 Transfer30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer32 Transfer32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal7Choice
 * Reversal7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal8Choice
 * Reversal8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer33 Transfer33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut17 TransferOut17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14 TransferIn14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn15 TransferIn15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut16 TransferOut16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn16 TransferIn16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut18 TransferOut18}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * </ul>
 */
public class SecuritiesTransfer extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of a transfer, as assigned by the
	 * instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer4#TransferReference
	 * Transfer4.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference2#TransferReference
	 * TransferReference2.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#TransferReference
	 * Transfer7.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer2#TransferReference
	 * Transfer2.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#TransferReference
	 * Transfer10.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer3#TransferReference
	 * Transfer3.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference1#TransferReference
	 * TransferReference1.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#TransferReference
	 * Transfer6.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#TransferReference
	 * Transfer1.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#TransferReference
	 * Transfer9.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#TransferReference
	 * Transfer18.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#TransferReference
	 * Transfer26.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#TransferReference
	 * Transfer5.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#TransferReference
	 * Transfer15.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#TransferReference
	 * Transfer21.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#TransferReference
	 * Transfer13.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#TransferReference
	 * Transfer23.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#TransferReference
	 * Transfer8.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#TransferReference
	 * Transfer11.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#TransferReference
	 * Transfer19.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#TransferReference
	 * MessageAndBusinessReference1.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#TransferReference
	 * MessageAndBusinessReference6.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#TransferReference
	 * CancellationStatusAndReason2.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#TransferReference
	 * TransferStatusAndReason.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#TransferReference
	 * TransferStatusAndReason2.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#TransferReference
	 * Transfer27.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#TransferReference
	 * Transfer28.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#TransferReference
	 * Transfer29.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#TransferReference
	 * MessageAndBusinessReference7.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#TransferReference
	 * TransferStatusAndReason3.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference5#TransferReference
	 * TransferReference5.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference6#TransferReference
	 * TransferReference6.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference8#TransferReference
	 * TransferReference8.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#TransferReference
	 * Transfer31.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#TransferReference
	 * Transfer30.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#TransferReference
	 * Transfer32.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#TransferReference
	 * CancellationStatusAndReason3.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#TransferReference
	 * MessageAndBusinessReference8.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#TransferReference
	 * Transfer33.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#TransferReference
	 * TransferStatusAndReason4.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#TransferReference
	 * TransferReference9.TransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#TransferReference
	 * TransferReference10.TransferReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a transfer, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer4.TransferReference, com.tools20022.repository.msg.TransferReference2.TransferReference, com.tools20022.repository.msg.Transfer7.TransferReference,
					com.tools20022.repository.msg.Transfer2.TransferReference, com.tools20022.repository.msg.Transfer10.TransferReference, com.tools20022.repository.msg.Transfer3.TransferReference,
					com.tools20022.repository.msg.TransferReference1.TransferReference, com.tools20022.repository.msg.Transfer6.TransferReference, com.tools20022.repository.msg.Transfer1.TransferReference,
					com.tools20022.repository.msg.Transfer9.TransferReference, com.tools20022.repository.msg.Transfer18.TransferReference, com.tools20022.repository.msg.Transfer26.TransferReference,
					com.tools20022.repository.msg.Transfer5.TransferReference, com.tools20022.repository.msg.Transfer15.TransferReference, com.tools20022.repository.msg.Transfer21.TransferReference,
					com.tools20022.repository.msg.Transfer13.TransferReference, com.tools20022.repository.msg.Transfer23.TransferReference, com.tools20022.repository.msg.Transfer8.TransferReference,
					com.tools20022.repository.msg.Transfer11.TransferReference, com.tools20022.repository.msg.Transfer19.TransferReference, com.tools20022.repository.msg.MessageAndBusinessReference1.TransferReference,
					com.tools20022.repository.msg.MessageAndBusinessReference6.TransferReference, com.tools20022.repository.msg.CancellationStatusAndReason2.TransferReference,
					com.tools20022.repository.msg.TransferStatusAndReason.TransferReference, com.tools20022.repository.msg.TransferStatusAndReason2.TransferReference, com.tools20022.repository.msg.Transfer27.TransferReference,
					com.tools20022.repository.msg.Transfer28.TransferReference, com.tools20022.repository.msg.Transfer29.TransferReference, com.tools20022.repository.msg.MessageAndBusinessReference7.TransferReference,
					com.tools20022.repository.msg.TransferStatusAndReason3.TransferReference, com.tools20022.repository.msg.TransferReference5.TransferReference, com.tools20022.repository.msg.TransferReference6.TransferReference,
					com.tools20022.repository.msg.TransferReference8.TransferReference, com.tools20022.repository.msg.Transfer31.TransferReference, com.tools20022.repository.msg.Transfer30.TransferReference,
					com.tools20022.repository.msg.Transfer32.TransferReference, com.tools20022.repository.msg.CancellationStatusAndReason3.TransferReference, com.tools20022.repository.msg.MessageAndBusinessReference8.TransferReference,
					com.tools20022.repository.msg.Transfer33.TransferReference, com.tools20022.repository.msg.TransferStatusAndReason4.TransferReference, com.tools20022.repository.msg.TransferReference9.TransferReference,
					com.tools20022.repository.msg.TransferReference10.TransferReference);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total quantity of securities settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTransfer
	 * SecuritiesQuantity.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut3#ProductTransfer
	 * TransferOut3.ProductTransfer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit2#TotalNumber
	 * Unit2.TotalNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#Assets
	 * PEPISATransfer2.Assets}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#TotalUnitsNumber
	 * Transfer4.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#UnitsDetails
	 * Transfer4.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#TotalUnitsNumber
	 * Transfer7.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#UnitsDetails
	 * Transfer7.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#TotalUnitsNumber
	 * Transfer17.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#UnitsDetails
	 * Transfer17.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#TotalUnitsNumber
	 * Transfer2.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#UnitsDetails
	 * Transfer2.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#TotalUnitsNumber
	 * Transfer10.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#UnitsDetails
	 * Transfer10.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#TotalUnitsNumber
	 * Transfer14.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#UnitsDetails
	 * Transfer14.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#TotalUnitsNumber
	 * Transfer24.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#UnitsDetails
	 * Transfer24.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#TotalUnitsNumber
	 * Transfer25.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer25#UnitsDetails
	 * Transfer25.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer3#TotalUnitsNumber
	 * Transfer3.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#TotalUnitsNumber
	 * Transfer6.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#TotalUnitsNumber
	 * Transfer16.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer1#TotalUnitsNumber
	 * Transfer1.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer1#UnitsDetails
	 * Transfer1.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#TotalUnitsNumber
	 * Transfer9.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#UnitsDetails
	 * Transfer9.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity13Choice#TotalUnitsNumber
	 * Quantity13Choice.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#Quantity
	 * Transfer12.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#UnitsDetails
	 * Transfer12.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#Quantity
	 * Transfer20.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#UnitsDetails
	 * Transfer20.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#TotalUnitsNumber
	 * Transfer22.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#TotalUnitsNumber
	 * Transfer18.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#UnitsDetails
	 * Transfer18.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#TotalUnitsNumber
	 * Transfer26.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#UnitsDetails
	 * Transfer26.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer5#TotalUnitsNumber
	 * Transfer5.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#TotalUnitsNumber
	 * Transfer15.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#TotalUnitsNumber
	 * Transfer21.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#TotalUnitsNumber
	 * Transfer13.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#UnitsDetails
	 * Transfer13.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#TotalUnitsNumber
	 * Transfer23.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#UnitsDetails
	 * Transfer23.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#TotalUnitsNumber
	 * Transfer8.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#UnitsDetails
	 * Transfer8.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#Quantity
	 * Transfer11.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#UnitsDetails
	 * Transfer11.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#Quantity
	 * Transfer19.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#UnitsDetails
	 * Transfer19.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#SettledQuantity
	 * IntraPositionDetails2.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#PreviouslySettledQuantity
	 * IntraPositionDetails2.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#SettledQuantity
	 * IntraPositionDetails8.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#PreviouslySettledQuantity
	 * IntraPositionDetails8.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#SettledQuantity
	 * IntraPositionDetails12.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#PreviouslySettledQuantity
	 * IntraPositionDetails12.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#SettledQuantity
	 * IntraPositionDetails13.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#PreviouslySettledQuantity
	 * IntraPositionDetails13.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#SettledQuantity
	 * IntraPositionDetails22.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#PreviouslySettledQuantity
	 * IntraPositionDetails22.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#SettledQuantity
	 * IntraPositionDetails26.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#PreviouslySettledQuantity
	 * IntraPositionDetails26.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#SettledQuantity
	 * IntraPositionDetails27.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#PreviouslySettledQuantity
	 * IntraPositionDetails27.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#SettledQuantity
	 * IntraPositionDetails29.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#PreviouslySettledQuantity
	 * IntraPositionDetails29.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#SettledQuantity
	 * IntraPositionMovementDetails1.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#PreviouslySettledQuantity
	 * IntraPositionMovementDetails1.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#SettledQuantity
	 * IntraPositionMovementDetails2.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#PreviouslySettledQuantity
	 * IntraPositionMovementDetails2.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#SettledQuantity
	 * IntraPositionMovementDetails5.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#PreviouslySettledQuantity
	 * IntraPositionMovementDetails5.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#SettledQuantity
	 * IntraPositionMovementDetails6.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#PreviouslySettledQuantity
	 * IntraPositionMovementDetails6.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#SettledQuantity
	 * IntraPositionMovementDetails7.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#PreviouslySettledQuantity
	 * IntraPositionMovementDetails7.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#SettledQuantity
	 * IntraPositionMovementDetails8.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#PreviouslySettledQuantity
	 * IntraPositionMovementDetails8.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#SettledQuantity
	 * IntraPositionMovementDetails9.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#PreviouslySettledQuantity
	 * IntraPositionMovementDetails9.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#SettledQuantity
	 * IntraPositionMovementDetails10.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#PreviouslySettledQuantity
	 * IntraPositionMovementDetails10.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#SecuritiesQuantity
	 * SecurityMovement1.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#SecuritiesQuantity
	 * FailedMovement1.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#SettlementQuantity
	 * IntraPositionDetails1.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#SettlementQuantity
	 * IntraPositionDetails11.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#SettledQuantity
	 * IntraPositionDetails4.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#SettledQuantity
	 * IntraPositionDetails9.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#QuantityDetails
	 * SecuritiesTradeDetails7.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#QuantityDetails
	 * SecuritiesTradeDetails19.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#SettlementQuantity
	 * IntraPositionDetails7.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#SettlementQuantity
	 * IntraPositionDetails16.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#SettlementQuantity
	 * IntraPositionDetails21.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#SettlementQuantity
	 * IntraPositionDetails25.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#SettledQuantity
	 * IntraPositionDetails5.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#SettledQuantity
	 * IntraPositionDetails15.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#SettlementQuantity
	 * IntraPositionDetails19.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#SettlementQuantity
	 * IntraPositionDetails23.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#QuantityDetails
	 * SecuritiesTradeDetails14.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#QuantityDetails
	 * SecuritiesTradeDetails20.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#QuantityDetails
	 * SecuritiesTradeDetails24.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#QuantityDetails
	 * SecuritiesTradeDetails30.QuantityDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#CoveredQuantity
	 * BuyIn3.CoveredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#Quantity
	 * SettlementObligation1.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#Quantity
	 * SettlementObligation6.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#Quantity
	 * SettlementObligation3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#Quantity
	 * SettlementObligation2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#Quantity
	 * SettlementObligation5.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#Quantity
	 * SettlementObligation4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#SettledQuantity
	 * IntraPositionMovementDetails3.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#PreviouslySettledQuantity
	 * IntraPositionMovementDetails3.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#SettledQuantity
	 * IntraPositionMovementDetails4.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#PreviouslySettledQuantity
	 * IntraPositionMovementDetails4.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut4#ProductTransfer
	 * TransferOut4.ProductTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#SettlementQuantity
	 * IntraPositionQueryCriteria1.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#SettledQuantity
	 * IntraPositionQueryCriteria1.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#SettlementQuantity
	 * IntraPosition4.SettlementQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#Quantity
	 * Transfer27.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#UnitsDetails
	 * Transfer27.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#TotalUnitsNumber
	 * Transfer28.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#UnitsDetails
	 * Transfer28.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#TotalUnitsNumber
	 * Transfer29.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#UnitsDetails
	 * Transfer29.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#Quantity
	 * SettlementObligation7.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#Quantity
	 * SettlementObligation8.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#SettlementQuantity
	 * IntraPositionDetails31.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#QuantityDetails
	 * SecuritiesTradeDetails48.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#SettlementQuantity
	 * IntraPositionDetails33.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#SettledQuantity
	 * IntraPositionDetails34.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#PreviouslySettledQuantity
	 * IntraPositionDetails34.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#SettledQuantity
	 * IntraPositionMovementDetails11.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#PreviouslySettledQuantity
	 * IntraPositionMovementDetails11.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#TotalUnitsNumber
	 * Transfer31.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#UnitsDetails
	 * Transfer31.UnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#Quantity
	 * Transfer30.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#UnitsDetails
	 * Transfer30.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#TotalUnitsNumber
	 * Transfer32.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#TotalUnitsNumber
	 * Transfer33.TotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#UnitsDetails
	 * Transfer33.UnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#QuantityDetails
	 * SecuritiesTradeDetails57.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#SettledQuantity
	 * IntraPositionDetails35.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#PreviouslySettledQuantity
	 * IntraPositionDetails35.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#SettlementQuantity
	 * IntraPositionDetails36.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#SettlementQuantity
	 * IntraPositionDetails38.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#SettledQuantity
	 * IntraPositionMovementDetails12.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#PreviouslySettledQuantity
	 * IntraPositionMovementDetails12.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#SettledQuantity
	 * IntraPositionDetails41.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#PreviouslySettledQuantity
	 * IntraPositionDetails41.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#SettlementQuantity
	 * IntraPositionDetails39.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#SettledQuantity
	 * IntraPositionMovementDetails13.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#PreviouslySettledQuantity
	 * IntraPositionMovementDetails13.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#SettledQuantity
	 * IntraPositionDetails43.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#PreviouslySettledQuantity
	 * IntraPositionDetails43.PreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#SettlementQuantity
	 * IntraPositionDetails42.SettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#SettledQuantity
	 * IntraPositionMovementDetails14.SettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#PreviouslySettledQuantity
	 * IntraPositionMovementDetails14.PreviouslySettledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferredQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferOut3.ProductTransfer, com.tools20022.repository.msg.Unit2.TotalNumber, com.tools20022.repository.msg.PEPISATransfer2.Assets,
					com.tools20022.repository.msg.Transfer4.TotalUnitsNumber, com.tools20022.repository.msg.Transfer4.UnitsDetails, com.tools20022.repository.msg.Transfer7.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer7.UnitsDetails, com.tools20022.repository.msg.Transfer17.TotalUnitsNumber, com.tools20022.repository.msg.Transfer17.UnitsDetails,
					com.tools20022.repository.msg.Transfer2.TotalUnitsNumber, com.tools20022.repository.msg.Transfer2.UnitsDetails, com.tools20022.repository.msg.Transfer10.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer10.UnitsDetails, com.tools20022.repository.msg.Transfer14.TotalUnitsNumber, com.tools20022.repository.msg.Transfer14.UnitsDetails,
					com.tools20022.repository.msg.Transfer24.TotalUnitsNumber, com.tools20022.repository.msg.Transfer24.UnitsDetails, com.tools20022.repository.msg.Transfer25.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer25.UnitsDetails, com.tools20022.repository.msg.Transfer3.TotalUnitsNumber, com.tools20022.repository.msg.Transfer6.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer16.TotalUnitsNumber, com.tools20022.repository.msg.Transfer1.TotalUnitsNumber, com.tools20022.repository.msg.Transfer1.UnitsDetails,
					com.tools20022.repository.msg.Transfer9.TotalUnitsNumber, com.tools20022.repository.msg.Transfer9.UnitsDetails, com.tools20022.repository.choice.Quantity13Choice.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer12.Quantity, com.tools20022.repository.msg.Transfer12.UnitsDetails, com.tools20022.repository.msg.Transfer20.Quantity, com.tools20022.repository.msg.Transfer20.UnitsDetails,
					com.tools20022.repository.msg.Transfer22.TotalUnitsNumber, com.tools20022.repository.msg.Transfer18.TotalUnitsNumber, com.tools20022.repository.msg.Transfer18.UnitsDetails,
					com.tools20022.repository.msg.Transfer26.TotalUnitsNumber, com.tools20022.repository.msg.Transfer26.UnitsDetails, com.tools20022.repository.msg.Transfer5.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer15.TotalUnitsNumber, com.tools20022.repository.msg.Transfer21.TotalUnitsNumber, com.tools20022.repository.msg.Transfer13.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer13.UnitsDetails, com.tools20022.repository.msg.Transfer23.TotalUnitsNumber, com.tools20022.repository.msg.Transfer23.UnitsDetails,
					com.tools20022.repository.msg.Transfer8.TotalUnitsNumber, com.tools20022.repository.msg.Transfer8.UnitsDetails, com.tools20022.repository.msg.Transfer11.Quantity, com.tools20022.repository.msg.Transfer11.UnitsDetails,
					com.tools20022.repository.msg.Transfer19.Quantity, com.tools20022.repository.msg.Transfer19.UnitsDetails, com.tools20022.repository.msg.IntraPositionDetails2.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails2.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails8.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails8.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails12.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails12.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails13.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails13.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails22.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails22.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails26.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails26.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails27.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails27.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails29.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails29.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails1.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails2.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails2.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails5.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails6.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails6.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails7.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails8.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails8.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails9.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails10.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails10.PreviouslySettledQuantity, com.tools20022.repository.msg.SecurityMovement1.SecuritiesQuantity,
					com.tools20022.repository.msg.FailedMovement1.SecuritiesQuantity, com.tools20022.repository.msg.IntraPositionDetails1.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails11.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionDetails4.SettledQuantity, com.tools20022.repository.msg.IntraPositionDetails9.SettledQuantity, com.tools20022.repository.msg.SecuritiesTradeDetails7.QuantityDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails19.QuantityDetails, com.tools20022.repository.msg.IntraPositionDetails7.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails16.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionDetails21.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails25.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails5.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails15.SettledQuantity, com.tools20022.repository.msg.IntraPositionDetails19.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails23.SettlementQuantity,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.QuantityDetails, com.tools20022.repository.msg.SecuritiesTradeDetails20.QuantityDetails, com.tools20022.repository.msg.SecuritiesTradeDetails24.QuantityDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.QuantityDetails, com.tools20022.repository.msg.BuyIn3.CoveredQuantity, com.tools20022.repository.msg.SettlementObligation1.Quantity,
					com.tools20022.repository.msg.SettlementObligation6.Quantity, com.tools20022.repository.msg.SettlementObligation3.Quantity, com.tools20022.repository.msg.SettlementObligation2.Quantity,
					com.tools20022.repository.msg.SettlementObligation5.Quantity, com.tools20022.repository.msg.SettlementObligation4.Quantity, com.tools20022.repository.msg.IntraPositionMovementDetails3.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails3.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails4.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails4.PreviouslySettledQuantity, com.tools20022.repository.msg.TransferOut4.ProductTransfer,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.SettlementQuantity, com.tools20022.repository.msg.IntraPositionQueryCriteria1.SettledQuantity, com.tools20022.repository.msg.IntraPosition4.SettlementQuantity,
					com.tools20022.repository.msg.Transfer27.Quantity, com.tools20022.repository.msg.Transfer27.UnitsDetails, com.tools20022.repository.msg.Transfer28.TotalUnitsNumber, com.tools20022.repository.msg.Transfer28.UnitsDetails,
					com.tools20022.repository.msg.Transfer29.TotalUnitsNumber, com.tools20022.repository.msg.Transfer29.UnitsDetails, com.tools20022.repository.msg.SettlementObligation7.Quantity,
					com.tools20022.repository.msg.SettlementObligation8.Quantity, com.tools20022.repository.msg.IntraPositionDetails31.SettlementQuantity, com.tools20022.repository.msg.SecuritiesTradeDetails48.QuantityDetails,
					com.tools20022.repository.msg.IntraPositionDetails33.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails34.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails34.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails11.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.PreviouslySettledQuantity, com.tools20022.repository.msg.Transfer31.TotalUnitsNumber, com.tools20022.repository.msg.Transfer31.UnitsDetails,
					com.tools20022.repository.msg.Transfer30.Quantity, com.tools20022.repository.msg.Transfer30.UnitsDetails, com.tools20022.repository.msg.Transfer32.TotalUnitsNumber,
					com.tools20022.repository.msg.Transfer33.TotalUnitsNumber, com.tools20022.repository.msg.Transfer33.UnitsDetails, com.tools20022.repository.msg.SecuritiesTradeDetails57.QuantityDetails,
					com.tools20022.repository.msg.IntraPositionDetails35.SettledQuantity, com.tools20022.repository.msg.IntraPositionDetails35.PreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails36.SettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails38.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails12.SettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails12.PreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails41.SettledQuantity, com.tools20022.repository.msg.IntraPositionDetails41.PreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails39.SettlementQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails13.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails13.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails43.SettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails43.PreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails42.SettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails14.SettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails14.PreviouslySettledQuantity);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredQuantity";
			definition = "Total quantity of securities settled.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account from/to which the securities are transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedTransfer
	 * SecuritiesAccount.RelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransferOut3#ClientAccount
	 * TransferOut3.ClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#AccountDetails
	 * CorporateActionSecuritiesMovement2.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#AccountDetails
	 * CorporateActionSecuritiesMovement1.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#SafekeepingAccount
	 * IntraPositionDetails4.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#SafekeepingAccount
	 * IntraPositionDetails9.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#SafekeepingAccount
	 * IntraPositionDetails5.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#SafekeepingAccount
	 * IntraPositionDetails15.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#SafekeepingAccount
	 * IntraPositionDetails19.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#SafekeepingAccount
	 * IntraPositionDetails23.SafekeepingAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#ClientAccount
	 * TransferOut4.ClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1#SafekeepingAccount
	 * IntraPositionMovements1.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#SafekeepingAccount
	 * IntraPositionQueryCriteria1.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#SafekeepingAccount
	 * IntraPositionModification2.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#SafekeepingAccount
	 * IntraPositionModification1.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#SafekeepingAccount
	 * IntraPositionCancellation1.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#SafekeepingAccount
	 * IntraPositionDetails31.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#SafekeepingAccount
	 * IntraPositionDetails38.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#SafekeepingAccount
	 * IntraPositionDetails39.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#SafekeepingAccount
	 * IntraPositionDetails42.SafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account from/to which the securities are transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferOut3.ClientAccount, com.tools20022.repository.msg.CorporateActionSecuritiesMovement2.AccountDetails,
					com.tools20022.repository.msg.CorporateActionSecuritiesMovement1.AccountDetails, com.tools20022.repository.msg.IntraPositionDetails4.SafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails9.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails5.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails15.SafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails19.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails23.SafekeepingAccount, com.tools20022.repository.msg.TransferOut4.ClientAccount,
					com.tools20022.repository.msg.IntraPositionMovements1.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionQueryCriteria1.SafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionModification2.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionModification1.SafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionCancellation1.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails31.SafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails38.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails39.SafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails42.SafekeepingAccount);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account from/to which the securities are transferred.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the financial instrument is transferred as an asset or
	 * as cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferTypeCode
	 * TransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument11#TransferType
	 * FinancialInstrument11.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument25#TransferType
	 * FinancialInstrument25.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument32#TransferType
	 * FinancialInstrument32.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#TransferType
	 * FinancialInstrument24.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#TransferType
	 * FinancialInstrument33.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#TransferType
	 * FinancialInstrument23.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#TransferType
	 * FinancialInstrument31.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#TransferType
	 * FinancialInstrument35.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#TransferType
	 * FinancialInstrument34.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#TransferType
	 * FinancialInstrument40.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#TransferType
	 * FinancialInstrument39.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#TransferType
	 * FinancialInstrument48.TransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#TransferType
	 * FinancialInstrument46.TransferType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument is transferred as an asset or as cash."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument11.TransferType, com.tools20022.repository.msg.FinancialInstrument25.TransferType,
					com.tools20022.repository.msg.FinancialInstrument32.TransferType, com.tools20022.repository.msg.FinancialInstrument24.TransferType, com.tools20022.repository.msg.FinancialInstrument33.TransferType,
					com.tools20022.repository.msg.FinancialInstrument23.TransferType, com.tools20022.repository.msg.FinancialInstrument31.TransferType, com.tools20022.repository.msg.FinancialInstrument35.TransferType,
					com.tools20022.repository.msg.FinancialInstrument34.TransferType, com.tools20022.repository.msg.FinancialInstrument40.TransferType, com.tools20022.repository.msg.FinancialInstrument39.TransferType,
					com.tools20022.repository.msg.FinancialInstrument48.TransferType, com.tools20022.repository.msg.FinancialInstrument46.TransferType);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransferTypeCode.mmObject();
		}
	};
	/**
	 * Settlement process which is the source of the transfer operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TransferOperation
	 * SecuritiesSettlement.TransferOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn1#SettlementDetails
	 * TransferIn1.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn4#SettlementDetails
	 * TransferIn4.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn6#SettlementDetails
	 * TransferIn6.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut1#SettlementDetails
	 * TransferOut1.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut6#SettlementDetails
	 * TransferOut6.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut8#SettlementDetails
	 * TransferOut8.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut10#SettlementDetails
	 * TransferOut10.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal1Choice#TransferOutConfirmationDetails
	 * Reversal1Choice.TransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn8#SettlementDetails
	 * TransferIn8.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal2Choice#TransferInConfirmationDetails
	 * Reversal2Choice.TransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn2#SettlementDetails
	 * TransferIn2.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn3#SettlementDetails
	 * TransferIn3.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn5#SettlementDetails
	 * TransferIn5.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut2#SettlementDetails
	 * TransferOut2.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut5#SettlementDetails
	 * TransferOut5.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut7#SettlementDetails
	 * TransferOut7.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut9#SettlementDetails
	 * TransferOut9.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn7#SettlementDetails
	 * TransferIn7.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#SettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder2.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#SettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder2.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#SettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#SettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#SettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution2.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#SettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#RequestDetails
	 * IntraPositionModification2.RequestDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal3Choice#TransferOutConfirmationDetails
	 * Reversal3Choice.TransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal4Choice#TransferInConfirmationDetails
	 * Reversal4Choice.TransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn10#SettlementDetails
	 * TransferIn10.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn9#SettlementDetails
	 * TransferIn9.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut11#SettlementDetails
	 * TransferOut11.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut12#SettlementDetails
	 * TransferOut12.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal6Choice#TransferInConfirmationDetails
	 * Reversal6Choice.TransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal5Choice#TransferOutConfirmationDetails
	 * Reversal5Choice.TransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn13#SettlementDetails
	 * TransferIn13.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut14#SettlementDetails
	 * TransferOut14.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn12#SettlementDetails
	 * TransferIn12.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut15#SettlementDetails
	 * TransferOut15.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal7Choice#TransferInConfirmationDetails
	 * Reversal7Choice.TransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal8Choice#TransferOutConfirmationDetails
	 * Reversal8Choice.TransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#SettlementDetails
	 * TransferOut17.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn14#SettlementDetails
	 * TransferIn14.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#SettlementDetails
	 * TransferIn15.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut16#SettlementDetails
	 * TransferOut16.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#SettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder6.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#SettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder6.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#SettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution4.SettlementAndCustodyDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement process which is the source of the transfer operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferIn1.SettlementDetails, com.tools20022.repository.msg.TransferIn4.SettlementDetails, com.tools20022.repository.msg.TransferIn6.SettlementDetails,
					com.tools20022.repository.msg.TransferOut1.SettlementDetails, com.tools20022.repository.msg.TransferOut6.SettlementDetails, com.tools20022.repository.msg.TransferOut8.SettlementDetails,
					com.tools20022.repository.msg.TransferOut10.SettlementDetails, com.tools20022.repository.choice.Reversal1Choice.TransferOutConfirmationDetails, com.tools20022.repository.msg.TransferIn8.SettlementDetails,
					com.tools20022.repository.choice.Reversal2Choice.TransferInConfirmationDetails, com.tools20022.repository.msg.TransferIn2.SettlementDetails, com.tools20022.repository.msg.TransferIn3.SettlementDetails,
					com.tools20022.repository.msg.TransferIn5.SettlementDetails, com.tools20022.repository.msg.TransferOut2.SettlementDetails, com.tools20022.repository.msg.TransferOut5.SettlementDetails,
					com.tools20022.repository.msg.TransferOut7.SettlementDetails, com.tools20022.repository.msg.TransferOut9.SettlementDetails, com.tools20022.repository.msg.TransferIn7.SettlementDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.SettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.SettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.SettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.IntraPositionModification2.RequestDetails, com.tools20022.repository.choice.Reversal3Choice.TransferOutConfirmationDetails,
					com.tools20022.repository.choice.Reversal4Choice.TransferInConfirmationDetails, com.tools20022.repository.msg.TransferIn10.SettlementDetails, com.tools20022.repository.msg.TransferIn9.SettlementDetails,
					com.tools20022.repository.msg.TransferOut11.SettlementDetails, com.tools20022.repository.msg.TransferOut12.SettlementDetails, com.tools20022.repository.choice.Reversal6Choice.TransferInConfirmationDetails,
					com.tools20022.repository.choice.Reversal5Choice.TransferOutConfirmationDetails, com.tools20022.repository.msg.TransferIn13.SettlementDetails, com.tools20022.repository.msg.TransferOut14.SettlementDetails,
					com.tools20022.repository.msg.TransferIn12.SettlementDetails, com.tools20022.repository.msg.TransferOut15.SettlementDetails, com.tools20022.repository.choice.Reversal7Choice.TransferInConfirmationDetails,
					com.tools20022.repository.choice.Reversal8Choice.TransferOutConfirmationDetails, com.tools20022.repository.msg.TransferOut17.SettlementDetails, com.tools20022.repository.msg.TransferIn14.SettlementDetails,
					com.tools20022.repository.msg.TransferIn15.SettlementDetails, com.tools20022.repository.msg.TransferOut16.SettlementDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder6.SettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.SettlementAndCustodyDetails);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlement";
			definition = "Settlement process which is the source of the transfer operation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer4#OwnAccountTransferIndicator
	 * Transfer4.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#OwnAccountTransferIndicator
	 * Transfer7.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#OwnAccountTransferIndicator
	 * Transfer17.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer2#OwnAccountTransferIndicator
	 * Transfer2.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#OwnAccountTransferIndicator
	 * Transfer10.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#OwnAccountTransferIndicator
	 * Transfer14.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#OwnAccountTransferIndicator
	 * Transfer24.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#OwnAccountTransferIndicator
	 * Transfer25.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer3#OwnAccountTransferIndicator
	 * Transfer3.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#OwnAccountTransferIndicator
	 * Transfer6.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#OwnAccountTransferIndicator
	 * Transfer16.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#OwnAccountTransferIndicator
	 * Transfer1.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#OwnAccountTransferIndicator
	 * Transfer9.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#OwnAccountTransferIndicator
	 * Transfer12.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#OwnAccountTransferIndicator
	 * Transfer20.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#OwnAccountTransferIndicator
	 * Transfer22.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#OwnAccountTransferIndicator
	 * Transfer18.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#OwnAccountTransferIndicator
	 * Transfer26.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#OwnAccountTransferIndicator
	 * Transfer5.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#OwnAccountTransferIndicator
	 * Transfer15.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#OwnAccountTransferIndicator
	 * Transfer21.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#OwnAccountTransferIndicator
	 * Transfer13.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#OwnAccountTransferIndicator
	 * Transfer23.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#OwnAccountTransferIndicator
	 * Transfer8.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#OwnAccountTransferIndicator
	 * Transfer11.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#OwnAccountTransferIndicator
	 * Transfer19.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#OwnAccountTransferIndicator
	 * Transfer27.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#OwnAccountTransferIndicator
	 * Transfer28.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#OwnAccountTransferIndicator
	 * Transfer29.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#OwnAccountTransferIndicator
	 * Transfer31.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#OwnAccountTransferIndicator
	 * Transfer30.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#OwnAccountTransferIndicator
	 * Transfer32.OwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#OwnAccountTransferIndicator
	 * Transfer33.OwnAccountTransferIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnAccountTransferIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer4.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer7.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer17.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer2.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer10.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer14.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer24.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer25.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer3.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer6.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer16.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer1.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer9.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer12.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer20.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer22.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer18.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer26.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer5.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer15.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer21.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer13.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer23.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer8.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer11.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer19.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer27.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer28.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer29.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer31.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer30.OwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer32.OwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer33.OwnAccountTransferIndicator);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to physical delivery of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#RelatedTransfer
	 * PhysicalDelivery.RelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#PhysicalTransferIndicator
	 * DeliverInformation2.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#PhysicalTransferDetails
	 * DeliverInformation2.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#PhysicalTransferIndicator
	 * DeliverInformation4.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#PhysicalTransferDetails
	 * DeliverInformation4.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#PhysicalTransferDetails
	 * DeliverInformation7.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#PhysicalTransferIndicator
	 * ReceiveInformation2.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#PhysicalTransferDetails
	 * ReceiveInformation2.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#PhysicalTransferIndicator
	 * ReceiveInformation4.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#PhysicalTransferDetails
	 * ReceiveInformation4.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#PhysicalTransferDetails
	 * ReceiveInformation8.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#PhysicalTransferDetails
	 * ReceiveInformation6.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#PhysicalTransferDetails
	 * ReceiveInformation11.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#PhysicalTransferDetails
	 * DeliverInformation11.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1#PhysicalTransferIndicator
	 * DeliverInformation1.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1#PhysicalTransferDetails
	 * DeliverInformation1.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#PhysicalTransferIndicator
	 * DeliverInformation3.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#PhysicalTransferDetails
	 * DeliverInformation3.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#PhysicalTransferDetails
	 * DeliverInformation8.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#PhysicalTransferIndicator
	 * ReceiveInformation1.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#PhysicalTransferDetails
	 * ReceiveInformation1.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#PhysicalTransferIndicator
	 * ReceiveInformation3.PhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#PhysicalTransferDetails
	 * ReceiveInformation3.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#PhysicalTransferDetails
	 * ReceiveInformation7.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#PhysicalTransferDetails
	 * ReceiveInformation5.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#PhysicalTransferDetails
	 * ReceiveInformation9.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#PhysicalTransferDetails
	 * DeliverInformation5.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#PhysicalTransferDetails
	 * DeliverInformation9.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#PhysicalTransferDetails
	 * DeliverInformation6.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#PhysicalDeliveryDetails
	 * RedemptionOrder3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#PhysicalDeliveryDetails
	 * RedemptionOrder5.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#PhysicalDeliveryDetails
	 * RedemptionExecution3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#PhysicalDeliveryDetails
	 * RedemptionExecution5.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#PhysicalDeliveryDetails
	 * RedemptionOrder7.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#PhysicalDeliveryDetails
	 * RedemptionOrder4.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#PhysicalDeliveryDetails
	 * RedemptionOrder6.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#PhysicalDeliveryDetails
	 * RedemptionExecution4.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#PhysicalDeliveryDetails
	 * RedemptionExecution6.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#PhysicalDeliveryDetails
	 * RedemptionOrder8.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#PhysicalDeliveryDetails
	 * SubscriptionExecution3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#PhysicalDeliveryDetails
	 * SubscriptionExecution5.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#PhysicalDeliveryDetails
	 * SubscriptionExecution4.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#PhysicalDeliveryDetails
	 * SubscriptionExecution6.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#PhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder2.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#PhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#PhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution2.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#PhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution2.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#PhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#PhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#PhysicalTransferDetails
	 * ReceiveInformation13.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#PhysicalTransferDetails
	 * ReceiveInformation12.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#PhysicalTransferDetails
	 * DeliverInformation12.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#PhysicalTransferDetails
	 * DeliverInformation13.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#PhysicalTransferDetails
	 * DeliverInformation15.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#PhysicalTransferDetails
	 * DeliverInformation14.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#PhysicalTransferDetails
	 * ReceiveInformation15.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#PhysicalTransferDetails
	 * ReceiveInformation14.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#PhysicalTransferDetails
	 * ReceiveInformation17.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#PhysicalTransferDetails
	 * ReceiveInformation16.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#PhysicalTransferDetails
	 * DeliverInformation16.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#PhysicalTransferDetails
	 * DeliverInformation17.PhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#PhysicalDeliveryDetails
	 * RedemptionOrder14.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#PhysicalDeliveryDetails
	 * SubscriptionExecution13.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#PhysicalDeliveryDetails
	 * SubscriptionExecution12.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#PhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder6.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#PhysicalDeliveryDetails
	 * RedemptionOrder15.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#PhysicalDeliveryDetails
	 * RedemptionExecution16.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#PhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution4.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#PhysicalDeliveryDetails
	 * RedemptionExecution15.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#PhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution4.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#DeliveryType
	 * DerivativeInstrument5.DeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#DeliveryType
	 * DerivativeInstrument6.DeliveryType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation2.PhysicalTransferIndicator, com.tools20022.repository.msg.DeliverInformation2.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation4.PhysicalTransferIndicator, com.tools20022.repository.msg.DeliverInformation4.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation7.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation2.PhysicalTransferIndicator,
					com.tools20022.repository.msg.ReceiveInformation2.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation4.PhysicalTransferIndicator,
					com.tools20022.repository.msg.ReceiveInformation4.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation8.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation6.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation11.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation11.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation1.PhysicalTransferIndicator,
					com.tools20022.repository.msg.DeliverInformation1.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation3.PhysicalTransferIndicator,
					com.tools20022.repository.msg.DeliverInformation3.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation8.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation1.PhysicalTransferIndicator, com.tools20022.repository.msg.ReceiveInformation1.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation3.PhysicalTransferIndicator, com.tools20022.repository.msg.ReceiveInformation3.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation7.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation5.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation9.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation5.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation9.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation6.PhysicalTransferDetails,
					com.tools20022.repository.msg.RedemptionOrder3.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder5.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution3.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionExecution5.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder7.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder4.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionOrder6.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution4.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionExecution6.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder8.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionExecution3.PhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionExecution5.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.PhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionExecution6.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.PhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.PhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.PhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.ReceiveInformation13.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation12.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation12.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation13.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation15.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation14.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation15.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation14.PhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation17.PhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation16.PhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation16.PhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation17.PhysicalTransferDetails,
					com.tools20022.repository.msg.RedemptionOrder14.PhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionExecution13.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionExecution12.PhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionOrder15.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution16.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.PhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution15.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.PhysicalDeliveryDetails, com.tools20022.repository.msg.DerivativeInstrument5.DeliveryType, com.tools20022.repository.msg.DerivativeInstrument6.DeliveryType);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Information related to physical delivery of the securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time after the settlement date specified in the trade, used for
	 * pool trades resulting from the original To Be Assigned (TBA) securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#LateDeliveryDate
	 * SecuritiesTradeDetails25.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#LateDeliveryDate
	 * SecuritiesTradeDetails26.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#LateDeliveryDate
	 * SecuritiesTradeDetails27.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#LateDeliveryDate
	 * SecuritiesTradeDetails28.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#LateDeliveryDate
	 * SecuritiesTradeDetails1.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#LateDeliveryDate
	 * SecuritiesTradeDetails15.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#LateDeliveryDate
	 * TransactionDetails5.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#LateDeliveryDate
	 * TransactionDetails9.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#LateDeliveryDate
	 * TransactionDetails22.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#LateDeliveryDate
	 * TransactionDetails23.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#LateDeliveryDate
	 * TransactionDetails36.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#LateDeliveryDate
	 * TransactionDetails47.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#LateDeliveryDate
	 * TransactionDetails53.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#LateDeliveryDate
	 * TransactionDetails58.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#LateDeliveryDate
	 * TransactionDetails7.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#LateDeliveryDate
	 * TransactionDetails8.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#LateDeliveryDate
	 * TransactionDetails16.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#LateDeliveryDate
	 * TransactionDetails17.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#LateDeliveryDate
	 * TransactionDetails26.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#LateDeliveryDate
	 * TransactionDetails25.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#LateDeliveryDate
	 * TransactionDetails27.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#LateDeliveryDate
	 * TransactionDetails33.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#LateDeliveryDate
	 * TransactionDetails39.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#LateDeliveryDate
	 * TransactionDetails50.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#LateDeliveryDate
	 * TransactionDetails56.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#LateDeliveryDate
	 * TransactionDetails59.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails2.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails8.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#LateDeliveryDate
	 * SecuritiesTradeDetails8.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#LateDeliveryDate
	 * SecuritiesTradeDetails4.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails6.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails10.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails17.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails18.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#LateDeliveryDate
	 * SecuritiesTradeDetails9.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#LateDeliveryDate
	 * SecuritiesTradeDetails10.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#LateDeliveryDate
	 * TransactionDetails61.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails21.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#LateDeliveryDate
	 * TransactionDetails62.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#LateDeliveryDate
	 * SecuritiesTradeDetails33.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#LateDeliveryDate
	 * SecuritiesTradeDetails34.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#LateDeliveryDate
	 * SecuritiesTradeDetails32.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#LateDeliveryDate
	 * SecuritiesTradeDetails44.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails22.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#LateDeliveryDate
	 * TransactionDetails66.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#LateDeliveryDate
	 * TransactionDetails67.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#LateDeliveryDate
	 * SecuritiesTradeDetails46.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#LateDeliveryDate
	 * SecuritiesTradeDetails47.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails24.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#LateDeliveryDate
	 * TransactionDetails70.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#LateDeliveryDate
	 * TransactionDetails69.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#LateDeliveryDate
	 * TransactionDetails71.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails25.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#LateDeliveryDate
	 * TransactionDetails72.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails26.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#LateDeliveryDate
	 * TransactionDetails79.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#LateDeliveryDate
	 * TransactionDetails75.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#LateDeliveryDate
	 * SecuritiesTradeDetails51.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#LateDeliveryDate
	 * SecuritiesTradeDetails52.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#LateDeliveryDate
	 * SecuritiesTradeDetails50.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails33.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#LateDeliveryDate
	 * SecuritiesTradeDetails63.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#LateDeliveryDate
	 * TransactionDetails87.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#LateDeliveryDate
	 * TransactionDetails90.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#LateDeliveryDate
	 * SecuritiesTradeDetails65.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#LateDeliveryDate
	 * SecuritiesTradeDetails66.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#LateDeliveryDate
	 * SecuritiesTradeDetails67.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#LateDeliveryDate
	 * TransactionDetails97.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails35.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#LateDeliveryDate
	 * TransactionDetails96.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#LateDeliveryDate
	 * SecuritiesTradeDetails70.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#LateDeliveryDate
	 * SecuritiesFinancingTransactionDetails36.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#LateDeliveryDate
	 * TransactionDetails100.LateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#LateDeliveryDate
	 * TransactionDetails99.LateDeliveryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LateDeliveryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails26.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails28.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails1.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails5.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails9.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails22.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails23.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails36.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails47.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails53.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails58.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails7.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails8.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails16.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails17.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails26.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails25.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails27.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails33.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails39.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails50.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails56.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails59.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails4.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails10.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails61.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails62.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails34.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails32.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails44.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails66.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails67.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails46.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails70.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails69.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails71.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails72.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails79.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails75.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails51.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails52.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails63.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails87.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails90.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails66.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails67.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails97.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails96.LateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails70.LateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.LateDeliveryDate, com.tools20022.repository.msg.TransactionDetails100.LateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails99.LateDeliveryDate);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Tax related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#SecuritiesTransfer
	 * Tax.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12#TransferTax
	 * OtherAmounts12.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14#TransferTax
	 * OtherAmounts14.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20#TransferTax
	 * OtherAmounts20.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#TransferTax
	 * OtherAmounts4.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#TransferTax
	 * OtherAmounts5.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#TransferTax
	 * OtherAmounts17.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#TransferTax
	 * OtherAmounts23.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3#TransferTax
	 * OtherAmounts3.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#TransferTax
	 * OtherAmounts7.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#TransferTax
	 * OtherAmounts9.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#TransferTax
	 * OtherAmounts10.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#TransferTax
	 * OtherAmounts18.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#TransferTax
	 * OtherAmounts24.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13#TransferTax
	 * OtherAmounts13.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1#TransferTax
	 * OtherAmounts1.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#TransferTax
	 * OtherAmounts16.TransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1#TaxDetails
	 * ProceedsMovement1.TaxDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#TransferTax
	 * OtherAmounts2.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts6#TransferTax
	 * OtherAmounts6.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts15#TransferTax
	 * OtherAmounts15.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts22#TransferTax
	 * OtherAmounts22.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#TransferTax
	 * OtherAmounts28.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#TransferTax
	 * OtherAmounts30.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#TransferTax
	 * OtherAmounts31.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#TransferTax
	 * OtherAmounts29.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35#TransferTax
	 * OtherAmounts35.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#TransferTax
	 * OtherAmounts34.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#TransferTax
	 * OtherAmounts38.TransferTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts33#TransferTax
	 * OtherAmounts33.TransferTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to the transfer of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.TransferTax, com.tools20022.repository.msg.OtherAmounts14.TransferTax, com.tools20022.repository.msg.OtherAmounts20.TransferTax,
					com.tools20022.repository.msg.OtherAmounts4.TransferTax, com.tools20022.repository.msg.OtherAmounts5.TransferTax, com.tools20022.repository.msg.OtherAmounts17.TransferTax,
					com.tools20022.repository.msg.OtherAmounts23.TransferTax, com.tools20022.repository.msg.OtherAmounts3.TransferTax, com.tools20022.repository.msg.OtherAmounts7.TransferTax,
					com.tools20022.repository.msg.OtherAmounts9.TransferTax, com.tools20022.repository.msg.OtherAmounts10.TransferTax, com.tools20022.repository.msg.OtherAmounts18.TransferTax,
					com.tools20022.repository.msg.OtherAmounts24.TransferTax, com.tools20022.repository.msg.OtherAmounts13.TransferTax, com.tools20022.repository.msg.OtherAmounts1.TransferTax,
					com.tools20022.repository.msg.OtherAmounts16.TransferTax, com.tools20022.repository.msg.ProceedsMovement1.TaxDetails, com.tools20022.repository.msg.OtherAmounts2.TransferTax,
					com.tools20022.repository.msg.OtherAmounts6.TransferTax, com.tools20022.repository.msg.OtherAmounts15.TransferTax, com.tools20022.repository.msg.OtherAmounts22.TransferTax,
					com.tools20022.repository.msg.OtherAmounts28.TransferTax, com.tools20022.repository.msg.OtherAmounts30.TransferTax, com.tools20022.repository.msg.OtherAmounts31.TransferTax,
					com.tools20022.repository.msg.OtherAmounts29.TransferTax, com.tools20022.repository.msg.OtherAmounts35.TransferTax, com.tools20022.repository.msg.OtherAmounts34.TransferTax,
					com.tools20022.repository.msg.OtherAmounts38.TransferTax, com.tools20022.repository.msg.OtherAmounts33.TransferTax);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax related to the transfer of a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the transfer reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferReasonCode
	 * TransferReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.TransferReason1#Code
	 * TransferReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferReason1#Proprietary
	 * TransferReason1.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#TransferReason
	 * Transfer18.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#TransferReason
	 * Transfer26.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer15#TransferReason
	 * Transfer15.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer21#TransferReason
	 * Transfer21.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#TransferReason
	 * Transfer13.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#TransferReason
	 * Transfer23.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#TransferReason
	 * Transfer11.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#TransferReason
	 * Transfer19.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#TransferReason
	 * Transfer27.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#TransferReason
	 * Transfer28.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#TransferReason
	 * Transfer29.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#TransferReason
	 * Transfer31.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#TransferReason
	 * Transfer30.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer32#TransferReason
	 * Transfer32.TransferReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#TransferReason
	 * Transfer33.TransferReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transfer reason."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TransferReason1.Code, com.tools20022.repository.choice.TransferReason1.Proprietary, com.tools20022.repository.msg.Transfer18.TransferReason,
					com.tools20022.repository.msg.Transfer26.TransferReason, com.tools20022.repository.msg.Transfer15.TransferReason, com.tools20022.repository.msg.Transfer21.TransferReason,
					com.tools20022.repository.msg.Transfer13.TransferReason, com.tools20022.repository.msg.Transfer23.TransferReason, com.tools20022.repository.msg.Transfer11.TransferReason,
					com.tools20022.repository.msg.Transfer19.TransferReason, com.tools20022.repository.msg.Transfer27.TransferReason, com.tools20022.repository.msg.Transfer28.TransferReason,
					com.tools20022.repository.msg.Transfer29.TransferReason, com.tools20022.repository.msg.Transfer31.TransferReason, com.tools20022.repository.msg.Transfer30.TransferReason,
					com.tools20022.repository.msg.Transfer32.TransferReason, com.tools20022.repository.msg.Transfer33.TransferReason);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransferReasonCode.mmObject();
		}
	};
	/**
	 * Information about partial settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlementCode
	 * PartialSettlementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#PartialSettlement
	 * AdditionalParameters3.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#PartialSettlement
	 * AdditionalParameters7.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#PartialSettlement
	 * AdditionalParameters8.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#PartialSettlement
	 * AdditionalParameters9.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#PartialSettlement
	 * AdditionalParameters10.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#PartialSettlement
	 * AdditionalParameters11.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#PartialSettlement
	 * AdditionalParameters2.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#PartialSettlement
	 * AdditionalParameters6.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#PartialSettlement
	 * AdditionalParameters12.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#PartialSettlement
	 * AdditionalParameters13.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18#PartialSettlement
	 * AdditionalParameters18.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19#PartialSettlement
	 * AdditionalParameters19.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#PartialSettlement
	 * AdditionalParameters17.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#PartialSettlement
	 * AdditionalParameters20.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#PartialSettlement
	 * AdditionalParameters4.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#PartialSettlement
	 * AdditionalParameters5.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#PartialSettlement
	 * AdditionalParameters14.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#PartialSettlement
	 * AdditionalParameters15.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#PartialSettlement
	 * AdditionalParameters16.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#PartialSettlement
	 * AdditionalParameters23.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#PartialSettlement
	 * AdditionalParameters24.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#PartialSettlement
	 * AdditionalParameters22.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#PartialSettlement
	 * AdditionalParameters21.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#PartialSettlement
	 * AdditionalParameters26.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#PartialSettlement
	 * AdditionalParameters25.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#PartialSettlement
	 * AdditionalParameters28.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#PartialSettlement
	 * AdditionalParameters27.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#PartialSettlement
	 * AdditionalParameters29.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#PartialSettlement
	 * AdditionalParameters30.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#PartialSettlement
	 * AdditionalParameters31.PartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#PartialSettlement
	 * AdditionalParameters32.PartialSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about partial settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters3.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters7.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters8.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters9.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters10.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters11.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters2.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters6.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters12.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters13.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters18.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters19.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters17.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters20.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters4.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters5.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters14.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters15.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters16.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters23.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters24.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters22.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters21.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters26.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters25.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters28.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters27.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters29.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters30.PartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters31.PartialSettlement, com.tools20022.repository.msg.AdditionalParameters32.PartialSettlement);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementType";
			definition = "Information about partial settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartialSettlementCode.mmObject();
		}
	};
	/**
	 * Obligation for one party to deliver securities to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTransfer
	 * SecuritiesDeliveryObligation.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for one party to deliver securities to another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation for one party to deliver securities to another party.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record in a securities account resulting from the transfer of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#TriggeringSecuritiesTransfer
	 * SecuritiesEntry.TriggeringSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Record in a securities account resulting from the transfer of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Record in a securities account resulting from the transfer of a security.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unambiguous identification of a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of a securities transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Security which is transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesTransfer
	 * Security.SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is transferred.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RelatedSecuritiesTransfer
	 * SecuritiesTradeStatus.RelatedSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#Status
	 * IntraPositionQueryCriteria1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#ProcessingStatus
	 * IntraPositionCancellation1.ProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionQueryCriteria1.Status, com.tools20022.repository.msg.IntraPositionCancellation1.ProcessingStatus);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of a securities transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTradeStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransfer";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer,
						com.tools20022.repository.entity.Tax.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation,
						com.tools20022.repository.entity.SecuritiesEntry.TriggeringSecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferIn1.TransferDetails, com.tools20022.repository.msg.TransferIn4.TransferDetails, com.tools20022.repository.msg.TransferIn6.TransferDetails,
						com.tools20022.repository.msg.TransferOut1.TransferDetails, com.tools20022.repository.msg.TransferOut6.TransferDetails, com.tools20022.repository.msg.TransferOut8.TransferDetails,
						com.tools20022.repository.msg.TransferOut10.TransferDetails, com.tools20022.repository.msg.TransferIn8.TransferDetails, com.tools20022.repository.msg.TransferIn2.TransferDetails,
						com.tools20022.repository.msg.TransferIn3.TransferDetails, com.tools20022.repository.msg.TransferIn5.TransferDetails, com.tools20022.repository.msg.TransferOut2.TransferDetails,
						com.tools20022.repository.msg.TransferOut5.TransferDetails, com.tools20022.repository.msg.TransferOut7.TransferDetails, com.tools20022.repository.msg.TransferOut9.TransferDetails,
						com.tools20022.repository.msg.TransferIn7.TransferDetails, com.tools20022.repository.msg.TransferIn10.TransferAndReferences, com.tools20022.repository.msg.TransferIn9.TransferDetails,
						com.tools20022.repository.msg.TransferOut11.TransferAndReferences, com.tools20022.repository.msg.TransferOut12.TransferDetails, com.tools20022.repository.msg.TransferOut13.TransferDetails,
						com.tools20022.repository.msg.TransferIn11.TransferDetails, com.tools20022.repository.msg.TransferIn13.TransferAndReferences, com.tools20022.repository.msg.TransferOut14.TransferDetails,
						com.tools20022.repository.msg.TransferIn12.TransferDetails, com.tools20022.repository.msg.TransferOut15.TransferAndReferences, com.tools20022.repository.msg.TransferOut17.TransferAndReferences,
						com.tools20022.repository.msg.TransferIn14.TransferDetails, com.tools20022.repository.msg.TransferIn15.TransferAndReferences, com.tools20022.repository.msg.TransferOut16.TransferDetails,
						com.tools20022.repository.msg.TransferIn16.TransferDetails, com.tools20022.repository.msg.TransferOut18.TransferDetails);
				subType_lazy = () -> Arrays.asList(IntraPositionTransfer.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.Identification, com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.Account, com.tools20022.repository.entity.SecuritiesTransfer.TransferType, com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.OwnAccountTransferIndicator, com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesTransfer.LateDeliveryDate, com.tools20022.repository.entity.SecuritiesTransfer.TransferTax, com.tools20022.repository.entity.SecuritiesTransfer.TransferReason,
						com.tools20022.repository.entity.SecuritiesTransfer.PartialSettlementType, com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTransfer.BookEntry, com.tools20022.repository.entity.SecuritiesTransfer.TransactionIdentification, com.tools20022.repository.entity.SecuritiesTransfer.Security,
						com.tools20022.repository.entity.SecuritiesTransfer.Status);
				derivationComponent_lazy = () -> Arrays.asList(TransferOut3.mmObject(), Transfer4.mmObject(), TransferIn1.mmObject(), Transfer7.mmObject(), TransferIn4.mmObject(), Transfer17.mmObject(), TransferIn6.mmObject(),
						Transfer2.mmObject(), TransferOut1.mmObject(), Transfer10.mmObject(), TransferOut6.mmObject(), Transfer14.mmObject(), TransferOut8.mmObject(), Transfer24.mmObject(), TransferOut10.mmObject(),
						Reversal1Choice.mmObject(), Transfer25.mmObject(), TransferIn8.mmObject(), Reversal2Choice.mmObject(), Transfer3.mmObject(), TransferIn2.mmObject(), Transfer6.mmObject(), TransferIn3.mmObject(),
						Transfer16.mmObject(), TransferIn5.mmObject(), Transfer1.mmObject(), TransferOut2.mmObject(), Transfer9.mmObject(), TransferOut5.mmObject(), Transfer12.mmObject(), TransferOut7.mmObject(), Transfer20.mmObject(),
						TransferOut9.mmObject(), Transfer22.mmObject(), TransferIn7.mmObject(), TransferReason1.mmObject(), Transfer18.mmObject(), Transfer26.mmObject(), Transfer5.mmObject(), Transfer15.mmObject(), Transfer21.mmObject(),
						Transfer13.mmObject(), Transfer23.mmObject(), Transfer8.mmObject(), Transfer11.mmObject(), Transfer19.mmObject(), CorporateActionSecuritiesMovement2.mmObject(), CorporateActionSecuritiesMovement1.mmObject(),
						TransferOut4.mmObject(), Transfer27.mmObject(), Reversal3Choice.mmObject(), Transfer28.mmObject(), Reversal4Choice.mmObject(), Transfer29.mmObject(), TransferIn10.mmObject(), TransferIn9.mmObject(),
						TransferOut11.mmObject(), TransferOut12.mmObject(), TransferOut13.mmObject(), TransferIn11.mmObject(), Reversal6Choice.mmObject(), Reversal5Choice.mmObject(), TransferIn13.mmObject(), TransferOut14.mmObject(),
						TransferIn12.mmObject(), TransferOut15.mmObject(), Transfer31.mmObject(), Transfer30.mmObject(), Transfer32.mmObject(), Reversal7Choice.mmObject(), Reversal8Choice.mmObject(), Transfer33.mmObject(),
						TransferOut17.mmObject(), TransferIn14.mmObject(), TransferIn15.mmObject(), TransferOut16.mmObject(), TransferIn16.mmObject(), TransferOut18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}