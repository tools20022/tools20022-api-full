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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status for the processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmAcknowledgedAccepted
 * ProcessingStatus17Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmAlreadyMatchedAndAffirmed
 * ProcessingStatus17Choice.mmAlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmDefaultAction
 * ProcessingStatus17Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmDone
 * ProcessingStatus17Choice.mmDone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmForcedRejection
 * ProcessingStatus17Choice.mmForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmFullyExecutedConfirmationSent
 * ProcessingStatus17Choice.mmFullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmFuture
 * ProcessingStatus17Choice.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmGenerated
 * ProcessingStatus17Choice.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmInRepair
 * ProcessingStatus17Choice.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmNoInstruction
 * ProcessingStatus17Choice.mmNoInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmOpenOrder
 * ProcessingStatus17Choice.mmOpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmPendingProcessing
 * ProcessingStatus17Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmReceivedAtIntermediary
 * ProcessingStatus17Choice.mmReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmRejected
 * ProcessingStatus17Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmSettlementInstructionSent
 * ProcessingStatus17Choice.mmSettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmStandingInstruction
 * ProcessingStatus17Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmTradingSuspendedByStockExchange
 * ProcessingStatus17Choice.mmTradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmTreated
 * ProcessingStatus17Choice.mmTreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmProprietaryStatus
 * ProcessingStatus17Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV01.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmProcessingStatus}</li>
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
 * "ProcessingStatus17Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for the processing."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProcessingStatus17Choice", propOrder = {"acknowledgedAccepted", "alreadyMatchedAndAffirmed", "defaultAction", "done", "forcedRejection", "fullyExecutedConfirmationSent", "future", "generated", "inRepair", "noInstruction",
		"openOrder", "pendingProcessing", "receivedAtIntermediary", "rejected", "settlementInstructionSent", "standingInstruction", "tradingSuspendedByStockExchange", "treated", "proprietaryStatus"})
