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
import com.tools20022.repository.codeset.CardAccountTypeCode;
import com.tools20022.repository.codeset.CardTypeCode;
import com.tools20022.repository.codeset.CSCManagementCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device that typically contains a microprocessor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentCard" src="doc-files/PaymentCard.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Payment
 * PaymentCard.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Type
 * PaymentCard.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Number
 * PaymentCard.Number}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#StartDate
 * PaymentCard.StartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#ExpiryDate
 * PaymentCard.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#SecurityCode
 * PaymentCard.SecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#SequenceNumber
 * PaymentCard.SequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#ServiceCode
 * PaymentCard.ServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#TrackValue
 * PaymentCard.TrackValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#SecurityCodeManagement
 * PaymentCard.SecurityCodeManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardBrand
 * PaymentCard.CardBrand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
 * PaymentCard.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#ProfileNumber
 * PaymentCard.ProfileNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccountType
 * PaymentCard.RelatedAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#CreditAvailableAmount
 * PaymentCard.CreditAvailableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Limit
 * PaymentCard.Limit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#CardCurrencyCode
 * PaymentCard.CardCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Interest
 * PaymentCard.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardCountryCode
 * PaymentCard.CardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#CardProgramme
 * PaymentCard.CardProgramme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedPaymentCard
 * Country.RelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedPaymentCard
 * CashAccount.RelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
 * CardPayment.PaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#RelatedPaymentCard
 * Limit.RelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#RelatedPaymentCard
 * Interest.RelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#TrackData
 * PlainCardData1.TrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData1#CardSecurityCode
 * PlainCardData1.CardSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#PlainCardData
 * PaymentCard4.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionData1#CardData
 * TransactionData1.CardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2#TrackData
 * PlainCardData2.TrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard3#PlainCardData
 * PaymentCard3.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#PlainCardData
 * PaymentCard6.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard1#PlainCardData
 * PaymentCard1.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard5#PlainCardData
 * PaymentCard5.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard7#PlainCardData
 * PaymentCard7.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#EffectiveDate
 * PlainCardData4.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#ExpiryDate
 * PlainCardData4.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#TrackData
 * PlainCardData4.TrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData4#CardSecurityCode
 * PlainCardData4.CardSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#PlainCardData
 * PaymentCard8.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#EffectiveDate
 * PlainCardData6.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#ExpiryDate
 * PlainCardData6.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#TrackData
 * PlainCardData6.TrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#EffectiveDate
 * PlainCardData5.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#ExpiryDate
 * PlainCardData5.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard10#PlainCardData
 * PaymentCard10.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#EffectiveDate
 * PlainCardData7.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#ExpiryDate
 * PlainCardData7.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#TrackData
 * PlainCardData7.TrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#EffectiveDate
 * PlainCardData9.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#ExpiryDate
 * PlainCardData9.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#TrackData
 * PlainCardData9.TrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#EffectiveDate
 * PlainCardData11.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#ExpiryDate
 * PlainCardData11.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#EffectiveDate
 * PlainCardData10.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#ExpiryDate
 * PlainCardData10.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#TrackData
 * PlainCardData10.TrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12#ExpiryDate
 * PlainCardData12.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#EffectiveDate
 * PlainCardData14.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#ExpiryDate
 * PlainCardData14.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData13#EffectiveDate
 * PlainCardData13.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData13#ExpiryDate
 * PlainCardData13.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard19#PlainCardData
 * PaymentCard19.PlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData16#EffectiveDate
 * PlainCardData16.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData16#ExpiryDate
 * PlainCardData16.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#EffectiveDate
 * PlainCardData15.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#ExpiryDate
 * PlainCardData15.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#EffectiveDate
 * PlainCardData18.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#ExpiryDate
 * PlainCardData18.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#EffectiveDate
 * PlainCardData19.EffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#ExpiryDate
 * PlainCardData19.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard27#PlainCardData
 * PaymentCard27.PlainCardData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TrackData1 TrackData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardSecurityInformation1
 * CardSecurityInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1 PlainCardData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4 PaymentCard4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData3 PlainCardData3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionData1
 * TransactionData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2 PlainCardData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard3 PaymentCard3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6 PaymentCard6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard1 PaymentCard1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard5 PaymentCard5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialCard1 FinancialCard1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard7 PaymentCard7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4 PlainCardData4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6 PlainCardData6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5 PlainCardData5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard10 PaymentCard10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9 PaymentCard9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7 PlainCardData7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9 PlainCardData9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard11 PaymentCard11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11
 * PlainCardData11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10
 * PlainCardData10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12
 * PlainCardData12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard13 PaymentCard13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData8 PlainCardData8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard16 PaymentCard16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14
 * PlainCardData14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData13
 * PlainCardData13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard17 PaymentCard17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18 PaymentCard18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard20 PaymentCard20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard19 PaymentCard19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData16
 * PlainCardData16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17
 * PlainCardData17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15
 * PlainCardData15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard21 PaymentCard21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard23 PaymentCard23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard22 PaymentCard22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18
 * PlainCardData18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19
 * PlainCardData19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25 PaymentCard25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard26 PaymentCard26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard27 PaymentCard27}</li>
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
 * "PaymentCard"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor."
 * </li>
 * </ul>
 */
