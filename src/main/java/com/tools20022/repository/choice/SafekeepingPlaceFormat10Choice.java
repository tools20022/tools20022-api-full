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
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV06;
import com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification78;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmIdentification
 * SafekeepingPlaceFormat10Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmCountry
 * SafekeepingPlaceFormat10Choice.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat10Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmProprietary
 * SafekeepingPlaceFormat10Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
 * SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04#mmSafekeepingPlace
 * IntraPositionMovementInstructionV04.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05#mmSafekeepingPlace
 * IntraPositionMovementConfirmationV05.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV06#mmSafekeepingPlace
 * IntraPositionMovementConfirmationV06.mmSafekeepingPlace}</li>
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
 * "SafekeepingPlaceFormat10Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the place of safekeeping."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
 * SafekeepingPlaceFormat3Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SafekeepingPlaceFormat10Choice", propOrder = {"identification", "country", "typeAndIdentification", "proprietary"})
public class SafekeepingPlaceFormat10Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlaceTypeAndText8 identification;
	/**
	 * Place of safekeeping expressed as a code and a narrative description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8
	 * SafekeepingPlaceTypeAndText8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
	 * SafekeepingPlaceFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed as a code and a narrative description."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmIdentification
	 * SafekeepingPlaceFormat3Choice.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SafekeepingPlaceFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Place of safekeeping expressed as a code and a narrative description.";
			previousVersion_lazy = () -> SafekeepingPlaceFormat3Choice.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceTypeAndText8.mmObject();
		}
	};
	protected CountryCode country;
	/**
	 * Place of safekeeping expressed with a country code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
	 * SafekeepingPlace.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
	 * SafekeepingPlaceFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping expressed with a country code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmCountry
	 * SafekeepingPlaceFormat3Choice.mmCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SafekeepingPlace.mmCountry;
			componentContext_lazy = () -> SafekeepingPlaceFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Place of safekeeping expressed with a country code.";
			previousVersion_lazy = () -> SafekeepingPlaceFormat3Choice.mmCountry;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected SafekeepingPlaceTypeAndAnyBICIdentifier1 typeAndIdentification;
	/**
	 * Place of safekeeping expressed with a type and identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
	 * SafekeepingPlaceFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpAndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeAndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed with a type and identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmTypeAndIdentification
	 * SafekeepingPlaceFormat3Choice.mmTypeAndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTypeAndIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SafekeepingPlaceFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "TpAndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAndIdentification";
			definition = "Place of safekeeping expressed with a type and identification.";
			previousVersion_lazy = () -> SafekeepingPlaceFormat3Choice.mmTypeAndIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceTypeAndAnyBICIdentifier1.mmObject();
		}
	};
	protected GenericIdentification78 proprietary;
	/**
	 * Place of safekeeping expressed with a propriety identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification78
	 * GenericIdentification78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
	 * SafekeepingPlaceFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed with a propriety identification scheme."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmProprietary
	 * SafekeepingPlaceFormat3Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> SafekeepingPlaceFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Place of safekeeping expressed with a propriety identification scheme.";
			previousVersion_lazy = () -> SafekeepingPlaceFormat3Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification78.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SafekeepingPlaceFormat10Choice.mmIdentification, SafekeepingPlaceFormat10Choice.mmCountry, SafekeepingPlaceFormat10Choice.mmTypeAndIdentification,
						SafekeepingPlaceFormat10Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementInstructionV04.mmSafekeepingPlace, IntraPositionMovementConfirmationV05.mmSafekeepingPlace, IntraPositionMovementConfirmationV06.mmSafekeepingPlace);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceFormat10Choice";
				definition = "Choice between formats for the place of safekeeping.";
				previousVersion_lazy = () -> SafekeepingPlaceFormat3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SafekeepingPlaceTypeAndText8 getIdentification() {
		return identification;
	}

	public void setIdentification(SafekeepingPlaceTypeAndText8 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Ctry", required = true)
	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	@XmlElement(name = "TpAndId", required = true)
	public SafekeepingPlaceTypeAndAnyBICIdentifier1 getTypeAndIdentification() {
		return typeAndIdentification;
	}

	public void setTypeAndIdentification(SafekeepingPlaceTypeAndAnyBICIdentifier1 typeAndIdentification) {
		this.typeAndIdentification = typeAndIdentification;
	}

	@XmlElement(name = "Prtry", required = true)
	public GenericIdentification78 getProprietary() {
		return proprietary;
	}

	public void setProprietary(GenericIdentification78 proprietary) {
		this.proprietary = proprietary;
	}
}