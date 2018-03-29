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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code;
import com.tools20022.repository.codeset.OrderQuantityType2Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Charge16;
import com.tools20022.repository.msg.Commission9;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Breakdown of cash movements out of a fund as a result of investment funds
 * transactions, eg, redemptions or switch-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#InvestmentFundTransactionOutTypeOrExtendedRule
 * FundCashOutBreakdown2.InvestmentFundTransactionOutTypeOrExtendedRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType
 * FundCashOutBreakdown2.
 * OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmAmount
 * FundCashOutBreakdown2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmUnitsNumber
 * FundCashOutBreakdown2.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmNewAmountIndicator
 * FundCashOutBreakdown2.mmNewAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmInvestmentFundTransactionOutType
 * FundCashOutBreakdown2.mmInvestmentFundTransactionOutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmExtendedInvestmentFundTransactionOutType
 * FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmOriginalOrderQuantityType
 * FundCashOutBreakdown2.mmOriginalOrderQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmExtendedOriginalOrderQuantityType
 * FundCashOutBreakdown2.mmExtendedOriginalOrderQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmChargeDetails
 * FundCashOutBreakdown2.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmCommissionDetails
 * FundCashOutBreakdown2.mmCommissionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashOutBreakdown2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Breakdown of cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
 * FundCashOutBreakdown3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundCashOutBreakdown2", propOrder = {"amount", "unitsNumber", "newAmountIndicator", "investmentFundTransactionOutType", "extendedInvestmentFundTransactionOutType", "originalOrderQuantityType",
		"extendedOriginalOrderQuantityType", "chargeDetails", "commissionDetails"})
