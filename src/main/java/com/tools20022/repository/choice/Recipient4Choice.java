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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.KEK4;
import com.tools20022.repository.msg.KEKIdentifier2;
import com.tools20022.repository.msg.KeyTransport4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transport key or key encryption key (KEK) for the recipient.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyTransport
 * Recipient4Choice.mmKeyTransport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKEK
 * Recipient4Choice.mmKEK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyIdentifier
 * Recipient4Choice.mmKeyIdentifier}</li>
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
 * "Recipient4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transport key or key encryption key (KEK) for the recipient."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient5Choice
 * Recipient5Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Recipient3Choice
 * Recipient3Choice}</li>
 * </ul>
 */
public class Recipient4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected KeyTransport4 keyTransport;
	/**
	 * Encryption key using previously distributed asymmetric public key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KeyTransport4
	 * KeyTransport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice
	 * Recipient4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encryption key using previously distributed asymmetric public key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKeyTransport
	 * Recipient3Choice.mmKeyTransport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyTransport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient4Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyTransport";
			definition = "Encryption key using previously distributed asymmetric public key.";
			previousVersion_lazy = () -> Recipient3Choice.mmKeyTransport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KeyTransport4.mmObject();
		}
	};
	protected KEK4 kEK;
	/**
	 * Key encryption key using previously distributed symmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEK4 KEK4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice
	 * Recipient4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key encryption key using previously distributed symmetric key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKEK
	 * Recipient3Choice.mmKEK}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKEK = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient4Choice.mmObject();
			isDerived = false;
			xmlTag = "KEK";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEK";
			definition = "Key encryption key using previously distributed symmetric key.";
			previousVersion_lazy = () -> Recipient3Choice.mmKEK;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEK4.mmObject();
		}
	};
	protected KEKIdentifier2 keyIdentifier;
	/**
	 * Identification of a protection key without a session key, shared and
	 * previously exchanged between the initiator and the recipient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier2
	 * KEKIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice
	 * Recipient4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a protection key without a session key, shared and previously exchanged between the initiator and the recipient."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Recipient5Choice#mmKeyIdentifier
	 * Recipient5Choice.mmKeyIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKeyIdentifier
	 * Recipient3Choice.mmKeyIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyIdentifier = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient4Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentifier";
			definition = "Identification of a protection key without a session key, shared and previously exchanged between the initiator and the recipient.";
			nextVersions_lazy = () -> Arrays.asList(Recipient5Choice.mmKeyIdentifier);
			previousVersion_lazy = () -> Recipient3Choice.mmKeyIdentifier;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEKIdentifier2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Recipient4Choice.mmKeyTransport, Recipient4Choice.mmKEK, Recipient4Choice.mmKeyIdentifier);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Recipient4Choice";
				definition = "Transport key or key encryption key (KEK) for the recipient.";
				nextVersions_lazy = () -> Arrays.asList(Recipient5Choice.mmObject());
				previousVersion_lazy = () -> Recipient3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public KeyTransport4 getKeyTransport() {
		return keyTransport;
	}

	public void setKeyTransport(KeyTransport4 keyTransport) {
		this.keyTransport = keyTransport;
	}

	public KEK4 getKEK() {
		return kEK;
	}

	public void setKEK(KEK4 kEK) {
		this.kEK = kEK;
	}

	public KEKIdentifier2 getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(KEKIdentifier2 keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}
}