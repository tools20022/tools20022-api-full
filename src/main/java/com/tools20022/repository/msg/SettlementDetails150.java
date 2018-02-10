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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlementTransactionCondition
 * SettlementDetails150.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlingCapacity
 * SettlementDetails150.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmStampDutyTaxBasis
 * SettlementDetails150.mmStampDutyTaxBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSecuritiesRTGS
 * SettlementDetails150.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmRegistration
 * SettlementDetails150.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmBeneficialOwnership
 * SettlementDetails150.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmCashClearingSystem
 * SettlementDetails150.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmTaxCapacity
 * SettlementDetails150.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmRepurchaseType
 * SettlementDetails150.mmRepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmMarketClientSide
 * SettlementDetails150.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmBlockTrade
 * SettlementDetails150.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmLegalRestrictions
 * SettlementDetails150.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlementSystemMethod
 * SettlementDetails150.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmNettingEligibility
 * SettlementDetails150.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmCCPEligibility
 * SettlementDetails150.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmLetterOfGuarantee
 * SettlementDetails150.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmPartialSettlementIndicator
 * SettlementDetails150.mmPartialSettlementIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails150
 * ConstraintSettlementDetailsRule.forSettlementDetails150}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails150
 * ConstraintCashClearingSystemRule.forSettlementDetails150}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDetails150"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of settlement of a transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementDetails126
 * SettlementDetails126}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementDetails150", propOrder = {"settlementTransactionCondition", "settlingCapacity", "stampDutyTaxBasis", "securitiesRTGS", "registration", "beneficialOwnership", "cashClearingSystem", "taxCapacity", "repurchaseType",
		"marketClientSide", "blockTrade", "legalRestrictions", "settlementSystemMethod", "nettingEligibility", "cCPEligibility", "letterOfGuarantee", "partialSettlementIndicator"})
