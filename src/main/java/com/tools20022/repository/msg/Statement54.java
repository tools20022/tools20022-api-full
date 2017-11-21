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
import com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06;
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
 * {@linkplain com.tools20022.repository.msg.Statement54#mmStatementDateOrPeriod
 * Statement54.mmStatementDateOrPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement54#mmFrequency
 * Statement54.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement54#mmUpdateType
 * Statement54.mmUpdateType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement54#mmStatementBasis
 * Statement54.mmStatementBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement54#mmStatementType
 * Statement54.mmStatementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06#mmStatementGeneralDetails
 * SecuritiesStatementQuery002V06.mmStatementGeneralDetails}</li>
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
 * "Statement54"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the statement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Statement54", propOrder = {"statementDateOrPeriod", "frequency", "updateType", "statementBasis", "statementType"})
public class Statement54 {

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
	 * {@linkplain com.tools20022.repository.msg.Statement54 Statement54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatementDateOrPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Statement54.mmObject();
			isDerived = false;
			xmlTag = "StmtDtOrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateOrPeriod";
			definition = "Date or period of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndPeriod1Choice.mmObject();
		}
	};
	protected Frequency26Choice frequency;
	/**
	 * Frequency of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency26Choice
	 * Frequency26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement54 Statement54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement54.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency26Choice.mmObject();
		}
	};
	protected UpdateType16Choice updateType;
	/**
	 * Indicates whether the statement is complete or contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType16Choice
	 * UpdateType16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement54 Statement54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUpdateType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Statement54.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the statement is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdateType16Choice.mmObject();
		}
	};
	protected StatementBasis9Choice statementBasis;
	/**
	 * Type of balance on which the statement is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasis9Choice
	 * StatementBasis9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement54 Statement54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement54.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementBasis9Choice.mmObject();
		}
	};
	protected StatementType6Choice statementType;
	/**
	 * Type of balance on which the statement is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementType6Choice
	 * StatementType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement54 Statement54}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Statement54.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Type of balance on which the statement is prepared.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementType6Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Statement54.mmStatementDateOrPeriod, Statement54.mmFrequency, Statement54.mmUpdateType, Statement54.mmStatementBasis, Statement54.mmStatementType);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesStatementQuery002V06.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement54";
				definition = "Characteristics of the statement.";
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
	public Frequency26Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency26Choice frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "UpdTp")
	public UpdateType16Choice getUpdateType() {
		return updateType;
	}

	public void setUpdateType(UpdateType16Choice updateType) {
		this.updateType = updateType;
	}

	@XmlElement(name = "StmtBsis")
	public StatementBasis9Choice getStatementBasis() {
		return statementBasis;
	}

	public void setStatementBasis(StatementBasis9Choice statementBasis) {
		this.statementBasis = statementBasis;
	}

	@XmlElement(name = "StmtTp")
	public StatementType6Choice getStatementType() {
		return statementType;
	}

	public void setStatementType(StatementType6Choice statementType) {
		this.statementType = statementType;
	}
}