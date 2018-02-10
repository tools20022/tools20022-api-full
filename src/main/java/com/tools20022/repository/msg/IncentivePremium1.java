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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#PerSecurityOrPerVoteOrPerAttendeeRule
 * IncentivePremium1.PerSecurityOrPerVoteOrPerAttendeeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPremiumDescription
 * IncentivePremium1.mmPremiumDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPremiumAmount
 * IncentivePremium1.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerSecurity
 * IncentivePremium1.mmPerSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerVote
 * IncentivePremium1.mmPerVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerAttendee
 * IncentivePremium1.mmPerAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPaymentDate
 * IncentivePremium1.mmPaymentDate}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IncentivePremium1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash premium made available if the securities holder consents or participates to an event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IncentivePremium1", propOrder = {"premiumDescription", "premiumAmount", "perSecurity", "perVote", "perAttendee", "paymentDate"})
public class IncentivePremium1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrmDesc")
	protected Max350Text premiumDescription;
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the premium."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPremiumDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			isDerived = false;
			xmlTag = "PrmDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumDescription";
			definition = "Description of the premium.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PrmAmt", required = true)
	protected CurrencyAndAmount premiumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPremiumAmount
	 * IncentivePremium.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash premium paid per security, per vote or per attendee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPremiumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			isDerived = false;
			xmlTag = "PrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Cash premium paid per security, per vote or per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
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
	public static final MMMessageAttribute mmPerSecurity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			isDerived = false;
			xmlTag = "PerScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerSecurity";
			definition = "Number of securities giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
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
	public static final MMMessageAttribute mmPerVote = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerVote;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			isDerived = false;
			xmlTag = "PerVote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerVote";
			definition = "Number of votes giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
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
	public static final MMMessageAttribute mmPerAttendee = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerAttendee;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			isDerived = false;
			xmlTag = "PerAttndee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerAttendee";
			definition = "Indicates that the premium is given per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PmtDt")
	protected ISODate paymentDate;
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
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPaymentDate
	 * IncentivePremium.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
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
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time for the payment of the premium.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Either PerSecurity or PerVote or PerAttendee must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1
	 * IncentivePremium1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerSecurity
	 * IncentivePremium1.mmPerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerVote
	 * IncentivePremium1.mmPerVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerAttendee
	 * IncentivePremium1.mmPerAttendee}</li>
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
			messageComponent_lazy = () -> com.tools20022.repository.msg.IncentivePremium1.mmObject();
			impactedElements_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.IncentivePremium1.mmPerSecurity, com.tools20022.repository.msg.IncentivePremium1.mmPerVote, com.tools20022.repository.msg.IncentivePremium1.mmPerAttendee);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.mmPremiumDescription, com.tools20022.repository.msg.IncentivePremium1.mmPremiumAmount,
						com.tools20022.repository.msg.IncentivePremium1.mmPerSecurity, com.tools20022.repository.msg.IncentivePremium1.mmPerVote, com.tools20022.repository.msg.IncentivePremium1.mmPerAttendee,
						com.tools20022.repository.msg.IncentivePremium1.mmPaymentDate);
				trace_lazy = () -> IncentivePremium.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IncentivePremium1";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PerSecurityOrPerVoteOrPerAttendeeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPremiumDescription() {
		return premiumDescription == null ? Optional.empty() : Optional.of(premiumDescription);
	}

	public IncentivePremium1 setPremiumDescription(Max350Text premiumDescription) {
		this.premiumDescription = premiumDescription;
		return this;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return premiumAmount;
	}

	public IncentivePremium1 setPremiumAmount(CurrencyAndAmount premiumAmount) {
		this.premiumAmount = Objects.requireNonNull(premiumAmount);
		return this;
	}

	public Number getPerSecurity() {
		return perSecurity;
	}

	public IncentivePremium1 setPerSecurity(Number perSecurity) {
		this.perSecurity = Objects.requireNonNull(perSecurity);
		return this;
	}

	public Number getPerVote() {
		return perVote;
	}

	public IncentivePremium1 setPerVote(Number perVote) {
		this.perVote = Objects.requireNonNull(perVote);
		return this;
	}

	public YesNoIndicator getPerAttendee() {
		return perAttendee;
	}

	public IncentivePremium1 setPerAttendee(YesNoIndicator perAttendee) {
		this.perAttendee = Objects.requireNonNull(perAttendee);
		return this;
	}

	public Optional<ISODate> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public IncentivePremium1 setPaymentDate(ISODate paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}
}