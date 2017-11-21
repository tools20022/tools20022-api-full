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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson29;
import com.tools20022.repository.msg.Organisation23;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of individual or organisation name and address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegisteredShareholderName1Choice#mmIndividualPerson
 * RegisteredShareholderName1Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegisteredShareholderName1Choice#mmOrganisation
 * RegisteredShareholderName1Choice.mmOrganisation}</li>
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
 * "RegisteredShareholderName1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of individual or organisation name and address."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RegisteredShareholderName1Choice", propOrder = {"individualPerson", "organisation"})
public class RegisteredShareholderName1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected IndividualPerson29 individualPerson;
	/**
	 * Human entity, as distinguished from a corporate entity (which is
	 * sometimes referred to as an 'artificial person').
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson29
	 * IndividualPerson29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RegisteredShareholderName1Choice
	 * RegisteredShareholderName1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualPerson = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredShareholderName1Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualPerson";
			definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson29.mmObject();
		}
	};
	protected Organisation23 organisation;
	/**
	 * Organised structure that is set up for a particular purpose, for example,
	 * a business, government body, department, charity, or financial
	 * institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation23
	 * Organisation23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RegisteredShareholderName1Choice
	 * RegisteredShareholderName1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrganisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RegisteredShareholderName1Choice.mmObject();
			isDerived = false;
			xmlTag = "Org";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Organisation23.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RegisteredShareholderName1Choice.mmIndividualPerson, RegisteredShareholderName1Choice.mmOrganisation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredShareholderName1Choice";
				definition = "Choice of individual or organisation name and address.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IndvPrsn", required = true)
	public IndividualPerson29 getIndividualPerson() {
		return individualPerson;
	}

	public void setIndividualPerson(IndividualPerson29 individualPerson) {
		this.individualPerson = individualPerson;
	}

	@XmlElement(name = "Org", required = true)
	public Organisation23 getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation23 organisation) {
		this.organisation = organisation;
	}
}