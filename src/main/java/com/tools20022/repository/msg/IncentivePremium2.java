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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.DateFormat3Choice;
import com.tools20022.repository.choice.PriceRateOrAmountChoice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.IncentivePremium;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#PerSecurityOrPerVoteOrPerAttendeeRule
 * IncentivePremium2.PerSecurityOrPerVoteOrPerAttendeeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmDescription
 * IncentivePremium2.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium2#mmAmount
 * IncentivePremium2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerSecurity
 * IncentivePremium2.mmPerSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerVote
 * IncentivePremium2.mmPerVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerAttendee
 * IncentivePremium2.mmPerAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPaymentDate
 * IncentivePremium2.mmPaymentDate}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IncentivePremium2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash premium made available if the securities holder consents or participates to an event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IncentivePremium2", propOrder = {"description", "amount", "perSecurity", "perVote", "perAttendee", "paymentDate"})
public class IncentivePremium2 {

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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
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
	public static final MMMessageAttribute<IncentivePremium2, Optional<Max350Text>> mmDescription = new MMMessageAttribute<IncentivePremium2, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
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
		public Optional<Max350Text> getValue(IncentivePremium2 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(IncentivePremium2 obj, Optional<Max350Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
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
	public static final MMMessageAttribute<IncentivePremium2, PriceRateOrAmountChoice> mmAmount = new MMMessageAttribute<IncentivePremium2, PriceRateOrAmountChoice>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
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
		public PriceRateOrAmountChoice getValue(IncentivePremium2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(IncentivePremium2 obj, PriceRateOrAmountChoice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "PerScty", required = true)
	protected Number perSecurity;
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
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerSecurity
	 * IncentivePremium.mmPerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PerScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of securities giving right to a premium."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium2, Number> mmPerSecurity = new MMMessageAttribute<IncentivePremium2, Number>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
			isDerived = false;
			xmlTag = "PerScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerSecurity";
			definition = "Number of securities giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(IncentivePremium2 obj) {
			return obj.getPerSecurity();
		}

		@Override
		public void setValue(IncentivePremium2 obj, Number value) {
			obj.setPerSecurity(value);
		}
	};
	@XmlElement(name = "PerVote", required = true)
	protected Number perVote;
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
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerVote
	 * IncentivePremium.mmPerVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PerVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes giving right to a premium."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium2, Number> mmPerVote = new MMMessageAttribute<IncentivePremium2, Number>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerVote;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
			isDerived = false;
			xmlTag = "PerVote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerVote";
			definition = "Number of votes giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(IncentivePremium2 obj) {
			return obj.getPerVote();
		}

		@Override
		public void setValue(IncentivePremium2 obj, Number value) {
			obj.setPerVote(value);
		}
	};
	@XmlElement(name = "PerAttndee", required = true)
	protected YesNoIndicator perAttendee;
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
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerAttendee
	 * IncentivePremium.mmPerAttendee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PerAttndee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the premium is given per attendee."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncentivePremium2, YesNoIndicator> mmPerAttendee = new MMMessageAttribute<IncentivePremium2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerAttendee;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
			isDerived = false;
			xmlTag = "PerAttndee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerAttendee";
			definition = "Indicates that the premium is given per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IncentivePremium2 obj) {
			return obj.getPerAttendee();
		}

		@Override
		public void setValue(IncentivePremium2 obj, YesNoIndicator value) {
			obj.setPerAttendee(value);
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
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
	public static final MMMessageAttribute<IncentivePremium2, Optional<DateFormat3Choice>> mmPaymentDate = new MMMessageAttribute<IncentivePremium2, Optional<DateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
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
		public Optional<DateFormat3Choice> getValue(IncentivePremium2 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(IncentivePremium2 obj, Optional<DateFormat3Choice> value) {
			obj.setPaymentDate(value.orElse(null));
		}
	};
	/**
	 * Either PerSecurity or PerVote or PerAttendee must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerSecurity
	 * IncentivePremium2.mmPerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerVote
	 * IncentivePremium2.mmPerVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerAttendee
	 * IncentivePremium2.mmPerAttendee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerSecurityOrPerVoteOrPerAttendeeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either PerSecurity or PerVote or PerAttendee must be present."</li>
	 * </ul>
	 */
	public static final MMXor PerSecurityOrPerVoteOrPerAttendeeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerSecurityOrPerVoteOrPerAttendeeRule";
			definition = "Either PerSecurity or PerVote or PerAttendee must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
			impactedElements_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.IncentivePremium2.mmPerSecurity, com.tools20022.repository.msg.IncentivePremium2.mmPerVote, com.tools20022.repository.msg.IncentivePremium2.mmPerAttendee);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium2.mmDescription, com.tools20022.repository.msg.IncentivePremium2.mmAmount,
						com.tools20022.repository.msg.IncentivePremium2.mmPerSecurity, com.tools20022.repository.msg.IncentivePremium2.mmPerVote, com.tools20022.repository.msg.IncentivePremium2.mmPerAttendee,
						com.tools20022.repository.msg.IncentivePremium2.mmPaymentDate);
				trace_lazy = () -> IncentivePremium.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IncentivePremium2";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium2.PerSecurityOrPerVoteOrPerAttendeeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public IncentivePremium2 setDescription(Max350Text description) {
		this.description = description;
		return this;
	}

	public PriceRateOrAmountChoice getAmount() {
		return amount;
	}

	public IncentivePremium2 setAmount(PriceRateOrAmountChoice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Number getPerSecurity() {
		return perSecurity;
	}

	public IncentivePremium2 setPerSecurity(Number perSecurity) {
		this.perSecurity = Objects.requireNonNull(perSecurity);
		return this;
	}

	public Number getPerVote() {
		return perVote;
	}

	public IncentivePremium2 setPerVote(Number perVote) {
		this.perVote = Objects.requireNonNull(perVote);
		return this;
	}

	public YesNoIndicator getPerAttendee() {
		return perAttendee;
	}

	public IncentivePremium2 setPerAttendee(YesNoIndicator perAttendee) {
		this.perAttendee = Objects.requireNonNull(perAttendee);
		return this;
	}

	public Optional<DateFormat3Choice> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public IncentivePremium2 setPaymentDate(DateFormat3Choice paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}
}