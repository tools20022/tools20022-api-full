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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding underlying security details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7#mmPlaceAndName
 * FinancialInstrumentAttributesSD7.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7#mmIssuerDescription
 * FinancialInstrumentAttributesSD7.mmIssuerDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7#mmCountryOfIncorporation
 * FinancialInstrumentAttributesSD7.mmCountryOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7#mmPrimaryExchangeFlag
 * FinancialInstrumentAttributesSD7.mmPrimaryExchangeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7#mmSECRegisteredFlag
 * FinancialInstrumentAttributesSD7.mmSECRegisteredFlag}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributesSD7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAttributesSD7", propOrder = {"placeAndName", "issuerDescription", "countryOfIncorporation", "primaryExchangeFlag", "SECRegisteredFlag"})
public class FinancialInstrumentAttributesSD7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max70Text issuerDescription;
	/**
	 * Name of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "IssrDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerDescription";
			definition = "Name of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CountryCode countryOfIncorporation;
	/**
	 * Country of incorporation of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIncorprtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of incorporation of the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfIncorporation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIncorprtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIncorporation";
			definition = "Country of incorporation of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected YesNoIndicator primaryExchangeFlag;
	/**
	 * Indicates if the stock exchange associated to place of listing code is
	 * primary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryXchgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryExchangeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the stock exchange associated to place of listing code is primary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrimaryExchangeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "PmryXchgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryExchangeFlag";
			definition = "Indicates if the stock exchange associated to place of listing code is primary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator sECRegisteredFlag;
	/**
	 * Indicates whether the event has been registered with US Securities
	 * Exchange Commission (SEC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SECRegdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SECRegisteredFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event has been registered with US Securities Exchange Commission (SEC)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSECRegisteredFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "SECRegdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SECRegisteredFlag";
			definition = "Indicates whether the event has been registered with US Securities Exchange Commission (SEC).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD7.mmPlaceAndName, FinancialInstrumentAttributesSD7.mmIssuerDescription, FinancialInstrumentAttributesSD7.mmCountryOfIncorporation,
						FinancialInstrumentAttributesSD7.mmPrimaryExchangeFlag, FinancialInstrumentAttributesSD7.mmSECRegisteredFlag);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributesSD7";
				definition = "Provides additional information regarding underlying security details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "IssrDesc")
	public Max70Text getIssuerDescription() {
		return issuerDescription;
	}

	public void setIssuerDescription(Max70Text issuerDescription) {
		this.issuerDescription = issuerDescription;
	}

	@XmlElement(name = "CtryOfIncorprtn")
	public CountryCode getCountryOfIncorporation() {
		return countryOfIncorporation;
	}

	public void setCountryOfIncorporation(CountryCode countryOfIncorporation) {
		this.countryOfIncorporation = countryOfIncorporation;
	}

	@XmlElement(name = "PmryXchgFlg")
	public YesNoIndicator getPrimaryExchangeFlag() {
		return primaryExchangeFlag;
	}

	public void setPrimaryExchangeFlag(YesNoIndicator primaryExchangeFlag) {
		this.primaryExchangeFlag = primaryExchangeFlag;
	}

	@XmlElement(name = "SECRegdFlg")
	public YesNoIndicator getSECRegisteredFlag() {
		return sECRegisteredFlag;
	}

	public void setSECRegisteredFlag(YesNoIndicator sECRegisteredFlag) {
		this.sECRegisteredFlag = sECRegisteredFlag;
	}
}