public class FundCashOutBreakdown2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt")
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash flow out, expressed as an amount of money."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmAmount
	 * FundCashOutBreakdown3.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAmount = new MMMessageAttribute<FundCashOutBreakdown2, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of cash flow out, expressed as an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FundCashOutBreakdown2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitsNb")
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the cash flow out, expressed as a number of units."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmUnitsNumber
	 * FundCashOutBreakdown3.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, Optional<FinancialInstrumentQuantity1>> mmUnitsNumber = new MMMessageAttribute<FundCashOutBreakdown2, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Amount of the cash flow out, expressed as a number of units.";
			nextVersions_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmUnitsNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(FundCashOutBreakdown2 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "NewAmtInd")
	protected YesNoIndicator newAmountIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash flow is an item that did not appear on the previously sent report, eg, because it was received close to cut-off time."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmNewAmountIndicator
	 * FundCashOutBreakdown3.mmNewAmountIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, Optional<YesNoIndicator>> mmNewAmountIndicator = new MMMessageAttribute<FundCashOutBreakdown2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "NewAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAmountIndicator";
			definition = "Indicates whether the cash flow is an item that did not appear on the previously sent report, eg, because it was received close to cut-off time.";
			nextVersions_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmNewAmountIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FundCashOutBreakdown2 obj) {
			return obj.getNewAmountIndicator();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, Optional<YesNoIndicator> value) {
			obj.setNewAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtFndTxOutTp", required = true)
	protected InvestmentFundTransactionOutType1Code investmentFundTransactionOutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code
	 * InvestmentFundTransactionOutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndTxOutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactionOutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the cash movements out of a fund by transaction type, eg, redemption, switch-out."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, InvestmentFundTransactionOutType1Code> mmInvestmentFundTransactionOutType = new MMMessageAttribute<FundCashOutBreakdown2, InvestmentFundTransactionOutType1Code>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndTxOutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionOutType";
			definition = "Breakdown of the cash movements out of a fund by transaction type, eg, redemption, switch-out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionOutType1Code.mmObject();
		}

		@Override
		public InvestmentFundTransactionOutType1Code getValue(FundCashOutBreakdown2 obj) {
			return obj.getInvestmentFundTransactionOutType();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, InvestmentFundTransactionOutType1Code value) {
			obj.setInvestmentFundTransactionOutType(value);
		}
	};
	@XmlElement(name = "XtndedInvstmtFndTxOutTp", required = true)
	protected Extended350Code extendedInvestmentFundTransactionOutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedInvstmtFndTxOutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedInvestmentFundTransactionOutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the cash movements out of a fund by transaction type, eg, redemption, switch-out."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, Extended350Code> mmExtendedInvestmentFundTransactionOutType = new MMMessageAttribute<FundCashOutBreakdown2, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "XtndedInvstmtFndTxOutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedInvestmentFundTransactionOutType";
			definition = "Breakdown of the cash movements out of a fund by transaction type, eg, redemption, switch-out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(FundCashOutBreakdown2 obj) {
			return obj.getExtendedInvestmentFundTransactionOutType();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, Extended350Code value) {
			obj.setExtendedInvestmentFundTransactionOutType(value);
		}
	};
	@XmlElement(name = "OrgnlOrdrQtyTp", required = true)
	protected OrderQuantityType2Code originalOrderQuantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityType2Code
	 * OrderQuantityType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuantityType
	 * SecuritiesOrder.mmQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlOrdrQtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the cash movements into a fund by order type, eg, order by quantity of units or amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, OrderQuantityType2Code> mmOriginalOrderQuantityType = new MMMessageAttribute<FundCashOutBreakdown2, OrderQuantityType2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityType";
			definition = "Breakdown of the cash movements into a fund by order type, eg, order by quantity of units or amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderQuantityType2Code.mmObject();
		}

		@Override
		public OrderQuantityType2Code getValue(FundCashOutBreakdown2 obj) {
			return obj.getOriginalOrderQuantityType();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, OrderQuantityType2Code value) {
			obj.setOriginalOrderQuantityType(value);
		}
	};
	@XmlElement(name = "XtndedOrgnlOrdrQtyTp", required = true)
	protected Extended350Code extendedOriginalOrderQuantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuantityType
	 * SecuritiesOrder.mmQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedOrgnlOrdrQtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedOriginalOrderQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the cash movements into a fund by transaction type, eg, subscription, switch-in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashOutBreakdown2, Extended350Code> mmExtendedOriginalOrderQuantityType = new MMMessageAttribute<FundCashOutBreakdown2, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "XtndedOrgnlOrdrQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOriginalOrderQuantityType";
			definition = "Breakdown of the cash movements into a fund by transaction type, eg, subscription, switch-in.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(FundCashOutBreakdown2 obj) {
			return obj.getExtendedOriginalOrderQuantityType();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, Extended350Code value) {
			obj.setExtendedOriginalOrderQuantityType(value);
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge16> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge16 Charge16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge for the placement of an order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmChargeDetails
	 * FundCashOutBreakdown3.mmChargeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashOutBreakdown2, List<Charge16>> mmChargeDetails = new MMMessageAssociationEnd<FundCashOutBreakdown2, List<Charge16>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			nextVersions_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmChargeDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge16.mmObject();
		}

		@Override
		public List<Charge16> getValue(FundCashOutBreakdown2 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, List<Charge16> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission9> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission9
	 * Commission9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the commission applied to an order, eg, back-end or front-end commission."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmCommissionDetails
	 * FundCashOutBreakdown3.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashOutBreakdown2, List<Commission9>> mmCommissionDetails = new MMMessageAssociationEnd<FundCashOutBreakdown2, List<Commission9>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Information related to the commission applied to an order, eg, back-end or front-end commission.";
			nextVersions_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmCommissionDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission9.mmObject();
		}

		@Override
		public List<Commission9> getValue(FundCashOutBreakdown2 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(FundCashOutBreakdown2 obj, List<Commission9> value) {
			obj.setCommissionDetails(value);
		}
	};
	/**
	 * Either InvestmentFundTransactionOutType or
	 * ExtendedInvestmentFundTransactionOutType must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmInvestmentFundTransactionOutType
	 * FundCashOutBreakdown2.mmInvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmExtendedInvestmentFundTransactionOutType
	 * FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactionOutTypeOrExtendedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either InvestmentFundTransactionOutType or ExtendedInvestmentFundTransactionOutType must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor InvestmentFundTransactionOutTypeOrExtendedRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionOutTypeOrExtendedRule";
			definition = "Either InvestmentFundTransactionOutType or ExtendedInvestmentFundTransactionOutType must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown2.mmInvestmentFundTransactionOutType, com.tools20022.repository.msg.FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType);
		}
	};
	/**
	 * Either OriginalOrderQuantityType or ExtendedOriginalOrderQuantityType
	 * must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmOriginalOrderQuantityType
	 * FundCashOutBreakdown2.mmOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmExtendedOriginalOrderQuantityType
	 * FundCashOutBreakdown2.mmExtendedOriginalOrderQuantityType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OriginalOrderQuantityType or ExtendedOriginalOrderQuantityType must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType";
			definition = "Either OriginalOrderQuantityType or ExtendedOriginalOrderQuantityType must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown2.mmOriginalOrderQuantityType, com.tools20022.repository.msg.FundCashOutBreakdown2.mmExtendedOriginalOrderQuantityType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown2.mmAmount, com.tools20022.repository.msg.FundCashOutBreakdown2.mmUnitsNumber,
						com.tools20022.repository.msg.FundCashOutBreakdown2.mmNewAmountIndicator, com.tools20022.repository.msg.FundCashOutBreakdown2.mmInvestmentFundTransactionOutType,
						com.tools20022.repository.msg.FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType, com.tools20022.repository.msg.FundCashOutBreakdown2.mmOriginalOrderQuantityType,
						com.tools20022.repository.msg.FundCashOutBreakdown2.mmExtendedOriginalOrderQuantityType, com.tools20022.repository.msg.FundCashOutBreakdown2.mmChargeDetails,
						com.tools20022.repository.msg.FundCashOutBreakdown2.mmCommissionDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FundCashOutBreakdown2";
				definition = "Breakdown of cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
				nextVersions_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown2.InvestmentFundTransactionOutTypeOrExtendedRule,
						com.tools20022.repository.msg.FundCashOutBreakdown2.OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public FundCashOutBreakdown2 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getUnitsNumber() {
		return unitsNumber == null ? Optional.empty() : Optional.of(unitsNumber);
	}

	public FundCashOutBreakdown2 setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
		return this;
	}

	public Optional<YesNoIndicator> getNewAmountIndicator() {
		return newAmountIndicator == null ? Optional.empty() : Optional.of(newAmountIndicator);
	}

	public FundCashOutBreakdown2 setNewAmountIndicator(YesNoIndicator newAmountIndicator) {
		this.newAmountIndicator = newAmountIndicator;
		return this;
	}

	public InvestmentFundTransactionOutType1Code getInvestmentFundTransactionOutType() {
		return investmentFundTransactionOutType;
	}

	public FundCashOutBreakdown2 setInvestmentFundTransactionOutType(InvestmentFundTransactionOutType1Code investmentFundTransactionOutType) {
		this.investmentFundTransactionOutType = Objects.requireNonNull(investmentFundTransactionOutType);
		return this;
	}

	public Extended350Code getExtendedInvestmentFundTransactionOutType() {
		return extendedInvestmentFundTransactionOutType;
	}

	public FundCashOutBreakdown2 setExtendedInvestmentFundTransactionOutType(Extended350Code extendedInvestmentFundTransactionOutType) {
		this.extendedInvestmentFundTransactionOutType = Objects.requireNonNull(extendedInvestmentFundTransactionOutType);
		return this;
	}

	public OrderQuantityType2Code getOriginalOrderQuantityType() {
		return originalOrderQuantityType;
	}

	public FundCashOutBreakdown2 setOriginalOrderQuantityType(OrderQuantityType2Code originalOrderQuantityType) {
		this.originalOrderQuantityType = Objects.requireNonNull(originalOrderQuantityType);
		return this;
	}

	public Extended350Code getExtendedOriginalOrderQuantityType() {
		return extendedOriginalOrderQuantityType;
	}

	public FundCashOutBreakdown2 setExtendedOriginalOrderQuantityType(Extended350Code extendedOriginalOrderQuantityType) {
		this.extendedOriginalOrderQuantityType = Objects.requireNonNull(extendedOriginalOrderQuantityType);
		return this;
	}

	public List<Charge16> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public FundCashOutBreakdown2 setChargeDetails(List<Charge16> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission9> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public FundCashOutBreakdown2 setCommissionDetails(List<Commission9> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}
}