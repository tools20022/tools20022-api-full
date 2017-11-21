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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmChargesFees
 * OtherAmounts16.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmCountryNationalFederalTax
 * OtherAmounts16.mmCountryNationalFederalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmExecutingBrokerAmount
 * OtherAmounts16.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmIssueDiscountAllowance
 * OtherAmounts16.mmIssueDiscountAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmPaymentLevyTax
 * OtherAmounts16.mmPaymentLevyTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTax
 * OtherAmounts16.mmLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalBrokerCommission
 * OtherAmounts16.mmLocalBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMargin
 * OtherAmounts16.mmMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOther
 * OtherAmounts16.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRegulatoryAmount
 * OtherAmounts16.mmRegulatoryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmSpecialConcession
 * OtherAmounts16.mmSpecialConcession}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmStampDuty
 * OtherAmounts16.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmStockExchangeTax
 * OtherAmounts16.mmStockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmTransferTax
 * OtherAmounts16.mmTransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmTransactionTax
 * OtherAmounts16.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmValueAddedTax
 * OtherAmounts16.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmWithholdingTax
 * OtherAmounts16.mmWithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmNetGainLoss
 * OtherAmounts16.mmNetGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmConsumptionTax
 * OtherAmounts16.mmConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMatchingConfirmationFee
 * OtherAmounts16.mmMatchingConfirmationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmConvertedAmount
 * OtherAmounts16.mmConvertedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOriginalCurrencyAmount
 * OtherAmounts16.mmOriginalCurrencyAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBookValue
 * OtherAmounts16.mmBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmAccruedCapitalisationAmount
 * OtherAmounts16.mmAccruedCapitalisationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific1
 * OtherAmounts16.mmLocalTaxCountrySpecific1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific2
 * OtherAmounts16.mmLocalTaxCountrySpecific2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific3
 * OtherAmounts16.mmLocalTaxCountrySpecific3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalTaxCountrySpecific4
 * OtherAmounts16.mmLocalTaxCountrySpecific4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmSharedBrokerageAmount
 * OtherAmounts16.mmSharedBrokerageAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMarketMemberFeeAmount
 * OtherAmounts16.mmMarketMemberFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemunerationAmountRequest
 * OtherAmounts16.mmRemunerationAmountRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemunerationAmount
 * OtherAmounts16.mmRemunerationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBorrowingInterestAmount
 * OtherAmounts16.mmBorrowingInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBorrowingFee
 * OtherAmounts16.mmBorrowingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmNetMarketValue
 * OtherAmounts16.mmNetMarketValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemainingFaceValue
 * OtherAmounts16.mmRemainingFaceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemainingBookValue
 * OtherAmounts16.mmRemainingBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmClearingBrokerCommission
 * OtherAmounts16.mmClearingBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmDifferenceInPrice
 * OtherAmounts16.mmDifferenceInPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOddLotFee
 * OtherAmounts16.mmOddLotFee}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherAmounts
 * SecuritiesTradeConfirmationV01.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmOtherAmounts
 * SecuritiesTradeConfirmationV02.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmOtherAmounts
 * SecuritiesTradeConfirmationV03.mmOtherAmounts}</li>
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
 * "OtherAmounts16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies other amounts pertaining to the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OtherAmounts16", propOrder = {"chargesFees", "countryNationalFederalTax", "executingBrokerAmount", "issueDiscountAllowance", "paymentLevyTax", "localTax", "localBrokerCommission", "margin", "other", "regulatoryAmount",
		"specialConcession", "stampDuty", "stockExchangeTax", "transferTax", "transactionTax", "valueAddedTax", "withholdingTax", "netGainLoss", "consumptionTax", "matchingConfirmationFee", "convertedAmount", "originalCurrencyAmount",
		"bookValue", "accruedCapitalisationAmount", "localTaxCountrySpecific1", "localTaxCountrySpecific2", "localTaxCountrySpecific3", "localTaxCountrySpecific4", "sharedBrokerageAmount", "marketMemberFeeAmount",
		"remunerationAmountRequest", "remunerationAmount", "borrowingInterestAmount", "borrowingFee", "netMarketValue", "remainingFaceValue", "remainingBookValue", "clearingBrokerCommission", "differenceInPrice", "oddLotFee"})
