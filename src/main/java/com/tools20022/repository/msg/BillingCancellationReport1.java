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
import com.tools20022.repository.choice.CancellationReason16Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report on cancelled billing data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmRegulatoryData
 * BillingCancellationReport1.mmRegulatoryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmInvoiceDate
 * BillingCancellationReport1.mmInvoiceDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmBillingIdentification
 * BillingCancellationReport1.mmBillingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmBillingPeriod
 * BillingCancellationReport1.mmBillingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmCancellationReason
 * BillingCancellationReport1.mmCancellationReason}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingCancellationReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report on cancelled billing data."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BillingCancellationReport1", propOrder = {"regulatoryData", "invoiceDate", "billingIdentification", "billingPeriod", "cancellationReason"})
public class BillingCancellationReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected InvoiceLegalIssue1 regulatoryData;
	/**
	 * Information about legal and regulatory data exchanged between invoicing
	 * and paying party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1
	 * InvoiceLegalIssue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about legal and regulatory data exchanged between invoicing and paying party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegulatoryData = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "RgltryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryData";
			definition = "Information about legal and regulatory data exchanged between invoicing and paying party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvoiceLegalIssue1.mmObject();
		}
	};
	protected ISODate invoiceDate;
	/**
	 * Date at which the billing report was created.
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
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the billing report was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvoiceDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "InvcDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceDate";
			definition = "Date at which the billing report was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text billingIdentification;
	/**
	 * Identification of the billing report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the billing report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBillingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "BllgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingIdentification";
			definition = "Identification of the billing report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DatePeriodDetails billingPeriod;
	/**
	 * Date period which for which the report data is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date period which for which the report data is valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBillingPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Date period which for which the report data is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	protected CancellationReason16Choice cancellationReason;
	/**
	 * Reason why requested billing information is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason16Choice
	 * CancellationReason16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1
	 * BillingCancellationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why requested billing information is cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Reason why requested billing information is cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationReason16Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BillingCancellationReport1.mmRegulatoryData, BillingCancellationReport1.mmInvoiceDate, BillingCancellationReport1.mmBillingIdentification,
						BillingCancellationReport1.mmBillingPeriod, BillingCancellationReport1.mmCancellationReason);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BillingCancellationReport1";
				definition = "Report on cancelled billing data.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RgltryData")
	public InvoiceLegalIssue1 getRegulatoryData() {
		return regulatoryData;
	}

	public void setRegulatoryData(com.tools20022.repository.msg.InvoiceLegalIssue1 regulatoryData) {
		this.regulatoryData = regulatoryData;
	}

	@XmlElement(name = "InvcDt", required = true)
	public ISODate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(ISODate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@XmlElement(name = "BllgId", required = true)
	public Max35Text getBillingIdentification() {
		return billingIdentification;
	}

	public void setBillingIdentification(Max35Text billingIdentification) {
		this.billingIdentification = billingIdentification;
	}

	@XmlElement(name = "BllgPrd", required = true)
	public DatePeriodDetails getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(com.tools20022.repository.msg.DatePeriodDetails billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	@XmlElement(name = "CxlRsn", required = true)
	public CancellationReason16Choice getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CancellationReason16Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
}