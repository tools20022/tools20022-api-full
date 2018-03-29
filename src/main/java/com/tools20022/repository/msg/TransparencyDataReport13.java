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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NumberAndVolume2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for reporting quantitative details of equity instruments as part of
 * transparency calculations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTechnicalRecordIdentification
 * TransparencyDataReport13.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmIdentification
 * TransparencyDataReport13.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmReportingDate
 * TransparencyDataReport13.mmReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTradingVenue
 * TransparencyDataReport13.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmSuspension
 * TransparencyDataReport13.mmSuspension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTransactionsExecuted
 * TransparencyDataReport13.mmTransactionsExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTransactionsExecutedExcludingPreTradeWaiver
 * TransparencyDataReport13.mmTransactionsExecutedExcludingPreTradeWaiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmTransactionsExecutedExcludingPostTradeLargeInScaleWaiver
 * TransparencyDataReport13.
 * mmTransactionsExecutedExcludingPostTradeLargeInScaleWaiver}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTradingActivityReportV01#mmEquityTransparencyData
 * FinancialInstrumentReportingEquityTradingActivityReportV01.
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forTransparencyDataReport13
 * ConstraintValidISINRule.forTransparencyDataReport13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidMICRule#forTransparencyDataReport13
 * ConstraintValidMICRule.forTransparencyDataReport13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransparencyDataReport13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for reporting quantitative details of equity instruments as part of transparency calculations."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransparencyDataReport13", propOrder = {"technicalRecordIdentification", "identification", "reportingDate", "tradingVenue", "suspension", "transactionsExecuted", "transactionsExecutedExcludingPreTradeWaiver",
		"transactionsExecutedExcludingPostTradeLargeInScaleWaiver"})
