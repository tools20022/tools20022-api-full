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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReconciliationList1", propOrder = {"date", "relatedDocument", "recipient", "advisor", "parameters", "paymentReference", "paymentMeans", "paymentDate", "paymentTerms", "paymentAmount", "item", "itemCount", "controlSum",
		"associatedDocument", "additionalInformation", "validationStatusInformation"})
public class ReconciliationList1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected ISODate date;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReconciliationList1, ISODate> mmDate = new MMMessageAttribute<ReconciliationList1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of creation of this document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ReconciliationList1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(ReconciliationList1 obj, ISODate value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "RltdDoc")
	protected List<QualifiedDocumentInformation1> relatedDocument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, List<QualifiedDocumentInformation1>> mmRelatedDocument = new MMMessageAssociationEnd<ReconciliationList1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "RltdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDocument";
			definition = "Reference to related documents for example to original assignment in a status response or retry.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(ReconciliationList1 obj) {
			return obj.getRelatedDocument();
		}

		@Override
		public void setValue(ReconciliationList1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedDocument(value);
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected QualifiedPartyIdentification1 recipient;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, QualifiedPartyIdentification1> mmRecipient = new MMMessageAssociationEnd<ReconciliationList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Party to be advised.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(ReconciliationList1 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(ReconciliationList1 obj, QualifiedPartyIdentification1 value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "Advsr", required = true)
	protected QualifiedPartyIdentification1 advisor;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, QualifiedPartyIdentification1> mmAdvisor = new MMMessageAssociationEnd<ReconciliationList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Advsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Advisor";
			definition = "Informing party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(ReconciliationList1 obj) {
			return obj.getAdvisor();
		}

		@Override
		public void setValue(ReconciliationList1 obj, QualifiedPartyIdentification1 value) {
			obj.setAdvisor(value);
		}
	};
	@XmlElement(name = "Params", required = true)
	protected FinancialItemParameters1 parameters;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, FinancialItemParameters1> mmParameters = new MMMessageAssociationEnd<ReconciliationList1, FinancialItemParameters1>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Params";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Identification parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialItemParameters1.mmObject();
		}

		@Override
		public FinancialItemParameters1 getValue(ReconciliationList1 obj) {
			return obj.getParameters();
		}

		@Override
		public void setValue(ReconciliationList1 obj, FinancialItemParameters1 value) {
			obj.setParameters(value);
		}
	};
	@XmlElement(name = "PmtRef", required = true)
	protected PaymentIdentification1 paymentReference;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, PaymentIdentification1> mmPaymentReference = new MMMessageAssociationEnd<ReconciliationList1, PaymentIdentification1>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Reference to a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentIdentification1.mmObject();
		}

		@Override
		public PaymentIdentification1 getValue(ReconciliationList1 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(ReconciliationList1 obj, PaymentIdentification1 value) {
			obj.setPaymentReference(value);
		}
	};
	@XmlElement(name = "PmtMeans", required = true)
	protected PaymentMeans1 paymentMeans;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, PaymentMeans1> mmPaymentMeans = new MMMessageAssociationEnd<ReconciliationList1, PaymentMeans1>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtMeans";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMeans";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentMeans1.mmObject();
		}

		@Override
		public PaymentMeans1 getValue(ReconciliationList1 obj) {
			return obj.getPaymentMeans();
		}

		@Override
		public void setValue(ReconciliationList1 obj, PaymentMeans1 value) {
			obj.setPaymentMeans(value);
		}
	};
	@XmlElement(name = "PmtDt", required = true)
	protected ISODate paymentDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReconciliationList1, ISODate> mmPaymentDate = new MMMessageAttribute<ReconciliationList1, ISODate>() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Effective date of payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ReconciliationList1 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(ReconciliationList1 obj, ISODate value) {
			obj.setPaymentDate(value);
		}
	};
	@XmlElement(name = "PmtTerms", required = true)
	protected PaymentTerms6 paymentTerms;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, PaymentTerms6> mmPaymentTerms = new MMMessageAssociationEnd<ReconciliationList1, PaymentTerms6>() {
		{
			businessElementTrace_lazy = () -> Document.mmPaymentObligation;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Terms of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentTerms6.mmObject();
		}

		@Override
		public PaymentTerms6 getValue(ReconciliationList1 obj) {
			return obj.getPaymentTerms();
		}

		@Override
		public void setValue(ReconciliationList1 obj, PaymentTerms6 value) {
			obj.setPaymentTerms(value);
		}
	};
	@XmlElement(name = "PmtAmt", required = true)
	protected CurrencyAndAmount paymentAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReconciliationList1, CurrencyAndAmount> mmPaymentAmount = new MMMessageAttribute<ReconciliationList1, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "PmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentAmount";
			definition = "Amount of the referenced payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ReconciliationList1 obj) {
			return obj.getPaymentAmount();
		}

		@Override
		public void setValue(ReconciliationList1 obj, CurrencyAndAmount value) {
			obj.setPaymentAmount(value);
		}
	};
	@XmlElement(name = "Itm", required = true)
	protected List<FinancialItem1> item;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, List<FinancialItem1>> mmItem = new MMMessageAssociationEnd<ReconciliationList1, List<FinancialItem1>>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "Itm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Item";
			definition = "Financial item impacted by the payment.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialItem1.mmObject();
		}

		@Override
		public List<FinancialItem1> getValue(ReconciliationList1 obj) {
			return obj.getItem();
		}

		@Override
		public void setValue(ReconciliationList1 obj, List<FinancialItem1> value) {
			obj.setItem(value);
		}
	};
	@XmlElement(name = "ItmCnt", required = true)
	protected Max15NumericText itemCount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReconciliationList1, Max15NumericText> mmItemCount = new MMMessageAttribute<ReconciliationList1, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Number of individual items contained in the list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(ReconciliationList1 obj) {
			return obj.getItemCount();
		}

		@Override
		public void setValue(ReconciliationList1 obj, Max15NumericText value) {
			obj.setItemCount(value);
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReconciliationList1, Optional<DecimalNumber>> mmControlSum = new MMMessageAttribute<ReconciliationList1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the list, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(ReconciliationList1 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(ReconciliationList1 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "AssoctdDoc")
	protected List<QualifiedDocumentInformation1> associatedDocument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, List<QualifiedDocumentInformation1>> mmAssociatedDocument = new MMMessageAssociationEnd<ReconciliationList1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(ReconciliationList1 obj) {
			return obj.getAssociatedDocument();
		}

		@Override
		public void setValue(ReconciliationList1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setAssociatedDocument(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max2000Text additionalInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ReconciliationList1, Optional<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<ReconciliationList1, Optional<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional proprietary formal information concerning the list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Optional<Max2000Text> getValue(ReconciliationList1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ReconciliationList1 obj, Optional<Max2000Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnStsInf")
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ReconciliationList1, Optional<ValidationStatusInformation1>> mmValidationStatusInformation = new MMMessageAssociationEnd<ReconciliationList1, Optional<ValidationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReconciliationList1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the list.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
		}

		@Override
		public Optional<ValidationStatusInformation1> getValue(ReconciliationList1 obj) {
			return obj.getValidationStatusInformation();
		}

		@Override
		public void setValue(ReconciliationList1 obj, Optional<ValidationStatusInformation1> value) {
			obj.setValidationStatusInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReconciliationList1.mmDate, com.tools20022.repository.msg.ReconciliationList1.mmRelatedDocument,
						com.tools20022.repository.msg.ReconciliationList1.mmRecipient, com.tools20022.repository.msg.ReconciliationList1.mmAdvisor, com.tools20022.repository.msg.ReconciliationList1.mmParameters,
						com.tools20022.repository.msg.ReconciliationList1.mmPaymentReference, com.tools20022.repository.msg.ReconciliationList1.mmPaymentMeans, com.tools20022.repository.msg.ReconciliationList1.mmPaymentDate,
						com.tools20022.repository.msg.ReconciliationList1.mmPaymentTerms, com.tools20022.repository.msg.ReconciliationList1.mmPaymentAmount, com.tools20022.repository.msg.ReconciliationList1.mmItem,
						com.tools20022.repository.msg.ReconciliationList1.mmItemCount, com.tools20022.repository.msg.ReconciliationList1.mmControlSum, com.tools20022.repository.msg.ReconciliationList1.mmAssociatedDocument,
						com.tools20022.repository.msg.ReconciliationList1.mmAdditionalInformation, com.tools20022.repository.msg.ReconciliationList1.mmValidationStatusInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoicePaymentReconciliationAdviceV01.mmReconciliationList, InvoicePaymentReconciliationStatusV01.mmReconciliationList);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReconciliationList1";
				definition = "Specifies a list of reconciliation information concerning financial items.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public ReconciliationList1 setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedDocument() {
		return relatedDocument == null ? relatedDocument = new ArrayList<>() : relatedDocument;
	}

	public ReconciliationList1 setRelatedDocument(List<QualifiedDocumentInformation1> relatedDocument) {
		this.relatedDocument = Objects.requireNonNull(relatedDocument);
		return this;
	}

	public QualifiedPartyIdentification1 getRecipient() {
		return recipient;
	}

	public ReconciliationList1 setRecipient(QualifiedPartyIdentification1 recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public QualifiedPartyIdentification1 getAdvisor() {
		return advisor;
	}

	public ReconciliationList1 setAdvisor(QualifiedPartyIdentification1 advisor) {
		this.advisor = Objects.requireNonNull(advisor);
		return this;
	}

	public FinancialItemParameters1 getParameters() {
		return parameters;
	}

	public ReconciliationList1 setParameters(FinancialItemParameters1 parameters) {
		this.parameters = Objects.requireNonNull(parameters);
		return this;
	}

	public PaymentIdentification1 getPaymentReference() {
		return paymentReference;
	}

	public ReconciliationList1 setPaymentReference(PaymentIdentification1 paymentReference) {
		this.paymentReference = Objects.requireNonNull(paymentReference);
		return this;
	}

	public PaymentMeans1 getPaymentMeans() {
		return paymentMeans;
	}

	public ReconciliationList1 setPaymentMeans(PaymentMeans1 paymentMeans) {
		this.paymentMeans = Objects.requireNonNull(paymentMeans);
		return this;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public ReconciliationList1 setPaymentDate(ISODate paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public PaymentTerms6 getPaymentTerms() {
		return paymentTerms;
	}

	public ReconciliationList1 setPaymentTerms(PaymentTerms6 paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public CurrencyAndAmount getPaymentAmount() {
		return paymentAmount;
	}

	public ReconciliationList1 setPaymentAmount(CurrencyAndAmount paymentAmount) {
		this.paymentAmount = Objects.requireNonNull(paymentAmount);
		return this;
	}

	public List<FinancialItem1> getItem() {
		return item == null ? item = new ArrayList<>() : item;
	}

	public ReconciliationList1 setItem(List<FinancialItem1> item) {
		this.item = Objects.requireNonNull(item);
		return this;
	}

	public Max15NumericText getItemCount() {
		return itemCount;
	}

	public ReconciliationList1 setItemCount(Max15NumericText itemCount) {
		this.itemCount = Objects.requireNonNull(itemCount);
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public ReconciliationList1 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument == null ? associatedDocument = new ArrayList<>() : associatedDocument;
	}

	public ReconciliationList1 setAssociatedDocument(List<QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}

	public Optional<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public ReconciliationList1 setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<ValidationStatusInformation1> getValidationStatusInformation() {
		return validationStatusInformation == null ? Optional.empty() : Optional.of(validationStatusInformation);
	}

	public ReconciliationList1 setValidationStatusInformation(ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
		return this;
	}
}