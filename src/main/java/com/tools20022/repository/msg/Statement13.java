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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.Frequency2Choice;
import com.tools20022.repository.choice.StatementBasis1Choice;
import com.tools20022.repository.choice.UpdateType1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5NumericText;
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
 * {@linkplain com.tools20022.repository.msg.Statement13#mmSecuritiesStatementQueryReference
 * Statement13.mmSecuritiesStatementQueryReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement13#mmReportNumber
 * Statement13.mmReportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement13#mmStatementIdentification
 * Statement13.mmStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement13#mmStatementDateTime
 * Statement13.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement13#mmFrequency
 * Statement13.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement13#mmUpdateType
 * Statement13.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement13#mmActivityIndicator
 * Statement13.mmActivityIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement13#mmStatementBasis
 * Statement13.mmStatementBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement13#mmAuditedIndicator
 * Statement13.mmAuditedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement13#mmTaxLotIndicator
 * Statement13.mmTaxLotIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Statement13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information for a precise date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forStatement13
 * ConstraintReportNumberRule.forStatement13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncrementalReportNumberRule#forStatement13
 * ConstraintIncrementalReportNumberRule.forStatement13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement13", propOrder = {"securitiesStatementQueryReference", "reportNumber", "statementIdentification", "statementDateTime", "frequency", "updateType", "activityIndicator", "statementBasis", "auditedIndicator",
		"taxLotIndicator"})
