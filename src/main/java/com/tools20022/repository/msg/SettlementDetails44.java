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
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code;
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
 * Parameters which explicitly state the conditions that must be fulfilled
 * before a particular transaction of a financial instrument can be settled.
 * These parameters are defined by the instructing party in compliance with
 * settlement rules in the market the transaction will settle in.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmHoldIndicator
 * SettlementDetails44.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSettlementTransactionCondition
 * SettlementDetails44.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSecuritiesTransactionType
 * SettlementDetails44.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSettlingCapacity
 * SettlementDetails44.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmStampDutyTaxBasis
 * SettlementDetails44.mmStampDutyTaxBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSecuritiesRTGS
 * SettlementDetails44.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmRegistration
 * SettlementDetails44.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmBeneficialOwnership
 * SettlementDetails44.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmExposureType
 * SettlementDetails44.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmCashClearingSystem
 * SettlementDetails44.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmTaxCapacity
 * SettlementDetails44.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmRepurchaseType
 * SettlementDetails44.mmRepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmMarketClientSide
 * SettlementDetails44.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmBlockTrade
 * SettlementDetails44.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmLegalRestrictions
 * SettlementDetails44.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSettlementSystemMethod
 * SettlementDetails44.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmNettingEligibility
 * SettlementDetails44.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmCCPEligibility
 * SettlementDetails44.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmLetterOfGuarantee
 * SettlementDetails44.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmPartialSettlementIndicator
 * SettlementDetails44.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmEligibleForCollateral
 * SettlementDetails44.mmEligibleForCollateral}</li>
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
 * "SettlementDetails44"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails69
 * SettlementDetails69}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementDetails23
 * SettlementDetails23}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementDetails44", propOrder = {"holdIndicator", "settlementTransactionCondition", "securitiesTransactionType", "settlingCapacity", "stampDutyTaxBasis", "securitiesRTGS", "registration", "beneficialOwnership",
		"exposureType", "cashClearingSystem", "taxCapacity", "repurchaseType", "marketClientSide", "blockTrade", "legalRestrictions", "settlementSystemMethod", "nettingEligibility", "CCPEligibility", "letterOfGuarantee",
		"partialSettlementIndicator", "eligibleForCollateral"})
