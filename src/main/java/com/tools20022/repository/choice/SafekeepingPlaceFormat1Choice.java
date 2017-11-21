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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification14;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for the place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat1Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmType
 * SafekeepingPlaceFormat1Choice.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmProprietary
 * SafekeepingPlaceFormat1Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmCountry
 * SafekeepingPlaceFormat1Choice.mmCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
 * SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlaceFormat1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the place of safekeeping."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SafekeepingPlaceFormat1Choice", propOrder = {"typeAndIdentification", "type", "proprietary", "country"})
public class SafekeepingPlaceFormat1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlaceTypeAndAnyBICIdentifier1 typeAndIdentification;
	/**
	 * Identification of the place of safekeeping expressed as a code and a BIC.
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
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice
	 * SafekeepingPlaceFormat1Choice}</li>
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
	 * "Identification of the place of safekeeping expressed as a code and a BIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTypeAndIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SafekeepingPlaceFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "TpAndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAndIdentification";
			definition = "Identification of the place of safekeeping expressed as a code and a BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceTypeAndAnyBICIdentifier1.mmObject();
		}
	};
	protected SafekeepingPlaceTypeAndText1 type;
	/**
	 * Place identification of the place of safekeeping expressed as a code and
	 * a narrative description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1
	 * SafekeepingPlaceTypeAndText1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice
	 * SafekeepingPlaceFormat1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place identification of the place of safekeeping expressed as a code and a narrative description."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmType = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SafekeepingPlaceFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Place identification of the place of safekeeping expressed as a code and a narrative description.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceTypeAndText1.mmObject();
		}
	};
	protected GenericIdentification14 proprietary;
	/**
	 * Place identification expressed as a proprietary type and narrative
	 * description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification14
	 * GenericIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice
	 * SafekeepingPlaceFormat1Choice}</li>
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
	 * "Place identification expressed as a proprietary type and narrative description."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> SafekeepingPlaceFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Place identification expressed as a proprietary type and narrative description.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification14.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice
	 * SafekeepingPlaceFormat1Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SafekeepingPlace.mmCountry;
			componentContext_lazy = () -> SafekeepingPlaceFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Place of safekeeping expressed with a country code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SafekeepingPlaceFormat1Choice.mmTypeAndIdentification, SafekeepingPlaceFormat1Choice.mmType, SafekeepingPlaceFormat1Choice.mmProprietary, SafekeepingPlaceFormat1Choice.mmCountry);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SafekeepingPlaceFormat1Choice";
				definition = "Choice of formats for the place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TpAndId", required = true)
	public SafekeepingPlaceTypeAndAnyBICIdentifier1 getTypeAndIdentification() {
		return typeAndIdentification;
	}

	public void setTypeAndIdentification(SafekeepingPlaceTypeAndAnyBICIdentifier1 typeAndIdentification) {
		this.typeAndIdentification = typeAndIdentification;
	}

	@XmlElement(name = "Tp", required = true)
	public SafekeepingPlaceTypeAndText1 getType() {
		return type;
	}

	public void setType(SafekeepingPlaceTypeAndText1 type) {
		this.type = type;
	}

	@XmlElement(name = "Prtry", required = true)
	public GenericIdentification14 getProprietary() {
		return proprietary;
	}

	public void setProprietary(GenericIdentification14 proprietary) {
		this.proprietary = proprietary;
	}

	@XmlElement(name = "Ctry", required = true)
	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}
}