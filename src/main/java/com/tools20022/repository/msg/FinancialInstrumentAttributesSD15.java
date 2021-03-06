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
import com.tools20022.repository.codeset.DTCAssetType3Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max50Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification2;
import com.tools20022.repository.msg.SecurityIdentification20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmPlaceAndName
 * FinancialInstrumentAttributesSD15.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmIncomeSourceCountry
 * FinancialInstrumentAttributesSD15.mmIncomeSourceCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmDTCAssetClass
 * FinancialInstrumentAttributesSD15.mmDTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmDTCAssetType
 * FinancialInstrumentAttributesSD15.mmDTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmSecurityEligibilityIndicator
 * FinancialInstrumentAttributesSD15.mmSecurityEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmTickerSymbol
 * FinancialInstrumentAttributesSD15.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmLinkedSecurity
 * FinancialInstrumentAttributesSD15.mmLinkedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmOriginatingSecurityIdentification
 * FinancialInstrumentAttributesSD15.mmOriginatingSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmDIVANNSecurityDescription
 * FinancialInstrumentAttributesSD15.mmDIVANNSecurityDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15#mmForeignIssueFlag
 * FinancialInstrumentAttributesSD15.mmForeignIssueFlag}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributesSD15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14
 * FinancialInstrumentAttributesSD14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD15", propOrder = {"placeAndName", "incomeSourceCountry", "dTCAssetClass", "dTCAssetType", "securityEligibilityIndicator", "tickerSymbol", "linkedSecurity",
		"originatingSecurityIdentification", "dIVANNSecurityDescription", "foreignIssueFlag"})
