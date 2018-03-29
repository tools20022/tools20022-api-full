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
import com.tools20022.repository.codeset.PartyType7Code;
import com.tools20022.repository.codeset.POICommunicationType1Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
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
 * Low level communication of the hardware or software component toward another
 * component or an external entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2#mmCommunicationType
 * CommunicationCharacteristics2.mmCommunicationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2#mmRemoteParty
 * CommunicationCharacteristics2.mmRemoteParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2#mmActive
 * CommunicationCharacteristics2.mmActive}</li>
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
 * "CommunicationCharacteristics2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Low level communication of the hardware or software component toward another component or an external entity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3
 * CommunicationCharacteristics3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics1
 * CommunicationCharacteristics1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommunicationCharacteristics2", propOrder = {"communicationType", "remoteParty", "active"})
public class CommunicationCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ComTp", required = true)
	protected POICommunicationType1Code communicationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2
	 * CommunicationCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of low level communication."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3#mmCommunicationType
	 * CommunicationCharacteristics3.mmCommunicationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics1#mmCommunicationType
	 * CommunicationCharacteristics1.mmCommunicationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationCharacteristics2, POICommunicationType1Code> mmCommunicationType = new MMMessageAttribute<CommunicationCharacteristics2, POICommunicationType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "ComTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationType";
			definition = "Type of low level communication.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationCharacteristics3.mmCommunicationType);
			previousVersion_lazy = () -> CommunicationCharacteristics1.mmCommunicationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POICommunicationType1Code.mmObject();
		}

		@Override
		public POICommunicationType1Code getValue(CommunicationCharacteristics2 obj) {
			return obj.getCommunicationType();
		}

		@Override
		public void setValue(CommunicationCharacteristics2 obj, POICommunicationType1Code value) {
			obj.setCommunicationType(value);
		}
	};
	@XmlElement(name = "RmotPty", required = true)
	protected List<PartyType7Code> remoteParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType7Code
	 * PartyType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2
	 * CommunicationCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmotPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoteParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that communicate with the current component, using this communication device."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3#mmRemoteParty
	 * CommunicationCharacteristics3.mmRemoteParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics1#mmRemoteParty
	 * CommunicationCharacteristics1.mmRemoteParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationCharacteristics2, List<PartyType7Code>> mmRemoteParty = new MMMessageAttribute<CommunicationCharacteristics2, List<PartyType7Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "RmotPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoteParty";
			definition = "Entity that communicate with the current component, using this communication device.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationCharacteristics3.mmRemoteParty);
			previousVersion_lazy = () -> CommunicationCharacteristics1.mmRemoteParty;
			minOccurs = 1;
			simpleType_lazy = () -> PartyType7Code.mmObject();
		}

		@Override
		public List<PartyType7Code> getValue(CommunicationCharacteristics2 obj) {
			return obj.getRemoteParty();
		}

		@Override
		public void setValue(CommunicationCharacteristics2 obj, List<PartyType7Code> value) {
			obj.setRemoteParty(value);
		}
	};
	@XmlElement(name = "Actv", required = true)
	protected TrueFalseIndicator active;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2
	 * CommunicationCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication hardware is activated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3#mmActive
	 * CommunicationCharacteristics3.mmActive}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics1#mmActive
	 * CommunicationCharacteristics1.mmActive}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationCharacteristics2, TrueFalseIndicator> mmActive = new MMMessageAttribute<CommunicationCharacteristics2, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "Actv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			definition = "Communication hardware is activated.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationCharacteristics3.mmActive);
			previousVersion_lazy = () -> CommunicationCharacteristics1.mmActive;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CommunicationCharacteristics2 obj) {
			return obj.getActive();
		}

		@Override
		public void setValue(CommunicationCharacteristics2 obj, TrueFalseIndicator value) {
			obj.setActive(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommunicationCharacteristics2.mmCommunicationType, com.tools20022.repository.msg.CommunicationCharacteristics2.mmRemoteParty,
						com.tools20022.repository.msg.CommunicationCharacteristics2.mmActive);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationCharacteristics2";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				nextVersions_lazy = () -> Arrays.asList(CommunicationCharacteristics3.mmObject());
				previousVersion_lazy = () -> CommunicationCharacteristics1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public POICommunicationType1Code getCommunicationType() {
		return communicationType;
	}

	public CommunicationCharacteristics2 setCommunicationType(POICommunicationType1Code communicationType) {
		this.communicationType = Objects.requireNonNull(communicationType);
		return this;
	}

	public List<PartyType7Code> getRemoteParty() {
		return remoteParty == null ? remoteParty = new ArrayList<>() : remoteParty;
	}

	public CommunicationCharacteristics2 setRemoteParty(List<PartyType7Code> remoteParty) {
		this.remoteParty = Objects.requireNonNull(remoteParty);
		return this;
	}

	public TrueFalseIndicator getActive() {
		return active;
	}

	public CommunicationCharacteristics2 setActive(TrueFalseIndicator active) {
		this.active = Objects.requireNonNull(active);
		return this;
	}
}