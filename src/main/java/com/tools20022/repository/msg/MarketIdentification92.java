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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarketIdentification92", propOrder = {"operating", "segment", "type", "category", "institutionName", "acronym", "city", "country", "authorityName", "webSite", "note", "modification", "creationDate", "validityPeriod",
		"statusDate", "lastUpdatedDate"})
public class MarketIdentification92 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MICIdentifier operating;
	/**
	 * Operating MIC of the venue.
	 * <p>
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
	public static final MMMessageAttribute mmOperating = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Market.mmIdentification;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Oprg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operating";
			definition = "Operating MIC of the venue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected MICIdentifier segment;
	/**
	 * Segment MIC of the venue where it exists, otherwise the Operating MIC.
	 * <p>
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
	public static final MMMessageAttribute mmSegment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Market.mmIdentification;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Sgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segment";
			definition = "Segment MIC of the venue where it exists, otherwise the Operating MIC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected MarketIdentification1Code type;
	/**
	 * Define the type of Market Identification Code that is being supplied.
	 * <p>
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
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmPartyType;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Define the type of Market Identification Code that is being supplied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketIdentification1Code.mmObject();
		}
	};
	protected TradingVenue1Code category;
	/**
	 * Provides the category of market the venue operates in.
	 * <p>
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
	public static final MMMessageAttribute mmCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmType;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Provides the category of market the venue operates in.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingVenue1Code.mmObject();
		}
	};
	protected Max450Text institutionName;
	/**
	 * The name or description of the institution, market, or infrastructure.
	 * <p>
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
	public static final MMMessageAttribute mmInstitutionName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "InstnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionName";
			definition = "The name or description of the institution, market, or infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max450Text.mmObject();
		}
	};
	protected Max35Text acronym;
	/**
	 * Known acronym of the institution, market, or infrastructure.
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
	public static final MMMessageAttribute mmAcronym = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Acrnm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acronym";
			definition = "Known acronym of the institution, market, or infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text city;
	/**
	 * City where the institution, market, or infrastructure operates.
	 * <p>
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
	public static final MMMessageAttribute mmCity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "City";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "City";
			definition = "City where the institution, market, or infrastructure operates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMMessageAssociationEnd mmCountry = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Market.mmCountry;
			componentContext_lazy = () -> MarketIdentification92.mmObject();
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
	protected Max450Text authorityName;
	/**
	 * The name of the national competent authority associated with the MIC.
	 * <p>
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
	public static final MMMessageAttribute mmAuthorityName = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> RegulatoryAuthorityRole.mmObject();
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "AuthrtyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorityName";
			definition = "The name of the national competent authority associated with the MIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max450Text.mmObject();
		}
	};
	protected Max210Text webSite;
	/**
	 * Website URI of the institution, market, or infrastructure.
	 * <p>
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
	public static final MMMessageAttribute mmWebSite = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "WebSite";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WebSite";
			definition = "Website URI of the institution, market, or infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};
	protected Max450Text note;
	/**
	 * Details additional information about the market operator.
	 * <p>
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
	public static final MMMessageAttribute mmNote = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Note";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Note";
			definition = "Details additional information about the market operator.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max450Text.mmObject();
		}
	};
	protected Modification1Code modification;
	/**
	 * Additional information to help users identify the exchange or understand
	 * a modification.
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
	public static final MMMessageAttribute mmModification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Additional information to help users identify the exchange or understand a modification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Modification1Code.mmObject();
		}
	};
	protected ISODate creationDate;
	/**
	 * First date of the MIC issuance.
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
	public static final MMMessageAttribute mmCreationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "CreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "First date of the MIC issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
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
	public static final MMMessageAssociationEnd mmValidityPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
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
	protected ISODate statusDate;
	/**
	 * Date when the market identification code was last modified.
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
	public static final MMMessageAttribute mmStatusDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date when the market identification code was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODateTime lastUpdatedDate;
	/**
	 * Date when this record was last modified.
	 * <p>
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
	public static final MMMessageAttribute mmLastUpdatedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentification92.mmObject();
			isDerived = false;
			xmlTag = "LastUpdtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdatedDate";
			definition = "Date when this record was last modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarketIdentification92.mmOperating, MarketIdentification92.mmSegment, MarketIdentification92.mmType, MarketIdentification92.mmCategory, MarketIdentification92.mmInstitutionName,
						MarketIdentification92.mmAcronym, MarketIdentification92.mmCity, MarketIdentification92.mmCountry, MarketIdentification92.mmAuthorityName, MarketIdentification92.mmWebSite, MarketIdentification92.mmNote,
						MarketIdentification92.mmModification, MarketIdentification92.mmCreationDate, MarketIdentification92.mmValidityPeriod, MarketIdentification92.mmStatusDate, MarketIdentification92.mmLastUpdatedDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmMarketIdentification);
				trace_lazy = () -> Market.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketIdentification92";
				definition = "Details on a trading venue as per ISO 10383.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Oprg", required = true)
	public MICIdentifier getOperating() {
		return operating;
	}

	public void setOperating(MICIdentifier operating) {
		this.operating = operating;
	}

	@XmlElement(name = "Sgmt", required = true)
	public MICIdentifier getSegment() {
		return segment;
	}

	public void setSegment(MICIdentifier segment) {
		this.segment = segment;
	}

	@XmlElement(name = "Tp", required = true)
	public MarketIdentification1Code getType() {
		return type;
	}

	public void setType(MarketIdentification1Code type) {
		this.type = type;
	}

	@XmlElement(name = "Ctgy")
	public TradingVenue1Code getCategory() {
		return category;
	}

	public void setCategory(TradingVenue1Code category) {
		this.category = category;
	}

	@XmlElement(name = "InstnNm", required = true)
	public Max450Text getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(Max450Text institutionName) {
		this.institutionName = institutionName;
	}

	@XmlElement(name = "Acrnm")
	public Max35Text getAcronym() {
		return acronym;
	}

	public void setAcronym(Max35Text acronym) {
		this.acronym = acronym;
	}

	@XmlElement(name = "City")
	public Max35Text getCity() {
		return city;
	}

	public void setCity(Max35Text city) {
		this.city = city;
	}

	@XmlElement(name = "Ctry", required = true)
	public CountryCodeAndName3 getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.msg.CountryCodeAndName3 country) {
		this.country = country;
	}

	@XmlElement(name = "AuthrtyNm")
	public Max450Text getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(Max450Text authorityName) {
		this.authorityName = authorityName;
	}

	@XmlElement(name = "WebSite")
	public Max210Text getWebSite() {
		return webSite;
	}

	public void setWebSite(Max210Text webSite) {
		this.webSite = webSite;
	}

	@XmlElement(name = "Note")
	public Max450Text getNote() {
		return note;
	}

	public void setNote(Max450Text note) {
		this.note = note;
	}

	@XmlElement(name = "Mod")
	public Modification1Code getModification() {
		return modification;
	}

	public void setModification(Modification1Code modification) {
		this.modification = modification;
	}

	@XmlElement(name = "CreDt")
	public ISODate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ISODate creationDate) {
		this.creationDate = creationDate;
	}

	@XmlElement(name = "VldtyPrd", required = true)
	public Period4Choice getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(Period4Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	@XmlElement(name = "StsDt")
	public ISODate getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(ISODate statusDate) {
		this.statusDate = statusDate;
	}

	@XmlElement(name = "LastUpdtdDt")
	public ISODateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(ISODateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}