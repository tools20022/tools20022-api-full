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
import com.tools20022.repository.codeset.CountrySubDivisionCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference entity of a single name credit default swap (CDS) or a derivative
 * on single name credit default swap (CDS).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmCountry
 * DerivativePartyIdentification1Choice.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmCountrySubDivision
 * DerivativePartyIdentification1Choice.mmCountrySubDivision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmLEI
 * DerivativePartyIdentification1Choice.mmLEI}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
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
 * "DerivativePartyIdentification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference entity of a single name credit default swap (CDS) or a derivative on single name credit default swap (CDS)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DerivativePartyIdentification1Choice", propOrder = {"country", "countrySubDivision", "LEI"})
public class DerivativePartyIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode country;
	/**
	 * Country of the reference entity.
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
	 * DerivativePartyIdentification1Choice}</li>
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
	 * definition} = "Country of the reference entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> DerivativePartyIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country of the reference entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected CountrySubDivisionCode countrySubDivision;
	/**
	 * Country and country sub-division of the reference entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CountrySubDivisionCode
	 * CountrySubDivisionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmState
	 * PostalAddress.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
	 * DerivativePartyIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrySubDvsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountrySubDivision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country and country sub-division of the reference entity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountrySubDivision = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmState;
			componentContext_lazy = () -> DerivativePartyIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "CtrySubDvsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountrySubDivision";
			definition = "Country and country sub-division of the reference entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountrySubDivisionCode.mmObject();
		}
	};
	protected LEIIdentifier lEI;
	/**
	 * Identification of the reference party through Legal entity identifier.
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
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice
	 * DerivativePartyIdentification1Choice}</li>
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
	 * definition} =
	 * "Identification of the reference party through Legal entity identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLEI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> DerivativePartyIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Identification of the reference party through Legal entity identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DerivativePartyIdentification1Choice.mmCountry, DerivativePartyIdentification1Choice.mmCountrySubDivision, DerivativePartyIdentification1Choice.mmLEI);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativePartyIdentification1Choice";
				definition = "Reference entity of a single name credit default swap (CDS) or a derivative on single name credit default swap (CDS).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ctry", required = true)
	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	@XmlElement(name = "CtrySubDvsn", required = true)
	public CountrySubDivisionCode getCountrySubDivision() {
		return countrySubDivision;
	}

	public void setCountrySubDivision(CountrySubDivisionCode countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
	}

	@XmlElement(name = "LEI", required = true)
	public LEIIdentifier getLEI() {
		return lEI;
	}

	public void setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
	}
}