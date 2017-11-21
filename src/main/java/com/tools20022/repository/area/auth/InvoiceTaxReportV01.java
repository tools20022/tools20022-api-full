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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TaxReport1;
import com.tools20022.repository.msg.TaxReportHeader1;
import com.tools20022.repository.msgset.InvoiceTaxReportISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax
 * authorities require corporates to report their sales based value added tax
 * (VAT). This message is targeted to this reporting based on information in
 * sales invoices and card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvoiceTaxReportISOLatestversion
 * InvoiceTaxReportISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcTaxRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmInvoiceTaxReportHeader
 * InvoiceTaxReportV01.mmInvoiceTaxReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmTaxReport
 * InvoiceTaxReportV01.mmTaxReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmSupplementaryData
 * InvoiceTaxReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.034.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceTaxReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax authorities require corporates to report their sales based value added tax (VAT). This message is targeted to this reporting based on information in sales invoices and card transactions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvoiceTaxReportV01", propOrder = {"invoiceTaxReportHeader", "taxReport", "supplementaryData"})
public class InvoiceTaxReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TaxReportHeader1 invoiceTaxReportHeader;
	/**
	 * Defines message level identification, number of individual tax reports
	 * and tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxReportHeader1
	 * TaxReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcTaxRptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceTaxReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines message level identification, number of individual tax reports and tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvoiceTaxReportHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvcTaxRptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceTaxReportHeader";
			definition = "Defines message level identification, number of individual tax reports and tax authority.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TaxReportHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceTaxReportV01.class.getMethod("getInvoiceTaxReportHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<TaxReport1> taxReport;
	/**
	 * Contains all needed party details for tax agency (sender of the
	 * TaxReport) and tax authority (receiver of the TaxReport) and the details
	 * of the reported sales transaction and calculated tax related that
	 * specific business transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTaxReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "TaxRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReport";
			definition = "Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction.";
			minOccurs = 1;
			complexType_lazy = () -> TaxReport1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceTaxReportV01.class.getMethod("getTaxReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceTaxReportV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceTaxReportV01";
				definition = "The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax authorities require corporates to report their sales based value added tax (VAT). This message is targeted to this reporting based on information in sales invoices and card transactions.";
				messageSet_lazy = () -> Arrays.asList(InvoiceTaxReportISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcTaxRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InvoiceTaxReportV01.mmInvoiceTaxReportHeader, com.tools20022.repository.area.auth.InvoiceTaxReportV01.mmTaxReport,
						com.tools20022.repository.area.auth.InvoiceTaxReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "034";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceTaxReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InvcTaxRptHdr", required = true)
	public TaxReportHeader1 getInvoiceTaxReportHeader() {
		return invoiceTaxReportHeader;
	}

	public void setInvoiceTaxReportHeader(TaxReportHeader1 invoiceTaxReportHeader) {
		this.invoiceTaxReportHeader = invoiceTaxReportHeader;
	}

	@XmlElement(name = "TaxRpt", required = true)
	public List<TaxReport1> getTaxReport() {
		return taxReport;
	}

	public void setTaxReport(List<TaxReport1> taxReport) {
		this.taxReport = taxReport;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.034.01.01")
	static public class Document {
		@XmlElement(name = "InvcTaxRpt", required = true)
		public InvoiceTaxReportV01 messageBody;
	}
}