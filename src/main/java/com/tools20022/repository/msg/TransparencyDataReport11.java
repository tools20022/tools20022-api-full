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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01;
import com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for reporting qualitative details of equity instruments as part of
 * Transparency calculations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmTechnicalRecordIdentification
 * TransparencyDataReport11.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmIdentification
 * TransparencyDataReport11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmFullName
 * TransparencyDataReport11.mmFullName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmTradingVenue
 * TransparencyDataReport11.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmReportingDate
 * TransparencyDataReport11.mmReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmFinancialInstrumentClassification
 * TransparencyDataReport11.mmFinancialInstrumentClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmNumberOutstandingInstruments
 * TransparencyDataReport11.mmNumberOutstandingInstruments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmHoldingsExceedingTotalVotingRightThreshold
 * TransparencyDataReport11.mmHoldingsExceedingTotalVotingRightThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmIssuanceSize
 * TransparencyDataReport11.mmIssuanceSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmInstrumentPrice
 * TransparencyDataReport11.mmInstrumentPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingEquityTransparencyDataReportV01#mmEquityTransparencyData
 * FinancialInstrumentReportingEquityTransparencyDataReportV01.
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forTransparencyDataReport11
 * ConstraintValidISINRule.forTransparencyDataReport11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidMICRule#forTransparencyDataReport11
 * ConstraintValidMICRule.forTransparencyDataReport11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransparencyDataReport11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for reporting qualitative details of equity instruments as part of Transparency calculations."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransparencyDataReport11", propOrder = {"technicalRecordIdentification", "identification", "fullName", "tradingVenue", "reportingDate", "financialInstrumentClassification", "numberOutstandingInstruments",
		"holdingsExceedingTotalVotingRightThreshold", "issuanceSize", "instrumentPrice"})
