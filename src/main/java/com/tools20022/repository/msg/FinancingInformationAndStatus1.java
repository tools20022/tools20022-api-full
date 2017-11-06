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
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Financing information and status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1#mmFinancingAllowedSummary
 * FinancingInformationAndStatus1.mmFinancingAllowedSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1#mmInvoiceFinancingDetails
 * FinancingInformationAndStatus1.mmInvoiceFinancingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmFinancingInformationAndStatus
 * InvoiceFinancingRequestStatusV01.mmFinancingInformationAndStatus}</li>
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
 * "FinancingInformationAndStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financing information and status."</li>
 * </ul>
 */
public class FinancingInformationAndStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancingAllowedSummary1 financingAllowedSummary;
	/**
	 * Specifies summary information about invoices/instalments financed, such
	 * as total amount financed, number of single requests accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1
	 * FinancingAllowedSummary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1
	 * FinancingInformationAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgAllwdSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAllowedSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies summary information about invoices/instalments financed, such as total amount financed, number of single requests accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancingAllowedSummary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingAgreement.mmObject();
			componentContext_lazy = () -> FinancingInformationAndStatus1.mmObject();
			isDerived = false;
			xmlTag = "FincgAllwdSummry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingAllowedSummary";
			definition = "Specifies summary information about invoices/instalments financed, such as total amount financed, number of single requests accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancingAllowedSummary1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvoiceFinancingDetails1> invoiceFinancingDetails;
	/**
	 * Specifies detailed information about single invoice/instalment financing
	 * result, such as result of request (financed or not financed), amount,
	 * percentage applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1
	 * InvoiceFinancingDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1
	 * FinancingInformationAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcFincgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceFinancingDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingAgreement.mmObject();
			componentContext_lazy = () -> FinancingInformationAndStatus1.mmObject();
			isDerived = false;
			xmlTag = "InvcFincgDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceFinancingDetails";
			definition = "Specifies detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvoiceFinancingDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingInformationAndStatus1.mmFinancingAllowedSummary, com.tools20022.repository.msg.FinancingInformationAndStatus1.mmInvoiceFinancingDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.mmFinancingInformationAndStatus);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancingInformationAndStatus1";
				definition = "Financing information and status.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancingAllowedSummary1 getFinancingAllowedSummary() {
		return financingAllowedSummary;
	}

	public void setFinancingAllowedSummary(com.tools20022.repository.msg.FinancingAllowedSummary1 financingAllowedSummary) {
		this.financingAllowedSummary = financingAllowedSummary;
	}

	public List<InvoiceFinancingDetails1> getInvoiceFinancingDetails() {
		return invoiceFinancingDetails;
	}

	public void setInvoiceFinancingDetails(List<com.tools20022.repository.msg.InvoiceFinancingDetails1> invoiceFinancingDetails) {
		this.invoiceFinancingDetails = invoiceFinancingDetails;
	}
}