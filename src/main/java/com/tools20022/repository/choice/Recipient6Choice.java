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
import com.tools20022.repository.msg.KEK5;
import com.tools20022.repository.msg.KEKIdentifier2;
import com.tools20022.repository.msg.KeyTransport5;
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
 * {@linkplain com.tools20022.repository.choice.Recipient6Choice#mmKeyTransport
 * Recipient6Choice.mmKeyTransport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient6Choice#mmKEK
 * Recipient6Choice.mmKEK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient6Choice#mmKeyIdentifier
 * Recipient6Choice.mmKeyIdentifier}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Recipient6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transport key or key encryption key (KEK) for the recipient."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Recipient4Choice
 * Recipient4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Recipient6Choice", propOrder = {"keyTransport", "kEK", "keyIdentifier"})
public class Recipient6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "KeyTrnsprt", required = true)
	protected KeyTransport5 keyTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KeyTransport5
	 * KeyTransport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient6Choice
	 * Recipient6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyTrnsprt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encryption key using previously distributed asymmetric public key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyTransport
	 * Recipient4Choice.mmKeyTransport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Recipient6Choice, KeyTransport5> mmKeyTransport = new MMMessageAssociationEnd<Recipient6Choice, KeyTransport5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Recipient6Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyTransport";
			definition = "Encryption key using previously distributed asymmetric public key.";
			previousVersion_lazy = () -> Recipient4Choice.mmKeyTransport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KeyTransport5.mmObject();
		}

		@Override
		public KeyTransport5 getValue(Recipient6Choice obj) {
			return obj.getKeyTransport();
		}

		@Override
		public void setValue(Recipient6Choice obj, KeyTransport5 value) {
			obj.setKeyTransport(value);
		}
	};
	@XmlElement(name = "KEK", required = true)
	protected KEK5 kEK;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEK5 KEK5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient6Choice
	 * Recipient6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KEK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key encryption key using previously distributed symmetric key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKEK
	 * Recipient4Choice.mmKEK}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Recipient6Choice, KEK5> mmKEK = new MMMessageAssociationEnd<Recipient6Choice, KEK5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Recipient6Choice.mmObject();
			isDerived = false;
			xmlTag = "KEK";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEK";
			definition = "Key encryption key using previously distributed symmetric key.";
			previousVersion_lazy = () -> Recipient4Choice.mmKEK;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEK5.mmObject();
		}

		@Override
		public KEK5 getValue(Recipient6Choice obj) {
			return obj.getKEK();
		}

		@Override
		public void setValue(Recipient6Choice obj, KEK5 value) {
			obj.setKEK(value);
		}
	};
	@XmlElement(name = "KeyIdr", required = true)
	protected KEKIdentifier2 keyIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier2
	 * KEKIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient6Choice
	 * Recipient6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a protection key without a session key, shared and previously exchanged between the initiator and the recipient."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyIdentifier
	 * Recipient4Choice.mmKeyIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Recipient6Choice, KEKIdentifier2> mmKeyIdentifier = new MMMessageAssociationEnd<Recipient6Choice, KEKIdentifier2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Recipient6Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentifier";
			definition = "Identification of a protection key without a session key, shared and previously exchanged between the initiator and the recipient.";
			previousVersion_lazy = () -> Recipient4Choice.mmKeyIdentifier;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEKIdentifier2.mmObject();
		}

		@Override
		public KEKIdentifier2 getValue(Recipient6Choice obj) {
			return obj.getKeyIdentifier();
		}

		@Override
		public void setValue(Recipient6Choice obj, KEKIdentifier2 value) {
			obj.setKeyIdentifier(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Recipient6Choice.mmKeyTransport, com.tools20022.repository.choice.Recipient6Choice.mmKEK,
						com.tools20022.repository.choice.Recipient6Choice.mmKeyIdentifier);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Recipient6Choice";
				definition = "Transport key or key encryption key (KEK) for the recipient.";
				previousVersion_lazy = () -> Recipient4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public KeyTransport5 getKeyTransport() {
		return keyTransport;
	}

	public Recipient6Choice setKeyTransport(KeyTransport5 keyTransport) {
		this.keyTransport = Objects.requireNonNull(keyTransport);
		return this;
	}

	public KEK5 getKEK() {
		return kEK;
	}

	public Recipient6Choice setKEK(KEK5 kEK) {
		this.kEK = Objects.requireNonNull(kEK);
		return this;
	}

	public KEKIdentifier2 getKeyIdentifier() {
		return keyIdentifier;
	}

	public Recipient6Choice setKeyIdentifier(KEKIdentifier2 keyIdentifier) {
		this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
		return this;
	}
}