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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection17;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmAccruedInterestAmount
 * OtherAmounts7.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmChargesFees
 * OtherAmounts7.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmCountryNationalFederalTax
 * OtherAmounts7.mmCountryNationalFederalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmTradeAmount
 * OtherAmounts7.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmExecutingBrokerAmount
 * OtherAmounts7.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmIssueDiscountAllowance
 * OtherAmounts7.mmIssueDiscountAllowance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmPaymentLevyTax
 * OtherAmounts7.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmLocalTax
 * OtherAmounts7.mmLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmLocalBrokerCommission
 * OtherAmounts7.mmLocalBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmMargin
 * OtherAmounts7.mmMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmOther
 * OtherAmounts7.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmPostageAmount
 * OtherAmounts7.mmPostageAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmRegulatoryAmount
 * OtherAmounts7.mmRegulatoryAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmShippingAmount
 * OtherAmounts7.mmShippingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmSpecialConcession
 * OtherAmounts7.mmSpecialConcession}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmStampDuty
 * OtherAmounts7.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmStockExchangeTax
 * OtherAmounts7.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmTransferTax
 * OtherAmounts7.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmTransactionTax
 * OtherAmounts7.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmValueAddedTax
 * OtherAmounts7.mmValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmWithholdingTax
 * OtherAmounts7.mmWithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmNetGainLoss
 * OtherAmounts7.mmNetGainLoss}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmConsumptionTax
 * OtherAmounts7.mmConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmAccruedCapitalisationAmount
 * OtherAmounts7.mmAccruedCapitalisationAmount}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherAmounts7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies other amounts pertaining to the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forOtherAmounts7
 * ConstraintCoexistenceAmountRule.forOtherAmounts7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherAmounts7", propOrder = {"accruedInterestAmount", "chargesFees", "countryNationalFederalTax", "tradeAmount", "executingBrokerAmount", "issueDiscountAllowance", "paymentLevyTax", "localTax", "localBrokerCommission",
		"margin", "other", "postageAmount", "regulatoryAmount", "shippingAmount", "specialConcession", "stampDuty", "stockExchangeTax", "transferTax", "transactionTax", "valueAddedTax", "withholdingTax", "netGainLoss", "consumptionTax",
		"accruedCapitalisationAmount"})