public class SettlementDetails150 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmTxCond")
	protected List<SettlementTransactionCondition16Choice> settlementTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlementTransactionCondition
	 * SettlementDetails126.mmSettlementTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTransactionCondition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			previousVersion_lazy = () -> SettlementDetails126.mmSettlementTransactionCondition;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition16Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlgCpcty")
	protected SettlingCapacity7Choice settlingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlingCapacity
	 * SettlementDetails126.mmSettlingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlingCapacity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			previousVersion_lazy = () -> SettlementDetails126.mmSettlingCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlingCapacity7Choice.mmObject();
		}
	};
	@XmlElement(name = "StmpDtyTaxBsis")
	protected GenericIdentification30 stampDutyTaxBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmStampDutyTaxBasis
	 * SettlementDetails126.mmStampDutyTaxBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStampDutyTaxBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			previousVersion_lazy = () -> SettlementDetails126.mmStampDutyTaxBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification30.mmObject();
		}
	};
	@XmlElement(name = "SctiesRTGS")
	protected SecuritiesRTGS4Choice securitiesRTGS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS4Choice
	 * SecuritiesRTGS4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSecuritiesRTGS
	 * SettlementDetails126.mmSecuritiesRTGS}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesRTGS = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			previousVersion_lazy = () -> SettlementDetails126.mmSecuritiesRTGS;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS4Choice.mmObject();
		}
	};
	@XmlElement(name = "Regn")
	protected Registration9Choice registration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Registration9Choice
	 * Registration9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmRegistration
	 * SettlementDetails126.mmRegistration}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistration = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration should occur upon receipt.";
			previousVersion_lazy = () -> SettlementDetails126.mmRegistration;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Registration9Choice.mmObject();
		}
	};
	@XmlElement(name = "BnfclOwnrsh")
	protected BeneficialOwnership4Choice beneficialOwnership;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmBeneficialOwnership
	 * SettlementDetails126.mmBeneficialOwnership}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficialOwnership = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			previousVersion_lazy = () -> SettlementDetails126.mmBeneficialOwnership;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficialOwnership4Choice.mmObject();
		}
	};
	@XmlElement(name = "CshClrSys")
	protected CashSettlementSystem4Choice cashClearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmCashClearingSystem
	 * SettlementDetails126.mmCashClearingSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashClearingSystem = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			previousVersion_lazy = () -> SettlementDetails126.mmCashClearingSystem;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSettlementSystem4Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxCpcty")
	protected TaxCapacityParty4Choice taxCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmTaxCapacity
	 * SettlementDetails126.mmTaxCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCapacity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			previousVersion_lazy = () -> SettlementDetails126.mmTaxCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCapacityParty4Choice.mmObject();
		}
	};
	@XmlElement(name = "RpTp")
	protected RepurchaseType22Choice repurchaseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType22Choice
	 * RepurchaseType22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseType
	 * SecuritiesFinancing.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmRepurchaseType
	 * SettlementDetails126.mmRepurchaseType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "RpTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies whether the rate is fixed, variable or a forfeit.";
			previousVersion_lazy = () -> SettlementDetails126.mmRepurchaseType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RepurchaseType22Choice.mmObject();
		}
	};
	@XmlElement(name = "MktClntSd")
	protected MarketClientSide6Choice marketClientSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide6Choice
	 * MarketClientSide6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmMarketClientSide
	 * SettlementDetails126.mmMarketClientSide}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketClientSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			previousVersion_lazy = () -> SettlementDetails126.mmMarketClientSide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketClientSide6Choice.mmObject();
		}
	};
	@XmlElement(name = "BlckTrad")
	protected BlockTrade4Choice blockTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BlockTrade4Choice
	 * BlockTrade4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
	 * SecuritiesSettlement.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmBlockTrade
	 * SettlementDetails126.mmBlockTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBlockTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "BlckTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			previousVersion_lazy = () -> SettlementDetails126.mmBlockTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BlockTrade4Choice.mmObject();
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected Restriction5Choice legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Restriction5Choice
	 * Restriction5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmLegalRestrictions
	 * SettlementDetails126.mmLegalRestrictions}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalRestrictions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			previousVersion_lazy = () -> SettlementDetails126.mmLegalRestrictions;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction5Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmSysMtd")
	protected SettlementSystemMethod4Choice settlementSystemMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod4Choice
	 * SettlementSystemMethod4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
	 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlementSystemMethod
	 * SettlementDetails126.mmSettlementSystemMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementSystemMethod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementSystemMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			previousVersion_lazy = () -> SettlementDetails126.mmSettlementSystemMethod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSystemMethod4Choice.mmObject();
		}
	};
	@XmlElement(name = "NetgElgblty")
	protected NettingEligibility4Choice nettingEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmNettingEligibility
	 * SettlementDetails126.mmNettingEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNettingEligibility = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			previousVersion_lazy = () -> SettlementDetails126.mmNettingEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NettingEligibility4Choice.mmObject();
		}
	};
	@XmlElement(name = "CCPElgblty")
	protected CentralCounterPartyEligibility4Choice cCPEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmCCPEligibility
	 * SettlementDetails126.mmCCPEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCCPEligibility = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			previousVersion_lazy = () -> SettlementDetails126.mmCCPEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CentralCounterPartyEligibility4Choice.mmObject();
		}
	};
	@XmlElement(name = "LttrOfGrnt")
	protected LetterOfGuarantee4Choice letterOfGuarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmLetterOfGuarantee
	 * SettlementDetails126.mmLetterOfGuarantee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLetterOfGuarantee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			previousVersion_lazy = () -> SettlementDetails126.mmLetterOfGuarantee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LetterOfGuarantee4Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtlSttlmInd")
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150
	 * SettlementDetails150}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmPartialSettlementIndicator
	 * SettlementDetails126.mmPartialSettlementIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails150.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			previousVersion_lazy = () -> SettlementDetails126.mmPartialSettlementIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails150.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails150.mmSettlingCapacity,
						com.tools20022.repository.msg.SettlementDetails150.mmStampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails150.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails150.mmRegistration,
						com.tools20022.repository.msg.SettlementDetails150.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails150.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails150.mmTaxCapacity,
						com.tools20022.repository.msg.SettlementDetails150.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails150.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails150.mmBlockTrade,
						com.tools20022.repository.msg.SettlementDetails150.mmLegalRestrictions, com.tools20022.repository.msg.SettlementDetails150.mmSettlementSystemMethod,
						com.tools20022.repository.msg.SettlementDetails150.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails150.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails150.mmLetterOfGuarantee,
						com.tools20022.repository.msg.SettlementDetails150.mmPartialSettlementIndicator);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails150,
						com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails150);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails150";
				definition = "Details of settlement of a transaction.";
				previousVersion_lazy = () -> SettlementDetails126.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SettlementTransactionCondition16Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition == null ? settlementTransactionCondition = new ArrayList<>() : settlementTransactionCondition;
	}

	public SettlementDetails150 setSettlementTransactionCondition(List<SettlementTransactionCondition16Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public Optional<SettlingCapacity7Choice> getSettlingCapacity() {
		return settlingCapacity == null ? Optional.empty() : Optional.of(settlingCapacity);
	}

	public SettlementDetails150 setSettlingCapacity(SettlingCapacity7Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
		return this;
	}

	public Optional<GenericIdentification30> getStampDutyTaxBasis() {
		return stampDutyTaxBasis == null ? Optional.empty() : Optional.of(stampDutyTaxBasis);
	}

	public SettlementDetails150 setStampDutyTaxBasis(com.tools20022.repository.msg.GenericIdentification30 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
		return this;
	}

	public Optional<SecuritiesRTGS4Choice> getSecuritiesRTGS() {
		return securitiesRTGS == null ? Optional.empty() : Optional.of(securitiesRTGS);
	}

	public SettlementDetails150 setSecuritiesRTGS(SecuritiesRTGS4Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
		return this;
	}

	public Optional<Registration9Choice> getRegistration() {
		return registration == null ? Optional.empty() : Optional.of(registration);
	}

	public SettlementDetails150 setRegistration(Registration9Choice registration) {
		this.registration = registration;
		return this;
	}

	public Optional<BeneficialOwnership4Choice> getBeneficialOwnership() {
		return beneficialOwnership == null ? Optional.empty() : Optional.of(beneficialOwnership);
	}

	public SettlementDetails150 setBeneficialOwnership(BeneficialOwnership4Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
		return this;
	}

	public Optional<CashSettlementSystem4Choice> getCashClearingSystem() {
		return cashClearingSystem == null ? Optional.empty() : Optional.of(cashClearingSystem);
	}

	public SettlementDetails150 setCashClearingSystem(CashSettlementSystem4Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
		return this;
	}

	public Optional<TaxCapacityParty4Choice> getTaxCapacity() {
		return taxCapacity == null ? Optional.empty() : Optional.of(taxCapacity);
	}

	public SettlementDetails150 setTaxCapacity(TaxCapacityParty4Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
		return this;
	}

	public Optional<RepurchaseType22Choice> getRepurchaseType() {
		return repurchaseType == null ? Optional.empty() : Optional.of(repurchaseType);
	}

	public SettlementDetails150 setRepurchaseType(RepurchaseType22Choice repurchaseType) {
		this.repurchaseType = repurchaseType;
		return this;
	}

	public Optional<MarketClientSide6Choice> getMarketClientSide() {
		return marketClientSide == null ? Optional.empty() : Optional.of(marketClientSide);
	}

	public SettlementDetails150 setMarketClientSide(MarketClientSide6Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
		return this;
	}

	public Optional<BlockTrade4Choice> getBlockTrade() {
		return blockTrade == null ? Optional.empty() : Optional.of(blockTrade);
	}

	public SettlementDetails150 setBlockTrade(BlockTrade4Choice blockTrade) {
		this.blockTrade = blockTrade;
		return this;
	}

	public Optional<Restriction5Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public SettlementDetails150 setLegalRestrictions(Restriction5Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<SettlementSystemMethod4Choice> getSettlementSystemMethod() {
		return settlementSystemMethod == null ? Optional.empty() : Optional.of(settlementSystemMethod);
	}

	public SettlementDetails150 setSettlementSystemMethod(SettlementSystemMethod4Choice settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
		return this;
	}

	public Optional<NettingEligibility4Choice> getNettingEligibility() {
		return nettingEligibility == null ? Optional.empty() : Optional.of(nettingEligibility);
	}

	public SettlementDetails150 setNettingEligibility(NettingEligibility4Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
		return this;
	}

	public Optional<CentralCounterPartyEligibility4Choice> getCCPEligibility() {
		return cCPEligibility == null ? Optional.empty() : Optional.of(cCPEligibility);
	}

	public SettlementDetails150 setCCPEligibility(CentralCounterPartyEligibility4Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
		return this;
	}

	public Optional<LetterOfGuarantee4Choice> getLetterOfGuarantee() {
		return letterOfGuarantee == null ? Optional.empty() : Optional.of(letterOfGuarantee);
	}

	public SettlementDetails150 setLetterOfGuarantee(LetterOfGuarantee4Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
		return this;
	}

	public Optional<SettlementTransactionCondition5Code> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public SettlementDetails150 setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}
}