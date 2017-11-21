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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.ResidentialStatus1Code;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Country and residential status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2#mmCountry
 * CountryAndResidentialStatusType2.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2#mmResidentialStatus
 * CountryAndResidentialStatusType2.mmResidentialStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * "CountryAndResidentialStatusType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Country and residential status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1
 * CountryAndResidentialStatusType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CountryAndResidentialStatusType2", propOrder = {"country", "residentialStatus"})
public class CountryAndResidentialStatusType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode country;
	/**
	 * Country to which the residential status is applicable.
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
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2
	 * CountryAndResidentialStatusType2}</li>
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
	 * definition} = "Country to which the residential status is applicable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#mmCountry
	 * CountryAndResidentialStatusType1.mmCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> CountryAndResidentialStatusType2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country to which the residential status is applicable.";
			previousVersion_lazy = () -> CountryAndResidentialStatusType1.mmCountry;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ResidentialStatus1Code residentialStatus;
	/**
	 * Residential status of the organisation or individual, for example,
	 * non-permanent resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatus1Code
	 * ResidentialStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmResidentialStatus
	 * Person.mmResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2
	 * CountryAndResidentialStatusType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ResdtlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidentialStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Residential status of the organisation or individual, for example, non-permanent resident."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#mmResidentialStatus
	 * CountryAndResidentialStatusType1.mmResidentialStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidentialStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> CountryAndResidentialStatusType2.mmObject();
			isDerived = false;
			xmlTag = "ResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of the organisation or individual, for example, non-permanent resident.";
			previousVersion_lazy = () -> CountryAndResidentialStatusType1.mmResidentialStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResidentialStatus1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CountryAndResidentialStatusType2.mmCountry, CountryAndResidentialStatusType2.mmResidentialStatus);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CountryAndResidentialStatusType2";
				definition = "Country and residential status.";
				previousVersion_lazy = () -> CountryAndResidentialStatusType1.mmObject();
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

	@XmlElement(name = "ResdtlSts", required = true)
	public ResidentialStatus1Code getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(ResidentialStatus1Code residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
}