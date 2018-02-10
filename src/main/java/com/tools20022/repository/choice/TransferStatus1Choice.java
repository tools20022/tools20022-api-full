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
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of statuses for the status of the transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmStatus
 * TransferStatus1Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmPendingSettlement
 * TransferStatus1Choice.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmUnmatched
 * TransferStatus1Choice.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmInRepair
 * TransferStatus1Choice.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmRejected
 * TransferStatus1Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmFailedSettlement
 * TransferStatus1Choice.mmFailedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancelled
 * TransferStatus1Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmReversed
 * TransferStatus1Choice.mmReversed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancellationPending
 * TransferStatus1Choice.mmCancellationPending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of statuses for the status of the transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TransferStatus2Choice
 * TransferStatus2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferStatus1Choice", propOrder = {"status", "pendingSettlement", "unmatched", "inRepair", "rejected", "failedSettlement", "cancelled", "reversed", "cancellationPending"})
public class TransferStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected TransferInstructionStatus3 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus3
	 * TransferInstructionStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is received, accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmStatus
	 * TransferStatus2Choice.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the transfer is received, accepted, sent to next party, matched, already executed, or settled.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferInstructionStatus3.mmObject();
		}
	};
	@XmlElement(name = "PdgSttlm", required = true)
	protected PendingSettlementStatus2 pendingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
	 * PendingSettlementStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
	 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is pending settlement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmPendingSettlement
	 * TransferStatus2Choice.mmPendingSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingSettlement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmPendingSettlementReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Status of the transfer is pending settlement.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmPendingSettlement);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingSettlementStatus2.mmObject();
		}
	};
	@XmlElement(name = "Umtchd", required = true)
	protected TransferUnmatchedStatus2 unmatched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2
	 * TransferUnmatchedStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Umtchd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is unmatched."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmUnmatched
	 * TransferStatus2Choice.mmUnmatched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnmatched = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Status of the transfer is unmatched.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmUnmatched);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferUnmatchedStatus2.mmObject();
		}
	};
	@XmlElement(name = "InRpr", required = true)
	protected InRepairStatus3 inRepair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InRepairStatus3
	 * InRepairStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
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
	 * definition} = "Status of the transfer is in repair."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmInRepair
	 * TransferStatus2Choice.mmInRepair}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInRepair = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status of the transfer is in repair.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmInRepair);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InRepairStatus3.mmObject();
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected List<com.tools20022.repository.choice.RejectedStatus8Choice> rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus8Choice
	 * RejectedStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
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
	 * definition} = "Status of the transfer is rejected."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmRejected
	 * TransferStatus2Choice.mmRejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the transfer is rejected.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmRejected);
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectedStatus8Choice.mmObject();
		}
	};
	@XmlElement(name = "FaildSttlm", required = true)
	protected FailedSettlementStatus1 failedSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1
	 * FailedSettlementStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaildSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is failed settlement, that is, settlement in the International Central Securities Depository (ICSD) or Central Securities Depository (CSD) failed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmFailedSettlement
	 * TransferStatus2Choice.mmFailedSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailedSettlement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "FaildSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedSettlement";
			definition = "Status of the transfer is failed settlement, that is, settlement in the International Central Securities Depository (ICSD) or Central Securities Depository (CSD) failed.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmFailedSettlement);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FailedSettlementStatus1.mmObject();
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus3 cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CancelledStatus3
	 * CancelledStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is cancelled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancelled
	 * TransferStatus2Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the transfer is cancelled.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmCancelled);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus3.mmObject();
		}
	};
	@XmlElement(name = "Rvsd", required = true)
	protected ReversedStatus1 reversed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReversedStatus1
	 * ReversedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is reversed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmReversed
	 * TransferStatus2Choice.mmReversed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReversed = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rvsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversed";
			definition = "Status of the transfer is reversed.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmReversed);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReversedStatus1.mmObject();
		}
	};
	@XmlElement(name = "CxlPdg", required = true)
	protected CancellationPendingStatus1 cancellationPending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1
	 * CancellationPendingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
	 * TransferStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlPdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is cancellation pending."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancellationPending
	 * TransferStatus2Choice.mmCancellationPending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationPending = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlPdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationPending";
			definition = "Status of the transfer is cancellation pending.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmCancellationPending);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationPendingStatus1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TransferStatus1Choice.mmStatus, com.tools20022.repository.choice.TransferStatus1Choice.mmPendingSettlement,
						com.tools20022.repository.choice.TransferStatus1Choice.mmUnmatched, com.tools20022.repository.choice.TransferStatus1Choice.mmInRepair, com.tools20022.repository.choice.TransferStatus1Choice.mmRejected,
						com.tools20022.repository.choice.TransferStatus1Choice.mmFailedSettlement, com.tools20022.repository.choice.TransferStatus1Choice.mmCancelled, com.tools20022.repository.choice.TransferStatus1Choice.mmReversed,
						com.tools20022.repository.choice.TransferStatus1Choice.mmCancellationPending);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferStatus1Choice";
				definition = "Choice of statuses for the status of the transfer.";
				nextVersions_lazy = () -> Arrays.asList(TransferStatus2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TransferInstructionStatus3 getStatus() {
		return status;
	}

	public TransferStatus1Choice setStatus(TransferInstructionStatus3 status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public PendingSettlementStatus2 getPendingSettlement() {
		return pendingSettlement;
	}

	public TransferStatus1Choice setPendingSettlement(PendingSettlementStatus2 pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public TransferUnmatchedStatus2 getUnmatched() {
		return unmatched;
	}

	public TransferStatus1Choice setUnmatched(TransferUnmatchedStatus2 unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public InRepairStatus3 getInRepair() {
		return inRepair;
	}

	public TransferStatus1Choice setInRepair(InRepairStatus3 inRepair) {
		this.inRepair = Objects.requireNonNull(inRepair);
		return this;
	}

	public List<RejectedStatus8Choice> getRejected() {
		return rejected == null ? rejected = new ArrayList<>() : rejected;
	}

	public TransferStatus1Choice setRejected(List<com.tools20022.repository.choice.RejectedStatus8Choice> rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public FailedSettlementStatus1 getFailedSettlement() {
		return failedSettlement;
	}

	public TransferStatus1Choice setFailedSettlement(FailedSettlementStatus1 failedSettlement) {
		this.failedSettlement = Objects.requireNonNull(failedSettlement);
		return this;
	}

	public CancelledStatus3 getCancelled() {
		return cancelled;
	}

	public TransferStatus1Choice setCancelled(CancelledStatus3 cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public ReversedStatus1 getReversed() {
		return reversed;
	}

	public TransferStatus1Choice setReversed(ReversedStatus1 reversed) {
		this.reversed = Objects.requireNonNull(reversed);
		return this;
	}

	public CancellationPendingStatus1 getCancellationPending() {
		return cancellationPending;
	}

	public TransferStatus1Choice setCancellationPending(CancellationPendingStatus1 cancellationPending) {
		this.cancellationPending = Objects.requireNonNull(cancellationPending);
		return this;
	}
}