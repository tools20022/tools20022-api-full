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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code;
import com.tools20022.repository.codeset.OrderQuantityType2Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FundsCashFlow;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Breakdown of cash movements out of a fund as a result of investment funds
 * transactions, eg, redemptions or switch-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmInvestmentFundTransactionOutTypeOrExtendedRule
 * FundCashOutBreakdown2.mmInvestmentFundTransactionOutTypeOrExtendedRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmOriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType
 * FundCashOutBreakdown2.
 * mmOriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class FundCashOutBreakdown2 {

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
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of cash flow out, expressed as an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown3.mmAmount);
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
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Amount of the cash flow out, expressed as a number of units.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown3.mmUnitsNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected YesNoIndicator newAmountIndicator;
	/**
	 * Indicates whether the cash flow is an item that did not appear on the
	 * previously sent report, eg, because it was received close to cut-off
	 * time.
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
	public static final MMMessageAttribute mmNewAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "NewAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAmountIndicator";
			definition = "Indicates whether the cash flow is an item that did not appear on the previously sent report, eg, because it was received close to cut-off time.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown3.mmNewAmountIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected InvestmentFundTransactionOutType1Code investmentFundTransactionOutType;
	/**
	 * Breakdown of the cash movements out of a fund by transaction type, eg,
	 * redemption, switch-out.
	 * <p>
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
	public static final MMMessageAttribute mmInvestmentFundTransactionOutType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndTxOutTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionOutType";
			definition = "Breakdown of the cash movements out of a fund by transaction type, eg, redemption, switch-out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionOutType1Code.mmObject();
		}
	};
	protected Extended350Code extendedInvestmentFundTransactionOutType;
	/**
	 * Breakdown of the cash movements out of a fund by transaction type, eg,
	 * redemption, switch-out.
	 * <p>
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
	public static final MMMessageAttribute mmExtendedInvestmentFundTransactionOutType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "XtndedInvstmtFndTxOutTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedInvestmentFundTransactionOutType";
			definition = "Breakdown of the cash movements out of a fund by transaction type, eg, redemption, switch-out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected OrderQuantityType2Code originalOrderQuantityType;
	/**
	 * Breakdown of the cash movements into a fund by order type, eg, order by
	 * quantity of units or amount of money.
	 * <p>
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
	public static final MMMessageAttribute mmOriginalOrderQuantityType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrQtyTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityType";
			definition = "Breakdown of the cash movements into a fund by order type, eg, order by quantity of units or amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderQuantityType2Code.mmObject();
		}
	};
	protected Extended350Code extendedOriginalOrderQuantityType;
	/**
	 * Breakdown of the cash movements into a fund by transaction type, eg,
	 * subscription, switch-in.
	 * <p>
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
	public static final MMMessageAttribute mmExtendedOriginalOrderQuantityType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmQuantityType;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "XtndedOrgnlOrdrQtyTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOriginalOrderQuantityType";
			definition = "Breakdown of the cash movements into a fund by transaction type, eg, subscription, switch-in.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Charge16> chargeDetails;
	/**
	 * Charge for the placement of an order.
	 * <p>
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
	public static final MMMessageAssociationEnd mmChargeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown3.mmChargeDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge16.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission9> commissionDetails;
	/**
	 * Information related to the commission applied to an order, eg, back-end
	 * or front-end commission.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeCommission;
			componentContext_lazy = () -> FundCashOutBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Information related to the commission applied to an order, eg, back-end or front-end commission.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown3.mmCommissionDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission9.mmObject();
		}
	};
	/**
	 * Either InvestmentFundTransactionOutType or
	 * ExtendedInvestmentFundTransactionOutType must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
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
	public static final MMXor mmInvestmentFundTransactionOutTypeOrExtendedRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionOutTypeOrExtendedRule";
			definition = "Either InvestmentFundTransactionOutType or ExtendedInvestmentFundTransactionOutType must be present, but not both.";
			messageComponent_lazy = () -> FundCashOutBreakdown2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown2.mmInvestmentFundTransactionOutType, com.tools20022.repository.msg.FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType);
		}
	};
	/**
	 * Either OriginalOrderQuantityType or ExtendedOriginalOrderQuantityType
	 * must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
	 * FundCashOutBreakdown2}</li>
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
	public static final MMXor mmOriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType";
			definition = "Either OriginalOrderQuantityType or ExtendedOriginalOrderQuantityType must be present, but not both.";
			messageComponent_lazy = () -> FundCashOutBreakdown2.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashOutBreakdown2.mmInvestmentFundTransactionOutTypeOrExtendedRule,
						com.tools20022.repository.msg.FundCashOutBreakdown2.mmOriginalOrderQuantityTypeOrExtendedOriginalOrderQuantityType);
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

	public InvestmentFundTransactionOutType1Code getInvestmentFundTransactionOutType() {
		return investmentFundTransactionOutType;
	}

	public void setInvestmentFundTransactionOutType(InvestmentFundTransactionOutType1Code investmentFundTransactionOutType) {
		this.investmentFundTransactionOutType = investmentFundTransactionOutType;
	}

	public Extended350Code getExtendedInvestmentFundTransactionOutType() {
		return extendedInvestmentFundTransactionOutType;
	}

	public void setExtendedInvestmentFundTransactionOutType(Extended350Code extendedInvestmentFundTransactionOutType) {
		this.extendedInvestmentFundTransactionOutType = extendedInvestmentFundTransactionOutType;
	}

	public OrderQuantityType2Code getOriginalOrderQuantityType() {
		return originalOrderQuantityType;
	}

	public void setOriginalOrderQuantityType(OrderQuantityType2Code originalOrderQuantityType) {
		this.originalOrderQuantityType = originalOrderQuantityType;
	}

	public Extended350Code getExtendedOriginalOrderQuantityType() {
		return extendedOriginalOrderQuantityType;
	}

	public void setExtendedOriginalOrderQuantityType(Extended350Code extendedOriginalOrderQuantityType) {
		this.extendedOriginalOrderQuantityType = extendedOriginalOrderQuantityType;
	}

	public List<Charge16> getChargeDetails() {
		return chargeDetails;
	}

	public void setChargeDetails(List<com.tools20022.repository.msg.Charge16> chargeDetails) {
		this.chargeDetails = chargeDetails;
	}

	public List<Commission9> getCommissionDetails() {
		return commissionDetails;
	}

	public void setCommissionDetails(List<com.tools20022.repository.msg.Commission9> commissionDetails) {
		this.commissionDetails = commissionDetails;
	}
}