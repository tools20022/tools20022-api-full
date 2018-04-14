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
import com.tools20022.repository.msg.MemberCriteria;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinitionChoice#mmQueryName
 * MemberCriteriaDefinitionChoice.mmQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinitionChoice#mmNewCriteria
 * MemberCriteriaDefinitionChoice.mmNewCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberCriteriaDefinitionChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinition1Choice
 * MemberCriteriaDefinition1Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MemberCriteriaDefinitionChoice", propOrder = {"queryName", "newCriteria"})
public class MemberCriteriaDefinitionChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryNm", required = true)
	protected Max35Text queryName;
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
	 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinitionChoice
	 * MemberCriteriaDefinitionChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Recalls the criteria (search and return criteria) defined in a preceding query."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinition1Choice#mmQueryName
	 * MemberCriteriaDefinition1Choice.mmQueryName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberCriteriaDefinitionChoice, Max35Text> mmQueryName = new MMMessageAttribute<MemberCriteriaDefinitionChoice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.MemberCriteriaDefinitionChoice.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Recalls the criteria (search and return criteria) defined in a preceding query.";
			nextVersions_lazy = () -> Arrays.asList(MemberCriteriaDefinition1Choice.mmQueryName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MemberCriteriaDefinitionChoice obj) {
			return obj.getQueryName();
		}

		@Override
		public void setValue(MemberCriteriaDefinitionChoice obj, Max35Text value) {
			obj.setQueryName(value);
		}
	};
	@XmlElement(name = "NewCrit", required = true)
	protected MemberCriteria newCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MemberCriteria
	 * MemberCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinitionChoice
	 * MemberCriteriaDefinitionChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria based on which the information is extracted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberCriteriaDefinition1Choice#mmNewCriteria
	 * MemberCriteriaDefinition1Choice.mmNewCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberCriteriaDefinitionChoice, MemberCriteria> mmNewCriteria = new MMMessageAssociationEnd<MemberCriteriaDefinitionChoice, MemberCriteria>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.MemberCriteriaDefinitionChoice.mmObject();
			isDerived = false;
			xmlTag = "NewCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCriteria";
			definition = "Defines the criteria based on which the information is extracted.";
			nextVersions_lazy = () -> Arrays.asList(MemberCriteriaDefinition1Choice.mmNewCriteria);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MemberCriteria.mmObject();
		}

		@Override
		public MemberCriteria getValue(MemberCriteriaDefinitionChoice obj) {
			return obj.getNewCriteria();
		}

		@Override
		public void setValue(MemberCriteriaDefinitionChoice obj, MemberCriteria value) {
			obj.setNewCriteria(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MemberCriteriaDefinitionChoice.mmQueryName, com.tools20022.repository.choice.MemberCriteriaDefinitionChoice.mmNewCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MemberCriteriaDefinitionChoice";
				definition = "Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria.";
				nextVersions_lazy = () -> Arrays.asList(MemberCriteriaDefinition1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getQueryName() {
		return queryName;
	}

	public MemberCriteriaDefinitionChoice setQueryName(Max35Text queryName) {
		this.queryName = Objects.requireNonNull(queryName);
		return this;
	}

	public MemberCriteria getNewCriteria() {
		return newCriteria;
	}

	public MemberCriteriaDefinitionChoice setNewCriteria(MemberCriteria newCriteria) {
		this.newCriteria = Objects.requireNonNull(newCriteria);
		return this;
	}
}