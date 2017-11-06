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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
 * SecuritiesTransfer.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
 * SecuritiesTransfer.mmTransferredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
 * SecuritiesTransfer.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferType
 * SecuritiesTransfer.mmTransferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
 * SecuritiesTransfer.mmRelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
 * SecuritiesTransfer.mmPhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmLateDeliveryDate
 * SecuritiesTransfer.mmLateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
 * SecuritiesTransfer.mmTransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferReason
 * SecuritiesTransfer.mmTransferReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPartialSettlementType
 * SecuritiesTransfer.mmPartialSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecuritiesDeliveryObligation
 * SecuritiesTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmBookEntry
 * SecuritiesTransfer.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransactionIdentification
 * SecuritiesTransfer.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecurity
 * SecuritiesTransfer.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
 * SecuritiesTransfer.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
 * Security.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
 * SecuritiesAccount.mmRelatedTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
 * Tax.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTransfer
 * SecuritiesQuantity.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
 * SecuritiesSettlement.mmTransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmTriggeringSecuritiesTransfer
 * SecuritiesEntry.mmTriggeringSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRelatedTransfer
 * PhysicalDelivery.mmRelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn1#mmTransferDetails
 * TransferIn1.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn4#mmTransferDetails
 * TransferIn4.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn6#mmTransferDetails
 * TransferIn6.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut1#mmTransferDetails
 * TransferOut1.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut6#mmTransferDetails
 * TransferOut6.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut8#mmTransferDetails
 * TransferOut8.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut10#mmTransferDetails
 * TransferOut10.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn8#mmTransferDetails
 * TransferIn8.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn2#mmTransferDetails
 * TransferIn2.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn3#mmTransferDetails
 * TransferIn3.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn5#mmTransferDetails
 * TransferIn5.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut2#mmTransferDetails
 * TransferOut2.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut5#mmTransferDetails
 * TransferOut5.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut7#mmTransferDetails
 * TransferOut7.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut9#mmTransferDetails
 * TransferOut9.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn7#mmTransferDetails
 * TransferIn7.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn10#mmTransferAndReferences
 * TransferIn10.mmTransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn9#mmTransferDetails
 * TransferIn9.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut11#mmTransferAndReferences
 * TransferOut11.mmTransferAndReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut12#mmTransferDetails
 * TransferOut12.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut13#mmTransferDetails
 * TransferOut13.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn11#mmTransferDetails
 * TransferIn11.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn13#mmTransferAndReferences
 * TransferIn13.mmTransferAndReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut14#mmTransferDetails
 * TransferOut14.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn12#mmTransferDetails
 * TransferIn12.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut15#mmTransferAndReferences
 * TransferOut15.mmTransferAndReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmTransferAndReferences
 * TransferOut17.mmTransferAndReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14#mmTransferDetails
 * TransferIn14.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmTransferAndReferences
 * TransferIn15.mmTransferAndReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut16#mmTransferDetails
 * TransferOut16.mmTransferDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn16#mmTransferDetails
 * TransferIn16.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferOut18#mmTransferDetails
 * TransferOut18.mmTransferDetails}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Max35Text identification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer4#mmTransferReference
	 * Transfer4.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference2#mmTransferReference
	 * TransferReference2.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmTransferReference
	 * Transfer7.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer2#mmTransferReference
	 * Transfer2.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmTransferReference
	 * Transfer10.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer3#mmTransferReference
	 * Transfer3.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference1#mmTransferReference
	 * TransferReference1.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmTransferReference
	 * Transfer6.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#mmTransferReference
	 * Transfer1.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmTransferReference
	 * Transfer9.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmTransferReference
	 * Transfer18.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTransferReference
	 * Transfer26.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmTransferReference
	 * Transfer5.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmTransferReference
	 * Transfer15.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmTransferReference
	 * Transfer21.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmTransferReference
	 * Transfer13.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmTransferReference
	 * Transfer23.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmTransferReference
	 * Transfer8.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmTransferReference
	 * Transfer11.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmTransferReference
	 * Transfer19.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#mmTransferReference
	 * MessageAndBusinessReference1.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmTransferReference
	 * MessageAndBusinessReference6.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmTransferReference
	 * CancellationStatusAndReason2.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmTransferReference
	 * TransferStatusAndReason.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmTransferReference
	 * TransferStatusAndReason2.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmTransferReference
	 * Transfer27.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferReference
	 * Transfer28.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferReference
	 * Transfer29.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#mmTransferReference
	 * MessageAndBusinessReference7.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmTransferReference
	 * TransferStatusAndReason3.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference5#mmTransferReference
	 * TransferReference5.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference6#mmTransferReference
	 * TransferReference6.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference8#mmTransferReference
	 * TransferReference8.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferReference
	 * Transfer31.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReference
	 * Transfer30.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmTransferReference
	 * Transfer32.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmTransferReference
	 * CancellationStatusAndReason3.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmTransferReference
	 * MessageAndBusinessReference8.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferReference
	 * Transfer33.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmTransferReference
	 * TransferStatusAndReason4.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#mmTransferReference
	 * TransferReference9.mmTransferReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmTransferReference
	 * TransferReference10.mmTransferReference}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer4.mmTransferReference, com.tools20022.repository.msg.TransferReference2.mmTransferReference,
					com.tools20022.repository.msg.Transfer7.mmTransferReference, com.tools20022.repository.msg.Transfer2.mmTransferReference, com.tools20022.repository.msg.Transfer10.mmTransferReference,
					com.tools20022.repository.msg.Transfer3.mmTransferReference, com.tools20022.repository.msg.TransferReference1.mmTransferReference, com.tools20022.repository.msg.Transfer6.mmTransferReference,
					com.tools20022.repository.msg.Transfer1.mmTransferReference, com.tools20022.repository.msg.Transfer9.mmTransferReference, com.tools20022.repository.msg.Transfer18.mmTransferReference,
					com.tools20022.repository.msg.Transfer26.mmTransferReference, com.tools20022.repository.msg.Transfer5.mmTransferReference, com.tools20022.repository.msg.Transfer15.mmTransferReference,
					com.tools20022.repository.msg.Transfer21.mmTransferReference, com.tools20022.repository.msg.Transfer13.mmTransferReference, com.tools20022.repository.msg.Transfer23.mmTransferReference,
					com.tools20022.repository.msg.Transfer8.mmTransferReference, com.tools20022.repository.msg.Transfer11.mmTransferReference, com.tools20022.repository.msg.Transfer19.mmTransferReference,
					com.tools20022.repository.msg.MessageAndBusinessReference1.mmTransferReference, com.tools20022.repository.msg.MessageAndBusinessReference6.mmTransferReference,
					com.tools20022.repository.msg.CancellationStatusAndReason2.mmTransferReference, com.tools20022.repository.msg.TransferStatusAndReason.mmTransferReference,
					com.tools20022.repository.msg.TransferStatusAndReason2.mmTransferReference, com.tools20022.repository.msg.Transfer27.mmTransferReference, com.tools20022.repository.msg.Transfer28.mmTransferReference,
					com.tools20022.repository.msg.Transfer29.mmTransferReference, com.tools20022.repository.msg.MessageAndBusinessReference7.mmTransferReference, com.tools20022.repository.msg.TransferStatusAndReason3.mmTransferReference,
					com.tools20022.repository.msg.TransferReference5.mmTransferReference, com.tools20022.repository.msg.TransferReference6.mmTransferReference, com.tools20022.repository.msg.TransferReference8.mmTransferReference,
					com.tools20022.repository.msg.Transfer31.mmTransferReference, com.tools20022.repository.msg.Transfer30.mmTransferReference, com.tools20022.repository.msg.Transfer32.mmTransferReference,
					com.tools20022.repository.msg.CancellationStatusAndReason3.mmTransferReference, com.tools20022.repository.msg.MessageAndBusinessReference8.mmTransferReference,
					com.tools20022.repository.msg.Transfer33.mmTransferReference, com.tools20022.repository.msg.TransferStatusAndReason4.mmTransferReference, com.tools20022.repository.msg.TransferReference9.mmTransferReference,
					com.tools20022.repository.msg.TransferReference10.mmTransferReference);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SecuritiesQuantity transferredQuantity;
	/**
	 * Total quantity of securities settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTransfer
	 * SecuritiesQuantity.mmSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut3#mmProductTransfer
	 * TransferOut3.mmProductTransfer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit2#mmTotalNumber
	 * Unit2.mmTotalNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmAssets
	 * PEPISATransfer2.mmAssets}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer4#mmTotalUnitsNumber
	 * Transfer4.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#mmUnitsDetails
	 * Transfer4.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmTotalUnitsNumber
	 * Transfer7.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#mmUnitsDetails
	 * Transfer7.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#mmTotalUnitsNumber
	 * Transfer17.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmUnitsDetails
	 * Transfer17.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer2#mmTotalUnitsNumber
	 * Transfer2.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#mmUnitsDetails
	 * Transfer2.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmTotalUnitsNumber
	 * Transfer10.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#mmUnitsDetails
	 * Transfer10.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#mmTotalUnitsNumber
	 * Transfer14.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#mmUnitsDetails
	 * Transfer14.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmTotalUnitsNumber
	 * Transfer24.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#mmUnitsDetails
	 * Transfer24.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmTotalUnitsNumber
	 * Transfer25.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer25#mmUnitsDetails
	 * Transfer25.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer3#mmTotalUnitsNumber
	 * Transfer3.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmTotalUnitsNumber
	 * Transfer6.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#mmTotalUnitsNumber
	 * Transfer16.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#mmTotalUnitsNumber
	 * Transfer1.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer1#mmUnitsDetails
	 * Transfer1.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmTotalUnitsNumber
	 * Transfer9.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#mmUnitsDetails
	 * Transfer9.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity13Choice#mmTotalUnitsNumber
	 * Quantity13Choice.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#mmQuantity
	 * Transfer12.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#mmUnitsDetails
	 * Transfer12.mmUnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#mmQuantity
	 * Transfer20.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#mmUnitsDetails
	 * Transfer20.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#mmTotalUnitsNumber
	 * Transfer22.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmTotalUnitsNumber
	 * Transfer18.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#mmUnitsDetails
	 * Transfer18.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTotalUnitsNumber
	 * Transfer26.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmUnitsDetails
	 * Transfer26.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmTotalUnitsNumber
	 * Transfer5.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmTotalUnitsNumber
	 * Transfer15.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmTotalUnitsNumber
	 * Transfer21.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmTotalUnitsNumber
	 * Transfer13.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#mmUnitsDetails
	 * Transfer13.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmTotalUnitsNumber
	 * Transfer23.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#mmUnitsDetails
	 * Transfer23.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmTotalUnitsNumber
	 * Transfer8.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#mmUnitsDetails
	 * Transfer8.mmUnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#mmQuantity
	 * Transfer11.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#mmUnitsDetails
	 * Transfer11.mmUnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#mmQuantity
	 * Transfer19.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#mmUnitsDetails
	 * Transfer19.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmSettledQuantity
	 * IntraPositionDetails2.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmPreviouslySettledQuantity
	 * IntraPositionDetails2.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmSettledQuantity
	 * IntraPositionDetails8.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmPreviouslySettledQuantity
	 * IntraPositionDetails8.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmSettledQuantity
	 * IntraPositionDetails12.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmPreviouslySettledQuantity
	 * IntraPositionDetails12.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmSettledQuantity
	 * IntraPositionDetails13.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmPreviouslySettledQuantity
	 * IntraPositionDetails13.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmSettledQuantity
	 * IntraPositionDetails22.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmPreviouslySettledQuantity
	 * IntraPositionDetails22.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmSettledQuantity
	 * IntraPositionDetails26.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmPreviouslySettledQuantity
	 * IntraPositionDetails26.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmSettledQuantity
	 * IntraPositionDetails27.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmPreviouslySettledQuantity
	 * IntraPositionDetails27.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmSettledQuantity
	 * IntraPositionDetails29.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmPreviouslySettledQuantity
	 * IntraPositionDetails29.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmSettledQuantity
	 * IntraPositionMovementDetails1.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails1.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmSettledQuantity
	 * IntraPositionMovementDetails2.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails2.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmSettledQuantity
	 * IntraPositionMovementDetails5.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails5.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmSettledQuantity
	 * IntraPositionMovementDetails6.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails6.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmSettledQuantity
	 * IntraPositionMovementDetails7.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails7.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmSettledQuantity
	 * IntraPositionMovementDetails8.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails8.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmSettledQuantity
	 * IntraPositionMovementDetails9.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails9.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmSettledQuantity
	 * IntraPositionMovementDetails10.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails10.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#mmSecuritiesQuantity
	 * SecurityMovement1.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmSecuritiesQuantity
	 * FailedMovement1.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#mmSettlementQuantity
	 * IntraPositionDetails1.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#mmSettlementQuantity
	 * IntraPositionDetails11.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#mmSettledQuantity
	 * IntraPositionDetails4.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#mmSettledQuantity
	 * IntraPositionDetails9.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmQuantityDetails
	 * SecuritiesTradeDetails7.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmQuantityDetails
	 * SecuritiesTradeDetails19.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#mmSettlementQuantity
	 * IntraPositionDetails7.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#mmSettlementQuantity
	 * IntraPositionDetails16.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#mmSettlementQuantity
	 * IntraPositionDetails21.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmSettlementQuantity
	 * IntraPositionDetails25.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmSettledQuantity
	 * IntraPositionDetails5.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#mmSettledQuantity
	 * IntraPositionDetails15.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#mmSettlementQuantity
	 * IntraPositionDetails19.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#mmSettlementQuantity
	 * IntraPositionDetails23.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmQuantityDetails
	 * SecuritiesTradeDetails14.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmQuantityDetails
	 * SecuritiesTradeDetails20.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmQuantityDetails
	 * SecuritiesTradeDetails24.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmQuantityDetails
	 * SecuritiesTradeDetails30.mmQuantityDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#mmCoveredQuantity
	 * BuyIn3.mmCoveredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmQuantity
	 * SettlementObligation1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmQuantity
	 * SettlementObligation6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmQuantity
	 * SettlementObligation3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#mmQuantity
	 * SettlementObligation2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmQuantity
	 * SettlementObligation5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmQuantity
	 * SettlementObligation4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmSettledQuantity
	 * IntraPositionMovementDetails3.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails3.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmSettledQuantity
	 * IntraPositionMovementDetails4.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails4.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut4#mmProductTransfer
	 * TransferOut4.mmProductTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSettlementQuantity
	 * IntraPositionQueryCriteria1.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSettledQuantity
	 * IntraPositionQueryCriteria1.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#mmSettlementQuantity
	 * IntraPosition4.mmSettlementQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#mmQuantity
	 * Transfer27.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#mmUnitsDetails
	 * Transfer27.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTotalUnitsNumber
	 * Transfer28.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#mmUnitsDetails
	 * Transfer28.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTotalUnitsNumber
	 * Transfer29.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#mmUnitsDetails
	 * Transfer29.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmQuantity
	 * SettlementObligation7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmQuantity
	 * SettlementObligation8.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#mmSettlementQuantity
	 * IntraPositionDetails31.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmQuantityDetails
	 * SecuritiesTradeDetails48.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmSettlementQuantity
	 * IntraPositionDetails33.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmSettledQuantity
	 * IntraPositionDetails34.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmPreviouslySettledQuantity
	 * IntraPositionDetails34.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmSettledQuantity
	 * IntraPositionMovementDetails11.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails11.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTotalUnitsNumber
	 * Transfer31.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmUnitsDetails
	 * Transfer31.mmUnitsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmQuantity
	 * Transfer30.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmUnitsDetails
	 * Transfer30.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmTotalUnitsNumber
	 * Transfer32.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTotalUnitsNumber
	 * Transfer33.mmTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#mmUnitsDetails
	 * Transfer33.mmUnitsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmQuantityDetails
	 * SecuritiesTradeDetails57.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmSettledQuantity
	 * IntraPositionDetails35.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmPreviouslySettledQuantity
	 * IntraPositionDetails35.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#mmSettlementQuantity
	 * IntraPositionDetails36.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#mmSettlementQuantity
	 * IntraPositionDetails38.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmSettledQuantity
	 * IntraPositionMovementDetails12.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails12.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettledQuantity
	 * IntraPositionDetails41.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmPreviouslySettledQuantity
	 * IntraPositionDetails41.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSettlementQuantity
	 * IntraPositionDetails39.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmSettledQuantity
	 * IntraPositionMovementDetails13.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails13.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmSettledQuantity
	 * IntraPositionDetails43.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmPreviouslySettledQuantity
	 * IntraPositionDetails43.mmPreviouslySettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmSettlementQuantity
	 * IntraPositionDetails42.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmSettledQuantity
	 * IntraPositionMovementDetails14.mmSettledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmPreviouslySettledQuantity
	 * IntraPositionMovementDetails14.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTransferredQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferOut3.mmProductTransfer, com.tools20022.repository.msg.Unit2.mmTotalNumber, com.tools20022.repository.msg.PEPISATransfer2.mmAssets,
					com.tools20022.repository.msg.Transfer4.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer4.mmUnitsDetails, com.tools20022.repository.msg.Transfer7.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer7.mmUnitsDetails, com.tools20022.repository.msg.Transfer17.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer17.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer2.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer2.mmUnitsDetails, com.tools20022.repository.msg.Transfer10.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer10.mmUnitsDetails, com.tools20022.repository.msg.Transfer14.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer14.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer24.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer24.mmUnitsDetails, com.tools20022.repository.msg.Transfer25.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer25.mmUnitsDetails, com.tools20022.repository.msg.Transfer3.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer6.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer16.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer1.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer1.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer9.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer9.mmUnitsDetails, com.tools20022.repository.choice.Quantity13Choice.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer12.mmQuantity, com.tools20022.repository.msg.Transfer12.mmUnitsDetails, com.tools20022.repository.msg.Transfer20.mmQuantity, com.tools20022.repository.msg.Transfer20.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer22.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer18.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer18.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer26.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer26.mmUnitsDetails, com.tools20022.repository.msg.Transfer5.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer15.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer21.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer13.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer13.mmUnitsDetails, com.tools20022.repository.msg.Transfer23.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer23.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer8.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer8.mmUnitsDetails, com.tools20022.repository.msg.Transfer11.mmQuantity,
					com.tools20022.repository.msg.Transfer11.mmUnitsDetails, com.tools20022.repository.msg.Transfer19.mmQuantity, com.tools20022.repository.msg.Transfer19.mmUnitsDetails,
					com.tools20022.repository.msg.IntraPositionDetails2.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails2.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails8.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails8.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails12.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails12.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails13.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails13.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails22.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails22.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails26.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails26.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails27.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails27.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails29.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails29.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails1.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails2.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails2.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails5.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails6.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails7.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails8.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails8.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails9.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails10.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails10.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.SecurityMovement1.mmSecuritiesQuantity, com.tools20022.repository.msg.FailedMovement1.mmSecuritiesQuantity, com.tools20022.repository.msg.IntraPositionDetails1.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionDetails11.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails4.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails9.mmSettledQuantity,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.mmQuantityDetails, com.tools20022.repository.msg.SecuritiesTradeDetails19.mmQuantityDetails,
					com.tools20022.repository.msg.IntraPositionDetails7.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails16.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionDetails21.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails25.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionDetails5.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails15.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails19.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionDetails23.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesTradeDetails14.mmQuantityDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.mmQuantityDetails, com.tools20022.repository.msg.SecuritiesTradeDetails24.mmQuantityDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.mmQuantityDetails, com.tools20022.repository.msg.BuyIn3.mmCoveredQuantity, com.tools20022.repository.msg.SettlementObligation1.mmQuantity,
					com.tools20022.repository.msg.SettlementObligation6.mmQuantity, com.tools20022.repository.msg.SettlementObligation3.mmQuantity, com.tools20022.repository.msg.SettlementObligation2.mmQuantity,
					com.tools20022.repository.msg.SettlementObligation5.mmQuantity, com.tools20022.repository.msg.SettlementObligation4.mmQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails3.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails3.mmPreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails4.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails4.mmPreviouslySettledQuantity, com.tools20022.repository.msg.TransferOut4.mmProductTransfer,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPosition4.mmSettlementQuantity, com.tools20022.repository.msg.Transfer27.mmQuantity, com.tools20022.repository.msg.Transfer27.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer28.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer28.mmUnitsDetails, com.tools20022.repository.msg.Transfer29.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer29.mmUnitsDetails, com.tools20022.repository.msg.SettlementObligation7.mmQuantity, com.tools20022.repository.msg.SettlementObligation8.mmQuantity,
					com.tools20022.repository.msg.IntraPositionDetails31.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmQuantityDetails,
					com.tools20022.repository.msg.IntraPositionDetails33.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails34.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails34.mmPreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails11.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.mmPreviouslySettledQuantity, com.tools20022.repository.msg.Transfer31.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer31.mmUnitsDetails,
					com.tools20022.repository.msg.Transfer30.mmQuantity, com.tools20022.repository.msg.Transfer30.mmUnitsDetails, com.tools20022.repository.msg.Transfer32.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Transfer33.mmTotalUnitsNumber, com.tools20022.repository.msg.Transfer33.mmUnitsDetails, com.tools20022.repository.msg.SecuritiesTradeDetails57.mmQuantityDetails,
					com.tools20022.repository.msg.IntraPositionDetails35.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails35.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails36.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionDetails38.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails12.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails12.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails41.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails41.mmPreviouslySettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails39.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails13.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails13.mmPreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails43.mmSettledQuantity,
					com.tools20022.repository.msg.IntraPositionDetails43.mmPreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionDetails42.mmSettlementQuantity,
					com.tools20022.repository.msg.IntraPositionMovementDetails14.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionMovementDetails14.mmPreviouslySettledQuantity);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredQuantity";
			definition = "Total quantity of securities settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> account;
	/**
	 * Specifies the account from/to which the securities are transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
	 * SecuritiesAccount.mmRelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut3#mmClientAccount
	 * TransferOut3.mmClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmAccountDetails
	 * CorporateActionSecuritiesMovement2.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#mmAccountDetails
	 * CorporateActionSecuritiesMovement1.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#mmSafekeepingAccount
	 * IntraPositionDetails4.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#mmSafekeepingAccount
	 * IntraPositionDetails9.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmSafekeepingAccount
	 * IntraPositionDetails5.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#mmSafekeepingAccount
	 * IntraPositionDetails15.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#mmSafekeepingAccount
	 * IntraPositionDetails19.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#mmSafekeepingAccount
	 * IntraPositionDetails23.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut4#mmClientAccount
	 * TransferOut4.mmClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1#mmSafekeepingAccount
	 * IntraPositionMovements1.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSafekeepingAccount
	 * IntraPositionQueryCriteria1.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#mmSafekeepingAccount
	 * IntraPositionModification2.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#mmSafekeepingAccount
	 * IntraPositionModification1.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#mmSafekeepingAccount
	 * IntraPositionCancellation1.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#mmSafekeepingAccount
	 * IntraPositionDetails31.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#mmSafekeepingAccount
	 * IntraPositionDetails38.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmSafekeepingAccount
	 * IntraPositionDetails39.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmSafekeepingAccount
	 * IntraPositionDetails42.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferOut3.mmClientAccount, com.tools20022.repository.msg.CorporateActionSecuritiesMovement2.mmAccountDetails,
					com.tools20022.repository.msg.CorporateActionSecuritiesMovement1.mmAccountDetails, com.tools20022.repository.msg.IntraPositionDetails4.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails9.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails5.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails15.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails19.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails23.mmSafekeepingAccount, com.tools20022.repository.msg.TransferOut4.mmClientAccount, com.tools20022.repository.msg.IntraPositionMovements1.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionModification2.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionModification1.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionCancellation1.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails31.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails38.mmSafekeepingAccount,
					com.tools20022.repository.msg.IntraPositionDetails39.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails42.mmSafekeepingAccount);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account from/to which the securities are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected TransferTypeCode transferType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument11#mmTransferType
	 * FinancialInstrument11.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument25#mmTransferType
	 * FinancialInstrument25.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument32#mmTransferType
	 * FinancialInstrument32.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#mmTransferType
	 * FinancialInstrument24.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmTransferType
	 * FinancialInstrument33.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#mmTransferType
	 * FinancialInstrument23.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#mmTransferType
	 * FinancialInstrument31.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmTransferType
	 * FinancialInstrument35.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmTransferType
	 * FinancialInstrument34.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmTransferType
	 * FinancialInstrument40.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTransferType
	 * FinancialInstrument39.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmTransferType
	 * FinancialInstrument48.mmTransferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransferType
	 * FinancialInstrument46.mmTransferType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransferType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument11.mmTransferType, com.tools20022.repository.msg.FinancialInstrument25.mmTransferType,
					com.tools20022.repository.msg.FinancialInstrument32.mmTransferType, com.tools20022.repository.msg.FinancialInstrument24.mmTransferType, com.tools20022.repository.msg.FinancialInstrument33.mmTransferType,
					com.tools20022.repository.msg.FinancialInstrument23.mmTransferType, com.tools20022.repository.msg.FinancialInstrument31.mmTransferType, com.tools20022.repository.msg.FinancialInstrument35.mmTransferType,
					com.tools20022.repository.msg.FinancialInstrument34.mmTransferType, com.tools20022.repository.msg.FinancialInstrument40.mmTransferType, com.tools20022.repository.msg.FinancialInstrument39.mmTransferType,
					com.tools20022.repository.msg.FinancialInstrument48.mmTransferType, com.tools20022.repository.msg.FinancialInstrument46.mmTransferType);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferType";
			definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferTypeCode.mmObject();
		}
	};
	protected SecuritiesSettlement relatedSettlement;
	/**
	 * Settlement process which is the source of the transfer operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
	 * SecuritiesSettlement.mmTransferOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn1#mmSettlementDetails
	 * TransferIn1.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn4#mmSettlementDetails
	 * TransferIn4.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn6#mmSettlementDetails
	 * TransferIn6.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut1#mmSettlementDetails
	 * TransferOut1.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut6#mmSettlementDetails
	 * TransferOut6.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut8#mmSettlementDetails
	 * TransferOut8.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut10#mmSettlementDetails
	 * TransferOut10.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal1Choice#mmTransferOutConfirmationDetails
	 * Reversal1Choice.mmTransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn8#mmSettlementDetails
	 * TransferIn8.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal2Choice#mmTransferInConfirmationDetails
	 * Reversal2Choice.mmTransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn2#mmSettlementDetails
	 * TransferIn2.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn3#mmSettlementDetails
	 * TransferIn3.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn5#mmSettlementDetails
	 * TransferIn5.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut2#mmSettlementDetails
	 * TransferOut2.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut5#mmSettlementDetails
	 * TransferOut5.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut7#mmSettlementDetails
	 * TransferOut7.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut9#mmSettlementDetails
	 * TransferOut9.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn7#mmSettlementDetails
	 * TransferIn7.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder2.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder2.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution2.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#mmRequestDetails
	 * IntraPositionModification2.mmRequestDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal3Choice#mmTransferOutConfirmationDetails
	 * Reversal3Choice.mmTransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal4Choice#mmTransferInConfirmationDetails
	 * Reversal4Choice.mmTransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn10#mmSettlementDetails
	 * TransferIn10.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn9#mmSettlementDetails
	 * TransferIn9.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut11#mmSettlementDetails
	 * TransferOut11.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut12#mmSettlementDetails
	 * TransferOut12.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal6Choice#mmTransferInConfirmationDetails
	 * Reversal6Choice.mmTransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal5Choice#mmTransferOutConfirmationDetails
	 * Reversal5Choice.mmTransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn13#mmSettlementDetails
	 * TransferIn13.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut14#mmSettlementDetails
	 * TransferOut14.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn12#mmSettlementDetails
	 * TransferIn12.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut15#mmSettlementDetails
	 * TransferOut15.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal7Choice#mmTransferInConfirmationDetails
	 * Reversal7Choice.mmTransferInConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal8Choice#mmTransferOutConfirmationDetails
	 * Reversal8Choice.mmTransferOutConfirmationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmSettlementDetails
	 * TransferOut17.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn14#mmSettlementDetails
	 * TransferIn14.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmSettlementDetails
	 * TransferIn15.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut16#mmSettlementDetails
	 * TransferOut16.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegExecution4.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmRelatedSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferIn1.mmSettlementDetails, com.tools20022.repository.msg.TransferIn4.mmSettlementDetails, com.tools20022.repository.msg.TransferIn6.mmSettlementDetails,
					com.tools20022.repository.msg.TransferOut1.mmSettlementDetails, com.tools20022.repository.msg.TransferOut6.mmSettlementDetails, com.tools20022.repository.msg.TransferOut8.mmSettlementDetails,
					com.tools20022.repository.msg.TransferOut10.mmSettlementDetails, com.tools20022.repository.choice.Reversal1Choice.mmTransferOutConfirmationDetails, com.tools20022.repository.msg.TransferIn8.mmSettlementDetails,
					com.tools20022.repository.choice.Reversal2Choice.mmTransferInConfirmationDetails, com.tools20022.repository.msg.TransferIn2.mmSettlementDetails, com.tools20022.repository.msg.TransferIn3.mmSettlementDetails,
					com.tools20022.repository.msg.TransferIn5.mmSettlementDetails, com.tools20022.repository.msg.TransferOut2.mmSettlementDetails, com.tools20022.repository.msg.TransferOut5.mmSettlementDetails,
					com.tools20022.repository.msg.TransferOut7.mmSettlementDetails, com.tools20022.repository.msg.TransferOut9.mmSettlementDetails, com.tools20022.repository.msg.TransferIn7.mmSettlementDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.mmSettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmSettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.mmSettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmSettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmSettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmSettlementAndCustodyDetails,
					com.tools20022.repository.msg.IntraPositionModification2.mmRequestDetails, com.tools20022.repository.choice.Reversal3Choice.mmTransferOutConfirmationDetails,
					com.tools20022.repository.choice.Reversal4Choice.mmTransferInConfirmationDetails, com.tools20022.repository.msg.TransferIn10.mmSettlementDetails, com.tools20022.repository.msg.TransferIn9.mmSettlementDetails,
					com.tools20022.repository.msg.TransferOut11.mmSettlementDetails, com.tools20022.repository.msg.TransferOut12.mmSettlementDetails, com.tools20022.repository.choice.Reversal6Choice.mmTransferInConfirmationDetails,
					com.tools20022.repository.choice.Reversal5Choice.mmTransferOutConfirmationDetails, com.tools20022.repository.msg.TransferIn13.mmSettlementDetails, com.tools20022.repository.msg.TransferOut14.mmSettlementDetails,
					com.tools20022.repository.msg.TransferIn12.mmSettlementDetails, com.tools20022.repository.msg.TransferOut15.mmSettlementDetails, com.tools20022.repository.choice.Reversal7Choice.mmTransferInConfirmationDetails,
					com.tools20022.repository.choice.Reversal8Choice.mmTransferOutConfirmationDetails, com.tools20022.repository.msg.TransferOut17.mmSettlementDetails, com.tools20022.repository.msg.TransferIn14.mmSettlementDetails,
					com.tools20022.repository.msg.TransferIn15.mmSettlementDetails, com.tools20022.repository.msg.TransferOut16.mmSettlementDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmSettlementAndCustodyDetails);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlement";
			definition = "Settlement process which is the source of the transfer operation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected YesNoIndicator ownAccountTransferIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer4#mmOwnAccountTransferIndicator
	 * Transfer4.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmOwnAccountTransferIndicator
	 * Transfer7.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#mmOwnAccountTransferIndicator
	 * Transfer17.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer2#mmOwnAccountTransferIndicator
	 * Transfer2.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmOwnAccountTransferIndicator
	 * Transfer10.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#mmOwnAccountTransferIndicator
	 * Transfer14.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmOwnAccountTransferIndicator
	 * Transfer24.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmOwnAccountTransferIndicator
	 * Transfer25.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer3#mmOwnAccountTransferIndicator
	 * Transfer3.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmOwnAccountTransferIndicator
	 * Transfer6.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#mmOwnAccountTransferIndicator
	 * Transfer16.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#mmOwnAccountTransferIndicator
	 * Transfer1.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmOwnAccountTransferIndicator
	 * Transfer9.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#mmOwnAccountTransferIndicator
	 * Transfer12.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#mmOwnAccountTransferIndicator
	 * Transfer20.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#mmOwnAccountTransferIndicator
	 * Transfer22.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmOwnAccountTransferIndicator
	 * Transfer18.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmOwnAccountTransferIndicator
	 * Transfer26.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmOwnAccountTransferIndicator
	 * Transfer5.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmOwnAccountTransferIndicator
	 * Transfer15.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmOwnAccountTransferIndicator
	 * Transfer21.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmOwnAccountTransferIndicator
	 * Transfer13.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmOwnAccountTransferIndicator
	 * Transfer23.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmOwnAccountTransferIndicator
	 * Transfer8.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmOwnAccountTransferIndicator
	 * Transfer11.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmOwnAccountTransferIndicator
	 * Transfer19.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmOwnAccountTransferIndicator
	 * Transfer27.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmOwnAccountTransferIndicator
	 * Transfer28.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmOwnAccountTransferIndicator
	 * Transfer29.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmOwnAccountTransferIndicator
	 * Transfer31.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmOwnAccountTransferIndicator
	 * Transfer30.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmOwnAccountTransferIndicator
	 * Transfer32.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmOwnAccountTransferIndicator
	 * Transfer33.mmOwnAccountTransferIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOwnAccountTransferIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer4.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer7.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer17.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer2.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer10.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer14.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer24.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer25.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer3.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer6.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer16.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer1.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer9.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer12.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer20.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer22.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer18.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer26.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer5.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer15.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer21.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer13.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer23.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer8.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer11.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer19.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer27.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer28.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer29.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer31.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer30.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer32.mmOwnAccountTransferIndicator,
					com.tools20022.repository.msg.Transfer33.mmOwnAccountTransferIndicator);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PhysicalDelivery physicalDelivery;
	/**
	 * Information related to physical delivery of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRelatedTransfer
	 * PhysicalDelivery.mmRelatedTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#mmPhysicalTransferIndicator
	 * DeliverInformation2.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#mmPhysicalTransferDetails
	 * DeliverInformation2.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmPhysicalTransferIndicator
	 * DeliverInformation4.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmPhysicalTransferDetails
	 * DeliverInformation4.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmPhysicalTransferDetails
	 * DeliverInformation7.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#mmPhysicalTransferIndicator
	 * ReceiveInformation2.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#mmPhysicalTransferDetails
	 * ReceiveInformation2.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmPhysicalTransferIndicator
	 * ReceiveInformation4.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmPhysicalTransferDetails
	 * ReceiveInformation4.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmPhysicalTransferDetails
	 * ReceiveInformation8.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmPhysicalTransferDetails
	 * ReceiveInformation6.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmPhysicalTransferDetails
	 * ReceiveInformation11.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmPhysicalTransferDetails
	 * DeliverInformation11.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1#mmPhysicalTransferIndicator
	 * DeliverInformation1.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1#mmPhysicalTransferDetails
	 * DeliverInformation1.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmPhysicalTransferIndicator
	 * DeliverInformation3.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmPhysicalTransferDetails
	 * DeliverInformation3.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmPhysicalTransferDetails
	 * DeliverInformation8.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#mmPhysicalTransferIndicator
	 * ReceiveInformation1.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#mmPhysicalTransferDetails
	 * ReceiveInformation1.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmPhysicalTransferIndicator
	 * ReceiveInformation3.mmPhysicalTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmPhysicalTransferDetails
	 * ReceiveInformation3.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmPhysicalTransferDetails
	 * ReceiveInformation7.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmPhysicalTransferDetails
	 * ReceiveInformation5.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmPhysicalTransferDetails
	 * ReceiveInformation9.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmPhysicalTransferDetails
	 * DeliverInformation5.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmPhysicalTransferDetails
	 * DeliverInformation9.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmPhysicalTransferDetails
	 * DeliverInformation6.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmPhysicalDeliveryDetails
	 * RedemptionOrder3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmPhysicalDeliveryDetails
	 * RedemptionOrder5.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmPhysicalDeliveryDetails
	 * RedemptionExecution3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPhysicalDeliveryDetails
	 * RedemptionExecution5.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmPhysicalDeliveryDetails
	 * RedemptionOrder7.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmPhysicalDeliveryDetails
	 * RedemptionOrder4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmPhysicalDeliveryDetails
	 * RedemptionOrder6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmPhysicalDeliveryDetails
	 * RedemptionExecution4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPhysicalDeliveryDetails
	 * RedemptionExecution6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmPhysicalDeliveryDetails
	 * RedemptionOrder8.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmPhysicalDeliveryDetails
	 * SubscriptionExecution3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPhysicalDeliveryDetails
	 * SubscriptionExecution5.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmPhysicalDeliveryDetails
	 * SubscriptionExecution4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPhysicalDeliveryDetails
	 * SubscriptionExecution6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder2.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution2.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution2.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmPhysicalTransferDetails
	 * ReceiveInformation13.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmPhysicalTransferDetails
	 * ReceiveInformation12.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmPhysicalTransferDetails
	 * DeliverInformation12.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmPhysicalTransferDetails
	 * DeliverInformation13.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmPhysicalTransferDetails
	 * DeliverInformation15.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmPhysicalTransferDetails
	 * DeliverInformation14.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmPhysicalTransferDetails
	 * ReceiveInformation15.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmPhysicalTransferDetails
	 * ReceiveInformation14.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmPhysicalTransferDetails
	 * ReceiveInformation17.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmPhysicalTransferDetails
	 * ReceiveInformation16.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmPhysicalTransferDetails
	 * DeliverInformation16.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmPhysicalTransferDetails
	 * DeliverInformation17.mmPhysicalTransferDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmPhysicalDeliveryDetails
	 * RedemptionOrder14.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPhysicalDeliveryDetails
	 * SubscriptionExecution13.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPhysicalDeliveryDetails
	 * SubscriptionExecution12.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmPhysicalDeliveryDetails
	 * RedemptionOrder15.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPhysicalDeliveryDetails
	 * RedemptionExecution16.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegExecution4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPhysicalDeliveryDetails
	 * RedemptionExecution15.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmPhysicalDeliveryDetails
	 * SwitchRedemptionLegExecution4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmDeliveryType
	 * DerivativeInstrument5.mmDeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmDeliveryType
	 * DerivativeInstrument6.mmDeliveryType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmPhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation2.mmPhysicalTransferIndicator, com.tools20022.repository.msg.DeliverInformation2.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation4.mmPhysicalTransferIndicator, com.tools20022.repository.msg.DeliverInformation4.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation7.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation2.mmPhysicalTransferIndicator,
					com.tools20022.repository.msg.ReceiveInformation2.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation4.mmPhysicalTransferIndicator,
					com.tools20022.repository.msg.ReceiveInformation4.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation8.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation6.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation11.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation11.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation1.mmPhysicalTransferIndicator,
					com.tools20022.repository.msg.DeliverInformation1.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation3.mmPhysicalTransferIndicator,
					com.tools20022.repository.msg.DeliverInformation3.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation8.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation1.mmPhysicalTransferIndicator, com.tools20022.repository.msg.ReceiveInformation1.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation3.mmPhysicalTransferIndicator, com.tools20022.repository.msg.ReceiveInformation3.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation7.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation5.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation9.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation5.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation9.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation6.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.RedemptionOrder3.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder5.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionExecution3.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution5.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionOrder7.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder4.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionOrder6.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution4.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionExecution6.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionOrder8.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionExecution3.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionExecution5.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionExecution6.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.ReceiveInformation13.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation12.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation12.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation13.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation15.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation14.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation15.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation14.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.ReceiveInformation17.mmPhysicalTransferDetails, com.tools20022.repository.msg.ReceiveInformation16.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.DeliverInformation16.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation17.mmPhysicalTransferDetails,
					com.tools20022.repository.msg.RedemptionOrder14.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionExecution12.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.RedemptionOrder15.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution16.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution15.mmPhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.DerivativeInstrument5.mmDeliveryType,
					com.tools20022.repository.msg.DerivativeInstrument6.mmDeliveryType);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Information related to physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmRelatedTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}
	};
	protected ISODateTime lateDeliveryDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmLateDeliveryDate
	 * SecuritiesTradeDetails25.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmLateDeliveryDate
	 * SecuritiesTradeDetails26.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmLateDeliveryDate
	 * SecuritiesTradeDetails27.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmLateDeliveryDate
	 * SecuritiesTradeDetails28.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmLateDeliveryDate
	 * SecuritiesTradeDetails1.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmLateDeliveryDate
	 * SecuritiesTradeDetails15.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmLateDeliveryDate
	 * TransactionDetails5.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmLateDeliveryDate
	 * TransactionDetails9.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmLateDeliveryDate
	 * TransactionDetails22.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmLateDeliveryDate
	 * TransactionDetails23.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmLateDeliveryDate
	 * TransactionDetails36.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmLateDeliveryDate
	 * TransactionDetails47.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmLateDeliveryDate
	 * TransactionDetails53.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmLateDeliveryDate
	 * TransactionDetails58.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmLateDeliveryDate
	 * TransactionDetails7.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmLateDeliveryDate
	 * TransactionDetails8.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmLateDeliveryDate
	 * TransactionDetails16.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmLateDeliveryDate
	 * TransactionDetails17.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmLateDeliveryDate
	 * TransactionDetails26.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmLateDeliveryDate
	 * TransactionDetails25.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmLateDeliveryDate
	 * TransactionDetails27.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmLateDeliveryDate
	 * TransactionDetails33.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmLateDeliveryDate
	 * TransactionDetails39.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmLateDeliveryDate
	 * TransactionDetails50.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmLateDeliveryDate
	 * TransactionDetails56.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmLateDeliveryDate
	 * TransactionDetails59.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails2.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails8.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmLateDeliveryDate
	 * SecuritiesTradeDetails8.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmLateDeliveryDate
	 * SecuritiesTradeDetails4.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails6.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails10.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails17.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails18.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmLateDeliveryDate
	 * SecuritiesTradeDetails9.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmLateDeliveryDate
	 * SecuritiesTradeDetails10.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmLateDeliveryDate
	 * TransactionDetails61.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails21.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmLateDeliveryDate
	 * TransactionDetails62.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmLateDeliveryDate
	 * SecuritiesTradeDetails33.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmLateDeliveryDate
	 * SecuritiesTradeDetails34.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmLateDeliveryDate
	 * SecuritiesTradeDetails32.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmLateDeliveryDate
	 * SecuritiesTradeDetails44.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails22.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmLateDeliveryDate
	 * TransactionDetails66.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmLateDeliveryDate
	 * TransactionDetails67.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmLateDeliveryDate
	 * SecuritiesTradeDetails46.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmLateDeliveryDate
	 * SecuritiesTradeDetails47.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails24.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmLateDeliveryDate
	 * TransactionDetails70.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmLateDeliveryDate
	 * TransactionDetails69.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmLateDeliveryDate
	 * TransactionDetails71.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails25.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmLateDeliveryDate
	 * TransactionDetails72.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails26.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmLateDeliveryDate
	 * TransactionDetails79.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmLateDeliveryDate
	 * TransactionDetails75.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmLateDeliveryDate
	 * SecuritiesTradeDetails51.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmLateDeliveryDate
	 * SecuritiesTradeDetails52.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmLateDeliveryDate
	 * SecuritiesTradeDetails50.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails33.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmLateDeliveryDate
	 * SecuritiesTradeDetails63.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmLateDeliveryDate
	 * TransactionDetails87.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmLateDeliveryDate
	 * TransactionDetails90.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmLateDeliveryDate
	 * SecuritiesTradeDetails65.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmLateDeliveryDate
	 * SecuritiesTradeDetails66.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmLateDeliveryDate
	 * SecuritiesTradeDetails67.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmLateDeliveryDate
	 * TransactionDetails97.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmLateDeliveryDate
	 * TransactionDetails96.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmLateDeliveryDate
	 * SecuritiesTradeDetails70.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails36.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmLateDeliveryDate
	 * TransactionDetails100.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmLateDeliveryDate
	 * TransactionDetails99.mmLateDeliveryDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmLateDeliveryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails26.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails28.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails15.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails5.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails9.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails22.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails23.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails36.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails47.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails53.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails58.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails7.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails8.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails16.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails17.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails26.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails25.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails27.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails33.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails39.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails50.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails56.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails59.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails8.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails9.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails61.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails62.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails34.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails44.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails66.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails67.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails46.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails70.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails69.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails71.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails72.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails79.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails75.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails51.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails50.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails87.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails90.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails65.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails67.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails97.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails96.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails70.mmLateDeliveryDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmLateDeliveryDate, com.tools20022.repository.msg.TransactionDetails100.mmLateDeliveryDate,
					com.tools20022.repository.msg.TransactionDetails99.mmLateDeliveryDate);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Tax transferTax;
	/**
	 * Tax related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
	 * Tax.mmSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmTransferTax
	 * OtherAmounts12.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmTransferTax
	 * OtherAmounts14.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmTransferTax
	 * OtherAmounts20.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmTransferTax
	 * OtherAmounts4.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmTransferTax
	 * OtherAmounts5.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmTransferTax
	 * OtherAmounts17.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmTransferTax
	 * OtherAmounts23.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmTransferTax
	 * OtherAmounts3.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmTransferTax
	 * OtherAmounts7.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmTransferTax
	 * OtherAmounts9.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmTransferTax
	 * OtherAmounts10.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmTransferTax
	 * OtherAmounts18.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmTransferTax
	 * OtherAmounts24.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmTransferTax
	 * OtherAmounts13.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmTransferTax
	 * OtherAmounts1.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmTransferTax
	 * OtherAmounts16.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1#mmTaxDetails
	 * ProceedsMovement1.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmTransferTax
	 * OtherAmounts2.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmTransferTax
	 * OtherAmounts6.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmTransferTax
	 * OtherAmounts15.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#mmTransferTax
	 * OtherAmounts22.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmTransferTax
	 * OtherAmounts28.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmTransferTax
	 * OtherAmounts30.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTransferTax
	 * OtherAmounts31.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmTransferTax
	 * OtherAmounts29.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmTransferTax
	 * OtherAmounts35.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmTransferTax
	 * OtherAmounts34.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmTransferTax
	 * OtherAmounts38.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#mmTransferTax
	 * OtherAmounts33.mmTransferTax}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTransferTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.mmTransferTax, com.tools20022.repository.msg.OtherAmounts14.mmTransferTax, com.tools20022.repository.msg.OtherAmounts20.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts4.mmTransferTax, com.tools20022.repository.msg.OtherAmounts5.mmTransferTax, com.tools20022.repository.msg.OtherAmounts17.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts23.mmTransferTax, com.tools20022.repository.msg.OtherAmounts3.mmTransferTax, com.tools20022.repository.msg.OtherAmounts7.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts9.mmTransferTax, com.tools20022.repository.msg.OtherAmounts10.mmTransferTax, com.tools20022.repository.msg.OtherAmounts18.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts24.mmTransferTax, com.tools20022.repository.msg.OtherAmounts13.mmTransferTax, com.tools20022.repository.msg.OtherAmounts1.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts16.mmTransferTax, com.tools20022.repository.msg.ProceedsMovement1.mmTaxDetails, com.tools20022.repository.msg.OtherAmounts2.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts6.mmTransferTax, com.tools20022.repository.msg.OtherAmounts15.mmTransferTax, com.tools20022.repository.msg.OtherAmounts22.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts28.mmTransferTax, com.tools20022.repository.msg.OtherAmounts30.mmTransferTax, com.tools20022.repository.msg.OtherAmounts31.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts29.mmTransferTax, com.tools20022.repository.msg.OtherAmounts35.mmTransferTax, com.tools20022.repository.msg.OtherAmounts34.mmTransferTax,
					com.tools20022.repository.msg.OtherAmounts38.mmTransferTax, com.tools20022.repository.msg.OtherAmounts33.mmTransferTax);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax related to the transfer of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected TransferReasonCode transferReason;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.TransferReason1#mmCode
	 * TransferReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferReason1#mmProprietary
	 * TransferReason1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmTransferReason
	 * Transfer18.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTransferReason
	 * Transfer26.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmTransferReason
	 * Transfer15.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmTransferReason
	 * Transfer21.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmTransferReason
	 * Transfer13.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmTransferReason
	 * Transfer23.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmTransferReason
	 * Transfer11.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmTransferReason
	 * Transfer19.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmTransferReason
	 * Transfer27.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferReason
	 * Transfer28.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferReason
	 * Transfer29.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferReason
	 * Transfer31.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReason
	 * Transfer30.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmTransferReason
	 * Transfer32.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferReason
	 * Transfer33.mmTransferReason}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransferReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TransferReason1.mmCode, com.tools20022.repository.choice.TransferReason1.mmProprietary, com.tools20022.repository.msg.Transfer18.mmTransferReason,
					com.tools20022.repository.msg.Transfer26.mmTransferReason, com.tools20022.repository.msg.Transfer15.mmTransferReason, com.tools20022.repository.msg.Transfer21.mmTransferReason,
					com.tools20022.repository.msg.Transfer13.mmTransferReason, com.tools20022.repository.msg.Transfer23.mmTransferReason, com.tools20022.repository.msg.Transfer11.mmTransferReason,
					com.tools20022.repository.msg.Transfer19.mmTransferReason, com.tools20022.repository.msg.Transfer27.mmTransferReason, com.tools20022.repository.msg.Transfer28.mmTransferReason,
					com.tools20022.repository.msg.Transfer29.mmTransferReason, com.tools20022.repository.msg.Transfer31.mmTransferReason, com.tools20022.repository.msg.Transfer30.mmTransferReason,
					com.tools20022.repository.msg.Transfer32.mmTransferReason, com.tools20022.repository.msg.Transfer33.mmTransferReason);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferReasonCode.mmObject();
		}
	};
	protected PartialSettlementCode partialSettlementType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmPartialSettlement
	 * AdditionalParameters3.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmPartialSettlement
	 * AdditionalParameters7.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmPartialSettlement
	 * AdditionalParameters8.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmPartialSettlement
	 * AdditionalParameters9.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmPartialSettlement
	 * AdditionalParameters10.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmPartialSettlement
	 * AdditionalParameters11.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#mmPartialSettlement
	 * AdditionalParameters2.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#mmPartialSettlement
	 * AdditionalParameters6.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#mmPartialSettlement
	 * AdditionalParameters12.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#mmPartialSettlement
	 * AdditionalParameters13.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18#mmPartialSettlement
	 * AdditionalParameters18.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters19#mmPartialSettlement
	 * AdditionalParameters19.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmPartialSettlement
	 * AdditionalParameters17.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmPartialSettlement
	 * AdditionalParameters20.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#mmPartialSettlement
	 * AdditionalParameters4.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#mmPartialSettlement
	 * AdditionalParameters5.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#mmPartialSettlement
	 * AdditionalParameters14.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#mmPartialSettlement
	 * AdditionalParameters15.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmPartialSettlement
	 * AdditionalParameters16.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#mmPartialSettlement
	 * AdditionalParameters23.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPartialSettlement
	 * AdditionalParameters24.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmPartialSettlement
	 * AdditionalParameters22.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPartialSettlement
	 * AdditionalParameters21.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#mmPartialSettlement
	 * AdditionalParameters26.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmPartialSettlement
	 * AdditionalParameters25.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#mmPartialSettlement
	 * AdditionalParameters28.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmPartialSettlement
	 * AdditionalParameters27.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPartialSettlement
	 * AdditionalParameters29.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmPartialSettlement
	 * AdditionalParameters30.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmPartialSettlement
	 * AdditionalParameters31.mmPartialSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#mmPartialSettlement
	 * AdditionalParameters32.mmPartialSettlement}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPartialSettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters3.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters7.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters8.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters9.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters10.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters11.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters2.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters6.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters12.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters13.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters18.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters19.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters17.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters20.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters4.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters5.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters14.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters15.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters16.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters23.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters24.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters22.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters21.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters26.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters25.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters28.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters27.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters29.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters30.mmPartialSettlement,
					com.tools20022.repository.msg.AdditionalParameters31.mmPartialSettlement, com.tools20022.repository.msg.AdditionalParameters32.mmPartialSettlement);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementType";
			definition = "Information about partial settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartialSettlementCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * Obligation for one party to deliver securities to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
	 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation for one party to deliver securities to another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> bookEntry;
	/**
	 * Record in a securities account resulting from the transfer of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmTriggeringSecuritiesTransfer
	 * SecuritiesEntry.mmTriggeringSecuritiesTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Record in a securities account resulting from the transfer of a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmTriggeringSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	protected Max35Text transactionIdentification;
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
	public static final MMBusinessAttribute mmTransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security which is transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTransfer
	 * Security.mmSecuritiesTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected SecuritiesTradeStatus status;
	/**
	 * Status of a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
	 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmStatus
	 * IntraPositionQueryCriteria1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#mmProcessingStatus
	 * IntraPositionCancellation1.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmStatus, com.tools20022.repository.msg.IntraPositionCancellation1.mmProcessingStatus);
			elementContext_lazy = () -> SecuritiesTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransfer";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer,
						com.tools20022.repository.entity.Tax.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation,
						com.tools20022.repository.entity.SecuritiesEntry.mmTriggeringSecuritiesTransfer, com.tools20022.repository.entity.PhysicalDelivery.mmRelatedTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTransfer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferIn1.mmTransferDetails, com.tools20022.repository.msg.TransferIn4.mmTransferDetails,
						com.tools20022.repository.msg.TransferIn6.mmTransferDetails, com.tools20022.repository.msg.TransferOut1.mmTransferDetails, com.tools20022.repository.msg.TransferOut6.mmTransferDetails,
						com.tools20022.repository.msg.TransferOut8.mmTransferDetails, com.tools20022.repository.msg.TransferOut10.mmTransferDetails, com.tools20022.repository.msg.TransferIn8.mmTransferDetails,
						com.tools20022.repository.msg.TransferIn2.mmTransferDetails, com.tools20022.repository.msg.TransferIn3.mmTransferDetails, com.tools20022.repository.msg.TransferIn5.mmTransferDetails,
						com.tools20022.repository.msg.TransferOut2.mmTransferDetails, com.tools20022.repository.msg.TransferOut5.mmTransferDetails, com.tools20022.repository.msg.TransferOut7.mmTransferDetails,
						com.tools20022.repository.msg.TransferOut9.mmTransferDetails, com.tools20022.repository.msg.TransferIn7.mmTransferDetails, com.tools20022.repository.msg.TransferIn10.mmTransferAndReferences,
						com.tools20022.repository.msg.TransferIn9.mmTransferDetails, com.tools20022.repository.msg.TransferOut11.mmTransferAndReferences, com.tools20022.repository.msg.TransferOut12.mmTransferDetails,
						com.tools20022.repository.msg.TransferOut13.mmTransferDetails, com.tools20022.repository.msg.TransferIn11.mmTransferDetails, com.tools20022.repository.msg.TransferIn13.mmTransferAndReferences,
						com.tools20022.repository.msg.TransferOut14.mmTransferDetails, com.tools20022.repository.msg.TransferIn12.mmTransferDetails, com.tools20022.repository.msg.TransferOut15.mmTransferAndReferences,
						com.tools20022.repository.msg.TransferOut17.mmTransferAndReferences, com.tools20022.repository.msg.TransferIn14.mmTransferDetails, com.tools20022.repository.msg.TransferIn15.mmTransferAndReferences,
						com.tools20022.repository.msg.TransferOut16.mmTransferDetails, com.tools20022.repository.msg.TransferIn16.mmTransferDetails, com.tools20022.repository.msg.TransferOut18.mmTransferDetails);
				subType_lazy = () -> Arrays.asList(IntraPositionTransfer.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.mmIdentification, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmAccount, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferType, com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmOwnAccountTransferIndicator, com.tools20022.repository.entity.SecuritiesTransfer.mmPhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesTransfer.mmLateDeliveryDate, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax, com.tools20022.repository.entity.SecuritiesTransfer.mmTransferReason,
						com.tools20022.repository.entity.SecuritiesTransfer.mmPartialSettlementType, com.tools20022.repository.entity.SecuritiesTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTransfer.mmBookEntry, com.tools20022.repository.entity.SecuritiesTransfer.mmTransactionIdentification, com.tools20022.repository.entity.SecuritiesTransfer.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmStatus);
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

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public SecuritiesQuantity getTransferredQuantity() {
		return transferredQuantity;
	}

	public void setTransferredQuantity(com.tools20022.repository.entity.SecuritiesQuantity transferredQuantity) {
		this.transferredQuantity = transferredQuantity;
	}

	public List<SecuritiesAccount> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.SecuritiesAccount> account) {
		this.account = account;
	}

	public TransferTypeCode getTransferType() {
		return transferType;
	}

	public void setTransferType(TransferTypeCode transferType) {
		this.transferType = transferType;
	}

	public SecuritiesSettlement getRelatedSettlement() {
		return relatedSettlement;
	}

	public void setRelatedSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedSettlement) {
		this.relatedSettlement = relatedSettlement;
	}

	public YesNoIndicator getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator;
	}

	public void setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return physicalDelivery;
	}

	public void setPhysicalDelivery(com.tools20022.repository.entity.PhysicalDelivery physicalDelivery) {
		this.physicalDelivery = physicalDelivery;
	}

	public ISODateTime getLateDeliveryDate() {
		return lateDeliveryDate;
	}

	public void setLateDeliveryDate(ISODateTime lateDeliveryDate) {
		this.lateDeliveryDate = lateDeliveryDate;
	}

	public Tax getTransferTax() {
		return transferTax;
	}

	public void setTransferTax(com.tools20022.repository.entity.Tax transferTax) {
		this.transferTax = transferTax;
	}

	public TransferReasonCode getTransferReason() {
		return transferReason;
	}

	public void setTransferReason(TransferReasonCode transferReason) {
		this.transferReason = transferReason;
	}

	public PartialSettlementCode getPartialSettlementType() {
		return partialSettlementType;
	}

	public void setPartialSettlementType(PartialSettlementCode partialSettlementType) {
		this.partialSettlementType = partialSettlementType;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = securitiesDeliveryObligation;
	}

	public List<SecuritiesEntry> getBookEntry() {
		return bookEntry;
	}

	public void setBookEntry(List<com.tools20022.repository.entity.SecuritiesEntry> bookEntry) {
		this.bookEntry = bookEntry;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public SecuritiesTradeStatus getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.SecuritiesTradeStatus status) {
		this.status = status;
	}
}