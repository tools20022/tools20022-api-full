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
import com.tools20022.repository.entity.Instalment;
import com.tools20022.repository.entity.Invoice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#OriginalInvoiceInformation
 * InvoiceFinancingDetails1.OriginalInvoiceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#Supplier
 * InvoiceFinancingDetails1.Supplier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#InvoiceFinancingResult
 * InvoiceFinancingDetails1.InvoiceFinancingResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#InstalmentFinancingInformation
 * InvoiceFinancingDetails1.InstalmentFinancingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
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
 * "InvoiceFinancingDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied."
 * </li>
 * </ul>
 */
public class InvoiceFinancingDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#OriginalInvoice
	 * Invoice.OriginalInvoice}</li>
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
	public static final MMMessageAssociationEnd OriginalInvoiceInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.OriginalInvoice;
			isDerived = false;
			xmlTag = "OrgnlInvcInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInvoiceInformation";
			definition = "General information that unambiguously identifies the invoice contained in the original request.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> OriginalInvoiceInformation1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
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
	public static final MMMessageAssociationEnd Supplier = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Spplr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Supplier";
			definition = "Person or organization that represents the creditor for the invoice to be financed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentification8.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#InvoiceFinancingStatus
	 * InvoiceFinancingAgreement.InvoiceFinancingStatus}</li>
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
	public static final MMMessageAssociationEnd InvoiceFinancingResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus;
			isDerived = false;
			xmlTag = "InvcFincgRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceFinancingResult";
			definition = "Information about result of invoice financing request.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FinancingResult1.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd InstalmentFinancingInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceFinancingDetails1.mmObject();
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			isDerived = false;
			xmlTag = "InstlmtFincgInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentFinancingInformation";
			definition = "Includes details about a single instalment within an invoice, such as identification and amount.";
			minOccurs = 0;
			type_lazy = () -> InstalmentFinancingInformation1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceFinancingDetails1.OriginalInvoiceInformation, com.tools20022.repository.msg.InvoiceFinancingDetails1.Supplier,
						com.tools20022.repository.msg.InvoiceFinancingDetails1.InvoiceFinancingResult, com.tools20022.repository.msg.InvoiceFinancingDetails1.InstalmentFinancingInformation);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingDetails1";
				definition = "Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied.";
			}
		});
		return mmObject_lazy.get();
	}
}