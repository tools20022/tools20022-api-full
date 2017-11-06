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
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.msg.GenericIdentification10;
import com.tools20022.repository.msg.IndividualPerson4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of identification of an individual person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#mmIdentificationNumber
 * IndividualPersonIdentificationChoice.mmIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#mmPersonName
 * IndividualPersonIdentificationChoice.mmPersonName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
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
 * "IndividualPersonIdentificationChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of an individual person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice
 * IndividualPersonIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice
 * IndividualPersonIdentification2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class IndividualPersonIdentificationChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification10 identificationNumber;
	/**
	 * Information related to an identification, eg, party identification or
	 * account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification10
	 * GenericIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice
	 * IndividualPersonIdentificationChoice}</li>
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
	 * definition} =
	 * "Information related to an identification, eg, party identification or account identification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#mmIdentificationNumber
	 * IndividualPersonIdentification1Choice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#mmIdentificationNumber
	 * IndividualPersonIdentification2Choice.mmIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentificationNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> IndividualPersonIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "IdNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNumber";
			definition = "Information related to an identification, eg, party identification or account identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndividualPersonIdentification1Choice.mmIdentificationNumber,
					com.tools20022.repository.choice.IndividualPersonIdentification2Choice.mmIdentificationNumber);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification10.mmObject();
		}
	};
	protected IndividualPerson4 personName;
	/**
	 * Human entity, as distinguished from a corporate entity (which is
	 * sometimes referred to as an 'artificial person').
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson4
	 * IndividualPerson4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
	 * PersonIdentification.mmPersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice
	 * IndividualPersonIdentificationChoice}</li>
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
	 * definition} =
	 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#mmPersonName
	 * IndividualPersonIdentification1Choice.mmPersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#mmPersonName
	 * IndividualPersonIdentification2Choice.mmPersonName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPersonName = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmPersonName;
			componentContext_lazy = () -> IndividualPersonIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "PrsnNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonName";
			definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndividualPersonIdentification1Choice.mmPersonName, com.tools20022.repository.choice.IndividualPersonIdentification2Choice.mmPersonName);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndividualPersonIdentificationChoice.mmIdentificationNumber, com.tools20022.repository.choice.IndividualPersonIdentificationChoice.mmPersonName);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IndividualPersonIdentificationChoice";
				definition = "Choice of identification of an individual person.";
				nextVersions_lazy = () -> Arrays.asList(IndividualPersonIdentification1Choice.mmObject(), IndividualPersonIdentification2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification10 getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(GenericIdentification10 identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public IndividualPerson4 getPersonName() {
		return personName;
	}

	public void setPersonName(IndividualPerson4 personName) {
		this.personName = personName;
	}
}