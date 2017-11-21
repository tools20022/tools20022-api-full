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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransparencyDataReport14", propOrder = {"technicalRecordIdentification", "identification", "fullName", "tradingVenue", "reportingPeriod", "liquidity", "preTradeLargeInScaleThreshold", "postTradeLargeInScaleThreshold",
		"preTradeInstrumentSizeSpecificThreshold", "postTradeInstrumentSizeSpecificThreshold", "statistics"})
public class TransparencyDataReport14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text technicalRecordIdentification;
	/**
	 * Unique identifier of a record in a message used as part of error
	 * management and status advice messages.<br>
	 * <br>
	 * Usage:<br>
	 * This identification will be used in the status advice report sent back.
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
	public static final MMMessageAttribute mmTechnicalRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "TechRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalRecordIdentification";
			definition = "Unique identifier of a record in a message used as part of error management and status advice messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISINOct2015Identifier identification;
	/**
	 * Identifies the financial instrument using an ISIN.
	 * <p>
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
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the financial instrument using an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected Max350Text fullName;
	/**
	 * Full name of the reporting entity.
	 * <p>
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
	public static final MMMessageAttribute mmFullName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "FullNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullName";
			definition = "Full name of the reporting entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected MICIdentifier tradingVenue;
	/**
	 * Segment MIC for the trading venue where applicable, otherwise the
	 * operational MIC.
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
	public static final MMMessageAttribute mmTradingVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "TradgVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "Segment MIC for the trading venue where applicable, otherwise the operational MIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected Period4Choice reportingPeriod;
	/**
	 * Period to which the quantitative data fields relate.
	 * <p>
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
	public static final MMMessageAssociationEnd mmReportingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
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
	};
	protected TrueFalseIndicator liquidity;
	/**
	 * Flag to say if this ISIN is liquid or not post calculations.<br>
	 * <br>
	 * Usage:<br>
	 * When not present, this field should be treated as not applicable.
	 * <p>
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
	public static final MMMessageAttribute mmLiquidity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "Lqdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "Flag to say if this ISIN is liquid or not post calculations.\r\n\r\nUsage:\r\nWhen not present, this field should be treated as not applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TonsOrCurrency2Choice preTradeLargeInScaleThreshold;
	/**
	 * The pre-trade Large in Scale threshold.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPreTradeLargeInScaleThreshold = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
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
	};
	protected TonsOrCurrency2Choice postTradeLargeInScaleThreshold;
	/**
	 * The post-trade Large in Scale threshold.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPostTradeLargeInScaleThreshold = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
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
	};
	protected TonsOrCurrency2Choice preTradeInstrumentSizeSpecificThreshold;
	/**
	 * The pre-trade Size Specific to an Instrument threshold.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPreTradeInstrumentSizeSpecificThreshold = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
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
	};
	protected TonsOrCurrency2Choice postTradeInstrumentSizeSpecificThreshold;
	/**
	 * The post-trade Size Specific to an Instrument threshold.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPostTradeInstrumentSizeSpecificThreshold = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
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
	};
	protected StatisticsTransparency2 statistics;
	/**
	 * Statistics for a financial instrument generated as part of transparency
	 * calculations.
	 * <p>
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
	public static final MMMessageAssociationEnd mmStatistics = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransparencyDataReport14.mmObject();
			isDerived = false;
			xmlTag = "Sttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statistics";
			definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransparencyDataReport14.mmTechnicalRecordIdentification, TransparencyDataReport14.mmIdentification, TransparencyDataReport14.mmFullName, TransparencyDataReport14.mmTradingVenue,
						TransparencyDataReport14.mmReportingPeriod, TransparencyDataReport14.mmLiquidity, TransparencyDataReport14.mmPreTradeLargeInScaleThreshold, TransparencyDataReport14.mmPostTradeLargeInScaleThreshold,
						TransparencyDataReport14.mmPreTradeInstrumentSizeSpecificThreshold, TransparencyDataReport14.mmPostTradeInstrumentSizeSpecificThreshold, TransparencyDataReport14.mmStatistics);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmNonEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport14";
				definition = "Provides for reporting calculation results of non equity instruments as part of transparency.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TechRcrdId")
	public Max35Text getTechnicalRecordIdentification() {
		return technicalRecordIdentification;
	}

	public void setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
	}

	@XmlElement(name = "Id", required = true)
	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public void setIdentification(ISINOct2015Identifier identification) {
		this.identification = identification;
	}

	@XmlElement(name = "FullNm")
	public Max350Text getFullName() {
		return fullName;
	}

	public void setFullName(Max350Text fullName) {
		this.fullName = fullName;
	}

	@XmlElement(name = "TradgVn")
	public MICIdentifier getTradingVenue() {
		return tradingVenue;
	}

	public void setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
	}

	@XmlElement(name = "RptgPrd")
	public Period4Choice getReportingPeriod() {
		return reportingPeriod;
	}

	public void setReportingPeriod(Period4Choice reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
	}

	@XmlElement(name = "Lqdty")
	public TrueFalseIndicator getLiquidity() {
		return liquidity;
	}

	public void setLiquidity(TrueFalseIndicator liquidity) {
		this.liquidity = liquidity;
	}

	@XmlElement(name = "PreTradLrgInScaleThrshld")
	public TonsOrCurrency2Choice getPreTradeLargeInScaleThreshold() {
		return preTradeLargeInScaleThreshold;
	}

	public void setPreTradeLargeInScaleThreshold(TonsOrCurrency2Choice preTradeLargeInScaleThreshold) {
		this.preTradeLargeInScaleThreshold = preTradeLargeInScaleThreshold;
	}

	@XmlElement(name = "PstTradLrgInScaleThrshld")
	public TonsOrCurrency2Choice getPostTradeLargeInScaleThreshold() {
		return postTradeLargeInScaleThreshold;
	}

	public void setPostTradeLargeInScaleThreshold(TonsOrCurrency2Choice postTradeLargeInScaleThreshold) {
		this.postTradeLargeInScaleThreshold = postTradeLargeInScaleThreshold;
	}

	@XmlElement(name = "PreTradInstrmSzSpcfcThrshld")
	public TonsOrCurrency2Choice getPreTradeInstrumentSizeSpecificThreshold() {
		return preTradeInstrumentSizeSpecificThreshold;
	}

	public void setPreTradeInstrumentSizeSpecificThreshold(TonsOrCurrency2Choice preTradeInstrumentSizeSpecificThreshold) {
		this.preTradeInstrumentSizeSpecificThreshold = preTradeInstrumentSizeSpecificThreshold;
	}

	@XmlElement(name = "PstTradInstrmSzSpcfcThrshld")
	public TonsOrCurrency2Choice getPostTradeInstrumentSizeSpecificThreshold() {
		return postTradeInstrumentSizeSpecificThreshold;
	}

	public void setPostTradeInstrumentSizeSpecificThreshold(TonsOrCurrency2Choice postTradeInstrumentSizeSpecificThreshold) {
		this.postTradeInstrumentSizeSpecificThreshold = postTradeInstrumentSizeSpecificThreshold;
	}

	@XmlElement(name = "Sttstcs")
	public StatisticsTransparency2 getStatistics() {
		return statistics;
	}

	public void setStatistics(com.tools20022.repository.msg.StatisticsTransparency2 statistics) {
		this.statistics = statistics;
	}
}