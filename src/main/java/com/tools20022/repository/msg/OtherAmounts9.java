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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmAccruedInterestAmount
 * OtherAmounts9.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmChargesFees
 * OtherAmounts9.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmCountryNationalFederalTax
 * OtherAmounts9.mmCountryNationalFederalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmTradeAmount
 * OtherAmounts9.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmExecutingBrokerAmount
 * OtherAmounts9.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmIssueDiscountAllowance
 * OtherAmounts9.mmIssueDiscountAllowance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmPaymentLevyTax
 * OtherAmounts9.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmLocalTax
 * OtherAmounts9.mmLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmLocalTaxCountrySpecific
 * OtherAmounts9.mmLocalTaxCountrySpecific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmLocalBrokerCommission
 * OtherAmounts9.mmLocalBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmMargin
 * OtherAmounts9.mmMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmOther
 * OtherAmounts9.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmPostageAmount
 * OtherAmounts9.mmPostageAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmRegulatoryAmount
 * OtherAmounts9.mmRegulatoryAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmShippingAmount
 * OtherAmounts9.mmShippingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmSpecialConcession
 * OtherAmounts9.mmSpecialConcession}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmStampDuty
 * OtherAmounts9.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmStockExchangeTax
 * OtherAmounts9.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmTransferTax
 * OtherAmounts9.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmTransactionTax
 * OtherAmounts9.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmValueAddedTax
 * OtherAmounts9.mmValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmWithholdingTax
 * OtherAmounts9.mmWithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmNetGainLoss
 * OtherAmounts9.mmNetGainLoss}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmConsumptionTax
 * OtherAmounts9.mmConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmAccruedCapitalisationAmount
 * OtherAmounts9.mmAccruedCapitalisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmBookValue
 * OtherAmounts9.mmBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmCollateralMonitorAmount
 * OtherAmounts9.mmCollateralMonitorAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02#mmOtherAmounts
 * SecuritiesSettlementTransactionConfirmationV02.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02#mmOtherAmounts
 * SecuritiesSettlementTransactionReversalAdviceV02.mmOtherAmounts}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forOtherAmounts9
 * ConstraintCoexistenceAmountRule.forOtherAmounts9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherAmounts9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies other amounts pertaining to the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18 OtherAmounts18}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherAmounts9", propOrder = {"accruedInterestAmount", "chargesFees", "countryNationalFederalTax", "tradeAmount", "executingBrokerAmount", "issueDiscountAllowance", "paymentLevyTax", "localTax", "localTaxCountrySpecific",
		"localBrokerCommission", "margin", "other", "postageAmount", "regulatoryAmount", "shippingAmount", "specialConcession", "stampDuty", "stockExchangeTax", "transferTax", "transactionTax", "valueAddedTax", "withholdingTax",
		"netGainLoss", "consumptionTax", "accruedCapitalisationAmount", "bookValue", "collateralMonitorAmount"})