public class PaymentCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment for which a payment card is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
	 * CardPayment.PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a payment card is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a payment card is used.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.PaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of card, eg, credit card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CardTypeCode
	 * CardTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#Type
	 * PaymentCard2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#Type
	 * PaymentCard18.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#Type
	 * PaymentCard25.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card, eg, credit card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.Type, com.tools20022.repository.msg.PaymentCard18.Type, com.tools20022.repository.msg.PaymentCard25.Type);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardTypeCode.mmObject();
		}
	};
	/**
	 * Number embossed on a card that links the card to the account owner and
	 * account servicer (sometimes called personal account number or PAN).
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#Number
	 * PaymentCard2.Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#PAN
	 * PlainCardData1.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData3#PAN
	 * PlainCardData3.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2#PAN
	 * PlainCardData2.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#PAN
	 * PlainCardData4.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#PAN
	 * PlainCardData6.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#PAN
	 * PlainCardData5.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#PAN
	 * PlainCardData7.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#PAN
	 * PlainCardData9.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#PAN
	 * PlainCardData11.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#PAN
	 * PlainCardData10.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12#PAN
	 * PlainCardData12.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData8#PAN
	 * PlainCardData8.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#PAN
	 * PlainCardData14.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData13#PAN
	 * PlainCardData13.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#Number
	 * PaymentCard18.Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData16#PAN
	 * PlainCardData16.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#PAN
	 * PlainCardData17.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#PAN
	 * PlainCardData15.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#PAN
	 * PlainCardData18.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#PAN
	 * PlainCardData19.PAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#Number
	 * PaymentCard25.Number}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.Number, com.tools20022.repository.msg.PlainCardData1.PAN, com.tools20022.repository.msg.PlainCardData3.PAN,
					com.tools20022.repository.msg.PlainCardData2.PAN, com.tools20022.repository.msg.PlainCardData4.PAN, com.tools20022.repository.msg.PlainCardData6.PAN, com.tools20022.repository.msg.PlainCardData5.PAN,
					com.tools20022.repository.msg.PlainCardData7.PAN, com.tools20022.repository.msg.PlainCardData9.PAN, com.tools20022.repository.msg.PlainCardData11.PAN, com.tools20022.repository.msg.PlainCardData10.PAN,
					com.tools20022.repository.msg.PlainCardData12.PAN, com.tools20022.repository.msg.PlainCardData8.PAN, com.tools20022.repository.msg.PlainCardData14.PAN, com.tools20022.repository.msg.PlainCardData13.PAN,
					com.tools20022.repository.msg.PaymentCard18.Number, com.tools20022.repository.msg.PlainCardData16.PAN, com.tools20022.repository.msg.PlainCardData17.PAN, com.tools20022.repository.msg.PlainCardData15.PAN,
					com.tools20022.repository.msg.PlainCardData18.PAN, com.tools20022.repository.msg.PlainCardData19.PAN, com.tools20022.repository.msg.PaymentCard25.Number);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Year and month the card is available for use.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#StartDate
	 * PaymentCard2.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#EffectiveDate
	 * PlainCardData1.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#EffectiveDate
	 * PlainCardData3.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData2#EffectiveDate
	 * PlainCardData2.EffectiveDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#StartDate
	 * PaymentCard18.StartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#StartDate
	 * PaymentCard25.StartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card is available for use."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.StartDate, com.tools20022.repository.msg.PlainCardData1.EffectiveDate, com.tools20022.repository.msg.PlainCardData3.EffectiveDate,
					com.tools20022.repository.msg.PlainCardData2.EffectiveDate, com.tools20022.repository.msg.PaymentCard18.StartDate, com.tools20022.repository.msg.PaymentCard25.StartDate);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Year and month the card expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#ExpiryDate
	 * PaymentCard2.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#ExpiryDate
	 * PlainCardData1.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData3#ExpiryDate
	 * PlainCardData3.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2#ExpiryDate
	 * PlainCardData2.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#ExpiryDate
	 * PaymentCard18.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#ExpiryDate
	 * PaymentCard25.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.ExpiryDate, com.tools20022.repository.msg.PlainCardData1.ExpiryDate, com.tools20022.repository.msg.PlainCardData3.ExpiryDate,
					com.tools20022.repository.msg.PlainCardData2.ExpiryDate, com.tools20022.repository.msg.PaymentCard18.ExpiryDate, com.tools20022.repository.msg.PaymentCard25.ExpiryDate);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Security code written on the card, sometimes called card security code
	 * (CSC).
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#SecurityCode
	 * PaymentCard2.SecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#CSCValue
	 * CardSecurityInformation1.CSCValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#SecurityCode
	 * PaymentCard18.SecurityCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#SecurityCode
	 * PaymentCard25.SecurityCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security code written on the card, sometimes called card security code (CSC)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecurityCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.SecurityCode, com.tools20022.repository.msg.CardSecurityInformation1.CSCValue, com.tools20022.repository.msg.PaymentCard18.SecurityCode,
					com.tools20022.repository.msg.PaymentCard25.SecurityCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on the card, sometimes called card security code (CSC).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies a card inside a set of cards with the same number (or PAN).
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2#SequenceNumber
	 * PaymentCard2.SequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#CardSequenceNumber
	 * PlainCardData1.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#CardSequenceNumber
	 * PlainCardData3.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData2#CardSequenceNumber
	 * PlainCardData2.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData4#CardSequenceNumber
	 * PlainCardData4.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData6#CardSequenceNumber
	 * PlainCardData6.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData5#CardSequenceNumber
	 * PlainCardData5.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#CardSequenceNumber
	 * PlainCardData7.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData9#CardSequenceNumber
	 * PlainCardData9.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData11#CardSequenceNumber
	 * PlainCardData11.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData10#CardSequenceNumber
	 * PlainCardData10.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData12#CardSequenceNumber
	 * PlainCardData12.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData8#CardSequenceNumber
	 * PlainCardData8.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14#CardSequenceNumber
	 * PlainCardData14.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#CardSequenceNumber
	 * PlainCardData13.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#SequenceNumber
	 * PaymentCard18.SequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#CardSequenceNumber
	 * PlainCardData16.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15#CardSequenceNumber
	 * PlainCardData15.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18#CardSequenceNumber
	 * PlainCardData18.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData19#CardSequenceNumber
	 * PlainCardData19.CardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#SequenceNumber
	 * PaymentCard25.SequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a card inside a set of cards with the same number (or PAN)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SequenceNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.SequenceNumber, com.tools20022.repository.msg.PlainCardData1.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData3.CardSequenceNumber,
					com.tools20022.repository.msg.PlainCardData2.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData4.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData6.CardSequenceNumber,
					com.tools20022.repository.msg.PlainCardData5.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData7.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData9.CardSequenceNumber,
					com.tools20022.repository.msg.PlainCardData11.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData10.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData12.CardSequenceNumber,
					com.tools20022.repository.msg.PlainCardData8.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData14.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData13.CardSequenceNumber,
					com.tools20022.repository.msg.PaymentCard18.SequenceNumber, com.tools20022.repository.msg.PlainCardData16.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData15.CardSequenceNumber,
					com.tools20022.repository.msg.PlainCardData18.CardSequenceNumber, com.tools20022.repository.msg.PlainCardData19.CardSequenceNumber, com.tools20022.repository.msg.PaymentCard25.SequenceNumber);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceNumber";
			definition = "Identifies a card inside a set of cards with the same number (or PAN).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Services attached to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#ServiceCode
	 * PlainCardData1.ServiceCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2#ServiceCode
	 * PlainCardData2.ServiceCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#ServiceCode
	 * PlainCardData4.ServiceCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#ServiceCode
	 * PlainCardData6.ServiceCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#ServiceCode
	 * PlainCardData7.ServiceCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#ServiceCode
	 * PlainCardData9.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData11#ServiceCode
	 * PlainCardData11.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData10#ServiceCode
	 * PlainCardData10.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#ServiceCode
	 * PlainCardData13.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#ServiceCode
	 * PlainCardData16.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15#ServiceCode
	 * PlainCardData15.ServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18#ServiceCode
	 * PlainCardData18.ServiceCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services attached to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ServiceCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.ServiceCode, com.tools20022.repository.msg.PlainCardData2.ServiceCode, com.tools20022.repository.msg.PlainCardData4.ServiceCode,
					com.tools20022.repository.msg.PlainCardData6.ServiceCode, com.tools20022.repository.msg.PlainCardData7.ServiceCode, com.tools20022.repository.msg.PlainCardData9.ServiceCode,
					com.tools20022.repository.msg.PlainCardData11.ServiceCode, com.tools20022.repository.msg.PlainCardData10.ServiceCode, com.tools20022.repository.msg.PlainCardData13.ServiceCode,
					com.tools20022.repository.msg.PlainCardData16.ServiceCode, com.tools20022.repository.msg.PlainCardData15.ServiceCode, com.tools20022.repository.msg.PlainCardData18.ServiceCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * Card track content or equivalent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TrackData1#TrackValue
	 * TrackData1.TrackValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card track content or equivalent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TrackValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TrackData1.TrackValue);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackValue";
			definition = "Card track content or equivalent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Card Security Code management associated with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#CSCManagement
	 * CardSecurityInformation1.CSCManagement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCodeManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card Security Code management associated with the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecurityCodeManagement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardSecurityInformation1.CSCManagement);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCodeManagement";
			definition = "Card Security Code management associated with the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CSCManagementCode.mmObject();
		}
	};
	/**
	 * Brand name of the card.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#CardBrand
	 * PaymentCard4.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionData1#CardBrand
	 * TransactionData1.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard3#CardBrand
	 * PaymentCard3.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#CardBrand
	 * PaymentCard6.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard1#CardBrand
	 * PaymentCard1.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard5#CardBrand
	 * PaymentCard5.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard7#CardBrand
	 * PaymentCard7.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#CardBrand
	 * PaymentCard8.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9#CardBrand
	 * PaymentCard9.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard11#CardBrand
	 * PaymentCard11.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard20#CardBrand
	 * PaymentCard20.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard21#CardBrand
	 * PaymentCard21.CardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard26#CardBrand
	 * PaymentCard26.CardBrand}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardBrand = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard4.CardBrand, com.tools20022.repository.msg.TransactionData1.CardBrand, com.tools20022.repository.msg.PaymentCard3.CardBrand,
					com.tools20022.repository.msg.PaymentCard6.CardBrand, com.tools20022.repository.msg.PaymentCard1.CardBrand, com.tools20022.repository.msg.PaymentCard5.CardBrand, com.tools20022.repository.msg.PaymentCard7.CardBrand,
					com.tools20022.repository.msg.PaymentCard8.CardBrand, com.tools20022.repository.msg.PaymentCard9.CardBrand, com.tools20022.repository.msg.PaymentCard11.CardBrand, com.tools20022.repository.msg.PaymentCard20.CardBrand,
					com.tools20022.repository.msg.PaymentCard21.CardBrand, com.tools20022.repository.msg.PaymentCard26.CardBrand);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Account linked to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedPaymentCard
	 * CashAccount.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionData1#PrePaidAccount
	 * TransactionData1.PrePaidAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction2#PrePaidAccount
	 * CardTransaction2.PrePaidAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#PrePaidAccount
	 * CardEntry2.PrePaidAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account linked to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionData1.PrePaidAccount, com.tools20022.repository.msg.CardTransaction2.PrePaidAccount, com.tools20022.repository.msg.CardEntry2.PrePaidAccount);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccount";
			definition = "Account linked to the card.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines a category of cards related the acceptance processing rules
	 * defined by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard3#CardProductProfile
	 * PaymentCard3.CardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#CardProductProfile
	 * PaymentCard6.CardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard1#CardProductProfile
	 * PaymentCard1.CardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard5#CardProductProfile
	 * PaymentCard5.CardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#CardProductProfile
	 * PaymentCard8.CardProductProfile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProfileNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard3.CardProductProfile, com.tools20022.repository.msg.PaymentCard6.CardProductProfile, com.tools20022.repository.msg.PaymentCard1.CardProductProfile,
					com.tools20022.repository.msg.PaymentCard5.CardProductProfile, com.tools20022.repository.msg.PaymentCard8.CardProductProfile);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfileNumber";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	/**
	 * Type of cardholder account used for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#AccountType
	 * CardPaymentTransactionDetails4.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#AccountType
	 * CardPaymentTransactionDetails1.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#AccountType
	 * CardPaymentTransactionDetails10.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#AccountType
	 * CardPaymentTransactionDetails2.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#AccountType
	 * CardPaymentTransactionDetails11.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#AccountType
	 * CardPaymentTransactionDetails3.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#AccountType
	 * CardPaymentTransactionDetails12.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#AccountType
	 * CardPaymentTransactionDetails13.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#AccountType
	 * CardPaymentTransactionDetails16.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#AccountType
	 * CardPaymentTransactionDetails14.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#AccountType
	 * CardPaymentTransactionDetails15.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#AccountType
	 * CardPaymentTransactionDetails17.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#AccountType
	 * CardPaymentTransactionDetails20.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#AccountType
	 * CardPaymentTransactionDetails25.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#AccountType
	 * CardPaymentTransactionDetails23.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#AccountType
	 * CardPaymentTransactionDetails21.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#AccountType
	 * CardPaymentTransactionDetails19.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#AccountType
	 * CardPaymentTransactionDetails24.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#SelectedAccountType
	 * CardAccount1.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount2#SelectedAccountType
	 * CardAccount2.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#AccountType
	 * CardPaymentTransactionDetails32.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#AccountType
	 * CardPaymentTransactionDetails28.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#AccountType
	 * CardPaymentTransactionDetails29.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#AccountType
	 * CardPaymentTransactionDetails30.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#AccountType
	 * CardPaymentTransactionDetails27.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#AccountType
	 * CardPaymentTransactionDetails31.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#AccountType
	 * CardPaymentTransactionDetails39.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#AccountType
	 * CardPaymentTransactionDetails38.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#AccountType
	 * CardPaymentTransactionDetails41.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#AccountType
	 * CardPaymentTransactionDetails37.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#AccountType
	 * CardPaymentTransactionDetails42.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#AccountType
	 * CardPaymentTransactionDetails43.AccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelatedAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails4.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails1.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails10.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails2.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails11.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails3.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails13.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails16.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails14.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails15.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails17.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails20.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails25.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails23.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails21.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails19.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails24.AccountType, com.tools20022.repository.msg.CardAccount1.SelectedAccountType,
					com.tools20022.repository.msg.CardAccount2.SelectedAccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails32.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails28.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails29.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails30.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails27.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails31.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails39.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails38.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails41.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails37.AccountType,
					com.tools20022.repository.msg.CardPaymentTransactionDetails42.AccountType, com.tools20022.repository.msg.CardPaymentTransactionDetails43.AccountType);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardAccountTypeCode.mmObject();
		}
	};
	/**
	 * Monetary value of the credit available for this financial card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1#CreditAvailableAmount
	 * FinancialCard1.CreditAvailableAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the credit available for this financial card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditAvailableAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialCard1.CreditAvailableAmount);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Limit specified on a payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#RelatedPaymentCard
	 * Limit.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction2#Limits
	 * ATMTransaction2.Limits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#Limits
	 * ATMTransaction3.Limits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction14#Limits
	 * ATMTransaction14.Limits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#Limits
	 * ATMTransaction17.Limits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit specified on a payment card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Limit = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction2.Limits, com.tools20022.repository.msg.ATMTransaction3.Limits, com.tools20022.repository.msg.ATMTransaction14.Limits,
					com.tools20022.repository.msg.ATMTransaction17.Limits);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Limit specified on a payment card.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency code of the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#CardCurrencyCode
	 * PaymentCard7.CardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#CardCurrencyCode
	 * PaymentCard8.CardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#CardCurrencyCode
	 * PaymentCard14.CardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard17#CardCurrencyCode
	 * PaymentCard17.CardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#CardCurrencyCode
	 * PaymentCard23.CardCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardCurrencyCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard7.CardCurrencyCode, com.tools20022.repository.msg.PaymentCard8.CardCurrencyCode, com.tools20022.repository.msg.PaymentCard14.CardCurrencyCode,
					com.tools20022.repository.msg.PaymentCard17.CardCurrencyCode, com.tools20022.repository.msg.PaymentCard23.CardCurrencyCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Interest applied on amounts due for credit card payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedPaymentCard
	 * Interest.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest applied on amounts due for credit card payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest applied on amounts due for credit card payments.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country code attached to the card by the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#RelatedPaymentCard
	 * Country.RelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard4#CardCountryCode
	 * PaymentCard4.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard3#CardCountryCode
	 * PaymentCard3.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#CardCountryCode
	 * PaymentCard6.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard1#CardCountryCode
	 * PaymentCard1.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard5#CardCountryCode
	 * PaymentCard5.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#CardCountryCode
	 * PaymentCard7.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#CardCountryCode
	 * PaymentCard8.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#CardCountryCode
	 * PaymentCard9.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#CardCountryCode
	 * PaymentCard11.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#CardCountryCode
	 * PaymentCard12.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#CardCountryCode
	 * PaymentCard14.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard16#CardCountryCode
	 * PaymentCard16.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard17#CardCountryCode
	 * PaymentCard17.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard20#CardCountryCode
	 * PaymentCard20.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#CardCountryCode
	 * PaymentCard21.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#CardCountryCode
	 * PaymentCard23.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard22#CardCountryCode
	 * PaymentCard22.CardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard26#CardCountryCode
	 * PaymentCard26.CardCountryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code attached to the card by the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardCountryCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard4.CardCountryCode, com.tools20022.repository.msg.PaymentCard3.CardCountryCode, com.tools20022.repository.msg.PaymentCard6.CardCountryCode,
					com.tools20022.repository.msg.PaymentCard1.CardCountryCode, com.tools20022.repository.msg.PaymentCard5.CardCountryCode, com.tools20022.repository.msg.PaymentCard7.CardCountryCode,
					com.tools20022.repository.msg.PaymentCard8.CardCountryCode, com.tools20022.repository.msg.PaymentCard9.CardCountryCode, com.tools20022.repository.msg.PaymentCard11.CardCountryCode,
					com.tools20022.repository.msg.PaymentCard12.CardCountryCode, com.tools20022.repository.msg.PaymentCard14.CardCountryCode, com.tools20022.repository.msg.PaymentCard16.CardCountryCode,
					com.tools20022.repository.msg.PaymentCard17.CardCountryCode, com.tools20022.repository.msg.PaymentCard20.CardCountryCode, com.tools20022.repository.msg.PaymentCard21.CardCountryCode,
					com.tools20022.repository.msg.PaymentCard23.CardCountryCode, com.tools20022.repository.msg.PaymentCard22.CardCountryCode, com.tools20022.repository.msg.PaymentCard26.CardCountryCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardCountryCode";
			definition = "Country code attached to the card by the card issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The card programme associated by a retailer to a cardholder among a
	 * series of payment programmes offered by the retailer.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#CardProgrammeProposed
	 * CardPaymentTransaction71.CardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#CardProgrammeApplied
	 * CardPaymentTransaction71.CardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard26#CardProductSubType
	 * PaymentCard26.CardProductSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#CardProgrammeProposed
	 * CardPaymentTransaction75.CardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#CardProgrammeApplied
	 * CardPaymentTransaction75.CardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard27#CardProductSubType
	 * PaymentCard27.CardProductSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#CardProgrammeProposed
	 * CardPaymentTransaction74.CardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#CardProgrammeApplied
	 * CardPaymentTransaction74.CardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#CardProgrammeProposed
	 * CardPaymentTransaction70.CardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#CardProgrammeApplied
	 * CardPaymentTransaction70.CardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#CardProgrammeProposed
	 * CardPaymentTransaction76.CardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#CardProgrammeApplied
	 * CardPaymentTransaction76.CardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#CardProgrammeProposed
	 * CardPaymentTransaction69.CardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#CardProgrammeApplied
	 * CardPaymentTransaction69.CardProgrammeApplied}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProgramme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardProgramme = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction71.CardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction71.CardProgrammeApplied,
					com.tools20022.repository.msg.PaymentCard26.CardProductSubType, com.tools20022.repository.msg.CardPaymentTransaction75.CardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction75.CardProgrammeApplied,
					com.tools20022.repository.msg.PaymentCard27.CardProductSubType, com.tools20022.repository.msg.CardPaymentTransaction74.CardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction74.CardProgrammeApplied,
					com.tools20022.repository.msg.CardPaymentTransaction70.CardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction70.CardProgrammeApplied,
					com.tools20022.repository.msg.CardPaymentTransaction76.CardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction76.CardProgrammeApplied,
					com.tools20022.repository.msg.CardPaymentTransaction69.CardProgrammeProposed, com.tools20022.repository.msg.CardPaymentTransaction69.CardProgrammeApplied);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardProgramme";
			definition = "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCard";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.RelatedPaymentCard, com.tools20022.repository.entity.CashAccount.RelatedPaymentCard,
						com.tools20022.repository.entity.CardPayment.PaymentCard, com.tools20022.repository.entity.Limit.RelatedPaymentCard, com.tools20022.repository.entity.Interest.RelatedPaymentCard);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData1.TrackData, com.tools20022.repository.msg.PlainCardData1.CardSecurityCode, com.tools20022.repository.msg.PaymentCard4.PlainCardData,
						com.tools20022.repository.msg.TransactionData1.CardData, com.tools20022.repository.msg.PlainCardData2.TrackData, com.tools20022.repository.msg.PaymentCard3.PlainCardData,
						com.tools20022.repository.msg.PaymentCard6.PlainCardData, com.tools20022.repository.msg.PaymentCard1.PlainCardData, com.tools20022.repository.msg.PaymentCard5.PlainCardData,
						com.tools20022.repository.msg.PaymentCard7.PlainCardData, com.tools20022.repository.msg.PlainCardData4.EffectiveDate, com.tools20022.repository.msg.PlainCardData4.ExpiryDate,
						com.tools20022.repository.msg.PlainCardData4.TrackData, com.tools20022.repository.msg.PlainCardData4.CardSecurityCode, com.tools20022.repository.msg.PaymentCard8.PlainCardData,
						com.tools20022.repository.msg.PlainCardData6.EffectiveDate, com.tools20022.repository.msg.PlainCardData6.ExpiryDate, com.tools20022.repository.msg.PlainCardData6.TrackData,
						com.tools20022.repository.msg.PlainCardData5.EffectiveDate, com.tools20022.repository.msg.PlainCardData5.ExpiryDate, com.tools20022.repository.msg.PaymentCard10.PlainCardData,
						com.tools20022.repository.msg.PlainCardData7.EffectiveDate, com.tools20022.repository.msg.PlainCardData7.ExpiryDate, com.tools20022.repository.msg.PlainCardData7.TrackData,
						com.tools20022.repository.msg.PlainCardData9.EffectiveDate, com.tools20022.repository.msg.PlainCardData9.ExpiryDate, com.tools20022.repository.msg.PlainCardData9.TrackData,
						com.tools20022.repository.msg.PlainCardData11.EffectiveDate, com.tools20022.repository.msg.PlainCardData11.ExpiryDate, com.tools20022.repository.msg.PlainCardData10.EffectiveDate,
						com.tools20022.repository.msg.PlainCardData10.ExpiryDate, com.tools20022.repository.msg.PlainCardData10.TrackData, com.tools20022.repository.msg.PlainCardData12.ExpiryDate,
						com.tools20022.repository.msg.PlainCardData14.EffectiveDate, com.tools20022.repository.msg.PlainCardData14.ExpiryDate, com.tools20022.repository.msg.PlainCardData13.EffectiveDate,
						com.tools20022.repository.msg.PlainCardData13.ExpiryDate, com.tools20022.repository.msg.PaymentCard19.PlainCardData, com.tools20022.repository.msg.PlainCardData16.EffectiveDate,
						com.tools20022.repository.msg.PlainCardData16.ExpiryDate, com.tools20022.repository.msg.PlainCardData15.EffectiveDate, com.tools20022.repository.msg.PlainCardData15.ExpiryDate,
						com.tools20022.repository.msg.PlainCardData18.EffectiveDate, com.tools20022.repository.msg.PlainCardData18.ExpiryDate, com.tools20022.repository.msg.PlainCardData19.EffectiveDate,
						com.tools20022.repository.msg.PlainCardData19.ExpiryDate, com.tools20022.repository.msg.PaymentCard27.PlainCardData);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentCard.Payment, com.tools20022.repository.entity.PaymentCard.Type, com.tools20022.repository.entity.PaymentCard.Number,
						com.tools20022.repository.entity.PaymentCard.StartDate, com.tools20022.repository.entity.PaymentCard.ExpiryDate, com.tools20022.repository.entity.PaymentCard.SecurityCode,
						com.tools20022.repository.entity.PaymentCard.SequenceNumber, com.tools20022.repository.entity.PaymentCard.ServiceCode, com.tools20022.repository.entity.PaymentCard.TrackValue,
						com.tools20022.repository.entity.PaymentCard.SecurityCodeManagement, com.tools20022.repository.entity.PaymentCard.CardBrand, com.tools20022.repository.entity.PaymentCard.RelatedAccount,
						com.tools20022.repository.entity.PaymentCard.ProfileNumber, com.tools20022.repository.entity.PaymentCard.RelatedAccountType, com.tools20022.repository.entity.PaymentCard.CreditAvailableAmount,
						com.tools20022.repository.entity.PaymentCard.Limit, com.tools20022.repository.entity.PaymentCard.CardCurrencyCode, com.tools20022.repository.entity.PaymentCard.Interest,
						com.tools20022.repository.entity.PaymentCard.CardCountryCode, com.tools20022.repository.entity.PaymentCard.CardProgramme);
				derivationComponent_lazy = () -> Arrays.asList(PaymentCard2.mmObject(), TrackData1.mmObject(), CardSecurityInformation1.mmObject(), PlainCardData1.mmObject(), PaymentCard4.mmObject(), PlainCardData3.mmObject(),
						TransactionData1.mmObject(), PlainCardData2.mmObject(), PaymentCard3.mmObject(), PaymentCard6.mmObject(), PaymentCard1.mmObject(), PaymentCard5.mmObject(), FinancialCard1.mmObject(), PaymentCard7.mmObject(),
						PlainCardData4.mmObject(), PaymentCard8.mmObject(), PlainCardData6.mmObject(), PlainCardData5.mmObject(), PaymentCard10.mmObject(), PaymentCard9.mmObject(), PlainCardData7.mmObject(), PlainCardData9.mmObject(),
						PaymentCard11.mmObject(), PlainCardData11.mmObject(), PlainCardData10.mmObject(), PaymentCard12.mmObject(), PlainCardData12.mmObject(), PaymentCard13.mmObject(), PaymentCard15.mmObject(), PaymentCard14.mmObject(),
						PlainCardData8.mmObject(), PaymentCard16.mmObject(), PlainCardData14.mmObject(), PlainCardData13.mmObject(), PaymentCard17.mmObject(), PaymentCard18.mmObject(), PaymentCard20.mmObject(), PaymentCard19.mmObject(),
						PlainCardData16.mmObject(), PlainCardData17.mmObject(), PlainCardData15.mmObject(), PaymentCard21.mmObject(), PaymentCard23.mmObject(), PaymentCard22.mmObject(), PlainCardData18.mmObject(),
						PlainCardData19.mmObject(), PaymentCard25.mmObject(), PaymentCard26.mmObject(), PaymentCard27.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}