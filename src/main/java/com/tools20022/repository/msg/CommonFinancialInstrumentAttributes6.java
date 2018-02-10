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
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmSecurityStatus
 * CommonFinancialInstrumentAttributes6.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmFinancialInstrumentName
 * CommonFinancialInstrumentAttributes6.mmFinancialInstrumentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmDenominationCurrency
 * CommonFinancialInstrumentAttributes6.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmCertificateNumber
 * CommonFinancialInstrumentAttributes6.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmContractVersionNumber
 * CommonFinancialInstrumentAttributes6.mmContractVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmCouponAttachedNumber
 * CommonFinancialInstrumentAttributes6.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmTaxLotNumber
 * CommonFinancialInstrumentAttributes6.mmTaxLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPoolNumber
 * CommonFinancialInstrumentAttributes6.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmCoveredIndicator
 * CommonFinancialInstrumentAttributes6.mmCoveredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmLegalRestrictions
 * CommonFinancialInstrumentAttributes6.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPositionLimit
 * CommonFinancialInstrumentAttributes6.mmPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmNearTermPositionLimit
 * CommonFinancialInstrumentAttributes6.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmListingDate
 * CommonFinancialInstrumentAttributes6.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmRecordDate
 * CommonFinancialInstrumentAttributes6.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmExpiryDate
 * CommonFinancialInstrumentAttributes6.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPurpose
 * CommonFinancialInstrumentAttributes6.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmClassificationType
 * CommonFinancialInstrumentAttributes6.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmIssuance
 * CommonFinancialInstrumentAttributes6.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmTradingMarket
 * CommonFinancialInstrumentAttributes6.mmTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmSpreadAndBenchmarkCurve
 * CommonFinancialInstrumentAttributes6.mmSpreadAndBenchmarkCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPutType
 * CommonFinancialInstrumentAttributes6.mmPutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmCallType
 * CommonFinancialInstrumentAttributes6.mmCallType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmFungibleIndicator
 * CommonFinancialInstrumentAttributes6.mmFungibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmConfidential
 * CommonFinancialInstrumentAttributes6.mmConfidential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPrivatePlacement
 * CommonFinancialInstrumentAttributes6.mmPrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmConvertibleIndicator
 * CommonFinancialInstrumentAttributes6.mmConvertibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmConversionPeriod
 * CommonFinancialInstrumentAttributes6.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmConversionRatioNumerator
 * CommonFinancialInstrumentAttributes6.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmConversionRatioDenominator
 * CommonFinancialInstrumentAttributes6.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPrimaryPlaceOfDeposit
 * CommonFinancialInstrumentAttributes6.mmPrimaryPlaceOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmTradingMethod
 * CommonFinancialInstrumentAttributes6.mmTradingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmTEFRARule
 * CommonFinancialInstrumentAttributes6.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmSerieNumber
 * CommonFinancialInstrumentAttributes6.mmSerieNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmClass_
 * CommonFinancialInstrumentAttributes6.mmClass_}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmWithholdingTaxRegime
 * CommonFinancialInstrumentAttributes6.mmWithholdingTaxRegime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPaymentStatus
 * CommonFinancialInstrumentAttributes6.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmInitialPhysicalForm
 * CommonFinancialInstrumentAttributes6.mmInitialPhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmAfterExchangePhysicalForm
 * CommonFinancialInstrumentAttributes6.mmAfterExchangePhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmCommonSafekeeper
 * CommonFinancialInstrumentAttributes6.mmCommonSafekeeper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmRedemptionType
 * CommonFinancialInstrumentAttributes6.mmRedemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmRedemptionPaymentCurrency
 * CommonFinancialInstrumentAttributes6.mmRedemptionPaymentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmRestriction
 * CommonFinancialInstrumentAttributes6.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmFinancialInstrumentIdentificationValidity
 * CommonFinancialInstrumentAttributes6.
 * mmFinancialInstrumentIdentificationValidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmSettlementInformation
 * CommonFinancialInstrumentAttributes6.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmFinancialInstrumentForm
 * CommonFinancialInstrumentAttributes6.mmFinancialInstrumentForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmContactName
 * CommonFinancialInstrumentAttributes6.mmContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmLeadManager
 * CommonFinancialInstrumentAttributes6.mmLeadManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPrincipalPayingAgent
 * CommonFinancialInstrumentAttributes6.mmPrincipalPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmPayingAgent
 * CommonFinancialInstrumentAttributes6.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmDepository
 * CommonFinancialInstrumentAttributes6.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmUnderlyingRisk
 * CommonFinancialInstrumentAttributes6.mmUnderlyingRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6#mmSecurityCSDLink
 * CommonFinancialInstrumentAttributes6.mmSecurityCSDLink}</li>
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
 * "CommonFinancialInstrumentAttributes6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes3
 * CommonFinancialInstrumentAttributes3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommonFinancialInstrumentAttributes6", propOrder = {"securityStatus", "financialInstrumentName", "denominationCurrency", "certificateNumber", "contractVersionNumber", "couponAttachedNumber", "taxLotNumber", "poolNumber",
		"coveredIndicator", "legalRestrictions", "positionLimit", "nearTermPositionLimit", "listingDate", "recordDate", "expiryDate", "purpose", "classificationType", "issuance", "tradingMarket", "spreadAndBenchmarkCurve", "putType",
		"callType", "fungibleIndicator", "confidential", "privatePlacement", "convertibleIndicator", "conversionPeriod", "conversionRatioNumerator", "conversionRatioDenominator", "primaryPlaceOfDeposit", "tradingMethod", "tEFRARule",
		"serieNumber", "class_", "withholdingTaxRegime", "paymentStatus", "initialPhysicalForm", "afterExchangePhysicalForm", "commonSafekeeper", "redemptionType", "redemptionPaymentCurrency", "restriction",
		"financialInstrumentIdentificationValidity", "settlementInformation", "financialInstrumentForm", "contactName", "leadManager", "principalPayingAgent", "payingAgent", "depository", "underlyingRisk", "securityCSDLink"})