public class OtherAmounts9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection9 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected AmountAndDirection9 chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesFees = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "CtryNtlFdrlTax")
	protected AmountAndDirection9 countryNationalFederalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCountryNationalFederalTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COUN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "TradAmt")
	protected AmountAndDirection9 tradeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal amount of a trade (price multiplied by quantity)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "TradAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "ExctgBrkrAmt")
	protected AmountAndDirection9 executingBrokerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::EXEC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBrokerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to an executing broker as a commission."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExecutingBrokerAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::EXEC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "IsseDscntAllwnc")
	protected AmountAndDirection9 issueDiscountAllowance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDiscountAllowance
	 * Issuance.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDscntAllwnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ISDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDiscountAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money defined as a discount on a new issue or on a tranche of an existing issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssueDiscountAllowance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDiscountAllowance;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "IsseDscntAllwnc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ISDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Amount of money defined as a discount on a new issue or on a tranche of an existing issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "PmtLevyTax")
	protected AmountAndDirection9 paymentLevyTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentLevyTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LEVY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "LclTax")
	protected AmountAndDirection9 localTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "LclTaxCtrySpcfc")
	protected AmountAndDirection9 localTaxCountrySpecific;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTaxCtrySpcfc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTaxCountrySpecific"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local tax country specific."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalTaxCountrySpecific = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific";
			definition = "Local tax country specific.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "LclBrkrComssn")
	protected AmountAndDirection9 localBrokerCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of commission paid to a local broker."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalBrokerCommission = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "Mrgn")
	protected AmountAndDirection9 margin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::MARG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money deposited by the trading party in a margin account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMargin = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "Mrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::MARG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Amount of money deposited by the trading party in a margin account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "Othr")
	protected AmountAndDirection9 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::OTHR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "PstgAmt")
	protected AmountAndDirection9 postageAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
	 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::POST</li>
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
	public static final MMMessageAssociationEnd mmPostageAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmPostageFeeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "PstgAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "RgltryAmt")
	protected AmountAndDirection9 regulatoryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegulatoryAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "ShppgAmt")
	protected AmountAndDirection9 shippingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShippingAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "ShppgAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "SpclCncssn")
	protected AmountAndDirection9 specialConcession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmSpecialConcessionAmount
	 * ProceedsDefinition.mmSpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclCncssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SPCN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of drawdown or other reduction from or in addition to the deal price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecialConcession = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmSpecialConcessionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "SpclCncssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SPCN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcession";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "StmpDty")
	protected AmountAndDirection9 stampDuty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStampDuty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "StockXchgTax")
	protected AmountAndDirection9 stockExchangeTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockExchangeTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "TrfTax")
	protected AmountAndDirection9 transferTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "TxTax")
	protected AmountAndDirection9 transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "ValAddedTax")
	protected AmountAndDirection9 valueAddedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValueAddedTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::VATA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "WhldgTax")
	protected AmountAndDirection9 withholdingTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::WITH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "NetGnLoss")
	protected AmountAndDirection9 netGainLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNetGainLoss
	 * SecuritiesBalance.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetGnLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ANTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetGainLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetGainLoss = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmNetGainLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "NetGnLoss";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ANTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "CsmptnTax")
	protected AmountAndDirection9 consumptionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsumptionTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Amount of consumption tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "AcrdCptlstnAmt")
	protected AmountAndDirection9 accruedCapitalisationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
	 * Debt.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedCapitalisationAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmAccruedCapitalisationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "BookVal")
	protected AmountAndDirection9 bookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cost of the securities. May be requested in some countries for tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBookValue = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Cost of the securities. May be requested in some countries for tax purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	@XmlElement(name = "CollMntrAmt")
	protected AmountAndDirection9 collateralMonitorAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection9
	 * AmountAndDirection9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollMntrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMonitorAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral available for the delivery settlement process at the account level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralMonitorAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts9.mmObject();
			isDerived = false;
			xmlTag = "CollMntrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMonitorAmount";
			definition = "Value of the collateral available for the delivery settlement process at the account level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts9.mmAccruedInterestAmount, com.tools20022.repository.msg.OtherAmounts9.mmChargesFees,
						com.tools20022.repository.msg.OtherAmounts9.mmCountryNationalFederalTax, com.tools20022.repository.msg.OtherAmounts9.mmTradeAmount, com.tools20022.repository.msg.OtherAmounts9.mmExecutingBrokerAmount,
						com.tools20022.repository.msg.OtherAmounts9.mmIssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts9.mmPaymentLevyTax, com.tools20022.repository.msg.OtherAmounts9.mmLocalTax,
						com.tools20022.repository.msg.OtherAmounts9.mmLocalTaxCountrySpecific, com.tools20022.repository.msg.OtherAmounts9.mmLocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts9.mmMargin,
						com.tools20022.repository.msg.OtherAmounts9.mmOther, com.tools20022.repository.msg.OtherAmounts9.mmPostageAmount, com.tools20022.repository.msg.OtherAmounts9.mmRegulatoryAmount,
						com.tools20022.repository.msg.OtherAmounts9.mmShippingAmount, com.tools20022.repository.msg.OtherAmounts9.mmSpecialConcession, com.tools20022.repository.msg.OtherAmounts9.mmStampDuty,
						com.tools20022.repository.msg.OtherAmounts9.mmStockExchangeTax, com.tools20022.repository.msg.OtherAmounts9.mmTransferTax, com.tools20022.repository.msg.OtherAmounts9.mmTransactionTax,
						com.tools20022.repository.msg.OtherAmounts9.mmValueAddedTax, com.tools20022.repository.msg.OtherAmounts9.mmWithholdingTax, com.tools20022.repository.msg.OtherAmounts9.mmNetGainLoss,
						com.tools20022.repository.msg.OtherAmounts9.mmConsumptionTax, com.tools20022.repository.msg.OtherAmounts9.mmAccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts9.mmBookValue,
						com.tools20022.repository.msg.OtherAmounts9.mmCollateralMonitorAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionConfirmationV02.mmOtherAmounts, SecuritiesSettlementTransactionReversalAdviceV02.mmOtherAmounts);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forOtherAmounts9);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OtherAmounts9";
				definition = "Identifies other amounts pertaining to the transaction.";
				nextVersions_lazy = () -> Arrays.asList(OtherAmounts18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection9> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public OtherAmounts9 setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection9 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public OtherAmounts9 setChargesFees(com.tools20022.repository.msg.AmountAndDirection9 chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<AmountAndDirection9> getCountryNationalFederalTax() {
		return countryNationalFederalTax == null ? Optional.empty() : Optional.of(countryNationalFederalTax);
	}

	public OtherAmounts9 setCountryNationalFederalTax(com.tools20022.repository.msg.AmountAndDirection9 countryNationalFederalTax) {
		this.countryNationalFederalTax = countryNationalFederalTax;
		return this;
	}

	public Optional<AmountAndDirection9> getTradeAmount() {
		return tradeAmount == null ? Optional.empty() : Optional.of(tradeAmount);
	}

	public OtherAmounts9 setTradeAmount(com.tools20022.repository.msg.AmountAndDirection9 tradeAmount) {
		this.tradeAmount = tradeAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getExecutingBrokerAmount() {
		return executingBrokerAmount == null ? Optional.empty() : Optional.of(executingBrokerAmount);
	}

	public OtherAmounts9 setExecutingBrokerAmount(com.tools20022.repository.msg.AmountAndDirection9 executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getIssueDiscountAllowance() {
		return issueDiscountAllowance == null ? Optional.empty() : Optional.of(issueDiscountAllowance);
	}

	public OtherAmounts9 setIssueDiscountAllowance(com.tools20022.repository.msg.AmountAndDirection9 issueDiscountAllowance) {
		this.issueDiscountAllowance = issueDiscountAllowance;
		return this;
	}

	public Optional<AmountAndDirection9> getPaymentLevyTax() {
		return paymentLevyTax == null ? Optional.empty() : Optional.of(paymentLevyTax);
	}

	public OtherAmounts9 setPaymentLevyTax(com.tools20022.repository.msg.AmountAndDirection9 paymentLevyTax) {
		this.paymentLevyTax = paymentLevyTax;
		return this;
	}

	public Optional<AmountAndDirection9> getLocalTax() {
		return localTax == null ? Optional.empty() : Optional.of(localTax);
	}

	public OtherAmounts9 setLocalTax(com.tools20022.repository.msg.AmountAndDirection9 localTax) {
		this.localTax = localTax;
		return this;
	}

	public Optional<AmountAndDirection9> getLocalTaxCountrySpecific() {
		return localTaxCountrySpecific == null ? Optional.empty() : Optional.of(localTaxCountrySpecific);
	}

	public OtherAmounts9 setLocalTaxCountrySpecific(com.tools20022.repository.msg.AmountAndDirection9 localTaxCountrySpecific) {
		this.localTaxCountrySpecific = localTaxCountrySpecific;
		return this;
	}

	public Optional<AmountAndDirection9> getLocalBrokerCommission() {
		return localBrokerCommission == null ? Optional.empty() : Optional.of(localBrokerCommission);
	}

	public OtherAmounts9 setLocalBrokerCommission(com.tools20022.repository.msg.AmountAndDirection9 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
		return this;
	}

	public Optional<AmountAndDirection9> getMargin() {
		return margin == null ? Optional.empty() : Optional.of(margin);
	}

	public OtherAmounts9 setMargin(com.tools20022.repository.msg.AmountAndDirection9 margin) {
		this.margin = margin;
		return this;
	}

	public Optional<AmountAndDirection9> getOther() {
		return other == null ? Optional.empty() : Optional.of(other);
	}

	public OtherAmounts9 setOther(com.tools20022.repository.msg.AmountAndDirection9 other) {
		this.other = other;
		return this;
	}

	public Optional<AmountAndDirection9> getPostageAmount() {
		return postageAmount == null ? Optional.empty() : Optional.of(postageAmount);
	}

	public OtherAmounts9 setPostageAmount(com.tools20022.repository.msg.AmountAndDirection9 postageAmount) {
		this.postageAmount = postageAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getRegulatoryAmount() {
		return regulatoryAmount == null ? Optional.empty() : Optional.of(regulatoryAmount);
	}

	public OtherAmounts9 setRegulatoryAmount(com.tools20022.repository.msg.AmountAndDirection9 regulatoryAmount) {
		this.regulatoryAmount = regulatoryAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getShippingAmount() {
		return shippingAmount == null ? Optional.empty() : Optional.of(shippingAmount);
	}

	public OtherAmounts9 setShippingAmount(com.tools20022.repository.msg.AmountAndDirection9 shippingAmount) {
		this.shippingAmount = shippingAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getSpecialConcession() {
		return specialConcession == null ? Optional.empty() : Optional.of(specialConcession);
	}

	public OtherAmounts9 setSpecialConcession(com.tools20022.repository.msg.AmountAndDirection9 specialConcession) {
		this.specialConcession = specialConcession;
		return this;
	}

	public Optional<AmountAndDirection9> getStampDuty() {
		return stampDuty == null ? Optional.empty() : Optional.of(stampDuty);
	}

	public OtherAmounts9 setStampDuty(com.tools20022.repository.msg.AmountAndDirection9 stampDuty) {
		this.stampDuty = stampDuty;
		return this;
	}

	public Optional<AmountAndDirection9> getStockExchangeTax() {
		return stockExchangeTax == null ? Optional.empty() : Optional.of(stockExchangeTax);
	}

	public OtherAmounts9 setStockExchangeTax(com.tools20022.repository.msg.AmountAndDirection9 stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
		return this;
	}

	public Optional<AmountAndDirection9> getTransferTax() {
		return transferTax == null ? Optional.empty() : Optional.of(transferTax);
	}

	public OtherAmounts9 setTransferTax(com.tools20022.repository.msg.AmountAndDirection9 transferTax) {
		this.transferTax = transferTax;
		return this;
	}

	public Optional<AmountAndDirection9> getTransactionTax() {
		return transactionTax == null ? Optional.empty() : Optional.of(transactionTax);
	}

	public OtherAmounts9 setTransactionTax(com.tools20022.repository.msg.AmountAndDirection9 transactionTax) {
		this.transactionTax = transactionTax;
		return this;
	}

	public Optional<AmountAndDirection9> getValueAddedTax() {
		return valueAddedTax == null ? Optional.empty() : Optional.of(valueAddedTax);
	}

	public OtherAmounts9 setValueAddedTax(com.tools20022.repository.msg.AmountAndDirection9 valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
		return this;
	}

	public Optional<AmountAndDirection9> getWithholdingTax() {
		return withholdingTax == null ? Optional.empty() : Optional.of(withholdingTax);
	}

	public OtherAmounts9 setWithholdingTax(com.tools20022.repository.msg.AmountAndDirection9 withholdingTax) {
		this.withholdingTax = withholdingTax;
		return this;
	}

	public Optional<AmountAndDirection9> getNetGainLoss() {
		return netGainLoss == null ? Optional.empty() : Optional.of(netGainLoss);
	}

	public OtherAmounts9 setNetGainLoss(com.tools20022.repository.msg.AmountAndDirection9 netGainLoss) {
		this.netGainLoss = netGainLoss;
		return this;
	}

	public Optional<AmountAndDirection9> getConsumptionTax() {
		return consumptionTax == null ? Optional.empty() : Optional.of(consumptionTax);
	}

	public OtherAmounts9 setConsumptionTax(com.tools20022.repository.msg.AmountAndDirection9 consumptionTax) {
		this.consumptionTax = consumptionTax;
		return this;
	}

	public Optional<AmountAndDirection9> getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount == null ? Optional.empty() : Optional.of(accruedCapitalisationAmount);
	}

	public OtherAmounts9 setAccruedCapitalisationAmount(com.tools20022.repository.msg.AmountAndDirection9 accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = accruedCapitalisationAmount;
		return this;
	}

	public Optional<AmountAndDirection9> getBookValue() {
		return bookValue == null ? Optional.empty() : Optional.of(bookValue);
	}

	public OtherAmounts9 setBookValue(com.tools20022.repository.msg.AmountAndDirection9 bookValue) {
		this.bookValue = bookValue;
		return this;
	}

	public Optional<AmountAndDirection9> getCollateralMonitorAmount() {
		return collateralMonitorAmount == null ? Optional.empty() : Optional.of(collateralMonitorAmount);
	}

	public OtherAmounts9 setCollateralMonitorAmount(com.tools20022.repository.msg.AmountAndDirection9 collateralMonitorAmount) {
		this.collateralMonitorAmount = collateralMonitorAmount;
		return this;
	}
}