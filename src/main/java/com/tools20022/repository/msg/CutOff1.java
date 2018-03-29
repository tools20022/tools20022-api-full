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
import com.tools20022.repository.datatype.DateOffsetText;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.SystemAvailability;
import com.tools20022.repository.entity.SystemEventInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that describes a netting cut off held at a central system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CutOff1#mmCutOffUpdateIdentification
 * CutOff1.mmCutOffUpdateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#mmCurrency
 * CutOff1.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#mmCutOffTime
 * CutOff1.mmCutOffTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#mmValueDateOffset
 * CutOff1.mmValueDateOffset}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemAvailability
 * SystemAvailability}</li>
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
 * "CutOff1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that describes a netting cut off held at a central system."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CutOff1", propOrder = {"cutOffUpdateIdentification", "currency", "cutOffTime", "valueDateOffset"})
public class CutOff1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CutOffUpdId", required = true)
	protected Max35Text cutOffUpdateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CutOff1
	 * CutOff1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CutOffUpdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffUpdateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification for the updated netting cut off."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CutOff1, Max35Text> mmCutOffUpdateIdentification = new MMMessageAttribute<CutOff1, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> SystemEventInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CutOff1.mmObject();
			isDerived = false;
			xmlTag = "CutOffUpdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffUpdateIdentification";
			definition = "Identification for the updated netting cut off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CutOff1 obj) {
			return obj.getCutOffUpdateIdentification();
		}

		@Override
		public void setValue(CutOff1 obj, Max35Text value) {
			obj.setCutOffUpdateIdentification(value);
		}
	};
	@XmlElement(name = "Ccy", required = true)
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CutOff1
	 * CutOff1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency linked to the netting cut off."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CutOff1, ActiveCurrencyCode> mmCurrency = new MMMessageAttribute<CutOff1, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CutOff1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency linked to the netting cut off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(CutOff1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CutOff1 obj, ActiveCurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "CutOffTm", required = true)
	protected ISOTime cutOffTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CutOff1
	 * CutOff1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CutOffTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cut off time value for the netting cut off."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CutOff1, ISOTime> mmCutOffTime = new MMMessageAttribute<CutOff1, ISOTime>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CutOff1.mmObject();
			isDerived = false;
			xmlTag = "CutOffTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			definition = "Cut off time value for the netting cut off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public ISOTime getValue(CutOff1 obj) {
			return obj.getCutOffTime();
		}

		@Override
		public void setValue(CutOff1 obj, ISOTime value) {
			obj.setCutOffTime(value);
		}
	};
	@XmlElement(name = "ValDtOffset", required = true)
	protected DateOffsetText valueDateOffset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DateOffsetText
	 * DateOffsetText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CutOff1
	 * CutOff1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the offset in business days from the value date from which the netting cut off is to be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CutOff1, DateOffsetText> mmValueDateOffset = new MMMessageAttribute<CutOff1, DateOffsetText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CutOff1.mmObject();
			isDerived = false;
			xmlTag = "ValDtOffset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateOffset";
			definition = "Specifies the offset in business days from the value date from which the netting cut off is to be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DateOffsetText.mmObject();
		}

		@Override
		public DateOffsetText getValue(CutOff1 obj) {
			return obj.getValueDateOffset();
		}

		@Override
		public void setValue(CutOff1 obj, DateOffsetText value) {
			obj.setValueDateOffset(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CutOff1.mmCutOffUpdateIdentification, com.tools20022.repository.msg.CutOff1.mmCurrency, com.tools20022.repository.msg.CutOff1.mmCutOffTime,
						com.tools20022.repository.msg.CutOff1.mmValueDateOffset);
				trace_lazy = () -> SystemAvailability.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CutOff1";
				definition = "Information that describes a netting cut off held at a central system.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCutOffUpdateIdentification() {
		return cutOffUpdateIdentification;
	}

	public CutOff1 setCutOffUpdateIdentification(Max35Text cutOffUpdateIdentification) {
		this.cutOffUpdateIdentification = Objects.requireNonNull(cutOffUpdateIdentification);
		return this;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public CutOff1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public ISOTime getCutOffTime() {
		return cutOffTime;
	}

	public CutOff1 setCutOffTime(ISOTime cutOffTime) {
		this.cutOffTime = Objects.requireNonNull(cutOffTime);
		return this;
	}

	public DateOffsetText getValueDateOffset() {
		return valueDateOffset;
	}

	public CutOff1 setValueDateOffset(DateOffsetText valueDateOffset) {
		this.valueDateOffset = Objects.requireNonNull(valueDateOffset);
		return this;
	}
}