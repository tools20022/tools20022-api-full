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
import com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.Priority3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the reference and status on the original
 * transactions, included in the original instruction, to which the reversal
 * message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversalIdentification
 * PaymentTransaction51.mmReversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalGroupInformation
 * PaymentTransaction51.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalInstructionIdentification
 * PaymentTransaction51.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalEndToEndIdentification
 * PaymentTransaction51.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalTransactionIdentification
 * PaymentTransaction51.mmOriginalTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalClearingSystemReference
 * PaymentTransaction51.mmOriginalClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalInterbankSettlementAmount
 * PaymentTransaction51.mmOriginalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversedInterbankSettlementAmount
 * PaymentTransaction51.mmReversedInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmInterbankSettlementDate
 * PaymentTransaction51.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmSettlementPriority
 * PaymentTransaction51.mmSettlementPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversedInstructedAmount
 * PaymentTransaction51.mmReversedInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmExchangeRate
 * PaymentTransaction51.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmCompensationAmount
 * PaymentTransaction51.mmCompensationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmChargeBearer
 * PaymentTransaction51.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmChargesInformation
 * PaymentTransaction51.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmInstructingAgent
 * PaymentTransaction51.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmInstructedAgent
 * PaymentTransaction51.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversalReasonInformation
 * PaymentTransaction51.mmReversalReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalTransactionReference
 * PaymentTransaction51.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmSupplementaryData
 * PaymentTransaction51.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05#mmTransactionInformation
 * FIToFIPaymentReversalV05.mmTransactionInformation}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate1Rule#forPaymentTransaction51
 * ConstraintReversedInstructedAmountAndExchangeRate1Rule.
 * forPaymentTransaction51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransaction51
 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
 * forPaymentTransaction51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesInformationAndReversedInstructedAmountRule#forPaymentTransaction51
 * ConstraintChargesInformationAndReversedInstructedAmountRule.
 * forPaymentTransaction51}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTransaction51"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the reference and status on the original transactions, included in the original instruction, to which the reversal message applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction60
 * PaymentTransaction60}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45
 * PaymentTransaction45}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTransaction51", propOrder = {"reversalIdentification", "originalGroupInformation", "originalInstructionIdentification", "originalEndToEndIdentification", "originalTransactionIdentification",
		"originalClearingSystemReference", "originalInterbankSettlementAmount", "reversedInterbankSettlementAmount", "interbankSettlementDate", "settlementPriority", "reversedInstructedAmount", "exchangeRate", "compensationAmount",
		"chargeBearer", "chargesInformation", "instructingAgent", "instructedAgent", "reversalReasonInformation", "originalTransactionReference", "supplementaryData"})
