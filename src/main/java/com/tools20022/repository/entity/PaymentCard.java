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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CardAccountTypeCode;
import com.tools20022.repository.codeset.CardTypeCode;
import com.tools20022.repository.codeset.CSCManagementCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
 * Country.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
 * CashAccount.mmRelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
 * CardPayment.mmPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
 * Limit.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#mmTrackData
 * PlainCardData1.mmTrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmCardSecurityCode
 * PlainCardData1.mmCardSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#mmPlainCardData
 * PaymentCard4.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionData1#mmCardData
 * TransactionData1.mmCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2#mmTrackData
 * PlainCardData2.mmTrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard3#mmPlainCardData
 * PaymentCard3.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#mmPlainCardData
 * PaymentCard6.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard1#mmPlainCardData
 * PaymentCard1.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard5#mmPlainCardData
 * PaymentCard5.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard7#mmPlainCardData
 * PaymentCard7.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#mmEffectiveDate
 * PlainCardData4.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#mmExpiryDate
 * PlainCardData4.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#mmTrackData
 * PlainCardData4.mmTrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData4#mmCardSecurityCode
 * PlainCardData4.mmCardSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#mmPlainCardData
 * PaymentCard8.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#mmEffectiveDate
 * PlainCardData6.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#mmExpiryDate
 * PlainCardData6.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#mmTrackData
 * PlainCardData6.mmTrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#mmEffectiveDate
 * PlainCardData5.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#mmExpiryDate
 * PlainCardData5.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard10#mmPlainCardData
 * PaymentCard10.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#mmEffectiveDate
 * PlainCardData7.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#mmExpiryDate
 * PlainCardData7.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#mmTrackData
 * PlainCardData7.mmTrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmEffectiveDate
 * PlainCardData9.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmExpiryDate
 * PlainCardData9.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmTrackData
 * PlainCardData9.mmTrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData11#mmEffectiveDate
 * PlainCardData11.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#mmExpiryDate
 * PlainCardData11.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData10#mmEffectiveDate
 * PlainCardData10.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#mmExpiryDate
 * PlainCardData10.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#mmTrackData
 * PlainCardData10.mmTrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12#mmExpiryDate
 * PlainCardData12.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData14#mmEffectiveDate
 * PlainCardData14.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmExpiryDate
 * PlainCardData14.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmEffectiveDate
 * PlainCardData13.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData13#mmExpiryDate
 * PlainCardData13.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard19#mmPlainCardData
 * PaymentCard19.mmPlainCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmEffectiveDate
 * PlainCardData16.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData16#mmExpiryDate
 * PlainCardData16.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmEffectiveDate
 * PlainCardData15.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmExpiryDate
 * PlainCardData15.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData18#mmEffectiveDate
 * PlainCardData18.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#mmExpiryDate
 * PlainCardData18.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData19#mmEffectiveDate
 * PlainCardData19.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#mmExpiryDate
 * PlainCardData19.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard27#mmPlainCardData
 * PaymentCard27.mmPlainCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
 * PaymentCard.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmType
 * PaymentCard.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
 * PaymentCard.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmStartDate
 * PaymentCard.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmExpiryDate
 * PaymentCard.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCode
 * PaymentCard.mmSecurityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
 * PaymentCard.mmSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmServiceCode
 * PaymentCard.mmServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmTrackValue
 * PaymentCard.mmTrackValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCodeManagement
 * PaymentCard.mmSecurityCodeManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmCardBrand
 * PaymentCard.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccount
 * PaymentCard.mmRelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmProfileNumber
 * PaymentCard.mmProfileNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
 * PaymentCard.mmRelatedAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCreditAvailableAmount
 * PaymentCard.mmCreditAvailableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
 * PaymentCard.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCurrencyCode
 * PaymentCard.mmCardCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
 * PaymentCard.mmCardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmCardProgramme
 * PaymentCard.mmCardProgramme}</li>
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
 * "PaymentCard"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor."
 * </li>
 * </ul>
 */
