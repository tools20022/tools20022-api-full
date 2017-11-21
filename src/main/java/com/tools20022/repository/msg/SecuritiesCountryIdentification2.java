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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesCountryIdentification2", propOrder = {"country", "EEACountry", "modification", "validityPeriod", "lastUpdated"})
public class SecuritiesCountryIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCodeAndName3 country;
	/**
	 * Two character country code and country name as per ISO 3166.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCountry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Two character country code and country name as per ISO 3166.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CountryCodeAndName3.mmObject();
		}
	};
	protected TrueFalseIndicator eEACountry;
	/**
	 * Flag which reflects if the country is a member of the EEA (European
	 * Economic Area) or not.
	 * <p>
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
	public static final MMMessageAttribute mmEEACountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "EEACtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EEACountry";
			definition = "Flag which reflects if the country is a member of the EEA (European Economic Area) or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Modification1Code modification;
	/**
	 * Modification status for the record compared to the previous report.
	 * <p>
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
	public static final MMMessageAttribute mmModification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification status for the record compared to the previous report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Modification1Code.mmObject();
		}
	};
	protected Period4Choice validityPeriod;
	/**
	 * Details the validity of the specific record.
	 * <p>
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
	public static final MMMessageAssociationEnd mmValidityPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesCountryIdentification2.mmObject();
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
	};
	protected ISODate lastUpdated;
	/**
	 * Date when this record was last modified.
	 * <p>
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
	public static final MMMessageAttribute mmLastUpdated = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCountryIdentification2.mmObject();
			isDerived = false;
			xmlTag = "LastUpdtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdated";
			definition = "Date when this record was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesCountryIdentification2.mmCountry, SecuritiesCountryIdentification2.mmEEACountry, SecuritiesCountryIdentification2.mmModification,
						SecuritiesCountryIdentification2.mmValidityPeriod, SecuritiesCountryIdentification2.mmLastUpdated);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingCountryCodeReportV01.mmCountryData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCountryIdentification2";
				definition = "Details an individual country including its name and country code.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ctry", required = true)
	public CountryCodeAndName3 getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.msg.CountryCodeAndName3 country) {
		this.country = country;
	}

	@XmlElement(name = "EEACtry", required = true)
	public TrueFalseIndicator getEEACountry() {
		return eEACountry;
	}

	public void setEEACountry(TrueFalseIndicator eEACountry) {
		this.eEACountry = eEACountry;
	}

	@XmlElement(name = "Mod")
	public Modification1Code getModification() {
		return modification;
	}

	public void setModification(Modification1Code modification) {
		this.modification = modification;
	}

	@XmlElement(name = "VldtyPrd", required = true)
	public Period4Choice getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(Period4Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	@XmlElement(name = "LastUpdtd")
	public ISODate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(ISODate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}