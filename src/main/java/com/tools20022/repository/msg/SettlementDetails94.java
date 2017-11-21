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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of settlement of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSecuritiesTransactionType
 * SettlementDetails94.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSettlementTransactionCondition
 * SettlementDetails94.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmBeneficialOwnership
 * SettlementDetails94.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCCPEligibility
 * SettlementDetails94.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmDeliveryReturnReason
 * SettlementDetails94.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCashClearingSystem
 * SettlementDetails94.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmExposureType
 * SettlementDetails94.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmFXStandingInstruction
 * SettlementDetails94.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmMarketClientSide
 * SettlementDetails94.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmNettingEligibility
 * SettlementDetails94.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmRegistration
 * SettlementDetails94.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmLegalRestrictions
 * SettlementDetails94.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSettlingCapacity
 * SettlementDetails94.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmTaxCapacity
 * SettlementDetails94.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmStampDutyTaxBasis
 * SettlementDetails94.mmStampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails94#mmTracking
 * SettlementDetails94.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmLetterOfGuarantee
 * SettlementDetails94.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmReturnLeg
 * SettlementDetails94.mmReturnLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmModificationCancellationAllowed
 * SettlementDetails94.mmModificationCancellationAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmEligibleForCollateral
 * SettlementDetails94.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSecuritiesSubBalanceType
 * SettlementDetails94.mmSecuritiesSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCashSubBalanceType
 * SettlementDetails94.mmCashSubBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
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
 * "SettlementDetails94"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of settlement of a transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails122
 * SettlementDetails122}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
 * SettlementDetails68}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementDetails94", propOrder = {"securitiesTransactionType", "settlementTransactionCondition", "beneficialOwnership", "CCPEligibility", "deliveryReturnReason", "cashClearingSystem", "exposureType",
		"FXStandingInstruction", "marketClientSide", "nettingEligibility", "registration", "legalRestrictions", "settlingCapacity", "taxCapacity", "stampDutyTaxBasis", "tracking", "letterOfGuarantee", "returnLeg",
		"modificationCancellationAllowed", "eligibleForCollateral", "securitiesSubBalanceType", "cashSubBalanceType"})
