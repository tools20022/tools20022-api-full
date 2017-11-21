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
import com.tools20022.repository.codeset.InternalPartyRole1Code;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PersonIdentification10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the identification of a person or an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmLEI
 * PersonOrOrganisation1Choice.mmLEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmMIC
 * PersonOrOrganisation1Choice.mmMIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmPerson
 * PersonOrOrganisation1Choice.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmInternal
 * PersonOrOrganisation1Choice.mmInternal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "PersonOrOrganisation1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the identification of a person or an organisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
 * PersonOrOrganisation2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PersonOrOrganisation1Choice", propOrder = {"LEI", "MIC", "person", "internal"})
public class PersonOrOrganisation1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected LEIIdentifier lEI;
	/**
	 * Legal entity identifier of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
	 * PersonOrOrganisation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity identifier of the party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#mmLEI
	 * PersonOrOrganisation2Choice.mmLEI}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLEI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> PersonOrOrganisation1Choice.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identifier of the party.";
			nextVersions_lazy = () -> Arrays.asList(PersonOrOrganisation2Choice.mmLEI);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected MICIdentifier mIC;
	/**
	 * Market identifier code of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
	 * PersonOrOrganisation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market identifier code of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> PersonOrOrganisation1Choice.mmObject();
			isDerived = false;
			xmlTag = "MIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MIC";
			definition = "Market identifier code of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected PersonIdentification10 person;
	/**
	 * Identification of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification10
	 * PersonIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
	 * PersonOrOrganisation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#mmPerson
	 * PersonOrOrganisation2Choice.mmPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PersonIdentification.mmObject();
			componentContext_lazy = () -> PersonOrOrganisation1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Person";
			definition = "Identification of a person.";
			nextVersions_lazy = () -> Arrays.asList(PersonOrOrganisation2Choice.mmPerson);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PersonIdentification10.mmObject();
		}
	};
	protected InternalPartyRole1Code internal;
	/**
	 * Identifies internal party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InternalPartyRole1Code
	 * InternalPartyRole1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
	 * PersonOrOrganisation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Internal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies internal party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInternal = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PersonOrOrganisation1Choice.mmObject();
			isDerived = false;
			xmlTag = "Intl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Internal";
			definition = "Identifies internal party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InternalPartyRole1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PersonOrOrganisation1Choice.mmLEI, PersonOrOrganisation1Choice.mmMIC, PersonOrOrganisation1Choice.mmPerson, PersonOrOrganisation1Choice.mmInternal);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonOrOrganisation1Choice";
				definition = "Specifies the identification of a person or an organisation.";
				nextVersions_lazy = () -> Arrays.asList(PersonOrOrganisation2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LEI", required = true)
	public LEIIdentifier getLEI() {
		return lEI;
	}

	public void setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
	}

	@XmlElement(name = "MIC", required = true)
	public MICIdentifier getMIC() {
		return mIC;
	}

	public void setMIC(MICIdentifier mIC) {
		this.mIC = mIC;
	}

	@XmlElement(name = "Prsn", required = true)
	public PersonIdentification10 getPerson() {
		return person;
	}

	public void setPerson(PersonIdentification10 person) {
		this.person = person;
	}

	@XmlElement(name = "Intl", required = true)
	public InternalPartyRole1Code getInternal() {
		return internal;
	}

	public void setInternal(InternalPartyRole1Code internal) {
		this.internal = internal;
	}
}