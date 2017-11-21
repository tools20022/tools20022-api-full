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
import com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03;
import com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04;
import com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05;
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
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmAccruedInterestAmount
 * OtherAmounts17.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmChargesFees
 * OtherAmounts17.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmCountryNationalFederalTax
 * OtherAmounts17.mmCountryNationalFederalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmTradeAmount
 * OtherAmounts17.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmExecutingBrokerAmount
 * OtherAmounts17.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmIssueDiscountAllowance
 * OtherAmounts17.mmIssueDiscountAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmPaymentLevyTax
 * OtherAmounts17.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmLocalTax
 * OtherAmounts17.mmLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmLocalBrokerCommission
 * OtherAmounts17.mmLocalBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmMargin
 * OtherAmounts17.mmMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmOther
 * OtherAmounts17.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmRegulatoryAmount
 * OtherAmounts17.mmRegulatoryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmShippingAmount
 * OtherAmounts17.mmShippingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmSpecialConcession
 * OtherAmounts17.mmSpecialConcession}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmStampDuty
 * OtherAmounts17.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmStockExchangeTax
 * OtherAmounts17.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmTransferTax
 * OtherAmounts17.mmTransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmTransactionTax
 * OtherAmounts17.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmValueAddedTax
 * OtherAmounts17.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmWithholdingTax
 * OtherAmounts17.mmWithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmNetGainLoss
 * OtherAmounts17.mmNetGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmConsumptionTax
 * OtherAmounts17.mmConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmAccruedCapitalisationAmount
 * OtherAmounts17.mmAccruedCapitalisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmBookValue
 * OtherAmounts17.mmBookValue}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03#mmOtherAmounts
 * SecuritiesFinancingConfirmationV03.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmOtherAmounts
 * SecuritiesFinancingConfirmationV04.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmOtherAmounts
 * SecuritiesFinancingConfirmationV05.mmOtherAmounts}</li>
 * </ul>
 * </li>
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
 * "OtherAmounts17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies other amounts pertaining to the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31 OtherAmounts31}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.OtherAmounts4
 * OtherAmounts4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OtherAmounts17", propOrder = {"accruedInterestAmount", "chargesFees", "countryNationalFederalTax", "tradeAmount", "executingBrokerAmount", "issueDiscountAllowance", "paymentLevyTax", "localTax", "localBrokerCommission",
		"margin", "other", "regulatoryAmount", "shippingAmount", "specialConcession", "stampDuty", "stockExchangeTax", "transferTax", "transactionTax", "valueAddedTax", "withholdingTax", "netGainLoss", "consumptionTax",
		"accruedCapitalisationAmount", "bookValue"})
