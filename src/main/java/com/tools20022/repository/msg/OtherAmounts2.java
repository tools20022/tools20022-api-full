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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies other amounts pertaining to the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmAccruedInterestAmount
 * OtherAmounts2.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmChargesFees
 * OtherAmounts2.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmCountryNationalFederalTax
 * OtherAmounts2.mmCountryNationalFederalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmPaymentLevyTax
 * OtherAmounts2.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmLocalTax
 * OtherAmounts2.mmLocalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmOther
 * OtherAmounts2.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmPostageAmount
 * OtherAmounts2.mmPostageAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmRegulatoryAmount
 * OtherAmounts2.mmRegulatoryAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmShippingAmount
 * OtherAmounts2.mmShippingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmStampDuty
 * OtherAmounts2.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmStockExchangeTax
 * OtherAmounts2.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmTransferTax
 * OtherAmounts2.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmTransactionTax
 * OtherAmounts2.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmValueAddedTax
 * OtherAmounts2.mmValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmWithholdingTax
 * OtherAmounts2.mmWithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2#mmConsumptionTax
 * OtherAmounts2.mmConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmAccruedCapitalisationAmount
 * OtherAmounts2.mmAccruedCapitalisationAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherAmounts2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies other amounts pertaining to the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts15 OtherAmounts15}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OtherAmounts2", propOrder = {"accruedInterestAmount", "chargesFees", "countryNationalFederalTax", "paymentLevyTax", "localTax", "other", "postageAmount", "regulatoryAmount", "shippingAmount", "stampDuty",
		"stockExchangeTax", "transferTax", "transactionTax", "valueAddedTax", "withholdingTax", "consumptionTax", "accruedCapitalisationAmount"})
