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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmSecurityStatus
 * CommonFinancialInstrumentAttributes5.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmISOSecurityLongName
 * CommonFinancialInstrumentAttributes5.mmISOSecurityLongName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmISOSecurityShortName
 * CommonFinancialInstrumentAttributes5.mmISOSecurityShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmNameValidFrom
 * CommonFinancialInstrumentAttributes5.mmNameValidFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmDenominationCurrency
 * CommonFinancialInstrumentAttributes5.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmCertificateNumber
 * CommonFinancialInstrumentAttributes5.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmContractVersionNumber
 * CommonFinancialInstrumentAttributes5.mmContractVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmCouponAttachedNumber
 * CommonFinancialInstrumentAttributes5.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmTaxLotNumber
 * CommonFinancialInstrumentAttributes5.mmTaxLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPoolNumber
 * CommonFinancialInstrumentAttributes5.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmCoveredIndicator
 * CommonFinancialInstrumentAttributes5.mmCoveredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmLegalRestrictions
 * CommonFinancialInstrumentAttributes5.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPositionLimit
 * CommonFinancialInstrumentAttributes5.mmPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmNearTermPositionLimit
 * CommonFinancialInstrumentAttributes5.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmListingDate
 * CommonFinancialInstrumentAttributes5.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmRecordDate
 * CommonFinancialInstrumentAttributes5.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmExpiryDate
 * CommonFinancialInstrumentAttributes5.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPurpose
 * CommonFinancialInstrumentAttributes5.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmClassificationType
 * CommonFinancialInstrumentAttributes5.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmIssuance
 * CommonFinancialInstrumentAttributes5.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmTradingMarket
 * CommonFinancialInstrumentAttributes5.mmTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmSpreadAndBenchmarkCurve
 * CommonFinancialInstrumentAttributes5.mmSpreadAndBenchmarkCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPutType
 * CommonFinancialInstrumentAttributes5.mmPutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmCallType
 * CommonFinancialInstrumentAttributes5.mmCallType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmFungibleIndicator
 * CommonFinancialInstrumentAttributes5.mmFungibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmConfidential
 * CommonFinancialInstrumentAttributes5.mmConfidential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPrivatePlacement
 * CommonFinancialInstrumentAttributes5.mmPrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmConvertibleIndicator
 * CommonFinancialInstrumentAttributes5.mmConvertibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmConversionPeriod
 * CommonFinancialInstrumentAttributes5.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmConversionRatioNumerator
 * CommonFinancialInstrumentAttributes5.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmConversionRatioDenominator
 * CommonFinancialInstrumentAttributes5.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPrimaryPlaceOfDeposit
 * CommonFinancialInstrumentAttributes5.mmPrimaryPlaceOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmTradingMethod
 * CommonFinancialInstrumentAttributes5.mmTradingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmTEFRARule
 * CommonFinancialInstrumentAttributes5.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmSerieNumber
 * CommonFinancialInstrumentAttributes5.mmSerieNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmClass_
 * CommonFinancialInstrumentAttributes5.mmClass_}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmWithholdingTaxRegime
 * CommonFinancialInstrumentAttributes5.mmWithholdingTaxRegime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPaymentStatus
 * CommonFinancialInstrumentAttributes5.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmInitialPhysicalForm
 * CommonFinancialInstrumentAttributes5.mmInitialPhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmAfterExchangePhysicalForm
 * CommonFinancialInstrumentAttributes5.mmAfterExchangePhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmCommonSafekeeper
 * CommonFinancialInstrumentAttributes5.mmCommonSafekeeper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmRedemptionType
 * CommonFinancialInstrumentAttributes5.mmRedemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmRedemptionPaymentCurrency
 * CommonFinancialInstrumentAttributes5.mmRedemptionPaymentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmRestriction
 * CommonFinancialInstrumentAttributes5.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmFinancialInstrumentIdentification
 * CommonFinancialInstrumentAttributes5.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmSettlementInformation
 * CommonFinancialInstrumentAttributes5.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmFinancialInstrumentForm
 * CommonFinancialInstrumentAttributes5.mmFinancialInstrumentForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmContactName
 * CommonFinancialInstrumentAttributes5.mmContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmLeadManager
 * CommonFinancialInstrumentAttributes5.mmLeadManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPrincipalPayingAgent
 * CommonFinancialInstrumentAttributes5.mmPrincipalPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmPayingAgent
 * CommonFinancialInstrumentAttributes5.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmDepository
 * CommonFinancialInstrumentAttributes5.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5#mmUnderlyingRisk
 * CommonFinancialInstrumentAttributes5.mmUnderlyingRisk}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommonFinancialInstrumentAttributes5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
 * CommonFinancialInstrumentAttributes2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommonFinancialInstrumentAttributes5", propOrder = {"securityStatus", "iSOSecurityLongName", "iSOSecurityShortName", "nameValidFrom", "denominationCurrency", "certificateNumber", "contractVersionNumber",
		"couponAttachedNumber", "taxLotNumber", "poolNumber", "coveredIndicator", "legalRestrictions", "positionLimit", "nearTermPositionLimit", "listingDate", "recordDate", "expiryDate", "purpose", "classificationType", "issuance",
		"tradingMarket", "spreadAndBenchmarkCurve", "putType", "callType", "fungibleIndicator", "confidential", "privatePlacement", "convertibleIndicator", "conversionPeriod", "conversionRatioNumerator", "conversionRatioDenominator",
		"primaryPlaceOfDeposit", "tradingMethod", "tEFRARule", "serieNumber", "class_", "withholdingTaxRegime", "paymentStatus", "initialPhysicalForm", "afterExchangePhysicalForm", "commonSafekeeper", "redemptionType",
		"redemptionPaymentCurrency", "restriction", "financialInstrumentIdentification", "settlementInformation", "financialInstrumentForm", "contactName", "leadManager", "principalPayingAgent", "payingAgent", "depository",
		"underlyingRisk"})