public class OtherAmounts17 {

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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmAccruedInterestAmount
	 * OtherAmounts31.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmAccruedInterestAmount);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmChargesFees
	 * OtherAmounts31.mmChargesFees}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargesFees = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmChargesFees);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmCountryNationalFederalTax
	 * OtherAmounts31.mmCountryNationalFederalTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryNationalFederalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmCountryNationalFederalTax);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 tradeAmount;
	/**
	 * Principal amount of a trade (price multiplied by quantity).
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTradeAmount
	 * OtherAmounts31.mmTradeAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "TradAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmTradeAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 executingBrokerAmount;
	/**
	 * Amount of money paid to an executing broker as a commission.
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkrAmt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmExecutingBrokerAmount
	 * OtherAmounts31.mmExecutingBrokerAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingBrokerAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmExecutingBrokerAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 issueDiscountAllowance;
	/**
	 * Amount of money defined as a discount on a new issue or on a tranche of
	 * an existing issue.
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
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDiscountAllowance
	 * Issuance.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDscntAllwnc"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmIssueDiscountAllowance
	 * OtherAmounts31.mmIssueDiscountAllowance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDiscountAllowance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDiscountAllowance;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "IsseDscntAllwnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Amount of money defined as a discount on a new issue or on a tranche of an existing issue.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmIssueDiscountAllowance);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmPaymentLevyTax
	 * OtherAmounts31.mmPaymentLevyTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentLevyTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmPaymentLevyTax);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmLocalTax
	 * OtherAmounts31.mmLocalTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmLocalTax);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 localBrokerCommission;
	/**
	 * Amount of commission paid to a local broker.
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of commission paid to a local broker."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmLocalBrokerCommission
	 * OtherAmounts31.mmLocalBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalBrokerCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmLocalBrokerCommission);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 margin;
	/**
	 * Amount of money deposited by the trading party in a margin account.
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
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrgn"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmMargin
	 * OtherAmounts31.mmMargin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMargin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "Mrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Amount of money deposited by the trading party in a margin account.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmMargin);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmOther
	 * OtherAmounts31.mmOther}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOther = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmOther);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmRegulatoryAmount
	 * OtherAmounts31.mmRegulatoryAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegulatoryAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmRegulatoryAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 shippingAmount;
	/**
	 * All costs related to the physical delivery of documents such as stamps,
	 * postage, carrier fees, insurances or messenger services.
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmShippingAmount
	 * OtherAmounts31.mmShippingAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShippingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "ShppgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAmount";
			definition = "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmShippingAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 specialConcession;
	/**
	 * Amount of drawdown or other reduction from or in addition to the deal
	 * price.
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
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmSpecialConcessionAmount
	 * ProceedsDefinition.mmSpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclCncssn"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmSpecialConcession
	 * OtherAmounts31.mmSpecialConcession}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpecialConcession = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmSpecialConcessionAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "SpclCncssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcession";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmSpecialConcession);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmStampDuty
	 * OtherAmounts31.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDuty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmStampDuty);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmStockExchangeTax
	 * OtherAmounts31.mmStockExchangeTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStockExchangeTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmStockExchangeTax);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTransferTax
	 * OtherAmounts31.mmTransferTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmTransferTax);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTransactionTax
	 * OtherAmounts31.mmTransactionTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmTransactionTax);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmValueAddedTax
	 * OtherAmounts31.mmValueAddedTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueAddedTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmValueAddedTax);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmWithholdingTax
	 * OtherAmounts31.mmWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmWithholdingTax);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 netGainLoss;
	/**
	 * Amount representing the difference between the cost and the current price
	 * of a security. In the context of securities settlement, it is the amount
	 * paid or received when the instructions are netted or paired off.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNetGainLoss
	 * SecuritiesBalance.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetGnLoss"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmNetGainLoss
	 * OtherAmounts31.mmNetGainLoss}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetGainLoss = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmNetGainLoss;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "NetGnLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmNetGainLoss);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmConsumptionTax
	 * OtherAmounts31.mmConsumptionTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConsumptionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Amount of consumption tax.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmConsumptionTax);
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmAccruedCapitalisationAmount
	 * OtherAmounts31.mmAccruedCapitalisationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedCapitalisationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmAccruedCapitalisationAmount;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmAccruedCapitalisationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};
	protected AmountAndDirection9 bookValue;
	/**
	 * Cost of the securities. May be requested in some countries for tax
	 * purposes.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookVal"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmBookValue
	 * OtherAmounts31.mmBookValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> OtherAmounts17.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Cost of the securities. May be requested in some countries for tax purposes.";
			nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmBookValue);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherAmounts17.mmAccruedInterestAmount, OtherAmounts17.mmChargesFees, OtherAmounts17.mmCountryNationalFederalTax, OtherAmounts17.mmTradeAmount,
						OtherAmounts17.mmExecutingBrokerAmount, OtherAmounts17.mmIssueDiscountAllowance, OtherAmounts17.mmPaymentLevyTax, OtherAmounts17.mmLocalTax, OtherAmounts17.mmLocalBrokerCommission, OtherAmounts17.mmMargin,
						OtherAmounts17.mmOther, OtherAmounts17.mmRegulatoryAmount, OtherAmounts17.mmShippingAmount, OtherAmounts17.mmSpecialConcession, OtherAmounts17.mmStampDuty, OtherAmounts17.mmStockExchangeTax,
						OtherAmounts17.mmTransferTax, OtherAmounts17.mmTransactionTax, OtherAmounts17.mmValueAddedTax, OtherAmounts17.mmWithholdingTax, OtherAmounts17.mmNetGainLoss, OtherAmounts17.mmConsumptionTax,
						OtherAmounts17.mmAccruedCapitalisationAmount, OtherAmounts17.mmBookValue);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV03.mmOtherAmounts, SecuritiesFinancingConfirmationV04.mmOtherAmounts, SecuritiesFinancingConfirmationV05.mmOtherAmounts);
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
				name = "OtherAmounts17";
				definition = "Identifies other amounts pertaining to the transaction.";
				nextVersions_lazy = () -> Arrays.asList(OtherAmounts31.mmObject());
				previousVersion_lazy = () -> OtherAmounts4.mmObject();
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

	@XmlElement(name = "TradAmt")
	public AmountAndDirection9 getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(com.tools20022.repository.msg.AmountAndDirection9 tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	@XmlElement(name = "ExctgBrkrAmt")
	public AmountAndDirection9 getExecutingBrokerAmount() {
		return executingBrokerAmount;
	}

	public void setExecutingBrokerAmount(com.tools20022.repository.msg.AmountAndDirection9 executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
	}

	@XmlElement(name = "IsseDscntAllwnc")
	public AmountAndDirection9 getIssueDiscountAllowance() {
		return issueDiscountAllowance;
	}

	public void setIssueDiscountAllowance(com.tools20022.repository.msg.AmountAndDirection9 issueDiscountAllowance) {
		this.issueDiscountAllowance = issueDiscountAllowance;
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

	@XmlElement(name = "LclBrkrComssn")
	public AmountAndDirection9 getLocalBrokerCommission() {
		return localBrokerCommission;
	}

	public void setLocalBrokerCommission(com.tools20022.repository.msg.AmountAndDirection9 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
	}

	@XmlElement(name = "Mrgn")
	public AmountAndDirection9 getMargin() {
		return margin;
	}

	public void setMargin(com.tools20022.repository.msg.AmountAndDirection9 margin) {
		this.margin = margin;
	}

	@XmlElement(name = "Othr")
	public AmountAndDirection9 getOther() {
		return other;
	}

	public void setOther(com.tools20022.repository.msg.AmountAndDirection9 other) {
		this.other = other;
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

	@XmlElement(name = "SpclCncssn")
	public AmountAndDirection9 getSpecialConcession() {
		return specialConcession;
	}

	public void setSpecialConcession(com.tools20022.repository.msg.AmountAndDirection9 specialConcession) {
		this.specialConcession = specialConcession;
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

	@XmlElement(name = "NetGnLoss")
	public AmountAndDirection9 getNetGainLoss() {
		return netGainLoss;
	}

	public void setNetGainLoss(com.tools20022.repository.msg.AmountAndDirection9 netGainLoss) {
		this.netGainLoss = netGainLoss;
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

	@XmlElement(name = "BookVal")
	public AmountAndDirection9 getBookValue() {
		return bookValue;
	}

	public void setBookValue(com.tools20022.repository.msg.AmountAndDirection9 bookValue) {
		this.bookValue = bookValue;
	}
}