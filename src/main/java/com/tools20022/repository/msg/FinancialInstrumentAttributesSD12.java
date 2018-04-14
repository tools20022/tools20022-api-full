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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AssetClass1Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DTCAssetType2Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max50Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification2;
import com.tools20022.repository.msg.SecurityIdentification15;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmPlaceAndName
 * FinancialInstrumentAttributesSD12.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmIncomeSourceCountry
 * FinancialInstrumentAttributesSD12.mmIncomeSourceCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmDTCAssetClass
 * FinancialInstrumentAttributesSD12.mmDTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmDTCAssetType
 * FinancialInstrumentAttributesSD12.mmDTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmSecurityEligibilityIndicator
 * FinancialInstrumentAttributesSD12.mmSecurityEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmTickerSymbol
 * FinancialInstrumentAttributesSD12.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmLinkedSecurity
 * FinancialInstrumentAttributesSD12.mmLinkedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmOriginatingSecurityIdentification
 * FinancialInstrumentAttributesSD12.mmOriginatingSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12#mmDIVANNSecurityDescription
 * FinancialInstrumentAttributesSD12.mmDIVANNSecurityDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributesSD12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
 * FinancialInstrumentAttributesSD14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11
 * FinancialInstrumentAttributesSD11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD12", propOrder = {"placeAndName", "incomeSourceCountry", "dTCAssetClass", "dTCAssetType", "securityEligibilityIndicator", "tickerSymbol", "linkedSecurity",
		"originatingSecurityIdentification", "dIVANNSecurityDescription"})