public class PaymentCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPayment payment;
	/**
	 * Payment for which a payment card is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a payment card is used.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	protected CardTypeCode type;
	/**
	 * Type of card, eg, credit card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CardTypeCode
	 * CardTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmType
	 * PaymentCard2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmType
	 * PaymentCard18.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmType
	 * PaymentCard25.mmType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard2.mmType, PaymentCard18.mmType, PaymentCard25.mmType);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardTypeCode.mmObject();
		}
	};
	protected Max35Text number;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmNumber
	 * PaymentCard2.mmNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData1#mmPAN
	 * PlainCardData1.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData3#mmPAN
	 * PlainCardData3.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData2#mmPAN
	 * PlainCardData2.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData4#mmPAN
	 * PlainCardData4.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData6#mmPAN
	 * PlainCardData6.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#mmPAN
	 * PlainCardData5.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData7#mmPAN
	 * PlainCardData7.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmPAN
	 * PlainCardData9.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#mmPAN
	 * PlainCardData11.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#mmPAN
	 * PlainCardData10.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12#mmPAN
	 * PlainCardData12.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData8#mmPAN
	 * PlainCardData8.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData14#mmPAN
	 * PlainCardData14.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData13#mmPAN
	 * PlainCardData13.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmNumber
	 * PaymentCard18.mmNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData16#mmPAN
	 * PlainCardData16.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmPAN
	 * PlainCardData17.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmPAN
	 * PlainCardData15.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#mmPAN
	 * PlainCardData18.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#mmPAN
	 * PlainCardData19.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmNumber
	 * PaymentCard25.mmNumber}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard2.mmNumber, PlainCardData1.mmPAN, PlainCardData3.mmPAN, PlainCardData2.mmPAN, PlainCardData4.mmPAN, PlainCardData6.mmPAN, PlainCardData5.mmPAN, PlainCardData7.mmPAN,
					PlainCardData9.mmPAN, PlainCardData11.mmPAN, PlainCardData10.mmPAN, PlainCardData12.mmPAN, PlainCardData8.mmPAN, PlainCardData14.mmPAN, PlainCardData13.mmPAN, PaymentCard18.mmNumber, PlainCardData16.mmPAN,
					PlainCardData17.mmPAN, PlainCardData15.mmPAN, PlainCardData18.mmPAN, PlainCardData19.mmPAN, PaymentCard25.mmNumber);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISOYearMonth startDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmStartDate
	 * PaymentCard2.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmEffectiveDate
	 * PlainCardData1.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmEffectiveDate
	 * PlainCardData3.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData2#mmEffectiveDate
	 * PlainCardData2.mmEffectiveDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmStartDate
	 * PaymentCard18.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmStartDate
	 * PaymentCard25.mmStartDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard2.mmStartDate, PlainCardData1.mmEffectiveDate, PlainCardData3.mmEffectiveDate, PlainCardData2.mmEffectiveDate, PaymentCard18.mmStartDate, PaymentCard25.mmStartDate);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	protected ISOYearMonth expiryDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmExpiryDate
	 * PaymentCard2.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmExpiryDate
	 * PlainCardData1.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmExpiryDate
	 * PlainCardData3.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData2#mmExpiryDate
	 * PlainCardData2.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmExpiryDate
	 * PaymentCard18.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmExpiryDate
	 * PaymentCard25.mmExpiryDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard2.mmExpiryDate, PlainCardData1.mmExpiryDate, PlainCardData3.mmExpiryDate, PlainCardData2.mmExpiryDate, PaymentCard18.mmExpiryDate, PaymentCard25.mmExpiryDate);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	protected Max35Text securityCode;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2#mmSecurityCode
	 * PaymentCard2.mmSecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#mmCSCValue
	 * CardSecurityInformation1.mmCSCValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmSecurityCode
	 * PaymentCard18.mmSecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmSecurityCode
	 * PaymentCard25.mmSecurityCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSecurityCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard2.mmSecurityCode, CardSecurityInformation1.mmCSCValue, PaymentCard18.mmSecurityCode, PaymentCard25.mmSecurityCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on the card, sometimes called card security code (CSC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text sequenceNumber;
	/**
	 * Identifies a card inside a set of cards with the same number (or PAN).
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2#mmSequenceNumber
	 * PaymentCard2.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmCardSequenceNumber
	 * PlainCardData1.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmCardSequenceNumber
	 * PlainCardData3.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData2#mmCardSequenceNumber
	 * PlainCardData2.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData4#mmCardSequenceNumber
	 * PlainCardData4.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData6#mmCardSequenceNumber
	 * PlainCardData6.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData5#mmCardSequenceNumber
	 * PlainCardData5.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmCardSequenceNumber
	 * PlainCardData7.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData9#mmCardSequenceNumber
	 * PlainCardData9.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData11#mmCardSequenceNumber
	 * PlainCardData11.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData10#mmCardSequenceNumber
	 * PlainCardData10.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData12#mmCardSequenceNumber
	 * PlainCardData12.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData8#mmCardSequenceNumber
	 * PlainCardData8.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData14#mmCardSequenceNumber
	 * PlainCardData14.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmCardSequenceNumber
	 * PlainCardData13.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmSequenceNumber
	 * PaymentCard18.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmCardSequenceNumber
	 * PlainCardData16.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmCardSequenceNumber
	 * PlainCardData15.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18#mmCardSequenceNumber
	 * PlainCardData18.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData19#mmCardSequenceNumber
	 * PlainCardData19.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmSequenceNumber
	 * PaymentCard25.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSequenceNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard2.mmSequenceNumber, PlainCardData1.mmCardSequenceNumber, PlainCardData3.mmCardSequenceNumber, PlainCardData2.mmCardSequenceNumber, PlainCardData4.mmCardSequenceNumber,
					PlainCardData6.mmCardSequenceNumber, PlainCardData5.mmCardSequenceNumber, PlainCardData7.mmCardSequenceNumber, PlainCardData9.mmCardSequenceNumber, PlainCardData11.mmCardSequenceNumber,
					PlainCardData10.mmCardSequenceNumber, PlainCardData12.mmCardSequenceNumber, PlainCardData8.mmCardSequenceNumber, PlainCardData14.mmCardSequenceNumber, PlainCardData13.mmCardSequenceNumber,
					PaymentCard18.mmSequenceNumber, PlainCardData16.mmCardSequenceNumber, PlainCardData15.mmCardSequenceNumber, PlainCardData18.mmCardSequenceNumber, PlainCardData19.mmCardSequenceNumber, PaymentCard25.mmSequenceNumber);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceNumber";
			definition = "Identifies a card inside a set of cards with the same number (or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Exact3NumericText serviceCode;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData1#mmServiceCode
	 * PlainCardData1.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData2#mmServiceCode
	 * PlainCardData2.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData4#mmServiceCode
	 * PlainCardData4.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData6#mmServiceCode
	 * PlainCardData6.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData7#mmServiceCode
	 * PlainCardData7.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData9#mmServiceCode
	 * PlainCardData9.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData11#mmServiceCode
	 * PlainCardData11.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData10#mmServiceCode
	 * PlainCardData10.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData13#mmServiceCode
	 * PlainCardData13.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData16#mmServiceCode
	 * PlainCardData16.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmServiceCode
	 * PlainCardData15.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18#mmServiceCode
	 * PlainCardData18.mmServiceCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmServiceCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData1.mmServiceCode, PlainCardData2.mmServiceCode, PlainCardData4.mmServiceCode, PlainCardData6.mmServiceCode, PlainCardData7.mmServiceCode, PlainCardData9.mmServiceCode,
					PlainCardData11.mmServiceCode, PlainCardData10.mmServiceCode, PlainCardData13.mmServiceCode, PlainCardData16.mmServiceCode, PlainCardData15.mmServiceCode, PlainCardData18.mmServiceCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected Max140Text trackValue;
	/**
	 * Card track content or equivalent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TrackData1#mmTrackValue
	 * TrackData1.mmTrackValue}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTrackValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TrackData1.mmTrackValue);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrackValue";
			definition = "Card track content or equivalent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected CSCManagementCode securityCodeManagement;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardSecurityInformation1#mmCSCManagement
	 * CardSecurityInformation1.mmCSCManagement}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSecurityCodeManagement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardSecurityInformation1.mmCSCManagement);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCodeManagement";
			definition = "Card Security Code management associated with the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCManagementCode.mmObject();
		}
	};
	protected Max35Text cardBrand;
	/**
	 * Brand name of the card.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard4#mmCardBrand
	 * PaymentCard4.mmCardBrand}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionData1#mmCardBrand
	 * TransactionData1.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard3#mmCardBrand
	 * PaymentCard3.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardBrand
	 * PaymentCard6.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard1#mmCardBrand
	 * PaymentCard1.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard5#mmCardBrand
	 * PaymentCard5.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardBrand
	 * PaymentCard7.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardBrand
	 * PaymentCard8.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardBrand
	 * PaymentCard9.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard11#mmCardBrand
	 * PaymentCard11.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard20#mmCardBrand
	 * PaymentCard20.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard21#mmCardBrand
	 * PaymentCard21.mmCardBrand}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard26#mmCardBrand
	 * PaymentCard26.mmCardBrand}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardBrand = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard4.mmCardBrand, TransactionData1.mmCardBrand, PaymentCard3.mmCardBrand, PaymentCard6.mmCardBrand, PaymentCard1.mmCardBrand, PaymentCard5.mmCardBrand, PaymentCard7.mmCardBrand,
					PaymentCard8.mmCardBrand, PaymentCard9.mmCardBrand, PaymentCard11.mmCardBrand, PaymentCard20.mmCardBrand, PaymentCard21.mmCardBrand, PaymentCard26.mmCardBrand);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> relatedAccount;
	/**
	 * Account linked to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
	 * CashAccount.mmRelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionData1#mmPrePaidAccount
	 * TransactionData1.mmPrePaidAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction2#mmPrePaidAccount
	 * CardTransaction2.mmPrePaidAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardEntry2#mmPrePaidAccount
	 * CardEntry2.mmPrePaidAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmRelatedAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionData1.mmPrePaidAccount, CardTransaction2.mmPrePaidAccount, CardEntry2.mmPrePaidAccount);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccount";
			definition = "Account linked to the card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Max5NumericText profileNumber;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard3#mmCardProductProfile
	 * PaymentCard3.mmCardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardProductProfile
	 * PaymentCard6.mmCardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard1#mmCardProductProfile
	 * PaymentCard1.mmCardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard5#mmCardProductProfile
	 * PaymentCard5.mmCardProductProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardProductProfile
	 * PaymentCard8.mmCardProductProfile}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProfileNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard3.mmCardProductProfile, PaymentCard6.mmCardProductProfile, PaymentCard1.mmCardProductProfile, PaymentCard5.mmCardProductProfile, PaymentCard8.mmCardProductProfile);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProfileNumber";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	protected CardAccountTypeCode relatedAccountType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmAccountType
	 * CardPaymentTransactionDetails4.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmAccountType
	 * CardPaymentTransactionDetails1.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmAccountType
	 * CardPaymentTransactionDetails10.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmAccountType
	 * CardPaymentTransactionDetails2.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#mmAccountType
	 * CardPaymentTransactionDetails11.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmAccountType
	 * CardPaymentTransactionDetails3.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmAccountType
	 * CardPaymentTransactionDetails12.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmAccountType
	 * CardPaymentTransactionDetails13.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmAccountType
	 * CardPaymentTransactionDetails16.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmAccountType
	 * CardPaymentTransactionDetails14.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmAccountType
	 * CardPaymentTransactionDetails15.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#mmAccountType
	 * CardPaymentTransactionDetails17.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmAccountType
	 * CardPaymentTransactionDetails20.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#mmAccountType
	 * CardPaymentTransactionDetails25.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmAccountType
	 * CardPaymentTransactionDetails23.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmAccountType
	 * CardPaymentTransactionDetails21.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmAccountType
	 * CardPaymentTransactionDetails19.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmAccountType
	 * CardPaymentTransactionDetails24.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmSelectedAccountType
	 * CardAccount1.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount2#mmSelectedAccountType
	 * CardAccount2.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmAccountType
	 * CardPaymentTransactionDetails32.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmAccountType
	 * CardPaymentTransactionDetails28.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmAccountType
	 * CardPaymentTransactionDetails29.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmAccountType
	 * CardPaymentTransactionDetails30.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmAccountType
	 * CardPaymentTransactionDetails27.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmAccountType
	 * CardPaymentTransactionDetails31.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmAccountType
	 * CardPaymentTransactionDetails39.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmAccountType
	 * CardPaymentTransactionDetails38.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmAccountType
	 * CardPaymentTransactionDetails41.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmAccountType
	 * CardPaymentTransactionDetails37.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#mmAccountType
	 * CardPaymentTransactionDetails42.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#mmAccountType
	 * CardPaymentTransactionDetails43.mmAccountType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRelatedAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails4.mmAccountType, CardPaymentTransactionDetails1.mmAccountType, CardPaymentTransactionDetails10.mmAccountType, CardPaymentTransactionDetails2.mmAccountType,
					CardPaymentTransactionDetails11.mmAccountType, CardPaymentTransactionDetails3.mmAccountType, CardPaymentTransactionDetails12.mmAccountType, CardPaymentTransactionDetails13.mmAccountType,
					CardPaymentTransactionDetails16.mmAccountType, CardPaymentTransactionDetails14.mmAccountType, CardPaymentTransactionDetails15.mmAccountType, CardPaymentTransactionDetails17.mmAccountType,
					CardPaymentTransactionDetails20.mmAccountType, CardPaymentTransactionDetails25.mmAccountType, CardPaymentTransactionDetails23.mmAccountType, CardPaymentTransactionDetails21.mmAccountType,
					CardPaymentTransactionDetails19.mmAccountType, CardPaymentTransactionDetails24.mmAccountType, CardAccount1.mmSelectedAccountType, CardAccount2.mmSelectedAccountType, CardPaymentTransactionDetails32.mmAccountType,
					CardPaymentTransactionDetails28.mmAccountType, CardPaymentTransactionDetails29.mmAccountType, CardPaymentTransactionDetails30.mmAccountType, CardPaymentTransactionDetails27.mmAccountType,
					CardPaymentTransactionDetails31.mmAccountType, CardPaymentTransactionDetails39.mmAccountType, CardPaymentTransactionDetails38.mmAccountType, CardPaymentTransactionDetails41.mmAccountType,
					CardPaymentTransactionDetails37.mmAccountType, CardPaymentTransactionDetails42.mmAccountType, CardPaymentTransactionDetails43.mmAccountType);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardAccountTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount creditAvailableAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1#mmCreditAvailableAmount
	 * FinancialCard1.mmCreditAvailableAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCreditAvailableAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialCard1.mmCreditAvailableAmount);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Limit> limit;
	/**
	 * Limit specified on a payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
	 * Limit.mmRelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction2#mmLimits
	 * ATMTransaction2.mmLimits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#mmLimits
	 * ATMTransaction3.mmLimits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction14#mmLimits
	 * ATMTransaction14.mmLimits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmLimits
	 * ATMTransaction17.mmLimits}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmLimit = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction2.mmLimits, ATMTransaction3.mmLimits, ATMTransaction14.mmLimits, ATMTransaction17.mmLimits);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Limit specified on a payment card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
		}
	};
	protected CurrencyCode cardCurrencyCode;
	/**
	 * Currency code of the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardCurrencyCode
	 * PaymentCard7.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardCurrencyCode
	 * PaymentCard8.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCurrencyCode
	 * PaymentCard14.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard17#mmCardCurrencyCode
	 * PaymentCard17.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#mmCardCurrencyCode
	 * PaymentCard23.mmCardCurrencyCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardCurrencyCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard7.mmCardCurrencyCode, PaymentCard8.mmCardCurrencyCode, PaymentCard14.mmCardCurrencyCode, PaymentCard17.mmCardCurrencyCode, PaymentCard23.mmCardCurrencyCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Interest interest;
	/**
	 * Interest applied on amounts due for credit card payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
	 * Interest.mmRelatedPaymentCard}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest applied on amounts due for credit card payments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Country cardCountryCode;
	/**
	 * Country code attached to the card by the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
	 * Country.mmRelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard4#mmCardCountryCode
	 * PaymentCard4.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard3#mmCardCountryCode
	 * PaymentCard3.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardCountryCode
	 * PaymentCard6.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard1#mmCardCountryCode
	 * PaymentCard1.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard5#mmCardCountryCode
	 * PaymentCard5.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard7#mmCardCountryCode
	 * PaymentCard7.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardCountryCode
	 * PaymentCard8.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardCountryCode
	 * PaymentCard9.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard11#mmCardCountryCode
	 * PaymentCard11.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCountryCode
	 * PaymentCard12.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCountryCode
	 * PaymentCard14.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard16#mmCardCountryCode
	 * PaymentCard16.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard17#mmCardCountryCode
	 * PaymentCard17.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard20#mmCardCountryCode
	 * PaymentCard20.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard21#mmCardCountryCode
	 * PaymentCard21.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#mmCardCountryCode
	 * PaymentCard23.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard22#mmCardCountryCode
	 * PaymentCard22.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard26#mmCardCountryCode
	 * PaymentCard26.mmCardCountryCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCardCountryCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard4.mmCardCountryCode, PaymentCard3.mmCardCountryCode, PaymentCard6.mmCardCountryCode, PaymentCard1.mmCardCountryCode, PaymentCard5.mmCardCountryCode,
					PaymentCard7.mmCardCountryCode, PaymentCard8.mmCardCountryCode, PaymentCard9.mmCardCountryCode, PaymentCard11.mmCardCountryCode, PaymentCard12.mmCardCountryCode, PaymentCard14.mmCardCountryCode,
					PaymentCard16.mmCardCountryCode, PaymentCard17.mmCardCountryCode, PaymentCard20.mmCardCountryCode, PaymentCard21.mmCardCountryCode, PaymentCard23.mmCardCountryCode, PaymentCard22.mmCardCountryCode,
					PaymentCard26.mmCardCountryCode);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardCountryCode";
			definition = "Country code attached to the card by the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected Max35Text cardProgramme;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmCardProgrammeProposed
	 * CardPaymentTransaction71.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmCardProgrammeApplied
	 * CardPaymentTransaction71.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard26#mmCardProductSubType
	 * PaymentCard26.mmCardProductSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmCardProgrammeProposed
	 * CardPaymentTransaction75.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmCardProgrammeApplied
	 * CardPaymentTransaction75.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard27#mmCardProductSubType
	 * PaymentCard27.mmCardProductSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmCardProgrammeProposed
	 * CardPaymentTransaction74.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmCardProgrammeApplied
	 * CardPaymentTransaction74.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmCardProgrammeProposed
	 * CardPaymentTransaction70.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmCardProgrammeApplied
	 * CardPaymentTransaction70.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmCardProgrammeProposed
	 * CardPaymentTransaction76.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmCardProgrammeApplied
	 * CardPaymentTransaction76.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmCardProgrammeProposed
	 * CardPaymentTransaction69.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmCardProgrammeApplied
	 * CardPaymentTransaction69.mmCardProgrammeApplied}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardProgramme = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction71.mmCardProgrammeProposed, CardPaymentTransaction71.mmCardProgrammeApplied, PaymentCard26.mmCardProductSubType, CardPaymentTransaction75.mmCardProgrammeProposed,
					CardPaymentTransaction75.mmCardProgrammeApplied, PaymentCard27.mmCardProductSubType, CardPaymentTransaction74.mmCardProgrammeProposed, CardPaymentTransaction74.mmCardProgrammeApplied,
					CardPaymentTransaction70.mmCardProgrammeProposed, CardPaymentTransaction70.mmCardProgrammeApplied, CardPaymentTransaction76.mmCardProgrammeProposed, CardPaymentTransaction76.mmCardProgrammeApplied,
					CardPaymentTransaction69.mmCardProgrammeProposed, CardPaymentTransaction69.mmCardProgrammeApplied);
			elementContext_lazy = () -> PaymentCard.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardProgramme";
			definition = "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmRelatedPaymentCard, com.tools20022.repository.entity.CashAccount.mmRelatedPaymentCard,
						com.tools20022.repository.entity.CardPayment.mmPaymentCard, com.tools20022.repository.entity.Limit.mmRelatedPaymentCard, com.tools20022.repository.entity.Interest.mmRelatedPaymentCard);
				derivationElement_lazy = () -> Arrays.asList(PlainCardData1.mmTrackData, PlainCardData1.mmCardSecurityCode, PaymentCard4.mmPlainCardData, TransactionData1.mmCardData, PlainCardData2.mmTrackData,
						PaymentCard3.mmPlainCardData, PaymentCard6.mmPlainCardData, PaymentCard1.mmPlainCardData, PaymentCard5.mmPlainCardData, PaymentCard7.mmPlainCardData, PlainCardData4.mmEffectiveDate, PlainCardData4.mmExpiryDate,
						PlainCardData4.mmTrackData, PlainCardData4.mmCardSecurityCode, PaymentCard8.mmPlainCardData, PlainCardData6.mmEffectiveDate, PlainCardData6.mmExpiryDate, PlainCardData6.mmTrackData, PlainCardData5.mmEffectiveDate,
						PlainCardData5.mmExpiryDate, PaymentCard10.mmPlainCardData, PlainCardData7.mmEffectiveDate, PlainCardData7.mmExpiryDate, PlainCardData7.mmTrackData, PlainCardData9.mmEffectiveDate, PlainCardData9.mmExpiryDate,
						PlainCardData9.mmTrackData, PlainCardData11.mmEffectiveDate, PlainCardData11.mmExpiryDate, PlainCardData10.mmEffectiveDate, PlainCardData10.mmExpiryDate, PlainCardData10.mmTrackData, PlainCardData12.mmExpiryDate,
						PlainCardData14.mmEffectiveDate, PlainCardData14.mmExpiryDate, PlainCardData13.mmEffectiveDate, PlainCardData13.mmExpiryDate, PaymentCard19.mmPlainCardData, PlainCardData16.mmEffectiveDate,
						PlainCardData16.mmExpiryDate, PlainCardData15.mmEffectiveDate, PlainCardData15.mmExpiryDate, PlainCardData18.mmEffectiveDate, PlainCardData18.mmExpiryDate, PlainCardData19.mmEffectiveDate,
						PlainCardData19.mmExpiryDate, PaymentCard27.mmPlainCardData);
				element_lazy = () -> Arrays.asList(PaymentCard.mmPayment, PaymentCard.mmType, PaymentCard.mmNumber, PaymentCard.mmStartDate, PaymentCard.mmExpiryDate, PaymentCard.mmSecurityCode, PaymentCard.mmSequenceNumber,
						PaymentCard.mmServiceCode, PaymentCard.mmTrackValue, PaymentCard.mmSecurityCodeManagement, PaymentCard.mmCardBrand, PaymentCard.mmRelatedAccount, PaymentCard.mmProfileNumber, PaymentCard.mmRelatedAccountType,
						PaymentCard.mmCreditAvailableAmount, PaymentCard.mmLimit, PaymentCard.mmCardCurrencyCode, PaymentCard.mmInterest, PaymentCard.mmCardCountryCode, PaymentCard.mmCardProgramme);
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

	public CardPayment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.CardPayment payment) {
		this.payment = payment;
	}

	public CardTypeCode getType() {
		return type;
	}

	public void setType(CardTypeCode type) {
		this.type = type;
	}

	public Max35Text getNumber() {
		return number;
	}

	public void setNumber(Max35Text number) {
		this.number = number;
	}

	public ISOYearMonth getStartDate() {
		return startDate;
	}

	public void setStartDate(ISOYearMonth startDate) {
		this.startDate = startDate;
	}

	public ISOYearMonth getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISOYearMonth expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Max35Text getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(Max35Text securityCode) {
		this.securityCode = securityCode;
	}

	public Max35Text getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Exact3NumericText getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(Exact3NumericText serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Max140Text getTrackValue() {
		return trackValue;
	}

	public void setTrackValue(Max140Text trackValue) {
		this.trackValue = trackValue;
	}

	public CSCManagementCode getSecurityCodeManagement() {
		return securityCodeManagement;
	}

	public void setSecurityCodeManagement(CSCManagementCode securityCodeManagement) {
		this.securityCodeManagement = securityCodeManagement;
	}

	public Max35Text getCardBrand() {
		return cardBrand;
	}

	public void setCardBrand(Max35Text cardBrand) {
		this.cardBrand = cardBrand;
	}

	public List<CashAccount> getRelatedAccount() {
		return relatedAccount;
	}

	public void setRelatedAccount(List<com.tools20022.repository.entity.CashAccount> relatedAccount) {
		this.relatedAccount = relatedAccount;
	}

	public Max5NumericText getProfileNumber() {
		return profileNumber;
	}

	public void setProfileNumber(Max5NumericText profileNumber) {
		this.profileNumber = profileNumber;
	}

	public CardAccountTypeCode getRelatedAccountType() {
		return relatedAccountType;
	}

	public void setRelatedAccountType(CardAccountTypeCode relatedAccountType) {
		this.relatedAccountType = relatedAccountType;
	}

	public CurrencyAndAmount getCreditAvailableAmount() {
		return creditAvailableAmount;
	}

	public void setCreditAvailableAmount(CurrencyAndAmount creditAvailableAmount) {
		this.creditAvailableAmount = creditAvailableAmount;
	}

	public List<Limit> getLimit() {
		return limit;
	}

	public void setLimit(List<com.tools20022.repository.entity.Limit> limit) {
		this.limit = limit;
	}

	public CurrencyCode getCardCurrencyCode() {
		return cardCurrencyCode;
	}

	public void setCardCurrencyCode(CurrencyCode cardCurrencyCode) {
		this.cardCurrencyCode = cardCurrencyCode;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = interest;
	}

	public Country getCardCountryCode() {
		return cardCountryCode;
	}

	public void setCardCountryCode(com.tools20022.repository.entity.Country cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
	}

	public Max35Text getCardProgramme() {
		return cardProgramme;
	}

	public void setCardProgramme(Max35Text cardProgramme) {
		this.cardProgramme = cardProgramme;
	}
}