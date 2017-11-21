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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingCurrencyCodeReportV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.Modification1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details an individual currency including details on which country trades the
 * currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmCurrency
 * SecuritiesCurrencyIdentification2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmFractionalDigit
 * SecuritiesCurrencyIdentification2.mmFractionalDigit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmCountryDetails
 * SecuritiesCurrencyIdentification2.mmCountryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmPreEuro
 * SecuritiesCurrencyIdentification2.mmPreEuro}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmModification
 * SecuritiesCurrencyIdentification2.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmValidityPeriod
 * SecuritiesCurrencyIdentification2.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2#mmLastUpdated
 * SecuritiesCurrencyIdentification2.mmLastUpdated}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingCurrencyCodeReportV01#mmCurrencyData
 * FinancialInstrumentReportingCurrencyCodeReportV01.mmCurrencyData}</li>
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
 * "SecuritiesCurrencyIdentification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details an individual currency including details on which country trades the currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesCurrencyIdentification2", propOrder = {"currency", "fractionalDigit", "countryDetails", "preEuro", "modification", "validityPeriod", "lastUpdated"})
public class SecuritiesCurrencyIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCodeAndName1 currency;
	/**
	 * Details the currency name and ISO 4217 currency code.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyCodeAndName1
	 * CurrencyCodeAndName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details the currency name and ISO 4217 currency code.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrency = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Details the currency name and ISO 4217 currency code.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyCodeAndName1.mmObject();
		}
	};
	protected Max1Number fractionalDigit;
	/**
	 * Fractional digit for the currency, that is, the number of decimals to
	 * use.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1Number
	 * Max1Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnlDgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalDigit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fractional digit for the currency, that is, the number of decimals to use."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFractionalDigit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "FrctnlDgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalDigit";
			definition = "Fractional digit for the currency, that is, the number of decimals to use.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1Number.mmObject();
		}
	};
	protected CountryCodeAndName3 countryDetails;
	/**
	 * Details the country name and ISO 3166 country code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CountryCodeAndName3
	 * CountryCodeAndName3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details the country name and ISO 3166 country code."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCountryDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "CtryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryDetails";
			definition = "Details the country name and ISO 3166 country code.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CountryCodeAndName3.mmObject();
		}
	};
	protected TrueFalseIndicator preEuro;
	/**
	 * Specifies if a currency is a pre Euro currency or not.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreEuro"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreEuro"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if a currency is a pre Euro currency or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreEuro = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "PreEuro";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreEuro";
			definition = "Specifies if a currency is a pre Euro currency or not.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
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
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
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
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCurrencyIdentification2
	 * SecuritiesCurrencyIdentification2}</li>
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
			componentContext_lazy = () -> SecuritiesCurrencyIdentification2.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(SecuritiesCurrencyIdentification2.mmCurrency, SecuritiesCurrencyIdentification2.mmFractionalDigit, SecuritiesCurrencyIdentification2.mmCountryDetails,
						SecuritiesCurrencyIdentification2.mmPreEuro, SecuritiesCurrencyIdentification2.mmModification, SecuritiesCurrencyIdentification2.mmValidityPeriod, SecuritiesCurrencyIdentification2.mmLastUpdated);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingCurrencyCodeReportV01.mmCurrencyData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCurrencyIdentification2";
				definition = "Details an individual currency including details on which country trades the currency.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ccy", required = true)
	public CurrencyCodeAndName1 getCurrency() {
		return currency;
	}

	public void setCurrency(com.tools20022.repository.msg.CurrencyCodeAndName1 currency) {
		this.currency = currency;
	}

	@XmlElement(name = "FrctnlDgt")
	public Max1Number getFractionalDigit() {
		return fractionalDigit;
	}

	public void setFractionalDigit(Max1Number fractionalDigit) {
		this.fractionalDigit = fractionalDigit;
	}

	@XmlElement(name = "CtryDtls", required = true)
	public CountryCodeAndName3 getCountryDetails() {
		return countryDetails;
	}

	public void setCountryDetails(com.tools20022.repository.msg.CountryCodeAndName3 countryDetails) {
		this.countryDetails = countryDetails;
	}

	@XmlElement(name = "PreEuro", required = true)
	public TrueFalseIndicator getPreEuro() {
		return preEuro;
	}

	public void setPreEuro(TrueFalseIndicator preEuro) {
		this.preEuro = preEuro;
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