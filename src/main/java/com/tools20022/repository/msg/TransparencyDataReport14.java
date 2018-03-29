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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.choice.TonsOrCurrency2Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StatisticsTransparency2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for reporting calculation results of non equity instruments as part
 * of transparency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmTechnicalRecordIdentification
 * TransparencyDataReport14.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmIdentification
 * TransparencyDataReport14.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmFullName
 * TransparencyDataReport14.mmFullName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmTradingVenue
 * TransparencyDataReport14.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmReportingPeriod
 * TransparencyDataReport14.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmLiquidity
 * TransparencyDataReport14.mmLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmPreTradeLargeInScaleThreshold
 * TransparencyDataReport14.mmPreTradeLargeInScaleThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmPostTradeLargeInScaleThreshold
 * TransparencyDataReport14.mmPostTradeLargeInScaleThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmPreTradeInstrumentSizeSpecificThreshold
 * TransparencyDataReport14.mmPreTradeInstrumentSizeSpecificThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmPostTradeInstrumentSizeSpecificThreshold
 * TransparencyDataReport14.mmPostTradeInstrumentSizeSpecificThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmStatistics
 * TransparencyDataReport14.mmStatistics}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTradingActivityResultV01#mmNonEquityTransparencyData
 * FinancialInstrumentReportingNonEquityTradingActivityResultV01.
 * mmNonEquityTransparencyData}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forTransparencyDataReport14
 * ConstraintValidISINRule.forTransparencyDataReport14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidMICRule#forTransparencyDataReport14
 * ConstraintValidMICRule.forTransparencyDataReport14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransparencyDataReport14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for reporting calculation results of non equity instruments as part of transparency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransparencyDataReport14", propOrder = {"technicalRecordIdentification", "identification", "fullName", "tradingVenue", "reportingPeriod", "liquidity", "preTradeLargeInScaleThreshold", "postTradeLargeInScaleThreshold",
		"preTradeInstrumentSizeSpecificThreshold", "postTradeInstrumentSizeSpecificThreshold", "statistics"})
