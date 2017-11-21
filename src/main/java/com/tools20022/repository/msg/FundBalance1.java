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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FundBalance1", propOrder = {"totalUnitsFromUnitOrders", "totalUnitsFromCashOrders", "totalCashFromUnitOrders", "totalCashFromCashOrders"})
public class FundBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1 totalUnitsFromUnitOrders;
	/**
	 * Total number of units from orders placed in units.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTotalUnitsFromUnitOrders = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsFrUnitOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsFromUnitOrders";
			definition = "Total number of units from orders placed in units.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 totalUnitsFromCashOrders;
	/**
	 * Number of units derived from orders placed in cash.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTotalUnitsFromCashOrders = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsFrCshOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsFromCashOrders";
			definition = "Number of units derived from orders placed in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount totalCashFromUnitOrders;
	/**
	 * Total amount of cash derived from orders placed as units.
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
	public static final MMMessageAttribute mmTotalCashFromUnitOrders = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedAmount;
			componentContext_lazy = () -> FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlCshFrUnitOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCashFromUnitOrders";
			definition = "Total amount of cash derived from orders placed as units.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount totalCashFromCashOrders;
	/**
	 * Total amount of cash from orders placed in cash.
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
	public static final MMMessageAttribute mmTotalCashFromCashOrders = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedAmount;
			componentContext_lazy = () -> FundBalance1.mmObject();
			isDerived = false;
			xmlTag = "TtlCshFrCshOrdrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCashFromCashOrders";
			definition = "Total amount of cash from orders placed in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FundBalance1.mmTotalUnitsFromUnitOrders, FundBalance1.mmTotalUnitsFromCashOrders, FundBalance1.mmTotalCashFromUnitOrders, FundBalance1.mmTotalCashFromCashOrders);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundBalance1";
				definition = "Balances of units and cash derived from investment fund orders.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlUnitsFrUnitOrdrs")
	public FinancialInstrumentQuantity1 getTotalUnitsFromUnitOrders() {
		return totalUnitsFromUnitOrders;
	}

	public void setTotalUnitsFromUnitOrders(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsFromUnitOrders) {
		this.totalUnitsFromUnitOrders = totalUnitsFromUnitOrders;
	}

	@XmlElement(name = "TtlUnitsFrCshOrdrs")
	public FinancialInstrumentQuantity1 getTotalUnitsFromCashOrders() {
		return totalUnitsFromCashOrders;
	}

	public void setTotalUnitsFromCashOrders(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsFromCashOrders) {
		this.totalUnitsFromCashOrders = totalUnitsFromCashOrders;
	}

	@XmlElement(name = "TtlCshFrUnitOrdrs")
	public ActiveOrHistoricCurrencyAndAmount getTotalCashFromUnitOrders() {
		return totalCashFromUnitOrders;
	}

	public void setTotalCashFromUnitOrders(ActiveOrHistoricCurrencyAndAmount totalCashFromUnitOrders) {
		this.totalCashFromUnitOrders = totalCashFromUnitOrders;
	}

	@XmlElement(name = "TtlCshFrCshOrdrs")
	public ActiveOrHistoricCurrencyAndAmount getTotalCashFromCashOrders() {
		return totalCashFromCashOrders;
	}

	public void setTotalCashFromCashOrders(ActiveOrHistoricCurrencyAndAmount totalCashFromCashOrders) {
		this.totalCashFromCashOrders = totalCashFromCashOrders;
	}
}