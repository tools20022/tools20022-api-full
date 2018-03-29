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
import com.tools20022.repository.area.sese.TransferInstructionStatusReportV02;
import com.tools20022.repository.area.sese.TransferInstructionStatusReportV03;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.choice.RejectedStatus8Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#TypeOfStatusRule
 * TransferStatusAndReason2.TypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmMasterReference
 * TransferStatusAndReason2.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmTransferReference
 * TransferStatusAndReason2.mmTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmClientReference
 * TransferStatusAndReason2.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancellationReference
 * TransferStatusAndReason2.mmCancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmStatus
 * TransferStatusAndReason2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmPendingSettlement
 * TransferStatusAndReason2.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmUnmatched
 * TransferStatusAndReason2.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmInRepair
 * TransferStatusAndReason2.mmInRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmRejected
 * TransferStatusAndReason2.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmFailedSettlement
 * TransferStatusAndReason2.mmFailedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancelled
 * TransferStatusAndReason2.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmReversed
 * TransferStatusAndReason2.mmReversed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancellationPending
 * TransferStatusAndReason2.mmCancellationPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmTradeDate
 * TransferStatusAndReason2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmSendOutDate
 * TransferStatusAndReason2.mmSendOutDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmStatusInitiator
 * TransferStatusAndReason2.mmStatusInitiator}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmStatusReport
 * TransferInstructionStatusReportV02.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmStatusReport
 * TransferInstructionStatusReportV03.mmStatusReport}</li>
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
 * "TransferStatusAndReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the status of a transfer instruction and its reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason3
 * TransferStatusAndReason3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferStatusAndReason2", propOrder = {"masterReference", "transferReference", "clientReference", "cancellationReference", "status", "pendingSettlement", "unmatched", "inRepair", "rejected", "failedSettlement",
		"cancelled", "reversed", "cancellationPending", "tradeDate", "sendOutDate", "statusInitiator"})