public class FinancialInstrumentAttributesSD12 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmPlaceAndName
	 * FinancialInstrumentAttributesSD14.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmPlaceAndName
	 * FinancialInstrumentAttributesSD11.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Max350Text> mmPlaceAndName = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmPlaceAndName);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "IncmSrcCtry")
	protected CountryCode incomeSourceCountry;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmSrcCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeSourceCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of source income for the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Income Source Country</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmIncomeSourceCountry
	 * FinancialInstrumentAttributesSD14.mmIncomeSourceCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmIncomeSourceCountry
	 * FinancialInstrumentAttributesSD11.mmIncomeSourceCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<CountryCode>> mmIncomeSourceCountry = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "IncmSrcCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Income Source Country"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeSourceCountry";
			definition = "Country of source income for the security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmIncomeSourceCountry);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmIncomeSourceCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getIncomeSourceCountry();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<CountryCode> value) {
			obj.setIncomeSourceCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCAsstClss")
	protected AssetClass1Code dTCAssetClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstClss"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of instruments into asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Asset Class</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmDTCAssetClass
	 * FinancialInstrumentAttributesSD14.mmDTCAssetClass}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmDTCAssetClass
	 * FinancialInstrumentAttributesSD11.mmDTCAssetClass}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<AssetClass1Code>> mmDTCAssetClass = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<AssetClass1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Class"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmDTCAssetClass);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmDTCAssetClass;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}

		@Override
		public Optional<AssetClass1Code> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getDTCAssetClass();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<AssetClass1Code> value) {
			obj.setDTCAssetClass(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCAsstTp")
	protected DTCAssetType2Code dTCAssetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType2Code
	 * DTCAssetType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Asset Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmDTCAssetType
	 * FinancialInstrumentAttributesSD14.mmDTCAssetType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmDTCAssetType
	 * FinancialInstrumentAttributesSD11.mmDTCAssetType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<DTCAssetType2Code>> mmDTCAssetType = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<DTCAssetType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmDTCAssetType);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmDTCAssetType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType2Code.mmObject();
		}

		@Override
		public Optional<DTCAssetType2Code> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getDTCAssetType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<DTCAssetType2Code> value) {
			obj.setDTCAssetType(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyElgbltyInd")
	protected YesNoIndicator securityEligibilityIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyElgbltyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is eligible for holding at DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Eligibility Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmSecurityEligibilityIndicator
	 * FinancialInstrumentAttributesSD14.mmSecurityEligibilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmSecurityEligibilityIndicator
	 * FinancialInstrumentAttributesSD11.mmSecurityEligibilityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<YesNoIndicator>> mmSecurityEligibilityIndicator = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "SctyElgbltyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Eligibility Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibilityIndicator";
			definition = "Indicates whether the security is eligible for holding at DTC.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmSecurityEligibilityIndicator);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmSecurityEligibilityIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getSecurityEligibilityIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<YesNoIndicator> value) {
			obj.setSecurityEligibilityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TckrSymb")
	protected Max35Text tickerSymbol;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TckrSymb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ticket symbol for the event security (underlying security)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Ticker Symbol</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmTickerSymbol
	 * FinancialInstrumentAttributesSD14.mmTickerSymbol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmTickerSymbol
	 * FinancialInstrumentAttributesSD11.mmTickerSymbol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<Max35Text>> mmTickerSymbol = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Ticker Symbol"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Ticket symbol for the event security (underlying security).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmTickerSymbol);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmTickerSymbol;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getTickerSymbol();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<Max35Text> value) {
			obj.setTickerSymbol(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdScty")
	protected SecurityIdentification15 linkedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Linked Security ID, DTCCSynonym: Linked
	 * Security ID Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmLinkedSecurity
	 * FinancialInstrumentAttributesSD14.mmLinkedSecurity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmLinkedSecurity
	 * FinancialInstrumentAttributesSD11.mmLinkedSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<SecurityIdentification15>> mmLinkedSecurity = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<SecurityIdentification15>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "LkdScty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Linked Security ID"), new DTCCSynonym(this, "Linked Security ID Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedSecurity";
			definition = "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmLinkedSecurity);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmLinkedSecurity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification15.mmObject();
		}

		@Override
		public Optional<SecurityIdentification15> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getLinkedSecurity();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<SecurityIdentification15> value) {
			obj.setLinkedSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgtgSctyId")
	protected OtherIdentification2 originatingSecurityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification2
	 * OtherIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtgSctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmOriginatingSecurityIdentification
	 * FinancialInstrumentAttributesSD14.mmOriginatingSecurityIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmOriginatingSecurityIdentification
	 * FinancialInstrumentAttributesSD11.mmOriginatingSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributesSD12, Optional<OtherIdentification2>> mmOriginatingSecurityIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributesSD12, Optional<OtherIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "OrgtgSctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingSecurityIdentification";
			definition = "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmOriginatingSecurityIdentification);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmOriginatingSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification2.mmObject();
		}

		@Override
		public Optional<OtherIdentification2> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getOriginatingSecurityIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<OtherIdentification2> value) {
			obj.setOriginatingSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DIVANNSctyDesc")
	protected Max50Text dIVANNSecurityDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Text
	 * Max50Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD12
	 * FinancialInstrumentAttributesSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DIVANNSctyDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DIVANNSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security description associated with DIVANN legacy system which contains additional values such as NTL for interest only notional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmDIVANNSecurityDescription
	 * FinancialInstrumentAttributesSD14.mmDIVANNSecurityDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD11#mmDIVANNSecurityDescription
	 * FinancialInstrumentAttributesSD11.mmDIVANNSecurityDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<Max50Text>> mmDIVANNSecurityDescription = new MMMessageAttribute<FinancialInstrumentAttributesSD12, Optional<Max50Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmObject();
			isDerived = false;
			xmlTag = "DIVANNSctyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DIVANNSecurityDescription";
			definition = "Security description associated with DIVANN legacy system which contains additional values such as NTL for interest only notional.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmDIVANNSecurityDescription);
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmDIVANNSecurityDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max50Text.mmObject();
		}

		@Override
		public Optional<Max50Text> getValue(FinancialInstrumentAttributesSD12 obj) {
			return obj.getDIVANNSecurityDescription();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD12 obj, Optional<Max50Text> value) {
			obj.setDIVANNSecurityDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmPlaceAndName, com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmIncomeSourceCountry,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmDTCAssetClass, com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmDTCAssetType,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmSecurityEligibilityIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmTickerSymbol,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmLinkedSecurity, com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmOriginatingSecurityIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD12.mmDIVANNSecurityDescription);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD12";
				definition = "Provides additional information regarding underlying security details.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD14.mmObject());
				previousVersion_lazy = () -> FinancialInstrumentAttributesSD11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public FinancialInstrumentAttributesSD12 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<CountryCode> getIncomeSourceCountry() {
		return incomeSourceCountry == null ? Optional.empty() : Optional.of(incomeSourceCountry);
	}

	public FinancialInstrumentAttributesSD12 setIncomeSourceCountry(CountryCode incomeSourceCountry) {
		this.incomeSourceCountry = incomeSourceCountry;
		return this;
	}

	public Optional<AssetClass1Code> getDTCAssetClass() {
		return dTCAssetClass == null ? Optional.empty() : Optional.of(dTCAssetClass);
	}

	public FinancialInstrumentAttributesSD12 setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
		return this;
	}

	public Optional<DTCAssetType2Code> getDTCAssetType() {
		return dTCAssetType == null ? Optional.empty() : Optional.of(dTCAssetType);
	}

	public FinancialInstrumentAttributesSD12 setDTCAssetType(DTCAssetType2Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
		return this;
	}

	public Optional<YesNoIndicator> getSecurityEligibilityIndicator() {
		return securityEligibilityIndicator == null ? Optional.empty() : Optional.of(securityEligibilityIndicator);
	}

	public FinancialInstrumentAttributesSD12 setSecurityEligibilityIndicator(YesNoIndicator securityEligibilityIndicator) {
		this.securityEligibilityIndicator = securityEligibilityIndicator;
		return this;
	}

	public Optional<Max35Text> getTickerSymbol() {
		return tickerSymbol == null ? Optional.empty() : Optional.of(tickerSymbol);
	}

	public FinancialInstrumentAttributesSD12 setTickerSymbol(Max35Text tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
		return this;
	}

	public Optional<SecurityIdentification15> getLinkedSecurity() {
		return linkedSecurity == null ? Optional.empty() : Optional.of(linkedSecurity);
	}

	public FinancialInstrumentAttributesSD12 setLinkedSecurity(SecurityIdentification15 linkedSecurity) {
		this.linkedSecurity = linkedSecurity;
		return this;
	}

	public Optional<OtherIdentification2> getOriginatingSecurityIdentification() {
		return originatingSecurityIdentification == null ? Optional.empty() : Optional.of(originatingSecurityIdentification);
	}

	public FinancialInstrumentAttributesSD12 setOriginatingSecurityIdentification(OtherIdentification2 originatingSecurityIdentification) {
		this.originatingSecurityIdentification = originatingSecurityIdentification;
		return this;
	}

	public Optional<Max50Text> getDIVANNSecurityDescription() {
		return dIVANNSecurityDescription == null ? Optional.empty() : Optional.of(dIVANNSecurityDescription);
	}

	public FinancialInstrumentAttributesSD12 setDIVANNSecurityDescription(Max50Text dIVANNSecurityDescription) {
		this.dIVANNSecurityDescription = dIVANNSecurityDescription;
		return this;
	}
}