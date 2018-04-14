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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ATMMediaType1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ATMTotal;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Current totals of the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmMediaType
 * ATMTotals1.mmMediaType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmCurrency
 * ATMTotals1.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMBalance
 * ATMTotals1.mmATMBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMCurrent
 * ATMTotals1.mmATMCurrent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMBalanceNumber
 * ATMTotals1.mmATMBalanceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMCurrentNumber
 * ATMTotals1.mmATMCurrentNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ATMTotal ATMTotal}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTotals1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Current totals of the ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTotals1", propOrder = {"mediaType", "currency", "aTMBalance", "aTMCurrent", "aTMBalanceNumber", "aTMCurrentNumber"})
public class ATMTotals1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MdiaTp")
	protected ATMMediaType1Code mediaType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of media inside the cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTotals1, Optional<ATMMediaType1Code>> mmMediaType = new MMMessageAttribute<ATMTotals1, Optional<ATMMediaType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "MdiaTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaType";
			definition = "Type of media inside the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType1Code.mmObject();
		}

		@Override
		public Optional<ATMMediaType1Code> getValue(ATMTotals1 obj) {
			return obj.getMediaType();
		}

		@Override
		public void setValue(ATMTotals1 obj, Optional<ATMMediaType1Code> value) {
			obj.setMediaType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmCurrency
	 * ATMTotal.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the totals."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTotals1, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<ATMTotals1, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the totals.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(ATMTotals1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMTotals1 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMBal")
	protected ImpliedCurrencyAndAmount aTMBalance;
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
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalance
	 * ATMTotal.mmATMBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of the ATM including reject cassette, but excluding the retract cassette."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTotals1, Optional<ImpliedCurrencyAndAmount>> mmATMBalance = new MMMessageAttribute<ATMTotals1, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			definition = "Total balance of the ATM including reject cassette, but excluding the retract cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTotals1 obj) {
			return obj.getATMBalance();
		}

		@Override
		public void setValue(ATMTotals1 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setATMBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMCur")
	protected ImpliedCurrencyAndAmount aTMCurrent;
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
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrent
	 * ATMTotal.mmATMCurrent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMCur"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available amount for dispense in the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTotals1, Optional<ImpliedCurrencyAndAmount>> mmATMCurrent = new MMMessageAttribute<ATMTotals1, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMCurrent;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMCur";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCurrent";
			definition = "Available amount for dispense in the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTotals1 obj) {
			return obj.getATMCurrent();
		}

		@Override
		public void setValue(ATMTotals1 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setATMCurrent(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMBalNb")
	protected Number aTMBalanceNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalanceNumber
	 * ATMTotal.mmATMBalanceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMBalNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalanceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, including reject cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTotals1, Optional<Number>> mmATMBalanceNumber = new MMMessageAttribute<ATMTotals1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMBalanceNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMBalNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalanceNumber";
			definition = "Total number of units for non-valued media, including reject cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ATMTotals1 obj) {
			return obj.getATMBalanceNumber();
		}

		@Override
		public void setValue(ATMTotals1 obj, Optional<Number> value) {
			obj.setATMBalanceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMCurNb")
	protected Number aTMCurrentNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrentNumber
	 * ATMTotal.mmATMCurrentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMCurNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, excluding reject cassette."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTotals1, Optional<Number>> mmATMCurrentNumber = new MMMessageAttribute<ATMTotals1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMCurrentNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMCurNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCurrentNumber";
			definition = "Total number of units for non-valued media, excluding reject cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ATMTotals1 obj) {
			return obj.getATMCurrentNumber();
		}

		@Override
		public void setValue(ATMTotals1 obj, Optional<Number> value) {
			obj.setATMCurrentNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals1.mmMediaType, com.tools20022.repository.msg.ATMTotals1.mmCurrency, com.tools20022.repository.msg.ATMTotals1.mmATMBalance,
						com.tools20022.repository.msg.ATMTotals1.mmATMCurrent, com.tools20022.repository.msg.ATMTotals1.mmATMBalanceNumber, com.tools20022.repository.msg.ATMTotals1.mmATMCurrentNumber);
				trace_lazy = () -> ATMTotal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTotals1";
				definition = "Current totals of the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMMediaType1Code> getMediaType() {
		return mediaType == null ? Optional.empty() : Optional.of(mediaType);
	}

	public ATMTotals1 setMediaType(ATMMediaType1Code mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ATMTotals1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getATMBalance() {
		return aTMBalance == null ? Optional.empty() : Optional.of(aTMBalance);
	}

	public ATMTotals1 setATMBalance(ImpliedCurrencyAndAmount aTMBalance) {
		this.aTMBalance = aTMBalance;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getATMCurrent() {
		return aTMCurrent == null ? Optional.empty() : Optional.of(aTMCurrent);
	}

	public ATMTotals1 setATMCurrent(ImpliedCurrencyAndAmount aTMCurrent) {
		this.aTMCurrent = aTMCurrent;
		return this;
	}

	public Optional<Number> getATMBalanceNumber() {
		return aTMBalanceNumber == null ? Optional.empty() : Optional.of(aTMBalanceNumber);
	}

	public ATMTotals1 setATMBalanceNumber(Number aTMBalanceNumber) {
		this.aTMBalanceNumber = aTMBalanceNumber;
		return this;
	}

	public Optional<Number> getATMCurrentNumber() {
		return aTMCurrentNumber == null ? Optional.empty() : Optional.of(aTMCurrentNumber);
	}

	public ATMTotals1 setATMCurrentNumber(Number aTMCurrentNumber) {
		this.aTMCurrentNumber = aTMCurrentNumber;
		return this;
	}
}