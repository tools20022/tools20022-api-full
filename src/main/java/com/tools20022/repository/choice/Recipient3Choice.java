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
import com.tools20022.repository.msg.KEK3;
import com.tools20022.repository.msg.KEKIdentifier1;
import com.tools20022.repository.msg.KeyTransport3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKeyTransport
 * Recipient3Choice.mmKeyTransport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKEK
 * Recipient3Choice.mmKEK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKeyIdentifier
 * Recipient3Choice.mmKeyIdentifier}</li>
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
 * "Recipient3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transport key or key encryption key (KEK) for the recipient."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient4Choice
 * Recipient4Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Recipient2Choice
 * Recipient2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Recipient3Choice", propOrder = {"keyTransport", "kEK", "keyIdentifier"})
public class Recipient3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "KeyTrnsprt", required = true)
	protected KeyTransport3 keyTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KeyTransport3
	 * KeyTransport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice
	 * Recipient3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyTransport
	 * Recipient4Choice.mmKeyTransport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient2Choice#mmKeyTransport
	 * Recipient2Choice.mmKeyTransport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyTransport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Recipient3Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyTransport";
			definition = "Encryption key using previously distributed asymmetric public key.";
			nextVersions_lazy = () -> Arrays.asList(Recipient4Choice.mmKeyTransport);
			previousVersion_lazy = () -> Recipient2Choice.mmKeyTransport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KeyTransport3.mmObject();
		}
	};
	@XmlElement(name = "KEK", required = true)
	protected KEK3 kEK;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEK3 KEK3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice
	 * Recipient3Choice}</li>
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
	 * "Encryption key using previously distributed symmetric key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKEK
	 * Recipient4Choice.mmKEK}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient2Choice#mmKEK
	 * Recipient2Choice.mmKEK}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKEK = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Recipient3Choice.mmObject();
			isDerived = false;
			xmlTag = "KEK";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEK";
			definition = "Encryption key using previously distributed symmetric key.";
			nextVersions_lazy = () -> Arrays.asList(Recipient4Choice.mmKEK);
			previousVersion_lazy = () -> Recipient2Choice.mmKEK;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEK3.mmObject();
		}
	};
	@XmlElement(name = "KeyIdr", required = true)
	protected KEKIdentifier1 keyIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier1
	 * KEKIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice
	 * Recipient3Choice}</li>
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
	 * "Identification of a cryptographic symetric key, previously exchanged between the initiator and the recipient."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyIdentifier
	 * Recipient4Choice.mmKeyIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyIdentifier = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Recipient3Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentifier";
			definition = "Identification of a cryptographic symetric key, previously exchanged between the initiator and the recipient.";
			nextVersions_lazy = () -> Arrays.asList(Recipient4Choice.mmKeyIdentifier);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEKIdentifier1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Recipient3Choice.mmKeyTransport, com.tools20022.repository.choice.Recipient3Choice.mmKEK,
						com.tools20022.repository.choice.Recipient3Choice.mmKeyIdentifier);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Recipient3Choice";
				definition = "Transport key or key encryption key (KEK) for the recipient.";
				nextVersions_lazy = () -> Arrays.asList(Recipient4Choice.mmObject());
				previousVersion_lazy = () -> Recipient2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public KeyTransport3 getKeyTransport() {
		return keyTransport;
	}

	public Recipient3Choice setKeyTransport(KeyTransport3 keyTransport) {
		this.keyTransport = Objects.requireNonNull(keyTransport);
		return this;
	}

	public KEK3 getKEK() {
		return kEK;
	}

	public Recipient3Choice setKEK(KEK3 kEK) {
		this.kEK = Objects.requireNonNull(kEK);
		return this;
	}

	public KEKIdentifier1 getKeyIdentifier() {
		return keyIdentifier;
	}

	public Recipient3Choice setKeyIdentifier(KEKIdentifier1 keyIdentifier) {
		this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
		return this;
	}
}