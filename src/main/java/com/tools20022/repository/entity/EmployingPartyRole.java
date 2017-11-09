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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Organisation represented by a person, or for which a person works.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="EmployingPartyRole" src="doc-files/EmployingPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmEmployingParty
 * Person.mmEmployingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmEmployingCompany
 * IndividualPerson10.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmEmployingCompany
 * IndividualPerson20.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmEmployingCompany
 * IndividualPerson11.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson7#mmEmployingParty
 * IndividualPerson7.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson14#mmEmployingParty
 * IndividualPerson14.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson16#mmEmployingParty
 * IndividualPerson16.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson13#mmEmployingParty
 * IndividualPerson13.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson17#mmEmployingParty
 * IndividualPerson17.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmEmployingCompany
 * IndividualPerson21.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmEmployingCompany
 * IndividualPerson22.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmEmployingCompany
 * IndividualPerson23.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmEmployingCompany
 * IndividualPerson24.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#mmEmployingParty
 * IndividualPerson25.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmEmployingParty
 * IndividualPerson26.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmEmployingCompany
 * IndividualPerson28.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmEmployingCompany
 * IndividualPerson27.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmEmployingCompany
 * IndividualPerson33.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmEmployingCompany
 * IndividualPerson34.mmEmployingCompany}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#mmEmployee
 * EmployingPartyRole.mmEmployee}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EmployingPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation represented by a person, or for which a person works."</li>
 * </ul>
 */
public class EmployingPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Person> employee;
	/**
	 * Identifies the employee of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmEmployingParty
	 * Person.mmEmployingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Employee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the employee of a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEmployee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> EmployingPartyRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Employee";
			definition = "Identifies the employee of a party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmEmployingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EmployingPartyRole";
				definition = "Organisation represented by a person, or for which a person works.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.mmEmployingParty);
				derivationElement_lazy = () -> Arrays.asList(IndividualPerson10.mmEmployingCompany, IndividualPerson20.mmEmployingCompany, IndividualPerson11.mmEmployingCompany, IndividualPerson7.mmEmployingParty,
						IndividualPerson14.mmEmployingParty, IndividualPerson16.mmEmployingParty, IndividualPerson13.mmEmployingParty, IndividualPerson17.mmEmployingParty, IndividualPerson21.mmEmployingCompany,
						IndividualPerson22.mmEmployingCompany, IndividualPerson23.mmEmployingCompany, IndividualPerson24.mmEmployingCompany, IndividualPerson25.mmEmployingParty, IndividualPerson26.mmEmployingParty,
						IndividualPerson28.mmEmployingCompany, IndividualPerson27.mmEmployingCompany, IndividualPerson33.mmEmployingCompany, IndividualPerson34.mmEmployingCompany);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(EmployingPartyRole.mmEmployee);
			}
		});
		return mmObject_lazy.get();
	}

	public List<Person> getEmployee() {
		return employee;
	}

	public void setEmployee(List<com.tools20022.repository.entity.Person> employee) {
		this.employee = employee;
	}
}