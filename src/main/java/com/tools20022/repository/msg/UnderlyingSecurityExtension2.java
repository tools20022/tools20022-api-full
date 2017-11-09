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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmPlaceAndName
 * UnderlyingSecurityExtension2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmCountryOfListing
 * UnderlyingSecurityExtension2.mmCountryOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmCountryOfIncorporation
 * UnderlyingSecurityExtension2.mmCountryOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmIncomeSourceCountry
 * UnderlyingSecurityExtension2.mmIncomeSourceCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmIssuerDescription
 * UnderlyingSecurityExtension2.mmIssuerDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmDTCAssetClass
 * UnderlyingSecurityExtension2.mmDTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmDTCAssetType
 * UnderlyingSecurityExtension2.mmDTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmPrimaryExchangeFlag
 * UnderlyingSecurityExtension2.mmPrimaryExchangeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmSecurityEligibilityIndicator
 * UnderlyingSecurityExtension2.mmSecurityEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmSECRegisteredFlag
 * UnderlyingSecurityExtension2.mmSECRegisteredFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2#mmTickerSymbol
 * UnderlyingSecurityExtension2.mmTickerSymbol}</li>
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
 * "UnderlyingSecurityExtension2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * </ul>
 */
public class UnderlyingSecurityExtension2 {

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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfListing = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfListing";
			definition = "Country in which the security was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomeSourceCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "IncmSrcCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeSourceCountry";
			definition = "Country of source income for the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
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
	protected AssetClass1Code dTCAssetClass;
	/**
	 * Classification of instruments in to asset classes at DTC (The Depository
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * "Classification of instruments in to asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments in to asset classes at DTC (The Depository Trust Corporation).";
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	protected YesNoIndicator primaryExchangeFlag;
	/**
	 * Indicate if the stock exchange associated to place of listing code is
	 * primary or secondary.
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * "Indicate if the stock exchange associated to place of listing code is primary or secondary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrimaryExchangeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "PmryXchgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryExchangeFlag";
			definition = "Indicate if the stock exchange associated to place of listing code is primary or secondary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityEligibilityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "SctyElgbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibilityIndicator";
			definition = "Indicates whether the security is eligible for holding at DTC.";
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityExtension2
	 * UnderlyingSecurityExtension2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTickerSymbol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingSecurityExtension2.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Ticket symbol for the event security (underlying security). ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnderlyingSecurityExtension2.mmPlaceAndName, UnderlyingSecurityExtension2.mmCountryOfListing, UnderlyingSecurityExtension2.mmCountryOfIncorporation,
						UnderlyingSecurityExtension2.mmIncomeSourceCountry, UnderlyingSecurityExtension2.mmIssuerDescription, UnderlyingSecurityExtension2.mmDTCAssetClass, UnderlyingSecurityExtension2.mmDTCAssetType,
						UnderlyingSecurityExtension2.mmPrimaryExchangeFlag, UnderlyingSecurityExtension2.mmSecurityEligibilityIndicator, UnderlyingSecurityExtension2.mmSECRegisteredFlag, UnderlyingSecurityExtension2.mmTickerSymbol);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnderlyingSecurityExtension2";
				definition = "Provides additional information regarding underlying security details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public CountryCode getCountryOfListing() {
		return countryOfListing;
	}

	public void setCountryOfListing(CountryCode countryOfListing) {
		this.countryOfListing = countryOfListing;
	}

	public CountryCode getCountryOfIncorporation() {
		return countryOfIncorporation;
	}

	public void setCountryOfIncorporation(CountryCode countryOfIncorporation) {
		this.countryOfIncorporation = countryOfIncorporation;
	}

	public CountryCode getIncomeSourceCountry() {
		return incomeSourceCountry;
	}

	public void setIncomeSourceCountry(CountryCode incomeSourceCountry) {
		this.incomeSourceCountry = incomeSourceCountry;
	}

	public Max70Text getIssuerDescription() {
		return issuerDescription;
	}

	public void setIssuerDescription(Max70Text issuerDescription) {
		this.issuerDescription = issuerDescription;
	}

	public AssetClass1Code getDTCAssetClass() {
		return dTCAssetClass;
	}

	public void setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
	}

	public DTCAssetType1Code getDTCAssetType() {
		return dTCAssetType;
	}

	public void setDTCAssetType(DTCAssetType1Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
	}

	public YesNoIndicator getPrimaryExchangeFlag() {
		return primaryExchangeFlag;
	}

	public void setPrimaryExchangeFlag(YesNoIndicator primaryExchangeFlag) {
		this.primaryExchangeFlag = primaryExchangeFlag;
	}

	public YesNoIndicator getSecurityEligibilityIndicator() {
		return securityEligibilityIndicator;
	}

	public void setSecurityEligibilityIndicator(YesNoIndicator securityEligibilityIndicator) {
		this.securityEligibilityIndicator = securityEligibilityIndicator;
	}

	public YesNoIndicator getSECRegisteredFlag() {
		return sECRegisteredFlag;
	}

	public void setSECRegisteredFlag(YesNoIndicator sECRegisteredFlag) {
		this.sECRegisteredFlag = sECRegisteredFlag;
	}

	public Max35Text getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(Max35Text tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}
}