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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSettlementDate
 * CashOutForecast2.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSubTotalAmount
 * CashOutForecast2.mmSubTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSubTotalUnitsNumber
 * CashOutForecast2.mmSubTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmExceptionalCashFlowIndicator
 * CashOutForecast2.mmExceptionalCashFlowIndicator}</li>
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
 * "CashOutForecast2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashOutForecast2", propOrder = {"settlementDate", "subTotalAmount", "subTotalUnitsNumber", "exceptionalCashFlowIndicator"})
public class CashOutForecast2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2
	 * CashOutForecast2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> CashOutForecast2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which cash is available.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2
	 * CashOutForecast2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> CashOutForecast2.mmObject();
			isDerived = false;
			xmlTag = "SubTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalAmount";
			definition = "Sub-total amount of the cash flow out, expressed as an amount of money.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2
	 * CashOutForecast2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> CashOutForecast2.mmObject();
			isDerived = false;
			xmlTag = "SubTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalUnitsNumber";
			definition = "Sub-total amount of the cash flow out, expressed as a number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected YesNoIndicator exceptionalCashFlowIndicator;
	/**
	 * Indicates whether the cash flow out is exceptional.
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2
	 * CashOutForecast2}</li>
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
	 * definition} = "Indicates whether the cash flow out is exceptional."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExceptionalCashFlowIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> CashOutForecast2.mmObject();
			isDerived = false;
			xmlTag = "XcptnlCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow out is exceptional.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashOutForecast2.mmSettlementDate, CashOutForecast2.mmSubTotalAmount, CashOutForecast2.mmSubTotalUnitsNumber, CashOutForecast2.mmExceptionalCashFlowIndicator);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOutForecast2";
				definition = "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmDt", required = true)
	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
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
}