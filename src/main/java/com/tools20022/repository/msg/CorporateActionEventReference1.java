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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.CorporateActionEventReference1Choice;
import com.tools20022.repository.choice.ProcessingPosition1Choice;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
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
 * Identification of a linked corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmEventIdentification
 * CorporateActionEventReference1.mmEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmLinkageType
 * CorporateActionEventReference1.mmLinkageType}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmEventsLinkage
 * CorporateActionInstructionV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#mmEventsLinkage
 * CorporateActionInstructionV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#mmEventsLinkage
 * CorporateActionInstructionV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#mmEventsLinkage
 * CorporateActionInstructionV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmEventsLinkage
 * CorporateActionMovementConfirmationV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmEventsLinkage
 * CorporateActionMovementConfirmationV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmEventsLinkage
 * CorporateActionMovementConfirmationV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmEventsLinkage
 * CorporateActionMovementConfirmationV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmEventsLinkage
 * CorporateActionNotificationV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmEventsLinkage
 * CorporateActionNotificationV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmEventsLinkage
 * CorporateActionNotificationV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmEventsLinkage
 * CorporateActionNotificationV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmEventsLinkage
 * CorporateActionMovementConfirmationV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmEventsLinkage
 * CorporateActionNotificationV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#mmEventsLinkage
 * CorporateActionInstructionV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#mmEventsLinkage
 * CorporateActionMovementConfirmationV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV06.mmEventsLinkage}</li>
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
 * "CorporateActionEventReference1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a linked corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
 * CorporateActionEventReference3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventReference1", propOrder = {"eventIdentification", "linkageType"})
public class CorporateActionEventReference1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EvtId", required = true)
	protected CorporateActionEventReference1Choice eventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice
	 * CorporateActionEventReference1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the linked corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmEventIdentification
	 * CorporateActionEventReference3.mmEventIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventReference1, CorporateActionEventReference1Choice> mmEventIdentification = new MMMessageAssociationEnd<CorporateActionEventReference1, CorporateActionEventReference1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReference1.mmObject();
			isDerived = false;
			xmlTag = "EvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIdentification";
			definition = "Identification of the linked corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmEventIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventReference1Choice.mmObject();
		}

		@Override
		public CorporateActionEventReference1Choice getValue(CorporateActionEventReference1 obj) {
			return obj.getEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventReference1 obj, CorporateActionEventReference1Choice value) {
			obj.setEventIdentification(value);
		}
	};
	@XmlElement(name = "LkgTp")
	protected ProcessingPosition1Choice linkageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition1Choice
	 * ProcessingPosition1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LINK</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmLinkageType
	 * CorporateActionEventReference3.mmLinkageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventReference1, Optional<ProcessingPosition1Choice>> mmLinkageType = new MMMessageAssociationEnd<CorporateActionEventReference1, Optional<ProcessingPosition1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReference1.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this corporate action event is to be processed relative to a linked corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmLinkageType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition1Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition1Choice> getValue(CorporateActionEventReference1 obj) {
			return obj.getLinkageType();
		}

		@Override
		public void setValue(CorporateActionEventReference1 obj, Optional<ProcessingPosition1Choice> value) {
			obj.setLinkageType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference1.mmEventIdentification, com.tools20022.repository.msg.CorporateActionEventReference1.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionV01.mmEventsLinkage, CorporateActionInstructionV02.mmEventsLinkage, CorporateActionInstructionV03.mmEventsLinkage,
						CorporateActionInstructionV04.mmEventsLinkage, CorporateActionMovementConfirmationV01.mmEventsLinkage, CorporateActionMovementConfirmationV02.mmEventsLinkage, CorporateActionMovementConfirmationV03.mmEventsLinkage,
						CorporateActionMovementConfirmationV04.mmEventsLinkage, CorporateActionMovementPreliminaryAdviceV01.mmEventsLinkage, CorporateActionMovementPreliminaryAdviceV02.mmEventsLinkage,
						CorporateActionMovementPreliminaryAdviceV03.mmEventsLinkage, CorporateActionMovementPreliminaryAdviceV04.mmEventsLinkage, CorporateActionMovementReversalAdviceV01.mmEventsLinkage,
						CorporateActionMovementReversalAdviceV02.mmEventsLinkage, CorporateActionMovementReversalAdviceV03.mmEventsLinkage, CorporateActionMovementReversalAdviceV04.mmEventsLinkage,
						CorporateActionNotificationV01.mmEventsLinkage, CorporateActionNotificationV02.mmEventsLinkage, CorporateActionNotificationV03.mmEventsLinkage, CorporateActionNotificationV04.mmEventsLinkage,
						CorporateActionMovementConfirmationV05.mmEventsLinkage, CorporateActionNotificationV05.mmEventsLinkage, CorporateActionMovementPreliminaryAdviceV05.mmEventsLinkage, CorporateActionInstructionV05.mmEventsLinkage,
						CorporateActionMovementReversalAdviceV05.mmEventsLinkage, CorporateActionMovementConfirmationV06.mmEventsLinkage, CorporateActionMovementPreliminaryAdviceV06.mmEventsLinkage,
						CorporateActionMovementReversalAdviceV06.mmEventsLinkage);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventReference1";
				definition = "Identification of a linked corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventReference1Choice getEventIdentification() {
		return eventIdentification;
	}

	public CorporateActionEventReference1 setEventIdentification(CorporateActionEventReference1Choice eventIdentification) {
		this.eventIdentification = Objects.requireNonNull(eventIdentification);
		return this;
	}

	public Optional<ProcessingPosition1Choice> getLinkageType() {
		return linkageType == null ? Optional.empty() : Optional.of(linkageType);
	}

	public CorporateActionEventReference1 setLinkageType(ProcessingPosition1Choice linkageType) {
		this.linkageType = linkageType;
		return this;
	}
}