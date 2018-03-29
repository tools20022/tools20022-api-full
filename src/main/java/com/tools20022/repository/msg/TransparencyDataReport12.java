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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.TransparencyMethodology2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketDetail2;
import com.tools20022.repository.msg.StatisticsTransparency3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for reporting calculation results of equity instruments as part of
 * transparency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmTechnicalRecordIdentification
 * TransparencyDataReport12.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmIdentification
 * TransparencyDataReport12.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmFullName
 * TransparencyDataReport12.mmFullName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmTradingVenue
 * TransparencyDataReport12.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmReportingPeriod
 * TransparencyDataReport12.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmLiquidity
 * TransparencyDataReport12.mmLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmMethodology
 * TransparencyDataReport12.mmMethodology}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmStatistics
 * TransparencyDataReport12.mmStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmRelevantMarket
 * TransparencyDataReport12.mmRelevantMarket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityResultV01#mmEquityTransparencyData
 * FinancialInstrumentReportingEquityTradingActivityResultV01.
 * mmEquityTransparencyData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forTransparencyDataReport12
 * ConstraintValidISINRule.forTransparencyDataReport12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidMICRule#forTransparencyDataReport12
 * ConstraintValidMICRule.forTransparencyDataReport12}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransparencyDataReport12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for reporting calculation results of equity instruments as part of transparency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransparencyDataReport12", propOrder = {"technicalRecordIdentification", "identification", "fullName", "tradingVenue", "reportingPeriod", "liquidity", "methodology", "statistics", "relevantMarket"})
