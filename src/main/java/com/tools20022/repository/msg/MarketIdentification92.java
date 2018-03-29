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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingMarketIdentificationCodeReportV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.MarketIdentification1Code;
import com.tools20022.repository.codeset.Modification1Code;
import com.tools20022.repository.codeset.TradingVenue1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
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
 * Details on a trading venue as per ISO 10383.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmOperating
 * MarketIdentification92.mmOperating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmSegment
 * MarketIdentification92.mmSegment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification92#mmType
 * MarketIdentification92.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmCategory
 * MarketIdentification92.mmCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmInstitutionName
 * MarketIdentification92.mmInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmAcronym
 * MarketIdentification92.mmAcronym}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification92#mmCity
 * MarketIdentification92.mmCity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmCountry
 * MarketIdentification92.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmAuthorityName
 * MarketIdentification92.mmAuthorityName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmWebSite
 * MarketIdentification92.mmWebSite}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification92#mmNote
 * MarketIdentification92.mmNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmModification
 * MarketIdentification92.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmCreationDate
 * MarketIdentification92.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmValidityPeriod
 * MarketIdentification92.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmStatusDate
 * MarketIdentification92.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmLastUpdatedDate
 * MarketIdentification92.mmLastUpdatedDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingMarketIdentificationCodeReportV01#mmMarketIdentification
 * FinancialInstrumentReportingMarketIdentificationCodeReportV01.
 * mmMarketIdentification}</li>
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
 * "MarketIdentification92"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details on a trading venue as per ISO 10383."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarketIdentification92", propOrder = {"operating", "segment", "type", "category", "institutionName", "acronym", "city", "country", "authorityName", "webSite", "note", "modification", "creationDate", "validityPeriod",
		"statusDate", "lastUpdatedDate"})
