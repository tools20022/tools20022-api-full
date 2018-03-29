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
import com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01;
import com.tools20022.repository.codeset.CorporateActionNotificationType2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentIdentification8;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the cancellation of a notification advice or the withdrawal
 * of a CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationCancellation1#mmNotificationCancellationType
 * NotificationCancellation1.mmNotificationCancellationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationCancellation1#mmLinkedAgentCANotificationAdviceIdentification
 * NotificationCancellation1.mmLinkedAgentCANotificationAdviceIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmNotificationCancellationTypeAndLinkage
 * AgentCANotificationCancellationRequestV01.
 * mmNotificationCancellationTypeAndLinkage}</li>
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
 * "NotificationCancellation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the cancellation of a notification advice or the withdrawal of a CA event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationCancellation1", propOrder = {"notificationCancellationType", "linkedAgentCANotificationAdviceIdentification"})
public class NotificationCancellation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnCxlTp", required = true)
	protected CorporateActionNotificationType2Code notificationCancellationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType2Code
	 * CorporateActionNotificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationCancellation1
	 * NotificationCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnCxlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationCancellationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The function of the notification e.g. new notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationCancellation1, CorporateActionNotificationType2Code> mmNotificationCancellationType = new MMMessageAttribute<NotificationCancellation1, CorporateActionNotificationType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationCancellation1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnCxlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellationType";
			definition = "The function of the notification e.g. new notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationType2Code.mmObject();
		}

		@Override
		public CorporateActionNotificationType2Code getValue(NotificationCancellation1 obj) {
			return obj.getNotificationCancellationType();
		}

		@Override
		public void setValue(NotificationCancellation1 obj, CorporateActionNotificationType2Code value) {
			obj.setNotificationCancellationType(value);
		}
	};
	@XmlElement(name = "LkdAgtCANtfctnAdvcId", required = true)
	protected DocumentIdentification8 linkedAgentCANotificationAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationCancellation1
	 * NotificationCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdAgtCANtfctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedAgentCANotificationAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The identification of the linked notification advice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationCancellation1, DocumentIdentification8> mmLinkedAgentCANotificationAdviceIdentification = new MMMessageAttribute<NotificationCancellation1, DocumentIdentification8>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationCancellation1.mmObject();
			isDerived = false;
			xmlTag = "LkdAgtCANtfctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedAgentCANotificationAdviceIdentification";
			definition = "The identification of the linked notification advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(NotificationCancellation1 obj) {
			return obj.getLinkedAgentCANotificationAdviceIdentification();
		}

		@Override
		public void setValue(NotificationCancellation1 obj, DocumentIdentification8 value) {
			obj.setLinkedAgentCANotificationAdviceIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationCancellation1.mmNotificationCancellationType,
						com.tools20022.repository.msg.NotificationCancellation1.mmLinkedAgentCANotificationAdviceIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationCancellationRequestV01.mmNotificationCancellationTypeAndLinkage);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationCancellation1";
				definition = "Information about the cancellation of a notification advice or the withdrawal of a CA event.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionNotificationType2Code getNotificationCancellationType() {
		return notificationCancellationType;
	}

	public NotificationCancellation1 setNotificationCancellationType(CorporateActionNotificationType2Code notificationCancellationType) {
		this.notificationCancellationType = Objects.requireNonNull(notificationCancellationType);
		return this;
	}

	public DocumentIdentification8 getLinkedAgentCANotificationAdviceIdentification() {
		return linkedAgentCANotificationAdviceIdentification;
	}

	public NotificationCancellation1 setLinkedAgentCANotificationAdviceIdentification(DocumentIdentification8 linkedAgentCANotificationAdviceIdentification) {
		this.linkedAgentCANotificationAdviceIdentification = Objects.requireNonNull(linkedAgentCANotificationAdviceIdentification);
		return this;
	}
}