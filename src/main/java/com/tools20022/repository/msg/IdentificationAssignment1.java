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
import com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01;
import com.tools20022.repository.area.acmt.IdentificationVerificationReportV01;
import com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01;
import com.tools20022.repository.choice.Party7Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements that identify the identification assignment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1#mmMessageIdentification
 * IdentificationAssignment1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1#mmCreationDateTime
 * IdentificationAssignment1.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1#mmCreator
 * IdentificationAssignment1.mmCreator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1#mmAssigner
 * IdentificationAssignment1.mmAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1#mmAssignee
 * IdentificationAssignment1.mmAssignee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01#mmAssignment
 * IdentificationModificationAdviceV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01#mmAssignment
 * IdentificationVerificationRequestV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01#mmAssignment
 * IdentificationVerificationReportV01.mmAssignment}</li>
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
 * "IdentificationAssignment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements that identify the identification assignment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationAssignment1", propOrder = {"messageIdentification", "creationDateTime", "creator", "assigner", "assignee"})
public class IdentificationAssignment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the assigner, and sent to the next party in the chain to unambiguously identify the message.\r\n\r\nUsage: The assigner has to make sure that MessageIdentification is unique per assignee for a pre-agreed period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationAssignment1, Max35Text> mmMessageIdentification = new MMMessageAttribute<IdentificationAssignment1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the assigner, and sent to the next party in the chain to unambiguously identify the message.\r\n\r\nUsage: The assigner has to make sure that MessageIdentification is unique per assignee for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationAssignment1 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(IdentificationAssignment1 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the identification assignment was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationAssignment1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<IdentificationAssignment1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the identification assignment was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IdentificationAssignment1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IdentificationAssignment1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "Cretr")
	protected Party7Choice creator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party7Choice
	 * Party7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cretr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that created the identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IdentificationAssignment1, Optional<Party7Choice>> mmCreator = new MMMessageAssociationEnd<IdentificationAssignment1, Optional<Party7Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment1.mmObject();
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the identification assignment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Party7Choice.mmObject();
		}

		@Override
		public Optional<Party7Choice> getValue(IdentificationAssignment1 obj) {
			return obj.getCreator();
		}

		@Override
		public void setValue(IdentificationAssignment1 obj, Optional<Party7Choice> value) {
			obj.setCreator(value.orElse(null));
		}
	};
	@XmlElement(name = "Assgnr", required = true)
	protected Party7Choice assigner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party7Choice
	 * Party7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that assigns the identification assignment to another party. This is also the sender of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IdentificationAssignment1, Party7Choice> mmAssigner = new MMMessageAssociationEnd<IdentificationAssignment1, Party7Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment1.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party that assigns the identification assignment to another party. This is also the sender of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party7Choice.mmObject();
		}

		@Override
		public Party7Choice getValue(IdentificationAssignment1 obj) {
			return obj.getAssigner();
		}

		@Override
		public void setValue(IdentificationAssignment1 obj, Party7Choice value) {
			obj.setAssigner(value);
		}
	};
	@XmlElement(name = "Assgne", required = true)
	protected Party7Choice assignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party7Choice
	 * Party7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the identification assignment is assigned to. This is also the receiver of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IdentificationAssignment1, Party7Choice> mmAssignee = new MMMessageAssociationEnd<IdentificationAssignment1, Party7Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IdentificationAssignment1.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party that the identification assignment is assigned to. This is also the receiver of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party7Choice.mmObject();
		}

		@Override
		public Party7Choice getValue(IdentificationAssignment1 obj) {
			return obj.getAssignee();
		}

		@Override
		public void setValue(IdentificationAssignment1 obj, Party7Choice value) {
			obj.setAssignee(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IdentificationAssignment1.mmMessageIdentification, com.tools20022.repository.msg.IdentificationAssignment1.mmCreationDateTime,
						com.tools20022.repository.msg.IdentificationAssignment1.mmCreator, com.tools20022.repository.msg.IdentificationAssignment1.mmAssigner, com.tools20022.repository.msg.IdentificationAssignment1.mmAssignee);
				messageBuildingBlock_lazy = () -> Arrays.asList(IdentificationModificationAdviceV01.mmAssignment, IdentificationVerificationRequestV01.mmAssignment, IdentificationVerificationReportV01.mmAssignment);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationAssignment1";
				definition = "Set of elements that identify the identification assignment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public IdentificationAssignment1 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public IdentificationAssignment1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<Party7Choice> getCreator() {
		return creator == null ? Optional.empty() : Optional.of(creator);
	}

	public IdentificationAssignment1 setCreator(Party7Choice creator) {
		this.creator = creator;
		return this;
	}

	public Party7Choice getAssigner() {
		return assigner;
	}

	public IdentificationAssignment1 setAssigner(Party7Choice assigner) {
		this.assigner = Objects.requireNonNull(assigner);
		return this;
	}

	public Party7Choice getAssignee() {
		return assignee;
	}

	public IdentificationAssignment1 setAssignee(Party7Choice assignee) {
		this.assignee = Objects.requireNonNull(assignee);
		return this;
	}
}