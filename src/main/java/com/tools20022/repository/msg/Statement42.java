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
import com.tools20022.repository.area.semt.SecuritiesStatementQueryV06;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatementTypeRule#forStatement42
 * ConstraintStatementTypeRule.forStatement42}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatementBasisRule#forStatement42
 * ConstraintStatementBasisRule.forStatement42}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement42", propOrder = {"statementDateOrPeriod", "frequency", "updateType", "statementBasis", "statementType"})
public class Statement42 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtDtOrPrd")
	protected DateAndPeriod1Choice statementDateOrPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::STAT or :69a::STAT</li>
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
	public static final MMMessageAssociationEnd<Statement42, Optional<DateAndPeriod1Choice>> mmStatementDateOrPeriod = new MMMessageAssociationEnd<Statement42, Optional<DateAndPeriod1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement42.mmObject();
			isDerived = false;
			xmlTag = "StmtDtOrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::STAT or :69a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateOrPeriod";
			definition = "Date or period of the statement.";
			previousVersion_lazy = () -> Statement16.mmStatementDateOrPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndPeriod1Choice.mmObject();
		}

		@Override
		public Optional<DateAndPeriod1Choice> getValue(Statement42 obj) {
			return obj.getStatementDateOrPeriod();
		}

		@Override
		public void setValue(Statement42 obj, Optional<DateAndPeriod1Choice> value) {
			obj.setStatementDateOrPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Frqcy")
	protected Frequency25Choice frequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmFrequency
	 * Statement16.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement42, Optional<Frequency25Choice>> mmFrequency = new MMMessageAttribute<Statement42, Optional<Frequency25Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement42.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			previousVersion_lazy = () -> Statement16.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency25Choice.mmObject();
		}

		@Override
		public Optional<Frequency25Choice> getValue(Statement42 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Statement42 obj, Optional<Frequency25Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdTp")
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
	 * {@linkplain com.tools20022.repository.msg.Statement42 Statement42}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Statement16#mmUpdateType
	 * Statement16.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement42, Optional<UpdateType15Choice>> mmUpdateType = new MMMessageAssociationEnd<Statement42, Optional<UpdateType15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement42.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CODE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the statement is complete or contains changes only.";
			previousVersion_lazy = () -> Statement16.mmUpdateType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdateType15Choice.mmObject();
		}

		@Override
		public Optional<UpdateType15Choice> getValue(Statement42 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Statement42 obj, Optional<UpdateType15Choice> value) {
			obj.setUpdateType(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtBsis")
	protected StatementBasis7Choice statementBasis;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STBA</li>
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
	public static final MMMessageAttribute<Statement42, Optional<StatementBasis7Choice>> mmStatementBasis = new MMMessageAttribute<Statement42, Optional<StatementBasis7Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement42.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			previousVersion_lazy = () -> Statement16.mmStatementBasis;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementBasis7Choice.mmObject();
		}

		@Override
		public Optional<StatementBasis7Choice> getValue(Statement42 obj) {
			return obj.getStatementBasis();
		}

		@Override
		public void setValue(Statement42 obj, Optional<StatementBasis7Choice> value) {
			obj.setStatementBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtTp")
	protected StatementType5Choice statementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STTY</li>
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
	public static final MMMessageAttribute<Statement42, Optional<StatementType5Choice>> mmStatementType = new MMMessageAttribute<Statement42, Optional<StatementType5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement42.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Type of balance on which the statement is prepared.";
			previousVersion_lazy = () -> Statement16.mmStatementType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementType5Choice.mmObject();
		}

		@Override
		public Optional<StatementType5Choice> getValue(Statement42 obj) {
			return obj.getStatementType();
		}

		@Override
		public void setValue(Statement42 obj, Optional<StatementType5Choice> value) {
			obj.setStatementType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement42.mmStatementDateOrPeriod, com.tools20022.repository.msg.Statement42.mmFrequency, com.tools20022.repository.msg.Statement42.mmUpdateType,
						com.tools20022.repository.msg.Statement42.mmStatementBasis, com.tools20022.repository.msg.Statement42.mmStatementType);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesStatementQueryV06.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatementTypeRule.forStatement42, com.tools20022.repository.constraints.ConstraintStatementBasisRule.forStatement42);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement42";
				definition = "Characteristics of the statement.";
				previousVersion_lazy = () -> Statement16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateAndPeriod1Choice> getStatementDateOrPeriod() {
		return statementDateOrPeriod == null ? Optional.empty() : Optional.of(statementDateOrPeriod);
	}

	public Statement42 setStatementDateOrPeriod(DateAndPeriod1Choice statementDateOrPeriod) {
		this.statementDateOrPeriod = statementDateOrPeriod;
		return this;
	}

	public Optional<Frequency25Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public Statement42 setFrequency(Frequency25Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<UpdateType15Choice> getUpdateType() {
		return updateType == null ? Optional.empty() : Optional.of(updateType);
	}

	public Statement42 setUpdateType(UpdateType15Choice updateType) {
		this.updateType = updateType;
		return this;
	}

	public Optional<StatementBasis7Choice> getStatementBasis() {
		return statementBasis == null ? Optional.empty() : Optional.of(statementBasis);
	}

	public Statement42 setStatementBasis(StatementBasis7Choice statementBasis) {
		this.statementBasis = statementBasis;
		return this;
	}

	public Optional<StatementType5Choice> getStatementType() {
		return statementType == null ? Optional.empty() : Optional.of(statementType);
	}

	public Statement42 setStatementType(StatementType5Choice statementType) {
		this.statementType = statementType;
		return this;
	}
}