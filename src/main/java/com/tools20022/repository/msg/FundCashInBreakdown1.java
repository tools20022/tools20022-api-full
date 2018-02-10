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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmAmount
 * FundCashInBreakdown1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmUnitsNumber
 * FundCashInBreakdown1.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmNewAmountIndicator
 * FundCashInBreakdown1.mmNewAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmInvestmentFundTransactionInTypeDetails
 * FundCashInBreakdown1.mmInvestmentFundTransactionInTypeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmOriginalOrderQuantityDetails
 * FundCashInBreakdown1.mmOriginalOrderQuantityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmCommissionDetails
 * FundCashInBreakdown1.mmCommissionDetails}</li>
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
 * "FundCashInBreakdown1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundCashInBreakdown1", propOrder = {"amount", "unitsNumber", "newAmountIndicator", "investmentFundTransactionInTypeDetails", "originalOrderQuantityDetails", "commissionDetails"})
public class FundCashInBreakdown1 {

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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
	 * FundCashInBreakdown1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of cash flow in, expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
	 * FundCashInBreakdown1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Amount of the cash flow in, expressed as a number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
	 * FundCashInBreakdown1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "NewAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAmountIndicator";
			definition = "Indicates whether the cash flow is an item that did not appear on the previously sent report, eg, because it was received close to cut-off time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "InvstmtFndTxInTpDtls")
	protected InvestmentFundTransactionInType1 investmentFundTransactionInTypeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionInType1
	 * InvestmentFundTransactionInType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
	 * FundCashInBreakdown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndTxInTpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactionInTypeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the cash movements into a fund by transaction type, eg, subscription, switch-in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentFundTransactionInTypeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndTxInTpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionInTypeDetails";
			definition = "Breakdown of the cash movements into a fund by transaction type, eg, subscription, switch-in.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransactionInType1.mmObject();
		}
	};
	@XmlElement(name = "OrgnlOrdrQtyDtls")
	protected OriginalOrderQuantityType1 originalOrderQuantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalOrderQuantityType1
	 * OriginalOrderQuantityType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuantityType
	 * SecuritiesOrder.mmQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
	 * FundCashInBreakdown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlOrdrQtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderQuantityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the cash movements into a fund by order type, eg, order by quantity of units or amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalOrderQuantityDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrQtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityDetails";
			definition = "Breakdown of the cash movements into a fund by order type, eg, order by quantity of units or amount of money.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalOrderQuantityType1.mmObject();
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<com.tools20022.repository.msg.Commission4> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission4
	 * Commission4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
	 * FundCashInBreakdown1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Information related to the commission applied to an order, eg, back-end or front-end commission.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashInBreakdown1.mmAmount, com.tools20022.repository.msg.FundCashInBreakdown1.mmUnitsNumber,
						com.tools20022.repository.msg.FundCashInBreakdown1.mmNewAmountIndicator, com.tools20022.repository.msg.FundCashInBreakdown1.mmInvestmentFundTransactionInTypeDetails,
						com.tools20022.repository.msg.FundCashInBreakdown1.mmOriginalOrderQuantityDetails, com.tools20022.repository.msg.FundCashInBreakdown1.mmCommissionDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashInBreakdown1";
				definition = "Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public FundCashInBreakdown1 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getUnitsNumber() {
		return unitsNumber == null ? Optional.empty() : Optional.of(unitsNumber);
	}

	public FundCashInBreakdown1 setUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
		return this;
	}

	public Optional<YesNoIndicator> getNewAmountIndicator() {
		return newAmountIndicator == null ? Optional.empty() : Optional.of(newAmountIndicator);
	}

	public FundCashInBreakdown1 setNewAmountIndicator(YesNoIndicator newAmountIndicator) {
		this.newAmountIndicator = newAmountIndicator;
		return this;
	}

	public Optional<InvestmentFundTransactionInType1> getInvestmentFundTransactionInTypeDetails() {
		return investmentFundTransactionInTypeDetails == null ? Optional.empty() : Optional.of(investmentFundTransactionInTypeDetails);
	}

	public FundCashInBreakdown1 setInvestmentFundTransactionInTypeDetails(com.tools20022.repository.msg.InvestmentFundTransactionInType1 investmentFundTransactionInTypeDetails) {
		this.investmentFundTransactionInTypeDetails = investmentFundTransactionInTypeDetails;
		return this;
	}

	public Optional<OriginalOrderQuantityType1> getOriginalOrderQuantityDetails() {
		return originalOrderQuantityDetails == null ? Optional.empty() : Optional.of(originalOrderQuantityDetails);
	}

	public FundCashInBreakdown1 setOriginalOrderQuantityDetails(com.tools20022.repository.msg.OriginalOrderQuantityType1 originalOrderQuantityDetails) {
		this.originalOrderQuantityDetails = originalOrderQuantityDetails;
		return this;
	}

	public List<Commission4> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public FundCashInBreakdown1 setCommissionDetails(List<com.tools20022.repository.msg.Commission4> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}
}