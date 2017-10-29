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
 * {@linkplain com.tools20022.repository.msg.RequestParameters#PreviousReference
 * RequestParameters.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#RelatedReference
 * RequestParameters.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#FundCashForecastReport
 * RequestParameters.FundCashForecastReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#FundProcessingPassportReport
 * RequestParameters.FundProcessingPassportReport}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestParameters#PriceReport
 * RequestParameters.PriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#StatementByAccount
 * RequestParameters.StatementByAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#StatementByAccountAndFinancialInstrument
 * RequestParameters.StatementByAccountAndFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestParameters#UserDefinedReport
 * RequestParameters.UserDefinedReport}</li>
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
public class RequestParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAssociationEnd PreviousReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AdditionalReference3.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd RelatedReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AdditionalReference3.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd FundCashForecastReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "FndCshFcstRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashForecastReport";
			definition = "Parameters for which the fund cash forecast report is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FundCashForecastParameters1.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd FundProcessingPassportReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "FndPrcgPsptRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundProcessingPassportReport";
			definition = "Parameters for which the fund processing passport report is requested.";
			minOccurs = 1;
			type_lazy = () -> FundParameters1Choice.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd PriceReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "PricRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReport";
			definition = "Parameters for which the price report is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FundParameters2Choice.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd StatementByAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccount";
			definition = "Account and statement parameters for which the statement is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StatementDetails.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd StatementByAccountAndFinancialInstrument = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcctAndFinInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccountAndFinancialInstrument";
			definition = "Account, financial instrument and statement parameters for which the statement is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isComposite = true;
		}
	};
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
	public static final MMMessageAssociationEnd UserDefinedReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RequestParameters.mmObject();
			isDerived = false;
			xmlTag = "UsrDfndRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedReport";
			definition = "Parameters for which the user defined report is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericReportParameters.mmObject();
			isComposite = true;
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
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#FundCashForecastReport
	 * RequestParameters.FundCashForecastReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#FundProcessingPassportReport
	 * RequestParameters.FundProcessingPassportReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#PriceReport
	 * RequestParameters.PriceReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#StatementByAccount
	 * RequestParameters.StatementByAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#StatementByAccountAndFinancialInstrument
	 * RequestParameters.StatementByAccountAndFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestParameters#UserDefinedReport
	 * RequestParameters.UserDefinedReport}</li>
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
	public static final MMXor ReportTypeRequested = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTypeRequested";
			definition = "One element in the list (FundCashForecastReport, FundProcessingPassport, PriceReport,\nStatementByAccount, StatementByAccountAndFinancial Instrument, UserDefinedReport) must be present.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.FundCashForecastReport, com.tools20022.repository.msg.RequestParameters.FundProcessingPassportReport,
					com.tools20022.repository.msg.RequestParameters.PriceReport, com.tools20022.repository.msg.RequestParameters.StatementByAccount, com.tools20022.repository.msg.RequestParameters.StatementByAccountAndFinancialInstrument,
					com.tools20022.repository.msg.RequestParameters.UserDefinedReport);
			messageComponent_lazy = () -> RequestParameters.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.PreviousReference, com.tools20022.repository.msg.RequestParameters.RelatedReference,
						com.tools20022.repository.msg.RequestParameters.FundCashForecastReport, com.tools20022.repository.msg.RequestParameters.FundProcessingPassportReport, com.tools20022.repository.msg.RequestParameters.PriceReport,
						com.tools20022.repository.msg.RequestParameters.StatementByAccount, com.tools20022.repository.msg.RequestParameters.StatementByAccountAndFinancialInstrument,
						com.tools20022.repository.msg.RequestParameters.UserDefinedReport);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
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
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestParameters.ReportTypeRequested);
			}
		});
		return mmObject_lazy.get();
	}
}