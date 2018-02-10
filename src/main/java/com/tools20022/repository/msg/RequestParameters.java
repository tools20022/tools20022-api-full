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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.FundParameters1Choice;
import com.tools20022.repository.choice.FundParameters2Choice;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specification of the request for report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#ReportTypeRequested
 * RequestParameters.ReportTypeRequested}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmPreviousReference
 * RequestParameters.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmRelatedReference
 * RequestParameters.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmFundCashForecastReport
 * RequestParameters.mmFundCashForecastReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmFundProcessingPassportReport
 * RequestParameters.mmFundProcessingPassportReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmPriceReport
 * RequestParameters.mmPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmStatementByAccount
 * RequestParameters.mmStatementByAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmStatementByAccountAndFinancialInstrument
 * RequestParameters.mmStatementByAccountAndFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmUserDefinedReport
 * RequestParameters.mmUserDefinedReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specification of the request for report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestParameters", propOrder = {"previousReference", "relatedReference", "fundCashForecastReport", "fundProcessingPassportReport", "priceReport", "statementByAccount", "statementByAccountAndFinancialInstrument",
		"userDefinedReport"})
public class RequestParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrvsRef", required = true)
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
		}
	};
	@XmlElement(name = "FndCshFcstRpt", required = true)
	protected FundCashForecastParameters1 fundCashForecastReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndCshFcstRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCashForecastReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for which the fund cash forecast report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundCashForecastReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "FndCshFcstRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastReport";
			definition = "Parameters for which the fund cash forecast report is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters1.mmObject();
		}
	};
	@XmlElement(name = "FndPrcgPsptRpt", required = true)
	protected List<FundParameters1Choice> fundProcessingPassportReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FundParameters1Choice
	 * FundParameters1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndPrcgPsptRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundProcessingPassportReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for which the fund processing passport report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundProcessingPassportReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "FndPrcgPsptRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundProcessingPassportReport";
			definition = "Parameters for which the fund processing passport report is requested.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FundParameters1Choice.mmObject();
		}
	};
	@XmlElement(name = "PricRpt", required = true)
	protected FundParameters2Choice priceReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FundParameters2Choice
	 * FundParameters2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters for which the price report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "PricRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReport";
			definition = "Parameters for which the price report is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FundParameters2Choice.mmObject();
		}
	};
	@XmlElement(name = "StmtByAcct", required = true)
	protected StatementDetails statementByAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtByAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and statement parameters for which the statement is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementByAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccount";
			definition = "Account and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
		}
	};
	@XmlElement(name = "StmtByAcctAndFinInstrm", required = true)
	protected StatementAndFinancialInstrumentDetails statementByAccountAndFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtByAcctAndFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccountAndFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account, financial instrument and statement parameters for which the statement is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementByAccountAndFinancialInstrument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcctAndFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccountAndFinancialInstrument";
			definition = "Account, financial instrument and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.mmObject();
		}
	};
	@XmlElement(name = "UsrDfndRpt", required = true)
	protected GenericReportParameters userDefinedReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrDfndRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for which the user defined report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUserDefinedReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "UsrDfndRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedReport";
			definition = "Parameters for which the user defined report is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericReportParameters.mmObject();
		}
	};
	/**
	 * One element in the list (FundCashForecastReport, FundProcessingPassport,
	 * PriceReport, StatementByAccount, StatementByAccountAndFinancial
	 * Instrument, UserDefinedReport) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmFundCashForecastReport
	 * RequestParameters.mmFundCashForecastReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmFundProcessingPassportReport
	 * RequestParameters.mmFundProcessingPassportReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmPriceReport
	 * RequestParameters.mmPriceReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmStatementByAccount
	 * RequestParameters.mmStatementByAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmStatementByAccountAndFinancialInstrument
	 * RequestParameters.mmStatementByAccountAndFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmUserDefinedReport
	 * RequestParameters.mmUserDefinedReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTypeRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One element in the list (FundCashForecastReport, FundProcessingPassport, PriceReport,\nStatementByAccount, StatementByAccountAndFinancial Instrument, UserDefinedReport) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ReportTypeRequested = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTypeRequested";
			definition = "One element in the list (FundCashForecastReport, FundProcessingPassport, PriceReport,\nStatementByAccount, StatementByAccountAndFinancial Instrument, UserDefinedReport) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.RequestParameters.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.mmFundCashForecastReport, com.tools20022.repository.msg.RequestParameters.mmFundProcessingPassportReport,
					com.tools20022.repository.msg.RequestParameters.mmPriceReport, com.tools20022.repository.msg.RequestParameters.mmStatementByAccount,
					com.tools20022.repository.msg.RequestParameters.mmStatementByAccountAndFinancialInstrument, com.tools20022.repository.msg.RequestParameters.mmUserDefinedReport);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.mmPreviousReference, com.tools20022.repository.msg.RequestParameters.mmRelatedReference,
						com.tools20022.repository.msg.RequestParameters.mmFundCashForecastReport, com.tools20022.repository.msg.RequestParameters.mmFundProcessingPassportReport,
						com.tools20022.repository.msg.RequestParameters.mmPriceReport, com.tools20022.repository.msg.RequestParameters.mmStatementByAccount,
						com.tools20022.repository.msg.RequestParameters.mmStatementByAccountAndFinancialInstrument, com.tools20022.repository.msg.RequestParameters.mmUserDefinedReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RequestParameters";
				definition = "Specification of the request for report.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.ReportTypeRequested);
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public RequestParameters setPreviousReference(com.tools20022.repository.msg.AdditionalReference3 previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public RequestParameters setRelatedReference(com.tools20022.repository.msg.AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public FundCashForecastParameters1 getFundCashForecastReport() {
		return fundCashForecastReport;
	}

	public RequestParameters setFundCashForecastReport(com.tools20022.repository.msg.FundCashForecastParameters1 fundCashForecastReport) {
		this.fundCashForecastReport = Objects.requireNonNull(fundCashForecastReport);
		return this;
	}

	public List<FundParameters1Choice> getFundProcessingPassportReport() {
		return fundProcessingPassportReport == null ? fundProcessingPassportReport = new ArrayList<>() : fundProcessingPassportReport;
	}

	public RequestParameters setFundProcessingPassportReport(List<FundParameters1Choice> fundProcessingPassportReport) {
		this.fundProcessingPassportReport = Objects.requireNonNull(fundProcessingPassportReport);
		return this;
	}

	public FundParameters2Choice getPriceReport() {
		return priceReport;
	}

	public RequestParameters setPriceReport(FundParameters2Choice priceReport) {
		this.priceReport = Objects.requireNonNull(priceReport);
		return this;
	}

	public StatementDetails getStatementByAccount() {
		return statementByAccount;
	}

	public RequestParameters setStatementByAccount(com.tools20022.repository.msg.StatementDetails statementByAccount) {
		this.statementByAccount = Objects.requireNonNull(statementByAccount);
		return this;
	}

	public StatementAndFinancialInstrumentDetails getStatementByAccountAndFinancialInstrument() {
		return statementByAccountAndFinancialInstrument;
	}

	public RequestParameters setStatementByAccountAndFinancialInstrument(com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails statementByAccountAndFinancialInstrument) {
		this.statementByAccountAndFinancialInstrument = Objects.requireNonNull(statementByAccountAndFinancialInstrument);
		return this;
	}

	public GenericReportParameters getUserDefinedReport() {
		return userDefinedReport;
	}

	public RequestParameters setUserDefinedReport(com.tools20022.repository.msg.GenericReportParameters userDefinedReport) {
		this.userDefinedReport = Objects.requireNonNull(userDefinedReport);
		return this;
	}
}