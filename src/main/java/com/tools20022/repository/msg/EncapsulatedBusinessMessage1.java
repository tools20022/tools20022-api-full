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
import com.tools20022.repository.area.tsin.*;
import com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01;
import com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01;
import com.tools20022.repository.area.tsmt.PartyEventAdviceV01;
import com.tools20022.repository.datatype.ID;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.StrictPayload;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmHeader
 * EncapsulatedBusinessMessage1.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmPrefix
 * EncapsulatedBusinessMessage1.mmPrefix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmPartial
 * EncapsulatedBusinessMessage1.mmPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmMessage
 * EncapsulatedBusinessMessage1.mmMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01#mmAttachedMessage
 * InvoicePaymentReconciliationAdviceV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01#mmAttachedMessage
 * InvoiceAssignmentRequestV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmAttachedMessage
 * PartyEventAdviceV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeStatusV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeNotificationV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01#mmAttachedMessage
 * InvoiceAssignmentNotificationV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmAttachedMessage
 * InvoiceAssignmentAcknowledgementV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmAttachedMessage
 * InvoiceAssignmentStatusV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeRequestV01.mmAttachedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmAttachedMessage
 * InvoicePaymentReconciliationStatusV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNameSpaceRule#forEncapsulatedBusinessMessage1
 * ConstraintNameSpaceRule.forEncapsulatedBusinessMessage1}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EncapsulatedBusinessMessage1", propOrder = {"header", "prefix", "partial", "message"})
public class EncapsulatedBusinessMessage1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr")
	protected BusinessApplicationHeader1 header;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmHeader = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmObject();
			isDerived = false;
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "The Business Application Header associated to the encapsulated message if it exists.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BusinessApplicationHeader1.mmObject();
		}
	};
	@XmlElement(name = "Prfx")
	protected ID prefix;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmPrefix = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmObject();
			isDerived = false;
			xmlTag = "Prfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefix";
			definition = "Prefix of ID/IDREFs in the encapsulated message to be removed before signature verification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ID.mmObject();
		}
	};
	@XmlElement(name = "Prtl", required = true)
	protected YesNoIndicator partial;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmPartial = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmObject();
			isDerived = false;
			xmlTag = "Prtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			definition = "If yes, the Msg element contains only a subset of the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Msg", required = true)
	protected StrictPayload message;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmMessage = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmObject();
			isDerived = false;
			xmlTag = "Msg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Message";
			definition = "The encapsulated ISO 20022 message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StrictPayload.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmHeader, com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmPrefix,
						com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmPartial, com.tools20022.repository.msg.EncapsulatedBusinessMessage1.mmMessage);
				messageBuildingBlock_lazy = () -> Arrays
						.asList(InvoicePaymentReconciliationAdviceV01.mmAttachedMessage, InvoiceAssignmentRequestV01.mmAttachedMessage, PartyRegistrationAndGuaranteeAcknowledgementV01.mmAttachedMessage,
								PartyEventAdviceV01.mmAttachedMessage, PartyRegistrationAndGuaranteeStatusV01.mmAttachedMessage, PartyRegistrationAndGuaranteeNotificationV01.mmAttachedMessage,
								InvoiceAssignmentNotificationV01.mmAttachedMessage, InvoiceAssignmentAcknowledgementV01.mmAttachedMessage, InvoiceAssignmentStatusV01.mmAttachedMessage,
								PartyRegistrationAndGuaranteeRequestV01.mmAttachedMessage, InvoicePaymentReconciliationStatusV01.mmAttachedMessage);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNameSpaceRule.forEncapsulatedBusinessMessage1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EncapsulatedBusinessMessage1";
				definition = "Defines an encapsulated form of an ISO 20022 message and, if present, its associated Business Application Header. The encapsulation guarantees uniqueness of ID/IDREFs though the use of the Prefix element. This element can be added during message preparation to ID/IDREFs. In order to verify the signature in the Hdr element or inside the encapsulated message, for each occurrence of an ID orIDREF that possesses the same value as a prefix, the prefix part is removed before signature verification. This is not done for surrounding signatures.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BusinessApplicationHeader1> getHeader() {
		return header == null ? Optional.empty() : Optional.of(header);
	}

	public EncapsulatedBusinessMessage1 setHeader(com.tools20022.repository.msg.BusinessApplicationHeader1 header) {
		this.header = header;
		return this;
	}

	public Optional<ID> getPrefix() {
		return prefix == null ? Optional.empty() : Optional.of(prefix);
	}

	public EncapsulatedBusinessMessage1 setPrefix(ID prefix) {
		this.prefix = prefix;
		return this;
	}

	public YesNoIndicator getPartial() {
		return partial;
	}

	public EncapsulatedBusinessMessage1 setPartial(YesNoIndicator partial) {
		this.partial = Objects.requireNonNull(partial);
		return this;
	}

	public StrictPayload getMessage() {
		return message;
	}

	public EncapsulatedBusinessMessage1 setMessage(StrictPayload message) {
		this.message = Objects.requireNonNull(message);
		return this;
	}
}