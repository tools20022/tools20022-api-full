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
import com.tools20022.repository.msg.DatePeriodDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Report4", propOrder = {"reportNumber", "queryReference", "reportIdentification", "reportDateTime", "creationDateTime", "previousReportDateTime", "frequency", "updateType", "reportBasis", "reportPeriod", "reportSource",
		"auditedIndicator", "activityIndicator"})
public class Report4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptNb")
	protected Max5NumericText reportNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Optional<Max5NumericText>> mmReportNumber = new MMMessageAttribute<Report4, Optional<Max5NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(Report4 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(Report4 obj, Optional<Max5NumericText> value) {
			obj.setReportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "QryRef")
	protected Max35Text queryReference;
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
	public static final MMMessageAttribute<Report4, Optional<Max35Text>> mmQueryReference = new MMMessageAttribute<Report4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the SecuritiesStatementQuery message sent to request this statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Report4 obj) {
			return obj.getQueryReference();
		}

		@Override
		public void setValue(Report4 obj, Optional<Max35Text> value) {
			obj.setQueryReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RptId")
	protected Max35Text reportIdentification;
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
	public static final MMMessageAttribute<Report4, Optional<Max35Text>> mmReportIdentification = new MMMessageAttribute<Report4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique identification of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Report4 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(Report4 obj, Optional<Max35Text> value) {
			obj.setReportIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RptDtTm", required = true)
	protected DateAndDateTimeChoice reportDateTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, DateAndDateTimeChoice> mmReportDateTime = new MMMessageAttribute<Report4, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "RptDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateTime";
			definition = "Date and time of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Report4 obj) {
			return obj.getReportDateTime();
		}

		@Override
		public void setValue(Report4 obj, DateAndDateTimeChoice value) {
			obj.setReportDateTime(value);
		}
	};
	@XmlElement(name = "CreDtTm")
	protected DateAndDateTimeChoice creationDateTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Optional<DateAndDateTimeChoice>> mmCreationDateTime = new MMMessageAttribute<Report4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Preparation date and time of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(Report4 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(Report4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setCreationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRptDtTm")
	protected DateAndDateTimeChoice previousReportDateTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Optional<DateAndDateTimeChoice>> mmPreviousReportDateTime = new MMMessageAttribute<Report4, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "PrvsRptDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReportDateTime";
			definition = "Previous report date and time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(Report4 obj) {
			return obj.getPreviousReportDateTime();
		}

		@Override
		public void setValue(Report4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setPreviousReportDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency8Choice frequency;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Frequency8Choice> mmFrequency = new MMMessageAttribute<Report4, Frequency8Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Specifies the frequency of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency8Choice.mmObject();
		}

		@Override
		public Frequency8Choice getValue(Report4 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Report4 obj, Frequency8Choice value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected UpdateType4Choice updateType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, UpdateType4Choice> mmUpdateType = new MMMessageAttribute<Report4, UpdateType4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType4Choice.mmObject();
		}

		@Override
		public UpdateType4Choice getValue(Report4 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Report4 obj, UpdateType4Choice value) {
			obj.setUpdateType(value);
		}
	};
	@XmlElement(name = "RptBsis", required = true)
	protected StatementBasis6Choice reportBasis;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, StatementBasis6Choice> mmReportBasis = new MMMessageAttribute<Report4, StatementBasis6Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "RptBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportBasis";
			definition = "Specifies the type of balance on which the report is prepared.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementBasis6Choice.mmObject();
		}

		@Override
		public StatementBasis6Choice getValue(Report4 obj) {
			return obj.getReportBasis();
		}

		@Override
		public void setValue(Report4 obj, StatementBasis6Choice value) {
			obj.setReportBasis(value);
		}
	};
	@XmlElement(name = "RptPrd")
	protected DatePeriodDetails reportPeriod;
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
	public static final MMMessageAttribute<Report4, Optional<DatePeriodDetails>> mmReportPeriod = new MMMessageAttribute<Report4, Optional<DatePeriodDetails>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "RptPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPeriod";
			definition = "Period for which the report is given.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public Optional<DatePeriodDetails> getValue(Report4 obj) {
			return obj.getReportPeriod();
		}

		@Override
		public void setValue(Report4 obj, Optional<DatePeriodDetails> value) {
			obj.setReportPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RptSrc")
	protected StatementSource1Choice reportSource;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Optional<StatementSource1Choice>> mmReportSource = new MMMessageAttribute<Report4, Optional<StatementSource1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "RptSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSource";
			definition = "Specifies the source of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementSource1Choice.mmObject();
		}

		@Override
		public Optional<StatementSource1Choice> getValue(Report4 obj) {
			return obj.getReportSource();
		}

		@Override
		public void setValue(Report4 obj, Optional<StatementSource1Choice> value) {
			obj.setReportSource(value.orElse(null));
		}
	};
	@XmlElement(name = "AudtdInd")
	protected YesNoIndicator auditedIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Optional<YesNoIndicator>> mmAuditedIndicator = new MMMessageAttribute<Report4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "AudtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuditedIndicator";
			definition = "Indicates whether the report is audited or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Report4 obj) {
			return obj.getAuditedIndicator();
		}

		@Override
		public void setValue(Report4 obj, Optional<YesNoIndicator> value) {
			obj.setAuditedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ActvtyInd")
	protected YesNoIndicator activityIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Report4, Optional<YesNoIndicator>> mmActivityIndicator = new MMMessageAttribute<Report4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report4.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or an information update reported in the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Report4 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(Report4 obj, Optional<YesNoIndicator> value) {
			obj.setActivityIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Report4.mmReportNumber, com.tools20022.repository.msg.Report4.mmQueryReference, com.tools20022.repository.msg.Report4.mmReportIdentification,
						com.tools20022.repository.msg.Report4.mmReportDateTime, com.tools20022.repository.msg.Report4.mmCreationDateTime, com.tools20022.repository.msg.Report4.mmPreviousReportDateTime,
						com.tools20022.repository.msg.Report4.mmFrequency, com.tools20022.repository.msg.Report4.mmUpdateType, com.tools20022.repository.msg.Report4.mmReportBasis, com.tools20022.repository.msg.Report4.mmReportPeriod,
						com.tools20022.repository.msg.Report4.mmReportSource, com.tools20022.repository.msg.Report4.mmAuditedIndicator, com.tools20022.repository.msg.Report4.mmActivityIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(TotalPortfolioValuationReportV01.mmReportGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Report4";
				definition = "General characteristics of the report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max5NumericText> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public Report4 setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public Optional<Max35Text> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public Report4 setQueryReference(Max35Text queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Optional<Max35Text> getReportIdentification() {
		return reportIdentification == null ? Optional.empty() : Optional.of(reportIdentification);
	}

	public Report4 setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
		return this;
	}

	public DateAndDateTimeChoice getReportDateTime() {
		return reportDateTime;
	}

	public Report4 setReportDateTime(DateAndDateTimeChoice reportDateTime) {
		this.reportDateTime = Objects.requireNonNull(reportDateTime);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public Report4 setCreationDateTime(DateAndDateTimeChoice creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPreviousReportDateTime() {
		return previousReportDateTime == null ? Optional.empty() : Optional.of(previousReportDateTime);
	}

	public Report4 setPreviousReportDateTime(DateAndDateTimeChoice previousReportDateTime) {
		this.previousReportDateTime = previousReportDateTime;
		return this;
	}

	public Frequency8Choice getFrequency() {
		return frequency;
	}

	public Report4 setFrequency(Frequency8Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public UpdateType4Choice getUpdateType() {
		return updateType;
	}

	public Report4 setUpdateType(UpdateType4Choice updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public StatementBasis6Choice getReportBasis() {
		return reportBasis;
	}

	public Report4 setReportBasis(StatementBasis6Choice reportBasis) {
		this.reportBasis = Objects.requireNonNull(reportBasis);
		return this;
	}

	public Optional<DatePeriodDetails> getReportPeriod() {
		return reportPeriod == null ? Optional.empty() : Optional.of(reportPeriod);
	}

	public Report4 setReportPeriod(DatePeriodDetails reportPeriod) {
		this.reportPeriod = reportPeriod;
		return this;
	}

	public Optional<StatementSource1Choice> getReportSource() {
		return reportSource == null ? Optional.empty() : Optional.of(reportSource);
	}

	public Report4 setReportSource(StatementSource1Choice reportSource) {
		this.reportSource = reportSource;
		return this;
	}

	public Optional<YesNoIndicator> getAuditedIndicator() {
		return auditedIndicator == null ? Optional.empty() : Optional.of(auditedIndicator);
	}

	public Report4 setAuditedIndicator(YesNoIndicator auditedIndicator) {
		this.auditedIndicator = auditedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getActivityIndicator() {
		return activityIndicator == null ? Optional.empty() : Optional.of(activityIndicator);
	}

	public Report4 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = activityIndicator;
		return this;
	}
}