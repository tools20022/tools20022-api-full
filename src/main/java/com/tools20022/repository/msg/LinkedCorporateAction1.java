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
import com.tools20022.repository.area.seev.AgentCANotificationAdviceV01;
import com.tools20022.repository.choice.ProcessingPosition2FormatChoice;
import com.tools20022.repository.codeset.CorporateActionNotificationType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies linkage information of a corporate action message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1#mmNotificationType
 * LinkedCorporateAction1.mmNotificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1#mmLinkedAgentCANotificationAdviceIdentification
 * LinkedCorporateAction1.mmLinkedAgentCANotificationAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1#mmLinkageType
 * LinkedCorporateAction1.mmLinkageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1#mmLinkedIssuerCorporateActionIdentification
 * LinkedCorporateAction1.mmLinkedIssuerCorporateActionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1#mmLinkedCorporateActionProcessingIdentification
 * LinkedCorporateAction1.mmLinkedCorporateActionProcessingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmNotificationTypeAndLinkage
 * AgentCANotificationAdviceV01.mmNotificationTypeAndLinkage}</li>
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
 * "LinkedCorporateAction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies linkage information of a corporate action message."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LinkedCorporateAction1", propOrder = {"notificationType", "linkedAgentCANotificationAdviceIdentification", "linkageType", "linkedIssuerCorporateActionIdentification", "linkedCorporateActionProcessingIdentification"})
public class LinkedCorporateAction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionNotificationType1Code notificationType;
	/**
	 * The function of the notification e.g. new notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code
	 * CorporateActionNotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1
	 * LinkedCorporateAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The function of the notification e.g. new notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LinkedCorporateAction1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationType";
			definition = "The function of the notification e.g. new notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationType1Code.mmObject();
		}
	};
	protected DocumentIdentification8 linkedAgentCANotificationAdviceIdentification;
	/**
	 * The identification of the linked notification advice.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1
	 * LinkedCorporateAction1}</li>
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
	public static final MMMessageAttribute mmLinkedAgentCANotificationAdviceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LinkedCorporateAction1.mmObject();
			isDerived = false;
			xmlTag = "LkdAgtCANtfctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedAgentCANotificationAdviceIdentification";
			definition = "The identification of the linked notification advice.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification8.mmObject();
		}
	};
	protected ProcessingPosition2FormatChoice linkageType;
	/**
	 * Specifies when the instruction is to be executed relative to a linked
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition2FormatChoice
	 * ProcessingPosition2FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1
	 * LinkedCorporateAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies when the instruction is to be executed relative to a linked instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkageType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LinkedCorporateAction1.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when the instruction is to be executed relative to a linked instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingPosition2FormatChoice.mmObject();
		}
	};
	protected Max35Text linkedIssuerCorporateActionIdentification;
	/**
	 * Reference given to the linked event by the CA event issuer (agent).
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
	 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1
	 * LinkedCorporateAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdIssrCorpActnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedIssuerCorporateActionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference given to the linked event by the CA event issuer (agent)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedIssuerCorporateActionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LinkedCorporateAction1.mmObject();
			isDerived = false;
			xmlTag = "LkdIssrCorpActnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedIssuerCorporateActionIdentification";
			definition = "Reference given to the linked event by the CA event issuer (agent).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text linkedCorporateActionProcessingIdentification;
	/**
	 * Reference assigned by the CSD to the linked coporate avent.
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
	 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1
	 * LinkedCorporateAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdCorpActnPrcgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedCorporateActionProcessingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the CSD to the linked coporate avent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedCorporateActionProcessingIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LinkedCorporateAction1.mmObject();
			isDerived = false;
			xmlTag = "LkdCorpActnPrcgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedCorporateActionProcessingIdentification";
			definition = "Reference assigned by the CSD to the linked coporate avent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LinkedCorporateAction1.mmNotificationType, LinkedCorporateAction1.mmLinkedAgentCANotificationAdviceIdentification, LinkedCorporateAction1.mmLinkageType,
						LinkedCorporateAction1.mmLinkedIssuerCorporateActionIdentification, LinkedCorporateAction1.mmLinkedCorporateActionProcessingIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmNotificationTypeAndLinkage);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LinkedCorporateAction1";
				definition = "Specifies linkage information of a corporate action message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NtfctnTp", required = true)
	public CorporateActionNotificationType1Code getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(CorporateActionNotificationType1Code notificationType) {
		this.notificationType = notificationType;
	}

	@XmlElement(name = "LkdAgtCANtfctnAdvcId")
	public DocumentIdentification8 getLinkedAgentCANotificationAdviceIdentification() {
		return linkedAgentCANotificationAdviceIdentification;
	}

	public void setLinkedAgentCANotificationAdviceIdentification(com.tools20022.repository.msg.DocumentIdentification8 linkedAgentCANotificationAdviceIdentification) {
		this.linkedAgentCANotificationAdviceIdentification = linkedAgentCANotificationAdviceIdentification;
	}

	@XmlElement(name = "LkgTp")
	public ProcessingPosition2FormatChoice getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(ProcessingPosition2FormatChoice linkageType) {
		this.linkageType = linkageType;
	}

	@XmlElement(name = "LkdIssrCorpActnId")
	public Max35Text getLinkedIssuerCorporateActionIdentification() {
		return linkedIssuerCorporateActionIdentification;
	}

	public void setLinkedIssuerCorporateActionIdentification(Max35Text linkedIssuerCorporateActionIdentification) {
		this.linkedIssuerCorporateActionIdentification = linkedIssuerCorporateActionIdentification;
	}

	@XmlElement(name = "LkdCorpActnPrcgId")
	public Max35Text getLinkedCorporateActionProcessingIdentification() {
		return linkedCorporateActionProcessingIdentification;
	}

	public void setLinkedCorporateActionProcessingIdentification(Max35Text linkedCorporateActionProcessingIdentification) {
		this.linkedCorporateActionProcessingIdentification = linkedCorporateActionProcessingIdentification;
	}
}