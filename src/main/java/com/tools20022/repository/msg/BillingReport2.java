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
import com.tools20022.repository.choice.CSDOrNCB1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails;
import com.tools20022.repository.msg.InvoiceLegalIssue1;
import com.tools20022.repository.msg.InvoiceTotals2;
import com.tools20022.repository.msg.ServiceCategoryTotals2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report on specific billing data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmRegulatoryData
 * BillingReport2.mmRegulatoryData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport2#mmInvoiceDate
 * BillingReport2.mmInvoiceDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmBillingIdentification
 * BillingReport2.mmBillingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport2#mmBillingPeriod
 * BillingReport2.mmBillingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport2#mmCSDOrNCB
 * BillingReport2.mmCSDOrNCB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport2#mmInvoiceTotals
 * BillingReport2.mmInvoiceTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmServiceCategoryTotals
 * BillingReport2.mmServiceCategoryTotals}</li>
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
 * "BillingReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report on specific billing data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.BillingReport1
 * BillingReport1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingReport2", propOrder = {"regulatoryData", "invoiceDate", "billingIdentification", "billingPeriod", "cSDOrNCB", "invoiceTotals", "serviceCategoryTotals"})
public class BillingReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RgltryData", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmRegulatoryData
	 * BillingReport1.mmRegulatoryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReport2, InvoiceLegalIssue1> mmRegulatoryData = new MMMessageAssociationEnd<BillingReport2, InvoiceLegalIssue1>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "RgltryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryData";
			definition = "Information about legal and regulatory data exchanged between invoicing and paying party.";
			previousVersion_lazy = () -> BillingReport1.mmRegulatoryData;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvoiceLegalIssue1.mmObject();
		}

		@Override
		public InvoiceLegalIssue1 getValue(BillingReport2 obj) {
			return obj.getRegulatoryData();
		}

		@Override
		public void setValue(BillingReport2 obj, InvoiceLegalIssue1 value) {
			obj.setRegulatoryData(value);
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
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmInvoiceDate
	 * BillingReport1.mmInvoiceDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingReport2, ISODate> mmInvoiceDate = new MMMessageAttribute<BillingReport2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "InvcDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceDate";
			definition = "Date at which the billing report was created.";
			previousVersion_lazy = () -> BillingReport1.mmInvoiceDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(BillingReport2 obj) {
			return obj.getInvoiceDate();
		}

		@Override
		public void setValue(BillingReport2 obj, ISODate value) {
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
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
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
	 * definition} = "Unique identification of the billing report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmBillingIdentification
	 * BillingReport1.mmBillingIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingReport2, Max35Text> mmBillingIdentification = new MMMessageAttribute<BillingReport2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "BllgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingIdentification";
			definition = "Unique identification of the billing report.";
			previousVersion_lazy = () -> BillingReport1.mmBillingIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BillingReport2 obj) {
			return obj.getBillingIdentification();
		}

		@Override
		public void setValue(BillingReport2 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
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
	 * definition} = "Date period for which the report data is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmBillingPeriod
	 * BillingReport1.mmBillingPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingReport2, DatePeriodDetails> mmBillingPeriod = new MMMessageAttribute<BillingReport2, DatePeriodDetails>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Date period for which the report data is valid.";
			previousVersion_lazy = () -> BillingReport1.mmBillingPeriod;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public DatePeriodDetails getValue(BillingReport2 obj) {
			return obj.getBillingPeriod();
		}

		@Override
		public void setValue(BillingReport2 obj, DatePeriodDetails value) {
			obj.setBillingPeriod(value);
		}
	};
	@XmlElement(name = "CSDOrNCB")
	protected CSDOrNCB1Choice cSDOrNCB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice
	 * CSDOrNCB1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
	 * CashSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDOrNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOrNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the billed party either CSD or NCB (party identification of the CSD or NCB which has a contractual relationship with the billed customer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmCSDOrNCB
	 * BillingReport1.mmCSDOrNCB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReport2, Optional<CSDOrNCB1Choice>> mmCSDOrNCB = new MMMessageAssociationEnd<BillingReport2, Optional<CSDOrNCB1Choice>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "CSDOrNCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOrNCB";
			definition = "Specifies the billed party either CSD or NCB (party identification of the CSD or NCB which has a contractual relationship with the billed customer).";
			previousVersion_lazy = () -> BillingReport1.mmCSDOrNCB;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CSDOrNCB1Choice.mmObject();
		}

		@Override
		public Optional<CSDOrNCB1Choice> getValue(BillingReport2 obj) {
			return obj.getCSDOrNCB();
		}

		@Override
		public void setValue(BillingReport2 obj, Optional<CSDOrNCB1Choice> value) {
			obj.setCSDOrNCB(value.orElse(null));
		}
	};
	@XmlElement(name = "InvcTtls", required = true)
	protected InvoiceTotals2 invoiceTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceTotals2
	 * InvoiceTotals2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies totals related to the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmInvoiceTotals
	 * BillingReport1.mmInvoiceTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReport2, InvoiceTotals2> mmInvoiceTotals = new MMMessageAssociationEnd<BillingReport2, InvoiceTotals2>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "InvcTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceTotals";
			definition = "Specifies totals related to the invoice.";
			previousVersion_lazy = () -> BillingReport1.mmInvoiceTotals;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvoiceTotals2.mmObject();
		}

		@Override
		public InvoiceTotals2 getValue(BillingReport2 obj) {
			return obj.getInvoiceTotals();
		}

		@Override
		public void setValue(BillingReport2 obj, InvoiceTotals2 value) {
			obj.setInvoiceTotals(value);
		}
	};
	@XmlElement(name = "SvcCtgyTtls", required = true)
	protected List<ServiceCategoryTotals2> serviceCategoryTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals2
	 * ServiceCategoryTotals2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcCtgyTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCategoryTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies totals related to the service category."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmServiceCategoryTotals
	 * BillingReport1.mmServiceCategoryTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingReport2, List<ServiceCategoryTotals2>> mmServiceCategoryTotals = new MMMessageAssociationEnd<BillingReport2, List<ServiceCategoryTotals2>>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingReport2.mmObject();
			isDerived = false;
			xmlTag = "SvcCtgyTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCategoryTotals";
			definition = "Specifies totals related to the service category.";
			previousVersion_lazy = () -> BillingReport1.mmServiceCategoryTotals;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ServiceCategoryTotals2.mmObject();
		}

		@Override
		public List<ServiceCategoryTotals2> getValue(BillingReport2 obj) {
			return obj.getServiceCategoryTotals();
		}

		@Override
		public void setValue(BillingReport2 obj, List<ServiceCategoryTotals2> value) {
			obj.setServiceCategoryTotals(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingReport2.mmRegulatoryData, com.tools20022.repository.msg.BillingReport2.mmInvoiceDate,
						com.tools20022.repository.msg.BillingReport2.mmBillingIdentification, com.tools20022.repository.msg.BillingReport2.mmBillingPeriod, com.tools20022.repository.msg.BillingReport2.mmCSDOrNCB,
						com.tools20022.repository.msg.BillingReport2.mmInvoiceTotals, com.tools20022.repository.msg.BillingReport2.mmServiceCategoryTotals);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BillingReport2";
				definition = "Report on specific billing data.";
				previousVersion_lazy = () -> BillingReport1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvoiceLegalIssue1 getRegulatoryData() {
		return regulatoryData;
	}

	public BillingReport2 setRegulatoryData(InvoiceLegalIssue1 regulatoryData) {
		this.regulatoryData = Objects.requireNonNull(regulatoryData);
		return this;
	}

	public ISODate getInvoiceDate() {
		return invoiceDate;
	}

	public BillingReport2 setInvoiceDate(ISODate invoiceDate) {
		this.invoiceDate = Objects.requireNonNull(invoiceDate);
		return this;
	}

	public Max35Text getBillingIdentification() {
		return billingIdentification;
	}

	public BillingReport2 setBillingIdentification(Max35Text billingIdentification) {
		this.billingIdentification = Objects.requireNonNull(billingIdentification);
		return this;
	}

	public DatePeriodDetails getBillingPeriod() {
		return billingPeriod;
	}

	public BillingReport2 setBillingPeriod(DatePeriodDetails billingPeriod) {
		this.billingPeriod = Objects.requireNonNull(billingPeriod);
		return this;
	}

	public Optional<CSDOrNCB1Choice> getCSDOrNCB() {
		return cSDOrNCB == null ? Optional.empty() : Optional.of(cSDOrNCB);
	}

	public BillingReport2 setCSDOrNCB(CSDOrNCB1Choice cSDOrNCB) {
		this.cSDOrNCB = cSDOrNCB;
		return this;
	}

	public InvoiceTotals2 getInvoiceTotals() {
		return invoiceTotals;
	}

	public BillingReport2 setInvoiceTotals(InvoiceTotals2 invoiceTotals) {
		this.invoiceTotals = Objects.requireNonNull(invoiceTotals);
		return this;
	}

	public List<ServiceCategoryTotals2> getServiceCategoryTotals() {
		return serviceCategoryTotals == null ? serviceCategoryTotals = new ArrayList<>() : serviceCategoryTotals;
	}

	public BillingReport2 setServiceCategoryTotals(List<ServiceCategoryTotals2> serviceCategoryTotals) {
		this.serviceCategoryTotals = Objects.requireNonNull(serviceCategoryTotals);
		return this;
	}
}