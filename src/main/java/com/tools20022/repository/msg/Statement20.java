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
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmReportNumber
 * Statement20.mmReportNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmQueryReference
 * Statement20.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement20#mmStatementIdentification
 * Statement20.mmStatementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement20#mmStatementDateTime
 * Statement20.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmFrequency
 * Statement20.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmUpdateType
 * Statement20.mmUpdateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmStatementBasis
 * Statement20.mmStatementBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement20#mmActivityIndicator
 * Statement20.mmActivityIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmAuditedIndicator
 * Statement20.mmAuditedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement20#mmSubAccountIndicator
 * Statement20.mmSubAccountIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement20#mmTaxLotIndicator
 * Statement20.mmTaxLotIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV03.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV04.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV05.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV06.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV07.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmStatementGeneralDetails
 * SecuritiesBalanceAccountingReportV08.mmStatementGeneralDetails}</li>
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
 * "Statement20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the statement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement40 Statement40}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Statement20", propOrder = {"reportNumber", "queryReference", "statementIdentification", "statementDateTime", "frequency", "updateType", "statementBasis", "activityIndicator", "auditedIndicator", "subAccountIndicator",
		"taxLotIndicator"})
public class Statement20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number3Choice reportNumber;
	/**
	 * Sequential number of the report.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement40#mmReportNumber
	 * Statement40.mmReportNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the report.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmReportNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Number3Choice.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmQueryReference
	 * Statement40.mmQueryReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the SecuritiesStatementQuery message sent to request this statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmQueryReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text statementIdentification;
	/**
	 * Reference common to all pages of a statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * definition} = "Reference common to all pages of a statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmStatementIdentification
	 * Statement40.mmStatementIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference common to all pages of a statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmStatementIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice statementDateTime;
	/**
	 * Date and time of the statement.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * definition} = "Date and time of the statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmStatementDateTime
	 * Statement40.mmStatementDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date and time of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmStatementDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Frequency4Choice frequency;
	/**
	 * Frequency of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency4Choice
	 * Frequency4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Statement40#mmFrequency
	 * Statement40.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmFrequency);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency4Choice.mmObject();
		}
	};
	protected UpdateType2Choice updateType;
	/**
	 * Indicates whether the statement is complete or contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType2Choice
	 * UpdateType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * "Indicates whether the statement is complete or contains changes only."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement40#mmUpdateType
	 * Statement40.mmUpdateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdateType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the statement is complete or contains changes only.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmUpdateType);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UpdateType2Choice.mmObject();
		}
	};
	protected StatementBasis3Choice statementBasis;
	/**
	 * Type of balance on which the statement is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasis3Choice
	 * StatementBasis3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of balance on which the statement is prepared."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmStatementBasis
	 * Statement40.mmStatementBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmStatementBasis);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementBasis3Choice.mmObject();
		}
	};
	protected YesNoIndicator activityIndicator;
	/**
	 * Indicates whether there is activity or information update reported in the
	 * statement.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmActivityIndicator
	 * Statement40.mmActivityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmActivityIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator auditedIndicator;
	/**
	 * Indicates whether the statement is audited or not.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
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
	 * definition} = "Indicates whether the statement is audited or not."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmAuditedIndicator
	 * Statement40.mmAuditedIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuditedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "AudtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuditedIndicator";
			definition = "Indicates whether the statement is audited or not.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmAuditedIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator subAccountIndicator;
	/**
	 * Indicates whether the statement reports holdings at subsafekeeping
	 * account level.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement reports holdings at subsafekeeping account level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmSubAccountIndicator
	 * Statement40.mmSubAccountIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubAccountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "SubAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIndicator";
			definition = "Indicates whether the statement reports holdings at subsafekeeping account level.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmSubAccountIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator taxLotIndicator;
	/**
	 * Indicates whether the statement contains tax lot details.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement20 Statement20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLotInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the statement contains tax lot details."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement40#mmTaxLotIndicator
	 * Statement40.mmTaxLotIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxLotIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement20.mmObject();
			isDerived = false;
			xmlTag = "TaxLotInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLotIndicator";
			definition = "Indicates whether the statement contains tax lot details.";
			nextVersions_lazy = () -> Arrays.asList(Statement40.mmTaxLotIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Statement20.mmReportNumber, Statement20.mmQueryReference, Statement20.mmStatementIdentification, Statement20.mmStatementDateTime, Statement20.mmFrequency, Statement20.mmUpdateType,
						Statement20.mmStatementBasis, Statement20.mmActivityIndicator, Statement20.mmAuditedIndicator, Statement20.mmSubAccountIndicator, Statement20.mmTaxLotIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV03.mmStatementGeneralDetails, SecuritiesBalanceAccountingReportV04.mmStatementGeneralDetails,
						SecuritiesBalanceAccountingReportV05.mmStatementGeneralDetails, SecuritiesBalanceAccountingReportV06.mmStatementGeneralDetails, SecuritiesBalanceAccountingReportV07.mmStatementGeneralDetails,
						SecuritiesBalanceAccountingReportV08.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement20";
				definition = "Characteristics of the statement.";
				nextVersions_lazy = () -> Arrays.asList(Statement40.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptNb")
	public Number3Choice getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(Number3Choice reportNumber) {
		this.reportNumber = reportNumber;
	}

	@XmlElement(name = "QryRef")
	public Max35Text getQueryReference() {
		return queryReference;
	}

	public void setQueryReference(Max35Text queryReference) {
		this.queryReference = queryReference;
	}

	@XmlElement(name = "StmtId")
	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public void setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = statementIdentification;
	}

	@XmlElement(name = "StmtDtTm", required = true)
	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public void setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = statementDateTime;
	}

	@XmlElement(name = "Frqcy", required = true)
	public Frequency4Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency4Choice frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "UpdTp", required = true)
	public UpdateType2Choice getUpdateType() {
		return updateType;
	}

	public void setUpdateType(UpdateType2Choice updateType) {
		this.updateType = updateType;
	}

	@XmlElement(name = "StmtBsis", required = true)
	public StatementBasis3Choice getStatementBasis() {
		return statementBasis;
	}

	public void setStatementBasis(StatementBasis3Choice statementBasis) {
		this.statementBasis = statementBasis;
	}

	@XmlElement(name = "ActvtyInd", required = true)
	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public void setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = activityIndicator;
	}

	@XmlElement(name = "AudtdInd", required = true)
	public YesNoIndicator getAuditedIndicator() {
		return auditedIndicator;
	}

	public void setAuditedIndicator(YesNoIndicator auditedIndicator) {
		this.auditedIndicator = auditedIndicator;
	}

	@XmlElement(name = "SubAcctInd", required = true)
	public YesNoIndicator getSubAccountIndicator() {
		return subAccountIndicator;
	}

	public void setSubAccountIndicator(YesNoIndicator subAccountIndicator) {
		this.subAccountIndicator = subAccountIndicator;
	}

	@XmlElement(name = "TaxLotInd")
	public YesNoIndicator getTaxLotIndicator() {
		return taxLotIndicator;
	}

	public void setTaxLotIndicator(YesNoIndicator taxLotIndicator) {
		this.taxLotIndicator = taxLotIndicator;
	}
}