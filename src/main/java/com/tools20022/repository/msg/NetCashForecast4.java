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
import com.tools20022.repository.codeset.FlowDirectionType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.FundBalance1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net cash movement to a fund as a result of investment funds transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmCashSettlementDate
 * NetCashForecast4.mmCashSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast4#mmNetAmount
 * NetCashForecast4.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmNetUnitsNumber
 * NetCashForecast4.mmNetUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmFlowDirection
 * NetCashForecast4.mmFlowDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmAdditionalBalance
 * NetCashForecast4.mmAdditionalBalance}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalBalanceRule#forNetCashForecast4
 * ConstraintAdditionalBalanceRule.forNetCashForecast4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetCashForecast4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net cash movement to a fund as a result of investment funds transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast5
 * NetCashForecast5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NetCashForecast2 NetCashForecast2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetCashForecast4", propOrder = {"cashSettlementDate", "netAmount", "netUnitsNumber", "flowDirection", "additionalBalance"})
public class NetCashForecast4 {

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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmCashSettlementDate
	 * NetCashForecast5.mmCashSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmCashSettlementDate
	 * NetCashForecast2.mmCashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetCashForecast4, ISODate> mmCashSettlementDate = new MMMessageAttribute<NetCashForecast4, ISODate>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			nextVersions_lazy = () -> Arrays.asList(NetCashForecast5.mmCashSettlementDate);
			previousVersion_lazy = () -> NetCashForecast2.mmCashSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(NetCashForecast4 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(NetCashForecast4 obj, ISODate value) {
			obj.setCashSettlementDate(value);
		}
	};
	@XmlElement(name = "NetAmt")
	protected ActiveOrHistoricCurrencyAndAmount netAmount;
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
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of the cash flow, expressed as an amount of money."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmNetAmount
	 * NetCashForecast5.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmNetAmount
	 * NetCashForecast2.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetCashForecast4, Optional<ActiveOrHistoricCurrencyAndAmount>> mmNetAmount = new MMMessageAttribute<NetCashForecast4, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Net amount of the cash flow, expressed as an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(NetCashForecast5.mmNetAmount);
			previousVersion_lazy = () -> NetCashForecast2.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(NetCashForecast4 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(NetCashForecast4 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setNetAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NetUnitsNb")
	protected FinancialInstrumentQuantity1 netUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net amount, expressed as a number of units."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmNetUnitsNumber
	 * NetCashForecast5.mmNetUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmNetUnitsNumber
	 * NetCashForecast2.mmNetUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetCashForecast4, Optional<FinancialInstrumentQuantity1>> mmNetUnitsNumber = new MMMessageAttribute<NetCashForecast4, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
			isDerived = false;
			xmlTag = "NetUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUnitsNumber";
			definition = "Net amount, expressed as a number of units.";
			nextVersions_lazy = () -> Arrays.asList(NetCashForecast5.mmNetUnitsNumber);
			previousVersion_lazy = () -> NetCashForecast2.mmNetUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(NetCashForecast4 obj) {
			return obj.getNetUnitsNumber();
		}

		@Override
		public void setValue(NetCashForecast4 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setNetUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "FlowDrctn", required = true)
	protected FlowDirectionType1Code flowDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionType1Code
	 * FlowDirectionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFlowDirection
	 * FundsCashFlow.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlowDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the direction of the cash flow from the perspective of the fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmFlowDirection
	 * NetCashForecast5.mmFlowDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmFlowDirection
	 * NetCashForecast2.mmFlowDirection}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetCashForecast4, FlowDirectionType1Code> mmFlowDirection = new MMMessageAttribute<NetCashForecast4, FlowDirectionType1Code>() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmFlowDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
			isDerived = false;
			xmlTag = "FlowDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			nextVersions_lazy = () -> Arrays.asList(NetCashForecast5.mmFlowDirection);
			previousVersion_lazy = () -> NetCashForecast2.mmFlowDirection;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FlowDirectionType1Code.mmObject();
		}

		@Override
		public FlowDirectionType1Code getValue(NetCashForecast4 obj) {
			return obj.getFlowDirection();
		}

		@Override
		public void setValue(NetCashForecast4 obj, FlowDirectionType1Code value) {
			obj.setFlowDirection(value);
		}
	};
	@XmlElement(name = "AddtlBal")
	protected FundBalance1 additionalBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundBalance1
	 * FundBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
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
	public static final MMMessageAssociationEnd<NetCashForecast4, Optional<FundBalance1>> mmAdditionalBalance = new MMMessageAssociationEnd<NetCashForecast4, Optional<FundBalance1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
			isDerived = false;
			xmlTag = "AddtlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalance";
			definition = "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundBalance1.mmObject();
		}

		@Override
		public Optional<FundBalance1> getValue(NetCashForecast4 obj) {
			return obj.getAdditionalBalance();
		}

		@Override
		public void setValue(NetCashForecast4 obj, Optional<FundBalance1> value) {
			obj.setAdditionalBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetCashForecast4.mmCashSettlementDate, com.tools20022.repository.msg.NetCashForecast4.mmNetAmount,
						com.tools20022.repository.msg.NetCashForecast4.mmNetUnitsNumber, com.tools20022.repository.msg.NetCashForecast4.mmFlowDirection, com.tools20022.repository.msg.NetCashForecast4.mmAdditionalBalance);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalBalanceRule.forNetCashForecast4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetCashForecast4";
				definition = "Net cash movement to a fund as a result of investment funds transactions.";
				nextVersions_lazy = () -> Arrays.asList(NetCashForecast5.mmObject());
				previousVersion_lazy = () -> NetCashForecast2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getCashSettlementDate() {
		return cashSettlementDate;
	}

	public NetCashForecast4 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = Objects.requireNonNull(cashSettlementDate);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public NetCashForecast4 setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getNetUnitsNumber() {
		return netUnitsNumber == null ? Optional.empty() : Optional.of(netUnitsNumber);
	}

	public NetCashForecast4 setNetUnitsNumber(FinancialInstrumentQuantity1 netUnitsNumber) {
		this.netUnitsNumber = netUnitsNumber;
		return this;
	}

	public FlowDirectionType1Code getFlowDirection() {
		return flowDirection;
	}

	public NetCashForecast4 setFlowDirection(FlowDirectionType1Code flowDirection) {
		this.flowDirection = Objects.requireNonNull(flowDirection);
		return this;
	}

	public Optional<FundBalance1> getAdditionalBalance() {
		return additionalBalance == null ? Optional.empty() : Optional.of(additionalBalance);
	}

	public NetCashForecast4 setAdditionalBalance(FundBalance1 additionalBalance) {
		this.additionalBalance = additionalBalance;
		return this;
	}
}