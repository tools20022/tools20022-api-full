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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding the securities or cash payout.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmPayoutNumber
 * CorporateActionPayout1.mmPayoutNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmPayoutType
 * CorporateActionPayout1.mmPayoutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCCashRate
 * CorporateActionPayout1.mmDTCCashRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmProjectedAmount
 * CorporateActionPayout1.mmProjectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCDisbursedSecurity
 * CorporateActionPayout1.mmDTCDisbursedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCDisbursedSecurityDescription
 * CorporateActionPayout1.mmDTCDisbursedSecurityDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmSubReasonCode
 * CorporateActionPayout1.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCSecurityRate
 * CorporateActionPayout1.mmDTCSecurityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmCashInLieuOfSharePrice
 * CorporateActionPayout1.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmPayingAgent
 * CorporateActionPayout1.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmSecurityIdentification
 * CorporateActionPayout1.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmSecurityDescription
 * CorporateActionPayout1.mmSecurityDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCAssetClass
 * CorporateActionPayout1.mmDTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCAssetType
 * CorporateActionPayout1.mmDTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDeclaredPayableDate
 * CorporateActionPayout1.mmDeclaredPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmEventType
 * CorporateActionPayout1.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmSubEventType
 * CorporateActionPayout1.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmPosition
 * CorporateActionPayout1.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmFractionalPosition
 * CorporateActionPayout1.mmFractionalPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmDTCPositionCaptureDate
 * CorporateActionPayout1.mmDTCPositionCaptureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1#mmParticipantCrossReference
 * CorporateActionPayout1.mmParticipantCrossReference}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPayout1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the securities or cash payout."</li>
 * </ul>
 */
