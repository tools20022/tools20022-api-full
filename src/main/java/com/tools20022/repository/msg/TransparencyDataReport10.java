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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01;
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.codeset.EmissionAllowanceProductType2Code;
import com.tools20022.repository.codeset.FinancialInstrumentContractType1Code;
import com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code;
import com.tools20022.repository.codeset.ProductType5Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DebtInstrument5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for reporting details of non-equity instruments as part of
 * transparency calculations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmTechnicalRecordIdentification
 * TransparencyDataReport10.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmIdentification
 * TransparencyDataReport10.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmFullName
 * TransparencyDataReport10.mmFullName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmTradingVenue
 * TransparencyDataReport10.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmReportingDate
 * TransparencyDataReport10.mmReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmMaturityDate
 * TransparencyDataReport10.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmFinancialInstrumentClassification
 * TransparencyDataReport10.mmFinancialInstrumentClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmUnderlyingInstrumentAssetClass
 * TransparencyDataReport10.mmUnderlyingInstrumentAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmDerivativeContractType
 * TransparencyDataReport10.mmDerivativeContractType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmBond
 * TransparencyDataReport10.mmBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmEmissionAllowanceType
 * TransparencyDataReport10.mmEmissionAllowanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmDerivative
 * TransparencyDataReport10.mmDerivative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01#mmNonEquityTransparencyData
 * FinancialInstrumentReportingNonEquityTransparencyDataReportV01.
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forTransparencyDataReport10
 * ConstraintValidISINRule.forTransparencyDataReport10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidMICRule#forTransparencyDataReport10
 * ConstraintValidMICRule.forTransparencyDataReport10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransparencyDataReport10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for reporting details of non-equity instruments as part of transparency calculations."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransparencyDataReport10", propOrder = {"technicalRecordIdentification", "identification", "fullName", "tradingVenue", "reportingDate", "maturityDate", "financialInstrumentClassification", "underlyingInstrumentAssetClass",
		"derivativeContractType", "bond", "emissionAllowanceType", "derivative"})