public class TransparencyDataReport14 {

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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport14, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<TransparencyDataReport14, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
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
		public Optional<Max35Text> getValue(TransparencyDataReport14 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport14, ISINOct2015Identifier> mmIdentification = new MMMessageAttribute<TransparencyDataReport14, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
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
		public ISINOct2015Identifier getValue(TransparencyDataReport14 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, ISINOct2015Identifier value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport14, Optional<Max350Text>> mmFullName = new MMMessageAttribute<TransparencyDataReport14, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
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
		public Optional<Max350Text> getValue(TransparencyDataReport14 obj) {
			return obj.getFullName();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<Max350Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport14, Optional<MICIdentifier>> mmTradingVenue = new MMMessageAttribute<TransparencyDataReport14, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
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
		public Optional<MICIdentifier> getValue(TransparencyDataReport14 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<MICIdentifier> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAssociationEnd<TransparencyDataReport14, Optional<Period4Choice>> mmReportingPeriod = new MMMessageAssociationEnd<TransparencyDataReport14, Optional<Period4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
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
		public Optional<Period4Choice> getValue(TransparencyDataReport14 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<Period4Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport14, Optional<TrueFalseIndicator>> mmLiquidity = new MMMessageAttribute<TransparencyDataReport14, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
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
		public Optional<TrueFalseIndicator> getValue(TransparencyDataReport14 obj) {
			return obj.getLiquidity();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<TrueFalseIndicator> value) {
			obj.setLiquidity(value.orElse(null));
		}
	};
	@XmlElement(name = "PreTradLrgInScaleThrshld")
	protected TonsOrCurrency2Choice preTradeLargeInScaleThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TonsOrCurrency2Choice
	 * TonsOrCurrency2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreTradLrgInScaleThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreTradeLargeInScaleThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The pre-trade Large in Scale threshold."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>> mmPreTradeLargeInScaleThreshold = new MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "PreTradLrgInScaleThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreTradeLargeInScaleThreshold";
			definition = "The pre-trade Large in Scale threshold.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TonsOrCurrency2Choice.mmObject();
		}

		@Override
		public Optional<TonsOrCurrency2Choice> getValue(TransparencyDataReport14 obj) {
			return obj.getPreTradeLargeInScaleThreshold();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<TonsOrCurrency2Choice> value) {
			obj.setPreTradeLargeInScaleThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "PstTradLrgInScaleThrshld")
	protected TonsOrCurrency2Choice postTradeLargeInScaleThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TonsOrCurrency2Choice
	 * TonsOrCurrency2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstTradLrgInScaleThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostTradeLargeInScaleThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The post-trade Large in Scale threshold."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>> mmPostTradeLargeInScaleThreshold = new MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "PstTradLrgInScaleThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostTradeLargeInScaleThreshold";
			definition = "The post-trade Large in Scale threshold.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TonsOrCurrency2Choice.mmObject();
		}

		@Override
		public Optional<TonsOrCurrency2Choice> getValue(TransparencyDataReport14 obj) {
			return obj.getPostTradeLargeInScaleThreshold();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<TonsOrCurrency2Choice> value) {
			obj.setPostTradeLargeInScaleThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "PreTradInstrmSzSpcfcThrshld")
	protected TonsOrCurrency2Choice preTradeInstrumentSizeSpecificThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TonsOrCurrency2Choice
	 * TonsOrCurrency2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreTradInstrmSzSpcfcThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreTradeInstrumentSizeSpecificThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The pre-trade Size Specific to an Instrument threshold."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>> mmPreTradeInstrumentSizeSpecificThreshold = new MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "PreTradInstrmSzSpcfcThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreTradeInstrumentSizeSpecificThreshold";
			definition = "The pre-trade Size Specific to an Instrument threshold.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TonsOrCurrency2Choice.mmObject();
		}

		@Override
		public Optional<TonsOrCurrency2Choice> getValue(TransparencyDataReport14 obj) {
			return obj.getPreTradeInstrumentSizeSpecificThreshold();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<TonsOrCurrency2Choice> value) {
			obj.setPreTradeInstrumentSizeSpecificThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "PstTradInstrmSzSpcfcThrshld")
	protected TonsOrCurrency2Choice postTradeInstrumentSizeSpecificThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TonsOrCurrency2Choice
	 * TonsOrCurrency2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstTradInstrmSzSpcfcThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostTradeInstrumentSizeSpecificThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The post-trade Size Specific to an Instrument threshold."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>> mmPostTradeInstrumentSizeSpecificThreshold = new MMMessageAssociationEnd<TransparencyDataReport14, Optional<TonsOrCurrency2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "PstTradInstrmSzSpcfcThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostTradeInstrumentSizeSpecificThreshold";
			definition = "The post-trade Size Specific to an Instrument threshold.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TonsOrCurrency2Choice.mmObject();
		}

