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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General characteristics of the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmReportNumber
 * Report4.mmReportNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmQueryReference
 * Report4.mmQueryReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmReportIdentification
 * Report4.mmReportIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmReportDateTime
 * Report4.mmReportDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmCreationDateTime
 * Report4.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Report4#mmPreviousReportDateTime
 * Report4.mmPreviousReportDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmFrequency
 * Report4.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmUpdateType
 * Report4.mmUpdateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmReportBasis
 * Report4.mmReportBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmReportPeriod
 * Report4.mmReportPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmReportSource
 * Report4.mmReportSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmAuditedIndicator
 * Report4.mmAuditedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmActivityIndicator
 * Report4.mmActivityIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmReportGeneralDetails
 * TotalPortfolioValuationReportV01.mmReportGeneralDetails}</li>
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
 * "Report4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "General characteristics of the report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Report4", propOrder = {"reportNumber", "queryReference", "reportIdentification", "reportDateTime", "creationDateTime", "previousReportDateTime", "frequency", "updateType", "reportBasis", "reportPeriod", "reportSource",
		"auditedIndicator", "activityIndicator"})
public class Report4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max5NumericText reportNumber;
	/**
	 * Sequential number of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	protected Max35Text queryReference;
	/**
	 * Identification of the SecuritiesStatementQuery message sent to request
	 * this statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the SecuritiesStatementQuery message sent to request this statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the SecuritiesStatementQuery message sent to request this statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text reportIdentification;
	/**
	 * Unique identification of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique identification of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice reportDateTime;
	/**
	 * Date and time of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "RptDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateTime";
			definition = "Date and time of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice creationDateTime;
	/**
	 * Preparation date and time of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preparation date and time of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Preparation date and time of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice previousReportDateTime;
	/**
	 * Previous report date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRptDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReportDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous report date and time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousReportDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "PrvsRptDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReportDateTime";
			definition = "Previous report date and time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Frequency8Choice frequency;
	/**
	 * Specifies the frequency of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency8Choice
	 * Frequency8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Specifies the frequency of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency8Choice.mmObject();
		}
	};
	protected UpdateType4Choice updateType;
	/**
	 * Specifies whether the report is complete or contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType4Choice
	 * UpdateType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the report is complete or contains changes only."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType4Choice.mmObject();
		}
	};
	protected StatementBasis6Choice reportBasis;
	/**
	 * Specifies the type of balance on which the report is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasis6Choice
	 * StatementBasis6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of balance on which the report is prepared."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "RptBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportBasis";
			definition = "Specifies the type of balance on which the report is prepared.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementBasis6Choice.mmObject();
		}
	};
	protected DatePeriodDetails reportPeriod;
	/**
	 * Period for which the report is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for which the report is given."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "RptPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPeriod";
			definition = "Period for which the report is given.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	protected StatementSource1Choice reportSource;
	/**
	 * Specifies the source of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementSource1Choice
	 * StatementSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the source of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportSource = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "RptSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSource";
			definition = "Specifies the source of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementSource1Choice.mmObject();
		}
	};
	protected YesNoIndicator auditedIndicator;
	/**
	 * Indicates whether the report is audited or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AudtdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuditedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the report is audited or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuditedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "AudtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuditedIndicator";
			definition = "Indicates whether the report is audited or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator activityIndicator;
	/**
	 * Indicates whether there is activity or an information update reported in
	 * the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report4
	 * Report4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or an information update reported in the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Report4.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or an information update reported in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Report4.mmReportNumber, Report4.mmQueryReference, Report4.mmReportIdentification, Report4.mmReportDateTime, Report4.mmCreationDateTime, Report4.mmPreviousReportDateTime,
						Report4.mmFrequency, Report4.mmUpdateType, Report4.mmReportBasis, Report4.mmReportPeriod, Report4.mmReportSource, Report4.mmAuditedIndicator, Report4.mmActivityIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(TotalPortfolioValuationReportV01.mmReportGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Report4";
				definition = "General characteristics of the report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptNb")
	public Max5NumericText getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
	}

	@XmlElement(name = "QryRef")
	public Max35Text getQueryReference() {
		return queryReference;
	}

	public void setQueryReference(Max35Text queryReference) {
		this.queryReference = queryReference;
	}

	@XmlElement(name = "RptId")
	public Max35Text getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	@XmlElement(name = "RptDtTm", required = true)
	public DateAndDateTimeChoice getReportDateTime() {
		return reportDateTime;
	}

	public void setReportDateTime(DateAndDateTimeChoice reportDateTime) {
		this.reportDateTime = reportDateTime;
	}

	@XmlElement(name = "CreDtTm")
	public DateAndDateTimeChoice getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(DateAndDateTimeChoice creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "PrvsRptDtTm")
	public DateAndDateTimeChoice getPreviousReportDateTime() {
		return previousReportDateTime;
	}

	public void setPreviousReportDateTime(DateAndDateTimeChoice previousReportDateTime) {
		this.previousReportDateTime = previousReportDateTime;
	}

	@XmlElement(name = "Frqcy", required = true)
	public Frequency8Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency8Choice frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "UpdTp", required = true)
	public UpdateType4Choice getUpdateType() {
		return updateType;
	}

	public void setUpdateType(UpdateType4Choice updateType) {
		this.updateType = updateType;
	}

	@XmlElement(name = "RptBsis", required = true)
	public StatementBasis6Choice getReportBasis() {
		return reportBasis;
	}

	public void setReportBasis(StatementBasis6Choice reportBasis) {
		this.reportBasis = reportBasis;
	}

	@XmlElement(name = "RptPrd")
	public DatePeriodDetails getReportPeriod() {
		return reportPeriod;
	}

	public void setReportPeriod(com.tools20022.repository.msg.DatePeriodDetails reportPeriod) {
		this.reportPeriod = reportPeriod;
	}

	@XmlElement(name = "RptSrc")
	public StatementSource1Choice getReportSource() {
		return reportSource;
	}

	public void setReportSource(StatementSource1Choice reportSource) {
		this.reportSource = reportSource;
	}

	@XmlElement(name = "AudtdInd")
	public YesNoIndicator getAuditedIndicator() {
		return auditedIndicator;
	}

	public void setAuditedIndicator(YesNoIndicator auditedIndicator) {
		this.auditedIndicator = auditedIndicator;
	}

	@XmlElement(name = "ActvtyInd")
	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public void setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = activityIndicator;
	}
}