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
import com.tools20022.repository.codeset.ATMNoteType2Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCassetteCounters2;
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
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmUnitValue
 * ATMCassetteCounters1.mmUnitValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmCurrency
 * ATMCassetteCounters1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmItemType
 * ATMCassetteCounters1.mmItemType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmCounter
 * ATMCassetteCounters1.mmCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmCurrentNumber
 * ATMCassetteCounters1.mmCurrentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmCurrentAmount
 * ATMCassetteCounters1.mmCurrentAmount}</li>
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
 * "ATMCassetteCounters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM cassette counter per unit value or globally."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
 * ATMCassetteCounters2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCassetteCounters1", propOrder = {"unitValue", "currency", "itemType", "counter", "currentNumber", "currentAmount"})
public class ATMCassetteCounters1 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
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
	public static final MMMessageAttribute<ATMCassetteCounters1, Optional<ImpliedCurrencyAndAmount>> mmUnitValue = new MMMessageAttribute<ATMCassetteCounters1, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters1.mmObject();
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
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMCassetteCounters1 obj) {
			return obj.getUnitValue();
		}

		@Override
		public void setValue(ATMCassetteCounters1 obj, Optional<ImpliedCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
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
	public static final MMMessageAttribute<ATMCassetteCounters1, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<ATMCassetteCounters1, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Price.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters1.mmObject();
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
		public Optional<ActiveCurrencyCode> getValue(ATMCassetteCounters1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMCassetteCounters1 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ItmTp")
	protected ATMNoteType2Code itemType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassetteCounters1, Optional<ATMNoteType2Code>> mmItemType = new MMMessageAttribute<ATMCassetteCounters1, Optional<ATMNoteType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters1.mmObject();
			isDerived = false;
			xmlTag = "ItmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemType";
			definition = "Type of notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMNoteType2Code.mmObject();
		}

		@Override
		public Optional<ATMNoteType2Code> getValue(ATMCassetteCounters1 obj) {
			return obj.getItemType();
		}

		@Override
		public void setValue(ATMCassetteCounters1 obj, Optional<ATMNoteType2Code> value) {
			obj.setItemType(value.orElse(null));
		}
	};
	@XmlElement(name = "Cntr")
	protected List<ATMCassetteCounters2> counter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters of media inside the cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCassetteCounters1, List<ATMCassetteCounters2>> mmCounter = new MMMessageAssociationEnd<ATMCassetteCounters1, List<ATMCassetteCounters2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters1.mmObject();
			isDerived = false;
			xmlTag = "Cntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Counters of media inside the cassette.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCassetteCounters2.mmObject();
		}

		@Override
		public List<ATMCassetteCounters2> getValue(ATMCassetteCounters1 obj) {
			return obj.getCounter();
		}

		@Override
		public void setValue(ATMCassetteCounters1 obj, List<ATMCassetteCounters2> value) {
			obj.setCounter(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
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
	public static final MMMessageAttribute<ATMCassetteCounters1, Number> mmCurrentNumber = new MMMessageAttribute<ATMCassetteCounters1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters1.mmObject();
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
		public Number getValue(ATMCassetteCounters1 obj) {
			return obj.getCurrentNumber();
		}

		@Override
		public void setValue(ATMCassetteCounters1 obj, Number value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
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
	public static final MMMessageAttribute<ATMCassetteCounters1, Optional<ImpliedCurrencyAndAmount>> mmCurrentAmount = new MMMessageAttribute<ATMCassetteCounters1, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters1.mmObject();
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
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMCassetteCounters1 obj) {
			return obj.getCurrentAmount();
		}

		@Override
		public void setValue(ATMCassetteCounters1 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setCurrentAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCassetteCounters1.mmUnitValue, com.tools20022.repository.msg.ATMCassetteCounters1.mmCurrency,
						com.tools20022.repository.msg.ATMCassetteCounters1.mmItemType, com.tools20022.repository.msg.ATMCassetteCounters1.mmCounter, com.tools20022.repository.msg.ATMCassetteCounters1.mmCurrentNumber,
						com.tools20022.repository.msg.ATMCassetteCounters1.mmCurrentAmount);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteCounters1";
				definition = "ATM cassette counter per unit value or globally.";
				nextVersions_lazy = () -> Arrays.asList(ATMCassetteCounters2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ImpliedCurrencyAndAmount> getUnitValue() {
		return unitValue == null ? Optional.empty() : Optional.of(unitValue);
	}

	public ATMCassetteCounters1 setUnitValue(ImpliedCurrencyAndAmount unitValue) {
		this.unitValue = unitValue;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ATMCassetteCounters1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ATMNoteType2Code> getItemType() {
		return itemType == null ? Optional.empty() : Optional.of(itemType);
	}

	public ATMCassetteCounters1 setItemType(ATMNoteType2Code itemType) {
		this.itemType = itemType;
		return this;
	}

	public List<ATMCassetteCounters2> getCounter() {
		return counter == null ? counter = new ArrayList<>() : counter;
	}

	public ATMCassetteCounters1 setCounter(List<ATMCassetteCounters2> counter) {
		this.counter = Objects.requireNonNull(counter);
		return this;
	}

	public Number getCurrentNumber() {
		return currentNumber;
	}

	public ATMCassetteCounters1 setCurrentNumber(Number currentNumber) {
		this.currentNumber = Objects.requireNonNull(currentNumber);
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCurrentAmount() {
		return currentAmount == null ? Optional.empty() : Optional.of(currentAmount);
	}

	public ATMCassetteCounters1 setCurrentAmount(ImpliedCurrencyAndAmount currentAmount) {
		this.currentAmount = currentAmount;
		return this;
	}
}