public class ProcessingStatus17Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ProprietaryReason1 acknowledgedAccepted;
	/**
	 * Trade is AcknowledgedAccepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is AcknowledgedAccepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Trade is AcknowledgedAccepted.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 alreadyMatchedAndAffirmed;
	/**
	 * Trade is AlreadyMatchedAndAffirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlrdyMtchdAndAffrmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyMatchedAndAffirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is AlreadyMatchedAndAffirmed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAlreadyMatchedAndAffirmed = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "AlrdyMtchdAndAffrmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyMatchedAndAffirmed";
			definition = "Trade is AlreadyMatchedAndAffirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 defaultAction;
	/**
	 * Trade is DefaultAction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is DefaultAction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultAction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "DfltActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Trade is DefaultAction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 done;
	/**
	 * Trade is Done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Done"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Done"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is Done."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDone = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Done";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Done";
			definition = "Trade is Done.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 forcedRejection;
	/**
	 * Trade is in forced rejection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForcdRjctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForcedRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is in forced rejection."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForcedRejection = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "ForcdRjctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForcedRejection";
			definition = "Trade is in forced rejection.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 fullyExecutedConfirmationSent;
	/**
	 * The trade is fully executed and the confirmation is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyExctdConfSnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyExecutedConfirmationSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The trade is fully executed and the confirmation is sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFullyExecutedConfirmationSent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "FullyExctdConfSnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedConfirmationSent";
			definition = "The trade is fully executed and the confirmation is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 future;
	/**
	 * Trade is future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Futr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is future."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFuture = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Futr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "Trade is future.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 generated;
	/**
	 * Trade is generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gnrtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is generated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenerated = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Gnrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "Trade is generated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected InstructionProcessingReason2Choice inRepair;
	/**
	 * Trade is InRepair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice
	 * InstructionProcessingReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InRpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is InRepair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInRepair = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Trade is InRepair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InstructionProcessingReason2Choice.mmObject();
		}
	};
	protected ProprietaryReason1 noInstruction;
	/**
	 * Trade is in no instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is in no instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNoInstruction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "NoInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstruction";
			definition = "Trade is in no instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 openOrder;
	/**
	 * Trade is in OpenOrder
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpnOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is in OpenOrder"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpenOrder = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "OpnOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOrder";
			definition = "Trade is in OpenOrder";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected PendingProcessing1Choice pendingProcessing;
	/**
	 * Processing of the trade is pending .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice
	 * PendingProcessing1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of the trade is pending ."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the trade is pending .";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessing1Choice.mmObject();
		}
	};
	protected ProprietaryReason1 receivedAtIntermediary;
	/**
	 * Trade is ReceivedAtIntermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdAtIntrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is ReceivedAtIntermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivedAtIntermediary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "RcvdAtIntrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Trade is ReceivedAtIntermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected InstructionProcessingReason1Choice rejected;
	/**
	 * Trade has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice
	 * InstructionProcessingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade has been rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Trade has been rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InstructionProcessingReason1Choice.mmObject();
		}
	};
	protected ProprietaryReason1 settlementInstructionSent;
	/**
	 * Settlement Instruction for the trade is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstrSnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement Instruction for the trade is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementInstructionSent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrSnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionSent";
			definition = "Settlement Instruction for the trade is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 standingInstruction;
	/**
	 * Trade is standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStandingInstruction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "StgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Trade is standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 tradingSuspendedByStockExchange;
	/**
	 * Trading is suspended by the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSspdByStockXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedByStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading is suspended by the stock exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSuspendedByStockExchange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "TradgSspdByStockXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedByStockExchange";
			definition = "Trading is suspended by the stock exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryReason1 treated;
	/**
	 * Trade is treated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is treated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTreated = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Trtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treated";
			definition = "Trade is treated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	protected ProprietaryStatusAndReason1 proprietaryStatus;
	/**
	 * Provides a proprietary status and a proprietary reason of the processing
	 * status of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a proprietary status and a proprietary reason of the processing status of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Provides a proprietary status and a proprietary reason of the processing status of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProcessingStatus17Choice.mmAcknowledgedAccepted, ProcessingStatus17Choice.mmAlreadyMatchedAndAffirmed, ProcessingStatus17Choice.mmDefaultAction, ProcessingStatus17Choice.mmDone,
						ProcessingStatus17Choice.mmForcedRejection, ProcessingStatus17Choice.mmFullyExecutedConfirmationSent, ProcessingStatus17Choice.mmFuture, ProcessingStatus17Choice.mmGenerated, ProcessingStatus17Choice.mmInRepair,
						ProcessingStatus17Choice.mmNoInstruction, ProcessingStatus17Choice.mmOpenOrder, ProcessingStatus17Choice.mmPendingProcessing, ProcessingStatus17Choice.mmReceivedAtIntermediary, ProcessingStatus17Choice.mmRejected,
						ProcessingStatus17Choice.mmSettlementInstructionSent, ProcessingStatus17Choice.mmStandingInstruction, ProcessingStatus17Choice.mmTradingSuspendedByStockExchange, ProcessingStatus17Choice.mmTreated,
						ProcessingStatus17Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV01.mmProcessingStatus, SecuritiesTradeConfirmationStatusAdviceV02.mmProcessingStatus);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatus17Choice";
				definition = "Choice of status for the processing.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AckdAccptd", required = true)
	public ProprietaryReason1 getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public void setAcknowledgedAccepted(ProprietaryReason1 acknowledgedAccepted) {
		this.acknowledgedAccepted = acknowledgedAccepted;
	}

	@XmlElement(name = "AlrdyMtchdAndAffrmd", required = true)
	public ProprietaryReason1 getAlreadyMatchedAndAffirmed() {
		return alreadyMatchedAndAffirmed;
	}

	public void setAlreadyMatchedAndAffirmed(ProprietaryReason1 alreadyMatchedAndAffirmed) {
		this.alreadyMatchedAndAffirmed = alreadyMatchedAndAffirmed;
	}

	@XmlElement(name = "DfltActn", required = true)
	public ProprietaryReason1 getDefaultAction() {
		return defaultAction;
	}

	public void setDefaultAction(ProprietaryReason1 defaultAction) {
		this.defaultAction = defaultAction;
	}

	@XmlElement(name = "Done", required = true)
	public ProprietaryReason1 getDone() {
		return done;
	}

	public void setDone(ProprietaryReason1 done) {
		this.done = done;
	}

	@XmlElement(name = "ForcdRjctn", required = true)
	public ProprietaryReason1 getForcedRejection() {
		return forcedRejection;
	}

	public void setForcedRejection(ProprietaryReason1 forcedRejection) {
		this.forcedRejection = forcedRejection;
	}

	@XmlElement(name = "FullyExctdConfSnt", required = true)
	public ProprietaryReason1 getFullyExecutedConfirmationSent() {
		return fullyExecutedConfirmationSent;
	}

	public void setFullyExecutedConfirmationSent(ProprietaryReason1 fullyExecutedConfirmationSent) {
		this.fullyExecutedConfirmationSent = fullyExecutedConfirmationSent;
	}

	@XmlElement(name = "Futr", required = true)
	public ProprietaryReason1 getFuture() {
		return future;
	}

	public void setFuture(ProprietaryReason1 future) {
		this.future = future;
	}

	@XmlElement(name = "Gnrtd", required = true)
	public ProprietaryReason1 getGenerated() {
		return generated;
	}

	public void setGenerated(ProprietaryReason1 generated) {
		this.generated = generated;
	}

	@XmlElement(name = "InRpr", required = true)
	public InstructionProcessingReason2Choice getInRepair() {
		return inRepair;
	}

	public void setInRepair(com.tools20022.repository.choice.InstructionProcessingReason2Choice inRepair) {
		this.inRepair = inRepair;
	}

	@XmlElement(name = "NoInstr", required = true)
	public ProprietaryReason1 getNoInstruction() {
		return noInstruction;
	}

	public void setNoInstruction(ProprietaryReason1 noInstruction) {
		this.noInstruction = noInstruction;
	}

	@XmlElement(name = "OpnOrdr", required = true)
	public ProprietaryReason1 getOpenOrder() {
		return openOrder;
	}

	public void setOpenOrder(ProprietaryReason1 openOrder) {
		this.openOrder = openOrder;
	}

	@XmlElement(name = "PdgPrcg", required = true)
	public PendingProcessing1Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public void setPendingProcessing(com.tools20022.repository.choice.PendingProcessing1Choice pendingProcessing) {
		this.pendingProcessing = pendingProcessing;
	}

	@XmlElement(name = "RcvdAtIntrmy", required = true)
	public ProprietaryReason1 getReceivedAtIntermediary() {
		return receivedAtIntermediary;
	}

	public void setReceivedAtIntermediary(ProprietaryReason1 receivedAtIntermediary) {
		this.receivedAtIntermediary = receivedAtIntermediary;
	}

	@XmlElement(name = "Rjctd", required = true)
	public InstructionProcessingReason1Choice getRejected() {
		return rejected;
	}

	public void setRejected(com.tools20022.repository.choice.InstructionProcessingReason1Choice rejected) {
		this.rejected = rejected;
	}

	@XmlElement(name = "SttlmInstrSnt", required = true)
	public ProprietaryReason1 getSettlementInstructionSent() {
		return settlementInstructionSent;
	}

	public void setSettlementInstructionSent(ProprietaryReason1 settlementInstructionSent) {
		this.settlementInstructionSent = settlementInstructionSent;
	}

	@XmlElement(name = "StgInstr", required = true)
	public ProprietaryReason1 getStandingInstruction() {
		return standingInstruction;
	}

	public void setStandingInstruction(ProprietaryReason1 standingInstruction) {
		this.standingInstruction = standingInstruction;
	}

	@XmlElement(name = "TradgSspdByStockXchg", required = true)
	public ProprietaryReason1 getTradingSuspendedByStockExchange() {
		return tradingSuspendedByStockExchange;
	}

	public void setTradingSuspendedByStockExchange(ProprietaryReason1 tradingSuspendedByStockExchange) {
		this.tradingSuspendedByStockExchange = tradingSuspendedByStockExchange;
	}

	@XmlElement(name = "Trtd", required = true)
	public ProprietaryReason1 getTreated() {
		return treated;
	}

	public void setTreated(ProprietaryReason1 treated) {
		this.treated = treated;
	}

	@XmlElement(name = "PrtrySts")
	public ProprietaryStatusAndReason1 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public void setProprietaryStatus(ProprietaryStatusAndReason1 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
	}
}