public class OtherAmounts16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection29 chargesFees;
	/**
	 * Amount of money paid for the provision of financial services that cannot
	 * be categorised by another qualifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 countryNationalFederalTax;
	/**
	 * Amount of country, national or federal tax charged by the jurisdiction in
	 * which the account servicer is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 executingBrokerAmount;
	/**
	 * Amount of money paid to an executing broker as a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingBrokerAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 issueDiscountAllowance;
	/**
	 * Amount of money defined as a discount on a new issue or on a tranche of
	 * an existing issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDiscountAllowance
	 * Issuance.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDiscountAllowance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDiscountAllowance;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "IsseDscntAllwnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Amount of money defined as a discount on a new issue or on a tranche of an existing issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 paymentLevyTax;
	/**
	 * Amount of payment levy tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 localTax;
	/**
	 * Tax charged by the jurisdiction in which the financial instrument
	 * settles.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 localBrokerCommission;
	/**
	 * Amount of commission paid to a local broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalBrokerCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 margin;
	/**
	 * Amount of money deposited by the trading party in a margin account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMargin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "Mrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Amount of money deposited by the trading party in a margin account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 other;
	/**
	 * An amount that is not indicated by a known business denomination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 regulatoryAmount;
	/**
	 * Amount of money charged by a regulatory authority, for example,
	 * Securities and Exchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 specialConcession;
	/**
	 * Amount of drawdown or other reduction from or in addition to the deal
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmSpecialConcessionAmount
	 * ProceedsDefinition.mmSpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpecialConcession = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmSpecialConcessionAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "SpclCncssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcession";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 stampDuty;
	/**
	 * Amount of stamp duty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 stockExchangeTax;
	/**
	 * Amount of stock exchange tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 transferTax;
	/**
	 * Amount of tax levied on a transfer of ownership of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 transactionTax;
	/**
	 * Amount of transaction tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 valueAddedTax;
	/**
	 * Amount of value-added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 withholdingTax;
	/**
	 * Amount of money that will be withheld by a tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 netGainLoss;
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNetGainLoss
	 * SecuritiesBalance.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetGainLoss = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmNetGainLoss;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "NetGnLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 consumptionTax;
	/**
	 * A tax on spending on goods and services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * definition} = "A tax on spending on goods and services."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConsumptionTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "A tax on spending on goods and services.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 matchingConfirmationFee;
	/**
	 * Amount of money charged for matching and/or confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgConfFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingConfirmationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money charged for matching and/or confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingConfirmationFee = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "MtchgConfFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingConfirmationFee";
			definition = "Amount of money charged for matching and/or confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 convertedAmount;
	/**
	 * Amount following a foreign exchange conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
	 * CurrencyExchange.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount following a foreign exchange conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConvertedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ConvtdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertedAmount";
			definition = "Amount following a foreign exchange conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 originalCurrencyAmount;
	/**
	 * Posting/settlement amount in its original currency when conversion
	 * from/into another currency has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCcyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting/settlement amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalCurrencyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCcyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCurrencyAmount";
			definition = "Posting/settlement amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 bookValue;
	/**
	 * Cost of the securities. May be requested in some countries for tax
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Cost of the securities. May be requested in some countries for tax purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 accruedCapitalisationAmount;
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmAccruedCapitalisationAmount
	 * Debt.mmAccruedCapitalisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
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
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 localTaxCountrySpecific1;
	/**
	 * Local tax as defined by the country in its market practice document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTaxCtrySpcfc1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTaxCountrySpecific1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax as defined by the country in its market practice document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTaxCountrySpecific1 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific1";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 localTaxCountrySpecific2;
	/**
	 * Local tax as defined by the country in its market practice document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTaxCtrySpcfc2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTaxCountrySpecific2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax as defined by the country in its market practice document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTaxCountrySpecific2 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific2";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 localTaxCountrySpecific3;
	/**
	 * Local tax as defined by the country in its market practice document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTaxCtrySpcfc3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTaxCountrySpecific3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax as defined by the country in its market practice document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTaxCountrySpecific3 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific3";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 localTaxCountrySpecific4;
	/**
	 * Local tax as defined by the country in its market practice document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclTaxCtrySpcfc4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTaxCountrySpecific4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax as defined by the country in its market practice document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocalTaxCountrySpecific4 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc4";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific4";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 sharedBrokerageAmount;
	/**
	 * Amount paid as result of transactions subject to shared brokerage
	 * commissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrdBrkrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharedBrokerageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount paid as result of transactions subject to shared brokerage commissions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSharedBrokerageAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ShrdBrkrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharedBrokerageAmount";
			definition = "Amount paid as result of transactions subject to shared brokerage commissions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 marketMemberFeeAmount;
	/**
	 * Indicates the total fees related to the trade, with deduction of rebates
	 * (on brokerage, commission or differential) granted by the market member
	 * (fee amount with tax excluded).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktMmbFeeAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMemberFeeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total fees related to the trade, with deduction of rebates (on brokerage, commission or differential) granted by the market member (fee amount with tax excluded)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketMemberFeeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "MktMmbFeeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMemberFeeAmount";
			definition = "Indicates the total fees related to the trade, with deduction of rebates (on brokerage, commission or differential) granted by the market member (fee amount with tax excluded).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected YesNoIndicator remunerationAmountRequest;
	/**
	 * Specifies that this information is available upon request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmnrtnAmtReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemunerationAmountRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that this information is available upon request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemunerationAmountRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmnrtnAmtReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemunerationAmountRequest";
			definition = "Specifies that this information is available upon request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected AmountAndDirection29 remunerationAmount;
	/**
	 * Specifies the source and amount of any other remuneration received or to
	 * be received by the broker in connection with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker#mmRemunerationAmount
	 * Broker.mmRemunerationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmnrtnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemunerationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the source and amount of any other remuneration received or to be received by the broker in connection with the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemunerationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Broker.mmRemunerationAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmnrtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemunerationAmount";
			definition = "Specifies the source and amount of any other remuneration received or to be received by the broker in connection with the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 borrowingInterestAmount;
	/**
	 * Amount to be paid by the lender to the borrower calculated based on the
	 * interest rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwgIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be paid by the lender to the borrower calculated based on the interest rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowingInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "BrrwgIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingInterestAmount";
			definition = "Amount to be paid by the lender to the borrower calculated based on the interest rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 borrowingFee;
	/**
	 * Amount to be paid by the Borrower to the Lender for the securities
	 * borrowed calculated based on the bond loan rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmBorrowingFee
	 * SecuritiesLending.mmBorrowingFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwgFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be paid by the Borrower to the Lender for the securities borrowed calculated based on the bond loan rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowingFee = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmBorrowingFee;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "BrrwgFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingFee";
			definition = "Amount to be paid by the Borrower to the Lender for the securities borrowed calculated based on the bond loan rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 netMarketValue;
	/**
	 * Net market value of the securities lent used to calculate the collateral
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
	 * AssetHolding.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetMktVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetMarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net market value of the securities lent used to calculate the collateral amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetMarketValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmMarketValue;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "NetMktVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetMarketValue";
			definition = "Net market value of the securities lent used to calculate the collateral amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 remainingFaceValue;
	/**
	 * Remaining nominal value of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
	 * AssetHolding.mmAmortisedFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngFaceVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingFaceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remaining nominal value of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingFaceValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmngFaceVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingFaceValue";
			definition = "Remaining nominal value of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 remainingBookValue;
	/**
	 * Remaining value at which an asset is carried on a balance sheet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngBookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining value at which an asset is carried on a balance sheet."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmngBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingBookValue";
			definition = "Remaining value at which an asset is carried on a balance sheet.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 clearingBrokerCommission;
	/**
	 * Amount of commission paid to a clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrBrkrComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of commission paid to a clearing broker."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingBrokerCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerCommission";
			definition = "Amount of commission paid to a clearing broker.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected AmountAndDirection29 differenceInPrice;
	/**
	 * Difference between the deal price and another reference price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DiffInPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferenceInPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the deal price and another reference price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDifferenceInPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "DiffInPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferenceInPrice";
			definition = "Difference between the deal price and another reference price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected YesNoIndicator oddLotFee;
	/**
	 * Specifies that the odd-lot differential or equivalent fee has been paid
	 * by such customer in connection with the execution of an order for an
	 * odd-lot number of shares or units (or principal amount) of a security and
	 * the fact that the amount of any such differential or fee will be
	 * furnished upon oral or written request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OddLotFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the odd-lot differential or equivalent fee has been paid by such customer in connection with the execution of an order for an odd-lot number of shares or units (or principal amount) of a security and the fact that the amount of any such differential or fee will be furnished upon oral or written request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOddLotFee = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "OddLotFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotFee";
			definition = "Specifies that the odd-lot differential or equivalent fee has been paid by such customer in connection with the execution of an order for an odd-lot number of shares or units (or principal amount) of a security and the fact that the amount of any such differential or fee will be furnished upon oral or written request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherAmounts16.mmChargesFees, OtherAmounts16.mmCountryNationalFederalTax, OtherAmounts16.mmExecutingBrokerAmount, OtherAmounts16.mmIssueDiscountAllowance,
						OtherAmounts16.mmPaymentLevyTax, OtherAmounts16.mmLocalTax, OtherAmounts16.mmLocalBrokerCommission, OtherAmounts16.mmMargin, OtherAmounts16.mmOther, OtherAmounts16.mmRegulatoryAmount,
						OtherAmounts16.mmSpecialConcession, OtherAmounts16.mmStampDuty, OtherAmounts16.mmStockExchangeTax, OtherAmounts16.mmTransferTax, OtherAmounts16.mmTransactionTax, OtherAmounts16.mmValueAddedTax,
						OtherAmounts16.mmWithholdingTax, OtherAmounts16.mmNetGainLoss, OtherAmounts16.mmConsumptionTax, OtherAmounts16.mmMatchingConfirmationFee, OtherAmounts16.mmConvertedAmount, OtherAmounts16.mmOriginalCurrencyAmount,
						OtherAmounts16.mmBookValue, OtherAmounts16.mmAccruedCapitalisationAmount, OtherAmounts16.mmLocalTaxCountrySpecific1, OtherAmounts16.mmLocalTaxCountrySpecific2, OtherAmounts16.mmLocalTaxCountrySpecific3,
						OtherAmounts16.mmLocalTaxCountrySpecific4, OtherAmounts16.mmSharedBrokerageAmount, OtherAmounts16.mmMarketMemberFeeAmount, OtherAmounts16.mmRemunerationAmountRequest, OtherAmounts16.mmRemunerationAmount,
						OtherAmounts16.mmBorrowingInterestAmount, OtherAmounts16.mmBorrowingFee, OtherAmounts16.mmNetMarketValue, OtherAmounts16.mmRemainingFaceValue, OtherAmounts16.mmRemainingBookValue,
						OtherAmounts16.mmClearingBrokerCommission, OtherAmounts16.mmDifferenceInPrice, OtherAmounts16.mmOddLotFee);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmOtherAmounts, SecuritiesTradeConfirmationV02.mmOtherAmounts, SecuritiesTradeConfirmationV03.mmOtherAmounts);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherAmounts16";
				definition = "Identifies other amounts pertaining to the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ChrgsFees")
	public AmountAndDirection29 getChargesFees() {
		return chargesFees;
	}

	public void setChargesFees(com.tools20022.repository.msg.AmountAndDirection29 chargesFees) {
		this.chargesFees = chargesFees;
	}

	@XmlElement(name = "CtryNtlFdrlTax")
	public AmountAndDirection29 getCountryNationalFederalTax() {
		return countryNationalFederalTax;
	}

	public void setCountryNationalFederalTax(com.tools20022.repository.msg.AmountAndDirection29 countryNationalFederalTax) {
		this.countryNationalFederalTax = countryNationalFederalTax;
	}

	@XmlElement(name = "ExctgBrkrAmt")
	public AmountAndDirection29 getExecutingBrokerAmount() {
		return executingBrokerAmount;
	}

	public void setExecutingBrokerAmount(com.tools20022.repository.msg.AmountAndDirection29 executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
	}

	@XmlElement(name = "IsseDscntAllwnc")
	public AmountAndDirection29 getIssueDiscountAllowance() {
		return issueDiscountAllowance;
	}

	public void setIssueDiscountAllowance(com.tools20022.repository.msg.AmountAndDirection29 issueDiscountAllowance) {
		this.issueDiscountAllowance = issueDiscountAllowance;
	}

	@XmlElement(name = "PmtLevyTax")
	public AmountAndDirection29 getPaymentLevyTax() {
		return paymentLevyTax;
	}

	public void setPaymentLevyTax(com.tools20022.repository.msg.AmountAndDirection29 paymentLevyTax) {
		this.paymentLevyTax = paymentLevyTax;
	}

	@XmlElement(name = "LclTax")
	public AmountAndDirection29 getLocalTax() {
		return localTax;
	}

	public void setLocalTax(com.tools20022.repository.msg.AmountAndDirection29 localTax) {
		this.localTax = localTax;
	}

	@XmlElement(name = "LclBrkrComssn")
	public AmountAndDirection29 getLocalBrokerCommission() {
		return localBrokerCommission;
	}

	public void setLocalBrokerCommission(com.tools20022.repository.msg.AmountAndDirection29 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
	}

	@XmlElement(name = "Mrgn")
	public AmountAndDirection29 getMargin() {
		return margin;
	}

	public void setMargin(com.tools20022.repository.msg.AmountAndDirection29 margin) {
		this.margin = margin;
	}

	@XmlElement(name = "Othr")
	public AmountAndDirection29 getOther() {
		return other;
	}

	public void setOther(com.tools20022.repository.msg.AmountAndDirection29 other) {
		this.other = other;
	}

	@XmlElement(name = "RgltryAmt")
	public AmountAndDirection29 getRegulatoryAmount() {
		return regulatoryAmount;
	}

	public void setRegulatoryAmount(com.tools20022.repository.msg.AmountAndDirection29 regulatoryAmount) {
		this.regulatoryAmount = regulatoryAmount;
	}

	@XmlElement(name = "SpclCncssn")
	public AmountAndDirection29 getSpecialConcession() {
		return specialConcession;
	}

	public void setSpecialConcession(com.tools20022.repository.msg.AmountAndDirection29 specialConcession) {
		this.specialConcession = specialConcession;
	}

	@XmlElement(name = "StmpDty")
	public AmountAndDirection29 getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(com.tools20022.repository.msg.AmountAndDirection29 stampDuty) {
		this.stampDuty = stampDuty;
	}

	@XmlElement(name = "StockXchgTax")
	public AmountAndDirection29 getStockExchangeTax() {
		return stockExchangeTax;
	}

	public void setStockExchangeTax(com.tools20022.repository.msg.AmountAndDirection29 stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
	}

	@XmlElement(name = "TrfTax")
	public AmountAndDirection29 getTransferTax() {
		return transferTax;
	}

	public void setTransferTax(com.tools20022.repository.msg.AmountAndDirection29 transferTax) {
		this.transferTax = transferTax;
	}

	@XmlElement(name = "TxTax")
	public AmountAndDirection29 getTransactionTax() {
		return transactionTax;
	}

	public void setTransactionTax(com.tools20022.repository.msg.AmountAndDirection29 transactionTax) {
		this.transactionTax = transactionTax;
	}

	@XmlElement(name = "ValAddedTax")
	public AmountAndDirection29 getValueAddedTax() {
		return valueAddedTax;
	}

	public void setValueAddedTax(com.tools20022.repository.msg.AmountAndDirection29 valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
	}

	@XmlElement(name = "WhldgTax")
	public AmountAndDirection29 getWithholdingTax() {
		return withholdingTax;
	}

	public void setWithholdingTax(com.tools20022.repository.msg.AmountAndDirection29 withholdingTax) {
		this.withholdingTax = withholdingTax;
	}

	@XmlElement(name = "NetGnLoss")
	public AmountAndDirection29 getNetGainLoss() {
		return netGainLoss;
	}

	public void setNetGainLoss(com.tools20022.repository.msg.AmountAndDirection29 netGainLoss) {
		this.netGainLoss = netGainLoss;
	}

	@XmlElement(name = "CsmptnTax")
	public AmountAndDirection29 getConsumptionTax() {
		return consumptionTax;
	}

	public void setConsumptionTax(com.tools20022.repository.msg.AmountAndDirection29 consumptionTax) {
		this.consumptionTax = consumptionTax;
	}

	@XmlElement(name = "MtchgConfFee")
	public AmountAndDirection29 getMatchingConfirmationFee() {
		return matchingConfirmationFee;
	}

	public void setMatchingConfirmationFee(com.tools20022.repository.msg.AmountAndDirection29 matchingConfirmationFee) {
		this.matchingConfirmationFee = matchingConfirmationFee;
	}

	@XmlElement(name = "ConvtdAmt")
	public AmountAndDirection29 getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(com.tools20022.repository.msg.AmountAndDirection29 convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	@XmlElement(name = "OrgnlCcyAmt")
	public AmountAndDirection29 getOriginalCurrencyAmount() {
		return originalCurrencyAmount;
	}

	public void setOriginalCurrencyAmount(com.tools20022.repository.msg.AmountAndDirection29 originalCurrencyAmount) {
		this.originalCurrencyAmount = originalCurrencyAmount;
	}

	@XmlElement(name = "BookVal")
	public AmountAndDirection29 getBookValue() {
		return bookValue;
	}

	public void setBookValue(com.tools20022.repository.msg.AmountAndDirection29 bookValue) {
		this.bookValue = bookValue;
	}

	@XmlElement(name = "AcrdCptlstnAmt")
	public AmountAndDirection29 getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount;
	}

	public void setAccruedCapitalisationAmount(com.tools20022.repository.msg.AmountAndDirection29 accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = accruedCapitalisationAmount;
	}

	@XmlElement(name = "LclTaxCtrySpcfc1")
	public AmountAndDirection29 getLocalTaxCountrySpecific1() {
		return localTaxCountrySpecific1;
	}

	public void setLocalTaxCountrySpecific1(com.tools20022.repository.msg.AmountAndDirection29 localTaxCountrySpecific1) {
		this.localTaxCountrySpecific1 = localTaxCountrySpecific1;
	}

	@XmlElement(name = "LclTaxCtrySpcfc2")
	public AmountAndDirection29 getLocalTaxCountrySpecific2() {
		return localTaxCountrySpecific2;
	}

	public void setLocalTaxCountrySpecific2(com.tools20022.repository.msg.AmountAndDirection29 localTaxCountrySpecific2) {
		this.localTaxCountrySpecific2 = localTaxCountrySpecific2;
	}

	@XmlElement(name = "LclTaxCtrySpcfc3")
	public AmountAndDirection29 getLocalTaxCountrySpecific3() {
		return localTaxCountrySpecific3;
	}

	public void setLocalTaxCountrySpecific3(com.tools20022.repository.msg.AmountAndDirection29 localTaxCountrySpecific3) {
		this.localTaxCountrySpecific3 = localTaxCountrySpecific3;
	}

	@XmlElement(name = "LclTaxCtrySpcfc4")
	public AmountAndDirection29 getLocalTaxCountrySpecific4() {
		return localTaxCountrySpecific4;
	}

	public void setLocalTaxCountrySpecific4(com.tools20022.repository.msg.AmountAndDirection29 localTaxCountrySpecific4) {
		this.localTaxCountrySpecific4 = localTaxCountrySpecific4;
	}

	@XmlElement(name = "ShrdBrkrgAmt")
	public AmountAndDirection29 getSharedBrokerageAmount() {
		return sharedBrokerageAmount;
	}

	public void setSharedBrokerageAmount(com.tools20022.repository.msg.AmountAndDirection29 sharedBrokerageAmount) {
		this.sharedBrokerageAmount = sharedBrokerageAmount;
	}

	@XmlElement(name = "MktMmbFeeAmt")
	public AmountAndDirection29 getMarketMemberFeeAmount() {
		return marketMemberFeeAmount;
	}

	public void setMarketMemberFeeAmount(com.tools20022.repository.msg.AmountAndDirection29 marketMemberFeeAmount) {
		this.marketMemberFeeAmount = marketMemberFeeAmount;
	}

	@XmlElement(name = "RmnrtnAmtReq")
	public YesNoIndicator getRemunerationAmountRequest() {
		return remunerationAmountRequest;
	}

	public void setRemunerationAmountRequest(YesNoIndicator remunerationAmountRequest) {
		this.remunerationAmountRequest = remunerationAmountRequest;
	}

	@XmlElement(name = "RmnrtnAmt")
	public AmountAndDirection29 getRemunerationAmount() {
		return remunerationAmount;
	}

	public void setRemunerationAmount(com.tools20022.repository.msg.AmountAndDirection29 remunerationAmount) {
		this.remunerationAmount = remunerationAmount;
	}

	@XmlElement(name = "BrrwgIntrstAmt")
	public AmountAndDirection29 getBorrowingInterestAmount() {
		return borrowingInterestAmount;
	}

	public void setBorrowingInterestAmount(com.tools20022.repository.msg.AmountAndDirection29 borrowingInterestAmount) {
		this.borrowingInterestAmount = borrowingInterestAmount;
	}

	@XmlElement(name = "BrrwgFee")
	public AmountAndDirection29 getBorrowingFee() {
		return borrowingFee;
	}

	public void setBorrowingFee(com.tools20022.repository.msg.AmountAndDirection29 borrowingFee) {
		this.borrowingFee = borrowingFee;
	}

	@XmlElement(name = "NetMktVal")
	public AmountAndDirection29 getNetMarketValue() {
		return netMarketValue;
	}

	public void setNetMarketValue(com.tools20022.repository.msg.AmountAndDirection29 netMarketValue) {
		this.netMarketValue = netMarketValue;
	}

	@XmlElement(name = "RmngFaceVal")
	public AmountAndDirection29 getRemainingFaceValue() {
		return remainingFaceValue;
	}

	public void setRemainingFaceValue(com.tools20022.repository.msg.AmountAndDirection29 remainingFaceValue) {
		this.remainingFaceValue = remainingFaceValue;
	}

	@XmlElement(name = "RmngBookVal")
	public AmountAndDirection29 getRemainingBookValue() {
		return remainingBookValue;
	}

	public void setRemainingBookValue(com.tools20022.repository.msg.AmountAndDirection29 remainingBookValue) {
		this.remainingBookValue = remainingBookValue;
	}

	@XmlElement(name = "ClrBrkrComssn")
	public AmountAndDirection29 getClearingBrokerCommission() {
		return clearingBrokerCommission;
	}

	public void setClearingBrokerCommission(com.tools20022.repository.msg.AmountAndDirection29 clearingBrokerCommission) {
		this.clearingBrokerCommission = clearingBrokerCommission;
	}

	@XmlElement(name = "DiffInPric")
	public AmountAndDirection29 getDifferenceInPrice() {
		return differenceInPrice;
	}

	public void setDifferenceInPrice(com.tools20022.repository.msg.AmountAndDirection29 differenceInPrice) {
		this.differenceInPrice = differenceInPrice;
	}

	@XmlElement(name = "OddLotFee")
	public YesNoIndicator getOddLotFee() {
		return oddLotFee;
	}

	public void setOddLotFee(YesNoIndicator oddLotFee) {
		this.oddLotFee = oddLotFee;
	}
}