public class OtherAmounts2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection9 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between coupon payment periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 chargesFees;
	/**
	 * Amount of money paid for the provision of financial services that cannot
	 * be categorised by another qualifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 countryNationalFederalTax;
	/**
	 * Amount of country, national or federal tax charged by the jurisdiction in
	 * which the account servicer is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryNtlFdrlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryNationalFederalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryNationalFederalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 paymentLevyTax;
	/**
	 * Amount of payment levy tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtLevyTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentLevyTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of payment levy tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentLevyTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 localTax;
	/**
	 * Tax charged by the jurisdiction in which the financial instrument
	 * settles.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax charged by the jurisdiction in which the financial instrument settles."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 other;
	/**
	 * An amount that is not indicated by a known business denomination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An amount that is not indicated by a known business denomination."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOther = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 postageAmount;
	/**
	 * Amount of money paid for delivery by regular post mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
	 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid for delivery by regular post mail."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostageAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmPostageFeeAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "PstgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 regulatoryAmount;
	/**
	 * Amount of money charged by a regulatory authority, for example,
	 * Securities and Exchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegulatoryAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 shippingAmount;
	/**
	 * Amount of money (including insurance) paid for delivery by carrier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShippingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ShppgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 stampDuty;
	/**
	 * Amount of stamp duty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDuty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 stockExchangeTax;
	/**
	 * Amount of stock exchange tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stock exchange tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStockExchangeTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 transferTax;
	/**
	 * Amount of tax levied on a transfer of ownership of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of tax levied on a transfer of ownership of financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 transactionTax;
	/**
	 * Amount of transaction tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of transaction tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 valueAddedTax;
	/**
	 * Amount of value-added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of value-added tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 withholdingTax;
	/**
	 * Amount of money that will be withheld by a tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 consumptionTax;
	/**
	 * Amount of consumption tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CsmptnTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of consumption tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConsumptionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Amount of consumption tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 accruedCapitalisationAmount;
	/**
	 * Amount of unpaid interest (on bonds which have defaulted and have
	 * subsequently restructured), which is capitalized and added to the
	 * original principal amount of the bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
	 * Debt.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdCptlstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedCapitalisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedCapitalisationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAccruedCapitalisationAmount;
			componentContext_lazy = () -> OtherAmounts2.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherAmounts2.mmAccruedInterestAmount, OtherAmounts2.mmChargesFees, OtherAmounts2.mmCountryNationalFederalTax, OtherAmounts2.mmPaymentLevyTax, OtherAmounts2.mmLocalTax,
						OtherAmounts2.mmOther, OtherAmounts2.mmPostageAmount, OtherAmounts2.mmRegulatoryAmount, OtherAmounts2.mmShippingAmount, OtherAmounts2.mmStampDuty, OtherAmounts2.mmStockExchangeTax, OtherAmounts2.mmTransferTax,
						OtherAmounts2.mmTransactionTax, OtherAmounts2.mmValueAddedTax, OtherAmounts2.mmWithholdingTax, OtherAmounts2.mmConsumptionTax, OtherAmounts2.mmAccruedCapitalisationAmount);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OtherAmounts2";
				definition = "Identifies other amounts pertaining to the transaction.";
				nextVersions_lazy = () -> Arrays.asList(OtherAmounts15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public AmountAndDirection9 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection9 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "ChrgsFees")
	public AmountAndDirection9 getChargesFees() {
		return chargesFees;
	}

	public void setChargesFees(com.tools20022.repository.msg.AmountAndDirection9 chargesFees) {
		this.chargesFees = chargesFees;
	}

	@XmlElement(name = "CtryNtlFdrlTax")
	public AmountAndDirection9 getCountryNationalFederalTax() {
		return countryNationalFederalTax;
	}

	public void setCountryNationalFederalTax(com.tools20022.repository.msg.AmountAndDirection9 countryNationalFederalTax) {
		this.countryNationalFederalTax = countryNationalFederalTax;
	}

	@XmlElement(name = "PmtLevyTax")
	public AmountAndDirection9 getPaymentLevyTax() {
		return paymentLevyTax;
	}

	public void setPaymentLevyTax(com.tools20022.repository.msg.AmountAndDirection9 paymentLevyTax) {
		this.paymentLevyTax = paymentLevyTax;
	}

	@XmlElement(name = "LclTax")
	public AmountAndDirection9 getLocalTax() {
		return localTax;
	}

	public void setLocalTax(com.tools20022.repository.msg.AmountAndDirection9 localTax) {
		this.localTax = localTax;
	}

	@XmlElement(name = "Othr")
	public AmountAndDirection9 getOther() {
		return other;
	}

	public void setOther(com.tools20022.repository.msg.AmountAndDirection9 other) {
		this.other = other;
	}

	@XmlElement(name = "PstgAmt")
	public AmountAndDirection9 getPostageAmount() {
		return postageAmount;
	}

	public void setPostageAmount(com.tools20022.repository.msg.AmountAndDirection9 postageAmount) {
		this.postageAmount = postageAmount;
	}

	@XmlElement(name = "RgltryAmt")
	public AmountAndDirection9 getRegulatoryAmount() {
		return regulatoryAmount;
	}

	public void setRegulatoryAmount(com.tools20022.repository.msg.AmountAndDirection9 regulatoryAmount) {
		this.regulatoryAmount = regulatoryAmount;
	}

	@XmlElement(name = "ShppgAmt")
	public AmountAndDirection9 getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(com.tools20022.repository.msg.AmountAndDirection9 shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	@XmlElement(name = "StmpDty")
	public AmountAndDirection9 getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(com.tools20022.repository.msg.AmountAndDirection9 stampDuty) {
		this.stampDuty = stampDuty;
	}

	@XmlElement(name = "StockXchgTax")
	public AmountAndDirection9 getStockExchangeTax() {
		return stockExchangeTax;
	}

	public void setStockExchangeTax(com.tools20022.repository.msg.AmountAndDirection9 stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
	}

	@XmlElement(name = "TrfTax")
	public AmountAndDirection9 getTransferTax() {
		return transferTax;
	}

	public void setTransferTax(com.tools20022.repository.msg.AmountAndDirection9 transferTax) {
		this.transferTax = transferTax;
	}

	@XmlElement(name = "TxTax")
	public AmountAndDirection9 getTransactionTax() {
		return transactionTax;
	}

	public void setTransactionTax(com.tools20022.repository.msg.AmountAndDirection9 transactionTax) {
		this.transactionTax = transactionTax;
	}

	@XmlElement(name = "ValAddedTax")
	public AmountAndDirection9 getValueAddedTax() {
		return valueAddedTax;
	}

	public void setValueAddedTax(com.tools20022.repository.msg.AmountAndDirection9 valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
	}

	@XmlElement(name = "WhldgTax")
	public AmountAndDirection9 getWithholdingTax() {
		return withholdingTax;
	}

	public void setWithholdingTax(com.tools20022.repository.msg.AmountAndDirection9 withholdingTax) {
		this.withholdingTax = withholdingTax;
	}

	@XmlElement(name = "CsmptnTax")
	public AmountAndDirection9 getConsumptionTax() {
		return consumptionTax;
	}

	public void setConsumptionTax(com.tools20022.repository.msg.AmountAndDirection9 consumptionTax) {
		this.consumptionTax = consumptionTax;
	}

	@XmlElement(name = "AcrdCptlstnAmt")
	public AmountAndDirection9 getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount;
	}

	public void setAccruedCapitalisationAmount(com.tools20022.repository.msg.AmountAndDirection9 accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = accruedCapitalisationAmount;
	}
}