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
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CitizenshipInformation2", propOrder = {"nationality", "minorIndicator"})
public class CitizenshipInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ntlty", required = true)
	protected NationalityCode nationality;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CitizenshipInformation2, NationalityCode> mmNationality = new MMMessageAttribute<CitizenshipInformation2, NationalityCode>() {
		{
			businessElementTrace_lazy = () -> Person.mmNationality;
			componentContext_lazy = () -> com.tools20022.repository.msg.CitizenshipInformation2.mmObject();
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

		@Override
		public NationalityCode getValue(CitizenshipInformation2 obj) {
			return obj.getNationality();
		}

		@Override
		public void setValue(CitizenshipInformation2 obj, NationalityCode value) {
			obj.setNationality(value);
		}
	};
	@XmlElement(name = "MnrInd", required = true)
	protected YesNoIndicator minorIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CitizenshipInformation2, YesNoIndicator> mmMinorIndicator = new MMMessageAttribute<CitizenshipInformation2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Person.mmMinorIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CitizenshipInformation2.mmObject();
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

		@Override
		public YesNoIndicator getValue(CitizenshipInformation2 obj) {
			return obj.getMinorIndicator();
		}

		@Override
		public void setValue(CitizenshipInformation2 obj, YesNoIndicator value) {
			obj.setMinorIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CitizenshipInformation2.mmNationality, com.tools20022.repository.msg.CitizenshipInformation2.mmMinorIndicator);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public CitizenshipInformation2 setNationality(NationalityCode nationality) {
		this.nationality = Objects.requireNonNull(nationality);
		return this;
	}

	public YesNoIndicator getMinorIndicator() {
		return minorIndicator;
	}

	public CitizenshipInformation2 setMinorIndicator(YesNoIndicator minorIndicator) {
		this.minorIndicator = Objects.requireNonNull(minorIndicator);
		return this;
	}
}