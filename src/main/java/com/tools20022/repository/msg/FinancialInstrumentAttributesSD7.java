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

import com.tools20022.metamodel.ext.DTCCSynonym;
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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD7", propOrder = {"placeAndName", "issuerDescription", "countryOfIncorporation", "primaryExchangeFlag", "sECRegisteredFlag"})
public class FinancialInstrumentAttributesSD7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD7, Max350Text> mmPlaceAndName = new MMMessageAttribute<FinancialInstrumentAttributesSD7, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(FinancialInstrumentAttributesSD7 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD7 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "IssrDesc")
	protected Max70Text issuerDescription;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Issuer Description</li>
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
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<Max70Text>> mmIssuerDescription = new MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "IssrDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Issuer Description"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerDescription";
			definition = "Name of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(FinancialInstrumentAttributesSD7 obj) {
			return obj.getIssuerDescription();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD7 obj, Optional<Max70Text> value) {
			obj.setIssuerDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfIncorprtn")
	protected CountryCode countryOfIncorporation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Country of Incorporation</li>
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
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<CountryCode>> mmCountryOfIncorporation = new MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIncorprtn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Country of Incorporation"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIncorporation";
			definition = "Country of incorporation of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FinancialInstrumentAttributesSD7 obj) {
			return obj.getCountryOfIncorporation();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD7 obj, Optional<CountryCode> value) {
			obj.setCountryOfIncorporation(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryXchgFlg")
	protected YesNoIndicator primaryExchangeFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryXchgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Primary Exchange Flag</li>
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
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<YesNoIndicator>> mmPrimaryExchangeFlag = new MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "PmryXchgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Primary Exchange Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryExchangeFlag";
			definition = "Indicates if the stock exchange associated to place of listing code is primary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributesSD7 obj) {
			return obj.getPrimaryExchangeFlag();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD7 obj, Optional<YesNoIndicator> value) {
			obj.setPrimaryExchangeFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "SECRegdFlg")
	protected YesNoIndicator sECRegisteredFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD7
	 * FinancialInstrumentAttributesSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SECRegdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: SEC Registered Flag</li>
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
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<YesNoIndicator>> mmSECRegisteredFlag = new MMMessageAttribute<FinancialInstrumentAttributesSD7, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmObject();
			isDerived = false;
			xmlTag = "SECRegdFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "SEC Registered Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SECRegisteredFlag";
			definition = "Indicates whether the event has been registered with US Securities Exchange Commission (SEC).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributesSD7 obj) {
			return obj.getSECRegisteredFlag();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD7 obj, Optional<YesNoIndicator> value) {
			obj.setSECRegisteredFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmPlaceAndName, com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmIssuerDescription,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmCountryOfIncorporation, com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmPrimaryExchangeFlag,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD7.mmSECRegisteredFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributesSD7";
				definition = "Provides additional information regarding underlying security details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public FinancialInstrumentAttributesSD7 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max70Text> getIssuerDescription() {
		return issuerDescription == null ? Optional.empty() : Optional.of(issuerDescription);
	}

	public FinancialInstrumentAttributesSD7 setIssuerDescription(Max70Text issuerDescription) {
		this.issuerDescription = issuerDescription;
		return this;
	}

	public Optional<CountryCode> getCountryOfIncorporation() {
		return countryOfIncorporation == null ? Optional.empty() : Optional.of(countryOfIncorporation);
	}

	public FinancialInstrumentAttributesSD7 setCountryOfIncorporation(CountryCode countryOfIncorporation) {
		this.countryOfIncorporation = countryOfIncorporation;
		return this;
	}

	public Optional<YesNoIndicator> getPrimaryExchangeFlag() {
		return primaryExchangeFlag == null ? Optional.empty() : Optional.of(primaryExchangeFlag);
	}

	public FinancialInstrumentAttributesSD7 setPrimaryExchangeFlag(YesNoIndicator primaryExchangeFlag) {
		this.primaryExchangeFlag = primaryExchangeFlag;
		return this;
	}

	public Optional<YesNoIndicator> getSECRegisteredFlag() {
		return sECRegisteredFlag == null ? Optional.empty() : Optional.of(sECRegisteredFlag);
	}

	public FinancialInstrumentAttributesSD7 setSECRegisteredFlag(YesNoIndicator sECRegisteredFlag) {
		this.sECRegisteredFlag = sECRegisteredFlag;
		return this;
	}
}