public class CorporateActionPayout1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText payoutNumber;
	/**
	 * Unique number associated with a payout within an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique number associated with a payout within an option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PyoutNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutNumber";
			definition = "Unique number associated with a payout within an option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected DTCCPayoutType2Code payoutType;
	/**
	 * Describes the type of payout associated with the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType2Code
	 * DTCCPayoutType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the type of payout associated with the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Describes the type of payout associated with the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType2Code.mmObject();
		}
	};
	protected DecimalNumber dTCCashRate;
	/**
	 * Rate of the dividend payable in cash at DTC (The Depository Trust
	 * Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCshRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCashRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the dividend payable in cash at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCashRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCCshRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCashRate";
			definition = "Rate of the dividend payable in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber projectedAmount;
	/**
	 * Projected cash amount based on the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrjctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProjectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Projected cash amount based on the entitlement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProjectedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PrjctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProjectedAmount";
			definition = "Projected cash amount based on the entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected CUSIPIdentification1 dTCDisbursedSecurity;
	/**
	 * Security identification that DTC (The Depository Trust Corporation) will
	 * distribute as part of the entitlement. This can be the DTC contra CUSIP
	 * in cases where the payout security is a contra CUSIP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1
	 * CUSIPIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDisbursedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identification that DTC (The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurity";
			definition = "Security identification that DTC (The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
		}
	};
	protected RestrictedFINMax31Text dTCDisbursedSecurityDescription;
	/**
	 * Description of the security that will be disbursed by DTC (The Depository
	 * Trust Corporation) as entitlement for the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax31Text
	 * RestrictedFINMax31Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdSctyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDisbursedSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the security that will be disbursed by DTC (The Depository Trust Corporation) as entitlement for the corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCDisbursedSecurityDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityDescription";
			definition = "Description of the security that will be disbursed by DTC (The Depository Trust Corporation) as entitlement for the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax31Text.mmObject();
		}
	};
	protected Max4AlphaNumericText subReasonCode;
	/**
	 * Sub-reason for the adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-reason for the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Sub-reason for the adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected DecimalNumber dTCSecurityRate;
	/**
	 * Rate of the dividend payable in stock rather than in cash at DTC (The
	 * Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCSctyRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCSecurityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the dividend payable in stock rather than in cash at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCSecurityRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityRate";
			definition = "Rate of the dividend payable in stock rather than in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount cashInLieuOfSharePrice;
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashInLieuOfSharePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected Max8Text payingAgent;
	/**
	 * Paying agent for this corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
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
	 * definition} = "Paying agent for this corporate action event. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayingAgent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Paying agent for this corporate action event. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected CUSIPIdentification1 securityIdentification;
	/**
	 * Identification of the underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1
	 * CUSIPIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the underlying security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of the underlying security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
		}
	};
	protected RestrictedFINMax31Text securityDescription;
	/**
	 * Underlying security description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax31Text
	 * RestrictedFINMax31Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying security description."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SctyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDescription";
			definition = "Underlying security description.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax31Text.mmObject();
		}
	};
	protected AssetClass1Code dTCAssetClass;
	/**
	 * Classification of instruments into asset classes at DTC (The Depository
	 * Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of instruments into asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAssetClass = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}
	};
	protected DTCAssetType1Code dTCAssetType;
	/**
	 * Further classification of instruments into (issue) asset types at DTC
	 * (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAssetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	protected ISODate declaredPayableDate;
	/**
	 * Date at which the movement has been declared payable by the issuer to
	 * take place (cash and/or securities).
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdPyblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredPayableDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DclrdPyblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredPayableDate";
			definition = "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ExtendedEventType1Code eventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action event type name. Used in place for the events that cannot be
	 * classified by ISO Code and are marked as OTHR. Can be used in combination
	 * with DTCC sub event type (when provided) to identify the event. For an
	 * example: a distribution based on recapitalisation event will be presented
	 * as event type: OTHR in standard message. DTCC native event type would be
	 * Distribution (DIST) and DTCC sub event type would be Recapitalisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	protected DTCCSubEventType1Code subEventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type. For an
	 * example: a cash dividend event with currency election will be noted as
	 * event type: Cash Dividend (DVCA) and DTCC sub event type: Currency
	 * Election(CURR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	protected SignedQuantityFormat4 position;
	/**
	 * Total eligible balance for a particular corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total eligible balance for a particular corporate action. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Total eligible balance for a particular corporate action. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	protected SignedQuantityFormat4 fractionalPosition;
	/**
	 * Fractional share quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnlPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fractional share quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFractionalPosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "FrctnlPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalPosition";
			definition = "Fractional share quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	protected ISODate dTCPositionCaptureDate;
	/**
	 * Date when DTC positions are captured and entitlements are calculated in
	 * the system.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPosCaptrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPositionCaptureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when DTC positions are captured and entitlements are calculated in the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPositionCaptureDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCPosCaptrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPositionCaptureDate";
			definition = "Date when DTC positions are captured and entitlements are calculated in the system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max16Text participantCrossReference;
	/**
	 * Transaction identification that participant provides on the
	 * reorganisation deposit.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptCrossRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantCrossReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction identification that participant provides on the reorganisation deposit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParticipantCrossReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PtcptCrossRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantCrossReference";
			definition = "Transaction identification that participant provides on the reorganisation deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPayout1.mmPayoutNumber, CorporateActionPayout1.mmPayoutType, CorporateActionPayout1.mmDTCCashRate, CorporateActionPayout1.mmProjectedAmount,
						CorporateActionPayout1.mmDTCDisbursedSecurity, CorporateActionPayout1.mmDTCDisbursedSecurityDescription, CorporateActionPayout1.mmSubReasonCode, CorporateActionPayout1.mmDTCSecurityRate,
						CorporateActionPayout1.mmCashInLieuOfSharePrice, CorporateActionPayout1.mmPayingAgent, CorporateActionPayout1.mmSecurityIdentification, CorporateActionPayout1.mmSecurityDescription,
						CorporateActionPayout1.mmDTCAssetClass, CorporateActionPayout1.mmDTCAssetType, CorporateActionPayout1.mmDeclaredPayableDate, CorporateActionPayout1.mmEventType, CorporateActionPayout1.mmSubEventType,
						CorporateActionPayout1.mmPosition, CorporateActionPayout1.mmFractionalPosition, CorporateActionPayout1.mmDTCPositionCaptureDate, CorporateActionPayout1.mmParticipantCrossReference);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionPayout1";
				definition = "Provides additional information regarding the securities or cash payout.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getPayoutNumber() {
		return payoutNumber;
	}

	public void setPayoutNumber(Exact3NumericText payoutNumber) {
		this.payoutNumber = payoutNumber;
	}

	public DTCCPayoutType2Code getPayoutType() {
		return payoutType;
	}

	public void setPayoutType(DTCCPayoutType2Code payoutType) {
		this.payoutType = payoutType;
	}

	public DecimalNumber getDTCCashRate() {
		return dTCCashRate;
	}

	public void setDTCCashRate(DecimalNumber dTCCashRate) {
		this.dTCCashRate = dTCCashRate;
	}

	public DecimalNumber getProjectedAmount() {
		return projectedAmount;
	}

	public void setProjectedAmount(DecimalNumber projectedAmount) {
		this.projectedAmount = projectedAmount;
	}

	public CUSIPIdentification1 getDTCDisbursedSecurity() {
		return dTCDisbursedSecurity;
	}

	public void setDTCDisbursedSecurity(com.tools20022.repository.msg.CUSIPIdentification1 dTCDisbursedSecurity) {
		this.dTCDisbursedSecurity = dTCDisbursedSecurity;
	}

	public RestrictedFINMax31Text getDTCDisbursedSecurityDescription() {
		return dTCDisbursedSecurityDescription;
	}

	public void setDTCDisbursedSecurityDescription(RestrictedFINMax31Text dTCDisbursedSecurityDescription) {
		this.dTCDisbursedSecurityDescription = dTCDisbursedSecurityDescription;
	}

	public Max4AlphaNumericText getSubReasonCode() {
		return subReasonCode;
	}

	public void setSubReasonCode(Max4AlphaNumericText subReasonCode) {
		this.subReasonCode = subReasonCode;
	}

	public DecimalNumber getDTCSecurityRate() {
		return dTCSecurityRate;
	}

	public void setDTCSecurityRate(DecimalNumber dTCSecurityRate) {
		this.dTCSecurityRate = dTCSecurityRate;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(RestrictedFINActiveCurrencyAnd13DecimalAmount cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
	}

	public Max8Text getPayingAgent() {
		return payingAgent;
	}

	public void setPayingAgent(Max8Text payingAgent) {
		this.payingAgent = payingAgent;
	}

	public CUSIPIdentification1 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.msg.CUSIPIdentification1 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	public RestrictedFINMax31Text getSecurityDescription() {
		return securityDescription;
	}

	public void setSecurityDescription(RestrictedFINMax31Text securityDescription) {
		this.securityDescription = securityDescription;
	}

	public AssetClass1Code getDTCAssetClass() {
		return dTCAssetClass;
	}

	public void setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
	}

	public DTCAssetType1Code getDTCAssetType() {
		return dTCAssetType;
	}

	public void setDTCAssetType(DTCAssetType1Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
	}

	public ISODate getDeclaredPayableDate() {
		return declaredPayableDate;
	}

	public void setDeclaredPayableDate(ISODate declaredPayableDate) {
		this.declaredPayableDate = declaredPayableDate;
	}

	public ExtendedEventType1Code getEventType() {
		return eventType;
	}

	public void setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
	}

	public DTCCSubEventType1Code getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(DTCCSubEventType1Code subEventType) {
		this.subEventType = subEventType;
	}

	public SignedQuantityFormat4 getPosition() {
		return position;
	}

	public void setPosition(com.tools20022.repository.msg.SignedQuantityFormat4 position) {
		this.position = position;
	}

	public SignedQuantityFormat4 getFractionalPosition() {
		return fractionalPosition;
	}

	public void setFractionalPosition(com.tools20022.repository.msg.SignedQuantityFormat4 fractionalPosition) {
		this.fractionalPosition = fractionalPosition;
	}

	public ISODate getDTCPositionCaptureDate() {
		return dTCPositionCaptureDate;
	}

	public void setDTCPositionCaptureDate(ISODate dTCPositionCaptureDate) {
		this.dTCPositionCaptureDate = dTCPositionCaptureDate;
	}

	public Max16Text getParticipantCrossReference() {
		return participantCrossReference;
	}

	public void setParticipantCrossReference(Max16Text participantCrossReference) {
		this.participantCrossReference = participantCrossReference;
	}
}