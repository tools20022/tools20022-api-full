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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RejectionReason32;
import com.tools20022.repository.msg.TransferInstructionStatus4;
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
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmStatus
 * TransferStatus2Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmPendingSettlement
 * TransferStatus2Choice.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmUnmatched
 * TransferStatus2Choice.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmInRepair
 * TransferStatus2Choice.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmRejected
 * TransferStatus2Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmFailedSettlement
 * TransferStatus2Choice.mmFailedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancelled
 * TransferStatus2Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmReversed
 * TransferStatus2Choice.mmReversed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancellationPending
 * TransferStatus2Choice.mmCancellationPending}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferStatus2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of statuses for the status of the transfer."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice
 * TransferStatus1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferStatus2Choice", propOrder = {"status", "pendingSettlement", "unmatched", "inRepair", "rejected", "failedSettlement", "cancelled", "reversed", "cancellationPending"})
public class TransferStatus2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected TransferInstructionStatus4 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4
	 * TransferInstructionStatus4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is received, accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmStatus
	 * TransferStatus1Choice.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, TransferInstructionStatus4> mmStatus = new MMMessageAssociationEnd<TransferStatus2Choice, TransferInstructionStatus4>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the transfer is received, accepted, sent to next party, matched, already executed, or settled.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferInstructionStatus4.mmObject();
		}

		@Override
		public TransferInstructionStatus4 getValue(TransferStatus2Choice obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, TransferInstructionStatus4 value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "PdgSttlm", required = true)
	protected PendingSettlementStatus3Choice pendingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
	 * PendingSettlementStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
	 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgSttlm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is pending settlement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmPendingSettlement
	 * TransferStatus1Choice.mmPendingSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, PendingSettlementStatus3Choice> mmPendingSettlement = new MMMessageAssociationEnd<TransferStatus2Choice, PendingSettlementStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmPendingSettlementReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Status of the transfer is pending settlement.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmPendingSettlement;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingSettlementStatus3Choice.mmObject();
		}

		@Override
		public PendingSettlementStatus3Choice getValue(TransferStatus2Choice obj) {
			return obj.getPendingSettlement();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, PendingSettlementStatus3Choice value) {
			obj.setPendingSettlement(value);
		}
	};
	@XmlElement(name = "Umtchd", required = true)
	protected TransferUnmatchedStatus3Choice unmatched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice
	 * TransferUnmatchedStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Umtchd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is unmatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmUnmatched
	 * TransferStatus1Choice.mmUnmatched}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, TransferUnmatchedStatus3Choice> mmUnmatched = new MMMessageAssociationEnd<TransferStatus2Choice, TransferUnmatchedStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Status of the transfer is unmatched.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmUnmatched;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferUnmatchedStatus3Choice.mmObject();
		}

		@Override
		public TransferUnmatchedStatus3Choice getValue(TransferStatus2Choice obj) {
			return obj.getUnmatched();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, TransferUnmatchedStatus3Choice value) {
			obj.setUnmatched(value);
		}
	};
	@XmlElement(name = "InRpr", required = true)
	protected InRepairStatus4Choice inRepair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice
	 * InRepairStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InRpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmInRepair
	 * TransferStatus1Choice.mmInRepair}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, InRepairStatus4Choice> mmInRepair = new MMMessageAssociationEnd<TransferStatus2Choice, InRepairStatus4Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status of the transfer is in repair.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmInRepair;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InRepairStatus4Choice.mmObject();
		}

		@Override
		public InRepairStatus4Choice getValue(TransferStatus2Choice obj) {
			return obj.getInRepair();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, InRepairStatus4Choice value) {
			obj.setInRepair(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected List<RejectionReason32> rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectionReason32
	 * RejectionReason32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmRejected
	 * TransferStatus1Choice.mmRejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, List<RejectionReason32>> mmRejected = new MMMessageAssociationEnd<TransferStatus2Choice, List<RejectionReason32>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the transfer is rejected.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmRejected;
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionReason32.mmObject();
		}

		@Override
		public List<RejectionReason32> getValue(TransferStatus2Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, List<RejectionReason32> value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "FaildSttlm", required = true)
	protected FailedSettlementStatus2Choice failedSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice
	 * FailedSettlementStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaildSttlm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is failed settlement, that is, settlement in the International Central Securities Depository (ICSD) or Central Securities Depository (CSD) failed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmFailedSettlement
	 * TransferStatus1Choice.mmFailedSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, FailedSettlementStatus2Choice> mmFailedSettlement = new MMMessageAssociationEnd<TransferStatus2Choice, FailedSettlementStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "FaildSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedSettlement";
			definition = "Status of the transfer is failed settlement, that is, settlement in the International Central Securities Depository (ICSD) or Central Securities Depository (CSD) failed.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmFailedSettlement;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FailedSettlementStatus2Choice.mmObject();
		}

		@Override
		public FailedSettlementStatus2Choice getValue(TransferStatus2Choice obj) {
			return obj.getFailedSettlement();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, FailedSettlementStatus2Choice value) {
			obj.setFailedSettlement(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus13Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice
	 * CancelledStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancelled
	 * TransferStatus1Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, CancelledStatus13Choice> mmCancelled = new MMMessageAssociationEnd<TransferStatus2Choice, CancelledStatus13Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the transfer is cancelled.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus13Choice.mmObject();
		}

		@Override
		public CancelledStatus13Choice getValue(TransferStatus2Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, CancelledStatus13Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "Rvsd", required = true)
	protected ReversedStatus2Choice reversed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice
	 * ReversedStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvsd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is reversed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmReversed
	 * TransferStatus1Choice.mmReversed}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, ReversedStatus2Choice> mmReversed = new MMMessageAssociationEnd<TransferStatus2Choice, ReversedStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Rvsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversed";
			definition = "Status of the transfer is reversed.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmReversed;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReversedStatus2Choice.mmObject();
		}

		@Override
		public ReversedStatus2Choice getValue(TransferStatus2Choice obj) {
			return obj.getReversed();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, ReversedStatus2Choice value) {
			obj.setReversed(value);
		}
	};
	@XmlElement(name = "CxlPdg", required = true)
	protected CancellationPendingStatus7Choice cancellationPending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice
	 * CancellationPendingStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlPdg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer is cancellation pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancellationPending
	 * TransferStatus1Choice.mmCancellationPending}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatus2Choice, CancellationPendingStatus7Choice> mmCancellationPending = new MMMessageAssociationEnd<TransferStatus2Choice, CancellationPendingStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.TransferStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlPdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationPending";
			definition = "Status of the transfer is cancellation pending.";
			previousVersion_lazy = () -> TransferStatus1Choice.mmCancellationPending;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationPendingStatus7Choice.mmObject();
		}

		@Override
		public CancellationPendingStatus7Choice getValue(TransferStatus2Choice obj) {
			return obj.getCancellationPending();
		}

		@Override
		public void setValue(TransferStatus2Choice obj, CancellationPendingStatus7Choice value) {
			obj.setCancellationPending(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TransferStatus2Choice.mmStatus, com.tools20022.repository.choice.TransferStatus2Choice.mmPendingSettlement,
						com.tools20022.repository.choice.TransferStatus2Choice.mmUnmatched, com.tools20022.repository.choice.TransferStatus2Choice.mmInRepair, com.tools20022.repository.choice.TransferStatus2Choice.mmRejected,
						com.tools20022.repository.choice.TransferStatus2Choice.mmFailedSettlement, com.tools20022.repository.choice.TransferStatus2Choice.mmCancelled, com.tools20022.repository.choice.TransferStatus2Choice.mmReversed,
						com.tools20022.repository.choice.TransferStatus2Choice.mmCancellationPending);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferStatus2Choice";
				definition = "Choice of statuses for the status of the transfer.";
				previousVersion_lazy = () -> TransferStatus1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransferInstructionStatus4 getStatus() {
		return status;
	}

	public TransferStatus2Choice setStatus(TransferInstructionStatus4 status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public PendingSettlementStatus3Choice getPendingSettlement() {
		return pendingSettlement;
	}

	public TransferStatus2Choice setPendingSettlement(PendingSettlementStatus3Choice pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public TransferUnmatchedStatus3Choice getUnmatched() {
		return unmatched;
	}

	public TransferStatus2Choice setUnmatched(TransferUnmatchedStatus3Choice unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public InRepairStatus4Choice getInRepair() {
		return inRepair;
	}

	public TransferStatus2Choice setInRepair(InRepairStatus4Choice inRepair) {
		this.inRepair = Objects.requireNonNull(inRepair);
		return this;
	}

	public List<RejectionReason32> getRejected() {
		return rejected == null ? rejected = new ArrayList<>() : rejected;
	}

	public TransferStatus2Choice setRejected(List<RejectionReason32> rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public FailedSettlementStatus2Choice getFailedSettlement() {
		return failedSettlement;
	}

	public TransferStatus2Choice setFailedSettlement(FailedSettlementStatus2Choice failedSettlement) {
		this.failedSettlement = Objects.requireNonNull(failedSettlement);
		return this;
	}

	public CancelledStatus13Choice getCancelled() {
		return cancelled;
	}

	public TransferStatus2Choice setCancelled(CancelledStatus13Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public ReversedStatus2Choice getReversed() {
		return reversed;
	}

	public TransferStatus2Choice setReversed(ReversedStatus2Choice reversed) {
		this.reversed = Objects.requireNonNull(reversed);
		return this;
	}

	public CancellationPendingStatus7Choice getCancellationPending() {
		return cancellationPending;
	}

	public TransferStatus2Choice setCancellationPending(CancellationPendingStatus7Choice cancellationPending) {
		this.cancellationPending = Objects.requireNonNull(cancellationPending);
		return this;
	}
}