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
import com.tools20022.repository.codeset.AssetClass1Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DTCAssetType1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmPlaceAndName
 * FinancialInstrumentAttributesSD6.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmCountryOfListing
 * FinancialInstrumentAttributesSD6.mmCountryOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmIncomeSourceCountry
 * FinancialInstrumentAttributesSD6.mmIncomeSourceCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmDTCAssetClass
 * FinancialInstrumentAttributesSD6.mmDTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmDTCAssetType
 * FinancialInstrumentAttributesSD6.mmDTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmSecurityEligibilityIndicator
 * FinancialInstrumentAttributesSD6.mmSecurityEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmTickerSymbol
 * FinancialInstrumentAttributesSD6.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmLinkedSecurity
 * FinancialInstrumentAttributesSD6.mmLinkedSecurity}</li>
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
 * "FinancialInstrumentAttributesSD6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
 * FinancialInstrumentAttributesSD8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAttributesSD6", propOrder = {"placeAndName", "countryOfListing", "incomeSourceCountry", "DTCAssetClass", "DTCAssetType", "securityEligibilityIndicator", "tickerSymbol", "linkedSecurity"})
public class FinancialInstrumentAttributesSD6 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmPlaceAndName
	 * FinancialInstrumentAttributesSD8.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CountryCode countryOfListing;
	/**
	 * Country in which the security was issued.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the security was issued."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmCountryOfListing
	 * FinancialInstrumentAttributesSD8.mmCountryOfListing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfListing = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "CtryOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfListing";
			definition = "Country in which the security was issued.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmCountryOfListing);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected CountryCode incomeSourceCountry;
	/**
	 * Country of source income for the security.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmSrcCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeSourceCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of source income for the security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmIncomeSourceCountry
	 * FinancialInstrumentAttributesSD8.mmIncomeSourceCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomeSourceCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "IncmSrcCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeSourceCountry";
			definition = "Country of source income for the security.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmIncomeSourceCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected AssetClass1Code dTCAssetClass;
	/**
	 * Classification of instruments into asset classes at DTC (The Depository
	 * Trust Corporation).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of instruments into asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmDTCAssetClass
	 * FinancialInstrumentAttributesSD8.mmDTCAssetClass}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmDTCAssetClass);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}
	};
	protected DTCAssetType1Code dTCAssetType;
	/**
	 * Further classification of instruments into (issue) asset types at DTC
	 * (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmDTCAssetType
	 * FinancialInstrumentAttributesSD8.mmDTCAssetType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmDTCAssetType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	protected YesNoIndicator securityEligibilityIndicator;
	/**
	 * Indicates whether the security is eligible for holding at DTC.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyElgbltyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is eligible for holding at DTC."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmSecurityEligibilityIndicator
	 * FinancialInstrumentAttributesSD8.mmSecurityEligibilityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityEligibilityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "SctyElgbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibilityIndicator";
			definition = "Indicates whether the security is eligible for holding at DTC.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmSecurityEligibilityIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text tickerSymbol;
	/**
	 * Ticket symbol for the event security (underlying security).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TckrSymb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ticket symbol for the event security (underlying security). "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmTickerSymbol
	 * FinancialInstrumentAttributesSD8.mmTickerSymbol}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTickerSymbol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Ticket symbol for the event security (underlying security). ";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmTickerSymbol);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SecurityIdentification15 linkedSecurity;
	/**
	 * Security whose characteristics mirror the event security for purposes of
	 * FCP eligibility and tax relief. Certain derivative securities like HOLDR
	 * may have certain events where the source of payments are from an
	 * underlying security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
	 * FinancialInstrumentAttributesSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmLinkedSecurity
	 * FinancialInstrumentAttributesSD8.mmLinkedSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedSecurity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			isDerived = false;
			xmlTag = "LkdScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedSecurity";
			definition = "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security. ";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmLinkedSecurity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD6.mmPlaceAndName, FinancialInstrumentAttributesSD6.mmCountryOfListing, FinancialInstrumentAttributesSD6.mmIncomeSourceCountry,
						FinancialInstrumentAttributesSD6.mmDTCAssetClass, FinancialInstrumentAttributesSD6.mmDTCAssetType, FinancialInstrumentAttributesSD6.mmSecurityEligibilityIndicator, FinancialInstrumentAttributesSD6.mmTickerSymbol,
						FinancialInstrumentAttributesSD6.mmLinkedSecurity);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributesSD6";
				definition = "Provides additional information regarding underlying security details.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD8.mmObject());
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

	@XmlElement(name = "CtryOfListg")
	public CountryCode getCountryOfListing() {
		return countryOfListing;
	}

	public void setCountryOfListing(CountryCode countryOfListing) {
		this.countryOfListing = countryOfListing;
	}

	@XmlElement(name = "IncmSrcCtry")
	public CountryCode getIncomeSourceCountry() {
		return incomeSourceCountry;
	}

	public void setIncomeSourceCountry(CountryCode incomeSourceCountry) {
		this.incomeSourceCountry = incomeSourceCountry;
	}

	@XmlElement(name = "DTCAsstClss")
	public AssetClass1Code getDTCAssetClass() {
		return dTCAssetClass;
	}

	public void setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
	}

	@XmlElement(name = "DTCAsstTp")
	public DTCAssetType1Code getDTCAssetType() {
		return dTCAssetType;
	}

	public void setDTCAssetType(DTCAssetType1Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
	}

	@XmlElement(name = "SctyElgbltyInd")
	public YesNoIndicator getSecurityEligibilityIndicator() {
		return securityEligibilityIndicator;
	}

	public void setSecurityEligibilityIndicator(YesNoIndicator securityEligibilityIndicator) {
		this.securityEligibilityIndicator = securityEligibilityIndicator;
	}

	@XmlElement(name = "TckrSymb")
	public Max35Text getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(Max35Text tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	@XmlElement(name = "LkdScty")
	public SecurityIdentification15 getLinkedSecurity() {
		return linkedSecurity;
	}

	public void setLinkedSecurity(com.tools20022.repository.msg.SecurityIdentification15 linkedSecurity) {
		this.linkedSecurity = linkedSecurity;
	}
}