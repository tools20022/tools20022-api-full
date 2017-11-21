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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Instalment;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed information about single invoice/instalment financing result, such
 * as result of request (financed or not financed), amount, percentage applied.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmOriginalInvoiceInformation
 * InvoiceFinancingDetails1.mmOriginalInvoiceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmSupplier
 * InvoiceFinancingDetails1.mmSupplier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmInvoiceFinancingResult
 * InvoiceFinancingDetails1.mmInvoiceFinancingResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmInstalmentFinancingInformation
 * InvoiceFinancingDetails1.mmInstalmentFinancingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
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
 * "InvoiceFinancingDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvoiceFinancingDetails1", propOrder = {"originalInvoiceInformation", "supplier", "invoiceFinancingResult", "instalmentFinancingInformation"})
public class InvoiceFinancingDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginalInvoiceInformation1 originalInvoiceInformation;
	/**
	 * General information that unambiguously identifies the invoice contained
	 * in the original request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1
	 * OriginalInvoiceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmOriginalInvoice
	 * Invoice.mmOriginalInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1
	 * InvoiceFinancingDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInvcInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInvoiceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information that unambiguously identifies the invoice contained in the original request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalInvoiceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmOriginalInvoice;
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInvcInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInvoiceInformation";
			definition = "General information that unambiguously identifies the invoice contained in the original request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalInvoiceInformation1.mmObject();
		}
	};
	protected PartyIdentification8 supplier;
	/**
	 * Person or organization that represents the creditor for the invoice to be
	 * financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1
	 * InvoiceFinancingDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Spplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Supplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person or organization that represents the creditor for the invoice to be financed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "Spplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Supplier";
			definition = "Person or organization that represents the creditor for the invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected FinancingResult1 invoiceFinancingResult;
	/**
	 * Information about result of invoice financing request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancingResult1
	 * FinancingResult1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1
	 * InvoiceFinancingDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcFincgRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about result of invoice financing request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceFinancingResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "InvcFincgRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceFinancingResult";
			definition = "Information about result of invoice financing request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancingResult1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstalmentFinancingInformation1> instalmentFinancingInformation;
	/**
	 * Includes details about a single instalment within an invoice, such as
	 * identification and amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1
	 * InstalmentFinancingInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1
	 * InvoiceFinancingDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtFincgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentFinancingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes details about a single instalment within an invoice, such as identification and amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalmentFinancingInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtFincgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentFinancingInformation";
			definition = "Includes details about a single instalment within an invoice, such as identification and amount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstalmentFinancingInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvoiceFinancingDetails1.mmOriginalInvoiceInformation, InvoiceFinancingDetails1.mmSupplier, InvoiceFinancingDetails1.mmInvoiceFinancingResult,
						InvoiceFinancingDetails1.mmInstalmentFinancingInformation);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingDetails1";
				definition = "Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrgnlInvcInf", required = true)
	public OriginalInvoiceInformation1 getOriginalInvoiceInformation() {
		return originalInvoiceInformation;
	}

	public void setOriginalInvoiceInformation(com.tools20022.repository.msg.OriginalInvoiceInformation1 originalInvoiceInformation) {
		this.originalInvoiceInformation = originalInvoiceInformation;
	}

	@XmlElement(name = "Spplr")
	public PartyIdentification8 getSupplier() {
		return supplier;
	}

	public void setSupplier(com.tools20022.repository.msg.PartyIdentification8 supplier) {
		this.supplier = supplier;
	}

	@XmlElement(name = "InvcFincgRslt", required = true)
	public FinancingResult1 getInvoiceFinancingResult() {
		return invoiceFinancingResult;
	}

	public void setInvoiceFinancingResult(com.tools20022.repository.msg.FinancingResult1 invoiceFinancingResult) {
		this.invoiceFinancingResult = invoiceFinancingResult;
	}

	@XmlElement(name = "InstlmtFincgInf")
	public List<InstalmentFinancingInformation1> getInstalmentFinancingInformation() {
		return instalmentFinancingInformation;
	}

	public void setInstalmentFinancingInformation(List<com.tools20022.repository.msg.InstalmentFinancingInformation1> instalmentFinancingInformation) {
		this.instalmentFinancingInformation = instalmentFinancingInformation;
	}
}