public class SettlementDetails44 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected HoldIndicator4 holdIndicator;
	/**
	 * Specifies whether the transaction is on hold/blocked/frozen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldIndicator4
	 * HoldIndicator4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
	 * SecuritiesSettlement.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmHoldIndicator
	 * SettlementDetails69.mmHoldIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHoldIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldIndicator;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmHoldIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HoldIndicator4.mmObject();
		}
	};
	protected List<SettlementTransactionCondition12Choice> settlementTransactionCondition;
	/**
	 * Conditions under which the order/trade is to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice
	 * SettlementTransactionCondition12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSettlementTransactionCondition
	 * SettlementDetails69.mmSettlementTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTransactionCondition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmSettlementTransactionCondition);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition12Choice.mmObject();
		}
	};
	protected SecuritiesTransactionType9Choice securitiesTransactionType;
	/**
	 * Identifies the type of securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice
	 * SecuritiesTransactionType9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSecuritiesTransactionType
	 * SettlementDetails69.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesTransactionType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmSecuritiesTransactionType);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionType9Choice.mmObject();
		}
	};
	protected SettlingCapacity1Choice settlingCapacity;
	/**
	 * Role of a party in the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlingCapacity1Choice
	 * SettlingCapacity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
	 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSettlingCapacity
	 * SettlementDetails69.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlingCapacity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmSettlingCapacity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlingCapacity1Choice.mmObject();
		}
	};
	protected GenericIdentification20 stampDutyTaxBasis;
	/**
	 * Specifies the stamp duty type or exemption reason applicable to the
	 * settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
	 * SecuritiesTax.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmStampDutyTaxBasis
	 * SettlementDetails69.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStampDutyTaxBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmStampDutyTaxBasis);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification20.mmObject();
		}
	};
	protected SecuritiesRTGS1Choice securitiesRTGS;
	/**
	 * Specifies whether the settlement transaction is to be settled through an
	 * RTGS or a non RTGS system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice
	 * SecuritiesRTGS1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSecuritiesRTGS
	 * SettlementDetails69.mmSecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesRTGS = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmSecuritiesRTGS);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS1Choice.mmObject();
		}
	};
	protected Registration1Choice registration;
	/**
	 * Specifies whether registration should occur upon receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Registration1Choice
	 * Registration1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmRegistration
	 * SettlementDetails69.mmRegistration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistration = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration should occur upon receipt.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmRegistration);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Registration1Choice.mmObject();
		}
	};
	protected BeneficialOwnership1Choice beneficialOwnership;
	/**
	 * Specifies whether there is change of beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice
	 * BeneficialOwnership1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
	 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmBeneficialOwnership
	 * SettlementDetails69.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficialOwnership = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmBeneficialOwnership);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficialOwnership1Choice.mmObject();
		}
	};
	protected ExposureType4Choice exposureType;
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ExposureType4Choice
	 * ExposureType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmExposureType
	 * SettlementDetails69.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExposureType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmExposureType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExposureType4Choice.mmObject();
		}
	};
	protected CashSettlementSystem1Choice cashClearingSystem;
	/**
	 * Specifies the category of cash clearing system, for example, cheque
	 * clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem1Choice
	 * CashSettlementSystem1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmCashClearingSystem
	 * SettlementDetails69.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashClearingSystem = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmCashClearingSystem);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSettlementSystem1Choice.mmObject();
		}
	};
	protected TaxCapacityParty1Choice taxCapacity;
	/**
	 * Tax role capacity of the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice
	 * TaxCapacityParty1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
	 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmTaxCapacity
	 * SettlementDetails69.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCapacity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmTaxCapacity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCapacityParty1Choice.mmObject();
		}
	};
	protected RepurchaseType3Choice repurchaseType;
	/**
	 * Specifies whether the rate is fixed, variable or a forfeit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType3Choice
	 * RepurchaseType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseType
	 * SecuritiesFinancing.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the rate is fixed, variable or a forfeit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmRepurchaseType
	 * SettlementDetails69.mmRepurchaseType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseType;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "RpTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies whether the rate is fixed, variable or a forfeit.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmRepurchaseType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RepurchaseType3Choice.mmObject();
		}
	};
	protected MarketClientSide1Choice marketClientSide;
	/**
	 * Specifies if an instruction is for a market side or a client side
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice
	 * MarketClientSide1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmMarketClientSide
	 * SettlementDetails69.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketClientSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmMarketClientSide);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketClientSide1Choice.mmObject();
		}
	};
	protected BlockTrade1Choice blockTrade;
	/**
	 * Specifies whether the settlement instruction is a block parent or child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BlockTrade1Choice
	 * BlockTrade1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
	 * SecuritiesSettlement.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is a block parent or child."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmBlockTrade
	 * SettlementDetails69.mmBlockTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBlockTrade;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "BlckTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmBlockTrade);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BlockTrade1Choice.mmObject();
		}
	};
	protected Restriction1Choice legalRestrictions;
	/**
	 * Regulatory restrictions applicable to a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Restriction1Choice
	 * Restriction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmLegalRestrictions
	 * SettlementDetails69.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalRestrictions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmLegalRestrictions);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction1Choice.mmObject();
		}
	};
	protected SettlementSystemMethod1Choice settlementSystemMethod;
	/**
	 * Specifies whether the settlement instruction is to be settled through the
	 * default or the alternate settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod1Choice
	 * SettlementSystemMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
	 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSysMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSettlementSystemMethod
	 * SettlementDetails69.mmSettlementSystemMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementSystemMethod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementSystemMethod;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmSettlementSystemMethod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSystemMethod1Choice.mmObject();
		}
	};
	protected NettingEligibility1Choice nettingEligibility;
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility1Choice
	 * NettingEligibility1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
	 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmNettingEligibility
	 * SettlementDetails69.mmNettingEligibility}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNettingEligibility = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmNettingEligibility);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NettingEligibility1Choice.mmObject();
		}
	};
	protected CentralCounterPartyEligibility1Choice cCPEligibility;
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice
	 * CentralCounterPartyEligibility1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
	 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmCCPEligibility
	 * SettlementDetails69.mmCCPEligibility}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCCPEligibility = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmCCPEligibility);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CentralCounterPartyEligibility1Choice.mmObject();
		}
	};
	protected LetterOfGuarantee1Choice letterOfGuarantee;
	/**
	 * Specifies whether physical settlement may be executed using a letter of
	 * guarantee or if the physical certificates should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice
	 * LetterOfGuarantee1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
	 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmLetterOfGuarantee
	 * SettlementDetails69.mmLetterOfGuarantee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLetterOfGuarantee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmLetterOfGuarantee);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LetterOfGuarantee1Choice.mmObject();
		}
	};
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * Specifies whether partial settlement is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmPartialSettlementIndicator
	 * SettlementDetails69.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmPartialSettlementIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44
	 * SettlementDetails44}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmEligibleForCollateral
	 * SettlementDetails69.mmEligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEligibleForCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> SettlementDetails44.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmEligibleForCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementDetails44.mmHoldIndicator, SettlementDetails44.mmSettlementTransactionCondition, SettlementDetails44.mmSecuritiesTransactionType, SettlementDetails44.mmSettlingCapacity,
						SettlementDetails44.mmStampDutyTaxBasis, SettlementDetails44.mmSecuritiesRTGS, SettlementDetails44.mmRegistration, SettlementDetails44.mmBeneficialOwnership, SettlementDetails44.mmExposureType,
						SettlementDetails44.mmCashClearingSystem, SettlementDetails44.mmTaxCapacity, SettlementDetails44.mmRepurchaseType, SettlementDetails44.mmMarketClientSide, SettlementDetails44.mmBlockTrade,
						SettlementDetails44.mmLegalRestrictions, SettlementDetails44.mmSettlementSystemMethod, SettlementDetails44.mmNettingEligibility, SettlementDetails44.mmCCPEligibility, SettlementDetails44.mmLetterOfGuarantee,
						SettlementDetails44.mmPartialSettlementIndicator, SettlementDetails44.mmEligibleForCollateral);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails44";
				definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
				nextVersions_lazy = () -> Arrays.asList(SettlementDetails69.mmObject());
				previousVersion_lazy = () -> SettlementDetails23.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "HldInd")
	public HoldIndicator4 getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(com.tools20022.repository.msg.HoldIndicator4 holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	@XmlElement(name = "SttlmTxCond")
	public List<SettlementTransactionCondition12Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(List<SettlementTransactionCondition12Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = settlementTransactionCondition;
	}

	@XmlElement(name = "SctiesTxTp", required = true)
	public SecuritiesTransactionType9Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public void setSecuritiesTransactionType(SecuritiesTransactionType9Choice securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
	}

	@XmlElement(name = "SttlgCpcty")
	public SettlingCapacity1Choice getSettlingCapacity() {
		return settlingCapacity;
	}

	public void setSettlingCapacity(SettlingCapacity1Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
	}

	@XmlElement(name = "StmpDtyTaxBsis")
	public GenericIdentification20 getStampDutyTaxBasis() {
		return stampDutyTaxBasis;
	}

	public void setStampDutyTaxBasis(com.tools20022.repository.msg.GenericIdentification20 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
	}

	@XmlElement(name = "SctiesRTGS")
	public SecuritiesRTGS1Choice getSecuritiesRTGS() {
		return securitiesRTGS;
	}

	public void setSecuritiesRTGS(SecuritiesRTGS1Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
	}

	@XmlElement(name = "Regn")
	public Registration1Choice getRegistration() {
		return registration;
	}

	public void setRegistration(Registration1Choice registration) {
		this.registration = registration;
	}

	@XmlElement(name = "BnfclOwnrsh")
	public BeneficialOwnership1Choice getBeneficialOwnership() {
		return beneficialOwnership;
	}

	public void setBeneficialOwnership(BeneficialOwnership1Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
	}

	@XmlElement(name = "XpsrTp")
	public ExposureType4Choice getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureType4Choice exposureType) {
		this.exposureType = exposureType;
	}

	@XmlElement(name = "CshClrSys")
	public CashSettlementSystem1Choice getCashClearingSystem() {
		return cashClearingSystem;
	}

	public void setCashClearingSystem(CashSettlementSystem1Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
	}

	@XmlElement(name = "TaxCpcty")
	public TaxCapacityParty1Choice getTaxCapacity() {
		return taxCapacity;
	}

	public void setTaxCapacity(TaxCapacityParty1Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
	}

	@XmlElement(name = "RpTp")
	public RepurchaseType3Choice getRepurchaseType() {
		return repurchaseType;
	}

	public void setRepurchaseType(RepurchaseType3Choice repurchaseType) {
		this.repurchaseType = repurchaseType;
	}

	@XmlElement(name = "MktClntSd")
	public MarketClientSide1Choice getMarketClientSide() {
		return marketClientSide;
	}

	public void setMarketClientSide(MarketClientSide1Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
	}

	@XmlElement(name = "BlckTrad")
	public BlockTrade1Choice getBlockTrade() {
		return blockTrade;
	}

	public void setBlockTrade(BlockTrade1Choice blockTrade) {
		this.blockTrade = blockTrade;
	}

	@XmlElement(name = "LglRstrctns")
	public Restriction1Choice getLegalRestrictions() {
		return legalRestrictions;
	}

	public void setLegalRestrictions(Restriction1Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
	}

	@XmlElement(name = "SttlmSysMtd")
	public SettlementSystemMethod1Choice getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public void setSettlementSystemMethod(SettlementSystemMethod1Choice settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
	}

	@XmlElement(name = "NetgElgblty")
	public NettingEligibility1Choice getNettingEligibility() {
		return nettingEligibility;
	}

	public void setNettingEligibility(NettingEligibility1Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
	}

	@XmlElement(name = "CCPElgblty")
	public CentralCounterPartyEligibility1Choice getCCPEligibility() {
		return cCPEligibility;
	}

	public void setCCPEligibility(CentralCounterPartyEligibility1Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
	}

	@XmlElement(name = "LttrOfGrnt")
	public LetterOfGuarantee1Choice getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public void setLetterOfGuarantee(LetterOfGuarantee1Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
	}

	@XmlElement(name = "PrtlSttlmInd")
	public SettlementTransactionCondition5Code getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
	}

	@XmlElement(name = "ElgblForColl")
	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
	}
}