public class TransparencyDataReport12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TechRcrdId")
	protected Max35Text technicalRecordIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of a record in a message used as part of error management and status advice messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport12, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<TransparencyDataReport12, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "TechRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalRecordIdentification";
			definition = "Unique identifier of a record in a message used as part of error management and status advice messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransparencyDataReport12 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<Max35Text> value) {
			obj.setTechnicalRecordIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Id", required = true)
	protected ISINOct2015Identifier identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument using an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport12, ISINOct2015Identifier> mmIdentification = new MMMessageAttribute<TransparencyDataReport12, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the financial instrument using an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(TransparencyDataReport12 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, ISINOct2015Identifier value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "FullNm")
	protected Max350Text fullName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full name of the reporting entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport12, Optional<Max350Text>> mmFullName = new MMMessageAttribute<TransparencyDataReport12, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "FullNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullName";
			definition = "Full name of the reporting entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TransparencyDataReport12 obj) {
			return obj.getFullName();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<Max350Text> value) {
			obj.setFullName(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgVn")
	protected MICIdentifier tradingVenue;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Segment MIC for the trading venue where applicable, otherwise the operational MIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport12, Optional<MICIdentifier>> mmTradingVenue = new MMMessageAttribute<TransparencyDataReport12, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "TradgVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "Segment MIC for the trading venue where applicable, otherwise the operational MIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public Optional<MICIdentifier> getValue(TransparencyDataReport12 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<MICIdentifier> value) {
			obj.setTradingVenue(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgPrd")
	protected Period4Choice reportingPeriod;
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period to which the quantitative data fields relate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport12, Optional<Period4Choice>> mmReportingPeriod = new MMMessageAssociationEnd<TransparencyDataReport12, Optional<Period4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Period to which the quantitative data fields relate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Optional<Period4Choice> getValue(TransparencyDataReport12 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<Period4Choice> value) {
			obj.setReportingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Lqdty")
	protected TrueFalseIndicator liquidity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lqdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to say if this ISIN is liquid or not post calculations.\r\n\r\nUsage:\r\nWhen not present, this field should be treated as not applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport12, Optional<TrueFalseIndicator>> mmLiquidity = new MMMessageAttribute<TransparencyDataReport12, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "Lqdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "Flag to say if this ISIN is liquid or not post calculations.\r\n\r\nUsage:\r\nWhen not present, this field should be treated as not applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TransparencyDataReport12 obj) {
			return obj.getLiquidity();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<TrueFalseIndicator> value) {
			obj.setLiquidity(value.orElse(null));
		}
	};
	@XmlElement(name = "Mthdlgy")
	protected TransparencyMethodology2Code methodology;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code
	 * TransparencyMethodology2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mthdlgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Methodology"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Methodology that has been used to calculate the result."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport12, Optional<TransparencyMethodology2Code>> mmMethodology = new MMMessageAttribute<TransparencyDataReport12, Optional<TransparencyMethodology2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "Mthdlgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Methodology";
			definition = "Methodology that has been used to calculate the result.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransparencyMethodology2Code.mmObject();
		}

		@Override
		public Optional<TransparencyMethodology2Code> getValue(TransparencyDataReport12 obj) {
			return obj.getMethodology();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<TransparencyMethodology2Code> value) {
			obj.setMethodology(value.orElse(null));
		}
	};
	@XmlElement(name = "Sttstcs")
	protected StatisticsTransparency3 statistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttstcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Statistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Statistics for a financial instrument generated as part of transparency calculations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport12, Optional<StatisticsTransparency3>> mmStatistics = new MMMessageAssociationEnd<TransparencyDataReport12, Optional<StatisticsTransparency3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "Sttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statistics";
			definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatisticsTransparency3.mmObject();
		}

		@Override
		public Optional<StatisticsTransparency3> getValue(TransparencyDataReport12 obj) {
			return obj.getStatistics();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<StatisticsTransparency3> value) {
			obj.setStatistics(value.orElse(null));
		}
	};
	@XmlElement(name = "RlvntMkt")
	protected MarketDetail2 relevantMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketDetail2
	 * MarketDetail2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RlvntMkt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelevantMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific market details related to the most relevant market in terms of liquidity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport12, Optional<MarketDetail2>> mmRelevantMarket = new MMMessageAssociationEnd<TransparencyDataReport12, Optional<MarketDetail2>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport12.mmObject();
			isDerived = false;
			xmlTag = "RlvntMkt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelevantMarket";
			definition = "Specific market details related to the most relevant market in terms of liquidity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketDetail2.mmObject();
		}

		@Override
		public Optional<MarketDetail2> getValue(TransparencyDataReport12 obj) {
			return obj.getRelevantMarket();
		}

		@Override
		public void setValue(TransparencyDataReport12 obj, Optional<MarketDetail2> value) {
			obj.setRelevantMarket(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransparencyDataReport12.mmTechnicalRecordIdentification, com.tools20022.repository.msg.TransparencyDataReport12.mmIdentification,
						com.tools20022.repository.msg.TransparencyDataReport12.mmFullName, com.tools20022.repository.msg.TransparencyDataReport12.mmTradingVenue, com.tools20022.repository.msg.TransparencyDataReport12.mmReportingPeriod,
						com.tools20022.repository.msg.TransparencyDataReport12.mmLiquidity, com.tools20022.repository.msg.TransparencyDataReport12.mmMethodology, com.tools20022.repository.msg.TransparencyDataReport12.mmStatistics,
						com.tools20022.repository.msg.TransparencyDataReport12.mmRelevantMarket);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingEquityTradingActivityResultV01.mmEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forTransparencyDataReport12, com.tools20022.repository.constraints.ConstraintValidMICRule.forTransparencyDataReport12);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport12";
				definition = "Provides for reporting calculation results of equity instruments as part of transparency.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public TransparencyDataReport12 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public TransparencyDataReport12 setIdentification(ISINOct2015Identifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getFullName() {
		return fullName == null ? Optional.empty() : Optional.of(fullName);
	}

	public TransparencyDataReport12 setFullName(Max350Text fullName) {
		this.fullName = fullName;
		return this;
	}

	public Optional<MICIdentifier> getTradingVenue() {
		return tradingVenue == null ? Optional.empty() : Optional.of(tradingVenue);
	}

	public TransparencyDataReport12 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
		return this;
	}

	public Optional<Period4Choice> getReportingPeriod() {
		return reportingPeriod == null ? Optional.empty() : Optional.of(reportingPeriod);
	}

	public TransparencyDataReport12 setReportingPeriod(Period4Choice reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
		return this;
	}

	public Optional<TrueFalseIndicator> getLiquidity() {
		return liquidity == null ? Optional.empty() : Optional.of(liquidity);
	}

	public TransparencyDataReport12 setLiquidity(TrueFalseIndicator liquidity) {
		this.liquidity = liquidity;
		return this;
	}

	public Optional<TransparencyMethodology2Code> getMethodology() {
		return methodology == null ? Optional.empty() : Optional.of(methodology);
	}

	public TransparencyDataReport12 setMethodology(TransparencyMethodology2Code methodology) {
		this.methodology = methodology;
		return this;
	}

	public Optional<StatisticsTransparency3> getStatistics() {
		return statistics == null ? Optional.empty() : Optional.of(statistics);
	}

	public TransparencyDataReport12 setStatistics(StatisticsTransparency3 statistics) {
		this.statistics = statistics;
		return this;
	}

	public Optional<MarketDetail2> getRelevantMarket() {
		return relevantMarket == null ? Optional.empty() : Optional.of(relevantMarket);
	}

	public TransparencyDataReport12 setRelevantMarket(MarketDetail2 relevantMarket) {
		this.relevantMarket = relevantMarket;
		return this;
	}
}