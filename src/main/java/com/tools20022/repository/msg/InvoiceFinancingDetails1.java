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
import com.tools20022.repository.msg.FinancingResult1;
import com.tools20022.repository.msg.InstalmentFinancingInformation1;
import com.tools20022.repository.msg.OriginalInvoiceInformation1;
import com.tools20022.repository.msg.PartyIdentification8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceFinancingDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceFinancingDetails1", propOrder = {"originalInvoiceInformation", "supplier", "invoiceFinancingResult", "instalmentFinancingInformation"})
public class InvoiceFinancingDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlInvcInf", required = true)
	protected OriginalInvoiceInformation1 originalInvoiceInformation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInvoiceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information that unambiguously identifies the invoice contained in the original request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceFinancingDetails1, OriginalInvoiceInformation1> mmOriginalInvoiceInformation = new MMMessageAssociationEnd<InvoiceFinancingDetails1, OriginalInvoiceInformation1>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmOriginalInvoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInvcInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInvoiceInformation";
			definition = "General information that unambiguously identifies the invoice contained in the original request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalInvoiceInformation1.mmObject();
		}

		@Override
		public OriginalInvoiceInformation1 getValue(InvoiceFinancingDetails1 obj) {
			return obj.getOriginalInvoiceInformation();
		}

		@Override
		public void setValue(InvoiceFinancingDetails1 obj, OriginalInvoiceInformation1 value) {
			obj.setOriginalInvoiceInformation(value);
		}
	};
	@XmlElement(name = "Spplr")
	protected PartyIdentification8 supplier;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Supplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person or organization that represents the creditor for the invoice to be financed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceFinancingDetails1, Optional<PartyIdentification8>> mmSupplier = new MMMessageAssociationEnd<InvoiceFinancingDetails1, Optional<PartyIdentification8>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "Spplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Supplier";
			definition = "Person or organization that represents the creditor for the invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification8.mmObject();
		}

		@Override
		public Optional<PartyIdentification8> getValue(InvoiceFinancingDetails1 obj) {
			return obj.getSupplier();
		}

		@Override
		public void setValue(InvoiceFinancingDetails1 obj, Optional<PartyIdentification8> value) {
			obj.setSupplier(value.orElse(null));
		}
	};
	@XmlElement(name = "InvcFincgRslt", required = true)
	protected FinancingResult1 invoiceFinancingResult;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about result of invoice financing request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceFinancingDetails1, FinancingResult1> mmInvoiceFinancingResult = new MMMessageAssociationEnd<InvoiceFinancingDetails1, FinancingResult1>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "InvcFincgRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceFinancingResult";
			definition = "Information about result of invoice financing request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancingResult1.mmObject();
		}

		@Override
		public FinancingResult1 getValue(InvoiceFinancingDetails1 obj) {
			return obj.getInvoiceFinancingResult();
		}

		@Override
		public void setValue(InvoiceFinancingDetails1 obj, FinancingResult1 value) {
			obj.setInvoiceFinancingResult(value);
		}
	};
	@XmlElement(name = "InstlmtFincgInf")
	protected List<InstalmentFinancingInformation1> instalmentFinancingInformation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentFinancingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes details about a single instalment within an invoice, such as identification and amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceFinancingDetails1, List<InstalmentFinancingInformation1>> mmInstalmentFinancingInformation = new MMMessageAssociationEnd<InvoiceFinancingDetails1, List<InstalmentFinancingInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceFinancingDetails1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtFincgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentFinancingInformation";
			definition = "Includes details about a single instalment within an invoice, such as identification and amount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstalmentFinancingInformation1.mmObject();
		}

		@Override
		public List<InstalmentFinancingInformation1> getValue(InvoiceFinancingDetails1 obj) {
			return obj.getInstalmentFinancingInformation();
		}

		@Override
		public void setValue(InvoiceFinancingDetails1 obj, List<InstalmentFinancingInformation1> value) {
			obj.setInstalmentFinancingInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceFinancingDetails1.mmOriginalInvoiceInformation, com.tools20022.repository.msg.InvoiceFinancingDetails1.mmSupplier,
						com.tools20022.repository.msg.InvoiceFinancingDetails1.mmInvoiceFinancingResult, com.tools20022.repository.msg.InvoiceFinancingDetails1.mmInstalmentFinancingInformation);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingDetails1";
				definition = "Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied.";
			}
		});
		return mmObject_lazy.get();
	}

	public OriginalInvoiceInformation1 getOriginalInvoiceInformation() {
		return originalInvoiceInformation;
	}

	public InvoiceFinancingDetails1 setOriginalInvoiceInformation(OriginalInvoiceInformation1 originalInvoiceInformation) {
		this.originalInvoiceInformation = Objects.requireNonNull(originalInvoiceInformation);
		return this;
	}

	public Optional<PartyIdentification8> getSupplier() {
		return supplier == null ? Optional.empty() : Optional.of(supplier);
	}

	public InvoiceFinancingDetails1 setSupplier(PartyIdentification8 supplier) {
		this.supplier = supplier;
		return this;
	}

	public FinancingResult1 getInvoiceFinancingResult() {
		return invoiceFinancingResult;
	}

	public InvoiceFinancingDetails1 setInvoiceFinancingResult(FinancingResult1 invoiceFinancingResult) {
		this.invoiceFinancingResult = Objects.requireNonNull(invoiceFinancingResult);
		return this;
	}

	public List<InstalmentFinancingInformation1> getInstalmentFinancingInformation() {
		return instalmentFinancingInformation == null ? instalmentFinancingInformation = new ArrayList<>() : instalmentFinancingInformation;
	}

	public InvoiceFinancingDetails1 setInstalmentFinancingInformation(List<InstalmentFinancingInformation1> instalmentFinancingInformation) {
		this.instalmentFinancingInformation = Objects.requireNonNull(instalmentFinancingInformation);
		return this;
	}
}