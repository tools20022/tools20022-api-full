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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.StatementUpdateTypeCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the update type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice#mmStatementUpdateTypeAsCode
 * StatementUpdateTypeCodeAndDSSCodeChoice.mmStatementUpdateTypeAsCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice#mmStatementUpdateTypeAsDSS
 * StatementUpdateTypeCodeAndDSSCodeChoice.mmStatementUpdateTypeAsDSS}</li>
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
 * "StatementUpdateTypeCodeAndDSSCodeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the update type."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementUpdateTypeCodeAndDSSCodeChoice", propOrder = {"statementUpdateTypeAsCode", "statementUpdateTypeAsDSS"})
public class StatementUpdateTypeCodeAndDSSCodeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtUpdTpAsCd", required = true)
	protected StatementUpdateTypeCode statementUpdateTypeAsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatementUpdateTypeCode
	 * StatementUpdateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice
	 * StatementUpdateTypeCodeAndDSSCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtUpdTpAsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementUpdateTypeAsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Update type expressed as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementUpdateTypeCodeAndDSSCodeChoice, StatementUpdateTypeCode> mmStatementUpdateTypeAsCode = new MMMessageAttribute<StatementUpdateTypeCodeAndDSSCodeChoice, StatementUpdateTypeCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "StmtUpdTpAsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementUpdateTypeAsCode";
			definition = "Update type expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatementUpdateTypeCode.mmObject();
		}

		@Override
		public StatementUpdateTypeCode getValue(StatementUpdateTypeCodeAndDSSCodeChoice obj) {
			return obj.getStatementUpdateTypeAsCode();
		}

		@Override
		public void setValue(StatementUpdateTypeCodeAndDSSCodeChoice obj, StatementUpdateTypeCode value) {
			obj.setStatementUpdateTypeAsCode(value);
		}
	};
	@XmlElement(name = "StmtUpdTpAsDSS", required = true)
	protected GenericIdentification7 statementUpdateTypeAsDSS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification7
	 * GenericIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice
	 * StatementUpdateTypeCodeAndDSSCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtUpdTpAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementUpdateTypeAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Update type expressed as a data source scheme and a code used within the data source scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementUpdateTypeCodeAndDSSCodeChoice, GenericIdentification7> mmStatementUpdateTypeAsDSS = new MMMessageAttribute<StatementUpdateTypeCodeAndDSSCodeChoice, GenericIdentification7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "StmtUpdTpAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementUpdateTypeAsDSS";
			definition = "Update type expressed as a data source scheme and a code used within the data source scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification7.mmObject();
		}

		@Override
		public GenericIdentification7 getValue(StatementUpdateTypeCodeAndDSSCodeChoice obj) {
			return obj.getStatementUpdateTypeAsDSS();
		}

		@Override
		public void setValue(StatementUpdateTypeCodeAndDSSCodeChoice obj, GenericIdentification7 value) {
			obj.setStatementUpdateTypeAsDSS(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice.mmStatementUpdateTypeAsCode,
						com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice.mmStatementUpdateTypeAsDSS);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementUpdateTypeCodeAndDSSCodeChoice";
				definition = "Choice between formats for the update type.";
			}
		});
		return mmObject_lazy.get();
	}

	public StatementUpdateTypeCode getStatementUpdateTypeAsCode() {
		return statementUpdateTypeAsCode;
	}

	public StatementUpdateTypeCodeAndDSSCodeChoice setStatementUpdateTypeAsCode(StatementUpdateTypeCode statementUpdateTypeAsCode) {
		this.statementUpdateTypeAsCode = Objects.requireNonNull(statementUpdateTypeAsCode);
		return this;
	}

	public GenericIdentification7 getStatementUpdateTypeAsDSS() {
		return statementUpdateTypeAsDSS;
	}

	public StatementUpdateTypeCodeAndDSSCodeChoice setStatementUpdateTypeAsDSS(GenericIdentification7 statementUpdateTypeAsDSS) {
		this.statementUpdateTypeAsDSS = Objects.requireNonNull(statementUpdateTypeAsDSS);
		return this;
	}
}