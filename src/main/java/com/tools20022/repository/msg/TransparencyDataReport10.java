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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingNonEquityTransparencyDataReportV01;
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.codeset.EmissionAllowanceProductType2Code;
import com.tools20022.repository.codeset.FinancialInstrumentContractType1Code;
import com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code;
import com.tools20022.repository.codeset.ProductType5Code;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransparencyDataReport10", propOrder = {"technicalRecordIdentification", "identification", "fullName", "tradingVenue", "reportingDate", "maturityDate", "financialInstrumentClassification", "underlyingInstrumentAssetClass",
		"derivativeContractType", "bond", "emissionAllowanceType", "derivative"})
public class TransparencyDataReport10 {

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
	public static final MMMessageAttribute mmTechnicalRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
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
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
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
	 * Full name or description of the financial instrument.
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
	public static final MMMessageAttribute mmFullName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "FullNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullName";
			definition = "Full name or description of the financial instrument.";
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
	public static final MMMessageAttribute mmTradingVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
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
	protected ISODate reportingDate;
	/**
	 * Date this information is reported in relation to.
	 * <p>
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
	public static final MMMessageAttribute mmReportingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "RptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDate";
			definition = "Date this information is reported in relation to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Maturity date of the financial instrument. Field applicable for the asset
	 * classes of bonds, interest rate derivatives, equity derivatives,
	 * commodity derivatives, foreign exchange derivatives, credit derivatives,
	 * C10 derivatives and derivatives on emission allowances.
	 * <p>
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
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Maturity date of the financial instrument. Field applicable for the asset classes of bonds, interest rate derivatives, equity derivatives, commodity derivatives, foreign exchange derivatives, credit derivatives, C10 derivatives and derivatives on emission allowances.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected NonEquityInstrumentReportingClassification1Code financialInstrumentClassification;
	/**
	 * Identification of non-equity financial instruments.
	 * <p>
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
	public static final MMMessageAttribute mmFinancialInstrumentClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentClassification";
			definition = "Identification of non-equity financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	protected ProductType5Code underlyingInstrumentAssetClass;
	/**
	 * Details on the type of asset class a non-equity financial instrument can
	 * be classified as.
	 * <p>
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
	public static final MMMessageAttribute mmUnderlyingInstrumentAssetClass = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "UndrlygInstrmAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingInstrumentAssetClass";
			definition = "Details on the type of asset class a non-equity financial instrument can be classified as.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ProductType5Code.mmObject();
		}
	};
	protected FinancialInstrumentContractType1Code derivativeContractType;
	/**
	 * Details on the contract type a derivative non-equity financial instrument
	 * can be classified as.
	 * <p>
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
	public static final MMMessageAttribute mmDerivativeContractType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "DerivCtrctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeContractType";
			definition = "Details on the contract type a derivative non-equity financial instrument can be classified as.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialInstrumentContractType1Code.mmObject();
		}
	};
	protected DebtInstrument5 bond;
	/**
	 * Details specific to a bond / debt instrument.
	 * <p>
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
	public static final MMMessageAssociationEnd mmBond = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "Bd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Details specific to a bond / debt instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DebtInstrument5.mmObject();
		}
	};
	protected EmissionAllowanceProductType2Code emissionAllowanceType;
	/**
	 * Details the reporting of the emission allowance sub type.
	 * <p>
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
	public static final MMMessageAttribute mmEmissionAllowanceType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Commodity.mmObject();
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
			isDerived = false;
			xmlTag = "EmssnAllwncTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowanceType";
			definition = "Details the reporting of the emission allowance sub type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EmissionAllowanceProductType2Code.mmObject();
		}
	};
	protected Derivative2Choice derivative;
	/**
	 * Derivative specific details.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDerivative = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> TransparencyDataReport10.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransparencyDataReport10.mmTechnicalRecordIdentification, TransparencyDataReport10.mmIdentification, TransparencyDataReport10.mmFullName, TransparencyDataReport10.mmTradingVenue,
						TransparencyDataReport10.mmReportingDate, TransparencyDataReport10.mmMaturityDate, TransparencyDataReport10.mmFinancialInstrumentClassification, TransparencyDataReport10.mmUnderlyingInstrumentAssetClass,
						TransparencyDataReport10.mmDerivativeContractType, TransparencyDataReport10.mmBond, TransparencyDataReport10.mmEmissionAllowanceType, TransparencyDataReport10.mmDerivative);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmNonEquityTransparencyData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyDataReport10";
				definition = "Provides for reporting details of non-equity instruments as part of transparency calculations.";
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

	@XmlElement(name = "RptgDt")
	public ISODate getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(ISODate reportingDate) {
		this.reportingDate = reportingDate;
	}

	@XmlElement(name = "MtrtyDt")
	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "FinInstrmClssfctn", required = true)
	public NonEquityInstrumentReportingClassification1Code getFinancialInstrumentClassification() {
		return financialInstrumentClassification;
	}

	public void setFinancialInstrumentClassification(NonEquityInstrumentReportingClassification1Code financialInstrumentClassification) {
		this.financialInstrumentClassification = financialInstrumentClassification;
	}

	@XmlElement(name = "UndrlygInstrmAsstClss")
	public ProductType5Code getUnderlyingInstrumentAssetClass() {
		return underlyingInstrumentAssetClass;
	}

	public void setUnderlyingInstrumentAssetClass(ProductType5Code underlyingInstrumentAssetClass) {
		this.underlyingInstrumentAssetClass = underlyingInstrumentAssetClass;
	}

	@XmlElement(name = "DerivCtrctTp")
	public FinancialInstrumentContractType1Code getDerivativeContractType() {
		return derivativeContractType;
	}

	public void setDerivativeContractType(FinancialInstrumentContractType1Code derivativeContractType) {
		this.derivativeContractType = derivativeContractType;
	}

	@XmlElement(name = "Bd")
	public DebtInstrument5 getBond() {
		return bond;
	}

	public void setBond(com.tools20022.repository.msg.DebtInstrument5 bond) {
		this.bond = bond;
	}

	@XmlElement(name = "EmssnAllwncTp")
	public EmissionAllowanceProductType2Code getEmissionAllowanceType() {
		return emissionAllowanceType;
	}

	public void setEmissionAllowanceType(EmissionAllowanceProductType2Code emissionAllowanceType) {
		this.emissionAllowanceType = emissionAllowanceType;
	}

	@XmlElement(name = "Deriv")
	public Derivative2Choice getDerivative() {
		return derivative;
	}

	public void setDerivative(Derivative2Choice derivative) {
		this.derivative = derivative;
	}
}