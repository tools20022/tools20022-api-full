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
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification81;
import com.tools20022.repository.msg.IndividualPerson35;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for the identification of an individual person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice#mmIdentificationNumber
 * IndividualPersonIdentification3Choice.mmIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice#mmPersonName
 * IndividualPersonIdentification3Choice.mmPersonName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
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
 * "IndividualPersonIdentification3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of formats for the identification of an individual person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice
 * IndividualPersonIdentification1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPersonIdentification3Choice", propOrder = {"identificationNumber", "personName"})
public class IndividualPersonIdentification3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IdNb", required = true)
	protected GenericIdentification81 identificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification81
	 * GenericIdentification81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice
	 * IndividualPersonIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#mmIdentificationNumber
	 * IndividualPersonIdentification1Choice.mmIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentificationNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IndividualPersonIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "IdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNumber";
			definition = "Identification of the person that owns the account.";
			previousVersion_lazy = () -> IndividualPersonIdentification1Choice.mmIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification81.mmObject();
		}
	};
	@XmlElement(name = "PrsnNm", required = true)
	protected IndividualPerson35 personName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson35
	 * IndividualPerson35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
	 * PersonIdentification.mmPersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice
	 * IndividualPersonIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrsnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the person that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#mmPersonName
	 * IndividualPersonIdentification1Choice.mmPersonName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPersonName = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPersonName;
			componentContext_lazy = () -> com.tools20022.repository.choice.IndividualPersonIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "PrsnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonName";
			definition = "Name of the person that owns the account.";
			previousVersion_lazy = () -> IndividualPersonIdentification1Choice.mmPersonName;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson35.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndividualPersonIdentification3Choice.mmIdentificationNumber, com.tools20022.repository.choice.IndividualPersonIdentification3Choice.mmPersonName);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPersonIdentification3Choice";
				definition = "Choice of formats for the identification of an individual person.";
				previousVersion_lazy = () -> IndividualPersonIdentification1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification81 getIdentificationNumber() {
		return identificationNumber;
	}

	public IndividualPersonIdentification3Choice setIdentificationNumber(GenericIdentification81 identificationNumber) {
		this.identificationNumber = Objects.requireNonNull(identificationNumber);
		return this;
	}

	public IndividualPerson35 getPersonName() {
		return personName;
	}

	public IndividualPersonIdentification3Choice setPersonName(IndividualPerson35 personName) {
		this.personName = Objects.requireNonNull(personName);
		return this;
	}
}