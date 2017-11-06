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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.FundParameters1Choice;
import com.tools20022.repository.choice.FundParameters2Choice;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Specification of the request for report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#mmReportTypeRequested
 * RequestParameters.mmReportTypeRequested}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class RequestParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AdditionalReference3 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
		}
	};
	protected AdditionalReference3 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference3.mmObject();
		}
	};
	protected FundCashForecastParameters1 fundCashForecastReport;
	/**
	 * Parameters for which the fund cash forecast report is requested.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "FndCshFcstRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastReport";
			definition = "Parameters for which the fund cash forecast report is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters1.mmObject();
		}
	};
	protected List<FundParameters1Choice> fundProcessingPassportReport;
	/**
	 * Parameters for which the fund processing passport report is requested.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "FndPrcgPsptRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundProcessingPassportReport";
			definition = "Parameters for which the fund processing passport report is requested.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FundParameters1Choice.mmObject();
		}
	};
	protected FundParameters2Choice priceReport;
	/**
	 * Parameters for which the price report is requested.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "PricRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReport";
			definition = "Parameters for which the price report is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FundParameters2Choice.mmObject();
		}
	};
	protected StatementDetails statementByAccount;
	/**
	 * Account and statement parameters for which the statement is requested.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccount";
			definition = "Account and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
		}
	};
	protected StatementAndFinancialInstrumentDetails statementByAccountAndFinancialInstrument;
	/**
	 * Account, financial instrument and statement parameters for which the
	 * statement is requested.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcctAndFinInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccountAndFinancialInstrument";
			definition = "Account, financial instrument and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.mmObject();
		}
	};
	protected GenericReportParameters userDefinedReport;
	/**
	 * Parameters for which the user defined report is requested.
	 * <p>
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
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "UsrDfndRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.RequestParameters
	 * RequestParameters}</li>
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
	public static final MMXor mmReportTypeRequested = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTypeRequested";
			definition = "One element in the list (FundCashForecastReport, FundProcessingPassport, PriceReport,\nStatementByAccount, StatementByAccountAndFinancial Instrument, UserDefinedReport) must be present.";
			messageComponent_lazy = () -> RequestParameters.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RequestParameters";
				definition = "Specification of the request for report.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.mmReportTypeRequested);
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(com.tools20022.repository.msg.AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	public AdditionalReference3 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(com.tools20022.repository.msg.AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
	}

	public FundCashForecastParameters1 getFundCashForecastReport() {
		return fundCashForecastReport;
	}

	public void setFundCashForecastReport(com.tools20022.repository.msg.FundCashForecastParameters1 fundCashForecastReport) {
		this.fundCashForecastReport = fundCashForecastReport;
	}

	public List<FundParameters1Choice> getFundProcessingPassportReport() {
		return fundProcessingPassportReport;
	}

	public void setFundProcessingPassportReport(List<FundParameters1Choice> fundProcessingPassportReport) {
		this.fundProcessingPassportReport = fundProcessingPassportReport;
	}

	public FundParameters2Choice getPriceReport() {
		return priceReport;
	}

	public void setPriceReport(FundParameters2Choice priceReport) {
		this.priceReport = priceReport;
	}

	public StatementDetails getStatementByAccount() {
		return statementByAccount;
	}

	public void setStatementByAccount(com.tools20022.repository.msg.StatementDetails statementByAccount) {
		this.statementByAccount = statementByAccount;
	}

	public StatementAndFinancialInstrumentDetails getStatementByAccountAndFinancialInstrument() {
		return statementByAccountAndFinancialInstrument;
	}

	public void setStatementByAccountAndFinancialInstrument(com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails statementByAccountAndFinancialInstrument) {
		this.statementByAccountAndFinancialInstrument = statementByAccountAndFinancialInstrument;
	}

	public GenericReportParameters getUserDefinedReport() {
		return userDefinedReport;
	}

	public void setUserDefinedReport(com.tools20022.repository.msg.GenericReportParameters userDefinedReport) {
		this.userDefinedReport = userDefinedReport;
	}
}