public class MarketIdentification92 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Oprg", required = true)
	protected MICIdentifier operating;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmIdentification
	 * Market.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oprg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operating MIC of the venue."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, MICIdentifier> mmOperating = new MMMessageAttribute<MarketIdentification92, MICIdentifier>() {
		{
			businessElementTrace_lazy = () -> Market.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Oprg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operating";
			definition = "Operating MIC of the venue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(MarketIdentification92 obj) {
			return obj.getOperating();
		}

		@Override
		public void setValue(MarketIdentification92 obj, MICIdentifier value) {
			obj.setOperating(value);
		}
	};
	@XmlElement(name = "Sgmt", required = true)
	protected MICIdentifier segment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmIdentification
	 * Market.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Segment MIC of the venue where it exists, otherwise the Operating MIC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, MICIdentifier> mmSegment = new MMMessageAttribute<MarketIdentification92, MICIdentifier>() {
		{
			businessElementTrace_lazy = () -> Market.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Sgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segment";
			definition = "Segment MIC of the venue where it exists, otherwise the Operating MIC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(MarketIdentification92 obj) {
			return obj.getSegment();
		}

		@Override
		public void setValue(MarketIdentification92 obj, MICIdentifier value) {
			obj.setSegment(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected MarketIdentification1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketIdentification1Code
	 * MarketIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyType
	 * PartyIdentificationInformation.mmPartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Define the type of Market Identification Code that is being supplied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, MarketIdentification1Code> mmType = new MMMessageAttribute<MarketIdentification92, MarketIdentification1Code>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmPartyType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Define the type of Market Identification Code that is being supplied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketIdentification1Code.mmObject();
		}

		@Override
		public MarketIdentification1Code getValue(MarketIdentification92 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(MarketIdentification92 obj, MarketIdentification1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Ctgy")
	protected TradingVenue1Code category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code
	 * TradingVenue1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmType
	 * TradingMarket.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the category of market the venue operates in."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<TradingVenue1Code>> mmCategory = new MMMessageAttribute<MarketIdentification92, Optional<TradingVenue1Code>>() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Provides the category of market the venue operates in.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingVenue1Code.mmObject();
		}

		@Override
		public Optional<TradingVenue1Code> getValue(MarketIdentification92 obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<TradingVenue1Code> value) {
			obj.setCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "InstnNm", required = true)
	protected Max450Text institutionName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max450Text
	 * Max450Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The name or description of the institution, market, or infrastructure."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Max450Text> mmInstitutionName = new MMMessageAttribute<MarketIdentification92, Max450Text>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "InstnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionName";
			definition = "The name or description of the institution, market, or infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max450Text.mmObject();
		}

		@Override
		public Max450Text getValue(MarketIdentification92 obj) {
			return obj.getInstitutionName();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Max450Text value) {
			obj.setInstitutionName(value);
		}
	};
	@XmlElement(name = "Acrnm")
	protected Max35Text acronym;
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
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acrnm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acronym"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Known acronym of the institution, market, or infrastructure."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<Max35Text>> mmAcronym = new MMMessageAttribute<MarketIdentification92, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Acrnm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acronym";
			definition = "Known acronym of the institution, market, or infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MarketIdentification92 obj) {
			return obj.getAcronym();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<Max35Text> value) {
			obj.setAcronym(value.orElse(null));
		}
	};
	@XmlElement(name = "City")
	protected Max35Text city;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
	 * PostalAddress.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "City"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "City"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "City where the institution, market, or infrastructure operates."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<Max35Text>> mmCity = new MMMessageAttribute<MarketIdentification92, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "City";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "City";
			definition = "City where the institution, market, or infrastructure operates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MarketIdentification92 obj) {
			return obj.getCity();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<Max35Text> value) {
			obj.setCity(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmCountry
	 * Market.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
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
	public static final MMMessageAssociationEnd<MarketIdentification92, CountryCodeAndName3> mmCountry = new MMMessageAssociationEnd<MarketIdentification92, CountryCodeAndName3>() {
		{
			businessElementTrace_lazy = () -> Market.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
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
		public CountryCodeAndName3 getValue(MarketIdentification92 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(MarketIdentification92 obj, CountryCodeAndName3 value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "AuthrtyNm")
	protected Max450Text authorityName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max450Text
	 * Max450Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrtyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The name of the national competent authority associated with the MIC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<Max450Text>> mmAuthorityName = new MMMessageAttribute<MarketIdentification92, Optional<Max450Text>>() {
		{
			businessComponentTrace_lazy = () -> RegulatoryAuthorityRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "AuthrtyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorityName";
			definition = "The name of the national competent authority associated with the MIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max450Text.mmObject();
		}

		@Override
		public Optional<Max450Text> getValue(MarketIdentification92 obj) {
			return obj.getAuthorityName();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<Max450Text> value) {
			obj.setAuthorityName(value.orElse(null));
		}
	};
	@XmlElement(name = "WebSite")
	protected Max210Text webSite;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WebSite"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WebSite"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Website URI of the institution, market, or infrastructure."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<Max210Text>> mmWebSite = new MMMessageAttribute<MarketIdentification92, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "WebSite";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WebSite";
			definition = "Website URI of the institution, market, or infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(MarketIdentification92 obj) {
			return obj.getWebSite();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<Max210Text> value) {
			obj.setWebSite(value.orElse(null));
		}
	};
	@XmlElement(name = "Note")
	protected Max450Text note;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max450Text
	 * Max450Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Note"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Note"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details additional information about the market operator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<Max450Text>> mmNote = new MMMessageAttribute<MarketIdentification92, Optional<Max450Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Note";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Note";
			definition = "Details additional information about the market operator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max450Text.mmObject();
		}

		@Override
		public Optional<Max450Text> getValue(MarketIdentification92 obj) {
			return obj.getNote();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<Max450Text> value) {
			obj.setNote(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
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
	 * "Additional information to help users identify the exchange or understand a modification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<Modification1Code>> mmModification = new MMMessageAttribute<MarketIdentification92, Optional<Modification1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Additional information to help users identify the exchange or understand a modification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Modification1Code.mmObject();
		}

		@Override
		public Optional<Modification1Code> getValue(MarketIdentification92 obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<Modification1Code> value) {
			obj.setModification(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDt")
	protected ISODate creationDate;
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
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date of the MIC issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<ISODate>> mmCreationDate = new MMMessageAttribute<MarketIdentification92, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "CreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "First date of the MIC issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MarketIdentification92 obj) {
			return obj.getCreationDate();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<ISODate> value) {
			obj.setCreationDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
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
	public static final MMMessageAssociationEnd<MarketIdentification92, Period4Choice> mmValidityPeriod = new MMMessageAssociationEnd<MarketIdentification92, Period4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
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
		public Period4Choice getValue(MarketIdentification92 obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Period4Choice value) {
			obj.setValidityPeriod(value);
		}
	};
	@XmlElement(name = "StsDt")
	protected ISODate statusDate;
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
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the market identification code was last modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<ISODate>> mmStatusDate = new MMMessageAttribute<MarketIdentification92, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date when the market identification code was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MarketIdentification92 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<ISODate> value) {
			obj.setStatusDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LastUpdtdDt")
	protected ISODateTime lastUpdatedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92
	 * MarketIdentification92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastUpdtdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastUpdatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when this record was last modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification92, Optional<ISODateTime>> mmLastUpdatedDate = new MMMessageAttribute<MarketIdentification92, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "LastUpdtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdatedDate";
			definition = "Date when this record was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MarketIdentification92 obj) {
			return obj.getLastUpdatedDate();
		}

		@Override
		public void setValue(MarketIdentification92 obj, Optional<ISODateTime> value) {
			obj.setLastUpdatedDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketIdentification92.mmOperating, com.tools20022.repository.msg.MarketIdentification92.mmSegment,
						com.tools20022.repository.msg.MarketIdentification92.mmType, com.tools20022.repository.msg.MarketIdentification92.mmCategory, com.tools20022.repository.msg.MarketIdentification92.mmInstitutionName,
						com.tools20022.repository.msg.MarketIdentification92.mmAcronym, com.tools20022.repository.msg.MarketIdentification92.mmCity, com.tools20022.repository.msg.MarketIdentification92.mmCountry,
						com.tools20022.repository.msg.MarketIdentification92.mmAuthorityName, com.tools20022.repository.msg.MarketIdentification92.mmWebSite, com.tools20022.repository.msg.MarketIdentification92.mmNote,
						com.tools20022.repository.msg.MarketIdentification92.mmModification, com.tools20022.repository.msg.MarketIdentification92.mmCreationDate, com.tools20022.repository.msg.MarketIdentification92.mmValidityPeriod,
						com.tools20022.repository.msg.MarketIdentification92.mmStatusDate, com.tools20022.repository.msg.MarketIdentification92.mmLastUpdatedDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmMarketIdentification);
				trace_lazy = () -> Market.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketIdentification92";
				definition = "Details on a trading venue as per ISO 10383.";
			}
		});
		return mmObject_lazy.get();
	}

	public MICIdentifier getOperating() {
		return operating;
	}

	public MarketIdentification92 setOperating(MICIdentifier operating) {
		this.operating = Objects.requireNonNull(operating);
		return this;
	}

	public MICIdentifier getSegment() {
		return segment;
	}

	public MarketIdentification92 setSegment(MICIdentifier segment) {
		this.segment = Objects.requireNonNull(segment);
		return this;
	}

	public MarketIdentification1Code getType() {
		return type;
	}

	public MarketIdentification92 setType(MarketIdentification1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<TradingVenue1Code> getCategory() {
		return category == null ? Optional.empty() : Optional.of(category);
	}

	public MarketIdentification92 setCategory(TradingVenue1Code category) {
		this.category = category;
		return this;
	}

	public Max450Text getInstitutionName() {
		return institutionName;
	}

	public MarketIdentification92 setInstitutionName(Max450Text institutionName) {
		this.institutionName = Objects.requireNonNull(institutionName);
		return this;
	}

	public Optional<Max35Text> getAcronym() {
		return acronym == null ? Optional.empty() : Optional.of(acronym);
	}

	public MarketIdentification92 setAcronym(Max35Text acronym) {
		this.acronym = acronym;
		return this;
	}

	public Optional<Max35Text> getCity() {
		return city == null ? Optional.empty() : Optional.of(city);
	}

	public MarketIdentification92 setCity(Max35Text city) {
		this.city = city;
		return this;
	}

	public CountryCodeAndName3 getCountry() {
		return country;
	}

	public MarketIdentification92 setCountry(CountryCodeAndName3 country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public Optional<Max450Text> getAuthorityName() {
		return authorityName == null ? Optional.empty() : Optional.of(authorityName);
	}

	public MarketIdentification92 setAuthorityName(Max450Text authorityName) {
		this.authorityName = authorityName;
		return this;
	}

	public Optional<Max210Text> getWebSite() {
		return webSite == null ? Optional.empty() : Optional.of(webSite);
	}

	public MarketIdentification92 setWebSite(Max210Text webSite) {
		this.webSite = webSite;
		return this;
	}

	public Optional<Max450Text> getNote() {
		return note == null ? Optional.empty() : Optional.of(note);
	}

	public MarketIdentification92 setNote(Max450Text note) {
		this.note = note;
		return this;
	}

	public Optional<Modification1Code> getModification() {
		return modification == null ? Optional.empty() : Optional.of(modification);
	}

	public MarketIdentification92 setModification(Modification1Code modification) {
		this.modification = modification;
		return this;
	}

	public Optional<ISODate> getCreationDate() {
		return creationDate == null ? Optional.empty() : Optional.of(creationDate);
	}

	public MarketIdentification92 setCreationDate(ISODate creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	public Period4Choice getValidityPeriod() {
		return validityPeriod;
	}

	public MarketIdentification92 setValidityPeriod(Period4Choice validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public Optional<ISODate> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public MarketIdentification92 setStatusDate(ISODate statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public Optional<ISODateTime> getLastUpdatedDate() {
		return lastUpdatedDate == null ? Optional.empty() : Optional.of(lastUpdatedDate);
	}

	public MarketIdentification92 setLastUpdatedDate(ISODateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
		return this;
	}
}