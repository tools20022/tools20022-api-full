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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * References a related message or provides another reference, such as a pool
 * reference, linking a set of messages. The party which issued the related
 * reference may be the Sender of the referenced message or a party other than
 * the Sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmReference
 * AdditionalReference4.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmReferenceIssuer
 * AdditionalReference4.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmMessageName
 * AdditionalReference4.mmMessageName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalReference4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference6
 * AdditionalReference6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AdditionalReference4", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reference;
	/**
	 * Message identification of a message. This reference was assigned by the
	 * party issuing the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4
	 * AdditionalReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message identification of a message. This reference was assigned by the party issuing the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReference
	 * AdditionalReference6.mmReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> AdditionalReference4.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Message identification of a message. This reference was assigned by the party issuing the message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference6.mmReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification2Choice referenceIssuer;
	/**
	 * Issuer of the reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4
	 * AdditionalReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the reference."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReferenceIssuer
	 * AdditionalReference6.mmReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AdditionalReference4.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference6.mmReferenceIssuer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected Max35Text messageName;
	/**
	 * Name of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4
	 * AdditionalReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmMessageName
	 * AdditionalReference6.mmMessageName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference4.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference6.mmMessageName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalReference4.mmReference, AdditionalReference4.mmReferenceIssuer, AdditionalReference4.mmMessageName);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AdditionalReference4";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ref", required = true)
	public Max35Text getReference() {
		return reference;
	}

	public void setReference(Max35Text reference) {
		this.reference = reference;
	}

	@XmlElement(name = "RefIssr")
	public PartyIdentification2Choice getReferenceIssuer() {
		return referenceIssuer;
	}

	public void setReferenceIssuer(PartyIdentification2Choice referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
	}

	@XmlElement(name = "MsgNm")
	public Max35Text getMessageName() {
		return messageName;
	}

	public void setMessageName(Max35Text messageName) {
		this.messageName = messageName;
	}
}