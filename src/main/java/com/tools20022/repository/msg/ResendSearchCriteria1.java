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
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.datatype.ISODate;
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
 * Defines the criteria to extract the message(s) which should be resent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmBusinessDate
 * ResendSearchCriteria1.mmBusinessDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmSequenceNumber
 * ResendSearchCriteria1.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmOriginalMessageNameIdentification
 * ResendSearchCriteria1.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmFileReference
 * ResendSearchCriteria1.mmFileReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmRecipient
 * ResendSearchCriteria1.mmRecipient}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResendSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria to extract the message(s) which should be resent."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
 * ResendSearchCriteria2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResendSearchCriteria1", propOrder = {"businessDate", "sequenceNumber", "originalMessageNameIdentification", "fileReference", "recipient"})
public class ResendSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizDt")
	protected ISODate businessDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the business day of the requested messages the resend function is used for."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmBusinessDate
	 * ResendSearchCriteria2.mmBusinessDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria1, Optional<ISODate>> mmBusinessDate = new MMMessageAttribute<ResendSearchCriteria1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "BizDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDate";
			definition = "Date of the business day of the requested messages the resend function is used for.";
			nextVersions_lazy = () -> Arrays.asList(ResendSearchCriteria2.mmBusinessDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ResendSearchCriteria1 obj) {
			return obj.getBusinessDate();
		}

		@Override
		public void setValue(ResendSearchCriteria1 obj, Optional<ISODate> value) {
			obj.setBusinessDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max35Text sequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent counter for message sequence, which is available once per party technical address.\nSpecifies the identification sequence number for a specific couple sender/receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmSequenceNumber
	 * ResendSearchCriteria2.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria1, Optional<Max35Text>> mmSequenceNumber = new MMMessageAttribute<ResendSearchCriteria1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Independent counter for message sequence, which is available once per party technical address.\nSpecifies the identification sequence number for a specific couple sender/receiver.";
			nextVersions_lazy = () -> Arrays.asList(ResendSearchCriteria2.mmSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResendSearchCriteria1 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(ResendSearchCriteria1 obj, Optional<Max35Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlMsgNmId")
	protected Max35Text originalMessageNameIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguously identifies the original business message, which was delivered by the business sender."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmOriginalMessageNameIdentification
	 * ResendSearchCriteria2.mmOriginalMessageNameIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria1, Optional<Max35Text>> mmOriginalMessageNameIdentification = new MMMessageAttribute<ResendSearchCriteria1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Unambiguously identifies the original business message, which was delivered by the business sender.";
			nextVersions_lazy = () -> Arrays.asList(ResendSearchCriteria2.mmOriginalMessageNameIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResendSearchCriteria1 obj) {
			return obj.getOriginalMessageNameIdentification();
		}

		@Override
		public void setValue(ResendSearchCriteria1 obj, Optional<Max35Text> value) {
			obj.setOriginalMessageNameIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FileRef")
	protected Max35Text fileReference;
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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "String of characters that uniquely identifies the file, which was delivered by the sender."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmFileReference
	 * ResendSearchCriteria2.mmFileReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria1, Optional<Max35Text>> mmFileReference = new MMMessageAttribute<ResendSearchCriteria1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FileRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileReference";
			definition = "String of characters that uniquely identifies the file, which was delivered by the sender.";
			nextVersions_lazy = () -> Arrays.asList(ResendSearchCriteria2.mmFileReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResendSearchCriteria1 obj) {
			return obj.getFileReference();
		}

		@Override
		public void setValue(ResendSearchCriteria1 obj, Optional<Max35Text> value) {
			obj.setFileReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected PartyIdentification71Choice recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
	 * ResendSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify the recipient of the report message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmRecipient
	 * ResendSearchCriteria2.mmRecipient}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ResendSearchCriteria1, PartyIdentification71Choice> mmRecipient = new MMMessageAssociationEnd<ResendSearchCriteria1, PartyIdentification71Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Unique identification to unambiguously identify the recipient of the report message.";
			nextVersions_lazy = () -> Arrays.asList(ResendSearchCriteria2.mmRecipient);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public PartyIdentification71Choice getValue(ResendSearchCriteria1 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(ResendSearchCriteria1 obj, PartyIdentification71Choice value) {
			obj.setRecipient(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResendSearchCriteria1.mmBusinessDate, com.tools20022.repository.msg.ResendSearchCriteria1.mmSequenceNumber,
						com.tools20022.repository.msg.ResendSearchCriteria1.mmOriginalMessageNameIdentification, com.tools20022.repository.msg.ResendSearchCriteria1.mmFileReference,
						com.tools20022.repository.msg.ResendSearchCriteria1.mmRecipient);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ResendSearchCriteria1";
				definition = "Defines the criteria to extract the message(s) which should be resent.";
				nextVersions_lazy = () -> Arrays.asList(ResendSearchCriteria2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getBusinessDate() {
		return businessDate == null ? Optional.empty() : Optional.of(businessDate);
	}

	public ResendSearchCriteria1 setBusinessDate(ISODate businessDate) {
		this.businessDate = businessDate;
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public ResendSearchCriteria1 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<Max35Text> getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification == null ? Optional.empty() : Optional.of(originalMessageNameIdentification);
	}

	public ResendSearchCriteria1 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = originalMessageNameIdentification;
		return this;
	}

	public Optional<Max35Text> getFileReference() {
		return fileReference == null ? Optional.empty() : Optional.of(fileReference);
	}

	public ResendSearchCriteria1 setFileReference(Max35Text fileReference) {
		this.fileReference = fileReference;
		return this;
	}

	public PartyIdentification71Choice getRecipient() {
		return recipient;
	}

	public ResendSearchCriteria1 setRecipient(PartyIdentification71Choice recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}
}