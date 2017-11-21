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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification5;
import com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification;
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
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentification
 * SafekeepingPlaceFormatChoice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentificationAsDSS
 * SafekeepingPlaceFormatChoice.mmIdentificationAsDSS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentificationAsCountry
 * SafekeepingPlaceFormatChoice.mmIdentificationAsCountry}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlaceFormatChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the place of safekeeping."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SafekeepingPlaceFormatChoice", propOrder = {"identification", "identificationAsDSS", "identificationAsCountry"})
public class SafekeepingPlaceFormatChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlaceAsCodeAndPartyIdentification identification;
	/**
	 * Place of safekeeping expressed as a code and BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification
	 * SafekeepingPlaceAsCodeAndPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
	 * SafekeepingPlaceFormatChoice}</li>
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
	 * definition} = "Place of safekeeping expressed as a code and BIC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SafekeepingPlaceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Place of safekeeping expressed as a code and BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SafekeepingPlaceAsCodeAndPartyIdentification.mmObject();
		}
	};
	protected GenericIdentification5 identificationAsDSS;
	/**
	 * Place of safekeeping expressed with a propriety identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification5
	 * GenericIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
	 * SafekeepingPlaceFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed with a propriety identification scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentificationAsDSS = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> SafekeepingPlaceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "IdAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationAsDSS";
			definition = "Place of safekeeping expressed with a propriety identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification5.mmObject();
		}
	};
	protected CountryCode identificationAsCountry;
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
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
	 * SafekeepingPlaceFormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdAsCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationAsCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping expressed with a country code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentificationAsCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> SafekeepingPlaceFormatChoice.mmObject();
			isDerived = false;
			xmlTag = "IdAsCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationAsCountry";
			definition = "Place of safekeeping expressed with a country code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SafekeepingPlaceFormatChoice.mmIdentification, SafekeepingPlaceFormatChoice.mmIdentificationAsDSS, SafekeepingPlaceFormatChoice.mmIdentificationAsCountry);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceFormatChoice";
				definition = "Choice of formats for the place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SafekeepingPlaceAsCodeAndPartyIdentification getIdentification() {
		return identification;
	}

	public void setIdentification(SafekeepingPlaceAsCodeAndPartyIdentification identification) {
		this.identification = identification;
	}

	@XmlElement(name = "IdAsDSS", required = true)
	public GenericIdentification5 getIdentificationAsDSS() {
		return identificationAsDSS;
	}

	public void setIdentificationAsDSS(GenericIdentification5 identificationAsDSS) {
		this.identificationAsDSS = identificationAsDSS;
	}

	@XmlElement(name = "IdAsCtry", required = true)
	public CountryCode getIdentificationAsCountry() {
		return identificationAsCountry;
	}

	public void setIdentificationAsCountry(CountryCode identificationAsCountry) {
		this.identificationAsCountry = identificationAsCountry;
	}
}