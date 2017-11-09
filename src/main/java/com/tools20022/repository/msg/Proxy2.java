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
import com.tools20022.repository.choice.Vote1Choice;
import com.tools20022.repository.codeset.ProxyType2Code;
import com.tools20022.repository.entity.ProxyAppointment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.msg.Proxy2#mmProxyType
 * Proxy2.mmProxyType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy2#mmPersonDetails
 * Proxy2.mmPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Proxy2#mmVoteInstructionForAgendaResolution
 * Proxy2.mmVoteInstructionForAgendaResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProxyAppointment
 * ProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Proxy2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting."
 * </li>
 * </ul>
 */
public class Proxy2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ProxyType2Code proxyType;
	/**
	 * Specifies the type of proxy.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy2
	 * Proxy2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProxyAppointment.mmProxyType;
			componentContext_lazy = () -> Proxy2.mmObject();
			isDerived = false;
			xmlTag = "PrxyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyType";
			definition = "Specifies the type of proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyType2Code.mmObject();
		}
	};
	protected IndividualPerson13 personDetails;
	/**
	 * Person, other than the Chairman of the meeting, assigned by the security
	 * holder as proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson13
	 * IndividualPerson13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy2
	 * Proxy2}</li>
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
	 * "Person, other than the Chairman of the meeting, assigned by the security holder as proxy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPersonDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Proxy2.mmObject();
			isDerived = false;
			xmlTag = "PrsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonDetails";
			definition = "Person, other than the Chairman of the meeting, assigned by the security holder as proxy.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson13.mmObject();
		}
	};
	protected Vote1Choice voteInstructionForAgendaResolution;
	/**
	 * Indicates the vote instruction for the resolutions which are announced
	 * via the meeting agenda in advance of the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Vote1Choice
	 * Vote1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy2
	 * Proxy2}</li>
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
	 * "Indicates the vote instruction for the resolutions which are announced via the meeting agenda in advance of the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteInstructionForAgendaResolution = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Proxy2.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrForAgndRsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionForAgendaResolution";
			definition = "Indicates the vote instruction for the resolutions which are announced via the meeting agenda in advance of the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Vote1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Proxy2.mmProxyType, Proxy2.mmPersonDetails, Proxy2.mmVoteInstructionForAgendaResolution);
				trace_lazy = () -> ProxyAppointment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Proxy2";
				definition = "Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProxyType2Code getProxyType() {
		return proxyType;
	}

	public void setProxyType(ProxyType2Code proxyType) {
		this.proxyType = proxyType;
	}

	public IndividualPerson13 getPersonDetails() {
		return personDetails;
	}

	public void setPersonDetails(com.tools20022.repository.msg.IndividualPerson13 personDetails) {
		this.personDetails = personDetails;
	}

	public Vote1Choice getVoteInstructionForAgendaResolution() {
		return voteInstructionForAgendaResolution;
	}

	public void setVoteInstructionForAgendaResolution(Vote1Choice voteInstructionForAgendaResolution) {
		this.voteInstructionForAgendaResolution = voteInstructionForAgendaResolution;
	}
}