public class OtherAmounts7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection17 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmAccruedInterestAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected AmountAndDirection17 chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsFees"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmChargesFees = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getChargesFees();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setChargesFees(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryNtlFdrlTax")
	protected AmountAndDirection17 countryNationalFederalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryNtlFdrlTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryNationalFederalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::COUN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmCountryNationalFederalTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COUN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getCountryNationalFederalTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setCountryNationalFederalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "TradAmt")
	protected AmountAndDirection17 tradeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal amount of a trade (price multiplied by quantity)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmTradeAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "TradAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getTradeAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setTradeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctgBrkrAmt")
	protected AmountAndDirection17 executingBrokerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBrokerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to an executing broker as a commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::EXEC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmExecutingBrokerAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::EXEC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getExecutingBrokerAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setExecutingBrokerAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDscntAllwnc")
	protected AmountAndDirection17 issueDiscountAllowance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDiscountAllowance
	 * Issuance.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDscntAllwnc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDiscountAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money defined as a discount on a new issue or on a tranche of an existing issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ISDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmIssueDiscountAllowance = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDiscountAllowance;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "IsseDscntAllwnc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ISDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Amount of money defined as a discount on a new issue or on a tranche of an existing issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getIssueDiscountAllowance();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setIssueDiscountAllowance(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtLevyTax")
	protected AmountAndDirection17 paymentLevyTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtLevyTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentLevyTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of payment levy tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LEVY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmPaymentLevyTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LEVY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getPaymentLevyTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setPaymentLevyTax(value.orElse(null));
		}
	};
	@XmlElement(name = "LclTax")
	protected AmountAndDirection17 localTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax charged by the jurisdiction in which the financial instrument settles."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmLocalTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getLocalTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setLocalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "LclBrkrComssn")
	protected AmountAndDirection17 localBrokerCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of commission paid to a local broker."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmLocalBrokerCommission = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getLocalBrokerCommission();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setLocalBrokerCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "Mrgn")
	protected AmountAndDirection17 margin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money deposited by the trading party in a margin account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::MARG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmMargin = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "Mrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::MARG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Amount of money deposited by the trading party in a margin account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getMargin();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected AmountAndDirection17 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An amount that is not indicated by a known business denomination."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::OTHR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmOther = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::OTHR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setOther(value.orElse(null));
		}
	};
	@XmlElement(name = "PstgAmt")
	protected AmountAndDirection17 postageAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
	 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstgAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid for delivery by regular post mail."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::POST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmPostageAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmPostageFeeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "PstgAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getPostageAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setPostageAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryAmt")
	protected AmountAndDirection17 regulatoryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::REGF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmRegulatoryAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getRegulatoryAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setRegulatoryAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ShppgAmt")
	protected AmountAndDirection17 shippingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SHIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmShippingAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "ShppgAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getShippingAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setShippingAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SpclCncssn")
	protected AmountAndDirection17 specialConcession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmSpecialConcessionAmount
	 * ProceedsDefinition.mmSpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclCncssn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of drawdown or other reduction from or in addition to the deal price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SPCN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmSpecialConcession = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmSpecialConcessionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "SpclCncssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SPCN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcession";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getSpecialConcession();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setSpecialConcession(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDty")
	protected AmountAndDirection17 stampDuty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::STAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmStampDuty = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getStampDuty();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setStampDuty(value.orElse(null));
		}
	};
	@XmlElement(name = "StockXchgTax")
	protected AmountAndDirection17 stockExchangeTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchgTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stock exchange tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::STEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmStockExchangeTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getStockExchangeTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setStockExchangeTax(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfTax")
	protected AmountAndDirection17 transferTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of tax levied on a transfer of ownership of financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmTransferTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getTransferTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setTransferTax(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTax")
	protected AmountAndDirection17 transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of transaction tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmTransactionTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getTransactionTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setTransactionTax(value.orElse(null));
		}
	};
	@XmlElement(name = "ValAddedTax")
	protected AmountAndDirection17 valueAddedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of value-added tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::VATA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmValueAddedTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::VATA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getValueAddedTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setValueAddedTax(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTax")
	protected AmountAndDirection17 withholdingTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that will be withheld by a tax authority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::WITH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmWithholdingTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::WITH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getWithholdingTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setWithholdingTax(value.orElse(null));
		}
	};
	@XmlElement(name = "NetGnLoss")
	protected AmountAndDirection17 netGainLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNetGainLoss
	 * SecuritiesBalance.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetGnLoss"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetGainLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ANTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmNetGainLoss = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmNetGainLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "NetGnLoss";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ANTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getNetGainLoss();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setNetGainLoss(value.orElse(null));
		}
	};
	@XmlElement(name = "CsmptnTax")
	protected AmountAndDirection17 consumptionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CsmptnTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of consumption tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::COAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmConsumptionTax = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Amount of consumption tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getConsumptionTax();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setConsumptionTax(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdCptlstnAmt")
	protected AmountAndDirection17 accruedCapitalisationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection17
	 * AmountAndDirection17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
	 * Debt.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdCptlstnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedCapitalisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>> mmAccruedCapitalisationAmount = new MMMessageAssociationEnd<OtherAmounts7, Optional<AmountAndDirection17>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmAccruedCapitalisationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts7.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection17.mmObject();
		}

		@Override
		public Optional<AmountAndDirection17> getValue(OtherAmounts7 obj) {
			return obj.getAccruedCapitalisationAmount();
		}

		@Override
		public void setValue(OtherAmounts7 obj, Optional<AmountAndDirection17> value) {
			obj.setAccruedCapitalisationAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts7.mmAccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts7.mmChargesFees,
						com.tools20022.repository.msg.OtherAmounts7.mmCountryNationalFederalTax, com.tools20022.repository.msg.OtherAmounts7.mmTradeAmount, com.tools20022.repository.msg.OtherAmounts7.mmExecutingBrokerAmount,
						com.tools20022.repository.msg.OtherAmounts7.mmIssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts7.mmPaymentLevyTax, com.tools20022.repository.msg.OtherAmounts7.mmLocalTax,
						com.tools20022.repository.msg.OtherAmounts7.mmLocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts7.mmMargin, com.tools20022.repository.msg.OtherAmounts7.mmOther,
						com.tools20022.repository.msg.OtherAmounts7.mmPostageAmount, com.tools20022.repository.msg.OtherAmounts7.mmRegulatoryAmount, com.tools20022.repository.msg.OtherAmounts7.mmShippingAmount,
						com.tools20022.repository.msg.OtherAmounts7.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts7.mmStampDuty, com.tools20022.repository.msg.OtherAmounts7.mmStockExchangeTax,
						com.tools20022.repository.msg.OtherAmounts7.mmTransferTax, com.tools20022.repository.msg.OtherAmounts7.mmTransactionTax, com.tools20022.repository.msg.OtherAmounts7.mmValueAddedTax,
						com.tools20022.repository.msg.OtherAmounts7.mmWithholdingTax, com.tools20022.repository.msg.OtherAmounts7.mmNetGainLoss, com.tools20022.repository.msg.OtherAmounts7.mmConsumptionTax,
						com.tools20022.repository.msg.OtherAmounts7.mmAccruedCapitalisationAmount);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forOtherAmounts7);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OtherAmounts7";
				definition = "Identifies other amounts pertaining to the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection17> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public OtherAmounts7 setAccruedInterestAmount(AmountAndDirection17 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection17> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public OtherAmounts7 setChargesFees(AmountAndDirection17 chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<AmountAndDirection17> getCountryNationalFederalTax() {
		return countryNationalFederalTax == null ? Optional.empty() : Optional.of(countryNationalFederalTax);
	}

	public OtherAmounts7 setCountryNationalFederalTax(AmountAndDirection17 countryNationalFederalTax) {
		this.countryNationalFederalTax = countryNationalFederalTax;
		return this;
	}

	public Optional<AmountAndDirection17> getTradeAmount() {
		return tradeAmount == null ? Optional.empty() : Optional.of(tradeAmount);
	}

	public OtherAmounts7 setTradeAmount(AmountAndDirection17 tradeAmount) {
		this.tradeAmount = tradeAmount;
		return this;
	}

	public Optional<AmountAndDirection17> getExecutingBrokerAmount() {
		return executingBrokerAmount == null ? Optional.empty() : Optional.of(executingBrokerAmount);
	}

	public OtherAmounts7 setExecutingBrokerAmount(AmountAndDirection17 executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
		return this;
	}

	public Optional<AmountAndDirection17> getIssueDiscountAllowance() {
		return issueDiscountAllowance == null ? Optional.empty() : Optional.of(issueDiscountAllowance);
	}

	public OtherAmounts7 setIssueDiscountAllowance(AmountAndDirection17 issueDiscountAllowance) {
		this.issueDiscountAllowance = issueDiscountAllowance;
		return this;
	}

	public Optional<AmountAndDirection17> getPaymentLevyTax() {
		return paymentLevyTax == null ? Optional.empty() : Optional.of(paymentLevyTax);
	}

	public OtherAmounts7 setPaymentLevyTax(AmountAndDirection17 paymentLevyTax) {
		this.paymentLevyTax = paymentLevyTax;
		return this;
	}

	public Optional<AmountAndDirection17> getLocalTax() {
		return localTax == null ? Optional.empty() : Optional.of(localTax);
	}

	public OtherAmounts7 setLocalTax(AmountAndDirection17 localTax) {
		this.localTax = localTax;
		return this;
	}

	public Optional<AmountAndDirection17> getLocalBrokerCommission() {
		return localBrokerCommission == null ? Optional.empty() : Optional.of(localBrokerCommission);
	}

	public OtherAmounts7 setLocalBrokerCommission(AmountAndDirection17 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
		return this;
	}

	public Optional<AmountAndDirection17> getMargin() {
		return margin == null ? Optional.empty() : Optional.of(margin);
	}

	public OtherAmounts7 setMargin(AmountAndDirection17 margin) {
		this.margin = margin;
		return this;
	}

	public Optional<AmountAndDirection17> getOther() {
		return other == null ? Optional.empty() : Optional.of(other);
	}

	public OtherAmounts7 setOther(AmountAndDirection17 other) {
		this.other = other;
		return this;
	}

	public Optional<AmountAndDirection17> getPostageAmount() {
		return postageAmount == null ? Optional.empty() : Optional.of(postageAmount);
	}

	public OtherAmounts7 setPostageAmount(AmountAndDirection17 postageAmount) {
		this.postageAmount = postageAmount;
		return this;
	}

	public Optional<AmountAndDirection17> getRegulatoryAmount() {
		return regulatoryAmount == null ? Optional.empty() : Optional.of(regulatoryAmount);
	}

	public OtherAmounts7 setRegulatoryAmount(AmountAndDirection17 regulatoryAmount) {
		this.regulatoryAmount = regulatoryAmount;
		return this;
	}

	public Optional<AmountAndDirection17> getShippingAmount() {
		return shippingAmount == null ? Optional.empty() : Optional.of(shippingAmount);
	}

	public OtherAmounts7 setShippingAmount(AmountAndDirection17 shippingAmount) {
		this.shippingAmount = shippingAmount;
		return this;
	}

	public Optional<AmountAndDirection17> getSpecialConcession() {
		return specialConcession == null ? Optional.empty() : Optional.of(specialConcession);
	}

	public OtherAmounts7 setSpecialConcession(AmountAndDirection17 specialConcession) {
		this.specialConcession = specialConcession;
		return this;
	}

	public Optional<AmountAndDirection17> getStampDuty() {
		return stampDuty == null ? Optional.empty() : Optional.of(stampDuty);
	}

	public OtherAmounts7 setStampDuty(AmountAndDirection17 stampDuty) {
		this.stampDuty = stampDuty;
		return this;
	}

	public Optional<AmountAndDirection17> getStockExchangeTax() {
		return stockExchangeTax == null ? Optional.empty() : Optional.of(stockExchangeTax);
	}

	public OtherAmounts7 setStockExchangeTax(AmountAndDirection17 stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
		return this;
	}

	public Optional<AmountAndDirection17> getTransferTax() {
		return transferTax == null ? Optional.empty() : Optional.of(transferTax);
	}

	public OtherAmounts7 setTransferTax(AmountAndDirection17 transferTax) {
		this.transferTax = transferTax;
		return this;
	}

	public Optional<AmountAndDirection17> getTransactionTax() {
		return transactionTax == null ? Optional.empty() : Optional.of(transactionTax);
	}

	public OtherAmounts7 setTransactionTax(AmountAndDirection17 transactionTax) {
		this.transactionTax = transactionTax;
		return this;
	}

	public Optional<AmountAndDirection17> getValueAddedTax() {
		return valueAddedTax == null ? Optional.empty() : Optional.of(valueAddedTax);
	}

	public OtherAmounts7 setValueAddedTax(AmountAndDirection17 valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
		return this;
	}

	public Optional<AmountAndDirection17> getWithholdingTax() {
		return withholdingTax == null ? Optional.empty() : Optional.of(withholdingTax);
	}

	public OtherAmounts7 setWithholdingTax(AmountAndDirection17 withholdingTax) {
		this.withholdingTax = withholdingTax;
		return this;
	}

	public Optional<AmountAndDirection17> getNetGainLoss() {
		return netGainLoss == null ? Optional.empty() : Optional.of(netGainLoss);
	}

	public OtherAmounts7 setNetGainLoss(AmountAndDirection17 netGainLoss) {
		this.netGainLoss = netGainLoss;
		return this;
	}

	public Optional<AmountAndDirection17> getConsumptionTax() {
		return consumptionTax == null ? Optional.empty() : Optional.of(consumptionTax);
	}

	public OtherAmounts7 setConsumptionTax(AmountAndDirection17 consumptionTax) {
		this.consumptionTax = consumptionTax;
		return this;
	}

	public Optional<AmountAndDirection17> getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount == null ? Optional.empty() : Optional.of(accruedCapitalisationAmount);
	}

	public OtherAmounts7 setAccruedCapitalisationAmount(AmountAndDirection17 accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = accruedCapitalisationAmount;
		return this;
	}
}