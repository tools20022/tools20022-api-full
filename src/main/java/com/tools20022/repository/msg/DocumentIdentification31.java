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
import com.tools20022.repository.choice.ProcessingPosition7Choice;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#mmIdentification
 * DocumentIdentification31.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#mmLinkageType
 * DocumentIdentification31.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmCancelledInstructionIdentification
 * CorporateActionInstructionV06.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV06.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV07.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV07.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV07.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmNotificationIdentification
 * CorporateActionMovementConfirmationV07.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV07.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPreviousNotificationIdentification
 * CorporateActionNotificationV06.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV06.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV07.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPreviousNotificationIdentification
 * CorporateActionNotificationV07.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmNotificationIdentification
 * CorporateActionMovementConfirmationV08.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV08.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV07.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV08.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV08.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV08.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV08.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmCancelledInstructionIdentification
 * CorporateActionInstructionV07.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV07.mmInstructionCancellationRequestIdentification}
 * </li>
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
 * "DocumentIdentification31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a document and type of link."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
 * DocumentIdentification15}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DocumentIdentification31", propOrder = {"identification", "linkageType"})
public class DocumentIdentification31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Identifies the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15#mmIdentification
	 * DocumentIdentification15.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DocumentIdentification31.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the document.";
			previousVersion_lazy = () -> DocumentIdentification15.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ProcessingPosition7Choice linkageType;
	/**
	 * Specifies when this document is to be processed relative to an other
	 * referred document.
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15#mmLinkageType
	 * DocumentIdentification15.mmLinkageType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification31.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this document is to be processed relative to an other referred document.";
			previousVersion_lazy = () -> DocumentIdentification15.mmLinkageType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition7Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentIdentification31.mmIdentification, DocumentIdentification31.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmMovementPreliminaryAdviceIdentification, CorporateActionInstructionV06.mmCancelledInstructionIdentification,
						CorporateActionInstructionV06.mmInstructionCancellationRequestIdentification, CorporateActionMovementPreliminaryAdviceV07.mmPreviousMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceV07.mmNotificationIdentification, CorporateActionMovementPreliminaryAdviceV07.mmMovementConfirmationIdentification,
						CorporateActionMovementConfirmationV07.mmNotificationIdentification, CorporateActionMovementConfirmationV07.mmMovementPreliminaryAdviceIdentification,
						CorporateActionNotificationV06.mmPreviousNotificationIdentification, CorporateActionInstructionCancellationRequestV06.mmInstructionIdentification,
						CorporateActionMovementReversalAdviceV07.mmMovementConfirmationIdentification, CorporateActionNotificationV07.mmPreviousNotificationIdentification,
						CorporateActionMovementConfirmationV08.mmNotificationIdentification, CorporateActionMovementConfirmationV08.mmMovementPreliminaryAdviceIdentification,
						CorporateActionInstructionCancellationRequestV07.mmInstructionIdentification, CorporateActionMovementPreliminaryAdviceV08.mmPreviousMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceV08.mmNotificationIdentification, CorporateActionMovementPreliminaryAdviceV08.mmMovementConfirmationIdentification,
						CorporateActionMovementReversalAdviceV08.mmMovementConfirmationIdentification, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmMovementPreliminaryAdviceIdentification,
						CorporateActionInstructionV07.mmCancelledInstructionIdentification, CorporateActionInstructionV07.mmInstructionCancellationRequestIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification31";
				definition = "Identification of a document and type of link.";
				previousVersion_lazy = () -> DocumentIdentification15.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "LkgTp")
	public ProcessingPosition7Choice getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(ProcessingPosition7Choice linkageType) {
		this.linkageType = linkageType;
	}
}