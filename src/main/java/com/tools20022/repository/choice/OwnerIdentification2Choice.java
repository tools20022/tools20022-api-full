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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.IndividualPersonIdentification2Choice;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification95;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of individual or organisation details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OwnerIdentification2Choice#mmIndividualOwnerIdentification
 * OwnerIdentification2Choice.mmIndividualOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OwnerIdentification2Choice#mmOrganisationOwnerIdentification
 * OwnerIdentification2Choice.mmOrganisationOwnerIdentification}</li>
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
 * "OwnerIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of individual or organisation details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.OwnerIdentification1Choice
 * OwnerIdentification1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OwnerIdentification2Choice", propOrder = {"individualOwnerIdentification", "organisationOwnerIdentification"})
public class OwnerIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndvOwnrId", required = true)
	protected IndividualPersonIdentification2Choice individualOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice
	 * IndividualPersonIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification2Choice
	 * OwnerIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the individual person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification1Choice#mmIndividualOwnerIdentification
	 * OwnerIdentification1Choice.mmIndividualOwnerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OwnerIdentification2Choice, IndividualPersonIdentification2Choice> mmIndividualOwnerIdentification = new MMMessageAssociationEnd<OwnerIdentification2Choice, IndividualPersonIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.OwnerIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOwnerIdentification";
			definition = "Identification of the individual person.";
			previousVersion_lazy = () -> OwnerIdentification1Choice.mmIndividualOwnerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPersonIdentification2Choice.mmObject();
		}

		@Override
		public IndividualPersonIdentification2Choice getValue(OwnerIdentification2Choice obj) {
			return obj.getIndividualOwnerIdentification();
		}

		@Override
		public void setValue(OwnerIdentification2Choice obj, IndividualPersonIdentification2Choice value) {
			obj.setIndividualOwnerIdentification(value);
		}
	};
	@XmlElement(name = "OrgOwnrId", required = true)
	protected PartyIdentification95 organisationOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification95
	 * PartyIdentification95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification2Choice
	 * OwnerIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of an organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification1Choice#mmOrganisationOwnerIdentification
	 * OwnerIdentification1Choice.mmOrganisationOwnerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OwnerIdentification2Choice, PartyIdentification95> mmOrganisationOwnerIdentification = new MMMessageAssociationEnd<OwnerIdentification2Choice, PartyIdentification95>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.OwnerIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationOwnerIdentification";
			definition = "Identification of an organisation.";
			previousVersion_lazy = () -> OwnerIdentification1Choice.mmOrganisationOwnerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification95.mmObject();
		}

		@Override
		public PartyIdentification95 getValue(OwnerIdentification2Choice obj) {
			return obj.getOrganisationOwnerIdentification();
		}

		@Override
		public void setValue(OwnerIdentification2Choice obj, PartyIdentification95 value) {
			obj.setOrganisationOwnerIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OwnerIdentification2Choice.mmIndividualOwnerIdentification,
						com.tools20022.repository.choice.OwnerIdentification2Choice.mmOrganisationOwnerIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OwnerIdentification2Choice";
				definition = "Choice of individual or organisation details.";
				previousVersion_lazy = () -> OwnerIdentification1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public IndividualPersonIdentification2Choice getIndividualOwnerIdentification() {
		return individualOwnerIdentification;
	}

	public OwnerIdentification2Choice setIndividualOwnerIdentification(IndividualPersonIdentification2Choice individualOwnerIdentification) {
		this.individualOwnerIdentification = Objects.requireNonNull(individualOwnerIdentification);
		return this;
	}

	public PartyIdentification95 getOrganisationOwnerIdentification() {
		return organisationOwnerIdentification;
	}

	public OwnerIdentification2Choice setOrganisationOwnerIdentification(PartyIdentification95 organisationOwnerIdentification) {
		this.organisationOwnerIdentification = Objects.requireNonNull(organisationOwnerIdentification);
		return this;
	}
}