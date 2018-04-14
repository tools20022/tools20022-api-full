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
import com.tools20022.repository.area.admi.ResendRequestV01;
import com.tools20022.repository.choice.SequenceRange1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification100;
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
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmBusinessDate
 * ResendSearchCriteria2.mmBusinessDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmSequenceNumber
 * ResendSearchCriteria2.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmSequenceRange
 * ResendSearchCriteria2.mmSequenceRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmOriginalMessageNameIdentification
 * ResendSearchCriteria2.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmFileReference
 * ResendSearchCriteria2.mmFileReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2#mmRecipient
 * ResendSearchCriteria2.mmRecipient}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ResendRequestV01#mmResendSearchCriteria
 * ResendRequestV01.mmResendSearchCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResendSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria to extract the message(s) which should be resent."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1
 * ResendSearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResendSearchCriteria2", propOrder = {"businessDate", "sequenceNumber", "sequenceRange", "originalMessageNameIdentification", "fileReference", "recipient"})
public class ResendSearchCriteria2 {

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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
	 * ResendSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmBusinessDate
	 * ResendSearchCriteria1.mmBusinessDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria2, Optional<ISODate>> mmBusinessDate = new MMMessageAttribute<ResendSearchCriteria2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "BizDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDate";
			definition = "Date of the business day of the requested messages the resend function is used for.";
			previousVersion_lazy = () -> ResendSearchCriteria1.mmBusinessDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ResendSearchCriteria2 obj) {
			return obj.getBusinessDate();
		}

		@Override
		public void setValue(ResendSearchCriteria2 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
	 * ResendSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmSequenceNumber
	 * ResendSearchCriteria1.mmSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria2, Optional<Max35Text>> mmSequenceNumber = new MMMessageAttribute<ResendSearchCriteria2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Independent counter for message sequence, which is available once per party technical address.\nSpecifies the identification sequence number for a specific couple sender/receiver.";
			previousVersion_lazy = () -> ResendSearchCriteria1.mmSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResendSearchCriteria2 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(ResendSearchCriteria2 obj, Optional<Max35Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqRg")
	protected SequenceRange1Choice sequenceRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SequenceRange1Choice
	 * SequenceRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
	 * ResendSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent counter for a range of message sequences, which are available once per party technical address.\r\nSpecifies the range of identification sequence numbers for a specific couple sender/receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ResendSearchCriteria2, Optional<SequenceRange1Choice>> mmSequenceRange = new MMMessageAssociationEnd<ResendSearchCriteria2, Optional<SequenceRange1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SeqRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceRange";
			definition = "Independent counter for a range of message sequences, which are available once per party technical address.\r\nSpecifies the range of identification sequence numbers for a specific couple sender/receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SequenceRange1Choice.mmObject();
		}

		@Override
		public Optional<SequenceRange1Choice> getValue(ResendSearchCriteria2 obj) {
			return obj.getSequenceRange();
		}

		@Override
		public void setValue(ResendSearchCriteria2 obj, Optional<SequenceRange1Choice> value) {
			obj.setSequenceRange(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
	 * ResendSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguously identifies the original bsiness message, which was delivered by the business sender."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmOriginalMessageNameIdentification
	 * ResendSearchCriteria1.mmOriginalMessageNameIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria2, Optional<Max35Text>> mmOriginalMessageNameIdentification = new MMMessageAttribute<ResendSearchCriteria2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Unambiguously identifies the original bsiness message, which was delivered by the business sender.";
			previousVersion_lazy = () -> ResendSearchCriteria1.mmOriginalMessageNameIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResendSearchCriteria2 obj) {
			return obj.getOriginalMessageNameIdentification();
		}

		@Override
		public void setValue(ResendSearchCriteria2 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
	 * ResendSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmFileReference
	 * ResendSearchCriteria1.mmFileReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResendSearchCriteria2, Optional<Max35Text>> mmFileReference = new MMMessageAttribute<ResendSearchCriteria2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FileRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileReference";
			definition = "String of characters that uniquely identifies the file, which was delivered by the sender.";
			previousVersion_lazy = () -> ResendSearchCriteria1.mmFileReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResendSearchCriteria2 obj) {
			return obj.getFileReference();
		}

		@Override
		public void setValue(ResendSearchCriteria2 obj, Optional<Max35Text> value) {
			obj.setFileReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected PartyIdentification100 recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria2
	 * ResendSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ResendSearchCriteria1#mmRecipient
	 * ResendSearchCriteria1.mmRecipient}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ResendSearchCriteria2, PartyIdentification100> mmRecipient = new MMMessageAssociationEnd<ResendSearchCriteria2, PartyIdentification100>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResendSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Unique identification to unambiguously identify the recipient of the report message.";
			previousVersion_lazy = () -> ResendSearchCriteria1.mmRecipient;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public PartyIdentification100 getValue(ResendSearchCriteria2 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(ResendSearchCriteria2 obj, PartyIdentification100 value) {
			obj.setRecipient(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResendSearchCriteria2.mmBusinessDate, com.tools20022.repository.msg.ResendSearchCriteria2.mmSequenceNumber,
						com.tools20022.repository.msg.ResendSearchCriteria2.mmSequenceRange, com.tools20022.repository.msg.ResendSearchCriteria2.mmOriginalMessageNameIdentification,
						com.tools20022.repository.msg.ResendSearchCriteria2.mmFileReference, com.tools20022.repository.msg.ResendSearchCriteria2.mmRecipient);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResendRequestV01.mmResendSearchCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ResendSearchCriteria2";
				definition = "Defines the criteria to extract the message(s) which should be resent.";
				previousVersion_lazy = () -> ResendSearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getBusinessDate() {
		return businessDate == null ? Optional.empty() : Optional.of(businessDate);
	}

	public ResendSearchCriteria2 setBusinessDate(ISODate businessDate) {
		this.businessDate = businessDate;
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public ResendSearchCriteria2 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<SequenceRange1Choice> getSequenceRange() {
		return sequenceRange == null ? Optional.empty() : Optional.of(sequenceRange);
	}

	public ResendSearchCriteria2 setSequenceRange(SequenceRange1Choice sequenceRange) {
		this.sequenceRange = sequenceRange;
		return this;
	}

	public Optional<Max35Text> getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification == null ? Optional.empty() : Optional.of(originalMessageNameIdentification);
	}

	public ResendSearchCriteria2 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = originalMessageNameIdentification;
		return this;
	}

	public Optional<Max35Text> getFileReference() {
		return fileReference == null ? Optional.empty() : Optional.of(fileReference);
	}

	public ResendSearchCriteria2 setFileReference(Max35Text fileReference) {
		this.fileReference = fileReference;
		return this;
	}

	public PartyIdentification100 getRecipient() {
		return recipient;
	}

	public ResendSearchCriteria2 setRecipient(PartyIdentification100 recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}
}