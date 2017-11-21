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
import com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01;
import com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a list of reconciliation information concerning financial items.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#mmDate
 * ReconciliationList1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmRelatedDocument
 * ReconciliationList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmRecipient
 * ReconciliationList1.mmRecipient}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#mmAdvisor
 * ReconciliationList1.mmAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmParameters
 * ReconciliationList1.mmParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentReference
 * ReconciliationList1.mmPaymentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentMeans
 * ReconciliationList1.mmPaymentMeans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentDate
 * ReconciliationList1.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentTerms
 * ReconciliationList1.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentAmount
 * ReconciliationList1.mmPaymentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#mmItem
 * ReconciliationList1.mmItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmItemCount
 * ReconciliationList1.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmControlSum
 * ReconciliationList1.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmAssociatedDocument
 * ReconciliationList1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmAdditionalInformation
 * ReconciliationList1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmValidationStatusInformation
 * ReconciliationList1.mmValidationStatusInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01#mmReconciliationList
 * InvoicePaymentReconciliationAdviceV01.mmReconciliationList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmReconciliationList
 * InvoicePaymentReconciliationStatusV01.mmReconciliationList}</li>
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
 * "ReconciliationList1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a list of reconciliation information concerning financial items."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ReconciliationList1", propOrder = {"date", "relatedDocument", "recipient", "advisor", "parameters", "paymentReference", "paymentMeans", "paymentDate", "paymentTerms", "paymentAmount", "item", "itemCount", "controlSum",
		"associatedDocument", "additionalInformation", "validationStatusInformation"})
