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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.ProcessingPosition10Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a document and type of link.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37#mmIdentification
 * DocumentIdentification37.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37#mmLinkageType
 * DocumentIdentification37.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V07#mmCancelledInstructionIdentification
 * CorporateActionInstruction002V07.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V07#mmInstructionCancellationRequestIdentification
 * CorporateActionInstruction002V07.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdvice002V08.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdvice002V08.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdvice002V08.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdvice002V08.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequest002V07#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequest002V07.
 * mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmPreviousNotificationIdentification
 * CorporateActionNotification002V07.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#mmNotificationIdentification
 * CorporateActionMovementConfirmation002V08.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmation002V08.
 * mmMovementPreliminaryAdviceIdentification}</li>
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
 * "DocumentIdentification37"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a document and type of link."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DocumentIdentification37", propOrder = {"identification", "linkageType"})
public class DocumentIdentification37 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax16Text identification;
	/**
	 * Identifies the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DocumentIdentification37.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected ProcessingPosition10Choice linkageType;
	/**
	 * Specifies when this document is to be processed relative to an other
	 * referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition10Choice
	 * ProcessingPosition10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
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
	 * "Specifies when this document is to be processed relative to an other referred document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification37.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this document is to be processed relative to an other referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition10Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentIdentification37.mmIdentification, DocumentIdentification37.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstruction002V07.mmCancelledInstructionIdentification, CorporateActionInstruction002V07.mmInstructionCancellationRequestIdentification,
						CorporateActionMovementPreliminaryAdvice002V08.mmPreviousMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdvice002V08.mmNotificationIdentification,
						CorporateActionMovementPreliminaryAdvice002V08.mmMovementConfirmationIdentification, CorporateActionMovementReversalAdvice002V08.mmMovementConfirmationIdentification,
						CorporateActionInstructionCancellationRequest002V07.mmInstructionIdentification, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmMovementPreliminaryAdviceIdentification,
						CorporateActionNotification002V07.mmPreviousNotificationIdentification, CorporateActionMovementConfirmation002V08.mmNotificationIdentification,
						CorporateActionMovementConfirmation002V08.mmMovementPreliminaryAdviceIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification37";
				definition = "Identification of a document and type of link.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public RestrictedFINXMax16Text getIdentification() {
		return identification;
	}

	public void setIdentification(RestrictedFINXMax16Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "LkgTp")
	public ProcessingPosition10Choice getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(ProcessingPosition10Choice linkageType) {
		this.linkageType = linkageType;
	}
}