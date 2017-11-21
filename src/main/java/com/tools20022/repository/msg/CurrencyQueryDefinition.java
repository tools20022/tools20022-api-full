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
import com.tools20022.repository.choice.CurrencyCriteriaDefinitionChoice;
import com.tools20022.repository.codeset.QueryType1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyQueryDefinition#mmQueryType
 * CurrencyQueryDefinition.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyQueryDefinition#mmCurrencyCriteria
 * CurrencyQueryDefinition.mmCurrencyCriteria}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyQueryDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the query criteria."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CurrencyQueryDefinition", propOrder = {"queryType", "currencyCriteria"})
public class CurrencyQueryDefinition {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected QueryType1Code queryType;
	/**
	 * Specifies if all matching items or only the new matching items since the
	 * latest query are returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType1Code
	 * QueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyQueryDefinition
	 * CurrencyQueryDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if all matching items or only the new matching items since the latest query are returned."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyQueryDefinition.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Specifies if all matching items or only the new matching items since the latest query are returned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QueryType1Code.mmObject();
		}
	};
	protected CurrencyCriteriaDefinitionChoice currencyCriteria;
	/**
	 * Defines of the currency query criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CurrencyCriteriaDefinitionChoice
	 * CurrencyCriteriaDefinitionChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyQueryDefinition
	 * CurrencyQueryDefinition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines of the currency query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyQueryDefinition.mmObject();
			isDerived = false;
			xmlTag = "CcyCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyCriteria";
			definition = "Defines of the currency query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyCriteriaDefinitionChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CurrencyQueryDefinition.mmQueryType, CurrencyQueryDefinition.mmCurrencyCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CurrencyQueryDefinition";
				definition = "Defines the query criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QryTp")
	public QueryType1Code getQueryType() {
		return queryType;
	}

	public void setQueryType(QueryType1Code queryType) {
		this.queryType = queryType;
	}

	@XmlElement(name = "CcyCrit")
	public CurrencyCriteriaDefinitionChoice getCurrencyCriteria() {
		return currencyCriteria;
	}

	public void setCurrencyCriteria(CurrencyCriteriaDefinitionChoice currencyCriteria) {
		this.currencyCriteria = currencyCriteria;
	}
}