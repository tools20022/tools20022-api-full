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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice;
import com.tools20022.repository.choice.QuantityType1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Charge26;
import com.tools20022.repository.msg.Commission21;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Breakdown of cash movements into a fund as a result of investment funds
 * transactions, eg, subscriptions or switch-in.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmAmount
 * FundCashInBreakdown3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmUnitsNumber
 * FundCashInBreakdown3.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmNewAmountIndicator
 * FundCashInBreakdown3.mmNewAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmInvestmentFundTransactionInType
 * FundCashInBreakdown3.mmInvestmentFundTransactionInType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmOriginalOrderQuantityType
 * FundCashInBreakdown3.mmOriginalOrderQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmChargeDetails
 * FundCashInBreakdown3.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmCommissionDetails
 * FundCashInBreakdown3.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmSettlementCurrency
 * FundCashInBreakdown3.mmSettlementCurrency}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashInBreakdown3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2
 * FundCashInBreakdown2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundCashInBreakdown3", propOrder = {"amount", "unitsNumber", "newAmountIndicator", "investmentFundTransactionInType", "originalOrderQuantityType", "chargeDetails", "commissionDetails", "settlementCurrency"})
public class FundCashInBreakdown3 {

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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
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
	 * definition} = "Amount of cash flow in, expressed as an amount of money."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmAmount
	 * FundCashInBreakdown2.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashInBreakdown3, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAmount = new MMMessageAttribute<FundCashInBreakdown3, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of cash flow in, expressed as an amount of money.";
			previousVersion_lazy = () -> FundCashInBreakdown2.mmAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FundCashInBreakdown3 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
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
	 * "Amount of the cash flow in, expressed as a number of units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmUnitsNumber
	 * FundCashInBreakdown2.mmUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashInBreakdown3, Optional<FinancialInstrumentQuantity1>> mmUnitsNumber = new MMMessageAttribute<FundCashInBreakdown3, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Amount of the cash flow in, expressed as a number of units.";
			previousVersion_lazy = () -> FundCashInBreakdown2.mmUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(FundCashInBreakdown3 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, Optional<FinancialInstrumentQuantity1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
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
	 * "Indicates whether the cash flow is an item that did not appear on the previously sent report, for example, because it was received close to cut-off time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmNewAmountIndicator
	 * FundCashInBreakdown2.mmNewAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashInBreakdown3, Optional<YesNoIndicator>> mmNewAmountIndicator = new MMMessageAttribute<FundCashInBreakdown3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "NewAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAmountIndicator";
			definition = "Indicates whether the cash flow is an item that did not appear on the previously sent report, for example, because it was received close to cut-off time.";
			previousVersion_lazy = () -> FundCashInBreakdown2.mmNewAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FundCashInBreakdown3 obj) {
			return obj.getNewAmountIndicator();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, Optional<YesNoIndicator> value) {
			obj.setNewAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtFndTxInTp", required = true)
	protected InvestmentFundTransactionInType1Choice investmentFundTransactionInType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice
	 * InvestmentFundTransactionInType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndTxInTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactionInType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction that resulted in the cash-in movement, for example, subscription, switch-in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashInBreakdown3, InvestmentFundTransactionInType1Choice> mmInvestmentFundTransactionInType = new MMMessageAssociationEnd<FundCashInBreakdown3, InvestmentFundTransactionInType1Choice>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndTxInTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionInType";
			definition = "Type of transaction that resulted in the cash-in movement, for example, subscription, switch-in.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentFundTransactionInType1Choice.mmObject();
		}

		@Override
		public InvestmentFundTransactionInType1Choice getValue(FundCashInBreakdown3 obj) {
			return obj.getInvestmentFundTransactionInType();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, InvestmentFundTransactionInType1Choice value) {
			obj.setInvestmentFundTransactionInType(value);
		}
	};
	@XmlElement(name = "OrgnlOrdrQtyTp", required = true)
	protected QuantityType1Choice originalOrderQuantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.QuantityType1Choice
	 * QuantityType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuantityType
	 * SecuritiesOrder.mmQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
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
	 * "Specifies how the original order was expressed that resulted in the cash-in movement, that is cash or units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashInBreakdown3, QuantityType1Choice> mmOriginalOrderQuantityType = new MMMessageAssociationEnd<FundCashInBreakdown3, QuantityType1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityType";
			definition = "Specifies how the original order was expressed that resulted in the cash-in movement, that is cash or units.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityType1Choice.mmObject();
		}

		@Override
		public QuantityType1Choice getValue(FundCashInBreakdown3 obj) {
			return obj.getOriginalOrderQuantityType();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, QuantityType1Choice value) {
			obj.setOriginalOrderQuantityType(value);
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge26> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge26 Charge26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmChargeDetails
	 * FundCashInBreakdown2.mmChargeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashInBreakdown3, List<Charge26>> mmChargeDetails = new MMMessageAssociationEnd<FundCashInBreakdown3, List<Charge26>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			previousVersion_lazy = () -> FundCashInBreakdown2.mmChargeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge26.mmObject();
		}

		@Override
		public List<Charge26> getValue(FundCashInBreakdown3 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, List<Charge26> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission21> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission21
	 * Commission21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
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
	 * "Information related to the commission applied to an order, for example, back-end or front-end commission."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmCommissionDetails
	 * FundCashInBreakdown2.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashInBreakdown3, List<Commission21>> mmCommissionDetails = new MMMessageAssociationEnd<FundCashInBreakdown3, List<Commission21>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Information related to the commission applied to an order, for example, back-end or front-end commission.";
			previousVersion_lazy = () -> FundCashInBreakdown2.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission21.mmObject();
		}

		@Override
		public List<Commission21> getValue(FundCashInBreakdown3 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, List<Commission21> value) {
			obj.setCommissionDetails(value);
		}
	};
	@XmlElement(name = "SttlmCcy")
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSettlementCurrency
	 * SecuritiesOrder.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement currency for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashInBreakdown3, Optional<ActiveCurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<FundCashInBreakdown3, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Settlement currency for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(FundCashInBreakdown3 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(FundCashInBreakdown3 obj, Optional<ActiveCurrencyCode> value) {
			obj.setSettlementCurrency(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashInBreakdown3.mmAmount, com.tools20022.repository.msg.FundCashInBreakdown3.mmUnitsNumber,
						com.tools20022.repository.msg.FundCashInBreakdown3.mmNewAmountIndicator, com.tools20022.repository.msg.FundCashInBreakdown3.mmInvestmentFundTransactionInType,
						com.tools20022.repository.msg.FundCashInBreakdown3.mmOriginalOrderQuantityType, com.tools20022.repository.msg.FundCashInBreakdown3.mmChargeDetails,
						com.tools20022.repository.msg.FundCashInBreakdown3.mmCommissionDetails, com.tools20022.repository.msg.FundCashInBreakdown3.mmSettlementCurrency);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashInBreakdown3";
				definition = "Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
				previousVersion_lazy = () -> FundCashInBreakdown2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public FundCashInBreakdown3 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getUnitsNumber() {
		return unitsNumber == null ? Optional.empty() : Optional.of(unitsNumber);
	}

	public FundCashInBreakdown3 setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
		return this;
	}

	public Optional<YesNoIndicator> getNewAmountIndicator() {
		return newAmountIndicator == null ? Optional.empty() : Optional.of(newAmountIndicator);
	}

	public FundCashInBreakdown3 setNewAmountIndicator(YesNoIndicator newAmountIndicator) {
		this.newAmountIndicator = newAmountIndicator;
		return this;
	}

	public InvestmentFundTransactionInType1Choice getInvestmentFundTransactionInType() {
		return investmentFundTransactionInType;
	}

	public FundCashInBreakdown3 setInvestmentFundTransactionInType(InvestmentFundTransactionInType1Choice investmentFundTransactionInType) {
		this.investmentFundTransactionInType = Objects.requireNonNull(investmentFundTransactionInType);
		return this;
	}

	public QuantityType1Choice getOriginalOrderQuantityType() {
		return originalOrderQuantityType;
	}

	public FundCashInBreakdown3 setOriginalOrderQuantityType(QuantityType1Choice originalOrderQuantityType) {
		this.originalOrderQuantityType = Objects.requireNonNull(originalOrderQuantityType);
		return this;
	}

	public List<Charge26> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public FundCashInBreakdown3 setChargeDetails(List<Charge26> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission21> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public FundCashInBreakdown3 setCommissionDetails(List<Commission21> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public Optional<ActiveCurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public FundCashInBreakdown3 setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}
}