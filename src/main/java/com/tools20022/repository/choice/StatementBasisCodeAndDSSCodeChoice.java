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
import com.tools20022.repository.codeset.StatementBasis1Code;
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
 * Choice between formats for the statement basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice#mmStatementBasisAsCode
 * StatementBasisCodeAndDSSCodeChoice.mmStatementBasisAsCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice#mmStatementBasisAsDSS
 * StatementBasisCodeAndDSSCodeChoice.mmStatementBasisAsDSS}</li>
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
 * "StatementBasisCodeAndDSSCodeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the statement basis."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementBasisCodeAndDSSCodeChoice", propOrder = {"statementBasisAsCode", "statementBasisAsDSS"})
public class StatementBasisCodeAndDSSCodeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtBsisAsCd", required = true)
	protected StatementBasis1Code statementBasisAsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasis1Code
	 * StatementBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice
	 * StatementBasisCodeAndDSSCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtBsisAsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasisAsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement basis expressed as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementBasisCodeAndDSSCodeChoice, StatementBasis1Code> mmStatementBasisAsCode = new MMMessageAttribute<StatementBasisCodeAndDSSCodeChoice, StatementBasis1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "StmtBsisAsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasisAsCode";
			definition = "Statement basis expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatementBasis1Code.mmObject();
		}

		@Override
		public StatementBasis1Code getValue(StatementBasisCodeAndDSSCodeChoice obj) {
			return obj.getStatementBasisAsCode();
		}

		@Override
		public void setValue(StatementBasisCodeAndDSSCodeChoice obj, StatementBasis1Code value) {
			obj.setStatementBasisAsCode(value);
		}
	};
	@XmlElement(name = "StmtBsisAsDSS", required = true)
	protected GenericIdentification7 statementBasisAsDSS;
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
	 * {@linkplain com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice
	 * StatementBasisCodeAndDSSCodeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtBsisAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasisAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Statement basis expressed as a data source scheme and a code used within the data source scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementBasisCodeAndDSSCodeChoice, GenericIdentification7> mmStatementBasisAsDSS = new MMMessageAttribute<StatementBasisCodeAndDSSCodeChoice, GenericIdentification7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice.mmObject();
			isDerived = false;
			xmlTag = "StmtBsisAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasisAsDSS";
			definition = "Statement basis expressed as a data source scheme and a code used within the data source scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification7.mmObject();
		}

		@Override
		public GenericIdentification7 getValue(StatementBasisCodeAndDSSCodeChoice obj) {
			return obj.getStatementBasisAsDSS();
		}

		@Override
		public void setValue(StatementBasisCodeAndDSSCodeChoice obj, GenericIdentification7 value) {
			obj.setStatementBasisAsDSS(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice.mmStatementBasisAsCode, com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice.mmStatementBasisAsDSS);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementBasisCodeAndDSSCodeChoice";
				definition = "Choice between formats for the statement basis.";
			}
		});
		return mmObject_lazy.get();
	}

	public StatementBasis1Code getStatementBasisAsCode() {
		return statementBasisAsCode;
	}

	public StatementBasisCodeAndDSSCodeChoice setStatementBasisAsCode(StatementBasis1Code statementBasisAsCode) {
		this.statementBasisAsCode = Objects.requireNonNull(statementBasisAsCode);
		return this;
	}

	public GenericIdentification7 getStatementBasisAsDSS() {
		return statementBasisAsDSS;
	}

	public StatementBasisCodeAndDSSCodeChoice setStatementBasisAsDSS(GenericIdentification7 statementBasisAsDSS) {
		this.statementBasisAsDSS = Objects.requireNonNull(statementBasisAsDSS);
		return this;
	}
}