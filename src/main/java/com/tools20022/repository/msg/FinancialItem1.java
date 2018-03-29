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
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max2000Text;
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
 * Specifies information about a financing relation between two parties
 * represented by a document, for example invoice, credit.<br>
 * The component may include an external document describing details of the
 * underlying trade object using an external schema.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#mmItemContext
 * FinancialItem1.mmItemContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmFinancialDocumentReference
 * FinancialItem1.mmFinancialDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmCreditDebitIndicator
 * FinancialItem1.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#mmTotalAmount
 * FinancialItem1.mmTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#mmDueAmount
 * FinancialItem1.mmDueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmInstalmentInformation
 * FinancialItem1.mmInstalmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmAdditionalInformation
 * FinancialItem1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmAssociatedDocument
 * FinancialItem1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmValidationStatusInformation
 * FinancialItem1.mmValidationStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmFinancingStatus
 * FinancialItem1.mmFinancingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmProprietaryDetails
 * FinancialItem1.mmProprietaryDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
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
 * "FinancialItem1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information about a financing relation between two parties represented by a document, for example invoice, credit.\r\nThe component may include an external document describing details of the underlying trade object using an external schema."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialItem1", propOrder = {"itemContext", "financialDocumentReference", "creditDebitIndicator", "totalAmount", "dueAmount", "instalmentInformation", "additionalInformation", "associatedDocument",
		"validationStatusInformation", "financingStatus", "proprietaryDetails"})