public class CommonFinancialInstrumentAttributes6 {

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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	@XmlElement(name = "FinInstrmNm")
	protected List<com.tools20022.repository.msg.FinancialInstrumentName1> financialInstrumentName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentName1
	 * FinancialInstrumentName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentName = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentName";
			definition = "Name of the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentName1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	protected Issuance4 issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Issuance4 Issuance4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
			isDerived = false;
			xmlTag = "Issnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Issuance4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	@XmlElement(name = "FinInstrmIdVldty")
	protected List<com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity2> financialInstrumentIdentificationValidity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity2
	 * FinancialInstrumentIdentificationValidity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmIdVldty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationValidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date from which the financial instrument identification is valid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentificationValidity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmIdVldty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationValidity";
			definition = "Specifies the date from which the financial instrument identification is valid.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
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
	@XmlElement(name = "SctyCSDLk")
	protected List<com.tools20022.repository.msg.SecurityCSDLink5> securityCSDLink;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyCSDLk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCSDLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines how the CSD is linked to the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityCSDLink = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmObject();
			isDerived = false;
			xmlTag = "SctyCSDLk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityCSDLink";
			definition = "Defines how the CSD is linked to the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmSecurityStatus, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmFinancialInstrumentName,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmDenominationCurrency, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmCertificateNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmContractVersionNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmCouponAttachedNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmTaxLotNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPoolNumber,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmCoveredIndicator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmLegalRestrictions,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPositionLimit, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmNearTermPositionLimit,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmListingDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmRecordDate,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmExpiryDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPurpose,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmClassificationType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmIssuance,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmTradingMarket, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmSpreadAndBenchmarkCurve,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPutType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmCallType,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmFungibleIndicator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmConfidential,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPrivatePlacement, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmConvertibleIndicator,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmConversionPeriod, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmConversionRatioNumerator,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmConversionRatioDenominator, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPrimaryPlaceOfDeposit,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmTradingMethod, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmTEFRARule,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmSerieNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmClass_,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmWithholdingTaxRegime, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPaymentStatus,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmInitialPhysicalForm, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmAfterExchangePhysicalForm,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmCommonSafekeeper, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmRedemptionType,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmRedemptionPaymentCurrency, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmRestriction,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmFinancialInstrumentIdentificationValidity, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmSettlementInformation,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmFinancialInstrumentForm, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmContactName,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmLeadManager, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPrincipalPayingAgent,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmPayingAgent, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmDepository,
						com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmUnderlyingRisk, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6.mmSecurityCSDLink);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CommonFinancialInstrumentAttributes6";
				definition = "Tangible items of value to a business.";
				previousVersion_lazy = () -> CommonFinancialInstrumentAttributes3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityStatus3Choice> getSecurityStatus() {
		return securityStatus == null ? Optional.empty() : Optional.of(securityStatus);
	}

	public CommonFinancialInstrumentAttributes6 setSecurityStatus(SecurityStatus3Choice securityStatus) {
		this.securityStatus = securityStatus;
		return this;
	}

	public List<FinancialInstrumentName1> getFinancialInstrumentName() {
		return financialInstrumentName == null ? financialInstrumentName = new ArrayList<>() : financialInstrumentName;
	}

	public CommonFinancialInstrumentAttributes6 setFinancialInstrumentName(List<com.tools20022.repository.msg.FinancialInstrumentName1> financialInstrumentName) {
		this.financialInstrumentName = Objects.requireNonNull(financialInstrumentName);
		return this;
	}

	public Optional<CurrencyCode> getDenominationCurrency() {
		return denominationCurrency == null ? Optional.empty() : Optional.of(denominationCurrency);
	}

	public CommonFinancialInstrumentAttributes6 setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
		return this;
	}

	public Optional<Max35Text> getCertificateNumber() {
		return certificateNumber == null ? Optional.empty() : Optional.of(certificateNumber);
	}

	public CommonFinancialInstrumentAttributes6 setCertificateNumber(Max35Text certificateNumber) {
		this.certificateNumber = certificateNumber;
		return this;
	}

	public Optional<Number> getContractVersionNumber() {
		return contractVersionNumber == null ? Optional.empty() : Optional.of(contractVersionNumber);
	}

	public CommonFinancialInstrumentAttributes6 setContractVersionNumber(Number contractVersionNumber) {
		this.contractVersionNumber = contractVersionNumber;
		return this;
	}

	public Optional<Max3NumericText> getCouponAttachedNumber() {
		return couponAttachedNumber == null ? Optional.empty() : Optional.of(couponAttachedNumber);
	}

	public CommonFinancialInstrumentAttributes6 setCouponAttachedNumber(Max3NumericText couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
		return this;
	}

	public Optional<Max15NumericText> getTaxLotNumber() {
		return taxLotNumber == null ? Optional.empty() : Optional.of(taxLotNumber);
	}

	public CommonFinancialInstrumentAttributes6 setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = taxLotNumber;
		return this;
	}

	public Optional<Max15NumericText> getPoolNumber() {
		return poolNumber == null ? Optional.empty() : Optional.of(poolNumber);
	}

	public CommonFinancialInstrumentAttributes6 setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = poolNumber;
		return this;
	}

	public Optional<YesNoIndicator> getCoveredIndicator() {
		return coveredIndicator == null ? Optional.empty() : Optional.of(coveredIndicator);
	}

	public CommonFinancialInstrumentAttributes6 setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = coveredIndicator;
		return this;
	}

	public Optional<LegalRestrictions4Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public CommonFinancialInstrumentAttributes6 setLegalRestrictions(LegalRestrictions4Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getPositionLimit() {
		return positionLimit == null ? Optional.empty() : Optional.of(positionLimit);
	}

	public CommonFinancialInstrumentAttributes6 setPositionLimit(FinancialInstrumentQuantity1Choice positionLimit) {
		this.positionLimit = positionLimit;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getNearTermPositionLimit() {
		return nearTermPositionLimit == null ? Optional.empty() : Optional.of(nearTermPositionLimit);
	}

	public CommonFinancialInstrumentAttributes6 setNearTermPositionLimit(FinancialInstrumentQuantity1Choice nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
		return this;
	}

	public Optional<ISODate> getListingDate() {
		return listingDate == null ? Optional.empty() : Optional.of(listingDate);
	}

	public CommonFinancialInstrumentAttributes6 setListingDate(ISODate listingDate) {
		this.listingDate = listingDate;
		return this;
	}

	public Optional<ISODateTime> getRecordDate() {
		return recordDate == null ? Optional.empty() : Optional.of(recordDate);
	}

	public CommonFinancialInstrumentAttributes6 setRecordDate(ISODateTime recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public CommonFinancialInstrumentAttributes6 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public CommonFinancialInstrumentAttributes6 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<ClassificationType2> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public CommonFinancialInstrumentAttributes6 setClassificationType(com.tools20022.repository.msg.ClassificationType2 classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<Issuance4> getIssuance() {
		return issuance == null ? Optional.empty() : Optional.of(issuance);
	}

	public CommonFinancialInstrumentAttributes6 setIssuance(com.tools20022.repository.msg.Issuance4 issuance) {
		this.issuance = issuance;
		return this;
	}

	public List<TradingParameters1> getTradingMarket() {
		return tradingMarket == null ? tradingMarket = new ArrayList<>() : tradingMarket;
	}

	public CommonFinancialInstrumentAttributes6 setTradingMarket(List<com.tools20022.repository.msg.TradingParameters1> tradingMarket) {
		this.tradingMarket = Objects.requireNonNull(tradingMarket);
		return this;
	}

	public List<BenchmarkCurve4> getSpreadAndBenchmarkCurve() {
		return spreadAndBenchmarkCurve == null ? spreadAndBenchmarkCurve = new ArrayList<>() : spreadAndBenchmarkCurve;
	}

	public CommonFinancialInstrumentAttributes6 setSpreadAndBenchmarkCurve(List<com.tools20022.repository.msg.BenchmarkCurve4> spreadAndBenchmarkCurve) {
		this.spreadAndBenchmarkCurve = Objects.requireNonNull(spreadAndBenchmarkCurve);
		return this;
	}

	public Optional<PutType3Choice> getPutType() {
		return putType == null ? Optional.empty() : Optional.of(putType);
	}

	public CommonFinancialInstrumentAttributes6 setPutType(PutType3Choice putType) {
		this.putType = putType;
		return this;
	}

	public Optional<CallType3Choice> getCallType() {
		return callType == null ? Optional.empty() : Optional.of(callType);
	}

	public CommonFinancialInstrumentAttributes6 setCallType(CallType3Choice callType) {
		this.callType = callType;
		return this;
	}

	public Optional<YesNoIndicator> getFungibleIndicator() {
		return fungibleIndicator == null ? Optional.empty() : Optional.of(fungibleIndicator);
	}

	public CommonFinancialInstrumentAttributes6 setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = fungibleIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getConfidential() {
		return confidential == null ? Optional.empty() : Optional.of(confidential);
	}

	public CommonFinancialInstrumentAttributes6 setConfidential(YesNoIndicator confidential) {
		this.confidential = confidential;
		return this;
	}

	public Optional<YesNoIndicator> getPrivatePlacement() {
		return privatePlacement == null ? Optional.empty() : Optional.of(privatePlacement);
	}

	public CommonFinancialInstrumentAttributes6 setPrivatePlacement(YesNoIndicator privatePlacement) {
		this.privatePlacement = privatePlacement;
		return this;
	}

	public Optional<YesNoIndicator> getConvertibleIndicator() {
		return convertibleIndicator == null ? Optional.empty() : Optional.of(convertibleIndicator);
	}

	public CommonFinancialInstrumentAttributes6 setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
		return this;
	}

	public Optional<DateTimePeriodDetails> getConversionPeriod() {
		return conversionPeriod == null ? Optional.empty() : Optional.of(conversionPeriod);
	}

	public CommonFinancialInstrumentAttributes6 setConversionPeriod(com.tools20022.repository.msg.DateTimePeriodDetails conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConversionRatioNumerator() {
		return conversionRatioNumerator == null ? Optional.empty() : Optional.of(conversionRatioNumerator);
	}

	public CommonFinancialInstrumentAttributes6 setConversionRatioNumerator(FinancialInstrumentQuantity1Choice conversionRatioNumerator) {
		this.conversionRatioNumerator = conversionRatioNumerator;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getConversionRatioDenominator() {
		return conversionRatioDenominator == null ? Optional.empty() : Optional.of(conversionRatioDenominator);
	}

	public CommonFinancialInstrumentAttributes6 setConversionRatioDenominator(FinancialInstrumentQuantity1Choice conversionRatioDenominator) {
		this.conversionRatioDenominator = conversionRatioDenominator;
		return this;
	}

	public Optional<PartyIdentification71Choice> getPrimaryPlaceOfDeposit() {
		return primaryPlaceOfDeposit == null ? Optional.empty() : Optional.of(primaryPlaceOfDeposit);
	}

	public CommonFinancialInstrumentAttributes6 setPrimaryPlaceOfDeposit(PartyIdentification71Choice primaryPlaceOfDeposit) {
		this.primaryPlaceOfDeposit = primaryPlaceOfDeposit;
		return this;
	}

	public Optional<UnitOrFaceAmount1Choice> getTradingMethod() {
		return tradingMethod == null ? Optional.empty() : Optional.of(tradingMethod);
	}

	public CommonFinancialInstrumentAttributes6 setTradingMethod(UnitOrFaceAmount1Choice tradingMethod) {
		this.tradingMethod = tradingMethod;
		return this;
	}

	public Optional<TEFRARules3Choice> getTEFRARule() {
		return tEFRARule == null ? Optional.empty() : Optional.of(tEFRARule);
	}

	public CommonFinancialInstrumentAttributes6 setTEFRARule(TEFRARules3Choice tEFRARule) {
		this.tEFRARule = tEFRARule;
		return this;
	}

	public Optional<Max16Text> getSerieNumber() {
		return serieNumber == null ? Optional.empty() : Optional.of(serieNumber);
	}

	public CommonFinancialInstrumentAttributes6 setSerieNumber(Max16Text serieNumber) {
		this.serieNumber = serieNumber;
		return this;
	}

	public Optional<Max16Text> getClass_() {
		return class_ == null ? Optional.empty() : Optional.of(class_);
	}

	public CommonFinancialInstrumentAttributes6 setClass_(Max16Text class_) {
		this.class_ = class_;
		return this;
	}

	public List<SecurityWithHoldingTax1> getWithholdingTaxRegime() {
		return withholdingTaxRegime == null ? withholdingTaxRegime = new ArrayList<>() : withholdingTaxRegime;
	}

	public CommonFinancialInstrumentAttributes6 setWithholdingTaxRegime(List<com.tools20022.repository.msg.SecurityWithHoldingTax1> withholdingTaxRegime) {
		this.withholdingTaxRegime = Objects.requireNonNull(withholdingTaxRegime);
		return this;
	}

	public Optional<SecuritiesPaymentStatus7Choice> getPaymentStatus() {
		return paymentStatus == null ? Optional.empty() : Optional.of(paymentStatus);
	}

	public CommonFinancialInstrumentAttributes6 setPaymentStatus(SecuritiesPaymentStatus7Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public Optional<InitialPhysicalForm4Choice> getInitialPhysicalForm() {
		return initialPhysicalForm == null ? Optional.empty() : Optional.of(initialPhysicalForm);
	}

	public CommonFinancialInstrumentAttributes6 setInitialPhysicalForm(InitialPhysicalForm4Choice initialPhysicalForm) {
		this.initialPhysicalForm = initialPhysicalForm;
		return this;
	}

	public Optional<InitialPhysicalForm3Choice> getAfterExchangePhysicalForm() {
		return afterExchangePhysicalForm == null ? Optional.empty() : Optional.of(afterExchangePhysicalForm);
	}

	public CommonFinancialInstrumentAttributes6 setAfterExchangePhysicalForm(InitialPhysicalForm3Choice afterExchangePhysicalForm) {
		this.afterExchangePhysicalForm = afterExchangePhysicalForm;
		return this;
	}

	public Optional<AnyBICIdentifier> getCommonSafekeeper() {
		return commonSafekeeper == null ? Optional.empty() : Optional.of(commonSafekeeper);
	}

	public CommonFinancialInstrumentAttributes6 setCommonSafekeeper(AnyBICIdentifier commonSafekeeper) {
		this.commonSafekeeper = commonSafekeeper;
		return this;
	}

	public Optional<MaturityRedemptionType3Choice> getRedemptionType() {
		return redemptionType == null ? Optional.empty() : Optional.of(redemptionType);
	}

	public CommonFinancialInstrumentAttributes6 setRedemptionType(MaturityRedemptionType3Choice redemptionType) {
		this.redemptionType = redemptionType;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRedemptionPaymentCurrency() {
		return redemptionPaymentCurrency == null ? Optional.empty() : Optional.of(redemptionPaymentCurrency);
	}

	public CommonFinancialInstrumentAttributes6 setRedemptionPaymentCurrency(ActiveCurrencyCode redemptionPaymentCurrency) {
		this.redemptionPaymentCurrency = redemptionPaymentCurrency;
		return this;
	}

	public List<SecurityRestriction2> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CommonFinancialInstrumentAttributes6 setRestriction(List<com.tools20022.repository.msg.SecurityRestriction2> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public List<FinancialInstrumentIdentificationValidity2> getFinancialInstrumentIdentificationValidity() {
		return financialInstrumentIdentificationValidity == null ? financialInstrumentIdentificationValidity = new ArrayList<>() : financialInstrumentIdentificationValidity;
	}

	public CommonFinancialInstrumentAttributes6 setFinancialInstrumentIdentificationValidity(List<com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity2> financialInstrumentIdentificationValidity) {
		this.financialInstrumentIdentificationValidity = Objects.requireNonNull(financialInstrumentIdentificationValidity);
		return this;
	}

	public List<SettlementInformation17> getSettlementInformation() {
		return settlementInformation == null ? settlementInformation = new ArrayList<>() : settlementInformation;
	}

	public CommonFinancialInstrumentAttributes6 setSettlementInformation(List<com.tools20022.repository.msg.SettlementInformation17> settlementInformation) {
		this.settlementInformation = Objects.requireNonNull(settlementInformation);
		return this;
	}

	public Optional<FinancialInstrumentForm2> getFinancialInstrumentForm() {
		return financialInstrumentForm == null ? Optional.empty() : Optional.of(financialInstrumentForm);
	}

	public CommonFinancialInstrumentAttributes6 setFinancialInstrumentForm(com.tools20022.repository.msg.FinancialInstrumentForm2 financialInstrumentForm) {
		this.financialInstrumentForm = financialInstrumentForm;
		return this;
	}

	public Optional<Organisation27> getContactName() {
		return contactName == null ? Optional.empty() : Optional.of(contactName);
	}

	public CommonFinancialInstrumentAttributes6 setContactName(com.tools20022.repository.msg.Organisation27 contactName) {
		this.contactName = contactName;
		return this;
	}

	public Optional<Organisation27> getLeadManager() {
		return leadManager == null ? Optional.empty() : Optional.of(leadManager);
	}

	public CommonFinancialInstrumentAttributes6 setLeadManager(com.tools20022.repository.msg.Organisation27 leadManager) {
		this.leadManager = leadManager;
		return this;
	}

	public Optional<Organisation27> getPrincipalPayingAgent() {
		return principalPayingAgent == null ? Optional.empty() : Optional.of(principalPayingAgent);
	}

	public CommonFinancialInstrumentAttributes6 setPrincipalPayingAgent(com.tools20022.repository.msg.Organisation27 principalPayingAgent) {
		this.principalPayingAgent = principalPayingAgent;
		return this;
	}

	public Optional<Organisation27> getPayingAgent() {
		return payingAgent == null ? Optional.empty() : Optional.of(payingAgent);
	}

	public CommonFinancialInstrumentAttributes6 setPayingAgent(com.tools20022.repository.msg.Organisation27 payingAgent) {
		this.payingAgent = payingAgent;
		return this;
	}

	public Optional<Organisation27> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public CommonFinancialInstrumentAttributes6 setDepository(com.tools20022.repository.msg.Organisation27 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<Organisation27> getUnderlyingRisk() {
		return underlyingRisk == null ? Optional.empty() : Optional.of(underlyingRisk);
	}

	public CommonFinancialInstrumentAttributes6 setUnderlyingRisk(com.tools20022.repository.msg.Organisation27 underlyingRisk) {
		this.underlyingRisk = underlyingRisk;
		return this;
	}

	public List<SecurityCSDLink5> getSecurityCSDLink() {
		return securityCSDLink == null ? securityCSDLink = new ArrayList<>() : securityCSDLink;
	}

	public CommonFinancialInstrumentAttributes6 setSecurityCSDLink(List<com.tools20022.repository.msg.SecurityCSDLink5> securityCSDLink) {
		this.securityCSDLink = Objects.requireNonNull(securityCSDLink);
		return this;
	}
}