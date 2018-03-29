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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.sese.TransferInstructionStatusReport;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransferInstructionStatus;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the status of a transfer instruction and its reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#TypeOfStatusRule
 * TransferStatusAndReason.TypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmTransferReference
 * TransferStatusAndReason.mmTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmStatus
 * TransferStatusAndReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmPendingSettlement
 * TransferStatusAndReason.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmUnmatched
 * TransferStatusAndReason.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmInRepair
 * TransferStatusAndReason.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmRejected
 * TransferStatusAndReason.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmStatusInitiator
 * TransferStatusAndReason.mmStatusInitiator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmStatusReport
 * TransferInstructionStatusReport.mmStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferStatusAndReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the status of a transfer instruction and its reason."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferStatusAndReason", propOrder = {"transferReference", "status", "pendingSettlement", "unmatched", "inRepair", "rejected", "statusInitiator"})
public class TransferStatusAndReason {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfRef", required = true)
	protected Max35Text transferReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business reference of the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason, Max35Text> mmTransferReference = new MMMessageAttribute<TransferStatusAndReason, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Business reference of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransferStatusAndReason obj) {
			return obj.getTransferReference();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, Max35Text value) {
			obj.setTransferReference(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected TransferInstructionStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus
	 * TransferInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
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
	 * definition} = "Instruction status and the reason for the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason, TransferInstructionStatus> mmStatus = new MMMessageAssociationEnd<TransferStatusAndReason, TransferInstructionStatus>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Instruction status and the reason for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferInstructionStatus.mmObject();
		}

		@Override
		public TransferInstructionStatus getValue(TransferStatusAndReason obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, TransferInstructionStatus value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "PdgSttlm", required = true)
	protected PendingSettlementStatusChoice pendingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice
	 * PendingSettlementStatusChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
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
	 * definition} = "Status of the transfer instruction is pending settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason, PendingSettlementStatusChoice> mmPendingSettlement = new MMMessageAssociationEnd<TransferStatusAndReason, PendingSettlementStatusChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Status of the transfer instruction is pending settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingSettlementStatusChoice.mmObject();
		}

		@Override
		public PendingSettlementStatusChoice getValue(TransferStatusAndReason obj) {
			return obj.getPendingSettlement();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, PendingSettlementStatusChoice value) {
			obj.setPendingSettlement(value);
		}
	};
	@XmlElement(name = "Umtchd", required = true)
	protected TransferUnmatchedStatus unmatched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus
	 * TransferUnmatchedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
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
	 * definition} = "Status of the transfer instruction is unmatched."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason, TransferUnmatchedStatus> mmUnmatched = new MMMessageAssociationEnd<TransferStatusAndReason, TransferUnmatchedStatus>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Status of the transfer instruction is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferUnmatchedStatus.mmObject();
		}

		@Override
		public TransferUnmatchedStatus getValue(TransferStatusAndReason obj) {
			return obj.getUnmatched();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, TransferUnmatchedStatus value) {
			obj.setUnmatched(value);
		}
	};
	@XmlElement(name = "InRpr", required = true)
	protected InRepairStatus2Choice inRepair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus2Choice
	 * InRepairStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
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
	 * definition} = "Status is in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason, InRepairStatus2Choice> mmInRepair = new MMMessageAssociationEnd<TransferStatusAndReason, InRepairStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status is in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InRepairStatus2Choice.mmObject();
		}

		@Override
		public InRepairStatus2Choice getValue(TransferStatusAndReason obj) {
			return obj.getInRepair();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, InRepairStatus2Choice value) {
			obj.setInRepair(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus3Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus3Choice
	 * RejectedStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
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
	 * definition} = "Status of the transfer instructed is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason, RejectedStatus3Choice> mmRejected = new MMMessageAssociationEnd<TransferStatusAndReason, RejectedStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the transfer instructed is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus3Choice.mmObject();
		}

		@Override
		public RejectedStatus3Choice getValue(TransferStatusAndReason obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, RejectedStatus3Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification1Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that initiates the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason, Optional<PartyIdentification1Choice>> mmStatusInitiator = new MMMessageAssociationEnd<TransferStatusAndReason, Optional<PartyIdentification1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification1Choice> getValue(TransferStatusAndReason obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(TransferStatusAndReason obj, Optional<PartyIdentification1Choice> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list (Status, PendingSettlement,
	 * InRepair, Rejected, Unmatched) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmStatus
	 * TransferStatusAndReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmPendingSettlement
	 * TransferStatusAndReason.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmUnmatched
	 * TransferStatusAndReason.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmInRepair
	 * TransferStatusAndReason.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmRejected
	 * TransferStatusAndReason.mmRejected}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Status, PendingSettlement, InRepair, Rejected, Unmatched) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (Status, PendingSettlement, InRepair, Rejected, Unmatched) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason.mmStatus, com.tools20022.repository.msg.TransferStatusAndReason.mmPendingSettlement,
					com.tools20022.repository.msg.TransferStatusAndReason.mmUnmatched, com.tools20022.repository.msg.TransferStatusAndReason.mmInRepair, com.tools20022.repository.msg.TransferStatusAndReason.mmRejected);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason.mmTransferReference, com.tools20022.repository.msg.TransferStatusAndReason.mmStatus,
						com.tools20022.repository.msg.TransferStatusAndReason.mmPendingSettlement, com.tools20022.repository.msg.TransferStatusAndReason.mmUnmatched, com.tools20022.repository.msg.TransferStatusAndReason.mmInRepair,
						com.tools20022.repository.msg.TransferStatusAndReason.mmRejected, com.tools20022.repository.msg.TransferStatusAndReason.mmStatusInitiator);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInstructionStatusReport.mmStatusReport);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransferStatusAndReason";
				definition = "Information about the status of a transfer instruction and its reason.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason.TypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransferReference() {
		return transferReference;
	}

	public TransferStatusAndReason setTransferReference(Max35Text transferReference) {
		this.transferReference = Objects.requireNonNull(transferReference);
		return this;
	}

	public TransferInstructionStatus getStatus() {
		return status;
	}

	public TransferStatusAndReason setStatus(TransferInstructionStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public PendingSettlementStatusChoice getPendingSettlement() {
		return pendingSettlement;
	}

	public TransferStatusAndReason setPendingSettlement(PendingSettlementStatusChoice pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public TransferUnmatchedStatus getUnmatched() {
		return unmatched;
	}

	public TransferStatusAndReason setUnmatched(TransferUnmatchedStatus unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public InRepairStatus2Choice getInRepair() {
		return inRepair;
	}

	public TransferStatusAndReason setInRepair(InRepairStatus2Choice inRepair) {
		this.inRepair = Objects.requireNonNull(inRepair);
		return this;
	}

	public RejectedStatus3Choice getRejected() {
		return rejected;
	}

	public TransferStatusAndReason setRejected(RejectedStatus3Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public Optional<PartyIdentification1Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public TransferStatusAndReason setStatusInitiator(PartyIdentification1Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}