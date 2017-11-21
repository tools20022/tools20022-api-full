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
import com.tools20022.repository.area.semt.SecuritiesStatementQueryV06;
import com.tools20022.repository.choice.*;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement42#mmStatementDateOrPeriod
 * Statement42.mmStatementDateOrPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement42#mmFrequency
 * Statement42.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement42#mmUpdateType
 * Statement42.mmUpdateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement42#mmStatementBasis
 * Statement42.mmStatementBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement42#mmStatementType
 * Statement42.mmStatementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV06#mmStatementGeneralDetails
 * SecuritiesStatementQueryV06.mmStatementGeneralDetails}</li>
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
 * "Statement42"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the statement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Statement16
 * Statement16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Statement42", propOrder = {"statementDateOrPeriod", "frequency", "updateType", "statementBasis", "statementType"})
public class Statement42 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateAndPeriod1Choice statementDateOrPeriod;
	/**
	 * Date or period of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndPeriod1Choice
	 * DateAndPeriod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtOrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateOrPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date or period of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmStatementDateOrPeriod
	 * Statement16.mmStatementDateOrPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementDateOrPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Statement42.mmObject();
			isDerived = false;
			xmlTag = "StmtDtOrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateOrPeriod";
			definition = "Date or period of the statement.";
			previousVersion_lazy = () -> Statement16.mmStatementDateOrPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndPeriod1Choice.mmObject();
		}
	};
	protected Frequency25Choice frequency;
	/**
	 * Frequency of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency25Choice
	 * Frequency25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmFrequency
	 * Statement16.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement42.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			previousVersion_lazy = () -> Statement16.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency25Choice.mmObject();
		}
	};
	protected UpdateType15Choice updateType;
	/**
	 * Indicates whether the statement is complete or contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType15Choice
	 * UpdateType15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmUpdateType
	 * Statement16.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdateType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Statement42.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the statement is complete or contains changes only.";
			previousVersion_lazy = () -> Statement16.mmUpdateType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdateType15Choice.mmObject();
		}
	};
	protected StatementBasis7Choice statementBasis;
	/**
	 * Type of balance on which the statement is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasis7Choice
	 * StatementBasis7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmStatementBasis
	 * Statement16.mmStatementBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement42.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			previousVersion_lazy = () -> Statement16.mmStatementBasis;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementBasis7Choice.mmObject();
		}
	};
	protected StatementType5Choice statementType;
	/**
	 * Type of balance on which the statement is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementType5Choice
	 * StatementType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of balance on which the statement is prepared."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmStatementType
	 * Statement16.mmStatementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement42.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Type of balance on which the statement is prepared.";
			previousVersion_lazy = () -> Statement16.mmStatementType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementType5Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Statement42.mmStatementDateOrPeriod, Statement42.mmFrequency, Statement42.mmUpdateType, Statement42.mmStatementBasis, Statement42.mmStatementType);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesStatementQueryV06.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement42";
				definition = "Characteristics of the statement.";
				previousVersion_lazy = () -> Statement16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StmtDtOrPrd")
	public DateAndPeriod1Choice getStatementDateOrPeriod() {
		return statementDateOrPeriod;
	}

	public void setStatementDateOrPeriod(DateAndPeriod1Choice statementDateOrPeriod) {
		this.statementDateOrPeriod = statementDateOrPeriod;
	}

	@XmlElement(name = "Frqcy")
	public Frequency25Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency25Choice frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "UpdTp")
	public UpdateType15Choice getUpdateType() {
		return updateType;
	}

	public void setUpdateType(UpdateType15Choice updateType) {
		this.updateType = updateType;
	}

	@XmlElement(name = "StmtBsis")
	public StatementBasis7Choice getStatementBasis() {
		return statementBasis;
	}

	public void setStatementBasis(StatementBasis7Choice statementBasis) {
		this.statementBasis = statementBasis;
	}

	@XmlElement(name = "StmtTp")
	public StatementType5Choice getStatementType() {
		return statementType;
	}

	public void setStatementType(StatementType5Choice statementType) {
		this.statementType = statementType;
	}
}