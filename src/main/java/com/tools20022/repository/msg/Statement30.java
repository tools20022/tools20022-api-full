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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.choice.Frequency6Choice;
import com.tools20022.repository.choice.UpdateType3Choice;
import com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code;
import com.tools20022.repository.codeset.CorporateActionStatementType1Code;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General characteristics related to a statement which reports information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement30#mmStatementType
 * Statement30.mmStatementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement30#mmReportingType
 * Statement30.mmReportingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement30#mmStatementIdentification
 * Statement30.mmStatementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement30#mmReportNumber
 * Statement30.mmReportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement30#mmStatementDateTime
 * Statement30.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement30#mmFrequency
 * Statement30.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement30#mmUpdateType
 * Statement30.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement30#mmActivityIndicator
 * Statement30.mmActivityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement30#mmNotificationDeadlinePeriod
 * Statement30.mmNotificationDeadlinePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Statement30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forStatement30
 * ConstraintCoexistenceIdentificationRule.forStatement30}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement30", propOrder = {"statementType", "reportingType", "statementIdentification", "reportNumber", "statementDateTime", "frequency", "updateType", "activityIndicator", "notificationDeadlinePeriod"})
public class Statement30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtTp", required = true)
	protected CorporateActionStatementType1Code statementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementType1Code
	 * CorporateActionStatementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement contains missing instructions only or all instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement30, CorporateActionStatementType1Code> mmStatementType = new MMMessageAttribute<Statement30, CorporateActionStatementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Indicates whether the statement contains missing instructions only or all instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionStatementType1Code.mmObject();
		}

		@Override
		public CorporateActionStatementType1Code getValue(Statement30 obj) {
			return obj.getStatementType();
		}

		@Override
		public void setValue(Statement30 obj, CorporateActionStatementType1Code value) {
			obj.setStatementType(value);
		}
	};
	@XmlElement(name = "RptgTp", required = true)
	protected CorporateActionStatementReportingType1Code reportingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code
	 * CorporateActionStatementReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement report on account holdings for corporate action events is for single account/multiple events or multiple accounts/single event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement30, CorporateActionStatementReportingType1Code> mmReportingType = new MMMessageAttribute<Statement30, CorporateActionStatementReportingType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "RptgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingType";
			definition = "Indicates whether the statement report on account holdings for corporate action events is for single account/multiple events or multiple accounts/single event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionStatementReportingType1Code.mmObject();
		}

		@Override
		public CorporateActionStatementReportingType1Code getValue(Statement30 obj) {
			return obj.getReportingType();
		}

		@Override
		public void setValue(Statement30 obj, CorporateActionStatementReportingType1Code value) {
			obj.setReportingType(value);
		}
	};
	@XmlElement(name = "StmtId", required = true)
	protected RestrictedFINXMax16Text statementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement30, RestrictedFINXMax16Text> mmStatementIdentification = new MMMessageAttribute<Statement30, RestrictedFINXMax16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(Statement30 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(Statement30 obj, RestrictedFINXMax16Text value) {
			obj.setStatementIdentification(value);
		}
	};
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement30, Optional<Max5NumericText>> mmReportNumber = new MMMessageAttribute<Statement30, Optional<Max5NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(Statement30 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(Statement30 obj, Optional<Max5NumericText> value) {
			obj.setReportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtDtTm", required = true)
	protected DateAndDateTimeChoice statementDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement30, DateAndDateTimeChoice> mmStatementDateTime = new MMMessageAssociationEnd<Statement30, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Statement30 obj) {
			return obj.getStatementDateTime();
		}

		@Override
		public void setValue(Statement30 obj, DateAndDateTimeChoice value) {
			obj.setStatementDateTime(value);
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency6Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency6Choice
	 * Frequency6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SFRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement30, Frequency6Choice> mmFrequency = new MMMessageAssociationEnd<Statement30, Frequency6Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Frequency6Choice.mmObject();
		}

		@Override
		public Frequency6Choice getValue(Statement30 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Statement30 obj, Frequency6Choice value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected UpdateType3Choice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType3Choice
	 * UpdateType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CODE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement30, UpdateType3Choice> mmUpdateType = new MMMessageAssociationEnd<Statement30, UpdateType3Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CODE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UpdateType3Choice.mmObject();
		}

		@Override
		public UpdateType3Choice getValue(Statement30 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Statement30 obj, UpdateType3Choice value) {
			obj.setUpdateType(value);
		}
	};
	@XmlElement(name = "ActvtyInd", required = true)
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACTI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement30, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<Statement30, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Statement30 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(Statement30 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};
	@XmlElement(name = "NtfctnDdlnPrd")
	protected DateOrDateTimePeriodChoice notificationDeadlinePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement30 Statement30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnDdlnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationDeadlinePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which identification deadline has been set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement30, Optional<DateOrDateTimePeriodChoice>> mmNotificationDeadlinePeriod = new MMMessageAssociationEnd<Statement30, Optional<DateOrDateTimePeriodChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement30.mmObject();
			isDerived = false;
			xmlTag = "NtfctnDdlnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationDeadlinePeriod";
			definition = "Period during which identification deadline has been set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateOrDateTimePeriodChoice> getValue(Statement30 obj) {
			return obj.getNotificationDeadlinePeriod();
		}

		@Override
		public void setValue(Statement30 obj, Optional<DateOrDateTimePeriodChoice> value) {
			obj.setNotificationDeadlinePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement30.mmStatementType, com.tools20022.repository.msg.Statement30.mmReportingType,
						com.tools20022.repository.msg.Statement30.mmStatementIdentification, com.tools20022.repository.msg.Statement30.mmReportNumber, com.tools20022.repository.msg.Statement30.mmStatementDateTime,
						com.tools20022.repository.msg.Statement30.mmFrequency, com.tools20022.repository.msg.Statement30.mmUpdateType, com.tools20022.repository.msg.Statement30.mmActivityIndicator,
						com.tools20022.repository.msg.Statement30.mmNotificationDeadlinePeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forStatement30);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Statement30";
				definition = "General characteristics related to a statement which reports information.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionStatementType1Code getStatementType() {
		return statementType;
	}

	public Statement30 setStatementType(CorporateActionStatementType1Code statementType) {
		this.statementType = Objects.requireNonNull(statementType);
		return this;
	}

	public CorporateActionStatementReportingType1Code getReportingType() {
		return reportingType;
	}

	public Statement30 setReportingType(CorporateActionStatementReportingType1Code reportingType) {
		this.reportingType = Objects.requireNonNull(reportingType);
		return this;
	}

	public RestrictedFINXMax16Text getStatementIdentification() {
		return statementIdentification;
	}

	public Statement30 setStatementIdentification(RestrictedFINXMax16Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public Optional<Max5NumericText> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public Statement30 setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public Statement30 setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = Objects.requireNonNull(statementDateTime);
		return this;
	}

	public Frequency6Choice getFrequency() {
		return frequency;
	}

	public Statement30 setFrequency(Frequency6Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public UpdateType3Choice getUpdateType() {
		return updateType;
	}

	public Statement30 setUpdateType(UpdateType3Choice updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public Statement30 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}

	public Optional<DateOrDateTimePeriodChoice> getNotificationDeadlinePeriod() {
		return notificationDeadlinePeriod == null ? Optional.empty() : Optional.of(notificationDeadlinePeriod);
	}

	public Statement30 setNotificationDeadlinePeriod(DateOrDateTimePeriodChoice notificationDeadlinePeriod) {
		this.notificationDeadlinePeriod = notificationDeadlinePeriod;
		return this;
	}
}