public class TransferStatusAndReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmMasterReference
	 * TransferStatusAndReason3.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason2, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<TransferStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransferStatusAndReason2 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * definition} =
	 * "Unique and unambiguous identification of a transfer, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmTransferReference
	 * TransferStatusAndReason3.mmTransferReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason2, Max35Text> mmTransferReference = new MMMessageAttribute<TransferStatusAndReason2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identification of a transfer, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmTransferReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransferStatusAndReason2 obj) {
			return obj.getTransferReference();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Max35Text value) {
			obj.setTransferReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmClientReference
	 * TransferStatusAndReason3.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason2, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<TransferStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransferStatusAndReason2 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRef")
	protected Max35Text cancellationReference;
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
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmCancellationReference
	 * TransferStatusAndReason3.mmCancellationReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason2, Optional<Max35Text>> mmCancellationReference = new MMMessageAttribute<TransferStatusAndReason2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmCancellationReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransferStatusAndReason2 obj) {
			return obj.getCancellationReference();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setCancellationReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected TransferInstructionStatus2 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus2
	 * TransferInstructionStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * "Status of the transfer is accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, TransferInstructionStatus2> mmStatus = new MMMessageAssociationEnd<TransferStatusAndReason2, TransferInstructionStatus2>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the transfer is accepted, sent to next party, matched, already executed, or settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferInstructionStatus2.mmObject();
		}

		@Override
		public TransferInstructionStatus2 getValue(TransferStatusAndReason2 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, TransferInstructionStatus2 value) {
			obj.setStatus(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, PendingSettlementStatus2> mmPendingSettlement = new MMMessageAssociationEnd<TransferStatusAndReason2, PendingSettlementStatus2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Status of the transfer is pending settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingSettlementStatus2.mmObject();
		}

		@Override
		public PendingSettlementStatus2 getValue(TransferStatusAndReason2 obj) {
			return obj.getPendingSettlement();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, PendingSettlementStatus2 value) {
			obj.setPendingSettlement(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, TransferUnmatchedStatus2> mmUnmatched = new MMMessageAssociationEnd<TransferStatusAndReason2, TransferUnmatchedStatus2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Status of the transfer is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferUnmatchedStatus2.mmObject();
		}

		@Override
		public TransferUnmatchedStatus2 getValue(TransferStatusAndReason2 obj) {
			return obj.getUnmatched();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, TransferUnmatchedStatus2 value) {
			obj.setUnmatched(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, InRepairStatus3> mmInRepair = new MMMessageAssociationEnd<TransferStatusAndReason2, InRepairStatus3>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Status of the transfer is in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InRepairStatus3.mmObject();
		}

		@Override
		public InRepairStatus3 getValue(TransferStatusAndReason2 obj) {
			return obj.getInRepair();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, InRepairStatus3 value) {
			obj.setInRepair(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus8Choice rejected;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, RejectedStatus8Choice> mmRejected = new MMMessageAssociationEnd<TransferStatusAndReason2, RejectedStatus8Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the transfer is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus8Choice.mmObject();
		}

		@Override
		public RejectedStatus8Choice getValue(TransferStatusAndReason2 obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, RejectedStatus8Choice value) {
			obj.setRejected(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * "Status of the transfer is failed settlement, ie, settlement in the International Central Securities Depository (ICSD) or Central Securities Depository (CSD) failed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, FailedSettlementStatus1> mmFailedSettlement = new MMMessageAssociationEnd<TransferStatusAndReason2, FailedSettlementStatus1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "FaildSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedSettlement";
			definition = "Status of the transfer is failed settlement, ie, settlement in the International Central Securities Depository (ICSD) or Central Securities Depository (CSD) failed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FailedSettlementStatus1.mmObject();
		}

		@Override
		public FailedSettlementStatus1 getValue(TransferStatusAndReason2 obj) {
			return obj.getFailedSettlement();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, FailedSettlementStatus1 value) {
			obj.setFailedSettlement(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, CancelledStatus3> mmCancelled = new MMMessageAssociationEnd<TransferStatusAndReason2, CancelledStatus3>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Status of the transfer is cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus3.mmObject();
		}

		@Override
		public CancelledStatus3 getValue(TransferStatusAndReason2 obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, CancelledStatus3 value) {
			obj.setCancelled(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, ReversedStatus1> mmReversed = new MMMessageAssociationEnd<TransferStatusAndReason2, ReversedStatus1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Rvsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversed";
			definition = "Status of the transfer is reversed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReversedStatus1.mmObject();
		}

		@Override
		public ReversedStatus1 getValue(TransferStatusAndReason2 obj) {
			return obj.getReversed();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, ReversedStatus1 value) {
			obj.setReversed(value);
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
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, CancellationPendingStatus1> mmCancellationPending = new MMMessageAssociationEnd<TransferStatusAndReason2, CancellationPendingStatus1>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "CxlPdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationPending";
			definition = "Status of the transfer is cancellation pending.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationPendingStatus1.mmObject();
		}

		@Override
		public CancellationPendingStatus1 getValue(TransferStatusAndReason2 obj) {
			return obj.getCancellationPending();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, CancellationPendingStatus1 value) {
			obj.setCancellationPending(value);
		}
	};
	@XmlElement(name = "TradDt")
	protected ISODate tradeDate;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the transfer was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmTradeDate
	 * TransferStatusAndReason3.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason2, Optional<ISODate>> mmTradeDate = new MMMessageAttribute<TransferStatusAndReason2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time at which the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransferStatusAndReason2 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Optional<ISODate> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SndOutDt")
	protected ISODate sendOutDate;
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
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndOutDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendOutDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the document, for example, the application form, was sent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmSendOutDate
	 * TransferStatusAndReason3.mmSendOutDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason2, Optional<ISODate>> mmSendOutDate = new MMMessageAttribute<TransferStatusAndReason2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "SndOutDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendOutDate";
			definition = "Date on which the document, for example, the application form, was sent.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmSendOutDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransferStatusAndReason2 obj) {
			return obj.getSendOutDate();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Optional<ISODate> value) {
			obj.setSendOutDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification2Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmStatusInitiator
	 * TransferStatusAndReason3.mmStatusInitiator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason2, Optional<PartyIdentification2Choice>> mmStatusInitiator = new MMMessageAssociationEnd<TransferStatusAndReason2, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status.";
			nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmStatusInitiator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(TransferStatusAndReason2 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(TransferStatusAndReason2 obj, Optional<PartyIdentification2Choice> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list (Status, PendingSettlement,
	 * Unmatched, InRepair, Rejected, FailedSettlement, Cancelled, Reversed,
	 * CancellationPending) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmStatus
	 * TransferStatusAndReason2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmPendingSettlement
	 * TransferStatusAndReason2.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmUnmatched
	 * TransferStatusAndReason2.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmInRepair
	 * TransferStatusAndReason2.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmRejected
	 * TransferStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmFailedSettlement
	 * TransferStatusAndReason2.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancelled
	 * TransferStatusAndReason2.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmReversed
	 * TransferStatusAndReason2.mmReversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancellationPending
	 * TransferStatusAndReason2.mmCancellationPending}</li>
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
	 * "One and only one message element in the list (Status, PendingSettlement, Unmatched, InRepair, Rejected, FailedSettlement, Cancelled, Reversed, CancellationPending) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (Status, PendingSettlement, Unmatched, InRepair, Rejected, FailedSettlement, Cancelled, Reversed, CancellationPending) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason2.mmStatus, com.tools20022.repository.msg.TransferStatusAndReason2.mmPendingSettlement,
					com.tools20022.repository.msg.TransferStatusAndReason2.mmUnmatched, com.tools20022.repository.msg.TransferStatusAndReason2.mmInRepair, com.tools20022.repository.msg.TransferStatusAndReason2.mmRejected,
					com.tools20022.repository.msg.TransferStatusAndReason2.mmFailedSettlement, com.tools20022.repository.msg.TransferStatusAndReason2.mmCancelled, com.tools20022.repository.msg.TransferStatusAndReason2.mmReversed,
					com.tools20022.repository.msg.TransferStatusAndReason2.mmCancellationPending);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason2.mmMasterReference, com.tools20022.repository.msg.TransferStatusAndReason2.mmTransferReference,
						com.tools20022.repository.msg.TransferStatusAndReason2.mmClientReference, com.tools20022.repository.msg.TransferStatusAndReason2.mmCancellationReference,
						com.tools20022.repository.msg.TransferStatusAndReason2.mmStatus, com.tools20022.repository.msg.TransferStatusAndReason2.mmPendingSettlement, com.tools20022.repository.msg.TransferStatusAndReason2.mmUnmatched,
						com.tools20022.repository.msg.TransferStatusAndReason2.mmInRepair, com.tools20022.repository.msg.TransferStatusAndReason2.mmRejected, com.tools20022.repository.msg.TransferStatusAndReason2.mmFailedSettlement,
						com.tools20022.repository.msg.TransferStatusAndReason2.mmCancelled, com.tools20022.repository.msg.TransferStatusAndReason2.mmReversed, com.tools20022.repository.msg.TransferStatusAndReason2.mmCancellationPending,
						com.tools20022.repository.msg.TransferStatusAndReason2.mmTradeDate, com.tools20022.repository.msg.TransferStatusAndReason2.mmSendOutDate, com.tools20022.repository.msg.TransferStatusAndReason2.mmStatusInitiator);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInstructionStatusReportV02.mmStatusReport, TransferInstructionStatusReportV03.mmStatusReport);
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
				name = "TransferStatusAndReason2";
				definition = "Information about the status of a transfer instruction and its reason.";
				nextVersions_lazy = () -> Arrays.asList(TransferStatusAndReason3.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason2.TypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public TransferStatusAndReason2 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getTransferReference() {
		return transferReference;
	}

	public TransferStatusAndReason2 setTransferReference(Max35Text transferReference) {
		this.transferReference = Objects.requireNonNull(transferReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public TransferStatusAndReason2 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getCancellationReference() {
		return cancellationReference == null ? Optional.empty() : Optional.of(cancellationReference);
	}

	public TransferStatusAndReason2 setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
		return this;
	}

	public TransferInstructionStatus2 getStatus() {
		return status;
	}

	public TransferStatusAndReason2 setStatus(TransferInstructionStatus2 status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public PendingSettlementStatus2 getPendingSettlement() {
		return pendingSettlement;
	}

	public TransferStatusAndReason2 setPendingSettlement(PendingSettlementStatus2 pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public TransferUnmatchedStatus2 getUnmatched() {
		return unmatched;
	}

	public TransferStatusAndReason2 setUnmatched(TransferUnmatchedStatus2 unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public InRepairStatus3 getInRepair() {
		return inRepair;
	}

	public TransferStatusAndReason2 setInRepair(InRepairStatus3 inRepair) {
		this.inRepair = Objects.requireNonNull(inRepair);
		return this;
	}

	public RejectedStatus8Choice getRejected() {
		return rejected;
	}

	public TransferStatusAndReason2 setRejected(RejectedStatus8Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public FailedSettlementStatus1 getFailedSettlement() {
		return failedSettlement;
	}

	public TransferStatusAndReason2 setFailedSettlement(FailedSettlementStatus1 failedSettlement) {
		this.failedSettlement = Objects.requireNonNull(failedSettlement);
		return this;
	}

	public CancelledStatus3 getCancelled() {
		return cancelled;
	}

	public TransferStatusAndReason2 setCancelled(CancelledStatus3 cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public ReversedStatus1 getReversed() {
		return reversed;
	}

	public TransferStatusAndReason2 setReversed(ReversedStatus1 reversed) {
		this.reversed = Objects.requireNonNull(reversed);
		return this;
	}

	public CancellationPendingStatus1 getCancellationPending() {
		return cancellationPending;
	}

	public TransferStatusAndReason2 setCancellationPending(CancellationPendingStatus1 cancellationPending) {
		this.cancellationPending = Objects.requireNonNull(cancellationPending);
		return this;
	}

	public Optional<ISODate> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public TransferStatusAndReason2 setTradeDate(ISODate tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<ISODate> getSendOutDate() {
		return sendOutDate == null ? Optional.empty() : Optional.of(sendOutDate);
	}

	public TransferStatusAndReason2 setSendOutDate(ISODate sendOutDate) {
		this.sendOutDate = sendOutDate;
		return this;
	}

	public Optional<PartyIdentification2Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public TransferStatusAndReason2 setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}