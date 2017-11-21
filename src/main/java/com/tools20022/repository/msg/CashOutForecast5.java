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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cash movements out of a fund as a result of investment funds transactions,
 * eg, redemptions or switch-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashSettlementDate
 * CashOutForecast5.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmSubTotalAmount
 * CashOutForecast5.mmSubTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmSubTotalUnitsNumber
 * CashOutForecast5.mmSubTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmExceptionalCashFlowIndicator
 * CashOutForecast5.mmExceptionalCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashOutBreakdownDetails
 * CashOutForecast5.mmCashOutBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmAdditionalBalance
 * CashOutForecast5.mmAdditionalBalance}</li>
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
 * "CashOutForecast5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashOutForecast3 CashOutForecast3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashOutForecast5", propOrder = {"cashSettlementDate", "subTotalAmount", "subTotalUnitsNumber", "exceptionalCashFlowIndicator", "cashOutBreakdownDetails", "additionalBalance"})
public class CashOutForecast5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate cashSettlementDate;
	/**
	 * Date on which cash is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmCashSettlementDate
	 * CashOutForecast3.mmCashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			previousVersion_lazy = () -> CashOutForecast3.mmCashSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount subTotalAmount;
	/**
	 * Sub-total amount of the cash flow out, expressed as an amount of money.
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as an amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmSubTotalAmount
	 * CashOutForecast3.mmSubTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "SubTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalAmount";
			definition = "Sub-total amount of the cash flow out, expressed as an amount of money.";
			previousVersion_lazy = () -> CashOutForecast3.mmSubTotalAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 subTotalUnitsNumber;
	/**
	 * Sub-total amount of the cash flow out, expressed as a number of units.
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as a number of units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmSubTotalUnitsNumber
	 * CashOutForecast3.mmSubTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "SubTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalUnitsNumber";
			definition = "Sub-total amount of the cash flow out, expressed as a number of units.";
			previousVersion_lazy = () -> CashOutForecast3.mmSubTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected YesNoIndicator exceptionalCashFlowIndicator;
	/**
	 * Indicates whether the estimated cash flow out is exceptional.
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
	 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlCshFlowInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the estimated cash flow out is exceptional."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmExceptionalCashFlowIndicator
	 * CashOutForecast3.mmExceptionalCashFlowIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExceptionalCashFlowIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "XcptnlCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the estimated cash flow out is exceptional.";
			previousVersion_lazy = () -> CashOutForecast3.mmExceptionalCashFlowIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FundCashOutBreakdown3> cashOutBreakdownDetails;
	/**
	 * Breakdown of cash out amounts by transaction and order type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutBrkdwnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of cash out amounts by transaction and order type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmCashOutBreakdownDetails
	 * CashOutForecast3.mmCashOutBreakdownDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutBreakdownDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "CshOutBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutBreakdownDetails";
			definition = "Breakdown of cash out amounts by transaction and order type.";
			previousVersion_lazy = () -> CashOutForecast3.mmCashOutBreakdownDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundCashOutBreakdown3.mmObject();
		}
	};
	protected FundBalance1 additionalBalance;
	/**
	 * Additional balances for cash amounts and number of units. <br>
	 * In an estimated report, the total cash derived from orders placed as a
	 * number of units is an estimated cash amount and the total number of units
	 * derived from orders placed as a cash amount is an estimated number of
	 * units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundBalance1
	 * FundBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "AddtlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalance";
			definition = "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundBalance1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashOutForecast5.mmCashSettlementDate, CashOutForecast5.mmSubTotalAmount, CashOutForecast5.mmSubTotalUnitsNumber, CashOutForecast5.mmExceptionalCashFlowIndicator,
						CashOutForecast5.mmCashOutBreakdownDetails, CashOutForecast5.mmAdditionalBalance);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOutForecast5";
				definition = "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
				previousVersion_lazy = () -> CashOutForecast3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CshSttlmDt", required = true)
	public ISODate getCashSettlementDate() {
		return cashSettlementDate;
	}

	public void setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
	}

	@XmlElement(name = "SubTtlAmt")
	public ActiveOrHistoricCurrencyAndAmount getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(ActiveOrHistoricCurrencyAndAmount subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	@XmlElement(name = "SubTtlUnitsNb")
	public FinancialInstrumentQuantity1 getSubTotalUnitsNumber() {
		return subTotalUnitsNumber;
	}

	public void setSubTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 subTotalUnitsNumber) {
		this.subTotalUnitsNumber = subTotalUnitsNumber;
	}

	@XmlElement(name = "XcptnlCshFlowInd")
	public YesNoIndicator getExceptionalCashFlowIndicator() {
		return exceptionalCashFlowIndicator;
	}

	public void setExceptionalCashFlowIndicator(YesNoIndicator exceptionalCashFlowIndicator) {
		this.exceptionalCashFlowIndicator = exceptionalCashFlowIndicator;
	}

	@XmlElement(name = "CshOutBrkdwnDtls")
	public List<FundCashOutBreakdown3> getCashOutBreakdownDetails() {
		return cashOutBreakdownDetails;
	}

	public void setCashOutBreakdownDetails(List<com.tools20022.repository.msg.FundCashOutBreakdown3> cashOutBreakdownDetails) {
		this.cashOutBreakdownDetails = cashOutBreakdownDetails;
	}

	@XmlElement(name = "AddtlBal")
	public FundBalance1 getAdditionalBalance() {
		return additionalBalance;
	}

	public void setAdditionalBalance(com.tools20022.repository.msg.FundBalance1 additionalBalance) {
		this.additionalBalance = additionalBalance;
	}
}