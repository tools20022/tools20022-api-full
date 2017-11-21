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
import com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01;
import com.tools20022.repository.codeset.StatisticalReportingStatus1Code;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the money market statistical status report header details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportingAgent
 * MoneyMarketStatusReportHeader1.mmReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportingPeriod
 * MoneyMarketStatusReportHeader1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportStatus
 * MoneyMarketStatusReportHeader1.mmReportStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmValidationRule
 * MoneyMarketStatusReportHeader1.mmValidationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01#mmStatusReportHeader
 * MoneyMarketStatisticalReportStatusAdviceV01.mmStatusReportHeader}</li>
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
 * "MoneyMarketStatusReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the money market statistical status report header details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
 * InvoiceTaxStatusReportHeader1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MoneyMarketStatusReportHeader1", propOrder = {"reportingAgent", "reportingPeriod", "reportStatus", "validationRule"})
public class MoneyMarketStatusReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LEIIdentifier reportingAgent;
	/**
	 * Agent which is subject to reporting requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent which is subject to reporting requirements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingAgent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Agent which is subject to reporting requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected DateTimePeriod1 reportingPeriod;
	/**
	 * For daily reporting this is the day to which the transaction data in the
	 * status message refers (trade date or amendment date if there are
	 * corrections).<br>
	 * For periodic reporting this is the first and the last day to which the
	 * transaction data in the status message refers (trade date or amendment
	 * date in case of corrections).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
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
	 * definition} =
	 * "For daily reporting this is the day to which the transaction data in the status message refers (trade date or amendment date if there are corrections).\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers (trade date or amendment date in case of corrections)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "For daily reporting this is the day to which the transaction data in the status message refers (trade date or amendment date if there are corrections).\r\nFor periodic reporting this is the first and the last day to which the transaction data in the status message refers (trade date or amendment date in case of corrections).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriod1.mmObject();
		}
	};
	protected StatisticalReportingStatus1Code reportStatus;
	/**
	 * Provides the status for the full report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
	 * StatisticalReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status for the full report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmReportStatus
	 * InvoiceTaxStatusReportHeader1.mmReportStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportStatus";
			definition = "Provides the status for the full report.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceTaxStatusReportHeader1.mmReportStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatisticalReportingStatus1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericValidationRuleIdentification1> validationRule;
	/**
	 * Provides the details of the rule which could not be validated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
	 * GenericValidationRuleIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
	 * MoneyMarketStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of the rule which could not be validated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmValidationRule
	 * InvoiceTaxStatusReportHeader1.mmValidationRule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidationRule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MoneyMarketStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "VldtnRule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationRule";
			definition = "Provides the details of the rule which could not be validated.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceTaxStatusReportHeader1.mmValidationRule);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericValidationRuleIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MoneyMarketStatusReportHeader1.mmReportingAgent, MoneyMarketStatusReportHeader1.mmReportingPeriod, MoneyMarketStatusReportHeader1.mmReportStatus,
						MoneyMarketStatusReportHeader1.mmValidationRule);
				messageBuildingBlock_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportStatusAdviceV01.mmStatusReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketStatusReportHeader1";
				definition = "Provides the money market statistical status report header details.";
				nextVersions_lazy = () -> Arrays.asList(InvoiceTaxStatusReportHeader1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptgAgt", required = true)
	public LEIIdentifier getReportingAgent() {
		return reportingAgent;
	}

	public void setReportingAgent(LEIIdentifier reportingAgent) {
		this.reportingAgent = reportingAgent;
	}

	@XmlElement(name = "RptgPrd", required = true)
	public DateTimePeriod1 getReportingPeriod() {
		return reportingPeriod;
	}

	public void setReportingPeriod(com.tools20022.repository.msg.DateTimePeriod1 reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
	}

	@XmlElement(name = "RptSts", required = true)
	public StatisticalReportingStatus1Code getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(StatisticalReportingStatus1Code reportStatus) {
		this.reportStatus = reportStatus;
	}

	@XmlElement(name = "VldtnRule")
	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule;
	}

	public void setValidationRule(List<com.tools20022.repository.msg.GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = validationRule;
	}
}