public class TransparencyDataReport10 {

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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<TransparencyDataReport10, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
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
		public Optional<Max35Text> getValue(TransparencyDataReport10 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport10, ISINOct2015Identifier> mmIdentification = new MMMessageAttribute<TransparencyDataReport10, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
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
		public ISINOct2015Identifier getValue(TransparencyDataReport10 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, ISINOct2015Identifier value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<Max350Text>> mmFullName = new MMMessageAttribute<TransparencyDataReport10, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
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
		public Optional<Max350Text> getValue(TransparencyDataReport10 obj) {
			return obj.getFullName();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<Max350Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
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
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<MICIdentifier>> mmTradingVenue = new MMMessageAttribute<TransparencyDataReport10, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
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
		public Optional<MICIdentifier> getValue(TransparencyDataReport10 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<MICIdentifier> value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
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
	 * definition} = "Date this information is reported in relation to."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<ISODate>> mmReportingDate = new MMMessageAttribute<TransparencyDataReport10, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "RptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDate";
			definition = "Date this information is reported in relation to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransparencyDataReport10 obj) {
			return obj.getReportingDate();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<ISODate> value) {
			obj.setReportingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maturity date of the financial instrument. Field applicable for the asset classes of bonds, interest rate derivatives, equity derivatives, commodity derivatives, foreign exchange derivatives, credit derivatives, C10 derivatives and derivatives on emission allowances."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<TransparencyDataReport10, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Maturity date of the financial instrument. Field applicable for the asset classes of bonds, interest rate derivatives, equity derivatives, commodity derivatives, foreign exchange derivatives, credit derivatives, C10 derivatives and derivatives on emission allowances.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransparencyDataReport10 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmClssfctn", required = true)
	protected NonEquityInstrumentReportingClassification1Code financialInstrumentClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
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
	 * definition} = "Identification of non-equity financial instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport10, NonEquityInstrumentReportingClassification1Code> mmFinancialInstrumentClassification = new MMMessageAttribute<TransparencyDataReport10, NonEquityInstrumentReportingClassification1Code>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmClssfctn";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "MiFIR"}, new String[]{"value", "MiFIRInstrumentClassification"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentClassification";
			definition = "Identification of non-equity financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}

		@Override
		public NonEquityInstrumentReportingClassification1Code getValue(TransparencyDataReport10 obj) {
			return obj.getFinancialInstrumentClassification();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, NonEquityInstrumentReportingClassification1Code value) {
			obj.setFinancialInstrumentClassification(value);
		}
	};
	@XmlElement(name = "UndrlygInstrmAsstClss")
	protected ProductType5Code underlyingInstrumentAssetClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType5Code
	 * ProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygInstrmAsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingInstrumentAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details on the type of asset class a non-equity financial instrument can be classified as."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<ProductType5Code>> mmUnderlyingInstrumentAssetClass = new MMMessageAttribute<TransparencyDataReport10, Optional<ProductType5Code>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "UndrlygInstrmAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingInstrumentAssetClass";
			definition = "Details on the type of asset class a non-equity financial instrument can be classified as.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ProductType5Code.mmObject();
		}

		@Override
		public Optional<ProductType5Code> getValue(TransparencyDataReport10 obj) {
			return obj.getUnderlyingInstrumentAssetClass();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<ProductType5Code> value) {
			obj.setUnderlyingInstrumentAssetClass(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivCtrctTp")
	protected FinancialInstrumentContractType1Code derivativeContractType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentContractType1Code
	 * FinancialInstrumentContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivCtrctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeContractType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details on the contract type a derivative non-equity financial instrument can be classified as."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<FinancialInstrumentContractType1Code>> mmDerivativeContractType = new MMMessageAttribute<TransparencyDataReport10, Optional<FinancialInstrumentContractType1Code>>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "DerivCtrctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeContractType";
			definition = "Details on the contract type a derivative non-equity financial instrument can be classified as.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialInstrumentContractType1Code.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentContractType1Code> getValue(TransparencyDataReport10 obj) {
			return obj.getDerivativeContractType();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<FinancialInstrumentContractType1Code> value) {
			obj.setDerivativeContractType(value.orElse(null));
		}
	};
	@XmlElement(name = "Bd")
	protected DebtInstrument5 bond;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DebtInstrument5
	 * DebtInstrument5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific to a bond / debt instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport10, Optional<DebtInstrument5>> mmBond = new MMMessageAssociationEnd<TransparencyDataReport10, Optional<DebtInstrument5>>() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "Bd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Details specific to a bond / debt instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DebtInstrument5.mmObject();
		}

		@Override
		public Optional<DebtInstrument5> getValue(TransparencyDataReport10 obj) {
			return obj.getBond();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<DebtInstrument5> value) {
			obj.setBond(value.orElse(null));
		}
	};
	@XmlElement(name = "EmssnAllwncTp")
	protected EmissionAllowanceProductType2Code emissionAllowanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType2Code
	 * EmissionAllowanceProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmssnAllwncTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details the reporting of the emission allowance sub type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransparencyDataReport10, Optional<EmissionAllowanceProductType2Code>> mmEmissionAllowanceType = new MMMessageAttribute<TransparencyDataReport10, Optional<EmissionAllowanceProductType2Code>>() {
		{
			businessComponentTrace_lazy = () -> Commodity.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "EmssnAllwncTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowanceType";
			definition = "Details the reporting of the emission allowance sub type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EmissionAllowanceProductType2Code.mmObject();
		}

		@Override
		public Optional<EmissionAllowanceProductType2Code> getValue(TransparencyDataReport10 obj) {
			return obj.getEmissionAllowanceType();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<EmissionAllowanceProductType2Code> value) {
			obj.setEmissionAllowanceType(value.orElse(null));
		}
	};
	@XmlElement(name = "Deriv")
	protected Derivative2Choice derivative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Deriv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative specific details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransparencyDataReport10, Optional<Derivative2Choice>> mmDerivative = new MMMessageAssociationEnd<TransparencyDataReport10, Optional<Derivative2Choice>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "Deriv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivative";
			definition = "Derivative specific details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Derivative2Choice.mmObject();
		}

		@Override
		public Optional<Derivative2Choice> getValue(TransparencyDataReport10 obj) {
			return obj.getDerivative();
		}

		@Override
		public void setValue(TransparencyDataReport10 obj, Optional<Derivative2Choice> value) {
			obj.setDerivative(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransparencyDataReport10.mmTechnicalRecordIdentification, com.tools20022.repository.msg.TransparencyDataReport10.mmIdentification,
						com.tools20022.repository.msg.TransparencyDataReport10.mmFullName, com.tools20022.repository.msg.TransparencyDataReport10.mmTradingVenue, com.tools20022.repository.msg.TransparencyDataReport10.mmReportingDate,
						com.tools20022.repository.msg.TransparencyDataReport10.mmMaturityDate, com.tools20022.repository.msg.TransparencyDataReport10.mmFinancialInstrumentClassification,
						com.tools20022.repository.msg.TransparencyDataReport10.mmUnderlyingInstrumentAssetClass, com.tools20022.repository.msg.TransparencyDataReport10.mmDerivativeContractType,
						com.tools20022.repository.msg.TransparencyDataReport10.mmBond, com.tools20022.repository.msg.TransparencyDataReport10.mmEmissionAllowanceType, com.tools20022.repository.msg.TransparencyDataReport10.mmDerivative);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmNonEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forTransparencyDataReport10, com.tools20022.repository.constraints.ConstraintValidMICRule.forTransparencyDataReport10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport10";
				definition = "Provides for reporting details of non-equity instruments as part of transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public TransparencyDataReport10 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public TransparencyDataReport10 setIdentification(ISINOct2015Identifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getFullName() {
		return fullName == null ? Optional.empty() : Optional.of(fullName);
	}

	public TransparencyDataReport10 setFullName(Max350Text fullName) {
		this.fullName = fullName;
		return this;
	}

	public Optional<MICIdentifier> getTradingVenue() {
		return tradingVenue == null ? Optional.empty() : Optional.of(tradingVenue);
	}

	public TransparencyDataReport10 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
		return this;
	}

	public Optional<ISODate> getReportingDate() {
		return reportingDate == null ? Optional.empty() : Optional.of(reportingDate);
	}

	public TransparencyDataReport10 setReportingDate(ISODate reportingDate) {
		this.reportingDate = reportingDate;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public TransparencyDataReport10 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public NonEquityInstrumentReportingClassification1Code getFinancialInstrumentClassification() {
		return financialInstrumentClassification;
	}

	public TransparencyDataReport10 setFinancialInstrumentClassification(NonEquityInstrumentReportingClassification1Code financialInstrumentClassification) {
		this.financialInstrumentClassification = Objects.requireNonNull(financialInstrumentClassification);
		return this;
	}

	public Optional<ProductType5Code> getUnderlyingInstrumentAssetClass() {
		return underlyingInstrumentAssetClass == null ? Optional.empty() : Optional.of(underlyingInstrumentAssetClass);
	}

	public TransparencyDataReport10 setUnderlyingInstrumentAssetClass(ProductType5Code underlyingInstrumentAssetClass) {
		this.underlyingInstrumentAssetClass = underlyingInstrumentAssetClass;
		return this;
	}

	public Optional<FinancialInstrumentContractType1Code> getDerivativeContractType() {
		return derivativeContractType == null ? Optional.empty() : Optional.of(derivativeContractType);
	}

	public TransparencyDataReport10 setDerivativeContractType(FinancialInstrumentContractType1Code derivativeContractType) {
		this.derivativeContractType = derivativeContractType;
		return this;
	}

	public Optional<DebtInstrument5> getBond() {
		return bond == null ? Optional.empty() : Optional.of(bond);
	}

	public TransparencyDataReport10 setBond(DebtInstrument5 bond) {
		this.bond = bond;
		return this;
	}

	public Optional<EmissionAllowanceProductType2Code> getEmissionAllowanceType() {
		return emissionAllowanceType == null ? Optional.empty() : Optional.of(emissionAllowanceType);
	}

	public TransparencyDataReport10 setEmissionAllowanceType(EmissionAllowanceProductType2Code emissionAllowanceType) {
		this.emissionAllowanceType = emissionAllowanceType;
		return this;
	}

	public Optional<Derivative2Choice> getDerivative() {
		return derivative == null ? Optional.empty() : Optional.of(derivative);
	}

	public TransparencyDataReport10 setDerivative(Derivative2Choice derivative) {
		this.derivative = derivative;
		return this;
	}
}