public class ReconciliationList1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate date;
	/**
	 * Date of creation of this document.
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
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
	 * definition} = "Date of creation of this document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of creation of this document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedDocument;
	/**
	 * Reference to related documents for example to original assignment in a
	 * status response or retry.
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to related documents for example to original assignment in a status response or retry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedDocument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "RltdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDocument";
			definition = "Reference to related documents for example to original assignment in a status response or retry.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 recipient;
	/**
	 * Party to be advised.
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to be advised."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipient = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Party to be advised.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 advisor;
	/**
	 * Informing party.
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Advsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advisor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Informing party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdvisor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Advsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Advisor";
			definition = "Informing party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected FinancialItemParameters1 parameters;
	/**
	 * Identification parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Params"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Params";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Identification parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
		}
	};
	protected PaymentIdentification1 paymentReference;
	/**
	 * Reference to a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification1
	 * PaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Reference to a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentIdentification1.mmObject();
		}
	};
	protected PaymentMeans1 paymentMeans;
	/**
	 * Set of elements used to further specify the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentMeans1
	 * PaymentMeans1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPayment
	 * Invoice.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentMeans = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPayment;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtMeans";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMeans";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
		}
	};
	protected ISODate paymentDate;
	/**
	 * Effective date of payment.
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
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Effective date of payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Effective date of payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PaymentTerms6 paymentTerms;
	/**
	 * Terms of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms6
	 * PaymentTerms6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
	 * Document.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terms of the payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmPaymentObligation;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Terms of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTerms6.mmObject();
		}
	};
	protected CurrencyAndAmount paymentAmount;
	/**
	 * Amount of the referenced payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the referenced payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentAmount";
			definition = "Amount of the referenced payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialItem1> item;
	/**
	 * Financial item impacted by the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialItem1
	 * FinancialItem1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Itm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Item"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial item impacted by the payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmItem = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Itm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Item";
			definition = "Financial item impacted by the payment.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
		}
	};
	protected Max15NumericText itemCount;
	/**
	 * Number of individual items contained in the list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of individual items contained in the list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItemCount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Number of individual items contained in the list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected DecimalNumber controlSum;
	/**
	 * Total of all individual amounts included in the list, irrespective of
	 * currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the list, irrespective of currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the list, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
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
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected Max2000Text additionalInformation;
	/**
	 * Additional proprietary formal information concerning the list.
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
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
	 * definition} =
	 * "Additional proprietary formal information concerning the list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional proprietary formal information concerning the list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * Validation status of the list.
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
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
	 * definition} = "Validation status of the list."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidationStatusInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the list.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReconciliationList1.mmDate, ReconciliationList1.mmRelatedDocument, ReconciliationList1.mmRecipient, ReconciliationList1.mmAdvisor, ReconciliationList1.mmParameters,
						ReconciliationList1.mmPaymentReference, ReconciliationList1.mmPaymentMeans, ReconciliationList1.mmPaymentDate, ReconciliationList1.mmPaymentTerms, ReconciliationList1.mmPaymentAmount, ReconciliationList1.mmItem,
						ReconciliationList1.mmItemCount, ReconciliationList1.mmControlSum, ReconciliationList1.mmAssociatedDocument, ReconciliationList1.mmAdditionalInformation, ReconciliationList1.mmValidationStatusInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoicePaymentReconciliationAdviceV01.mmReconciliationList, InvoicePaymentReconciliationStatusV01.mmReconciliationList);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReconciliationList1";
				definition = "Specifies a list of reconciliation information concerning financial items.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Dt", required = true)
	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	@XmlElement(name = "RltdDoc")
	public List<QualifiedDocumentInformation1> getRelatedDocument() {
		return relatedDocument;
	}

	public void setRelatedDocument(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedDocument) {
		this.relatedDocument = relatedDocument;
	}

	@XmlElement(name = "Rcpt", required = true)
	public QualifiedPartyIdentification1 getRecipient() {
		return recipient;
	}

	public void setRecipient(com.tools20022.repository.msg.QualifiedPartyIdentification1 recipient) {
		this.recipient = recipient;
	}

	@XmlElement(name = "Advsr", required = true)
	public QualifiedPartyIdentification1 getAdvisor() {
		return advisor;
	}

	public void setAdvisor(com.tools20022.repository.msg.QualifiedPartyIdentification1 advisor) {
		this.advisor = advisor;
	}

	@XmlElement(name = "Params", required = true)
	public FinancialItemParameters1 getParameters() {
		return parameters;
	}

	public void setParameters(com.tools20022.repository.msg.FinancialItemParameters1 parameters) {
		this.parameters = parameters;
	}

	@XmlElement(name = "PmtRef", required = true)
	public PaymentIdentification1 getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(com.tools20022.repository.msg.PaymentIdentification1 paymentReference) {
		this.paymentReference = paymentReference;
	}

	@XmlElement(name = "PmtMeans", required = true)
	public PaymentMeans1 getPaymentMeans() {
		return paymentMeans;
	}

	public void setPaymentMeans(com.tools20022.repository.msg.PaymentMeans1 paymentMeans) {
		this.paymentMeans = paymentMeans;
	}

	@XmlElement(name = "PmtDt", required = true)
	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODate paymentDate) {
		this.paymentDate = paymentDate;
	}

	@XmlElement(name = "PmtTerms", required = true)
	public PaymentTerms6 getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(com.tools20022.repository.msg.PaymentTerms6 paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	@XmlElement(name = "PmtAmt", required = true)
	public CurrencyAndAmount getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(CurrencyAndAmount paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@XmlElement(name = "Itm", required = true)
	public List<FinancialItem1> getItem() {
		return item;
	}

	public void setItem(List<com.tools20022.repository.msg.FinancialItem1> item) {
		this.item = item;
	}

	@XmlElement(name = "ItmCnt", required = true)
	public Max15NumericText getItemCount() {
		return itemCount;
	}

	public void setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
	}

	@XmlElement(name = "CtrlSum")
	public DecimalNumber getControlSum() {
		return controlSum;
	}

	public void setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
	}

	@XmlElement(name = "AssoctdDoc")
	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument;
	}

	public void setAssociatedDocument(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = associatedDocument;
	}

	@XmlElement(name = "AddtlInf")
	public Max2000Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "VldtnStsInf")
	public ValidationStatusInformation1 getValidationStatusInformation() {
		return validationStatusInformation;
	}

	public void setValidationStatusInformation(com.tools20022.repository.msg.ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
	}
}