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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ParticipantAccount1;
import com.tools20022.repository.msg.ParticipantInformation1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information from participant profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantProfile1#mmParticipantInformation
 * ParticipantProfile1.mmParticipantInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParticipantProfile1#mmParticipantAccountInformation
 * ParticipantProfile1.mmParticipantAccountInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ParticipantProfile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information from participant profile."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ParticipantProfile1", propOrder = {"participantInformation", "participantAccountInformation"})
public class ParticipantProfile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtcptInf", required = true)
	protected ParticipantInformation1 participantInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantInformation1
	 * ParticipantInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantProfile1
	 * ParticipantProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant information from participant profile."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ParticipantProfile1, ParticipantInformation1> mmParticipantInformation = new MMMessageAssociationEnd<ParticipantProfile1, ParticipantInformation1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantProfile1.mmObject();
			isDerived = false;
			xmlTag = "PtcptInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantInformation";
			definition = "Participant information from participant profile.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ParticipantInformation1.mmObject();
		}

		@Override
		public ParticipantInformation1 getValue(ParticipantProfile1 obj) {
			return obj.getParticipantInformation();
		}

		@Override
		public void setValue(ParticipantProfile1 obj, ParticipantInformation1 value) {
			obj.setParticipantInformation(value);
		}
	};
	@XmlElement(name = "PtcptAcctInf")
	protected List<ParticipantAccount1> participantAccountInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ParticipantAccount1
	 * ParticipantAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParticipantProfile1
	 * ParticipantProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptAcctInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantAccountInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account information from participant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ParticipantProfile1, List<ParticipantAccount1>> mmParticipantAccountInformation = new MMMessageAssociationEnd<ParticipantProfile1, List<ParticipantAccount1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ParticipantProfile1.mmObject();
			isDerived = false;
			xmlTag = "PtcptAcctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantAccountInformation";
			definition = "Account information from participant.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ParticipantAccount1.mmObject();
		}

		@Override
		public List<ParticipantAccount1> getValue(ParticipantProfile1 obj) {
			return obj.getParticipantAccountInformation();
		}

		@Override
		public void setValue(ParticipantProfile1 obj, List<ParticipantAccount1> value) {
			obj.setParticipantAccountInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParticipantProfile1.mmParticipantInformation, com.tools20022.repository.msg.ParticipantProfile1.mmParticipantAccountInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ParticipantProfile1";
				definition = "Information from participant profile.";
			}
		});
		return mmObject_lazy.get();
	}

	public ParticipantInformation1 getParticipantInformation() {
		return participantInformation;
	}

	public ParticipantProfile1 setParticipantInformation(ParticipantInformation1 participantInformation) {
		this.participantInformation = Objects.requireNonNull(participantInformation);
		return this;
	}

	public List<ParticipantAccount1> getParticipantAccountInformation() {
		return participantAccountInformation == null ? participantAccountInformation = new ArrayList<>() : participantAccountInformation;
	}

	public ParticipantProfile1 setParticipantAccountInformation(List<ParticipantAccount1> participantAccountInformation) {
		this.participantAccountInformation = Objects.requireNonNull(participantAccountInformation);
		return this;
	}
}