public class SettlementDetails94 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTransactionType21Choice securitiesTransactionType;
	/**
	 * Identifies the type of securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType21Choice
	 * SecuritiesTransactionType21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSecuritiesTransactionType
	 * SettlementDetails122.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSecuritiesTransactionType
	 * SettlementDetails68.mmSecuritiesTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmSecuritiesTransactionType);
			previousVersion_lazy = () -> SettlementDetails68.mmSecuritiesTransactionType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType21Choice.mmObject();
		}
	};
	protected List<SettlementTransactionCondition16Choice> settlementTransactionCondition;
	/**
	 * Conditions under which the order/trade is to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice
	 * SettlementTransactionCondition16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSettlementTransactionCondition
	 * SettlementDetails122.mmSettlementTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSettlementTransactionCondition
	 * SettlementDetails68.mmSettlementTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementTransactionCondition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmSettlementTransactionCondition);
			previousVersion_lazy = () -> SettlementDetails68.mmSettlementTransactionCondition;
			minOccurs = 0;
			complexType_lazy = () -> SettlementTransactionCondition16Choice.mmObject();
		}
	};
	protected BeneficialOwnership4Choice beneficialOwnership;
	/**
	 * Specifies whether there is change of beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice
	 * BeneficialOwnership4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
	 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmBeneficialOwnership
	 * SettlementDetails122.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmBeneficialOwnership
	 * SettlementDetails68.mmBeneficialOwnership}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficialOwnership = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmBeneficialOwnership);
			previousVersion_lazy = () -> SettlementDetails68.mmBeneficialOwnership;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficialOwnership4Choice.mmObject();
		}
	};
	protected CentralCounterPartyEligibility4Choice cCPEligibility;
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice
	 * CentralCounterPartyEligibility4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
	 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmCCPEligibility
	 * SettlementDetails122.mmCCPEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCCPEligibility
	 * SettlementDetails68.mmCCPEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCCPEligibility = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmCCPEligibility);
			previousVersion_lazy = () -> SettlementDetails68.mmCCPEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CentralCounterPartyEligibility4Choice.mmObject();
		}
	};
	protected DeliveryReturn3Choice deliveryReturnReason;
	/**
	 * Specifies the reason of a delivery return.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice
	 * DeliveryReturn3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryRtrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason of a delivery return."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmDeliveryReturnReason
	 * SettlementDetails122.mmDeliveryReturnReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmDeliveryReturnReason
	 * SettlementDetails68.mmDeliveryReturnReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryReturnReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "DlvryRtrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Specifies the reason of a delivery return.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmDeliveryReturnReason);
			previousVersion_lazy = () -> SettlementDetails68.mmDeliveryReturnReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DeliveryReturn3Choice.mmObject();
		}
	};
	protected CashSettlementSystem4Choice cashClearingSystem;
	/**
	 * Specifies the category of cash clearing system, for example, cheque
	 * clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem4Choice
	 * CashSettlementSystem4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, for example, cheque clearing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmCashClearingSystem
	 * SettlementDetails122.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCashClearingSystem
	 * SettlementDetails68.mmCashClearingSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashClearingSystem = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmCashClearingSystem);
			previousVersion_lazy = () -> SettlementDetails68.mmCashClearingSystem;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlementSystem4Choice.mmObject();
		}
	};
	protected ExposureType16Choice exposureType;
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice
	 * ExposureType16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmExposureType
	 * SettlementDetails122.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmExposureType
	 * SettlementDetails68.mmExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExposureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmExposureType);
			previousVersion_lazy = () -> SettlementDetails68.mmExposureType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExposureType16Choice.mmObject();
		}
	};
	protected FXStandingInstruction4Choice fXStandingInstruction;
	/**
	 * Specifies whether the forex standing instruction in place should apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice
	 * FXStandingInstruction4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxStgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the forex standing instruction in place should apply."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmFXStandingInstruction
	 * SettlementDetails122.mmFXStandingInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmFXStandingInstruction
	 * SettlementDetails68.mmFXStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFXStandingInstruction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "FxStgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmFXStandingInstruction);
			previousVersion_lazy = () -> SettlementDetails68.mmFXStandingInstruction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FXStandingInstruction4Choice.mmObject();
		}
	};
	protected MarketClientSide4Choice marketClientSide;
	/**
	 * Specifies if an instruction is for a market side or a client side
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide4Choice
	 * MarketClientSide4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClntSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmMarketClientSide
	 * SettlementDetails122.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmMarketClientSide
	 * SettlementDetails68.mmMarketClientSide}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketClientSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmMarketClientSide);
			previousVersion_lazy = () -> SettlementDetails68.mmMarketClientSide;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketClientSide4Choice.mmObject();
		}
	};
	protected NettingEligibility4Choice nettingEligibility;
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility4Choice
	 * NettingEligibility4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
	 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmNettingEligibility
	 * SettlementDetails122.mmNettingEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmNettingEligibility
	 * SettlementDetails68.mmNettingEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNettingEligibility = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmNettingEligibility);
			previousVersion_lazy = () -> SettlementDetails68.mmNettingEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NettingEligibility4Choice.mmObject();
		}
	};
	protected Registration9Choice registration;
	/**
	 * Specifies whether registration should occur upon receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice
	 * Registration9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmRegistration
	 * SettlementDetails122.mmRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmRegistration
	 * SettlementDetails68.mmRegistration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistration = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration should occur upon receipt.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmRegistration);
			previousVersion_lazy = () -> SettlementDetails68.mmRegistration;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Registration9Choice.mmObject();
		}
	};
	protected Restriction5Choice legalRestrictions;
	/**
	 * Regulatory restrictions applicable to a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Restriction5Choice
	 * Restriction5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
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
	 * definition} = "Regulatory restrictions applicable to a security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmLegalRestrictions
	 * SettlementDetails122.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmLegalRestrictions
	 * SettlementDetails68.mmLegalRestrictions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRestrictions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmLegalRestrictions);
			previousVersion_lazy = () -> SettlementDetails68.mmLegalRestrictions;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Restriction5Choice.mmObject();
		}
	};
	protected SettlingCapacity7Choice settlingCapacity;
	/**
	 * Role of a party in the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlingCapacity7Choice
	 * SettlingCapacity7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
	 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSettlingCapacity
	 * SettlementDetails122.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSettlingCapacity
	 * SettlementDetails68.mmSettlingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlingCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmSettlingCapacity);
			previousVersion_lazy = () -> SettlementDetails68.mmSettlingCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlingCapacity7Choice.mmObject();
		}
	};
	protected TaxCapacityParty4Choice taxCapacity;
	/**
	 * Tax role capacity of the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice
	 * TaxCapacityParty4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
	 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmTaxCapacity
	 * SettlementDetails122.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmTaxCapacity
	 * SettlementDetails68.mmTaxCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmTaxCapacity);
			previousVersion_lazy = () -> SettlementDetails68.mmTaxCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxCapacityParty4Choice.mmObject();
		}
	};
	protected GenericIdentification30 stampDutyTaxBasis;
	/**
	 * Specifies the stamp duty type or exemption reason applicable to the
	 * settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
	 * SecuritiesTax.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyTaxBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmStampDutyTaxBasis
	 * SettlementDetails122.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmStampDutyTaxBasis
	 * SettlementDetails68.mmStampDutyTaxBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDutyTaxBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmStampDutyTaxBasis);
			previousVersion_lazy = () -> SettlementDetails68.mmStampDutyTaxBasis;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification30.mmObject();
		}
	};
	protected Tracking4Choice tracking;
	/**
	 * Specifies whether the loan and/or collateral is tracked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Tracking4Choice
	 * Tracking4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
	 * SecuritiesSettlement.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trckg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmTracking
	 * SettlementDetails122.mmTracking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmTracking
	 * SettlementDetails68.mmTracking}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTracking = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmTracking;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "Trckg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmTracking);
			previousVersion_lazy = () -> SettlementDetails68.mmTracking;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Tracking4Choice.mmObject();
		}
	};
	protected LetterOfGuarantee4Choice letterOfGuarantee;
	/**
	 * Specifies whether physical settlement may be executed using a letter of
	 * guarantee or if the physical certificates should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice
	 * LetterOfGuarantee4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
	 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmLetterOfGuarantee
	 * SettlementDetails122.mmLetterOfGuarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmLetterOfGuarantee
	 * SettlementDetails68.mmLetterOfGuarantee}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterOfGuarantee = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmLetterOfGuarantee);
			previousVersion_lazy = () -> SettlementDetails68.mmLetterOfGuarantee;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LetterOfGuarantee4Choice.mmObject();
		}
	};
	protected YesNoIndicator returnLeg;
	/**
	 * Specifies whether, for a securities lending/borrowing settlement
	 * transaction, the lender will instruct the return leg as agreed with the
	 * borrower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmReturnLegInstruction
	 * SecuritiesFinancing.mmReturnLegInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmReturnLeg
	 * SettlementDetails122.mmReturnLeg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmReturnLeg
	 * SettlementDetails68.mmReturnLeg}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReturnLeg = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmReturnLegInstruction;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "RtrLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnLeg";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmReturnLeg);
			previousVersion_lazy = () -> SettlementDetails68.mmReturnLeg;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ModificationCancellationAllowed4Choice modificationCancellationAllowed;
	/**
	 * Specifies whether a third party is allowed to modify or cancel the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationCancellationAllowed4Choice
	 * ModificationCancellationAllowed4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModCxlAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationCancellationAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a third party is allowed to modify or cancel the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmModificationCancellationAllowed
	 * SettlementDetails122.mmModificationCancellationAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmModificationCancellationAllowed
	 * SettlementDetails68.mmModificationCancellationAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationCancellationAllowed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "ModCxlAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationCancellationAllowed";
			definition = "Specifies whether a third party is allowed to modify or cancel the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmModificationCancellationAllowed);
			previousVersion_lazy = () -> SettlementDetails68.mmModificationCancellationAllowed;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationCancellationAllowed4Choice.mmObject();
		}
	};
	protected YesNoIndicator eligibleForCollateral;
	/**
	 * Specifies whether securities should be included in the pool of securities
	 * eligible for collateral purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
	 * SecuritiesSettlement.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblForColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmEligibleForCollateral
	 * SettlementDetails122.mmEligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmEligibleForCollateral
	 * SettlementDetails68.mmEligibleForCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEligibleForCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmEligibleForCollateral);
			previousVersion_lazy = () -> SettlementDetails68.mmEligibleForCollateral;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected GenericIdentification30 securitiesSubBalanceType;
	/**
	 * Specifies the securities sub balance type indicator (example restriction
	 * type for a market infrastructure).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSecuritiesSubBalanceType
	 * SettlementDetails122.mmSecuritiesSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSecuritiesSubBalanceType
	 * SettlementDetails68.mmSecuritiesSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSubBalanceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceType";
			definition = "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure).";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmSecuritiesSubBalanceType);
			previousVersion_lazy = () -> SettlementDetails68.mmSecuritiesSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification30.mmObject();
		}
	};
	protected GenericIdentification30 cashSubBalanceType;
	/**
	 * Specifies the cash sub balance type indicator (example restriction type
	 * for a market infrastructure).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmCashSubBalanceType
	 * SettlementDetails122.mmCashSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCashSubBalanceType
	 * SettlementDetails68.mmCashSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashSubBalanceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> SettlementDetails94.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceType";
			definition = "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure).";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmCashSubBalanceType);
			previousVersion_lazy = () -> SettlementDetails68.mmCashSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification30.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementDetails94.mmSecuritiesTransactionType, SettlementDetails94.mmSettlementTransactionCondition, SettlementDetails94.mmBeneficialOwnership,
						SettlementDetails94.mmCCPEligibility, SettlementDetails94.mmDeliveryReturnReason, SettlementDetails94.mmCashClearingSystem, SettlementDetails94.mmExposureType, SettlementDetails94.mmFXStandingInstruction,
						SettlementDetails94.mmMarketClientSide, SettlementDetails94.mmNettingEligibility, SettlementDetails94.mmRegistration, SettlementDetails94.mmLegalRestrictions, SettlementDetails94.mmSettlingCapacity,
						SettlementDetails94.mmTaxCapacity, SettlementDetails94.mmStampDutyTaxBasis, SettlementDetails94.mmTracking, SettlementDetails94.mmLetterOfGuarantee, SettlementDetails94.mmReturnLeg,
						SettlementDetails94.mmModificationCancellationAllowed, SettlementDetails94.mmEligibleForCollateral, SettlementDetails94.mmSecuritiesSubBalanceType, SettlementDetails94.mmCashSubBalanceType);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails94";
				definition = "Details of settlement of a transaction.";
				nextVersions_lazy = () -> Arrays.asList(SettlementDetails122.mmObject());
				previousVersion_lazy = () -> SettlementDetails68.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesTxTp")
	public SecuritiesTransactionType21Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public void setSecuritiesTransactionType(SecuritiesTransactionType21Choice securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
	}

	@XmlElement(name = "SttlmTxCond")
	public List<SettlementTransactionCondition16Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(List<SettlementTransactionCondition16Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = settlementTransactionCondition;
	}

	@XmlElement(name = "BnfclOwnrsh")
	public BeneficialOwnership4Choice getBeneficialOwnership() {
		return beneficialOwnership;
	}

	public void setBeneficialOwnership(BeneficialOwnership4Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
	}

	@XmlElement(name = "CCPElgblty")
	public CentralCounterPartyEligibility4Choice getCCPEligibility() {
		return cCPEligibility;
	}

	public void setCCPEligibility(CentralCounterPartyEligibility4Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
	}

	@XmlElement(name = "DlvryRtrRsn")
	public DeliveryReturn3Choice getDeliveryReturnReason() {
		return deliveryReturnReason;
	}

	public void setDeliveryReturnReason(DeliveryReturn3Choice deliveryReturnReason) {
		this.deliveryReturnReason = deliveryReturnReason;
	}

	@XmlElement(name = "CshClrSys")
	public CashSettlementSystem4Choice getCashClearingSystem() {
		return cashClearingSystem;
	}

	public void setCashClearingSystem(CashSettlementSystem4Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
	}

	@XmlElement(name = "XpsrTp")
	public ExposureType16Choice getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureType16Choice exposureType) {
		this.exposureType = exposureType;
	}

	@XmlElement(name = "FxStgInstr")
	public FXStandingInstruction4Choice getFXStandingInstruction() {
		return fXStandingInstruction;
	}

	public void setFXStandingInstruction(FXStandingInstruction4Choice fXStandingInstruction) {
		this.fXStandingInstruction = fXStandingInstruction;
	}

	@XmlElement(name = "MktClntSd")
	public MarketClientSide4Choice getMarketClientSide() {
		return marketClientSide;
	}

	public void setMarketClientSide(MarketClientSide4Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
	}

	@XmlElement(name = "NetgElgblty")
	public NettingEligibility4Choice getNettingEligibility() {
		return nettingEligibility;
	}

	public void setNettingEligibility(NettingEligibility4Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
	}

	@XmlElement(name = "Regn")
	public Registration9Choice getRegistration() {
		return registration;
	}

	public void setRegistration(Registration9Choice registration) {
		this.registration = registration;
	}

	@XmlElement(name = "LglRstrctns")
	public Restriction5Choice getLegalRestrictions() {
		return legalRestrictions;
	}

	public void setLegalRestrictions(Restriction5Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
	}

	@XmlElement(name = "SttlgCpcty")
	public SettlingCapacity7Choice getSettlingCapacity() {
		return settlingCapacity;
	}

	public void setSettlingCapacity(SettlingCapacity7Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
	}

	@XmlElement(name = "TaxCpcty")
	public TaxCapacityParty4Choice getTaxCapacity() {
		return taxCapacity;
	}

	public void setTaxCapacity(TaxCapacityParty4Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
	}

	@XmlElement(name = "StmpDtyTaxBsis")
	public GenericIdentification30 getStampDutyTaxBasis() {
		return stampDutyTaxBasis;
	}

	public void setStampDutyTaxBasis(com.tools20022.repository.msg.GenericIdentification30 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
	}

	@XmlElement(name = "Trckg")
	public Tracking4Choice getTracking() {
		return tracking;
	}

	public void setTracking(Tracking4Choice tracking) {
		this.tracking = tracking;
	}

	@XmlElement(name = "LttrOfGrnt")
	public LetterOfGuarantee4Choice getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public void setLetterOfGuarantee(LetterOfGuarantee4Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
	}

	@XmlElement(name = "RtrLeg")
	public YesNoIndicator getReturnLeg() {
		return returnLeg;
	}

	public void setReturnLeg(YesNoIndicator returnLeg) {
		this.returnLeg = returnLeg;
	}

	@XmlElement(name = "ModCxlAllwd")
	public ModificationCancellationAllowed4Choice getModificationCancellationAllowed() {
		return modificationCancellationAllowed;
	}

	public void setModificationCancellationAllowed(ModificationCancellationAllowed4Choice modificationCancellationAllowed) {
		this.modificationCancellationAllowed = modificationCancellationAllowed;
	}

	@XmlElement(name = "ElgblForColl")
	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
	}

	@XmlElement(name = "SctiesSubBalTp")
	public GenericIdentification30 getSecuritiesSubBalanceType() {
		return securitiesSubBalanceType;
	}

	public void setSecuritiesSubBalanceType(com.tools20022.repository.msg.GenericIdentification30 securitiesSubBalanceType) {
		this.securitiesSubBalanceType = securitiesSubBalanceType;
	}

	@XmlElement(name = "CshSubBalTp")
	public GenericIdentification30 getCashSubBalanceType() {
		return cashSubBalanceType;
	}

	public void setCashSubBalanceType(com.tools20022.repository.msg.GenericIdentification30 cashSubBalanceType) {
		this.cashSubBalanceType = cashSubBalanceType;
	}
}