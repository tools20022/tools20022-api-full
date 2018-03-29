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
import com.tools20022.repository.choice.DateFormat3Choice;
import com.tools20022.repository.choice.IncentivePremiumType1Choice;
import com.tools20022.repository.choice.PriceRateOrAmountChoice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.IncentivePremium;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cash premium made available if the securities holder consents or participates
 * to an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium3#mmDescription
 * IncentivePremium3.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3#mmAmount
 * IncentivePremium3.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3#mmType
 * IncentivePremium3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium3#mmPaymentDate
 * IncentivePremium3.mmPaymentDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IncentivePremium
 * IncentivePremium}</li>
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
 * "IncentivePremium3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash premium made available if the securities holder consents or participates to an event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IncentivePremium3", propOrder = {"description", "amount", "type", "paymentDate"})
public class IncentivePremium3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Desc")
	protected Max350Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmDescription
	 * IncentivePremium.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the premium."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium3, Optional<Max350Text>> mmDescription = new MMMessageAttribute<IncentivePremium3, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description of the premium.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(IncentivePremium3 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(IncentivePremium3 obj, Optional<Max350Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected PriceRateOrAmountChoice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice
	 * PriceRateOrAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPremiumAmount
	 * IncentivePremium.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash premium paid per security, per vote or per attendee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium3, PriceRateOrAmountChoice> mmAmount = new MMMessageAttribute<IncentivePremium3, PriceRateOrAmountChoice>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Cash premium paid per security, per vote or per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountChoice.mmObject();
		}

		@Override
		public PriceRateOrAmountChoice getValue(IncentivePremium3 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(IncentivePremium3 obj, PriceRateOrAmountChoice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected IncentivePremiumType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice
	 * IncentivePremiumType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of incentive premium."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium3, IncentivePremiumType1Choice> mmType = new MMMessageAttribute<IncentivePremium3, IncentivePremiumType1Choice>() {
		{
			businessComponentTrace_lazy = () -> IncentivePremium.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of incentive premium.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IncentivePremiumType1Choice.mmObject();
		}

		@Override
		public IncentivePremiumType1Choice getValue(IncentivePremium3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(IncentivePremium3 obj, IncentivePremiumType1Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "PmtDt")
	protected DateFormat3Choice paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat3Choice
	 * DateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPaymentDate
	 * IncentivePremium.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time for the payment of the premium."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium3, Optional<DateFormat3Choice>> mmPaymentDate = new MMMessageAttribute<IncentivePremium3, Optional<DateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time for the payment of the premium.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat3Choice.mmObject();
		}

		@Override
		public Optional<DateFormat3Choice> getValue(IncentivePremium3 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(IncentivePremium3 obj, Optional<DateFormat3Choice> value) {
			obj.setPaymentDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium3.mmDescription, com.tools20022.repository.msg.IncentivePremium3.mmAmount, com.tools20022.repository.msg.IncentivePremium3.mmType,
						com.tools20022.repository.msg.IncentivePremium3.mmPaymentDate);
				trace_lazy = () -> IncentivePremium.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IncentivePremium3";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public IncentivePremium3 setDescription(Max350Text description) {
		this.description = description;
		return this;
	}

	public PriceRateOrAmountChoice getAmount() {
		return amount;
	}

	public IncentivePremium3 setAmount(PriceRateOrAmountChoice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public IncentivePremiumType1Choice getType() {
		return type;
	}

	public IncentivePremium3 setType(IncentivePremiumType1Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<DateFormat3Choice> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public IncentivePremium3 setPaymentDate(DateFormat3Choice paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}
}