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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06;
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV06;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.choice.CommunicationMethod3Choice;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Type of document and the type of communication method to be used to notify a
 * party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentToSend3#mmType
 * DocumentToSend3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentToSend3#mmRecipient
 * DocumentToSend3.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentToSend3#mmMethodOfTransmission
 * DocumentToSend3.mmMethodOfTransmission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmServiceLevelAgreement
 * AccountOpeningInstructionV06.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmServiceLevelAgreement
 * AccountDetailsConfirmationV06.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmServiceLevelAgreement
 * AccountDetailsConfirmationV07.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmServiceLevelAgreement
 * AccountOpeningInstructionV07.mmServiceLevelAgreement}</li>
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
 * "DocumentToSend3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of document and the type of communication method to be used to notify a party."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.DocumentToSend2
 * DocumentToSend2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentToSend3", propOrder = {"type", "recipient", "methodOfTransmission"})
public class DocumentToSend3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected Max140Text type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend2#mmType
	 * DocumentToSend2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentToSend3, Max140Text> mmType = new MMMessageAttribute<DocumentToSend3, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentToSend3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of document.";
			previousVersion_lazy = () -> DocumentToSend2.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(DocumentToSend3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(DocumentToSend3 obj, Max140Text value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected PartyIdentification70Choice recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that should receive the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend2#mmRecipient
	 * DocumentToSend2.mmRecipient}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentToSend3, PartyIdentification70Choice> mmRecipient = new MMMessageAttribute<DocumentToSend3, PartyIdentification70Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentToSend3.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Party that should receive the document.";
			previousVersion_lazy = () -> DocumentToSend2.mmRecipient;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public PartyIdentification70Choice getValue(DocumentToSend3 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(DocumentToSend3 obj, PartyIdentification70Choice value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "MtdOfTrnsmssn", required = true)
	protected CommunicationMethod3Choice methodOfTransmission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod3Choice
	 * CommunicationMethod3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtdOfTrnsmssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodOfTransmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication method to be used."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DocumentToSend2#mmMethodOfTransmission
	 * DocumentToSend2.mmMethodOfTransmission}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentToSend3, CommunicationMethod3Choice> mmMethodOfTransmission = new MMMessageAssociationEnd<DocumentToSend3, CommunicationMethod3Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentToSend3.mmObject();
			isDerived = false;
			xmlTag = "MtdOfTrnsmssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodOfTransmission";
			definition = "Communication method to be used.";
			previousVersion_lazy = () -> DocumentToSend2.mmMethodOfTransmission;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommunicationMethod3Choice.mmObject();
		}

		@Override
		public CommunicationMethod3Choice getValue(DocumentToSend3 obj) {
			return obj.getMethodOfTransmission();
		}

		@Override
		public void setValue(DocumentToSend3 obj, CommunicationMethod3Choice value) {
			obj.setMethodOfTransmission(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.DocumentToSend3.mmType, com.tools20022.repository.msg.DocumentToSend3.mmRecipient, com.tools20022.repository.msg.DocumentToSend3.mmMethodOfTransmission);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV06.mmServiceLevelAgreement, AccountDetailsConfirmationV06.mmServiceLevelAgreement, AccountDetailsConfirmationV07.mmServiceLevelAgreement,
						AccountOpeningInstructionV07.mmServiceLevelAgreement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentToSend3";
				definition = "Type of document and the type of communication method to be used to notify a party.";
				previousVersion_lazy = () -> DocumentToSend2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getType() {
		return type;
	}

	public DocumentToSend3 setType(Max140Text type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PartyIdentification70Choice getRecipient() {
		return recipient;
	}

	public DocumentToSend3 setRecipient(PartyIdentification70Choice recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public CommunicationMethod3Choice getMethodOfTransmission() {
		return methodOfTransmission;
	}

	public DocumentToSend3 setMethodOfTransmission(CommunicationMethod3Choice methodOfTransmission) {
		this.methodOfTransmission = Objects.requireNonNull(methodOfTransmission);
		return this;
	}
}