public class TransparencyDataReport11 {

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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<TransparencyDataReport11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
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
		public Optional<Max35Text> getValue(TransparencyDataReport11 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport11, ISINOct2015Identifier> mmIdentification = new MMMessageAttribute<TransparencyDataReport11, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
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
		public ISINOct2015Identifier getValue(TransparencyDataReport11 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, ISINOct2015Identifier value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
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
	 * definition} = "Full name or description of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<Max350Text>> mmFullName = new MMMessageAttribute<TransparencyDataReport11, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "FullNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullName";
			definition = "Full name or description of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TransparencyDataReport11 obj) {
			return obj.getFullName();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<Max350Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<MICIdentifier>> mmTradingVenue = new MMMessageAttribute<TransparencyDataReport11, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
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
		public Optional<MICIdentifier> getValue(TransparencyDataReport11 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<MICIdentifier> value) {
			obj.setTradingVenue(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
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
	 * definition} = "Date for which the data is provided."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<ISODate>> mmReportingDate = new MMMessageAttribute<TransparencyDataReport11, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "RptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDate";
			definition = "Date for which the data is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransparencyDataReport11 obj) {
			return obj.getReportingDate();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<ISODate> value) {
			obj.setReportingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmClssfctn", required = true)
	protected EquityInstrumentReportingClassification1Code financialInstrumentClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
	 * EquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=MiFIR,
	 * value=MiFIRInstrumentClassification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the classification of the equity instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, EquityInstrumentReportingClassification1Code> mmFinancialInstrumentClassification = new MMMessageAttribute<TransparencyDataReport11, EquityInstrumentReportingClassification1Code>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmClssfctn";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "MiFIR"}, new String[]{"value", "MiFIRInstrumentClassification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentClassification";
			definition = "Specifies the classification of the equity instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EquityInstrumentReportingClassification1Code.mmObject();
		}

		@Override
		public EquityInstrumentReportingClassification1Code getValue(TransparencyDataReport11 obj) {
			return obj.getFinancialInstrumentClassification();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, EquityInstrumentReportingClassification1Code value) {
			obj.setFinancialInstrumentClassification(value);
		}
	};
	@XmlElement(name = "NbOutsdngInstrms")
	protected DecimalNumberFraction5 numberOutstandingInstruments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumberFraction5
	 * DecimalNumberFraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOutsdngInstrms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOutstandingInstruments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For shares and depositary receipts, the total number of outstanding instruments. \r\nFor ETFs, the number of units issued for trading."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<DecimalNumberFraction5>> mmNumberOutstandingInstruments = new MMMessageAttribute<TransparencyDataReport11, Optional<DecimalNumberFraction5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "NbOutsdngInstrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOutstandingInstruments";
			definition = "For shares and depositary receipts, the total number of outstanding instruments. \r\nFor ETFs, the number of units issued for trading.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumberFraction5.mmObject();
		}

		@Override
		public Optional<DecimalNumberFraction5> getValue(TransparencyDataReport11 obj) {
			return obj.getNumberOutstandingInstruments();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<DecimalNumberFraction5> value) {
			obj.setNumberOutstandingInstruments(value.orElse(null));
		}
	};
	@XmlElement(name = "HldgsExcdgTtlVtngRghtThrshld")
	protected DecimalNumberFraction5 holdingsExceedingTotalVotingRightThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumberFraction5
	 * DecimalNumberFraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueSize
	 * Issuance.mmIssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsExcdgTtlVtngRghtThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsExceedingTotalVotingRightThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The total number of shares corresponding to holdings exceeding 5% of total voting rights of the issuer unless such a holding is held by a collective investment undertaking or a pension fund. This field is to be populated only when actual information is known."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<DecimalNumberFraction5>> mmHoldingsExceedingTotalVotingRightThreshold = new MMMessageAttribute<TransparencyDataReport11, Optional<DecimalNumberFraction5>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "HldgsExcdgTtlVtngRghtThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsExceedingTotalVotingRightThreshold";
			definition = "The total number of shares corresponding to holdings exceeding 5% of total voting rights of the issuer unless such a holding is held by a collective investment undertaking or a pension fund. This field is to be populated only when actual information is known.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumberFraction5.mmObject();
		}

		@Override
		public Optional<DecimalNumberFraction5> getValue(TransparencyDataReport11 obj) {
			return obj.getHoldingsExceedingTotalVotingRightThreshold();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<DecimalNumberFraction5> value) {
			obj.setHoldingsExceedingTotalVotingRightThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "IssncSz")
	protected ActiveCurrencyAndAmount issuanceSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance size of the certificate expressed in Euros."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<ActiveCurrencyAndAmount>> mmIssuanceSize = new MMMessageAttribute<TransparencyDataReport11, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "IssncSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceSize";
			definition = "Issuance size of the certificate expressed in Euros.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TransparencyDataReport11 obj) {
			return obj.getIssuanceSize();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setIssuanceSize(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrmPric")
	protected ActiveCurrencyAnd13DecimalAmount instrumentPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Before the first admission to trading of the instrument, the price of the instrument as it will stand at the start of the first day of trading.\r\n\r\nAfter the first admission to trading of the instrument, the price of the instrument at the last trading day of the previous year, or at the end of the day on which a corporate action is effective. The price should be expressed in Euros. To be reported for shares and depositary receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport11, Optional<ActiveCurrencyAnd13DecimalAmount>> mmInstrumentPrice = new MMMessageAttribute<TransparencyDataReport11, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport11.mmObject();
			isDerived = false;
			xmlTag = "InstrmPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentPrice";
			definition = "Before the first admission to trading of the instrument, the price of the instrument as it will stand at the start of the first day of trading.\r\n\r\nAfter the first admission to trading of the instrument, the price of the instrument at the last trading day of the previous year, or at the end of the day on which a corporate action is effective. The price should be expressed in Euros. To be reported for shares and depositary receipts.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(TransparencyDataReport11 obj) {
			return obj.getInstrumentPrice();
		}

		@Override
		public void setValue(TransparencyDataReport11 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setInstrumentPrice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransparencyDataReport11.mmTechnicalRecordIdentification, com.tools20022.repository.msg.TransparencyDataReport11.mmIdentification,
						com.tools20022.repository.msg.TransparencyDataReport11.mmFullName, com.tools20022.repository.msg.TransparencyDataReport11.mmTradingVenue, com.tools20022.repository.msg.TransparencyDataReport11.mmReportingDate,
						com.tools20022.repository.msg.TransparencyDataReport11.mmFinancialInstrumentClassification, com.tools20022.repository.msg.TransparencyDataReport11.mmNumberOutstandingInstruments,
						com.tools20022.repository.msg.TransparencyDataReport11.mmHoldingsExceedingTotalVotingRightThreshold, com.tools20022.repository.msg.TransparencyDataReport11.mmIssuanceSize,
						com.tools20022.repository.msg.TransparencyDataReport11.mmInstrumentPrice);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingEquityTransparencyDataReportV01.mmEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forTransparencyDataReport11, com.tools20022.repository.constraints.ConstraintValidMICRule.forTransparencyDataReport11);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport11";
				definition = "Provides for reporting qualitative details of equity instruments as part of Transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public TransparencyDataReport11 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public TransparencyDataReport11 setIdentification(ISINOct2015Identifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getFullName() {
		return fullName == null ? Optional.empty() : Optional.of(fullName);
	}

	public TransparencyDataReport11 setFullName(Max350Text fullName) {
		this.fullName = fullName;
		return this;
	}

	public Optional<MICIdentifier> getTradingVenue() {
		return tradingVenue == null ? Optional.empty() : Optional.of(tradingVenue);
	}

	public TransparencyDataReport11 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
		return this;
	}

	public Optional<ISODate> getReportingDate() {
		return reportingDate == null ? Optional.empty() : Optional.of(reportingDate);
	}

	public TransparencyDataReport11 setReportingDate(ISODate reportingDate) {
		this.reportingDate = reportingDate;
		return this;
	}

	public EquityInstrumentReportingClassification1Code getFinancialInstrumentClassification() {
		return financialInstrumentClassification;
	}

	public TransparencyDataReport11 setFinancialInstrumentClassification(EquityInstrumentReportingClassification1Code financialInstrumentClassification) {
		this.financialInstrumentClassification = Objects.requireNonNull(financialInstrumentClassification);
		return this;
	}

	public Optional<DecimalNumberFraction5> getNumberOutstandingInstruments() {
		return numberOutstandingInstruments == null ? Optional.empty() : Optional.of(numberOutstandingInstruments);
	}

	public TransparencyDataReport11 setNumberOutstandingInstruments(DecimalNumberFraction5 numberOutstandingInstruments) {
		this.numberOutstandingInstruments = numberOutstandingInstruments;
		return this;
	}

	public Optional<DecimalNumberFraction5> getHoldingsExceedingTotalVotingRightThreshold() {
		return holdingsExceedingTotalVotingRightThreshold == null ? Optional.empty() : Optional.of(holdingsExceedingTotalVotingRightThreshold);
	}

	public TransparencyDataReport11 setHoldingsExceedingTotalVotingRightThreshold(DecimalNumberFraction5 holdingsExceedingTotalVotingRightThreshold) {
		this.holdingsExceedingTotalVotingRightThreshold = holdingsExceedingTotalVotingRightThreshold;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getIssuanceSize() {
		return issuanceSize == null ? Optional.empty() : Optional.of(issuanceSize);
	}

	public TransparencyDataReport11 setIssuanceSize(ActiveCurrencyAndAmount issuanceSize) {
		this.issuanceSize = issuanceSize;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getInstrumentPrice() {
		return instrumentPrice == null ? Optional.empty() : Optional.of(instrumentPrice);
	}

	public TransparencyDataReport11 setInstrumentPrice(ActiveCurrencyAnd13DecimalAmount instrumentPrice) {
		this.instrumentPrice = instrumentPrice;
		return this;
	}
}