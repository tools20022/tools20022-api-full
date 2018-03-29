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
import com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01;
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.choice.Frequency4Choice;
import com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification38;
import com.tools20022.repository.msg.QueryReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General characteristics related to a statement which reports information for
 * a precise date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmReportNumber
 * Report3.mmReportNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmQueryReference
 * Report3.mmQueryReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmReportIdentification
 * Report3.mmReportIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmReportDateTime
 * Report3.mmReportDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmFrequency
 * Report3.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmUpdateType
 * Report3.mmUpdateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report3#mmNoticeType
 * Report3.mmNoticeType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmReportGeneralDetails
 * SecuritiesEndOfProcessReportV01.mmReportGeneralDetails}</li>
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
 * "Report3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information for a precise date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Report3", propOrder = {"reportNumber", "queryReference", "reportIdentification", "reportDateTime", "frequency", "updateType", "noticeType"})
public class Report3 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
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
	public static final MMMessageAttribute<Report3, Optional<Max5NumericText>> mmReportNumber = new MMMessageAttribute<Report3, Optional<Max5NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
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
		public Optional<Max5NumericText> getValue(Report3 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(Report3 obj, Optional<Max5NumericText> value) {
			obj.setReportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "QryRef")
	protected QueryReference queryReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.QueryReference
	 * QueryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
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
	 * definition} = "Gives the name and the reference of the query."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Report3, Optional<QueryReference>> mmQueryReference = new MMMessageAttribute<Report3, Optional<QueryReference>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Gives the name and the reference of the query.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QueryReference.mmObject();
		}

		@Override
		public Optional<QueryReference> getValue(Report3 obj) {
			return obj.getQueryReference();
		}

		@Override
		public void setValue(Report3 obj, Optional<QueryReference> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
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
	 * definition} = "Reference of the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Report3, Optional<Max35Text>> mmReportIdentification = new MMMessageAttribute<Report3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Reference of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Report3 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(Report3 obj, Optional<Max35Text> value) {
			obj.setReportIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RptDtTm", required = true)
	protected DateAndDateTime1Choice reportDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
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
	 * definition} = "Date of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Report3, DateAndDateTime1Choice> mmReportDateTime = new MMMessageAttribute<Report3, DateAndDateTime1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
			isDerived = false;
			xmlTag = "RptDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateTime";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public DateAndDateTime1Choice getValue(Report3 obj) {
			return obj.getReportDateTime();
		}

		@Override
		public void setValue(Report3 obj, DateAndDateTime1Choice value) {
			obj.setReportDateTime(value);
		}
	};
	@XmlElement(name = "Frqcy")
	protected Frequency4Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency4Choice
	 * Frequency4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
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
	 * definition} = "Specifies the regularity of an event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Report3, Optional<Frequency4Choice>> mmFrequency = new MMMessageAttribute<Report3, Optional<Frequency4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Specifies the regularity of an event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency4Choice.mmObject();
		}

		@Override
		public Optional<Frequency4Choice> getValue(Report3 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Report3 obj, Optional<Frequency4Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdTp")
	protected StatementUpdateTypeCodeAndDSSCodeChoice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice
	 * StatementUpdateTypeCodeAndDSSCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
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
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Report3, Optional<StatementUpdateTypeCodeAndDSSCodeChoice>> mmUpdateType = new MMMessageAttribute<Report3, Optional<StatementUpdateTypeCodeAndDSSCodeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementUpdateTypeCodeAndDSSCodeChoice.mmObject();
		}

		@Override
		public Optional<StatementUpdateTypeCodeAndDSSCodeChoice> getValue(Report3 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Report3 obj, Optional<StatementUpdateTypeCodeAndDSSCodeChoice> value) {
			obj.setUpdateType(value.orElse(null));
		}
	};
	@XmlElement(name = "NtceTp")
	protected GenericIdentification38 noticeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification38
	 * GenericIdentification38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Report3
	 * Report3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtceTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notifies the type of report transmitted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Report3, Optional<GenericIdentification38>> mmNoticeType = new MMMessageAttribute<Report3, Optional<GenericIdentification38>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Report3.mmObject();
			isDerived = false;
			xmlTag = "NtceTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoticeType";
			definition = "Notifies the type of report transmitted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification38.mmObject();
		}

		@Override
		public Optional<GenericIdentification38> getValue(Report3 obj) {
			return obj.getNoticeType();
		}

		@Override
		public void setValue(Report3 obj, Optional<GenericIdentification38> value) {
			obj.setNoticeType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Report3.mmReportNumber, com.tools20022.repository.msg.Report3.mmQueryReference, com.tools20022.repository.msg.Report3.mmReportIdentification,
						com.tools20022.repository.msg.Report3.mmReportDateTime, com.tools20022.repository.msg.Report3.mmFrequency, com.tools20022.repository.msg.Report3.mmUpdateType, com.tools20022.repository.msg.Report3.mmNoticeType);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesEndOfProcessReportV01.mmReportGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Report3";
				definition = "General characteristics related to a statement which reports information for a precise date.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max5NumericText> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public Report3 setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public Optional<QueryReference> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public Report3 setQueryReference(QueryReference queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Optional<Max35Text> getReportIdentification() {
		return reportIdentification == null ? Optional.empty() : Optional.of(reportIdentification);
	}

	public Report3 setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
		return this;
	}

	public DateAndDateTime1Choice getReportDateTime() {
		return reportDateTime;
	}

	public Report3 setReportDateTime(DateAndDateTime1Choice reportDateTime) {
		this.reportDateTime = Objects.requireNonNull(reportDateTime);
		return this;
	}

	public Optional<Frequency4Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public Report3 setFrequency(Frequency4Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<StatementUpdateTypeCodeAndDSSCodeChoice> getUpdateType() {
		return updateType == null ? Optional.empty() : Optional.of(updateType);
	}

	public Report3 setUpdateType(StatementUpdateTypeCodeAndDSSCodeChoice updateType) {
		this.updateType = updateType;
		return this;
	}

	public Optional<GenericIdentification38> getNoticeType() {
		return noticeType == null ? Optional.empty() : Optional.of(noticeType);
	}

	public Report3 setNoticeType(GenericIdentification38 noticeType) {
		this.noticeType = noticeType;
		return this;
	}
}