public class TransparencyDataReport13 {

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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport13, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<TransparencyDataReport13, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
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
		public Optional<Max35Text> getValue(TransparencyDataReport13 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport13, ISINOct2015Identifier> mmIdentification = new MMMessageAttribute<TransparencyDataReport13, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
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
		public ISINOct2015Identifier getValue(TransparencyDataReport13 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, ISINOct2015Identifier value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "RptgDt")
	protected ISODate reportingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date to which the quantitative data fields below relate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport13, Optional<ISODate>> mmReportingDate = new MMMessageAttribute<TransparencyDataReport13, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
			isDerived = false;
			xmlTag = "RptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDate";
			definition = "Date to which the quantitative data fields below relate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransparencyDataReport13 obj) {
			return obj.getReportingDate();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, Optional<ISODate> value) {
			obj.setReportingDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport13, Optional<MICIdentifier>> mmTradingVenue = new MMMessageAttribute<TransparencyDataReport13, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
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
		public Optional<MICIdentifier> getValue(TransparencyDataReport13 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, Optional<MICIdentifier> value) {
			obj.setTradingVenue(value.orElse(null));
		}
	};
	@XmlElement(name = "Sspnsn", required = true)
	protected TrueFalseIndicator suspension;
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sspnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instrument was suspended for trading on that Trading Venue for the whole day on the given reporting day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport13, TrueFalseIndicator> mmSuspension = new MMMessageAttribute<TransparencyDataReport13, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
			isDerived = false;
			xmlTag = "Sspnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspension";
			definition = "Indicates whether the instrument was suspended for trading on that Trading Venue for the whole day on the given reporting day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(TransparencyDataReport13 obj) {
			return obj.getSuspension();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, TrueFalseIndicator value) {
			obj.setSuspension(value);
		}
	};
	@XmlElement(name = "TxsExctd", required = true)
	protected NumberAndVolume2 transactionsExecuted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NumberAndVolume2
	 * NumberAndVolume2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsExctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions executed on the reporting day.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport13, NumberAndVolume2> mmTransactionsExecuted = new MMMessageAssociationEnd<TransparencyDataReport13, NumberAndVolume2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
			isDerived = false;
			xmlTag = "TxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsExecuted";
			definition = "Total number of transactions executed on the reporting day.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NumberAndVolume2.mmObject();
		}

		@Override
		public NumberAndVolume2 getValue(TransparencyDataReport13 obj) {
			return obj.getTransactionsExecuted();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, NumberAndVolume2 value) {
			obj.setTransactionsExecuted(value);
		}
	};
	@XmlElement(name = "TxsExctdExclgPreTradWvr", required = true)
	protected NumberAndVolume2 transactionsExecutedExcludingPreTradeWaiver;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NumberAndVolume2
	 * NumberAndVolume2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsExctdExclgPreTradWvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsExecutedExcludingPreTradeWaiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details all transactions that have been performed under a pre-trade Waiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport13, NumberAndVolume2> mmTransactionsExecutedExcludingPreTradeWaiver = new MMMessageAssociationEnd<TransparencyDataReport13, NumberAndVolume2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
			isDerived = false;
			xmlTag = "TxsExctdExclgPreTradWvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsExecutedExcludingPreTradeWaiver";
			definition = "Details all transactions that have been performed under a pre-trade Waiver.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NumberAndVolume2.mmObject();
		}

		@Override
		public NumberAndVolume2 getValue(TransparencyDataReport13 obj) {
			return obj.getTransactionsExecutedExcludingPreTradeWaiver();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, NumberAndVolume2 value) {
			obj.setTransactionsExecutedExcludingPreTradeWaiver(value);
		}
	};
	@XmlElement(name = "TxsExctdExclgPstTradLrgInScaleWvr", required = true)
	protected NumberAndVolume2 transactionsExecutedExcludingPostTradeLargeInScaleWaiver;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NumberAndVolume2
	 * NumberAndVolume2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsExctdExclgPstTradLrgInScaleWvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsExecutedExcludingPostTradeLargeInScaleWaiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details all transactions that have been performed under a post-trade large in scale waivers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport13, NumberAndVolume2> mmTransactionsExecutedExcludingPostTradeLargeInScaleWaiver = new MMMessageAssociationEnd<TransparencyDataReport13, NumberAndVolume2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport13.mmObject();
			isDerived = false;
			xmlTag = "TxsExctdExclgPstTradLrgInScaleWvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsExecutedExcludingPostTradeLargeInScaleWaiver";
			definition = "Details all transactions that have been performed under a post-trade large in scale waivers.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NumberAndVolume2.mmObject();
		}

		@Override
		public NumberAndVolume2 getValue(TransparencyDataReport13 obj) {
			return obj.getTransactionsExecutedExcludingPostTradeLargeInScaleWaiver();
		}

		@Override
		public void setValue(TransparencyDataReport13 obj, NumberAndVolume2 value) {
			obj.setTransactionsExecutedExcludingPostTradeLargeInScaleWaiver(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransparencyDataReport13.mmTechnicalRecordIdentification, com.tools20022.repository.msg.TransparencyDataReport13.mmIdentification,
						com.tools20022.repository.msg.TransparencyDataReport13.mmReportingDate, com.tools20022.repository.msg.TransparencyDataReport13.mmTradingVenue, com.tools20022.repository.msg.TransparencyDataReport13.mmSuspension,
						com.tools20022.repository.msg.TransparencyDataReport13.mmTransactionsExecuted, com.tools20022.repository.msg.TransparencyDataReport13.mmTransactionsExecutedExcludingPreTradeWaiver,
						com.tools20022.repository.msg.TransparencyDataReport13.mmTransactionsExecutedExcludingPostTradeLargeInScaleWaiver);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingEquityTradingActivityReportV01.mmEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forTransparencyDataReport13, com.tools20022.repository.constraints.ConstraintValidMICRule.forTransparencyDataReport13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport13";
				definition = "Provides for reporting quantitative details of equity instruments as part of transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public TransparencyDataReport13 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public TransparencyDataReport13 setIdentification(ISINOct2015Identifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<ISODate> getReportingDate() {
		return reportingDate == null ? Optional.empty() : Optional.of(reportingDate);
	}

	public TransparencyDataReport13 setReportingDate(ISODate reportingDate) {
		this.reportingDate = reportingDate;
		return this;
	}

	public Optional<MICIdentifier> getTradingVenue() {
		return tradingVenue == null ? Optional.empty() : Optional.of(tradingVenue);
	}

	public TransparencyDataReport13 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
		return this;
	}

	public TrueFalseIndicator getSuspension() {
		return suspension;
	}

	public TransparencyDataReport13 setSuspension(TrueFalseIndicator suspension) {
		this.suspension = Objects.requireNonNull(suspension);
		return this;
	}

	public NumberAndVolume2 getTransactionsExecuted() {
		return transactionsExecuted;
	}

	public TransparencyDataReport13 setTransactionsExecuted(NumberAndVolume2 transactionsExecuted) {
		this.transactionsExecuted = Objects.requireNonNull(transactionsExecuted);
		return this;
	}

	public NumberAndVolume2 getTransactionsExecutedExcludingPreTradeWaiver() {
		return transactionsExecutedExcludingPreTradeWaiver;
	}

	public TransparencyDataReport13 setTransactionsExecutedExcludingPreTradeWaiver(NumberAndVolume2 transactionsExecutedExcludingPreTradeWaiver) {
		this.transactionsExecutedExcludingPreTradeWaiver = Objects.requireNonNull(transactionsExecutedExcludingPreTradeWaiver);
		return this;
	}

	public NumberAndVolume2 getTransactionsExecutedExcludingPostTradeLargeInScaleWaiver() {
		return transactionsExecutedExcludingPostTradeLargeInScaleWaiver;
	}

	public TransparencyDataReport13 setTransactionsExecutedExcludingPostTradeLargeInScaleWaiver(NumberAndVolume2 transactionsExecutedExcludingPostTradeLargeInScaleWaiver) {
		this.transactionsExecutedExcludingPostTradeLargeInScaleWaiver = Objects.requireNonNull(transactionsExecutedExcludingPostTradeLargeInScaleWaiver);
		return this;
	}
}