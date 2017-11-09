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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmSecurityStatus
 * CommonFinancialInstrumentAttributes2.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmISOSecurityLongName
 * CommonFinancialInstrumentAttributes2.mmISOSecurityLongName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmISOSecurityShortName
 * CommonFinancialInstrumentAttributes2.mmISOSecurityShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmNameValidFrom
 * CommonFinancialInstrumentAttributes2.mmNameValidFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmDenominationCurrency
 * CommonFinancialInstrumentAttributes2.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmCertificateNumber
 * CommonFinancialInstrumentAttributes2.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmContractVersionNumber
 * CommonFinancialInstrumentAttributes2.mmContractVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmCouponAttachedNumber
 * CommonFinancialInstrumentAttributes2.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmTaxLotNumber
 * CommonFinancialInstrumentAttributes2.mmTaxLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPoolNumber
 * CommonFinancialInstrumentAttributes2.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmCoveredIndicator
 * CommonFinancialInstrumentAttributes2.mmCoveredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmLegalRestrictions
 * CommonFinancialInstrumentAttributes2.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPositionLimit
 * CommonFinancialInstrumentAttributes2.mmPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmNearTermPositionLimit
 * CommonFinancialInstrumentAttributes2.mmNearTermPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmListingDate
 * CommonFinancialInstrumentAttributes2.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmRecordDate
 * CommonFinancialInstrumentAttributes2.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmExpiryDate
 * CommonFinancialInstrumentAttributes2.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPurpose
 * CommonFinancialInstrumentAttributes2.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmClassificationType
 * CommonFinancialInstrumentAttributes2.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmIssuance
 * CommonFinancialInstrumentAttributes2.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmTradingMarket
 * CommonFinancialInstrumentAttributes2.mmTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmSpreadAndBenchmarkCurve
 * CommonFinancialInstrumentAttributes2.mmSpreadAndBenchmarkCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPutType
 * CommonFinancialInstrumentAttributes2.mmPutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmCallType
 * CommonFinancialInstrumentAttributes2.mmCallType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmFungibleIndicator
 * CommonFinancialInstrumentAttributes2.mmFungibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmConfidential
 * CommonFinancialInstrumentAttributes2.mmConfidential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPrivatePlacement
 * CommonFinancialInstrumentAttributes2.mmPrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmConvertibleIndicator
 * CommonFinancialInstrumentAttributes2.mmConvertibleIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmConversionPeriod
 * CommonFinancialInstrumentAttributes2.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmConversionRatioNumerator
 * CommonFinancialInstrumentAttributes2.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmConversionRatioDenominator
 * CommonFinancialInstrumentAttributes2.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPrimaryPlaceOfDeposit
 * CommonFinancialInstrumentAttributes2.mmPrimaryPlaceOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmTradingMethod
 * CommonFinancialInstrumentAttributes2.mmTradingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmTEFRARule
 * CommonFinancialInstrumentAttributes2.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmSerieNumber
 * CommonFinancialInstrumentAttributes2.mmSerieNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmClass_
 * CommonFinancialInstrumentAttributes2.mmClass_}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmWithholdingTaxRegime
 * CommonFinancialInstrumentAttributes2.mmWithholdingTaxRegime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPaymentStatus
 * CommonFinancialInstrumentAttributes2.mmPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmInitialPhysicalForm
 * CommonFinancialInstrumentAttributes2.mmInitialPhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmAfterExchangePhysicalForm
 * CommonFinancialInstrumentAttributes2.mmAfterExchangePhysicalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmCommonSafekeeper
 * CommonFinancialInstrumentAttributes2.mmCommonSafekeeper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmRedemptionType
 * CommonFinancialInstrumentAttributes2.mmRedemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmRedemptionPaymentCurrency
 * CommonFinancialInstrumentAttributes2.mmRedemptionPaymentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmRestriction
 * CommonFinancialInstrumentAttributes2.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmFinancialInstrumentIdentification
 * CommonFinancialInstrumentAttributes2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmSettlementInformation
 * CommonFinancialInstrumentAttributes2.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmFinancialInstrumentForm
 * CommonFinancialInstrumentAttributes2.mmFinancialInstrumentForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmContactName
 * CommonFinancialInstrumentAttributes2.mmContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmLeadManager
 * CommonFinancialInstrumentAttributes2.mmLeadManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPrincipalPayingAgent
 * CommonFinancialInstrumentAttributes2.mmPrincipalPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmPayingAgent
 * CommonFinancialInstrumentAttributes2.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmDepository
 * CommonFinancialInstrumentAttributes2.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2#mmUnderlyingRisk
 * CommonFinancialInstrumentAttributes2.mmUnderlyingRisk}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommonFinancialInstrumentAttributes2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * </ul>
 */
