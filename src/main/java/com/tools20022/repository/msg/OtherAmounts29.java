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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmAccruedInterestAmount
 * OtherAmounts29.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmChargesFees
 * OtherAmounts29.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmCountryNationalFederalTax
 * OtherAmounts29.mmCountryNationalFederalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmPaymentLevyTax
 * OtherAmounts29.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmLocalTax
 * OtherAmounts29.mmLocalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmOther
 * OtherAmounts29.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmRegulatoryAmount
 * OtherAmounts29.mmRegulatoryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmShippingAmount
 * OtherAmounts29.mmShippingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmStampDuty
 * OtherAmounts29.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmStockExchangeTax
 * OtherAmounts29.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmTransferTax
 * OtherAmounts29.mmTransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmTransactionTax
 * OtherAmounts29.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29#mmValueAddedTax
 * OtherAmounts29.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmWithholdingTax
 * OtherAmounts29.mmWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmConsumptionTax
 * OtherAmounts29.mmConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmAccruedCapitalisationAmount
 * OtherAmounts29.mmAccruedCapitalisationAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "OtherAmounts29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies other amounts pertaining to the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.OtherAmounts15
 * OtherAmounts15}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherAmounts29", propOrder = {"accruedInterestAmount", "chargesFees", "countryNationalFederalTax", "paymentLevyTax", "localTax", "other", "regulatoryAmount", "shippingAmount", "stampDuty", "stockExchangeTax",
		"transferTax", "transactionTax", "valueAddedTax", "withholdingTax", "consumptionTax", "accruedCapitalisationAmount"})
