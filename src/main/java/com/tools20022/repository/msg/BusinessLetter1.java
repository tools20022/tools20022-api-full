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
import com.tools20022.repository.codeset.Priority3Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Defines a business letter containing identifications of involved entities and
 * their roles, references to documents, free form text and signatures.<br>
 * The semantics of this information are defined by usual business practices for
 * the exchange and tracing of business letters. The described references and
 * party identifiers permit to establish a linked informal trace of sequences of
 * letters.<br>
 * This message component contains three types of elements that can be
 * referenced using IDREF:<br>
 * (1) - all elements defining qualified parties,<br>
 * (2) - all elements defining qualified documents or references to them,<br>
 * (3) - the LegalContext element.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmApplicationContext
 * BusinessLetter1.mmApplicationContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmLetterIdentifier
 * BusinessLetter1.mmLetterIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmDate
 * BusinessLetter1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmRelatedLetter
 * BusinessLetter1.mmRelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmRelatedMessage
 * BusinessLetter1.mmRelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmContentIdentifier
 * BusinessLetter1.mmContentIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmInstructionPriority
 * BusinessLetter1.mmInstructionPriority}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmOriginator
 * BusinessLetter1.mmOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmPrimaryRecipient
 * BusinessLetter1.mmPrimaryRecipient}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmSender
 * BusinessLetter1.mmSender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmAuthorisationUser
 * BusinessLetter1.mmAuthorisationUser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmResponseRecipient
 * BusinessLetter1.mmResponseRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmCopyRecipient
 * BusinessLetter1.mmCopyRecipient}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmOtherParty
 * BusinessLetter1.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmAssociatedDocument
 * BusinessLetter1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmGoverningContract
 * BusinessLetter1.mmGoverningContract}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmLegalContext
 * BusinessLetter1.mmLegalContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmAdditionalInformation
 * BusinessLetter1.mmAdditionalInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmNotice
 * BusinessLetter1.mmNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmValidationStatusInformation
 * BusinessLetter1.mmValidationStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmDigitalSignature
 * BusinessLetter1.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01#mmHeader
 * InvoicePaymentReconciliationAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01#mmHeader
 * InvoiceAssignmentRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmHeader
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmHeader
 * PartyEventAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmHeader
 * PartyRegistrationAndGuaranteeStatusV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmHeader
 * PartyRegistrationAndGuaranteeNotificationV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01#mmHeader
 * InvoiceAssignmentNotificationV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmHeader
 * InvoiceAssignmentAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmHeader
 * InvoiceAssignmentStatusV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01#mmHeader
 * PartyRegistrationAndGuaranteeRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmHeader
 * InvoicePaymentReconciliationStatusV01.mmHeader}</li>
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
 * "BusinessLetter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines a business letter containing identifications of involved entities and their roles, references to documents, free form text and signatures.\r\nThe semantics of this information are defined by usual business practices for the exchange and tracing of business letters. The described references and party identifiers permit to establish a linked informal trace of sequences of letters.\r\nThis message component contains three types of elements that can be referenced using IDREF:\r\n(1) - all elements defining qualified parties,\r\n(2) - all elements defining qualified documents or references to them,\r\n(3) - the LegalContext element."
 * </li>
 * </ul>
 */
