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
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria to extract the reservation information and the expected
 * reservation report. A name may be given to the new query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1#mmNewQueryName
 * ReservationCriteria1.mmNewQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1#mmSearchCriteria
 * ReservationCriteria1.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1#mmReturnCriteria
 * ReservationCriteria1.mmReturnCriteria}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Reservation
 * Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forReservationCriteria1
 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forReservationCriteria1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria to extract the reservation information and the expected reservation report. A name may be given to the new query."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReservationCriteria1", propOrder = {"newQueryName", "searchCriteria", "returnCriteria"})
public class ReservationCriteria1 {

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
	 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1
	 * ReservationCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewQryNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewQueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the query defined by the search criteria and return criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewQueryName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReservationCriteria1.mmObject();
			isDerived = false;
			xmlTag = "NewQryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQueryName";
			definition = "Name of the query defined by the search criteria and return criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SchCrit")
	protected List<com.tools20022.repository.msg.ReservationSearchCriteria1> searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1
	 * ReservationSearchCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1
	 * ReservationCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to extract the reservation information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSearchCriteria = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReservationCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to extract the reservation information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReservationSearchCriteria1.mmObject();
		}
	};
	@XmlElement(name = "RtrCrit")
	protected ReservationReturnCriteria returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReservationReturnCriteria
	 * ReservationReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1
	 * ReservationCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the expected reservation report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReturnCriteria = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReservationCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the expected reservation report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReservationReturnCriteria.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReservationCriteria1.mmNewQueryName, com.tools20022.repository.msg.ReservationCriteria1.mmSearchCriteria,
						com.tools20022.repository.msg.ReservationCriteria1.mmReturnCriteria);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forReservationCriteria1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReservationCriteria1";
				definition = "Defines the criteria to extract the reservation information and the expected reservation report. A name may be given to the new query.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNewQueryName() {
		return newQueryName == null ? Optional.empty() : Optional.of(newQueryName);
	}

	public ReservationCriteria1 setNewQueryName(Max35Text newQueryName) {
		this.newQueryName = newQueryName;
		return this;
	}

	public List<ReservationSearchCriteria1> getSearchCriteria() {
		return searchCriteria == null ? searchCriteria = new ArrayList<>() : searchCriteria;
	}

	public ReservationCriteria1 setSearchCriteria(List<com.tools20022.repository.msg.ReservationSearchCriteria1> searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public Optional<ReservationReturnCriteria> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public ReservationCriteria1 setReturnCriteria(com.tools20022.repository.msg.ReservationReturnCriteria returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}
}