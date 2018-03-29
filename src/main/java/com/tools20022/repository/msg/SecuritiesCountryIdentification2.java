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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.FinancialInstrumentReportingCountryCodeReportV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.Modification1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CountryCodeAndName3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details an individual country including its name and country code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2#mmCountry
 * SecuritiesCountryIdentification2.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2#mmEEACountry
 * SecuritiesCountryIdentification2.mmEEACountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2#mmModification
 * SecuritiesCountryIdentification2.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2#mmValidityPeriod
 * SecuritiesCountryIdentification2.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2#mmLastUpdated
 * SecuritiesCountryIdentification2.mmLastUpdated}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingCountryCodeReportV01#mmCountryData
 * FinancialInstrumentReportingCountryCodeReportV01.mmCountryData}</li>
 * </ul>
 * </li>
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
 * "SecuritiesCountryIdentification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details an individual country including its name and country code."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesCountryIdentification2", propOrder = {"country", "eEACountry", "modification", "validityPeriod", "lastUpdated"})
public class SecuritiesCountryIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry", required = true)
	protected CountryCodeAndName3 country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CountryCodeAndName3
	 * CountryCodeAndName3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2
	 * SecuritiesCountryIdentification2}</li>
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
	 * definition} =
	 * "Two character country code and country name as per ISO 3166."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesCountryIdentification2, CountryCodeAndName3> mmCountry = new MMMessageAssociationEnd<SecuritiesCountryIdentification2, CountryCodeAndName3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Two character country code and country name as per ISO 3166.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CountryCodeAndName3.mmObject();
		}

		@Override
		public CountryCodeAndName3 getValue(SecuritiesCountryIdentification2 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(SecuritiesCountryIdentification2 obj, CountryCodeAndName3 value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "EEACtry", required = true)
	protected TrueFalseIndicator eEACountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2
	 * SecuritiesCountryIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EEACtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EEACountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag which reflects if the country is a member of the EEA (European Economic Area) or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesCountryIdentification2, TrueFalseIndicator> mmEEACountry = new MMMessageAttribute<SecuritiesCountryIdentification2, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "EEACtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EEACountry";
			definition = "Flag which reflects if the country is a member of the EEA (European Economic Area) or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SecuritiesCountryIdentification2 obj) {
			return obj.getEEACountry();
		}

		@Override
		public void setValue(SecuritiesCountryIdentification2 obj, TrueFalseIndicator value) {
			obj.setEEACountry(value);
		}
	};
	@XmlElement(name = "Mod")
	protected Modification1Code modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Modification1Code
	 * Modification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2
	 * SecuritiesCountryIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification status for the record compared to the previous report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesCountryIdentification2, Optional<Modification1Code>> mmModification = new MMMessageAttribute<SecuritiesCountryIdentification2, Optional<Modification1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification status for the record compared to the previous report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Modification1Code.mmObject();
		}

		@Override
		public Optional<Modification1Code> getValue(SecuritiesCountryIdentification2 obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(SecuritiesCountryIdentification2 obj, Optional<Modification1Code> value) {
			obj.setModification(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtyPrd", required = true)
	protected Period4Choice validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2
	 * SecuritiesCountryIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details the validity of the specific record."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesCountryIdentification2, Period4Choice> mmValidityPeriod = new MMMessageAssociationEnd<SecuritiesCountryIdentification2, Period4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Details the validity of the specific record.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Period4Choice getValue(SecuritiesCountryIdentification2 obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(SecuritiesCountryIdentification2 obj, Period4Choice value) {
			obj.setValidityPeriod(value);
		}
	};
	@XmlElement(name = "LastUpdtd")
	protected ISODate lastUpdated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCountryIdentification2
	 * SecuritiesCountryIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastUpdtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastUpdated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when this record was last modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesCountryIdentification2, Optional<ISODate>> mmLastUpdated = new MMMessageAttribute<SecuritiesCountryIdentification2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "LastUpdtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdated";
			definition = "Date when this record was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SecuritiesCountryIdentification2 obj) {
			return obj.getLastUpdated();
		}

		@Override
		public void setValue(SecuritiesCountryIdentification2 obj, Optional<ISODate> value) {
			obj.setLastUpdated(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmCountry, com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmEEACountry,
						com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmModification, com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmValidityPeriod,
						com.tools20022.repository.msg.SecuritiesCountryIdentification2.mmLastUpdated);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingCountryCodeReportV01.mmCountryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCountryIdentification2";
				definition = "Details an individual country including its name and country code.";
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCodeAndName3 getCountry() {
		return country;
	}

	public SecuritiesCountryIdentification2 setCountry(CountryCodeAndName3 country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public TrueFalseIndicator getEEACountry() {
		return eEACountry;
	}

	public SecuritiesCountryIdentification2 setEEACountry(TrueFalseIndicator eEACountry) {
		this.eEACountry = Objects.requireNonNull(eEACountry);
		return this;
	}

	public Optional<Modification1Code> getModification() {
		return modification == null ? Optional.empty() : Optional.of(modification);
	}

	public SecuritiesCountryIdentification2 setModification(Modification1Code modification) {
		this.modification = modification;
		return this;
	}

	public Period4Choice getValidityPeriod() {
		return validityPeriod;
	}

	public SecuritiesCountryIdentification2 setValidityPeriod(Period4Choice validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public Optional<ISODate> getLastUpdated() {
		return lastUpdated == null ? Optional.empty() : Optional.of(lastUpdated);
	}

	public SecuritiesCountryIdentification2 setLastUpdated(ISODate lastUpdated) {
		this.lastUpdated = lastUpdated;
		return this;
	}
}