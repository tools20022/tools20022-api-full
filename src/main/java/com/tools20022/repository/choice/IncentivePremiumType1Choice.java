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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.IncentivePremium;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of cash premium paid to the security holder when voting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#mmPerSecurity
 * IncentivePremiumType1Choice.mmPerSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#mmPerVote
 * IncentivePremiumType1Choice.mmPerVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#mmPerAttendee
 * IncentivePremiumType1Choice.mmPerAttendee}</li>
 * </ul>
 * </li>
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
 * "IncentivePremiumType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of cash premium paid to the security holder when voting."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IncentivePremiumType1Choice", propOrder = {"perSecurity", "perVote", "perAttendee"})
public class IncentivePremiumType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice
	 * IncentivePremiumType1Choice}</li>
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
	public static final MMMessageAttribute<IncentivePremiumType1Choice, Number> mmPerSecurity = new MMMessageAttribute<IncentivePremiumType1Choice, Number>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerSecurity;
			componentContext_lazy = () -> com.tools20022.repository.choice.IncentivePremiumType1Choice.mmObject();
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
		public Number getValue(IncentivePremiumType1Choice obj) {
			return obj.getPerSecurity();
		}

		@Override
		public void setValue(IncentivePremiumType1Choice obj, Number value) {
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
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice
	 * IncentivePremiumType1Choice}</li>
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
	public static final MMMessageAttribute<IncentivePremiumType1Choice, Number> mmPerVote = new MMMessageAttribute<IncentivePremiumType1Choice, Number>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerVote;
			componentContext_lazy = () -> com.tools20022.repository.choice.IncentivePremiumType1Choice.mmObject();
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
		public Number getValue(IncentivePremiumType1Choice obj) {
			return obj.getPerVote();
		}

		@Override
		public void setValue(IncentivePremiumType1Choice obj, Number value) {
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
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice
	 * IncentivePremiumType1Choice}</li>
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
	public static final MMMessageAttribute<IncentivePremiumType1Choice, YesNoIndicator> mmPerAttendee = new MMMessageAttribute<IncentivePremiumType1Choice, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> IncentivePremium.mmPerAttendee;
			componentContext_lazy = () -> com.tools20022.repository.choice.IncentivePremiumType1Choice.mmObject();
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
		public YesNoIndicator getValue(IncentivePremiumType1Choice obj) {
			return obj.getPerAttendee();
		}

		@Override
		public void setValue(IncentivePremiumType1Choice obj, YesNoIndicator value) {
			obj.setPerAttendee(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IncentivePremiumType1Choice.mmPerSecurity, com.tools20022.repository.choice.IncentivePremiumType1Choice.mmPerVote,
						com.tools20022.repository.choice.IncentivePremiumType1Choice.mmPerAttendee);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IncentivePremiumType1Choice";
				definition = "Choice of cash premium paid to the security holder when voting.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getPerSecurity() {
		return perSecurity;
	}

	public IncentivePremiumType1Choice setPerSecurity(Number perSecurity) {
		this.perSecurity = Objects.requireNonNull(perSecurity);
		return this;
	}

	public Number getPerVote() {
		return perVote;
	}

	public IncentivePremiumType1Choice setPerVote(Number perVote) {
		this.perVote = Objects.requireNonNull(perVote);
		return this;
	}

	public YesNoIndicator getPerAttendee() {
		return perAttendee;
	}

	public IncentivePremiumType1Choice setPerAttendee(YesNoIndicator perAttendee) {
		this.perAttendee = Objects.requireNonNull(perAttendee);
		return this;
	}
}