		@Override
		public Optional<TonsOrCurrency2Choice> getValue(TransparencyDataReport14 obj) {
			return obj.getPostTradeInstrumentSizeSpecificThreshold();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<TonsOrCurrency2Choice> value) {
			obj.setPostTradeInstrumentSizeSpecificThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "Sttstcs")
	protected StatisticsTransparency2 statistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency2
	 * StatisticsTransparency2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
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
	public static final MMMessageAssociationEnd<TransparencyDataReport14, Optional<StatisticsTransparency2>> mmStatistics = new MMMessageAssociationEnd<TransparencyDataReport14, Optional<StatisticsTransparency2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "Sttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statistics";
			definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatisticsTransparency2.mmObject();
		}

		@Override
		public Optional<StatisticsTransparency2> getValue(TransparencyDataReport14 obj) {
			return obj.getStatistics();
		}

		@Override
		public void setValue(TransparencyDataReport14 obj, Optional<StatisticsTransparency2> value) {
			obj.setStatistics(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransparencyDataReport14.mmTechnicalRecordIdentification, com.tools20022.repository.msg.TransparencyDataReport14.mmIdentification,
						com.tools20022.repository.msg.TransparencyDataReport14.mmFullName, com.tools20022.repository.msg.TransparencyDataReport14.mmTradingVenue, com.tools20022.repository.msg.TransparencyDataReport14.mmReportingPeriod,
						com.tools20022.repository.msg.TransparencyDataReport14.mmLiquidity, com.tools20022.repository.msg.TransparencyDataReport14.mmPreTradeLargeInScaleThreshold,
						com.tools20022.repository.msg.TransparencyDataReport14.mmPostTradeLargeInScaleThreshold, com.tools20022.repository.msg.TransparencyDataReport14.mmPreTradeInstrumentSizeSpecificThreshold,
						com.tools20022.repository.msg.TransparencyDataReport14.mmPostTradeInstrumentSizeSpecificThreshold, com.tools20022.repository.msg.TransparencyDataReport14.mmStatistics);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmNonEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forTransparencyDataReport14, com.tools20022.repository.constraints.ConstraintValidMICRule.forTransparencyDataReport14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport14";
				definition = "Provides for reporting calculation results of non equity instruments as part of transparency.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public TransparencyDataReport14 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public TransparencyDataReport14 setIdentification(ISINOct2015Identifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getFullName() {
		return fullName == null ? Optional.empty() : Optional.of(fullName);
	}

	public TransparencyDataReport14 setFullName(Max350Text fullName) {
		this.fullName = fullName;
		return this;
	}

	public Optional<MICIdentifier> getTradingVenue() {
		return tradingVenue == null ? Optional.empty() : Optional.of(tradingVenue);
	}

	public TransparencyDataReport14 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
		return this;
	}

	public Optional<Period4Choice> getReportingPeriod() {
		return reportingPeriod == null ? Optional.empty() : Optional.of(reportingPeriod);
	}

	public TransparencyDataReport14 setReportingPeriod(Period4Choice reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
		return this;
	}

	public Optional<TrueFalseIndicator> getLiquidity() {
		return liquidity == null ? Optional.empty() : Optional.of(liquidity);
	}

	public TransparencyDataReport14 setLiquidity(TrueFalseIndicator liquidity) {
		this.liquidity = liquidity;
		return this;
	}

	public Optional<TonsOrCurrency2Choice> getPreTradeLargeInScaleThreshold() {
		return preTradeLargeInScaleThreshold == null ? Optional.empty() : Optional.of(preTradeLargeInScaleThreshold);
	}

	public TransparencyDataReport14 setPreTradeLargeInScaleThreshold(TonsOrCurrency2Choice preTradeLargeInScaleThreshold) {
		this.preTradeLargeInScaleThreshold = preTradeLargeInScaleThreshold;
		return this;
	}

	public Optional<TonsOrCurrency2Choice> getPostTradeLargeInScaleThreshold() {
		return postTradeLargeInScaleThreshold == null ? Optional.empty() : Optional.of(postTradeLargeInScaleThreshold);
	}

	public TransparencyDataReport14 setPostTradeLargeInScaleThreshold(TonsOrCurrency2Choice postTradeLargeInScaleThreshold) {
		this.postTradeLargeInScaleThreshold = postTradeLargeInScaleThreshold;
		return this;
	}

	public Optional<TonsOrCurrency2Choice> getPreTradeInstrumentSizeSpecificThreshold() {
		return preTradeInstrumentSizeSpecificThreshold == null ? Optional.empty() : Optional.of(preTradeInstrumentSizeSpecificThreshold);
	}

	public TransparencyDataReport14 setPreTradeInstrumentSizeSpecificThreshold(TonsOrCurrency2Choice preTradeInstrumentSizeSpecificThreshold) {
		this.preTradeInstrumentSizeSpecificThreshold = preTradeInstrumentSizeSpecificThreshold;
		return this;
	}

	public Optional<TonsOrCurrency2Choice> getPostTradeInstrumentSizeSpecificThreshold() {
		return postTradeInstrumentSizeSpecificThreshold == null ? Optional.empty() : Optional.of(postTradeInstrumentSizeSpecificThreshold);
	}

	public TransparencyDataReport14 setPostTradeInstrumentSizeSpecificThreshold(TonsOrCurrency2Choice postTradeInstrumentSizeSpecificThreshold) {
		this.postTradeInstrumentSizeSpecificThreshold = postTradeInstrumentSizeSpecificThreshold;
		return this;
	}

	public Optional<StatisticsTransparency2> getStatistics() {
		return statistics == null ? Optional.empty() : Optional.of(statistics);
	}

	public TransparencyDataReport14 setStatistics(StatisticsTransparency2 statistics) {
		this.statistics = statistics;
		return this;
	}
}