public class FinancialItem1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ItmCntxt", required = true)
	protected FinancialItemParameters1 itemContext;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters identifying the context of the item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, FinancialItemParameters1> mmItemContext = new MMMessageAssociationEnd<FinancialItem1, FinancialItemParameters1>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "ItmCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemContext";
			definition = "Parameters identifying the context of the item.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialItemParameters1.mmObject();
		}

		@Override
		public FinancialItemParameters1 getValue(FinancialItem1 obj) {
			return obj.getItemContext();
		}

		@Override
		public void setValue(FinancialItem1 obj, FinancialItemParameters1 value) {
			obj.setItemContext(value);
		}
	};
	@XmlElement(name = "FinDocRef")
	protected List<QualifiedDocumentInformation1> financialDocumentReference;
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
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinDocRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialDocumentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of financial document that is the base document for this item, for example an invoice number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, List<QualifiedDocumentInformation1>> mmFinancialDocumentReference = new MMMessageAssociationEnd<FinancialItem1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "FinDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialDocumentReference";
			definition = "Identifier of financial document that is the base document for this item, for example an invoice number.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancialItem1 obj) {
			return obj.getFinancialDocumentReference();
		}

		@Override
		public void setValue(FinancialItem1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setFinancialDocumentReference(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCreditDebitIndicator
	 * Invoice.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItem1, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<FinancialItem1, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(FinancialItem1 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(FinancialItem1 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "TtlAmt", required = true)
	protected InvoiceTotals1 totalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceTotals1
	 * InvoiceTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount related to the financial document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, InvoiceTotals1> mmTotalAmount = new MMMessageAssociationEnd<FinancialItem1, InvoiceTotals1>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Specifies the total amount related to the financial document.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvoiceTotals1.mmObject();
		}

		@Override
		public InvoiceTotals1 getValue(FinancialItem1 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(FinancialItem1 obj, InvoiceTotals1 value) {
			obj.setTotalAmount(value);
		}
	};
	@XmlElement(name = "DueAmt")
	protected ActiveCurrencyAndAmount dueAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the remaining monetary amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItem1, Optional<ActiveCurrencyAndAmount>> mmDueAmount = new MMMessageAttribute<FinancialItem1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "DueAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueAmount";
			definition = "Specifies the remaining monetary amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(FinancialItem1 obj) {
			return obj.getDueAmount();
		}

		@Override
		public void setValue(FinancialItem1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setDueAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "InstlmtInf")
	protected List<Instalment2> instalmentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Instalment2
	 * Instalment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instalment information for payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, List<Instalment2>> mmInstalmentInformation = new MMMessageAssociationEnd<FinancialItem1, List<Instalment2>>() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentInformation";
			definition = "Instalment information for payment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Instalment2.mmObject();
		}

		@Override
		public List<Instalment2> getValue(FinancialItem1 obj) {
			return obj.getInstalmentInformation();
		}

		@Override
		public void setValue(FinancialItem1 obj, List<Instalment2> value) {
			obj.setInstalmentInformation(value);
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
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
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
	 * "Additional proprietary textual information concerning the item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItem1, Optional<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<FinancialItem1, Optional<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional proprietary textual information concerning the item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Optional<Max2000Text> getValue(FinancialItem1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(FinancialItem1 obj, Optional<Max2000Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
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
	 * definition} =
	 * "Associated free form document, for example a delivery confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, List<QualifiedDocumentInformation1>> mmAssociatedDocument = new MMMessageAssociationEnd<FinancialItem1, List<QualifiedDocumentInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document, for example a delivery confirmation.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancialItem1 obj) {
			return obj.getAssociatedDocument();
		}

		@Override
		public void setValue(FinancialItem1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setAssociatedDocument(value);
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
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
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
	 * definition} = "Validation status of the item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, Optional<ValidationStatusInformation1>> mmValidationStatusInformation = new MMMessageAssociationEnd<FinancialItem1, Optional<ValidationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
		}

		@Override
		public Optional<ValidationStatusInformation1> getValue(FinancialItem1 obj) {
			return obj.getValidationStatusInformation();
		}

		@Override
		public void setValue(FinancialItem1 obj, Optional<ValidationStatusInformation1> value) {
			obj.setValidationStatusInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "FincgSts")
	protected FinancingInformationAndStatus1 financingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1
	 * FinancingInformationAndStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceFinancingTransaction
	 * Invoice.mmInvoiceFinancingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing status if applicable for the item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, Optional<FinancingInformationAndStatus1>> mmFinancingStatus = new MMMessageAssociationEnd<FinancialItem1, Optional<FinancingInformationAndStatus1>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmInvoiceFinancingTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "FincgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingStatus";
			definition = "Financing status if applicable for the item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingInformationAndStatus1.mmObject();
		}

		@Override
		public Optional<FinancingInformationAndStatus1> getValue(FinancialItem1 obj) {
			return obj.getFinancingStatus();
		}

		@Override
		public void setValue(FinancialItem1 obj, Optional<FinancingInformationAndStatus1> value) {
			obj.setFinancingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtryDtls")
	protected SupplementaryData1 proprietaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structured proprietary information concerning details of the financial item."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItem1, Optional<SupplementaryData1>> mmProprietaryDetails = new MMMessageAssociationEnd<FinancialItem1, Optional<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItem1.mmObject();
			isDerived = false;
			xmlTag = "PrtryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryDetails";
			definition = "Structured proprietary information concerning details of the financial item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public Optional<SupplementaryData1> getValue(FinancialItem1 obj) {
			return obj.getProprietaryDetails();
		}

		@Override
		public void setValue(FinancialItem1 obj, Optional<SupplementaryData1> value) {
			obj.setProprietaryDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialItem1.mmItemContext, com.tools20022.repository.msg.FinancialItem1.mmFinancialDocumentReference,
						com.tools20022.repository.msg.FinancialItem1.mmCreditDebitIndicator, com.tools20022.repository.msg.FinancialItem1.mmTotalAmount, com.tools20022.repository.msg.FinancialItem1.mmDueAmount,
						com.tools20022.repository.msg.FinancialItem1.mmInstalmentInformation, com.tools20022.repository.msg.FinancialItem1.mmAdditionalInformation, com.tools20022.repository.msg.FinancialItem1.mmAssociatedDocument,
						com.tools20022.repository.msg.FinancialItem1.mmValidationStatusInformation, com.tools20022.repository.msg.FinancialItem1.mmFinancingStatus, com.tools20022.repository.msg.FinancialItem1.mmProprietaryDetails);
				trace_lazy = () -> FinancialDocument.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialItem1";
				definition = "Specifies information about a financing relation between two parties represented by a document, for example invoice, credit.\r\nThe component may include an external document describing details of the underlying trade object using an external schema.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialItemParameters1 getItemContext() {
		return itemContext;
	}

	public FinancialItem1 setItemContext(FinancialItemParameters1 itemContext) {
		this.itemContext = Objects.requireNonNull(itemContext);
		return this;
	}

	public List<QualifiedDocumentInformation1> getFinancialDocumentReference() {
		return financialDocumentReference == null ? financialDocumentReference = new ArrayList<>() : financialDocumentReference;
	}

	public FinancialItem1 setFinancialDocumentReference(List<QualifiedDocumentInformation1> financialDocumentReference) {
		this.financialDocumentReference = Objects.requireNonNull(financialDocumentReference);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public FinancialItem1 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public InvoiceTotals1 getTotalAmount() {
		return totalAmount;
	}

	public FinancialItem1 setTotalAmount(InvoiceTotals1 totalAmount) {
		this.totalAmount = Objects.requireNonNull(totalAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getDueAmount() {
		return dueAmount == null ? Optional.empty() : Optional.of(dueAmount);
	}

	public FinancialItem1 setDueAmount(ActiveCurrencyAndAmount dueAmount) {
		this.dueAmount = dueAmount;
		return this;
	}

	public List<Instalment2> getInstalmentInformation() {
		return instalmentInformation == null ? instalmentInformation = new ArrayList<>() : instalmentInformation;
	}

	public FinancialItem1 setInstalmentInformation(List<Instalment2> instalmentInformation) {
		this.instalmentInformation = Objects.requireNonNull(instalmentInformation);
		return this;
	}

	public Optional<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public FinancialItem1 setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument == null ? associatedDocument = new ArrayList<>() : associatedDocument;
	}

	public FinancialItem1 setAssociatedDocument(List<QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}

	public Optional<ValidationStatusInformation1> getValidationStatusInformation() {
		return validationStatusInformation == null ? Optional.empty() : Optional.of(validationStatusInformation);
	}

	public FinancialItem1 setValidationStatusInformation(ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
		return this;
	}

	public Optional<FinancingInformationAndStatus1> getFinancingStatus() {
		return financingStatus == null ? Optional.empty() : Optional.of(financingStatus);
	}

	public FinancialItem1 setFinancingStatus(FinancingInformationAndStatus1 financingStatus) {
		this.financingStatus = financingStatus;
		return this;
	}

	public Optional<SupplementaryData1> getProprietaryDetails() {
		return proprietaryDetails == null ? Optional.empty() : Optional.of(proprietaryDetails);
	}

	public FinancialItem1 setProprietaryDetails(SupplementaryData1 proprietaryDetails) {
		this.proprietaryDetails = proprietaryDetails;
		return this;
	}
}