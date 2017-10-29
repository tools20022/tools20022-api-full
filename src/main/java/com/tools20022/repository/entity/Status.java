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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The status of an instruction, advice or request.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Status" src="doc-files/Status.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusReason
 * Status.StatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusDateTime
 * Status.StatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#ValidityTime
 * Status.ValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#StatusDescription
 * Status.StatusDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#InstructionProcessingStatus
 * Status.InstructionProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#PartyRole
 * Status.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#SettlementStatus
 * Status.SettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#CancellationProcessingStatus
 * Status.CancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
 * Status.TransactionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#ModificationProcessingStatus
 * Status.ModificationProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Status
 * DateTimePeriod.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#Status
 * StatusReason.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#Status
 * InvestigationPartyRole.Status}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#ProprietaryStatus
 * ProprietaryStatusAndReason1.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#Proprietary
 * ModificationProcessingStatus2Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#ProcessingStatus
 * StatusTrail2.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#ModificationProcessingStatus
 * StatusTrail2.ModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#CancellationStatus
 * StatusTrail2.CancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#Settled
 * StatusTrail2.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2#ProprietaryStatus
 * ProprietaryStatusAndReason2.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#Proprietary
 * ModificationProcessingStatus3Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#ProcessingStatus
 * StatusTrail3.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#ModificationProcessingStatus
 * StatusTrail3.ModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#CancellationStatus
 * StatusTrail3.CancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#Settled
 * StatusTrail3.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#ProcessingStatus
 * StatusAndReason12.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#ProcessingStatus
 * StatusAndReason14.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason1#StatusAndReason
 * StatusAndReason1.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason2#StatusAndReason
 * StatusAndReason2.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason4#StatusAndReason
 * StatusAndReason4.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason5#StatusAndReason
 * StatusAndReason5.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason7#StatusAndReason
 * StatusAndReason7.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason8#StatusAndReason
 * StatusAndReason8.StatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status9Choice#Proprietary
 * Status9Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason9#StatusAndReason
 * StatusAndReason9.StatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status11Choice#Proprietary
 * Status11Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason13#StatusAndReason
 * StatusAndReason13.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason16#StatusAndReason
 * StatusAndReason16.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason17#StatusAndReason
 * StatusAndReason17.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#Status
 * CorporateActionInstructionProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#Rejected
 * ResponseStatus3Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#Pending
 * ResponseStatus3Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#Rejected
 * ResponseStatus4Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#Pending
 * ResponseStatus4Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement5Choice#StatusAdvice
 * StatusOrStatement5Choice.StatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement6Choice#StatusAdvice
 * StatusOrStatement6Choice.StatusAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus1#Type
 * IntraBalanceQueryStatus1.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3#ProprietaryStatus
 * ProprietaryStatusAndReason3.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason18#StatusAndReason
 * StatusAndReason18.StatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status15Choice#Proprietary
 * Status15Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#ProcessingStatus
 * StatusAndReason19.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#ProcessingStatus
 * StatusAndReason20.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason21#StatusAndReason
 * StatusAndReason21.StatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status16Choice#Proprietary
 * Status16Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason25#StatusAndReason
 * StatusAndReason25.StatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#ProcessingStatus
 * StatusTrail4.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#ModificationProcessingStatus
 * StatusTrail4.ModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#CancellationStatus
 * StatusTrail4.CancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#Settled
 * StatusTrail4.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#Proprietary
 * ModificationProcessingStatus4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#Proprietary
 * ModificationProcessingStatus6Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason26#StatusAndReason
 * StatusAndReason26.StatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#ProcessingStatus
 * StatusTrail5.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#ModificationProcessingStatus
 * StatusTrail5.ModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#CancellationStatus
 * StatusTrail5.CancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#Settled
 * StatusTrail5.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#Proprietary
 * ModificationProcessingStatus5Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#Identification
 * GenericValidationRuleIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason27#StatusAndReason
 * StatusAndReason27.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#RecordStatus
 * CurrencyControlPackageStatus1.RecordStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#Rejected
 * ResponseStatus6Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#Pending
 * ResponseStatus6Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice#StatusAdvice
 * StatusOrStatement7Choice.StatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#ProcessingStatus
 * StatusAndReason28.ProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#ProcessingStatus
 * StatusTrail6.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#ModificationProcessingStatus
 * StatusTrail6.ModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#CancellationStatus
 * StatusTrail6.CancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#Settled
 * StatusTrail6.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#Proprietary
 * ModificationProcessingStatus7Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#ProprietaryStatus
 * ProprietaryStatusAndReason6.ProprietaryStatus}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status18Choice#Proprietary
 * Status18Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7#ProprietaryStatus
 * ProprietaryStatusAndReason7.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason30#StatusAndReason
 * StatusAndReason30.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#Rejected
 * ResponseStatus8Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#Pending
 * ResponseStatus8Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#ProcessingStatus
 * StatusAndReason29.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement8Choice#StatusAdvice
 * StatusOrStatement8Choice.StatusAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#ProcessingStatus
 * StatusTrail7.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#ModificationProcessingStatus
 * StatusTrail7.ModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#CancellationStatus
 * StatusTrail7.CancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#Settled
 * StatusTrail7.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#Proprietary
 * ModificationProcessingStatus8Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status23Choice#Proprietary
 * Status23Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason32#StatusAndReason
 * StatusAndReason32.StatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason33#StatusAndReason
 * StatusAndReason33.StatusAndReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus
 * SecuritiesStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BaselineStatus
 * BaselineStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus InvoiceStatus}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
 * ProprietaryStatusAndReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
 * ModificationProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2 StatusTrail2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2
 * ProprietaryStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
 * ModificationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3 StatusTrail3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice
 * DeliveryReturn1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice
 * DeliveryReturn2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied1Choice
 * MatchingDenied1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied2Choice
 * MatchingDenied2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason3
 * StatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason6
 * StatusAndReason6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason12
 * StatusAndReason12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason14
 * StatusAndReason14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status2Choice Status2Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason1
 * StatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason2
 * StatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status4Choice Status4Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason4
 * StatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason5
 * StatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason7
 * StatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason8
 * StatusAndReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status9Choice Status9Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason9
 * StatusAndReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status11Choice
 * Status11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason13
 * StatusAndReason13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason16
 * StatusAndReason16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason17
 * StatusAndReason17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason10
 * StatusAndReason10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
 * ReplacementProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent3
 * PointOfInteractionComponent3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportStatusAndReason1
 * ReportStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportStatusAndReason2
 * ReportStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice
 * RegistrationProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus1Choice
 * ResponseStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice
 * ReplacementProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus1Choice
 * SettlementStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice
 * SettlementConditionModificationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status1Choice Status1Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus3Choice
 * ResponseStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus4Choice
 * ResponseStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice
 * RegistrationProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus2Choice
 * ResponseStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice
 * ReplacementProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus3Choice
 * SettlementStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice
 * SettlementConditionModificationStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Status10Choice
 * Status10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice
 * ModificationProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1
 * IntraBalanceStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice
 * ProcessingStatus33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1
 * IntraBalanceStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus1
 * IntraBalanceQueryStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3
 * ProprietaryStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice
 * ProcessingStatus30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLinkStatus1
 * AccountLinkStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason18
 * StatusAndReason18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason19
 * StatusAndReason19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason20
 * StatusAndReason20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason21
 * StatusAndReason21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4
 * PointOfInteractionComponent4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice
 * ReportItemStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason25
 * StatusAndReason25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice
 * ModificationProcessingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
 * ModificationProcessingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason26
 * StatusAndReason26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice
 * ModificationProcessingStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
 * PointOfInteractionComponent5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
 * GenericValidationRuleIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason27
 * StatusAndReason27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
 * CurrencyControlGroupStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
 * CurrencyControlPackageStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValidationStatusReason1
 * ValidationStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
 * CurrencyControlRecordStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
 * ResponseStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason28
 * StatusAndReason28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6 StatusTrail6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
 * ModificationProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus5Choice
 * ResponseStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice
 * ReplacementProcessingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
 * ProprietaryStatusAndReason6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice
 * RegistrationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice
 * DeliveryReturn3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status19Choice
 * Status19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice
 * SettlementConditionModificationStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied3Choice
 * MatchingDenied3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7
 * ProprietaryStatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason30
 * StatusAndReason30}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus8Choice
 * ResponseStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason29
 * StatusAndReason29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied4Choice
 * MatchingDenied4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status22Choice
 * Status22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice
 * RegistrationProcessingStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus7Choice
 * ResponseStatus7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice
 * SettlementConditionModificationStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice
 * ReplacementProcessingStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice
 * DeliveryReturn4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice
 * ModificationProcessingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6
 * PointOfInteractionComponent6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason32
 * StatusAndReason32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason33
 * StatusAndReason33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
 * PointOfInteractionComponent7}</li>
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
 * "Status"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The status of an instruction, advice or request."</li>
 * </ul>
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reasons for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#Status
	 * StatusReason.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#Reason
	 * Blocked1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#ProprietaryStatusReason
	 * InstructionStatusSearch3.ProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#ProprietaryRejectionReason
	 * PaymentStatusReasonCode3Choice.ProprietaryRejectionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#Reason
	 * PaymentStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#ProprietaryReason
	 * ProprietaryStatusAndReason1.ProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2#ProprietaryReason
	 * ProprietaryStatusAndReason2.ProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice#Code
	 * DeliveryReturn1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice#Proprietary
	 * DeliveryReturn1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice#Code
	 * DeliveryReturn2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice#Proprietary
	 * DeliveryReturn2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#CancellationReasonInformation
	 * OriginalPaymentInstruction4.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#CancellationReasonInformation
	 * OriginalPaymentInstruction8.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#ReversalReasonInformation
	 * OriginalPaymentInformation2.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#ReversalReasonInformation
	 * PaymentTransaction35.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#ReversalReasonInformation
	 * OriginalPaymentInstruction2.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#ReversalReasonInformation
	 * PaymentTransaction42.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#ReversalReasonInformation
	 * OriginalPaymentInstruction7.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#StatusReasonInformation
	 * OriginalGroupInformation1.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#StatusReasonInformation
	 * PaymentTransactionInformation1.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#StatusReasonInformation
	 * OriginalGroupInformation20.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#StatusReasonInformation
	 * PaymentTransactionInformation25.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#StatusReasonInformation
	 * OriginalPaymentInformation1.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#Reason
	 * StatusReasonInformation9.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#StatusReasonInformation
	 * OriginalGroupHeader1.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#StatusReasonInformation
	 * PaymentTransaction32.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#StatusReasonInformation
	 * OriginalPaymentInstruction1.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#StatusReasonInformation
	 * PaymentTransaction46.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#StatusReasonInformation
	 * OriginalPaymentInstruction6.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#ReversalReasonInformation
	 * PaymentTransaction36.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#ReversalReasonInformation
	 * PaymentTransaction45.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#StatusReasonInformation
	 * PaymentTransactionInformation26.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#StatusReasonInformation
	 * PaymentTransaction33.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#StatusReasonInformation
	 * PaymentTransaction43.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#AmendmentReason
	 * MandateAmendment1.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment2#AmendmentReason
	 * MandateAmendment2.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#AmendmentReason
	 * MandateAmendment3.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation1#ReturnReason
	 * ReturnReasonInformation1.ReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#ReturnReasonInformation
	 * OriginalGroupInformation2.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation9#Reason
	 * ReturnReasonInformation9.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#ReturnReasonInformation
	 * OriginalGroupInformation21.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#ReturnReasonInformation
	 * OriginalGroupHeader2.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#ReturnReasonInformation
	 * PaymentTransaction34.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#ReturnReasonInformation
	 * PaymentTransaction44.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#StatusReasonInformation
	 * OriginalGroupInformation25.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#StatusReasonInformation
	 * PaymentTransactionInformation34.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#StatusReasonInformation
	 * OriginalPaymentInformation5.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#StatusReasonInformation
	 * PaymentTransaction41.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#StatusReasonInformation
	 * OriginalPaymentInstruction5.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#StatusReasonInformation
	 * PaymentTransaction49.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#StatusReasonInformation
	 * OriginalPaymentInstruction9.StatusReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus1#Reason
	 * InRepairStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#Cancelled
	 * IndividualOrderStatusAndReason1.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus2#ReasonDetails
	 * InRepairStatus2.ReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#Cancelled
	 * IndividualOrderStatusAndReason2.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#InRepair
	 * IndividualOrderStatusAndReason2.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#StatusReason
	 * MeetingInstructionGlobalStatus.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason1#Rejected
	 * ReportStatusAndReason1.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#Rejected
	 * TradeTransactionStatusAndReason1.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason2#Rejected
	 * ReportStatusAndReason2.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#Rejected
	 * TradeTransactionStatusAndReason2.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#StatusReasonInformation
	 * OriginalGroupInformation13.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#StatusReasonInformation
	 * OriginalGroupInformation17.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#StatusReasonInformation
	 * OriginalGroupInformation15.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#StatusReasonInformation
	 * OriginalGroupInformation19.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3#ReturnReason
	 * ReturnReasonInformation3.ReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#ReturnReasonInformation
	 * OriginalGroupInformation11.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#ReturnReasonInformation
	 * OriginalGroupInformation18.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation4#ReturnReason
	 * ReturnReasonInformation4.ReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation6#ReturnReason
	 * ReturnReasonInformation6.ReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#StatusReasonInformation
	 * PaymentTransactionInformation15.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#StatusReasonInformation
	 * PaymentTransactionInformation22.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#StatusReasonInformation
	 * PaymentTransactionInformation12.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#StatusReasonInformation
	 * PaymentTransactionInformation19.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation7#ReturnReason
	 * ReturnReasonInformation7.ReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#Cancelled
	 * IndividualOrderStatusAndReason5.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#Settled
	 * IntraBalanceStatusAndReason1.Settled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1#Reason
	 * CollateralStatusReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#Settled
	 * IntraPositionStatusType1.Settled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#Settled
	 * IntraBalanceStatusType1.Settled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3#ProprietaryReason
	 * ProprietaryStatusAndReason3.ProprietaryReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#Reason
	 * PaymentStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#Unmatched
	 * TransferStatus1Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#InRepair
	 * TransferStatus1Choice.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#FailedSettlement
	 * TransferStatus1Choice.FailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#CancellationPending
	 * TransferStatus1Choice.CancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#ReturnReasonInformation
	 * PaymentTransaction50.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#AmendmentReason
	 * MandateAmendment4.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#StatusReasonInformation
	 * OriginalPaymentInstruction12.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#ReversalReasonInformation
	 * OriginalPaymentInstruction11.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#StatusReasonInformation
	 * PaymentTransaction52.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#ReversalReasonInformation
	 * PaymentTransaction51.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#CancellationReasonInformation
	 * OriginalPaymentInstruction13.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#StatusReasonInformation
	 * PaymentTransaction57.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#ReversalReasonInformation
	 * PaymentTransaction56.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#AcceptedWithException
	 * ReportItemStatus1Choice.AcceptedWithException}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#StatusReasonInformation
	 * OriginalPaymentInstruction14.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#StatusReasonInformation
	 * PaymentTransaction59.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#StatusReason
	 * CurrencyControlPackageStatus1.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#Reason
	 * ValidationStatusReason1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#StatusReason
	 * CurrencyControlRecordStatus1.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#ProprietaryReason
	 * ProprietaryStatusAndReason6.ProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#Code
	 * DeliveryReturn3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#Proprietary
	 * DeliveryReturn3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#ReversalReasonInformation
	 * OriginalPaymentInstruction16.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#StatusReasonInformation
	 * OriginalPaymentInstruction18.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#ReturnReasonInformation
	 * PaymentTransaction65.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#StatusReasonInformation
	 * PaymentTransaction63.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#ReversalReasonInformation
	 * PaymentTransaction60.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#StatusReasonInformation
	 * PaymentTransaction68.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#CancellationReasonInformation
	 * OriginalPaymentInstruction15.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#ReversalReasonInformation
	 * PaymentTransaction64.ReversalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#Reason
	 * Blocked2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#Unmatched
	 * TransferStatus2Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#InRepair
	 * TransferStatus2Choice.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#FailedSettlement
	 * TransferStatus2Choice.FailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#CancellationPending
	 * TransferStatus2Choice.CancellationPending}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#Pending
	 * Status21Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#StatusReasonInformation
	 * OriginalPaymentInstruction19.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#StatusReasonInformation
	 * PaymentTransaction69.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7#ProprietaryReason
	 * ProprietaryStatusAndReason7.ProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice#Code
	 * DeliveryReturn4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice#Proprietary
	 * DeliveryReturn4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#StatusReason
	 * AccountManagementStatusAndReason5.StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#Cancelled
	 * OrderStatus5Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#InRepair
	 * OrderStatus5Choice.InRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#Enabled
	 * AccountStatus2.Enabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#Disabled
	 * AccountStatus2.Disabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#Pending
	 * AccountStatus2.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#PendingOpening
	 * AccountStatus2.PendingOpening}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#Proforma
	 * AccountStatus2.Proforma}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#Closed
	 * AccountStatus2.Closed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#ClosurePending
	 * AccountStatus2.ClosurePending}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAccountStatus1#Reason
	 * OtherAccountStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#Cancelled
	 * OrderStatus3Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#Cancelled
	 * OrderStatus4Choice.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#InRepair
	 * OrderStatus4Choice.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#StatusReasonInformation
	 * PaymentTransaction80.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#StatusReasonInformation
	 * OriginalGroupHeader7.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ReversalReasonInformation
	 * PaymentTransaction81.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#StatusReasonInformation
	 * OriginalPaymentInstruction23.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#ReversalReasonInformation
	 * OriginalPaymentInstruction21.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#AmendmentReason
	 * MandateAmendment5.AmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#StatusReasonInformation
	 * OriginalPaymentInstruction24.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#StatusReasonInformation
	 * OriginalGroupInformation28.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ReturnReasonInformation
	 * PaymentTransaction76.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#CancellationReasonInformation
	 * OriginalPaymentInstruction20.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#StatusReasonInformation
	 * PaymentTransaction83.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#ReversalReasonInformation
	 * PaymentTransaction77.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#StatusReasonInformation
	 * PaymentTransaction82.StatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateSuspensionReason1#Reason
	 * MandateSuspensionReason1.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reasons for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Blocked1.Reason, com.tools20022.repository.msg.InstructionStatusSearch3.ProprietaryStatusReason,
					com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.ProprietaryRejectionReason, com.tools20022.repository.msg.PaymentStatus1.Reason,
					com.tools20022.repository.msg.ProprietaryStatusAndReason1.ProprietaryReason, com.tools20022.repository.msg.ProprietaryStatusAndReason2.ProprietaryReason, com.tools20022.repository.choice.DeliveryReturn1Choice.Code,
					com.tools20022.repository.choice.DeliveryReturn1Choice.Proprietary, com.tools20022.repository.choice.DeliveryReturn2Choice.Code, com.tools20022.repository.choice.DeliveryReturn2Choice.Proprietary,
					com.tools20022.repository.msg.OriginalPaymentInstruction4.CancellationReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction8.CancellationReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation2.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction35.ReversalReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction2.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction42.ReversalReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction7.ReversalReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation1.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation1.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation20.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation25.StatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInformation1.StatusReasonInformation,
					com.tools20022.repository.msg.StatusReasonInformation9.Reason, com.tools20022.repository.msg.OriginalGroupHeader1.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction32.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction1.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction46.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction6.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction36.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction45.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation26.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction33.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction43.StatusReasonInformation, com.tools20022.repository.msg.MandateAmendment1.AmendmentReason,
					com.tools20022.repository.msg.MandateAmendment2.AmendmentReason, com.tools20022.repository.msg.MandateAmendment3.AmendmentReason, com.tools20022.repository.msg.ReturnReasonInformation1.ReturnReason,
					com.tools20022.repository.msg.OriginalGroupInformation2.ReturnReasonInformation, com.tools20022.repository.msg.ReturnReasonInformation9.Reason,
					com.tools20022.repository.msg.OriginalGroupInformation21.ReturnReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader2.ReturnReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction34.ReturnReasonInformation, com.tools20022.repository.msg.PaymentTransaction44.ReturnReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation25.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation34.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation5.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction41.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction5.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction49.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction9.StatusReasonInformation, com.tools20022.repository.msg.InRepairStatus1.Reason, com.tools20022.repository.msg.IndividualOrderStatusAndReason1.Cancelled,
					com.tools20022.repository.msg.InRepairStatus2.ReasonDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.Cancelled, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.InRepair,
					com.tools20022.repository.msg.MeetingInstructionGlobalStatus.StatusReason, com.tools20022.repository.msg.ReportStatusAndReason1.Rejected, com.tools20022.repository.msg.TradeTransactionStatusAndReason1.Rejected,
					com.tools20022.repository.msg.ReportStatusAndReason2.Rejected, com.tools20022.repository.msg.TradeTransactionStatusAndReason2.Rejected, com.tools20022.repository.msg.OriginalGroupInformation13.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation17.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation15.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation19.StatusReasonInformation, com.tools20022.repository.msg.ReturnReasonInformation3.ReturnReason,
					com.tools20022.repository.msg.OriginalGroupInformation11.ReturnReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation18.ReturnReasonInformation,
					com.tools20022.repository.msg.ReturnReasonInformation4.ReturnReason, com.tools20022.repository.msg.ReturnReasonInformation6.ReturnReason,
					com.tools20022.repository.msg.PaymentTransactionInformation15.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation22.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation12.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation19.StatusReasonInformation,
					com.tools20022.repository.msg.ReturnReasonInformation7.ReturnReason, com.tools20022.repository.msg.IndividualOrderStatusAndReason5.Cancelled, com.tools20022.repository.msg.IntraBalanceStatusAndReason1.Settled,
					com.tools20022.repository.msg.CollateralStatusReason1.Reason, com.tools20022.repository.msg.IntraPositionStatusType1.Settled, com.tools20022.repository.msg.IntraBalanceStatusType1.Settled,
					com.tools20022.repository.msg.ProprietaryStatusAndReason3.ProprietaryReason, com.tools20022.repository.msg.PaymentStatus2.Reason, com.tools20022.repository.choice.TransferStatus1Choice.Unmatched,
					com.tools20022.repository.choice.TransferStatus1Choice.InRepair, com.tools20022.repository.choice.TransferStatus1Choice.FailedSettlement, com.tools20022.repository.choice.TransferStatus1Choice.CancellationPending,
					com.tools20022.repository.msg.PaymentTransaction50.ReturnReasonInformation, com.tools20022.repository.msg.MandateAmendment4.AmendmentReason,
					com.tools20022.repository.msg.OriginalPaymentInstruction12.StatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction11.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction52.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction51.ReversalReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction13.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction57.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction56.ReversalReasonInformation, com.tools20022.repository.choice.ReportItemStatus1Choice.AcceptedWithException,
					com.tools20022.repository.msg.OriginalPaymentInstruction14.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction59.StatusReasonInformation,
					com.tools20022.repository.msg.CurrencyControlPackageStatus1.StatusReason, com.tools20022.repository.msg.ValidationStatusReason1.Reason, com.tools20022.repository.msg.CurrencyControlRecordStatus1.StatusReason,
					com.tools20022.repository.msg.ProprietaryStatusAndReason6.ProprietaryReason, com.tools20022.repository.choice.DeliveryReturn3Choice.Code, com.tools20022.repository.choice.DeliveryReturn3Choice.Proprietary,
					com.tools20022.repository.msg.OriginalPaymentInstruction16.ReversalReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction18.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction65.ReturnReasonInformation, com.tools20022.repository.msg.PaymentTransaction63.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction60.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction68.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction15.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction64.ReversalReasonInformation, com.tools20022.repository.msg.Blocked2.Reason,
					com.tools20022.repository.choice.TransferStatus2Choice.Unmatched, com.tools20022.repository.choice.TransferStatus2Choice.InRepair, com.tools20022.repository.choice.TransferStatus2Choice.FailedSettlement,
					com.tools20022.repository.choice.TransferStatus2Choice.CancellationPending, com.tools20022.repository.choice.Status21Choice.Pending, com.tools20022.repository.msg.OriginalPaymentInstruction19.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction69.StatusReasonInformation, com.tools20022.repository.msg.ProprietaryStatusAndReason7.ProprietaryReason, com.tools20022.repository.choice.DeliveryReturn4Choice.Code,
					com.tools20022.repository.choice.DeliveryReturn4Choice.Proprietary, com.tools20022.repository.msg.AccountManagementStatusAndReason5.StatusReason, com.tools20022.repository.choice.OrderStatus5Choice.Cancelled,
					com.tools20022.repository.choice.OrderStatus5Choice.InRepair, com.tools20022.repository.msg.AccountStatus2.Enabled, com.tools20022.repository.msg.AccountStatus2.Disabled,
					com.tools20022.repository.msg.AccountStatus2.Pending, com.tools20022.repository.msg.AccountStatus2.PendingOpening, com.tools20022.repository.msg.AccountStatus2.Proforma,
					com.tools20022.repository.msg.AccountStatus2.Closed, com.tools20022.repository.msg.AccountStatus2.ClosurePending, com.tools20022.repository.msg.OtherAccountStatus1.Reason,
					com.tools20022.repository.choice.OrderStatus3Choice.Cancelled, com.tools20022.repository.choice.OrderStatus4Choice.Cancelled, com.tools20022.repository.choice.OrderStatus4Choice.InRepair,
					com.tools20022.repository.msg.PaymentTransaction80.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader7.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction81.ReversalReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction23.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalReasonInformation, com.tools20022.repository.msg.MandateAmendment5.AmendmentReason,
					com.tools20022.repository.msg.OriginalPaymentInstruction24.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation28.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction76.ReturnReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction20.CancellationReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction83.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction77.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction82.StatusReasonInformation, com.tools20022.repository.msg.MandateSuspensionReason1.Reason);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which the status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#StatusValueTime
	 * PaymentInstructionReference2Details.StatusValueTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#PaymentInstructionStatusDateTime
	 * InstructionStatusSearch2.PaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#PaymentInstructionStatusDateTime
	 * InstructionStatusSearch3.PaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails1#PaymentInstructionStatusDateTime
	 * PaymentStatusDetails1.PaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3#PaymentInstructionStatusDateTime
	 * PaymentStatusDetails3.PaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4#PaymentInstructionStatusDateTime
	 * PaymentStatusDetails4.PaymentInstructionStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#DateTime
	 * PaymentStatus1.DateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#StatusDate
	 * StatusTrail2.StatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#StatusDate
	 * StatusTrail3.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#CurrentStatusTime
	 * TradeData1.CurrentStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#PreviousStatusTime
	 * TradeData1.PreviousStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData10#CurrentStatusDateTime
	 * TradeData10.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#CurrentStatusDateTime
	 * TradeData8.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#CurrentStatusDateTime
	 * TradeData9.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#CurrentStatusTime
	 * TradeData2.CurrentStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#PreviousStatusTime
	 * TradeData2.PreviousStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#CurrentStatusDateTime
	 * TradeData7.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#PreviousStatusDateTime
	 * TradeData7.PreviousStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#DateTime
	 * CaseStatus.DateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#DateTime
	 * CaseStatus2.DateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#StatusTime
	 * TradeStatus1.StatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus2#ChangeDateTime
	 * TransactionStatus2.ChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus5#ChangeDateTime
	 * TransactionStatus5.ChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#StatusDate
	 * IntraBalanceCancellation2.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#StatusDate
	 * IntraBalanceMovement2.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#StatusDate
	 * IntraBalanceModification2.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#StatusDate
	 * IntraPositionModification2.StatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#DateTime
	 * PaymentStatus2.DateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#CurrentStatusDateTime
	 * TradeData11.CurrentStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#StatusDate
	 * StatusTrail4.StatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#StatusDate
	 * StatusTrail5.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#StatusDateTime
	 * CurrencyControlGroupStatus1.StatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#StatusDateTime
	 * CurrencyControlPackageStatus1.StatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#ClosureDate
	 * RegisteredContractJournal1.ClosureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#StatusDateTime
	 * CurrencyControlRecordStatus1.StatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#StatusDate
	 * StatusTrail6.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#StatusDate
	 * InvestmentAccount50.StatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#StatusDate
	 * StatusTrail7.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#StatusDate
	 * InvestmentAccount62.StatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#CurrentStatusDateTime
	 * TradeData14.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#CurrentStatusDateTime
	 * TradeData12.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#CurrentStatusDateTime
	 * TradeData15.CurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#PreviousStatusDateTime
	 * TradeData15.PreviousStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#CurrentStatusDateTime
	 * TradeData16.CurrentStatusDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StatusDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.StatusValueTime, com.tools20022.repository.msg.InstructionStatusSearch2.PaymentInstructionStatusDateTime,
					com.tools20022.repository.msg.InstructionStatusSearch3.PaymentInstructionStatusDateTime, com.tools20022.repository.msg.PaymentStatusDetails1.PaymentInstructionStatusDateTime,
					com.tools20022.repository.msg.PaymentStatusDetails3.PaymentInstructionStatusDateTime, com.tools20022.repository.msg.PaymentStatusDetails4.PaymentInstructionStatusDateTime,
					com.tools20022.repository.msg.PaymentStatus1.DateTime, com.tools20022.repository.msg.StatusTrail2.StatusDate, com.tools20022.repository.msg.StatusTrail3.StatusDate,
					com.tools20022.repository.msg.TradeData1.CurrentStatusTime, com.tools20022.repository.msg.TradeData1.PreviousStatusTime, com.tools20022.repository.msg.TradeData10.CurrentStatusDateTime,
					com.tools20022.repository.msg.TradeData8.CurrentStatusDateTime, com.tools20022.repository.msg.TradeData9.CurrentStatusDateTime, com.tools20022.repository.msg.TradeData2.CurrentStatusTime,
					com.tools20022.repository.msg.TradeData2.PreviousStatusTime, com.tools20022.repository.msg.TradeData7.CurrentStatusDateTime, com.tools20022.repository.msg.TradeData7.PreviousStatusDateTime,
					com.tools20022.repository.msg.CaseStatus.DateTime, com.tools20022.repository.msg.CaseStatus2.DateTime, com.tools20022.repository.msg.TradeStatus1.StatusTime,
					com.tools20022.repository.msg.TransactionStatus2.ChangeDateTime, com.tools20022.repository.msg.TransactionStatus5.ChangeDateTime, com.tools20022.repository.msg.IntraBalanceCancellation2.StatusDate,
					com.tools20022.repository.msg.IntraBalanceMovement2.StatusDate, com.tools20022.repository.msg.IntraBalanceModification2.StatusDate, com.tools20022.repository.msg.IntraPositionModification2.StatusDate,
					com.tools20022.repository.msg.PaymentStatus2.DateTime, com.tools20022.repository.msg.TradeData11.CurrentStatusDateTime, com.tools20022.repository.msg.StatusTrail4.StatusDate,
					com.tools20022.repository.msg.StatusTrail5.StatusDate, com.tools20022.repository.msg.CurrencyControlGroupStatus1.StatusDateTime, com.tools20022.repository.msg.CurrencyControlPackageStatus1.StatusDateTime,
					com.tools20022.repository.msg.RegisteredContractJournal1.ClosureDate, com.tools20022.repository.msg.CurrencyControlRecordStatus1.StatusDateTime, com.tools20022.repository.msg.StatusTrail6.StatusDate,
					com.tools20022.repository.msg.InvestmentAccount50.StatusDate, com.tools20022.repository.msg.StatusTrail7.StatusDate, com.tools20022.repository.msg.InvestmentAccount62.StatusDate,
					com.tools20022.repository.msg.TradeData14.CurrentStatusDateTime, com.tools20022.repository.msg.TradeData12.CurrentStatusDateTime, com.tools20022.repository.msg.TradeData15.CurrentStatusDateTime,
					com.tools20022.repository.msg.TradeData15.PreviousStatusDateTime, com.tools20022.repository.msg.TradeData16.CurrentStatusDateTime);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period of time during which the status is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#Status
	 * DateTimePeriod.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatusDetails1#ValidityTime
	 * SystemStatusDetails1.ValidityTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1#ValidityTime
	 * SystemStatus1.ValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1#DatePeriod
	 * IntraPositionQueryStatus1.DatePeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus2#ValidityTime
	 * SystemStatus2.ValidityTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time during which the status is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityTime = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemStatusDetails1.ValidityTime, com.tools20022.repository.msg.SystemStatus1.ValidityTime,
					com.tools20022.repository.msg.IntraPositionQueryStatus1.DatePeriod, com.tools20022.repository.msg.SystemStatus2.ValidityTime);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#AdditionalInformation
	 * StatusReasonInformation9.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3#AdditionalInformation
	 * UndertakingTermination3.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRight1#AdditionalInformation
	 * CancellationRight1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1#AdditionalInformation
	 * CancellationProcessingStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#AdditionalInformation
	 * CorporateActionInstructionProcessingStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#AdditionalInformation
	 * CorporateActionInstructionRejectionStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1#AdditionalInformation
	 * CorporateActionCancellationProcessingStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1#AdditionalInformation
	 * CorporateActionCancellationRejectionStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1#AdditionalInformation
	 * CorporateActionAmendmentProcessingStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#AdditionalInformation
	 * CorporateActionAmendmentRejectionStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1#AdditionalInformation
	 * CorporateActionMovementProcessingStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#AdditionalInformation
	 * CorporateActionMovementRejectionStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2#AdditionalInformation
	 * CorporationActionMovementProcessingStatus2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#AdditionalInformation
	 * CorporateActionMovementRejectionStatus2.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1#AdditionalInformation
	 * CorporateActionInformationProcessingStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1#AdditionalInformation
	 * CorporateActionInformationRejectedStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1#AdditionalInformation
	 * CorporateActionStandingInstructionProcessingStatus1.AdditionalInformation
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#AdditionalInformation
	 * CorporateActionStandingInstructionRejectionStatus1.AdditionalInformation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1#AdditionalInformation
	 * CorporateActionStandingInstructionCancellationProcessingStatus1.
	 * AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1#AdditionalInformation
	 * CorporateActionStandingInstructionCancellationRejectionStatus1.
	 * AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1#AdditionalInformation
	 * CorporateActionDeactivationInstructionProcessingStatus1.
	 * AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#AdditionalInformation
	 * CorporateActionDeactivationInstructionRejectionStatus1.
	 * AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1#AdditionalInformation
	 * CorporateActionDeactivationCancellationProcessingStatus1.
	 * AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#AdditionalInformation
	 * CorporateActionDeactivationCancellationRejectionStatus1.
	 * AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1#AdditionalStatusReasonInformation
	 * CancellationStatusInformation1.AdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#AdditionalInformation
	 * CollateralCancellationStatus1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#Description
	 * GenericValidationRuleIdentification1.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#Status
	 * CurrencyControlGroupStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#ValidationRule
	 * ValidationStatusReason1.ValidationRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#AdditionalInformation
	 * ValidationStatusReason1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#Status
	 * CurrencyControlRecordStatus1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StatusDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.AdditionalInformation, com.tools20022.repository.msg.UndertakingTermination3.AdditionalInformation,
					com.tools20022.repository.msg.CancellationRight1.AdditionalInformation, com.tools20022.repository.msg.CancellationProcessingStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2.AdditionalInformation, com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1.AdditionalInformation, com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1.AdditionalInformation,
					com.tools20022.repository.msg.CancellationStatusInformation1.AdditionalStatusReasonInformation, com.tools20022.repository.msg.CollateralCancellationStatus1.AdditionalInformation,
					com.tools20022.repository.msg.GenericValidationRuleIdentification1.Description, com.tools20022.repository.msg.CurrencyControlGroupStatus1.Status, com.tools20022.repository.msg.ValidationStatusReason1.ValidationRule,
					com.tools20022.repository.msg.ValidationStatusReason1.AdditionalInformation, com.tools20022.repository.msg.CurrencyControlRecordStatus1.Status);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Status of the processing of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.StatusCode
	 * StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#ProcessingStatus
	 * MeetingInstructionGlobalStatus.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#ProcessingStatus
	 * MeetingInstructionStatusDetails.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus1#Status
	 * InstructionProcessingStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus2Choice#ProcessingStatus
	 * InstructionStatus2Choice.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#InstructionStatus
	 * DetailedInstructionStatus1.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice#ProcessingStatus
	 * InstructionStatus4Choice.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#InstructionStatus
	 * DetailedInstructionStatus8.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#GlobalInstructionStatus
	 * InstructionStatus3Choice.GlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#DetailedInstructionStatus
	 * InstructionStatus3Choice.DetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#InstructionStatus
	 * InstructionTypeStatus1Choice.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#Status
	 * TradeTransactionStatusAndReason1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#Status
	 * TradeTransactionStatusAndReason2.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#CollateralStatusCode
	 * CollateralCancellationStatus1.CollateralStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#ResponseType
	 * CollateralProposalResponseType1.ResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#ResponseType
	 * SubstitutionResponse1.ResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#ResponseType
	 * InterestResponse1.ResponseType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#Status
	 * TradeLeg2.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#Status
	 * TradeLeg5.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1#Status
	 * CollateralStatusReason1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountLinkStatus1#Status
	 * AccountLinkStatus1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#Status
	 * TradeLeg8.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#InstructionStatus
	 * InstructionTypeStatus2Choice.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#GlobalInstructionStatus
	 * InstructionStatus5Choice.GlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#DetailedInstructionStatus
	 * InstructionStatus5Choice.DetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#ProcessingStatus
	 * InstructionStatus6Choice.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#InstructionStatus
	 * DetailedInstructionStatus11.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus3#Status
	 * InstructionProcessingStatus3.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#Status
	 * CurrencyControlPackageStatus1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the processing of an instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionGlobalStatus.ProcessingStatus, com.tools20022.repository.msg.MeetingInstructionStatusDetails.ProcessingStatus,
					com.tools20022.repository.msg.InstructionProcessingStatus1.Status, com.tools20022.repository.choice.InstructionStatus2Choice.ProcessingStatus, com.tools20022.repository.msg.DetailedInstructionStatus1.InstructionStatus,
					com.tools20022.repository.choice.InstructionStatus4Choice.ProcessingStatus, com.tools20022.repository.msg.DetailedInstructionStatus8.InstructionStatus,
					com.tools20022.repository.choice.InstructionStatus3Choice.GlobalInstructionStatus, com.tools20022.repository.choice.InstructionStatus3Choice.DetailedInstructionStatus,
					com.tools20022.repository.choice.InstructionTypeStatus1Choice.InstructionStatus, com.tools20022.repository.msg.TradeTransactionStatusAndReason1.Status,
					com.tools20022.repository.msg.TradeTransactionStatusAndReason2.Status, com.tools20022.repository.msg.CollateralCancellationStatus1.CollateralStatusCode,
					com.tools20022.repository.msg.CollateralProposalResponseType1.ResponseType, com.tools20022.repository.msg.SubstitutionResponse1.ResponseType, com.tools20022.repository.msg.InterestResponse1.ResponseType,
					com.tools20022.repository.msg.TradeLeg2.Status, com.tools20022.repository.msg.TradeLeg5.Status, com.tools20022.repository.msg.CollateralStatusReason1.Status, com.tools20022.repository.msg.AccountLinkStatus1.Status,
					com.tools20022.repository.msg.TradeLeg8.Status, com.tools20022.repository.choice.InstructionTypeStatus2Choice.InstructionStatus, com.tools20022.repository.choice.InstructionStatus5Choice.GlobalInstructionStatus,
					com.tools20022.repository.choice.InstructionStatus5Choice.DetailedInstructionStatus, com.tools20022.repository.choice.InstructionStatus6Choice.ProcessingStatus,
					com.tools20022.repository.msg.DetailedInstructionStatus11.InstructionStatus, com.tools20022.repository.msg.InstructionProcessingStatus3.Status, com.tools20022.repository.msg.CurrencyControlPackageStatus1.Status);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of assigning a status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#Status
	 * InvestigationPartyRole.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole
	 * InvestigationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of assigning a status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestigationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#SettlementStatus
	 * StatusTrail2.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#SettlementStatus
	 * StatusTrail3.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#SettlementStatus
	 * StatusAndReason3.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#SettlementStatus
	 * StatusAndReason6.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#SettlementStatus
	 * StatusAndReason12.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#SettlementStatus
	 * StatusAndReason14.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#SettlementStatus
	 * Status2Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#SettlementStatus
	 * Status4Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#SettlementStatus
	 * Status9Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#SettlementStatus
	 * Status11Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice#Code
	 * SettlementStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice#Proprietary
	 * SettlementStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#SettlementStatus
	 * Status1Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice#Code
	 * SettlementStatus5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice#Proprietary
	 * SettlementStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#SettlementStatus
	 * Status8Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice#Code
	 * SettlementStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice#Proprietary
	 * SettlementStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#SettlementStatus
	 * Status3Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice#Code
	 * SettlementStatus6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice#Proprietary
	 * SettlementStatus6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#SettlementStatus
	 * Status10Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1#SettlementStatus
	 * PendingStatusAndReason1.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#SettlementStatus
	 * IntraBalanceStatusAndReason1.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#SettlementStatus
	 * IntraPositionStatusType1.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#SettlementStatus
	 * IntraBalanceStatusType1.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#SettlementStatus
	 * Status15Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#SettlementStatus
	 * StatusAndReason19.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#SettlementStatus
	 * StatusAndReason20.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#SettlementStatus
	 * Status16Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#SettlementStatus
	 * StatusTrail4.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#SettlementStatus
	 * StatusTrail5.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#SettlementStatus
	 * StatusAndReason28.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#SettlementStatus
	 * StatusTrail6.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#SettlementStatus
	 * Status18Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#SettlementStatus
	 * Status19Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#Code
	 * SettlementStatus19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#Proprietary
	 * SettlementStatus19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#SettlementStatus
	 * StatusAndReason29.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#SettlementStatus
	 * StatusTrail7.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#SettlementStatus
	 * Status22Choice.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice#Code
	 * SettlementStatus25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice#Proprietary
	 * SettlementStatus25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#SettlementStatus
	 * Status23Choice.SettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusTrail2.SettlementStatus, com.tools20022.repository.msg.StatusTrail3.SettlementStatus, com.tools20022.repository.msg.StatusAndReason3.SettlementStatus,
					com.tools20022.repository.msg.StatusAndReason6.SettlementStatus, com.tools20022.repository.msg.StatusAndReason12.SettlementStatus, com.tools20022.repository.msg.StatusAndReason14.SettlementStatus,
					com.tools20022.repository.choice.Status2Choice.SettlementStatus, com.tools20022.repository.choice.Status4Choice.SettlementStatus, com.tools20022.repository.choice.Status9Choice.SettlementStatus,
					com.tools20022.repository.choice.Status11Choice.SettlementStatus, com.tools20022.repository.choice.SettlementStatus1Choice.Code, com.tools20022.repository.choice.SettlementStatus1Choice.Proprietary,
					com.tools20022.repository.choice.Status1Choice.SettlementStatus, com.tools20022.repository.choice.SettlementStatus5Choice.Code, com.tools20022.repository.choice.SettlementStatus5Choice.Proprietary,
					com.tools20022.repository.choice.Status8Choice.SettlementStatus, com.tools20022.repository.choice.SettlementStatus3Choice.Code, com.tools20022.repository.choice.SettlementStatus3Choice.Proprietary,
					com.tools20022.repository.choice.Status3Choice.SettlementStatus, com.tools20022.repository.choice.SettlementStatus6Choice.Code, com.tools20022.repository.choice.SettlementStatus6Choice.Proprietary,
					com.tools20022.repository.choice.Status10Choice.SettlementStatus, com.tools20022.repository.msg.PendingStatusAndReason1.SettlementStatus, com.tools20022.repository.msg.IntraBalanceStatusAndReason1.SettlementStatus,
					com.tools20022.repository.msg.IntraPositionStatusType1.SettlementStatus, com.tools20022.repository.msg.IntraBalanceStatusType1.SettlementStatus, com.tools20022.repository.choice.Status15Choice.SettlementStatus,
					com.tools20022.repository.msg.StatusAndReason19.SettlementStatus, com.tools20022.repository.msg.StatusAndReason20.SettlementStatus, com.tools20022.repository.choice.Status16Choice.SettlementStatus,
					com.tools20022.repository.msg.StatusTrail4.SettlementStatus, com.tools20022.repository.msg.StatusTrail5.SettlementStatus, com.tools20022.repository.msg.StatusAndReason28.SettlementStatus,
					com.tools20022.repository.msg.StatusTrail6.SettlementStatus, com.tools20022.repository.choice.Status18Choice.SettlementStatus, com.tools20022.repository.choice.Status19Choice.SettlementStatus,
					com.tools20022.repository.choice.SettlementStatus19Choice.Code, com.tools20022.repository.choice.SettlementStatus19Choice.Proprietary, com.tools20022.repository.msg.StatusAndReason29.SettlementStatus,
					com.tools20022.repository.msg.StatusTrail7.SettlementStatus, com.tools20022.repository.choice.Status22Choice.SettlementStatus, com.tools20022.repository.choice.SettlementStatus25Choice.Code,
					com.tools20022.repository.choice.SettlementStatus25Choice.Proprietary, com.tools20022.repository.choice.Status23Choice.SettlementStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice#Code
	 * CancellationProcessingStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice#Proprietary
	 * CancellationProcessingStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#CancellationProcessingStatus
	 * Status1Choice.CancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#CancellationProcessingStatus
	 * Status8Choice.CancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice#Code
	 * CancellationProcessingStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice#Proprietary
	 * CancellationProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#CancellationProcessingStatus
	 * Status3Choice.CancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#CancellationProcessingStatus
	 * Status10Choice.CancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice#Code
	 * CancellationProcessingStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice#Proprietary
	 * CancellationProcessingStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#CancellationProcessingStatus
	 * Status19Choice.CancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#Code
	 * CancellationProcessingStatus7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#Proprietary
	 * CancellationProcessingStatus7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice#Code
	 * CancellationProcessingStatus8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice#Proprietary
	 * CancellationProcessingStatus8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#CancellationProcessingStatus
	 * Status22Choice.CancellationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a cancellation request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationProcessingStatus1Choice.Code, com.tools20022.repository.choice.CancellationProcessingStatus1Choice.Proprietary,
					com.tools20022.repository.choice.Status1Choice.CancellationProcessingStatus, com.tools20022.repository.choice.Status8Choice.CancellationProcessingStatus,
					com.tools20022.repository.choice.CancellationProcessingStatus2Choice.Code, com.tools20022.repository.choice.CancellationProcessingStatus2Choice.Proprietary,
					com.tools20022.repository.choice.Status3Choice.CancellationProcessingStatus, com.tools20022.repository.choice.Status10Choice.CancellationProcessingStatus,
					com.tools20022.repository.choice.CancellationProcessingStatus3Choice.Code, com.tools20022.repository.choice.CancellationProcessingStatus3Choice.Proprietary,
					com.tools20022.repository.choice.Status19Choice.CancellationProcessingStatus, com.tools20022.repository.choice.CancellationProcessingStatus7Choice.Code,
					com.tools20022.repository.choice.CancellationProcessingStatus7Choice.Proprietary, com.tools20022.repository.choice.CancellationProcessingStatus8Choice.Code,
					com.tools20022.repository.choice.CancellationProcessingStatus8Choice.Proprietary, com.tools20022.repository.choice.Status22Choice.CancellationProcessingStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of processing of a transaction at account servicer level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#InstructionProcessingStatus
	 * Status2Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#InstructionProcessingStatus
	 * Status4Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#InstructionProcessingStatus
	 * Status9Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#InstructionProcessingStatus
	 * Status11Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice#Code
	 * InstructionProcessingStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice#Proprietary
	 * InstructionProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Accepted
	 * ReplacementProcessingStatus7Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Completed
	 * ReplacementProcessingStatus7Choice.Completed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Denied
	 * ReplacementProcessingStatus7Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#InRepair
	 * ReplacementProcessingStatus7Choice.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#PartialReplacementAccepted
	 * ReplacementProcessingStatus7Choice.PartialReplacementAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Pending
	 * ReplacementProcessingStatus7Choice.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ReceivedAtIntermediary
	 * ReplacementProcessingStatus7Choice.ReceivedAtIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ReceivedAtStockExchange
	 * ReplacementProcessingStatus7Choice.ReceivedAtStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Rejected
	 * ReplacementProcessingStatus7Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ModificationRequested
	 * ReplacementProcessingStatus7Choice.ModificationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ProprietaryStatus
	 * ReplacementProcessingStatus7Choice.ProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice#GlobalInstructionStatus
	 * InstructionStatus1Choice.GlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice#DetailedInstructionStatus
	 * InstructionStatus1Choice.DetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#InstructionProcessingStatus
	 * Status1Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#RegistrationProcessingStatus
	 * Status1Choice.RegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#ReplacementProcessingStatus
	 * Status1Choice.ReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#InstructionProcessingStatus
	 * Status8Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#RegistrationProcessingStatus
	 * Status8Choice.RegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#ReplacementProcessingStatus
	 * Status8Choice.ReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice#Code
	 * InstructionProcessingStatus5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice#Proprietary
	 * InstructionProcessingStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#InstructionProcessingStatus
	 * Status3Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#RegistrationProcessingStatus
	 * Status3Choice.RegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#ReplacementProcessingStatus
	 * Status3Choice.ReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#InstructionProcessingStatus
	 * Status10Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#RegistrationProcessingStatus
	 * Status10Choice.RegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#ReplacementProcessingStatus
	 * Status10Choice.ReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1#ProcessingStatus
	 * PendingStatusAndReason1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#ProcessingStatus
	 * IntraBalanceStatusAndReason1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice#Code
	 * ProcessingStatus33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice#Proprietary
	 * ProcessingStatus33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#ProcessingStatus
	 * IntraPositionStatusType1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#ProcessingStatus
	 * IntraBalanceStatusType1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice#Code
	 * ProcessingStatus30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice#Proprietary
	 * ProcessingStatus30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#InstructionProcessingStatus
	 * Status15Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#ProcessingStatus
	 * AdditionalInformation9.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#ProcessingStatus
	 * AdditionalInformation10.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#InstructionProcessingStatus
	 * Status16Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#Rejected
	 * ReportItemStatus1Choice.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#ProcessingStatus
	 * AdditionalInformation11.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#InstructionProcessingStatus
	 * Status18Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#Code
	 * InstructionProcessingStatus23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#Proprietary
	 * InstructionProcessingStatus23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#InstructionProcessingStatus
	 * Status19Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#RegistrationProcessingStatus
	 * Status19Choice.RegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#ReplacementProcessingStatus
	 * Status19Choice.ReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#ProcessingStatus
	 * AdditionalInformation12.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#InstructionProcessingStatus
	 * Status22Choice.InstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#RegistrationProcessingStatus
	 * Status22Choice.RegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#ReplacementProcessingStatus
	 * Status22Choice.ReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice#Code
	 * InstructionProcessingStatus26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice#Proprietary
	 * InstructionProcessingStatus26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#InstructionProcessingStatus
	 * Status23Choice.InstructionProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of processing of a transaction at account servicer level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status2Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status4Choice.InstructionProcessingStatus,
					com.tools20022.repository.choice.Status9Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status11Choice.InstructionProcessingStatus,
					com.tools20022.repository.choice.InstructionProcessingStatus2Choice.Code, com.tools20022.repository.choice.InstructionProcessingStatus2Choice.Proprietary,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Accepted, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Completed,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Denied, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.InRepair,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.PartialReplacementAccepted, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Pending,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ReceivedAtIntermediary, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ReceivedAtStockExchange,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Rejected, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ModificationRequested,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionStatus1Choice.GlobalInstructionStatus,
					com.tools20022.repository.choice.InstructionStatus1Choice.DetailedInstructionStatus, com.tools20022.repository.choice.Status1Choice.InstructionProcessingStatus,
					com.tools20022.repository.choice.Status1Choice.RegistrationProcessingStatus, com.tools20022.repository.choice.Status1Choice.ReplacementProcessingStatus,
					com.tools20022.repository.choice.Status8Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status8Choice.RegistrationProcessingStatus,
					com.tools20022.repository.choice.Status8Choice.ReplacementProcessingStatus, com.tools20022.repository.choice.InstructionProcessingStatus5Choice.Code,
					com.tools20022.repository.choice.InstructionProcessingStatus5Choice.Proprietary, com.tools20022.repository.choice.Status3Choice.InstructionProcessingStatus,
					com.tools20022.repository.choice.Status3Choice.RegistrationProcessingStatus, com.tools20022.repository.choice.Status3Choice.ReplacementProcessingStatus,
					com.tools20022.repository.choice.Status10Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status10Choice.RegistrationProcessingStatus,
					com.tools20022.repository.choice.Status10Choice.ReplacementProcessingStatus, com.tools20022.repository.msg.PendingStatusAndReason1.ProcessingStatus,
					com.tools20022.repository.msg.IntraBalanceStatusAndReason1.ProcessingStatus, com.tools20022.repository.choice.ProcessingStatus33Choice.Code, com.tools20022.repository.choice.ProcessingStatus33Choice.Proprietary,
					com.tools20022.repository.msg.IntraPositionStatusType1.ProcessingStatus, com.tools20022.repository.msg.IntraBalanceStatusType1.ProcessingStatus, com.tools20022.repository.choice.ProcessingStatus30Choice.Code,
					com.tools20022.repository.choice.ProcessingStatus30Choice.Proprietary, com.tools20022.repository.choice.Status15Choice.InstructionProcessingStatus, com.tools20022.repository.msg.AdditionalInformation9.ProcessingStatus,
					com.tools20022.repository.msg.AdditionalInformation10.ProcessingStatus, com.tools20022.repository.choice.Status16Choice.InstructionProcessingStatus, com.tools20022.repository.choice.ReportItemStatus1Choice.Rejected,
					com.tools20022.repository.msg.AdditionalInformation11.ProcessingStatus, com.tools20022.repository.choice.Status18Choice.InstructionProcessingStatus,
					com.tools20022.repository.choice.InstructionProcessingStatus23Choice.Code, com.tools20022.repository.choice.InstructionProcessingStatus23Choice.Proprietary,
					com.tools20022.repository.choice.Status19Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status19Choice.RegistrationProcessingStatus,
					com.tools20022.repository.choice.Status19Choice.ReplacementProcessingStatus, com.tools20022.repository.msg.AdditionalInformation12.ProcessingStatus,
					com.tools20022.repository.choice.Status22Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status22Choice.RegistrationProcessingStatus,
					com.tools20022.repository.choice.Status22Choice.ReplacementProcessingStatus, com.tools20022.repository.choice.InstructionProcessingStatus26Choice.Code,
					com.tools20022.repository.choice.InstructionProcessingStatus26Choice.Proprietary, com.tools20022.repository.choice.Status23Choice.InstructionProcessingStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of a modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice#Code
	 * ModificationProcessingStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice#Proprietary
	 * ModificationProcessingStatus1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a modification request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ModificationProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ModificationProcessingStatus1Choice.Code, com.tools20022.repository.choice.ModificationProcessingStatus1Choice.Proprietary);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.Status, com.tools20022.repository.entity.StatusReason.Status, com.tools20022.repository.entity.InvestigationPartyRole.Status);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProprietaryStatusAndReason1.ProprietaryStatus, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.Proprietary,
						com.tools20022.repository.msg.StatusTrail2.ProcessingStatus, com.tools20022.repository.msg.StatusTrail2.ModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail2.CancellationStatus,
						com.tools20022.repository.msg.StatusTrail2.Settled, com.tools20022.repository.msg.ProprietaryStatusAndReason2.ProprietaryStatus, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.Proprietary,
						com.tools20022.repository.msg.StatusTrail3.ProcessingStatus, com.tools20022.repository.msg.StatusTrail3.ModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail3.CancellationStatus,
						com.tools20022.repository.msg.StatusTrail3.Settled, com.tools20022.repository.msg.StatusAndReason12.ProcessingStatus, com.tools20022.repository.msg.StatusAndReason14.ProcessingStatus,
						com.tools20022.repository.msg.StatusAndReason1.StatusAndReason, com.tools20022.repository.msg.StatusAndReason2.StatusAndReason, com.tools20022.repository.msg.StatusAndReason4.StatusAndReason,
						com.tools20022.repository.msg.StatusAndReason5.StatusAndReason, com.tools20022.repository.msg.StatusAndReason7.StatusAndReason, com.tools20022.repository.msg.StatusAndReason8.StatusAndReason,
						com.tools20022.repository.choice.Status9Choice.Proprietary, com.tools20022.repository.msg.StatusAndReason9.StatusAndReason, com.tools20022.repository.choice.Status11Choice.Proprietary,
						com.tools20022.repository.msg.StatusAndReason13.StatusAndReason, com.tools20022.repository.msg.StatusAndReason16.StatusAndReason, com.tools20022.repository.msg.StatusAndReason17.StatusAndReason,
						com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1.Status, com.tools20022.repository.choice.ResponseStatus3Choice.Rejected, com.tools20022.repository.choice.ResponseStatus3Choice.Pending,
						com.tools20022.repository.choice.ResponseStatus4Choice.Rejected, com.tools20022.repository.choice.ResponseStatus4Choice.Pending, com.tools20022.repository.choice.StatusOrStatement5Choice.StatusAdvice,
						com.tools20022.repository.choice.StatusOrStatement6Choice.StatusAdvice, com.tools20022.repository.msg.IntraBalanceQueryStatus1.Type, com.tools20022.repository.msg.ProprietaryStatusAndReason3.ProprietaryStatus,
						com.tools20022.repository.msg.StatusAndReason18.StatusAndReason, com.tools20022.repository.choice.Status15Choice.Proprietary, com.tools20022.repository.msg.StatusAndReason19.ProcessingStatus,
						com.tools20022.repository.msg.StatusAndReason20.ProcessingStatus, com.tools20022.repository.msg.StatusAndReason21.StatusAndReason, com.tools20022.repository.choice.Status16Choice.Proprietary,
						com.tools20022.repository.msg.StatusAndReason25.StatusAndReason, com.tools20022.repository.msg.StatusTrail4.ProcessingStatus, com.tools20022.repository.msg.StatusTrail4.ModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail4.CancellationStatus, com.tools20022.repository.msg.StatusTrail4.Settled, com.tools20022.repository.choice.ModificationProcessingStatus4Choice.Proprietary,
						com.tools20022.repository.choice.ModificationProcessingStatus6Choice.Proprietary, com.tools20022.repository.msg.StatusAndReason26.StatusAndReason, com.tools20022.repository.msg.StatusTrail5.ProcessingStatus,
						com.tools20022.repository.msg.StatusTrail5.ModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail5.CancellationStatus, com.tools20022.repository.msg.StatusTrail5.Settled,
						com.tools20022.repository.choice.ModificationProcessingStatus5Choice.Proprietary, com.tools20022.repository.msg.GenericValidationRuleIdentification1.Identification,
						com.tools20022.repository.msg.StatusAndReason27.StatusAndReason, com.tools20022.repository.msg.CurrencyControlPackageStatus1.RecordStatus, com.tools20022.repository.choice.ResponseStatus6Choice.Rejected,
						com.tools20022.repository.choice.ResponseStatus6Choice.Pending, com.tools20022.repository.choice.StatusOrStatement7Choice.StatusAdvice, com.tools20022.repository.msg.StatusAndReason28.ProcessingStatus,
						com.tools20022.repository.msg.StatusTrail6.ProcessingStatus, com.tools20022.repository.msg.StatusTrail6.ModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail6.CancellationStatus,
						com.tools20022.repository.msg.StatusTrail6.Settled, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.Proprietary, com.tools20022.repository.msg.ProprietaryStatusAndReason6.ProprietaryStatus,
						com.tools20022.repository.choice.Status18Choice.Proprietary, com.tools20022.repository.msg.ProprietaryStatusAndReason7.ProprietaryStatus, com.tools20022.repository.msg.StatusAndReason30.StatusAndReason,
						com.tools20022.repository.choice.ResponseStatus8Choice.Rejected, com.tools20022.repository.choice.ResponseStatus8Choice.Pending, com.tools20022.repository.msg.StatusAndReason29.ProcessingStatus,
						com.tools20022.repository.choice.StatusOrStatement8Choice.StatusAdvice, com.tools20022.repository.msg.StatusTrail7.ProcessingStatus, com.tools20022.repository.msg.StatusTrail7.ModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail7.CancellationStatus, com.tools20022.repository.msg.StatusTrail7.Settled, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.Proprietary,
						com.tools20022.repository.choice.Status23Choice.Proprietary, com.tools20022.repository.msg.StatusAndReason32.StatusAndReason, com.tools20022.repository.msg.StatusAndReason33.StatusAndReason);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.StatusReason, com.tools20022.repository.entity.Status.StatusDateTime, com.tools20022.repository.entity.Status.ValidityTime,
						com.tools20022.repository.entity.Status.StatusDescription, com.tools20022.repository.entity.Status.InstructionProcessingStatus, com.tools20022.repository.entity.Status.PartyRole,
						com.tools20022.repository.entity.Status.SettlementStatus, com.tools20022.repository.entity.Status.CancellationProcessingStatus, com.tools20022.repository.entity.Status.TransactionProcessingStatus,
						com.tools20022.repository.entity.Status.ModificationProcessingStatus);
				derivationComponent_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmObject(), ModificationProcessingStatus2Choice.mmObject(), StatusTrail2.mmObject(), ProprietaryStatusAndReason2.mmObject(),
						ModificationProcessingStatus3Choice.mmObject(), StatusTrail3.mmObject(), DeliveryReturn1Choice.mmObject(), DeliveryReturn2Choice.mmObject(), MatchingDenied1Choice.mmObject(), MatchingDenied2Choice.mmObject(),
						StatusAndReason3.mmObject(), StatusAndReason6.mmObject(), StatusAndReason12.mmObject(), StatusAndReason14.mmObject(), Status2Choice.mmObject(), StatusAndReason1.mmObject(), StatusAndReason2.mmObject(),
						Status4Choice.mmObject(), StatusAndReason4.mmObject(), StatusAndReason5.mmObject(), StatusAndReason7.mmObject(), StatusAndReason8.mmObject(), Status9Choice.mmObject(), StatusAndReason9.mmObject(),
						Status11Choice.mmObject(), StatusAndReason13.mmObject(), StatusAndReason16.mmObject(), StatusAndReason17.mmObject(), StatusAndReason10.mmObject(), ReplacementProcessingStatus7Choice.mmObject(),
						PointOfInteractionComponent3.mmObject(), ReportStatusAndReason1.mmObject(), ReportStatusAndReason2.mmObject(), RegistrationProcessingStatus1Choice.mmObject(), ResponseStatus1Choice.mmObject(),
						ReplacementProcessingStatus1Choice.mmObject(), SettlementStatus1Choice.mmObject(), SettlementConditionModificationStatus1Choice.mmObject(), Status1Choice.mmObject(), Status8Choice.mmObject(),
						ResponseStatus3Choice.mmObject(), ResponseStatus4Choice.mmObject(), RegistrationProcessingStatus2Choice.mmObject(), ResponseStatus2Choice.mmObject(), ReplacementProcessingStatus2Choice.mmObject(),
						SettlementStatus3Choice.mmObject(), SettlementConditionModificationStatus2Choice.mmObject(), Status3Choice.mmObject(), Status10Choice.mmObject(), ModificationProcessingStatus1Choice.mmObject(),
						IntraBalanceStatusAndReason1.mmObject(), ProcessingStatus33Choice.mmObject(), IntraBalanceStatusType1.mmObject(), IntraBalanceQueryStatus1.mmObject(), ProprietaryStatusAndReason3.mmObject(),
						ProcessingStatus30Choice.mmObject(), AccountLinkStatus1.mmObject(), StatusAndReason18.mmObject(), StatusAndReason19.mmObject(), StatusAndReason20.mmObject(), StatusAndReason21.mmObject(),
						PointOfInteractionComponent4.mmObject(), ReportItemStatus1Choice.mmObject(), StatusAndReason25.mmObject(), StatusTrail4.mmObject(), ModificationProcessingStatus4Choice.mmObject(),
						ModificationProcessingStatus6Choice.mmObject(), StatusAndReason26.mmObject(), StatusTrail5.mmObject(), ModificationProcessingStatus5Choice.mmObject(), PointOfInteractionComponent5.mmObject(),
						GenericValidationRuleIdentification1.mmObject(), StatusAndReason27.mmObject(), CurrencyControlGroupStatus1.mmObject(), CurrencyControlPackageStatus1.mmObject(), ValidationStatusReason1.mmObject(),
						CurrencyControlRecordStatus1.mmObject(), ResponseStatus6Choice.mmObject(), StatusAndReason28.mmObject(), StatusTrail6.mmObject(), ModificationProcessingStatus7Choice.mmObject(), ResponseStatus5Choice.mmObject(),
						ReplacementProcessingStatus8Choice.mmObject(), ProprietaryStatusAndReason6.mmObject(), RegistrationProcessingStatus3Choice.mmObject(), DeliveryReturn3Choice.mmObject(), Status19Choice.mmObject(),
						SettlementConditionModificationStatus3Choice.mmObject(), MatchingDenied3Choice.mmObject(), ProprietaryStatusAndReason7.mmObject(), StatusAndReason30.mmObject(), ResponseStatus8Choice.mmObject(),
						StatusAndReason29.mmObject(), StatusTrail7.mmObject(), MatchingDenied4Choice.mmObject(), Status22Choice.mmObject(), RegistrationProcessingStatus4Choice.mmObject(), ResponseStatus7Choice.mmObject(),
						SettlementConditionModificationStatus4Choice.mmObject(), ReplacementProcessingStatus9Choice.mmObject(), DeliveryReturn4Choice.mmObject(), ModificationProcessingStatus8Choice.mmObject(),
						PointOfInteractionComponent6.mmObject(), StatusAndReason32.mmObject(), StatusAndReason33.mmObject(), PointOfInteractionComponent7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}