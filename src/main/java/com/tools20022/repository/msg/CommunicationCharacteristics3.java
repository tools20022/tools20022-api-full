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
import com.tools20022.repository.codeset.PartyType7Code;
import com.tools20022.repository.codeset.POICommunicationType2Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3#mmCommunicationType
 * CommunicationCharacteristics3.mmCommunicationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3#mmRemoteParty
 * CommunicationCharacteristics3.mmRemoteParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3#mmActive
 * CommunicationCharacteristics3.mmActive}</li>
 * </ul>
 * </li>
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
 * "CommunicationCharacteristics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Low level communication of the hardware or software component toward another component or an external entity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2
 * CommunicationCharacteristics2}</li>
 * </ul>
 */
public class CommunicationCharacteristics3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected POICommunicationType2Code communicationType;
	/**
	 * Type of low level communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3
	 * CommunicationCharacteristics3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2#mmCommunicationType
	 * CommunicationCharacteristics2.mmCommunicationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommunicationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CommunicationCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "ComTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationType";
			definition = "Type of low level communication.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics2.mmCommunicationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	protected List<PartyType7Code> remoteParty;
	/**
	 * Entity that communicate with the current component, using this
	 * communication device.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3
	 * CommunicationCharacteristics3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2#mmRemoteParty
	 * CommunicationCharacteristics2.mmRemoteParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemoteParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CommunicationCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "RmotPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoteParty";
			definition = "Entity that communicate with the current component, using this communication device.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics2.mmRemoteParty;
			minOccurs = 1;
			simpleType_lazy = () -> PartyType7Code.mmObject();
		}
	};
	protected TrueFalseIndicator active;
	/**
	 * Communication hardware is activated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3
	 * CommunicationCharacteristics3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics2#mmActive
	 * CommunicationCharacteristics2.mmActive}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActive = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CommunicationCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "Actv";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			definition = "Communication hardware is activated.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics2.mmActive;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommunicationCharacteristics3.mmCommunicationType, com.tools20022.repository.msg.CommunicationCharacteristics3.mmRemoteParty,
						com.tools20022.repository.msg.CommunicationCharacteristics3.mmActive);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommunicationCharacteristics3";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				previousVersion_lazy = () -> CommunicationCharacteristics2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public POICommunicationType2Code getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(POICommunicationType2Code communicationType) {
		this.communicationType = communicationType;
	}

	public List<PartyType7Code> getRemoteParty() {
		return remoteParty;
	}

	public void setRemoteParty(List<PartyType7Code> remoteParty) {
		this.remoteParty = remoteParty;
	}

	public TrueFalseIndicator getActive() {
		return active;
	}

	public void setActive(TrueFalseIndicator active) {
		this.active = active;
	}
}