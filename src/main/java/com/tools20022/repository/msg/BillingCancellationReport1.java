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
import com.tools20022.repository.msg.DatePeriodDetails;
import com.tools20022.repository.msg.InvoiceLegalIssue1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingCancellationReport1", propOrder = {"regulatoryData", "invoiceDate", "billingIdentification", "billingPeriod", "cancellationReason"})
public class BillingCancellationReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RgltryData")
	protected InvoiceLegalIssue1 regulatoryData;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<BillingCancellationReport1, Optional<InvoiceLegalIssue1>> mmRegulatoryData = new MMMessageAssociationEnd<BillingCancellationReport1, Optional<InvoiceLegalIssue1>>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "RgltryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryData";
			definition = "Information about legal and regulatory data exchanged between invoicing and paying party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvoiceLegalIssue1.mmObject();
		}

		@Override
		public Optional<InvoiceLegalIssue1> getValue(BillingCancellationReport1 obj) {
			return obj.getRegulatoryData();
		}

		@Override
		public void setValue(BillingCancellationReport1 obj, Optional<InvoiceLegalIssue1> value) {
			obj.setRegulatoryData(value.orElse(null));
		}
	};
	@XmlElement(name = "InvcDt", required = true)
	protected ISODate invoiceDate;
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
	public static final MMMessageAttribute<BillingCancellationReport1, ISODate> mmInvoiceDate = new MMMessageAttribute<BillingCancellationReport1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "InvcDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceDate";
			definition = "Date at which the billing report was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(BillingCancellationReport1 obj) {
			return obj.getInvoiceDate();
		}

		@Override
		public void setValue(BillingCancellationReport1 obj, ISODate value) {
			obj.setInvoiceDate(value);
		}
	};
	@XmlElement(name = "BllgId", required = true)
	protected Max35Text billingIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<BillingCancellationReport1, Max35Text> mmBillingIdentification = new MMMessageAttribute<BillingCancellationReport1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "BllgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingIdentification";
			definition = "Identification of the billing report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BillingCancellationReport1 obj) {
			return obj.getBillingIdentification();
		}

		@Override
		public void setValue(BillingCancellationReport1 obj, Max35Text value) {
			obj.setBillingIdentification(value);
		}
	};
	@XmlElement(name = "BllgPrd", required = true)
	protected DatePeriodDetails billingPeriod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<BillingCancellationReport1, DatePeriodDetails> mmBillingPeriod = new MMMessageAttribute<BillingCancellationReport1, DatePeriodDetails>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCancellationReport1.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Date period which for which the report data is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public DatePeriodDetails getValue(BillingCancellationReport1 obj) {
			return obj.getBillingPeriod();
		}

		@Override
		public void setValue(BillingCancellationReport1 obj, DatePeriodDetails value) {
			obj.setBillingPeriod(value);
		}
	};
	@XmlElement(name = "CxlRsn", required = true)
	protected CancellationReason16Choice cancellationReason;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<BillingCancellationReport1, CancellationReason16Choice> mmCancellationReason = new MMMessageAssociationEnd<BillingCancellationReport1, CancellationReason16Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingCancellationReport1.mmObject();
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

		@Override
		public CancellationReason16Choice getValue(BillingCancellationReport1 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(BillingCancellationReport1 obj, CancellationReason16Choice value) {
			obj.setCancellationReason(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingCancellationReport1.mmRegulatoryData, com.tools20022.repository.msg.BillingCancellationReport1.mmInvoiceDate,
						com.tools20022.repository.msg.BillingCancellationReport1.mmBillingIdentification, com.tools20022.repository.msg.BillingCancellationReport1.mmBillingPeriod,
						com.tools20022.repository.msg.BillingCancellationReport1.mmCancellationReason);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BillingCancellationReport1";
				definition = "Report on cancelled billing data.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvoiceLegalIssue1> getRegulatoryData() {
		return regulatoryData == null ? Optional.empty() : Optional.of(regulatoryData);
	}

	public BillingCancellationReport1 setRegulatoryData(InvoiceLegalIssue1 regulatoryData) {
		this.regulatoryData = regulatoryData;
		return this;
	}

	public ISODate getInvoiceDate() {
		return invoiceDate;
	}

	public BillingCancellationReport1 setInvoiceDate(ISODate invoiceDate) {
		this.invoiceDate = Objects.requireNonNull(invoiceDate);
		return this;
	}

	public Max35Text getBillingIdentification() {
		return billingIdentification;
	}

	public BillingCancellationReport1 setBillingIdentification(Max35Text billingIdentification) {
		this.billingIdentification = Objects.requireNonNull(billingIdentification);
		return this;
	}

	public DatePeriodDetails getBillingPeriod() {
		return billingPeriod;
	}

	public BillingCancellationReport1 setBillingPeriod(DatePeriodDetails billingPeriod) {
		this.billingPeriod = Objects.requireNonNull(billingPeriod);
		return this;
	}

	public CancellationReason16Choice getCancellationReason() {
		return cancellationReason;
	}

	public BillingCancellationReport1 setCancellationReason(CancellationReason16Choice cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}
}