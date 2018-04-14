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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ATMMediaType3Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCassetteCounters4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ATM cassette counter per unit value or globally.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmUnitValue
 * ATMCassetteCounters3.mmUnitValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrency
 * ATMCassetteCounters3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmMediaCategory
 * ATMCassetteCounters3.mmMediaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrentNumber
 * ATMCassetteCounters3.mmCurrentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrentAmount
 * ATMCassetteCounters3.mmCurrentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmFlowTotals
 * ATMCassetteCounters3.mmFlowTotals}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCassetteCounters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM cassette counter per unit value or globally."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCassetteCounters3", propOrder = {"unitValue", "currency", "mediaCategory", "currentNumber", "currentAmount", "flowTotals"})
public class ATMCassetteCounters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnitVal")
	protected ImpliedCurrencyAndAmount unitValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of one media unit, if the media type is valued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassetteCounters3, Optional<ImpliedCurrencyAndAmount>> mmUnitValue = new MMMessageAttribute<ATMCassetteCounters3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "UnitVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitValue";
			definition = "Amount of one media unit, if the media type is valued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMCassetteCounters3 obj) {
			return obj.getUnitValue();
		}

		@Override
		public void setValue(ATMCassetteCounters3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setUnitValue(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
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
	 * {@linkplain com.tools20022.repository.entity.Price#mmCurrency
	 * Price.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the media, if the media type is valued and different from the currency of the requested amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassetteCounters3, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<ATMCassetteCounters3, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Price.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the media, if the media type is valued and different from the currency of the requested amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(ATMCassetteCounters3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMCassetteCounters3 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "MdiaCtgy")
	protected ATMMediaType3Code mediaCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of media items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassetteCounters3, Optional<ATMMediaType3Code>> mmMediaCategory = new MMMessageAttribute<ATMCassetteCounters3, Optional<ATMMediaType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "MdiaCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaCategory";
			definition = "Category of media items.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType3Code.mmObject();
		}

		@Override
		public Optional<ATMMediaType3Code> getValue(ATMCassetteCounters3 obj) {
			return obj.getMediaCategory();
		}

		@Override
		public void setValue(ATMCassetteCounters3 obj, Optional<ATMMediaType3Code> value) {
			obj.setMediaCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "CurNb", required = true)
	protected Number currentNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current number of media present in the cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassetteCounters3, Number> mmCurrentNumber = new MMMessageAttribute<ATMCassetteCounters3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "CurNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentNumber";
			definition = "Current number of media present in the cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(ATMCassetteCounters3 obj) {
			return obj.getCurrentNumber();
		}

		@Override
		public void setValue(ATMCassetteCounters3 obj, Number value) {
			obj.setCurrentNumber(value);
		}
	};
	@XmlElement(name = "CurAmt")
	protected ImpliedCurrencyAndAmount currentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current amount in the cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassetteCounters3, Optional<ImpliedCurrencyAndAmount>> mmCurrentAmount = new MMMessageAttribute<ATMCassetteCounters3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "CurAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentAmount";
			definition = "Current amount in the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMCassetteCounters3 obj) {
			return obj.getCurrentAmount();
		}

		@Override
		public void setValue(ATMCassetteCounters3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setCurrentAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FlowTtls")
	protected List<ATMCassetteCounters4> flowTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlowTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters of media inside the cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCassetteCounters3, List<ATMCassetteCounters4>> mmFlowTotals = new MMMessageAssociationEnd<ATMCassetteCounters3, List<ATMCassetteCounters4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "FlowTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlowTotals";
			definition = "Counters of media inside the cassette.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCassetteCounters4.mmObject();
		}

		@Override
		public List<ATMCassetteCounters4> getValue(ATMCassetteCounters3 obj) {
			return obj.getFlowTotals();
		}

		@Override
		public void setValue(ATMCassetteCounters3 obj, List<ATMCassetteCounters4> value) {
			obj.setFlowTotals(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCassetteCounters3.mmUnitValue, com.tools20022.repository.msg.ATMCassetteCounters3.mmCurrency,
						com.tools20022.repository.msg.ATMCassetteCounters3.mmMediaCategory, com.tools20022.repository.msg.ATMCassetteCounters3.mmCurrentNumber, com.tools20022.repository.msg.ATMCassetteCounters3.mmCurrentAmount,
						com.tools20022.repository.msg.ATMCassetteCounters3.mmFlowTotals);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteCounters3";
				definition = "ATM cassette counter per unit value or globally.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ImpliedCurrencyAndAmount> getUnitValue() {
		return unitValue == null ? Optional.empty() : Optional.of(unitValue);
	}

	public ATMCassetteCounters3 setUnitValue(ImpliedCurrencyAndAmount unitValue) {
		this.unitValue = unitValue;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ATMCassetteCounters3 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ATMMediaType3Code> getMediaCategory() {
		return mediaCategory == null ? Optional.empty() : Optional.of(mediaCategory);
	}

	public ATMCassetteCounters3 setMediaCategory(ATMMediaType3Code mediaCategory) {
		this.mediaCategory = mediaCategory;
		return this;
	}

	public Number getCurrentNumber() {
		return currentNumber;
	}

	public ATMCassetteCounters3 setCurrentNumber(Number currentNumber) {
		this.currentNumber = Objects.requireNonNull(currentNumber);
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCurrentAmount() {
		return currentAmount == null ? Optional.empty() : Optional.of(currentAmount);
	}

	public ATMCassetteCounters3 setCurrentAmount(ImpliedCurrencyAndAmount currentAmount) {
		this.currentAmount = currentAmount;
		return this;
	}

	public List<ATMCassetteCounters4> getFlowTotals() {
		return flowTotals == null ? flowTotals = new ArrayList<>() : flowTotals;
	}

	public ATMCassetteCounters3 setFlowTotals(List<ATMCassetteCounters4> flowTotals) {
		this.flowTotals = Objects.requireNonNull(flowTotals);
		return this;
	}
}