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
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmCashSettlementDate
 * CashOutForecast4.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmSubTotalAmount
 * CashOutForecast4.mmSubTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmSubTotalUnitsNumber
 * CashOutForecast4.mmSubTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmExceptionalCashFlowIndicator
 * CashOutForecast4.mmExceptionalCashFlowIndicator}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashOutForecast4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast6
 * CashOutForecast6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOutForecast4", propOrder = {"cashSettlementDate", "subTotalAmount", "subTotalUnitsNumber", "exceptionalCashFlowIndicator"})
public class CashOutForecast4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshSttlmDt", required = true)
	protected ISODate cashSettlementDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4
	 * CashOutForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmCashSettlementDate
	 * CashOutForecast6.mmCashSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast4, ISODate> mmCashSettlementDate = new MMMessageAttribute<CashOutForecast4, ISODate>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			nextVersions_lazy = () -> Arrays.asList(CashOutForecast6.mmCashSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CashOutForecast4 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(CashOutForecast4 obj, ISODate value) {
			obj.setCashSettlementDate(value);
		}
	};
	@XmlElement(name = "SubTtlAmt")
	protected ActiveOrHistoricCurrencyAndAmount subTotalAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4
	 * CashOutForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as an amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmSubTotalAmount
	 * CashOutForecast6.mmSubTotalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast4, Optional<ActiveOrHistoricCurrencyAndAmount>> mmSubTotalAmount = new MMMessageAttribute<CashOutForecast4, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.mmObject();
			isDerived = false;
			xmlTag = "SubTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalAmount";
			definition = "Sub-total amount of the cash flow out, expressed as an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(CashOutForecast6.mmSubTotalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(CashOutForecast4 obj) {
			return obj.getSubTotalAmount();
		}

		@Override
		public void setValue(CashOutForecast4 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setSubTotalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SubTtlUnitsNb")
	protected FinancialInstrumentQuantity1 subTotalUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4
	 * CashOutForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlUnitsNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as a number of units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmSubTotalUnitsNumber
	 * CashOutForecast6.mmSubTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast4, Optional<FinancialInstrumentQuantity1>> mmSubTotalUnitsNumber = new MMMessageAttribute<CashOutForecast4, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.mmObject();
			isDerived = false;
			xmlTag = "SubTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalUnitsNumber";
			definition = "Sub-total amount of the cash flow out, expressed as a number of units.";
			nextVersions_lazy = () -> Arrays.asList(CashOutForecast6.mmSubTotalUnitsNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(CashOutForecast4 obj) {
			return obj.getSubTotalUnitsNumber();
		}

		@Override
		public void setValue(CashOutForecast4 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setSubTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "XcptnlCshFlowInd")
	protected YesNoIndicator exceptionalCashFlowIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
	 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4
	 * CashOutForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlCshFlowInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the cash flow out is exceptional."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmExceptionalCashFlowIndicator
	 * CashOutForecast6.mmExceptionalCashFlowIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast4, Optional<YesNoIndicator>> mmExceptionalCashFlowIndicator = new MMMessageAttribute<CashOutForecast4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.mmObject();
			isDerived = false;
			xmlTag = "XcptnlCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow out is exceptional.";
			nextVersions_lazy = () -> Arrays.asList(CashOutForecast6.mmExceptionalCashFlowIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOutForecast4 obj) {
			return obj.getExceptionalCashFlowIndicator();
		}

		@Override
		public void setValue(CashOutForecast4 obj, Optional<YesNoIndicator> value) {
			obj.setExceptionalCashFlowIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOutForecast4.mmCashSettlementDate, com.tools20022.repository.msg.CashOutForecast4.mmSubTotalAmount,
						com.tools20022.repository.msg.CashOutForecast4.mmSubTotalUnitsNumber, com.tools20022.repository.msg.CashOutForecast4.mmExceptionalCashFlowIndicator);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOutForecast4";
				definition = "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
				nextVersions_lazy = () -> Arrays.asList(CashOutForecast6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getCashSettlementDate() {
		return cashSettlementDate;
	}

	public CashOutForecast4 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = Objects.requireNonNull(cashSettlementDate);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getSubTotalAmount() {
		return subTotalAmount == null ? Optional.empty() : Optional.of(subTotalAmount);
	}

	public CashOutForecast4 setSubTotalAmount(ActiveOrHistoricCurrencyAndAmount subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getSubTotalUnitsNumber() {
		return subTotalUnitsNumber == null ? Optional.empty() : Optional.of(subTotalUnitsNumber);
	}

	public CashOutForecast4 setSubTotalUnitsNumber(FinancialInstrumentQuantity1 subTotalUnitsNumber) {
		this.subTotalUnitsNumber = subTotalUnitsNumber;
		return this;
	}

	public Optional<YesNoIndicator> getExceptionalCashFlowIndicator() {
		return exceptionalCashFlowIndicator == null ? Optional.empty() : Optional.of(exceptionalCashFlowIndicator);
	}

	public CashOutForecast4 setExceptionalCashFlowIndicator(YesNoIndicator exceptionalCashFlowIndicator) {
		this.exceptionalCashFlowIndicator = exceptionalCashFlowIndicator;
		return this;
	}
}