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
import com.tools20022.repository.datatype.ID;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.other.StrictPayload;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines an encapsulated form of an ISO 20022 message and, if present, its
 * associated Business Application Header. The encapsulation guarantees
 * uniqueness of ID/IDREFs though the use of the Prefix element. This element
 * can be added during message preparation to ID/IDREFs. In order to verify the
 * signature in the Hdr element or inside the encapsulated message, for each
 * occurrence of an ID orIDREF that possesses the same value as a prefix, the
 * prefix part is removed before signature verification. This is not done for
 * surrounding signatures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#Header
 * EncapsulatedBusinessMessage1.Header}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#Prefix
 * EncapsulatedBusinessMessage1.Prefix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#Partial
 * EncapsulatedBusinessMessage1.Partial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#Message
 * EncapsulatedBusinessMessage1.Message}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01#AttachedMessage
 * InvoicePaymentReconciliationAdviceV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01#AttachedMessage
 * InvoiceAssignmentRequestV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#AttachedMessage
 * PartyRegistrationAndGuaranteeAcknowledgementV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#AttachedMessage
 * PartyEventAdviceV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#AttachedMessage
 * PartyRegistrationAndGuaranteeStatusV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#AttachedMessage
 * PartyRegistrationAndGuaranteeNotificationV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01#AttachedMessage
 * InvoiceAssignmentNotificationV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#AttachedMessage
 * InvoiceAssignmentAcknowledgementV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#AttachedMessage
 * InvoiceAssignmentStatusV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01#AttachedMessage
 * PartyRegistrationAndGuaranteeRequestV01.AttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#AttachedMessage
 * InvoicePaymentReconciliationStatusV01.AttachedMessage}</li>
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
 * "EncapsulatedBusinessMessage1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines an encapsulated form of an ISO 20022 message and, if present, its associated Business Application Header. The encapsulation guarantees uniqueness of ID/IDREFs though the use of the Prefix element. This element can be added during message preparation to ID/IDREFs. In order to verify the signature in the Hdr element or inside the encapsulated message, for each occurrence of an ID orIDREF that possesses the same value as a prefix, the prefix part is removed before signature verification. This is not done for surrounding signatures."
 * </li>
 * </ul>
 */
public class EncapsulatedBusinessMessage1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * The Business Application Header associated to the encapsulated message if
	 * it exists.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Business Application Header associated to the encapsulated message if it exists."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Header = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
			businessComponentTrace_lazy = () -> Document.mmObject();
			isDerived = false;
			xmlTag = "Hdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "The Business Application Header associated to the encapsulated message if it exists.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BusinessApplicationHeader1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Prefix of ID/IDREFs in the encapsulated message to be removed before
	 * signature verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ID ID}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Prefix of ID/IDREFs in the encapsulated message to be removed before signature verification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Prefix = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
			isDerived = false;
			xmlTag = "Prfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefix";
			definition = "Prefix of ID/IDREFs in the encapsulated message to be removed before signature verification.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ID.mmObject();
		}
	};
	/**
	 * If yes, the Msg element contains only a subset of the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If yes, the Msg element contains only a subset of the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Partial = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
			isDerived = false;
			xmlTag = "Prtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			definition = "If yes, the Msg element contains only a subset of the original message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * The encapsulated ISO 20022 message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.other.StrictPayload
	 * StrictPayload}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Msg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Message"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The encapsulated ISO 20022 message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Message = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
			businessComponentTrace_lazy = () -> Document.mmObject();
			isDerived = false;
			xmlTag = "Msg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Message";
			definition = "The encapsulated ISO 20022 message.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> StrictPayload.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncapsulatedBusinessMessage1.Header, com.tools20022.repository.msg.EncapsulatedBusinessMessage1.Prefix,
						com.tools20022.repository.msg.EncapsulatedBusinessMessage1.Partial, com.tools20022.repository.msg.EncapsulatedBusinessMessage1.Message);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01.AttachedMessage, com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01.AttachedMessage,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.AttachedMessage, com.tools20022.repository.area.tsmt.PartyEventAdviceV01.AttachedMessage,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.AttachedMessage, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.AttachedMessage,
						com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01.AttachedMessage, com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.AttachedMessage,
						com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01.AttachedMessage, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01.AttachedMessage,
						com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.AttachedMessage);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EncapsulatedBusinessMessage1";
				definition = "Defines an encapsulated form of an ISO 20022 message and, if present, its associated Business Application Header. The encapsulation guarantees uniqueness of ID/IDREFs though the use of the Prefix element. This element can be added during message preparation to ID/IDREFs. In order to verify the signature in the Hdr element or inside the encapsulated message, for each occurrence of an ID orIDREF that possesses the same value as a prefix, the prefix part is removed before signature verification. This is not done for surrounding signatures.";
			}
		});
		return mmObject_lazy.get();
	}
}