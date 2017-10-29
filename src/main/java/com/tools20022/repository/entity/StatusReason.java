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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#Status
 * StatusReason.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#Reason
 * StatusReason.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#NoSpecifiedReason
 * StatusReason.NoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
 * StatusReason.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RejectedStatusReason
 * StatusReason.RejectedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#FailingReason
 * StatusReason.FailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#CancellationReason
 * StatusReason.CancellationReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#PendingReason
 * StatusReason.PendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RejectionReason
 * StatusReason.RejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#AcknowledgedAcceptedReason
 * StatusReason.AcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#RelatedClosureReason
 * StatusReason.RelatedClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedStatusReason
 * GenericIdentification.RelatedStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusReason
 * Status.StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureReason
 * RegisteredContract.ClosureReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason1#Reason
 * ProprietaryReason1.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason2#Reason
 * ProprietaryReason2.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason1Choice#Code
 * ReturnReason1Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason1Choice#Proprietary
 * ReturnReason1Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason5Choice#Code
 * ReturnReason5Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason5Choice#Proprietary
 * ReturnReason5Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation6#Reason
 * ReversalReasonInformation6.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReversalReason7#Reason
 * PaymentReversalReason7.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentReasonInformation1#Reason
 * AmendmentReasonInformation1.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentReturnReason1#Reason
 * PaymentReturnReason1.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason3#Reason
 * InRepairStatusReason3.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus#Reason
 * TransferUnmatchedStatus.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#Reason
 * TransferUnmatchedStatus2.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#ExtendedReason
 * TransferUnmatchedStatus2.ExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1#DataSourceScheme
 * FailedSettlementStatus1.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice#GlobalRejectionReason
 * RejectionReason1Choice.GlobalRejectionReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason3Choice#Code
 * ReturnReason3Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason3Choice#Proprietary
 * ReturnReason3Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReturnReason4Choice#Code
 * ReturnReason4Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReturnReason4Choice#Proprietary
 * ReturnReason4Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reason3#Reason Reason3.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reason3Choice#Reason
 * Reason3Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason4#Reason
 * ProprietaryReason4.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#Status
 * CancellationStatusAndReason3.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#Reason
 * TransferUnmatchedStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#ExtendedReason
 * TransferUnmatchedStatus3Choice.ExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#DataSourceScheme
 * FailedSettlementStatus2Choice.DataSourceScheme}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#Rejected
 * Status21Choice.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#Complete
 * Status21Choice.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancelledCompleteReason1#AdditionalReasonInformation
 * CancelledCompleteReason1.AdditionalReasonInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason5#Reason
 * ProprietaryReason5.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosedStatusReason1#Code
 * ClosedStatusReason1.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProformaStatusReason1#Code
 * ProformaStatusReason1.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisabledStatusReason1#Code
 * DisabledStatusReason1.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnabledStatusReason1#Code
 * EnabledStatusReason1.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatusReason4#Reason
 * SuspendedStatusReason4.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatusReason4#Reason
 * InRepairStatusReason4.Reason}</li>
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
	/**
	 * Status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusReason
	 * Status.StatusReason}</li>
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
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#Proprietary
	 * IntraPositionProcessingStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#Proprietary
	 * IntraPositionProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#Proprietary
	 * IntraPositionProcessingStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#Proprietary
	 * IntraPositionProcessingStatus4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#ResponseType
	 * SecuritiesCollateralResponse1.ResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#Proprietary
	 * IntraPositionProcessingStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#Proprietary
	 * IntraPositionProcessingStatus6Choice.Proprietary}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice.Proprietary, com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice.Proprietary,
					com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.Proprietary, com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesCollateralResponse1.ResponseType, com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice.Proprietary,
					com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice.Proprietary);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason provided for the status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.BlockedReason1Choice#Reason
	 * BlockedReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason1Choice#Proprietary
	 * BlockedReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification#ProprietaryStatusReason
	 * ProprietaryStatusJustification.ProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification#Reason
	 * ProprietaryStatusJustification.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#UnmatchedStatusReason
	 * PaymentStatusReasonCode3Choice.UnmatchedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason3#AdditionalReasonInformation
	 * AcknowledgementReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason1#AdditionalReasonInformation
	 * PendingProcessingReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason5#AdditionalReasonInformation
	 * RejectionReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason1#AdditionalReasonInformation
	 * RepairReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason1#AdditionalReasonInformation
	 * CancellationReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus4Choice#Reason
	 * CancellationStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason2#AdditionalReasonInformation
	 * PendingReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1#AdditionalReasonInformation
	 * ProprietaryReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason3#AdditionalReasonInformation
	 * PendingProcessingReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason10#AdditionalReasonInformation
	 * RejectionReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason5#AdditionalReasonInformation
	 * CancellationReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason1#AdditionalReasonInformation
	 * UnmatchedReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason6#AdditionalReasonInformation
	 * UnmatchedReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason1#AdditionalReasonInformation
	 * PendingReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason1#AdditionalReasonInformation
	 * FailingReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason5#AdditionalReasonInformation
	 * PendingReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason3#AdditionalReasonInformation
	 * FailingReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason7#AdditionalReasonInformation
	 * AcknowledgementReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason5#AdditionalReasonInformation
	 * PendingProcessingReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason2#AdditionalReasonInformation
	 * DeniedReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason11#AdditionalReasonInformation
	 * RejectionReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason6#AdditionalReasonInformation
	 * RepairReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason2#AdditionalReasonInformation
	 * ModificationReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason1#AdditionalReasonInformation
	 * RejectionOrRepairReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason1#AdditionalReasonInformation
	 * AcknowledgementReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason2#AdditionalReasonInformation
	 * CancellationReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus3Choice#Reason
	 * CancellationStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason9#AdditionalReasonInformation
	 * RejectionOrRepairReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason7#AdditionalReasonInformation
	 * PendingReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason3#AdditionalReasonInformation
	 * RejectionOrRepairReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason10#AdditionalReasonInformation
	 * RejectionOrRepairReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason18#AdditionalReasonInformation
	 * RejectionOrRepairReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason13#AdditionalReasonInformation
	 * RejectionOrRepairReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus9Choice#Reason
	 * CancellationStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason6#AdditionalReasonInformation
	 * AcknowledgementReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason7#AdditionalReasonInformation
	 * PendingProcessingReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason15#AdditionalReasonInformation
	 * RejectionReason15.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason2#AdditionalReasonInformation
	 * RepairReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason6#AdditionalReasonInformation
	 * CancellationReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason3#AdditionalReasonInformation
	 * PendingReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason2#AdditionalReasonInformation
	 * ProprietaryReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason9#AdditionalReasonInformation
	 * UnmatchedReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason10#AdditionalReasonInformation
	 * PendingReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason5#AdditionalReasonInformation
	 * FailingReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason8#AdditionalReasonInformation
	 * AcknowledgementReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason6#AdditionalReasonInformation
	 * PendingProcessingReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason4#AdditionalReasonInformation
	 * DeniedReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason14#AdditionalReasonInformation
	 * RejectionReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason7#AdditionalReasonInformation
	 * RepairReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason3#AdditionalReasonInformation
	 * ModificationReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason12#AdditionalReasonInformation
	 * PendingReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason19#AdditionalReasonInformation
	 * RejectionOrRepairReason19.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason16#AdditionalReasonInformation
	 * RejectionOrRepairReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason4#AdditionalReasonInformation
	 * AcknowledgementReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason3#AdditionalReasonInformation
	 * CancellationReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus13Choice#Reason
	 * CancellationStatus13Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason2#AdditionalReasonInformation
	 * PendingStatusReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason3#AdditionalReasonInformation
	 * PendingStatusReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason4#AdditionalReasonInformation
	 * CancelledStatusReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason1#AdditionalReasonInformation
	 * AcceptedStatusReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason8#AdditionalReasonInformation
	 * RejectedStatusReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1#AdditionalReasonInformation
	 * PendingCancellationStatusReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason5#AdditionalReasonInformation
	 * CancelledStatusReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason2#AdditionalReasonInformation
	 * AcceptedStatusReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason9#AdditionalReasonInformation
	 * RejectedStatusReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason2#AdditionalReasonInformation
	 * PendingCancellationStatusReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason6#AdditionalReasonInformation
	 * CancelledStatusReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason7#AdditionalReasonInformation
	 * CancelledStatusReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3#AdditionalReasonInformation
	 * PendingCancellationStatusReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4#AdditionalReasonInformation
	 * PendingCancellationStatusReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason1#AdditionalReasonInformation
	 * PendingStatusReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason4#AdditionalReasonInformation
	 * PendingStatusReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1#AdditionalReasonInformation
	 * CorporateActionReversalReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason2#AdditionalReasonInformation
	 * CorporateActionReversalReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason7#AdditionalReasonInformation
	 * RejectionOrRepairReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason11#AdditionalReasonInformation
	 * RejectionOrRepairReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason1#AdditionalReasonInformation
	 * GeneratedReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#ProcessingStatus
	 * StatusAndReason3.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason2#AdditionalReasonInformation
	 * GeneratedReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason2#AdditionalReasonInformation
	 * PendingProcessingReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason4#AdditionalReasonInformation
	 * UnmatchedReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason4#AdditionalReasonInformation
	 * PendingReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason2#AdditionalReasonInformation
	 * FailingReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#ProcessingStatus
	 * StatusAndReason6.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason7#AdditionalReasonInformation
	 * RejectionReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason4#AdditionalReasonInformation
	 * CancellationReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus6Choice#Reason
	 * CancellationStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice#Code
	 * UnaffirmedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#AdditionalReasonInformation
	 * StatusAndReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AffirmationReason1#AdditionalReasonInformation
	 * AffirmationReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice#Reason
	 * AffirmationReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason5#AdditionalReasonInformation
	 * RepairReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice#Code
	 * AwaitingAffirmationReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingAffirmationReason1Choice#Proprietary
	 * AwaitingAffirmationReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1#Code
	 * AwaitingAffirmationReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingAffirmationReason1#AdditionalReasonInformation
	 * AwaitingAffirmationReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason9#AdditionalReasonInformation
	 * RejectionReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AllegmentMatchingReason1#AdditionalReasonInformation
	 * AllegmentMatchingReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice#Code
	 * AwaitingCancellationReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AwaitingCancellationReason1Choice#Proprietary
	 * AwaitingCancellationReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1#Code
	 * AwaitingCancellationReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AwaitingCancellationReason1#AdditionalReasonInformation
	 * AwaitingCancellationReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnReason2#Reason
	 * PaymentReturnReason2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#AdditionalCancellationReasonInformation
	 * CancellationReasonInformation1.AdditionalCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation3#AdditionalInformation
	 * CancellationReasonInformation3.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentReversalReason7#AdditionalInformation
	 * PaymentReversalReason7.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation1#AdditionalStatusReasonInformation
	 * StatusReasonInformation1.AdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#Code
	 * StatusReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatusReason6Choice#Proprietary
	 * StatusReason6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Discrepancy1#Narrative
	 * Discrepancy1.Narrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#AdditionalRejectReasonInformation
	 * AcceptanceResult6.AdditionalRejectReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendmentReason1#Reason
	 * MandateAmendmentReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation2#AdditionalInformation
	 * CancellationReasonInformation2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#AmendOrCancelReason
	 * TradeAgreement2.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement4#AmendOrCancelReason
	 * TradeAgreement4.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#AmendOrCancelReason
	 * TradeAgreement8.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement5#AmendOrCancelReason
	 * TradeAgreement5.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#AmendOrCancelReason
	 * TradeAgreement9.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason4#AdditionalInformation
	 * RejectedStatusReason4.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason1#AdditionalInformation
	 * CancelledStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason6#AdditionalInformation
	 * RejectedStatusReason6.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason1#AdditionalInformation
	 * SuspendedStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatusReason1#AdditionalInformation
	 * InRepairStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus6#AdditionalInformation
	 * RejectedStatus6.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#AdditionalInformation
	 * SuspendedStatusReason2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#AdditionalInformation
	 * PartiallySettledStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatusReason3#AdditionalInformation
	 * InRepairStatusReason3.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1#AdditionalInformation
	 * RejectionReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3#AdditionalInformation
	 * RejectionReason3.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus2#Reason
	 * TransferCancellationStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationPendingStatus1#Reason
	 * TransferCancellationPendingStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatusReason1#AdditionalInformation
	 * PendingSettlementStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason5#AdditionalInformation
	 * RejectedStatusReason5.AdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus3#Reason
	 * InRepairStatus3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1#Reason
	 * FailedSettlementStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1#Reason
	 * CancellationPendingStatus1.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#Reason
	 * CaseStatus.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#Reason
	 * CaseStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason#CancellationReason
	 * MeetingCancellationReason.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#CancellationReason
	 * MeetingCancellationReason1.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2#CancellationReason
	 * MeetingCancellationReason2.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#StatusReason
	 * MeetingInstructionStatusDetails.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRejectionStatus1#AdditionalInformation
	 * CancellationRejectionStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalStatus1#AdditionalInformation
	 * AdditionalStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalStatus2#AdditionalInformation
	 * AdditionalStatus2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#Reason
	 * CorporateActionAmendmentRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20FormatChoice#Code
	 * RejectionReason20FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason4#AdditionalReasonInformation
	 * RejectionOrRepairReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason6#AdditionalReasonInformation
	 * RejectionReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason3#AdditionalReasonInformation
	 * RepairReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason2#AdditionalReasonInformation
	 * UnmatchedReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason2#AdditionalReasonInformation
	 * AcknowledgementReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason1#AdditionalReasonInformation
	 * DeniedReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters1#Reason
	 * AdditionalQueryParameters1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters3#Reason
	 * AdditionalQueryParameters3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason2#AdditionalReasonInformation
	 * RejectionOrRepairReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReasonInformation1#AdditionalInformation
	 * CancellationStatusReasonInformation1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData1#AmendOrCancelReason
	 * ClosingData1.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingData2#AmendOrCancelReason
	 * ClosingData2.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingResult1#AdditionalStatusReasonInformation
	 * FinancingResult1.AdditionalStatusReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reason2#Description
	 * Reason2.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationReason1#AdditionalInformation
	 * CollateralCancellationReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionStatus2#AdditionalInformation
	 * RejectionStatus2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#RejectionInformation
	 * CollateralProposalResponseType1.RejectionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#RejectionReasonInformation
	 * CollateralSubstitutionResponse2.RejectionReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#RejectionReasonInformation
	 * InterestResponse1.RejectionReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason8#AdditionalReasonInformation
	 * RejectionReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason4#AdditionalReasonInformation
	 * RepairReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason3#AdditionalReasonInformation
	 * UnmatchedReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason5#AdditionalReasonInformation
	 * AcknowledgementReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason3#AdditionalReasonInformation
	 * DeniedReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus8Choice#Reason
	 * CancellationStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason7#AdditionalReasonInformation
	 * UnmatchedReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus12Choice#Reason
	 * CancellationStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason10#AdditionalReasonInformation
	 * UnmatchedReason10.AdditionalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason2#Code
	 * ConsentReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason2#AdditionalReasonInformation
	 * ConsentReason2.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus2Choice#Reason
	 * ConsentStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason12#AdditionalReasonInformation
	 * RejectionReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#Consented
	 * ResponseStatus3Choice.Consented}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason3#Code
	 * ConsentReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason3#AdditionalReasonInformation
	 * ConsentReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus3Choice#Reason
	 * ConsentStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason13#AdditionalReasonInformation
	 * RejectionReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#Consented
	 * ResponseStatus4Choice.Consented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters2#Reason
	 * AdditionalQueryParameters2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters4#Reason
	 * AdditionalQueryParameters4.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#Reason
	 * AdditionalQueryParameters5.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters6#Reason
	 * AdditionalQueryParameters6.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason5#AdditionalReasonInformation
	 * RejectionOrRepairReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason6#AdditionalReasonInformation
	 * RejectionOrRepairReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus5Choice#Reason
	 * CancellationStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason12#AdditionalReasonInformation
	 * RejectionOrRepairReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason8#AdditionalReasonInformation
	 * RejectionOrRepairReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason14#AdditionalReasonInformation
	 * RejectionOrRepairReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason8#AdditionalReasonInformation
	 * PendingReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason4#AdditionalReasonInformation
	 * FailingReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason17#AdditionalReasonInformation
	 * RejectionOrRepairReason17.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason13#AdditionalReasonInformation
	 * PendingReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason6#AdditionalReasonInformation
	 * FailingReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#AdditionalInformation
	 * CancellationStatusReason2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation5#AdditionalStatusReasonInformation
	 * StatusReasonInformation5.AdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#AdditionalStatusReasonInformation
	 * StatusReasonInformation7.AdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus8#AdditionalInformation
	 * RejectedStatus8.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation10#Reason
	 * StatusReasonInformation10.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason20#AdditionalReasonInformation
	 * RejectionOrRepairReason20.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason22#AdditionalReasonInformation
	 * RejectionOrRepairReason22.AdditionalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryReason3#Reason
	 * ProprietaryReason3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason3#AdditionalReasonInformation
	 * ProprietaryReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason21#AdditionalReasonInformation
	 * RejectionOrRepairReason21.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason4#AdditionalInformation
	 * RejectionReason4.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#Reason
	 * AdditionalQueryParameters7.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason3#AdditionalReasonInformation
	 * GeneratedReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason16#AdditionalReasonInformation
	 * RejectionReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason3#AdditionalReasonInformation
	 * AcceptedStatusReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason10#AdditionalReasonInformation
	 * RejectedStatusReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason5#AdditionalReasonInformation
	 * PendingStatusReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason12#AdditionalReasonInformation
	 * UnmatchedReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason18#AdditionalReasonInformation
	 * RejectionReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason17#AdditionalReasonInformation
	 * RejectionReason17.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason11#AdditionalReasonInformation
	 * UnmatchedReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason19#AdditionalReasonInformation
	 * RejectionReason19.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason4#AdditionalReasonInformation
	 * AcceptedStatusReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason6#AdditionalReasonInformation
	 * PendingStatusReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason11#AdditionalReasonInformation
	 * RejectedStatusReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason5#AdditionalReasonInformation
	 * AcceptedStatusReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason4#AdditionalReasonInformation
	 * GeneratedReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters8#Reason
	 * AdditionalQueryParameters8.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason20#AdditionalReasonInformation
	 * RejectionReason20.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason21#AdditionalReasonInformation
	 * RejectionReason21.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason6#AdditionalReasonInformation
	 * AcceptedStatusReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason13#AdditionalReasonInformation
	 * UnmatchedReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason14#AdditionalReasonInformation
	 * UnmatchedReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason22#AdditionalReasonInformation
	 * RejectionReason22.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AllegementMatchingReason1#AdditionalReasonInformation
	 * AllegementMatchingReason1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#AmendOrCancelReason
	 * TradeAgreement11.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#AmendOrCancelReason
	 * TradeAgreement12.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason23#AdditionalInformation
	 * RejectionReason23.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportItemStatus1#AdditionalReasonInformation
	 * ReportItemStatus1.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason8#AdditionalReasonInformation
	 * CancelledStatusReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason13#AdditionalReasonInformation
	 * RejectedStatusReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason14#AdditionalReasonInformation
	 * RejectedStatusReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason7#AdditionalReasonInformation
	 * PendingStatusReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#Reason
	 * AdditionalQueryParameters9.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason5#AdditionalReasonInformation
	 * DeniedReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason9#AdditionalReasonInformation
	 * CancelledStatusReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason15#AdditionalReasonInformation
	 * RejectedStatusReason15.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason8#AdditionalReasonInformation
	 * PendingStatusReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason10#AdditionalReasonInformation
	 * CancelledStatusReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason16#AdditionalReasonInformation
	 * RejectedStatusReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters10#Reason
	 * AdditionalQueryParameters10.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason8#AdditionalReasonInformation
	 * DeniedReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason6#AdditionalReasonInformation
	 * DeniedReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason7#AdditionalReasonInformation
	 * DeniedReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason9#AdditionalReasonInformation
	 * DeniedReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalError1Choice#Code
	 * TechnicalError1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TechnicalError1Choice#Proprietary
	 * TechnicalError1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractAmendment1#AmendmentReason
	 * RegisteredContractAmendment1.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#Consented
	 * ResponseStatus6Choice.Consented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason5#AdditionalReasonInformation
	 * GeneratedReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#Reason
	 * AdditionalQueryParameters11.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason26#AdditionalReasonInformation
	 * RejectionReason26.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason17#AdditionalReasonInformation
	 * PendingReason17.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason10#AdditionalReasonInformation
	 * CancellationReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason8#AdditionalReasonInformation
	 * RepairReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason16#AdditionalReasonInformation
	 * PendingReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason25#AdditionalReasonInformation
	 * RejectionReason25.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason8#AdditionalReasonInformation
	 * AcceptedStatusReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus16Choice#Reason
	 * CancellationStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason12#AdditionalReasonInformation
	 * CancellationReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason9#AdditionalReasonInformation
	 * AcknowledgementReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason15#AdditionalReasonInformation
	 * PendingReason15.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason10#AdditionalReasonInformation
	 * AcknowledgementReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason12#AdditionalReasonInformation
	 * DeniedReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason11#AdditionalReasonInformation
	 * DeniedReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason11#AdditionalReasonInformation
	 * AcknowledgementReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason29#AdditionalReasonInformation
	 * RejectionReason29.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason4#AdditionalReasonInformation
	 * ProprietaryReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason10#AdditionalReasonInformation
	 * PendingProcessingReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25#AdditionalReasonInformation
	 * RejectionOrRepairReason25.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason14#AdditionalReasonInformation
	 * PendingReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason7#AdditionalReasonInformation
	 * FailingReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason10#AdditionalReasonInformation
	 * RepairReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason30#AdditionalReasonInformation
	 * RejectionReason30.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason16#AdditionalReasonInformation
	 * UnmatchedReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason8#AdditionalReasonInformation
	 * PendingProcessingReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason9#AdditionalReasonInformation
	 * CancellationReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason27#AdditionalReasonInformation
	 * RejectionReason27.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason17#AdditionalReasonInformation
	 * UnmatchedReason17.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23#AdditionalReasonInformation
	 * RejectionOrRepairReason23.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason9#AdditionalReasonInformation
	 * PendingProcessingReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason12#AdditionalReasonInformation
	 * AcknowledgementReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason15#AdditionalReasonInformation
	 * UnmatchedReason15.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason9#AdditionalReasonInformation
	 * RepairReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice#Reason
	 * ConsentStatus4Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason4#Code
	 * ConsentReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason4#AdditionalReasonInformation
	 * ConsentReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26#AdditionalReasonInformation
	 * RejectionOrRepairReason26.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason28#AdditionalReasonInformation
	 * RejectionReason28.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason8#AdditionalReasonInformation
	 * FailingReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason4#AdditionalReasonInformation
	 * ModificationReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus15Choice#Reason
	 * CancellationStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason18#AdditionalReasonInformation
	 * PendingReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason10#AdditionalReasonInformation
	 * DeniedReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24#AdditionalReasonInformation
	 * RejectionOrRepairReason24.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#AdditionalReasonInformation
	 * CorporateActionReversalReason3.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason17#AdditionalReasonInformation
	 * RejectedStatusReason17.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12#AdditionalReasonInformation
	 * CancelledStatusReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason10#AdditionalReasonInformation
	 * PendingStatusReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18#AdditionalReasonInformation
	 * RejectedStatusReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5#AdditionalReasonInformation
	 * PendingCancellationStatusReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9#AdditionalReasonInformation
	 * AcceptedStatusReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9#AdditionalReasonInformation
	 * PendingStatusReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11#AdditionalReasonInformation
	 * CancelledStatusReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#Reason
	 * InRepairStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#Reason
	 * FailedSettlementStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason32#AdditionalReasonInformation
	 * RejectionReason32.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#Reason
	 * CancellationPendingStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason33#AdditionalReasonInformation
	 * RejectionReason33.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason31#AdditionalReasonInformation
	 * RejectionReason31.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason13#CorporateActionEventIdentification
	 * CancellationReason13.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4#AdditionalReasonInformation
	 * CorporateActionReversalReason4.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6#AdditionalReasonInformation
	 * PendingCancellationStatusReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason14#AdditionalReasonInformation
	 * CancelledStatusReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason5#AdditionalReasonInformation
	 * ProprietaryReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason19#AdditionalReasonInformation
	 * RejectedStatusReason19.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason13#AdditionalReasonInformation
	 * CancelledStatusReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason10#AdditionalReasonInformation
	 * AcceptedStatusReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason11#AdditionalReasonInformation
	 * PendingStatusReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason12#AdditionalReasonInformation
	 * PendingStatusReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason20#AdditionalReasonInformation
	 * RejectedStatusReason20.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters12#Reason
	 * AdditionalQueryParameters12.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#Consented
	 * ResponseStatus8Choice.Consented}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason6#AdditionalReasonInformation
	 * GeneratedReason6.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason11#AdditionalReasonInformation
	 * RepairReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason37#AdditionalReasonInformation
	 * RejectionReason37.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus18Choice#Reason
	 * CancellationStatus18Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason15#AdditionalReasonInformation
	 * CancellationReason15.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason34#AdditionalReasonInformation
	 * RejectionReason34.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus5Choice#Reason
	 * ConsentStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason14#AdditionalReasonInformation
	 * CancellationReason14.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason9#AdditionalReasonInformation
	 * FailingReason9.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason29#AdditionalReasonInformation
	 * RejectionOrRepairReason29.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason11#AdditionalReasonInformation
	 * PendingProcessingReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason25#AdditionalReasonInformation
	 * PendingReason25.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason20#AdditionalReasonInformation
	 * PendingReason20.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason36#AdditionalReasonInformation
	 * RejectionReason36.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason12#AdditionalReasonInformation
	 * PendingProcessingReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason35#AdditionalReasonInformation
	 * RejectionReason35.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus20Choice#Reason
	 * CancellationStatus20Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason18#AdditionalReasonInformation
	 * CancellationReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason12#AdditionalReasonInformation
	 * RepairReason12.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason19#AdditionalReasonInformation
	 * PendingReason19.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason18#AdditionalReasonInformation
	 * AcknowledgementReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason31#AdditionalReasonInformation
	 * RejectionOrRepairReason31.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationReason5#AdditionalReasonInformation
	 * ModificationReason5.AdditionalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ConsentReason5#Code
	 * ConsentReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConsentReason5#AdditionalReasonInformation
	 * ConsentReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason40#AdditionalReasonInformation
	 * RejectionReason40.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason28#AdditionalReasonInformation
	 * RejectionOrRepairReason28.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailingReason10#AdditionalReasonInformation
	 * FailingReason10.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepairReason13#AdditionalReasonInformation
	 * RepairReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason13#AdditionalReasonInformation
	 * PendingProcessingReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason11#AdditionalReasonInformation
	 * AcceptedStatusReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason19#AdditionalReasonInformation
	 * UnmatchedReason19.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason20#AdditionalReasonInformation
	 * UnmatchedReason20.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason24#AdditionalReasonInformation
	 * PendingReason24.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason13#AdditionalReasonInformation
	 * AcknowledgementReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason27#AdditionalReasonInformation
	 * RejectionOrRepairReason27.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason39#AdditionalReasonInformation
	 * RejectionReason39.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason18#AdditionalReasonInformation
	 * UnmatchedReason18.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason15#AdditionalReasonInformation
	 * AcknowledgementReason15.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason13#AdditionalReasonInformation
	 * DeniedReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason16#AdditionalReasonInformation
	 * DeniedReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingReason21#AdditionalReasonInformation
	 * PendingReason21.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason19#AdditionalReasonInformation
	 * AcknowledgementReason19.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason19#CorporateActionEventIdentification
	 * CancellationReason19.CorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeniedReason17#AdditionalReasonInformation
	 * DeniedReason17.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType3Choice#Code
	 * SystemEventType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType3Choice#Proprietary
	 * SystemEventType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16#AdditionalInformation
	 * CancelledStatusReason16.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus9#AdditionalInformation
	 * RejectedStatus9.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#AdditionalInformation
	 * PartiallySettledStatus10.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice#Code
	 * BlockedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BlockedReason2Choice#Proprietary
	 * BlockedReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus10#AdditionalInformation
	 * RejectedStatus10.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7#AdditionalReasonInformation
	 * PendingCancellationStatusReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21#AdditionalReasonInformation
	 * RejectedStatusReason21.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13#AdditionalReasonInformation
	 * PendingStatusReason13.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#AmendOrCancelReason
	 * TradeAgreement15.AmendOrCancelReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason22#AdditionalReasonInformation
	 * RejectedStatusReason22.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8#AdditionalReasonInformation
	 * PendingCancellationStatusReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason15#AdditionalReasonInformation
	 * PendingStatusReason15.AdditionalReasonInformation}</li>
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
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BlockedReason1Choice.Reason, com.tools20022.repository.choice.BlockedReason1Choice.Proprietary,
					com.tools20022.repository.msg.ProprietaryStatusJustification.ProprietaryStatusReason, com.tools20022.repository.msg.ProprietaryStatusJustification.Reason,
					com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.UnmatchedStatusReason, com.tools20022.repository.msg.AcknowledgementReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingProcessingReason1.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.RepairReason1.AdditionalReasonInformation, com.tools20022.repository.msg.CancellationReason1.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus4Choice.Reason,
					com.tools20022.repository.msg.PendingReason2.AdditionalReasonInformation, com.tools20022.repository.msg.ProprietaryReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingProcessingReason3.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancellationReason5.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.UnmatchedReason6.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.FailingReason1.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.FailingReason3.AdditionalReasonInformation, com.tools20022.repository.msg.AcknowledgementReason7.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingProcessingReason5.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason11.AdditionalReasonInformation, com.tools20022.repository.msg.RepairReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.ModificationReason2.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason1.AdditionalReasonInformation, com.tools20022.repository.msg.CancellationReason2.AdditionalReasonInformation,
					com.tools20022.repository.choice.CancellationStatus3Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason7.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason10.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason18.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason13.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus9Choice.Reason,
					com.tools20022.repository.msg.AcknowledgementReason6.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason7.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason15.AdditionalReasonInformation, com.tools20022.repository.msg.RepairReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancellationReason6.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.ProprietaryReason2.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason10.AdditionalReasonInformation, com.tools20022.repository.msg.FailingReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason8.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.DeniedReason4.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason14.AdditionalReasonInformation,
					com.tools20022.repository.msg.RepairReason7.AdditionalReasonInformation, com.tools20022.repository.msg.ModificationReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason12.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason19.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason16.AdditionalReasonInformation, com.tools20022.repository.msg.AcknowledgementReason4.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancellationReason3.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus13Choice.Reason,
					com.tools20022.repository.msg.PendingStatusReason2.AdditionalReasonInformation, com.tools20022.repository.msg.PendingStatusReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancelledStatusReason4.AdditionalReasonInformation, com.tools20022.repository.msg.AcceptedStatusReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason8.AdditionalReasonInformation, com.tools20022.repository.msg.PendingCancellationStatusReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancelledStatusReason5.AdditionalReasonInformation, com.tools20022.repository.msg.AcceptedStatusReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason9.AdditionalReasonInformation, com.tools20022.repository.msg.PendingCancellationStatusReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancelledStatusReason6.AdditionalReasonInformation, com.tools20022.repository.msg.CancelledStatusReason7.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingCancellationStatusReason3.AdditionalReasonInformation, com.tools20022.repository.msg.PendingCancellationStatusReason4.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason1.AdditionalReasonInformation, com.tools20022.repository.msg.PendingStatusReason4.AdditionalReasonInformation,
					com.tools20022.repository.msg.CorporateActionReversalReason1.AdditionalReasonInformation, com.tools20022.repository.msg.CorporateActionReversalReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason7.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason11.AdditionalReasonInformation,
					com.tools20022.repository.msg.GeneratedReason1.AdditionalReasonInformation, com.tools20022.repository.msg.StatusAndReason3.ProcessingStatus, com.tools20022.repository.msg.GeneratedReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingProcessingReason2.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason4.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason4.AdditionalReasonInformation, com.tools20022.repository.msg.FailingReason2.AdditionalReasonInformation, com.tools20022.repository.msg.StatusAndReason6.ProcessingStatus,
					com.tools20022.repository.msg.RejectionReason7.AdditionalReasonInformation, com.tools20022.repository.msg.CancellationReason4.AdditionalReasonInformation,
					com.tools20022.repository.choice.CancellationStatus6Choice.Reason, com.tools20022.repository.choice.UnaffirmedReason2Choice.Code, com.tools20022.repository.msg.StatusAndReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.AffirmationReason1.AdditionalReasonInformation, com.tools20022.repository.choice.AffirmationReason1Choice.Reason, com.tools20022.repository.msg.RepairReason5.AdditionalReasonInformation,
					com.tools20022.repository.choice.AwaitingAffirmationReason1Choice.Code, com.tools20022.repository.choice.AwaitingAffirmationReason1Choice.Proprietary, com.tools20022.repository.msg.AwaitingAffirmationReason1.Code,
					com.tools20022.repository.msg.AwaitingAffirmationReason1.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.AllegmentMatchingReason1.AdditionalReasonInformation, com.tools20022.repository.choice.AwaitingCancellationReason1Choice.Code,
					com.tools20022.repository.choice.AwaitingCancellationReason1Choice.Proprietary, com.tools20022.repository.msg.AwaitingCancellationReason1.Code,
					com.tools20022.repository.msg.AwaitingCancellationReason1.AdditionalReasonInformation, com.tools20022.repository.msg.PaymentReturnReason2.Reason,
					com.tools20022.repository.msg.CancellationReasonInformation1.AdditionalCancellationReasonInformation, com.tools20022.repository.msg.CancellationReasonInformation3.AdditionalInformation,
					com.tools20022.repository.msg.PaymentReversalReason7.AdditionalInformation, com.tools20022.repository.msg.StatusReasonInformation1.AdditionalStatusReasonInformation,
					com.tools20022.repository.choice.StatusReason6Choice.Code, com.tools20022.repository.choice.StatusReason6Choice.Proprietary, com.tools20022.repository.msg.Discrepancy1.Narrative,
					com.tools20022.repository.msg.AcceptanceResult6.AdditionalRejectReasonInformation, com.tools20022.repository.msg.MandateAmendmentReason1.Reason,
					com.tools20022.repository.msg.CancellationReasonInformation2.AdditionalInformation, com.tools20022.repository.msg.TradeAgreement2.AmendOrCancelReason, com.tools20022.repository.msg.TradeAgreement4.AmendOrCancelReason,
					com.tools20022.repository.msg.TradeAgreement8.AmendOrCancelReason, com.tools20022.repository.msg.TradeAgreement5.AmendOrCancelReason, com.tools20022.repository.msg.TradeAgreement9.AmendOrCancelReason,
					com.tools20022.repository.msg.RejectedStatusReason4.AdditionalInformation, com.tools20022.repository.msg.CancelledStatusReason1.AdditionalInformation,
					com.tools20022.repository.msg.RejectedStatusReason6.AdditionalInformation, com.tools20022.repository.msg.SuspendedStatusReason1.AdditionalInformation,
					com.tools20022.repository.msg.InRepairStatusReason1.AdditionalInformation, com.tools20022.repository.msg.RejectedStatus6.AdditionalInformation, com.tools20022.repository.msg.SuspendedStatusReason2.AdditionalInformation,
					com.tools20022.repository.msg.PartiallySettledStatus1.AdditionalInformation, com.tools20022.repository.msg.InRepairStatusReason3.AdditionalInformation,
					com.tools20022.repository.msg.RejectionReason1.AdditionalInformation, com.tools20022.repository.msg.RejectionReason3.AdditionalInformation, com.tools20022.repository.msg.TransferCancellationStatus2.Reason,
					com.tools20022.repository.msg.TransferCancellationPendingStatus1.Reason, com.tools20022.repository.msg.PendingSettlementStatusReason1.AdditionalInformation,
					com.tools20022.repository.msg.RejectedStatusReason5.AdditionalInformation, com.tools20022.repository.msg.InRepairStatus3.Reason, com.tools20022.repository.msg.FailedSettlementStatus1.Reason,
					com.tools20022.repository.msg.CancellationPendingStatus1.Reason, com.tools20022.repository.msg.CaseStatus.Reason, com.tools20022.repository.msg.CaseStatus2.Reason,
					com.tools20022.repository.msg.MeetingCancellationReason.CancellationReason, com.tools20022.repository.msg.MeetingCancellationReason1.CancellationReason,
					com.tools20022.repository.msg.MeetingCancellationReason2.CancellationReason, com.tools20022.repository.msg.MeetingInstructionStatusDetails.StatusReason,
					com.tools20022.repository.msg.CancellationRejectionStatus1.AdditionalInformation, com.tools20022.repository.msg.AdditionalStatus1.AdditionalInformation,
					com.tools20022.repository.msg.AdditionalStatus2.AdditionalInformation, com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1.Reason, com.tools20022.repository.choice.RejectionReason20FormatChoice.Code,
					com.tools20022.repository.msg.RejectionOrRepairReason4.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.RepairReason3.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason2.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason1.AdditionalReasonInformation, com.tools20022.repository.msg.AdditionalQueryParameters1.Reason,
					com.tools20022.repository.msg.AdditionalQueryParameters3.Reason, com.tools20022.repository.msg.RejectionOrRepairReason2.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancellationStatusReasonInformation1.AdditionalInformation, com.tools20022.repository.msg.ClosingData1.AmendOrCancelReason, com.tools20022.repository.msg.ClosingData2.AmendOrCancelReason,
					com.tools20022.repository.msg.FinancingResult1.AdditionalStatusReasonInformation, com.tools20022.repository.msg.Reason2.Description, com.tools20022.repository.msg.CollateralCancellationReason1.AdditionalInformation,
					com.tools20022.repository.msg.RejectionStatus2.AdditionalInformation, com.tools20022.repository.msg.CollateralProposalResponseType1.RejectionInformation,
					com.tools20022.repository.msg.CollateralSubstitutionResponse2.RejectionReasonInformation, com.tools20022.repository.msg.InterestResponse1.RejectionReasonInformation,
					com.tools20022.repository.msg.RejectionReason8.AdditionalReasonInformation, com.tools20022.repository.msg.RepairReason4.AdditionalReasonInformation,
					com.tools20022.repository.msg.UnmatchedReason3.AdditionalReasonInformation, com.tools20022.repository.msg.AcknowledgementReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.DeniedReason3.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus8Choice.Reason, com.tools20022.repository.msg.UnmatchedReason7.AdditionalReasonInformation,
					com.tools20022.repository.choice.CancellationStatus12Choice.Reason, com.tools20022.repository.msg.UnmatchedReason10.AdditionalReasonInformation, com.tools20022.repository.msg.ConsentReason2.Code,
					com.tools20022.repository.msg.ConsentReason2.AdditionalReasonInformation, com.tools20022.repository.choice.ConsentStatus2Choice.Reason, com.tools20022.repository.msg.RejectionReason12.AdditionalReasonInformation,
					com.tools20022.repository.choice.ResponseStatus3Choice.Consented, com.tools20022.repository.msg.ConsentReason3.Code, com.tools20022.repository.msg.ConsentReason3.AdditionalReasonInformation,
					com.tools20022.repository.choice.ConsentStatus3Choice.Reason, com.tools20022.repository.msg.RejectionReason13.AdditionalReasonInformation, com.tools20022.repository.choice.ResponseStatus4Choice.Consented,
					com.tools20022.repository.msg.AdditionalQueryParameters2.Reason, com.tools20022.repository.msg.AdditionalQueryParameters4.Reason, com.tools20022.repository.msg.AdditionalQueryParameters5.Reason,
					com.tools20022.repository.msg.AdditionalQueryParameters6.Reason, com.tools20022.repository.msg.RejectionOrRepairReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason6.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus5Choice.Reason,
					com.tools20022.repository.msg.RejectionOrRepairReason12.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason8.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason14.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason8.AdditionalReasonInformation,
					com.tools20022.repository.msg.FailingReason4.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason17.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason13.AdditionalReasonInformation, com.tools20022.repository.msg.FailingReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancellationStatusReason2.AdditionalInformation, com.tools20022.repository.msg.StatusReasonInformation5.AdditionalStatusReasonInformation,
					com.tools20022.repository.msg.StatusReasonInformation7.AdditionalStatusReasonInformation, com.tools20022.repository.msg.RejectedStatus8.AdditionalInformation,
					com.tools20022.repository.msg.StatusReasonInformation10.Reason, com.tools20022.repository.msg.RejectionOrRepairReason20.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason22.AdditionalReasonInformation, com.tools20022.repository.msg.ProprietaryReason3.Reason, com.tools20022.repository.msg.ProprietaryReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason21.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason4.AdditionalInformation, com.tools20022.repository.msg.AdditionalQueryParameters7.Reason,
					com.tools20022.repository.msg.GeneratedReason3.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason16.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcceptedStatusReason3.AdditionalReasonInformation, com.tools20022.repository.msg.RejectedStatusReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason5.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason12.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason18.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason17.AdditionalReasonInformation,
					com.tools20022.repository.msg.UnmatchedReason11.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason19.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcceptedStatusReason4.AdditionalReasonInformation, com.tools20022.repository.msg.PendingStatusReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason11.AdditionalReasonInformation, com.tools20022.repository.msg.AcceptedStatusReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.GeneratedReason4.AdditionalReasonInformation, com.tools20022.repository.msg.AdditionalQueryParameters8.Reason, com.tools20022.repository.msg.RejectionReason20.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason21.AdditionalReasonInformation, com.tools20022.repository.msg.AcceptedStatusReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.UnmatchedReason13.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason14.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason22.AdditionalReasonInformation, com.tools20022.repository.msg.AllegementMatchingReason1.AdditionalReasonInformation,
					com.tools20022.repository.msg.TradeAgreement11.AmendOrCancelReason, com.tools20022.repository.msg.TradeAgreement12.AmendOrCancelReason, com.tools20022.repository.msg.RejectionReason23.AdditionalInformation,
					com.tools20022.repository.msg.ReportItemStatus1.AdditionalReasonInformation, com.tools20022.repository.msg.CancelledStatusReason8.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason13.AdditionalReasonInformation, com.tools20022.repository.msg.RejectedStatusReason14.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason7.AdditionalReasonInformation, com.tools20022.repository.msg.AdditionalQueryParameters9.Reason, com.tools20022.repository.msg.DeniedReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancelledStatusReason9.AdditionalReasonInformation, com.tools20022.repository.msg.RejectedStatusReason15.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason8.AdditionalReasonInformation, com.tools20022.repository.msg.CancelledStatusReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason16.AdditionalReasonInformation, com.tools20022.repository.msg.AdditionalQueryParameters10.Reason,
					com.tools20022.repository.msg.DeniedReason8.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason6.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason7.AdditionalReasonInformation,
					com.tools20022.repository.msg.DeniedReason9.AdditionalReasonInformation, com.tools20022.repository.choice.TechnicalError1Choice.Code, com.tools20022.repository.choice.TechnicalError1Choice.Proprietary,
					com.tools20022.repository.msg.RegisteredContractAmendment1.AmendmentReason, com.tools20022.repository.choice.ResponseStatus6Choice.Consented, com.tools20022.repository.msg.GeneratedReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.AdditionalQueryParameters11.Reason, com.tools20022.repository.msg.RejectionReason26.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason17.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancellationReason10.AdditionalReasonInformation, com.tools20022.repository.msg.RepairReason8.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason16.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason25.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcceptedStatusReason8.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus16Choice.Reason,
					com.tools20022.repository.msg.CancellationReason12.AdditionalReasonInformation, com.tools20022.repository.msg.AcknowledgementReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason15.AdditionalReasonInformation, com.tools20022.repository.msg.AcknowledgementReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.DeniedReason12.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason11.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason11.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason29.AdditionalReasonInformation,
					com.tools20022.repository.msg.ProprietaryReason4.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason25.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason14.AdditionalReasonInformation,
					com.tools20022.repository.msg.FailingReason7.AdditionalReasonInformation, com.tools20022.repository.msg.RepairReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason30.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason16.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingProcessingReason8.AdditionalReasonInformation, com.tools20022.repository.msg.CancellationReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason27.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason17.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason23.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason12.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason15.AdditionalReasonInformation,
					com.tools20022.repository.msg.RepairReason9.AdditionalReasonInformation, com.tools20022.repository.choice.ConsentStatus4Choice.Reason, com.tools20022.repository.msg.ConsentReason4.Code,
					com.tools20022.repository.msg.ConsentReason4.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason26.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason28.AdditionalReasonInformation, com.tools20022.repository.msg.FailingReason8.AdditionalReasonInformation,
					com.tools20022.repository.msg.ModificationReason4.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus15Choice.Reason,
					com.tools20022.repository.msg.PendingReason18.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason24.AdditionalReasonInformation, com.tools20022.repository.msg.CorporateActionReversalReason3.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason17.AdditionalReasonInformation, com.tools20022.repository.msg.CancelledStatusReason12.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason10.AdditionalReasonInformation, com.tools20022.repository.msg.RejectedStatusReason18.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingCancellationStatusReason5.AdditionalReasonInformation, com.tools20022.repository.msg.AcceptedStatusReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason9.AdditionalReasonInformation, com.tools20022.repository.msg.CancelledStatusReason11.AdditionalReasonInformation,
					com.tools20022.repository.choice.InRepairStatus4Choice.Reason, com.tools20022.repository.choice.FailedSettlementStatus2Choice.Reason, com.tools20022.repository.msg.RejectionReason32.AdditionalReasonInformation,
					com.tools20022.repository.choice.CancellationPendingStatus7Choice.Reason, com.tools20022.repository.msg.RejectionReason33.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason31.AdditionalReasonInformation, com.tools20022.repository.msg.CancellationReason13.CorporateActionEventIdentification,
					com.tools20022.repository.msg.CorporateActionReversalReason4.AdditionalReasonInformation, com.tools20022.repository.msg.PendingCancellationStatusReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.CancelledStatusReason14.AdditionalReasonInformation, com.tools20022.repository.msg.ProprietaryReason5.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason19.AdditionalReasonInformation, com.tools20022.repository.msg.CancelledStatusReason13.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcceptedStatusReason10.AdditionalReasonInformation, com.tools20022.repository.msg.PendingStatusReason11.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingStatusReason12.AdditionalReasonInformation, com.tools20022.repository.msg.RejectedStatusReason20.AdditionalReasonInformation,
					com.tools20022.repository.msg.AdditionalQueryParameters12.Reason, com.tools20022.repository.choice.ResponseStatus8Choice.Consented, com.tools20022.repository.msg.GeneratedReason6.AdditionalReasonInformation,
					com.tools20022.repository.msg.RepairReason11.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason37.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus18Choice.Reason,
					com.tools20022.repository.msg.CancellationReason15.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason34.AdditionalReasonInformation, com.tools20022.repository.choice.ConsentStatus5Choice.Reason,
					com.tools20022.repository.msg.CancellationReason14.AdditionalReasonInformation, com.tools20022.repository.msg.FailingReason9.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason29.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason11.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason25.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason20.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason36.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason12.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason35.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationStatus20Choice.Reason,
					com.tools20022.repository.msg.CancellationReason18.AdditionalReasonInformation, com.tools20022.repository.msg.RepairReason12.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingReason19.AdditionalReasonInformation, com.tools20022.repository.msg.AcknowledgementReason18.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason31.AdditionalReasonInformation, com.tools20022.repository.msg.ModificationReason5.AdditionalReasonInformation, com.tools20022.repository.msg.ConsentReason5.Code,
					com.tools20022.repository.msg.ConsentReason5.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionReason40.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionOrRepairReason28.AdditionalReasonInformation, com.tools20022.repository.msg.FailingReason10.AdditionalReasonInformation,
					com.tools20022.repository.msg.RepairReason13.AdditionalReasonInformation, com.tools20022.repository.msg.PendingProcessingReason13.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcceptedStatusReason11.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason19.AdditionalReasonInformation,
					com.tools20022.repository.msg.UnmatchedReason20.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason24.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason13.AdditionalReasonInformation, com.tools20022.repository.msg.RejectionOrRepairReason27.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectionReason39.AdditionalReasonInformation, com.tools20022.repository.msg.UnmatchedReason18.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason15.AdditionalReasonInformation, com.tools20022.repository.msg.DeniedReason13.AdditionalReasonInformation,
					com.tools20022.repository.msg.DeniedReason16.AdditionalReasonInformation, com.tools20022.repository.msg.PendingReason21.AdditionalReasonInformation,
					com.tools20022.repository.msg.AcknowledgementReason19.AdditionalReasonInformation, com.tools20022.repository.msg.CancellationReason19.CorporateActionEventIdentification,
					com.tools20022.repository.msg.DeniedReason17.AdditionalReasonInformation, com.tools20022.repository.choice.SystemEventType3Choice.Code, com.tools20022.repository.choice.SystemEventType3Choice.Proprietary,
					com.tools20022.repository.msg.CancelledStatusReason16.AdditionalInformation, com.tools20022.repository.msg.RejectedStatus9.AdditionalInformation,
					com.tools20022.repository.msg.PartiallySettledStatus10.AdditionalInformation, com.tools20022.repository.choice.BlockedReason2Choice.Code, com.tools20022.repository.choice.BlockedReason2Choice.Proprietary,
					com.tools20022.repository.msg.RejectedStatus10.AdditionalInformation, com.tools20022.repository.msg.PendingCancellationStatusReason7.AdditionalReasonInformation,
					com.tools20022.repository.msg.RejectedStatusReason21.AdditionalReasonInformation, com.tools20022.repository.msg.PendingStatusReason13.AdditionalReasonInformation,
					com.tools20022.repository.msg.TradeAgreement15.AmendOrCancelReason, com.tools20022.repository.msg.RejectedStatusReason22.AdditionalReasonInformation,
					com.tools20022.repository.msg.PendingCancellationStatusReason8.AdditionalReasonInformation, com.tools20022.repository.msg.PendingStatusReason15.AdditionalReasonInformation);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates that there is no reason available or to report.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus3Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus1Choice#NoSpecifiedReason
	 * PendingProcessingStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus1Choice#NoSpecifiedReason
	 * RejectionStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus1Choice#NoSpecifiedReason
	 * RepairStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus4Choice#NoSpecifiedReason
	 * CancellationStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus4Choice#NoSpecifiedReason
	 * PendingStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1#NoSpecifiedReason
	 * NoSpecifiedReason1.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus3Choice#NoSpecifiedReason
	 * PendingProcessingStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus5Choice#NoSpecifiedReason
	 * RejectionStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus5Choice#NoSpecifiedReason
	 * RepairStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus7Choice#NoSpecifiedReason
	 * CancellationStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus13Choice#NoSpecifiedReason
	 * PendingStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus1Choice#NoSpecifiedReason
	 * UnmatchedStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus5Choice#NoSpecifiedReason
	 * UnmatchedStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus3Choice#NoSpecifiedReason
	 * PendingStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus1Choice#NoSpecifiedReason
	 * FailingStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus9Choice#NoSpecifiedReason
	 * PendingStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus3Choice#NoSpecifiedReason
	 * FailingStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus7Choice#NoSpecifiedReason
	 * PendingProcessingStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus2Choice#NoSpecifiedReason
	 * DeniedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus6Choice#NoSpecifiedReason
	 * DeniedStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus8Choice#NoSpecifiedReason
	 * RejectionStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus8Choice#NoSpecifiedReason
	 * RepairStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus2Choice#NoSpecifiedReason
	 * ModificationStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus6Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus1Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus3Choice#NoSpecifiedReason
	 * CancellationStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus10Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus11Choice#NoSpecifiedReason
	 * PendingStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus4Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus11Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus25Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus14Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus12Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus9Choice#NoSpecifiedReason
	 * CancellationStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus20Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus9Choice#NoSpecifiedReason
	 * PendingProcessingStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus11Choice#NoSpecifiedReason
	 * RejectionStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus10Choice#NoSpecifiedReason
	 * RepairStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus11Choice#NoSpecifiedReason
	 * CancellationStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus24Choice#NoSpecifiedReason
	 * PendingStatus24Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus10Choice#NoSpecifiedReason
	 * UnmatchedStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus31Choice#NoSpecifiedReason
	 * PendingStatus31Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus8Choice#NoSpecifiedReason
	 * FailingStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus8Choice#NoSpecifiedReason
	 * PendingProcessingStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus9Choice#NoSpecifiedReason
	 * DeniedStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus10Choice#NoSpecifiedReason
	 * RejectionStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus9Choice#NoSpecifiedReason
	 * RepairStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus3Choice#NoSpecifiedReason
	 * ModificationStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus22Choice#NoSpecifiedReason
	 * PendingStatus22Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus24Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus24Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus20Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus20Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus18Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus13Choice#NoSpecifiedReason
	 * CancellationStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus2Choice#NoSpecifiedReason
	 * PendingStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus5Choice#NoSpecifiedReason
	 * PendingStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus1Choice#NoSpecifiedReason
	 * CancelledStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice#NoSpecifiedReason
	 * AcceptedStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus1Choice#NoSpecifiedReason
	 * RejectedStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus1Choice#NotSpecifiedReason
	 * PendingCancellationStatus1Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus2Choice#NoSpecifiedReason
	 * CancelledStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus2Choice#NoSpecifiedReason
	 * AcceptedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus2Choice#NoSpecifiedReason
	 * RejectedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus2Choice#NotSpecifiedReason
	 * PendingCancellationStatus2Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus3Choice#NoSpecifiedReason
	 * CancelledStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus4Choice#NoSpecifiedReason
	 * CancelledStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus3Choice#NotSpecifiedReason
	 * PendingCancellationStatus3Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus4Choice#NotSpecifiedReason
	 * PendingCancellationStatus4Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus1Choice#NoSpecifiedReason
	 * PendingStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus6Choice#NoSpecifiedReason
	 * PendingStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus6Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus9Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus4Choice#NoSpecifiedReason
	 * DeniedStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus7Choice#NoSpecifiedReason
	 * PendingStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus12Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus2Choice#NoSpecifiedReason
	 * PendingProcessingStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus2Choice#NoSpecifiedReason
	 * RepairStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus4Choice#NoSpecifiedReason
	 * UnmatchedStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus8Choice#NoSpecifiedReason
	 * PendingStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus2Choice#NoSpecifiedReason
	 * FailingStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus2Choice#NoSpecifiedReason
	 * RejectionStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus6Choice#NoSpecifiedReason
	 * CancellationStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus1Choice#NoSpecifiedReason
	 * GeneratedStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus2Choice#NoSpecifiedReason
	 * GeneratedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus3Choice#NoSpecifiedReason
	 * GeneratedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus4Choice#NoSpecifiedReason
	 * GeneratedStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice#NoSpecifiedReason
	 * AffirmationReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice#NoSpecifiedReason
	 * InstructionProcessingReason2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice#NoSpecifiedReason
	 * PendingProcessing1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice#NoSpecifiedReason
	 * InstructionProcessingReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason3Choice#NoSpecifiedReason
	 * MatchingReason3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice#NoSpecifiedReason
	 * MatchingReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason11Choice#NoSpecifiedReason
	 * CancellationReason11Choice.NoSpecifiedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus1#NoReason
	 * CancelledStatus1.NoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1#NoReason
	 * ConditionallyAcceptedStatus1.NoReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatus1#NoReason
	 * SuspendedStatus1.NoReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus1#NoReason
	 * InRepairStatus1.NoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#NoSpecifiedReason
	 * CancelledStatus2.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#NoSpecifiedReason
	 * ConditionallyAcceptedStatus2.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus2#NoSpecifiedReason
	 * SuspendedStatus2.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus2#NoSpecifiedReason
	 * InRepairStatus2.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#NoReason
	 * PendingSettlementStatusChoice.NoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus#NoReason
	 * TransferUnmatchedStatus.NoReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#NoSpecifiedReason
	 * PendingSettlementStatus2.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#NoSpecifiedReason
	 * TransferUnmatchedStatus2.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus3#NoSpecifiedReason
	 * InRepairStatus3.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedSettlementStatus1#NoSpecifiedReason
	 * FailedSettlementStatus1.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus3#NoSpecifiedReason
	 * CancelledStatus3.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReversedStatus1#NoSpecifiedReason
	 * ReversedStatus1.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1#NoSpecifiedReason
	 * CancellationPendingStatus1.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus2Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus3Choice#NoSpecifiedReason
	 * RejectionStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus3Choice#NoSpecifiedReason
	 * RepairStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus2Choice#NoSpecifiedReason
	 * UnmatchedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus2Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus1Choice#NoSpecifiedReason
	 * DeniedStatus1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus5Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus4Choice#NoSpecifiedReason
	 * RejectionStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus4Choice#NoSpecifiedReason
	 * RepairStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus3Choice#NoSpecifiedReason
	 * UnmatchedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus5Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus3Choice#NoSpecifiedReason
	 * DeniedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus4Choice#NoSpecifiedReason
	 * PendingProcessingStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus6Choice#NoSpecifiedReason
	 * RejectionStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus6Choice#NoSpecifiedReason
	 * RepairStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus8Choice#NoSpecifiedReason
	 * CancellationStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus6Choice#NoSpecifiedReason
	 * UnmatchedStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus15Choice#NoSpecifiedReason
	 * PendingStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus10Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus5Choice#NoSpecifiedReason
	 * DeniedStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus10Choice#NoSpecifiedReason
	 * PendingProcessingStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus12Choice#NoSpecifiedReason
	 * RejectionStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus11Choice#NoSpecifiedReason
	 * RepairStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus12Choice#NoSpecifiedReason
	 * CancellationStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus11Choice#NoSpecifiedReason
	 * UnmatchedStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus26Choice#NoSpecifiedReason
	 * PendingStatus26Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus16Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus8Choice#NoSpecifiedReason
	 * DeniedStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus2Choice#NoSpecifiedReason
	 * ConsentStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus7Choice#NoSpecifiedReason
	 * RejectionStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus3Choice#NoSpecifiedReason
	 * ConsentStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus9Choice#NoSpecifiedReason
	 * RejectionStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus4Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus7Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus18Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus23Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus23Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus8Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus5Choice#NoSpecifiedReason
	 * CancellationStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus13Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus3Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus15Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus12Choice#NoSpecifiedReason
	 * PendingStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus4Choice#NoSpecifiedReason
	 * FailingStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus21Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus21Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus23Choice#NoSpecifiedReason
	 * PendingStatus23Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus5Choice#NoSpecifiedReason
	 * FailingStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice#NoSpecifiedReason
	 * CancelledStatusReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice#NoSpecifiedReason
	 * ConditionallyAcceptedStatusReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReasonChoice#NoSpecifiedReason
	 * SuspendedStatusReasonChoice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus26Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus26Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus28Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus28Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason3Choice#NoSpecifiedReason
	 * Reason3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus27Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus27Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus5Choice#NoSpecifiedReason
	 * GeneratedStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus3Choice#NoSpecifiedReason
	 * AcceptedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus9Choice#NoSpecifiedReason
	 * RejectedStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus32Choice#NoSpecifiedReason
	 * PendingStatus32Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus12Choice#NoSpecifiedReason
	 * UnmatchedStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus13Choice#NoSpecifiedReason
	 * UnmatchedStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus14Choice#NoSpecifiedReason
	 * RejectionStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus13Choice#NoSpecifiedReason
	 * RejectionStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus10Choice#NoSpecifiedReason
	 * RejectedStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus5Choice#NoSpecifiedReason
	 * CancelledStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus4Choice#NoSpecifiedReason
	 * AcceptedStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus11Choice#NoSpecifiedReason
	 * RejectedStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus33Choice#NoSpecifiedReason
	 * PendingStatus33Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus5Choice#NoSpecifiedReason
	 * AcceptedStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus15Choice#NoSpecifiedReason
	 * RejectionStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus12Choice#NoSpecifiedReason
	 * RejectedStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus15Choice#NoSpecifiedReason
	 * UnmatchedStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus6Choice#NoSpecifiedReason
	 * GeneratedStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus14Choice#NoSpecifiedReason
	 * UnmatchedStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus6Choice#NoSpecifiedReason
	 * AcceptedStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus6Choice#NoSpecifiedReason
	 * CancelledStatus6Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus16Choice#NoSpecifiedReason
	 * RejectionStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProprietaryReason1Choice#NoSpecifiedReason
	 * ProprietaryReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason1Choice#NoSpecifiedReason
	 * ReceivedReason1Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice#NoSpecifiedReason
	 * PendingProcessingReason9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason8Choice#NoSpecifiedReason
	 * RejectedReason8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason8Choice#NoSpecifiedReason
	 * AcceptedReason8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice#NoSpecifiedReason
	 * MatchingReason4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus7Choice#NoSpecifiedReason
	 * CancelledStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus13Choice#NoSpecifiedReason
	 * RejectedStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus14Choice#NoSpecifiedReason
	 * RejectedStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus34Choice#NoSpecifiedReason
	 * PendingStatus34Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus10Choice#NoSpecifiedReason
	 * DeniedStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus8Choice#NoSpecifiedReason
	 * CancelledStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus15Choice#NoSpecifiedReason
	 * RejectedStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus35Choice#NoSpecifiedReason
	 * PendingStatus35Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus16Choice#NoSpecifiedReason
	 * RejectedStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus9Choice#NoSpecifiedReason
	 * CancelledStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus13Choice#NoSpecifiedReason
	 * DeniedStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus11Choice#NoSpecifiedReason
	 * DeniedStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus12Choice#NoSpecifiedReason
	 * DeniedStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus14Choice#NoSpecifiedReason
	 * DeniedStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus17Choice#NoSpecifiedReason
	 * RejectionStatus17Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus7Choice#NoSpecifiedReason
	 * AcceptedStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice#NoSpecifiedReason
	 * RepairStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus16Choice#NoSpecifiedReason
	 * CancellationStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus21Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus37Choice#NoSpecifiedReason
	 * PendingStatus37Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus17Choice#NoSpecifiedReason
	 * DeniedStatus17Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus10Choice#NoSpecifiedReason
	 * CancelledStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus17Choice#NoSpecifiedReason
	 * RejectedStatus17Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus16Choice#NoSpecifiedReason
	 * DeniedStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus23Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus31Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice#NoSpecifiedReason
	 * PendingStatus38Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice#NoSpecifiedReason
	 * DeniedStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice#NoSpecifiedReason
	 * ModificationStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice#NoSpecifiedReason
	 * RejectionStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice#NoSpecifiedReason
	 * RepairStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice#NoSpecifiedReason
	 * PendingProcessingStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice#NoSpecifiedReason
	 * UnmatchedStatus17Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice#NoSpecifiedReason
	 * PendingProcessingStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice#NoSpecifiedReason
	 * CancellationStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus40Choice#NoSpecifiedReason
	 * PendingStatus40Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus10Choice#NoSpecifiedReason
	 * FailingStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice#NoSpecifiedReason
	 * UnmatchedStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice#NoSpecifiedReason
	 * RejectionStatus21Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice#NoSpecifiedReason
	 * RejectionStatus20Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus29Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus39Choice#NoSpecifiedReason
	 * PendingStatus39Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice#NoSpecifiedReason
	 * PendingProcessingStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice#NoSpecifiedReason
	 * ConsentStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice#NoSpecifiedReason
	 * GeneratedStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus22Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus32Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus24Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice#NoSpecifiedReason
	 * UnmatchedStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus14Choice#NoSpecifiedReason
	 * RepairStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus36Choice#NoSpecifiedReason
	 * PendingStatus36Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus30Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus15Choice#NoSpecifiedReason
	 * CancellationStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus9Choice#NoSpecifiedReason
	 * FailingStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus19Choice#NoSpecifiedReason
	 * RejectionStatus19Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus19Choice#NoSpecifiedReason
	 * RejectedStatus19Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice#NoSpecifiedReason
	 * AcceptedStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus12Choice#NoSpecifiedReason
	 * CancelledStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus42Choice#NoSpecifiedReason
	 * PendingStatus42Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus11Choice#NoSpecifiedReason
	 * CancelledStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus5Choice#NotSpecifiedReason
	 * PendingCancellationStatus5Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus18Choice#NoSpecifiedReason
	 * RejectedStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice#NoSpecifiedReason
	 * PendingStatus41Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#NoSpecifiedReason
	 * TransferUnmatchedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#NoSpecifiedReason
	 * CancelledStatus13Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReversedStatus2Choice#NoSpecifiedReason
	 * ReversedStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#NoSpecifiedReason
	 * InRepairStatus4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#NoSpecifiedReason
	 * PendingSettlementStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementStatus2Choice#NoSpecifiedReason
	 * FailedSettlementStatus2Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#NoSpecifiedReason
	 * CancellationPendingStatus7Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus6Choice#NotSpecifiedReason
	 * PendingCancellationStatus6Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus14Choice#NoSpecifiedReason
	 * CancelledStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus20Choice#NoSpecifiedReason
	 * RejectedStatus20Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus15Choice#NoSpecifiedReason
	 * CancelledStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus43Choice#NoSpecifiedReason
	 * PendingStatus43Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus44Choice#NoSpecifiedReason
	 * PendingStatus44Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus21Choice#NoSpecifiedReason
	 * RejectedStatus21Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus9Choice#NoSpecifiedReason
	 * AcceptedStatus9Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus15Choice#NoSpecifiedReason
	 * RepairStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus18Choice#NoSpecifiedReason
	 * CancellationStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus22Choice#NoSpecifiedReason
	 * RejectionStatus22Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus27Choice#NoSpecifiedReason
	 * RejectionStatus27Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus5Choice#NoSpecifiedReason
	 * ConsentStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus46Choice#NoSpecifiedReason
	 * PendingStatus46Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus23Choice#NoSpecifiedReason
	 * RejectionStatus23Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus22Choice#NoSpecifiedReason
	 * RejectedStatus22Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus20Choice#NoSpecifiedReason
	 * CancellationStatus20Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus10Choice#NoSpecifiedReason
	 * AcceptedStatus10Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus16Choice#NoSpecifiedReason
	 * CancelledStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus19Choice#NoSpecifiedReason
	 * UnmatchedStatus19Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus8Choice#NoSpecifiedReason
	 * GeneratedStatus8Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus11Choice#NoSpecifiedReason
	 * FailingStatus11Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus30Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus30Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus26Choice#NoSpecifiedReason
	 * RejectionStatus26Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus5Choice#NoSpecifiedReason
	 * ModificationStatus5Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus34Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus34Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus15Choice#NoSpecifiedReason
	 * PendingProcessingStatus15Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus16Choice#NoSpecifiedReason
	 * PendingProcessingStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus45Choice#NoSpecifiedReason
	 * PendingStatus45Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus21Choice#NoSpecifiedReason
	 * UnmatchedStatus21Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus17Choice#NoSpecifiedReason
	 * RepairStatus17Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus24Choice#NoSpecifiedReason
	 * RejectionStatus24Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus35Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus35Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus51Choice#NoSpecifiedReason
	 * PendingStatus51Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus31Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus31Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus21Choice#NoSpecifiedReason
	 * DeniedStatus21Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus16Choice#NoSpecifiedReason
	 * RepairStatus16Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus33Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus33Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus25Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus20Choice#NoSpecifiedReason
	 * UnmatchedStatus20Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus50Choice#NoSpecifiedReason
	 * PendingStatus50Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus27Choice#NoSpecifiedReason
	 * AcknowledgedAcceptedStatus27Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus37Choice#NoSpecifiedReason
	 * RejectionOrRepairStatus37Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus18Choice#NoSpecifiedReason
	 * DeniedStatus18Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus17Choice#NoSpecifiedReason
	 * CancellationStatus17Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus19Choice#NoSpecifiedReason
	 * DeniedStatus19Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus12Choice#NoSpecifiedReason
	 * FailingStatus12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus14Choice#NoSpecifiedReason
	 * PendingProcessingStatus14Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus47Choice#NoSpecifiedReason
	 * PendingStatus47Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#NoSpecifiedReason
	 * SuspendedStatusReason4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#NoSpecifiedReason
	 * ConditionallyAcceptedStatus3Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#NoSpecifiedReason
	 * InRepairStatusReason4Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#NoSpecifiedReason
	 * CancelledReason12Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice#NotSpecifiedReason
	 * PendingCancellationStatus7Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus23Choice#NoSpecifiedReason
	 * RejectedStatus23Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus52Choice#NoSpecifiedReason
	 * PendingStatus52Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus8Choice#NotSpecifiedReason
	 * PendingCancellationStatus8Choice.NotSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus24Choice#NoSpecifiedReason
	 * RejectedStatus24Choice.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus53Choice#NoSpecifiedReason
	 * PendingStatus53Choice.NoSpecifiedReason}</li>
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
	public static final MMBusinessAttribute NoSpecifiedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AcknowledgedAcceptedStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus4Choice.NoSpecifiedReason, com.tools20022.repository.msg.NoSpecifiedReason1.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus5Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus7Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus13Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.FailingStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailingStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingProcessingStatus7Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus6Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus8Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ModificationStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus6Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus10Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus25Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus11Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus11Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus24Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus10Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus31Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailingStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingProcessingStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus10Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ModificationStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus22Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus24Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus20Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus18Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationStatus13Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedStatus1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingCancellationStatus1Choice.NotSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingCancellationStatus2Choice.NotSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingCancellationStatus3Choice.NotSpecifiedReason, com.tools20022.repository.choice.PendingCancellationStatus4Choice.NotSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus6Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus6Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus7Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RepairStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus8Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailingStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus6Choice.NoSpecifiedReason, com.tools20022.repository.choice.GeneratedStatus1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.GeneratedStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.GeneratedStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.GeneratedStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.AffirmationReason1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.InstructionProcessingReason2Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessing1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.InstructionProcessingReason1Choice.NoSpecifiedReason, com.tools20022.repository.choice.MatchingReason3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.MatchingReason1Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationReason11Choice.NoSpecifiedReason, com.tools20022.repository.msg.CancelledStatus1.NoReason,
					com.tools20022.repository.msg.ConditionallyAcceptedStatus1.NoReason, com.tools20022.repository.msg.SuspendedStatus1.NoReason, com.tools20022.repository.msg.InRepairStatus1.NoReason,
					com.tools20022.repository.msg.CancelledStatus2.NoSpecifiedReason, com.tools20022.repository.msg.ConditionallyAcceptedStatus2.NoSpecifiedReason, com.tools20022.repository.msg.SuspendedStatus2.NoSpecifiedReason,
					com.tools20022.repository.msg.InRepairStatus2.NoSpecifiedReason, com.tools20022.repository.choice.PendingSettlementStatusChoice.NoReason, com.tools20022.repository.choice.TransferUnmatchedStatus.NoReason,
					com.tools20022.repository.msg.PendingSettlementStatus2.NoSpecifiedReason, com.tools20022.repository.msg.TransferUnmatchedStatus2.NoSpecifiedReason, com.tools20022.repository.msg.InRepairStatus3.NoSpecifiedReason,
					com.tools20022.repository.msg.FailedSettlementStatus1.NoSpecifiedReason, com.tools20022.repository.msg.CancelledStatus3.NoSpecifiedReason, com.tools20022.repository.msg.ReversedStatus1.NoSpecifiedReason,
					com.tools20022.repository.msg.CancellationPendingStatus1.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus1Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus6Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus6Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus6Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus15Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus5Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus26Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus16Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.ConsentStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus7Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ConsentStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus7Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus18Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus23Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus13Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus15Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus12Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailingStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus21Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus23Choice.NoSpecifiedReason, com.tools20022.repository.choice.FailingStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatusReason1Choice.NoSpecifiedReason, com.tools20022.repository.choice.ConditionallyAcceptedStatusReason1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.SuspendedStatusReasonChoice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus26Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus28Choice.NoSpecifiedReason, com.tools20022.repository.choice.Reason3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus27Choice.NoSpecifiedReason, com.tools20022.repository.choice.GeneratedStatus5Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcceptedStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus32Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus12Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus13Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus13Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus5Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedStatus4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus11Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus33Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcceptedStatus5Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus15Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus15Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.GeneratedStatus6Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcceptedStatus6Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus6Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus16Choice.NoSpecifiedReason, com.tools20022.repository.choice.ProprietaryReason1Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ReceivedReason1Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingReason9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedReason8Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedReason8Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.MatchingReason4Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus7Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus13Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus34Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus15Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus35Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus16Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus9Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus13Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus11Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus17Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedStatus7Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RepairStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationStatus16Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus37Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.DeniedStatus17Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus17Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus16Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus31Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus38Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus15Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ModificationStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus18Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RepairStatus13Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus13Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus17Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus14Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus40Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailingStatus10Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus16Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus21Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus20Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus29Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus39Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingProcessingStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.ConsentStatus4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.GeneratedStatus7Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus32Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.UnmatchedStatus18Choice.NoSpecifiedReason, com.tools20022.repository.choice.RepairStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus36Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus30Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus15Choice.NoSpecifiedReason, com.tools20022.repository.choice.FailingStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus19Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus19Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcceptedStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus12Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus42Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingCancellationStatus5Choice.NotSpecifiedReason, com.tools20022.repository.choice.RejectedStatus18Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus41Choice.NoSpecifiedReason, com.tools20022.repository.choice.TransferUnmatchedStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus13Choice.NoSpecifiedReason, com.tools20022.repository.choice.ReversedStatus2Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.InRepairStatus4Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingSettlementStatus3Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailedSettlementStatus2Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationPendingStatus7Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingCancellationStatus6Choice.NotSpecifiedReason, com.tools20022.repository.choice.CancelledStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus20Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancelledStatus15Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus43Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus44Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus21Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedStatus9Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RepairStatus15Choice.NoSpecifiedReason, com.tools20022.repository.choice.CancellationStatus18Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus22Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus27Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ConsentStatus5Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus46Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionStatus23Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectedStatus22Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus20Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcceptedStatus10Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledStatus16Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus19Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.GeneratedStatus8Choice.NoSpecifiedReason, com.tools20022.repository.choice.FailingStatus11Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus30Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus26Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ModificationStatus5Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus34Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingProcessingStatus15Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus16Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus45Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus21Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RepairStatus17Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionStatus24Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus35Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus51Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus31Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus21Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RepairStatus16Choice.NoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus33Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice.NoSpecifiedReason, com.tools20022.repository.choice.UnmatchedStatus20Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus50Choice.NoSpecifiedReason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus27Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.RejectionOrRepairStatus37Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus18Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancellationStatus17Choice.NoSpecifiedReason, com.tools20022.repository.choice.DeniedStatus19Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.FailingStatus12Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingProcessingStatus14Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus47Choice.NoSpecifiedReason, com.tools20022.repository.choice.SuspendedStatusReason4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.NoSpecifiedReason, com.tools20022.repository.choice.InRepairStatusReason4Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.CancelledReason12Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingCancellationStatus7Choice.NotSpecifiedReason,
					com.tools20022.repository.choice.RejectedStatus23Choice.NoSpecifiedReason, com.tools20022.repository.choice.PendingStatus52Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingCancellationStatus8Choice.NotSpecifiedReason, com.tools20022.repository.choice.RejectedStatus24Choice.NoSpecifiedReason,
					com.tools20022.repository.choice.PendingStatus53Choice.NoSpecifiedReason);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	/**
	 * Proprietary identification of the reason for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedStatusReason
	 * GenericIdentification.RelatedStatusReason}</li>
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
	 * {@linkplain com.tools20022.repository.choice.UnaffirmedReason2Choice#Proprietary
	 * UnaffirmedReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus4#DataSourceScheme
	 * RejectedStatus4.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus7#DataSourceScheme
	 * RejectedStatus7.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#DataSourceScheme
	 * ConfirmationRejectedStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus1#DataSourceScheme
	 * CancelledStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus1#DataSourceScheme
	 * ConditionallyAcceptedStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus3#DataSourceScheme
	 * RejectedStatus3.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatus1#DataSourceScheme
	 * SuspendedStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus1#DataSourceScheme
	 * InRepairStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus2#DataSourceScheme
	 * CancelledStatus2.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2#DataSourceScheme
	 * ConditionallyAcceptedStatusReason2.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus6#DataSourceScheme
	 * RejectedStatus6.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#DataSourceScheme
	 * SuspendedStatusReason2.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1#DataSourceScheme
	 * PartiallySettledStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatusReason3#DataSourceScheme
	 * InRepairStatusReason3.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice#DataSourceScheme
	 * TransferCancellationRejectedStatus1Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice#DataSourceScheme
	 * TransferCancellationCompleteStatusChoice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationRejectedStatus1#DataSourceScheme
	 * TransferCancellationRejectedStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationCompleteStatusAndReason1#DataSourceScheme
	 * TransferCancellationCompleteStatusAndReason1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#DataSourceScheme
	 * PendingSettlementStatusChoice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus#DataSourceScheme
	 * TransferUnmatchedStatus.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus3Choice#DataSourceScheme
	 * RejectedStatus3Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#DataSourceScheme
	 * PendingSettlementStatus2.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferUnmatchedStatus2#DataSourceScheme
	 * TransferUnmatchedStatus2.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus3#DataSourceScheme
	 * InRepairStatus3.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus8Choice#DataSourceScheme
	 * RejectedStatus8Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatus3#DataSourceScheme
	 * CancelledStatus3.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationPendingStatus1#DataSourceScheme
	 * CancellationPendingStatus1.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#DataSourceScheme
	 * RejectedStatusReason9Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferUnmatchedStatus3Choice#DataSourceScheme
	 * TransferUnmatchedStatus3Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#DataSourceScheme
	 * CancelledStatus13Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatus4Choice#DataSourceScheme
	 * InRepairStatus4Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#DataSourceScheme
	 * PendingSettlementStatus3Choice.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationPendingStatus7Choice#DataSourceScheme
	 * CancellationPendingStatus7Choice.DataSourceScheme}</li>
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
	public static final MMBusinessAssociationEnd DataSourceScheme = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnaffirmedReason2Choice.Proprietary, com.tools20022.repository.msg.RejectedStatus4.DataSourceScheme,
					com.tools20022.repository.msg.RejectedStatus7.DataSourceScheme, com.tools20022.repository.msg.ConfirmationRejectedStatus1.DataSourceScheme, com.tools20022.repository.msg.CancelledStatus1.DataSourceScheme,
					com.tools20022.repository.msg.ConditionallyAcceptedStatus1.DataSourceScheme, com.tools20022.repository.msg.RejectedStatus3.DataSourceScheme, com.tools20022.repository.msg.SuspendedStatus1.DataSourceScheme,
					com.tools20022.repository.msg.InRepairStatus1.DataSourceScheme, com.tools20022.repository.msg.CancelledStatus2.DataSourceScheme, com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2.DataSourceScheme,
					com.tools20022.repository.msg.RejectedStatus6.DataSourceScheme, com.tools20022.repository.msg.SuspendedStatusReason2.DataSourceScheme, com.tools20022.repository.msg.PartiallySettledStatus1.DataSourceScheme,
					com.tools20022.repository.msg.InRepairStatusReason3.DataSourceScheme, com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice.DataSourceScheme,
					com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice.DataSourceScheme, com.tools20022.repository.msg.TransferCancellationRejectedStatus1.DataSourceScheme,
					com.tools20022.repository.msg.TransferCancellationCompleteStatusAndReason1.DataSourceScheme, com.tools20022.repository.choice.PendingSettlementStatusChoice.DataSourceScheme,
					com.tools20022.repository.choice.TransferUnmatchedStatus.DataSourceScheme, com.tools20022.repository.choice.RejectedStatus3Choice.DataSourceScheme,
					com.tools20022.repository.msg.PendingSettlementStatus2.DataSourceScheme, com.tools20022.repository.msg.TransferUnmatchedStatus2.DataSourceScheme, com.tools20022.repository.msg.InRepairStatus3.DataSourceScheme,
					com.tools20022.repository.choice.RejectedStatus8Choice.DataSourceScheme, com.tools20022.repository.msg.CancelledStatus3.DataSourceScheme, com.tools20022.repository.msg.CancellationPendingStatus1.DataSourceScheme,
					com.tools20022.repository.choice.RejectedStatusReason9Choice.DataSourceScheme, com.tools20022.repository.choice.TransferUnmatchedStatus3Choice.DataSourceScheme,
					com.tools20022.repository.choice.CancelledStatus13Choice.DataSourceScheme, com.tools20022.repository.choice.InRepairStatus4Choice.DataSourceScheme,
					com.tools20022.repository.choice.PendingSettlementStatus3Choice.DataSourceScheme, com.tools20022.repository.choice.CancellationPendingStatus7Choice.DataSourceScheme);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for the rejected status.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus5#Reason
	 * RejectedStatus5.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#Rejected
	 * AccountManagementStatusAndReason1.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason3Choice#Code
	 * RejectedReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason3Choice#Proprietary
	 * RejectedReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status12Choice#Rejected
	 * Status12Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason4#Structured
	 * RejectedStatusReason4.Structured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus4#Reason
	 * RejectedStatus4.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason4#Rejected
	 * OrderStatusAndReason4.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus7#Reason
	 * RejectedStatus7.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#Rejected
	 * OrderStatusAndReason8.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason6#Structured
	 * RejectedStatusReason6.Structured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus3#Reason
	 * RejectedStatus3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#Rejected
	 * IndividualOrderStatusAndReason1.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus6#Reason
	 * RejectedStatus6.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#Rejected
	 * OrderStatusAndReason7.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason1#Reason
	 * RejectionReason1.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason3#Reason
	 * RejectionReason3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationRejectionReason1#Structured
	 * TransferCancellationRejectionReason1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice#Reason
	 * TransferCancellationRejectedStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationRejectedStatus1#Reason
	 * TransferCancellationRejectedStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason5#Structured
	 * RejectedStatusReason5.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus3Choice#Reason
	 * RejectedStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus8Choice#Reason
	 * RejectedStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason9Choice#Reason
	 * RejectedStatusReason9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason1Choice#Reason
	 * RejectedStatusReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatusReason1Choice#Proprietary
	 * RejectedStatusReason1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status14Choice#Rejected
	 * Status14Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason4Choice#Code
	 * RejectedReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason4Choice#Proprietary
	 * RejectedReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#Rejected
	 * TransferStatus1Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason16#Reason
	 * RejectionReason16.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus9Choice#Reason
	 * RejectedStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus11Choice#Reason
	 * RejectedStatus11Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason23#Reason
	 * RejectionReason23.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus13Choice#Reason
	 * RejectedStatus13Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus16Choice#Reason
	 * RejectedStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus19Choice#Reason
	 * RejectedStatus19Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#Rejected
	 * TransferStatus2Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason32#Reason
	 * RejectionReason32.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason33#Reason
	 * RejectionReason33.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason17Choice#Code
	 * RejectedReason17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason17Choice#Proprietary
	 * RejectedReason17Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status20Choice#Rejected
	 * Status20Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason16Choice#Code
	 * RejectedReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason16Choice#Proprietary
	 * RejectedReason16Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason31#Reason
	 * RejectionReason31.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason15Choice#Code
	 * RejectedReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason15Choice#Proprietary
	 * RejectedReason15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus21Choice#Reason
	 * RejectedStatus21Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus22Choice#Rejected
	 * CancellationStatus22Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status25Choice#Rejected
	 * Status25Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus23Choice#Reason
	 * RejectedStatus23Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus24Choice#Reason
	 * RejectedStatus24Choice.Reason}</li>
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
	public static final MMBusinessAttribute RejectedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RejectedStatus5.Reason, com.tools20022.repository.msg.AccountManagementStatusAndReason1.Rejected, com.tools20022.repository.choice.RejectedReason3Choice.Code,
					com.tools20022.repository.choice.RejectedReason3Choice.Proprietary, com.tools20022.repository.choice.Status12Choice.Rejected, com.tools20022.repository.msg.RejectedStatusReason4.Structured,
					com.tools20022.repository.msg.RejectedStatus4.Reason, com.tools20022.repository.msg.OrderStatusAndReason4.Rejected, com.tools20022.repository.msg.RejectedStatus7.Reason,
					com.tools20022.repository.msg.OrderStatusAndReason8.Rejected, com.tools20022.repository.msg.RejectedStatusReason6.Structured, com.tools20022.repository.msg.RejectedStatus3.Reason,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason1.Rejected, com.tools20022.repository.msg.RejectedStatus6.Reason, com.tools20022.repository.msg.OrderStatusAndReason7.Rejected,
					com.tools20022.repository.msg.RejectionReason1.Reason, com.tools20022.repository.msg.RejectionReason3.Reason, com.tools20022.repository.msg.TransferCancellationRejectionReason1.Structured,
					com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice.Reason, com.tools20022.repository.msg.TransferCancellationRejectedStatus1.Reason,
					com.tools20022.repository.msg.RejectedStatusReason5.Structured, com.tools20022.repository.choice.RejectedStatus3Choice.Reason, com.tools20022.repository.choice.RejectedStatus8Choice.Reason,
					com.tools20022.repository.choice.RejectedStatusReason9Choice.Reason, com.tools20022.repository.choice.RejectedStatusReason1Choice.Reason, com.tools20022.repository.choice.RejectedStatusReason1Choice.Proprietary,
					com.tools20022.repository.choice.Status14Choice.Rejected, com.tools20022.repository.choice.RejectedReason4Choice.Code, com.tools20022.repository.choice.RejectedReason4Choice.Proprietary,
					com.tools20022.repository.choice.TransferStatus1Choice.Rejected, com.tools20022.repository.msg.RejectionReason16.Reason, com.tools20022.repository.choice.RejectedStatus9Choice.Reason,
					com.tools20022.repository.choice.RejectedStatus11Choice.Reason, com.tools20022.repository.msg.RejectionReason23.Reason, com.tools20022.repository.choice.RejectedStatus13Choice.Reason,
					com.tools20022.repository.choice.RejectedStatus16Choice.Reason, com.tools20022.repository.choice.RejectedStatus19Choice.Reason, com.tools20022.repository.choice.TransferStatus2Choice.Rejected,
					com.tools20022.repository.msg.RejectionReason32.Reason, com.tools20022.repository.msg.RejectionReason33.Reason, com.tools20022.repository.choice.RejectedReason17Choice.Code,
					com.tools20022.repository.choice.RejectedReason17Choice.Proprietary, com.tools20022.repository.choice.Status20Choice.Rejected, com.tools20022.repository.choice.RejectedReason16Choice.Code,
					com.tools20022.repository.choice.RejectedReason16Choice.Proprietary, com.tools20022.repository.msg.RejectionReason31.Reason, com.tools20022.repository.choice.RejectedReason15Choice.Code,
					com.tools20022.repository.choice.RejectedReason15Choice.Proprietary, com.tools20022.repository.choice.RejectedStatus21Choice.Reason, com.tools20022.repository.choice.CancellationStatus22Choice.Rejected,
					com.tools20022.repository.choice.Status25Choice.Rejected, com.tools20022.repository.choice.RejectedStatus23Choice.Reason, com.tools20022.repository.choice.RejectedStatus24Choice.Reason);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedStatusReason";
			definition = "Reason for the rejected status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason why a transaction has a failing status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice#Code
	 * FailingReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice#Proprietary
	 * FailingReason1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason1#Code
	 * FailingReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus1Choice#Reason
	 * FailingStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason3Choice#Code
	 * FailingReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason3Choice#Proprietary
	 * FailingReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason3#Code
	 * FailingReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus3Choice#Reason
	 * FailingStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason5Choice#Code
	 * FailingReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason5Choice#Proprietary
	 * FailingReason5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason5#Code
	 * FailingReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus8Choice#Reason
	 * FailingStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason2Choice#Code
	 * FailingReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason2Choice#Proprietary
	 * FailingReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason2#Code
	 * FailingReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus2Choice#Reason
	 * FailingStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#FailingReason
	 * Reason1Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#FailingReason
	 * Reason6Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#FailingReason
	 * Reason2Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#FailingReason
	 * Reason10Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#FailingReason
	 * Reason7Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#FailingReason
	 * Reason11Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason4Choice#Code
	 * FailingReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason4Choice#Proprietary
	 * FailingReason4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason4#Code
	 * FailingReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus4Choice#Reason
	 * FailingStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason6Choice#Code
	 * FailingReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason6Choice#Proprietary
	 * FailingReason6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason6#Code
	 * FailingReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus5Choice#Reason
	 * FailingStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#FailingReason
	 * Reason12Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#FailingReason
	 * Reason13Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#FailingReason
	 * Reason14Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#FailingReason
	 * Reason15Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason8Choice#Code
	 * FailingReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason8Choice#Proprietary
	 * FailingReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice#Code
	 * FailingReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice#Proprietary
	 * FailingReason9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason7#Code
	 * FailingReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason7Choice#Code
	 * FailingReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason7Choice#Proprietary
	 * FailingReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus10Choice#Reason
	 * FailingStatus10Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason8#Code
	 * FailingReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#FailingReason
	 * Reason16Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus9Choice#Reason
	 * FailingStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#FailingReason
	 * Reason17Choice.FailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason15Choice#Code
	 * FailingReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason15Choice#Proprietary
	 * FailingReason15Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason9#Code
	 * FailingReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason10Choice#Code
	 * FailingReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason10Choice#Proprietary
	 * FailingReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason11Choice#Code
	 * FailingReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingReason11Choice#Proprietary
	 * FailingReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus11Choice#Reason
	 * FailingStatus11Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailingReason10#Code
	 * FailingReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailingStatus12Choice#Reason
	 * FailingStatus12Choice.Reason}</li>
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
	public static final MMBusinessAttribute FailingReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FailingReason1Choice.Code, com.tools20022.repository.choice.FailingReason1Choice.Proprietary, com.tools20022.repository.msg.FailingReason1.Code,
					com.tools20022.repository.choice.FailingStatus1Choice.Reason, com.tools20022.repository.choice.FailingReason3Choice.Code, com.tools20022.repository.choice.FailingReason3Choice.Proprietary,
					com.tools20022.repository.msg.FailingReason3.Code, com.tools20022.repository.choice.FailingStatus3Choice.Reason, com.tools20022.repository.choice.FailingReason5Choice.Code,
					com.tools20022.repository.choice.FailingReason5Choice.Proprietary, com.tools20022.repository.msg.FailingReason5.Code, com.tools20022.repository.choice.FailingStatus8Choice.Reason,
					com.tools20022.repository.choice.FailingReason2Choice.Code, com.tools20022.repository.choice.FailingReason2Choice.Proprietary, com.tools20022.repository.msg.FailingReason2.Code,
					com.tools20022.repository.choice.FailingStatus2Choice.Reason, com.tools20022.repository.choice.Reason1Choice.FailingReason, com.tools20022.repository.choice.Reason6Choice.FailingReason,
					com.tools20022.repository.choice.Reason2Choice.FailingReason, com.tools20022.repository.choice.Reason10Choice.FailingReason, com.tools20022.repository.choice.Reason7Choice.FailingReason,
					com.tools20022.repository.choice.Reason11Choice.FailingReason, com.tools20022.repository.choice.FailingReason4Choice.Code, com.tools20022.repository.choice.FailingReason4Choice.Proprietary,
					com.tools20022.repository.msg.FailingReason4.Code, com.tools20022.repository.choice.FailingStatus4Choice.Reason, com.tools20022.repository.choice.FailingReason6Choice.Code,
					com.tools20022.repository.choice.FailingReason6Choice.Proprietary, com.tools20022.repository.msg.FailingReason6.Code, com.tools20022.repository.choice.FailingStatus5Choice.Reason,
					com.tools20022.repository.choice.Reason12Choice.FailingReason, com.tools20022.repository.choice.Reason13Choice.FailingReason, com.tools20022.repository.choice.Reason14Choice.FailingReason,
					com.tools20022.repository.choice.Reason15Choice.FailingReason, com.tools20022.repository.choice.FailingReason8Choice.Code, com.tools20022.repository.choice.FailingReason8Choice.Proprietary,
					com.tools20022.repository.choice.FailingReason9Choice.Code, com.tools20022.repository.choice.FailingReason9Choice.Proprietary, com.tools20022.repository.msg.FailingReason7.Code,
					com.tools20022.repository.choice.FailingReason7Choice.Code, com.tools20022.repository.choice.FailingReason7Choice.Proprietary, com.tools20022.repository.choice.FailingStatus10Choice.Reason,
					com.tools20022.repository.msg.FailingReason8.Code, com.tools20022.repository.choice.Reason16Choice.FailingReason, com.tools20022.repository.choice.FailingStatus9Choice.Reason,
					com.tools20022.repository.choice.Reason17Choice.FailingReason, com.tools20022.repository.choice.FailingReason15Choice.Code, com.tools20022.repository.choice.FailingReason15Choice.Proprietary,
					com.tools20022.repository.msg.FailingReason9.Code, com.tools20022.repository.choice.FailingReason10Choice.Code, com.tools20022.repository.choice.FailingReason10Choice.Proprietary,
					com.tools20022.repository.choice.FailingReason11Choice.Code, com.tools20022.repository.choice.FailingReason11Choice.Proprietary, com.tools20022.repository.choice.FailingStatus11Choice.Reason,
					com.tools20022.repository.msg.FailingReason10.Code, com.tools20022.repository.choice.FailingStatus12Choice.Reason);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailingReason";
			definition = "Reason why a transaction has a failing status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the related instruction is cancelled, or the
	 * related cancellation request is executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice#CancelledStatusReason
	 * PaymentStatusReasonCode4Choice.CancelledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#Cancelled
	 * PaymentStatusReasonCode5Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason5Choice#Code
	 * CancellationReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason5Choice#Proprietary
	 * CancellationReason5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason1#Code
	 * CancellationReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#Cancelled
	 * ProcessingStatus1Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason12Choice#Code
	 * CancellationReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason12Choice#Proprietary
	 * CancellationReason12Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason5#Code
	 * CancellationReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus7Choice#Reason
	 * CancellationStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#Cancelled
	 * ProcessingStatus19Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason3Choice#Code
	 * CancellationReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason3Choice#Proprietary
	 * CancellationReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason2#Code
	 * CancellationReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#Cancelled
	 * ProcessingStatus2Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#Cancelled
	 * ProcessingStatus13Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#Cancelled
	 * ProcessingStatus20Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason13Choice#Code
	 * CancellationReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason13Choice#Proprietary
	 * CancellationReason13Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason6#Code
	 * CancellationReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus11Choice#Reason
	 * CancellationStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#Cancelled
	 * ProcessingStatus25Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason7Choice#Code
	 * CancellationReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason7Choice#Proprietary
	 * CancellationReason7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason3#Code
	 * CancellationReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#Cancelled
	 * ProcessingStatus26Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#CancellationReasonCode
	 * CorporateActionCancellation1.CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#CancellationReason
	 * CorporateActionCancellation1.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2#CancellationReasonCode
	 * CorporateActionCancellation2.CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2#CancellationReason
	 * CorporateActionCancellation2.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason1Choice#Code
	 * CancelledReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason1Choice#Proprietary
	 * CancelledReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason4#ReasonCode
	 * CancelledStatusReason4.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus1Choice#Reason
	 * CancelledStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason2Choice#Code
	 * CancelledReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason2Choice#Proprietary
	 * CancelledReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason5#ReasonCode
	 * CancelledStatusReason5.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus2Choice#Reason
	 * CancelledStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason3Choice#Code
	 * CancelledReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason3Choice#Proprietary
	 * CancelledReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason6#ReasonCode
	 * CancelledStatusReason6.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus3Choice#Reason
	 * CancelledStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus3Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason4Choice#Code
	 * CancelledReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason4Choice#Proprietary
	 * CancelledReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason7#ReasonCode
	 * CancelledStatusReason7.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus4Choice#Reason
	 * CancelledStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus4Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus5Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus6Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#Cancelled
	 * InstructionProcessingStatus1Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#Cancelled
	 * InstructionProcessingStatus4Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#Cancelled
	 * InstructionProcessingStatus7Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#Cancelled
	 * InstructionProcessingStatus8Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#Cancelled
	 * InstructionProcessingStatus12Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#Cancelled
	 * InstructionProcessingStatus13Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason8Choice#Code
	 * CancellationReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason8Choice#Proprietary
	 * CancellationReason8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason4#Code
	 * CancellationReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#Cancelled
	 * ProcessingStatus7Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#CancellationRequested
	 * InstructionProcessingStatus3Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#Cancelled
	 * InstructionProcessingStatus3Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#CancellationRequested
	 * InstructionProcessingStatus6Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#Cancelled
	 * InstructionProcessingStatus6Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#CancellationRequested
	 * InstructionProcessingStatus10Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#Cancelled
	 * InstructionProcessingStatus10Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#CancellationRequested
	 * InstructionProcessingStatus11Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#Cancelled
	 * InstructionProcessingStatus11Choice.Cancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus1#Reason
	 * CancelledStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#Cancelled
	 * OrderStatusAndReason3.Cancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus2#Reason
	 * CancelledStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#Cancelled
	 * OrderStatusAndReason7.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationCompleteReason1#Structured
	 * TransferCancellationCompleteReason1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationCompleteStatusAndReason1#Reason
	 * TransferCancellationCompleteStatusAndReason1.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus3#Reason
	 * CancelledStatus3.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#Cancelled
	 * IntraPositionProcessingStatus1Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#Cancelled
	 * ProcessingStatus3Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason4Choice#Code
	 * CancellationReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason4Choice#Proprietary
	 * CancellationReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#CancellationReason
	 * Reason1Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason9Choice#Code
	 * CancellationReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason9Choice#Proprietary
	 * CancellationReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#CancellationReason
	 * Reason6Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#Cancelled
	 * ProcessingStatus10Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#Cancelled
	 * ProcessingStatus21Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#Cancelled
	 * ProcessingStatus27Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason6Choice#Code
	 * CancellationReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason6Choice#Proprietary
	 * CancellationReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#CancellationReason
	 * Reason2Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason10Choice#Code
	 * CancellationReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason10Choice#Proprietary
	 * CancellationReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#CancellationReason
	 * Reason10Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#CancellationReason
	 * Reason7Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#CancellationReason
	 * Reason11Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#Cancelled
	 * ProcessingStatus9Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#Cancelled
	 * ProcessingStatus16Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#Cancelled
	 * IntraPositionProcessingStatus2Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#Cancelled
	 * IntraPositionProcessingStatus3Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#Cancelled
	 * IntraPositionProcessingStatus4Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice#Reason
	 * CancelledStatusReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatusReason1Choice#Proprietary
	 * CancelledStatusReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus1Choice#Cancelled
	 * OrderStatus1Choice.Cancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatus4#Reason
	 * CancelledStatus4.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#Cancelled
	 * ProcessingStatus34Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#Cancelled
	 * ProcessingStatus32Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#Cancelled
	 * ProcessingStatus35Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#Cancelled
	 * PaymentStatusReasonCode6Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#Cancelled
	 * TransferStatus1Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#CancellationReason
	 * Reason12Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#CancellationRequested
	 * InstructionProcessingStatus14Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#Cancelled
	 * InstructionProcessingStatus14Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#Cancelled
	 * InstructionProcessingStatus15Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#Cancelled
	 * ProcessingStatus38Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#Cancelled
	 * ProcessingStatus37Choice.Cancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason7#Code
	 * CancellationReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason7#AdditionalReasonInformation
	 * CancellationReason7.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason17Choice#Code
	 * CancellationReason17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason17Choice#Proprietary
	 * CancellationReason17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus5Choice#Reason
	 * CancelledStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice#Cancelled
	 * ProcessingStatus39Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#Cancelled
	 * InstructionProcessingStatus16Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#Cancelled
	 * ProcessingStatus40Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#Cancelled
	 * ProcessingStatus42Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#CancellationRequested
	 * InstructionProcessingStatus17Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#Cancelled
	 * InstructionProcessingStatus17Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus41Choice#Cancelled
	 * ProcessingStatus41Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason18Choice#Code
	 * CancellationReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason18Choice#Proprietary
	 * CancellationReason18Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason8#Code
	 * CancellationReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason8#AdditionalReasonInformation
	 * CancellationReason8.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#CancellationReason
	 * Reason13Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus6Choice#Reason
	 * CancelledStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#Cancelled
	 * InstructionProcessingStatus20Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus7Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus7Choice#Reason
	 * CancelledStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason8#ReasonCode
	 * CancelledStatusReason8.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason5Choice#Code
	 * CancelledReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason5Choice#Proprietary
	 * CancelledReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#Cancelled
	 * ProcessingStatus45Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#CancellationReason
	 * Reason14Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#Cancelled
	 * InstructionProcessingStatus21Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus8Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus8Choice#Reason
	 * CancelledStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason9#ReasonCode
	 * CancelledStatusReason9.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus9Choice#Reason
	 * CancelledStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason10#ReasonCode
	 * CancelledStatusReason10.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason6Choice#Code
	 * CancelledReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason6Choice#Proprietary
	 * CancelledReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason7Choice#Code
	 * CancelledReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason7Choice#Proprietary
	 * CancelledReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#Cancelled
	 * ProcessingStatus47Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#CancellationReason
	 * Reason15Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#Cancelled
	 * IntraPositionProcessingStatus5Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#Cancelled
	 * ProcessingStatus48Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#Cancelled
	 * ProcessingStatus54Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#Cancelled
	 * ProcessingStatus51Choice.Cancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason10#Code
	 * CancellationReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason21Choice#Code
	 * CancellationReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason21Choice#Proprietary
	 * CancellationReason21Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason12#Code
	 * CancellationReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason23Choice#Code
	 * CancellationReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason23Choice#Proprietary
	 * CancellationReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus56Choice#Cancelled
	 * ProcessingStatus56Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus10Choice#Reason
	 * CancelledStatus10Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason19Choice#Code
	 * CancellationReason19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason19Choice#Proprietary
	 * CancellationReason19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#Cancelled
	 * ProcessingStatus49Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice#Reason
	 * CancellationStatus14Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason9#Code
	 * CancellationReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#CancellationRequested
	 * InstructionProcessingStatus22Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#Cancelled
	 * InstructionProcessingStatus22Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#Cancelled
	 * ProcessingStatus53Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason22Choice#Code
	 * CancellationReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason22Choice#Proprietary
	 * CancellationReason22Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason11#Code
	 * CancellationReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason11#AdditionalReasonInformation
	 * CancellationReason11.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#CancellationReason
	 * Reason16Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice#Code
	 * CancellationReason20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice#Proprietary
	 * CancellationReason20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus9Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#Cancelled
	 * InstructionProcessingStatus24Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason12#ReasonCode
	 * CancelledStatusReason12.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason9Choice#Code
	 * CancelledReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason9Choice#Proprietary
	 * CancelledReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus12Choice#Reason
	 * CancelledStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus11Choice#Reason
	 * CancelledStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason8Choice#Code
	 * CancelledReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason8Choice#Proprietary
	 * CancelledReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason11#ReasonCode
	 * CancelledStatusReason11.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#Cancelled
	 * TransferStatus2Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus13Choice#Reason
	 * CancelledStatus13Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledCompleteReason1#Reason
	 * CancelledCompleteReason1.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason13#Code
	 * CancellationReason13.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus10Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#Cancelled
	 * InstructionProcessingStatus25Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus14Choice#Reason
	 * CancelledStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason14#ReasonCode
	 * CancelledStatusReason14.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason11Choice#Code
	 * CancelledReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason11Choice#Proprietary
	 * CancelledReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus15Choice#Reason
	 * CancelledStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason13#ReasonCode
	 * CancelledStatusReason13.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason10Choice#Code
	 * CancelledReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason10Choice#Proprietary
	 * CancelledReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#Cancelled
	 * ProcessingStatus57Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#Cancelled
	 * ProcessingStatus65Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#Cancelled
	 * IntraPositionProcessingStatus6Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#Cancelled
	 * ProcessingStatus63Choice.Cancelled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason15#Code
	 * CancellationReason15.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason14#Code
	 * CancellationReason14.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason24Choice#Code
	 * CancellationReason24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason24Choice#Proprietary
	 * CancellationReason24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#CancellationReason
	 * Reason17Choice.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason30Choice#Code
	 * CancellationReason30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason30Choice#Proprietary
	 * CancellationReason30Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason18#Code
	 * CancellationReason18.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus59Choice#Cancelled
	 * ProcessingStatus59Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus16Choice#Reason
	 * CancelledStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason28Choice#Code
	 * CancellationReason28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason28Choice#Proprietary
	 * CancellationReason28Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason16#Code
	 * CancellationReason16.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationReason16#AdditionalReasonInformation
	 * CancellationReason16.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason26Choice#Code
	 * CancellationReason26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason26Choice#Proprietary
	 * CancellationReason26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#CancellationRequested
	 * InstructionProcessingStatus27Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#Cancelled
	 * InstructionProcessingStatus27Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#Cancelled
	 * ProcessingStatus61Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason25Choice#Code
	 * CancellationReason25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason25Choice#Proprietary
	 * CancellationReason25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#Cancelled
	 * ProcessingStatus60Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus17Choice#Reason
	 * CancellationStatus17Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CancellationReason19#Code
	 * CancellationReason19.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason31Choice#Code
	 * CancellationReason31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason31Choice#Proprietary
	 * CancellationReason31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancelledStatusReason16#Reason
	 * CancelledStatusReason16.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#Code
	 * CancelledReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancelledReason12Choice#Proprietary
	 * CancelledReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason32Choice#Code
	 * CancellationReason32Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationReason32Choice#Proprietary
	 * CancellationReason32Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus11Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#Cancelled
	 * InstructionProcessingStatus29Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus12Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#Cancelled
	 * InstructionProcessingStatus30Choice.Cancelled}</li>
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
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode4Choice.CancelledStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.Cancelled,
					com.tools20022.repository.choice.CancellationReason5Choice.Code, com.tools20022.repository.choice.CancellationReason5Choice.Proprietary, com.tools20022.repository.msg.CancellationReason1.Code,
					com.tools20022.repository.choice.ProcessingStatus1Choice.Cancelled, com.tools20022.repository.choice.CancellationReason12Choice.Code, com.tools20022.repository.choice.CancellationReason12Choice.Proprietary,
					com.tools20022.repository.msg.CancellationReason5.Code, com.tools20022.repository.choice.CancellationStatus7Choice.Reason, com.tools20022.repository.choice.ProcessingStatus19Choice.Cancelled,
					com.tools20022.repository.choice.CancellationReason3Choice.Code, com.tools20022.repository.choice.CancellationReason3Choice.Proprietary, com.tools20022.repository.msg.CancellationReason2.Code,
					com.tools20022.repository.choice.ProcessingStatus2Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus13Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus20Choice.Cancelled,
					com.tools20022.repository.choice.CancellationReason13Choice.Code, com.tools20022.repository.choice.CancellationReason13Choice.Proprietary, com.tools20022.repository.msg.CancellationReason6.Code,
					com.tools20022.repository.choice.CancellationStatus11Choice.Reason, com.tools20022.repository.choice.ProcessingStatus25Choice.Cancelled, com.tools20022.repository.choice.CancellationReason7Choice.Code,
					com.tools20022.repository.choice.CancellationReason7Choice.Proprietary, com.tools20022.repository.msg.CancellationReason3.Code, com.tools20022.repository.choice.ProcessingStatus26Choice.Cancelled,
					com.tools20022.repository.msg.CorporateActionCancellation1.CancellationReasonCode, com.tools20022.repository.msg.CorporateActionCancellation1.CancellationReason,
					com.tools20022.repository.msg.CorporateActionCancellation2.CancellationReasonCode, com.tools20022.repository.msg.CorporateActionCancellation2.CancellationReason,
					com.tools20022.repository.choice.CancelledReason1Choice.Code, com.tools20022.repository.choice.CancelledReason1Choice.Proprietary, com.tools20022.repository.msg.CancelledStatusReason4.ReasonCode,
					com.tools20022.repository.choice.CancelledStatus1Choice.Reason, com.tools20022.repository.choice.CancelledReason2Choice.Code, com.tools20022.repository.choice.CancelledReason2Choice.Proprietary,
					com.tools20022.repository.msg.CancelledStatusReason5.ReasonCode, com.tools20022.repository.choice.CancelledStatus2Choice.Reason, com.tools20022.repository.choice.CancelledReason3Choice.Code,
					com.tools20022.repository.choice.CancelledReason3Choice.Proprietary, com.tools20022.repository.msg.CancelledStatusReason6.ReasonCode, com.tools20022.repository.choice.CancelledStatus3Choice.Reason,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice.CancellationCompleted, com.tools20022.repository.choice.CancelledReason4Choice.Code,
					com.tools20022.repository.choice.CancelledReason4Choice.Proprietary, com.tools20022.repository.msg.CancelledStatusReason7.ReasonCode, com.tools20022.repository.choice.CancelledStatus4Choice.Reason,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice.CancellationCompleted, com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.CancellationCompleted,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice.CancellationCompleted, com.tools20022.repository.choice.InstructionProcessingStatus1Choice.Cancelled,
					com.tools20022.repository.choice.InstructionProcessingStatus4Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus7Choice.Cancelled,
					com.tools20022.repository.choice.InstructionProcessingStatus8Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus12Choice.Cancelled,
					com.tools20022.repository.choice.InstructionProcessingStatus13Choice.Cancelled, com.tools20022.repository.choice.CancellationReason8Choice.Code, com.tools20022.repository.choice.CancellationReason8Choice.Proprietary,
					com.tools20022.repository.msg.CancellationReason4.Code, com.tools20022.repository.choice.ProcessingStatus7Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus3Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus3Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus6Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus6Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus10Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus10Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus11Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus11Choice.Cancelled, com.tools20022.repository.msg.CancelledStatus1.Reason, com.tools20022.repository.msg.OrderStatusAndReason3.Cancelled,
					com.tools20022.repository.msg.CancelledStatus2.Reason, com.tools20022.repository.msg.OrderStatusAndReason7.Cancelled, com.tools20022.repository.msg.TransferCancellationCompleteReason1.Structured,
					com.tools20022.repository.msg.TransferCancellationCompleteStatusAndReason1.Reason, com.tools20022.repository.msg.CancelledStatus3.Reason, com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus3Choice.Cancelled, com.tools20022.repository.choice.CancellationReason4Choice.Code, com.tools20022.repository.choice.CancellationReason4Choice.Proprietary,
					com.tools20022.repository.choice.Reason1Choice.CancellationReason, com.tools20022.repository.choice.CancellationReason9Choice.Code, com.tools20022.repository.choice.CancellationReason9Choice.Proprietary,
					com.tools20022.repository.choice.Reason6Choice.CancellationReason, com.tools20022.repository.choice.ProcessingStatus10Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus21Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus27Choice.Cancelled, com.tools20022.repository.choice.CancellationReason6Choice.Code, com.tools20022.repository.choice.CancellationReason6Choice.Proprietary,
					com.tools20022.repository.choice.Reason2Choice.CancellationReason, com.tools20022.repository.choice.CancellationReason10Choice.Code, com.tools20022.repository.choice.CancellationReason10Choice.Proprietary,
					com.tools20022.repository.choice.Reason10Choice.CancellationReason, com.tools20022.repository.choice.Reason7Choice.CancellationReason, com.tools20022.repository.choice.Reason11Choice.CancellationReason,
					com.tools20022.repository.choice.ProcessingStatus9Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus16Choice.Cancelled, com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice.Cancelled,
					com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.Cancelled, com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice.Cancelled,
					com.tools20022.repository.choice.CancelledStatusReason1Choice.Reason, com.tools20022.repository.choice.CancelledStatusReason1Choice.Proprietary, com.tools20022.repository.choice.OrderStatus1Choice.Cancelled,
					com.tools20022.repository.msg.CancelledStatus4.Reason, com.tools20022.repository.choice.ProcessingStatus34Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus32Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus35Choice.Cancelled, com.tools20022.repository.choice.PaymentStatusReasonCode6Choice.Cancelled, com.tools20022.repository.choice.TransferStatus1Choice.Cancelled,
					com.tools20022.repository.choice.Reason12Choice.CancellationReason, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus14Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus15Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus38Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus37Choice.Cancelled, com.tools20022.repository.msg.CancellationReason7.Code,
					com.tools20022.repository.msg.CancellationReason7.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationReason17Choice.Code, com.tools20022.repository.choice.CancellationReason17Choice.Proprietary,
					com.tools20022.repository.choice.CancelledStatus5Choice.Reason, com.tools20022.repository.choice.ProcessingStatus39Choice.Cancelled, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus40Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus42Choice.Cancelled,
					com.tools20022.repository.choice.InstructionProcessingStatus17Choice.CancellationRequested, com.tools20022.repository.choice.InstructionProcessingStatus17Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus41Choice.Cancelled, com.tools20022.repository.choice.CancellationReason18Choice.Code, com.tools20022.repository.choice.CancellationReason18Choice.Proprietary,
					com.tools20022.repository.msg.CancellationReason8.Code, com.tools20022.repository.msg.CancellationReason8.AdditionalReasonInformation, com.tools20022.repository.choice.Reason13Choice.CancellationReason,
					com.tools20022.repository.choice.CancelledStatus6Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.Cancelled,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice.CancellationCompleted, com.tools20022.repository.choice.CancelledStatus7Choice.Reason,
					com.tools20022.repository.msg.CancelledStatusReason8.ReasonCode, com.tools20022.repository.choice.CancelledReason5Choice.Code, com.tools20022.repository.choice.CancelledReason5Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus45Choice.Cancelled, com.tools20022.repository.choice.Reason14Choice.CancellationReason, com.tools20022.repository.choice.InstructionProcessingStatus21Choice.Cancelled,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice.CancellationCompleted, com.tools20022.repository.choice.CancelledStatus8Choice.Reason,
					com.tools20022.repository.msg.CancelledStatusReason9.ReasonCode, com.tools20022.repository.choice.CancelledStatus9Choice.Reason, com.tools20022.repository.msg.CancelledStatusReason10.ReasonCode,
					com.tools20022.repository.choice.CancelledReason6Choice.Code, com.tools20022.repository.choice.CancelledReason6Choice.Proprietary, com.tools20022.repository.choice.CancelledReason7Choice.Code,
					com.tools20022.repository.choice.CancelledReason7Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus47Choice.Cancelled, com.tools20022.repository.choice.Reason15Choice.CancellationReason,
					com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus48Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus54Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus51Choice.Cancelled, com.tools20022.repository.msg.CancellationReason10.Code, com.tools20022.repository.choice.CancellationReason21Choice.Code,
					com.tools20022.repository.choice.CancellationReason21Choice.Proprietary, com.tools20022.repository.msg.CancellationReason12.Code, com.tools20022.repository.choice.CancellationReason23Choice.Code,
					com.tools20022.repository.choice.CancellationReason23Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus56Choice.Cancelled, com.tools20022.repository.choice.CancelledStatus10Choice.Reason,
					com.tools20022.repository.choice.CancellationReason19Choice.Code, com.tools20022.repository.choice.CancellationReason19Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus49Choice.Cancelled,
					com.tools20022.repository.choice.CancellationStatus14Choice.Reason, com.tools20022.repository.msg.CancellationReason9.Code, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus22Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus53Choice.Cancelled, com.tools20022.repository.choice.CancellationReason22Choice.Code,
					com.tools20022.repository.choice.CancellationReason22Choice.Proprietary, com.tools20022.repository.msg.CancellationReason11.Code, com.tools20022.repository.msg.CancellationReason11.AdditionalReasonInformation,
					com.tools20022.repository.choice.Reason16Choice.CancellationReason, com.tools20022.repository.choice.CancellationReason20Choice.Code, com.tools20022.repository.choice.CancellationReason20Choice.Proprietary,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice.CancellationCompleted, com.tools20022.repository.choice.InstructionProcessingStatus24Choice.Cancelled,
					com.tools20022.repository.msg.CancelledStatusReason12.ReasonCode, com.tools20022.repository.choice.CancelledReason9Choice.Code, com.tools20022.repository.choice.CancelledReason9Choice.Proprietary,
					com.tools20022.repository.choice.CancelledStatus12Choice.Reason, com.tools20022.repository.choice.CancelledStatus11Choice.Reason, com.tools20022.repository.choice.CancelledReason8Choice.Code,
					com.tools20022.repository.choice.CancelledReason8Choice.Proprietary, com.tools20022.repository.msg.CancelledStatusReason11.ReasonCode, com.tools20022.repository.choice.TransferStatus2Choice.Cancelled,
					com.tools20022.repository.choice.CancelledStatus13Choice.Reason, com.tools20022.repository.msg.CancelledCompleteReason1.Reason, com.tools20022.repository.msg.CancellationReason13.Code,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice.CancellationCompleted, com.tools20022.repository.choice.InstructionProcessingStatus25Choice.Cancelled,
					com.tools20022.repository.choice.CancelledStatus14Choice.Reason, com.tools20022.repository.msg.CancelledStatusReason14.ReasonCode, com.tools20022.repository.choice.CancelledReason11Choice.Code,
					com.tools20022.repository.choice.CancelledReason11Choice.Proprietary, com.tools20022.repository.choice.CancelledStatus15Choice.Reason, com.tools20022.repository.msg.CancelledStatusReason13.ReasonCode,
					com.tools20022.repository.choice.CancelledReason10Choice.Code, com.tools20022.repository.choice.CancelledReason10Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus57Choice.Cancelled,
					com.tools20022.repository.choice.ProcessingStatus65Choice.Cancelled, com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus63Choice.Cancelled,
					com.tools20022.repository.msg.CancellationReason15.Code, com.tools20022.repository.msg.CancellationReason14.Code, com.tools20022.repository.choice.CancellationReason24Choice.Code,
					com.tools20022.repository.choice.CancellationReason24Choice.Proprietary, com.tools20022.repository.choice.Reason17Choice.CancellationReason, com.tools20022.repository.choice.CancellationReason30Choice.Code,
					com.tools20022.repository.choice.CancellationReason30Choice.Proprietary, com.tools20022.repository.msg.CancellationReason18.Code, com.tools20022.repository.choice.ProcessingStatus59Choice.Cancelled,
					com.tools20022.repository.choice.CancelledStatus16Choice.Reason, com.tools20022.repository.choice.CancellationReason28Choice.Code, com.tools20022.repository.choice.CancellationReason28Choice.Proprietary,
					com.tools20022.repository.msg.CancellationReason16.Code, com.tools20022.repository.msg.CancellationReason16.AdditionalReasonInformation, com.tools20022.repository.choice.CancellationReason26Choice.Code,
					com.tools20022.repository.choice.CancellationReason26Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus27Choice.CancellationRequested,
					com.tools20022.repository.choice.InstructionProcessingStatus27Choice.Cancelled, com.tools20022.repository.choice.ProcessingStatus61Choice.Cancelled, com.tools20022.repository.choice.CancellationReason25Choice.Code,
					com.tools20022.repository.choice.CancellationReason25Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus60Choice.Cancelled, com.tools20022.repository.choice.CancellationStatus17Choice.Reason,
					com.tools20022.repository.msg.CancellationReason19.Code, com.tools20022.repository.choice.CancellationReason31Choice.Code, com.tools20022.repository.choice.CancellationReason31Choice.Proprietary,
					com.tools20022.repository.msg.CancelledStatusReason16.Reason, com.tools20022.repository.choice.CancelledReason12Choice.Code, com.tools20022.repository.choice.CancelledReason12Choice.Proprietary,
					com.tools20022.repository.choice.CancellationReason32Choice.Code, com.tools20022.repository.choice.CancellationReason32Choice.Proprietary,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice.CancellationCompleted, com.tools20022.repository.choice.InstructionProcessingStatus29Choice.Cancelled,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.CancellationCompleted, com.tools20022.repository.choice.InstructionProcessingStatus30Choice.Cancelled);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReasonV2Code.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction processing is pending.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice#Code
	 * PendingProcessingReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice#Proprietary
	 * PendingProcessingReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason1#Code
	 * PendingProcessingReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus1Choice#Reason
	 * PendingProcessingStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice#Code
	 * PendingReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice#Proprietary
	 * PendingReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason2#Code
	 * PendingReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus4Choice#Reason
	 * PendingStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#PendingProcessing
	 * ProcessingStatus1Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#PendingCancellation
	 * ProcessingStatus1Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason3Choice#Code
	 * PendingProcessingReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason3Choice#Proprietary
	 * PendingProcessingReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason3#Code
	 * PendingProcessingReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus3Choice#Reason
	 * PendingProcessingStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus13Choice#Reason
	 * PendingStatus13Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#PendingProcessing
	 * ProcessingStatus19Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#PendingCancellation
	 * ProcessingStatus19Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason1Choice#Code
	 * PendingReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason1Choice#Proprietary
	 * PendingReason1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason1#Code
	 * PendingReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason13Choice#Code
	 * PendingReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason13Choice#Proprietary
	 * PendingReason13Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason5#Code
	 * PendingReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus9Choice#Reason
	 * PendingStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason5Choice#Code
	 * PendingProcessingReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason5Choice#Proprietary
	 * PendingProcessingReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason5#Code
	 * PendingProcessingReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus7Choice#Reason
	 * PendingProcessingStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#PendingProcessing
	 * ModificationProcessingStatus2Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#PendingCancellation
	 * ProcessingStatus2Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#PendingCancellation
	 * ProcessingStatus13Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason15Choice#Code
	 * PendingReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason15Choice#Proprietary
	 * PendingReason15Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason7#Code
	 * PendingReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus11Choice#Reason
	 * PendingStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#PendingCancellation
	 * ProcessingStatus20Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason7Choice#Code
	 * PendingProcessingReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason7Choice#Proprietary
	 * PendingProcessingReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason7#Code
	 * PendingProcessingReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus9Choice#Reason
	 * PendingProcessingStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason9Choice#Code
	 * PendingReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason9Choice#Proprietary
	 * PendingReason9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason3#Code
	 * PendingReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus24Choice#Reason
	 * PendingStatus24Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#PendingProcessing
	 * ProcessingStatus25Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#PendingCancellation
	 * ProcessingStatus25Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason18Choice#Code
	 * PendingReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason18Choice#Proprietary
	 * PendingReason18Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason10#Code
	 * PendingReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus31Choice#Reason
	 * PendingStatus31Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason6Choice#Code
	 * PendingProcessingReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason6Choice#Proprietary
	 * PendingProcessingReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason6#Code
	 * PendingProcessingReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus8Choice#Reason
	 * PendingProcessingStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#PendingProcessing
	 * ModificationProcessingStatus3Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason20Choice#Code
	 * PendingReason20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason20Choice#Proprietary
	 * PendingReason20Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason12#Code
	 * PendingReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus22Choice#Reason
	 * PendingStatus22Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#PendingCancellation
	 * ProcessingStatus26Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason4Choice#Code
	 * PendingReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason4Choice#Proprietary
	 * PendingReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason2#ReasonCode
	 * PendingStatusReason2.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice#Pending
	 * EventProcessingStatus1Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason5Choice#Code
	 * PendingReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason5Choice#Proprietary
	 * PendingReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason3#ReasonCode
	 * PendingStatusReason3.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice#Pending
	 * EventProcessingStatus2Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1#ReasonCode
	 * PendingCancellationStatusReason1.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus1Choice#Reason
	 * PendingCancellationStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#PendingCancellation
	 * InstructionCancellationRequestStatus1Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason2#ReasonCode
	 * PendingCancellationStatusReason2.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus2Choice#Reason
	 * PendingCancellationStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#PendingCancellation
	 * InstructionCancellationRequestStatus2Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#PendingCancellation
	 * InstructionCancellationRequestStatus3Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#PendingCancellation
	 * InstructionCancellationRequestStatus4Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3#ReasonCode
	 * PendingCancellationStatusReason3.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus3Choice#Reason
	 * PendingCancellationStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#PendingCancellation
	 * InstructionCancellationRequestStatus5Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4#ReasonCode
	 * PendingCancellationStatusReason4.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus4Choice#Reason
	 * PendingCancellationStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#PendingCancellation
	 * InstructionCancellationRequestStatus6Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason6Choice#Code
	 * PendingReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason6Choice#Proprietary
	 * PendingReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason1#ReasonCode
	 * PendingStatusReason1.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus1Choice#Reason
	 * PendingStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#Pending
	 * InstructionProcessingStatus1Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason7Choice#Code
	 * PendingReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason7Choice#Proprietary
	 * PendingReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason4#ReasonCode
	 * PendingStatusReason4.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus6Choice#Reason
	 * PendingStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#Pending
	 * InstructionProcessingStatus4Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#Pending
	 * InstructionProcessingStatus7Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#Pending
	 * InstructionProcessingStatus8Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#Pending
	 * InstructionProcessingStatus12Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#Pending
	 * InstructionProcessingStatus13Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#Pending
	 * ProcessingStatus5Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus7Choice#Reason
	 * PendingStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#Pending
	 * ProcessingStatus11Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#Pending
	 * ProcessingStatus14Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#Pending
	 * ProcessingStatus15Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#Pending
	 * ProcessingStatus18Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#Pending
	 * ProcessingStatus24Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#PendingProcessing
	 * ProcessingStatus6Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#PendingCancellation
	 * ProcessingStatus6Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason2Choice#Code
	 * PendingProcessingReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason2Choice#Proprietary
	 * PendingProcessingReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason2#Code
	 * PendingProcessingReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus2Choice#Reason
	 * PendingProcessingStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#PendingProcessing
	 * ProcessingStatus12Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#PendingCancellation
	 * ProcessingStatus12Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason10Choice#Code
	 * PendingReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason10Choice#Proprietary
	 * PendingReason10Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason4#Code
	 * PendingReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#PendingProcessing
	 * ProcessingStatus23Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#PendingCancellation
	 * ProcessingStatus23Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#PendingProcessing
	 * ProcessingStatus29Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#PendingCancellation
	 * ProcessingStatus29Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#PendingProcessing
	 * ProcessingStatus7Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#PendingCancellation
	 * ProcessingStatus7Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#PendingProcessing
	 * InstructionProcessingStatus3Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#PendingCancellation
	 * InstructionProcessingStatus3Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#PendingProcessing
	 * InstructionProcessingStatus6Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#PendingCancellation
	 * InstructionProcessingStatus6Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#PendingProcessing
	 * InstructionProcessingStatus10Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#PendingCancellation
	 * InstructionProcessingStatus10Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#PendingProcessing
	 * InstructionProcessingStatus11Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#PendingCancellation
	 * InstructionProcessingStatus11Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#PendingProcessing
	 * ProcessingStatus17Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#CancellationPending
	 * TransferStatusAndReason2.CancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#PendingCancellation
	 * ProcessingStatus3Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#PendingProcessing
	 * ProcessingStatus3Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice#Code
	 * PendingCancellationReasons2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice#Proprietary
	 * PendingCancellationReasons2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason3Choice#Code
	 * PendingReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason3Choice#Proprietary
	 * PendingReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#PendingCancellationReason
	 * Reason1Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#PendingReason
	 * Reason1Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#PendingProcessingReason
	 * Reason1Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#PendingModificationReason
	 * Reason1Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason11Choice#Code
	 * PendingReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason11Choice#Proprietary
	 * PendingReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#PendingCancellationReason
	 * Reason6Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#PendingReason
	 * Reason6Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#PendingProcessingReason
	 * Reason6Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#PendingModificationReason
	 * Reason6Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#PendingCancellation
	 * ProcessingStatus10Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#PendingProcessing
	 * ProcessingStatus10Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus4Choice#Reason
	 * PendingProcessingStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#PendingCancellation
	 * ProcessingStatus21Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#PendingProcessing
	 * ProcessingStatus21Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus15Choice#Reason
	 * PendingStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus10Choice#Reason
	 * PendingProcessingStatus10Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#PendingCancellation
	 * ProcessingStatus27Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#PendingProcessing
	 * ProcessingStatus27Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus26Choice#Reason
	 * PendingStatus26Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons3Choice#Code
	 * PendingCancellationReasons3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons3Choice#Proprietary
	 * PendingCancellationReasons3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason8Choice#Code
	 * PendingReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason8Choice#Proprietary
	 * PendingReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#PendingCancellationReason
	 * Reason2Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#PendingReason
	 * Reason2Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#PendingProcessingReason
	 * Reason2Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#PendingModificationReason
	 * Reason2Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason12Choice#Code
	 * PendingReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason12Choice#Proprietary
	 * PendingReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#PendingCancellationReason
	 * Reason10Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#PendingReason
	 * Reason10Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#PendingProcessingReason
	 * Reason10Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#PendingModificationReason
	 * Reason10Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#PendingCancellationReason
	 * Reason7Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#PendingReason
	 * Reason7Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#PendingProcessingReason
	 * Reason7Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#PendingModificationReason
	 * Reason7Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#PendingCancellationReason
	 * Reason11Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#PendingReason
	 * Reason11Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#PendingProcessingReason
	 * Reason11Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#PendingModificationReason
	 * Reason11Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#PendingCancellation
	 * ProcessingStatus9Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#PendingCancellation
	 * ProcessingStatus16Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason16Choice#Code
	 * PendingReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason16Choice#Proprietary
	 * PendingReason16Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason8#Code
	 * PendingReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus12Choice#Reason
	 * PendingStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason21Choice#Code
	 * PendingReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason21Choice#Proprietary
	 * PendingReason21Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason13#Code
	 * PendingReason13.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus23Choice#Reason
	 * PendingStatus23Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#PendingCancellation
	 * ProcessingStatus32Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#PendingProcessing
	 * ProcessingStatus36Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#Pending
	 * ProcessingStatus31Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#PendingCancellationReason
	 * Reason12Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#PendingReason
	 * Reason12Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#PendingProcessingReason
	 * Reason12Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#PendingModificationReason
	 * Reason12Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#PendingProcessing
	 * InstructionProcessingStatus14Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#PendingCancellation
	 * InstructionProcessingStatus14Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason22Choice#Code
	 * PendingReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason22Choice#Proprietary
	 * PendingReason22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus32Choice#Reason
	 * PendingStatus32Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason5#ReasonCode
	 * PendingStatusReason5.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#Pending
	 * InstructionProcessingStatus15Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#PendingCancellation
	 * ProcessingStatus38Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#PendingProcessing
	 * ProcessingStatus38Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#PendingProcessing
	 * ProcessingStatus37Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#PendingCancellation
	 * ProcessingStatus37Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#Pending
	 * InstructionProcessingStatus16Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason6#ReasonCode
	 * PendingStatusReason6.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason23Choice#Code
	 * PendingReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason23Choice#Proprietary
	 * PendingReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus33Choice#Reason
	 * PendingStatus33Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#PendingCancellation
	 * ProcessingStatus40Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#PendingProcessing
	 * ProcessingStatus40Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#PendingProcessing
	 * ProcessingStatus42Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#PendingCancellation
	 * ProcessingStatus42Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#PendingProcessing
	 * InstructionProcessingStatus17Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#PendingCancellation
	 * InstructionProcessingStatus17Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#PendingCancellationReason
	 * Reason13Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#PendingReason
	 * Reason13Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#PendingProcessingReason
	 * Reason13Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#PendingModificationReason
	 * Reason13Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#Pending
	 * InstructionProcessingStatus20Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#PendingCancellation
	 * InstructionCancellationRequestStatus7Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus34Choice#Reason
	 * PendingStatus34Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason7#ReasonCode
	 * PendingStatusReason7.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason24Choice#Code
	 * PendingReason24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason24Choice#Proprietary
	 * PendingReason24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#Pending
	 * ProcessingStatus44Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#PendingProcessing
	 * ModificationProcessingStatus4Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#PendingCancellation
	 * ProcessingStatus45Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#PendingCancellationReason
	 * Reason14Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#PendingReason
	 * Reason14Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#PendingProcessingReason
	 * Reason14Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#PendingModificationReason
	 * Reason14Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#Pending
	 * InstructionProcessingStatus21Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#PendingCancellation
	 * InstructionCancellationRequestStatus8Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus35Choice#Reason
	 * PendingStatus35Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason8#ReasonCode
	 * PendingStatusReason8.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason25Choice#Code
	 * PendingReason25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason25Choice#Proprietary
	 * PendingReason25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#PendingProcessing
	 * ModificationProcessingStatus6Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#PendingCancellation
	 * ProcessingStatus47Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#Pending
	 * ProcessingStatus46Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#PendingCancellationReason
	 * Reason15Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#PendingReason
	 * Reason15Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#PendingProcessingReason
	 * Reason15Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#PendingModificationReason
	 * Reason15Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#PendingProcessing
	 * ModificationProcessingStatus5Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#Pending
	 * ProcessingStatus50Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#PendingProcessing
	 * ProcessingStatus48Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#PendingCancellation
	 * ProcessingStatus48Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#PendingProcessing
	 * ModificationProcessingStatus7Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#PendingCancellation
	 * ProcessingStatus54Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#PendingCancellation
	 * ProcessingStatus51Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#PendingProcessing
	 * ProcessingStatus51Choice.PendingProcessing}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason17#Code
	 * PendingReason17.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason30Choice#Code
	 * PendingReason30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason30Choice#Proprietary
	 * PendingReason30Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason16#Code
	 * PendingReason16.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice#Code
	 * PendingReason28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice#Proprietary
	 * PendingReason28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice#Code
	 * PendingProcessingReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason12Choice#Proprietary
	 * PendingProcessingReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#PendingProcessing
	 * ProcessingStatus52Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#PendingCancellation
	 * ProcessingStatus52Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus37Choice#Reason
	 * PendingStatus37Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason15#Code
	 * PendingReason15.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice#Reason
	 * PendingStatus38Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason10#Code
	 * PendingProcessingReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice#Reason
	 * PendingProcessingStatus13Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason14#Code
	 * PendingReason14.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason26Choice#Code
	 * PendingReason26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason26Choice#Proprietary
	 * PendingReason26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#PendingProcessing
	 * ProcessingStatus49Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#PendingCancellation
	 * ProcessingStatus49Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice#Reason
	 * PendingProcessingStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus40Choice#Reason
	 * PendingStatus40Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason8#Code
	 * PendingProcessingReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice#Code
	 * PendingReason29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice#Proprietary
	 * PendingReason29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#PendingProcessing
	 * InstructionProcessingStatus22Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#PendingCancellation
	 * InstructionProcessingStatus22Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice#Code
	 * PendingProcessingReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason10Choice#Proprietary
	 * PendingProcessingReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus39Choice#Reason
	 * PendingStatus39Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus12Choice#Reason
	 * PendingProcessingStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason9#Code
	 * PendingProcessingReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#PendingCancellation
	 * ProcessingStatus53Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice#Code
	 * PendingProcessingReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice#Proprietary
	 * PendingProcessingReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason27Choice#Code
	 * PendingReason27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason27Choice#Proprietary
	 * PendingReason27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus36Choice#Reason
	 * PendingStatus36Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#PendingCancellationReason
	 * Reason16Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#PendingReason
	 * Reason16Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#PendingProcessingReason
	 * Reason16Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#PendingModificationReason
	 * Reason16Choice.PendingModificationReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason18#Code
	 * PendingReason18.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice#Code
	 * PendingCancellationReasons4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice#Proprietary
	 * PendingCancellationReasons4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason31Choice#Code
	 * PendingReason31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason31Choice#Proprietary
	 * PendingReason31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#Pending
	 * EventProcessingStatus3Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#PendingCancellation
	 * InstructionCancellationRequestStatus9Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#Pending
	 * InstructionProcessingStatus24Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus42Choice#Reason
	 * PendingStatus42Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus5Choice#Reason
	 * PendingCancellationStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason10#ReasonCode
	 * PendingStatusReason10.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason33Choice#Code
	 * PendingReason33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason33Choice#Proprietary
	 * PendingReason33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason32Choice#Code
	 * PendingReason32Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason32Choice#Proprietary
	 * PendingReason32Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5#ReasonCode
	 * PendingCancellationStatusReason5.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason9#ReasonCode
	 * PendingStatusReason9.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#PendingCancellation
	 * InstructionCancellationRequestStatus10Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#Pending
	 * InstructionProcessingStatus25Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice#Pending
	 * EventProcessingStatus4Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus6Choice#Reason
	 * PendingCancellationStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6#ReasonCode
	 * PendingCancellationStatusReason6.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason35Choice#Code
	 * PendingReason35Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason35Choice#Proprietary
	 * PendingReason35Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason11#ReasonCode
	 * PendingStatusReason11.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason12#ReasonCode
	 * PendingStatusReason12.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason34Choice#Code
	 * PendingReason34Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason34Choice#Proprietary
	 * PendingReason34Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus44Choice#Reason
	 * PendingStatus44Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#PendingCancellation
	 * ProcessingStatus57Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#PendingProcessing
	 * ProcessingStatus57Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#PendingCancellation
	 * ProcessingStatus65Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#Pending
	 * ProcessingStatus58Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#PendingProcessing
	 * ProcessingStatus63Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#PendingCancellation
	 * ProcessingStatus63Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason37Choice#Code
	 * PendingReason37Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason37Choice#Proprietary
	 * PendingReason37Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#PendingCancellationReason
	 * Reason17Choice.PendingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#PendingReason
	 * Reason17Choice.PendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#PendingProcessingReason
	 * Reason17Choice.PendingProcessingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#PendingModificationReason
	 * Reason17Choice.PendingModificationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason47Choice#Code
	 * PendingReason47Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason47Choice#Proprietary
	 * PendingReason47Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons5Choice#Code
	 * PendingCancellationReasons5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons5Choice#Proprietary
	 * PendingCancellationReasons5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason11#Code
	 * PendingProcessingReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason13Choice#Code
	 * PendingProcessingReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason13Choice#Proprietary
	 * PendingProcessingReason13Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason25#Code
	 * PendingReason25.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason42Choice#Code
	 * PendingReason42Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason42Choice#Proprietary
	 * PendingReason42Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus46Choice#Reason
	 * PendingStatus46Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason20#Code
	 * PendingReason20.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#PendingProcessing
	 * ProcessingStatus62Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#PendingCancellation
	 * ProcessingStatus62Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason12#Code
	 * PendingProcessingReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason14Choice#Code
	 * PendingProcessingReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason14Choice#Proprietary
	 * PendingProcessingReason14Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason19#Code
	 * PendingReason19.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason36Choice#Code
	 * PendingReason36Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason36Choice#Proprietary
	 * PendingReason36Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#PendingProcessing
	 * InstructionProcessingStatus27Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#PendingCancellation
	 * InstructionProcessingStatus27Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus15Choice#Reason
	 * PendingProcessingStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus16Choice#Reason
	 * PendingProcessingStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingReason13#Code
	 * PendingProcessingReason13.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus45Choice#Reason
	 * PendingStatus45Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#PendingProcessing
	 * ModificationProcessingStatus8Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#PendingCancellation
	 * ProcessingStatus61Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus51Choice#Reason
	 * PendingStatus51Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason24#Code
	 * PendingReason24.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason41Choice#Code
	 * PendingReason41Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason41Choice#Proprietary
	 * PendingReason41Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus50Choice#Reason
	 * PendingStatus50Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason15Choice#Code
	 * PendingProcessingReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason15Choice#Proprietary
	 * PendingProcessingReason15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason38Choice#Code
	 * PendingReason38Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason38Choice#Proprietary
	 * PendingReason38Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#PendingProcessing
	 * ProcessingStatus60Choice.PendingProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#PendingCancellation
	 * ProcessingStatus60Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus14Choice#Reason
	 * PendingProcessingStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus47Choice#Reason
	 * PendingStatus47Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingReason21#Code
	 * PendingReason21.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason14#Code
	 * PendingStatusReason14.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingOpeningStatusReason1#Code
	 * PendingOpeningStatusReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosurePendingStatusReason1#Code
	 * ClosurePendingStatusReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#PendingCancellation
	 * InstructionCancellationRequestStatus11Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#Pending
	 * InstructionProcessingStatus29Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice#Reason
	 * PendingCancellationStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason48Choice#Code
	 * PendingReason48Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason48Choice#Proprietary
	 * PendingReason48Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus52Choice#Reason
	 * PendingStatus52Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7#ReasonCode
	 * PendingCancellationStatusReason7.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason13#ReasonCode
	 * PendingStatusReason13.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#PendingCancellation
	 * InstructionCancellationRequestStatus12Choice.PendingCancellation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#Pending
	 * InstructionProcessingStatus30Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus8Choice#Reason
	 * PendingCancellationStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8#ReasonCode
	 * PendingCancellationStatusReason8.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingStatus53Choice#Reason
	 * PendingStatus53Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason49Choice#Code
	 * PendingReason49Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingReason49Choice#Proprietary
	 * PendingReason49Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusReason15#ReasonCode
	 * PendingStatusReason15.ReasonCode}</li>
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
	public static final MMBusinessAttribute PendingReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PendingProcessingReason1Choice.Code, com.tools20022.repository.choice.PendingProcessingReason1Choice.Proprietary,
					com.tools20022.repository.msg.PendingProcessingReason1.Code, com.tools20022.repository.choice.PendingProcessingStatus1Choice.Reason, com.tools20022.repository.choice.PendingReason2Choice.Code,
					com.tools20022.repository.choice.PendingReason2Choice.Proprietary, com.tools20022.repository.msg.PendingReason2.Code, com.tools20022.repository.choice.PendingStatus4Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus1Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus1Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingProcessingReason3Choice.Code, com.tools20022.repository.choice.PendingProcessingReason3Choice.Proprietary, com.tools20022.repository.msg.PendingProcessingReason3.Code,
					com.tools20022.repository.choice.PendingProcessingStatus3Choice.Reason, com.tools20022.repository.choice.PendingStatus13Choice.Reason, com.tools20022.repository.choice.ProcessingStatus19Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus19Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason1Choice.Code, com.tools20022.repository.choice.PendingReason1Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason1.Code, com.tools20022.repository.choice.PendingReason13Choice.Code, com.tools20022.repository.choice.PendingReason13Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason5.Code, com.tools20022.repository.choice.PendingStatus9Choice.Reason, com.tools20022.repository.choice.PendingProcessingReason5Choice.Code,
					com.tools20022.repository.choice.PendingProcessingReason5Choice.Proprietary, com.tools20022.repository.msg.PendingProcessingReason5.Code, com.tools20022.repository.choice.PendingProcessingStatus7Choice.Reason,
					com.tools20022.repository.choice.ModificationProcessingStatus2Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus2Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus13Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason15Choice.Code, com.tools20022.repository.choice.PendingReason15Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason7.Code, com.tools20022.repository.choice.PendingStatus11Choice.Reason, com.tools20022.repository.choice.ProcessingStatus20Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingProcessingReason7Choice.Code, com.tools20022.repository.choice.PendingProcessingReason7Choice.Proprietary, com.tools20022.repository.msg.PendingProcessingReason7.Code,
					com.tools20022.repository.choice.PendingProcessingStatus9Choice.Reason, com.tools20022.repository.choice.PendingReason9Choice.Code, com.tools20022.repository.choice.PendingReason9Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason3.Code, com.tools20022.repository.choice.PendingStatus24Choice.Reason, com.tools20022.repository.choice.ProcessingStatus25Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus25Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason18Choice.Code, com.tools20022.repository.choice.PendingReason18Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason10.Code, com.tools20022.repository.choice.PendingStatus31Choice.Reason, com.tools20022.repository.choice.PendingProcessingReason6Choice.Code,
					com.tools20022.repository.choice.PendingProcessingReason6Choice.Proprietary, com.tools20022.repository.msg.PendingProcessingReason6.Code, com.tools20022.repository.choice.PendingProcessingStatus8Choice.Reason,
					com.tools20022.repository.choice.ModificationProcessingStatus3Choice.PendingProcessing, com.tools20022.repository.choice.PendingReason20Choice.Code, com.tools20022.repository.choice.PendingReason20Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason12.Code, com.tools20022.repository.choice.PendingStatus22Choice.Reason, com.tools20022.repository.choice.ProcessingStatus26Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingReason4Choice.Code, com.tools20022.repository.choice.PendingReason4Choice.Proprietary, com.tools20022.repository.msg.PendingStatusReason2.ReasonCode,
					com.tools20022.repository.choice.EventProcessingStatus1Choice.Pending, com.tools20022.repository.choice.PendingReason5Choice.Code, com.tools20022.repository.choice.PendingReason5Choice.Proprietary,
					com.tools20022.repository.msg.PendingStatusReason3.ReasonCode, com.tools20022.repository.choice.EventProcessingStatus2Choice.Pending, com.tools20022.repository.msg.PendingCancellationStatusReason1.ReasonCode,
					com.tools20022.repository.choice.PendingCancellationStatus1Choice.Reason, com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice.PendingCancellation,
					com.tools20022.repository.msg.PendingCancellationStatusReason2.ReasonCode, com.tools20022.repository.choice.PendingCancellationStatus2Choice.Reason,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice.PendingCancellation, com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice.PendingCancellation,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice.PendingCancellation, com.tools20022.repository.msg.PendingCancellationStatusReason3.ReasonCode,
					com.tools20022.repository.choice.PendingCancellationStatus3Choice.Reason, com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.PendingCancellation,
					com.tools20022.repository.msg.PendingCancellationStatusReason4.ReasonCode, com.tools20022.repository.choice.PendingCancellationStatus4Choice.Reason,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason6Choice.Code,
					com.tools20022.repository.choice.PendingReason6Choice.Proprietary, com.tools20022.repository.msg.PendingStatusReason1.ReasonCode, com.tools20022.repository.choice.PendingStatus1Choice.Reason,
					com.tools20022.repository.choice.InstructionProcessingStatus1Choice.Pending, com.tools20022.repository.choice.PendingReason7Choice.Code, com.tools20022.repository.choice.PendingReason7Choice.Proprietary,
					com.tools20022.repository.msg.PendingStatusReason4.ReasonCode, com.tools20022.repository.choice.PendingStatus6Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus4Choice.Pending,
					com.tools20022.repository.choice.InstructionProcessingStatus7Choice.Pending, com.tools20022.repository.choice.InstructionProcessingStatus8Choice.Pending,
					com.tools20022.repository.choice.InstructionProcessingStatus12Choice.Pending, com.tools20022.repository.choice.InstructionProcessingStatus13Choice.Pending,
					com.tools20022.repository.choice.ProcessingStatus5Choice.Pending, com.tools20022.repository.choice.PendingStatus7Choice.Reason, com.tools20022.repository.choice.ProcessingStatus11Choice.Pending,
					com.tools20022.repository.choice.ProcessingStatus14Choice.Pending, com.tools20022.repository.choice.ProcessingStatus15Choice.Pending, com.tools20022.repository.choice.ProcessingStatus18Choice.Pending,
					com.tools20022.repository.choice.ProcessingStatus24Choice.Pending, com.tools20022.repository.choice.ProcessingStatus6Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus6Choice.PendingCancellation, com.tools20022.repository.choice.PendingProcessingReason2Choice.Code,
					com.tools20022.repository.choice.PendingProcessingReason2Choice.Proprietary, com.tools20022.repository.msg.PendingProcessingReason2.Code, com.tools20022.repository.choice.PendingProcessingStatus2Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus12Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus12Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason10Choice.Code,
					com.tools20022.repository.choice.PendingReason10Choice.Proprietary, com.tools20022.repository.msg.PendingReason4.Code, com.tools20022.repository.choice.ProcessingStatus23Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus23Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus29Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus29Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus7Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus7Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus3Choice.PendingProcessing,
					com.tools20022.repository.choice.InstructionProcessingStatus3Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus6Choice.PendingProcessing,
					com.tools20022.repository.choice.InstructionProcessingStatus6Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus10Choice.PendingProcessing,
					com.tools20022.repository.choice.InstructionProcessingStatus10Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus11Choice.PendingProcessing,
					com.tools20022.repository.choice.InstructionProcessingStatus11Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus17Choice.PendingProcessing,
					com.tools20022.repository.msg.TransferStatusAndReason2.CancellationPending, com.tools20022.repository.choice.ProcessingStatus3Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus3Choice.PendingProcessing, com.tools20022.repository.choice.PendingCancellationReasons2Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReasons2Choice.Proprietary, com.tools20022.repository.choice.PendingReason3Choice.Code, com.tools20022.repository.choice.PendingReason3Choice.Proprietary,
					com.tools20022.repository.choice.Reason1Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason1Choice.PendingReason, com.tools20022.repository.choice.Reason1Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason1Choice.PendingModificationReason, com.tools20022.repository.choice.PendingReason11Choice.Code, com.tools20022.repository.choice.PendingReason11Choice.Proprietary,
					com.tools20022.repository.choice.Reason6Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason6Choice.PendingReason, com.tools20022.repository.choice.Reason6Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason6Choice.PendingModificationReason, com.tools20022.repository.choice.ProcessingStatus10Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus10Choice.PendingProcessing, com.tools20022.repository.choice.PendingProcessingStatus4Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus21Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus21Choice.PendingProcessing, com.tools20022.repository.choice.PendingStatus15Choice.Reason,
					com.tools20022.repository.choice.PendingProcessingStatus10Choice.Reason, com.tools20022.repository.choice.ProcessingStatus27Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus27Choice.PendingProcessing, com.tools20022.repository.choice.PendingStatus26Choice.Reason, com.tools20022.repository.choice.PendingCancellationReasons3Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReasons3Choice.Proprietary, com.tools20022.repository.choice.PendingReason8Choice.Code, com.tools20022.repository.choice.PendingReason8Choice.Proprietary,
					com.tools20022.repository.choice.Reason2Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason2Choice.PendingReason, com.tools20022.repository.choice.Reason2Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason2Choice.PendingModificationReason, com.tools20022.repository.choice.PendingReason12Choice.Code, com.tools20022.repository.choice.PendingReason12Choice.Proprietary,
					com.tools20022.repository.choice.Reason10Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason10Choice.PendingReason, com.tools20022.repository.choice.Reason10Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason10Choice.PendingModificationReason, com.tools20022.repository.choice.Reason7Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason7Choice.PendingReason,
					com.tools20022.repository.choice.Reason7Choice.PendingProcessingReason, com.tools20022.repository.choice.Reason7Choice.PendingModificationReason,
					com.tools20022.repository.choice.Reason11Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason11Choice.PendingReason, com.tools20022.repository.choice.Reason11Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason11Choice.PendingModificationReason, com.tools20022.repository.choice.ProcessingStatus9Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus16Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason16Choice.Code, com.tools20022.repository.choice.PendingReason16Choice.Proprietary,
					com.tools20022.repository.msg.PendingReason8.Code, com.tools20022.repository.choice.PendingStatus12Choice.Reason, com.tools20022.repository.choice.PendingReason21Choice.Code,
					com.tools20022.repository.choice.PendingReason21Choice.Proprietary, com.tools20022.repository.msg.PendingReason13.Code, com.tools20022.repository.choice.PendingStatus23Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus32Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus36Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus31Choice.Pending, com.tools20022.repository.choice.Reason12Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason12Choice.PendingReason,
					com.tools20022.repository.choice.Reason12Choice.PendingProcessingReason, com.tools20022.repository.choice.Reason12Choice.PendingModificationReason,
					com.tools20022.repository.choice.InstructionProcessingStatus14Choice.PendingProcessing, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingReason22Choice.Code, com.tools20022.repository.choice.PendingReason22Choice.Proprietary, com.tools20022.repository.choice.PendingStatus32Choice.Reason,
					com.tools20022.repository.msg.PendingStatusReason5.ReasonCode, com.tools20022.repository.choice.InstructionProcessingStatus15Choice.Pending, com.tools20022.repository.choice.ProcessingStatus38Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus38Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus37Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus37Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.Pending, com.tools20022.repository.msg.PendingStatusReason6.ReasonCode,
					com.tools20022.repository.choice.PendingReason23Choice.Code, com.tools20022.repository.choice.PendingReason23Choice.Proprietary, com.tools20022.repository.choice.PendingStatus33Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus40Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus40Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus42Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus42Choice.PendingCancellation,
					com.tools20022.repository.choice.InstructionProcessingStatus17Choice.PendingProcessing, com.tools20022.repository.choice.InstructionProcessingStatus17Choice.PendingCancellation,
					com.tools20022.repository.choice.Reason13Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason13Choice.PendingReason, com.tools20022.repository.choice.Reason13Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason13Choice.PendingModificationReason, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.Pending,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice.PendingCancellation, com.tools20022.repository.choice.PendingStatus34Choice.Reason,
					com.tools20022.repository.msg.PendingStatusReason7.ReasonCode, com.tools20022.repository.choice.PendingReason24Choice.Code, com.tools20022.repository.choice.PendingReason24Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus44Choice.Pending, com.tools20022.repository.choice.ModificationProcessingStatus4Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus45Choice.PendingCancellation, com.tools20022.repository.choice.Reason14Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason14Choice.PendingReason,
					com.tools20022.repository.choice.Reason14Choice.PendingProcessingReason, com.tools20022.repository.choice.Reason14Choice.PendingModificationReason,
					com.tools20022.repository.choice.InstructionProcessingStatus21Choice.Pending, com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingStatus35Choice.Reason, com.tools20022.repository.msg.PendingStatusReason8.ReasonCode, com.tools20022.repository.choice.PendingReason25Choice.Code,
					com.tools20022.repository.choice.PendingReason25Choice.Proprietary, com.tools20022.repository.choice.ModificationProcessingStatus6Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus47Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus46Choice.Pending,
					com.tools20022.repository.choice.Reason15Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason15Choice.PendingReason, com.tools20022.repository.choice.Reason15Choice.PendingProcessingReason,
					com.tools20022.repository.choice.Reason15Choice.PendingModificationReason, com.tools20022.repository.choice.ModificationProcessingStatus5Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus50Choice.Pending, com.tools20022.repository.choice.ProcessingStatus48Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus48Choice.PendingCancellation, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus54Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus51Choice.PendingCancellation,
					com.tools20022.repository.choice.ProcessingStatus51Choice.PendingProcessing, com.tools20022.repository.msg.PendingReason17.Code, com.tools20022.repository.choice.PendingReason30Choice.Code,
					com.tools20022.repository.choice.PendingReason30Choice.Proprietary, com.tools20022.repository.msg.PendingReason16.Code, com.tools20022.repository.choice.PendingReason28Choice.Code,
					com.tools20022.repository.choice.PendingReason28Choice.Proprietary, com.tools20022.repository.choice.PendingProcessingReason12Choice.Code, com.tools20022.repository.choice.PendingProcessingReason12Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus52Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus52Choice.PendingCancellation, com.tools20022.repository.choice.PendingStatus37Choice.Reason,
					com.tools20022.repository.msg.PendingReason15.Code, com.tools20022.repository.choice.PendingStatus38Choice.Reason, com.tools20022.repository.msg.PendingProcessingReason10.Code,
					com.tools20022.repository.choice.PendingProcessingStatus13Choice.Reason, com.tools20022.repository.msg.PendingReason14.Code, com.tools20022.repository.choice.PendingReason26Choice.Code,
					com.tools20022.repository.choice.PendingReason26Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus49Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus49Choice.PendingCancellation, com.tools20022.repository.choice.PendingProcessingStatus11Choice.Reason, com.tools20022.repository.choice.PendingStatus40Choice.Reason,
					com.tools20022.repository.msg.PendingProcessingReason8.Code, com.tools20022.repository.choice.PendingReason29Choice.Code, com.tools20022.repository.choice.PendingReason29Choice.Proprietary,
					com.tools20022.repository.choice.InstructionProcessingStatus22Choice.PendingProcessing, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingProcessingReason10Choice.Code, com.tools20022.repository.choice.PendingProcessingReason10Choice.Proprietary, com.tools20022.repository.choice.PendingStatus39Choice.Reason,
					com.tools20022.repository.choice.PendingProcessingStatus12Choice.Reason, com.tools20022.repository.msg.PendingProcessingReason9.Code, com.tools20022.repository.choice.ProcessingStatus53Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingProcessingReason11Choice.Code, com.tools20022.repository.choice.PendingProcessingReason11Choice.Proprietary, com.tools20022.repository.choice.PendingReason27Choice.Code,
					com.tools20022.repository.choice.PendingReason27Choice.Proprietary, com.tools20022.repository.choice.PendingStatus36Choice.Reason, com.tools20022.repository.choice.Reason16Choice.PendingCancellationReason,
					com.tools20022.repository.choice.Reason16Choice.PendingReason, com.tools20022.repository.choice.Reason16Choice.PendingProcessingReason, com.tools20022.repository.choice.Reason16Choice.PendingModificationReason,
					com.tools20022.repository.msg.PendingReason18.Code, com.tools20022.repository.choice.PendingCancellationReasons4Choice.Code, com.tools20022.repository.choice.PendingCancellationReasons4Choice.Proprietary,
					com.tools20022.repository.choice.PendingReason31Choice.Code, com.tools20022.repository.choice.PendingReason31Choice.Proprietary, com.tools20022.repository.choice.EventProcessingStatus3Choice.Pending,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus24Choice.Pending,
					com.tools20022.repository.choice.PendingStatus42Choice.Reason, com.tools20022.repository.choice.PendingCancellationStatus5Choice.Reason, com.tools20022.repository.msg.PendingStatusReason10.ReasonCode,
					com.tools20022.repository.choice.PendingReason33Choice.Code, com.tools20022.repository.choice.PendingReason33Choice.Proprietary, com.tools20022.repository.choice.PendingReason32Choice.Code,
					com.tools20022.repository.choice.PendingReason32Choice.Proprietary, com.tools20022.repository.msg.PendingCancellationStatusReason5.ReasonCode, com.tools20022.repository.msg.PendingStatusReason9.ReasonCode,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus25Choice.Pending,
					com.tools20022.repository.choice.EventProcessingStatus4Choice.Pending, com.tools20022.repository.choice.PendingCancellationStatus6Choice.Reason, com.tools20022.repository.msg.PendingCancellationStatusReason6.ReasonCode,
					com.tools20022.repository.choice.PendingReason35Choice.Code, com.tools20022.repository.choice.PendingReason35Choice.Proprietary, com.tools20022.repository.msg.PendingStatusReason11.ReasonCode,
					com.tools20022.repository.msg.PendingStatusReason12.ReasonCode, com.tools20022.repository.choice.PendingReason34Choice.Code, com.tools20022.repository.choice.PendingReason34Choice.Proprietary,
					com.tools20022.repository.choice.PendingStatus44Choice.Reason, com.tools20022.repository.choice.ProcessingStatus57Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus57Choice.PendingProcessing,
					com.tools20022.repository.choice.ProcessingStatus65Choice.PendingCancellation, com.tools20022.repository.choice.ProcessingStatus58Choice.Pending,
					com.tools20022.repository.choice.ProcessingStatus63Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus63Choice.PendingCancellation, com.tools20022.repository.choice.PendingReason37Choice.Code,
					com.tools20022.repository.choice.PendingReason37Choice.Proprietary, com.tools20022.repository.choice.Reason17Choice.PendingCancellationReason, com.tools20022.repository.choice.Reason17Choice.PendingReason,
					com.tools20022.repository.choice.Reason17Choice.PendingProcessingReason, com.tools20022.repository.choice.Reason17Choice.PendingModificationReason, com.tools20022.repository.choice.PendingReason47Choice.Code,
					com.tools20022.repository.choice.PendingReason47Choice.Proprietary, com.tools20022.repository.choice.PendingCancellationReasons5Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReasons5Choice.Proprietary, com.tools20022.repository.msg.PendingProcessingReason11.Code, com.tools20022.repository.choice.PendingProcessingReason13Choice.Code,
					com.tools20022.repository.choice.PendingProcessingReason13Choice.Proprietary, com.tools20022.repository.msg.PendingReason25.Code, com.tools20022.repository.choice.PendingReason42Choice.Code,
					com.tools20022.repository.choice.PendingReason42Choice.Proprietary, com.tools20022.repository.choice.PendingStatus46Choice.Reason, com.tools20022.repository.msg.PendingReason20.Code,
					com.tools20022.repository.choice.ProcessingStatus62Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus62Choice.PendingCancellation, com.tools20022.repository.msg.PendingProcessingReason12.Code,
					com.tools20022.repository.choice.PendingProcessingReason14Choice.Code, com.tools20022.repository.choice.PendingProcessingReason14Choice.Proprietary, com.tools20022.repository.msg.PendingReason19.Code,
					com.tools20022.repository.choice.PendingReason36Choice.Code, com.tools20022.repository.choice.PendingReason36Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus27Choice.PendingProcessing,
					com.tools20022.repository.choice.InstructionProcessingStatus27Choice.PendingCancellation, com.tools20022.repository.choice.PendingProcessingStatus15Choice.Reason,
					com.tools20022.repository.choice.PendingProcessingStatus16Choice.Reason, com.tools20022.repository.msg.PendingProcessingReason13.Code, com.tools20022.repository.choice.PendingStatus45Choice.Reason,
					com.tools20022.repository.choice.ModificationProcessingStatus8Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus61Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingStatus51Choice.Reason, com.tools20022.repository.msg.PendingReason24.Code, com.tools20022.repository.choice.PendingReason41Choice.Code,
					com.tools20022.repository.choice.PendingReason41Choice.Proprietary, com.tools20022.repository.choice.PendingStatus50Choice.Reason, com.tools20022.repository.choice.PendingProcessingReason15Choice.Code,
					com.tools20022.repository.choice.PendingProcessingReason15Choice.Proprietary, com.tools20022.repository.choice.PendingReason38Choice.Code, com.tools20022.repository.choice.PendingReason38Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus60Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus60Choice.PendingCancellation,
					com.tools20022.repository.choice.PendingProcessingStatus14Choice.Reason, com.tools20022.repository.choice.PendingStatus47Choice.Reason, com.tools20022.repository.msg.PendingReason21.Code,
					com.tools20022.repository.msg.PendingStatusReason14.Code, com.tools20022.repository.msg.PendingOpeningStatusReason1.Code, com.tools20022.repository.msg.ClosurePendingStatusReason1.Code,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus29Choice.Pending,
					com.tools20022.repository.choice.PendingCancellationStatus7Choice.Reason, com.tools20022.repository.choice.PendingReason48Choice.Code, com.tools20022.repository.choice.PendingReason48Choice.Proprietary,
					com.tools20022.repository.choice.PendingStatus52Choice.Reason, com.tools20022.repository.msg.PendingCancellationStatusReason7.ReasonCode, com.tools20022.repository.msg.PendingStatusReason13.ReasonCode,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.PendingCancellation, com.tools20022.repository.choice.InstructionProcessingStatus30Choice.Pending,
					com.tools20022.repository.choice.PendingCancellationStatus8Choice.Reason, com.tools20022.repository.msg.PendingCancellationStatusReason8.ReasonCode, com.tools20022.repository.choice.PendingStatus53Choice.Reason,
					com.tools20022.repository.choice.PendingReason49Choice.Code, com.tools20022.repository.choice.PendingReason49Choice.Proprietary, com.tools20022.repository.msg.PendingStatusReason15.ReasonCode);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction processing is pending.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction/request has a repair or
	 * rejection status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.RejectionReason4Choice#Code
	 * RejectionReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason4Choice#Proprietary
	 * RejectionReason4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason5#Code
	 * RejectionReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus1Choice#Reason
	 * RejectionStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#Rejected
	 * ProcessingStatus1Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10Choice#Code
	 * RejectionReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10Choice#Proprietary
	 * RejectionReason10Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason10#Code
	 * RejectionReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus5Choice#Reason
	 * RejectionStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#Rejected
	 * ProcessingStatus19Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11Choice#Code
	 * RejectionReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11Choice#Proprietary
	 * RejectionReason11Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason11#Code
	 * RejectionReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus8Choice#Reason
	 * RejectionStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#Rejected
	 * ModificationProcessingStatus2Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason1Choice#Code
	 * RejectionAndRepairReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason1Choice#Proprietary
	 * RejectionAndRepairReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#Rejected
	 * ProcessingStatus2Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason9Choice#Code
	 * RejectionAndRepairReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason9Choice#Proprietary
	 * RejectionAndRepairReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#Rejected
	 * ProcessingStatus13Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason3Choice#Code
	 * RejectionAndRepairReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason3Choice#Proprietary
	 * RejectionAndRepairReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason10Choice#Code
	 * RejectionAndRepairReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason10Choice#Proprietary
	 * RejectionAndRepairReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason18Choice#Code
	 * RejectionAndRepairReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason18Choice#Proprietary
	 * RejectionAndRepairReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice#Code
	 * RejectionAndRepairReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice#Proprietary
	 * RejectionAndRepairReason13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#Rejected
	 * ProcessingStatus20Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13Choice#Code
	 * RejectionReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13Choice#Proprietary
	 * RejectionReason13Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason15#Code
	 * RejectionReason15.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus11Choice#Reason
	 * RejectionStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#Rejected
	 * ProcessingStatus25Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12Choice#Code
	 * RejectionReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12Choice#Proprietary
	 * RejectionReason12Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason14#Code
	 * RejectionReason14.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus10Choice#Reason
	 * RejectionStatus10Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#Rejected
	 * ModificationProcessingStatus3Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason19Choice#Code
	 * RejectionAndRepairReason19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason19Choice#Proprietary
	 * RejectionAndRepairReason19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason16Choice#Code
	 * RejectionAndRepairReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason16Choice#Proprietary
	 * RejectionAndRepairReason16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#Rejected
	 * ProcessingStatus26Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason1Choice#Code
	 * RejectedReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason1Choice#Proprietary
	 * RejectedReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason8#ReasonCode
	 * RejectedStatusReason8.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus1Choice#Reason
	 * RejectedStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason1Choice#Code
	 * PendingCancellationReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason1Choice#Proprietary
	 * PendingCancellationReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#Rejected
	 * InstructionCancellationRequestStatus1Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason2Choice#Code
	 * RejectedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason2Choice#Proprietary
	 * RejectedReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason9#ReasonCode
	 * RejectedStatusReason9.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus2Choice#Reason
	 * RejectedStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason2Choice#Code
	 * PendingCancellationReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason2Choice#Proprietary
	 * PendingCancellationReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#Rejected
	 * InstructionCancellationRequestStatus2Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#Rejected
	 * InstructionCancellationRequestStatus3Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#Rejected
	 * InstructionCancellationRequestStatus4Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#Rejected
	 * InstructionCancellationRequestStatus5Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#Rejected
	 * InstructionCancellationRequestStatus6Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#Rejected
	 * InstructionProcessingStatus1Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#Rejected
	 * InstructionProcessingStatus4Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#Rejected
	 * InstructionProcessingStatus7Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#Rejected
	 * InstructionProcessingStatus8Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#Rejected
	 * InstructionProcessingStatus12Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#Rejected
	 * InstructionProcessingStatus13Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#Rejected
	 * ProcessingStatus5Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason7Choice#Code
	 * RejectionAndRepairReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason7Choice#Proprietary
	 * RejectionAndRepairReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#Rejected
	 * ProcessingStatus11Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#Rejected
	 * ProcessingStatus14Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason11Choice#Code
	 * RejectionAndRepairReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason11Choice#Proprietary
	 * RejectionAndRepairReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#Rejected
	 * ProcessingStatus15Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#Rejected
	 * ProcessingStatus18Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#Rejected
	 * ProcessingStatus24Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6Choice#Code
	 * RejectionReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6Choice#Proprietary
	 * RejectionReason6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason7#Code
	 * RejectionReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus2Choice#Reason
	 * RejectionStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#Rejected
	 * ProcessingStatus7Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9Choice#Code
	 * RejectionReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9Choice#Proprietary
	 * RejectionReason9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason9#Code
	 * RejectionReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason1Choice#Reason
	 * InstructionProcessingReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#Rejected
	 * ProcessingStatus17Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3#Rejected
	 * OrderStatusAndReason3.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#LegRejectionReason
	 * SwitchLegReferences1.LegRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#Reason
	 * InstructionRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionRejectionStatus1#ExtendedReason
	 * InstructionRejectionStatus1.ExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus2Choice#RejectionStatus
	 * InstructionStatus2Choice.RejectionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice#Code
	 * RejectionReason11FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice#Proprietary
	 * RejectionReason11FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice#Code
	 * RejectionReason6FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice#Proprietary
	 * RejectionReason6FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice#Code
	 * RejectionReason18FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice#Proprietary
	 * RejectionReason18FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#Reason
	 * CorporateActionInstructionRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice#Code
	 * RejectionReason9FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice#Proprietary
	 * RejectionReason9FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice#Code
	 * RejectionReason8FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice#Proprietary
	 * RejectionReason8FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice#Code
	 * RejectionReason19FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice#Proprietary
	 * RejectionReason19FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice#Code
	 * RejectionReason13FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice#Proprietary
	 * RejectionReason13FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#Reason
	 * CorporateActionMovementRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice#Code
	 * RejectionReason14FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice#Proprietary
	 * RejectionReason14FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#Reason
	 * CorporateActionMovementRejectionStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice#Code
	 * RejectionReason15FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice#Proprietary
	 * RejectionReason15FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#Reason
	 * CorporateActionStandingInstructionRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice#Code
	 * RejectionReason10FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice#Proprietary
	 * RejectionReason10FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice#Code
	 * RejectionReason12FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice#Proprietary
	 * RejectionReason12FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#Reason
	 * CorporateActionDeactivationInstructionRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice#Code
	 * RejectionReason7FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice#Proprietary
	 * RejectionReason7FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#Reason
	 * CorporateActionDeactivationCancellationRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason4Choice#Code
	 * RejectionAndRepairReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason4Choice#Proprietary
	 * RejectionAndRepairReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason2Choice#Code
	 * RejectionReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason2Choice#Proprietary
	 * RejectionReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason6#Code
	 * RejectionReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus3Choice#Reason
	 * RejectionStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#Rejected
	 * ProcessingStatus3Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason5Choice#Code
	 * RejectionReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason5Choice#Proprietary
	 * RejectionReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#RejectionReason
	 * Reason1Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#RejectionReason
	 * Reason6Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason2Choice#Code
	 * RejectionAndRepairReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason2Choice#Proprietary
	 * RejectionAndRepairReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice#Rejected
	 * ProcessingStatus4Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionStatus2#RejectedReason
	 * RejectionStatus2.RejectedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#RejectionReason
	 * CollateralProposalResponseType1.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#RejectionReason
	 * CollateralSubstitutionResponse2.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8Choice#Code
	 * RejectionReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason8Choice#Proprietary
	 * RejectionReason8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason8#Code
	 * RejectionReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus4Choice#Reason
	 * RejectionStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#Rejected
	 * ProcessingStatus10Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus6Choice#Reason
	 * RejectionStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#Rejected
	 * ProcessingStatus21Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus12Choice#Reason
	 * RejectionStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#Rejected
	 * ProcessingStatus27Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus7Choice#Reason
	 * RejectionStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus9Choice#Reason
	 * RejectionStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7Choice#Code
	 * RejectionReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason7Choice#Proprietary
	 * RejectionReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#RejectionReason
	 * Reason2Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#RejectionReason
	 * Reason10Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#RejectionReason
	 * Reason7Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#RejectionReason
	 * Reason11Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason5Choice#Code
	 * RejectionAndRepairReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason5Choice#Proprietary
	 * RejectionAndRepairReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus8Choice#Rejected
	 * ProcessingStatus8Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus22Choice#Rejected
	 * ProcessingStatus22Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus28Choice#Rejected
	 * ProcessingStatus28Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason6Choice#Code
	 * RejectionAndRepairReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason6Choice#Proprietary
	 * RejectionAndRepairReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#Rejected
	 * ProcessingStatus9Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason12Choice#Code
	 * RejectionAndRepairReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason12Choice#Proprietary
	 * RejectionAndRepairReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#Rejected
	 * ProcessingStatus16Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason8Choice#Code
	 * RejectionAndRepairReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason8Choice#Proprietary
	 * RejectionAndRepairReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason14Choice#Code
	 * RejectionAndRepairReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason14Choice#Proprietary
	 * RejectionAndRepairReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason17Choice#Code
	 * RejectionAndRepairReason17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason17Choice#Proprietary
	 * RejectionAndRepairReason17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason20Choice#Code
	 * RejectionAndRepairReason20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason20Choice#Proprietary
	 * RejectionAndRepairReason20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason22Choice#Code
	 * RejectionAndRepairReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason22Choice#Proprietary
	 * RejectionAndRepairReason22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#Rejected
	 * ProcessingStatus32Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#Rejected
	 * ProcessingStatus35Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#Rejected
	 * ProcessingStatus36Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason21Choice#Code
	 * RejectionAndRepairReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason21Choice#Proprietary
	 * RejectionAndRepairReason21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#Rejected
	 * ProcessingStatus31Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason4#ReasonCode
	 * RejectionReason4.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason3Choice#Code
	 * RejectionReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason3Choice#Proprietary
	 * RejectionReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#RejectionReason
	 * OrderStatusAndReason5.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#RejectionReason
	 * OrderStatus2.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#RejectionReason
	 * Reason12Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason10#ReasonCode
	 * RejectedStatusReason10.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#Rejected
	 * InstructionProcessingStatus15Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason5Choice#Code
	 * RejectedReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason5Choice#Proprietary
	 * RejectedReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#Rejected
	 * ProcessingStatus38Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#Rejected
	 * ProcessingStatus37Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason18#Code
	 * RejectionReason18.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15Choice#Code
	 * RejectionReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason15Choice#Proprietary
	 * RejectionReason15Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason17#Code
	 * RejectionReason17.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14Choice#Code
	 * RejectionReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason14Choice#Proprietary
	 * RejectionReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus14Choice#Reason
	 * RejectionStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason16Choice#Code
	 * RejectionReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason16Choice#Proprietary
	 * RejectionReason16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus13Choice#Reason
	 * RejectionStatus13Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus10Choice#Reason
	 * RejectedStatus10Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason19#Code
	 * RejectionReason19.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason17Choice#Code
	 * RejectionReason17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason17Choice#Proprietary
	 * RejectionReason17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice#Rejected
	 * ProcessingStatus39Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#Rejected
	 * InstructionProcessingStatus16Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason6Choice#Code
	 * RejectedReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason6Choice#Proprietary
	 * RejectedReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason11#ReasonCode
	 * RejectedStatusReason11.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#Rejected
	 * ProcessingStatus40Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#Rejected
	 * ProcessingStatus42Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus15Choice#Reason
	 * RejectionStatus15Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason20#Code
	 * RejectionReason20.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus12Choice#Reason
	 * RejectedStatus12Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason21#Code
	 * RejectionReason21.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus41Choice#Rejected
	 * ProcessingStatus41Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18Choice#Code
	 * RejectionReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason18Choice#Proprietary
	 * RejectionReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19Choice#Code
	 * RejectionReason19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason19Choice#Proprietary
	 * RejectionReason19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#RejectionReason
	 * Reason13Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21Choice#Code
	 * RejectionReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason21Choice#Proprietary
	 * RejectionReason21Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason22#Code
	 * RejectionReason22.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20Choice#Code
	 * RejectionReason20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason20Choice#Proprietary
	 * RejectionReason20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus16Choice#Reason
	 * RejectionStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#Code
	 * ReportItemRejectionReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#Proprietary
	 * ReportItemRejectionReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#Rejected
	 * InstructionProcessingStatus20Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#Rejected
	 * InstructionCancellationRequestStatus7Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason13#ReasonCode
	 * RejectedStatusReason13.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus14Choice#Reason
	 * RejectedStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason14#ReasonCode
	 * RejectedStatusReason14.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason10Choice#Code
	 * RejectedReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason10Choice#Proprietary
	 * RejectedReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason9Choice#Code
	 * RejectedReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason9Choice#Proprietary
	 * RejectedReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#Rejected
	 * ProcessingStatus44Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#Rejected
	 * ModificationProcessingStatus4Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#Rejected
	 * ProcessingStatus45Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#RejectionReason
	 * Reason14Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#RejectionReason
	 * OtherCollateralResponse1.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#RejectionReason
	 * CashCollateralResponse1.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#RejectionReason
	 * SecuritiesCollateralResponse1.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#Rejected
	 * InstructionProcessingStatus21Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#Rejected
	 * InstructionCancellationRequestStatus8Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus15Choice#Reason
	 * RejectedStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason15#ReasonCode
	 * RejectedStatusReason15.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason11Choice#Code
	 * RejectedReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason11Choice#Proprietary
	 * RejectedReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason16#ReasonCode
	 * RejectedStatusReason16.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason12Choice#Code
	 * RejectedReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason12Choice#Proprietary
	 * RejectedReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#Rejected
	 * ModificationProcessingStatus6Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#Rejected
	 * ProcessingStatus47Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#Rejected
	 * ProcessingStatus46Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#RejectionReason
	 * Reason15Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#Rejected
	 * ModificationProcessingStatus5Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#Rejected
	 * ProcessingStatus55Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#Rejected
	 * ProcessingStatus50Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#Rejected
	 * ProcessingStatus48Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#Rejected
	 * ModificationProcessingStatus7Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#Rejected
	 * ProcessingStatus54Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#Rejected
	 * ProcessingStatus51Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason26#Code
	 * RejectionReason26.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason24Choice#Code
	 * RejectionReason24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason24Choice#Proprietary
	 * RejectionReason24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus17Choice#Reason
	 * RejectionStatus17Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason25#Code
	 * RejectionReason25.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice#Code
	 * RejectionReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice#Proprietary
	 * RejectionReason22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason23Choice#Code
	 * RejectionReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason23Choice#Proprietary
	 * RejectionReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus56Choice#Rejected
	 * ProcessingStatus56Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus17Choice#Reason
	 * RejectedStatus17Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason26Choice#Code
	 * RejectionReason26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason26Choice#Proprietary
	 * RejectionReason26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice#Reason
	 * RejectionStatus18Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason25Choice#Code
	 * RejectionReason25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason25Choice#Proprietary
	 * RejectionReason25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#Rejected
	 * ProcessingStatus49Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice#Reason
	 * RejectionStatus21Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason30#Code
	 * RejectionReason30.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason27#Code
	 * RejectionReason27.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice#Reason
	 * RejectionStatus20Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice#Code
	 * RejectionAndRepairReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason23Choice#Proprietary
	 * RejectionAndRepairReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#Code
	 * RejectionAndRepairReason25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#Proprietary
	 * RejectionAndRepairReason25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#Rejected
	 * ProcessingStatus53Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice#Code
	 * RejectionAndRepairReason24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason24Choice#Proprietary
	 * RejectionAndRepairReason24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason27Choice#Code
	 * RejectionReason27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason27Choice#Proprietary
	 * RejectionReason27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice#Code
	 * RejectionAndRepairReason26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason26Choice#Proprietary
	 * RejectionAndRepairReason26Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason28#Code
	 * RejectionReason28.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#RejectionReason
	 * Reason16Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus19Choice#Reason
	 * RejectionStatus19Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#Rejected
	 * InstructionCancellationRequestStatus9Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#Rejected
	 * InstructionProcessingStatus24Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason3Choice#Code
	 * PendingCancellationReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason3Choice#Proprietary
	 * PendingCancellationReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason17#ReasonCode
	 * RejectedStatusReason17.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason14Choice#Code
	 * RejectedReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason14Choice#Proprietary
	 * RejectedReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus18Choice#Reason
	 * RejectedStatus18Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason18#ReasonCode
	 * RejectedStatusReason18.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason13Choice#Code
	 * RejectedReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason13Choice#Proprietary
	 * RejectedReason13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#Rejected
	 * InstructionCancellationRequestStatus10Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#Rejected
	 * InstructionProcessingStatus25Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus20Choice#Reason
	 * RejectedStatus20Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason4Choice#Code
	 * PendingCancellationReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason4Choice#Proprietary
	 * PendingCancellationReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason19#ReasonCode
	 * RejectedStatusReason19.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason18Choice#Code
	 * RejectedReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason18Choice#Proprietary
	 * RejectedReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason20#ReasonCode
	 * RejectedStatusReason20.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason19Choice#Code
	 * RejectedReason19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason19Choice#Proprietary
	 * RejectedReason19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#Rejected
	 * ProcessingStatus57Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#Rejected
	 * ProcessingStatus65Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#Rejected
	 * ProcessingStatus58Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus64Choice#Rejected
	 * ProcessingStatus64Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#Rejected
	 * ProcessingStatus63Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason37#Code
	 * RejectionReason37.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason31Choice#Code
	 * RejectionReason31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason31Choice#Proprietary
	 * RejectionReason31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus22Choice#Reason
	 * RejectionStatus22Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason34#Code
	 * RejectionReason34.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus27Choice#Reason
	 * RejectionStatus27Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#RejectionReason
	 * Reason17Choice.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason34Choice#Code
	 * RejectionReason34Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason34Choice#Proprietary
	 * RejectionReason34Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason29Choice#Code
	 * RejectionAndRepairReason29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason29Choice#Proprietary
	 * RejectionAndRepairReason29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus23Choice#Reason
	 * RejectionStatus23Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason36#Code
	 * RejectionReason36.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus22Choice#Reason
	 * RejectedStatus22Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason35#Code
	 * RejectionReason35.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus59Choice#Rejected
	 * ProcessingStatus59Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason30Choice#Code
	 * RejectionReason30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason30Choice#Proprietary
	 * RejectionReason30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason31Choice#Code
	 * RejectionAndRepairReason31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason31Choice#Proprietary
	 * RejectionAndRepairReason31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus26Choice#Reason
	 * RejectionStatus26Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason28Choice#Code
	 * RejectionReason28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason28Choice#Proprietary
	 * RejectionReason28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#Rejected
	 * ModificationProcessingStatus8Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus24Choice#Reason
	 * RejectionStatus24Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#Rejected
	 * ProcessingStatus61Choice.Rejected}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason39#Code
	 * RejectionReason39.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason33Choice#Code
	 * RejectionReason33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason33Choice#Proprietary
	 * RejectionReason33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason29Choice#Code
	 * RejectionReason29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionReason29Choice#Proprietary
	 * RejectionReason29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#Rejected
	 * ProcessingStatus60Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason28Choice#Code
	 * RejectionAndRepairReason28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason28Choice#Proprietary
	 * RejectionAndRepairReason28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason27Choice#Code
	 * RejectionAndRepairReason27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason27Choice#Proprietary
	 * RejectionAndRepairReason27Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus9#Reason
	 * RejectedStatus9.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus10#Reason
	 * RejectedStatus10.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#LegRejectionReason
	 * SwitchLegReferences2.LegRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#Rejected
	 * InstructionCancellationRequestStatus11Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#Rejected
	 * InstructionProcessingStatus29Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice#Code
	 * PendingCancellationReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice#Proprietary
	 * PendingCancellationReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason21#ReasonCode
	 * RejectedStatusReason21.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason22Choice#Code
	 * RejectedReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason22Choice#Proprietary
	 * RejectedReason22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse2#RejectionReason
	 * OtherCollateralResponse2.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#RejectionReason
	 * CashCollateralResponse2.RejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#Rejected
	 * InstructionCancellationRequestStatus12Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#Rejected
	 * InstructionProcessingStatus30Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason22#ReasonCode
	 * RejectedStatusReason22.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason23Choice#Code
	 * RejectedReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason23Choice#Proprietary
	 * RejectedReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason6Choice#Code
	 * PendingCancellationReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason6Choice#Proprietary
	 * PendingCancellationReason6Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute RejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RejectionReason4Choice.Code, com.tools20022.repository.choice.RejectionReason4Choice.Proprietary, com.tools20022.repository.msg.RejectionReason5.Code,
					com.tools20022.repository.choice.RejectionStatus1Choice.Reason, com.tools20022.repository.choice.ProcessingStatus1Choice.Rejected, com.tools20022.repository.choice.RejectionReason10Choice.Code,
					com.tools20022.repository.choice.RejectionReason10Choice.Proprietary, com.tools20022.repository.msg.RejectionReason10.Code, com.tools20022.repository.choice.RejectionStatus5Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus19Choice.Rejected, com.tools20022.repository.choice.RejectionReason11Choice.Code, com.tools20022.repository.choice.RejectionReason11Choice.Proprietary,
					com.tools20022.repository.msg.RejectionReason11.Code, com.tools20022.repository.choice.RejectionStatus8Choice.Reason, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.Rejected,
					com.tools20022.repository.choice.RejectionAndRepairReason1Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason1Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus2Choice.Rejected,
					com.tools20022.repository.choice.RejectionAndRepairReason9Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason9Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus13Choice.Rejected,
					com.tools20022.repository.choice.RejectionAndRepairReason3Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason3Choice.Proprietary,
					com.tools20022.repository.choice.RejectionAndRepairReason10Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason10Choice.Proprietary,
					com.tools20022.repository.choice.RejectionAndRepairReason18Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason18Choice.Proprietary,
					com.tools20022.repository.choice.RejectionAndRepairReason13Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason13Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus20Choice.Rejected,
					com.tools20022.repository.choice.RejectionReason13Choice.Code, com.tools20022.repository.choice.RejectionReason13Choice.Proprietary, com.tools20022.repository.msg.RejectionReason15.Code,
					com.tools20022.repository.choice.RejectionStatus11Choice.Reason, com.tools20022.repository.choice.ProcessingStatus25Choice.Rejected, com.tools20022.repository.choice.RejectionReason12Choice.Code,
					com.tools20022.repository.choice.RejectionReason12Choice.Proprietary, com.tools20022.repository.msg.RejectionReason14.Code, com.tools20022.repository.choice.RejectionStatus10Choice.Reason,
					com.tools20022.repository.choice.ModificationProcessingStatus3Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason19Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason19Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason16Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason16Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus26Choice.Rejected, com.tools20022.repository.choice.RejectedReason1Choice.Code,
					com.tools20022.repository.choice.RejectedReason1Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason8.ReasonCode, com.tools20022.repository.choice.RejectedStatus1Choice.Reason,
					com.tools20022.repository.choice.PendingCancellationReason1Choice.Code, com.tools20022.repository.choice.PendingCancellationReason1Choice.Proprietary,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice.Rejected, com.tools20022.repository.choice.RejectedReason2Choice.Code, com.tools20022.repository.choice.RejectedReason2Choice.Proprietary,
					com.tools20022.repository.msg.RejectedStatusReason9.ReasonCode, com.tools20022.repository.choice.RejectedStatus2Choice.Reason, com.tools20022.repository.choice.PendingCancellationReason2Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReason2Choice.Proprietary, com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice.Rejected,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice.Rejected, com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice.Rejected,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.Rejected, com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice.Rejected,
					com.tools20022.repository.choice.InstructionProcessingStatus1Choice.Rejected, com.tools20022.repository.choice.InstructionProcessingStatus4Choice.Rejected,
					com.tools20022.repository.choice.InstructionProcessingStatus7Choice.Rejected, com.tools20022.repository.choice.InstructionProcessingStatus8Choice.Rejected,
					com.tools20022.repository.choice.InstructionProcessingStatus12Choice.Rejected, com.tools20022.repository.choice.InstructionProcessingStatus13Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus5Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason7Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason7Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus11Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus14Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason11Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason11Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus15Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus18Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus24Choice.Rejected, com.tools20022.repository.choice.RejectionReason6Choice.Code, com.tools20022.repository.choice.RejectionReason6Choice.Proprietary,
					com.tools20022.repository.msg.RejectionReason7.Code, com.tools20022.repository.choice.RejectionStatus2Choice.Reason, com.tools20022.repository.choice.ProcessingStatus7Choice.Rejected,
					com.tools20022.repository.choice.RejectionReason9Choice.Code, com.tools20022.repository.choice.RejectionReason9Choice.Proprietary, com.tools20022.repository.msg.RejectionReason9.Code,
					com.tools20022.repository.choice.InstructionProcessingReason1Choice.Reason, com.tools20022.repository.choice.ProcessingStatus17Choice.Rejected, com.tools20022.repository.msg.OrderStatusAndReason3.Rejected,
					com.tools20022.repository.msg.SwitchLegReferences1.LegRejectionReason, com.tools20022.repository.msg.InstructionRejectionStatus1.Reason, com.tools20022.repository.msg.InstructionRejectionStatus1.ExtendedReason,
					com.tools20022.repository.choice.InstructionStatus2Choice.RejectionStatus, com.tools20022.repository.choice.RejectionReason11FormatChoice.Code, com.tools20022.repository.choice.RejectionReason11FormatChoice.Proprietary,
					com.tools20022.repository.choice.RejectionReason6FormatChoice.Code, com.tools20022.repository.choice.RejectionReason6FormatChoice.Proprietary, com.tools20022.repository.choice.RejectionReason18FormatChoice.Code,
					com.tools20022.repository.choice.RejectionReason18FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1.Reason,
					com.tools20022.repository.choice.RejectionReason9FormatChoice.Code, com.tools20022.repository.choice.RejectionReason9FormatChoice.Proprietary, com.tools20022.repository.choice.RejectionReason8FormatChoice.Code,
					com.tools20022.repository.choice.RejectionReason8FormatChoice.Proprietary, com.tools20022.repository.choice.RejectionReason19FormatChoice.Code, com.tools20022.repository.choice.RejectionReason19FormatChoice.Proprietary,
					com.tools20022.repository.choice.RejectionReason13FormatChoice.Code, com.tools20022.repository.choice.RejectionReason13FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1.Reason, com.tools20022.repository.choice.RejectionReason14FormatChoice.Code,
					com.tools20022.repository.choice.RejectionReason14FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2.Reason,
					com.tools20022.repository.choice.RejectionReason15FormatChoice.Code, com.tools20022.repository.choice.RejectionReason15FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1.Reason, com.tools20022.repository.choice.RejectionReason10FormatChoice.Code,
					com.tools20022.repository.choice.RejectionReason10FormatChoice.Proprietary, com.tools20022.repository.choice.RejectionReason12FormatChoice.Code,
					com.tools20022.repository.choice.RejectionReason12FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1.Reason,
					com.tools20022.repository.choice.RejectionReason7FormatChoice.Code, com.tools20022.repository.choice.RejectionReason7FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1.Reason, com.tools20022.repository.choice.RejectionAndRepairReason4Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason4Choice.Proprietary, com.tools20022.repository.choice.RejectionReason2Choice.Code, com.tools20022.repository.choice.RejectionReason2Choice.Proprietary,
					com.tools20022.repository.msg.RejectionReason6.Code, com.tools20022.repository.choice.RejectionStatus3Choice.Reason, com.tools20022.repository.choice.ProcessingStatus3Choice.Rejected,
					com.tools20022.repository.choice.RejectionReason5Choice.Code, com.tools20022.repository.choice.RejectionReason5Choice.Proprietary, com.tools20022.repository.choice.Reason1Choice.RejectionReason,
					com.tools20022.repository.choice.Reason6Choice.RejectionReason, com.tools20022.repository.choice.RejectionAndRepairReason2Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason2Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus4Choice.Rejected, com.tools20022.repository.msg.RejectionStatus2.RejectedReason, com.tools20022.repository.msg.CollateralProposalResponseType1.RejectionReason,
					com.tools20022.repository.msg.CollateralSubstitutionResponse2.RejectionReason, com.tools20022.repository.choice.RejectionReason8Choice.Code, com.tools20022.repository.choice.RejectionReason8Choice.Proprietary,
					com.tools20022.repository.msg.RejectionReason8.Code, com.tools20022.repository.choice.RejectionStatus4Choice.Reason, com.tools20022.repository.choice.ProcessingStatus10Choice.Rejected,
					com.tools20022.repository.choice.RejectionStatus6Choice.Reason, com.tools20022.repository.choice.ProcessingStatus21Choice.Rejected, com.tools20022.repository.choice.RejectionStatus12Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus27Choice.Rejected, com.tools20022.repository.choice.RejectionStatus7Choice.Reason, com.tools20022.repository.choice.RejectionStatus9Choice.Reason,
					com.tools20022.repository.choice.RejectionReason7Choice.Code, com.tools20022.repository.choice.RejectionReason7Choice.Proprietary, com.tools20022.repository.choice.Reason2Choice.RejectionReason,
					com.tools20022.repository.choice.Reason10Choice.RejectionReason, com.tools20022.repository.choice.Reason7Choice.RejectionReason, com.tools20022.repository.choice.Reason11Choice.RejectionReason,
					com.tools20022.repository.choice.RejectionAndRepairReason5Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason5Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus8Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus22Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus28Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason6Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason6Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus9Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason12Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason12Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus16Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason8Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason8Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason14Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason14Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason17Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason17Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason20Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason20Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason22Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason22Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus32Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus35Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus36Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason21Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason21Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus31Choice.Rejected, com.tools20022.repository.msg.RejectionReason4.ReasonCode, com.tools20022.repository.choice.RejectionReason3Choice.Code,
					com.tools20022.repository.choice.RejectionReason3Choice.Proprietary, com.tools20022.repository.msg.OrderStatusAndReason5.RejectionReason, com.tools20022.repository.msg.OrderStatus2.RejectionReason,
					com.tools20022.repository.choice.Reason12Choice.RejectionReason, com.tools20022.repository.msg.RejectedStatusReason10.ReasonCode, com.tools20022.repository.choice.InstructionProcessingStatus15Choice.Rejected,
					com.tools20022.repository.choice.RejectedReason5Choice.Code, com.tools20022.repository.choice.RejectedReason5Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus38Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus37Choice.Rejected, com.tools20022.repository.msg.RejectionReason18.Code, com.tools20022.repository.choice.RejectionReason15Choice.Code,
					com.tools20022.repository.choice.RejectionReason15Choice.Proprietary, com.tools20022.repository.msg.RejectionReason17.Code, com.tools20022.repository.choice.RejectionReason14Choice.Code,
					com.tools20022.repository.choice.RejectionReason14Choice.Proprietary, com.tools20022.repository.choice.RejectionStatus14Choice.Reason, com.tools20022.repository.choice.RejectionReason16Choice.Code,
					com.tools20022.repository.choice.RejectionReason16Choice.Proprietary, com.tools20022.repository.choice.RejectionStatus13Choice.Reason, com.tools20022.repository.choice.RejectedStatus10Choice.Reason,
					com.tools20022.repository.msg.RejectionReason19.Code, com.tools20022.repository.choice.RejectionReason17Choice.Code, com.tools20022.repository.choice.RejectionReason17Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus39Choice.Rejected, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.Rejected, com.tools20022.repository.choice.RejectedReason6Choice.Code,
					com.tools20022.repository.choice.RejectedReason6Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason11.ReasonCode, com.tools20022.repository.choice.ProcessingStatus40Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus42Choice.Rejected, com.tools20022.repository.choice.RejectionStatus15Choice.Reason, com.tools20022.repository.msg.RejectionReason20.Code,
					com.tools20022.repository.choice.RejectedStatus12Choice.Reason, com.tools20022.repository.msg.RejectionReason21.Code, com.tools20022.repository.choice.ProcessingStatus41Choice.Rejected,
					com.tools20022.repository.choice.RejectionReason18Choice.Code, com.tools20022.repository.choice.RejectionReason18Choice.Proprietary, com.tools20022.repository.choice.RejectionReason19Choice.Code,
					com.tools20022.repository.choice.RejectionReason19Choice.Proprietary, com.tools20022.repository.choice.Reason13Choice.RejectionReason, com.tools20022.repository.choice.RejectionReason21Choice.Code,
					com.tools20022.repository.choice.RejectionReason21Choice.Proprietary, com.tools20022.repository.msg.RejectionReason22.Code, com.tools20022.repository.choice.RejectionReason20Choice.Code,
					com.tools20022.repository.choice.RejectionReason20Choice.Proprietary, com.tools20022.repository.choice.RejectionStatus16Choice.Reason, com.tools20022.repository.choice.ReportItemRejectionReason1Choice.Code,
					com.tools20022.repository.choice.ReportItemRejectionReason1Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.Rejected,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice.Rejected, com.tools20022.repository.msg.RejectedStatusReason13.ReasonCode, com.tools20022.repository.choice.RejectedStatus14Choice.Reason,
					com.tools20022.repository.msg.RejectedStatusReason14.ReasonCode, com.tools20022.repository.choice.RejectedReason10Choice.Code, com.tools20022.repository.choice.RejectedReason10Choice.Proprietary,
					com.tools20022.repository.choice.RejectedReason9Choice.Code, com.tools20022.repository.choice.RejectedReason9Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus44Choice.Rejected,
					com.tools20022.repository.choice.ModificationProcessingStatus4Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus45Choice.Rejected, com.tools20022.repository.choice.Reason14Choice.RejectionReason,
					com.tools20022.repository.msg.OtherCollateralResponse1.RejectionReason, com.tools20022.repository.msg.CashCollateralResponse1.RejectionReason, com.tools20022.repository.msg.SecuritiesCollateralResponse1.RejectionReason,
					com.tools20022.repository.choice.InstructionProcessingStatus21Choice.Rejected, com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice.Rejected,
					com.tools20022.repository.choice.RejectedStatus15Choice.Reason, com.tools20022.repository.msg.RejectedStatusReason15.ReasonCode, com.tools20022.repository.choice.RejectedReason11Choice.Code,
					com.tools20022.repository.choice.RejectedReason11Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason16.ReasonCode, com.tools20022.repository.choice.RejectedReason12Choice.Code,
					com.tools20022.repository.choice.RejectedReason12Choice.Proprietary, com.tools20022.repository.choice.ModificationProcessingStatus6Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus47Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus46Choice.Rejected, com.tools20022.repository.choice.Reason15Choice.RejectionReason, com.tools20022.repository.choice.ModificationProcessingStatus5Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus55Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus50Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus48Choice.Rejected,
					com.tools20022.repository.choice.ModificationProcessingStatus7Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus54Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus51Choice.Rejected,
					com.tools20022.repository.msg.RejectionReason26.Code, com.tools20022.repository.choice.RejectionReason24Choice.Code, com.tools20022.repository.choice.RejectionReason24Choice.Proprietary,
					com.tools20022.repository.choice.RejectionStatus17Choice.Reason, com.tools20022.repository.msg.RejectionReason25.Code, com.tools20022.repository.choice.RejectionReason22Choice.Code,
					com.tools20022.repository.choice.RejectionReason22Choice.Proprietary, com.tools20022.repository.choice.RejectionReason23Choice.Code, com.tools20022.repository.choice.RejectionReason23Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus56Choice.Rejected, com.tools20022.repository.choice.RejectedStatus17Choice.Reason, com.tools20022.repository.choice.RejectionReason26Choice.Code,
					com.tools20022.repository.choice.RejectionReason26Choice.Proprietary, com.tools20022.repository.choice.RejectionStatus18Choice.Reason, com.tools20022.repository.choice.RejectionReason25Choice.Code,
					com.tools20022.repository.choice.RejectionReason25Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus49Choice.Rejected, com.tools20022.repository.choice.RejectionStatus21Choice.Reason,
					com.tools20022.repository.msg.RejectionReason30.Code, com.tools20022.repository.msg.RejectionReason27.Code, com.tools20022.repository.choice.RejectionStatus20Choice.Reason,
					com.tools20022.repository.choice.RejectionAndRepairReason23Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason23Choice.Proprietary,
					com.tools20022.repository.choice.RejectionAndRepairReason25Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason25Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus53Choice.Rejected,
					com.tools20022.repository.choice.RejectionAndRepairReason24Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason24Choice.Proprietary, com.tools20022.repository.choice.RejectionReason27Choice.Code,
					com.tools20022.repository.choice.RejectionReason27Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason26Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason26Choice.Proprietary, com.tools20022.repository.msg.RejectionReason28.Code, com.tools20022.repository.choice.Reason16Choice.RejectionReason,
					com.tools20022.repository.choice.RejectionStatus19Choice.Reason, com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice.Rejected,
					com.tools20022.repository.choice.InstructionProcessingStatus24Choice.Rejected, com.tools20022.repository.choice.PendingCancellationReason3Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReason3Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason17.ReasonCode, com.tools20022.repository.choice.RejectedReason14Choice.Code,
					com.tools20022.repository.choice.RejectedReason14Choice.Proprietary, com.tools20022.repository.choice.RejectedStatus18Choice.Reason, com.tools20022.repository.msg.RejectedStatusReason18.ReasonCode,
					com.tools20022.repository.choice.RejectedReason13Choice.Code, com.tools20022.repository.choice.RejectedReason13Choice.Proprietary, com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice.Rejected,
					com.tools20022.repository.choice.InstructionProcessingStatus25Choice.Rejected, com.tools20022.repository.choice.RejectedStatus20Choice.Reason, com.tools20022.repository.choice.PendingCancellationReason4Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReason4Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason19.ReasonCode, com.tools20022.repository.choice.RejectedReason18Choice.Code,
					com.tools20022.repository.choice.RejectedReason18Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason20.ReasonCode, com.tools20022.repository.choice.RejectedReason19Choice.Code,
					com.tools20022.repository.choice.RejectedReason19Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus57Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus65Choice.Rejected,
					com.tools20022.repository.choice.ProcessingStatus58Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus64Choice.Rejected, com.tools20022.repository.choice.ProcessingStatus63Choice.Rejected,
					com.tools20022.repository.msg.RejectionReason37.Code, com.tools20022.repository.choice.RejectionReason31Choice.Code, com.tools20022.repository.choice.RejectionReason31Choice.Proprietary,
					com.tools20022.repository.choice.RejectionStatus22Choice.Reason, com.tools20022.repository.msg.RejectionReason34.Code, com.tools20022.repository.choice.RejectionStatus27Choice.Reason,
					com.tools20022.repository.choice.Reason17Choice.RejectionReason, com.tools20022.repository.choice.RejectionReason34Choice.Code, com.tools20022.repository.choice.RejectionReason34Choice.Proprietary,
					com.tools20022.repository.choice.RejectionAndRepairReason29Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason29Choice.Proprietary, com.tools20022.repository.choice.RejectionStatus23Choice.Reason,
					com.tools20022.repository.msg.RejectionReason36.Code, com.tools20022.repository.choice.RejectedStatus22Choice.Reason, com.tools20022.repository.msg.RejectionReason35.Code,
					com.tools20022.repository.choice.ProcessingStatus59Choice.Rejected, com.tools20022.repository.choice.RejectionReason30Choice.Code, com.tools20022.repository.choice.RejectionReason30Choice.Proprietary,
					com.tools20022.repository.choice.RejectionAndRepairReason31Choice.Code, com.tools20022.repository.choice.RejectionAndRepairReason31Choice.Proprietary, com.tools20022.repository.choice.RejectionStatus26Choice.Reason,
					com.tools20022.repository.choice.RejectionReason28Choice.Code, com.tools20022.repository.choice.RejectionReason28Choice.Proprietary, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.Rejected,
					com.tools20022.repository.choice.RejectionStatus24Choice.Reason, com.tools20022.repository.choice.ProcessingStatus61Choice.Rejected, com.tools20022.repository.msg.RejectionReason39.Code,
					com.tools20022.repository.choice.RejectionReason33Choice.Code, com.tools20022.repository.choice.RejectionReason33Choice.Proprietary, com.tools20022.repository.choice.RejectionReason29Choice.Code,
					com.tools20022.repository.choice.RejectionReason29Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus60Choice.Rejected, com.tools20022.repository.choice.RejectionAndRepairReason28Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason28Choice.Proprietary, com.tools20022.repository.choice.RejectionAndRepairReason27Choice.Code,
					com.tools20022.repository.choice.RejectionAndRepairReason27Choice.Proprietary, com.tools20022.repository.msg.RejectedStatus9.Reason, com.tools20022.repository.msg.RejectedStatus10.Reason,
					com.tools20022.repository.msg.SwitchLegReferences2.LegRejectionReason, com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice.Rejected,
					com.tools20022.repository.choice.InstructionProcessingStatus29Choice.Rejected, com.tools20022.repository.choice.PendingCancellationReason5Choice.Code,
					com.tools20022.repository.choice.PendingCancellationReason5Choice.Proprietary, com.tools20022.repository.msg.RejectedStatusReason21.ReasonCode, com.tools20022.repository.choice.RejectedReason22Choice.Code,
					com.tools20022.repository.choice.RejectedReason22Choice.Proprietary, com.tools20022.repository.msg.OtherCollateralResponse2.RejectionReason, com.tools20022.repository.msg.CashCollateralResponse2.RejectionReason,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.Rejected, com.tools20022.repository.choice.InstructionProcessingStatus30Choice.Rejected,
					com.tools20022.repository.msg.RejectedStatusReason22.ReasonCode, com.tools20022.repository.choice.RejectedReason23Choice.Code, com.tools20022.repository.choice.RejectedReason23Choice.Proprietary,
					com.tools20022.repository.choice.PendingCancellationReason6Choice.Code, com.tools20022.repository.choice.PendingCancellationReason6Choice.Proprietary);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason4Choice#Code
	 * AcknowledgementReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason4Choice#Proprietary
	 * AcknowledgementReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason3#Code
	 * AcknowledgementReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus3Choice#Reason
	 * AcknowledgedAcceptedStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#AcknowledgedAccepted
	 * ProcessingStatus1Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice#Reason
	 * AcknowledgedAcceptedStatus7Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#AcknowledgedAccepted
	 * ProcessingStatus19Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason9Choice#Code
	 * AcknowledgementReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason9Choice#Proprietary
	 * AcknowledgementReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason7#Code
	 * AcknowledgementReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice#Reason
	 * AcknowledgedAcceptedStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus2Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason1Choice#Code
	 * AcknowledgementReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason1Choice#Proprietary
	 * AcknowledgementReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason1#Code
	 * AcknowledgementReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus1Choice#Reason
	 * AcknowledgedAcceptedStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#AcknowledgedAccepted
	 * ProcessingStatus2Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#AcknowledgedAccepted
	 * ProcessingStatus13Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus12Choice#Reason
	 * AcknowledgedAcceptedStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#AcknowledgedAccepted
	 * ProcessingStatus20Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason8Choice#Code
	 * AcknowledgementReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason8Choice#Proprietary
	 * AcknowledgementReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason6#Code
	 * AcknowledgementReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice#Reason
	 * AcknowledgedAcceptedStatus20Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#AcknowledgedAccepted
	 * ProcessingStatus25Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason10Choice#Code
	 * AcknowledgementReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason10Choice#Proprietary
	 * AcknowledgementReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason8#Code
	 * AcknowledgementReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice#Reason
	 * AcknowledgedAcceptedStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus3Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason6Choice#Code
	 * AcknowledgementReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason6Choice#Proprietary
	 * AcknowledgementReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason4#Code
	 * AcknowledgementReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus18Choice#Reason
	 * AcknowledgedAcceptedStatus18Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#AcknowledgedAccepted
	 * ProcessingStatus26Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#AcknowledgedAccepted
	 * ProcessingStatus5Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus6Choice#Reason
	 * AcknowledgedAcceptedStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#AcknowledgedAccepted
	 * ProcessingStatus11Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#AcknowledgedAccepted
	 * ProcessingStatus14Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#AcknowledgedAccepted
	 * ProcessingStatus15Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#AcknowledgedAccepted
	 * ProcessingStatus18Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#AcknowledgedAccepted
	 * ProcessingStatus24Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#AcknowledgedAccepted
	 * ProcessingStatus6Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#AcknowledgedAccepted
	 * ProcessingStatus12Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#AcknowledgedAccepted
	 * ProcessingStatus23Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#AcknowledgedAccepted
	 * ProcessingStatus29Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#AcknowledgedAccepted
	 * ProcessingStatus7Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus3Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus6Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus10Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus11Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#AcknowledgedAccepted
	 * ProcessingStatus17Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#AcknowledgedAccepted
	 * IntraPositionProcessingStatus1Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#AcknowledgedAccepted
	 * ProcessingStatus3Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason2Choice#Code
	 * AcknowledgementReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason2Choice#Proprietary
	 * AcknowledgementReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#AcknowledgedAcceptedReason
	 * Reason1Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#AcknowledgedAcceptedReason
	 * Reason6Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice#AcknowledgedAccepted
	 * ProcessingStatus4Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#AcknowledgedAccepted
	 * ProcessingStatus10Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#AcknowledgedAccepted
	 * ProcessingStatus21Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus10Choice#Reason
	 * AcknowledgedAcceptedStatus10Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#AcknowledgedAccepted
	 * ProcessingStatus27Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus16Choice#Reason
	 * AcknowledgedAcceptedStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason5Choice#Code
	 * AcknowledgementReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason5Choice#Proprietary
	 * AcknowledgementReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#AcknowledgedAcceptedReason
	 * Reason2Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#AcknowledgedAcceptedReason
	 * Reason10Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#AcknowledgedAcceptedReason
	 * Reason7Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#AcknowledgedAcceptedReason
	 * Reason11Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus4Choice#Reason
	 * AcknowledgedAcceptedStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus8Choice#AcknowledgedAccepted
	 * ProcessingStatus8Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus22Choice#AcknowledgedAccepted
	 * ProcessingStatus22Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus28Choice#AcknowledgedAccepted
	 * ProcessingStatus28Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#AcknowledgedAccepted
	 * ProcessingStatus9Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#AcknowledgedAccepted
	 * ProcessingStatus16Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#AcknowledgedAccepted
	 * IntraPositionProcessingStatus2Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#AcknowledgedAccepted
	 * IntraPositionProcessingStatus3Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#AcknowledgedAccepted
	 * IntraPositionProcessingStatus4Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#AcknowledgedAccepted
	 * ProcessingStatus34Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#AcknowledgedAccepted
	 * ProcessingStatus32Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#AcknowledgedAccepted
	 * ProcessingStatus35Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#AcknowledgedAccepted
	 * ProcessingStatus36Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#AcknowledgedAccepted
	 * ProcessingStatus31Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#AcknowledgedAcceptedReason
	 * Reason12Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus14Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#AcknowledgedAccepted
	 * ProcessingStatus38Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#AcknowledgedAccepted
	 * ProcessingStatus37Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason4#ReasonCode
	 * AcceptedStatusReason4.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason4Choice#Code
	 * AcceptedReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason4Choice#Proprietary
	 * AcceptedReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus39Choice#Accepted
	 * ProcessingStatus39Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#AcknowledgedAccepted
	 * ProcessingStatus40Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#AcknowledgedAccepted
	 * ProcessingStatus42Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus17Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason6Choice#Code
	 * AcceptedReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason6Choice#Proprietary
	 * AcceptedReason6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason6#ReasonCode
	 * AcceptedStatusReason6.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus41Choice#Accepted
	 * ProcessingStatus41Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#AcknowledgedAcceptedReason
	 * Reason13Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason2Choice#Code
	 * ReceivedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivedStatusReason1#Reason
	 * ReceivedStatusReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReceivedReason1Choice#Reason
	 * ReceivedReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1#Reason
	 * PendingProcessingStatusReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason9Choice#Reason
	 * PendingProcessingReason9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason8Choice#Code
	 * PendingProcessingReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason8Choice#Reason
	 * RejectedReason8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectedReason7Choice#Code
	 * RejectedReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason7#Reason
	 * AcceptedStatusReason7.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason8Choice#Reason
	 * AcceptedReason8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason12#Reason
	 * RejectedStatusReason12.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason7Choice#Code
	 * AcceptedReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#Accepted
	 * ReportItemStatus1Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#AcknowledgedAccepted
	 * ProcessingStatus44Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus4Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#AcknowledgedAccepted
	 * ProcessingStatus45Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#AcknowledgedAcceptedReason
	 * Reason14Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus6Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#AcknowledgedAccepted
	 * ProcessingStatus47Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#AcknowledgedAccepted
	 * ProcessingStatus46Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#AcknowledgedAcceptedReason
	 * Reason15Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason11Choice#Code
	 * AcknowledgementReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason11Choice#Proprietary
	 * AcknowledgementReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus5Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#AcknowledgedAccepted
	 * ProcessingStatus55Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#AcknowledgedAccepted
	 * IntraPositionProcessingStatus5Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#AcknowledgedAccepted
	 * ProcessingStatus50Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#AcknowledgedAccepted
	 * ProcessingStatus48Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus7Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#AcknowledgedAccepted
	 * ProcessingStatus54Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#AcknowledgedAccepted
	 * ProcessingStatus51Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason9Choice#Code
	 * AcceptedReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason9Choice#Proprietary
	 * AcceptedReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason8#ReasonCode
	 * AcceptedStatusReason8.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#AcknowledgedAccepted
	 * ProcessingStatus52Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice#Reason
	 * AcknowledgedAcceptedStatus21Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason9#Code
	 * AcknowledgementReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus56Choice#Accepted
	 * ProcessingStatus56Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice#Code
	 * AcknowledgementReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice#Proprietary
	 * AcknowledgementReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice#Reason
	 * AcknowledgedAcceptedStatus23Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason11#Code
	 * AcknowledgementReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice#Code
	 * AcknowledgementReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason15Choice#Proprietary
	 * AcknowledgementReason15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#AcknowledgedAccepted
	 * ProcessingStatus49Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice#Code
	 * AcknowledgementReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason14Choice#Proprietary
	 * AcknowledgementReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus22Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason12#Code
	 * AcknowledgementReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#AcknowledgedAccepted
	 * ProcessingStatus53Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice#Reason
	 * AcknowledgedAcceptedStatus22Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice#Reason
	 * AcknowledgedAcceptedStatus24Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#AcknowledgedAcceptedReason
	 * Reason16Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#AcknowledgedAccepted
	 * ProcessingStatus57Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#AcknowledgedAccepted
	 * ProcessingStatus65Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#AcknowledgedAccepted
	 * ProcessingStatus58Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus64Choice#AcknowledgedAccepted
	 * ProcessingStatus64Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#AcknowledgedAccepted
	 * IntraPositionProcessingStatus6Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#AcknowledgedAccepted
	 * ProcessingStatus63Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#AcknowledgedAcceptedReason
	 * Reason17Choice.AcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#AcknowledgedAccepted
	 * ProcessingStatus62Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus59Choice#Accepted
	 * ProcessingStatus59Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason21Choice#Code
	 * AcknowledgementReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason21Choice#Proprietary
	 * AcknowledgementReason21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus30Choice#Reason
	 * AcknowledgedAcceptedStatus30Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason18#Code
	 * AcknowledgementReason18.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#AcknowledgedAccepted
	 * InstructionProcessingStatus27Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason11#ReasonCode
	 * AcceptedStatusReason11.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason12Choice#Code
	 * AcceptedReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason12Choice#Proprietary
	 * AcceptedReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#AcknowledgedAccepted
	 * ModificationProcessingStatus8Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#AcknowledgedAccepted
	 * ProcessingStatus61Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus31Choice#Reason
	 * AcknowledgedAcceptedStatus31Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason13#Code
	 * AcknowledgementReason13.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason16Choice#Code
	 * AcknowledgementReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason16Choice#Proprietary
	 * AcknowledgementReason16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice#Reason
	 * AcknowledgedAcceptedStatus25Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus27Choice#Reason
	 * AcknowledgedAcceptedStatus27Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#AcknowledgedAccepted
	 * ProcessingStatus60Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason22Choice#Code
	 * AcknowledgementReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason22Choice#Proprietary
	 * AcknowledgementReason22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason19#Code
	 * AcknowledgementReason19.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3#Reason
	 * ConditionallyAcceptedStatusReason3.Reason}</li>
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
	public static final MMBusinessAttribute AcknowledgedAcceptedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AcknowledgementReason4Choice.Code, com.tools20022.repository.choice.AcknowledgementReason4Choice.Proprietary,
					com.tools20022.repository.msg.AcknowledgementReason3.Code, com.tools20022.repository.choice.AcknowledgedAcceptedStatus3Choice.Reason, com.tools20022.repository.choice.ProcessingStatus1Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice.Reason, com.tools20022.repository.choice.ProcessingStatus19Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgementReason9Choice.Code, com.tools20022.repository.choice.AcknowledgementReason9Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason7.Code,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice.Reason, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgementReason1Choice.Code, com.tools20022.repository.choice.AcknowledgementReason1Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason1.Code,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus1Choice.Reason, com.tools20022.repository.choice.ProcessingStatus2Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus13Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgedAcceptedStatus12Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus20Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgementReason8Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason8Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason6.Code, com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus25Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgementReason10Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason10Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason8.Code, com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice.Reason,
					com.tools20022.repository.choice.ModificationProcessingStatus3Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgementReason6Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason6Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason4.Code, com.tools20022.repository.choice.AcknowledgedAcceptedStatus18Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus26Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus5Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus6Choice.Reason, com.tools20022.repository.choice.ProcessingStatus11Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus14Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus15Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus18Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus24Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus6Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus12Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus23Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus29Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus7Choice.AcknowledgedAccepted, com.tools20022.repository.choice.InstructionProcessingStatus3Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.InstructionProcessingStatus6Choice.AcknowledgedAccepted, com.tools20022.repository.choice.InstructionProcessingStatus10Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.InstructionProcessingStatus11Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus17Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus3Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgementReason2Choice.Code, com.tools20022.repository.choice.AcknowledgementReason2Choice.Proprietary, com.tools20022.repository.choice.Reason1Choice.AcknowledgedAcceptedReason,
					com.tools20022.repository.choice.Reason6Choice.AcknowledgedAcceptedReason, com.tools20022.repository.choice.ProcessingStatus4Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus10Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus21Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus10Choice.Reason, com.tools20022.repository.choice.ProcessingStatus27Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus16Choice.Reason, com.tools20022.repository.choice.AcknowledgementReason5Choice.Code, com.tools20022.repository.choice.AcknowledgementReason5Choice.Proprietary,
					com.tools20022.repository.choice.Reason2Choice.AcknowledgedAcceptedReason, com.tools20022.repository.choice.Reason10Choice.AcknowledgedAcceptedReason,
					com.tools20022.repository.choice.Reason7Choice.AcknowledgedAcceptedReason, com.tools20022.repository.choice.Reason11Choice.AcknowledgedAcceptedReason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus4Choice.Reason, com.tools20022.repository.choice.ProcessingStatus8Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus22Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus28Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus9Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus16Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice.AcknowledgedAccepted, com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus34Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus32Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus35Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus36Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus31Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.Reason12Choice.AcknowledgedAcceptedReason, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus38Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus37Choice.AcknowledgedAccepted,
					com.tools20022.repository.msg.AcceptedStatusReason4.ReasonCode, com.tools20022.repository.choice.AcceptedReason4Choice.Code, com.tools20022.repository.choice.AcceptedReason4Choice.Proprietary,
					com.tools20022.repository.choice.ProcessingStatus39Choice.Accepted, com.tools20022.repository.choice.ProcessingStatus40Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus42Choice.AcknowledgedAccepted, com.tools20022.repository.choice.InstructionProcessingStatus17Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcceptedReason6Choice.Code, com.tools20022.repository.choice.AcceptedReason6Choice.Proprietary, com.tools20022.repository.msg.AcceptedStatusReason6.ReasonCode,
					com.tools20022.repository.choice.ProcessingStatus41Choice.Accepted, com.tools20022.repository.choice.Reason13Choice.AcknowledgedAcceptedReason, com.tools20022.repository.choice.ReceivedReason2Choice.Code,
					com.tools20022.repository.msg.ReceivedStatusReason1.Reason, com.tools20022.repository.choice.ReceivedReason1Choice.Reason, com.tools20022.repository.msg.PendingProcessingStatusReason1.Reason,
					com.tools20022.repository.choice.PendingProcessingReason9Choice.Reason, com.tools20022.repository.choice.PendingProcessingReason8Choice.Code, com.tools20022.repository.choice.RejectedReason8Choice.Reason,
					com.tools20022.repository.choice.RejectedReason7Choice.Code, com.tools20022.repository.msg.AcceptedStatusReason7.Reason, com.tools20022.repository.choice.AcceptedReason8Choice.Reason,
					com.tools20022.repository.msg.RejectedStatusReason12.Reason, com.tools20022.repository.choice.AcceptedReason7Choice.Code, com.tools20022.repository.choice.ReportItemStatus1Choice.Accepted,
					com.tools20022.repository.choice.ProcessingStatus44Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ModificationProcessingStatus4Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus45Choice.AcknowledgedAccepted, com.tools20022.repository.choice.Reason14Choice.AcknowledgedAcceptedReason,
					com.tools20022.repository.choice.ModificationProcessingStatus6Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus47Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus46Choice.AcknowledgedAccepted, com.tools20022.repository.choice.Reason15Choice.AcknowledgedAcceptedReason,
					com.tools20022.repository.choice.AcknowledgementReason11Choice.Code, com.tools20022.repository.choice.AcknowledgementReason11Choice.Proprietary,
					com.tools20022.repository.choice.ModificationProcessingStatus5Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus55Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus50Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus48Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus54Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus51Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcceptedReason9Choice.Code, com.tools20022.repository.choice.AcceptedReason9Choice.Proprietary, com.tools20022.repository.msg.AcceptedStatusReason8.ReasonCode,
					com.tools20022.repository.choice.ProcessingStatus52Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice.Reason, com.tools20022.repository.msg.AcknowledgementReason9.Code,
					com.tools20022.repository.choice.ProcessingStatus56Choice.Accepted, com.tools20022.repository.choice.AcknowledgementReason12Choice.Code, com.tools20022.repository.choice.AcknowledgementReason12Choice.Proprietary,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice.Reason, com.tools20022.repository.msg.AcknowledgementReason11.Code, com.tools20022.repository.choice.AcknowledgementReason15Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason15Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus49Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.AcknowledgementReason14Choice.Code, com.tools20022.repository.choice.AcknowledgementReason14Choice.Proprietary,
					com.tools20022.repository.choice.InstructionProcessingStatus22Choice.AcknowledgedAccepted, com.tools20022.repository.msg.AcknowledgementReason12.Code,
					com.tools20022.repository.choice.ProcessingStatus53Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgedAcceptedStatus22Choice.Reason,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus24Choice.Reason, com.tools20022.repository.choice.Reason16Choice.AcknowledgedAcceptedReason,
					com.tools20022.repository.choice.ProcessingStatus57Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus65Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus58Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus64Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice.AcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus63Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.Reason17Choice.AcknowledgedAcceptedReason, com.tools20022.repository.choice.ProcessingStatus62Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus59Choice.Accepted, com.tools20022.repository.choice.AcknowledgementReason21Choice.Code, com.tools20022.repository.choice.AcknowledgementReason21Choice.Proprietary,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus30Choice.Reason, com.tools20022.repository.msg.AcknowledgementReason18.Code,
					com.tools20022.repository.choice.InstructionProcessingStatus27Choice.AcknowledgedAccepted, com.tools20022.repository.msg.AcceptedStatusReason11.ReasonCode, com.tools20022.repository.choice.AcceptedReason12Choice.Code,
					com.tools20022.repository.choice.AcceptedReason12Choice.Proprietary, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.ProcessingStatus61Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgedAcceptedStatus31Choice.Reason, com.tools20022.repository.msg.AcknowledgementReason13.Code,
					com.tools20022.repository.choice.AcknowledgementReason16Choice.Code, com.tools20022.repository.choice.AcknowledgementReason16Choice.Proprietary,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice.Reason, com.tools20022.repository.choice.AcknowledgedAcceptedStatus27Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus60Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgementReason22Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason22Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason19.Code, com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3.Reason);
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Related reason of closure of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ClosureReason
	 * RegisteredContract.ClosureReason}</li>
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
	public static final MMBusinessAssociationEnd RelatedClosureReason = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> StatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ClosureReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason, com.tools20022.repository.entity.Status.StatusReason,
						com.tools20022.repository.entity.RegisteredContract.ClosureReason);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProprietaryReason1.Reason, com.tools20022.repository.msg.ProprietaryReason2.Reason, com.tools20022.repository.choice.ReturnReason1Choice.Code,
						com.tools20022.repository.choice.ReturnReason1Choice.Proprietary, com.tools20022.repository.choice.ReturnReason5Choice.Code, com.tools20022.repository.choice.ReturnReason5Choice.Proprietary,
						com.tools20022.repository.msg.ReversalReasonInformation6.Reason, com.tools20022.repository.msg.PaymentReversalReason7.Reason, com.tools20022.repository.msg.AmendmentReasonInformation1.Reason,
						com.tools20022.repository.msg.PaymentReturnReason1.Reason, com.tools20022.repository.msg.InRepairStatusReason3.Reason, com.tools20022.repository.choice.TransferUnmatchedStatus.Reason,
						com.tools20022.repository.msg.TransferUnmatchedStatus2.Reason, com.tools20022.repository.msg.TransferUnmatchedStatus2.ExtendedReason, com.tools20022.repository.msg.FailedSettlementStatus1.DataSourceScheme,
						com.tools20022.repository.choice.RejectionReason1Choice.GlobalRejectionReason, com.tools20022.repository.choice.ReturnReason3Choice.Code, com.tools20022.repository.choice.ReturnReason3Choice.Proprietary,
						com.tools20022.repository.choice.ReturnReason4Choice.Code, com.tools20022.repository.choice.ReturnReason4Choice.Proprietary, com.tools20022.repository.msg.Reason3.Reason,
						com.tools20022.repository.choice.Reason3Choice.Reason, com.tools20022.repository.msg.ProprietaryReason4.Reason, com.tools20022.repository.msg.CancellationStatusAndReason3.Status,
						com.tools20022.repository.choice.TransferUnmatchedStatus3Choice.Reason, com.tools20022.repository.choice.TransferUnmatchedStatus3Choice.ExtendedReason,
						com.tools20022.repository.choice.FailedSettlementStatus2Choice.DataSourceScheme, com.tools20022.repository.choice.Status21Choice.Rejected, com.tools20022.repository.choice.Status21Choice.Complete,
						com.tools20022.repository.msg.CancelledCompleteReason1.AdditionalReasonInformation, com.tools20022.repository.msg.ProprietaryReason5.Reason, com.tools20022.repository.msg.ClosedStatusReason1.Code,
						com.tools20022.repository.msg.ProformaStatusReason1.Code, com.tools20022.repository.msg.DisabledStatusReason1.Code, com.tools20022.repository.msg.EnabledStatusReason1.Code,
						com.tools20022.repository.msg.SuspendedStatusReason4.Reason, com.tools20022.repository.msg.InRepairStatusReason4.Reason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.Status, com.tools20022.repository.entity.StatusReason.Reason, com.tools20022.repository.entity.StatusReason.NoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.DataSourceScheme, com.tools20022.repository.entity.StatusReason.RejectedStatusReason, com.tools20022.repository.entity.StatusReason.FailingReason,
						com.tools20022.repository.entity.StatusReason.CancellationReason, com.tools20022.repository.entity.StatusReason.PendingReason, com.tools20022.repository.entity.StatusReason.RejectionReason,
						com.tools20022.repository.entity.StatusReason.AcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.RelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(BlockedReason1Choice.mmObject(), RejectedReason3Choice.mmObject(), ProprietaryStatusJustification.mmObject(), ProprietaryReason1.mmObject(), NoSpecifiedReason1.mmObject(),
						ProprietaryReason2.mmObject(), ReturnReason1Choice.mmObject(), ReturnReason5Choice.mmObject(), PaymentReturnReason2.mmObject(), ReversalReasonInformation6.mmObject(), PaymentReversalReason7.mmObject(),
						StatusReason6Choice.mmObject(), AmendmentReasonInformation1.mmObject(), MandateAmendmentReason1.mmObject(), PaymentReturnReason1.mmObject(), InRepairStatusReason1.mmObject(), InRepairStatusReason3.mmObject(),
						RejectionReason1.mmObject(), TransferUnmatchedStatusReason1.mmObject(), TransferUnmatchedStatus.mmObject(), TransferUnmatchedStatus2.mmObject(), RejectedStatus8Choice.mmObject(), FailedSettlementStatus1.mmObject(),
						CancellationPendingStatus1.mmObject(), InstructionRejectionStatus1.mmObject(), RejectedStatusReason9Choice.mmObject(), RejectedCancellationStatusReason1Choice.mmObject(), RejectionReason2.mmObject(),
						Reason2.mmObject(), RejectionReason1Choice.mmObject(), ReturnReason3Choice.mmObject(), ReturnReason4Choice.mmObject(), ProprietaryReason3.mmObject(), Reason3.mmObject(), Reason3Choice.mmObject(),
						RejectionReason4.mmObject(), RejectionReason3Choice.mmObject(), RejectedReason4Choice.mmObject(), TechnicalError1Choice.mmObject(), ProprietaryReason4.mmObject(), TransferUnmatchedStatus3Choice.mmObject(),
						FailedSettlementStatus2Choice.mmObject(), CancellationPendingStatus7Choice.mmObject(), RejectedReason17Choice.mmObject(), CancelledCompleteReason1.mmObject(), RejectedReason16Choice.mmObject(),
						RejectedReason15Choice.mmObject(), ProprietaryReason5.mmObject(), SystemEventType3Choice.mmObject(), ClosedStatusReason1.mmObject(), ProformaStatusReason1.mmObject(), DisabledStatusReason1.mmObject(),
						EnabledStatusReason1.mmObject(), SuspendedStatusReason4.mmObject(), BlockedReason2Choice.mmObject(), ConditionallyAcceptedStatusReason3.mmObject(), InRepairStatusReason4.mmObject(), PendingStatusReason14.mmObject(),
						PendingOpeningStatusReason1.mmObject(), ClosurePendingStatusReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}