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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BusinessInformationCriteria;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the information that is searched either implicitly by recalling a
 * previous query or explicitly by defining the criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessInformationCriteriaDefinitionChoice#mmQueryName
 * GeneralBusinessInformationCriteriaDefinitionChoice.mmQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessInformationCriteriaDefinitionChoice#mmNewCriteria
 * GeneralBusinessInformationCriteriaDefinitionChoice.mmNewCriteria}</li>
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
 * "GeneralBusinessInformationCriteriaDefinitionChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria."
 * </li>
 * </ul>
 */
public class GeneralBusinessInformationCriteriaDefinitionChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text queryName;
	/**
	 * Recalls the criteria (search and return criteria) defined in a preceding
	 * query.
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
	 * {@linkplain com.tools20022.repository.choice.GeneralBusinessInformationCriteriaDefinitionChoice
	 * GeneralBusinessInformationCriteriaDefinitionChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Recalls the criteria (search and return criteria) defined in a preceding query."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueryName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeneralBusinessInformationCriteriaDefinitionChoice.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Recalls the criteria (search and return criteria) defined in a preceding query.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected BusinessInformationCriteria newCriteria;
	/**
	 * Defines the criteria based on which the information is extracted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BusinessInformationCriteria
	 * BusinessInformationCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GeneralBusinessInformationCriteriaDefinitionChoice
	 * GeneralBusinessInformationCriteriaDefinitionChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria based on which the information is extracted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GeneralBusinessInformationCriteriaDefinitionChoice.mmObject();
			isDerived = false;
			xmlTag = "NewCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCriteria";
			definition = "Defines the criteria based on which the information is extracted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BusinessInformationCriteria.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GeneralBusinessInformationCriteriaDefinitionChoice.mmQueryName, GeneralBusinessInformationCriteriaDefinitionChoice.mmNewCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GeneralBusinessInformationCriteriaDefinitionChoice";
				definition = "Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getQueryName() {
		return queryName;
	}

	public void setQueryName(Max35Text queryName) {
		this.queryName = queryName;
	}

	public BusinessInformationCriteria getNewCriteria() {
		return newCriteria;
	}

	public void setNewCriteria(BusinessInformationCriteria newCriteria) {
		this.newCriteria = newCriteria;
	}
}