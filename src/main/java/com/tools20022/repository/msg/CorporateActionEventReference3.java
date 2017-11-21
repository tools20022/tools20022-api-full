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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.CorporateActionEventReference3Choice;
import com.tools20022.repository.choice.ProcessingPosition7Choice;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a linked corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmEventIdentification
 * CorporateActionEventReference3.mmEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmLinkageType
 * CorporateActionEventReference3.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
 * CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmEventsLinkage
 * CorporateActionInstructionV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmEventsLinkage
 * CorporateActionMovementConfirmationV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmEventsLinkage
 * CorporateActionNotificationV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmEventsLinkage
 * CorporateActionNotificationV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmEventsLinkage
 * CorporateActionMovementConfirmationV08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmEventsLinkage
 * CorporateActionInstructionV07.mmEventsLinkage}</li>
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
 * "CorporateActionEventReference3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a linked corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
 * CorporateActionEventReference1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionEventReference3", propOrder = {"eventIdentification", "linkageType"})
public class CorporateActionEventReference3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEventReference3Choice eventIdentification;
	/**
	 * Identification of the linked corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice
	 * CorporateActionEventReference3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
	 * CorporateActionEventReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the linked corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmEventIdentification
	 * CorporateActionEventReference1.mmEventIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> CorporateActionEventReference3.mmObject();
			isDerived = false;
			xmlTag = "EvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIdentification";
			definition = "Identification of the linked corporate action event.";
			previousVersion_lazy = () -> CorporateActionEventReference1.mmEventIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventReference3Choice.mmObject();
		}
	};
	protected ProcessingPosition7Choice linkageType;
	/**
	 * Specifies when this corporate action event is to be processed relative to
	 * a linked corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition7Choice
	 * ProcessingPosition7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
	 * CorporateActionEventReference3}</li>
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
	 * "Specifies when this corporate action event is to be processed relative to a linked corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmLinkageType
	 * CorporateActionEventReference1.mmLinkageType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionEventReference3.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this corporate action event is to be processed relative to a linked corporate action event.";
			previousVersion_lazy = () -> CorporateActionEventReference1.mmLinkageType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition7Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmEventIdentification, CorporateActionEventReference3.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionV06.mmEventsLinkage, CorporateActionMovementPreliminaryAdviceV07.mmEventsLinkage, CorporateActionMovementConfirmationV07.mmEventsLinkage,
						CorporateActionNotificationV06.mmEventsLinkage, CorporateActionMovementReversalAdviceV07.mmEventsLinkage, CorporateActionNotificationV07.mmEventsLinkage, CorporateActionMovementConfirmationV08.mmEventsLinkage,
						CorporateActionMovementPreliminaryAdviceV08.mmEventsLinkage, CorporateActionMovementReversalAdviceV08.mmEventsLinkage, CorporateActionInstructionV07.mmEventsLinkage);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventReference3";
				definition = "Identification of a linked corporate action event.";
				previousVersion_lazy = () -> CorporateActionEventReference1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EvtId", required = true)
	public CorporateActionEventReference3Choice getEventIdentification() {
		return eventIdentification;
	}

	public void setEventIdentification(CorporateActionEventReference3Choice eventIdentification) {
		this.eventIdentification = eventIdentification;
	}

	@XmlElement(name = "LkgTp")
	public ProcessingPosition7Choice getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(ProcessingPosition7Choice linkageType) {
		this.linkageType = linkageType;
	}
}