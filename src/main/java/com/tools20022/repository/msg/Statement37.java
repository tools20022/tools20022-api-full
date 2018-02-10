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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.FrequencyGranularityType1Code;
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
 * <li>{@linkplain com.tools20022.repository.msg.Statement37#mmStatementNumber
 * Statement37.mmStatementNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement37#mmQueryReference
 * Statement37.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement37#mmStatementIdentification
 * Statement37.mmStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement37#mmStatementDateTime
 * Statement37.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement37#mmStatementPeriod
 * Statement37.mmStatementPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement37#mmFrequency
 * Statement37.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement37#mmFrequencyGranularity
 * Statement37.mmFrequencyGranularity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement37#mmUpdateType
 * Statement37.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement37#mmActivityIndicator
 * Statement37.mmActivityIndicator}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline#forStatement37
 * ConstraintFrequencyGranularityGuideline.forStatement37}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Statement37"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information for a precise date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement59 Statement59}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement37", propOrder = {"statementNumber", "queryReference", "statementIdentification", "statementDateTime", "statementPeriod", "frequency", "frequencyGranularity", "updateType", "activityIndicator"})
public class Statement37 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmStatementNumber
	 * Statement59.mmStatementNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "StmtNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementNumber";
			definition = "Sequential number of the report.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmStatementNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number3Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmQueryReference
	 * Statement59.mmQueryReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the query message sent to request this statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmQueryReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmStatementIdentification
	 * Statement59.mmStatementIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference common to all pages of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmStatementIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmStatementDateTime
	 * Statement59.mmStatementDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date and time when the statement was created.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmStatementDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmStatementPeriod
	 * Statement59.mmStatementPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "StmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementPeriod";
			definition = "Date period for which the statement was created.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmStatementPeriod);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DatePeriod1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmFrequency
	 * Statement59.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrequency = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency22Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmFrequencyGranularity
	 * Statement59.mmFrequencyGranularity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequencyGranularity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "FrqcyGrnlrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyGranularity";
			definition = "Granularity of the frequency used for the reporting.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmFrequencyGranularity);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement59#mmUpdateType
	 * Statement59.mmUpdateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdateType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies whether the statement is complete or contains changes only.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmUpdateType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdateType4Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.Statement37 Statement37}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement59#mmActivityIndicator
	 * Statement59.mmActivityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement37.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or updated information reported in the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement59.mmActivityIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement37.mmStatementNumber, com.tools20022.repository.msg.Statement37.mmQueryReference,
						com.tools20022.repository.msg.Statement37.mmStatementIdentification, com.tools20022.repository.msg.Statement37.mmStatementDateTime, com.tools20022.repository.msg.Statement37.mmStatementPeriod,
						com.tools20022.repository.msg.Statement37.mmFrequency, com.tools20022.repository.msg.Statement37.mmFrequencyGranularity, com.tools20022.repository.msg.Statement37.mmUpdateType,
						com.tools20022.repository.msg.Statement37.mmActivityIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFrequencyGranularityGuideline.forStatement37);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement37";
				definition = "General characteristics related to a statement which reports information for a precise date.";
				nextVersions_lazy = () -> Arrays.asList(Statement59.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number3Choice> getStatementNumber() {
		return statementNumber == null ? Optional.empty() : Optional.of(statementNumber);
	}

	public Statement37 setStatementNumber(Number3Choice statementNumber) {
		this.statementNumber = statementNumber;
		return this;
	}

	public Optional<Max35Text> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public Statement37 setQueryReference(Max35Text queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public Statement37 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public Statement37 setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = Objects.requireNonNull(statementDateTime);
		return this;
	}

	public DatePeriod1Choice getStatementPeriod() {
		return statementPeriod;
	}

	public Statement37 setStatementPeriod(DatePeriod1Choice statementPeriod) {
		this.statementPeriod = Objects.requireNonNull(statementPeriod);
		return this;
	}

	public Optional<Frequency22Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public Statement37 setFrequency(Frequency22Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<FrequencyGranularityType1Code> getFrequencyGranularity() {
		return frequencyGranularity == null ? Optional.empty() : Optional.of(frequencyGranularity);
	}

	public Statement37 setFrequencyGranularity(FrequencyGranularityType1Code frequencyGranularity) {
		this.frequencyGranularity = frequencyGranularity;
		return this;
	}

	public Optional<UpdateType4Choice> getUpdateType() {
		return updateType == null ? Optional.empty() : Optional.of(updateType);
	}

	public Statement37 setUpdateType(UpdateType4Choice updateType) {
		this.updateType = updateType;
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public Statement37 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}
}