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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPayout1", propOrder = {"payoutNumber", "payoutType", "dTCCashRate", "projectedAmount", "dTCDisbursedSecurity", "dTCDisbursedSecurityDescription", "subReasonCode", "dTCSecurityRate", "cashInLieuOfSharePrice",
		"payingAgent", "securityIdentification", "securityDescription", "dTCAssetClass", "dTCAssetType", "declaredPayableDate", "eventType", "subEventType", "position", "fractionalPosition", "dTCPositionCaptureDate",
		"participantCrossReference"})
public class CorporateActionPayout1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PyoutNb", required = true)
	protected Exact3NumericText payoutNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout Number</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PyoutNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutNumber";
			definition = "Unique number associated with a payout within an option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	@XmlElement(name = "PyoutTp", required = true)
	protected DTCCPayoutType2Code payoutType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout Type</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Describes the type of payout associated with the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType2Code.mmObject();
		}
	};
	@XmlElement(name = "DTCCshRate")
	protected DecimalNumber dTCCashRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Cash Rate</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCCshRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Cash Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCashRate";
			definition = "Rate of the dividend payable in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PrjctdAmt")
	protected DecimalNumber projectedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Projected Amount</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PrjctdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Projected Amount"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProjectedAmount";
			definition = "Projected cash amount based on the entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "DTCDsbrsdScty")
	protected CUSIPIdentification1 dTCDisbursedSecurity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Security ID</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdScty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Security ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurity";
			definition = "Security identification that DTC (The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
		}
	};
	@XmlElement(name = "DTCDsbrsdSctyDesc")
	protected RestrictedFINMax31Text dTCDisbursedSecurityDescription;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Description (DTC Disbursed
	 * Security)</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Description (DTC Disbursed Security)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityDescription";
			definition = "Description of the security that will be disbursed by DTC (The Depository Trust Corporation) as entitlement for the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax31Text.mmObject();
		}
	};
	@XmlElement(name = "SubRsnCd", required = true)
	protected Max4AlphaNumericText subReasonCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Sub Reason Code</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Sub Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Sub-reason for the adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "DTCSctyRate")
	protected DecimalNumber dTCSecurityRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Security Rate</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Security Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityRate";
			definition = "Rate of the dividend payable in stock rather than in cash at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "CshInLieuOfShrPric")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Cash In Lieu Of Share Price</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Cash In Lieu Of Share Price"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "PngAgt")
	protected Max8Text payingAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Paying Agent</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PngAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Paying Agent"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Paying agent for this corporate action event. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	@XmlElement(name = "SctyId", required = true)
	protected CUSIPIdentification1 securityIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Identification</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of the underlying security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
		}
	};
	@XmlElement(name = "SctyDesc")
	protected RestrictedFINMax31Text securityDescription;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Description</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SctyDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Description"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDescription";
			definition = "Underlying security description.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax31Text.mmObject();
		}
	};
	@XmlElement(name = "DTCAsstClss")
	protected AssetClass1Code dTCAssetClass;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Asset Class</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Class"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCAsstTp")
	protected DTCAssetType1Code dTCAssetType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Asset Type</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType1Code.mmObject();
		}
	};
	@XmlElement(name = "DclrdPyblDt")
	protected ISODate declaredPayableDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdPyblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Payable Date</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DclrdPyblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredPayableDate";
			definition = "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "EvtTp")
	protected ExtendedEventType1Code eventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Type</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	@XmlElement(name = "SubEvtTp")
	protected DTCCSubEventType1Code subEventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Sub Event Type</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Sub Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	@XmlElement(name = "Pos")
	protected SignedQuantityFormat4 position;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Position</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Position"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Total eligible balance for a particular corporate action. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "FrctnlPos")
	protected SignedQuantityFormat4 fractionalPosition;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Fractional Position</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "FrctnlPos";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Fractional Position"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalPosition";
			definition = "Fractional share quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "DTCPosCaptrDt")
	protected ISODate dTCPositionCaptureDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPosCaptrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Position Capture Date</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "DTCPosCaptrDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Position Capture Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPositionCaptureDate";
			definition = "Date when DTC positions are captured and entitlements are calculated in the system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "PtcptCrossRef")
	protected Max16Text participantCrossReference;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPayout1
	 * CorporateActionPayout1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptCrossRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Participant Cross Reference</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPayout1.mmObject();
			isDerived = false;
			xmlTag = "PtcptCrossRef";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Participant Cross Reference"));
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPayout1.mmPayoutNumber, com.tools20022.repository.msg.CorporateActionPayout1.mmPayoutType,
						com.tools20022.repository.msg.CorporateActionPayout1.mmDTCCashRate, com.tools20022.repository.msg.CorporateActionPayout1.mmProjectedAmount,
						com.tools20022.repository.msg.CorporateActionPayout1.mmDTCDisbursedSecurity, com.tools20022.repository.msg.CorporateActionPayout1.mmDTCDisbursedSecurityDescription,
						com.tools20022.repository.msg.CorporateActionPayout1.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionPayout1.mmDTCSecurityRate,
						com.tools20022.repository.msg.CorporateActionPayout1.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPayout1.mmPayingAgent,
						com.tools20022.repository.msg.CorporateActionPayout1.mmSecurityIdentification, com.tools20022.repository.msg.CorporateActionPayout1.mmSecurityDescription,
						com.tools20022.repository.msg.CorporateActionPayout1.mmDTCAssetClass, com.tools20022.repository.msg.CorporateActionPayout1.mmDTCAssetType, com.tools20022.repository.msg.CorporateActionPayout1.mmDeclaredPayableDate,
						com.tools20022.repository.msg.CorporateActionPayout1.mmEventType, com.tools20022.repository.msg.CorporateActionPayout1.mmSubEventType, com.tools20022.repository.msg.CorporateActionPayout1.mmPosition,
						com.tools20022.repository.msg.CorporateActionPayout1.mmFractionalPosition, com.tools20022.repository.msg.CorporateActionPayout1.mmDTCPositionCaptureDate,
						com.tools20022.repository.msg.CorporateActionPayout1.mmParticipantCrossReference);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public CorporateActionPayout1 setPayoutNumber(Exact3NumericText payoutNumber) {
		this.payoutNumber = Objects.requireNonNull(payoutNumber);
		return this;
	}

	public DTCCPayoutType2Code getPayoutType() {
		return payoutType;
	}

	public CorporateActionPayout1 setPayoutType(DTCCPayoutType2Code payoutType) {
		this.payoutType = Objects.requireNonNull(payoutType);
		return this;
	}

	public Optional<DecimalNumber> getDTCCashRate() {
		return dTCCashRate == null ? Optional.empty() : Optional.of(dTCCashRate);
	}

	public CorporateActionPayout1 setDTCCashRate(DecimalNumber dTCCashRate) {
		this.dTCCashRate = dTCCashRate;
		return this;
	}

	public Optional<DecimalNumber> getProjectedAmount() {
		return projectedAmount == null ? Optional.empty() : Optional.of(projectedAmount);
	}

	public CorporateActionPayout1 setProjectedAmount(DecimalNumber projectedAmount) {
		this.projectedAmount = projectedAmount;
		return this;
	}

	public Optional<CUSIPIdentification1> getDTCDisbursedSecurity() {
		return dTCDisbursedSecurity == null ? Optional.empty() : Optional.of(dTCDisbursedSecurity);
	}

	public CorporateActionPayout1 setDTCDisbursedSecurity(com.tools20022.repository.msg.CUSIPIdentification1 dTCDisbursedSecurity) {
		this.dTCDisbursedSecurity = dTCDisbursedSecurity;
		return this;
	}

	public Optional<RestrictedFINMax31Text> getDTCDisbursedSecurityDescription() {
		return dTCDisbursedSecurityDescription == null ? Optional.empty() : Optional.of(dTCDisbursedSecurityDescription);
	}

	public CorporateActionPayout1 setDTCDisbursedSecurityDescription(RestrictedFINMax31Text dTCDisbursedSecurityDescription) {
		this.dTCDisbursedSecurityDescription = dTCDisbursedSecurityDescription;
		return this;
	}

	public Max4AlphaNumericText getSubReasonCode() {
		return subReasonCode;
	}

	public CorporateActionPayout1 setSubReasonCode(Max4AlphaNumericText subReasonCode) {
		this.subReasonCode = Objects.requireNonNull(subReasonCode);
		return this;
	}

	public Optional<DecimalNumber> getDTCSecurityRate() {
		return dTCSecurityRate == null ? Optional.empty() : Optional.of(dTCSecurityRate);
	}

	public CorporateActionPayout1 setDTCSecurityRate(DecimalNumber dTCSecurityRate) {
		this.dTCSecurityRate = dTCSecurityRate;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPayout1 setCashInLieuOfSharePrice(RestrictedFINActiveCurrencyAnd13DecimalAmount cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<Max8Text> getPayingAgent() {
		return payingAgent == null ? Optional.empty() : Optional.of(payingAgent);
	}

	public CorporateActionPayout1 setPayingAgent(Max8Text payingAgent) {
		this.payingAgent = payingAgent;
		return this;
	}

	public CUSIPIdentification1 getSecurityIdentification() {
		return securityIdentification;
	}

	public CorporateActionPayout1 setSecurityIdentification(com.tools20022.repository.msg.CUSIPIdentification1 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public Optional<RestrictedFINMax31Text> getSecurityDescription() {
		return securityDescription == null ? Optional.empty() : Optional.of(securityDescription);
	}

	public CorporateActionPayout1 setSecurityDescription(RestrictedFINMax31Text securityDescription) {
		this.securityDescription = securityDescription;
		return this;
	}

	public Optional<AssetClass1Code> getDTCAssetClass() {
		return dTCAssetClass == null ? Optional.empty() : Optional.of(dTCAssetClass);
	}

	public CorporateActionPayout1 setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
		return this;
	}

	public Optional<DTCAssetType1Code> getDTCAssetType() {
		return dTCAssetType == null ? Optional.empty() : Optional.of(dTCAssetType);
	}

	public CorporateActionPayout1 setDTCAssetType(DTCAssetType1Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
		return this;
	}

	public Optional<ISODate> getDeclaredPayableDate() {
		return declaredPayableDate == null ? Optional.empty() : Optional.of(declaredPayableDate);
	}

	public CorporateActionPayout1 setDeclaredPayableDate(ISODate declaredPayableDate) {
		this.declaredPayableDate = declaredPayableDate;
		return this;
	}

	public Optional<ExtendedEventType1Code> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public CorporateActionPayout1 setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
		return this;
	}

	public Optional<DTCCSubEventType1Code> getSubEventType() {
		return subEventType == null ? Optional.empty() : Optional.of(subEventType);
	}

	public CorporateActionPayout1 setSubEventType(DTCCSubEventType1Code subEventType) {
		this.subEventType = subEventType;
		return this;
	}

	public Optional<SignedQuantityFormat4> getPosition() {
		return position == null ? Optional.empty() : Optional.of(position);
	}

	public CorporateActionPayout1 setPosition(com.tools20022.repository.msg.SignedQuantityFormat4 position) {
		this.position = position;
		return this;
	}

	public Optional<SignedQuantityFormat4> getFractionalPosition() {
		return fractionalPosition == null ? Optional.empty() : Optional.of(fractionalPosition);
	}

	public CorporateActionPayout1 setFractionalPosition(com.tools20022.repository.msg.SignedQuantityFormat4 fractionalPosition) {
		this.fractionalPosition = fractionalPosition;
		return this;
	}

	public Optional<ISODate> getDTCPositionCaptureDate() {
		return dTCPositionCaptureDate == null ? Optional.empty() : Optional.of(dTCPositionCaptureDate);
	}

	public CorporateActionPayout1 setDTCPositionCaptureDate(ISODate dTCPositionCaptureDate) {
		this.dTCPositionCaptureDate = dTCPositionCaptureDate;
		return this;
	}

	public Optional<Max16Text> getParticipantCrossReference() {
		return participantCrossReference == null ? Optional.empty() : Optional.of(participantCrossReference);
	}

	public CorporateActionPayout1 setParticipantCrossReference(Max16Text participantCrossReference) {
		this.participantCrossReference = participantCrossReference;
		return this;
	}
}