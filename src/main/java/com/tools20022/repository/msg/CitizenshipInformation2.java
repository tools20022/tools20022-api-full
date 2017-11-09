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
import com.tools20022.repository.codeset.NationalityCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about an individual person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2#mmNationality
 * CitizenshipInformation2.mmNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2#mmMinorIndicator
 * CitizenshipInformation2.mmMinorIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
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
 * "CitizenshipInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about an individual person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation
 * CitizenshipInformation}</li>
 * </ul>
 */
public class CitizenshipInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NationalityCode nationality;
	/**
	 * Country where a person was born or is legally accepted as belonging to
	 * the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NationalityCode
	 * NationalityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmNationality
	 * Person.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2
	 * CitizenshipInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntlty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where a person was born or is legally accepted as belonging to the country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation#mmNationality
	 * CitizenshipInformation.mmNationality}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNationality = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmNationality;
			componentContext_lazy = () -> CitizenshipInformation2.mmObject();
			isDerived = false;
			xmlTag = "Ntlty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nationality";
			definition = "Country where a person was born or is legally accepted as belonging to the country.";
			previousVersion_lazy = () -> CitizenshipInformation.mmNationality;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NationalityCode.mmObject();
		}
	};
	protected YesNoIndicator minorIndicator;
	/**
	 * Indicates whether the person is a legal minor. This may depend on the
	 * nationality, the domicile country or the transaction in which the person
	 * is involved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmMinorIndicator
	 * Person.mmMinorIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2
	 * CitizenshipInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the person is a legal minor. This may depend on the nationality, the domicile country or the transaction in which the person is involved."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation#mmMinorIndicator
	 * CitizenshipInformation.mmMinorIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinorIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmMinorIndicator;
			componentContext_lazy = () -> CitizenshipInformation2.mmObject();
			isDerived = false;
			xmlTag = "MnrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. This may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			previousVersion_lazy = () -> CitizenshipInformation.mmMinorIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CitizenshipInformation2.mmNationality, CitizenshipInformation2.mmMinorIndicator);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CitizenshipInformation2";
				definition = "Information about an individual person.";
				previousVersion_lazy = () -> CitizenshipInformation.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public NationalityCode getNationality() {
		return nationality;
	}

	public void setNationality(NationalityCode nationality) {
		this.nationality = nationality;
	}

	public YesNoIndicator getMinorIndicator() {
		return minorIndicator;
	}

	public void setMinorIndicator(YesNoIndicator minorIndicator) {
		this.minorIndicator = minorIndicator;
	}
}