public class OtherAmounts29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection44 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmAccruedInterestAmount
	 * OtherAmounts15.mmAccruedInterestAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			previousVersion_lazy = () -> OtherAmounts15.mmAccruedInterestAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected AmountAndDirection44 chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::CHAR</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmChargesFees
	 * OtherAmounts15.mmChargesFees}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			previousVersion_lazy = () -> OtherAmounts15.mmChargesFees;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "CtryNtlFdrlTax")
	protected AmountAndDirection44 countryNationalFederalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryNtlFdrlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::COUN</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmCountryNationalFederalTax
	 * OtherAmounts15.mmCountryNationalFederalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryNationalFederalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COUN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			previousVersion_lazy = () -> OtherAmounts15.mmCountryNationalFederalTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "PmtLevyTax")
	protected AmountAndDirection44 paymentLevyTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtLevyTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LEVY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentLevyTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of payment levy tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmPaymentLevyTax
	 * OtherAmounts15.mmPaymentLevyTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentLevyTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LEVY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			previousVersion_lazy = () -> OtherAmounts15.mmPaymentLevyTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "LclTax")
	protected AmountAndDirection44 localTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmLocalTax
	 * OtherAmounts15.mmLocalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			previousVersion_lazy = () -> OtherAmounts15.mmLocalTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "Othr")
	protected AmountAndDirection44 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::OTHR</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmOther
	 * OtherAmounts15.mmOther}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOther = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::OTHR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			previousVersion_lazy = () -> OtherAmounts15.mmOther;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "RgltryAmt")
	protected AmountAndDirection44 regulatoryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::REGF</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmRegulatoryAmount
	 * OtherAmounts15.mmRegulatoryAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegulatoryAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			previousVersion_lazy = () -> OtherAmounts15.mmRegulatoryAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "ShppgAmt")
	protected AmountAndDirection44 shippingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SHIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmShippingAmount
	 * OtherAmounts15.mmShippingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShippingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "ShppgAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAmount";
			definition = "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services.";
			previousVersion_lazy = () -> OtherAmounts15.mmShippingAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "StmpDty")
	protected AmountAndDirection44 stampDuty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::STAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmStampDuty
	 * OtherAmounts15.mmStampDuty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDuty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			previousVersion_lazy = () -> OtherAmounts15.mmStampDuty;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "StockXchgTax")
	protected AmountAndDirection44 stockExchangeTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::STEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stock exchange tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmStockExchangeTax
	 * OtherAmounts15.mmStockExchangeTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStockExchangeTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			previousVersion_lazy = () -> OtherAmounts15.mmStockExchangeTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "TrfTax")
	protected AmountAndDirection44 transferTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRAN</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmTransferTax
	 * OtherAmounts15.mmTransferTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			previousVersion_lazy = () -> OtherAmounts15.mmTransferTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "TxTax")
	protected AmountAndDirection44 transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of transaction tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmTransactionTax
	 * OtherAmounts15.mmTransactionTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			previousVersion_lazy = () -> OtherAmounts15.mmTransactionTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "ValAddedTax")
	protected AmountAndDirection44 valueAddedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::VATA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of value-added tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmValueAddedTax
	 * OtherAmounts15.mmValueAddedTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::VATA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			previousVersion_lazy = () -> OtherAmounts15.mmValueAddedTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "WhldgTax")
	protected AmountAndDirection44 withholdingTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::WITH</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmWithholdingTax
	 * OtherAmounts15.mmWithholdingTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::WITH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			previousVersion_lazy = () -> OtherAmounts15.mmWithholdingTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "CsmptnTax")
	protected AmountAndDirection44 consumptionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CsmptnTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::COAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of consumption tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmConsumptionTax
	 * OtherAmounts15.mmConsumptionTax}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConsumptionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Amount of consumption tax.";
			previousVersion_lazy = () -> OtherAmounts15.mmConsumptionTax;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "AcrdCptlstnAmt")
	protected AmountAndDirection44 accruedCapitalisationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
	 * Debt.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdCptlstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmAccruedCapitalisationAmount
	 * OtherAmounts15.mmAccruedCapitalisationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedCapitalisationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAccruedCapitalisationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts29.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			previousVersion_lazy = () -> OtherAmounts15.mmAccruedCapitalisationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts29.mmAccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts29.mmChargesFees,
						com.tools20022.repository.msg.OtherAmounts29.mmCountryNationalFederalTax, com.tools20022.repository.msg.OtherAmounts29.mmPaymentLevyTax, com.tools20022.repository.msg.OtherAmounts29.mmLocalTax,
						com.tools20022.repository.msg.OtherAmounts29.mmOther, com.tools20022.repository.msg.OtherAmounts29.mmRegulatoryAmount, com.tools20022.repository.msg.OtherAmounts29.mmShippingAmount,
						com.tools20022.repository.msg.OtherAmounts29.mmStampDuty, com.tools20022.repository.msg.OtherAmounts29.mmStockExchangeTax, com.tools20022.repository.msg.OtherAmounts29.mmTransferTax,
						com.tools20022.repository.msg.OtherAmounts29.mmTransactionTax, com.tools20022.repository.msg.OtherAmounts29.mmValueAddedTax, com.tools20022.repository.msg.OtherAmounts29.mmWithholdingTax,
						com.tools20022.repository.msg.OtherAmounts29.mmConsumptionTax, com.tools20022.repository.msg.OtherAmounts29.mmAccruedCapitalisationAmount);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherAmounts29";
				definition = "Identifies other amounts pertaining to the transaction.";
				previousVersion_lazy = () -> OtherAmounts15.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection44> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public OtherAmounts29 setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection44 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection44> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public OtherAmounts29 setChargesFees(com.tools20022.repository.msg.AmountAndDirection44 chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<AmountAndDirection44> getCountryNationalFederalTax() {
		return countryNationalFederalTax == null ? Optional.empty() : Optional.of(countryNationalFederalTax);
	}

	public OtherAmounts29 setCountryNationalFederalTax(com.tools20022.repository.msg.AmountAndDirection44 countryNationalFederalTax) {
		this.countryNationalFederalTax = countryNationalFederalTax;
		return this;
	}

	public Optional<AmountAndDirection44> getPaymentLevyTax() {
		return paymentLevyTax == null ? Optional.empty() : Optional.of(paymentLevyTax);
	}

	public OtherAmounts29 setPaymentLevyTax(com.tools20022.repository.msg.AmountAndDirection44 paymentLevyTax) {
		this.paymentLevyTax = paymentLevyTax;
		return this;
	}

	public Optional<AmountAndDirection44> getLocalTax() {
		return localTax == null ? Optional.empty() : Optional.of(localTax);
	}

	public OtherAmounts29 setLocalTax(com.tools20022.repository.msg.AmountAndDirection44 localTax) {
		this.localTax = localTax;
		return this;
	}

	public Optional<AmountAndDirection44> getOther() {
		return other == null ? Optional.empty() : Optional.of(other);
	}

	public OtherAmounts29 setOther(com.tools20022.repository.msg.AmountAndDirection44 other) {
		this.other = other;
		return this;
	}

	public Optional<AmountAndDirection44> getRegulatoryAmount() {
		return regulatoryAmount == null ? Optional.empty() : Optional.of(regulatoryAmount);
	}

	public OtherAmounts29 setRegulatoryAmount(com.tools20022.repository.msg.AmountAndDirection44 regulatoryAmount) {
		this.regulatoryAmount = regulatoryAmount;
		return this;
	}

	public Optional<AmountAndDirection44> getShippingAmount() {
		return shippingAmount == null ? Optional.empty() : Optional.of(shippingAmount);
	}

	public OtherAmounts29 setShippingAmount(com.tools20022.repository.msg.AmountAndDirection44 shippingAmount) {
		this.shippingAmount = shippingAmount;
		return this;
	}

	public Optional<AmountAndDirection44> getStampDuty() {
		return stampDuty == null ? Optional.empty() : Optional.of(stampDuty);
	}

	public OtherAmounts29 setStampDuty(com.tools20022.repository.msg.AmountAndDirection44 stampDuty) {
		this.stampDuty = stampDuty;
		return this;
	}

	public Optional<AmountAndDirection44> getStockExchangeTax() {
		return stockExchangeTax == null ? Optional.empty() : Optional.of(stockExchangeTax);
	}

	public OtherAmounts29 setStockExchangeTax(com.tools20022.repository.msg.AmountAndDirection44 stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
		return this;
	}

	public Optional<AmountAndDirection44> getTransferTax() {
		return transferTax == null ? Optional.empty() : Optional.of(transferTax);
	}

	public OtherAmounts29 setTransferTax(com.tools20022.repository.msg.AmountAndDirection44 transferTax) {
		this.transferTax = transferTax;
		return this;
	}

	public Optional<AmountAndDirection44> getTransactionTax() {
		return transactionTax == null ? Optional.empty() : Optional.of(transactionTax);
	}

	public OtherAmounts29 setTransactionTax(com.tools20022.repository.msg.AmountAndDirection44 transactionTax) {
		this.transactionTax = transactionTax;
		return this;
	}

	public Optional<AmountAndDirection44> getValueAddedTax() {
		return valueAddedTax == null ? Optional.empty() : Optional.of(valueAddedTax);
	}

	public OtherAmounts29 setValueAddedTax(com.tools20022.repository.msg.AmountAndDirection44 valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
		return this;
	}

	public Optional<AmountAndDirection44> getWithholdingTax() {
		return withholdingTax == null ? Optional.empty() : Optional.of(withholdingTax);
	}

	public OtherAmounts29 setWithholdingTax(com.tools20022.repository.msg.AmountAndDirection44 withholdingTax) {
		this.withholdingTax = withholdingTax;
		return this;
	}

	public Optional<AmountAndDirection44> getConsumptionTax() {
		return consumptionTax == null ? Optional.empty() : Optional.of(consumptionTax);
	}

	public OtherAmounts29 setConsumptionTax(com.tools20022.repository.msg.AmountAndDirection44 consumptionTax) {
		this.consumptionTax = consumptionTax;
		return this;
	}

	public Optional<AmountAndDirection44> getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount == null ? Optional.empty() : Optional.of(accruedCapitalisationAmount);
	}

	public OtherAmounts29 setAccruedCapitalisationAmount(com.tools20022.repository.msg.AmountAndDirection44 accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = accruedCapitalisationAmount;
		return this;
	}
}