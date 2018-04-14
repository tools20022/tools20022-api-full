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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LimitReturnCriteria2;
import com.tools20022.repository.msg.LimitSearchCriteria3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria to extract the limit information and the expected limit
 * report. A name may be given to the new query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitCriteria3#mmNewQueryName
 * LimitCriteria3.mmNewQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitCriteria3#mmSearchCriteria
 * LimitCriteria3.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitCriteria3#mmReturnCriteria
 * LimitCriteria3.mmReturnCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria to extract the limit information and the expected limit report. A name may be given to the new query."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLimitCriteriaGuideline#forLimitCriteria3
 * ConstraintLimitCriteriaGuideline.forLimitCriteria3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forLimitCriteria3
 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitCriteria4 LimitCriteria4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitCriteria3", propOrder = {"newQueryName", "searchCriteria", "returnCriteria"})
public class LimitCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NewQryNm")
	protected Max35Text newQueryName;
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
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria3 LimitCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewQryNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewQueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the query defined by the search criteria and return criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria4#mmNewQueryName
	 * LimitCriteria4.mmNewQueryName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitCriteria3, Optional<Max35Text>> mmNewQueryName = new MMMessageAttribute<LimitCriteria3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NewQryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQueryName";
			definition = "Name of the query defined by the search criteria and return criteria.";
			nextVersions_lazy = () -> Arrays.asList(LimitCriteria4.mmNewQueryName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(LimitCriteria3 obj) {
			return obj.getNewQueryName();
		}

		@Override
		public void setValue(LimitCriteria3 obj, Optional<Max35Text> value) {
			obj.setNewQueryName(value.orElse(null));
		}
	};
	@XmlElement(name = "SchCrit")
	protected List<LimitSearchCriteria3> searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
	 * LimitSearchCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria3 LimitCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the criteria to extract the limit information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria4#mmSearchCriteria
	 * LimitCriteria4.mmSearchCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitCriteria3, List<LimitSearchCriteria3>> mmSearchCriteria = new MMMessageAssociationEnd<LimitCriteria3, List<LimitSearchCriteria3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitCriteria3.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to extract the limit information.";
			nextVersions_lazy = () -> Arrays.asList(LimitCriteria4.mmSearchCriteria);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LimitSearchCriteria3.mmObject();
		}

		@Override
		public List<LimitSearchCriteria3> getValue(LimitCriteria3 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(LimitCriteria3 obj, List<LimitSearchCriteria3> value) {
			obj.setSearchCriteria(value);
		}
	};
	@XmlElement(name = "RtrCrit")
	protected LimitReturnCriteria2 returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitReturnCriteria2
	 * LimitReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria3 LimitCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the expected limit report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitCriteria4#mmReturnCriteria
	 * LimitCriteria4.mmReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitCriteria3, Optional<LimitReturnCriteria2>> mmReturnCriteria = new MMMessageAssociationEnd<LimitCriteria3, Optional<LimitReturnCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitCriteria3.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the expected limit report.";
			nextVersions_lazy = () -> Arrays.asList(LimitCriteria4.mmReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LimitReturnCriteria2.mmObject();
		}

		@Override
		public Optional<LimitReturnCriteria2> getValue(LimitCriteria3 obj) {
			return obj.getReturnCriteria();
		}

		@Override
		public void setValue(LimitCriteria3 obj, Optional<LimitReturnCriteria2> value) {
			obj.setReturnCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitCriteria3.mmNewQueryName, com.tools20022.repository.msg.LimitCriteria3.mmSearchCriteria,
						com.tools20022.repository.msg.LimitCriteria3.mmReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLimitCriteriaGuideline.forLimitCriteria3,
						com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forLimitCriteria3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitCriteria3";
				definition = "Defines the criteria to extract the limit information and the expected limit report. A name may be given to the new query.";
				nextVersions_lazy = () -> Arrays.asList(LimitCriteria4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNewQueryName() {
		return newQueryName == null ? Optional.empty() : Optional.of(newQueryName);
	}

	public LimitCriteria3 setNewQueryName(Max35Text newQueryName) {
		this.newQueryName = newQueryName;
		return this;
	}

	public List<LimitSearchCriteria3> getSearchCriteria() {
		return searchCriteria == null ? searchCriteria = new ArrayList<>() : searchCriteria;
	}

	public LimitCriteria3 setSearchCriteria(List<LimitSearchCriteria3> searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public Optional<LimitReturnCriteria2> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public LimitCriteria3 setReturnCriteria(LimitReturnCriteria2 returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}
}