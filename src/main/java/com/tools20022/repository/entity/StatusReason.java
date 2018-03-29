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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.RegisteredContract;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for the status of an object.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StatusReason" src="doc-files/StatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmReason
 * StatusReason.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
 * StatusReason.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
 * StatusReason.mmRejectedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
 * StatusReason.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
 * StatusReason.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
 * StatusReason.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
 * StatusReason.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
 * StatusReason.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRelatedClosureReason
 * StatusReason.mmRelatedClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
 * RegisteredContract.mmClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason1#mmReason
 * ProprietaryReason1.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason2#mmReason
 * ProprietaryReason2.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason1Choice#mmCode
 * ReturnReason1Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason1Choice#mmProprietary
 * ReturnReason1Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice#mmCode
 * ReturnReason5Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason5Choice#mmProprietary
 * ReturnReason5Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation6#mmReason
 * ReversalReasonInformation6.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#mmReason
 * PaymentReversalReason7.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentReasonInformation1#mmReason
 * AmendmentReasonInformation1.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason1#mmReason
 * PaymentReturnReason1.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason3#mmReason
 * InRepairStatusReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus#mmReason
 * TransferUnmatchedStatus.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#mmReason
 * TransferUnmatchedStatus2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#mmExtendedReason
 * TransferUnmatchedStatus2.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1#mmDataSourceScheme
 * FailedSettlementStatus1.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice#mmGlobalRejectionReason
 * RejectionReason1Choice.mmGlobalRejectionReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason3Choice#mmCode
 * ReturnReason3Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason3Choice#mmProprietary
 * ReturnReason3Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason4Choice#mmCode
 * ReturnReason4Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason4Choice#mmProprietary
 * ReturnReason4Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reason3#mmReason
 * Reason3.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reason3Choice#mmReason
 * Reason3Choice.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason4#mmReason
 * ProprietaryReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmStatus
 * CancellationStatusAndReason3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmReason
 * TransferUnmatchedStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmExtendedReason
 * TransferUnmatchedStatus3Choice.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#mmDataSourceScheme
 * FailedSettlementStatus2Choice.mmDataSourceScheme}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#mmRejected
 * Status21Choice.mmRejected}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#mmComplete
 * Status21Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancelledCompleteReason1#mmAdditionalReasonInformation
 * CancelledCompleteReason1.mmAdditionalReasonInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason5#mmReason
 * ProprietaryReason5.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reason4#mmReason
 * Reason4.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reason18Choice#mmReason
 * Reason18Choice.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosedStatusReason1#mmCode
 * ClosedStatusReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1#mmCode
 * ProformaStatusReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1#mmCode
 * DisabledStatusReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnabledStatusReason1#mmCode
 * EnabledStatusReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason4#mmReason
 * SuspendedStatusReason4.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason4#mmReason
 * InRepairStatusReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4#mmStatus
 * CancellationStatusAndReason4.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference12#mmReversalReason
 * TransferReference12.mmReversalReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason4#mmReason
 * PaymentReturnReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason8#mmReason
 * PaymentReversalReason8.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatusReason
 * UndertakingStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatusReason
 * MeetingStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.BlockedReason1Choice
 * BlockedReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason3Choice
 * RejectedReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification
 * ProprietaryStatusJustification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason1
 * ProprietaryReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
 * NoSpecifiedReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason2
 * ProprietaryReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason1Choice
 * ReturnReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice
 * ReturnReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason2
 * PaymentReturnReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReversalReasonInformation6
 * ReversalReasonInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReversalReason7
 * PaymentReversalReason7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StatusReason6Choice
 * StatusReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentReasonInformation1
 * AmendmentReasonInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendmentReason1
 * MandateAmendmentReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason1
 * PaymentReturnReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason1
 * InRepairStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason3
 * InRepairStatusReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason1
 * RejectionReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferUnmatchedStatusReason1
 * TransferUnmatchedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus
 * TransferUnmatchedStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2
 * TransferUnmatchedStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus8Choice
 * RejectedStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FailedSettlementStatus1
 * FailedSettlementStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationPendingStatus1
 * CancellationPendingStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1
 * InstructionRejectionStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice
 * RejectedStatusReason9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectedCancellationStatusReason1Choice
 * RejectedCancellationStatusReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason2
 * RejectionReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reason2 Reason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason1Choice
 * RejectionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason3Choice
 * ReturnReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason4Choice
 * ReturnReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason3
 * ProprietaryReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reason3 Reason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reason3Choice Reason3Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason4
 * RejectionReason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectionReason3Choice
 * RejectionReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason4Choice
 * RejectedReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TechnicalError1Choice
 * TechnicalError1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason4
 * ProprietaryReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice
 * TransferUnmatchedStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice
 * FailedSettlementStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice
 * CancellationPendingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason17Choice
 * RejectedReason17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledCompleteReason1
 * CancelledCompleteReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason16Choice
 * RejectedReason16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason15Choice
 * RejectedReason15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason5
 * ProprietaryReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SystemEventType3Choice
 * SystemEventType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reason4 Reason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reason18Choice
 * Reason18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosedStatusReason1
 * ClosedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1
 * ProformaStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1
 * DisabledStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnabledStatusReason1
 * EnabledStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatusReason4
 * SuspendedStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BlockedReason2Choice
 * BlockedReason2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3
 * ConditionallyAcceptedStatusReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason4
 * InRepairStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason14
 * PendingStatusReason14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingOpeningStatusReason1
 * PendingOpeningStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosurePendingStatusReason1
 * ClosurePendingStatusReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification1
 * ProprietaryStatusJustification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason4
 * PaymentReturnReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReversalReason8
 * PaymentReversalReason8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason3
 * PaymentReturnReason3}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the underlying reason for the status of an object."</li>
 * </ul>
 */
