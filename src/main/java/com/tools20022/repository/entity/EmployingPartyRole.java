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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation represented by a person, or for which a person works.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="EmployingPartyRole" src="doc-files/EmployingPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.EmployingPartyRole#Employee
 * EmployingPartyRole.Employee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#EmployingParty
 * Person.EmployingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#EmployingCompany
 * IndividualPerson10.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#EmployingCompany
 * IndividualPerson20.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#EmployingCompany
 * IndividualPerson11.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson7#EmployingParty
 * IndividualPerson7.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson14#EmployingParty
 * IndividualPerson14.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson16#EmployingParty
 * IndividualPerson16.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson13#EmployingParty
 * IndividualPerson13.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson17#EmployingParty
 * IndividualPerson17.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#EmployingCompany
 * IndividualPerson21.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#EmployingCompany
 * IndividualPerson22.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#EmployingCompany
 * IndividualPerson23.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#EmployingCompany
 * IndividualPerson24.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#EmployingParty
 * IndividualPerson25.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#EmployingParty
 * IndividualPerson26.EmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#EmployingCompany
 * IndividualPerson28.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#EmployingCompany
 * IndividualPerson27.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#EmployingCompany
 * IndividualPerson33.EmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#EmployingCompany
 * IndividualPerson34.EmployingCompany}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "EmployingPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation represented by a person, or for which a person works."</li>
 * </ul>
 */
public class EmployingPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the employee of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#EmployingParty
	 * Person.EmployingParty}</li>
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
	public static final MMBusinessAssociationEnd Employee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> EmployingPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Employee";
			definition = "Identifies the employee of a party.";
			minOccurs = 0;
			type_lazy = () -> Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.EmployingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EmployingPartyRole";
				definition = "Organisation represented by a person, or for which a person works.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.EmployingParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson10.EmployingCompany, com.tools20022.repository.msg.IndividualPerson20.EmployingCompany,
						com.tools20022.repository.msg.IndividualPerson11.EmployingCompany, com.tools20022.repository.msg.IndividualPerson7.EmployingParty, com.tools20022.repository.msg.IndividualPerson14.EmployingParty,
						com.tools20022.repository.msg.IndividualPerson16.EmployingParty, com.tools20022.repository.msg.IndividualPerson13.EmployingParty, com.tools20022.repository.msg.IndividualPerson17.EmployingParty,
						com.tools20022.repository.msg.IndividualPerson21.EmployingCompany, com.tools20022.repository.msg.IndividualPerson22.EmployingCompany, com.tools20022.repository.msg.IndividualPerson23.EmployingCompany,
						com.tools20022.repository.msg.IndividualPerson24.EmployingCompany, com.tools20022.repository.msg.IndividualPerson25.EmployingParty, com.tools20022.repository.msg.IndividualPerson26.EmployingParty,
						com.tools20022.repository.msg.IndividualPerson28.EmployingCompany, com.tools20022.repository.msg.IndividualPerson27.EmployingCompany, com.tools20022.repository.msg.IndividualPerson33.EmployingCompany,
						com.tools20022.repository.msg.IndividualPerson34.EmployingCompany);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.EmployingPartyRole.Employee);
			}
		});
		return mmObject_lazy.get();
	}
}