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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MovementResponseType1Code;
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
 * Characteristics of the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmReportNumber
 * IntraBalanceReport3.mmReportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmQueryReference
 * IntraBalanceReport3.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmReportIdentification
 * IntraBalanceReport3.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmReportDateTime
 * IntraBalanceReport3.mmReportDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmReportPeriod
 * IntraBalanceReport3.mmReportPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmQueryType
 * IntraBalanceReport3.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmFrequency
 * IntraBalanceReport3.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmUpdateType
 * IntraBalanceReport3.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3#mmActivityIndicator
 * IntraBalanceReport3.mmActivityIndicator}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReportNumberRule#forIntraBalanceReport3
 * ConstraintReportNumberRule.forIntraBalanceReport3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalanceReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1
 * IntraBalanceReport1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceReport3", propOrder = {"reportNumber", "queryReference", "reportIdentification", "reportDateTime", "reportPeriod", "queryType", "frequency", "updateType", "activityIndicator"})
public class IntraBalanceReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptNb")
	protected Number3Choice reportNumber;
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmReportNumber
	 * IntraBalanceReport1.mmReportNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, Optional<Number3Choice>> mmReportNumber = new MMMessageAttribute<IntraBalanceReport3, Optional<Number3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the report.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmReportNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number3Choice.mmObject();
		}

		@Override
		public Optional<Number3Choice> getValue(IntraBalanceReport3 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<Number3Choice> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::RELA</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmQueryReference
	 * IntraBalanceReport1.mmQueryReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, Optional<Max35Text>> mmQueryReference = new MMMessageAttribute<IntraBalanceReport3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::RELA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the query message sent to request this statement.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmQueryReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalanceReport3 obj) {
			return obj.getQueryReference();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<Max35Text> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
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
	 * definition} = "Reference common to all pages of a statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmReportIdentification
	 * IntraBalanceReport1.mmReportIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, Optional<Max35Text>> mmReportIdentification = new MMMessageAttribute<IntraBalanceReport3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Reference common to all pages of a statement.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmReportIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraBalanceReport3 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<Max35Text> value) {
			obj.setReportIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RptDtTm")
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the report was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmReportDateTime
	 * IntraBalanceReport1.mmReportDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, Optional<DateAndDateTimeChoice>> mmReportDateTime = new MMMessageAttribute<IntraBalanceReport3, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "RptDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDateTime";
			definition = "Date and time when the report was created.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmReportDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(IntraBalanceReport3 obj) {
			return obj.getReportDateTime();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setReportDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RptPrd")
	protected Period2Choice reportPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Period2Choice Period2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmReportPeriod
	 * IntraBalanceReport1.mmReportPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, Optional<Period2Choice>> mmReportPeriod = new MMMessageAttribute<IntraBalanceReport3, Optional<Period2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "RptPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPeriod";
			definition = "Period for the statement.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmReportPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period2Choice.mmObject();
		}

		@Override
		public Optional<Period2Choice> getValue(IntraBalanceReport3 obj) {
			return obj.getReportPeriod();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<Period2Choice> value) {
			obj.setReportPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "QryTp")
	protected MovementResponseType1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MovementResponseType1Code
	 * MovementResponseType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CODE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmQueryType
	 * IntraBalanceReport1.mmQueryType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, Optional<MovementResponseType1Code>> mmQueryType = new MMMessageAttribute<IntraBalanceReport3, Optional<MovementResponseType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CODE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Defines the type of query.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmQueryType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MovementResponseType1Code.mmObject();
		}

		@Override
		public Optional<MovementResponseType1Code> getValue(IntraBalanceReport3 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<MovementResponseType1Code> value) {
			obj.setQueryType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SFRE</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmFrequency
	 * IntraBalanceReport1.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceReport3, Optional<Frequency22Choice>> mmFrequency = new MMMessageAssociationEnd<IntraBalanceReport3, Optional<Frequency22Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency22Choice.mmObject();
		}

		@Override
		public Optional<Frequency22Choice> getValue(IntraBalanceReport3 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, Optional<Frequency22Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected UpdateType15Choice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType15Choice
	 * UpdateType15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CODE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement is complete or contains changes only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmUpdateType
	 * IntraBalanceReport1.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceReport3, UpdateType15Choice> mmUpdateType = new MMMessageAssociationEnd<IntraBalanceReport3, UpdateType15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CODE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the statement is complete or contains changes only.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmUpdateType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UpdateType15Choice.mmObject();
		}

		@Override
		public UpdateType15Choice getValue(IntraBalanceReport3 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, UpdateType15Choice value) {
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport3
	 * IntraBalanceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACTI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceReport1#mmActivityIndicator
	 * IntraBalanceReport1.mmActivityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceReport3, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<IntraBalanceReport3, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceReport3.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			previousVersion_lazy = () -> IntraBalanceReport1.mmActivityIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IntraBalanceReport3 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(IntraBalanceReport3 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceReport3.mmReportNumber, com.tools20022.repository.msg.IntraBalanceReport3.mmQueryReference,
						com.tools20022.repository.msg.IntraBalanceReport3.mmReportIdentification, com.tools20022.repository.msg.IntraBalanceReport3.mmReportDateTime, com.tools20022.repository.msg.IntraBalanceReport3.mmReportPeriod,
						com.tools20022.repository.msg.IntraBalanceReport3.mmQueryType, com.tools20022.repository.msg.IntraBalanceReport3.mmFrequency, com.tools20022.repository.msg.IntraBalanceReport3.mmUpdateType,
						com.tools20022.repository.msg.IntraBalanceReport3.mmActivityIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportNumberRule.forIntraBalanceReport3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceReport3";
				definition = "Characteristics of the report.";
				previousVersion_lazy = () -> IntraBalanceReport1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number3Choice> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public IntraBalanceReport3 setReportNumber(Number3Choice reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public Optional<Max35Text> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public IntraBalanceReport3 setQueryReference(Max35Text queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Optional<Max35Text> getReportIdentification() {
		return reportIdentification == null ? Optional.empty() : Optional.of(reportIdentification);
	}

	public IntraBalanceReport3 setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getReportDateTime() {
		return reportDateTime == null ? Optional.empty() : Optional.of(reportDateTime);
	}

	public IntraBalanceReport3 setReportDateTime(DateAndDateTimeChoice reportDateTime) {
		this.reportDateTime = reportDateTime;
		return this;
	}

	public Optional<Period2Choice> getReportPeriod() {
		return reportPeriod == null ? Optional.empty() : Optional.of(reportPeriod);
	}

	public IntraBalanceReport3 setReportPeriod(Period2Choice reportPeriod) {
		this.reportPeriod = reportPeriod;
		return this;
	}

	public Optional<MovementResponseType1Code> getQueryType() {
		return queryType == null ? Optional.empty() : Optional.of(queryType);
	}

	public IntraBalanceReport3 setQueryType(MovementResponseType1Code queryType) {
		this.queryType = queryType;
		return this;
	}

	public Optional<Frequency22Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public IntraBalanceReport3 setFrequency(Frequency22Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public UpdateType15Choice getUpdateType() {
		return updateType;
	}

	public IntraBalanceReport3 setUpdateType(UpdateType15Choice updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public IntraBalanceReport3 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}
}