public class BusinessLetter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text applicationContext;
	/**
	 * Application context defined by users. This is typically the name of a
	 * product.
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
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application context defined by users. This is typically the name of a product."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationContext = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "ApplCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationContext";
			definition = "Application context defined by users. This is typically the name of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected QualifiedDocumentInformation1 letterIdentifier;
	/**
	 * Unambiguous identifier for this letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identifier for this letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLetterIdentifier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "LttrIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIdentifier";
			definition = "Unambiguous identifier for this letter.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Purported creation date of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purported creation date of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Purported creation date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedLetter;
	/**
	 * Identifier of a related letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdLttr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLetter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a related letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedLetter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "RltdLttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedLetter";
			definition = "Identifier of a related letter.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedMessage;
	/**
	 * Identifier of a related message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a related message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedMessage = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "RltdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessage";
			definition = "Identifier of a related message.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<Max35Text> contentIdentifier;
	/**
	 * Cross references the lists that are associated to this letter inside a
	 * message. The identifiers are relative to the Originator.
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
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross references the lists that are associated to this letter inside a message. The identifiers are relative to the Originator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "CnttIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentIdentifier";
			definition = "Cross references the lists that are associated to this letter inside a message. The identifiers are relative to the Originator.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Priority3Code instructionPriority;
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the business letter to apply to the processing of the
	 * letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority3Code
	 * Priority3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the business letter to apply to the processing of the letter."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionPriority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Urgency or order of importance that the originator would like the recipient of the business letter to apply to the processing of the letter.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority3Code.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 originator;
	/**
	 * Identification of the originating party of this letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Originator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the originating party of this letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "Orgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Originator";
			definition = "Identification of the originating party of this letter.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyIdentification1> primaryRecipient;
	/**
	 * Primary recipient of the business letter. The exact meaning is given by
	 * the users.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary recipient of the business letter. The exact meaning is given by the users."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryRecipient = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "PmryRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryRecipient";
			definition = "Primary recipient of the business letter. The exact meaning is given by the users.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyIdentification1> sender;
	/**
	 * Sender of the business letter. The exact meaning is given by the users.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sender of the business letter. The exact meaning is given by the users."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSender = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Sender of the business letter. The exact meaning is given by the users.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyIdentification1> authorisationUser;
	/**
	 * User who, either individually or in concert with others, authorises the
	 * origination of a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnUsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationUser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User who, either individually or in concert with others, authorises the origination of a message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationUser = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "AuthstnUsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationUser";
			definition = "User who, either individually or in concert with others, authorises the origination of a message.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyIdentification1> responseRecipient;
	/**
	 * Party to receive a reply to this letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to receive a reply to this letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponseRecipient = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "RspnRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseRecipient";
			definition = "Party to receive a reply to this letter.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyIdentification1> copyRecipient;
	/**
	 * Party to receive a copy of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to receive a copy of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCopyRecipient = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "CpyRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyRecipient";
			definition = "Party to receive a copy of the message.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyIdentification1> otherParty;
	/**
	 * Other party involved. This element is usable as a target for IDREFs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other party involved. This element is usable as a target for IDREFs."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Other party involved. This element is usable as a target for IDREFs.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument;
	/**
	 * Associated free form document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Associated free form document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssociatedDocument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> governingContract;
	/**
	 * Governing contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAgreement
	 * Document.mmAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovngCtrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Governing contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGoverningContract = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmAgreement;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "GovngCtrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningContract";
			definition = "Governing contract.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GovernanceRules2> legalContext;
	/**
	 * Rules and laws governing the letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmGovernanceRules
	 * Jurisdiction.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules and laws governing the letter."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalContext = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Jurisdiction.mmGovernanceRules;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "LglCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalContext";
			definition = "Rules and laws governing the letter.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GovernanceRules2.mmObject();
		}
	};
	protected Max2000Text additionalInformation;
	/**
	 * Free form information about this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free form information about this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Free form information about this message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected Max350Text notice;
	/**
	 * Free form information unrelated to the message for example advertising or
	 * a service notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free form information unrelated to the message for example advertising or a service notice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "Ntce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notice";
			definition = "Free form information unrelated to the message for example advertising or a service notice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * Status of referenced messages or letters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnStsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of referenced messages or letters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidationStatusInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Status of referenced messages or letters.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1> digitalSignature;
	/**
	 * Digital signatures and signing parties of this letter or parts of it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1
	 * QualifiedPartyAndXMLSignature1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signatures and signing parties of this letter or parts of it."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDigitalSignature = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			componentContext_lazy = () -> BusinessLetter1.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signatures and signing parties of this letter or parts of it.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BusinessLetter1.mmApplicationContext, BusinessLetter1.mmLetterIdentifier, BusinessLetter1.mmDate, BusinessLetter1.mmRelatedLetter, BusinessLetter1.mmRelatedMessage,
						BusinessLetter1.mmContentIdentifier, BusinessLetter1.mmInstructionPriority, BusinessLetter1.mmOriginator, BusinessLetter1.mmPrimaryRecipient, BusinessLetter1.mmSender, BusinessLetter1.mmAuthorisationUser,
						BusinessLetter1.mmResponseRecipient, BusinessLetter1.mmCopyRecipient, BusinessLetter1.mmOtherParty, BusinessLetter1.mmAssociatedDocument, BusinessLetter1.mmGoverningContract, BusinessLetter1.mmLegalContext,
						BusinessLetter1.mmAdditionalInformation, BusinessLetter1.mmNotice, BusinessLetter1.mmValidationStatusInformation, BusinessLetter1.mmDigitalSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoicePaymentReconciliationAdviceV01.mmHeader, InvoiceAssignmentRequestV01.mmHeader, PartyRegistrationAndGuaranteeAcknowledgementV01.mmHeader, PartyEventAdviceV01.mmHeader,
						PartyRegistrationAndGuaranteeStatusV01.mmHeader, PartyRegistrationAndGuaranteeNotificationV01.mmHeader, InvoiceAssignmentNotificationV01.mmHeader, InvoiceAssignmentAcknowledgementV01.mmHeader,
						InvoiceAssignmentStatusV01.mmHeader, PartyRegistrationAndGuaranteeRequestV01.mmHeader, InvoicePaymentReconciliationStatusV01.mmHeader);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessLetter1";
				definition = "Defines a business letter containing identifications of involved entities and their roles, references to documents, free form text and signatures.\r\nThe semantics of this information are defined by usual business practices for the exchange and tracing of business letters. The described references and party identifiers permit to establish a linked informal trace of sequences of letters.\r\nThis message component contains three types of elements that can be referenced using IDREF:\r\n(1) - all elements defining qualified parties,\r\n(2) - all elements defining qualified documents or references to them,\r\n(3) - the LegalContext element.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(Max35Text applicationContext) {
		this.applicationContext = applicationContext;
	}

	public QualifiedDocumentInformation1 getLetterIdentifier() {
		return letterIdentifier;
	}

	public void setLetterIdentifier(com.tools20022.repository.msg.QualifiedDocumentInformation1 letterIdentifier) {
		this.letterIdentifier = letterIdentifier;
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public List<QualifiedDocumentInformation1> getRelatedLetter() {
		return relatedLetter;
	}

	public void setRelatedLetter(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedLetter) {
		this.relatedLetter = relatedLetter;
	}

	public List<QualifiedDocumentInformation1> getRelatedMessage() {
		return relatedMessage;
	}

	public void setRelatedMessage(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedMessage) {
		this.relatedMessage = relatedMessage;
	}

	public List<Max35Text> getContentIdentifier() {
		return contentIdentifier;
	}

	public void setContentIdentifier(List<Max35Text> contentIdentifier) {
		this.contentIdentifier = contentIdentifier;
	}

	public Priority3Code getInstructionPriority() {
		return instructionPriority;
	}

	public void setInstructionPriority(Priority3Code instructionPriority) {
		this.instructionPriority = instructionPriority;
	}

	public QualifiedPartyIdentification1 getOriginator() {
		return originator;
	}

	public void setOriginator(com.tools20022.repository.msg.QualifiedPartyIdentification1 originator) {
		this.originator = originator;
	}

	public List<QualifiedPartyIdentification1> getPrimaryRecipient() {
		return primaryRecipient;
	}

	public void setPrimaryRecipient(List<com.tools20022.repository.msg.QualifiedPartyIdentification1> primaryRecipient) {
		this.primaryRecipient = primaryRecipient;
	}

	public List<QualifiedPartyIdentification1> getSender() {
		return sender;
	}

	public void setSender(List<com.tools20022.repository.msg.QualifiedPartyIdentification1> sender) {
		this.sender = sender;
	}

	public List<QualifiedPartyIdentification1> getAuthorisationUser() {
		return authorisationUser;
	}

	public void setAuthorisationUser(List<com.tools20022.repository.msg.QualifiedPartyIdentification1> authorisationUser) {
		this.authorisationUser = authorisationUser;
	}

	public List<QualifiedPartyIdentification1> getResponseRecipient() {
		return responseRecipient;
	}

	public void setResponseRecipient(List<com.tools20022.repository.msg.QualifiedPartyIdentification1> responseRecipient) {
		this.responseRecipient = responseRecipient;
	}

	public List<QualifiedPartyIdentification1> getCopyRecipient() {
		return copyRecipient;
	}

	public void setCopyRecipient(List<com.tools20022.repository.msg.QualifiedPartyIdentification1> copyRecipient) {
		this.copyRecipient = copyRecipient;
	}

	public List<QualifiedPartyIdentification1> getOtherParty() {
		return otherParty;
	}

	public void setOtherParty(List<com.tools20022.repository.msg.QualifiedPartyIdentification1> otherParty) {
		this.otherParty = otherParty;
	}

	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument;
	}

	public void setAssociatedDocument(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = associatedDocument;
	}

	public List<QualifiedDocumentInformation1> getGoverningContract() {
		return governingContract;
	}

	public void setGoverningContract(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> governingContract) {
		this.governingContract = governingContract;
	}

	public List<GovernanceRules2> getLegalContext() {
		return legalContext;
	}

	public void setLegalContext(List<com.tools20022.repository.msg.GovernanceRules2> legalContext) {
		this.legalContext = legalContext;
	}

	public Max2000Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public Max350Text getNotice() {
		return notice;
	}

	public void setNotice(Max350Text notice) {
		this.notice = notice;
	}

	public ValidationStatusInformation1 getValidationStatusInformation() {
		return validationStatusInformation;
	}

	public void setValidationStatusInformation(com.tools20022.repository.msg.ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
	}

	public List<QualifiedPartyAndXMLSignature1> getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(List<com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1> digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
}