public class Statement13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesStmtQryRef")
	protected Max35Text securitiesStatementQueryReference;
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
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesStmtQryRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesStatementQueryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the SecuritiesStatementQuery sent to request this statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, Optional<Max35Text>> mmSecuritiesStatementQueryReference = new MMMessageAttribute<Statement13, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "SctiesStmtQryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesStatementQueryReference";
			definition = "Identification of the SecuritiesStatementQuery sent to request this statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Statement13 obj) {
			return obj.getSecuritiesStatementQueryReference();
		}

		@Override
		public void setValue(Statement13 obj, Optional<Max35Text> value) {
			obj.setSecuritiesStatementQueryReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, Optional<Max5NumericText>> mmReportNumber = new MMMessageAttribute<Statement13, Optional<Max5NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(Statement13 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(Statement13 obj, Optional<Max5NumericText> value) {
			obj.setReportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtId")
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
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference common to all pages of a statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, Optional<Max35Text>> mmStatementIdentification = new MMMessageAttribute<Statement13, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference common to all pages of a statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Statement13 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(Statement13 obj, Optional<Max35Text> value) {
			obj.setStatementIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, DateAndDateTimeChoice> mmStatementDateTime = new MMMessageAttribute<Statement13, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Statement13 obj) {
			return obj.getStatementDateTime();
		}

		@Override
		public void setValue(Statement13 obj, DateAndDateTimeChoice value) {
			obj.setStatementDateTime(value);
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency2Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency2Choice
	 * Frequency2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, Frequency2Choice> mmFrequency = new MMMessageAttribute<Statement13, Frequency2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency2Choice.mmObject();
		}

		@Override
		public Frequency2Choice getValue(Statement13 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Statement13 obj, Frequency2Choice value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected UpdateType1Choice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType1Choice
	 * UpdateType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, UpdateType1Choice> mmUpdateType = new MMMessageAttribute<Statement13, UpdateType1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType1Choice.mmObject();
		}

		@Override
		public UpdateType1Choice getValue(Statement13 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Statement13 obj, UpdateType1Choice value) {
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
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<Statement13, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Statement13 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(Statement13 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};
	@XmlElement(name = "StmtBsis", required = true)
	protected StatementBasis1Choice statementBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasis1Choice
	 * StatementBasis1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of balance on which the statement is prepared."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, StatementBasis1Choice> mmStatementBasis = new MMMessageAttribute<Statement13, StatementBasis1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementBasis1Choice.mmObject();
		}

		@Override
		public StatementBasis1Choice getValue(Statement13 obj) {
			return obj.getStatementBasis();
		}

		@Override
		public void setValue(Statement13 obj, StatementBasis1Choice value) {
			obj.setStatementBasis(value);
		}
	};
	@XmlElement(name = "AudtdInd", required = true)
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AudtdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuditedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicate whether the statement is audited or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, YesNoIndicator> mmAuditedIndicator = new MMMessageAttribute<Statement13, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "AudtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuditedIndicator";
			definition = "Indicate whether the statement is audited or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Statement13 obj) {
			return obj.getAuditedIndicator();
		}

		@Override
		public void setValue(Statement13 obj, YesNoIndicator value) {
			obj.setAuditedIndicator(value);
		}
	};
	@XmlElement(name = "TaxLotInd")
	protected YesNoIndicator taxLotIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Statement13 Statement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLotInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement containes tax lot details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement13, Optional<YesNoIndicator>> mmTaxLotIndicator = new MMMessageAttribute<Statement13, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement13.mmObject();
			isDerived = false;
			xmlTag = "TaxLotInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLotIndicator";
			definition = "Indicates whether the statement containes tax lot details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Statement13 obj) {
			return obj.getTaxLotIndicator();
		}

		@Override
		public void setValue(Statement13 obj, Optional<YesNoIndicator> value) {
			obj.setTaxLotIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement13.mmSecuritiesStatementQueryReference, com.tools20022.repository.msg.Statement13.mmReportNumber,
						com.tools20022.repository.msg.Statement13.mmStatementIdentification, com.tools20022.repository.msg.Statement13.mmStatementDateTime, com.tools20022.repository.msg.Statement13.mmFrequency,
						com.tools20022.repository.msg.Statement13.mmUpdateType, com.tools20022.repository.msg.Statement13.mmActivityIndicator, com.tools20022.repository.msg.Statement13.mmStatementBasis,
						com.tools20022.repository.msg.Statement13.mmAuditedIndicator, com.tools20022.repository.msg.Statement13.mmTaxLotIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forStatement13, com.tools20022.repository.constraints.ConstraintIncrementalReportNumberRule.forStatement13);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Statement13";
				definition = "General characteristics related to a statement which reports information for a precise date.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getSecuritiesStatementQueryReference() {
		return securitiesStatementQueryReference == null ? Optional.empty() : Optional.of(securitiesStatementQueryReference);
	}

	public Statement13 setSecuritiesStatementQueryReference(Max35Text securitiesStatementQueryReference) {
		this.securitiesStatementQueryReference = securitiesStatementQueryReference;
		return this;
	}

	public Optional<Max5NumericText> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public Statement13 setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public Optional<Max35Text> getStatementIdentification() {
		return statementIdentification == null ? Optional.empty() : Optional.of(statementIdentification);
	}

	public Statement13 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = statementIdentification;
		return this;
	}

	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public Statement13 setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = Objects.requireNonNull(statementDateTime);
		return this;
	}

	public Frequency2Choice getFrequency() {
		return frequency;
	}

	public Statement13 setFrequency(Frequency2Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public UpdateType1Choice getUpdateType() {
		return updateType;
	}

	public Statement13 setUpdateType(UpdateType1Choice updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public Statement13 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}

	public StatementBasis1Choice getStatementBasis() {
		return statementBasis;
	}

	public Statement13 setStatementBasis(StatementBasis1Choice statementBasis) {
		this.statementBasis = Objects.requireNonNull(statementBasis);
		return this;
	}

	public YesNoIndicator getAuditedIndicator() {
		return auditedIndicator;
	}

	public Statement13 setAuditedIndicator(YesNoIndicator auditedIndicator) {
		this.auditedIndicator = Objects.requireNonNull(auditedIndicator);
		return this;
	}

	public Optional<YesNoIndicator> getTaxLotIndicator() {
		return taxLotIndicator == null ? Optional.empty() : Optional.of(taxLotIndicator);
	}

	public Statement13 setTaxLotIndicator(YesNoIndicator taxLotIndicator) {
		this.taxLotIndicator = taxLotIndicator;
		return this;
	}
}