public class CommonFinancialInstrumentAttributes5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctySts")
	protected SecurityStatus3Choice securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityStatus3Choice
	 * SecurityStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 965</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "965"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityStatus3Choice.mmObject();
		}
	};
	@XmlElement(name = "ISOSctyLngNm")
	protected Max350Text iSOSecurityLongName;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISOSctyLngNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityLongName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISOSecurityLongName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyLngNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityLongName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "ISOSctyShrtNm")
	protected Max35Text iSOSecurityShortName;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISOSctyShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the security expressed as ISO 18773/18774."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISOSecurityShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityShortName";
			definition = "Short name of the security expressed as ISO 18773/18774.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "NmVldFr")
	protected DateAndDateTimeChoice nameValidFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmVldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date since when the name of the security is valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameValidFrom = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "NmVldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameValidFrom";
			definition = "Defines the date since when the name of the security is valid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "DnmtnCcy")
	protected CurrencyCode denominationCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "CertNb")
	protected Max35Text certificateNumber;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CtrctVrsnNb")
	protected Number contractVersionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctVrsnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractVersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version number assigned to the contract associated with the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractVersionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CtrctVrsnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractVersionNumber";
			definition = "Version number assigned to the contract associated with the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "CpnAttchdNb")
	protected Max3NumericText couponAttachedNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnAttchdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttachedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponAttachedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CpnAttchdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponAttachedNumber";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "TaxLotNb")
	protected Max15NumericText taxLotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLotNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxLotNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "TaxLotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "PoolNb")
	protected Max15NumericText poolNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 691</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "691"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "CvrdInd")
	protected YesNoIndicator coveredIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CvrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCoveredIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CvrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredIndicator";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected LegalRestrictions4Choice legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalRestrictions4Choice
	 * LegalRestrictions4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the regulatory restrictions applicable to a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRestrictions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalRestrictions4Choice.mmObject();
		}
	};
	@XmlElement(name = "PosLmt")
	protected FinancialInstrumentQuantity1Choice positionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 970</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPositionLimit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PosLmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "970"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionLimit";
			definition = "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "NearTermPosLmt")
	protected FinancialInstrumentQuantity1Choice nearTermPositionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NearTermPosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 971</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NearTermPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Near-term position limit for the instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNearTermPositionLimit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "NearTermPosLmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "971"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Near-term position limit for the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "ListgDt")
	protected ISODate listingDate;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original Date/time at which the security is listed at the specific exchange or trading venue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ListgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListingDate";
			definition = "Original Date/time at which the security is listed at the specific exchange or trading venue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "RcrdDt")
	protected ISODateTime recordDate;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which positions are struck to note which parties are entitled to receive the entitlement to a corporate event or vote at a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date/time at which positions are struck to note which parties are entitled to receive the entitlement to a corporate event or vote at a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "XpryDt")
	protected ISODate expiryDate;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a privilege expires."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which a privilege expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "Purp")
	protected Max256Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected ClassificationType2 classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2
	 * ClassificationType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information allowing the classification of a financial instrument, for example, with its ISO CFI (Classification of Financial Instrument) or product type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassificationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Information allowing the classification of a financial instrument, for example, with its ISO CFI (Classification of Financial Instrument) or product type.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ClassificationType2.mmObject();
		}
	};
	@XmlElement(name = "Issnc")
	protected Issuance3 issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Issuance3 Issuance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding the issuance of an asset."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "Issnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Issuance3.mmObject();
		}
	};
	@XmlElement(name = "TradgMkt")
	protected List<com.tools20022.repository.msg.TradingParameters1> tradingMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMkt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is traded."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingMarket = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "TradgMkt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradingParameters1.mmObject();
		}
	};
	@XmlElement(name = "SprdAndBchmkCrv")
	protected List<com.tools20022.repository.msg.BenchmarkCurve4> spreadAndBenchmarkCurve;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve4
	 * BenchmarkCurve4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdAndBchmkCrv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadAndBenchmarkCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the spread to benchmark details of an indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpreadAndBenchmarkCurve = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurve";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve4.mmObject();
		}
	};
	@XmlElement(name = "PutTp")
	protected PutType3Choice putType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PutType3Choice
	 * PutType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Represents the type of put."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutType";
			definition = "Represents the type of put.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PutType3Choice.mmObject();
		}
	};
	@XmlElement(name = "CallTp")
	protected CallType3Choice callType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CallType3Choice
	 * CallType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Represents the type of call."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CallTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallType";
			definition = "Represents the type of call.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CallType3Choice.mmObject();
		}
	};
	@XmlElement(name = "FngbInd")
	protected YesNoIndicator fungibleIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FngbInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FungibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFungibleIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "FngbInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Cnfdtl")
	protected YesNoIndicator confidential;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnfdtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confidential"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates wheter the details of the security are to be made available to the market, or kept private between ICSDs and agency network."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfidential = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "Cnfdtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confidential";
			definition = "Indicates wheter the details of the security are to be made available to the market, or kept private between ICSDs and agency network.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrvtPlcmnt")
	protected YesNoIndicator privatePlacement;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvtPlcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sale of securities directly to private persons, institutional investors, or both outside a public offering. Such non-public deals (often without a publicly available prospectus) closing through the ICSDs are placed directly with investors."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrivatePlacement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PrvtPlcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePlacement";
			definition = "The sale of securities directly to private persons, institutional investors, or both outside a public offering. Such non-public deals (often without a publicly available prospectus) closing through the ICSDs are placed directly with investors.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ConvtblInd")
	protected YesNoIndicator convertibleIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor or the issuer has a conversion option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConvertibleIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ConvsPrd")
	protected DateTimePeriodDetails conversionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConversionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ConvsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails.mmObject();
		}
	};
	@XmlElement(name = "ConvsRatioNmrtr")
	protected FinancialInstrumentQuantity1Choice conversionRatioNumerator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsRatioNmrtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of target securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConversionRatioNumerator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioNmrtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "ConvsRatioDnmtr")
	protected FinancialInstrumentQuantity1Choice conversionRatioDenominator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsRatioDnmtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConversionRatioDenominator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "ConvsRatioDnmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "PmryPlcOfDpst")
	protected PartyIdentification71Choice primaryPlaceOfDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryPlcOfDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPlaceOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Primary place of deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryPlaceOfDeposit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PmryPlcOfDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPlaceOfDeposit";
			definition = "Primary place of deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	@XmlElement(name = "TradgMtd")
	protected UnitOrFaceAmount1Choice tradingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the notional amount value is to be traded in either an amount or in units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "TradgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMethod";
			definition = "Indicates whether the notional amount value is to be traded in either an amount or in units.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	@XmlElement(name = "TEFRARule")
	protected TEFRARules3Choice tEFRARule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TEFRARules3Choice
	 * TEFRARules3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TEFRARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEFRARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the TEFRA rule under which the security is issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTEFRARule = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "TEFRARule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TEFRARules3Choice.mmObject();
		}
	};
	@XmlElement(name = "SrNb")
	protected Max16Text serieNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerieNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the series number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSerieNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "SrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerieNumber";
			definition = "Identifies the series number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "Clss")
	protected Max16Text class_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Class"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier that links multiple security classes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClass_ = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "Clss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Class";
			definition = "Identifier that links multiple security classes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	@XmlElement(name = "WhldgTaxRgm")
	protected List<com.tools20022.repository.msg.SecurityWithHoldingTax1> withholdingTaxRegime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityWithHoldingTax1
	 * SecurityWithHoldingTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRgm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRegime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWithholdingTaxRegime = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRegime";
			definition = "Amount or percentage of a cash distribution that will be withheld by a tax authority.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityWithHoldingTax1.mmObject();
		}
	};
	@XmlElement(name = "PmtSts")
	protected SecuritiesPaymentStatus7Choice paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus7Choice
	 * SecuritiesPaymentStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesPaymentStatus7Choice.mmObject();
		}
	};
	@XmlElement(name = "InitlPhysForm")
	protected InitialPhysicalForm4Choice initialPhysicalForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InitialPhysicalForm4Choice
	 * InitialPhysicalForm4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlPhysForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialPhysicalForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the physical form of the securities on the closing date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitialPhysicalForm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "InitlPhysForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialPhysicalForm";
			definition = "Indicates the physical form of the securities on the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InitialPhysicalForm4Choice.mmObject();
		}
	};
	@XmlElement(name = "AftrXchgPhysForm")
	protected InitialPhysicalForm3Choice afterExchangePhysicalForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InitialPhysicalForm3Choice
	 * InitialPhysicalForm3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AftrXchgPhysForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterExchangePhysicalForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the physical form of the securities after the exchange of the initial certificate issued on the closing date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAfterExchangePhysicalForm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "AftrXchgPhysForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterExchangePhysicalForm";
			definition = "Indicates the physical form of the securities after the exchange of the initial certificate issued on the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InitialPhysicalForm3Choice.mmObject();
		}
	};
	@XmlElement(name = "CmonSfkpr")
	protected AnyBICIdentifier commonSafekeeper;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonSfkpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonSafekeeper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the ICSDs to provide safekeeping for securities in new global note (NGN) form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommonSafekeeper = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CmonSfkpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonSafekeeper";
			definition = "Entity appointed by the ICSDs to provide safekeeping for securities in new global note (NGN) form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "RedTp")
	protected MaturityRedemptionType3Choice redemptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MaturityRedemptionType3Choice
	 * MaturityRedemptionType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of redemption at maturity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "RedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionType";
			definition = "Indicates the type of redemption at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MaturityRedemptionType3Choice.mmObject();
		}
	};
	@XmlElement(name = "RedPmtCcy")
	protected ActiveCurrencyCode redemptionPaymentCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISO currency for the payment of the cash proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionPaymentCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "RedPmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentCurrency";
			definition = "ISO currency for the payment of the cash proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<com.tools20022.repository.msg.SecurityRestriction2> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restriction(s) linked to the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityRestriction2.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	@XmlElement(name = "SttlmInf")
	protected List<com.tools20022.repository.msg.SettlementInformation17> settlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17
	 * SettlementInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "SttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInformation";
			definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementInformation17.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmForm")
	protected FinancialInstrumentForm2 financialInstrumentForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm2
	 * FinancialInstrumentForm2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the form of the financial Instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentForm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentForm";
			definition = "Indicates the form of the financial Instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentForm2.mmObject();
		}
	};
	@XmlElement(name = "CtctNm")
	protected Organisation27 contactName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details (name, e-mail address and/or telephone number) of the person requesting the allocation of the ISIN used as a point of reference in case further clarifications are required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactName = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "CtctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactName";
			definition = "Details (name, e-mail address and/or telephone number) of the person requesting the allocation of the ISIN used as a point of reference in case further clarifications are required.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};
	@XmlElement(name = "LeadMgr")
	protected Organisation27 leadManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LeadMgr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the issuer to structure and lead the placement of a syndicated issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLeadManager = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "LeadMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadManager";
			definition = "Entity appointed by the issuer to structure and lead the placement of a syndicated issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};
	@XmlElement(name = "PrncplPngAgt")
	protected Organisation27 principalPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplPngAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Main party appointed to distribute payment or securities on behalf of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrincipalPayingAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PrncplPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalPayingAgent";
			definition = "Main party appointed to distribute payment or securities on behalf of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};
	@XmlElement(name = "PngAgt")
	protected Organisation27 payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional party appointed to distribute payment or securities on behalf of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPayingAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Additional party appointed to distribute payment or securities on behalf of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};
	@XmlElement(name = "Dpstry")
	protected Organisation27 depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the relevant clearing system as a depository for instruments issued in global or definitive form. The depository keeps the securities for safekeeping purposes on behalf of the clearing system(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepository = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "Entity appointed by the relevant clearing system as a depository for instruments issued in global or definitive form. The depository keeps the securities for safekeeping purposes on behalf of the clearing system(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};
	@XmlElement(name = "UndrlygRsk")
	protected Organisation27 underlyingRisk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5
	 * CommonFinancialInstrumentAttributes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygRsk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity(ies), asset(s) or security(ies) on which the credit responsibility lies as identified in the documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingRisk = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmObject();
			isDerived = false;
			xmlTag = "UndrlygRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingRisk";
			definition = "Entity(ies), asset(s) or security(ies) on which the credit responsibility lies as identified in the documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation27.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmSecurityStatus, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmISOSecurityLongName,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmISOSecurityShortName, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmNameValidFrom,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmDenominationCurrency, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmCertificateNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmContractVersionNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmCouponAttachedNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmTaxLotNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPoolNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmCoveredIndicator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmLegalRestrictions,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPositionLimit, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmNearTermPositionLimit,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmListingDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmRecordDate,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmExpiryDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPurpose,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmClassificationType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmIssuance,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmTradingMarket, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmSpreadAndBenchmarkCurve,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPutType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmCallType,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmFungibleIndicator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmConfidential,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPrivatePlacement, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmConvertibleIndicator,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmConversionPeriod, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmConversionRatioNumerator,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmConversionRatioDenominator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPrimaryPlaceOfDeposit,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmTradingMethod, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmTEFRARule,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmSerieNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmClass_,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmWithholdingTaxRegime, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPaymentStatus,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmInitialPhysicalForm, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmAfterExchangePhysicalForm,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmCommonSafekeeper, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmRedemptionType,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmRedemptionPaymentCurrency, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmRestriction,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmSettlementInformation,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmFinancialInstrumentForm, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmContactName,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmLeadManager, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPrincipalPayingAgent,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmPayingAgent, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmDepository,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes5.mmUnderlyingRisk);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CommonFinancialInstrumentAttributes5";
				definition = "Tangible items of value to a business.";
				previousVersion_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityStatus3Choice> getSecurityStatus() {
		return securityStatus == null ? Optional.empty() : Optional.of(securityStatus);
	}

	public CommonFinancialInstrumentAttributes5 setSecurityStatus(SecurityStatus3Choice securityStatus) {
		this.securityStatus = securityStatus;
		return this;
	}

	public Optional<Max350Text> getISOSecurityLongName() {
		return iSOSecurityLongName == null ? Optional.empty() : Optional.of(iSOSecurityLongName);
	}

	public CommonFinancialInstrumentAttributes5 setISOSecurityLongName(Max350Text iSOSecurityLongName) {
		this.iSOSecurityLongName = iSOSecurityLongName;
		return this;
	}

	public Optional<Max35Text> getISOSecurityShortName() {
		return iSOSecurityShortName == null ? Optional.empty() : Optional.of(iSOSecurityShortName);
	}

	public CommonFinancialInstrumentAttributes5 setISOSecurityShortName(Max35Text iSOSecurityShortName) {
		this.iSOSecurityShortName = iSOSecurityShortName;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getNameValidFrom() {
		return nameValidFrom == null ? Optional.empty() : Optional.of(nameValidFrom);
	}

	public CommonFinancialInstrumentAttributes5 setNameValidFrom(DateAndDateTimeChoice nameValidFrom) {
		this.nameValidFrom = nameValidFrom;
		return this;
	}

	public Optional<CurrencyCode> getDenominationCurrency() {
		return denominationCurrency == null ? Optional.empty() : Optional.of(denominationCurrency);
	}

	public CommonFinancialInstrumentAttributes5 setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
		return this;
	}

	public Optional<Max35Text> getCertificateNumber() {
		return certificateNumber == null ? Optional.empty() : Optional.of(certificateNumber);
	}

	public CommonFinancialInstrumentAttributes5 setCertificateNumber(Max35Text certificateNumber) {
		this.certificateNumber = certificateNumber;
		return this;
	}

	public Optional<Number> getContractVersionNumber() {
		return contractVersionNumber == null ? Optional.empty() : Optional.of(contractVersionNumber);
	}

	public CommonFinancialInstrumentAttributes5 setContractVersionNumber(Number contractVersionNumber) {
		this.contractVersionNumber = contractVersionNumber;
		return this;
	}

	public Optional<Max3NumericText> getCouponAttachedNumber() {
		return couponAttachedNumber == null ? Optional.empty() : Optional.of(couponAttachedNumber);
	}

	public CommonFinancialInstrumentAttributes5 setCouponAttachedNumber(Max3NumericText couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
		return this;
	}

	public Optional<Max15NumericText> getTaxLotNumber() {
		return taxLotNumber == null ? Optional.empty() : Optional.of(taxLotNumber);
	}

	public CommonFinancialInstrumentAttributes5 setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = taxLotNumber;
		return this;
	}

	public Optional<Max15NumericText> getPoolNumber() {
		return poolNumber == null ? Optional.empty() : Optional.of(poolNumber);
	}

	public CommonFinancialInstrumentAttributes5 setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = poolNumber;
		return this;
	}

	public Optional<YesNoIndicator> getCoveredIndicator() {
		return coveredIndicator == null ? Optional.empty() : Optional.of(coveredIndicator);
	}

	public CommonFinancialInstrumentAttributes5 setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = coveredIndicator;
		return this;
	}

	public Optional<LegalRestrictions4Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public CommonFinancialInstrumentAttributes5 setLegalRestrictions(LegalRestrictions4Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getPositionLimit() {
		return positionLimit == null ? Optional.empty() : Optional.of(positionLimit);
	}

	public CommonFinancialInstrumentAttributes5 setPositionLimit(FinancialInstrumentQuantity1Choice positionLimit) {
		this.positionLimit = positionLimit;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getNearTermPositionLimit() {
		return nearTermPositionLimit == null ? Optional.empty() : Optional.of(nearTermPositionLimit);
	}

	public CommonFinancialInstrumentAttributes5 setNearTermPositionLimit(FinancialInstrumentQuantity1Choice nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
		return this;
	}

	public Optional<ISODate> getListingDate() {
		return listingDate == null ? Optional.empty() : Optional.of(listingDate);
	}

	public CommonFinancialInstrumentAttributes5 setListingDate(ISODate listingDate) {
		this.listingDate = listingDate;
		return this;
	}

	public Optional<ISODateTime> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CommonFinancialInstrumentAttributes5 setRecordDate(ISODateTime recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public CommonFinancialInstrumentAttributes5 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public CommonFinancialInstrumentAttributes5 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<ClassificationType2> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public CommonFinancialInstrumentAttributes5 setClassificationType(com.tools20022.repository.msg.ClassificationType2 classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<Issuance3> getIssuance() {
		return issuance == null ? Optional.empty() : Optional.of(issuance);
	}

	public CommonFinancialInstrumentAttributes5 setIssuance(com.tools20022.repository.msg.Issuance3 issuance) {
		this.issuance = issuance;
		return this;
	}

	public List<TradingParameters1> getTradingMarket() {
		return tradingMarket == null ? tradingMarket = new ArrayList<>() : tradingMarket;
	}

	public CommonFinancialInstrumentAttributes5 setTradingMarket(List<com.tools20022.repository.msg.TradingParameters1> tradingMarket) {
		this.tradingMarket = Objects.requireNonNull(tradingMarket);
		return this;
	}

	public List<BenchmarkCurve4> getSpreadAndBenchmarkCurve() {
		return spreadAndBenchmarkCurve == null ? spreadAndBenchmarkCurve = new ArrayList<>() : spreadAndBenchmarkCurve;
	}

	public CommonFinancialInstrumentAttributes5 setSpreadAndBenchmarkCurve(List<com.tools20022.repository.msg.BenchmarkCurve4> spreadAndBenchmarkCurve) {
		this.spreadAndBenchmarkCurve = Objects.requireNonNull(spreadAndBenchmarkCurve);
		return this;
	}

	public Optional<PutType3Choice> getPutType() {
		return putType == null ? Optional.empty() : Optional.of(putType);
	}

	public CommonFinancialInstrumentAttributes5 setPutType(PutType3Choice putType) {
		this.putType = putType;
		return this;
	}

	public Optional<CallType3Choice> getCallType() {
		return callType == null ? Optional.empty() : Optional.of(callType);
	}

	public CommonFinancialInstrumentAttributes5 setCallType(CallType3Choice callType) {
		this.callType = callType;
		return this;
	}

	public Optional<YesNoIndicator> getFungibleIndicator() {
		return fungibleIndicator == null ? Optional.empty() : Optional.of(fungibleIndicator);
	}

	public CommonFinancialInstrumentAttributes5 setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = fungibleIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConfidential() {
		return confidential == null ? Optional.empty() : Optional.of(confidential);
	}

	public CommonFinancialInstrumentAttributes5 setConfidential(YesNoIndicator confidential) {
		this.confidential = confidential;
		return this;
	}

	public Optional<YesNoIndicator> getPrivatePlacement() {
		return privatePlacement == null ? Optional.empty() : Optional.of(privatePlacement);
	}

	public CommonFinancialInstrumentAttributes5 setPrivatePlacement(YesNoIndicator privatePlacement) {
		this.privatePlacement = privatePlacement;
		return this;
	}

	public Optional<YesNoIndicator> getConvertibleIndicator() {
		return convertibleIndicator == null ? Optional.empty() : Optional.of(convertibleIndicator);
	}

	public CommonFinancialInstrumentAttributes5 setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
		return this;
	}

	public Optional<DateTimePeriodDetails> getConversionPeriod() {
		return conversionPeriod == null ? Optional.empty() : Optional.of(conversionPeriod);
	}

	public CommonFinancialInstrumentAttributes5 setConversionPeriod(com.tools20022.repository.msg.DateTimePeriodDetails conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConversionRatioNumerator() {
		return conversionRatioNumerator == null ? Optional.empty() : Optional.of(conversionRatioNumerator);
	}

	public CommonFinancialInstrumentAttributes5 setConversionRatioNumerator(FinancialInstrumentQuantity1Choice conversionRatioNumerator) {
		this.conversionRatioNumerator = conversionRatioNumerator;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConversionRatioDenominator() {
		return conversionRatioDenominator == null ? Optional.empty() : Optional.of(conversionRatioDenominator);
	}

	public CommonFinancialInstrumentAttributes5 setConversionRatioDenominator(FinancialInstrumentQuantity1Choice conversionRatioDenominator) {
		this.conversionRatioDenominator = conversionRatioDenominator;
		return this;
	}

	public Optional<PartyIdentification71Choice> getPrimaryPlaceOfDeposit() {
		return primaryPlaceOfDeposit == null ? Optional.empty() : Optional.of(primaryPlaceOfDeposit);
	}

	public CommonFinancialInstrumentAttributes5 setPrimaryPlaceOfDeposit(PartyIdentification71Choice primaryPlaceOfDeposit) {
		this.primaryPlaceOfDeposit = primaryPlaceOfDeposit;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getTradingMethod() {
		return tradingMethod == null ? Optional.empty() : Optional.of(tradingMethod);
	}

	public CommonFinancialInstrumentAttributes5 setTradingMethod(UnitOrFaceAmount1Choice tradingMethod) {
		this.tradingMethod = tradingMethod;
		return this;
	}

	public Optional<TEFRARules3Choice> getTEFRARule() {
		return tEFRARule == null ? Optional.empty() : Optional.of(tEFRARule);
	}

	public CommonFinancialInstrumentAttributes5 setTEFRARule(TEFRARules3Choice tEFRARule) {
		this.tEFRARule = tEFRARule;
		return this;
	}

	public Optional<Max16Text> getSerieNumber() {
		return serieNumber == null ? Optional.empty() : Optional.of(serieNumber);
	}

	public CommonFinancialInstrumentAttributes5 setSerieNumber(Max16Text serieNumber) {
		this.serieNumber = serieNumber;
		return this;
	}

	public Optional<Max16Text> getClass_() {
		return class_ == null ? Optional.empty() : Optional.of(class_);
	}

	public CommonFinancialInstrumentAttributes5 setClass_(Max16Text class_) {
		this.class_ = class_;
		return this;
	}

	public List<SecurityWithHoldingTax1> getWithholdingTaxRegime() {
		return withholdingTaxRegime == null ? withholdingTaxRegime = new ArrayList<>() : withholdingTaxRegime;
	}

	public CommonFinancialInstrumentAttributes5 setWithholdingTaxRegime(List<com.tools20022.repository.msg.SecurityWithHoldingTax1> withholdingTaxRegime) {
		this.withholdingTaxRegime = Objects.requireNonNull(withholdingTaxRegime);
		return this;
	}

	public Optional<SecuritiesPaymentStatus7Choice> getPaymentStatus() {
		return paymentStatus == null ? Optional.empty() : Optional.of(paymentStatus);
	}

	public CommonFinancialInstrumentAttributes5 setPaymentStatus(SecuritiesPaymentStatus7Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public Optional<InitialPhysicalForm4Choice> getInitialPhysicalForm() {
		return initialPhysicalForm == null ? Optional.empty() : Optional.of(initialPhysicalForm);
	}

	public CommonFinancialInstrumentAttributes5 setInitialPhysicalForm(InitialPhysicalForm4Choice initialPhysicalForm) {
		this.initialPhysicalForm = initialPhysicalForm;
		return this;
	}

	public Optional<InitialPhysicalForm3Choice> getAfterExchangePhysicalForm() {
		return afterExchangePhysicalForm == null ? Optional.empty() : Optional.of(afterExchangePhysicalForm);
	}

	public CommonFinancialInstrumentAttributes5 setAfterExchangePhysicalForm(InitialPhysicalForm3Choice afterExchangePhysicalForm) {
		this.afterExchangePhysicalForm = afterExchangePhysicalForm;
		return this;
	}

	public Optional<AnyBICIdentifier> getCommonSafekeeper() {
		return commonSafekeeper == null ? Optional.empty() : Optional.of(commonSafekeeper);
	}

	public CommonFinancialInstrumentAttributes5 setCommonSafekeeper(AnyBICIdentifier commonSafekeeper) {
		this.commonSafekeeper = commonSafekeeper;
		return this;
	}

	public Optional<MaturityRedemptionType3Choice> getRedemptionType() {
		return redemptionType == null ? Optional.empty() : Optional.of(redemptionType);
	}

	public CommonFinancialInstrumentAttributes5 setRedemptionType(MaturityRedemptionType3Choice redemptionType) {
		this.redemptionType = redemptionType;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRedemptionPaymentCurrency() {
		return redemptionPaymentCurrency == null ? Optional.empty() : Optional.of(redemptionPaymentCurrency);
	}

	public CommonFinancialInstrumentAttributes5 setRedemptionPaymentCurrency(ActiveCurrencyCode redemptionPaymentCurrency) {
		this.redemptionPaymentCurrency = redemptionPaymentCurrency;
		return this;
	}

	public List<SecurityRestriction2> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CommonFinancialInstrumentAttributes5 setRestriction(List<com.tools20022.repository.msg.SecurityRestriction2> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Optional<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public CommonFinancialInstrumentAttributes5 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public List<SettlementInformation17> getSettlementInformation() {
		return settlementInformation == null ? settlementInformation = new ArrayList<>() : settlementInformation;
	}

	public CommonFinancialInstrumentAttributes5 setSettlementInformation(List<com.tools20022.repository.msg.SettlementInformation17> settlementInformation) {
		this.settlementInformation = Objects.requireNonNull(settlementInformation);
		return this;
	}

	public Optional<FinancialInstrumentForm2> getFinancialInstrumentForm() {
		return financialInstrumentForm == null ? Optional.empty() : Optional.of(financialInstrumentForm);
	}

	public CommonFinancialInstrumentAttributes5 setFinancialInstrumentForm(com.tools20022.repository.msg.FinancialInstrumentForm2 financialInstrumentForm) {
		this.financialInstrumentForm = financialInstrumentForm;
		return this;
	}

	public Optional<Organisation27> getContactName() {
		return contactName == null ? Optional.empty() : Optional.of(contactName);
	}

	public CommonFinancialInstrumentAttributes5 setContactName(com.tools20022.repository.msg.Organisation27 contactName) {
		this.contactName = contactName;
		return this;
	}

	public Optional<Organisation27> getLeadManager() {
		return leadManager == null ? Optional.empty() : Optional.of(leadManager);
	}

	public CommonFinancialInstrumentAttributes5 setLeadManager(com.tools20022.repository.msg.Organisation27 leadManager) {
		this.leadManager = leadManager;
		return this;
	}

	public Optional<Organisation27> getPrincipalPayingAgent() {
		return principalPayingAgent == null ? Optional.empty() : Optional.of(principalPayingAgent);
	}

	public CommonFinancialInstrumentAttributes5 setPrincipalPayingAgent(com.tools20022.repository.msg.Organisation27 principalPayingAgent) {
		this.principalPayingAgent = principalPayingAgent;
		return this;
	}

	public Optional<Organisation27> getPayingAgent() {
		return payingAgent == null ? Optional.empty() : Optional.of(payingAgent);
	}

	public CommonFinancialInstrumentAttributes5 setPayingAgent(com.tools20022.repository.msg.Organisation27 payingAgent) {
		this.payingAgent = payingAgent;
		return this;
	}

	public Optional<Organisation27> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public CommonFinancialInstrumentAttributes5 setDepository(com.tools20022.repository.msg.Organisation27 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<Organisation27> getUnderlyingRisk() {
		return underlyingRisk == null ? Optional.empty() : Optional.of(underlyingRisk);
	}

	public CommonFinancialInstrumentAttributes5 setUnderlyingRisk(com.tools20022.repository.msg.Organisation27 underlyingRisk) {
		this.underlyingRisk = underlyingRisk;
		return this;
	}
}