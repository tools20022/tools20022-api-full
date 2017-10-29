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
import com.tools20022.repository.choice.CorporateActionEventReference1Choice;
import com.tools20022.repository.choice.ProcessingPosition1Choice;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#EventIdentification
 * CorporateActionEventReference1.EventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#LinkageType
 * CorporateActionEventReference1.LinkageType}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#EventsLinkage
 * CorporateActionInstructionV01.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#EventsLinkage
 * CorporateActionInstructionV02.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#EventsLinkage
 * CorporateActionInstructionV03.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#EventsLinkage
 * CorporateActionInstructionV04.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#EventsLinkage
 * CorporateActionMovementConfirmationV01.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#EventsLinkage
 * CorporateActionMovementConfirmationV02.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#EventsLinkage
 * CorporateActionMovementConfirmationV03.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#EventsLinkage
 * CorporateActionMovementConfirmationV04.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#EventsLinkage
 * CorporateActionMovementPreliminaryAdviceV01.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#EventsLinkage
 * CorporateActionMovementPreliminaryAdviceV02.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#EventsLinkage
 * CorporateActionMovementPreliminaryAdviceV03.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#EventsLinkage
 * CorporateActionMovementPreliminaryAdviceV04.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#EventsLinkage
 * CorporateActionMovementReversalAdviceV01.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#EventsLinkage
 * CorporateActionMovementReversalAdviceV02.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#EventsLinkage
 * CorporateActionMovementReversalAdviceV03.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#EventsLinkage
 * CorporateActionMovementReversalAdviceV04.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#EventsLinkage
 * CorporateActionNotificationV01.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#EventsLinkage
 * CorporateActionNotificationV02.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#EventsLinkage
 * CorporateActionNotificationV03.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#EventsLinkage
 * CorporateActionNotificationV04.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#EventsLinkage
 * CorporateActionMovementConfirmationV05.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#EventsLinkage
 * CorporateActionNotificationV05.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#EventsLinkage
 * CorporateActionMovementPreliminaryAdviceV05.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#EventsLinkage
 * CorporateActionInstructionV05.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#EventsLinkage
 * CorporateActionMovementReversalAdviceV05.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#EventsLinkage
 * CorporateActionMovementConfirmationV06.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#EventsLinkage
 * CorporateActionMovementPreliminaryAdviceV06.EventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#EventsLinkage
 * CorporateActionMovementReversalAdviceV06.EventsLinkage}</li>
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
public class CorporateActionEventReference1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the linked corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice
	 * CorporateActionEventReference1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEventIdentification
	 * CorporateActionEventRegistration.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#EventIdentification
	 * CorporateActionEventReference3.EventIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EventIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionEventReference1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEventIdentification;
			isDerived = false;
			xmlTag = "EvtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIdentification";
			definition = "Identification of the linked corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference3.EventIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEventReference1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies when this corporate action event is to be processed relative to
	 * a linked corporate action event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#LinkageType
	 * CorporateActionEventReference3.LinkageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionEventReference1.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this corporate action event is to be processed relative to a linked corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference3.LinkageType);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProcessingPosition1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference1.EventIdentification, com.tools20022.repository.msg.CorporateActionEventReference1.LinkageType);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionV01.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV02.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionInstructionV03.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV04.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV02.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionNotificationV03.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV04.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV05.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV05.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06.EventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.EventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06.EventsLinkage);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventReference1";
				definition = "Identification of a linked corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}