public class CommonFinancialInstrumentAttributes2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityStatus2Choice securityStatus;
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityStatus2Choice
	 * SecurityStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySts"</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityStatus2Choice.mmObject();
		}
	};
	protected Max350Text iSOSecurityLongName;
	/**
	 * Name of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Max35Text iSOSecurityShortName;
	/**
	 * Short name of the security expressed as ISO 18773/18774.
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected DateAndDateTimeChoice nameValidFrom;
	/**
	 * Defines the date since when the name of the security is valid.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected CurrencyCode denominationCurrency;
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Max35Text certificateNumber;
	/**
	 * Unique and unambiguous identifier of a certificate assigned by the
	 * issuer.
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Number contractVersionNumber;
	/**
	 * Version number assigned to the contract associated with the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Max3NumericText couponAttachedNumber;
	/**
	 * Number of the coupon attached to the physical security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Max15NumericText taxLotNumber;
	/**
	 * Identification, for tax purposes, of a lot of identical securities that
	 * are bought at a certain date and at a certain price.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Max15NumericText poolNumber;
	/**
	 * Number identifying a group of underlying assets assigned by the issuer of
	 * a factored security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolNb"</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected YesNoIndicator coveredIndicator;
	/**
	 * Indicates whether the derivative product is covered or not by an
	 * underlying financial instrument position.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected LegalRestrictions3Choice legalRestrictions;
	/**
	 * Specifies the regulatory restrictions applicable to a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalRestrictions3Choice
	 * LegalRestrictions3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalRestrictions3Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice positionLimit;
	/**
	 * Position limits are created for the purpose of maintaining stable and
	 * fair markets. Contracts held by one individual investor with different
	 * brokers may be combined in order to gauge accurately the level of control
	 * held by one party.
	 * 
	 * Each option and futures contract will have varying position limits.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosLmt"</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "PosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionLimit";
			definition = "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice nearTermPositionLimit;
	/**
	 * Near-term position limit for the instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NearTermPosLmt"</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "NearTermPosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Near-term position limit for the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected ISODate listingDate;
	/**
	 * Original Date/time at which the security is listed at the specific
	 * exchange or trading venue.
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected ISODateTime recordDate;
	/**
	 * Date/time at which positions are struck to note which parties are
	 * entitled to receive the entitlement to a corporate event or vote at a
	 * meeting.
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected ISODate expiryDate;
	/**
	 * Date on which a privilege expires.
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Max256Text purpose;
	/**
	 * Reason for which money is raised through the issuance of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected ClassificationType1 classificationType;
	/**
	 * Information allowing the classification of a financial instrument, for
	 * example, with its ISO CFI (Classification of Financial Instrument) or
	 * product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1
	 * ClassificationType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Information allowing the classification of a financial instrument, for example, with its ISO CFI (Classification of Financial Instrument) or product type.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ClassificationType1.mmObject();
		}
	};
	protected Issuance1 issuance;
	/**
	 * Details regarding the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Issuance1 Issuance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "Issnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Issuance1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TradingParameters1> tradingMarket;
	/**
	 * Market(s) on which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingParameters1
	 * TradingParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected List<com.tools20022.repository.msg.BenchmarkCurve2> spreadAndBenchmarkCurve;
	/**
	 * Indicates the spread to benchmark details of an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve2
	 * BenchmarkCurve2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurve";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve2.mmObject();
		}
	};
	protected PutType2Choice putType;
	/**
	 * Represents the type of put.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PutType2Choice
	 * PutType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "PutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutType";
			definition = "Represents the type of put.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PutType2Choice.mmObject();
		}
	};
	protected CallType2Choice callType;
	/**
	 * Represents the type of call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CallType2Choice
	 * CallType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "CallTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallType";
			definition = "Represents the type of call.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CallType2Choice.mmObject();
		}
	};
	protected YesNoIndicator fungibleIndicator;
	/**
	 * Indicates whether a security is interchangeable, ie, the security is
	 * allowed to be replaced by another security, without loss of value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected YesNoIndicator confidential;
	/**
	 * Indicates wheter the details of the security are to be made available to
	 * the market, or kept private between ICSDs and agency network.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected YesNoIndicator privatePlacement;
	/**
	 * The sale of securities directly to private persons, institutional
	 * investors, or both outside a public offering. Such non-public deals
	 * (often without a publicly available prospectus) closing through the ICSDs
	 * are placed directly with investors.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected YesNoIndicator convertibleIndicator;
	/**
	 * Indicates whether the investor or the issuer has a conversion option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected DateTimePeriodDetails conversionPeriod;
	/**
	 * Period during which a convertible security may be converted according to
	 * the terms of the issue.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected FinancialInstrumentQuantity1Choice conversionRatioNumerator;
	/**
	 * Number of target securities for the conversion.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected FinancialInstrumentQuantity1Choice conversionRatioDenominator;
	/**
	 * Number of held securities for the conversion.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected PartyIdentification71Choice primaryPlaceOfDeposit;
	/**
	 * Primary place of deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected UnitOrFaceAmount1Choice tradingMethod;
	/**
	 * Indicates whether the notional amount value is to be traded in either an
	 * amount or in units.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected TEFRARules2Choice tEFRARule;
	/**
	 * Indicates the TEFRA rule under which the security is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TEFRARules2Choice
	 * TEFRARules2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "TEFRARule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TEFRARules2Choice.mmObject();
		}
	};
	protected Max16Text serieNumber;
	/**
	 * Identifies the series number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected Max16Text class_;
	/**
	 * Identifier that links multiple security classes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected List<com.tools20022.repository.msg.SecurityWithHoldingTax1> withholdingTaxRegime;
	/**
	 * Amount or percentage of a cash distribution that will be withheld by a
	 * tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityWithHoldingTax1
	 * SecurityWithHoldingTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected SecuritiesPaymentStatus4Choice paymentStatus;
	/**
	 * Status of payment of a security at a particular time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesPaymentStatus4Choice
	 * SecuritiesPaymentStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesPaymentStatus4Choice.mmObject();
		}
	};
	protected InitialPhysicalForm2Choice initialPhysicalForm;
	/**
	 * Indicates the physical form of the securities on the closing date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InitialPhysicalForm2Choice
	 * InitialPhysicalForm2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "InitlPhysForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialPhysicalForm";
			definition = "Indicates the physical form of the securities on the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InitialPhysicalForm2Choice.mmObject();
		}
	};
	protected InitialPhysicalForm1Choice afterExchangePhysicalForm;
	/**
	 * Indicates the physical form of the securities after the exchange of the
	 * initial certificate issued on the closing date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InitialPhysicalForm1Choice
	 * InitialPhysicalForm1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "AftrXchgPhysForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterExchangePhysicalForm";
			definition = "Indicates the physical form of the securities after the exchange of the initial certificate issued on the closing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InitialPhysicalForm1Choice.mmObject();
		}
	};
	protected AnyBICIdentifier commonSafekeeper;
	/**
	 * Entity appointed by the ICSDs to provide safekeeping for securities in
	 * new global note (NGN) form.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected MaturityRedemptionType2Choice redemptionType;
	/**
	 * Indicates the type of redemption at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MaturityRedemptionType2Choice
	 * MaturityRedemptionType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "RedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionType";
			definition = "Indicates the type of redemption at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MaturityRedemptionType2Choice.mmObject();
		}
	};
	protected ActiveCurrencyCode redemptionPaymentCurrency;
	/**
	 * ISO currency for the payment of the cash proceeds.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
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
	protected List<com.tools20022.repository.msg.SecurityRestriction1> restriction;
	/**
	 * Regulatory restriction(s) linked to the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityRestriction1
	 * SecurityRestriction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityRestriction1.mmObject();
		}
	};
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Way(s) of identifying the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementInformation4> settlementInformation;
	/**
	 * Settlement of the securities in a securities transaction, that is, the
	 * instruction to deliver or receive securities, involving the payment of an
	 * amount of money or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "SttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInformation";
			definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementInformation4.mmObject();
		}
	};
	protected FinancialInstrumentForm1 financialInstrumentForm;
	/**
	 * Indicates the form of the financial Instrument
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm1
	 * FinancialInstrumentForm1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
	 * definition} = "Indicates the form of the financial Instrument"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentForm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentForm";
			definition = "Indicates the form of the financial Instrument";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentForm1.mmObject();
		}
	};
	protected Organisation2 contactName;
	/**
	 * Details (name, e-mail address and/or telephone number) of the person
	 * requesting the allocation of the ISIN used as a point of reference in
	 * case further clarifications are required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "CtctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactName";
			definition = "Details (name, e-mail address and/or telephone number) of the person requesting the allocation of the ISIN used as a point of reference in case further clarifications are required.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};
	protected Organisation2 leadManager;
	/**
	 * Entity appointed by the issuer to structure and lead the placement of a
	 * syndicated issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "LeadMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadManager";
			definition = "Entity appointed by the issuer to structure and lead the placement of a syndicated issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};
	protected Organisation2 principalPayingAgent;
	/**
	 * Main party appointed to distribute payment or securities on behalf of the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "PrncplPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalPayingAgent";
			definition = "Main party appointed to distribute payment or securities on behalf of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};
	protected Organisation2 payingAgent;
	/**
	 * Additional party appointed to distribute payment or securities on behalf
	 * of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Additional party appointed to distribute payment or securities on behalf of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};
	protected Organisation2 depository;
	/**
	 * Entity appointed by the relevant clearing system as a depository for
	 * instruments issued in global or definitive form. The depository keeps the
	 * securities for safekeeping purposes on behalf of the clearing system(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "Entity appointed by the relevant clearing system as a depository for instruments issued in global or definitive form. The depository keeps the securities for safekeeping purposes on behalf of the clearing system(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};
	protected Organisation2 underlyingRisk;
	/**
	 * Entity(ies), asset(s) or security(ies) on which the credit responsibility
	 * lies as identified in the documentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes2
	 * CommonFinancialInstrumentAttributes2}</li>
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
			componentContext_lazy = () -> CommonFinancialInstrumentAttributes2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingRisk";
			definition = "Entity(ies), asset(s) or security(ies) on which the credit responsibility lies as identified in the documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CommonFinancialInstrumentAttributes2.mmSecurityStatus, CommonFinancialInstrumentAttributes2.mmISOSecurityLongName, CommonFinancialInstrumentAttributes2.mmISOSecurityShortName,
						CommonFinancialInstrumentAttributes2.mmNameValidFrom, CommonFinancialInstrumentAttributes2.mmDenominationCurrency, CommonFinancialInstrumentAttributes2.mmCertificateNumber,
						CommonFinancialInstrumentAttributes2.mmContractVersionNumber, CommonFinancialInstrumentAttributes2.mmCouponAttachedNumber, CommonFinancialInstrumentAttributes2.mmTaxLotNumber,
						CommonFinancialInstrumentAttributes2.mmPoolNumber, CommonFinancialInstrumentAttributes2.mmCoveredIndicator, CommonFinancialInstrumentAttributes2.mmLegalRestrictions,
						CommonFinancialInstrumentAttributes2.mmPositionLimit, CommonFinancialInstrumentAttributes2.mmNearTermPositionLimit, CommonFinancialInstrumentAttributes2.mmListingDate,
						CommonFinancialInstrumentAttributes2.mmRecordDate, CommonFinancialInstrumentAttributes2.mmExpiryDate, CommonFinancialInstrumentAttributes2.mmPurpose, CommonFinancialInstrumentAttributes2.mmClassificationType,
						CommonFinancialInstrumentAttributes2.mmIssuance, CommonFinancialInstrumentAttributes2.mmTradingMarket, CommonFinancialInstrumentAttributes2.mmSpreadAndBenchmarkCurve, CommonFinancialInstrumentAttributes2.mmPutType,
						CommonFinancialInstrumentAttributes2.mmCallType, CommonFinancialInstrumentAttributes2.mmFungibleIndicator, CommonFinancialInstrumentAttributes2.mmConfidential,
						CommonFinancialInstrumentAttributes2.mmPrivatePlacement, CommonFinancialInstrumentAttributes2.mmConvertibleIndicator, CommonFinancialInstrumentAttributes2.mmConversionPeriod,
						CommonFinancialInstrumentAttributes2.mmConversionRatioNumerator, CommonFinancialInstrumentAttributes2.mmConversionRatioDenominator, CommonFinancialInstrumentAttributes2.mmPrimaryPlaceOfDeposit,
						CommonFinancialInstrumentAttributes2.mmTradingMethod, CommonFinancialInstrumentAttributes2.mmTEFRARule, CommonFinancialInstrumentAttributes2.mmSerieNumber, CommonFinancialInstrumentAttributes2.mmClass_,
						CommonFinancialInstrumentAttributes2.mmWithholdingTaxRegime, CommonFinancialInstrumentAttributes2.mmPaymentStatus, CommonFinancialInstrumentAttributes2.mmInitialPhysicalForm,
						CommonFinancialInstrumentAttributes2.mmAfterExchangePhysicalForm, CommonFinancialInstrumentAttributes2.mmCommonSafekeeper, CommonFinancialInstrumentAttributes2.mmRedemptionType,
						CommonFinancialInstrumentAttributes2.mmRedemptionPaymentCurrency, CommonFinancialInstrumentAttributes2.mmRestriction, CommonFinancialInstrumentAttributes2.mmFinancialInstrumentIdentification,
						CommonFinancialInstrumentAttributes2.mmSettlementInformation, CommonFinancialInstrumentAttributes2.mmFinancialInstrumentForm, CommonFinancialInstrumentAttributes2.mmContactName,
						CommonFinancialInstrumentAttributes2.mmLeadManager, CommonFinancialInstrumentAttributes2.mmPrincipalPayingAgent, CommonFinancialInstrumentAttributes2.mmPayingAgent, CommonFinancialInstrumentAttributes2.mmDepository,
						CommonFinancialInstrumentAttributes2.mmUnderlyingRisk);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CommonFinancialInstrumentAttributes2";
				definition = "Tangible items of value to a business.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityStatus2Choice getSecurityStatus() {
		return securityStatus;
	}

	public void setSecurityStatus(SecurityStatus2Choice securityStatus) {
		this.securityStatus = securityStatus;
	}

	public Max350Text getISOSecurityLongName() {
		return iSOSecurityLongName;
	}

	public void setISOSecurityLongName(Max350Text iSOSecurityLongName) {
		this.iSOSecurityLongName = iSOSecurityLongName;
	}

	public Max35Text getISOSecurityShortName() {
		return iSOSecurityShortName;
	}

	public void setISOSecurityShortName(Max35Text iSOSecurityShortName) {
		this.iSOSecurityShortName = iSOSecurityShortName;
	}

	public DateAndDateTimeChoice getNameValidFrom() {
		return nameValidFrom;
	}

	public void setNameValidFrom(DateAndDateTimeChoice nameValidFrom) {
		this.nameValidFrom = nameValidFrom;
	}

	public CurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	public Max35Text getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(Max35Text certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public Number getContractVersionNumber() {
		return contractVersionNumber;
	}

	public void setContractVersionNumber(Number contractVersionNumber) {
		this.contractVersionNumber = contractVersionNumber;
	}

	public Max3NumericText getCouponAttachedNumber() {
		return couponAttachedNumber;
	}

	public void setCouponAttachedNumber(Max3NumericText couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
	}

	public Max15NumericText getTaxLotNumber() {
		return taxLotNumber;
	}

	public void setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = taxLotNumber;
	}

	public Max15NumericText getPoolNumber() {
		return poolNumber;
	}

	public void setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = poolNumber;
	}

	public YesNoIndicator getCoveredIndicator() {
		return coveredIndicator;
	}

	public void setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = coveredIndicator;
	}

	public LegalRestrictions3Choice getLegalRestrictions() {
		return legalRestrictions;
	}

	public void setLegalRestrictions(LegalRestrictions3Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
	}

	public FinancialInstrumentQuantity1Choice getPositionLimit() {
		return positionLimit;
	}

	public void setPositionLimit(FinancialInstrumentQuantity1Choice positionLimit) {
		this.positionLimit = positionLimit;
	}

	public FinancialInstrumentQuantity1Choice getNearTermPositionLimit() {
		return nearTermPositionLimit;
	}

	public void setNearTermPositionLimit(FinancialInstrumentQuantity1Choice nearTermPositionLimit) {
		this.nearTermPositionLimit = nearTermPositionLimit;
	}

	public ISODate getListingDate() {
		return listingDate;
	}

	public void setListingDate(ISODate listingDate) {
		this.listingDate = listingDate;
	}

	public ISODateTime getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(ISODateTime recordDate) {
		this.recordDate = recordDate;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Max256Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max256Text purpose) {
		this.purpose = purpose;
	}

	public ClassificationType1 getClassificationType() {
		return classificationType;
	}

	public void setClassificationType(com.tools20022.repository.msg.ClassificationType1 classificationType) {
		this.classificationType = classificationType;
	}

	public Issuance1 getIssuance() {
		return issuance;
	}

	public void setIssuance(com.tools20022.repository.msg.Issuance1 issuance) {
		this.issuance = issuance;
	}

	public List<TradingParameters1> getTradingMarket() {
		return tradingMarket;
	}

	public void setTradingMarket(List<com.tools20022.repository.msg.TradingParameters1> tradingMarket) {
		this.tradingMarket = tradingMarket;
	}

	public List<BenchmarkCurve2> getSpreadAndBenchmarkCurve() {
		return spreadAndBenchmarkCurve;
	}

	public void setSpreadAndBenchmarkCurve(List<com.tools20022.repository.msg.BenchmarkCurve2> spreadAndBenchmarkCurve) {
		this.spreadAndBenchmarkCurve = spreadAndBenchmarkCurve;
	}

	public PutType2Choice getPutType() {
		return putType;
	}

	public void setPutType(PutType2Choice putType) {
		this.putType = putType;
	}

	public CallType2Choice getCallType() {
		return callType;
	}

	public void setCallType(CallType2Choice callType) {
		this.callType = callType;
	}

	public YesNoIndicator getFungibleIndicator() {
		return fungibleIndicator;
	}

	public void setFungibleIndicator(YesNoIndicator fungibleIndicator) {
		this.fungibleIndicator = fungibleIndicator;
	}

	public YesNoIndicator getConfidential() {
		return confidential;
	}

	public void setConfidential(YesNoIndicator confidential) {
		this.confidential = confidential;
	}

	public YesNoIndicator getPrivatePlacement() {
		return privatePlacement;
	}

	public void setPrivatePlacement(YesNoIndicator privatePlacement) {
		this.privatePlacement = privatePlacement;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
	}

	public DateTimePeriodDetails getConversionPeriod() {
		return conversionPeriod;
	}

	public void setConversionPeriod(com.tools20022.repository.msg.DateTimePeriodDetails conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
	}

	public FinancialInstrumentQuantity1Choice getConversionRatioNumerator() {
		return conversionRatioNumerator;
	}

	public void setConversionRatioNumerator(FinancialInstrumentQuantity1Choice conversionRatioNumerator) {
		this.conversionRatioNumerator = conversionRatioNumerator;
	}

	public FinancialInstrumentQuantity1Choice getConversionRatioDenominator() {
		return conversionRatioDenominator;
	}

	public void setConversionRatioDenominator(FinancialInstrumentQuantity1Choice conversionRatioDenominator) {
		this.conversionRatioDenominator = conversionRatioDenominator;
	}

	public PartyIdentification71Choice getPrimaryPlaceOfDeposit() {
		return primaryPlaceOfDeposit;
	}

	public void setPrimaryPlaceOfDeposit(PartyIdentification71Choice primaryPlaceOfDeposit) {
		this.primaryPlaceOfDeposit = primaryPlaceOfDeposit;
	}

	public UnitOrFaceAmount1Choice getTradingMethod() {
		return tradingMethod;
	}

	public void setTradingMethod(UnitOrFaceAmount1Choice tradingMethod) {
		this.tradingMethod = tradingMethod;
	}

	public TEFRARules2Choice getTEFRARule() {
		return tEFRARule;
	}

	public void setTEFRARule(TEFRARules2Choice tEFRARule) {
		this.tEFRARule = tEFRARule;
	}

	public Max16Text getSerieNumber() {
		return serieNumber;
	}

	public void setSerieNumber(Max16Text serieNumber) {
		this.serieNumber = serieNumber;
	}

	public Max16Text getClass_() {
		return class_;
	}

	public void setClass_(Max16Text class_) {
		this.class_ = class_;
	}

	public List<SecurityWithHoldingTax1> getWithholdingTaxRegime() {
		return withholdingTaxRegime;
	}

	public void setWithholdingTaxRegime(List<com.tools20022.repository.msg.SecurityWithHoldingTax1> withholdingTaxRegime) {
		this.withholdingTaxRegime = withholdingTaxRegime;
	}

	public SecuritiesPaymentStatus4Choice getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(SecuritiesPaymentStatus4Choice paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public InitialPhysicalForm2Choice getInitialPhysicalForm() {
		return initialPhysicalForm;
	}

	public void setInitialPhysicalForm(InitialPhysicalForm2Choice initialPhysicalForm) {
		this.initialPhysicalForm = initialPhysicalForm;
	}

	public InitialPhysicalForm1Choice getAfterExchangePhysicalForm() {
		return afterExchangePhysicalForm;
	}

	public void setAfterExchangePhysicalForm(InitialPhysicalForm1Choice afterExchangePhysicalForm) {
		this.afterExchangePhysicalForm = afterExchangePhysicalForm;
	}

	public AnyBICIdentifier getCommonSafekeeper() {
		return commonSafekeeper;
	}

	public void setCommonSafekeeper(AnyBICIdentifier commonSafekeeper) {
		this.commonSafekeeper = commonSafekeeper;
	}

	public MaturityRedemptionType2Choice getRedemptionType() {
		return redemptionType;
	}

	public void setRedemptionType(MaturityRedemptionType2Choice redemptionType) {
		this.redemptionType = redemptionType;
	}

	public ActiveCurrencyCode getRedemptionPaymentCurrency() {
		return redemptionPaymentCurrency;
	}

	public void setRedemptionPaymentCurrency(ActiveCurrencyCode redemptionPaymentCurrency) {
		this.redemptionPaymentCurrency = redemptionPaymentCurrency;
	}

	public List<SecurityRestriction1> getRestriction() {
		return restriction;
	}

	public void setRestriction(List<com.tools20022.repository.msg.SecurityRestriction1> restriction) {
		this.restriction = restriction;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	public List<SettlementInformation4> getSettlementInformation() {
		return settlementInformation;
	}

	public void setSettlementInformation(List<com.tools20022.repository.msg.SettlementInformation4> settlementInformation) {
		this.settlementInformation = settlementInformation;
	}

	public FinancialInstrumentForm1 getFinancialInstrumentForm() {
		return financialInstrumentForm;
	}

	public void setFinancialInstrumentForm(com.tools20022.repository.msg.FinancialInstrumentForm1 financialInstrumentForm) {
		this.financialInstrumentForm = financialInstrumentForm;
	}

	public Organisation2 getContactName() {
		return contactName;
	}

	public void setContactName(com.tools20022.repository.msg.Organisation2 contactName) {
		this.contactName = contactName;
	}

	public Organisation2 getLeadManager() {
		return leadManager;
	}

	public void setLeadManager(com.tools20022.repository.msg.Organisation2 leadManager) {
		this.leadManager = leadManager;
	}

	public Organisation2 getPrincipalPayingAgent() {
		return principalPayingAgent;
	}

	public void setPrincipalPayingAgent(com.tools20022.repository.msg.Organisation2 principalPayingAgent) {
		this.principalPayingAgent = principalPayingAgent;
	}

	public Organisation2 getPayingAgent() {
		return payingAgent;
	}

	public void setPayingAgent(com.tools20022.repository.msg.Organisation2 payingAgent) {
		this.payingAgent = payingAgent;
	}

	public Organisation2 getDepository() {
		return depository;
	}

	public void setDepository(com.tools20022.repository.msg.Organisation2 depository) {
		this.depository = depository;
	}

	public Organisation2 getUnderlyingRisk() {
		return underlyingRisk;
	}

	public void setUnderlyingRisk(com.tools20022.repository.msg.Organisation2 underlyingRisk) {
		this.underlyingRisk = underlyingRisk;
	}
}