public class PaymentTransaction51 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RvslId")
	protected Max35Text reversalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed transaction.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversalIdentification
	 * PaymentTransaction60.mmReversalIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversalIdentification
	 * PaymentTransaction45.mmReversalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "RvslId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed transaction.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmReversalIdentification);
			previousVersion_lazy = () -> PaymentTransaction45.mmReversalIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupInformation3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
	 * OriginalGroupInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the original message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalGroupInformation
	 * PaymentTransaction60.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Provides information on the original message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalGroupInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.mmObject();
		}
	};
	@XmlElement(name = "OrgnlInstrId")
	protected Max35Text originalInstructionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalInstructionIdentification
	 * PaymentTransaction60.mmOriginalInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalInstructionIdentification
	 * PaymentTransaction45.mmOriginalInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalInstructionIdentification);
			previousVersion_lazy = () -> PaymentTransaction45.mmOriginalInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlEndToEndId")
	protected Max35Text originalEndToEndIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalEndToEndIdentification
	 * PaymentTransaction60.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalEndToEndIdentification
	 * PaymentTransaction45.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalEndToEndIdentification);
			previousVersion_lazy = () -> PaymentTransaction45.mmOriginalEndToEndIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlTxId")
	protected Max35Text originalTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalTransactionIdentification
	 * PaymentTransaction60.mmOriginalTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalTransactionIdentification
	 * PaymentTransaction45.mmOriginalTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionIdentification";
			definition = "Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalTransactionIdentification);
			previousVersion_lazy = () -> PaymentTransaction45.mmOriginalTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlClrSysRef")
	protected Max35Text originalClearingSystemReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
	 * PaymentIdentification.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlClrSysRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalClearingSystemReference
	 * PaymentTransaction60.mmOriginalClearingSystemReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalClearingSystemReference
	 * PaymentTransaction45.mmOriginalClearingSystemReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalClearingSystemReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmClearingSystemReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlClrSysRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalClearingSystemReference";
			definition = "Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalClearingSystemReference);
			previousVersion_lazy = () -> PaymentTransaction45.mmOriginalClearingSystemReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlIntrBkSttlmAmt")
	protected ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction60.mmOriginalInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction45.mmOriginalInterbankSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalInterbankSettlementAmount);
			previousVersion_lazy = () -> PaymentTransaction45.mmOriginalInterbankSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RvsdIntrBkSttlmAmt", required = true)
	protected ActiveCurrencyAndAmount reversedInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvsdIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent in the reversed transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversedInterbankSettlementAmount
	 * PaymentTransaction60.mmReversedInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversedInterbankSettlementAmount
	 * PaymentTransaction45.mmReversedInterbankSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversedInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "RvsdIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent in the reversed transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmReversedInterbankSettlementAmount);
			previousVersion_lazy = () -> PaymentTransaction45.mmReversedInterbankSettlementAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "IntrBkSttlmDt")
	protected ISODate interbankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\n\nUsage: The InterbankSettlementDate is the interbank settlement date of the reversal message, and not of the original instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmInterbankSettlementDate
	 * PaymentTransaction60.mmInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmInterbankSettlementDate
	 * PaymentTransaction45.mmInterbankSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\n\nUsage: The InterbankSettlementDate is the interbank settlement date of the reversal message, and not of the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmInterbankSettlementDate);
			previousVersion_lazy = () -> PaymentTransaction45.mmInterbankSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SttlmPrty")
	protected Priority3Code settlementPriority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority3Code
	 * Priority3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
	 * PaymentProcessing.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the settlement instruction.\r\n\r\n\r\nUsage: the SettlementPriority is the settlement priority of the reversal message, and not of the original instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmSettlementPriority
	 * PaymentTransaction60.mmSettlementPriority}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "SttlmPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the settlement instruction.\r\n\r\n\r\nUsage: the SettlementPriority is the settlement priority of the reversal message, and not of the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmSettlementPriority);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority3Code.mmObject();
		}
	};
	@XmlElement(name = "RvsdInstdAmt")
	protected ActiveOrHistoricCurrencyAndAmount reversedInstructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvsdInstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction.\r\nUsage: This amount has to be transported unchanged through the transaction chain."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversedInstructedAmount
	 * PaymentTransaction60.mmReversedInstructedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversedInstructedAmount
	 * PaymentTransaction45.mmReversedInstructedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversedInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "RvsdInstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmount";
			definition = "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction.\r\nUsage: This amount has to be transported unchanged through the transaction chain.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmReversedInstructedAmount);
			previousVersion_lazy = () -> PaymentTransaction45.mmReversedInstructedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "XchgRate")
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmExchangeRate
	 * PaymentTransaction60.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmExchangeRate
	 * PaymentTransaction45.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmExchangeRate);
			previousVersion_lazy = () -> PaymentTransaction45.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	@XmlElement(name = "CompstnAmt")
	protected ActiveOrHistoricCurrencyAndAmount compensationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CompstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money asked or paid as compensation for the processing of the instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmCompensationAmount
	 * PaymentTransaction60.mmCompensationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmCompensationAmount
	 * PaymentTransaction45.mmCompensationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompensationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "CompstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompensationAmount";
			definition = "Amount of money asked or paid as compensation for the processing of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmCompensationAmount);
			previousVersion_lazy = () -> PaymentTransaction45.mmCompensationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ChrgBr")
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmChargeBearer
	 * PaymentTransaction60.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmChargeBearer
	 * PaymentTransaction45.mmChargeBearer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmChargeBearer);
			previousVersion_lazy = () -> PaymentTransaction45.mmChargeBearer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	@XmlElement(name = "ChrgsInf")
	protected List<com.tools20022.repository.msg.Charges2> chargesInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charges2 Charges2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges to be paid by the charge bearer(s) related to the processing of the reversal transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmChargesInformation
	 * PaymentTransaction60.mmChargesInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmChargesInformation
	 * PaymentTransaction45.mmChargesInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "ChrgsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformation";
			definition = "Provides information on the charges to be paid by the charge bearer(s) related to the processing of the reversal transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmChargesInformation);
			previousVersion_lazy = () -> PaymentTransaction45.mmChargesInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charges2.mmObject();
		}
	};
	@XmlElement(name = "InstgAgt")
	protected BranchAndFinancialInstitutionIdentification5 instructingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).\n\nUsage: The instructing agent is the party sending the reversal message and not the party that sent the original instruction that is being reversed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmInstructingAgent
	 * PaymentTransaction60.mmInstructingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmInstructingAgent
	 * PaymentTransaction45.mmInstructingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).\n\nUsage: The instructing agent is the party sending the reversal message and not the party that sent the original instruction that is being reversed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmInstructingAgent);
			previousVersion_lazy = () -> PaymentTransaction45.mmInstructingAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "InstdAgt")
	protected BranchAndFinancialInstitutionIdentification5 instructedAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).\n\nUsage: The instructed agent is the party receiving the reversal message and not the party that received the original instruction that is being reversed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmInstructedAgent
	 * PaymentTransaction60.mmInstructedAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmInstructedAgent
	 * PaymentTransaction45.mmInstructedAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).\n\nUsage: The instructed agent is the party receiving the reversal message and not the party that received the original instruction that is being reversed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmInstructedAgent);
			previousVersion_lazy = () -> PaymentTransaction45.mmInstructedAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "RvslRsnInf")
	protected List<com.tools20022.repository.msg.PaymentReversalReason7> reversalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReversalReason7
	 * PaymentReversalReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the reversal reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversalReasonInformation
	 * PaymentTransaction60.mmReversalReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversalReasonInformation
	 * PaymentTransaction45.mmReversalReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReversalReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "RvslRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReasonInformation";
			definition = "Provides detailed information on the reversal reason.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmReversalReasonInformation);
			previousVersion_lazy = () -> PaymentTransaction45.mmReversalReasonInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentReversalReason7.mmObject();
		}
	};
	@XmlElement(name = "OrgnlTxRef")
	protected OriginalTransactionReference20 originalTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20
	 * OriginalTransactionReference20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key elements used to identify the original transaction that is being referred to."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalTransactionReference
	 * PaymentTransaction60.mmOriginalTransactionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalTransactionReference
	 * PaymentTransaction45.mmOriginalTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Key elements used to identify the original transaction that is being referred to.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmOriginalTransactionReference);
			previousVersion_lazy = () -> PaymentTransaction45.mmOriginalTransactionReference;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalTransactionReference20.mmObject();
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51
	 * PaymentTransaction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmSupplementaryData
	 * PaymentTransaction60.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmSupplementaryData
	 * PaymentTransaction45.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction51.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmSupplementaryData);
			previousVersion_lazy = () -> PaymentTransaction45.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction51.mmReversalIdentification, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalGroupInformation,
						com.tools20022.repository.msg.PaymentTransaction51.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.PaymentTransaction51.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalClearingSystemReference,
						com.tools20022.repository.msg.PaymentTransaction51.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransaction51.mmReversedInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentTransaction51.mmInterbankSettlementDate, com.tools20022.repository.msg.PaymentTransaction51.mmSettlementPriority,
						com.tools20022.repository.msg.PaymentTransaction51.mmReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransaction51.mmExchangeRate,
						com.tools20022.repository.msg.PaymentTransaction51.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransaction51.mmChargeBearer, com.tools20022.repository.msg.PaymentTransaction51.mmChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction51.mmInstructingAgent, com.tools20022.repository.msg.PaymentTransaction51.mmInstructedAgent,
						com.tools20022.repository.msg.PaymentTransaction51.mmReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction51.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(FIToFIPaymentReversalV05.mmTransactionInformation);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate1Rule.forPaymentTransaction51,
						com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransaction51,
						com.tools20022.repository.constraints.ConstraintChargesInformationAndReversedInstructedAmountRule.forPaymentTransaction51);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTransaction51";
				definition = "Provides further details on the reference and status on the original transactions, included in the original instruction, to which the reversal message applies.";
				nextVersions_lazy = () -> Arrays.asList(PaymentTransaction60.mmObject());
				previousVersion_lazy = () -> PaymentTransaction45.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReversalIdentification() {
		return reversalIdentification == null ? Optional.empty() : Optional.of(reversalIdentification);
	}

	public PaymentTransaction51 setReversalIdentification(Max35Text reversalIdentification) {
		this.reversalIdentification = reversalIdentification;
		return this;
	}

	public Optional<OriginalGroupInformation3> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public PaymentTransaction51 setOriginalGroupInformation(com.tools20022.repository.msg.OriginalGroupInformation3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public Optional<Max35Text> getOriginalInstructionIdentification() {
		return originalInstructionIdentification == null ? Optional.empty() : Optional.of(originalInstructionIdentification);
	}

	public PaymentTransaction51 setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification == null ? Optional.empty() : Optional.of(originalEndToEndIdentification);
	}

	public PaymentTransaction51 setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalTransactionIdentification() {
		return originalTransactionIdentification == null ? Optional.empty() : Optional.of(originalTransactionIdentification);
	}

	public PaymentTransaction51 setOriginalTransactionIdentification(Max35Text originalTransactionIdentification) {
		this.originalTransactionIdentification = originalTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalClearingSystemReference() {
		return originalClearingSystemReference == null ? Optional.empty() : Optional.of(originalClearingSystemReference);
	}

	public PaymentTransaction51 setOriginalClearingSystemReference(Max35Text originalClearingSystemReference) {
		this.originalClearingSystemReference = originalClearingSystemReference;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getOriginalInterbankSettlementAmount() {
		return originalInterbankSettlementAmount == null ? Optional.empty() : Optional.of(originalInterbankSettlementAmount);
	}

	public PaymentTransaction51 setOriginalInterbankSettlementAmount(ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount) {
		this.originalInterbankSettlementAmount = originalInterbankSettlementAmount;
		return this;
	}

	public ActiveCurrencyAndAmount getReversedInterbankSettlementAmount() {
		return reversedInterbankSettlementAmount;
	}

	public PaymentTransaction51 setReversedInterbankSettlementAmount(ActiveCurrencyAndAmount reversedInterbankSettlementAmount) {
		this.reversedInterbankSettlementAmount = Objects.requireNonNull(reversedInterbankSettlementAmount);
		return this;
	}

	public Optional<ISODate> getInterbankSettlementDate() {
		return interbankSettlementDate == null ? Optional.empty() : Optional.of(interbankSettlementDate);
	}

	public PaymentTransaction51 setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
		return this;
	}

	public Optional<Priority3Code> getSettlementPriority() {
		return settlementPriority == null ? Optional.empty() : Optional.of(settlementPriority);
	}

	public PaymentTransaction51 setSettlementPriority(Priority3Code settlementPriority) {
		this.settlementPriority = settlementPriority;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getReversedInstructedAmount() {
		return reversedInstructedAmount == null ? Optional.empty() : Optional.of(reversedInstructedAmount);
	}

	public PaymentTransaction51 setReversedInstructedAmount(ActiveOrHistoricCurrencyAndAmount reversedInstructedAmount) {
		this.reversedInstructedAmount = reversedInstructedAmount;
		return this;
	}

	public Optional<BaseOneRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public PaymentTransaction51 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getCompensationAmount() {
		return compensationAmount == null ? Optional.empty() : Optional.of(compensationAmount);
	}

	public PaymentTransaction51 setCompensationAmount(ActiveOrHistoricCurrencyAndAmount compensationAmount) {
		this.compensationAmount = compensationAmount;
		return this;
	}

	public Optional<ChargeBearerType1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public PaymentTransaction51 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public List<Charges2> getChargesInformation() {
		return chargesInformation == null ? chargesInformation = new ArrayList<>() : chargesInformation;
	}

	public PaymentTransaction51 setChargesInformation(List<com.tools20022.repository.msg.Charges2> chargesInformation) {
		this.chargesInformation = Objects.requireNonNull(chargesInformation);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getInstructingAgent() {
		return instructingAgent == null ? Optional.empty() : Optional.of(instructingAgent);
	}

	public PaymentTransaction51 setInstructingAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 instructingAgent) {
		this.instructingAgent = instructingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getInstructedAgent() {
		return instructedAgent == null ? Optional.empty() : Optional.of(instructedAgent);
	}

	public PaymentTransaction51 setInstructedAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 instructedAgent) {
		this.instructedAgent = instructedAgent;
		return this;
	}

	public List<PaymentReversalReason7> getReversalReasonInformation() {
		return reversalReasonInformation == null ? reversalReasonInformation = new ArrayList<>() : reversalReasonInformation;
	}

	public PaymentTransaction51 setReversalReasonInformation(List<com.tools20022.repository.msg.PaymentReversalReason7> reversalReasonInformation) {
		this.reversalReasonInformation = Objects.requireNonNull(reversalReasonInformation);
		return this;
	}

	public Optional<OriginalTransactionReference20> getOriginalTransactionReference() {
		return originalTransactionReference == null ? Optional.empty() : Optional.of(originalTransactionReference);
	}

	public PaymentTransaction51 setOriginalTransactionReference(com.tools20022.repository.msg.OriginalTransactionReference20 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public PaymentTransaction51 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}