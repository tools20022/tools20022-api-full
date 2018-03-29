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
import com.tools20022.repository.choice.Vote3Choice;
import com.tools20022.repository.codeset.ProxyType2Code;
import com.tools20022.repository.entity.ProxyAppointment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson26;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the elements that identify a proxy appointed to represent a party
 * authorised to vote at a shareholders meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy6#mmProxyType
 * Proxy6.mmProxyType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy6#mmPersonDetails
 * Proxy6.mmPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Proxy6#mmVoteInstructionForAgendaResolution
 * Proxy6.mmVoteInstructionForAgendaResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProxyAppointment
 * ProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProxyAppointment1Rule#forProxy6
 * ConstraintProxyAppointment1Rule.forProxy6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Proxy6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Proxy4 Proxy4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Proxy6", propOrder = {"proxyType", "personDetails", "voteInstructionForAgendaResolution"})
public class Proxy6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrxyTp", required = true)
	protected ProxyType2Code proxyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code
	 * ProxyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmProxyType
	 * ProxyAppointment.mmProxyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy6
	 * Proxy6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proxy4#mmProxyType
	 * Proxy4.mmProxyType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Proxy6, ProxyType2Code> mmProxyType = new MMMessageAttribute<Proxy6, ProxyType2Code>() {
		{
			businessElementTrace_lazy = () -> ProxyAppointment.mmProxyType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Proxy6.mmObject();
			isDerived = false;
			xmlTag = "PrxyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyType";
			definition = "Specifies the type of proxy.";
			previousVersion_lazy = () -> Proxy4.mmProxyType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyType2Code.mmObject();
		}

		@Override
		public ProxyType2Code getValue(Proxy6 obj) {
			return obj.getProxyType();
		}

		@Override
		public void setValue(Proxy6 obj, ProxyType2Code value) {
			obj.setProxyType(value);
		}
	};
	@XmlElement(name = "PrsnDtls")
	protected IndividualPerson26 personDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy6
	 * Proxy6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person, other than the chairman of the meeting, assigned by the security holder as the proxy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proxy4#mmPersonDetails
	 * Proxy4.mmPersonDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Proxy6, Optional<IndividualPerson26>> mmPersonDetails = new MMMessageAssociationEnd<Proxy6, Optional<IndividualPerson26>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Proxy6.mmObject();
			isDerived = false;
			xmlTag = "PrsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonDetails";
			definition = "Person, other than the chairman of the meeting, assigned by the security holder as the proxy.";
			previousVersion_lazy = () -> Proxy4.mmPersonDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson26.mmObject();
		}

		@Override
		public Optional<IndividualPerson26> getValue(Proxy6 obj) {
			return obj.getPersonDetails();
		}

		@Override
		public void setValue(Proxy6 obj, Optional<IndividualPerson26> value) {
			obj.setPersonDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "VoteInstrForAgndRsltn")
	protected Vote3Choice voteInstructionForAgendaResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Vote3Choice
	 * Vote3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy6
	 * Proxy6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrForAgndRsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionForAgendaResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the vote instruction for the resolutions that are announced via the meeting agenda in advance of the meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proxy4#mmVoteInstructionForAgendaResolution
	 * Proxy4.mmVoteInstructionForAgendaResolution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Proxy6, Optional<Vote3Choice>> mmVoteInstructionForAgendaResolution = new MMMessageAssociationEnd<Proxy6, Optional<Vote3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Proxy6.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrForAgndRsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionForAgendaResolution";
			definition = "Indicates the vote instruction for the resolutions that are announced via the meeting agenda in advance of the meeting.";
			previousVersion_lazy = () -> Proxy4.mmVoteInstructionForAgendaResolution;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Vote3Choice.mmObject();
		}

		@Override
		public Optional<Vote3Choice> getValue(Proxy6 obj) {
			return obj.getVoteInstructionForAgendaResolution();
		}

		@Override
		public void setValue(Proxy6 obj, Optional<Vote3Choice> value) {
			obj.setVoteInstructionForAgendaResolution(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Proxy6.mmProxyType, com.tools20022.repository.msg.Proxy6.mmPersonDetails, com.tools20022.repository.msg.Proxy6.mmVoteInstructionForAgendaResolution);
				trace_lazy = () -> ProxyAppointment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProxyAppointment1Rule.forProxy6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Proxy6";
				definition = "Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting.";
				previousVersion_lazy = () -> Proxy4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ProxyType2Code getProxyType() {
		return proxyType;
	}

	public Proxy6 setProxyType(ProxyType2Code proxyType) {
		this.proxyType = Objects.requireNonNull(proxyType);
		return this;
	}

	public Optional<IndividualPerson26> getPersonDetails() {
		return personDetails == null ? Optional.empty() : Optional.of(personDetails);
	}

	public Proxy6 setPersonDetails(IndividualPerson26 personDetails) {
		this.personDetails = personDetails;
		return this;
	}

	public Optional<Vote3Choice> getVoteInstructionForAgendaResolution() {
		return voteInstructionForAgendaResolution == null ? Optional.empty() : Optional.of(voteInstructionForAgendaResolution);
	}

	public Proxy6 setVoteInstructionForAgendaResolution(Vote3Choice voteInstructionForAgendaResolution) {
		this.voteInstructionForAgendaResolution = voteInstructionForAgendaResolution;
		return this;
	}
}