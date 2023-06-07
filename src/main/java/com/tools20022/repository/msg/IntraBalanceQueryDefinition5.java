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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MovementResponseType1Code;
import com.tools20022.repository.entity.IntraPositionTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IntraBalanceQueryCriteria5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the information that is searched through specific criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition5#mmQueryType
 * IntraBalanceQueryDefinition5.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition5#mmSearchCriteria
 * IntraBalanceQueryDefinition5.mmSearchCriteria}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalanceQueryDefinition5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the information that is searched through specific criteria."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition2
 * IntraBalanceQueryDefinition2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceQueryDefinition5", propOrder = {"queryType", "searchCriteria"})
public class IntraBalanceQueryDefinition5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryTp", required = true)
	protected MovementResponseType1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MovementResponseType1Code
	 * MovementResponseType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition5
	 * IntraBalanceQueryDefinition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition2#mmQueryType
	 * IntraBalanceQueryDefinition2.mmQueryType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceQueryDefinition5, MovementResponseType1Code> mmQueryType = new MMMessageAttribute<IntraBalanceQueryDefinition5, MovementResponseType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryDefinition5.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Defines the type of query.";
			previousVersion_lazy = () -> IntraBalanceQueryDefinition2.mmQueryType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MovementResponseType1Code.mmObject();
		}

		@Override
		public MovementResponseType1Code getValue(IntraBalanceQueryDefinition5 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(IntraBalanceQueryDefinition5 obj, MovementResponseType1Code value) {
			obj.setQueryType(value);
		}
	};
	@XmlElement(name = "SchCrit", required = true)
	protected IntraBalanceQueryCriteria5 searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition5
	 * IntraBalanceQueryDefinition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to extract the intra-balance movement instruction information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition2#mmSearchCriteria
	 * IntraBalanceQueryDefinition2.mmSearchCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceQueryDefinition5, IntraBalanceQueryCriteria5> mmSearchCriteria = new MMMessageAttribute<IntraBalanceQueryDefinition5, IntraBalanceQueryCriteria5>() {
		{
			businessComponentTrace_lazy = () -> IntraPositionTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryDefinition5.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to extract the intra-balance movement instruction information.";
			previousVersion_lazy = () -> IntraBalanceQueryDefinition2.mmSearchCriteria;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IntraBalanceQueryCriteria5.mmObject();
		}

		@Override
		public IntraBalanceQueryCriteria5 getValue(IntraBalanceQueryDefinition5 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(IntraBalanceQueryDefinition5 obj, IntraBalanceQueryCriteria5 value) {
			obj.setSearchCriteria(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceQueryDefinition5.mmQueryType, com.tools20022.repository.msg.IntraBalanceQueryDefinition5.mmSearchCriteria);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceQueryDefinition5";
				definition = "Defines the information that is searched through specific criteria.";
				previousVersion_lazy = () -> IntraBalanceQueryDefinition2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public MovementResponseType1Code getQueryType() {
		return queryType;
	}

	public IntraBalanceQueryDefinition5 setQueryType(MovementResponseType1Code queryType) {
		this.queryType = Objects.requireNonNull(queryType);
		return this;
	}

	public IntraBalanceQueryCriteria5 getSearchCriteria() {
		return searchCriteria;
	}

	public IntraBalanceQueryDefinition5 setSearchCriteria(IntraBalanceQueryCriteria5 searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}
}