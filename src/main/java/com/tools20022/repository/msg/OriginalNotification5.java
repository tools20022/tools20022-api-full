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
import com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV03;
import com.tools20022.repository.codeset.NotificationStatus3Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalNotificationReference3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the original notification and to provide the status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmOriginalMessageIdentification
 * OriginalNotification5.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmOriginalCreationDateTime
 * OriginalNotification5.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmOriginalNotificationIdentification
 * OriginalNotification5.mmOriginalNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmNotificationStatus
 * OriginalNotification5.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmAdditionalStatusInformation
 * OriginalNotification5.mmAdditionalStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmOriginalNotificationReference
 * OriginalNotification5.mmOriginalNotificationReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV03#mmOriginalNotificationAndStatus
 * NotificationToReceiveStatusReportV03.mmOriginalNotificationAndStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalNotification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the original notification and to provide the status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification7
 * OriginalNotification7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalNotification5", propOrder = {"originalMessageIdentification", "originalCreationDateTime", "originalNotificationIdentification", "notificationStatus", "additionalStatusInformation", "originalNotificationReference"})
public class OriginalNotification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected Max35Text originalMessageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5
	 * OriginalNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original sender, to unambiguously identify the original notification to receive message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmOriginalMessageIdentification
	 * OriginalNotification7.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification5, Max35Text> mmOriginalMessageIdentification = new MMMessageAttribute<OriginalNotification5, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original sender, to unambiguously identify the original notification to receive message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmOriginalMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalNotification5 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(OriginalNotification5 obj, Max35Text value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlCreDtTm")
	protected ISODateTime originalCreationDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5
	 * OriginalNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the original message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmOriginalCreationDateTime
	 * OriginalNotification7.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification5, Optional<ISODateTime>> mmOriginalCreationDateTime = new MMMessageAttribute<OriginalNotification5, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmOriginalCreationDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(OriginalNotification5 obj) {
			return obj.getOriginalCreationDateTime();
		}

		@Override
		public void setValue(OriginalNotification5 obj, Optional<ISODateTime> value) {
			obj.setOriginalCreationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlNtfctnId", required = true)
	protected Max35Text originalNotificationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5
	 * OriginalNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the original notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmOriginalNotificationIdentification
	 * OriginalNotification7.mmOriginalNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification5, Max35Text> mmOriginalNotificationIdentification = new MMMessageAttribute<OriginalNotification5, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotificationIdentification";
			definition = "Identification of the original notification.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmOriginalNotificationIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalNotification5 obj) {
			return obj.getOriginalNotificationIdentification();
		}

		@Override
		public void setValue(OriginalNotification5 obj, Max35Text value) {
			obj.setOriginalNotificationIdentification(value);
		}
	};
	@XmlElement(name = "NtfctnSts")
	protected NotificationStatus3Code notificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
	 * NotificationStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmNotificationStatus
	 * PaymentStatus.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5
	 * OriginalNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the notification in a coded form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmNotificationStatus
	 * OriginalNotification7.mmNotificationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification5, Optional<NotificationStatus3Code>> mmNotificationStatus = new MMMessageAttribute<OriginalNotification5, Optional<NotificationStatus3Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmNotificationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification5.mmObject();
			isDerived = false;
			xmlTag = "NtfctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the notification in a coded form.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmNotificationStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NotificationStatus3Code.mmObject();
		}

		@Override
		public Optional<NotificationStatus3Code> getValue(OriginalNotification5 obj) {
			return obj.getNotificationStatus();
		}

		@Override
		public void setValue(OriginalNotification5 obj, Optional<NotificationStatus3Code> value) {
			obj.setNotificationStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlStsInf")
	protected Max140Text additionalStatusInformation;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5
	 * OriginalNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlStsInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the notification status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmAdditionalStatusInformation
	 * OriginalNotification7.mmAdditionalStatusInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification5, Optional<Max140Text>> mmAdditionalStatusInformation = new MMMessageAttribute<OriginalNotification5, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification5.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusInformation";
			definition = "Further details of the notification status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmAdditionalStatusInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(OriginalNotification5 obj) {
			return obj.getAdditionalStatusInformation();
		}

		@Override
		public void setValue(OriginalNotification5 obj, Optional<Max140Text> value) {
			obj.setAdditionalStatusInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlNtfctnRef")
	protected List<OriginalNotificationReference3> originalNotificationReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3
	 * OriginalNotificationReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5
	 * OriginalNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctnRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotificationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the original notification item and provides the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmOriginalNotificationReference
	 * OriginalNotification7.mmOriginalNotificationReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotification5, List<OriginalNotificationReference3>> mmOriginalNotificationReference = new MMMessageAssociationEnd<OriginalNotification5, List<OriginalNotificationReference3>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNtfctnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotificationReference";
			definition = "Identifies the original notification item and provides the status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmOriginalNotificationReference);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalNotificationReference3.mmObject();
		}

		@Override
		public List<OriginalNotificationReference3> getValue(OriginalNotification5 obj) {
			return obj.getOriginalNotificationReference();
		}

		@Override
		public void setValue(OriginalNotification5 obj, List<OriginalNotificationReference3> value) {
			obj.setOriginalNotificationReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotification5.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalNotification5.mmOriginalCreationDateTime,
						com.tools20022.repository.msg.OriginalNotification5.mmOriginalNotificationIdentification, com.tools20022.repository.msg.OriginalNotification5.mmNotificationStatus,
						com.tools20022.repository.msg.OriginalNotification5.mmAdditionalStatusInformation, com.tools20022.repository.msg.OriginalNotification5.mmOriginalNotificationReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(NotificationToReceiveStatusReportV03.mmOriginalNotificationAndStatus);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalNotification5";
				definition = "Identifies the original notification and to provide the status.";
				nextVersions_lazy = () -> Arrays.asList(OriginalNotification7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public OriginalNotification5 setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Optional<ISODateTime> getOriginalCreationDateTime() {
		return originalCreationDateTime == null ? Optional.empty() : Optional.of(originalCreationDateTime);
	}

	public OriginalNotification5 setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
		return this;
	}

	public Max35Text getOriginalNotificationIdentification() {
		return originalNotificationIdentification;
	}

	public OriginalNotification5 setOriginalNotificationIdentification(Max35Text originalNotificationIdentification) {
		this.originalNotificationIdentification = Objects.requireNonNull(originalNotificationIdentification);
		return this;
	}

	public Optional<NotificationStatus3Code> getNotificationStatus() {
		return notificationStatus == null ? Optional.empty() : Optional.of(notificationStatus);
	}

	public OriginalNotification5 setNotificationStatus(NotificationStatus3Code notificationStatus) {
		this.notificationStatus = notificationStatus;
		return this;
	}

	public Optional<Max140Text> getAdditionalStatusInformation() {
		return additionalStatusInformation == null ? Optional.empty() : Optional.of(additionalStatusInformation);
	}

	public OriginalNotification5 setAdditionalStatusInformation(Max140Text additionalStatusInformation) {
		this.additionalStatusInformation = additionalStatusInformation;
		return this;
	}

	public List<OriginalNotificationReference3> getOriginalNotificationReference() {
		return originalNotificationReference == null ? originalNotificationReference = new ArrayList<>() : originalNotificationReference;
	}

	public OriginalNotification5 setOriginalNotificationReference(List<OriginalNotificationReference3> originalNotificationReference) {
		this.originalNotificationReference = Objects.requireNonNull(originalNotificationReference);
		return this;
	}
}