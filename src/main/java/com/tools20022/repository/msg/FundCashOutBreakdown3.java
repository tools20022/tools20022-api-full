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
import com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice;
import com.tools20022.repository.choice.QuantityType1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Breakdown of cash movements out of a fund as a result of investment funds
 * transactions, eg, redemptions or switch-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmAmount
 * FundCashOutBreakdown3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmUnitsNumber
 * FundCashOutBreakdown3.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmNewAmountIndicator
 * FundCashOutBreakdown3.mmNewAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmInvestmentFundTransactionOutType
 * FundCashOutBreakdown3.mmInvestmentFundTransactionOutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmOriginalOrderQuantityType
 * FundCashOutBreakdown3.mmOriginalOrderQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmChargeDetails
 * FundCashOutBreakdown3.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmCommissionDetails
 * FundCashOutBreakdown3.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmSettlementCurrency
 * FundCashOutBreakdown3.mmSettlementCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
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
 * "FundCashOutBreakdown3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Breakdown of cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
 * FundCashOutBreakdown2}</li>
 * </ul>
 */
public class FundCashOutBreakdown3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * Amount of cash flow out, expressed as an amount of money.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmAmount
	 * FundCashOutBreakdown2.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of cash flow out, expressed as an amount of money.";
			previousVersion_lazy = () -> FundCashOutBreakdown2.mmAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * Amount of the cash flow out, expressed as a number of units.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmUnitsNumber
	 * FundCashOutBreakdown2.mmUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Amount of the cash flow out, expressed as a number of units.";
			previousVersion_lazy = () -> FundCashOutBreakdown2.mmUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected YesNoIndicator newAmountIndicator;
	/**
	 * Indicates whether the cash flow is an item that did not appear on the
	 * previously sent report, for example, because it was received close to
	 * cut-off time.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmNewAmountIndicator
	 * FundCashOutBreakdown2.mmNewAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "NewAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAmountIndicator";
			definition = "Indicates whether the cash flow is an item that did not appear on the previously sent report, for example, because it was received close to cut-off time.";
			previousVersion_lazy = () -> FundCashOutBreakdown2.mmNewAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected InvestmentFundTransactionOutType1Choice investmentFundTransactionOutType;
	/**
	 * Type of transaction that resulted in the cash-out movement, for example,
	 * redemption, switch-out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice
	 * InvestmentFundTransactionOutType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * "Type of transaction that resulted in the cash-out movement, for example, redemption, switch-out. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentFundTransactionOutType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndTxOutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionOutType";
			definition = "Type of transaction that resulted in the cash-out movement, for example, redemption, switch-out. ";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentFundTransactionOutType1Choice.mmObject();
		}
	};
	protected QuantityType1Choice originalOrderQuantityType;
	/**
	 * Specifies how the original order was expressed that resulted in the
	 * cash-out movement, that is cash or units.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * "Specifies how the original order was expressed that resulted in the cash-out movement, that is cash or units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalOrderQuantityType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityType";
			definition = "Specifies how the original order was expressed that resulted in the cash-out movement, that is cash or units.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityType1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Charge26> chargeDetails;
	/**
	 * Charge for the placement of an order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmChargeDetails
	 * FundCashOutBreakdown2.mmChargeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			previousVersion_lazy = () -> FundCashOutBreakdown2.mmChargeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge26.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission21> commissionDetails;
	/**
	 * Information related to the commission applied to an order, for example,
	 * back-end or front-end commission.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmCommissionDetails
	 * FundCashOutBreakdown2.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Information related to the commission applied to an order, for example, back-end or front-end commission.";
			previousVersion_lazy = () -> FundCashOutBreakdown2.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission21.mmObject();
		}
	};
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * Settlement currency for the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
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
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSettlementCurrency;
			componentContext_lazy = () -> FundCashOutBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Settlement currency for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmAmount, FundCashOutBreakdown3.mmUnitsNumber, FundCashOutBreakdown3.mmNewAmountIndicator, FundCashOutBreakdown3.mmInvestmentFundTransactionOutType,
						FundCashOutBreakdown3.mmOriginalOrderQuantityType, FundCashOutBreakdown3.mmChargeDetails, FundCashOutBreakdown3.mmCommissionDetails, FundCashOutBreakdown3.mmSettlementCurrency);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashOutBreakdown3";
				definition = "Breakdown of cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
				previousVersion_lazy = () -> FundCashOutBreakdown2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
	}

	public FinancialInstrumentQuantity1 getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public YesNoIndicator getNewAmountIndicator() {
		return newAmountIndicator;
	}

	public void setNewAmountIndicator(YesNoIndicator newAmountIndicator) {
		this.newAmountIndicator = newAmountIndicator;
	}

	public InvestmentFundTransactionOutType1Choice getInvestmentFundTransactionOutType() {
		return investmentFundTransactionOutType;
	}

	public void setInvestmentFundTransactionOutType(InvestmentFundTransactionOutType1Choice investmentFundTransactionOutType) {
		this.investmentFundTransactionOutType = investmentFundTransactionOutType;
	}

	public QuantityType1Choice getOriginalOrderQuantityType() {
		return originalOrderQuantityType;
	}

	public void setOriginalOrderQuantityType(QuantityType1Choice originalOrderQuantityType) {
		this.originalOrderQuantityType = originalOrderQuantityType;
	}

	public List<Charge26> getChargeDetails() {
		return chargeDetails;
	}

	public void setChargeDetails(List<com.tools20022.repository.msg.Charge26> chargeDetails) {
		this.chargeDetails = chargeDetails;
	}

	public List<Commission21> getCommissionDetails() {
		return commissionDetails;
	}

	public void setCommissionDetails(List<com.tools20022.repository.msg.Commission21> commissionDetails) {
		this.commissionDetails = commissionDetails;
	}

	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}
}