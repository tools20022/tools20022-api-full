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
import com.tools20022.repository.msg.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specification of the request for report."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, AdditionalReference3> mmPreviousReference = new MMMessageAssociationEnd<RequestParameters, AdditionalReference3>() {
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
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public AdditionalReference3 getValue(RequestParameters obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(RequestParameters obj, AdditionalReference3 value) {
			obj.setPreviousReference(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, Optional<AdditionalReference3>> mmRelatedReference = new MMMessageAssociationEnd<RequestParameters, Optional<AdditionalReference3>>() {
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
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(RequestParameters obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(RequestParameters obj, Optional<AdditionalReference3> value) {
			obj.setRelatedReference(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCashForecastReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for which the fund cash forecast report is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, FundCashForecastParameters1> mmFundCashForecastReport = new MMMessageAssociationEnd<RequestParameters, FundCashForecastParameters1>() {
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
			type_lazy = () -> FundCashForecastParameters1.mmObject();
		}

		@Override
		public FundCashForecastParameters1 getValue(RequestParameters obj) {
			return obj.getFundCashForecastReport();
		}

		@Override
		public void setValue(RequestParameters obj, FundCashForecastParameters1 value) {
			obj.setFundCashForecastReport(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundProcessingPassportReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for which the fund processing passport report is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, List<FundParameters1Choice>> mmFundProcessingPassportReport = new MMMessageAssociationEnd<RequestParameters, List<FundParameters1Choice>>() {
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

		@Override
		public List<FundParameters1Choice> getValue(RequestParameters obj) {
			return obj.getFundProcessingPassportReport();
		}

		@Override
		public void setValue(RequestParameters obj, List<FundParameters1Choice> value) {
			obj.setFundProcessingPassportReport(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters for which the price report is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, FundParameters2Choice> mmPriceReport = new MMMessageAssociationEnd<RequestParameters, FundParameters2Choice>() {
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

		@Override
		public FundParameters2Choice getValue(RequestParameters obj) {
			return obj.getPriceReport();
		}

		@Override
		public void setValue(RequestParameters obj, FundParameters2Choice value) {
			obj.setPriceReport(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and statement parameters for which the statement is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, StatementDetails> mmStatementByAccount = new MMMessageAssociationEnd<RequestParameters, StatementDetails>() {
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
			type_lazy = () -> StatementDetails.mmObject();
		}

		@Override
		public StatementDetails getValue(RequestParameters obj) {
			return obj.getStatementByAccount();
		}

		@Override
		public void setValue(RequestParameters obj, StatementDetails value) {
			obj.setStatementByAccount(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccountAndFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account, financial instrument and statement parameters for which the statement is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, StatementAndFinancialInstrumentDetails> mmStatementByAccountAndFinancialInstrument = new MMMessageAssociationEnd<RequestParameters, StatementAndFinancialInstrumentDetails>() {
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
			type_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
		}

		@Override
		public StatementAndFinancialInstrumentDetails getValue(RequestParameters obj) {
			return obj.getStatementByAccountAndFinancialInstrument();
		}

		@Override
		public void setValue(RequestParameters obj, StatementAndFinancialInstrumentDetails value) {
			obj.setStatementByAccountAndFinancialInstrument(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefinedReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for which the user defined report is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestParameters, GenericReportParameters> mmUserDefinedReport = new MMMessageAssociationEnd<RequestParameters, GenericReportParameters>() {
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
			type_lazy = () -> GenericReportParameters.mmObject();
		}

		@Override
		public GenericReportParameters getValue(RequestParameters obj) {
			return obj.getUserDefinedReport();
		}

		@Override
		public void setValue(RequestParameters obj, GenericReportParameters value) {
			obj.setUserDefinedReport(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTypeRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One element in the list (FundCashForecastReport, FundProcessingPassport, PriceReport,\nStatementByAccount, StatementByAccountAndFinancial Instrument, UserDefinedReport) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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

	public RequestParameters setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public RequestParameters setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public FundCashForecastParameters1 getFundCashForecastReport() {
		return fundCashForecastReport;
	}

	public RequestParameters setFundCashForecastReport(FundCashForecastParameters1 fundCashForecastReport) {
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

	public RequestParameters setStatementByAccount(StatementDetails statementByAccount) {
		this.statementByAccount = Objects.requireNonNull(statementByAccount);
		return this;
	}

	public StatementAndFinancialInstrumentDetails getStatementByAccountAndFinancialInstrument() {
		return statementByAccountAndFinancialInstrument;
	}

	public RequestParameters setStatementByAccountAndFinancialInstrument(StatementAndFinancialInstrumentDetails statementByAccountAndFinancialInstrument) {
		this.statementByAccountAndFinancialInstrument = Objects.requireNonNull(statementByAccountAndFinancialInstrument);
		return this;
	}

	public GenericReportParameters getUserDefinedReport() {
		return userDefinedReport;
	}

	public RequestParameters setUserDefinedReport(GenericReportParameters userDefinedReport) {
		this.userDefinedReport = Objects.requireNonNull(userDefinedReport);
		return this;
	}
}