public class StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Status status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#mmProprietary
	 * IntraPositionProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#mmProprietary
	 * IntraPositionProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmProprietary
	 * IntraPositionProcessingStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#mmProprietary
	 * IntraPositionProcessingStatus4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmResponseType
	 * SecuritiesCollateralResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmProprietary
	 * IntraPositionProcessingStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#mmProprietary
	 * IntraPositionProcessingStatus6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status for which a reason is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StatusReason, Optional<Status>> mmStatus = new MMBusinessAssociationEnd<StatusReason, Optional<Status>>() {
		{
			derivation_lazy = () -> Arrays.asList(IntraPositionProcessingStatus1Choice.mmProprietary, IntraPositionProcessingStatus2Choice.mmProprietary, IntraPositionProcessingStatus3Choice.mmProprietary,
					IntraPositionProcessingStatus4Choice.mmProprietary, SecuritiesCollateralResponse1.mmResponseType, IntraPositionProcessingStatus5Choice.mmProprietary, IntraPositionProcessingStatus6Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Status.mmStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Status.mmObject();
		}

		@Override
		public Optional<Status> getValue(StatusReason obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(StatusReason obj, Optional<Status> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	protected Max35Text reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason1Choice#mmReason
	 * BlockedReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason1Choice#mmProprietary
	 * BlockedReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification#mmProprietaryStatusReason
	 * ProprietaryStatusJustification.mmProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification#mmReason
	 * ProprietaryStatusJustification.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmUnmatchedStatusReason
	 * PaymentStatusReasonCode3Choice.mmUnmatchedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason3#mmAdditionalReasonInformation
	 * AcknowledgementReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason1#mmAdditionalReasonInformation
	 * PendingProcessingReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason5#mmAdditionalReasonInformation
	 * RejectionReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason1#mmAdditionalReasonInformation
	 * RepairReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason1#mmAdditionalReasonInformation
	 * CancellationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus4Choice#mmReason
	 * CancellationStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason2#mmAdditionalReasonInformation
	 * PendingReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1#mmAdditionalReasonInformation
	 * ProprietaryReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason3#mmAdditionalReasonInformation
	 * PendingProcessingReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason10#mmAdditionalReasonInformation
	 * RejectionReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason5#mmAdditionalReasonInformation
	 * CancellationReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason1#mmAdditionalReasonInformation
	 * UnmatchedReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason6#mmAdditionalReasonInformation
	 * UnmatchedReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason1#mmAdditionalReasonInformation
	 * PendingReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason1#mmAdditionalReasonInformation
	 * FailingReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason5#mmAdditionalReasonInformation
	 * PendingReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason3#mmAdditionalReasonInformation
	 * FailingReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason7#mmAdditionalReasonInformation
	 * AcknowledgementReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason5#mmAdditionalReasonInformation
	 * PendingProcessingReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason2#mmAdditionalReasonInformation
	 * DeniedReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason11#mmAdditionalReasonInformation
	 * RejectionReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason6#mmAdditionalReasonInformation
	 * RepairReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason2#mmAdditionalReasonInformation
	 * ModificationReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason1#mmAdditionalReasonInformation
	 * RejectionOrRepairReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason1#mmAdditionalReasonInformation
	 * AcknowledgementReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason2#mmAdditionalReasonInformation
	 * CancellationReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus3Choice#mmReason
	 * CancellationStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason9#mmAdditionalReasonInformation
	 * RejectionOrRepairReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason7#mmAdditionalReasonInformation
	 * PendingReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason3#mmAdditionalReasonInformation
	 * RejectionOrRepairReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason10#mmAdditionalReasonInformation
	 * RejectionOrRepairReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason18#mmAdditionalReasonInformation
	 * RejectionOrRepairReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason13#mmAdditionalReasonInformation
	 * RejectionOrRepairReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus9Choice#mmReason
	 * CancellationStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason6#mmAdditionalReasonInformation
	 * AcknowledgementReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason7#mmAdditionalReasonInformation
	 * PendingProcessingReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason15#mmAdditionalReasonInformation
	 * RejectionReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason2#mmAdditionalReasonInformation
	 * RepairReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason6#mmAdditionalReasonInformation
	 * CancellationReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason3#mmAdditionalReasonInformation
	 * PendingReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason2#mmAdditionalReasonInformation
	 * ProprietaryReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason9#mmAdditionalReasonInformation
	 * UnmatchedReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason10#mmAdditionalReasonInformation
	 * PendingReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason5#mmAdditionalReasonInformation
	 * FailingReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason8#mmAdditionalReasonInformation
	 * AcknowledgementReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason6#mmAdditionalReasonInformation
	 * PendingProcessingReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason4#mmAdditionalReasonInformation
	 * DeniedReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason14#mmAdditionalReasonInformation
	 * RejectionReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason7#mmAdditionalReasonInformation
	 * RepairReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason3#mmAdditionalReasonInformation
	 * ModificationReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason12#mmAdditionalReasonInformation
	 * PendingReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason19#mmAdditionalReasonInformation
	 * RejectionOrRepairReason19.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason16#mmAdditionalReasonInformation
	 * RejectionOrRepairReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason4#mmAdditionalReasonInformation
	 * AcknowledgementReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason3#mmAdditionalReasonInformation
	 * CancellationReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus13Choice#mmReason
	 * CancellationStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason2#mmAdditionalReasonInformation
	 * PendingStatusReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason3#mmAdditionalReasonInformation
	 * PendingStatusReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason4#mmAdditionalReasonInformation
	 * CancelledStatusReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason1#mmAdditionalReasonInformation
	 * AcceptedStatusReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason8#mmAdditionalReasonInformation
	 * RejectedStatusReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason5#mmAdditionalReasonInformation
	 * CancelledStatusReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason2#mmAdditionalReasonInformation
	 * AcceptedStatusReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason9#mmAdditionalReasonInformation
	 * RejectedStatusReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason2#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason6#mmAdditionalReasonInformation
	 * CancelledStatusReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason7#mmAdditionalReasonInformation
	 * CancelledStatusReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason1#mmAdditionalReasonInformation
	 * PendingStatusReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason4#mmAdditionalReasonInformation
	 * PendingStatusReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1#mmAdditionalReasonInformation
	 * CorporateActionReversalReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason2#mmAdditionalReasonInformation
	 * CorporateActionReversalReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason7#mmAdditionalReasonInformation
	 * RejectionOrRepairReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason11#mmAdditionalReasonInformation
	 * RejectionOrRepairReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason1#mmAdditionalReasonInformation
	 * GeneratedReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#mmProcessingStatus
	 * StatusAndReason3.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason2#mmAdditionalReasonInformation
	 * GeneratedReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason2#mmAdditionalReasonInformation
	 * PendingProcessingReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason4#mmAdditionalReasonInformation
	 * UnmatchedReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason4#mmAdditionalReasonInformation
	 * PendingReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason2#mmAdditionalReasonInformation
	 * FailingReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#mmProcessingStatus
	 * StatusAndReason6.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason7#mmAdditionalReasonInformation
	 * RejectionReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason4#mmAdditionalReasonInformation
	 * CancellationReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus6Choice#mmReason
	 * CancellationStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice#mmCode
	 * UnaffirmedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmAdditionalReasonInformation
	 * StatusAndReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AffirmationReason1#mmAdditionalReasonInformation
	 * AffirmationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice#mmReason
	 * AffirmationReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason5#mmAdditionalReasonInformation
	 * RepairReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice#mmCode
	 * AwaitingAffirmationReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice#mmProprietary
	 * AwaitingAffirmationReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1#mmCode
	 * AwaitingAffirmationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1#mmAdditionalReasonInformation
	 * AwaitingAffirmationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason9#mmAdditionalReasonInformation
	 * RejectionReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AllegmentMatchingReason1#mmAdditionalReasonInformation
	 * AllegmentMatchingReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice#mmCode
	 * AwaitingCancellationReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice#mmProprietary
	 * AwaitingCancellationReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1#mmCode
	 * AwaitingCancellationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1#mmAdditionalReasonInformation
	 * AwaitingCancellationReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#mmReason
	 * PaymentReturnReason2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#mmAdditionalCancellationReasonInformation
	 * CancellationReasonInformation1.mmAdditionalCancellationReasonInformation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation3#mmAdditionalInformation
	 * CancellationReasonInformation3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#mmAdditionalInformation
	 * PaymentReversalReason7.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation1#mmAdditionalStatusReasonInformation
	 * StatusReasonInformation1.mmAdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#mmCode
	 * StatusReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#mmProprietary
	 * StatusReason6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Discrepancy1#mmNarrative
	 * Discrepancy1.mmNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmAdditionalRejectReasonInformation
	 * AcceptanceResult6.mmAdditionalRejectReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1#mmReason
	 * MandateAmendmentReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation2#mmAdditionalInformation
	 * CancellationReasonInformation2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#mmAmendOrCancelReason
	 * TradeAgreement2.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement4#mmAmendOrCancelReason
	 * TradeAgreement4.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#mmAmendOrCancelReason
	 * TradeAgreement8.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement5#mmAmendOrCancelReason
	 * TradeAgreement5.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmAmendOrCancelReason
	 * TradeAgreement9.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason4#mmAdditionalInformation
	 * RejectedStatusReason4.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason1#mmAdditionalInformation
	 * CancelledStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason6#mmAdditionalInformation
	 * RejectedStatusReason6.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason1#mmAdditionalInformation
	 * SuspendedStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatusReason1#mmAdditionalInformation
	 * InRepairStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus6#mmAdditionalInformation
	 * RejectedStatus6.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmAdditionalInformation
	 * SuspendedStatusReason2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#mmAdditionalInformation
	 * PartiallySettledStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatusReason3#mmAdditionalInformation
	 * InRepairStatusReason3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmAdditionalInformation
	 * RejectionReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmAdditionalInformation
	 * RejectionReason3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus2#mmReason
	 * TransferCancellationStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationPendingStatus1#mmReason
	 * TransferCancellationPendingStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatusReason1#mmAdditionalInformation
	 * PendingSettlementStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason5#mmAdditionalInformation
	 * RejectedStatusReason5.mmAdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus3#mmReason
	 * InRepairStatus3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1#mmReason
	 * FailedSettlementStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1#mmReason
	 * CancellationPendingStatus1.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#mmReason
	 * CaseStatus.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#mmReason
	 * CaseStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason#mmCancellationReason
	 * MeetingCancellationReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#mmCancellationReason
	 * MeetingCancellationReason1.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2#mmCancellationReason
	 * MeetingCancellationReason2.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmStatusReason
	 * MeetingInstructionStatusDetails.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRejectionStatus1#mmAdditionalInformation
	 * CancellationRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalStatus1#mmAdditionalInformation
	 * AdditionalStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalStatus2#mmAdditionalInformation
	 * AdditionalStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#mmReason
	 * CorporateActionAmendmentRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20FormatChoice#mmCode
	 * RejectionReason20FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason4#mmAdditionalReasonInformation
	 * RejectionOrRepairReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason6#mmAdditionalReasonInformation
	 * RejectionReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason3#mmAdditionalReasonInformation
	 * RepairReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason2#mmAdditionalReasonInformation
	 * UnmatchedReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason2#mmAdditionalReasonInformation
	 * AcknowledgementReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason1#mmAdditionalReasonInformation
	 * DeniedReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters1#mmReason
	 * AdditionalQueryParameters1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters3#mmReason
	 * AdditionalQueryParameters3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason2#mmAdditionalReasonInformation
	 * RejectionOrRepairReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReasonInformation1#mmAdditionalInformation
	 * CancellationStatusReasonInformation1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData1#mmAmendOrCancelReason
	 * ClosingData1.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData2#mmAmendOrCancelReason
	 * ClosingData2.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingResult1#mmAdditionalStatusReasonInformation
	 * FinancingResult1.mmAdditionalStatusReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reason2#mmDescription
	 * Reason2.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationReason1#mmAdditionalInformation
	 * CollateralCancellationReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionStatus2#mmAdditionalInformation
	 * RejectionStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmRejectionInformation
	 * CollateralProposalResponseType1.mmRejectionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectionReasonInformation
	 * CollateralSubstitutionResponse2.mmRejectionReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmRejectionReasonInformation
	 * InterestResponse1.mmRejectionReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason8#mmAdditionalReasonInformation
	 * RejectionReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason4#mmAdditionalReasonInformation
	 * RepairReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason3#mmAdditionalReasonInformation
	 * UnmatchedReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason5#mmAdditionalReasonInformation
	 * AcknowledgementReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason3#mmAdditionalReasonInformation
	 * DeniedReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus8Choice#mmReason
	 * CancellationStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason7#mmAdditionalReasonInformation
	 * UnmatchedReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus12Choice#mmReason
	 * CancellationStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason10#mmAdditionalReasonInformation
	 * UnmatchedReason10.mmAdditionalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason2#mmCode
	 * ConsentReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason2#mmAdditionalReasonInformation
	 * ConsentReason2.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus2Choice#mmReason
	 * ConsentStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason12#mmAdditionalReasonInformation
	 * RejectionReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#mmConsented
	 * ResponseStatus3Choice.mmConsented}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason3#mmCode
	 * ConsentReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason3#mmAdditionalReasonInformation
	 * ConsentReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus3Choice#mmReason
	 * ConsentStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason13#mmAdditionalReasonInformation
	 * RejectionReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#mmConsented
	 * ResponseStatus4Choice.mmConsented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters2#mmReason
	 * AdditionalQueryParameters2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters4#mmReason
	 * AdditionalQueryParameters4.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#mmReason
	 * AdditionalQueryParameters5.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters6#mmReason
	 * AdditionalQueryParameters6.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason5#mmAdditionalReasonInformation
	 * RejectionOrRepairReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason6#mmAdditionalReasonInformation
	 * RejectionOrRepairReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus5Choice#mmReason
	 * CancellationStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason12#mmAdditionalReasonInformation
	 * RejectionOrRepairReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason8#mmAdditionalReasonInformation
	 * RejectionOrRepairReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason14#mmAdditionalReasonInformation
	 * RejectionOrRepairReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason8#mmAdditionalReasonInformation
	 * PendingReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason4#mmAdditionalReasonInformation
	 * FailingReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason17#mmAdditionalReasonInformation
	 * RejectionOrRepairReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason13#mmAdditionalReasonInformation
	 * PendingReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason6#mmAdditionalReasonInformation
	 * FailingReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmAdditionalInformation
	 * CancellationStatusReason2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation5#mmAdditionalStatusReasonInformation
	 * StatusReasonInformation5.mmAdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#mmAdditionalStatusReasonInformation
	 * StatusReasonInformation7.mmAdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus8#mmAdditionalInformation
	 * RejectedStatus8.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation10#mmReason
	 * StatusReasonInformation10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason20#mmAdditionalReasonInformation
	 * RejectionOrRepairReason20.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason22#mmAdditionalReasonInformation
	 * RejectionOrRepairReason22.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason3#mmReason
	 * ProprietaryReason3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason3#mmAdditionalReasonInformation
	 * ProprietaryReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason21#mmAdditionalReasonInformation
	 * RejectionOrRepairReason21.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason4#mmAdditionalInformation
	 * RejectionReason4.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#mmReason
	 * AdditionalQueryParameters7.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason3#mmAdditionalReasonInformation
	 * GeneratedReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason16#mmAdditionalReasonInformation
	 * RejectionReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason3#mmAdditionalReasonInformation
	 * AcceptedStatusReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason10#mmAdditionalReasonInformation
	 * RejectedStatusReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason5#mmAdditionalReasonInformation
	 * PendingStatusReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason12#mmAdditionalReasonInformation
	 * UnmatchedReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason18#mmAdditionalReasonInformation
	 * RejectionReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason17#mmAdditionalReasonInformation
	 * RejectionReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason11#mmAdditionalReasonInformation
	 * UnmatchedReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason19#mmAdditionalReasonInformation
	 * RejectionReason19.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason4#mmAdditionalReasonInformation
	 * AcceptedStatusReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason6#mmAdditionalReasonInformation
	 * PendingStatusReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason11#mmAdditionalReasonInformation
	 * RejectedStatusReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason5#mmAdditionalReasonInformation
	 * AcceptedStatusReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason4#mmAdditionalReasonInformation
	 * GeneratedReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters8#mmReason
	 * AdditionalQueryParameters8.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason20#mmAdditionalReasonInformation
	 * RejectionReason20.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason21#mmAdditionalReasonInformation
	 * RejectionReason21.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason6#mmAdditionalReasonInformation
	 * AcceptedStatusReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason13#mmAdditionalReasonInformation
	 * UnmatchedReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason14#mmAdditionalReasonInformation
	 * UnmatchedReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason22#mmAdditionalReasonInformation
	 * RejectionReason22.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AllegementMatchingReason1#mmAdditionalReasonInformation
	 * AllegementMatchingReason1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#mmAmendOrCancelReason
	 * TradeAgreement11.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmAmendOrCancelReason
	 * TradeAgreement12.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason23#mmAdditionalInformation
	 * RejectionReason23.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportItemStatus1#mmAdditionalReasonInformation
	 * ReportItemStatus1.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason8#mmAdditionalReasonInformation
	 * CancelledStatusReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason13#mmAdditionalReasonInformation
	 * RejectedStatusReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason14#mmAdditionalReasonInformation
	 * RejectedStatusReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason7#mmAdditionalReasonInformation
	 * PendingStatusReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#mmReason
	 * AdditionalQueryParameters9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason5#mmAdditionalReasonInformation
	 * DeniedReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason9#mmAdditionalReasonInformation
	 * CancelledStatusReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason15#mmAdditionalReasonInformation
	 * RejectedStatusReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason8#mmAdditionalReasonInformation
	 * PendingStatusReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason10#mmAdditionalReasonInformation
	 * CancelledStatusReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason16#mmAdditionalReasonInformation
	 * RejectedStatusReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters10#mmReason
	 * AdditionalQueryParameters10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason8#mmAdditionalReasonInformation
	 * DeniedReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason6#mmAdditionalReasonInformation
	 * DeniedReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason7#mmAdditionalReasonInformation
	 * DeniedReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason9#mmAdditionalReasonInformation
	 * DeniedReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalError1Choice#mmCode
	 * TechnicalError1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalError1Choice#mmProprietary
	 * TechnicalError1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#mmAmendmentReason
	 * RegisteredContractAmendment1.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmConsented
	 * ResponseStatus6Choice.mmConsented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason5#mmAdditionalReasonInformation
	 * GeneratedReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#mmReason
	 * AdditionalQueryParameters11.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason26#mmAdditionalReasonInformation
	 * RejectionReason26.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason17#mmAdditionalReasonInformation
	 * PendingReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason10#mmAdditionalReasonInformation
	 * CancellationReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason8#mmAdditionalReasonInformation
	 * RepairReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason16#mmAdditionalReasonInformation
	 * PendingReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason25#mmAdditionalReasonInformation
	 * RejectionReason25.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason8#mmAdditionalReasonInformation
	 * AcceptedStatusReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus16Choice#mmReason
	 * CancellationStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason12#mmAdditionalReasonInformation
	 * CancellationReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason9#mmAdditionalReasonInformation
	 * AcknowledgementReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason15#mmAdditionalReasonInformation
	 * PendingReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason10#mmAdditionalReasonInformation
	 * AcknowledgementReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason12#mmAdditionalReasonInformation
	 * DeniedReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason11#mmAdditionalReasonInformation
	 * DeniedReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason11#mmAdditionalReasonInformation
	 * AcknowledgementReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason29#mmAdditionalReasonInformation
	 * RejectionReason29.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason4#mmAdditionalReasonInformation
	 * ProprietaryReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason10#mmAdditionalReasonInformation
	 * PendingProcessingReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25#mmAdditionalReasonInformation
	 * RejectionOrRepairReason25.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason14#mmAdditionalReasonInformation
	 * PendingReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason7#mmAdditionalReasonInformation
	 * FailingReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason10#mmAdditionalReasonInformation
	 * RepairReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason30#mmAdditionalReasonInformation
	 * RejectionReason30.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason16#mmAdditionalReasonInformation
	 * UnmatchedReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason8#mmAdditionalReasonInformation
	 * PendingProcessingReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason9#mmAdditionalReasonInformation
	 * CancellationReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason27#mmAdditionalReasonInformation
	 * RejectionReason27.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason17#mmAdditionalReasonInformation
	 * UnmatchedReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23#mmAdditionalReasonInformation
	 * RejectionOrRepairReason23.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason9#mmAdditionalReasonInformation
	 * PendingProcessingReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason12#mmAdditionalReasonInformation
	 * AcknowledgementReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason15#mmAdditionalReasonInformation
	 * UnmatchedReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason9#mmAdditionalReasonInformation
	 * RepairReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice#mmReason
	 * ConsentStatus4Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason4#mmCode
	 * ConsentReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason4#mmAdditionalReasonInformation
	 * ConsentReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26#mmAdditionalReasonInformation
	 * RejectionOrRepairReason26.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason28#mmAdditionalReasonInformation
	 * RejectionReason28.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason8#mmAdditionalReasonInformation
	 * FailingReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason4#mmAdditionalReasonInformation
	 * ModificationReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus15Choice#mmReason
	 * CancellationStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason18#mmAdditionalReasonInformation
	 * PendingReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason10#mmAdditionalReasonInformation
	 * DeniedReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24#mmAdditionalReasonInformation
	 * RejectionOrRepairReason24.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#mmAdditionalReasonInformation
	 * CorporateActionReversalReason3.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason17#mmAdditionalReasonInformation
	 * RejectedStatusReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12#mmAdditionalReasonInformation
	 * CancelledStatusReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason10#mmAdditionalReasonInformation
	 * PendingStatusReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18#mmAdditionalReasonInformation
	 * RejectedStatusReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9#mmAdditionalReasonInformation
	 * AcceptedStatusReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9#mmAdditionalReasonInformation
	 * PendingStatusReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11#mmAdditionalReasonInformation
	 * CancelledStatusReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#mmReason
	 * InRepairStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#mmReason
	 * FailedSettlementStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason32#mmAdditionalReasonInformation
	 * RejectionReason32.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#mmReason
	 * CancellationPendingStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason33#mmAdditionalReasonInformation
	 * RejectionReason33.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason31#mmAdditionalReasonInformation
	 * RejectionReason31.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason13#mmCorporateActionEventIdentification
	 * CancellationReason13.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4#mmAdditionalReasonInformation
	 * CorporateActionReversalReason4.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason14#mmAdditionalReasonInformation
	 * CancelledStatusReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason5#mmAdditionalReasonInformation
	 * ProprietaryReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason19#mmAdditionalReasonInformation
	 * RejectedStatusReason19.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason13#mmAdditionalReasonInformation
	 * CancelledStatusReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason10#mmAdditionalReasonInformation
	 * AcceptedStatusReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason11#mmAdditionalReasonInformation
	 * PendingStatusReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason12#mmAdditionalReasonInformation
	 * PendingStatusReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason20#mmAdditionalReasonInformation
	 * RejectedStatusReason20.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters12#mmReason
	 * AdditionalQueryParameters12.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#mmConsented
	 * ResponseStatus8Choice.mmConsented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason6#mmAdditionalReasonInformation
	 * GeneratedReason6.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason11#mmAdditionalReasonInformation
	 * RepairReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason37#mmAdditionalReasonInformation
	 * RejectionReason37.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus18Choice#mmReason
	 * CancellationStatus18Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason15#mmAdditionalReasonInformation
	 * CancellationReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason34#mmAdditionalReasonInformation
	 * RejectionReason34.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus5Choice#mmReason
	 * ConsentStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason14#mmAdditionalReasonInformation
	 * CancellationReason14.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason9#mmAdditionalReasonInformation
	 * FailingReason9.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason29#mmAdditionalReasonInformation
	 * RejectionOrRepairReason29.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason11#mmAdditionalReasonInformation
	 * PendingProcessingReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason25#mmAdditionalReasonInformation
	 * PendingReason25.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason20#mmAdditionalReasonInformation
	 * PendingReason20.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason36#mmAdditionalReasonInformation
	 * RejectionReason36.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason12#mmAdditionalReasonInformation
	 * PendingProcessingReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason35#mmAdditionalReasonInformation
	 * RejectionReason35.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus20Choice#mmReason
	 * CancellationStatus20Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason18#mmAdditionalReasonInformation
	 * CancellationReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason12#mmAdditionalReasonInformation
	 * RepairReason12.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason19#mmAdditionalReasonInformation
	 * PendingReason19.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason18#mmAdditionalReasonInformation
	 * AcknowledgementReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason31#mmAdditionalReasonInformation
	 * RejectionOrRepairReason31.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason5#mmAdditionalReasonInformation
	 * ModificationReason5.mmAdditionalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason5#mmCode
	 * ConsentReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason5#mmAdditionalReasonInformation
	 * ConsentReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason40#mmAdditionalReasonInformation
	 * RejectionReason40.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason28#mmAdditionalReasonInformation
	 * RejectionOrRepairReason28.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason10#mmAdditionalReasonInformation
	 * FailingReason10.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason13#mmAdditionalReasonInformation
	 * RepairReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason13#mmAdditionalReasonInformation
	 * PendingProcessingReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason11#mmAdditionalReasonInformation
	 * AcceptedStatusReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason19#mmAdditionalReasonInformation
	 * UnmatchedReason19.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason20#mmAdditionalReasonInformation
	 * UnmatchedReason20.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason24#mmAdditionalReasonInformation
	 * PendingReason24.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason13#mmAdditionalReasonInformation
	 * AcknowledgementReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason27#mmAdditionalReasonInformation
	 * RejectionOrRepairReason27.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason39#mmAdditionalReasonInformation
	 * RejectionReason39.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason18#mmAdditionalReasonInformation
	 * UnmatchedReason18.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason15#mmAdditionalReasonInformation
	 * AcknowledgementReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason13#mmAdditionalReasonInformation
	 * DeniedReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason16#mmAdditionalReasonInformation
	 * DeniedReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason21#mmAdditionalReasonInformation
	 * PendingReason21.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason19#mmAdditionalReasonInformation
	 * AcknowledgementReason19.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason19#mmCorporateActionEventIdentification
	 * CancellationReason19.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason17#mmAdditionalReasonInformation
	 * DeniedReason17.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType3Choice#mmCode
	 * SystemEventType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType3Choice#mmProprietary
	 * SystemEventType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason32#mmAdditionalReasonInformation
	 * RejectionOrRepairReason32.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason33#mmAdditionalReasonInformation
	 * RejectionOrRepairReason33.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason34#mmAdditionalReasonInformation
	 * RejectionOrRepairReason34.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16#mmAdditionalInformation
	 * CancelledStatusReason16.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus9#mmAdditionalInformation
	 * RejectedStatus9.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#mmAdditionalInformation
	 * PartiallySettledStatus10.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice#mmCode
	 * BlockedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice#mmProprietary
	 * BlockedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus10#mmAdditionalInformation
	 * RejectedStatus10.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21#mmAdditionalReasonInformation
	 * RejectedStatusReason21.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13#mmAdditionalReasonInformation
	 * PendingStatusReason13.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#mmAmendOrCancelReason
	 * TradeAgreement15.mmAmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason22#mmAdditionalReasonInformation
	 * RejectedStatusReason22.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8#mmAdditionalReasonInformation
	 * PendingCancellationStatusReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason15#mmAdditionalReasonInformation
	 * PendingStatusReason15.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmAdditionalInformation
	 * CancellationStatusReason3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification1#mmProprietaryStatusReason
	 * ProprietaryStatusJustification1.mmProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification1#mmReason
	 * ProprietaryStatusJustification1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmAdditionalInformation
	 * ModificationStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason8#mmAdditionalInformation
	 * PaymentReversalReason8.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason3#mmReason
	 * PaymentReturnReason3.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason provided for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, Max35Text> mmReason = new MMBusinessAttribute<StatusReason, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(BlockedReason1Choice.mmReason, BlockedReason1Choice.mmProprietary, ProprietaryStatusJustification.mmProprietaryStatusReason, ProprietaryStatusJustification.mmReason,
					PaymentStatusReasonCode3Choice.mmUnmatchedStatusReason, AcknowledgementReason3.mmAdditionalReasonInformation, PendingProcessingReason1.mmAdditionalReasonInformation, RejectionReason5.mmAdditionalReasonInformation,
					RepairReason1.mmAdditionalReasonInformation, CancellationReason1.mmAdditionalReasonInformation, CancellationStatus4Choice.mmReason, PendingReason2.mmAdditionalReasonInformation,
					ProprietaryReason1.mmAdditionalReasonInformation, PendingProcessingReason3.mmAdditionalReasonInformation, RejectionReason10.mmAdditionalReasonInformation, CancellationReason5.mmAdditionalReasonInformation,
					UnmatchedReason1.mmAdditionalReasonInformation, UnmatchedReason6.mmAdditionalReasonInformation, PendingReason1.mmAdditionalReasonInformation, FailingReason1.mmAdditionalReasonInformation,
					PendingReason5.mmAdditionalReasonInformation, FailingReason3.mmAdditionalReasonInformation, AcknowledgementReason7.mmAdditionalReasonInformation, PendingProcessingReason5.mmAdditionalReasonInformation,
					DeniedReason2.mmAdditionalReasonInformation, RejectionReason11.mmAdditionalReasonInformation, RepairReason6.mmAdditionalReasonInformation, ModificationReason2.mmAdditionalReasonInformation,
					RejectionOrRepairReason1.mmAdditionalReasonInformation, AcknowledgementReason1.mmAdditionalReasonInformation, CancellationReason2.mmAdditionalReasonInformation, CancellationStatus3Choice.mmReason,
					RejectionOrRepairReason9.mmAdditionalReasonInformation, PendingReason7.mmAdditionalReasonInformation, RejectionOrRepairReason3.mmAdditionalReasonInformation, RejectionOrRepairReason10.mmAdditionalReasonInformation,
					RejectionOrRepairReason18.mmAdditionalReasonInformation, RejectionOrRepairReason13.mmAdditionalReasonInformation, CancellationStatus9Choice.mmReason, AcknowledgementReason6.mmAdditionalReasonInformation,
					PendingProcessingReason7.mmAdditionalReasonInformation, RejectionReason15.mmAdditionalReasonInformation, RepairReason2.mmAdditionalReasonInformation, CancellationReason6.mmAdditionalReasonInformation,
					PendingReason3.mmAdditionalReasonInformation, ProprietaryReason2.mmAdditionalReasonInformation, UnmatchedReason9.mmAdditionalReasonInformation, PendingReason10.mmAdditionalReasonInformation,
					FailingReason5.mmAdditionalReasonInformation, AcknowledgementReason8.mmAdditionalReasonInformation, PendingProcessingReason6.mmAdditionalReasonInformation, DeniedReason4.mmAdditionalReasonInformation,
					RejectionReason14.mmAdditionalReasonInformation, RepairReason7.mmAdditionalReasonInformation, ModificationReason3.mmAdditionalReasonInformation, PendingReason12.mmAdditionalReasonInformation,
					RejectionOrRepairReason19.mmAdditionalReasonInformation, RejectionOrRepairReason16.mmAdditionalReasonInformation, AcknowledgementReason4.mmAdditionalReasonInformation, CancellationReason3.mmAdditionalReasonInformation,
					CancellationStatus13Choice.mmReason, PendingStatusReason2.mmAdditionalReasonInformation, PendingStatusReason3.mmAdditionalReasonInformation, CancelledStatusReason4.mmAdditionalReasonInformation,
					AcceptedStatusReason1.mmAdditionalReasonInformation, RejectedStatusReason8.mmAdditionalReasonInformation, PendingCancellationStatusReason1.mmAdditionalReasonInformation,
					CancelledStatusReason5.mmAdditionalReasonInformation, AcceptedStatusReason2.mmAdditionalReasonInformation, RejectedStatusReason9.mmAdditionalReasonInformation,
					PendingCancellationStatusReason2.mmAdditionalReasonInformation, CancelledStatusReason6.mmAdditionalReasonInformation, CancelledStatusReason7.mmAdditionalReasonInformation,
					PendingCancellationStatusReason3.mmAdditionalReasonInformation, PendingCancellationStatusReason4.mmAdditionalReasonInformation, PendingStatusReason1.mmAdditionalReasonInformation,
					PendingStatusReason4.mmAdditionalReasonInformation, CorporateActionReversalReason1.mmAdditionalReasonInformation, CorporateActionReversalReason2.mmAdditionalReasonInformation,
					RejectionOrRepairReason7.mmAdditionalReasonInformation, RejectionOrRepairReason11.mmAdditionalReasonInformation, GeneratedReason1.mmAdditionalReasonInformation, StatusAndReason3.mmProcessingStatus,
					GeneratedReason2.mmAdditionalReasonInformation, PendingProcessingReason2.mmAdditionalReasonInformation, UnmatchedReason4.mmAdditionalReasonInformation, PendingReason4.mmAdditionalReasonInformation,
					FailingReason2.mmAdditionalReasonInformation, StatusAndReason6.mmProcessingStatus, RejectionReason7.mmAdditionalReasonInformation, CancellationReason4.mmAdditionalReasonInformation, CancellationStatus6Choice.mmReason,
					UnaffirmedReason2Choice.mmCode, StatusAndReason10.mmAdditionalReasonInformation, AffirmationReason1.mmAdditionalReasonInformation, AffirmationReason1Choice.mmReason, RepairReason5.mmAdditionalReasonInformation,
					AwaitingAffirmationReason1Choice.mmCode, AwaitingAffirmationReason1Choice.mmProprietary, AwaitingAffirmationReason1.mmCode, AwaitingAffirmationReason1.mmAdditionalReasonInformation,
					RejectionReason9.mmAdditionalReasonInformation, AllegmentMatchingReason1.mmAdditionalReasonInformation, AwaitingCancellationReason1Choice.mmCode, AwaitingCancellationReason1Choice.mmProprietary,
					AwaitingCancellationReason1.mmCode, AwaitingCancellationReason1.mmAdditionalReasonInformation, PaymentReturnReason2.mmReason, CancellationReasonInformation1.mmAdditionalCancellationReasonInformation,
					CancellationReasonInformation3.mmAdditionalInformation, PaymentReversalReason7.mmAdditionalInformation, StatusReasonInformation1.mmAdditionalStatusReasonInformation, StatusReason6Choice.mmCode,
					StatusReason6Choice.mmProprietary, Discrepancy1.mmNarrative, AcceptanceResult6.mmAdditionalRejectReasonInformation, MandateAmendmentReason1.mmReason, CancellationReasonInformation2.mmAdditionalInformation,
					TradeAgreement2.mmAmendOrCancelReason, TradeAgreement4.mmAmendOrCancelReason, TradeAgreement8.mmAmendOrCancelReason, TradeAgreement5.mmAmendOrCancelReason, TradeAgreement9.mmAmendOrCancelReason,
					RejectedStatusReason4.mmAdditionalInformation, CancelledStatusReason1.mmAdditionalInformation, RejectedStatusReason6.mmAdditionalInformation, SuspendedStatusReason1.mmAdditionalInformation,
					InRepairStatusReason1.mmAdditionalInformation, RejectedStatus6.mmAdditionalInformation, SuspendedStatusReason2.mmAdditionalInformation, PartiallySettledStatus1.mmAdditionalInformation,
					InRepairStatusReason3.mmAdditionalInformation, RejectionReason1.mmAdditionalInformation, RejectionReason3.mmAdditionalInformation, TransferCancellationStatus2.mmReason, TransferCancellationPendingStatus1.mmReason,
					PendingSettlementStatusReason1.mmAdditionalInformation, RejectedStatusReason5.mmAdditionalInformation, InRepairStatus3.mmReason, FailedSettlementStatus1.mmReason, CancellationPendingStatus1.mmReason,
					CaseStatus.mmReason, CaseStatus2.mmReason, MeetingCancellationReason.mmCancellationReason, MeetingCancellationReason1.mmCancellationReason, MeetingCancellationReason2.mmCancellationReason,
					MeetingInstructionStatusDetails.mmStatusReason, CancellationRejectionStatus1.mmAdditionalInformation, AdditionalStatus1.mmAdditionalInformation, AdditionalStatus2.mmAdditionalInformation,
					CorporateActionAmendmentRejectionStatus1.mmReason, RejectionReason20FormatChoice.mmCode, RejectionOrRepairReason4.mmAdditionalReasonInformation, RejectionReason6.mmAdditionalReasonInformation,
					RepairReason3.mmAdditionalReasonInformation, UnmatchedReason2.mmAdditionalReasonInformation, AcknowledgementReason2.mmAdditionalReasonInformation, DeniedReason1.mmAdditionalReasonInformation,
					AdditionalQueryParameters1.mmReason, AdditionalQueryParameters3.mmReason, RejectionOrRepairReason2.mmAdditionalReasonInformation, CancellationStatusReasonInformation1.mmAdditionalInformation,
					ClosingData1.mmAmendOrCancelReason, ClosingData2.mmAmendOrCancelReason, FinancingResult1.mmAdditionalStatusReasonInformation, Reason2.mmDescription, CollateralCancellationReason1.mmAdditionalInformation,
					RejectionStatus2.mmAdditionalInformation, CollateralProposalResponseType1.mmRejectionInformation, CollateralSubstitutionResponse2.mmRejectionReasonInformation, InterestResponse1.mmRejectionReasonInformation,
					RejectionReason8.mmAdditionalReasonInformation, RepairReason4.mmAdditionalReasonInformation, UnmatchedReason3.mmAdditionalReasonInformation, AcknowledgementReason5.mmAdditionalReasonInformation,
					DeniedReason3.mmAdditionalReasonInformation, CancellationStatus8Choice.mmReason, UnmatchedReason7.mmAdditionalReasonInformation, CancellationStatus12Choice.mmReason, UnmatchedReason10.mmAdditionalReasonInformation,
					ConsentReason2.mmCode, ConsentReason2.mmAdditionalReasonInformation, ConsentStatus2Choice.mmReason, RejectionReason12.mmAdditionalReasonInformation, ResponseStatus3Choice.mmConsented, ConsentReason3.mmCode,
					ConsentReason3.mmAdditionalReasonInformation, ConsentStatus3Choice.mmReason, RejectionReason13.mmAdditionalReasonInformation, ResponseStatus4Choice.mmConsented, AdditionalQueryParameters2.mmReason,
					AdditionalQueryParameters4.mmReason, AdditionalQueryParameters5.mmReason, AdditionalQueryParameters6.mmReason, RejectionOrRepairReason5.mmAdditionalReasonInformation,
					RejectionOrRepairReason6.mmAdditionalReasonInformation, CancellationStatus5Choice.mmReason, RejectionOrRepairReason12.mmAdditionalReasonInformation, RejectionOrRepairReason8.mmAdditionalReasonInformation,
					RejectionOrRepairReason14.mmAdditionalReasonInformation, PendingReason8.mmAdditionalReasonInformation, FailingReason4.mmAdditionalReasonInformation, RejectionOrRepairReason17.mmAdditionalReasonInformation,
					PendingReason13.mmAdditionalReasonInformation, FailingReason6.mmAdditionalReasonInformation, CancellationStatusReason2.mmAdditionalInformation, StatusReasonInformation5.mmAdditionalStatusReasonInformation,
					StatusReasonInformation7.mmAdditionalStatusReasonInformation, RejectedStatus8.mmAdditionalInformation, StatusReasonInformation10.mmReason, RejectionOrRepairReason20.mmAdditionalReasonInformation,
					RejectionOrRepairReason22.mmAdditionalReasonInformation, ProprietaryReason3.mmReason, ProprietaryReason3.mmAdditionalReasonInformation, RejectionOrRepairReason21.mmAdditionalReasonInformation,
					RejectionReason4.mmAdditionalInformation, AdditionalQueryParameters7.mmReason, GeneratedReason3.mmAdditionalReasonInformation, RejectionReason16.mmAdditionalReasonInformation,
					AcceptedStatusReason3.mmAdditionalReasonInformation, RejectedStatusReason10.mmAdditionalReasonInformation, PendingStatusReason5.mmAdditionalReasonInformation, UnmatchedReason12.mmAdditionalReasonInformation,
					RejectionReason18.mmAdditionalReasonInformation, RejectionReason17.mmAdditionalReasonInformation, UnmatchedReason11.mmAdditionalReasonInformation, RejectionReason19.mmAdditionalReasonInformation,
					AcceptedStatusReason4.mmAdditionalReasonInformation, PendingStatusReason6.mmAdditionalReasonInformation, RejectedStatusReason11.mmAdditionalReasonInformation, AcceptedStatusReason5.mmAdditionalReasonInformation,
					GeneratedReason4.mmAdditionalReasonInformation, AdditionalQueryParameters8.mmReason, RejectionReason20.mmAdditionalReasonInformation, RejectionReason21.mmAdditionalReasonInformation,
					AcceptedStatusReason6.mmAdditionalReasonInformation, UnmatchedReason13.mmAdditionalReasonInformation, UnmatchedReason14.mmAdditionalReasonInformation, RejectionReason22.mmAdditionalReasonInformation,
					AllegementMatchingReason1.mmAdditionalReasonInformation, TradeAgreement11.mmAmendOrCancelReason, TradeAgreement12.mmAmendOrCancelReason, RejectionReason23.mmAdditionalInformation,
					ReportItemStatus1.mmAdditionalReasonInformation, CancelledStatusReason8.mmAdditionalReasonInformation, RejectedStatusReason13.mmAdditionalReasonInformation, RejectedStatusReason14.mmAdditionalReasonInformation,
					PendingStatusReason7.mmAdditionalReasonInformation, AdditionalQueryParameters9.mmReason, DeniedReason5.mmAdditionalReasonInformation, CancelledStatusReason9.mmAdditionalReasonInformation,
					RejectedStatusReason15.mmAdditionalReasonInformation, PendingStatusReason8.mmAdditionalReasonInformation, CancelledStatusReason10.mmAdditionalReasonInformation, RejectedStatusReason16.mmAdditionalReasonInformation,
					AdditionalQueryParameters10.mmReason, DeniedReason8.mmAdditionalReasonInformation, DeniedReason6.mmAdditionalReasonInformation, DeniedReason7.mmAdditionalReasonInformation, DeniedReason9.mmAdditionalReasonInformation,
					TechnicalError1Choice.mmCode, TechnicalError1Choice.mmProprietary, RegisteredContractAmendment1.mmAmendmentReason, ResponseStatus6Choice.mmConsented, GeneratedReason5.mmAdditionalReasonInformation,
					AdditionalQueryParameters11.mmReason, RejectionReason26.mmAdditionalReasonInformation, PendingReason17.mmAdditionalReasonInformation, CancellationReason10.mmAdditionalReasonInformation,
					RepairReason8.mmAdditionalReasonInformation, PendingReason16.mmAdditionalReasonInformation, RejectionReason25.mmAdditionalReasonInformation, AcceptedStatusReason8.mmAdditionalReasonInformation,
					CancellationStatus16Choice.mmReason, CancellationReason12.mmAdditionalReasonInformation, AcknowledgementReason9.mmAdditionalReasonInformation, PendingReason15.mmAdditionalReasonInformation,
					AcknowledgementReason10.mmAdditionalReasonInformation, DeniedReason12.mmAdditionalReasonInformation, DeniedReason11.mmAdditionalReasonInformation, AcknowledgementReason11.mmAdditionalReasonInformation,
					RejectionReason29.mmAdditionalReasonInformation, ProprietaryReason4.mmAdditionalReasonInformation, PendingProcessingReason10.mmAdditionalReasonInformation, RejectionOrRepairReason25.mmAdditionalReasonInformation,
					PendingReason14.mmAdditionalReasonInformation, FailingReason7.mmAdditionalReasonInformation, RepairReason10.mmAdditionalReasonInformation, RejectionReason30.mmAdditionalReasonInformation,
					UnmatchedReason16.mmAdditionalReasonInformation, PendingProcessingReason8.mmAdditionalReasonInformation, CancellationReason9.mmAdditionalReasonInformation, RejectionReason27.mmAdditionalReasonInformation,
					UnmatchedReason17.mmAdditionalReasonInformation, RejectionOrRepairReason23.mmAdditionalReasonInformation, PendingProcessingReason9.mmAdditionalReasonInformation, AcknowledgementReason12.mmAdditionalReasonInformation,
					UnmatchedReason15.mmAdditionalReasonInformation, RepairReason9.mmAdditionalReasonInformation, ConsentStatus4Choice.mmReason, ConsentReason4.mmCode, ConsentReason4.mmAdditionalReasonInformation,
					RejectionOrRepairReason26.mmAdditionalReasonInformation, RejectionReason28.mmAdditionalReasonInformation, FailingReason8.mmAdditionalReasonInformation, ModificationReason4.mmAdditionalReasonInformation,
					CancellationStatus15Choice.mmReason, PendingReason18.mmAdditionalReasonInformation, DeniedReason10.mmAdditionalReasonInformation, RejectionOrRepairReason24.mmAdditionalReasonInformation,
					CorporateActionReversalReason3.mmAdditionalReasonInformation, RejectedStatusReason17.mmAdditionalReasonInformation, CancelledStatusReason12.mmAdditionalReasonInformation,
					PendingStatusReason10.mmAdditionalReasonInformation, RejectedStatusReason18.mmAdditionalReasonInformation, PendingCancellationStatusReason5.mmAdditionalReasonInformation,
					AcceptedStatusReason9.mmAdditionalReasonInformation, PendingStatusReason9.mmAdditionalReasonInformation, CancelledStatusReason11.mmAdditionalReasonInformation, InRepairStatus4Choice.mmReason,
					FailedSettlementStatus2Choice.mmReason, RejectionReason32.mmAdditionalReasonInformation, CancellationPendingStatus7Choice.mmReason, RejectionReason33.mmAdditionalReasonInformation,
					RejectionReason31.mmAdditionalReasonInformation, CancellationReason13.mmCorporateActionEventIdentification, CorporateActionReversalReason4.mmAdditionalReasonInformation,
					PendingCancellationStatusReason6.mmAdditionalReasonInformation, CancelledStatusReason14.mmAdditionalReasonInformation, ProprietaryReason5.mmAdditionalReasonInformation,
					RejectedStatusReason19.mmAdditionalReasonInformation, CancelledStatusReason13.mmAdditionalReasonInformation, AcceptedStatusReason10.mmAdditionalReasonInformation, PendingStatusReason11.mmAdditionalReasonInformation,
					PendingStatusReason12.mmAdditionalReasonInformation, RejectedStatusReason20.mmAdditionalReasonInformation, AdditionalQueryParameters12.mmReason, ResponseStatus8Choice.mmConsented,
					GeneratedReason6.mmAdditionalReasonInformation, RepairReason11.mmAdditionalReasonInformation, RejectionReason37.mmAdditionalReasonInformation, CancellationStatus18Choice.mmReason,
					CancellationReason15.mmAdditionalReasonInformation, RejectionReason34.mmAdditionalReasonInformation, ConsentStatus5Choice.mmReason, CancellationReason14.mmAdditionalReasonInformation,
					FailingReason9.mmAdditionalReasonInformation, RejectionOrRepairReason29.mmAdditionalReasonInformation, PendingProcessingReason11.mmAdditionalReasonInformation, PendingReason25.mmAdditionalReasonInformation,
					PendingReason20.mmAdditionalReasonInformation, RejectionReason36.mmAdditionalReasonInformation, PendingProcessingReason12.mmAdditionalReasonInformation, RejectionReason35.mmAdditionalReasonInformation,
					CancellationStatus20Choice.mmReason, CancellationReason18.mmAdditionalReasonInformation, RepairReason12.mmAdditionalReasonInformation, PendingReason19.mmAdditionalReasonInformation,
					AcknowledgementReason18.mmAdditionalReasonInformation, RejectionOrRepairReason31.mmAdditionalReasonInformation, ModificationReason5.mmAdditionalReasonInformation, ConsentReason5.mmCode,
					ConsentReason5.mmAdditionalReasonInformation, RejectionReason40.mmAdditionalReasonInformation, RejectionOrRepairReason28.mmAdditionalReasonInformation, FailingReason10.mmAdditionalReasonInformation,
					RepairReason13.mmAdditionalReasonInformation, PendingProcessingReason13.mmAdditionalReasonInformation, AcceptedStatusReason11.mmAdditionalReasonInformation, UnmatchedReason19.mmAdditionalReasonInformation,
					UnmatchedReason20.mmAdditionalReasonInformation, PendingReason24.mmAdditionalReasonInformation, AcknowledgementReason13.mmAdditionalReasonInformation, RejectionOrRepairReason27.mmAdditionalReasonInformation,
					RejectionReason39.mmAdditionalReasonInformation, UnmatchedReason18.mmAdditionalReasonInformation, AcknowledgementReason15.mmAdditionalReasonInformation, DeniedReason13.mmAdditionalReasonInformation,
					DeniedReason16.mmAdditionalReasonInformation, PendingReason21.mmAdditionalReasonInformation, AcknowledgementReason19.mmAdditionalReasonInformation, CancellationReason19.mmCorporateActionEventIdentification,
					DeniedReason17.mmAdditionalReasonInformation, SystemEventType3Choice.mmCode, SystemEventType3Choice.mmProprietary, RejectionOrRepairReason32.mmAdditionalReasonInformation,
					RejectionOrRepairReason33.mmAdditionalReasonInformation, RejectionOrRepairReason34.mmAdditionalReasonInformation, CancelledStatusReason16.mmAdditionalInformation, RejectedStatus9.mmAdditionalInformation,
					PartiallySettledStatus10.mmAdditionalInformation, BlockedReason2Choice.mmCode, BlockedReason2Choice.mmProprietary, RejectedStatus10.mmAdditionalInformation,
					PendingCancellationStatusReason7.mmAdditionalReasonInformation, RejectedStatusReason21.mmAdditionalReasonInformation, PendingStatusReason13.mmAdditionalReasonInformation, TradeAgreement15.mmAmendOrCancelReason,
					RejectedStatusReason22.mmAdditionalReasonInformation, PendingCancellationStatusReason8.mmAdditionalReasonInformation, PendingStatusReason15.mmAdditionalReasonInformation,
					CancellationStatusReason3.mmAdditionalInformation, ProprietaryStatusJustification1.mmProprietaryStatusReason, ProprietaryStatusJustification1.mmReason, ModificationStatusReason1.mmAdditionalInformation,
					PaymentReversalReason8.mmAdditionalInformation, PaymentReturnReason3.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(StatusReason obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(StatusReason obj, Max35Text value) {
			obj.setReason(value);
		}
	};
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus3Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus1Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus1Choice#mmNoSpecifiedReason
	 * RejectionStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus1Choice#mmNoSpecifiedReason
	 * RepairStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus4Choice#mmNoSpecifiedReason
	 * CancellationStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus4Choice#mmNoSpecifiedReason
	 * PendingStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1#mmNoSpecifiedReason
	 * NoSpecifiedReason1.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus3Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus5Choice#mmNoSpecifiedReason
	 * RejectionStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus5Choice#mmNoSpecifiedReason
	 * RepairStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus7Choice#mmNoSpecifiedReason
	 * CancellationStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus13Choice#mmNoSpecifiedReason
	 * PendingStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus1Choice#mmNoSpecifiedReason
	 * UnmatchedStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus5Choice#mmNoSpecifiedReason
	 * UnmatchedStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus3Choice#mmNoSpecifiedReason
	 * PendingStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus1Choice#mmNoSpecifiedReason
	 * FailingStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus9Choice#mmNoSpecifiedReason
	 * PendingStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus3Choice#mmNoSpecifiedReason
	 * FailingStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus7Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus2Choice#mmNoSpecifiedReason
	 * DeniedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus6Choice#mmNoSpecifiedReason
	 * DeniedStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus8Choice#mmNoSpecifiedReason
	 * RejectionStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus8Choice#mmNoSpecifiedReason
	 * RepairStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus2Choice#mmNoSpecifiedReason
	 * ModificationStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus6Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus1Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus3Choice#mmNoSpecifiedReason
	 * CancellationStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus10Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus11Choice#mmNoSpecifiedReason
	 * PendingStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus4Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus11Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus25Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus14Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus12Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus9Choice#mmNoSpecifiedReason
	 * CancellationStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus9Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus11Choice#mmNoSpecifiedReason
	 * RejectionStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus10Choice#mmNoSpecifiedReason
	 * RepairStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus11Choice#mmNoSpecifiedReason
	 * CancellationStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus24Choice#mmNoSpecifiedReason
	 * PendingStatus24Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus10Choice#mmNoSpecifiedReason
	 * UnmatchedStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus31Choice#mmNoSpecifiedReason
	 * PendingStatus31Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus8Choice#mmNoSpecifiedReason
	 * FailingStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus8Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus9Choice#mmNoSpecifiedReason
	 * DeniedStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus10Choice#mmNoSpecifiedReason
	 * RejectionStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus9Choice#mmNoSpecifiedReason
	 * RepairStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus3Choice#mmNoSpecifiedReason
	 * ModificationStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus22Choice#mmNoSpecifiedReason
	 * PendingStatus22Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus24Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus24Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus20Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus18Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus13Choice#mmNoSpecifiedReason
	 * CancellationStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus2Choice#mmNoSpecifiedReason
	 * PendingStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus5Choice#mmNoSpecifiedReason
	 * PendingStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus1Choice#mmNoSpecifiedReason
	 * CancelledStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice#mmNoSpecifiedReason
	 * AcceptedStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus1Choice#mmNoSpecifiedReason
	 * RejectedStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus1Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus1Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus2Choice#mmNoSpecifiedReason
	 * CancelledStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus2Choice#mmNoSpecifiedReason
	 * AcceptedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus2Choice#mmNoSpecifiedReason
	 * RejectedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus2Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus2Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus3Choice#mmNoSpecifiedReason
	 * CancelledStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus4Choice#mmNoSpecifiedReason
	 * CancelledStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus3Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus3Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus4Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus4Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus1Choice#mmNoSpecifiedReason
	 * PendingStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus6Choice#mmNoSpecifiedReason
	 * PendingStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus6Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus9Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus4Choice#mmNoSpecifiedReason
	 * DeniedStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus7Choice#mmNoSpecifiedReason
	 * PendingStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus12Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus2Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus2Choice#mmNoSpecifiedReason
	 * RepairStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus4Choice#mmNoSpecifiedReason
	 * UnmatchedStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus8Choice#mmNoSpecifiedReason
	 * PendingStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus2Choice#mmNoSpecifiedReason
	 * FailingStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus2Choice#mmNoSpecifiedReason
	 * RejectionStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus6Choice#mmNoSpecifiedReason
	 * CancellationStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus1Choice#mmNoSpecifiedReason
	 * GeneratedStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus2Choice#mmNoSpecifiedReason
	 * GeneratedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus3Choice#mmNoSpecifiedReason
	 * GeneratedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus4Choice#mmNoSpecifiedReason
	 * GeneratedStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice#mmNoSpecifiedReason
	 * AffirmationReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice#mmNoSpecifiedReason
	 * InstructionProcessingReason2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice#mmNoSpecifiedReason
	 * PendingProcessing1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice#mmNoSpecifiedReason
	 * InstructionProcessingReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason3Choice#mmNoSpecifiedReason
	 * MatchingReason3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice#mmNoSpecifiedReason
	 * MatchingReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason11Choice#mmNoSpecifiedReason
	 * CancellationReason11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus1#mmNoReason
	 * CancelledStatus1.mmNoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1#mmNoReason
	 * ConditionallyAcceptedStatus1.mmNoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus1#mmNoReason
	 * SuspendedStatus1.mmNoReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus1#mmNoReason
	 * InRepairStatus1.mmNoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmNoSpecifiedReason
	 * CancelledStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmNoSpecifiedReason
	 * ConditionallyAcceptedStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus2#mmNoSpecifiedReason
	 * SuspendedStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus2#mmNoSpecifiedReason
	 * InRepairStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#mmNoReason
	 * PendingSettlementStatusChoice.mmNoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus#mmNoReason
	 * TransferUnmatchedStatus.mmNoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmNoSpecifiedReason
	 * PendingSettlementStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#mmNoSpecifiedReason
	 * TransferUnmatchedStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus3#mmNoSpecifiedReason
	 * InRepairStatus3.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1#mmNoSpecifiedReason
	 * FailedSettlementStatus1.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus3#mmNoSpecifiedReason
	 * CancelledStatus3.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReversedStatus1#mmNoSpecifiedReason
	 * ReversedStatus1.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1#mmNoSpecifiedReason
	 * CancellationPendingStatus1.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus2Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus3Choice#mmNoSpecifiedReason
	 * RejectionStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus3Choice#mmNoSpecifiedReason
	 * RepairStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus2Choice#mmNoSpecifiedReason
	 * UnmatchedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus2Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus1Choice#mmNoSpecifiedReason
	 * DeniedStatus1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus5Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus4Choice#mmNoSpecifiedReason
	 * RejectionStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus4Choice#mmNoSpecifiedReason
	 * RepairStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus3Choice#mmNoSpecifiedReason
	 * UnmatchedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus5Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus3Choice#mmNoSpecifiedReason
	 * DeniedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus4Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus6Choice#mmNoSpecifiedReason
	 * RejectionStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus6Choice#mmNoSpecifiedReason
	 * RepairStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus8Choice#mmNoSpecifiedReason
	 * CancellationStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus6Choice#mmNoSpecifiedReason
	 * UnmatchedStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus15Choice#mmNoSpecifiedReason
	 * PendingStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus10Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus5Choice#mmNoSpecifiedReason
	 * DeniedStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus10Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus12Choice#mmNoSpecifiedReason
	 * RejectionStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus11Choice#mmNoSpecifiedReason
	 * RepairStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus12Choice#mmNoSpecifiedReason
	 * CancellationStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus11Choice#mmNoSpecifiedReason
	 * UnmatchedStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus26Choice#mmNoSpecifiedReason
	 * PendingStatus26Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus16Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus8Choice#mmNoSpecifiedReason
	 * DeniedStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus2Choice#mmNoSpecifiedReason
	 * ConsentStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus7Choice#mmNoSpecifiedReason
	 * RejectionStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus3Choice#mmNoSpecifiedReason
	 * ConsentStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus9Choice#mmNoSpecifiedReason
	 * RejectionStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus4Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus7Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus18Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus23Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus8Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus5Choice#mmNoSpecifiedReason
	 * CancellationStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus13Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus3Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus15Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus12Choice#mmNoSpecifiedReason
	 * PendingStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus4Choice#mmNoSpecifiedReason
	 * FailingStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus21Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus23Choice#mmNoSpecifiedReason
	 * PendingStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus5Choice#mmNoSpecifiedReason
	 * FailingStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice#mmNoSpecifiedReason
	 * CancelledStatusReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice#mmNoSpecifiedReason
	 * ConditionallyAcceptedStatusReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice#mmNoSpecifiedReason
	 * SuspendedStatusReasonChoice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus26Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus26Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus28Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus28Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason3Choice#mmNoSpecifiedReason
	 * Reason3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus27Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus27Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus5Choice#mmNoSpecifiedReason
	 * GeneratedStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus3Choice#mmNoSpecifiedReason
	 * AcceptedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus9Choice#mmNoSpecifiedReason
	 * RejectedStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus32Choice#mmNoSpecifiedReason
	 * PendingStatus32Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus12Choice#mmNoSpecifiedReason
	 * UnmatchedStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus13Choice#mmNoSpecifiedReason
	 * UnmatchedStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus14Choice#mmNoSpecifiedReason
	 * RejectionStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus13Choice#mmNoSpecifiedReason
	 * RejectionStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus10Choice#mmNoSpecifiedReason
	 * RejectedStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus5Choice#mmNoSpecifiedReason
	 * CancelledStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus4Choice#mmNoSpecifiedReason
	 * AcceptedStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus11Choice#mmNoSpecifiedReason
	 * RejectedStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus33Choice#mmNoSpecifiedReason
	 * PendingStatus33Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus5Choice#mmNoSpecifiedReason
	 * AcceptedStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus15Choice#mmNoSpecifiedReason
	 * RejectionStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus12Choice#mmNoSpecifiedReason
	 * RejectedStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus15Choice#mmNoSpecifiedReason
	 * UnmatchedStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus6Choice#mmNoSpecifiedReason
	 * GeneratedStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus14Choice#mmNoSpecifiedReason
	 * UnmatchedStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus6Choice#mmNoSpecifiedReason
	 * AcceptedStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus6Choice#mmNoSpecifiedReason
	 * CancelledStatus6Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus16Choice#mmNoSpecifiedReason
	 * RejectionStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProprietaryReason1Choice#mmNoSpecifiedReason
	 * ProprietaryReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason1Choice#mmNoSpecifiedReason
	 * ReceivedReason1Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice#mmNoSpecifiedReason
	 * PendingProcessingReason9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason8Choice#mmNoSpecifiedReason
	 * RejectedReason8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason8Choice#mmNoSpecifiedReason
	 * AcceptedReason8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice#mmNoSpecifiedReason
	 * MatchingReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus7Choice#mmNoSpecifiedReason
	 * CancelledStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus13Choice#mmNoSpecifiedReason
	 * RejectedStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus14Choice#mmNoSpecifiedReason
	 * RejectedStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus34Choice#mmNoSpecifiedReason
	 * PendingStatus34Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus10Choice#mmNoSpecifiedReason
	 * DeniedStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus8Choice#mmNoSpecifiedReason
	 * CancelledStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus15Choice#mmNoSpecifiedReason
	 * RejectedStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus35Choice#mmNoSpecifiedReason
	 * PendingStatus35Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus16Choice#mmNoSpecifiedReason
	 * RejectedStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus9Choice#mmNoSpecifiedReason
	 * CancelledStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus13Choice#mmNoSpecifiedReason
	 * DeniedStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus11Choice#mmNoSpecifiedReason
	 * DeniedStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus12Choice#mmNoSpecifiedReason
	 * DeniedStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus14Choice#mmNoSpecifiedReason
	 * DeniedStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus17Choice#mmNoSpecifiedReason
	 * RejectionStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus7Choice#mmNoSpecifiedReason
	 * AcceptedStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice#mmNoSpecifiedReason
	 * RepairStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus16Choice#mmNoSpecifiedReason
	 * CancellationStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus37Choice#mmNoSpecifiedReason
	 * PendingStatus37Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus17Choice#mmNoSpecifiedReason
	 * DeniedStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus10Choice#mmNoSpecifiedReason
	 * CancelledStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus17Choice#mmNoSpecifiedReason
	 * RejectedStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus16Choice#mmNoSpecifiedReason
	 * DeniedStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus31Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice#mmNoSpecifiedReason
	 * PendingStatus38Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice#mmNoSpecifiedReason
	 * DeniedStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice#mmNoSpecifiedReason
	 * ModificationStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice#mmNoSpecifiedReason
	 * RejectionStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice#mmNoSpecifiedReason
	 * RepairStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice#mmNoSpecifiedReason
	 * UnmatchedStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice#mmNoSpecifiedReason
	 * CancellationStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus40Choice#mmNoSpecifiedReason
	 * PendingStatus40Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus10Choice#mmNoSpecifiedReason
	 * FailingStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice#mmNoSpecifiedReason
	 * UnmatchedStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice#mmNoSpecifiedReason
	 * RejectionStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice#mmNoSpecifiedReason
	 * RejectionStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus29Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus39Choice#mmNoSpecifiedReason
	 * PendingStatus39Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice#mmNoSpecifiedReason
	 * ConsentStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice#mmNoSpecifiedReason
	 * GeneratedStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus22Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus32Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus24Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice#mmNoSpecifiedReason
	 * UnmatchedStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus14Choice#mmNoSpecifiedReason
	 * RepairStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus36Choice#mmNoSpecifiedReason
	 * PendingStatus36Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus30Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus15Choice#mmNoSpecifiedReason
	 * CancellationStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus9Choice#mmNoSpecifiedReason
	 * FailingStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus19Choice#mmNoSpecifiedReason
	 * RejectionStatus19Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus19Choice#mmNoSpecifiedReason
	 * RejectedStatus19Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice#mmNoSpecifiedReason
	 * AcceptedStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus12Choice#mmNoSpecifiedReason
	 * CancelledStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus42Choice#mmNoSpecifiedReason
	 * PendingStatus42Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus11Choice#mmNoSpecifiedReason
	 * CancelledStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus5Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus5Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus18Choice#mmNoSpecifiedReason
	 * RejectedStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice#mmNoSpecifiedReason
	 * PendingStatus41Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmNoSpecifiedReason
	 * TransferUnmatchedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#mmNoSpecifiedReason
	 * CancelledStatus13Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice#mmNoSpecifiedReason
	 * ReversedStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#mmNoSpecifiedReason
	 * InRepairStatus4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmNoSpecifiedReason
	 * PendingSettlementStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#mmNoSpecifiedReason
	 * FailedSettlementStatus2Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#mmNoSpecifiedReason
	 * CancellationPendingStatus7Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus6Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus6Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus14Choice#mmNoSpecifiedReason
	 * CancelledStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus20Choice#mmNoSpecifiedReason
	 * RejectedStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus15Choice#mmNoSpecifiedReason
	 * CancelledStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus43Choice#mmNoSpecifiedReason
	 * PendingStatus43Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus44Choice#mmNoSpecifiedReason
	 * PendingStatus44Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus21Choice#mmNoSpecifiedReason
	 * RejectedStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus9Choice#mmNoSpecifiedReason
	 * AcceptedStatus9Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus15Choice#mmNoSpecifiedReason
	 * RepairStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus18Choice#mmNoSpecifiedReason
	 * CancellationStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus22Choice#mmNoSpecifiedReason
	 * RejectionStatus22Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus27Choice#mmNoSpecifiedReason
	 * RejectionStatus27Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus5Choice#mmNoSpecifiedReason
	 * ConsentStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus46Choice#mmNoSpecifiedReason
	 * PendingStatus46Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus23Choice#mmNoSpecifiedReason
	 * RejectionStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus22Choice#mmNoSpecifiedReason
	 * RejectedStatus22Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus20Choice#mmNoSpecifiedReason
	 * CancellationStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus10Choice#mmNoSpecifiedReason
	 * AcceptedStatus10Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus16Choice#mmNoSpecifiedReason
	 * CancelledStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus19Choice#mmNoSpecifiedReason
	 * UnmatchedStatus19Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus8Choice#mmNoSpecifiedReason
	 * GeneratedStatus8Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus11Choice#mmNoSpecifiedReason
	 * FailingStatus11Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus30Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus30Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus26Choice#mmNoSpecifiedReason
	 * RejectionStatus26Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus5Choice#mmNoSpecifiedReason
	 * ModificationStatus5Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus34Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus34Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus15Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus15Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus16Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus45Choice#mmNoSpecifiedReason
	 * PendingStatus45Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus21Choice#mmNoSpecifiedReason
	 * UnmatchedStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus17Choice#mmNoSpecifiedReason
	 * RepairStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus24Choice#mmNoSpecifiedReason
	 * RejectionStatus24Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus35Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus35Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus51Choice#mmNoSpecifiedReason
	 * PendingStatus51Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus31Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus31Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus21Choice#mmNoSpecifiedReason
	 * DeniedStatus21Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus16Choice#mmNoSpecifiedReason
	 * RepairStatus16Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus33Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus33Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus25Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus20Choice#mmNoSpecifiedReason
	 * UnmatchedStatus20Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus50Choice#mmNoSpecifiedReason
	 * PendingStatus50Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus27Choice#mmNoSpecifiedReason
	 * AcknowledgedAcceptedStatus27Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus37Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus37Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus18Choice#mmNoSpecifiedReason
	 * DeniedStatus18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus17Choice#mmNoSpecifiedReason
	 * CancellationStatus17Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus19Choice#mmNoSpecifiedReason
	 * DeniedStatus19Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus12Choice#mmNoSpecifiedReason
	 * FailingStatus12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus14Choice#mmNoSpecifiedReason
	 * PendingProcessingStatus14Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus47Choice#mmNoSpecifiedReason
	 * PendingStatus47Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus39Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus39Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus38Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus38Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason18Choice#mmNoSpecifiedReason
	 * Reason18Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus40Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus40Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#mmNoSpecifiedReason
	 * SuspendedStatusReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmNoSpecifiedReason
	 * ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#mmNoSpecifiedReason
	 * InRepairStatusReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#mmNoSpecifiedReason
	 * CancelledReason12Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus7Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus23Choice#mmNoSpecifiedReason
	 * RejectedStatus23Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus52Choice#mmNoSpecifiedReason
	 * PendingStatus52Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus8Choice#mmNotSpecifiedReason
	 * PendingCancellationStatus8Choice.mmNotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus24Choice#mmNoSpecifiedReason
	 * RejectedStatus24Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus53Choice#mmNoSpecifiedReason
	 * PendingStatus53Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, NoReasonCode> mmNoSpecifiedReason = new MMBusinessAttribute<StatusReason, NoReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AcknowledgedAcceptedStatus3Choice.mmNoSpecifiedReason, PendingProcessingStatus1Choice.mmNoSpecifiedReason, RejectionStatus1Choice.mmNoSpecifiedReason,
					RepairStatus1Choice.mmNoSpecifiedReason, CancellationStatus4Choice.mmNoSpecifiedReason, PendingStatus4Choice.mmNoSpecifiedReason, NoSpecifiedReason1.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus7Choice.mmNoSpecifiedReason, PendingProcessingStatus3Choice.mmNoSpecifiedReason, RejectionStatus5Choice.mmNoSpecifiedReason, RepairStatus5Choice.mmNoSpecifiedReason,
					CancellationStatus7Choice.mmNoSpecifiedReason, PendingStatus13Choice.mmNoSpecifiedReason, UnmatchedStatus1Choice.mmNoSpecifiedReason, UnmatchedStatus5Choice.mmNoSpecifiedReason, PendingStatus3Choice.mmNoSpecifiedReason,
					FailingStatus1Choice.mmNoSpecifiedReason, PendingStatus9Choice.mmNoSpecifiedReason, FailingStatus3Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus14Choice.mmNoSpecifiedReason,
					PendingProcessingStatus7Choice.mmNoSpecifiedReason, DeniedStatus2Choice.mmNoSpecifiedReason, DeniedStatus6Choice.mmNoSpecifiedReason, RejectionStatus8Choice.mmNoSpecifiedReason, RepairStatus8Choice.mmNoSpecifiedReason,
					ModificationStatus2Choice.mmNoSpecifiedReason, RejectionOrRepairStatus6Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus1Choice.mmNoSpecifiedReason, CancellationStatus3Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus10Choice.mmNoSpecifiedReason, PendingStatus11Choice.mmNoSpecifiedReason, RejectionOrRepairStatus4Choice.mmNoSpecifiedReason, RejectionOrRepairStatus11Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus25Choice.mmNoSpecifiedReason, RejectionOrRepairStatus14Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus12Choice.mmNoSpecifiedReason, CancellationStatus9Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus20Choice.mmNoSpecifiedReason, PendingProcessingStatus9Choice.mmNoSpecifiedReason, RejectionStatus11Choice.mmNoSpecifiedReason, RepairStatus10Choice.mmNoSpecifiedReason,
					CancellationStatus11Choice.mmNoSpecifiedReason, PendingStatus24Choice.mmNoSpecifiedReason, UnmatchedStatus10Choice.mmNoSpecifiedReason, PendingStatus31Choice.mmNoSpecifiedReason,
					FailingStatus8Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus15Choice.mmNoSpecifiedReason, PendingProcessingStatus8Choice.mmNoSpecifiedReason, DeniedStatus9Choice.mmNoSpecifiedReason,
					RejectionStatus10Choice.mmNoSpecifiedReason, RepairStatus9Choice.mmNoSpecifiedReason, ModificationStatus3Choice.mmNoSpecifiedReason, PendingStatus22Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus24Choice.mmNoSpecifiedReason, RejectionOrRepairStatus20Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus18Choice.mmNoSpecifiedReason, CancellationStatus13Choice.mmNoSpecifiedReason,
					PendingStatus2Choice.mmNoSpecifiedReason, PendingStatus5Choice.mmNoSpecifiedReason, CancelledStatus1Choice.mmNoSpecifiedReason, AcceptedStatus1Choice.mmNoSpecifiedReason, RejectedStatus1Choice.mmNoSpecifiedReason,
					PendingCancellationStatus1Choice.mmNotSpecifiedReason, CancelledStatus2Choice.mmNoSpecifiedReason, AcceptedStatus2Choice.mmNoSpecifiedReason, RejectedStatus2Choice.mmNoSpecifiedReason,
					PendingCancellationStatus2Choice.mmNotSpecifiedReason, CancelledStatus3Choice.mmNoSpecifiedReason, CancelledStatus4Choice.mmNoSpecifiedReason, PendingCancellationStatus3Choice.mmNotSpecifiedReason,
					PendingCancellationStatus4Choice.mmNotSpecifiedReason, PendingStatus1Choice.mmNoSpecifiedReason, PendingStatus6Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus6Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus9Choice.mmNoSpecifiedReason, DeniedStatus4Choice.mmNoSpecifiedReason, PendingStatus7Choice.mmNoSpecifiedReason, RejectionOrRepairStatus12Choice.mmNoSpecifiedReason,
					PendingProcessingStatus2Choice.mmNoSpecifiedReason, RepairStatus2Choice.mmNoSpecifiedReason, UnmatchedStatus4Choice.mmNoSpecifiedReason, PendingStatus8Choice.mmNoSpecifiedReason,
					FailingStatus2Choice.mmNoSpecifiedReason, RejectionStatus2Choice.mmNoSpecifiedReason, CancellationStatus6Choice.mmNoSpecifiedReason, GeneratedStatus1Choice.mmNoSpecifiedReason,
					GeneratedStatus2Choice.mmNoSpecifiedReason, GeneratedStatus3Choice.mmNoSpecifiedReason, GeneratedStatus4Choice.mmNoSpecifiedReason, AffirmationReason1Choice.mmNoSpecifiedReason,
					InstructionProcessingReason2Choice.mmNoSpecifiedReason, PendingProcessing1Choice.mmNoSpecifiedReason, InstructionProcessingReason1Choice.mmNoSpecifiedReason, MatchingReason3Choice.mmNoSpecifiedReason,
					MatchingReason1Choice.mmNoSpecifiedReason, CancellationReason11Choice.mmNoSpecifiedReason, CancelledStatus1.mmNoReason, ConditionallyAcceptedStatus1.mmNoReason, SuspendedStatus1.mmNoReason, InRepairStatus1.mmNoReason,
					CancelledStatus2.mmNoSpecifiedReason, ConditionallyAcceptedStatus2.mmNoSpecifiedReason, SuspendedStatus2.mmNoSpecifiedReason, InRepairStatus2.mmNoSpecifiedReason, PendingSettlementStatusChoice.mmNoReason,
					TransferUnmatchedStatus.mmNoReason, PendingSettlementStatus2.mmNoSpecifiedReason, TransferUnmatchedStatus2.mmNoSpecifiedReason, InRepairStatus3.mmNoSpecifiedReason, FailedSettlementStatus1.mmNoSpecifiedReason,
					CancelledStatus3.mmNoSpecifiedReason, ReversedStatus1.mmNoSpecifiedReason, CancellationPendingStatus1.mmNoSpecifiedReason, RejectionOrRepairStatus2Choice.mmNoSpecifiedReason, RejectionStatus3Choice.mmNoSpecifiedReason,
					RepairStatus3Choice.mmNoSpecifiedReason, UnmatchedStatus2Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus2Choice.mmNoSpecifiedReason, DeniedStatus1Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus5Choice.mmNoSpecifiedReason, RejectionStatus4Choice.mmNoSpecifiedReason, RepairStatus4Choice.mmNoSpecifiedReason, UnmatchedStatus3Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus5Choice.mmNoSpecifiedReason, DeniedStatus3Choice.mmNoSpecifiedReason, PendingProcessingStatus4Choice.mmNoSpecifiedReason, RejectionStatus6Choice.mmNoSpecifiedReason,
					RepairStatus6Choice.mmNoSpecifiedReason, CancellationStatus8Choice.mmNoSpecifiedReason, UnmatchedStatus6Choice.mmNoSpecifiedReason, PendingStatus15Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus10Choice.mmNoSpecifiedReason, DeniedStatus5Choice.mmNoSpecifiedReason, PendingProcessingStatus10Choice.mmNoSpecifiedReason, RejectionStatus12Choice.mmNoSpecifiedReason,
					RepairStatus11Choice.mmNoSpecifiedReason, CancellationStatus12Choice.mmNoSpecifiedReason, UnmatchedStatus11Choice.mmNoSpecifiedReason, PendingStatus26Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus16Choice.mmNoSpecifiedReason, DeniedStatus8Choice.mmNoSpecifiedReason, ConsentStatus2Choice.mmNoSpecifiedReason, RejectionStatus7Choice.mmNoSpecifiedReason,
					ConsentStatus3Choice.mmNoSpecifiedReason, RejectionStatus9Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus4Choice.mmNoSpecifiedReason, RejectionOrRepairStatus7Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus18Choice.mmNoSpecifiedReason, RejectionOrRepairStatus23Choice.mmNoSpecifiedReason, RejectionOrRepairStatus8Choice.mmNoSpecifiedReason, CancellationStatus5Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus13Choice.mmNoSpecifiedReason, RejectionOrRepairStatus3Choice.mmNoSpecifiedReason, RejectionOrRepairStatus15Choice.mmNoSpecifiedReason, PendingStatus12Choice.mmNoSpecifiedReason,
					FailingStatus4Choice.mmNoSpecifiedReason, RejectionOrRepairStatus21Choice.mmNoSpecifiedReason, PendingStatus23Choice.mmNoSpecifiedReason, FailingStatus5Choice.mmNoSpecifiedReason,
					CancelledStatusReason1Choice.mmNoSpecifiedReason, ConditionallyAcceptedStatusReason1Choice.mmNoSpecifiedReason, SuspendedStatusReasonChoice.mmNoSpecifiedReason, RejectionOrRepairStatus26Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus28Choice.mmNoSpecifiedReason, Reason3Choice.mmNoSpecifiedReason, RejectionOrRepairStatus27Choice.mmNoSpecifiedReason, GeneratedStatus5Choice.mmNoSpecifiedReason,
					AcceptedStatus3Choice.mmNoSpecifiedReason, RejectedStatus9Choice.mmNoSpecifiedReason, PendingStatus32Choice.mmNoSpecifiedReason, UnmatchedStatus12Choice.mmNoSpecifiedReason, UnmatchedStatus13Choice.mmNoSpecifiedReason,
					RejectionStatus14Choice.mmNoSpecifiedReason, RejectionStatus13Choice.mmNoSpecifiedReason, RejectedStatus10Choice.mmNoSpecifiedReason, CancelledStatus5Choice.mmNoSpecifiedReason,
					AcceptedStatus4Choice.mmNoSpecifiedReason, RejectedStatus11Choice.mmNoSpecifiedReason, PendingStatus33Choice.mmNoSpecifiedReason, AcceptedStatus5Choice.mmNoSpecifiedReason, RejectionStatus15Choice.mmNoSpecifiedReason,
					RejectedStatus12Choice.mmNoSpecifiedReason, UnmatchedStatus15Choice.mmNoSpecifiedReason, GeneratedStatus6Choice.mmNoSpecifiedReason, UnmatchedStatus14Choice.mmNoSpecifiedReason,
					AcceptedStatus6Choice.mmNoSpecifiedReason, CancelledStatus6Choice.mmNoSpecifiedReason, RejectionStatus16Choice.mmNoSpecifiedReason, ProprietaryReason1Choice.mmNoSpecifiedReason,
					ReceivedReason1Choice.mmNoSpecifiedReason, PendingProcessingReason9Choice.mmNoSpecifiedReason, RejectedReason8Choice.mmNoSpecifiedReason, AcceptedReason8Choice.mmNoSpecifiedReason,
					MatchingReason4Choice.mmNoSpecifiedReason, CancelledStatus7Choice.mmNoSpecifiedReason, RejectedStatus13Choice.mmNoSpecifiedReason, RejectedStatus14Choice.mmNoSpecifiedReason, PendingStatus34Choice.mmNoSpecifiedReason,
					DeniedStatus10Choice.mmNoSpecifiedReason, CancelledStatus8Choice.mmNoSpecifiedReason, RejectedStatus15Choice.mmNoSpecifiedReason, PendingStatus35Choice.mmNoSpecifiedReason, RejectedStatus16Choice.mmNoSpecifiedReason,
					CancelledStatus9Choice.mmNoSpecifiedReason, DeniedStatus13Choice.mmNoSpecifiedReason, DeniedStatus11Choice.mmNoSpecifiedReason, DeniedStatus12Choice.mmNoSpecifiedReason, DeniedStatus14Choice.mmNoSpecifiedReason,
					RejectionStatus17Choice.mmNoSpecifiedReason, AcceptedStatus7Choice.mmNoSpecifiedReason, RepairStatus12Choice.mmNoSpecifiedReason, CancellationStatus16Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus21Choice.mmNoSpecifiedReason, PendingStatus37Choice.mmNoSpecifiedReason, DeniedStatus17Choice.mmNoSpecifiedReason, CancelledStatus10Choice.mmNoSpecifiedReason,
					RejectedStatus17Choice.mmNoSpecifiedReason, DeniedStatus16Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus23Choice.mmNoSpecifiedReason, RejectionOrRepairStatus31Choice.mmNoSpecifiedReason,
					PendingStatus38Choice.mmNoSpecifiedReason, DeniedStatus15Choice.mmNoSpecifiedReason, ModificationStatus4Choice.mmNoSpecifiedReason, RejectionStatus18Choice.mmNoSpecifiedReason, RepairStatus13Choice.mmNoSpecifiedReason,
					PendingProcessingStatus13Choice.mmNoSpecifiedReason, UnmatchedStatus17Choice.mmNoSpecifiedReason, PendingProcessingStatus11Choice.mmNoSpecifiedReason, CancellationStatus14Choice.mmNoSpecifiedReason,
					PendingStatus40Choice.mmNoSpecifiedReason, FailingStatus10Choice.mmNoSpecifiedReason, UnmatchedStatus16Choice.mmNoSpecifiedReason, RejectionStatus21Choice.mmNoSpecifiedReason,
					RejectionStatus20Choice.mmNoSpecifiedReason, RejectionOrRepairStatus29Choice.mmNoSpecifiedReason, PendingStatus39Choice.mmNoSpecifiedReason, PendingProcessingStatus12Choice.mmNoSpecifiedReason,
					ConsentStatus4Choice.mmNoSpecifiedReason, GeneratedStatus7Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus22Choice.mmNoSpecifiedReason, RejectionOrRepairStatus32Choice.mmNoSpecifiedReason,
					AcknowledgedAcceptedStatus24Choice.mmNoSpecifiedReason, UnmatchedStatus18Choice.mmNoSpecifiedReason, RepairStatus14Choice.mmNoSpecifiedReason, PendingStatus36Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus30Choice.mmNoSpecifiedReason, CancellationStatus15Choice.mmNoSpecifiedReason, FailingStatus9Choice.mmNoSpecifiedReason, RejectionStatus19Choice.mmNoSpecifiedReason,
					RejectedStatus19Choice.mmNoSpecifiedReason, AcceptedStatus8Choice.mmNoSpecifiedReason, CancelledStatus12Choice.mmNoSpecifiedReason, PendingStatus42Choice.mmNoSpecifiedReason, CancelledStatus11Choice.mmNoSpecifiedReason,
					PendingCancellationStatus5Choice.mmNotSpecifiedReason, RejectedStatus18Choice.mmNoSpecifiedReason, PendingStatus41Choice.mmNoSpecifiedReason, TransferUnmatchedStatus3Choice.mmNoSpecifiedReason,
					CancelledStatus13Choice.mmNoSpecifiedReason, ReversedStatus2Choice.mmNoSpecifiedReason, InRepairStatus4Choice.mmNoSpecifiedReason, PendingSettlementStatus3Choice.mmNoSpecifiedReason,
					FailedSettlementStatus2Choice.mmNoSpecifiedReason, CancellationPendingStatus7Choice.mmNoSpecifiedReason, PendingCancellationStatus6Choice.mmNotSpecifiedReason, CancelledStatus14Choice.mmNoSpecifiedReason,
					RejectedStatus20Choice.mmNoSpecifiedReason, CancelledStatus15Choice.mmNoSpecifiedReason, PendingStatus43Choice.mmNoSpecifiedReason, PendingStatus44Choice.mmNoSpecifiedReason, RejectedStatus21Choice.mmNoSpecifiedReason,
					AcceptedStatus9Choice.mmNoSpecifiedReason, RepairStatus15Choice.mmNoSpecifiedReason, CancellationStatus18Choice.mmNoSpecifiedReason, RejectionStatus22Choice.mmNoSpecifiedReason,
					RejectionStatus27Choice.mmNoSpecifiedReason, ConsentStatus5Choice.mmNoSpecifiedReason, PendingStatus46Choice.mmNoSpecifiedReason, RejectionStatus23Choice.mmNoSpecifiedReason, RejectedStatus22Choice.mmNoSpecifiedReason,
					CancellationStatus20Choice.mmNoSpecifiedReason, AcceptedStatus10Choice.mmNoSpecifiedReason, CancelledStatus16Choice.mmNoSpecifiedReason, UnmatchedStatus19Choice.mmNoSpecifiedReason,
					GeneratedStatus8Choice.mmNoSpecifiedReason, FailingStatus11Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus30Choice.mmNoSpecifiedReason, RejectionStatus26Choice.mmNoSpecifiedReason,
					ModificationStatus5Choice.mmNoSpecifiedReason, RejectionOrRepairStatus34Choice.mmNoSpecifiedReason, PendingProcessingStatus15Choice.mmNoSpecifiedReason, PendingProcessingStatus16Choice.mmNoSpecifiedReason,
					PendingStatus45Choice.mmNoSpecifiedReason, UnmatchedStatus21Choice.mmNoSpecifiedReason, RepairStatus17Choice.mmNoSpecifiedReason, RejectionStatus24Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus35Choice.mmNoSpecifiedReason, PendingStatus51Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus31Choice.mmNoSpecifiedReason, DeniedStatus21Choice.mmNoSpecifiedReason,
					RepairStatus16Choice.mmNoSpecifiedReason, RejectionOrRepairStatus33Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus25Choice.mmNoSpecifiedReason, UnmatchedStatus20Choice.mmNoSpecifiedReason,
					PendingStatus50Choice.mmNoSpecifiedReason, AcknowledgedAcceptedStatus27Choice.mmNoSpecifiedReason, RejectionOrRepairStatus37Choice.mmNoSpecifiedReason, DeniedStatus18Choice.mmNoSpecifiedReason,
					CancellationStatus17Choice.mmNoSpecifiedReason, DeniedStatus19Choice.mmNoSpecifiedReason, FailingStatus12Choice.mmNoSpecifiedReason, PendingProcessingStatus14Choice.mmNoSpecifiedReason,
					PendingStatus47Choice.mmNoSpecifiedReason, RejectionOrRepairStatus39Choice.mmNoSpecifiedReason, RejectionOrRepairStatus38Choice.mmNoSpecifiedReason, Reason18Choice.mmNoSpecifiedReason,
					RejectionOrRepairStatus40Choice.mmNoSpecifiedReason, SuspendedStatusReason4Choice.mmNoSpecifiedReason, ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason, InRepairStatusReason4Choice.mmNoSpecifiedReason,
					CancelledReason12Choice.mmNoSpecifiedReason, PendingCancellationStatus7Choice.mmNotSpecifiedReason, RejectedStatus23Choice.mmNoSpecifiedReason, PendingStatus52Choice.mmNoSpecifiedReason,
					PendingCancellationStatus8Choice.mmNotSpecifiedReason, RejectedStatus24Choice.mmNoSpecifiedReason, PendingStatus53Choice.mmNoSpecifiedReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(StatusReason obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(StatusReason obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	protected List<GenericIdentification> dataSourceScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
	 * GenericIdentification.mmRelatedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice#mmProprietary
	 * UnaffirmedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus4#mmDataSourceScheme
	 * RejectedStatus4.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus7#mmDataSourceScheme
	 * RejectedStatus7.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmDataSourceScheme
	 * ConfirmationRejectedStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus1#mmDataSourceScheme
	 * CancelledStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1#mmDataSourceScheme
	 * ConditionallyAcceptedStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus3#mmDataSourceScheme
	 * RejectedStatus3.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus1#mmDataSourceScheme
	 * SuspendedStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus1#mmDataSourceScheme
	 * InRepairStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#mmDataSourceScheme
	 * CancelledStatus2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2#mmDataSourceScheme
	 * ConditionallyAcceptedStatusReason2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus6#mmDataSourceScheme
	 * RejectedStatus6.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmDataSourceScheme
	 * SuspendedStatusReason2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#mmDataSourceScheme
	 * PartiallySettledStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatusReason3#mmDataSourceScheme
	 * InRepairStatusReason3.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice#mmDataSourceScheme
	 * TransferCancellationRejectedStatus1Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice#mmDataSourceScheme
	 * TransferCancellationCompleteStatusChoice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationRejectedStatus1#mmDataSourceScheme
	 * TransferCancellationRejectedStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationCompleteStatusAndReason1#mmDataSourceScheme
	 * TransferCancellationCompleteStatusAndReason1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#mmDataSourceScheme
	 * PendingSettlementStatusChoice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus#mmDataSourceScheme
	 * TransferUnmatchedStatus.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus3Choice#mmDataSourceScheme
	 * RejectedStatus3Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmDataSourceScheme
	 * PendingSettlementStatus2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#mmDataSourceScheme
	 * TransferUnmatchedStatus2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus3#mmDataSourceScheme
	 * InRepairStatus3.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus8Choice#mmDataSourceScheme
	 * RejectedStatus8Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus3#mmDataSourceScheme
	 * CancelledStatus3.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1#mmDataSourceScheme
	 * CancellationPendingStatus1.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#mmDataSourceScheme
	 * RejectedStatusReason9Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#mmDataSourceScheme
	 * TransferUnmatchedStatus3Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#mmDataSourceScheme
	 * CancelledStatus13Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#mmDataSourceScheme
	 * InRepairStatus4Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmDataSourceScheme
	 * PendingSettlementStatus3Choice.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#mmDataSourceScheme
	 * CancellationPendingStatus7Choice.mmDataSourceScheme}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary identification of the reason for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StatusReason, List<GenericIdentification>> mmDataSourceScheme = new MMBusinessAssociationEnd<StatusReason, List<GenericIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(UnaffirmedReason2Choice.mmProprietary, RejectedStatus4.mmDataSourceScheme, RejectedStatus7.mmDataSourceScheme, ConfirmationRejectedStatus1.mmDataSourceScheme,
					CancelledStatus1.mmDataSourceScheme, ConditionallyAcceptedStatus1.mmDataSourceScheme, RejectedStatus3.mmDataSourceScheme, SuspendedStatus1.mmDataSourceScheme, InRepairStatus1.mmDataSourceScheme,
					CancelledStatus2.mmDataSourceScheme, ConditionallyAcceptedStatusReason2.mmDataSourceScheme, RejectedStatus6.mmDataSourceScheme, SuspendedStatusReason2.mmDataSourceScheme, PartiallySettledStatus1.mmDataSourceScheme,
					InRepairStatusReason3.mmDataSourceScheme, TransferCancellationRejectedStatus1Choice.mmDataSourceScheme, TransferCancellationCompleteStatusChoice.mmDataSourceScheme,
					TransferCancellationRejectedStatus1.mmDataSourceScheme, TransferCancellationCompleteStatusAndReason1.mmDataSourceScheme, PendingSettlementStatusChoice.mmDataSourceScheme, TransferUnmatchedStatus.mmDataSourceScheme,
					RejectedStatus3Choice.mmDataSourceScheme, PendingSettlementStatus2.mmDataSourceScheme, TransferUnmatchedStatus2.mmDataSourceScheme, InRepairStatus3.mmDataSourceScheme, RejectedStatus8Choice.mmDataSourceScheme,
					CancelledStatus3.mmDataSourceScheme, CancellationPendingStatus1.mmDataSourceScheme, RejectedStatusReason9Choice.mmDataSourceScheme, TransferUnmatchedStatus3Choice.mmDataSourceScheme,
					CancelledStatus13Choice.mmDataSourceScheme, InRepairStatus4Choice.mmDataSourceScheme, PendingSettlementStatus3Choice.mmDataSourceScheme, CancellationPendingStatus7Choice.mmDataSourceScheme);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			opposite_lazy = () -> GenericIdentification.mmRelatedStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(StatusReason obj) {
			return obj.getDataSourceScheme();
		}

		@Override
		public void setValue(StatusReason obj, List<GenericIdentification> value) {
			obj.setDataSourceScheme(value);
		}
	};
	protected RejectedStatusReasonCode rejectedStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
	 * RejectedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus5#mmReason
	 * RejectedStatus5.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmRejected
	 * AccountManagementStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason3Choice#mmCode
	 * RejectedReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason3Choice#mmProprietary
	 * RejectedReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status12Choice#mmRejected
	 * Status12Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason4#mmStructured
	 * RejectedStatusReason4.mmStructured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus4#mmReason
	 * RejectedStatus4.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason4#mmRejected
	 * OrderStatusAndReason4.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus7#mmReason
	 * RejectedStatus7.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmRejected
	 * OrderStatusAndReason8.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason6#mmStructured
	 * RejectedStatusReason6.mmStructured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus3#mmReason
	 * RejectedStatus3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmRejected
	 * IndividualOrderStatusAndReason1.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus6#mmReason
	 * RejectedStatus6.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmRejected
	 * OrderStatusAndReason7.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason1#mmReason
	 * RejectionReason1.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason3#mmReason
	 * RejectionReason3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationRejectionReason1#mmStructured
	 * TransferCancellationRejectionReason1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice#mmReason
	 * TransferCancellationRejectedStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationRejectedStatus1#mmReason
	 * TransferCancellationRejectedStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason5#mmStructured
	 * RejectedStatusReason5.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus3Choice#mmReason
	 * RejectedStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus8Choice#mmReason
	 * RejectedStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#mmReason
	 * RejectedStatusReason9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason1Choice#mmReason
	 * RejectedStatusReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason1Choice#mmProprietary
	 * RejectedStatusReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status14Choice#mmRejected
	 * Status14Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason4Choice#mmCode
	 * RejectedReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason4Choice#mmProprietary
	 * RejectedReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmRejected
	 * TransferStatus1Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason16#mmReason
	 * RejectionReason16.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus9Choice#mmReason
	 * RejectedStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus11Choice#mmReason
	 * RejectedStatus11Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason23#mmReason
	 * RejectionReason23.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus13Choice#mmReason
	 * RejectedStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus16Choice#mmReason
	 * RejectedStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus19Choice#mmReason
	 * RejectedStatus19Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmRejected
	 * TransferStatus2Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason32#mmReason
	 * RejectionReason32.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason33#mmReason
	 * RejectionReason33.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason17Choice#mmCode
	 * RejectedReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason17Choice#mmProprietary
	 * RejectedReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status20Choice#mmRejected
	 * Status20Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason16Choice#mmCode
	 * RejectedReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason16Choice#mmProprietary
	 * RejectedReason16Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason31#mmReason
	 * RejectionReason31.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason15Choice#mmCode
	 * RejectedReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason15Choice#mmProprietary
	 * RejectedReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus21Choice#mmReason
	 * RejectedStatus21Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus22Choice#mmRejected
	 * CancellationStatus22Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status25Choice#mmRejected
	 * Status25Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus23Choice#mmReason
	 * RejectedStatus23Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus24Choice#mmReason
	 * RejectedStatus24Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, RejectedStatusReasonCode> mmRejectedStatusReason = new MMBusinessAttribute<StatusReason, RejectedStatusReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RejectedStatus5.mmReason, AccountManagementStatusAndReason1.mmRejected, RejectedReason3Choice.mmCode, RejectedReason3Choice.mmProprietary, Status12Choice.mmRejected,
					RejectedStatusReason4.mmStructured, RejectedStatus4.mmReason, OrderStatusAndReason4.mmRejected, RejectedStatus7.mmReason, OrderStatusAndReason8.mmRejected, RejectedStatusReason6.mmStructured, RejectedStatus3.mmReason,
					IndividualOrderStatusAndReason1.mmRejected, RejectedStatus6.mmReason, OrderStatusAndReason7.mmRejected, RejectionReason1.mmReason, RejectionReason3.mmReason, TransferCancellationRejectionReason1.mmStructured,
					TransferCancellationRejectedStatus1Choice.mmReason, TransferCancellationRejectedStatus1.mmReason, RejectedStatusReason5.mmStructured, RejectedStatus3Choice.mmReason, RejectedStatus8Choice.mmReason,
					RejectedStatusReason9Choice.mmReason, RejectedStatusReason1Choice.mmReason, RejectedStatusReason1Choice.mmProprietary, Status14Choice.mmRejected, RejectedReason4Choice.mmCode, RejectedReason4Choice.mmProprietary,
					TransferStatus1Choice.mmRejected, RejectionReason16.mmReason, RejectedStatus9Choice.mmReason, RejectedStatus11Choice.mmReason, RejectionReason23.mmReason, RejectedStatus13Choice.mmReason,
					RejectedStatus16Choice.mmReason, RejectedStatus19Choice.mmReason, TransferStatus2Choice.mmRejected, RejectionReason32.mmReason, RejectionReason33.mmReason, RejectedReason17Choice.mmCode,
					RejectedReason17Choice.mmProprietary, Status20Choice.mmRejected, RejectedReason16Choice.mmCode, RejectedReason16Choice.mmProprietary, RejectionReason31.mmReason, RejectedReason15Choice.mmCode,
					RejectedReason15Choice.mmProprietary, RejectedStatus21Choice.mmReason, CancellationStatus22Choice.mmRejected, Status25Choice.mmRejected, RejectedStatus23Choice.mmReason, RejectedStatus24Choice.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedStatusReason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReasonCode.mmObject();
		}

		@Override
		public RejectedStatusReasonCode getValue(StatusReason obj) {
			return obj.getRejectedStatusReason();
		}

		@Override
		public void setValue(StatusReason obj, RejectedStatusReasonCode value) {
			obj.setRejectedStatusReason(value);
		}
	};
	protected PendingFailingReasonCode failingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
	 * PendingFailingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice#mmCode
	 * FailingReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice#mmProprietary
	 * FailingReason1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason1#mmCode
	 * FailingReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus1Choice#mmReason
	 * FailingStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason3Choice#mmCode
	 * FailingReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason3Choice#mmProprietary
	 * FailingReason3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason3#mmCode
	 * FailingReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus3Choice#mmReason
	 * FailingStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason5Choice#mmCode
	 * FailingReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason5Choice#mmProprietary
	 * FailingReason5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason5#mmCode
	 * FailingReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus8Choice#mmReason
	 * FailingStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason2Choice#mmCode
	 * FailingReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason2Choice#mmProprietary
	 * FailingReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason2#mmCode
	 * FailingReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus2Choice#mmReason
	 * FailingStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmFailingReason
	 * Reason1Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmFailingReason
	 * Reason6Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmFailingReason
	 * Reason2Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmFailingReason
	 * Reason10Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmFailingReason
	 * Reason7Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmFailingReason
	 * Reason11Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason4Choice#mmCode
	 * FailingReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason4Choice#mmProprietary
	 * FailingReason4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason4#mmCode
	 * FailingReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus4Choice#mmReason
	 * FailingStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason6Choice#mmCode
	 * FailingReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason6Choice#mmProprietary
	 * FailingReason6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason6#mmCode
	 * FailingReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus5Choice#mmReason
	 * FailingStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmFailingReason
	 * Reason12Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmFailingReason
	 * Reason13Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmFailingReason
	 * Reason14Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmFailingReason
	 * Reason15Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason8Choice#mmCode
	 * FailingReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason8Choice#mmProprietary
	 * FailingReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice#mmCode
	 * FailingReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice#mmProprietary
	 * FailingReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason7#mmCode
	 * FailingReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason7Choice#mmCode
	 * FailingReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason7Choice#mmProprietary
	 * FailingReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus10Choice#mmReason
	 * FailingStatus10Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason8#mmCode
	 * FailingReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmFailingReason
	 * Reason16Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus9Choice#mmReason
	 * FailingStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmFailingReason
	 * Reason17Choice.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason15Choice#mmCode
	 * FailingReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason15Choice#mmProprietary
	 * FailingReason15Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason9#mmCode
	 * FailingReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason10Choice#mmCode
	 * FailingReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason10Choice#mmProprietary
	 * FailingReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason11Choice#mmCode
	 * FailingReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason11Choice#mmProprietary
	 * FailingReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus11Choice#mmReason
	 * FailingStatus11Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason10#mmCode
	 * FailingReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus12Choice#mmReason
	 * FailingStatus12Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why a transaction has a failing status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, PendingFailingReasonCode> mmFailingReason = new MMBusinessAttribute<StatusReason, PendingFailingReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FailingReason1Choice.mmCode, FailingReason1Choice.mmProprietary, FailingReason1.mmCode, FailingStatus1Choice.mmReason, FailingReason3Choice.mmCode, FailingReason3Choice.mmProprietary,
					FailingReason3.mmCode, FailingStatus3Choice.mmReason, FailingReason5Choice.mmCode, FailingReason5Choice.mmProprietary, FailingReason5.mmCode, FailingStatus8Choice.mmReason, FailingReason2Choice.mmCode,
					FailingReason2Choice.mmProprietary, FailingReason2.mmCode, FailingStatus2Choice.mmReason, Reason1Choice.mmFailingReason, Reason6Choice.mmFailingReason, Reason2Choice.mmFailingReason, Reason10Choice.mmFailingReason,
					Reason7Choice.mmFailingReason, Reason11Choice.mmFailingReason, FailingReason4Choice.mmCode, FailingReason4Choice.mmProprietary, FailingReason4.mmCode, FailingStatus4Choice.mmReason, FailingReason6Choice.mmCode,
					FailingReason6Choice.mmProprietary, FailingReason6.mmCode, FailingStatus5Choice.mmReason, Reason12Choice.mmFailingReason, Reason13Choice.mmFailingReason, Reason14Choice.mmFailingReason, Reason15Choice.mmFailingReason,
					FailingReason8Choice.mmCode, FailingReason8Choice.mmProprietary, FailingReason9Choice.mmCode, FailingReason9Choice.mmProprietary, FailingReason7.mmCode, FailingReason7Choice.mmCode, FailingReason7Choice.mmProprietary,
					FailingStatus10Choice.mmReason, FailingReason8.mmCode, Reason16Choice.mmFailingReason, FailingStatus9Choice.mmReason, Reason17Choice.mmFailingReason, FailingReason15Choice.mmCode, FailingReason15Choice.mmProprietary,
					FailingReason9.mmCode, FailingReason10Choice.mmCode, FailingReason10Choice.mmProprietary, FailingReason11Choice.mmCode, FailingReason11Choice.mmProprietary, FailingStatus11Choice.mmReason, FailingReason10.mmCode,
					FailingStatus12Choice.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailingReason";
			definition = "Reason why a transaction has a failing status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}

		@Override
		public PendingFailingReasonCode getValue(StatusReason obj) {
			return obj.getFailingReason();
		}

		@Override
		public void setValue(StatusReason obj, PendingFailingReasonCode value) {
			obj.setFailingReason(value);
		}
	};
	protected CancelledStatusReasonV2Code cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#mmCancelledStatusReason
	 * PaymentStatusReasonCode4Choice.mmCancelledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmCancelled
	 * PaymentStatusReasonCode5Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason5Choice#mmCode
	 * CancellationReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason5Choice#mmProprietary
	 * CancellationReason5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason1#mmCode
	 * CancellationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmCancelled
	 * ProcessingStatus1Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason12Choice#mmCode
	 * CancellationReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason12Choice#mmProprietary
	 * CancellationReason12Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason5#mmCode
	 * CancellationReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus7Choice#mmReason
	 * CancellationStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmCancelled
	 * ProcessingStatus19Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason3Choice#mmCode
	 * CancellationReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason3Choice#mmProprietary
	 * CancellationReason3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason2#mmCode
	 * CancellationReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmCancelled
	 * ProcessingStatus2Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmCancelled
	 * ProcessingStatus13Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmCancelled
	 * ProcessingStatus20Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason13Choice#mmCode
	 * CancellationReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason13Choice#mmProprietary
	 * CancellationReason13Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason6#mmCode
	 * CancellationReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus11Choice#mmReason
	 * CancellationStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmCancelled
	 * ProcessingStatus25Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason7Choice#mmCode
	 * CancellationReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason7Choice#mmProprietary
	 * CancellationReason7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason3#mmCode
	 * CancellationReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmCancelled
	 * ProcessingStatus26Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#mmCancellationReasonCode
	 * CorporateActionCancellation1.mmCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#mmCancellationReason
	 * CorporateActionCancellation1.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2#mmCancellationReasonCode
	 * CorporateActionCancellation2.mmCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2#mmCancellationReason
	 * CorporateActionCancellation2.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason1Choice#mmCode
	 * CancelledReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason1Choice#mmProprietary
	 * CancelledReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason4#mmReasonCode
	 * CancelledStatusReason4.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus1Choice#mmReason
	 * CancelledStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason2Choice#mmCode
	 * CancelledReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason2Choice#mmProprietary
	 * CancelledReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason5#mmReasonCode
	 * CancelledStatusReason5.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus2Choice#mmReason
	 * CancelledStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason3Choice#mmCode
	 * CancelledReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason3Choice#mmProprietary
	 * CancelledReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason6#mmReasonCode
	 * CancelledStatusReason6.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus3Choice#mmReason
	 * CancelledStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus3Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason4Choice#mmCode
	 * CancelledReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason4Choice#mmProprietary
	 * CancelledReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason7#mmReasonCode
	 * CancelledStatusReason7.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus4Choice#mmReason
	 * CancelledStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus4Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus5Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus6Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmCancelled
	 * InstructionProcessingStatus1Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmCancelled
	 * InstructionProcessingStatus4Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmCancelled
	 * InstructionProcessingStatus7Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmCancelled
	 * InstructionProcessingStatus8Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmCancelled
	 * InstructionProcessingStatus12Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmCancelled
	 * InstructionProcessingStatus13Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason8Choice#mmCode
	 * CancellationReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason8Choice#mmProprietary
	 * CancellationReason8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason4#mmCode
	 * CancellationReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmCancelled
	 * ProcessingStatus7Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmCancellationRequested
	 * InstructionProcessingStatus3Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmCancelled
	 * InstructionProcessingStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmCancellationRequested
	 * InstructionProcessingStatus6Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmCancelled
	 * InstructionProcessingStatus6Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmCancellationRequested
	 * InstructionProcessingStatus10Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmCancelled
	 * InstructionProcessingStatus10Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmCancellationRequested
	 * InstructionProcessingStatus11Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmCancelled
	 * InstructionProcessingStatus11Choice.mmCancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus1#mmReason
	 * CancelledStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmCancelled
	 * OrderStatusAndReason3.mmCancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus2#mmReason
	 * CancelledStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmCancelled
	 * OrderStatusAndReason7.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationCompleteReason1#mmStructured
	 * TransferCancellationCompleteReason1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationCompleteStatusAndReason1#mmReason
	 * TransferCancellationCompleteStatusAndReason1.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus3#mmReason
	 * CancelledStatus3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#mmCancelled
	 * IntraPositionProcessingStatus1Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmCancelled
	 * ProcessingStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason4Choice#mmCode
	 * CancellationReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason4Choice#mmProprietary
	 * CancellationReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmCancellationReason
	 * Reason1Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason9Choice#mmCode
	 * CancellationReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason9Choice#mmProprietary
	 * CancellationReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmCancellationReason
	 * Reason6Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmCancelled
	 * ProcessingStatus10Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmCancelled
	 * ProcessingStatus21Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmCancelled
	 * ProcessingStatus27Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason6Choice#mmCode
	 * CancellationReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason6Choice#mmProprietary
	 * CancellationReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmCancellationReason
	 * Reason2Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason10Choice#mmCode
	 * CancellationReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason10Choice#mmProprietary
	 * CancellationReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmCancellationReason
	 * Reason10Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmCancellationReason
	 * Reason7Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmCancellationReason
	 * Reason11Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmCancelled
	 * ProcessingStatus9Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmCancelled
	 * ProcessingStatus16Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#mmCancelled
	 * IntraPositionProcessingStatus2Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmCancelled
	 * IntraPositionProcessingStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#mmCancelled
	 * IntraPositionProcessingStatus4Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice#mmReason
	 * CancelledStatusReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice#mmProprietary
	 * CancelledStatusReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#mmCancelled
	 * OrderStatus1Choice.mmCancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus4#mmReason
	 * CancelledStatus4.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#mmCancelled
	 * ProcessingStatus34Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmCancelled
	 * ProcessingStatus32Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#mmCancelled
	 * ProcessingStatus35Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmCancelled
	 * PaymentStatusReasonCode6Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancelled
	 * TransferStatus1Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmCancellationReason
	 * Reason12Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmCancellationRequested
	 * InstructionProcessingStatus14Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmCancelled
	 * InstructionProcessingStatus14Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmCancelled
	 * InstructionProcessingStatus15Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmCancelled
	 * ProcessingStatus38Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmCancelled
	 * ProcessingStatus37Choice.mmCancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason7#mmCode
	 * CancellationReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason7#mmAdditionalReasonInformation
	 * CancellationReason7.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason17Choice#mmCode
	 * CancellationReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason17Choice#mmProprietary
	 * CancellationReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus5Choice#mmReason
	 * CancelledStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice#mmCancelled
	 * ProcessingStatus39Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmCancelled
	 * InstructionProcessingStatus16Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmCancelled
	 * ProcessingStatus40Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmCancelled
	 * ProcessingStatus42Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmCancellationRequested
	 * InstructionProcessingStatus17Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmCancelled
	 * InstructionProcessingStatus17Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus41Choice#mmCancelled
	 * ProcessingStatus41Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason18Choice#mmCode
	 * CancellationReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason18Choice#mmProprietary
	 * CancellationReason18Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason8#mmCode
	 * CancellationReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason8#mmAdditionalReasonInformation
	 * CancellationReason8.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmCancellationReason
	 * Reason13Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus6Choice#mmReason
	 * CancelledStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmCancelled
	 * InstructionProcessingStatus20Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus7Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus7Choice#mmReason
	 * CancelledStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason8#mmReasonCode
	 * CancelledStatusReason8.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason5Choice#mmCode
	 * CancelledReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason5Choice#mmProprietary
	 * CancelledReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmCancelled
	 * ProcessingStatus45Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmCancellationReason
	 * Reason14Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmCancelled
	 * InstructionProcessingStatus21Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus8Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus8Choice#mmReason
	 * CancelledStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason9#mmReasonCode
	 * CancelledStatusReason9.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus9Choice#mmReason
	 * CancelledStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason10#mmReasonCode
	 * CancelledStatusReason10.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason6Choice#mmCode
	 * CancelledReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason6Choice#mmProprietary
	 * CancelledReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason7Choice#mmCode
	 * CancelledReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason7Choice#mmProprietary
	 * CancelledReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmCancelled
	 * ProcessingStatus47Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmCancellationReason
	 * Reason15Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmCancelled
	 * IntraPositionProcessingStatus5Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmCancelled
	 * ProcessingStatus48Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmCancelled
	 * ProcessingStatus54Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmCancelled
	 * ProcessingStatus51Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason10#mmCode
	 * CancellationReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason21Choice#mmCode
	 * CancellationReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason21Choice#mmProprietary
	 * CancellationReason21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason12#mmCode
	 * CancellationReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason23Choice#mmCode
	 * CancellationReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason23Choice#mmProprietary
	 * CancellationReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus56Choice#mmCancelled
	 * ProcessingStatus56Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus10Choice#mmReason
	 * CancelledStatus10Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason19Choice#mmCode
	 * CancellationReason19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason19Choice#mmProprietary
	 * CancellationReason19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmCancelled
	 * ProcessingStatus49Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice#mmReason
	 * CancellationStatus14Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason9#mmCode
	 * CancellationReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancellationRequested
	 * InstructionProcessingStatus22Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancelled
	 * InstructionProcessingStatus22Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmCancelled
	 * ProcessingStatus53Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason22Choice#mmCode
	 * CancellationReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason22Choice#mmProprietary
	 * CancellationReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason11#mmCode
	 * CancellationReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason11#mmAdditionalReasonInformation
	 * CancellationReason11.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmCancellationReason
	 * Reason16Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice#mmCode
	 * CancellationReason20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice#mmProprietary
	 * CancellationReason20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus9Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmCancelled
	 * InstructionProcessingStatus24Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12#mmReasonCode
	 * CancelledStatusReason12.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason9Choice#mmCode
	 * CancelledReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason9Choice#mmProprietary
	 * CancelledReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus12Choice#mmReason
	 * CancelledStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus11Choice#mmReason
	 * CancelledStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason8Choice#mmCode
	 * CancelledReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason8Choice#mmProprietary
	 * CancelledReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11#mmReasonCode
	 * CancelledStatusReason11.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancelled
	 * TransferStatus2Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#mmReason
	 * CancelledStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledCompleteReason1#mmReason
	 * CancelledCompleteReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason13#mmCode
	 * CancellationReason13.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus10Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmCancelled
	 * InstructionProcessingStatus25Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus14Choice#mmReason
	 * CancelledStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason14#mmReasonCode
	 * CancelledStatusReason14.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason11Choice#mmCode
	 * CancelledReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason11Choice#mmProprietary
	 * CancelledReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus15Choice#mmReason
	 * CancelledStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason13#mmReasonCode
	 * CancelledStatusReason13.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason10Choice#mmCode
	 * CancelledReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason10Choice#mmProprietary
	 * CancelledReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmCancelled
	 * ProcessingStatus57Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmCancelled
	 * ProcessingStatus65Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#mmCancelled
	 * IntraPositionProcessingStatus6Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmCancelled
	 * ProcessingStatus63Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason15#mmCode
	 * CancellationReason15.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason14#mmCode
	 * CancellationReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason24Choice#mmCode
	 * CancellationReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason24Choice#mmProprietary
	 * CancellationReason24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmCancellationReason
	 * Reason17Choice.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason30Choice#mmCode
	 * CancellationReason30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason30Choice#mmProprietary
	 * CancellationReason30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason18#mmCode
	 * CancellationReason18.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus59Choice#mmCancelled
	 * ProcessingStatus59Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus16Choice#mmReason
	 * CancelledStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason28Choice#mmCode
	 * CancellationReason28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason28Choice#mmProprietary
	 * CancellationReason28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason16#mmCode
	 * CancellationReason16.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason16#mmAdditionalReasonInformation
	 * CancellationReason16.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason26Choice#mmCode
	 * CancellationReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason26Choice#mmProprietary
	 * CancellationReason26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmCancellationRequested
	 * InstructionProcessingStatus27Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmCancelled
	 * InstructionProcessingStatus27Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmCancelled
	 * ProcessingStatus61Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason25Choice#mmCode
	 * CancellationReason25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason25Choice#mmProprietary
	 * CancellationReason25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmCancelled
	 * ProcessingStatus60Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus17Choice#mmReason
	 * CancellationStatus17Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason19#mmCode
	 * CancellationReason19.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus69Choice#mmCancelled
	 * ProcessingStatus69Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus67Choice#mmCancelled
	 * ProcessingStatus67Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus66Choice#mmCancelled
	 * ProcessingStatus66Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason31Choice#mmCode
	 * CancellationReason31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason31Choice#mmProprietary
	 * CancellationReason31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16#mmReason
	 * CancelledStatusReason16.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#mmCode
	 * CancelledReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#mmProprietary
	 * CancelledReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason32Choice#mmCode
	 * CancellationReason32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason32Choice#mmProprietary
	 * CancellationReason32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus11Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmCancelled
	 * InstructionProcessingStatus29Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus12Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmCancelled
	 * InstructionProcessingStatus30Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference11#mmCancellationReason
	 * TransferReference11.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference13#mmCancellationReason
	 * TransferReference13.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode7Choice#mmCancelled
	 * PaymentStatusReasonCode7Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, CancelledStatusReasonV2Code> mmCancellationReason = new MMBusinessAttribute<StatusReason, CancelledStatusReasonV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusReasonCode4Choice.mmCancelledStatusReason, PaymentStatusReasonCode5Choice.mmCancelled, CancellationReason5Choice.mmCode, CancellationReason5Choice.mmProprietary,
					CancellationReason1.mmCode, ProcessingStatus1Choice.mmCancelled, CancellationReason12Choice.mmCode, CancellationReason12Choice.mmProprietary, CancellationReason5.mmCode, CancellationStatus7Choice.mmReason,
					ProcessingStatus19Choice.mmCancelled, CancellationReason3Choice.mmCode, CancellationReason3Choice.mmProprietary, CancellationReason2.mmCode, ProcessingStatus2Choice.mmCancelled, ProcessingStatus13Choice.mmCancelled,
					ProcessingStatus20Choice.mmCancelled, CancellationReason13Choice.mmCode, CancellationReason13Choice.mmProprietary, CancellationReason6.mmCode, CancellationStatus11Choice.mmReason, ProcessingStatus25Choice.mmCancelled,
					CancellationReason7Choice.mmCode, CancellationReason7Choice.mmProprietary, CancellationReason3.mmCode, ProcessingStatus26Choice.mmCancelled, CorporateActionCancellation1.mmCancellationReasonCode,
					CorporateActionCancellation1.mmCancellationReason, CorporateActionCancellation2.mmCancellationReasonCode, CorporateActionCancellation2.mmCancellationReason, CancelledReason1Choice.mmCode,
					CancelledReason1Choice.mmProprietary, CancelledStatusReason4.mmReasonCode, CancelledStatus1Choice.mmReason, CancelledReason2Choice.mmCode, CancelledReason2Choice.mmProprietary, CancelledStatusReason5.mmReasonCode,
					CancelledStatus2Choice.mmReason, CancelledReason3Choice.mmCode, CancelledReason3Choice.mmProprietary, CancelledStatusReason6.mmReasonCode, CancelledStatus3Choice.mmReason,
					InstructionCancellationRequestStatus3Choice.mmCancellationCompleted, CancelledReason4Choice.mmCode, CancelledReason4Choice.mmProprietary, CancelledStatusReason7.mmReasonCode, CancelledStatus4Choice.mmReason,
					InstructionCancellationRequestStatus4Choice.mmCancellationCompleted, InstructionCancellationRequestStatus5Choice.mmCancellationCompleted, InstructionCancellationRequestStatus6Choice.mmCancellationCompleted,
					InstructionProcessingStatus1Choice.mmCancelled, InstructionProcessingStatus4Choice.mmCancelled, InstructionProcessingStatus7Choice.mmCancelled, InstructionProcessingStatus8Choice.mmCancelled,
					InstructionProcessingStatus12Choice.mmCancelled, InstructionProcessingStatus13Choice.mmCancelled, CancellationReason8Choice.mmCode, CancellationReason8Choice.mmProprietary, CancellationReason4.mmCode,
					ProcessingStatus7Choice.mmCancelled, InstructionProcessingStatus3Choice.mmCancellationRequested, InstructionProcessingStatus3Choice.mmCancelled, InstructionProcessingStatus6Choice.mmCancellationRequested,
					InstructionProcessingStatus6Choice.mmCancelled, InstructionProcessingStatus10Choice.mmCancellationRequested, InstructionProcessingStatus10Choice.mmCancelled, InstructionProcessingStatus11Choice.mmCancellationRequested,
					InstructionProcessingStatus11Choice.mmCancelled, CancelledStatus1.mmReason, OrderStatusAndReason3.mmCancelled, CancelledStatus2.mmReason, OrderStatusAndReason7.mmCancelled,
					TransferCancellationCompleteReason1.mmStructured, TransferCancellationCompleteStatusAndReason1.mmReason, CancelledStatus3.mmReason, IntraPositionProcessingStatus1Choice.mmCancelled, ProcessingStatus3Choice.mmCancelled,
					CancellationReason4Choice.mmCode, CancellationReason4Choice.mmProprietary, Reason1Choice.mmCancellationReason, CancellationReason9Choice.mmCode, CancellationReason9Choice.mmProprietary,
					Reason6Choice.mmCancellationReason, ProcessingStatus10Choice.mmCancelled, ProcessingStatus21Choice.mmCancelled, ProcessingStatus27Choice.mmCancelled, CancellationReason6Choice.mmCode,
					CancellationReason6Choice.mmProprietary, Reason2Choice.mmCancellationReason, CancellationReason10Choice.mmCode, CancellationReason10Choice.mmProprietary, Reason10Choice.mmCancellationReason,
					Reason7Choice.mmCancellationReason, Reason11Choice.mmCancellationReason, ProcessingStatus9Choice.mmCancelled, ProcessingStatus16Choice.mmCancelled, IntraPositionProcessingStatus2Choice.mmCancelled,
					IntraPositionProcessingStatus3Choice.mmCancelled, IntraPositionProcessingStatus4Choice.mmCancelled, CancelledStatusReason1Choice.mmReason, CancelledStatusReason1Choice.mmProprietary, OrderStatus1Choice.mmCancelled,
					CancelledStatus4.mmReason, ProcessingStatus34Choice.mmCancelled, ProcessingStatus32Choice.mmCancelled, ProcessingStatus35Choice.mmCancelled, PaymentStatusReasonCode6Choice.mmCancelled, TransferStatus1Choice.mmCancelled,
					Reason12Choice.mmCancellationReason, InstructionProcessingStatus14Choice.mmCancellationRequested, InstructionProcessingStatus14Choice.mmCancelled, InstructionProcessingStatus15Choice.mmCancelled,
					ProcessingStatus38Choice.mmCancelled, ProcessingStatus37Choice.mmCancelled, CancellationReason7.mmCode, CancellationReason7.mmAdditionalReasonInformation, CancellationReason17Choice.mmCode,
					CancellationReason17Choice.mmProprietary, CancelledStatus5Choice.mmReason, ProcessingStatus39Choice.mmCancelled, InstructionProcessingStatus16Choice.mmCancelled, ProcessingStatus40Choice.mmCancelled,
					ProcessingStatus42Choice.mmCancelled, InstructionProcessingStatus17Choice.mmCancellationRequested, InstructionProcessingStatus17Choice.mmCancelled, ProcessingStatus41Choice.mmCancelled,
					CancellationReason18Choice.mmCode, CancellationReason18Choice.mmProprietary, CancellationReason8.mmCode, CancellationReason8.mmAdditionalReasonInformation, Reason13Choice.mmCancellationReason,
					CancelledStatus6Choice.mmReason, InstructionProcessingStatus20Choice.mmCancelled, InstructionCancellationRequestStatus7Choice.mmCancellationCompleted, CancelledStatus7Choice.mmReason,
					CancelledStatusReason8.mmReasonCode, CancelledReason5Choice.mmCode, CancelledReason5Choice.mmProprietary, ProcessingStatus45Choice.mmCancelled, Reason14Choice.mmCancellationReason,
					InstructionProcessingStatus21Choice.mmCancelled, InstructionCancellationRequestStatus8Choice.mmCancellationCompleted, CancelledStatus8Choice.mmReason, CancelledStatusReason9.mmReasonCode,
					CancelledStatus9Choice.mmReason, CancelledStatusReason10.mmReasonCode, CancelledReason6Choice.mmCode, CancelledReason6Choice.mmProprietary, CancelledReason7Choice.mmCode, CancelledReason7Choice.mmProprietary,
					ProcessingStatus47Choice.mmCancelled, Reason15Choice.mmCancellationReason, IntraPositionProcessingStatus5Choice.mmCancelled, ProcessingStatus48Choice.mmCancelled, ProcessingStatus54Choice.mmCancelled,
					ProcessingStatus51Choice.mmCancelled, CancellationReason10.mmCode, CancellationReason21Choice.mmCode, CancellationReason21Choice.mmProprietary, CancellationReason12.mmCode, CancellationReason23Choice.mmCode,
					CancellationReason23Choice.mmProprietary, ProcessingStatus56Choice.mmCancelled, CancelledStatus10Choice.mmReason, CancellationReason19Choice.mmCode, CancellationReason19Choice.mmProprietary,
					ProcessingStatus49Choice.mmCancelled, CancellationStatus14Choice.mmReason, CancellationReason9.mmCode, InstructionProcessingStatus22Choice.mmCancellationRequested, InstructionProcessingStatus22Choice.mmCancelled,
					ProcessingStatus53Choice.mmCancelled, CancellationReason22Choice.mmCode, CancellationReason22Choice.mmProprietary, CancellationReason11.mmCode, CancellationReason11.mmAdditionalReasonInformation,
					Reason16Choice.mmCancellationReason, CancellationReason20Choice.mmCode, CancellationReason20Choice.mmProprietary, InstructionCancellationRequestStatus9Choice.mmCancellationCompleted,
					InstructionProcessingStatus24Choice.mmCancelled, CancelledStatusReason12.mmReasonCode, CancelledReason9Choice.mmCode, CancelledReason9Choice.mmProprietary, CancelledStatus12Choice.mmReason,
					CancelledStatus11Choice.mmReason, CancelledReason8Choice.mmCode, CancelledReason8Choice.mmProprietary, CancelledStatusReason11.mmReasonCode, TransferStatus2Choice.mmCancelled, CancelledStatus13Choice.mmReason,
					CancelledCompleteReason1.mmReason, CancellationReason13.mmCode, InstructionCancellationRequestStatus10Choice.mmCancellationCompleted, InstructionProcessingStatus25Choice.mmCancelled, CancelledStatus14Choice.mmReason,
					CancelledStatusReason14.mmReasonCode, CancelledReason11Choice.mmCode, CancelledReason11Choice.mmProprietary, CancelledStatus15Choice.mmReason, CancelledStatusReason13.mmReasonCode, CancelledReason10Choice.mmCode,
					CancelledReason10Choice.mmProprietary, ProcessingStatus57Choice.mmCancelled, ProcessingStatus65Choice.mmCancelled, IntraPositionProcessingStatus6Choice.mmCancelled, ProcessingStatus63Choice.mmCancelled,
					CancellationReason15.mmCode, CancellationReason14.mmCode, CancellationReason24Choice.mmCode, CancellationReason24Choice.mmProprietary, Reason17Choice.mmCancellationReason, CancellationReason30Choice.mmCode,
					CancellationReason30Choice.mmProprietary, CancellationReason18.mmCode, ProcessingStatus59Choice.mmCancelled, CancelledStatus16Choice.mmReason, CancellationReason28Choice.mmCode, CancellationReason28Choice.mmProprietary,
					CancellationReason16.mmCode, CancellationReason16.mmAdditionalReasonInformation, CancellationReason26Choice.mmCode, CancellationReason26Choice.mmProprietary, InstructionProcessingStatus27Choice.mmCancellationRequested,
					InstructionProcessingStatus27Choice.mmCancelled, ProcessingStatus61Choice.mmCancelled, CancellationReason25Choice.mmCode, CancellationReason25Choice.mmProprietary, ProcessingStatus60Choice.mmCancelled,
					CancellationStatus17Choice.mmReason, CancellationReason19.mmCode, ProcessingStatus69Choice.mmCancelled, ProcessingStatus67Choice.mmCancelled, ProcessingStatus66Choice.mmCancelled, CancellationReason31Choice.mmCode,
					CancellationReason31Choice.mmProprietary, CancelledStatusReason16.mmReason, CancelledReason12Choice.mmCode, CancelledReason12Choice.mmProprietary, CancellationReason32Choice.mmCode,
					CancellationReason32Choice.mmProprietary, InstructionCancellationRequestStatus11Choice.mmCancellationCompleted, InstructionProcessingStatus29Choice.mmCancelled,
					InstructionCancellationRequestStatus12Choice.mmCancellationCompleted, InstructionProcessingStatus30Choice.mmCancelled, TransferReference11.mmCancellationReason, TransferReference13.mmCancellationReason,
					PaymentStatusReasonCode7Choice.mmCancelled);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReasonV2Code.mmObject();
		}

		@Override
		public CancelledStatusReasonV2Code getValue(StatusReason obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(StatusReason obj, CancelledStatusReasonV2Code value) {
			obj.setCancellationReason(value);
		}
	};
	protected PendingFailingReasonCode pendingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
	 * PendingFailingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice#mmCode
	 * PendingProcessingReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice#mmProprietary
	 * PendingProcessingReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason1#mmCode
	 * PendingProcessingReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus1Choice#mmReason
	 * PendingProcessingStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice#mmCode
	 * PendingReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice#mmProprietary
	 * PendingReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason2#mmCode
	 * PendingReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus4Choice#mmReason
	 * PendingStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmPendingProcessing
	 * ProcessingStatus1Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmPendingCancellation
	 * ProcessingStatus1Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason3Choice#mmCode
	 * PendingProcessingReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason3Choice#mmProprietary
	 * PendingProcessingReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason3#mmCode
	 * PendingProcessingReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus3Choice#mmReason
	 * PendingProcessingStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus13Choice#mmReason
	 * PendingStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmPendingProcessing
	 * ProcessingStatus19Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmPendingCancellation
	 * ProcessingStatus19Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason1Choice#mmCode
	 * PendingReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason1Choice#mmProprietary
	 * PendingReason1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason1#mmCode
	 * PendingReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason13Choice#mmCode
	 * PendingReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason13Choice#mmProprietary
	 * PendingReason13Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason5#mmCode
	 * PendingReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus9Choice#mmReason
	 * PendingStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason5Choice#mmCode
	 * PendingProcessingReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason5Choice#mmProprietary
	 * PendingProcessingReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason5#mmCode
	 * PendingProcessingReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus7Choice#mmReason
	 * PendingProcessingStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmPendingProcessing
	 * ModificationProcessingStatus2Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmPendingCancellation
	 * ProcessingStatus2Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmPendingCancellation
	 * ProcessingStatus13Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason15Choice#mmCode
	 * PendingReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason15Choice#mmProprietary
	 * PendingReason15Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason7#mmCode
	 * PendingReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus11Choice#mmReason
	 * PendingStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmPendingCancellation
	 * ProcessingStatus20Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason7Choice#mmCode
	 * PendingProcessingReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason7Choice#mmProprietary
	 * PendingProcessingReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason7#mmCode
	 * PendingProcessingReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus9Choice#mmReason
	 * PendingProcessingStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason9Choice#mmCode
	 * PendingReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason9Choice#mmProprietary
	 * PendingReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason3#mmCode
	 * PendingReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus24Choice#mmReason
	 * PendingStatus24Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmPendingProcessing
	 * ProcessingStatus25Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmPendingCancellation
	 * ProcessingStatus25Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason18Choice#mmCode
	 * PendingReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason18Choice#mmProprietary
	 * PendingReason18Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason10#mmCode
	 * PendingReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus31Choice#mmReason
	 * PendingStatus31Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason6Choice#mmCode
	 * PendingProcessingReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason6Choice#mmProprietary
	 * PendingProcessingReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason6#mmCode
	 * PendingProcessingReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus8Choice#mmReason
	 * PendingProcessingStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmPendingProcessing
	 * ModificationProcessingStatus3Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason20Choice#mmCode
	 * PendingReason20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason20Choice#mmProprietary
	 * PendingReason20Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason12#mmCode
	 * PendingReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus22Choice#mmReason
	 * PendingStatus22Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmPendingCancellation
	 * ProcessingStatus26Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason4Choice#mmCode
	 * PendingReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason4Choice#mmProprietary
	 * PendingReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason2#mmReasonCode
	 * PendingStatusReason2.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice#mmPending
	 * EventProcessingStatus1Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason5Choice#mmCode
	 * PendingReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason5Choice#mmProprietary
	 * PendingReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason3#mmReasonCode
	 * PendingStatusReason3.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice#mmPending
	 * EventProcessingStatus2Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1#mmReasonCode
	 * PendingCancellationStatusReason1.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus1Choice#mmReason
	 * PendingCancellationStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus1Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason2#mmReasonCode
	 * PendingCancellationStatusReason2.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus2Choice#mmReason
	 * PendingCancellationStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus2Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus3Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus4Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3#mmReasonCode
	 * PendingCancellationStatusReason3.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus3Choice#mmReason
	 * PendingCancellationStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus5Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4#mmReasonCode
	 * PendingCancellationStatusReason4.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus4Choice#mmReason
	 * PendingCancellationStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus6Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason6Choice#mmCode
	 * PendingReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason6Choice#mmProprietary
	 * PendingReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason1#mmReasonCode
	 * PendingStatusReason1.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus1Choice#mmReason
	 * PendingStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmPending
	 * InstructionProcessingStatus1Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason7Choice#mmCode
	 * PendingReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason7Choice#mmProprietary
	 * PendingReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason4#mmReasonCode
	 * PendingStatusReason4.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus6Choice#mmReason
	 * PendingStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmPending
	 * InstructionProcessingStatus4Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmPending
	 * InstructionProcessingStatus7Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmPending
	 * InstructionProcessingStatus8Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmPending
	 * InstructionProcessingStatus12Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmPending
	 * InstructionProcessingStatus13Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#mmPending
	 * ProcessingStatus5Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus7Choice#mmReason
	 * PendingStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#mmPending
	 * ProcessingStatus11Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#mmPending
	 * ProcessingStatus14Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#mmPending
	 * ProcessingStatus15Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#mmPending
	 * ProcessingStatus18Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#mmPending
	 * ProcessingStatus24Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#mmPendingProcessing
	 * ProcessingStatus6Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#mmPendingCancellation
	 * ProcessingStatus6Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason2Choice#mmCode
	 * PendingProcessingReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason2Choice#mmProprietary
	 * PendingProcessingReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason2#mmCode
	 * PendingProcessingReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus2Choice#mmReason
	 * PendingProcessingStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#mmPendingProcessing
	 * ProcessingStatus12Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#mmPendingCancellation
	 * ProcessingStatus12Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason10Choice#mmCode
	 * PendingReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason10Choice#mmProprietary
	 * PendingReason10Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason4#mmCode
	 * PendingReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#mmPendingProcessing
	 * ProcessingStatus23Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#mmPendingCancellation
	 * ProcessingStatus23Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#mmPendingProcessing
	 * ProcessingStatus29Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#mmPendingCancellation
	 * ProcessingStatus29Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmPendingProcessing
	 * ProcessingStatus7Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmPendingCancellation
	 * ProcessingStatus7Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmPendingProcessing
	 * InstructionProcessingStatus3Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmPendingCancellation
	 * InstructionProcessingStatus3Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmPendingProcessing
	 * InstructionProcessingStatus6Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmPendingCancellation
	 * InstructionProcessingStatus6Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmPendingProcessing
	 * InstructionProcessingStatus10Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmPendingCancellation
	 * InstructionProcessingStatus10Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmPendingProcessing
	 * InstructionProcessingStatus11Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmPendingCancellation
	 * InstructionProcessingStatus11Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmPendingProcessing
	 * ProcessingStatus17Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancellationPending
	 * TransferStatusAndReason2.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmPendingCancellation
	 * ProcessingStatus3Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmPendingProcessing
	 * ProcessingStatus3Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice#mmCode
	 * PendingCancellationReasons2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice#mmProprietary
	 * PendingCancellationReasons2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason3Choice#mmCode
	 * PendingReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason3Choice#mmProprietary
	 * PendingReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingCancellationReason
	 * Reason1Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingReason
	 * Reason1Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingProcessingReason
	 * Reason1Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingModificationReason
	 * Reason1Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason11Choice#mmCode
	 * PendingReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason11Choice#mmProprietary
	 * PendingReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmPendingCancellationReason
	 * Reason6Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmPendingReason
	 * Reason6Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmPendingProcessingReason
	 * Reason6Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmPendingModificationReason
	 * Reason6Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmPendingCancellation
	 * ProcessingStatus10Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmPendingProcessing
	 * ProcessingStatus10Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus4Choice#mmReason
	 * PendingProcessingStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmPendingCancellation
	 * ProcessingStatus21Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmPendingProcessing
	 * ProcessingStatus21Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus15Choice#mmReason
	 * PendingStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus10Choice#mmReason
	 * PendingProcessingStatus10Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmPendingCancellation
	 * ProcessingStatus27Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmPendingProcessing
	 * ProcessingStatus27Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus26Choice#mmReason
	 * PendingStatus26Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons3Choice#mmCode
	 * PendingCancellationReasons3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons3Choice#mmProprietary
	 * PendingCancellationReasons3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason8Choice#mmCode
	 * PendingReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason8Choice#mmProprietary
	 * PendingReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmPendingCancellationReason
	 * Reason2Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmPendingReason
	 * Reason2Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmPendingProcessingReason
	 * Reason2Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmPendingModificationReason
	 * Reason2Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason12Choice#mmCode
	 * PendingReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason12Choice#mmProprietary
	 * PendingReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmPendingCancellationReason
	 * Reason10Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmPendingReason
	 * Reason10Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmPendingProcessingReason
	 * Reason10Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmPendingModificationReason
	 * Reason10Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingCancellationReason
	 * Reason7Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingReason
	 * Reason7Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingProcessingReason
	 * Reason7Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingModificationReason
	 * Reason7Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmPendingCancellationReason
	 * Reason11Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmPendingReason
	 * Reason11Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmPendingProcessingReason
	 * Reason11Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmPendingModificationReason
	 * Reason11Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmPendingCancellation
	 * ProcessingStatus9Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmPendingCancellation
	 * ProcessingStatus16Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason16Choice#mmCode
	 * PendingReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason16Choice#mmProprietary
	 * PendingReason16Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason8#mmCode
	 * PendingReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus12Choice#mmReason
	 * PendingStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason21Choice#mmCode
	 * PendingReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason21Choice#mmProprietary
	 * PendingReason21Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason13#mmCode
	 * PendingReason13.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus23Choice#mmReason
	 * PendingStatus23Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmPendingCancellation
	 * ProcessingStatus32Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmPendingProcessing
	 * ProcessingStatus36Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmPending
	 * ProcessingStatus31Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingCancellationReason
	 * Reason12Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingReason
	 * Reason12Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingProcessingReason
	 * Reason12Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingModificationReason
	 * Reason12Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmPendingProcessing
	 * InstructionProcessingStatus14Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmPendingCancellation
	 * InstructionProcessingStatus14Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason22Choice#mmCode
	 * PendingReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason22Choice#mmProprietary
	 * PendingReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus32Choice#mmReason
	 * PendingStatus32Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason5#mmReasonCode
	 * PendingStatusReason5.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmPending
	 * InstructionProcessingStatus15Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmPendingCancellation
	 * ProcessingStatus38Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmPendingProcessing
	 * ProcessingStatus38Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmPendingProcessing
	 * ProcessingStatus37Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmPendingCancellation
	 * ProcessingStatus37Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmPending
	 * InstructionProcessingStatus16Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason6#mmReasonCode
	 * PendingStatusReason6.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason23Choice#mmCode
	 * PendingReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason23Choice#mmProprietary
	 * PendingReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus33Choice#mmReason
	 * PendingStatus33Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmPendingCancellation
	 * ProcessingStatus40Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmPendingProcessing
	 * ProcessingStatus40Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmPendingProcessing
	 * ProcessingStatus42Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmPendingCancellation
	 * ProcessingStatus42Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmPendingProcessing
	 * InstructionProcessingStatus17Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmPendingCancellation
	 * InstructionProcessingStatus17Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmPendingCancellationReason
	 * Reason13Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmPendingReason
	 * Reason13Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmPendingProcessingReason
	 * Reason13Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmPendingModificationReason
	 * Reason13Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmPending
	 * InstructionProcessingStatus20Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus7Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus34Choice#mmReason
	 * PendingStatus34Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason7#mmReasonCode
	 * PendingStatusReason7.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason24Choice#mmCode
	 * PendingReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason24Choice#mmProprietary
	 * PendingReason24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#mmPending
	 * ProcessingStatus44Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmPendingProcessing
	 * ModificationProcessingStatus4Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmPendingCancellation
	 * ProcessingStatus45Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingCancellationReason
	 * Reason14Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingReason
	 * Reason14Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingProcessingReason
	 * Reason14Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingModificationReason
	 * Reason14Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmPending
	 * InstructionProcessingStatus21Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus8Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus35Choice#mmReason
	 * PendingStatus35Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason8#mmReasonCode
	 * PendingStatusReason8.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason25Choice#mmCode
	 * PendingReason25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason25Choice#mmProprietary
	 * PendingReason25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmPendingProcessing
	 * ModificationProcessingStatus6Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmPendingCancellation
	 * ProcessingStatus47Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#mmPending
	 * ProcessingStatus46Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmPendingCancellationReason
	 * Reason15Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmPendingReason
	 * Reason15Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmPendingProcessingReason
	 * Reason15Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmPendingModificationReason
	 * Reason15Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmPendingProcessing
	 * ModificationProcessingStatus5Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmPending
	 * ProcessingStatus50Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmPendingProcessing
	 * ProcessingStatus48Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmPendingCancellation
	 * ProcessingStatus48Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmPendingProcessing
	 * ModificationProcessingStatus7Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmPendingCancellation
	 * ProcessingStatus54Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmPendingCancellation
	 * ProcessingStatus51Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmPendingProcessing
	 * ProcessingStatus51Choice.mmPendingProcessing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason17#mmCode
	 * PendingReason17.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason30Choice#mmCode
	 * PendingReason30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason30Choice#mmProprietary
	 * PendingReason30Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason16#mmCode
	 * PendingReason16.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice#mmCode
	 * PendingReason28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice#mmProprietary
	 * PendingReason28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice#mmCode
	 * PendingProcessingReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice#mmProprietary
	 * PendingProcessingReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmPendingProcessing
	 * ProcessingStatus52Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmPendingCancellation
	 * ProcessingStatus52Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus37Choice#mmReason
	 * PendingStatus37Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason15#mmCode
	 * PendingReason15.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice#mmReason
	 * PendingStatus38Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason10#mmCode
	 * PendingProcessingReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice#mmReason
	 * PendingProcessingStatus13Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason14#mmCode
	 * PendingReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason26Choice#mmCode
	 * PendingReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason26Choice#mmProprietary
	 * PendingReason26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmPendingProcessing
	 * ProcessingStatus49Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmPendingCancellation
	 * ProcessingStatus49Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice#mmReason
	 * PendingProcessingStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus40Choice#mmReason
	 * PendingStatus40Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason8#mmCode
	 * PendingProcessingReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice#mmCode
	 * PendingReason29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice#mmProprietary
	 * PendingReason29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingProcessing
	 * InstructionProcessingStatus22Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingCancellation
	 * InstructionProcessingStatus22Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice#mmCode
	 * PendingProcessingReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice#mmProprietary
	 * PendingProcessingReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus39Choice#mmReason
	 * PendingStatus39Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice#mmReason
	 * PendingProcessingStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason9#mmCode
	 * PendingProcessingReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmPendingCancellation
	 * ProcessingStatus53Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice#mmCode
	 * PendingProcessingReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice#mmProprietary
	 * PendingProcessingReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason27Choice#mmCode
	 * PendingReason27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason27Choice#mmProprietary
	 * PendingReason27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus36Choice#mmReason
	 * PendingStatus36Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingCancellationReason
	 * Reason16Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingReason
	 * Reason16Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingProcessingReason
	 * Reason16Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingModificationReason
	 * Reason16Choice.mmPendingModificationReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason18#mmCode
	 * PendingReason18.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice#mmCode
	 * PendingCancellationReasons4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice#mmProprietary
	 * PendingCancellationReasons4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason31Choice#mmCode
	 * PendingReason31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason31Choice#mmProprietary
	 * PendingReason31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmPending
	 * EventProcessingStatus3Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus9Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmPending
	 * InstructionProcessingStatus24Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus42Choice#mmReason
	 * PendingStatus42Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus5Choice#mmReason
	 * PendingCancellationStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason10#mmReasonCode
	 * PendingStatusReason10.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason33Choice#mmCode
	 * PendingReason33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason33Choice#mmProprietary
	 * PendingReason33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason32Choice#mmCode
	 * PendingReason32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason32Choice#mmProprietary
	 * PendingReason32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5#mmReasonCode
	 * PendingCancellationStatusReason5.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9#mmReasonCode
	 * PendingStatusReason9.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus10Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmPending
	 * InstructionProcessingStatus25Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice#mmPending
	 * EventProcessingStatus4Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus6Choice#mmReason
	 * PendingCancellationStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6#mmReasonCode
	 * PendingCancellationStatusReason6.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason35Choice#mmCode
	 * PendingReason35Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason35Choice#mmProprietary
	 * PendingReason35Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason11#mmReasonCode
	 * PendingStatusReason11.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason12#mmReasonCode
	 * PendingStatusReason12.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason34Choice#mmCode
	 * PendingReason34Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason34Choice#mmProprietary
	 * PendingReason34Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus44Choice#mmReason
	 * PendingStatus44Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmPendingCancellation
	 * ProcessingStatus57Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmPendingProcessing
	 * ProcessingStatus57Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmPendingCancellation
	 * ProcessingStatus65Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#mmPending
	 * ProcessingStatus58Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmPendingProcessing
	 * ProcessingStatus63Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmPendingCancellation
	 * ProcessingStatus63Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason37Choice#mmCode
	 * PendingReason37Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason37Choice#mmProprietary
	 * PendingReason37Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmPendingCancellationReason
	 * Reason17Choice.mmPendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmPendingReason
	 * Reason17Choice.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmPendingProcessingReason
	 * Reason17Choice.mmPendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmPendingModificationReason
	 * Reason17Choice.mmPendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason47Choice#mmCode
	 * PendingReason47Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason47Choice#mmProprietary
	 * PendingReason47Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons5Choice#mmCode
	 * PendingCancellationReasons5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons5Choice#mmProprietary
	 * PendingCancellationReasons5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason11#mmCode
	 * PendingProcessingReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason13Choice#mmCode
	 * PendingProcessingReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason13Choice#mmProprietary
	 * PendingProcessingReason13Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason25#mmCode
	 * PendingReason25.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason42Choice#mmCode
	 * PendingReason42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason42Choice#mmProprietary
	 * PendingReason42Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus46Choice#mmReason
	 * PendingStatus46Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason20#mmCode
	 * PendingReason20.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmPendingProcessing
	 * ProcessingStatus62Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmPendingCancellation
	 * ProcessingStatus62Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason12#mmCode
	 * PendingProcessingReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason14Choice#mmCode
	 * PendingProcessingReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason14Choice#mmProprietary
	 * PendingProcessingReason14Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason19#mmCode
	 * PendingReason19.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason36Choice#mmCode
	 * PendingReason36Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason36Choice#mmProprietary
	 * PendingReason36Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmPendingProcessing
	 * InstructionProcessingStatus27Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmPendingCancellation
	 * InstructionProcessingStatus27Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus15Choice#mmReason
	 * PendingProcessingStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus16Choice#mmReason
	 * PendingProcessingStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason13#mmCode
	 * PendingProcessingReason13.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus45Choice#mmReason
	 * PendingStatus45Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmPendingProcessing
	 * ModificationProcessingStatus8Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmPendingCancellation
	 * ProcessingStatus61Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus51Choice#mmReason
	 * PendingStatus51Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason24#mmCode
	 * PendingReason24.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason41Choice#mmCode
	 * PendingReason41Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason41Choice#mmProprietary
	 * PendingReason41Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus50Choice#mmReason
	 * PendingStatus50Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason15Choice#mmCode
	 * PendingProcessingReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason15Choice#mmProprietary
	 * PendingProcessingReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason38Choice#mmCode
	 * PendingReason38Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason38Choice#mmProprietary
	 * PendingReason38Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmPendingProcessing
	 * ProcessingStatus60Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmPendingCancellation
	 * ProcessingStatus60Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus14Choice#mmReason
	 * PendingProcessingStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus47Choice#mmReason
	 * PendingStatus47Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason21#mmCode
	 * PendingReason21.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus72Choice#mmPendingProcessing
	 * ProcessingStatus72Choice.mmPendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus71Choice#mmPending
	 * ProcessingStatus71Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus69Choice#mmPendingCancellation
	 * ProcessingStatus69Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason14#mmCode
	 * PendingStatusReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingOpeningStatusReason1#mmCode
	 * PendingOpeningStatusReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosurePendingStatusReason1#mmCode
	 * ClosurePendingStatusReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus11Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmPending
	 * InstructionProcessingStatus29Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice#mmReason
	 * PendingCancellationStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason48Choice#mmCode
	 * PendingReason48Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason48Choice#mmProprietary
	 * PendingReason48Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus52Choice#mmReason
	 * PendingStatus52Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7#mmReasonCode
	 * PendingCancellationStatusReason7.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13#mmReasonCode
	 * PendingStatusReason13.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus12Choice.mmPendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmPending
	 * InstructionProcessingStatus30Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus8Choice#mmReason
	 * PendingCancellationStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8#mmReasonCode
	 * PendingCancellationStatusReason8.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus53Choice#mmReason
	 * PendingStatus53Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason49Choice#mmCode
	 * PendingReason49Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason49Choice#mmProprietary
	 * PendingReason49Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason15#mmReasonCode
	 * PendingStatusReason15.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction processing is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, PendingFailingReasonCode> mmPendingReason = new MMBusinessAttribute<StatusReason, PendingFailingReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PendingProcessingReason1Choice.mmCode, PendingProcessingReason1Choice.mmProprietary, PendingProcessingReason1.mmCode, PendingProcessingStatus1Choice.mmReason, PendingReason2Choice.mmCode,
					PendingReason2Choice.mmProprietary, PendingReason2.mmCode, PendingStatus4Choice.mmReason, ProcessingStatus1Choice.mmPendingProcessing, ProcessingStatus1Choice.mmPendingCancellation,
					PendingProcessingReason3Choice.mmCode, PendingProcessingReason3Choice.mmProprietary, PendingProcessingReason3.mmCode, PendingProcessingStatus3Choice.mmReason, PendingStatus13Choice.mmReason,
					ProcessingStatus19Choice.mmPendingProcessing, ProcessingStatus19Choice.mmPendingCancellation, PendingReason1Choice.mmCode, PendingReason1Choice.mmProprietary, PendingReason1.mmCode, PendingReason13Choice.mmCode,
					PendingReason13Choice.mmProprietary, PendingReason5.mmCode, PendingStatus9Choice.mmReason, PendingProcessingReason5Choice.mmCode, PendingProcessingReason5Choice.mmProprietary, PendingProcessingReason5.mmCode,
					PendingProcessingStatus7Choice.mmReason, ModificationProcessingStatus2Choice.mmPendingProcessing, ProcessingStatus2Choice.mmPendingCancellation, ProcessingStatus13Choice.mmPendingCancellation,
					PendingReason15Choice.mmCode, PendingReason15Choice.mmProprietary, PendingReason7.mmCode, PendingStatus11Choice.mmReason, ProcessingStatus20Choice.mmPendingCancellation, PendingProcessingReason7Choice.mmCode,
					PendingProcessingReason7Choice.mmProprietary, PendingProcessingReason7.mmCode, PendingProcessingStatus9Choice.mmReason, PendingReason9Choice.mmCode, PendingReason9Choice.mmProprietary, PendingReason3.mmCode,
					PendingStatus24Choice.mmReason, ProcessingStatus25Choice.mmPendingProcessing, ProcessingStatus25Choice.mmPendingCancellation, PendingReason18Choice.mmCode, PendingReason18Choice.mmProprietary, PendingReason10.mmCode,
					PendingStatus31Choice.mmReason, PendingProcessingReason6Choice.mmCode, PendingProcessingReason6Choice.mmProprietary, PendingProcessingReason6.mmCode, PendingProcessingStatus8Choice.mmReason,
					ModificationProcessingStatus3Choice.mmPendingProcessing, PendingReason20Choice.mmCode, PendingReason20Choice.mmProprietary, PendingReason12.mmCode, PendingStatus22Choice.mmReason,
					ProcessingStatus26Choice.mmPendingCancellation, PendingReason4Choice.mmCode, PendingReason4Choice.mmProprietary, PendingStatusReason2.mmReasonCode, EventProcessingStatus1Choice.mmPending, PendingReason5Choice.mmCode,
					PendingReason5Choice.mmProprietary, PendingStatusReason3.mmReasonCode, EventProcessingStatus2Choice.mmPending, PendingCancellationStatusReason1.mmReasonCode, PendingCancellationStatus1Choice.mmReason,
					InstructionCancellationRequestStatus1Choice.mmPendingCancellation, PendingCancellationStatusReason2.mmReasonCode, PendingCancellationStatus2Choice.mmReason,
					InstructionCancellationRequestStatus2Choice.mmPendingCancellation, InstructionCancellationRequestStatus3Choice.mmPendingCancellation, InstructionCancellationRequestStatus4Choice.mmPendingCancellation,
					PendingCancellationStatusReason3.mmReasonCode, PendingCancellationStatus3Choice.mmReason, InstructionCancellationRequestStatus5Choice.mmPendingCancellation, PendingCancellationStatusReason4.mmReasonCode,
					PendingCancellationStatus4Choice.mmReason, InstructionCancellationRequestStatus6Choice.mmPendingCancellation, PendingReason6Choice.mmCode, PendingReason6Choice.mmProprietary, PendingStatusReason1.mmReasonCode,
					PendingStatus1Choice.mmReason, InstructionProcessingStatus1Choice.mmPending, PendingReason7Choice.mmCode, PendingReason7Choice.mmProprietary, PendingStatusReason4.mmReasonCode, PendingStatus6Choice.mmReason,
					InstructionProcessingStatus4Choice.mmPending, InstructionProcessingStatus7Choice.mmPending, InstructionProcessingStatus8Choice.mmPending, InstructionProcessingStatus12Choice.mmPending,
					InstructionProcessingStatus13Choice.mmPending, ProcessingStatus5Choice.mmPending, PendingStatus7Choice.mmReason, ProcessingStatus11Choice.mmPending, ProcessingStatus14Choice.mmPending,
					ProcessingStatus15Choice.mmPending, ProcessingStatus18Choice.mmPending, ProcessingStatus24Choice.mmPending, ProcessingStatus6Choice.mmPendingProcessing, ProcessingStatus6Choice.mmPendingCancellation,
					PendingProcessingReason2Choice.mmCode, PendingProcessingReason2Choice.mmProprietary, PendingProcessingReason2.mmCode, PendingProcessingStatus2Choice.mmReason, ProcessingStatus12Choice.mmPendingProcessing,
					ProcessingStatus12Choice.mmPendingCancellation, PendingReason10Choice.mmCode, PendingReason10Choice.mmProprietary, PendingReason4.mmCode, ProcessingStatus23Choice.mmPendingProcessing,
					ProcessingStatus23Choice.mmPendingCancellation, ProcessingStatus29Choice.mmPendingProcessing, ProcessingStatus29Choice.mmPendingCancellation, ProcessingStatus7Choice.mmPendingProcessing,
					ProcessingStatus7Choice.mmPendingCancellation, InstructionProcessingStatus3Choice.mmPendingProcessing, InstructionProcessingStatus3Choice.mmPendingCancellation, InstructionProcessingStatus6Choice.mmPendingProcessing,
					InstructionProcessingStatus6Choice.mmPendingCancellation, InstructionProcessingStatus10Choice.mmPendingProcessing, InstructionProcessingStatus10Choice.mmPendingCancellation,
					InstructionProcessingStatus11Choice.mmPendingProcessing, InstructionProcessingStatus11Choice.mmPendingCancellation, ProcessingStatus17Choice.mmPendingProcessing, TransferStatusAndReason2.mmCancellationPending,
					ProcessingStatus3Choice.mmPendingCancellation, ProcessingStatus3Choice.mmPendingProcessing, PendingCancellationReasons2Choice.mmCode, PendingCancellationReasons2Choice.mmProprietary, PendingReason3Choice.mmCode,
					PendingReason3Choice.mmProprietary, Reason1Choice.mmPendingCancellationReason, Reason1Choice.mmPendingReason, Reason1Choice.mmPendingProcessingReason, Reason1Choice.mmPendingModificationReason,
					PendingReason11Choice.mmCode, PendingReason11Choice.mmProprietary, Reason6Choice.mmPendingCancellationReason, Reason6Choice.mmPendingReason, Reason6Choice.mmPendingProcessingReason,
					Reason6Choice.mmPendingModificationReason, ProcessingStatus10Choice.mmPendingCancellation, ProcessingStatus10Choice.mmPendingProcessing, PendingProcessingStatus4Choice.mmReason,
					ProcessingStatus21Choice.mmPendingCancellation, ProcessingStatus21Choice.mmPendingProcessing, PendingStatus15Choice.mmReason, PendingProcessingStatus10Choice.mmReason, ProcessingStatus27Choice.mmPendingCancellation,
					ProcessingStatus27Choice.mmPendingProcessing, PendingStatus26Choice.mmReason, PendingCancellationReasons3Choice.mmCode, PendingCancellationReasons3Choice.mmProprietary, PendingReason8Choice.mmCode,
					PendingReason8Choice.mmProprietary, Reason2Choice.mmPendingCancellationReason, Reason2Choice.mmPendingReason, Reason2Choice.mmPendingProcessingReason, Reason2Choice.mmPendingModificationReason,
					PendingReason12Choice.mmCode, PendingReason12Choice.mmProprietary, Reason10Choice.mmPendingCancellationReason, Reason10Choice.mmPendingReason, Reason10Choice.mmPendingProcessingReason,
					Reason10Choice.mmPendingModificationReason, Reason7Choice.mmPendingCancellationReason, Reason7Choice.mmPendingReason, Reason7Choice.mmPendingProcessingReason, Reason7Choice.mmPendingModificationReason,
					Reason11Choice.mmPendingCancellationReason, Reason11Choice.mmPendingReason, Reason11Choice.mmPendingProcessingReason, Reason11Choice.mmPendingModificationReason, ProcessingStatus9Choice.mmPendingCancellation,
					ProcessingStatus16Choice.mmPendingCancellation, PendingReason16Choice.mmCode, PendingReason16Choice.mmProprietary, PendingReason8.mmCode, PendingStatus12Choice.mmReason, PendingReason21Choice.mmCode,
					PendingReason21Choice.mmProprietary, PendingReason13.mmCode, PendingStatus23Choice.mmReason, ProcessingStatus32Choice.mmPendingCancellation, ProcessingStatus36Choice.mmPendingProcessing,
					ProcessingStatus31Choice.mmPending, Reason12Choice.mmPendingCancellationReason, Reason12Choice.mmPendingReason, Reason12Choice.mmPendingProcessingReason, Reason12Choice.mmPendingModificationReason,
					InstructionProcessingStatus14Choice.mmPendingProcessing, InstructionProcessingStatus14Choice.mmPendingCancellation, PendingReason22Choice.mmCode, PendingReason22Choice.mmProprietary, PendingStatus32Choice.mmReason,
					PendingStatusReason5.mmReasonCode, InstructionProcessingStatus15Choice.mmPending, ProcessingStatus38Choice.mmPendingCancellation, ProcessingStatus38Choice.mmPendingProcessing,
					ProcessingStatus37Choice.mmPendingProcessing, ProcessingStatus37Choice.mmPendingCancellation, InstructionProcessingStatus16Choice.mmPending, PendingStatusReason6.mmReasonCode, PendingReason23Choice.mmCode,
					PendingReason23Choice.mmProprietary, PendingStatus33Choice.mmReason, ProcessingStatus40Choice.mmPendingCancellation, ProcessingStatus40Choice.mmPendingProcessing, ProcessingStatus42Choice.mmPendingProcessing,
					ProcessingStatus42Choice.mmPendingCancellation, InstructionProcessingStatus17Choice.mmPendingProcessing, InstructionProcessingStatus17Choice.mmPendingCancellation, Reason13Choice.mmPendingCancellationReason,
					Reason13Choice.mmPendingReason, Reason13Choice.mmPendingProcessingReason, Reason13Choice.mmPendingModificationReason, InstructionProcessingStatus20Choice.mmPending,
					InstructionCancellationRequestStatus7Choice.mmPendingCancellation, PendingStatus34Choice.mmReason, PendingStatusReason7.mmReasonCode, PendingReason24Choice.mmCode, PendingReason24Choice.mmProprietary,
					ProcessingStatus44Choice.mmPending, ModificationProcessingStatus4Choice.mmPendingProcessing, ProcessingStatus45Choice.mmPendingCancellation, Reason14Choice.mmPendingCancellationReason, Reason14Choice.mmPendingReason,
					Reason14Choice.mmPendingProcessingReason, Reason14Choice.mmPendingModificationReason, InstructionProcessingStatus21Choice.mmPending, InstructionCancellationRequestStatus8Choice.mmPendingCancellation,
					PendingStatus35Choice.mmReason, PendingStatusReason8.mmReasonCode, PendingReason25Choice.mmCode, PendingReason25Choice.mmProprietary, ModificationProcessingStatus6Choice.mmPendingProcessing,
					ProcessingStatus47Choice.mmPendingCancellation, ProcessingStatus46Choice.mmPending, Reason15Choice.mmPendingCancellationReason, Reason15Choice.mmPendingReason, Reason15Choice.mmPendingProcessingReason,
					Reason15Choice.mmPendingModificationReason, ModificationProcessingStatus5Choice.mmPendingProcessing, ProcessingStatus50Choice.mmPending, ProcessingStatus48Choice.mmPendingProcessing,
					ProcessingStatus48Choice.mmPendingCancellation, ModificationProcessingStatus7Choice.mmPendingProcessing, ProcessingStatus54Choice.mmPendingCancellation, ProcessingStatus51Choice.mmPendingCancellation,
					ProcessingStatus51Choice.mmPendingProcessing, PendingReason17.mmCode, PendingReason30Choice.mmCode, PendingReason30Choice.mmProprietary, PendingReason16.mmCode, PendingReason28Choice.mmCode,
					PendingReason28Choice.mmProprietary, PendingProcessingReason12Choice.mmCode, PendingProcessingReason12Choice.mmProprietary, ProcessingStatus52Choice.mmPendingProcessing, ProcessingStatus52Choice.mmPendingCancellation,
					PendingStatus37Choice.mmReason, PendingReason15.mmCode, PendingStatus38Choice.mmReason, PendingProcessingReason10.mmCode, PendingProcessingStatus13Choice.mmReason, PendingReason14.mmCode, PendingReason26Choice.mmCode,
					PendingReason26Choice.mmProprietary, ProcessingStatus49Choice.mmPendingProcessing, ProcessingStatus49Choice.mmPendingCancellation, PendingProcessingStatus11Choice.mmReason, PendingStatus40Choice.mmReason,
					PendingProcessingReason8.mmCode, PendingReason29Choice.mmCode, PendingReason29Choice.mmProprietary, InstructionProcessingStatus22Choice.mmPendingProcessing, InstructionProcessingStatus22Choice.mmPendingCancellation,
					PendingProcessingReason10Choice.mmCode, PendingProcessingReason10Choice.mmProprietary, PendingStatus39Choice.mmReason, PendingProcessingStatus12Choice.mmReason, PendingProcessingReason9.mmCode,
					ProcessingStatus53Choice.mmPendingCancellation, PendingProcessingReason11Choice.mmCode, PendingProcessingReason11Choice.mmProprietary, PendingReason27Choice.mmCode, PendingReason27Choice.mmProprietary,
					PendingStatus36Choice.mmReason, Reason16Choice.mmPendingCancellationReason, Reason16Choice.mmPendingReason, Reason16Choice.mmPendingProcessingReason, Reason16Choice.mmPendingModificationReason, PendingReason18.mmCode,
					PendingCancellationReasons4Choice.mmCode, PendingCancellationReasons4Choice.mmProprietary, PendingReason31Choice.mmCode, PendingReason31Choice.mmProprietary, EventProcessingStatus3Choice.mmPending,
					InstructionCancellationRequestStatus9Choice.mmPendingCancellation, InstructionProcessingStatus24Choice.mmPending, PendingStatus42Choice.mmReason, PendingCancellationStatus5Choice.mmReason,
					PendingStatusReason10.mmReasonCode, PendingReason33Choice.mmCode, PendingReason33Choice.mmProprietary, PendingReason32Choice.mmCode, PendingReason32Choice.mmProprietary, PendingCancellationStatusReason5.mmReasonCode,
					PendingStatusReason9.mmReasonCode, InstructionCancellationRequestStatus10Choice.mmPendingCancellation, InstructionProcessingStatus25Choice.mmPending, EventProcessingStatus4Choice.mmPending,
					PendingCancellationStatus6Choice.mmReason, PendingCancellationStatusReason6.mmReasonCode, PendingReason35Choice.mmCode, PendingReason35Choice.mmProprietary, PendingStatusReason11.mmReasonCode,
					PendingStatusReason12.mmReasonCode, PendingReason34Choice.mmCode, PendingReason34Choice.mmProprietary, PendingStatus44Choice.mmReason, ProcessingStatus57Choice.mmPendingCancellation,
					ProcessingStatus57Choice.mmPendingProcessing, ProcessingStatus65Choice.mmPendingCancellation, ProcessingStatus58Choice.mmPending, ProcessingStatus63Choice.mmPendingProcessing,
					ProcessingStatus63Choice.mmPendingCancellation, PendingReason37Choice.mmCode, PendingReason37Choice.mmProprietary, Reason17Choice.mmPendingCancellationReason, Reason17Choice.mmPendingReason,
					Reason17Choice.mmPendingProcessingReason, Reason17Choice.mmPendingModificationReason, PendingReason47Choice.mmCode, PendingReason47Choice.mmProprietary, PendingCancellationReasons5Choice.mmCode,
					PendingCancellationReasons5Choice.mmProprietary, PendingProcessingReason11.mmCode, PendingProcessingReason13Choice.mmCode, PendingProcessingReason13Choice.mmProprietary, PendingReason25.mmCode,
					PendingReason42Choice.mmCode, PendingReason42Choice.mmProprietary, PendingStatus46Choice.mmReason, PendingReason20.mmCode, ProcessingStatus62Choice.mmPendingProcessing, ProcessingStatus62Choice.mmPendingCancellation,
					PendingProcessingReason12.mmCode, PendingProcessingReason14Choice.mmCode, PendingProcessingReason14Choice.mmProprietary, PendingReason19.mmCode, PendingReason36Choice.mmCode, PendingReason36Choice.mmProprietary,
					InstructionProcessingStatus27Choice.mmPendingProcessing, InstructionProcessingStatus27Choice.mmPendingCancellation, PendingProcessingStatus15Choice.mmReason, PendingProcessingStatus16Choice.mmReason,
					PendingProcessingReason13.mmCode, PendingStatus45Choice.mmReason, ModificationProcessingStatus8Choice.mmPendingProcessing, ProcessingStatus61Choice.mmPendingCancellation, PendingStatus51Choice.mmReason,
					PendingReason24.mmCode, PendingReason41Choice.mmCode, PendingReason41Choice.mmProprietary, PendingStatus50Choice.mmReason, PendingProcessingReason15Choice.mmCode, PendingProcessingReason15Choice.mmProprietary,
					PendingReason38Choice.mmCode, PendingReason38Choice.mmProprietary, ProcessingStatus60Choice.mmPendingProcessing, ProcessingStatus60Choice.mmPendingCancellation, PendingProcessingStatus14Choice.mmReason,
					PendingStatus47Choice.mmReason, PendingReason21.mmCode, ProcessingStatus72Choice.mmPendingProcessing, ProcessingStatus71Choice.mmPending, ProcessingStatus69Choice.mmPendingCancellation, PendingStatusReason14.mmCode,
					PendingOpeningStatusReason1.mmCode, ClosurePendingStatusReason1.mmCode, InstructionCancellationRequestStatus11Choice.mmPendingCancellation, InstructionProcessingStatus29Choice.mmPending,
					PendingCancellationStatus7Choice.mmReason, PendingReason48Choice.mmCode, PendingReason48Choice.mmProprietary, PendingStatus52Choice.mmReason, PendingCancellationStatusReason7.mmReasonCode,
					PendingStatusReason13.mmReasonCode, InstructionCancellationRequestStatus12Choice.mmPendingCancellation, InstructionProcessingStatus30Choice.mmPending, PendingCancellationStatus8Choice.mmReason,
					PendingCancellationStatusReason8.mmReasonCode, PendingStatus53Choice.mmReason, PendingReason49Choice.mmCode, PendingReason49Choice.mmProprietary, PendingStatusReason15.mmReasonCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction processing is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}

		@Override
		public PendingFailingReasonCode getValue(StatusReason obj) {
			return obj.getPendingReason();
		}

		@Override
		public void setValue(StatusReason obj, PendingFailingReasonCode value) {
			obj.setPendingReason(value);
		}
	};
	protected RejectionReasonV2Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
	 * RejectionReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason4Choice#mmCode
	 * RejectionReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason4Choice#mmProprietary
	 * RejectionReason4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason5#mmCode
	 * RejectionReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus1Choice#mmReason
	 * RejectionStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmRejected
	 * ProcessingStatus1Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10Choice#mmCode
	 * RejectionReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10Choice#mmProprietary
	 * RejectionReason10Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason10#mmCode
	 * RejectionReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus5Choice#mmReason
	 * RejectionStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmRejected
	 * ProcessingStatus19Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11Choice#mmCode
	 * RejectionReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11Choice#mmProprietary
	 * RejectionReason11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason11#mmCode
	 * RejectionReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus8Choice#mmReason
	 * RejectionStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmRejected
	 * ModificationProcessingStatus2Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason1Choice#mmCode
	 * RejectionAndRepairReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason1Choice#mmProprietary
	 * RejectionAndRepairReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmRejected
	 * ProcessingStatus2Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason9Choice#mmCode
	 * RejectionAndRepairReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason9Choice#mmProprietary
	 * RejectionAndRepairReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmRejected
	 * ProcessingStatus13Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason3Choice#mmCode
	 * RejectionAndRepairReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason3Choice#mmProprietary
	 * RejectionAndRepairReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason10Choice#mmCode
	 * RejectionAndRepairReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason10Choice#mmProprietary
	 * RejectionAndRepairReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason18Choice#mmCode
	 * RejectionAndRepairReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason18Choice#mmProprietary
	 * RejectionAndRepairReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice#mmCode
	 * RejectionAndRepairReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice#mmProprietary
	 * RejectionAndRepairReason13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmRejected
	 * ProcessingStatus20Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13Choice#mmCode
	 * RejectionReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13Choice#mmProprietary
	 * RejectionReason13Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason15#mmCode
	 * RejectionReason15.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus11Choice#mmReason
	 * RejectionStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmRejected
	 * ProcessingStatus25Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12Choice#mmCode
	 * RejectionReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12Choice#mmProprietary
	 * RejectionReason12Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason14#mmCode
	 * RejectionReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus10Choice#mmReason
	 * RejectionStatus10Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmRejected
	 * ModificationProcessingStatus3Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason19Choice#mmCode
	 * RejectionAndRepairReason19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason19Choice#mmProprietary
	 * RejectionAndRepairReason19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason16Choice#mmCode
	 * RejectionAndRepairReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason16Choice#mmProprietary
	 * RejectionAndRepairReason16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmRejected
	 * ProcessingStatus26Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason1Choice#mmCode
	 * RejectedReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason1Choice#mmProprietary
	 * RejectedReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason8#mmReasonCode
	 * RejectedStatusReason8.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus1Choice#mmReason
	 * RejectedStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason1Choice#mmCode
	 * PendingCancellationReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason1Choice#mmProprietary
	 * PendingCancellationReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#mmRejected
	 * InstructionCancellationRequestStatus1Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason2Choice#mmCode
	 * RejectedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason2Choice#mmProprietary
	 * RejectedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason9#mmReasonCode
	 * RejectedStatusReason9.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus2Choice#mmReason
	 * RejectedStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason2Choice#mmCode
	 * PendingCancellationReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason2Choice#mmProprietary
	 * PendingCancellationReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#mmRejected
	 * InstructionCancellationRequestStatus2Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#mmRejected
	 * InstructionCancellationRequestStatus3Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#mmRejected
	 * InstructionCancellationRequestStatus4Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmRejected
	 * InstructionCancellationRequestStatus5Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#mmRejected
	 * InstructionCancellationRequestStatus6Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmRejected
	 * InstructionProcessingStatus1Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmRejected
	 * InstructionProcessingStatus4Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmRejected
	 * InstructionProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmRejected
	 * InstructionProcessingStatus8Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmRejected
	 * InstructionProcessingStatus12Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmRejected
	 * InstructionProcessingStatus13Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#mmRejected
	 * ProcessingStatus5Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason7Choice#mmCode
	 * RejectionAndRepairReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason7Choice#mmProprietary
	 * RejectionAndRepairReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#mmRejected
	 * ProcessingStatus11Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#mmRejected
	 * ProcessingStatus14Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason11Choice#mmCode
	 * RejectionAndRepairReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason11Choice#mmProprietary
	 * RejectionAndRepairReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#mmRejected
	 * ProcessingStatus15Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#mmRejected
	 * ProcessingStatus18Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#mmRejected
	 * ProcessingStatus24Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6Choice#mmCode
	 * RejectionReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6Choice#mmProprietary
	 * RejectionReason6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason7#mmCode
	 * RejectionReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus2Choice#mmReason
	 * RejectionStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmRejected
	 * ProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9Choice#mmCode
	 * RejectionReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9Choice#mmProprietary
	 * RejectionReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason9#mmCode
	 * RejectionReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice#mmReason
	 * InstructionProcessingReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmRejected
	 * ProcessingStatus17Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#mmRejected
	 * OrderStatusAndReason3.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmLegRejectionReason
	 * SwitchLegReferences1.mmLegRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmReason
	 * InstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#mmExtendedReason
	 * InstructionRejectionStatus1.mmExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus2Choice#mmRejectionStatus
	 * InstructionStatus2Choice.mmRejectionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice#mmCode
	 * RejectionReason11FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice#mmProprietary
	 * RejectionReason11FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice#mmCode
	 * RejectionReason6FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice#mmProprietary
	 * RejectionReason6FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice#mmCode
	 * RejectionReason18FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice#mmProprietary
	 * RejectionReason18FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#mmReason
	 * CorporateActionInstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice#mmCode
	 * RejectionReason9FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice#mmProprietary
	 * RejectionReason9FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice#mmCode
	 * RejectionReason8FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice#mmProprietary
	 * RejectionReason8FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice#mmCode
	 * RejectionReason19FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice#mmProprietary
	 * RejectionReason19FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice#mmCode
	 * RejectionReason13FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice#mmProprietary
	 * RejectionReason13FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#mmReason
	 * CorporateActionMovementRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice#mmCode
	 * RejectionReason14FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice#mmProprietary
	 * RejectionReason14FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#mmReason
	 * CorporateActionMovementRejectionStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice#mmCode
	 * RejectionReason15FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice#mmProprietary
	 * RejectionReason15FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#mmReason
	 * CorporateActionStandingInstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice#mmCode
	 * RejectionReason10FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice#mmProprietary
	 * RejectionReason10FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice#mmCode
	 * RejectionReason12FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice#mmProprietary
	 * RejectionReason12FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#mmReason
	 * CorporateActionDeactivationInstructionRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice#mmCode
	 * RejectionReason7FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice#mmProprietary
	 * RejectionReason7FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#mmReason
	 * CorporateActionDeactivationCancellationRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason4Choice#mmCode
	 * RejectionAndRepairReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason4Choice#mmProprietary
	 * RejectionAndRepairReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason2Choice#mmCode
	 * RejectionReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason2Choice#mmProprietary
	 * RejectionReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason6#mmCode
	 * RejectionReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus3Choice#mmReason
	 * RejectionStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmRejected
	 * ProcessingStatus3Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason5Choice#mmCode
	 * RejectionReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason5Choice#mmProprietary
	 * RejectionReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmRejectionReason
	 * Reason1Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmRejectionReason
	 * Reason6Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason2Choice#mmCode
	 * RejectionAndRepairReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason2Choice#mmProprietary
	 * RejectionAndRepairReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice#mmRejected
	 * ProcessingStatus4Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionStatus2#mmRejectedReason
	 * RejectionStatus2.mmRejectedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmRejectionReason
	 * CollateralProposalResponseType1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectionReason
	 * CollateralSubstitutionResponse2.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8Choice#mmCode
	 * RejectionReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8Choice#mmProprietary
	 * RejectionReason8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason8#mmCode
	 * RejectionReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus4Choice#mmReason
	 * RejectionStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmRejected
	 * ProcessingStatus10Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus6Choice#mmReason
	 * RejectionStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmRejected
	 * ProcessingStatus21Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus12Choice#mmReason
	 * RejectionStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmRejected
	 * ProcessingStatus27Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus7Choice#mmReason
	 * RejectionStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus9Choice#mmReason
	 * RejectionStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7Choice#mmCode
	 * RejectionReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7Choice#mmProprietary
	 * RejectionReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmRejectionReason
	 * Reason2Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmRejectionReason
	 * Reason10Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRejectionReason
	 * Reason7Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmRejectionReason
	 * Reason11Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason5Choice#mmCode
	 * RejectionAndRepairReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason5Choice#mmProprietary
	 * RejectionAndRepairReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus8Choice#mmRejected
	 * ProcessingStatus8Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus22Choice#mmRejected
	 * ProcessingStatus22Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus28Choice#mmRejected
	 * ProcessingStatus28Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason6Choice#mmCode
	 * RejectionAndRepairReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason6Choice#mmProprietary
	 * RejectionAndRepairReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmRejected
	 * ProcessingStatus9Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason12Choice#mmCode
	 * RejectionAndRepairReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason12Choice#mmProprietary
	 * RejectionAndRepairReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmRejected
	 * ProcessingStatus16Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason8Choice#mmCode
	 * RejectionAndRepairReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason8Choice#mmProprietary
	 * RejectionAndRepairReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason14Choice#mmCode
	 * RejectionAndRepairReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason14Choice#mmProprietary
	 * RejectionAndRepairReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason17Choice#mmCode
	 * RejectionAndRepairReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason17Choice#mmProprietary
	 * RejectionAndRepairReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason20Choice#mmCode
	 * RejectionAndRepairReason20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason20Choice#mmProprietary
	 * RejectionAndRepairReason20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason22Choice#mmCode
	 * RejectionAndRepairReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason22Choice#mmProprietary
	 * RejectionAndRepairReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmRejected
	 * ProcessingStatus32Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#mmRejected
	 * ProcessingStatus35Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmRejected
	 * ProcessingStatus36Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason21Choice#mmCode
	 * RejectionAndRepairReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason21Choice#mmProprietary
	 * RejectionAndRepairReason21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmRejected
	 * ProcessingStatus31Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason4#mmReasonCode
	 * RejectionReason4.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason3Choice#mmCode
	 * RejectionReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason3Choice#mmProprietary
	 * RejectionReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmRejectionReason
	 * OrderStatusAndReason5.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmRejectionReason
	 * OrderStatus2.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRejectionReason
	 * Reason12Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason10#mmReasonCode
	 * RejectedStatusReason10.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmRejected
	 * InstructionProcessingStatus15Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason5Choice#mmCode
	 * RejectedReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason5Choice#mmProprietary
	 * RejectedReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmRejected
	 * ProcessingStatus38Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmRejected
	 * ProcessingStatus37Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason18#mmCode
	 * RejectionReason18.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15Choice#mmCode
	 * RejectionReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15Choice#mmProprietary
	 * RejectionReason15Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason17#mmCode
	 * RejectionReason17.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14Choice#mmCode
	 * RejectionReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14Choice#mmProprietary
	 * RejectionReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus14Choice#mmReason
	 * RejectionStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason16Choice#mmCode
	 * RejectionReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason16Choice#mmProprietary
	 * RejectionReason16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus13Choice#mmReason
	 * RejectionStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus10Choice#mmReason
	 * RejectedStatus10Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason19#mmCode
	 * RejectionReason19.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason17Choice#mmCode
	 * RejectionReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason17Choice#mmProprietary
	 * RejectionReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice#mmRejected
	 * ProcessingStatus39Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmRejected
	 * InstructionProcessingStatus16Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason6Choice#mmCode
	 * RejectedReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason6Choice#mmProprietary
	 * RejectedReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason11#mmReasonCode
	 * RejectedStatusReason11.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmRejected
	 * ProcessingStatus40Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmRejected
	 * ProcessingStatus42Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus15Choice#mmReason
	 * RejectionStatus15Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason20#mmCode
	 * RejectionReason20.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus12Choice#mmReason
	 * RejectedStatus12Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason21#mmCode
	 * RejectionReason21.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus41Choice#mmRejected
	 * ProcessingStatus41Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18Choice#mmCode
	 * RejectionReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18Choice#mmProprietary
	 * RejectionReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19Choice#mmCode
	 * RejectionReason19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19Choice#mmProprietary
	 * RejectionReason19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmRejectionReason
	 * Reason13Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21Choice#mmCode
	 * RejectionReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21Choice#mmProprietary
	 * RejectionReason21Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason22#mmCode
	 * RejectionReason22.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20Choice#mmCode
	 * RejectionReason20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20Choice#mmProprietary
	 * RejectionReason20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus16Choice#mmReason
	 * RejectionStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#mmCode
	 * ReportItemRejectionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#mmProprietary
	 * ReportItemRejectionReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmRejected
	 * InstructionProcessingStatus20Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmRejected
	 * InstructionCancellationRequestStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason13#mmReasonCode
	 * RejectedStatusReason13.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus14Choice#mmReason
	 * RejectedStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason14#mmReasonCode
	 * RejectedStatusReason14.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason10Choice#mmCode
	 * RejectedReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason10Choice#mmProprietary
	 * RejectedReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason9Choice#mmCode
	 * RejectedReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason9Choice#mmProprietary
	 * RejectedReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#mmRejected
	 * ProcessingStatus44Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmRejected
	 * ModificationProcessingStatus4Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmRejected
	 * ProcessingStatus45Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRejectionReason
	 * Reason14Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#mmRejectionReason
	 * OtherCollateralResponse1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmRejectionReason
	 * CashCollateralResponse1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmRejectionReason
	 * SecuritiesCollateralResponse1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmRejected
	 * InstructionProcessingStatus21Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#mmRejected
	 * InstructionCancellationRequestStatus8Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus15Choice#mmReason
	 * RejectedStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason15#mmReasonCode
	 * RejectedStatusReason15.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason11Choice#mmCode
	 * RejectedReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason11Choice#mmProprietary
	 * RejectedReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason16#mmReasonCode
	 * RejectedStatusReason16.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason12Choice#mmCode
	 * RejectedReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason12Choice#mmProprietary
	 * RejectedReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmRejected
	 * ModificationProcessingStatus6Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmRejected
	 * ProcessingStatus47Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#mmRejected
	 * ProcessingStatus46Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmRejectionReason
	 * Reason15Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmRejected
	 * ModificationProcessingStatus5Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#mmRejected
	 * ProcessingStatus55Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmRejected
	 * ProcessingStatus50Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmRejected
	 * ProcessingStatus48Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmRejected
	 * ModificationProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmRejected
	 * ProcessingStatus54Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmRejected
	 * ProcessingStatus51Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason26#mmCode
	 * RejectionReason26.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason24Choice#mmCode
	 * RejectionReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason24Choice#mmProprietary
	 * RejectionReason24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus17Choice#mmReason
	 * RejectionStatus17Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason25#mmCode
	 * RejectionReason25.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice#mmCode
	 * RejectionReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice#mmProprietary
	 * RejectionReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason23Choice#mmCode
	 * RejectionReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason23Choice#mmProprietary
	 * RejectionReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus56Choice#mmRejected
	 * ProcessingStatus56Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus17Choice#mmReason
	 * RejectedStatus17Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason26Choice#mmCode
	 * RejectionReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason26Choice#mmProprietary
	 * RejectionReason26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice#mmReason
	 * RejectionStatus18Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason25Choice#mmCode
	 * RejectionReason25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason25Choice#mmProprietary
	 * RejectionReason25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmRejected
	 * ProcessingStatus49Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice#mmReason
	 * RejectionStatus21Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason30#mmCode
	 * RejectionReason30.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason27#mmCode
	 * RejectionReason27.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice#mmReason
	 * RejectionStatus20Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice#mmCode
	 * RejectionAndRepairReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice#mmProprietary
	 * RejectionAndRepairReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#mmCode
	 * RejectionAndRepairReason25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#mmProprietary
	 * RejectionAndRepairReason25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmRejected
	 * ProcessingStatus53Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice#mmCode
	 * RejectionAndRepairReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice#mmProprietary
	 * RejectionAndRepairReason24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason27Choice#mmCode
	 * RejectionReason27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason27Choice#mmProprietary
	 * RejectionReason27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice#mmCode
	 * RejectionAndRepairReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice#mmProprietary
	 * RejectionAndRepairReason26Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason28#mmCode
	 * RejectionReason28.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRejectionReason
	 * Reason16Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus19Choice#mmReason
	 * RejectionStatus19Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#mmRejected
	 * InstructionCancellationRequestStatus9Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmRejected
	 * InstructionProcessingStatus24Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason3Choice#mmCode
	 * PendingCancellationReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason3Choice#mmProprietary
	 * PendingCancellationReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason17#mmReasonCode
	 * RejectedStatusReason17.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason14Choice#mmCode
	 * RejectedReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason14Choice#mmProprietary
	 * RejectedReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus18Choice#mmReason
	 * RejectedStatus18Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18#mmReasonCode
	 * RejectedStatusReason18.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason13Choice#mmCode
	 * RejectedReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason13Choice#mmProprietary
	 * RejectedReason13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmRejected
	 * InstructionCancellationRequestStatus10Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmRejected
	 * InstructionProcessingStatus25Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus20Choice#mmReason
	 * RejectedStatus20Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason4Choice#mmCode
	 * PendingCancellationReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason4Choice#mmProprietary
	 * PendingCancellationReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason19#mmReasonCode
	 * RejectedStatusReason19.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason18Choice#mmCode
	 * RejectedReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason18Choice#mmProprietary
	 * RejectedReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason20#mmReasonCode
	 * RejectedStatusReason20.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason19Choice#mmCode
	 * RejectedReason19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason19Choice#mmProprietary
	 * RejectedReason19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmRejected
	 * ProcessingStatus57Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmRejected
	 * ProcessingStatus65Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#mmRejected
	 * ProcessingStatus58Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus64Choice#mmRejected
	 * ProcessingStatus64Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmRejected
	 * ProcessingStatus63Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason37#mmCode
	 * RejectionReason37.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason31Choice#mmCode
	 * RejectionReason31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason31Choice#mmProprietary
	 * RejectionReason31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus22Choice#mmReason
	 * RejectionStatus22Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason34#mmCode
	 * RejectionReason34.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus27Choice#mmReason
	 * RejectionStatus27Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmRejectionReason
	 * Reason17Choice.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason34Choice#mmCode
	 * RejectionReason34Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason34Choice#mmProprietary
	 * RejectionReason34Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason29Choice#mmCode
	 * RejectionAndRepairReason29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason29Choice#mmProprietary
	 * RejectionAndRepairReason29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus23Choice#mmReason
	 * RejectionStatus23Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason36#mmCode
	 * RejectionReason36.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus22Choice#mmReason
	 * RejectedStatus22Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason35#mmCode
	 * RejectionReason35.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus59Choice#mmRejected
	 * ProcessingStatus59Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason30Choice#mmCode
	 * RejectionReason30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason30Choice#mmProprietary
	 * RejectionReason30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason31Choice#mmCode
	 * RejectionAndRepairReason31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason31Choice#mmProprietary
	 * RejectionAndRepairReason31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus26Choice#mmReason
	 * RejectionStatus26Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason28Choice#mmCode
	 * RejectionReason28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason28Choice#mmProprietary
	 * RejectionReason28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmRejected
	 * ModificationProcessingStatus8Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus24Choice#mmReason
	 * RejectionStatus24Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmRejected
	 * ProcessingStatus61Choice.mmRejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason39#mmCode
	 * RejectionReason39.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason33Choice#mmCode
	 * RejectionReason33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason33Choice#mmProprietary
	 * RejectionReason33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason29Choice#mmCode
	 * RejectionReason29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason29Choice#mmProprietary
	 * RejectionReason29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmRejected
	 * ProcessingStatus60Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason28Choice#mmCode
	 * RejectionAndRepairReason28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason28Choice#mmProprietary
	 * RejectionAndRepairReason28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason27Choice#mmCode
	 * RejectionAndRepairReason27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason27Choice#mmProprietary
	 * RejectionAndRepairReason27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus72Choice#mmRejected
	 * ProcessingStatus72Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus71Choice#mmRejected
	 * ProcessingStatus71Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus69Choice#mmRejected
	 * ProcessingStatus69Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus67Choice#mmRejected
	 * ProcessingStatus67Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason32Choice#mmCode
	 * RejectionAndRepairReason32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason32Choice#mmProprietary
	 * RejectionAndRepairReason32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason34Choice#mmCode
	 * RejectionAndRepairReason34Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason34Choice#mmProprietary
	 * RejectionAndRepairReason34Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason33Choice#mmCode
	 * RejectionAndRepairReason33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason33Choice#mmProprietary
	 * RejectionAndRepairReason33Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus9#mmReason
	 * RejectedStatus9.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus10#mmReason
	 * RejectedStatus10.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmLegRejectionReason
	 * SwitchLegReferences2.mmLegRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmRejected
	 * InstructionCancellationRequestStatus11Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmRejected
	 * InstructionProcessingStatus29Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice#mmCode
	 * PendingCancellationReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice#mmProprietary
	 * PendingCancellationReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21#mmReasonCode
	 * RejectedStatusReason21.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason22Choice#mmCode
	 * RejectedReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason22Choice#mmProprietary
	 * RejectedReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#mmRejectionReason
	 * OtherCollateralResponse2.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmRejectionReason
	 * CashCollateralResponse2.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmRejected
	 * InstructionCancellationRequestStatus12Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmRejected
	 * InstructionProcessingStatus30Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason22#mmReasonCode
	 * RejectedStatusReason22.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason23Choice#mmCode
	 * RejectedReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason23Choice#mmProprietary
	 * RejectedReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason6Choice#mmCode
	 * PendingCancellationReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason6Choice#mmProprietary
	 * PendingCancellationReason6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair or rejection status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, RejectionReasonV2Code> mmRejectionReason = new MMBusinessAttribute<StatusReason, RejectionReasonV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(RejectionReason4Choice.mmCode, RejectionReason4Choice.mmProprietary, RejectionReason5.mmCode, RejectionStatus1Choice.mmReason, ProcessingStatus1Choice.mmRejected,
					RejectionReason10Choice.mmCode, RejectionReason10Choice.mmProprietary, RejectionReason10.mmCode, RejectionStatus5Choice.mmReason, ProcessingStatus19Choice.mmRejected, RejectionReason11Choice.mmCode,
					RejectionReason11Choice.mmProprietary, RejectionReason11.mmCode, RejectionStatus8Choice.mmReason, ModificationProcessingStatus2Choice.mmRejected, RejectionAndRepairReason1Choice.mmCode,
					RejectionAndRepairReason1Choice.mmProprietary, ProcessingStatus2Choice.mmRejected, RejectionAndRepairReason9Choice.mmCode, RejectionAndRepairReason9Choice.mmProprietary, ProcessingStatus13Choice.mmRejected,
					RejectionAndRepairReason3Choice.mmCode, RejectionAndRepairReason3Choice.mmProprietary, RejectionAndRepairReason10Choice.mmCode, RejectionAndRepairReason10Choice.mmProprietary, RejectionAndRepairReason18Choice.mmCode,
					RejectionAndRepairReason18Choice.mmProprietary, RejectionAndRepairReason13Choice.mmCode, RejectionAndRepairReason13Choice.mmProprietary, ProcessingStatus20Choice.mmRejected, RejectionReason13Choice.mmCode,
					RejectionReason13Choice.mmProprietary, RejectionReason15.mmCode, RejectionStatus11Choice.mmReason, ProcessingStatus25Choice.mmRejected, RejectionReason12Choice.mmCode, RejectionReason12Choice.mmProprietary,
					RejectionReason14.mmCode, RejectionStatus10Choice.mmReason, ModificationProcessingStatus3Choice.mmRejected, RejectionAndRepairReason19Choice.mmCode, RejectionAndRepairReason19Choice.mmProprietary,
					RejectionAndRepairReason16Choice.mmCode, RejectionAndRepairReason16Choice.mmProprietary, ProcessingStatus26Choice.mmRejected, RejectedReason1Choice.mmCode, RejectedReason1Choice.mmProprietary,
					RejectedStatusReason8.mmReasonCode, RejectedStatus1Choice.mmReason, PendingCancellationReason1Choice.mmCode, PendingCancellationReason1Choice.mmProprietary, InstructionCancellationRequestStatus1Choice.mmRejected,
					RejectedReason2Choice.mmCode, RejectedReason2Choice.mmProprietary, RejectedStatusReason9.mmReasonCode, RejectedStatus2Choice.mmReason, PendingCancellationReason2Choice.mmCode,
					PendingCancellationReason2Choice.mmProprietary, InstructionCancellationRequestStatus2Choice.mmRejected, InstructionCancellationRequestStatus3Choice.mmRejected, InstructionCancellationRequestStatus4Choice.mmRejected,
					InstructionCancellationRequestStatus5Choice.mmRejected, InstructionCancellationRequestStatus6Choice.mmRejected, InstructionProcessingStatus1Choice.mmRejected, InstructionProcessingStatus4Choice.mmRejected,
					InstructionProcessingStatus7Choice.mmRejected, InstructionProcessingStatus8Choice.mmRejected, InstructionProcessingStatus12Choice.mmRejected, InstructionProcessingStatus13Choice.mmRejected,
					ProcessingStatus5Choice.mmRejected, RejectionAndRepairReason7Choice.mmCode, RejectionAndRepairReason7Choice.mmProprietary, ProcessingStatus11Choice.mmRejected, ProcessingStatus14Choice.mmRejected,
					RejectionAndRepairReason11Choice.mmCode, RejectionAndRepairReason11Choice.mmProprietary, ProcessingStatus15Choice.mmRejected, ProcessingStatus18Choice.mmRejected, ProcessingStatus24Choice.mmRejected,
					RejectionReason6Choice.mmCode, RejectionReason6Choice.mmProprietary, RejectionReason7.mmCode, RejectionStatus2Choice.mmReason, ProcessingStatus7Choice.mmRejected, RejectionReason9Choice.mmCode,
					RejectionReason9Choice.mmProprietary, RejectionReason9.mmCode, InstructionProcessingReason1Choice.mmReason, ProcessingStatus17Choice.mmRejected, OrderStatusAndReason3.mmRejected,
					SwitchLegReferences1.mmLegRejectionReason, InstructionRejectionStatus1.mmReason, InstructionRejectionStatus1.mmExtendedReason, InstructionStatus2Choice.mmRejectionStatus, RejectionReason11FormatChoice.mmCode,
					RejectionReason11FormatChoice.mmProprietary, RejectionReason6FormatChoice.mmCode, RejectionReason6FormatChoice.mmProprietary, RejectionReason18FormatChoice.mmCode, RejectionReason18FormatChoice.mmProprietary,
					CorporateActionInstructionRejectionStatus1.mmReason, RejectionReason9FormatChoice.mmCode, RejectionReason9FormatChoice.mmProprietary, RejectionReason8FormatChoice.mmCode, RejectionReason8FormatChoice.mmProprietary,
					RejectionReason19FormatChoice.mmCode, RejectionReason19FormatChoice.mmProprietary, RejectionReason13FormatChoice.mmCode, RejectionReason13FormatChoice.mmProprietary, CorporateActionMovementRejectionStatus1.mmReason,
					RejectionReason14FormatChoice.mmCode, RejectionReason14FormatChoice.mmProprietary, CorporateActionMovementRejectionStatus2.mmReason, RejectionReason15FormatChoice.mmCode, RejectionReason15FormatChoice.mmProprietary,
					CorporateActionStandingInstructionRejectionStatus1.mmReason, RejectionReason10FormatChoice.mmCode, RejectionReason10FormatChoice.mmProprietary, RejectionReason12FormatChoice.mmCode,
					RejectionReason12FormatChoice.mmProprietary, CorporateActionDeactivationInstructionRejectionStatus1.mmReason, RejectionReason7FormatChoice.mmCode, RejectionReason7FormatChoice.mmProprietary,
					CorporateActionDeactivationCancellationRejectionStatus1.mmReason, RejectionAndRepairReason4Choice.mmCode, RejectionAndRepairReason4Choice.mmProprietary, RejectionReason2Choice.mmCode,
					RejectionReason2Choice.mmProprietary, RejectionReason6.mmCode, RejectionStatus3Choice.mmReason, ProcessingStatus3Choice.mmRejected, RejectionReason5Choice.mmCode, RejectionReason5Choice.mmProprietary,
					Reason1Choice.mmRejectionReason, Reason6Choice.mmRejectionReason, RejectionAndRepairReason2Choice.mmCode, RejectionAndRepairReason2Choice.mmProprietary, ProcessingStatus4Choice.mmRejected,
					RejectionStatus2.mmRejectedReason, CollateralProposalResponseType1.mmRejectionReason, CollateralSubstitutionResponse2.mmRejectionReason, RejectionReason8Choice.mmCode, RejectionReason8Choice.mmProprietary,
					RejectionReason8.mmCode, RejectionStatus4Choice.mmReason, ProcessingStatus10Choice.mmRejected, RejectionStatus6Choice.mmReason, ProcessingStatus21Choice.mmRejected, RejectionStatus12Choice.mmReason,
					ProcessingStatus27Choice.mmRejected, RejectionStatus7Choice.mmReason, RejectionStatus9Choice.mmReason, RejectionReason7Choice.mmCode, RejectionReason7Choice.mmProprietary, Reason2Choice.mmRejectionReason,
					Reason10Choice.mmRejectionReason, Reason7Choice.mmRejectionReason, Reason11Choice.mmRejectionReason, RejectionAndRepairReason5Choice.mmCode, RejectionAndRepairReason5Choice.mmProprietary,
					ProcessingStatus8Choice.mmRejected, ProcessingStatus22Choice.mmRejected, ProcessingStatus28Choice.mmRejected, RejectionAndRepairReason6Choice.mmCode, RejectionAndRepairReason6Choice.mmProprietary,
					ProcessingStatus9Choice.mmRejected, RejectionAndRepairReason12Choice.mmCode, RejectionAndRepairReason12Choice.mmProprietary, ProcessingStatus16Choice.mmRejected, RejectionAndRepairReason8Choice.mmCode,
					RejectionAndRepairReason8Choice.mmProprietary, RejectionAndRepairReason14Choice.mmCode, RejectionAndRepairReason14Choice.mmProprietary, RejectionAndRepairReason17Choice.mmCode,
					RejectionAndRepairReason17Choice.mmProprietary, RejectionAndRepairReason20Choice.mmCode, RejectionAndRepairReason20Choice.mmProprietary, RejectionAndRepairReason22Choice.mmCode,
					RejectionAndRepairReason22Choice.mmProprietary, ProcessingStatus32Choice.mmRejected, ProcessingStatus35Choice.mmRejected, ProcessingStatus36Choice.mmRejected, RejectionAndRepairReason21Choice.mmCode,
					RejectionAndRepairReason21Choice.mmProprietary, ProcessingStatus31Choice.mmRejected, RejectionReason4.mmReasonCode, RejectionReason3Choice.mmCode, RejectionReason3Choice.mmProprietary,
					OrderStatusAndReason5.mmRejectionReason, OrderStatus2.mmRejectionReason, Reason12Choice.mmRejectionReason, RejectedStatusReason10.mmReasonCode, InstructionProcessingStatus15Choice.mmRejected,
					RejectedReason5Choice.mmCode, RejectedReason5Choice.mmProprietary, ProcessingStatus38Choice.mmRejected, ProcessingStatus37Choice.mmRejected, RejectionReason18.mmCode, RejectionReason15Choice.mmCode,
					RejectionReason15Choice.mmProprietary, RejectionReason17.mmCode, RejectionReason14Choice.mmCode, RejectionReason14Choice.mmProprietary, RejectionStatus14Choice.mmReason, RejectionReason16Choice.mmCode,
					RejectionReason16Choice.mmProprietary, RejectionStatus13Choice.mmReason, RejectedStatus10Choice.mmReason, RejectionReason19.mmCode, RejectionReason17Choice.mmCode, RejectionReason17Choice.mmProprietary,
					ProcessingStatus39Choice.mmRejected, InstructionProcessingStatus16Choice.mmRejected, RejectedReason6Choice.mmCode, RejectedReason6Choice.mmProprietary, RejectedStatusReason11.mmReasonCode,
					ProcessingStatus40Choice.mmRejected, ProcessingStatus42Choice.mmRejected, RejectionStatus15Choice.mmReason, RejectionReason20.mmCode, RejectedStatus12Choice.mmReason, RejectionReason21.mmCode,
					ProcessingStatus41Choice.mmRejected, RejectionReason18Choice.mmCode, RejectionReason18Choice.mmProprietary, RejectionReason19Choice.mmCode, RejectionReason19Choice.mmProprietary, Reason13Choice.mmRejectionReason,
					RejectionReason21Choice.mmCode, RejectionReason21Choice.mmProprietary, RejectionReason22.mmCode, RejectionReason20Choice.mmCode, RejectionReason20Choice.mmProprietary, RejectionStatus16Choice.mmReason,
					ReportItemRejectionReason1Choice.mmCode, ReportItemRejectionReason1Choice.mmProprietary, InstructionProcessingStatus20Choice.mmRejected, InstructionCancellationRequestStatus7Choice.mmRejected,
					RejectedStatusReason13.mmReasonCode, RejectedStatus14Choice.mmReason, RejectedStatusReason14.mmReasonCode, RejectedReason10Choice.mmCode, RejectedReason10Choice.mmProprietary, RejectedReason9Choice.mmCode,
					RejectedReason9Choice.mmProprietary, ProcessingStatus44Choice.mmRejected, ModificationProcessingStatus4Choice.mmRejected, ProcessingStatus45Choice.mmRejected, Reason14Choice.mmRejectionReason,
					OtherCollateralResponse1.mmRejectionReason, CashCollateralResponse1.mmRejectionReason, SecuritiesCollateralResponse1.mmRejectionReason, InstructionProcessingStatus21Choice.mmRejected,
					InstructionCancellationRequestStatus8Choice.mmRejected, RejectedStatus15Choice.mmReason, RejectedStatusReason15.mmReasonCode, RejectedReason11Choice.mmCode, RejectedReason11Choice.mmProprietary,
					RejectedStatusReason16.mmReasonCode, RejectedReason12Choice.mmCode, RejectedReason12Choice.mmProprietary, ModificationProcessingStatus6Choice.mmRejected, ProcessingStatus47Choice.mmRejected,
					ProcessingStatus46Choice.mmRejected, Reason15Choice.mmRejectionReason, ModificationProcessingStatus5Choice.mmRejected, ProcessingStatus55Choice.mmRejected, ProcessingStatus50Choice.mmRejected,
					ProcessingStatus48Choice.mmRejected, ModificationProcessingStatus7Choice.mmRejected, ProcessingStatus54Choice.mmRejected, ProcessingStatus51Choice.mmRejected, RejectionReason26.mmCode, RejectionReason24Choice.mmCode,
					RejectionReason24Choice.mmProprietary, RejectionStatus17Choice.mmReason, RejectionReason25.mmCode, RejectionReason22Choice.mmCode, RejectionReason22Choice.mmProprietary, RejectionReason23Choice.mmCode,
					RejectionReason23Choice.mmProprietary, ProcessingStatus56Choice.mmRejected, RejectedStatus17Choice.mmReason, RejectionReason26Choice.mmCode, RejectionReason26Choice.mmProprietary, RejectionStatus18Choice.mmReason,
					RejectionReason25Choice.mmCode, RejectionReason25Choice.mmProprietary, ProcessingStatus49Choice.mmRejected, RejectionStatus21Choice.mmReason, RejectionReason30.mmCode, RejectionReason27.mmCode,
					RejectionStatus20Choice.mmReason, RejectionAndRepairReason23Choice.mmCode, RejectionAndRepairReason23Choice.mmProprietary, RejectionAndRepairReason25Choice.mmCode, RejectionAndRepairReason25Choice.mmProprietary,
					ProcessingStatus53Choice.mmRejected, RejectionAndRepairReason24Choice.mmCode, RejectionAndRepairReason24Choice.mmProprietary, RejectionReason27Choice.mmCode, RejectionReason27Choice.mmProprietary,
					RejectionAndRepairReason26Choice.mmCode, RejectionAndRepairReason26Choice.mmProprietary, RejectionReason28.mmCode, Reason16Choice.mmRejectionReason, RejectionStatus19Choice.mmReason,
					InstructionCancellationRequestStatus9Choice.mmRejected, InstructionProcessingStatus24Choice.mmRejected, PendingCancellationReason3Choice.mmCode, PendingCancellationReason3Choice.mmProprietary,
					RejectedStatusReason17.mmReasonCode, RejectedReason14Choice.mmCode, RejectedReason14Choice.mmProprietary, RejectedStatus18Choice.mmReason, RejectedStatusReason18.mmReasonCode, RejectedReason13Choice.mmCode,
					RejectedReason13Choice.mmProprietary, InstructionCancellationRequestStatus10Choice.mmRejected, InstructionProcessingStatus25Choice.mmRejected, RejectedStatus20Choice.mmReason, PendingCancellationReason4Choice.mmCode,
					PendingCancellationReason4Choice.mmProprietary, RejectedStatusReason19.mmReasonCode, RejectedReason18Choice.mmCode, RejectedReason18Choice.mmProprietary, RejectedStatusReason20.mmReasonCode,
					RejectedReason19Choice.mmCode, RejectedReason19Choice.mmProprietary, ProcessingStatus57Choice.mmRejected, ProcessingStatus65Choice.mmRejected, ProcessingStatus58Choice.mmRejected, ProcessingStatus64Choice.mmRejected,
					ProcessingStatus63Choice.mmRejected, RejectionReason37.mmCode, RejectionReason31Choice.mmCode, RejectionReason31Choice.mmProprietary, RejectionStatus22Choice.mmReason, RejectionReason34.mmCode,
					RejectionStatus27Choice.mmReason, Reason17Choice.mmRejectionReason, RejectionReason34Choice.mmCode, RejectionReason34Choice.mmProprietary, RejectionAndRepairReason29Choice.mmCode,
					RejectionAndRepairReason29Choice.mmProprietary, RejectionStatus23Choice.mmReason, RejectionReason36.mmCode, RejectedStatus22Choice.mmReason, RejectionReason35.mmCode, ProcessingStatus59Choice.mmRejected,
					RejectionReason30Choice.mmCode, RejectionReason30Choice.mmProprietary, RejectionAndRepairReason31Choice.mmCode, RejectionAndRepairReason31Choice.mmProprietary, RejectionStatus26Choice.mmReason,
					RejectionReason28Choice.mmCode, RejectionReason28Choice.mmProprietary, ModificationProcessingStatus8Choice.mmRejected, RejectionStatus24Choice.mmReason, ProcessingStatus61Choice.mmRejected, RejectionReason39.mmCode,
					RejectionReason33Choice.mmCode, RejectionReason33Choice.mmProprietary, RejectionReason29Choice.mmCode, RejectionReason29Choice.mmProprietary, ProcessingStatus60Choice.mmRejected, RejectionAndRepairReason28Choice.mmCode,
					RejectionAndRepairReason28Choice.mmProprietary, RejectionAndRepairReason27Choice.mmCode, RejectionAndRepairReason27Choice.mmProprietary, ProcessingStatus72Choice.mmRejected, ProcessingStatus71Choice.mmRejected,
					ProcessingStatus69Choice.mmRejected, ProcessingStatus67Choice.mmRejected, RejectionAndRepairReason32Choice.mmCode, RejectionAndRepairReason32Choice.mmProprietary, RejectionAndRepairReason34Choice.mmCode,
					RejectionAndRepairReason34Choice.mmProprietary, RejectionAndRepairReason33Choice.mmCode, RejectionAndRepairReason33Choice.mmProprietary, RejectedStatus9.mmReason, RejectedStatus10.mmReason,
					SwitchLegReferences2.mmLegRejectionReason, InstructionCancellationRequestStatus11Choice.mmRejected, InstructionProcessingStatus29Choice.mmRejected, PendingCancellationReason5Choice.mmCode,
					PendingCancellationReason5Choice.mmProprietary, RejectedStatusReason21.mmReasonCode, RejectedReason22Choice.mmCode, RejectedReason22Choice.mmProprietary, OtherCollateralResponse2.mmRejectionReason,
					CashCollateralResponse2.mmRejectionReason, InstructionCancellationRequestStatus12Choice.mmRejected, InstructionProcessingStatus30Choice.mmRejected, RejectedStatusReason22.mmReasonCode, RejectedReason23Choice.mmCode,
					RejectedReason23Choice.mmProprietary, PendingCancellationReason6Choice.mmCode, PendingCancellationReason6Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}

		@Override
		public RejectionReasonV2Code getValue(StatusReason obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(StatusReason obj, RejectionReasonV2Code value) {
			obj.setRejectionReason(value);
		}
	};
	protected AcknowledgementReasonCode acknowledgedAcceptedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason4Choice#mmCode
	 * AcknowledgementReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason4Choice#mmProprietary
	 * AcknowledgementReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason3#mmCode
	 * AcknowledgementReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus3Choice#mmReason
	 * AcknowledgedAcceptedStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmAcknowledgedAccepted
	 * ProcessingStatus1Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice#mmReason
	 * AcknowledgedAcceptedStatus7Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmAcknowledgedAccepted
	 * ProcessingStatus19Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason9Choice#mmCode
	 * AcknowledgementReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason9Choice#mmProprietary
	 * AcknowledgementReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason7#mmCode
	 * AcknowledgementReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice#mmReason
	 * AcknowledgedAcceptedStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus2Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason1Choice#mmCode
	 * AcknowledgementReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason1Choice#mmProprietary
	 * AcknowledgementReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason1#mmCode
	 * AcknowledgementReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus1Choice#mmReason
	 * AcknowledgedAcceptedStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmAcknowledgedAccepted
	 * ProcessingStatus2Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmAcknowledgedAccepted
	 * ProcessingStatus13Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus12Choice#mmReason
	 * AcknowledgedAcceptedStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmAcknowledgedAccepted
	 * ProcessingStatus20Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason8Choice#mmCode
	 * AcknowledgementReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason8Choice#mmProprietary
	 * AcknowledgementReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason6#mmCode
	 * AcknowledgementReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice#mmReason
	 * AcknowledgedAcceptedStatus20Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmAcknowledgedAccepted
	 * ProcessingStatus25Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason10Choice#mmCode
	 * AcknowledgementReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason10Choice#mmProprietary
	 * AcknowledgementReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason8#mmCode
	 * AcknowledgementReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice#mmReason
	 * AcknowledgedAcceptedStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus3Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason6Choice#mmCode
	 * AcknowledgementReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason6Choice#mmProprietary
	 * AcknowledgementReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason4#mmCode
	 * AcknowledgementReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus18Choice#mmReason
	 * AcknowledgedAcceptedStatus18Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmAcknowledgedAccepted
	 * ProcessingStatus26Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#mmAcknowledgedAccepted
	 * ProcessingStatus5Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus6Choice#mmReason
	 * AcknowledgedAcceptedStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#mmAcknowledgedAccepted
	 * ProcessingStatus11Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#mmAcknowledgedAccepted
	 * ProcessingStatus14Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#mmAcknowledgedAccepted
	 * ProcessingStatus15Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#mmAcknowledgedAccepted
	 * ProcessingStatus18Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#mmAcknowledgedAccepted
	 * ProcessingStatus24Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#mmAcknowledgedAccepted
	 * ProcessingStatus6Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#mmAcknowledgedAccepted
	 * ProcessingStatus12Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#mmAcknowledgedAccepted
	 * ProcessingStatus23Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#mmAcknowledgedAccepted
	 * ProcessingStatus29Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmAcknowledgedAccepted
	 * ProcessingStatus7Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus3Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus6Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus10Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus11Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmAcknowledgedAccepted
	 * ProcessingStatus17Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus1Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmAcknowledgedAccepted
	 * ProcessingStatus3Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason2Choice#mmCode
	 * AcknowledgementReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason2Choice#mmProprietary
	 * AcknowledgementReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmAcknowledgedAcceptedReason
	 * Reason1Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmAcknowledgedAcceptedReason
	 * Reason6Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice#mmAcknowledgedAccepted
	 * ProcessingStatus4Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmAcknowledgedAccepted
	 * ProcessingStatus10Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmAcknowledgedAccepted
	 * ProcessingStatus21Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus10Choice#mmReason
	 * AcknowledgedAcceptedStatus10Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmAcknowledgedAccepted
	 * ProcessingStatus27Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus16Choice#mmReason
	 * AcknowledgedAcceptedStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason5Choice#mmCode
	 * AcknowledgementReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason5Choice#mmProprietary
	 * AcknowledgementReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmAcknowledgedAcceptedReason
	 * Reason2Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmAcknowledgedAcceptedReason
	 * Reason10Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmAcknowledgedAcceptedReason
	 * Reason7Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmAcknowledgedAcceptedReason
	 * Reason11Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus4Choice#mmReason
	 * AcknowledgedAcceptedStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus8Choice#mmAcknowledgedAccepted
	 * ProcessingStatus8Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus22Choice#mmAcknowledgedAccepted
	 * ProcessingStatus22Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus28Choice#mmAcknowledgedAccepted
	 * ProcessingStatus28Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmAcknowledgedAccepted
	 * ProcessingStatus9Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmAcknowledgedAccepted
	 * ProcessingStatus16Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus2Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus3Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus4Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#mmAcknowledgedAccepted
	 * ProcessingStatus34Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmAcknowledgedAccepted
	 * ProcessingStatus32Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#mmAcknowledgedAccepted
	 * ProcessingStatus35Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmAcknowledgedAccepted
	 * ProcessingStatus36Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmAcknowledgedAccepted
	 * ProcessingStatus31Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmAcknowledgedAcceptedReason
	 * Reason12Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus14Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmAcknowledgedAccepted
	 * ProcessingStatus38Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmAcknowledgedAccepted
	 * ProcessingStatus37Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason4#mmReasonCode
	 * AcceptedStatusReason4.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason4Choice#mmCode
	 * AcceptedReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason4Choice#mmProprietary
	 * AcceptedReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice#mmAccepted
	 * ProcessingStatus39Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmAcknowledgedAccepted
	 * ProcessingStatus40Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmAcknowledgedAccepted
	 * ProcessingStatus42Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus17Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason6Choice#mmCode
	 * AcceptedReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason6Choice#mmProprietary
	 * AcceptedReason6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason6#mmReasonCode
	 * AcceptedStatusReason6.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus41Choice#mmAccepted
	 * ProcessingStatus41Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmAcknowledgedAcceptedReason
	 * Reason13Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason2Choice#mmCode
	 * ReceivedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivedStatusReason1#mmReason
	 * ReceivedStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason1Choice#mmReason
	 * ReceivedReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1#mmReason
	 * PendingProcessingStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice#mmReason
	 * PendingProcessingReason9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason8Choice#mmCode
	 * PendingProcessingReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason8Choice#mmReason
	 * RejectedReason8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason7Choice#mmCode
	 * RejectedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason7#mmReason
	 * AcceptedStatusReason7.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason8Choice#mmReason
	 * AcceptedReason8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason12#mmReason
	 * RejectedStatusReason12.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason7Choice#mmCode
	 * AcceptedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmAccepted
	 * ReportItemStatus1Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#mmAcknowledgedAccepted
	 * ProcessingStatus44Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus4Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmAcknowledgedAccepted
	 * ProcessingStatus45Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmAcknowledgedAcceptedReason
	 * Reason14Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus6Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmAcknowledgedAccepted
	 * ProcessingStatus47Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#mmAcknowledgedAccepted
	 * ProcessingStatus46Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmAcknowledgedAcceptedReason
	 * Reason15Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason11Choice#mmCode
	 * AcknowledgementReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason11Choice#mmProprietary
	 * AcknowledgementReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus5Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#mmAcknowledgedAccepted
	 * ProcessingStatus55Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmAcknowledgedAccepted
	 * ProcessingStatus50Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmAcknowledgedAccepted
	 * ProcessingStatus48Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus7Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmAcknowledgedAccepted
	 * ProcessingStatus54Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmAcknowledgedAccepted
	 * ProcessingStatus51Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason9Choice#mmCode
	 * AcceptedReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason9Choice#mmProprietary
	 * AcceptedReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason8#mmReasonCode
	 * AcceptedStatusReason8.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmAcknowledgedAccepted
	 * ProcessingStatus52Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice#mmReason
	 * AcknowledgedAcceptedStatus21Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason9#mmCode
	 * AcknowledgementReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus56Choice#mmAccepted
	 * ProcessingStatus56Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice#mmCode
	 * AcknowledgementReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice#mmProprietary
	 * AcknowledgementReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice#mmReason
	 * AcknowledgedAcceptedStatus23Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason11#mmCode
	 * AcknowledgementReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice#mmCode
	 * AcknowledgementReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice#mmProprietary
	 * AcknowledgementReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmAcknowledgedAccepted
	 * ProcessingStatus49Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice#mmCode
	 * AcknowledgementReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice#mmProprietary
	 * AcknowledgementReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus22Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason12#mmCode
	 * AcknowledgementReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmAcknowledgedAccepted
	 * ProcessingStatus53Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice#mmReason
	 * AcknowledgedAcceptedStatus22Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice#mmReason
	 * AcknowledgedAcceptedStatus24Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmAcknowledgedAcceptedReason
	 * Reason16Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmAcknowledgedAccepted
	 * ProcessingStatus57Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmAcknowledgedAccepted
	 * ProcessingStatus65Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#mmAcknowledgedAccepted
	 * ProcessingStatus58Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus64Choice#mmAcknowledgedAccepted
	 * ProcessingStatus64Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus6Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmAcknowledgedAccepted
	 * ProcessingStatus63Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmAcknowledgedAcceptedReason
	 * Reason17Choice.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmAcknowledgedAccepted
	 * ProcessingStatus62Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus59Choice#mmAccepted
	 * ProcessingStatus59Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason21Choice#mmCode
	 * AcknowledgementReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason21Choice#mmProprietary
	 * AcknowledgementReason21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus30Choice#mmReason
	 * AcknowledgedAcceptedStatus30Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason18#mmCode
	 * AcknowledgementReason18.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus27Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason11#mmReasonCode
	 * AcceptedStatusReason11.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason12Choice#mmCode
	 * AcceptedReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason12Choice#mmProprietary
	 * AcceptedReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus8Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmAcknowledgedAccepted
	 * ProcessingStatus61Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus31Choice#mmReason
	 * AcknowledgedAcceptedStatus31Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason13#mmCode
	 * AcknowledgementReason13.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason16Choice#mmCode
	 * AcknowledgementReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason16Choice#mmProprietary
	 * AcknowledgementReason16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice#mmReason
	 * AcknowledgedAcceptedStatus25Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus27Choice#mmReason
	 * AcknowledgedAcceptedStatus27Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmAcknowledgedAccepted
	 * ProcessingStatus60Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason22Choice#mmCode
	 * AcknowledgementReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason22Choice#mmProprietary
	 * AcknowledgementReason22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason19#mmCode
	 * AcknowledgementReason19.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus72Choice#mmAcknowledgedAccepted
	 * ProcessingStatus72Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus71Choice#mmAcknowledgedAccepted
	 * ProcessingStatus71Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus69Choice#mmAcknowledgedAccepted
	 * ProcessingStatus69Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus67Choice#mmAcknowledgedAccepted
	 * ProcessingStatus67Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus66Choice#mmAcknowledgedAccepted
	 * ProcessingStatus66Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3#mmReason
	 * ConditionallyAcceptedStatusReason3.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<StatusReason, AcknowledgementReasonCode> mmAcknowledgedAcceptedReason = new MMBusinessAttribute<StatusReason, AcknowledgementReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AcknowledgementReason4Choice.mmCode, AcknowledgementReason4Choice.mmProprietary, AcknowledgementReason3.mmCode, AcknowledgedAcceptedStatus3Choice.mmReason,
					ProcessingStatus1Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus7Choice.mmReason, ProcessingStatus19Choice.mmAcknowledgedAccepted, AcknowledgementReason9Choice.mmCode,
					AcknowledgementReason9Choice.mmProprietary, AcknowledgementReason7.mmCode, AcknowledgedAcceptedStatus14Choice.mmReason, ModificationProcessingStatus2Choice.mmAcknowledgedAccepted, AcknowledgementReason1Choice.mmCode,
					AcknowledgementReason1Choice.mmProprietary, AcknowledgementReason1.mmCode, AcknowledgedAcceptedStatus1Choice.mmReason, ProcessingStatus2Choice.mmAcknowledgedAccepted, ProcessingStatus13Choice.mmAcknowledgedAccepted,
					AcknowledgedAcceptedStatus12Choice.mmReason, ProcessingStatus20Choice.mmAcknowledgedAccepted, AcknowledgementReason8Choice.mmCode, AcknowledgementReason8Choice.mmProprietary, AcknowledgementReason6.mmCode,
					AcknowledgedAcceptedStatus20Choice.mmReason, ProcessingStatus25Choice.mmAcknowledgedAccepted, AcknowledgementReason10Choice.mmCode, AcknowledgementReason10Choice.mmProprietary, AcknowledgementReason8.mmCode,
					AcknowledgedAcceptedStatus15Choice.mmReason, ModificationProcessingStatus3Choice.mmAcknowledgedAccepted, AcknowledgementReason6Choice.mmCode, AcknowledgementReason6Choice.mmProprietary, AcknowledgementReason4.mmCode,
					AcknowledgedAcceptedStatus18Choice.mmReason, ProcessingStatus26Choice.mmAcknowledgedAccepted, ProcessingStatus5Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus6Choice.mmReason,
					ProcessingStatus11Choice.mmAcknowledgedAccepted, ProcessingStatus14Choice.mmAcknowledgedAccepted, ProcessingStatus15Choice.mmAcknowledgedAccepted, ProcessingStatus18Choice.mmAcknowledgedAccepted,
					ProcessingStatus24Choice.mmAcknowledgedAccepted, ProcessingStatus6Choice.mmAcknowledgedAccepted, ProcessingStatus12Choice.mmAcknowledgedAccepted, ProcessingStatus23Choice.mmAcknowledgedAccepted,
					ProcessingStatus29Choice.mmAcknowledgedAccepted, ProcessingStatus7Choice.mmAcknowledgedAccepted, InstructionProcessingStatus3Choice.mmAcknowledgedAccepted, InstructionProcessingStatus6Choice.mmAcknowledgedAccepted,
					InstructionProcessingStatus10Choice.mmAcknowledgedAccepted, InstructionProcessingStatus11Choice.mmAcknowledgedAccepted, ProcessingStatus17Choice.mmAcknowledgedAccepted,
					IntraPositionProcessingStatus1Choice.mmAcknowledgedAccepted, ProcessingStatus3Choice.mmAcknowledgedAccepted, AcknowledgementReason2Choice.mmCode, AcknowledgementReason2Choice.mmProprietary,
					Reason1Choice.mmAcknowledgedAcceptedReason, Reason6Choice.mmAcknowledgedAcceptedReason, ProcessingStatus4Choice.mmAcknowledgedAccepted, ProcessingStatus10Choice.mmAcknowledgedAccepted,
					ProcessingStatus21Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus10Choice.mmReason, ProcessingStatus27Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus16Choice.mmReason,
					AcknowledgementReason5Choice.mmCode, AcknowledgementReason5Choice.mmProprietary, Reason2Choice.mmAcknowledgedAcceptedReason, Reason10Choice.mmAcknowledgedAcceptedReason, Reason7Choice.mmAcknowledgedAcceptedReason,
					Reason11Choice.mmAcknowledgedAcceptedReason, AcknowledgedAcceptedStatus4Choice.mmReason, ProcessingStatus8Choice.mmAcknowledgedAccepted, ProcessingStatus22Choice.mmAcknowledgedAccepted,
					ProcessingStatus28Choice.mmAcknowledgedAccepted, ProcessingStatus9Choice.mmAcknowledgedAccepted, ProcessingStatus16Choice.mmAcknowledgedAccepted, IntraPositionProcessingStatus2Choice.mmAcknowledgedAccepted,
					IntraPositionProcessingStatus3Choice.mmAcknowledgedAccepted, IntraPositionProcessingStatus4Choice.mmAcknowledgedAccepted, ProcessingStatus34Choice.mmAcknowledgedAccepted, ProcessingStatus32Choice.mmAcknowledgedAccepted,
					ProcessingStatus35Choice.mmAcknowledgedAccepted, ProcessingStatus36Choice.mmAcknowledgedAccepted, ProcessingStatus31Choice.mmAcknowledgedAccepted, Reason12Choice.mmAcknowledgedAcceptedReason,
					InstructionProcessingStatus14Choice.mmAcknowledgedAccepted, ProcessingStatus38Choice.mmAcknowledgedAccepted, ProcessingStatus37Choice.mmAcknowledgedAccepted, AcceptedStatusReason4.mmReasonCode,
					AcceptedReason4Choice.mmCode, AcceptedReason4Choice.mmProprietary, ProcessingStatus39Choice.mmAccepted, ProcessingStatus40Choice.mmAcknowledgedAccepted, ProcessingStatus42Choice.mmAcknowledgedAccepted,
					InstructionProcessingStatus17Choice.mmAcknowledgedAccepted, AcceptedReason6Choice.mmCode, AcceptedReason6Choice.mmProprietary, AcceptedStatusReason6.mmReasonCode, ProcessingStatus41Choice.mmAccepted,
					Reason13Choice.mmAcknowledgedAcceptedReason, ReceivedReason2Choice.mmCode, ReceivedStatusReason1.mmReason, ReceivedReason1Choice.mmReason, PendingProcessingStatusReason1.mmReason,
					PendingProcessingReason9Choice.mmReason, PendingProcessingReason8Choice.mmCode, RejectedReason8Choice.mmReason, RejectedReason7Choice.mmCode, AcceptedStatusReason7.mmReason, AcceptedReason8Choice.mmReason,
					RejectedStatusReason12.mmReason, AcceptedReason7Choice.mmCode, ReportItemStatus1Choice.mmAccepted, ProcessingStatus44Choice.mmAcknowledgedAccepted, ModificationProcessingStatus4Choice.mmAcknowledgedAccepted,
					ProcessingStatus45Choice.mmAcknowledgedAccepted, Reason14Choice.mmAcknowledgedAcceptedReason, ModificationProcessingStatus6Choice.mmAcknowledgedAccepted, ProcessingStatus47Choice.mmAcknowledgedAccepted,
					ProcessingStatus46Choice.mmAcknowledgedAccepted, Reason15Choice.mmAcknowledgedAcceptedReason, AcknowledgementReason11Choice.mmCode, AcknowledgementReason11Choice.mmProprietary,
					ModificationProcessingStatus5Choice.mmAcknowledgedAccepted, ProcessingStatus55Choice.mmAcknowledgedAccepted, IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted, ProcessingStatus50Choice.mmAcknowledgedAccepted,
					ProcessingStatus48Choice.mmAcknowledgedAccepted, ModificationProcessingStatus7Choice.mmAcknowledgedAccepted, ProcessingStatus54Choice.mmAcknowledgedAccepted, ProcessingStatus51Choice.mmAcknowledgedAccepted,
					AcceptedReason9Choice.mmCode, AcceptedReason9Choice.mmProprietary, AcceptedStatusReason8.mmReasonCode, ProcessingStatus52Choice.mmAcknowledgedAccepted, AcknowledgedAcceptedStatus21Choice.mmReason,
					AcknowledgementReason9.mmCode, ProcessingStatus56Choice.mmAccepted, AcknowledgementReason12Choice.mmCode, AcknowledgementReason12Choice.mmProprietary, AcknowledgedAcceptedStatus23Choice.mmReason,
					AcknowledgementReason11.mmCode, AcknowledgementReason15Choice.mmCode, AcknowledgementReason15Choice.mmProprietary, ProcessingStatus49Choice.mmAcknowledgedAccepted, AcknowledgementReason14Choice.mmCode,
					AcknowledgementReason14Choice.mmProprietary, InstructionProcessingStatus22Choice.mmAcknowledgedAccepted, AcknowledgementReason12.mmCode, ProcessingStatus53Choice.mmAcknowledgedAccepted,
					AcknowledgedAcceptedStatus22Choice.mmReason, AcknowledgedAcceptedStatus24Choice.mmReason, Reason16Choice.mmAcknowledgedAcceptedReason, ProcessingStatus57Choice.mmAcknowledgedAccepted,
					ProcessingStatus65Choice.mmAcknowledgedAccepted, ProcessingStatus58Choice.mmAcknowledgedAccepted, ProcessingStatus64Choice.mmAcknowledgedAccepted, IntraPositionProcessingStatus6Choice.mmAcknowledgedAccepted,
					ProcessingStatus63Choice.mmAcknowledgedAccepted, Reason17Choice.mmAcknowledgedAcceptedReason, ProcessingStatus62Choice.mmAcknowledgedAccepted, ProcessingStatus59Choice.mmAccepted, AcknowledgementReason21Choice.mmCode,
					AcknowledgementReason21Choice.mmProprietary, AcknowledgedAcceptedStatus30Choice.mmReason, AcknowledgementReason18.mmCode, InstructionProcessingStatus27Choice.mmAcknowledgedAccepted, AcceptedStatusReason11.mmReasonCode,
					AcceptedReason12Choice.mmCode, AcceptedReason12Choice.mmProprietary, ModificationProcessingStatus8Choice.mmAcknowledgedAccepted, ProcessingStatus61Choice.mmAcknowledgedAccepted,
					AcknowledgedAcceptedStatus31Choice.mmReason, AcknowledgementReason13.mmCode, AcknowledgementReason16Choice.mmCode, AcknowledgementReason16Choice.mmProprietary, AcknowledgedAcceptedStatus25Choice.mmReason,
					AcknowledgedAcceptedStatus27Choice.mmReason, ProcessingStatus60Choice.mmAcknowledgedAccepted, AcknowledgementReason22Choice.mmCode, AcknowledgementReason22Choice.mmProprietary, AcknowledgementReason19.mmCode,
					ProcessingStatus72Choice.mmAcknowledgedAccepted, ProcessingStatus71Choice.mmAcknowledgedAccepted, ProcessingStatus69Choice.mmAcknowledgedAccepted, ProcessingStatus67Choice.mmAcknowledgedAccepted,
					ProcessingStatus66Choice.mmAcknowledgedAccepted, ConditionallyAcceptedStatusReason3.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}

		@Override
		public AcknowledgementReasonCode getValue(StatusReason obj) {
			return obj.getAcknowledgedAcceptedReason();
		}

		@Override
		public void setValue(StatusReason obj, AcknowledgementReasonCode value) {
			obj.setAcknowledgedAcceptedReason(value);
		}
	};
	protected RegisteredContract relatedClosureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
	 * RegisteredContract.mmClosureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related reason of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<StatusReason, RegisteredContract> mmRelatedClosureReason = new MMBusinessAssociationEnd<StatusReason, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmClosureReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(StatusReason obj) {
			return obj.getRelatedClosureReason();
		}

		@Override
		public void setValue(StatusReason obj, RegisteredContract value) {
			obj.setRelatedClosureReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedStatusReason, Status.mmStatusReason, RegisteredContract.mmClosureReason);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryReason1.mmReason, ProprietaryReason2.mmReason, ReturnReason1Choice.mmCode, ReturnReason1Choice.mmProprietary, ReturnReason5Choice.mmCode,
						ReturnReason5Choice.mmProprietary, ReversalReasonInformation6.mmReason, PaymentReversalReason7.mmReason, AmendmentReasonInformation1.mmReason, PaymentReturnReason1.mmReason, InRepairStatusReason3.mmReason,
						TransferUnmatchedStatus.mmReason, TransferUnmatchedStatus2.mmReason, TransferUnmatchedStatus2.mmExtendedReason, FailedSettlementStatus1.mmDataSourceScheme, RejectionReason1Choice.mmGlobalRejectionReason,
						ReturnReason3Choice.mmCode, ReturnReason3Choice.mmProprietary, ReturnReason4Choice.mmCode, ReturnReason4Choice.mmProprietary, Reason3.mmReason, Reason3Choice.mmReason, ProprietaryReason4.mmReason,
						CancellationStatusAndReason3.mmStatus, TransferUnmatchedStatus3Choice.mmReason, TransferUnmatchedStatus3Choice.mmExtendedReason, FailedSettlementStatus2Choice.mmDataSourceScheme, Status21Choice.mmRejected,
						Status21Choice.mmComplete, CancelledCompleteReason1.mmAdditionalReasonInformation, ProprietaryReason5.mmReason, Reason4.mmReason, Reason18Choice.mmReason, ClosedStatusReason1.mmCode, ProformaStatusReason1.mmCode,
						DisabledStatusReason1.mmCode, EnabledStatusReason1.mmCode, SuspendedStatusReason4.mmReason, InRepairStatusReason4.mmReason, CancellationStatusAndReason4.mmStatus, TransferReference12.mmReversalReason,
						PaymentReturnReason4.mmReason, PaymentReversalReason8.mmReason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.StatusReason.mmReason, com.tools20022.repository.entity.StatusReason.mmNoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.mmDataSourceScheme, com.tools20022.repository.entity.StatusReason.mmRejectedStatusReason, com.tools20022.repository.entity.StatusReason.mmFailingReason,
						com.tools20022.repository.entity.StatusReason.mmCancellationReason, com.tools20022.repository.entity.StatusReason.mmPendingReason, com.tools20022.repository.entity.StatusReason.mmRejectionReason,
						com.tools20022.repository.entity.StatusReason.mmAcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.mmRelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(BlockedReason1Choice.mmObject(), RejectedReason3Choice.mmObject(), ProprietaryStatusJustification.mmObject(), ProprietaryReason1.mmObject(), NoSpecifiedReason1.mmObject(),
						ProprietaryReason2.mmObject(), ReturnReason1Choice.mmObject(), ReturnReason5Choice.mmObject(), PaymentReturnReason2.mmObject(), ReversalReasonInformation6.mmObject(), PaymentReversalReason7.mmObject(),
						StatusReason6Choice.mmObject(), AmendmentReasonInformation1.mmObject(), MandateAmendmentReason1.mmObject(), PaymentReturnReason1.mmObject(), InRepairStatusReason1.mmObject(), InRepairStatusReason3.mmObject(),
						RejectionReason1.mmObject(), TransferUnmatchedStatusReason1.mmObject(), TransferUnmatchedStatus.mmObject(), TransferUnmatchedStatus2.mmObject(), RejectedStatus8Choice.mmObject(), FailedSettlementStatus1.mmObject(),
						CancellationPendingStatus1.mmObject(), InstructionRejectionStatus1.mmObject(), RejectedStatusReason9Choice.mmObject(), RejectedCancellationStatusReason1Choice.mmObject(), RejectionReason2.mmObject(),
						Reason2.mmObject(), RejectionReason1Choice.mmObject(), ReturnReason3Choice.mmObject(), ReturnReason4Choice.mmObject(), ProprietaryReason3.mmObject(), Reason3.mmObject(), Reason3Choice.mmObject(),
						RejectionReason4.mmObject(), RejectionReason3Choice.mmObject(), RejectedReason4Choice.mmObject(), TechnicalError1Choice.mmObject(), ProprietaryReason4.mmObject(), TransferUnmatchedStatus3Choice.mmObject(),
						FailedSettlementStatus2Choice.mmObject(), CancellationPendingStatus7Choice.mmObject(), RejectedReason17Choice.mmObject(), CancelledCompleteReason1.mmObject(), RejectedReason16Choice.mmObject(),
						RejectedReason15Choice.mmObject(), ProprietaryReason5.mmObject(), SystemEventType3Choice.mmObject(), Reason4.mmObject(), Reason18Choice.mmObject(), ClosedStatusReason1.mmObject(), ProformaStatusReason1.mmObject(),
						DisabledStatusReason1.mmObject(), EnabledStatusReason1.mmObject(), SuspendedStatusReason4.mmObject(), BlockedReason2Choice.mmObject(), ConditionallyAcceptedStatusReason3.mmObject(), InRepairStatusReason4.mmObject(),
						PendingStatusReason14.mmObject(), PendingOpeningStatusReason1.mmObject(), ClosurePendingStatusReason1.mmObject(), ProprietaryStatusJustification1.mmObject(), PaymentReturnReason4.mmObject(),
						PaymentReversalReason8.mmObject(), PaymentReturnReason3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Status> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public StatusReason setStatus(Status status) {
		this.status = status;
		return this;
	}

	public Max35Text getReason() {
		return reason;
	}

	public StatusReason setReason(Max35Text reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public StatusReason setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}

	public List<GenericIdentification> getDataSourceScheme() {
		return dataSourceScheme == null ? dataSourceScheme = new ArrayList<>() : dataSourceScheme;
	}

	public StatusReason setDataSourceScheme(List<GenericIdentification> dataSourceScheme) {
		this.dataSourceScheme = Objects.requireNonNull(dataSourceScheme);
		return this;
	}

	public RejectedStatusReasonCode getRejectedStatusReason() {
		return rejectedStatusReason;
	}

	public StatusReason setRejectedStatusReason(RejectedStatusReasonCode rejectedStatusReason) {
		this.rejectedStatusReason = Objects.requireNonNull(rejectedStatusReason);
		return this;
	}

	public PendingFailingReasonCode getFailingReason() {
		return failingReason;
	}

	public StatusReason setFailingReason(PendingFailingReasonCode failingReason) {
		this.failingReason = Objects.requireNonNull(failingReason);
		return this;
	}

	public CancelledStatusReasonV2Code getCancellationReason() {
		return cancellationReason;
	}

	public StatusReason setCancellationReason(CancelledStatusReasonV2Code cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public PendingFailingReasonCode getPendingReason() {
		return pendingReason;
	}

	public StatusReason setPendingReason(PendingFailingReasonCode pendingReason) {
		this.pendingReason = Objects.requireNonNull(pendingReason);
		return this;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return rejectionReason;
	}

	public StatusReason setRejectionReason(RejectionReasonV2Code rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public AcknowledgementReasonCode getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason;
	}

	public StatusReason setAcknowledgedAcceptedReason(AcknowledgementReasonCode acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = Objects.requireNonNull(acknowledgedAcceptedReason);
		return this;
	}

	public RegisteredContract getRelatedClosureReason() {
		return relatedClosureReason;
	}

	public StatusReason setRelatedClosureReason(RegisteredContract relatedClosureReason) {
		this.relatedClosureReason = Objects.requireNonNull(relatedClosureReason);
		return this;
	}
}