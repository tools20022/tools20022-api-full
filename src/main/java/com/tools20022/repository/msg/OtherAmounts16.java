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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection29;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherAmounts16", propOrder = {"chargesFees", "countryNationalFederalTax", "executingBrokerAmount", "issueDiscountAllowance", "paymentLevyTax", "localTax", "localBrokerCommission", "margin", "other", "regulatoryAmount",
		"specialConcession", "stampDuty", "stockExchangeTax", "transferTax", "transactionTax", "valueAddedTax", "withholdingTax", "netGainLoss", "consumptionTax", "matchingConfirmationFee", "convertedAmount", "originalCurrencyAmount",
		"bookValue", "accruedCapitalisationAmount", "localTaxCountrySpecific1", "localTaxCountrySpecific2", "localTaxCountrySpecific3", "localTaxCountrySpecific4", "sharedBrokerageAmount", "marketMemberFeeAmount",
		"remunerationAmountRequest", "remunerationAmount", "borrowingInterestAmount", "borrowingFee", "netMarketValue", "remainingFaceValue", "remainingBookValue", "clearingBrokerCommission", "differenceInPrice", "oddLotFee"})
public class OtherAmounts16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ChrgsFees")
	protected AmountAndDirection29 chargesFees;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmChargesFees = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getChargesFees();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setChargesFees(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryNtlFdrlTax")
	protected AmountAndDirection29 countryNationalFederalTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmCountryNationalFederalTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "CtryNtlFdrlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COUN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryNationalFederalTax";
			definition = "Amount of country, national or federal tax charged by the jurisdiction in which the account servicer is located.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getCountryNationalFederalTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setCountryNationalFederalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctgBrkrAmt")
	protected AmountAndDirection29 executingBrokerAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmExecutingBrokerAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::EXEC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getExecutingBrokerAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setExecutingBrokerAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDscntAllwnc")
	protected AmountAndDirection29 issueDiscountAllowance;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmIssueDiscountAllowance = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDiscountAllowance;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "IsseDscntAllwnc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ISDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Amount of money defined as a discount on a new issue or on a tranche of an existing issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getIssueDiscountAllowance();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setIssueDiscountAllowance(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtLevyTax")
	protected AmountAndDirection29 paymentLevyTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmPaymentLevyTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "PmtLevyTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LEVY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentLevyTax";
			definition = "Amount of payment levy tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getPaymentLevyTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setPaymentLevyTax(value.orElse(null));
		}
	};
	@XmlElement(name = "LclTax")
	protected AmountAndDirection29 localTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmLocalTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTax";
			definition = "Tax charged by the jurisdiction in which the financial instrument settles.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getLocalTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setLocalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "LclBrkrComssn")
	protected AmountAndDirection29 localBrokerCommission;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmLocalBrokerCommission = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getLocalBrokerCommission();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setLocalBrokerCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "Mrgn")
	protected AmountAndDirection29 margin;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmMargin = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "Mrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::MARG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Amount of money deposited by the trading party in a margin account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getMargin();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected AmountAndDirection29 other;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmOther = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::OTHR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "An amount that is not indicated by a known business denomination.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setOther(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryAmt")
	protected AmountAndDirection29 regulatoryAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmRegulatoryAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RgltryAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getRegulatoryAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setRegulatoryAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SpclCncssn")
	protected AmountAndDirection29 specialConcession;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmSpecialConcession = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmSpecialConcessionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "SpclCncssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SPCN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcession";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getSpecialConcession();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setSpecialConcession(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDty")
	protected AmountAndDirection29 stampDuty;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmStampDuty = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getStampDuty();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setStampDuty(value.orElse(null));
		}
	};
	@XmlElement(name = "StockXchgTax")
	protected AmountAndDirection29 stockExchangeTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmStockExchangeTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getStockExchangeTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setStockExchangeTax(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfTax")
	protected AmountAndDirection29 transferTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmTransferTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "TrfTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferTax";
			definition = "Amount of tax levied on a transfer of ownership of financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getTransferTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setTransferTax(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTax")
	protected AmountAndDirection29 transactionTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmTransactionTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getTransactionTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setTransactionTax(value.orElse(null));
		}
	};
	@XmlElement(name = "ValAddedTax")
	protected AmountAndDirection29 valueAddedTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmValueAddedTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::VATA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Amount of value-added tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getValueAddedTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setValueAddedTax(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTax")
	protected AmountAndDirection29 withholdingTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmWithholdingTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::WITH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Amount of money that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getWithholdingTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setWithholdingTax(value.orElse(null));
		}
	};
	@XmlElement(name = "NetGnLoss")
	protected AmountAndDirection29 netGainLoss;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmNetGainLoss = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmNetGainLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "NetGnLoss";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ANTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getNetGainLoss();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setNetGainLoss(value.orElse(null));
		}
	};
	@XmlElement(name = "CsmptnTax")
	protected AmountAndDirection29 consumptionTax;
	/**
	 * 
	 <p>
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
	 * definition} = "A tax on spending on goods and services."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmConsumptionTax = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "CsmptnTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "A tax on spending on goods and services.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getConsumptionTax();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setConsumptionTax(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgConfFee")
	protected AmountAndDirection29 matchingConfirmationFee;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmMatchingConfirmationFee = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "MtchgConfFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingConfirmationFee";
			definition = "Amount of money charged for matching and/or confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getMatchingConfirmationFee();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setMatchingConfirmationFee(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvtdAmt")
	protected AmountAndDirection29 convertedAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmConvertedAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ConvtdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertedAmount";
			definition = "Amount following a foreign exchange conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getConvertedAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setConvertedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCcyAmt")
	protected AmountAndDirection29 originalCurrencyAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmOriginalCurrencyAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCcyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCurrencyAmount";
			definition = "Posting/settlement amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getOriginalCurrencyAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setOriginalCurrencyAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BookVal")
	protected AmountAndDirection29 bookValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmBookValue = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Cost of the securities. May be requested in some countries for tax purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getBookValue();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdCptlstnAmt")
	protected AmountAndDirection29 accruedCapitalisationAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmAccruedCapitalisationAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmAccruedCapitalisationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "AcrdCptlstnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently \nrestructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getAccruedCapitalisationAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setAccruedCapitalisationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "LclTaxCtrySpcfc1")
	protected AmountAndDirection29 localTaxCountrySpecific1;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmLocalTaxCountrySpecific1 = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc1";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific1";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getLocalTaxCountrySpecific1();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setLocalTaxCountrySpecific1(value.orElse(null));
		}
	};
	@XmlElement(name = "LclTaxCtrySpcfc2")
	protected AmountAndDirection29 localTaxCountrySpecific2;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmLocalTaxCountrySpecific2 = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc2";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific2";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getLocalTaxCountrySpecific2();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setLocalTaxCountrySpecific2(value.orElse(null));
		}
	};
	@XmlElement(name = "LclTaxCtrySpcfc3")
	protected AmountAndDirection29 localTaxCountrySpecific3;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmLocalTaxCountrySpecific3 = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc3";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific3";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getLocalTaxCountrySpecific3();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setLocalTaxCountrySpecific3(value.orElse(null));
		}
	};
	@XmlElement(name = "LclTaxCtrySpcfc4")
	protected AmountAndDirection29 localTaxCountrySpecific4;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmLocalTaxCountrySpecific4 = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "LclTaxCtrySpcfc4";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalTaxCountrySpecific4";
			definition = "Local tax as defined by the country in its market practice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getLocalTaxCountrySpecific4();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setLocalTaxCountrySpecific4(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrdBrkrgAmt")
	protected AmountAndDirection29 sharedBrokerageAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmSharedBrokerageAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ShrdBrkrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharedBrokerageAmount";
			definition = "Amount paid as result of transactions subject to shared brokerage commissions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getSharedBrokerageAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setSharedBrokerageAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MktMmbFeeAmt")
	protected AmountAndDirection29 marketMemberFeeAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmMarketMemberFeeAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "MktMmbFeeAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMemberFeeAmount";
			definition = "Indicates the total fees related to the trade, with deduction of rebates (on brokerage, commission or differential) granted by the market member (fee amount with tax excluded).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getMarketMemberFeeAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setMarketMemberFeeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RmnrtnAmtReq")
	protected YesNoIndicator remunerationAmountRequest;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<YesNoIndicator>> mmRemunerationAmountRequest = new MMMessageAttribute<OtherAmounts16, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmnrtnAmtReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemunerationAmountRequest";
			definition = "Specifies that this information is available upon request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(OtherAmounts16 obj) {
			return obj.getRemunerationAmountRequest();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<YesNoIndicator> value) {
			obj.setRemunerationAmountRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "RmnrtnAmt")
	protected AmountAndDirection29 remunerationAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmRemunerationAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Broker.mmRemunerationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmnrtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemunerationAmount";
			definition = "Specifies the source and amount of any other remuneration received or to be received by the broker in connection with the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getRemunerationAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setRemunerationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwgIntrstAmt")
	protected AmountAndDirection29 borrowingInterestAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmBorrowingInterestAmount = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "BrrwgIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingInterestAmount";
			definition = "Amount to be paid by the lender to the borrower calculated based on the interest rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getBorrowingInterestAmount();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setBorrowingInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwgFee")
	protected AmountAndDirection29 borrowingFee;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmBorrowingFee = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesLending.mmBorrowingFee;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "BrrwgFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingFee";
			definition = "Amount to be paid by the Borrower to the Lender for the securities borrowed calculated based on the bond loan rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getBorrowingFee();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setBorrowingFee(value.orElse(null));
		}
	};
	@XmlElement(name = "NetMktVal")
	protected AmountAndDirection29 netMarketValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmNetMarketValue = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmMarketValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "NetMktVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetMarketValue";
			definition = "Net market value of the securities lent used to calculate the collateral amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getNetMarketValue();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setNetMarketValue(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngFaceVal")
	protected AmountAndDirection29 remainingFaceValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmRemainingFaceValue = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmngFaceVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingFaceValue";
			definition = "Remaining nominal value of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getRemainingFaceValue();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setRemainingFaceValue(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngBookVal")
	protected AmountAndDirection29 remainingBookValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmRemainingBookValue = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "RmngBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingBookValue";
			definition = "Remaining value at which an asset is carried on a balance sheet.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getRemainingBookValue();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setRemainingBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrBrkrComssn")
	protected AmountAndDirection29 clearingBrokerCommission;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCO</li>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmClearingBrokerCommission = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrComssn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerCommission";
			definition = "Amount of commission paid to a clearing broker.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getClearingBrokerCommission();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setClearingBrokerCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "DiffInPric")
	protected AmountAndDirection29 differenceInPrice;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>> mmDifferenceInPrice = new MMMessageAttribute<OtherAmounts16, Optional<AmountAndDirection29>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "DiffInPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferenceInPrice";
			definition = "Difference between the deal price and another reference price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(OtherAmounts16 obj) {
			return obj.getDifferenceInPrice();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<AmountAndDirection29> value) {
			obj.setDifferenceInPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OddLotFee")
	protected YesNoIndicator oddLotFee;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<OtherAmounts16, Optional<YesNoIndicator>> mmOddLotFee = new MMMessageAttribute<OtherAmounts16, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
			isDerived = false;
			xmlTag = "OddLotFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotFee";
			definition = "Specifies that the odd-lot differential or equivalent fee has been paid by such customer in connection with the execution of an order for an odd-lot number of shares or units (or principal amount) of a security and the fact that the amount of any such differential or fee will be furnished upon oral or written request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(OtherAmounts16 obj) {
			return obj.getOddLotFee();
		}

		@Override
		public void setValue(OtherAmounts16 obj, Optional<YesNoIndicator> value) {
			obj.setOddLotFee(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts16.mmChargesFees, com.tools20022.repository.msg.OtherAmounts16.mmCountryNationalFederalTax,
						com.tools20022.repository.msg.OtherAmounts16.mmExecutingBrokerAmount, com.tools20022.repository.msg.OtherAmounts16.mmIssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts16.mmPaymentLevyTax,
						com.tools20022.repository.msg.OtherAmounts16.mmLocalTax, com.tools20022.repository.msg.OtherAmounts16.mmLocalBrokerCommission, com.tools20022.repository.msg.OtherAmounts16.mmMargin,
						com.tools20022.repository.msg.OtherAmounts16.mmOther, com.tools20022.repository.msg.OtherAmounts16.mmRegulatoryAmount, com.tools20022.repository.msg.OtherAmounts16.mmSpecialConcession,
						com.tools20022.repository.msg.OtherAmounts16.mmStampDuty, com.tools20022.repository.msg.OtherAmounts16.mmStockExchangeTax, com.tools20022.repository.msg.OtherAmounts16.mmTransferTax,
						com.tools20022.repository.msg.OtherAmounts16.mmTransactionTax, com.tools20022.repository.msg.OtherAmounts16.mmValueAddedTax, com.tools20022.repository.msg.OtherAmounts16.mmWithholdingTax,
						com.tools20022.repository.msg.OtherAmounts16.mmNetGainLoss, com.tools20022.repository.msg.OtherAmounts16.mmConsumptionTax, com.tools20022.repository.msg.OtherAmounts16.mmMatchingConfirmationFee,
						com.tools20022.repository.msg.OtherAmounts16.mmConvertedAmount, com.tools20022.repository.msg.OtherAmounts16.mmOriginalCurrencyAmount, com.tools20022.repository.msg.OtherAmounts16.mmBookValue,
						com.tools20022.repository.msg.OtherAmounts16.mmAccruedCapitalisationAmount, com.tools20022.repository.msg.OtherAmounts16.mmLocalTaxCountrySpecific1,
						com.tools20022.repository.msg.OtherAmounts16.mmLocalTaxCountrySpecific2, com.tools20022.repository.msg.OtherAmounts16.mmLocalTaxCountrySpecific3,
						com.tools20022.repository.msg.OtherAmounts16.mmLocalTaxCountrySpecific4, com.tools20022.repository.msg.OtherAmounts16.mmSharedBrokerageAmount, com.tools20022.repository.msg.OtherAmounts16.mmMarketMemberFeeAmount,
						com.tools20022.repository.msg.OtherAmounts16.mmRemunerationAmountRequest, com.tools20022.repository.msg.OtherAmounts16.mmRemunerationAmount, com.tools20022.repository.msg.OtherAmounts16.mmBorrowingInterestAmount,
						com.tools20022.repository.msg.OtherAmounts16.mmBorrowingFee, com.tools20022.repository.msg.OtherAmounts16.mmNetMarketValue, com.tools20022.repository.msg.OtherAmounts16.mmRemainingFaceValue,
						com.tools20022.repository.msg.OtherAmounts16.mmRemainingBookValue, com.tools20022.repository.msg.OtherAmounts16.mmClearingBrokerCommission, com.tools20022.repository.msg.OtherAmounts16.mmDifferenceInPrice,
						com.tools20022.repository.msg.OtherAmounts16.mmOddLotFee);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmOtherAmounts, SecuritiesTradeConfirmationV02.mmOtherAmounts, SecuritiesTradeConfirmationV03.mmOtherAmounts);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherAmounts16";
				definition = "Identifies other amounts pertaining to the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection29> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public OtherAmounts16 setChargesFees(AmountAndDirection29 chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<AmountAndDirection29> getCountryNationalFederalTax() {
		return countryNationalFederalTax == null ? Optional.empty() : Optional.of(countryNationalFederalTax);
	}

	public OtherAmounts16 setCountryNationalFederalTax(AmountAndDirection29 countryNationalFederalTax) {
		this.countryNationalFederalTax = countryNationalFederalTax;
		return this;
	}

	public Optional<AmountAndDirection29> getExecutingBrokerAmount() {
		return executingBrokerAmount == null ? Optional.empty() : Optional.of(executingBrokerAmount);
	}

	public OtherAmounts16 setExecutingBrokerAmount(AmountAndDirection29 executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getIssueDiscountAllowance() {
		return issueDiscountAllowance == null ? Optional.empty() : Optional.of(issueDiscountAllowance);
	}

	public OtherAmounts16 setIssueDiscountAllowance(AmountAndDirection29 issueDiscountAllowance) {
		this.issueDiscountAllowance = issueDiscountAllowance;
		return this;
	}

	public Optional<AmountAndDirection29> getPaymentLevyTax() {
		return paymentLevyTax == null ? Optional.empty() : Optional.of(paymentLevyTax);
	}

	public OtherAmounts16 setPaymentLevyTax(AmountAndDirection29 paymentLevyTax) {
		this.paymentLevyTax = paymentLevyTax;
		return this;
	}

	public Optional<AmountAndDirection29> getLocalTax() {
		return localTax == null ? Optional.empty() : Optional.of(localTax);
	}

	public OtherAmounts16 setLocalTax(AmountAndDirection29 localTax) {
		this.localTax = localTax;
		return this;
	}

	public Optional<AmountAndDirection29> getLocalBrokerCommission() {
		return localBrokerCommission == null ? Optional.empty() : Optional.of(localBrokerCommission);
	}

	public OtherAmounts16 setLocalBrokerCommission(AmountAndDirection29 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
		return this;
	}

	public Optional<AmountAndDirection29> getMargin() {
		return margin == null ? Optional.empty() : Optional.of(margin);
	}

	public OtherAmounts16 setMargin(AmountAndDirection29 margin) {
		this.margin = margin;
		return this;
	}

	public Optional<AmountAndDirection29> getOther() {
		return other == null ? Optional.empty() : Optional.of(other);
	}

	public OtherAmounts16 setOther(AmountAndDirection29 other) {
		this.other = other;
		return this;
	}

	public Optional<AmountAndDirection29> getRegulatoryAmount() {
		return regulatoryAmount == null ? Optional.empty() : Optional.of(regulatoryAmount);
	}

	public OtherAmounts16 setRegulatoryAmount(AmountAndDirection29 regulatoryAmount) {
		this.regulatoryAmount = regulatoryAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getSpecialConcession() {
		return specialConcession == null ? Optional.empty() : Optional.of(specialConcession);
	}

	public OtherAmounts16 setSpecialConcession(AmountAndDirection29 specialConcession) {
		this.specialConcession = specialConcession;
		return this;
	}

	public Optional<AmountAndDirection29> getStampDuty() {
		return stampDuty == null ? Optional.empty() : Optional.of(stampDuty);
	}

	public OtherAmounts16 setStampDuty(AmountAndDirection29 stampDuty) {
		this.stampDuty = stampDuty;
		return this;
	}

	public Optional<AmountAndDirection29> getStockExchangeTax() {
		return stockExchangeTax == null ? Optional.empty() : Optional.of(stockExchangeTax);
	}

	public OtherAmounts16 setStockExchangeTax(AmountAndDirection29 stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
		return this;
	}

	public Optional<AmountAndDirection29> getTransferTax() {
		return transferTax == null ? Optional.empty() : Optional.of(transferTax);
	}

	public OtherAmounts16 setTransferTax(AmountAndDirection29 transferTax) {
		this.transferTax = transferTax;
		return this;
	}

	public Optional<AmountAndDirection29> getTransactionTax() {
		return transactionTax == null ? Optional.empty() : Optional.of(transactionTax);
	}

	public OtherAmounts16 setTransactionTax(AmountAndDirection29 transactionTax) {
		this.transactionTax = transactionTax;
		return this;
	}

	public Optional<AmountAndDirection29> getValueAddedTax() {
		return valueAddedTax == null ? Optional.empty() : Optional.of(valueAddedTax);
	}

	public OtherAmounts16 setValueAddedTax(AmountAndDirection29 valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
		return this;
	}

	public Optional<AmountAndDirection29> getWithholdingTax() {
		return withholdingTax == null ? Optional.empty() : Optional.of(withholdingTax);
	}

	public OtherAmounts16 setWithholdingTax(AmountAndDirection29 withholdingTax) {
		this.withholdingTax = withholdingTax;
		return this;
	}

	public Optional<AmountAndDirection29> getNetGainLoss() {
		return netGainLoss == null ? Optional.empty() : Optional.of(netGainLoss);
	}

	public OtherAmounts16 setNetGainLoss(AmountAndDirection29 netGainLoss) {
		this.netGainLoss = netGainLoss;
		return this;
	}

	public Optional<AmountAndDirection29> getConsumptionTax() {
		return consumptionTax == null ? Optional.empty() : Optional.of(consumptionTax);
	}

	public OtherAmounts16 setConsumptionTax(AmountAndDirection29 consumptionTax) {
		this.consumptionTax = consumptionTax;
		return this;
	}

	public Optional<AmountAndDirection29> getMatchingConfirmationFee() {
		return matchingConfirmationFee == null ? Optional.empty() : Optional.of(matchingConfirmationFee);
	}

	public OtherAmounts16 setMatchingConfirmationFee(AmountAndDirection29 matchingConfirmationFee) {
		this.matchingConfirmationFee = matchingConfirmationFee;
		return this;
	}

	public Optional<AmountAndDirection29> getConvertedAmount() {
		return convertedAmount == null ? Optional.empty() : Optional.of(convertedAmount);
	}

	public OtherAmounts16 setConvertedAmount(AmountAndDirection29 convertedAmount) {
		this.convertedAmount = convertedAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getOriginalCurrencyAmount() {
		return originalCurrencyAmount == null ? Optional.empty() : Optional.of(originalCurrencyAmount);
	}

	public OtherAmounts16 setOriginalCurrencyAmount(AmountAndDirection29 originalCurrencyAmount) {
		this.originalCurrencyAmount = originalCurrencyAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getBookValue() {
		return bookValue == null ? Optional.empty() : Optional.of(bookValue);
	}

	public OtherAmounts16 setBookValue(AmountAndDirection29 bookValue) {
		this.bookValue = bookValue;
		return this;
	}

	public Optional<AmountAndDirection29> getAccruedCapitalisationAmount() {
		return accruedCapitalisationAmount == null ? Optional.empty() : Optional.of(accruedCapitalisationAmount);
	}

	public OtherAmounts16 setAccruedCapitalisationAmount(AmountAndDirection29 accruedCapitalisationAmount) {
		this.accruedCapitalisationAmount = accruedCapitalisationAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getLocalTaxCountrySpecific1() {
		return localTaxCountrySpecific1 == null ? Optional.empty() : Optional.of(localTaxCountrySpecific1);
	}

	public OtherAmounts16 setLocalTaxCountrySpecific1(AmountAndDirection29 localTaxCountrySpecific1) {
		this.localTaxCountrySpecific1 = localTaxCountrySpecific1;
		return this;
	}

	public Optional<AmountAndDirection29> getLocalTaxCountrySpecific2() {
		return localTaxCountrySpecific2 == null ? Optional.empty() : Optional.of(localTaxCountrySpecific2);
	}

	public OtherAmounts16 setLocalTaxCountrySpecific2(AmountAndDirection29 localTaxCountrySpecific2) {
		this.localTaxCountrySpecific2 = localTaxCountrySpecific2;
		return this;
	}

	public Optional<AmountAndDirection29> getLocalTaxCountrySpecific3() {
		return localTaxCountrySpecific3 == null ? Optional.empty() : Optional.of(localTaxCountrySpecific3);
	}

	public OtherAmounts16 setLocalTaxCountrySpecific3(AmountAndDirection29 localTaxCountrySpecific3) {
		this.localTaxCountrySpecific3 = localTaxCountrySpecific3;
		return this;
	}

	public Optional<AmountAndDirection29> getLocalTaxCountrySpecific4() {
		return localTaxCountrySpecific4 == null ? Optional.empty() : Optional.of(localTaxCountrySpecific4);
	}

	public OtherAmounts16 setLocalTaxCountrySpecific4(AmountAndDirection29 localTaxCountrySpecific4) {
		this.localTaxCountrySpecific4 = localTaxCountrySpecific4;
		return this;
	}

	public Optional<AmountAndDirection29> getSharedBrokerageAmount() {
		return sharedBrokerageAmount == null ? Optional.empty() : Optional.of(sharedBrokerageAmount);
	}

	public OtherAmounts16 setSharedBrokerageAmount(AmountAndDirection29 sharedBrokerageAmount) {
		this.sharedBrokerageAmount = sharedBrokerageAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getMarketMemberFeeAmount() {
		return marketMemberFeeAmount == null ? Optional.empty() : Optional.of(marketMemberFeeAmount);
	}

	public OtherAmounts16 setMarketMemberFeeAmount(AmountAndDirection29 marketMemberFeeAmount) {
		this.marketMemberFeeAmount = marketMemberFeeAmount;
		return this;
	}

	public Optional<YesNoIndicator> getRemunerationAmountRequest() {
		return remunerationAmountRequest == null ? Optional.empty() : Optional.of(remunerationAmountRequest);
	}

	public OtherAmounts16 setRemunerationAmountRequest(YesNoIndicator remunerationAmountRequest) {
		this.remunerationAmountRequest = remunerationAmountRequest;
		return this;
	}

	public Optional<AmountAndDirection29> getRemunerationAmount() {
		return remunerationAmount == null ? Optional.empty() : Optional.of(remunerationAmount);
	}

	public OtherAmounts16 setRemunerationAmount(AmountAndDirection29 remunerationAmount) {
		this.remunerationAmount = remunerationAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getBorrowingInterestAmount() {
		return borrowingInterestAmount == null ? Optional.empty() : Optional.of(borrowingInterestAmount);
	}

	public OtherAmounts16 setBorrowingInterestAmount(AmountAndDirection29 borrowingInterestAmount) {
		this.borrowingInterestAmount = borrowingInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection29> getBorrowingFee() {
		return borrowingFee == null ? Optional.empty() : Optional.of(borrowingFee);
	}

	public OtherAmounts16 setBorrowingFee(AmountAndDirection29 borrowingFee) {
		this.borrowingFee = borrowingFee;
		return this;
	}

	public Optional<AmountAndDirection29> getNetMarketValue() {
		return netMarketValue == null ? Optional.empty() : Optional.of(netMarketValue);
	}

	public OtherAmounts16 setNetMarketValue(AmountAndDirection29 netMarketValue) {
		this.netMarketValue = netMarketValue;
		return this;
	}

	public Optional<AmountAndDirection29> getRemainingFaceValue() {
		return remainingFaceValue == null ? Optional.empty() : Optional.of(remainingFaceValue);
	}

	public OtherAmounts16 setRemainingFaceValue(AmountAndDirection29 remainingFaceValue) {
		this.remainingFaceValue = remainingFaceValue;
		return this;
	}

	public Optional<AmountAndDirection29> getRemainingBookValue() {
		return remainingBookValue == null ? Optional.empty() : Optional.of(remainingBookValue);
	}

	public OtherAmounts16 setRemainingBookValue(AmountAndDirection29 remainingBookValue) {
		this.remainingBookValue = remainingBookValue;
		return this;
	}

	public Optional<AmountAndDirection29> getClearingBrokerCommission() {
		return clearingBrokerCommission == null ? Optional.empty() : Optional.of(clearingBrokerCommission);
	}

	public OtherAmounts16 setClearingBrokerCommission(AmountAndDirection29 clearingBrokerCommission) {
		this.clearingBrokerCommission = clearingBrokerCommission;
		return this;
	}

	public Optional<AmountAndDirection29> getDifferenceInPrice() {
		return differenceInPrice == null ? Optional.empty() : Optional.of(differenceInPrice);
	}

	public OtherAmounts16 setDifferenceInPrice(AmountAndDirection29 differenceInPrice) {
		this.differenceInPrice = differenceInPrice;
		return this;
	}

	public Optional<YesNoIndicator> getOddLotFee() {
		return oddLotFee == null ? Optional.empty() : Optional.of(oddLotFee);
	}

	public OtherAmounts16 setOddLotFee(YesNoIndicator oddLotFee) {
		this.oddLotFee = oddLotFee;
		return this;
	}
}