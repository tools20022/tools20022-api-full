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
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balances of units and cash derived from investment fund orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromUnitOrders
 * FundBalance1.mmTotalUnitsFromUnitOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromCashOrders
 * FundBalance1.mmTotalUnitsFromCashOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromUnitOrders
 * FundBalance1.mmTotalCashFromUnitOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromCashOrders
 * FundBalance1.mmTotalCashFromCashOrders}</li>
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
 * "FundBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Balances of units and cash derived from investment fund orders."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundBalance1", propOrder = {"totalUnitsFromUnitOrders", "totalUnitsFromCashOrders", "totalCashFromUnitOrders", "totalCashFromCashOrders"})
public class FundBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlUnitsFrUnitOrdrs")
	protected FinancialInstrumentQuantity1 totalUnitsFromUnitOrders;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundBalance1 FundBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsFrUnitOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsFromUnitOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of units from orders placed in units."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundBalance1, Optional<FinancialInstrumentQuantity1>> mmTotalUnitsFromUnitOrders = new MMMessageAssociationEnd<FundBalance1, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsFrUnitOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsFromUnitOrders";
			definition = "Total number of units from orders placed in units.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(FundBalance1 obj) {
			return obj.getTotalUnitsFromUnitOrders();
		}

		@Override
		public void setValue(FundBalance1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setTotalUnitsFromUnitOrders(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlUnitsFrCshOrdrs")
	protected FinancialInstrumentQuantity1 totalUnitsFromCashOrders;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundBalance1 FundBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsFrCshOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsFromCashOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of units derived from orders placed in cash."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundBalance1, Optional<FinancialInstrumentQuantity1>> mmTotalUnitsFromCashOrders = new MMMessageAssociationEnd<FundBalance1, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsFrCshOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsFromCashOrders";
			definition = "Number of units derived from orders placed in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(FundBalance1 obj) {
			return obj.getTotalUnitsFromCashOrders();
		}

		@Override
		public void setValue(FundBalance1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setTotalUnitsFromCashOrders(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlCshFrUnitOrdrs")
	protected ActiveOrHistoricCurrencyAndAmount totalCashFromUnitOrders;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedAmount
	 * InvestmentFundOrderExecution.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundBalance1 FundBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCshFrUnitOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCashFromUnitOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of cash derived from orders placed as units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundBalance1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalCashFromUnitOrders = new MMMessageAttribute<FundBalance1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlCshFrUnitOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCashFromUnitOrders";
			definition = "Total amount of cash derived from orders placed as units.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FundBalance1 obj) {
			return obj.getTotalCashFromUnitOrders();
		}

		@Override
		public void setValue(FundBalance1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalCashFromUnitOrders(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlCshFrCshOrdrs")
	protected ActiveOrHistoricCurrencyAndAmount totalCashFromCashOrders;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedAmount
	 * InvestmentFundOrderExecution.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundBalance1 FundBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCshFrCshOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCashFromCashOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of cash from orders placed in cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundBalance1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalCashFromCashOrders = new MMMessageAttribute<FundBalance1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlCshFrCshOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCashFromCashOrders";
			definition = "Total amount of cash from orders placed in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FundBalance1 obj) {
			return obj.getTotalCashFromCashOrders();
		}

		@Override
		public void setValue(FundBalance1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalCashFromCashOrders(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundBalance1.mmTotalUnitsFromUnitOrders, com.tools20022.repository.msg.FundBalance1.mmTotalUnitsFromCashOrders,
						com.tools20022.repository.msg.FundBalance1.mmTotalCashFromUnitOrders, com.tools20022.repository.msg.FundBalance1.mmTotalCashFromCashOrders);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundBalance1";
				definition = "Balances of units and cash derived from investment fund orders.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity1> getTotalUnitsFromUnitOrders() {
		return totalUnitsFromUnitOrders == null ? Optional.empty() : Optional.of(totalUnitsFromUnitOrders);
	}

	public FundBalance1 setTotalUnitsFromUnitOrders(FinancialInstrumentQuantity1 totalUnitsFromUnitOrders) {
		this.totalUnitsFromUnitOrders = totalUnitsFromUnitOrders;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getTotalUnitsFromCashOrders() {
		return totalUnitsFromCashOrders == null ? Optional.empty() : Optional.of(totalUnitsFromCashOrders);
	}

	public FundBalance1 setTotalUnitsFromCashOrders(FinancialInstrumentQuantity1 totalUnitsFromCashOrders) {
		this.totalUnitsFromCashOrders = totalUnitsFromCashOrders;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalCashFromUnitOrders() {
		return totalCashFromUnitOrders == null ? Optional.empty() : Optional.of(totalCashFromUnitOrders);
	}

	public FundBalance1 setTotalCashFromUnitOrders(ActiveOrHistoricCurrencyAndAmount totalCashFromUnitOrders) {
		this.totalCashFromUnitOrders = totalCashFromUnitOrders;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalCashFromCashOrders() {
		return totalCashFromCashOrders == null ? Optional.empty() : Optional.of(totalCashFromCashOrders);
	}

	public FundBalance1 setTotalCashFromCashOrders(ActiveOrHistoricCurrencyAndAmount totalCashFromCashOrders) {
		this.totalCashFromCashOrders = totalCashFromCashOrders;
		return this;
	}
}