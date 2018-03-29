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
import com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.FrequencyGranularityType1Code;
import com.tools20022.repository.codeset.SenderBusinessRole1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement59#mmSenderBusinessRole
 * Statement59.mmSenderBusinessRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmStatementNumber
 * Statement59.mmStatementNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmQueryReference
 * Statement59.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement59#mmStatementIdentification
 * Statement59.mmStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement59#mmStatementDateTime
 * Statement59.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmStatementPeriod
 * Statement59.mmStatementPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmFrequency
 * Statement59.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement59#mmFrequencyGranularity
 * Statement59.mmFrequencyGranularity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmUpdateType
 * Statement59.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement59#mmActivityIndicator
 * Statement59.mmActivityIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmStatementGeneralDetails
 * SecuritiesBalanceTransparencyReportV02.mmStatementGeneralDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline#forStatement59
 * ConstraintFrequencyGranularityGuideline.forStatement59}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Statement59"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information for a precise date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Statement37
 * Statement37}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement59", propOrder = {"senderBusinessRole", "statementNumber", "queryReference", "statementIdentification", "statementDateTime", "statementPeriod", "frequency", "frequencyGranularity", "updateType",
		"activityIndicator"})
public class Statement59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SndrBizRole", required = true)
	protected SenderBusinessRole1Code senderBusinessRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRole1Code
	 * SenderBusinessRole1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrBizRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderBusinessRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business role of the message sender and, therefore, the business relationship between the sender and the receiver (or the interests represented by them, in those cases where another entity is acting on behalf of the sender or receiver). The message is exchanged between two entities, one being the account servicer and the other the account owner, and the message can be used with either one as the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, SenderBusinessRole1Code> mmSenderBusinessRole = new MMMessageAttribute<Statement59, SenderBusinessRole1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "SndrBizRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderBusinessRole";
			definition = "Specifies the business role of the message sender and, therefore, the business relationship between the sender and the receiver (or the interests represented by them, in those cases where another entity is acting on behalf of the sender or receiver). The message is exchanged between two entities, one being the account servicer and the other the account owner, and the message can be used with either one as the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SenderBusinessRole1Code.mmObject();
		}

		@Override
		public SenderBusinessRole1Code getValue(Statement59 obj) {
			return obj.getSenderBusinessRole();
		}

		@Override
		public void setValue(Statement59 obj, SenderBusinessRole1Code value) {
			obj.setSenderBusinessRole(value);
		}
	};
	@XmlElement(name = "StmtNb")
	protected Number3Choice statementNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Number3Choice Number3Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmStatementNumber
	 * Statement37.mmStatementNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, Optional<Number3Choice>> mmStatementNumber = new MMMessageAttribute<Statement59, Optional<Number3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "StmtNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementNumber";
			definition = "Sequential number of the report.";
			previousVersion_lazy = () -> Statement37.mmStatementNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number3Choice.mmObject();
		}

		@Override
		public Optional<Number3Choice> getValue(Statement59 obj) {
			return obj.getStatementNumber();
		}

		@Override
		public void setValue(Statement59 obj, Optional<Number3Choice> value) {
			obj.setStatementNumber(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
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
	 * "Identification of the query message sent to request this statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmQueryReference
	 * Statement37.mmQueryReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, Optional<Max35Text>> mmQueryReference = new MMMessageAttribute<Statement59, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the query message sent to request this statement.";
			previousVersion_lazy = () -> Statement37.mmQueryReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Statement59 obj) {
			return obj.getQueryReference();
		}

		@Override
		public void setValue(Statement59 obj, Optional<Max35Text> value) {
			obj.setQueryReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtId", required = true)
	protected Max35Text statementIdentification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference common to all pages of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmStatementIdentification
	 * Statement37.mmStatementIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, Max35Text> mmStatementIdentification = new MMMessageAttribute<Statement59, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference common to all pages of the statement.";
			previousVersion_lazy = () -> Statement37.mmStatementIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Statement59 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(Statement59 obj, Max35Text value) {
			obj.setStatementIdentification(value);
		}
	};
	@XmlElement(name = "StmtDtTm", required = true)
	protected DateAndDateTimeChoice statementDateTime;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the statement was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmStatementDateTime
	 * Statement37.mmStatementDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, DateAndDateTimeChoice> mmStatementDateTime = new MMMessageAttribute<Statement59, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date and time when the statement was created.";
			previousVersion_lazy = () -> Statement37.mmStatementDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Statement59 obj) {
			return obj.getStatementDateTime();
		}

		@Override
		public void setValue(Statement59 obj, DateAndDateTimeChoice value) {
			obj.setStatementDateTime(value);
		}
	};
	@XmlElement(name = "StmtPrd", required = true)
	protected DatePeriod1Choice statementPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DatePeriod1Choice
	 * DatePeriod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date period for which the statement was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmStatementPeriod
	 * Statement37.mmStatementPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement59, DatePeriod1Choice> mmStatementPeriod = new MMMessageAssociationEnd<Statement59, DatePeriod1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "StmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementPeriod";
			definition = "Date period for which the statement was created.";
			previousVersion_lazy = () -> Statement37.mmStatementPeriod;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DatePeriod1Choice.mmObject();
		}

		@Override
		public DatePeriod1Choice getValue(Statement59 obj) {
			return obj.getStatementPeriod();
		}

		@Override
		public void setValue(Statement59 obj, DatePeriod1Choice value) {
			obj.setStatementPeriod(value);
		}
	};
	@XmlElement(name = "Frqcy")
	protected Frequency22Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency22Choice
	 * Frequency22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
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
	 * definition} = "Frequency of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmFrequency
	 * Statement37.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement59, Optional<Frequency22Choice>> mmFrequency = new MMMessageAssociationEnd<Statement59, Optional<Frequency22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			previousVersion_lazy = () -> Statement37.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency22Choice.mmObject();
		}

		@Override
		public Optional<Frequency22Choice> getValue(Statement59 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Statement59 obj, Optional<Frequency22Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "FrqcyGrnlrty")
	protected FrequencyGranularityType1Code frequencyGranularity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrqcyGrnlrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyGranularity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Granularity of the frequency used for the reporting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmFrequencyGranularity
	 * Statement37.mmFrequencyGranularity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, Optional<FrequencyGranularityType1Code>> mmFrequencyGranularity = new MMMessageAttribute<Statement59, Optional<FrequencyGranularityType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "FrqcyGrnlrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyGranularity";
			definition = "Granularity of the frequency used for the reporting.";
			previousVersion_lazy = () -> Statement37.mmFrequencyGranularity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FrequencyGranularityType1Code.mmObject();
		}

		@Override
		public Optional<FrequencyGranularityType1Code> getValue(Statement59 obj) {
			return obj.getFrequencyGranularity();
		}

		@Override
		public void setValue(Statement59 obj, Optional<FrequencyGranularityType1Code> value) {
			obj.setFrequencyGranularity(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdTp")
	protected UpdateType4Choice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType4Choice
	 * UpdateType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
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
	 * "Specifies whether the statement is complete or contains changes only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmUpdateType
	 * Statement37.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement59, Optional<UpdateType4Choice>> mmUpdateType = new MMMessageAssociationEnd<Statement59, Optional<UpdateType4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies whether the statement is complete or contains changes only.";
			previousVersion_lazy = () -> Statement37.mmUpdateType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdateType4Choice.mmObject();
		}

		@Override
		public Optional<UpdateType4Choice> getValue(Statement59 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Statement59 obj, Optional<UpdateType4Choice> value) {
			obj.setUpdateType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
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
	 * "Indicates whether there is activity or updated information reported in the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement37#mmActivityIndicator
	 * Statement37.mmActivityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement59, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<Statement59, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement59.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or updated information reported in the statement.";
			previousVersion_lazy = () -> Statement37.mmActivityIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Statement59 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(Statement59 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement59.mmSenderBusinessRole, com.tools20022.repository.msg.Statement59.mmStatementNumber,
						com.tools20022.repository.msg.Statement59.mmQueryReference, com.tools20022.repository.msg.Statement59.mmStatementIdentification, com.tools20022.repository.msg.Statement59.mmStatementDateTime,
						com.tools20022.repository.msg.Statement59.mmStatementPeriod, com.tools20022.repository.msg.Statement59.mmFrequency, com.tools20022.repository.msg.Statement59.mmFrequencyGranularity,
						com.tools20022.repository.msg.Statement59.mmUpdateType, com.tools20022.repository.msg.Statement59.mmActivityIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceTransparencyReportV02.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline.forStatement59);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement59";
				definition = "General characteristics related to a statement which reports information for a precise date.";
				previousVersion_lazy = () -> Statement37.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SenderBusinessRole1Code getSenderBusinessRole() {
		return senderBusinessRole;
	}

	public Statement59 setSenderBusinessRole(SenderBusinessRole1Code senderBusinessRole) {
		this.senderBusinessRole = Objects.requireNonNull(senderBusinessRole);
		return this;
	}

	public Optional<Number3Choice> getStatementNumber() {
		return statementNumber == null ? Optional.empty() : Optional.of(statementNumber);
	}

	public Statement59 setStatementNumber(Number3Choice statementNumber) {
		this.statementNumber = statementNumber;
		return this;
	}

	public Optional<Max35Text> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public Statement59 setQueryReference(Max35Text queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public Statement59 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public Statement59 setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = Objects.requireNonNull(statementDateTime);
		return this;
	}

	public DatePeriod1Choice getStatementPeriod() {
		return statementPeriod;
	}

	public Statement59 setStatementPeriod(DatePeriod1Choice statementPeriod) {
		this.statementPeriod = Objects.requireNonNull(statementPeriod);
		return this;
	}

	public Optional<Frequency22Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public Statement59 setFrequency(Frequency22Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<FrequencyGranularityType1Code> getFrequencyGranularity() {
		return frequencyGranularity == null ? Optional.empty() : Optional.of(frequencyGranularity);
	}

	public Statement59 setFrequencyGranularity(FrequencyGranularityType1Code frequencyGranularity) {
		this.frequencyGranularity = frequencyGranularity;
		return this;
	}

	public Optional<UpdateType4Choice> getUpdateType() {
		return updateType == null ? Optional.empty() : Optional.of(updateType);
	}

	public Statement59 setUpdateType(UpdateType4Choice updateType) {
		this.updateType = updateType;
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public Statement59 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}
}