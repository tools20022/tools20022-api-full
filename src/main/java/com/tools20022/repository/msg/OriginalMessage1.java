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
import com.tools20022.repository.choice.Party9Choice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.ISONormalisedDateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a message previously sent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage1#mmMessageDefinitionIdentifier
 * OriginalMessage1.mmMessageDefinitionIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage1#mmFrom
 * OriginalMessage1.mmFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage1#mmTo
 * OriginalMessage1.mmTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage1#mmBusinessMessageIdentifier
 * OriginalMessage1.mmBusinessMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage1#mmCreationDate
 * OriginalMessage1.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalMessage1#mmCopyDuplicate
 * OriginalMessage1.mmCopyDuplicate}</li>
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
 * "OriginalMessage1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a message previously sent."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OriginalMessage1", propOrder = {"messageDefinitionIdentifier", "from", "to", "businessMessageIdentifier", "creationDate", "copyDuplicate"})
public class OriginalMessage1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text messageDefinitionIdentifier;
	/**
	 * XML schema-instance namespace, for example "tsin.008.001.01"
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
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDefIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDefinitionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "XML schema-instance namespace, for example \"tsin.008.001.01\" "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageDefinitionIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage1.mmObject();
			isDerived = false;
			xmlTag = "MsgDefIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDefinitionIdentifier";
			definition = "XML schema-instance namespace, for example \"tsin.008.001.01\" ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Party9Choice from;
	/**
	 * Message sender specified in the original message. <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message sender specified in the original message.\r\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalMessage1.mmObject();
			isDerived = false;
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Message sender specified in the original message.\r\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party9Choice.mmObject();
		}
	};
	protected Party9Choice to;
	/**
	 * Message recipient specified in the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message recipient specified in the original message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalMessage1.mmObject();
			isDerived = false;
			xmlTag = "To";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "Message recipient specified in the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party9Choice.mmObject();
		}
	};
	protected Max35Text businessMessageIdentifier;
	/**
	 * Message identification specified in the original message.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizMsgIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessMessageIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message identification specified in the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessMessageIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage1.mmObject();
			isDerived = false;
			xmlTag = "BizMsgIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessMessageIdentifier";
			definition = "Message identification specified in the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISONormalisedDateTime creationDate;
	/**
	 * Message creation date and time specified in the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISONormalisedDateTime
	 * ISONormalisedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message creation date and time specified in the original message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage1.mmObject();
			isDerived = false;
			xmlTag = "CreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "Message creation date and time specified in the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISONormalisedDateTime.mmObject();
		}
	};
	protected CopyDuplicate1Code copyDuplicate;
	/**
	 * Indicates whether the message is a copy, a duplicate or a copy of a
	 * duplicate of a previously sent ISO 20022 message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage1
	 * OriginalMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the message is a copy, a duplicate or a copy of a duplicate of a previously sent ISO 20022 message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyDuplicate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessage1.mmObject();
			isDerived = false;
			xmlTag = "CpyDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Indicates whether the message is a copy, a duplicate or a copy of a duplicate of a previously sent ISO 20022 message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OriginalMessage1.mmMessageDefinitionIdentifier, OriginalMessage1.mmFrom, OriginalMessage1.mmTo, OriginalMessage1.mmBusinessMessageIdentifier, OriginalMessage1.mmCreationDate,
						OriginalMessage1.mmCopyDuplicate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalMessage1";
				definition = "Identification of a message previously sent.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgDefIdr", required = true)
	public Max35Text getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier;
	}

	public void setMessageDefinitionIdentifier(Max35Text messageDefinitionIdentifier) {
		this.messageDefinitionIdentifier = messageDefinitionIdentifier;
	}

	@XmlElement(name = "Fr", required = true)
	public Party9Choice getFrom() {
		return from;
	}

	public void setFrom(Party9Choice from) {
		this.from = from;
	}

	@XmlElement(name = "To", required = true)
	public Party9Choice getTo() {
		return to;
	}

	public void setTo(Party9Choice to) {
		this.to = to;
	}

	@XmlElement(name = "BizMsgIdr", required = true)
	public Max35Text getBusinessMessageIdentifier() {
		return businessMessageIdentifier;
	}

	public void setBusinessMessageIdentifier(Max35Text businessMessageIdentifier) {
		this.businessMessageIdentifier = businessMessageIdentifier;
	}

	@XmlElement(name = "CreDt", required = true)
	public ISONormalisedDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ISONormalisedDateTime creationDate) {
		this.creationDate = creationDate;
	}

	@XmlElement(name = "CpyDplct")
	public CopyDuplicate1Code getCopyDuplicate() {
		return copyDuplicate;
	}

	public void setCopyDuplicate(CopyDuplicate1Code copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
	}
}