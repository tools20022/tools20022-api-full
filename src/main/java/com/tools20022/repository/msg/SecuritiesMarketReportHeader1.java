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
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.choice.TradingVenueIdentification1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the securities market transaction report related header details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1#ReportingEntity
 * SecuritiesMarketReportHeader1.ReportingEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1#ReportingPeriod
 * SecuritiesMarketReportHeader1.ReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1#SubmissionDateTime
 * SecuritiesMarketReportHeader1.SubmissionDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#ReportHeader
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#ReportHeader
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01#ReportHeader
 * FinancialInstrumentReportingEquityTradingActivityResultV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01#ReportHeader
 * FinancialInstrumentReportingEquityTransparencyDataReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01#ReportHeader
 * FinancialInstrumentReportingReferenceDataReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01#ReportHeader
 * FinancialInstrumentReportingNonWorkingDayReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#ReportHeader
 * FinancialInstrumentReportingEquityTradingActivityReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#ReportHeader
 * FinancialInstrumentReportingReferenceDataIndexReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01#ReportHeader
 * FinancialInstrumentReportingNonEquityTransparencyDataReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01#ReportHeader
 * FinancialInstrumentReportingReferenceDataDeltaReportV01.ReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityReportV01#ReportHeader
 * FinancialInstrumentReportingNonEquityTradingActivityReportV01.ReportHeader}</li>
 * </ul>
 * </li>
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
 * "SecuritiesMarketReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the securities market transaction report related header details."</li>
 * </ul>
 */
public class SecuritiesMarketReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the venue which generates the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the venue which generates the report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReportingEntity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgNtty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingEntity";
			definition = "Identification of the venue which generates the report.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingVenueIdentification1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date or date range the report relates to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date or date range the report relates to."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReportingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Date or date range the report relates to.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Period4Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date and time of the report originally submitted by the reporting entity
	 * when the file is generated for submission to their reporting authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmissnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the report originally submitted by the reporting entity when the file is generated for submission to their reporting authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubmissionDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "SubmissnDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDateTime";
			definition = "Date and time of the report originally submitted by the reporting entity when the file is generated for submission to their reporting authority.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesMarketReportHeader1.ReportingEntity, com.tools20022.repository.msg.SecuritiesMarketReportHeader1.ReportingPeriod,
						com.tools20022.repository.msg.SecuritiesMarketReportHeader1.SubmissionDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01.ReportHeader, com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01.ReportHeader, com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01.ReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityReportV01.ReportHeader);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesMarketReportHeader1";
				definition = "Provides the securities market transaction report related header details.";
			}
		});
		return mmObject_lazy.get();
	}
}