public class FinancialInstrumentAttributesSD15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmPlaceAndName
	 * FinancialInstrumentAttributesSD14.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmIncomeSourceCountry
	 * FinancialInstrumentAttributesSD14.mmIncomeSourceCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<CountryCode>> mmIncomeSourceCountry = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "IncmSrcCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Income Source Country"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeSourceCountry";
			definition = "Country of source income for the security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmIncomeSourceCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getIncomeSourceCountry();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<CountryCode> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmDTCAssetClass
	 * FinancialInstrumentAttributesSD14.mmDTCAssetClass}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<AssetClass1Code>> mmDTCAssetClass = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<AssetClass1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Class"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmDTCAssetClass;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}

		@Override
		public Optional<AssetClass1Code> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getDTCAssetClass();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<AssetClass1Code> value) {
			obj.setDTCAssetClass(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCAsstTp")
	protected DTCAssetType3Code dTCAssetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType3Code
	 * DTCAssetType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmDTCAssetType
	 * FinancialInstrumentAttributesSD14.mmDTCAssetType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<DTCAssetType3Code>> mmDTCAssetType = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<DTCAssetType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmDTCAssetType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType3Code.mmObject();
		}

		@Override
		public Optional<DTCAssetType3Code> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getDTCAssetType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<DTCAssetType3Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmSecurityEligibilityIndicator
	 * FinancialInstrumentAttributesSD14.mmSecurityEligibilityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<YesNoIndicator>> mmSecurityEligibilityIndicator = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "SctyElgbltyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Eligibility Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibilityIndicator";
			definition = "Indicates whether the security is eligible for holding at DTC.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmSecurityEligibilityIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getSecurityEligibilityIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmTickerSymbol
	 * FinancialInstrumentAttributesSD14.mmTickerSymbol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<Max35Text>> mmTickerSymbol = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Ticker Symbol"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Ticket symbol for the event security (underlying security).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmTickerSymbol;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getTickerSymbol();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<Max35Text> value) {
			obj.setTickerSymbol(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdScty")
	protected SecurityIdentification20 linkedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmLinkedSecurity
	 * FinancialInstrumentAttributesSD14.mmLinkedSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<SecurityIdentification20>> mmLinkedSecurity = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<SecurityIdentification20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "LkdScty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Linked Security ID"), new DTCCSynonym(this, "Linked Security ID Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedSecurity";
			definition = "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmLinkedSecurity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public Optional<SecurityIdentification20> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getLinkedSecurity();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<SecurityIdentification20> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmOriginatingSecurityIdentification
	 * FinancialInstrumentAttributesSD14.mmOriginatingSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributesSD15, Optional<OtherIdentification2>> mmOriginatingSecurityIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributesSD15, Optional<OtherIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "OrgtgSctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingSecurityIdentification";
			definition = "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmOriginatingSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification2.mmObject();
		}

		@Override
		public Optional<OtherIdentification2> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getOriginatingSecurityIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<OtherIdentification2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmDIVANNSecurityDescription
	 * FinancialInstrumentAttributesSD14.mmDIVANNSecurityDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<Max50Text>> mmDIVANNSecurityDescription = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<Max50Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "DIVANNSctyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DIVANNSecurityDescription";
			definition = "Security description associated with DIVANN legacy system which contains additional values such as NTL for interest only notional.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmDIVANNSecurityDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max50Text.mmObject();
		}

		@Override
		public Optional<Max50Text> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getDIVANNSecurityDescription();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<Max50Text> value) {
			obj.setDIVANNSecurityDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnIsseFlg")
	protected YesNoIndicator foreignIssueFlag;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD15
	 * FinancialInstrumentAttributesSD15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnIsseFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIssueFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event security is a foreign issue. This field will be initially used for CD Early Redemptions AC63."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD14#mmForeignIssueFlag
	 * FinancialInstrumentAttributesSD14.mmForeignIssueFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<YesNoIndicator>> mmForeignIssueFlag = new MMMessageAttribute<FinancialInstrumentAttributesSD15, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmObject();
			isDerived = false;
			xmlTag = "FrgnIsseFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIssueFlag";
			definition = "Indicates whether the event security is a foreign issue. This field will be initially used for CD Early Redemptions AC63.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmForeignIssueFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributesSD15 obj) {
			return obj.getForeignIssueFlag();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD15 obj, Optional<YesNoIndicator> value) {
			obj.setForeignIssueFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmPlaceAndName, com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmIncomeSourceCountry,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmDTCAssetClass, com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmDTCAssetType,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmSecurityEligibilityIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmTickerSymbol,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmLinkedSecurity, com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmOriginatingSecurityIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmDIVANNSecurityDescription, com.tools20022.repository.msg.FinancialInstrumentAttributesSD15.mmForeignIssueFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD15";
				definition = "Provides additional information regarding underlying security details.";
				previousVersion_lazy = () -> FinancialInstrumentAttributesSD14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public FinancialInstrumentAttributesSD15 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<CountryCode> getIncomeSourceCountry() {
		return incomeSourceCountry == null ? Optional.empty() : Optional.of(incomeSourceCountry);
	}

	public FinancialInstrumentAttributesSD15 setIncomeSourceCountry(CountryCode incomeSourceCountry) {
		this.incomeSourceCountry = incomeSourceCountry;
		return this;
	}

	public Optional<AssetClass1Code> getDTCAssetClass() {
		return dTCAssetClass == null ? Optional.empty() : Optional.of(dTCAssetClass);
	}

	public FinancialInstrumentAttributesSD15 setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
		return this;
	}

	public Optional<DTCAssetType3Code> getDTCAssetType() {
		return dTCAssetType == null ? Optional.empty() : Optional.of(dTCAssetType);
	}

	public FinancialInstrumentAttributesSD15 setDTCAssetType(DTCAssetType3Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
		return this;
	}

	public Optional<YesNoIndicator> getSecurityEligibilityIndicator() {
		return securityEligibilityIndicator == null ? Optional.empty() : Optional.of(securityEligibilityIndicator);
	}

	public FinancialInstrumentAttributesSD15 setSecurityEligibilityIndicator(YesNoIndicator securityEligibilityIndicator) {
		this.securityEligibilityIndicator = securityEligibilityIndicator;
		return this;
	}

	public Optional<Max35Text> getTickerSymbol() {
		return tickerSymbol == null ? Optional.empty() : Optional.of(tickerSymbol);
	}

	public FinancialInstrumentAttributesSD15 setTickerSymbol(Max35Text tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
		return this;
	}

	public Optional<SecurityIdentification20> getLinkedSecurity() {
		return linkedSecurity == null ? Optional.empty() : Optional.of(linkedSecurity);
	}

	public FinancialInstrumentAttributesSD15 setLinkedSecurity(SecurityIdentification20 linkedSecurity) {
		this.linkedSecurity = linkedSecurity;
		return this;
	}

	public Optional<OtherIdentification2> getOriginatingSecurityIdentification() {
		return originatingSecurityIdentification == null ? Optional.empty() : Optional.of(originatingSecurityIdentification);
	}

	public FinancialInstrumentAttributesSD15 setOriginatingSecurityIdentification(OtherIdentification2 originatingSecurityIdentification) {
		this.originatingSecurityIdentification = originatingSecurityIdentification;
		return this;
	}

	public Optional<Max50Text> getDIVANNSecurityDescription() {
		return dIVANNSecurityDescription == null ? Optional.empty() : Optional.of(dIVANNSecurityDescription);
	}

	public FinancialInstrumentAttributesSD15 setDIVANNSecurityDescription(Max50Text dIVANNSecurityDescription) {
		this.dIVANNSecurityDescription = dIVANNSecurityDescription;
		return this;
	}

	public Optional<YesNoIndicator> getForeignIssueFlag() {
		return foreignIssueFlag == null ? Optional.empty() : Optional.of(foreignIssueFlag);
	}

	public FinancialInstrumentAttributesSD15 setForeignIssueFlag(YesNoIndicator foreignIssueFlag) {
		this.foreignIssueFlag = foreignIssueFlag;
		return this;
	}
}