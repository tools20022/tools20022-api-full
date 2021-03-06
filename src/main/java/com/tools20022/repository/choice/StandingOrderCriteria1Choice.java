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
import com.tools20022.repository.msg.StandingOrderCriteria1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria1Choice#mmQueryName
 * StandingOrderCriteria1Choice.mmQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria1Choice#mmNewCriteria
 * StandingOrderCriteria1Choice.mmNewCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderCriteria1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria2Choice
 * StandingOrderCriteria2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingOrderCriteria1Choice", propOrder = {"queryName", "newCriteria"})
public class StandingOrderCriteria1Choice {

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
	 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria1Choice
	 * StandingOrderCriteria1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria2Choice#mmQueryName
	 * StandingOrderCriteria2Choice.mmQueryName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StandingOrderCriteria1Choice, Max35Text> mmQueryName = new MMMessageAttribute<StandingOrderCriteria1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StandingOrderCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Recalls the criteria (search and return criteria) defined in a preceding query.";
			nextVersions_lazy = () -> Arrays.asList(StandingOrderCriteria2Choice.mmQueryName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StandingOrderCriteria1Choice obj) {
			return obj.getQueryName();
		}

		@Override
		public void setValue(StandingOrderCriteria1Choice obj, Max35Text value) {
			obj.setQueryName(value);
		}
	};
	@XmlElement(name = "NewCrit", required = true)
	protected StandingOrderCriteria1 newCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StandingOrderCriteria1
	 * StandingOrderCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria1Choice
	 * StandingOrderCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Explicitly defines the query criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StandingOrderCriteria2Choice#mmNewCriteria
	 * StandingOrderCriteria2Choice.mmNewCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingOrderCriteria1Choice, StandingOrderCriteria1> mmNewCriteria = new MMMessageAssociationEnd<StandingOrderCriteria1Choice, StandingOrderCriteria1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StandingOrderCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "NewCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCriteria";
			definition = "Explicitly defines the query criteria.";
			nextVersions_lazy = () -> Arrays.asList(StandingOrderCriteria2Choice.mmNewCriteria);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StandingOrderCriteria1.mmObject();
		}

		@Override
		public StandingOrderCriteria1 getValue(StandingOrderCriteria1Choice obj) {
			return obj.getNewCriteria();
		}

		@Override
		public void setValue(StandingOrderCriteria1Choice obj, StandingOrderCriteria1 value) {
			obj.setNewCriteria(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.StandingOrderCriteria1Choice.mmQueryName, com.tools20022.repository.choice.StandingOrderCriteria1Choice.mmNewCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StandingOrderCriteria1Choice";
				definition = "Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria.";
				nextVersions_lazy = () -> Arrays.asList(StandingOrderCriteria2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getQueryName() {
		return queryName;
	}

	public StandingOrderCriteria1Choice setQueryName(Max35Text queryName) {
		this.queryName = Objects.requireNonNull(queryName);
		return this;
	}

	public StandingOrderCriteria1 getNewCriteria() {
		return newCriteria;
	}

	public StandingOrderCriteria1Choice setNewCriteria(StandingOrderCriteria1 newCriteria) {
		this.newCriteria = Objects.requireNonNull(newCriteria);
		return this;
	}
}