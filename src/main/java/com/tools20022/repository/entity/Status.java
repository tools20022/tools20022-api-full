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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
 * Status.mmStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmValidityTime
 * Status.mmValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
 * Status.mmStatusDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
 * Status.mmInstructionProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmPartyRole
 * Status.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
 * Status.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
 * Status.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
 * Status.mmTransactionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmModificationProcessingStatus
 * Status.mmModificationProcessingStatus}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
 * DateTimePeriod.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
 * InvestigationPartyRole.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryStatus
 * ProprietaryStatusAndReason1.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmProprietary
 * ModificationProcessingStatus2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmProcessingStatus
 * StatusTrail2.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmModificationProcessingStatus
 * StatusTrail2.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmCancellationStatus
 * StatusTrail2.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#mmSettled
 * StatusTrail2.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2#mmProprietaryStatus
 * ProprietaryStatusAndReason2.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmProprietary
 * ModificationProcessingStatus3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmProcessingStatus
 * StatusTrail3.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmModificationProcessingStatus
 * StatusTrail3.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmCancellationStatus
 * StatusTrail3.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#mmSettled
 * StatusTrail3.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#mmProcessingStatus
 * StatusAndReason12.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#mmProcessingStatus
 * StatusAndReason14.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason1#mmStatusAndReason
 * StatusAndReason1.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason2#mmStatusAndReason
 * StatusAndReason2.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason4#mmStatusAndReason
 * StatusAndReason4.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason5#mmStatusAndReason
 * StatusAndReason5.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason7#mmStatusAndReason
 * StatusAndReason7.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason8#mmStatusAndReason
 * StatusAndReason8.mmStatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status9Choice#mmProprietary
 * Status9Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason9#mmStatusAndReason
 * StatusAndReason9.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmProprietary
 * Status11Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason13#mmStatusAndReason
 * StatusAndReason13.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason16#mmStatusAndReason
 * StatusAndReason16.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason17#mmStatusAndReason
 * StatusAndReason17.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#mmStatus
 * CorporateActionInstructionProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#mmRejected
 * ResponseStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#mmPending
 * ResponseStatus3Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#mmRejected
 * ResponseStatus4Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#mmPending
 * ResponseStatus4Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement5Choice#mmStatusAdvice
 * StatusOrStatement5Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement6Choice#mmStatusAdvice
 * StatusOrStatement6Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus1#mmType
 * IntraBalanceQueryStatus1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3#mmProprietaryStatus
 * ProprietaryStatusAndReason3.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason18#mmStatusAndReason
 * StatusAndReason18.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmProprietary
 * Status15Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#mmProcessingStatus
 * StatusAndReason19.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#mmProcessingStatus
 * StatusAndReason20.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason21#mmStatusAndReason
 * StatusAndReason21.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmProprietary
 * Status16Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason25#mmStatusAndReason
 * StatusAndReason25.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmProcessingStatus
 * StatusTrail4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmModificationProcessingStatus
 * StatusTrail4.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmCancellationStatus
 * StatusTrail4.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmSettled
 * StatusTrail4.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmProprietary
 * ModificationProcessingStatus4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmProprietary
 * ModificationProcessingStatus6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason26#mmStatusAndReason
 * StatusAndReason26.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmProcessingStatus
 * StatusTrail5.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmModificationProcessingStatus
 * StatusTrail5.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmCancellationStatus
 * StatusTrail5.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmSettled
 * StatusTrail5.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmProprietary
 * ModificationProcessingStatus5Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#mmIdentification
 * GenericValidationRuleIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason27#mmStatusAndReason
 * StatusAndReason27.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmRecordStatus
 * CurrencyControlPackageStatus1.mmRecordStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmRejected
 * ResponseStatus6Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmPending
 * ResponseStatus6Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice#mmStatusAdvice
 * StatusOrStatement7Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmProcessingStatus
 * StatusAndReason28.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmProcessingStatus
 * StatusTrail6.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmModificationProcessingStatus
 * StatusTrail6.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmCancellationStatus
 * StatusTrail6.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettled
 * StatusTrail6.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmProprietary
 * ModificationProcessingStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryStatus
 * ProprietaryStatusAndReason6.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmProprietary
 * Status18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7#mmProprietaryStatus
 * ProprietaryStatusAndReason7.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason30#mmStatusAndReason
 * StatusAndReason30.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#mmRejected
 * ResponseStatus8Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#mmPending
 * ResponseStatus8Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#mmProcessingStatus
 * StatusAndReason29.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement8Choice#mmStatusAdvice
 * StatusOrStatement8Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmProcessingStatus
 * StatusTrail7.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmModificationProcessingStatus
 * StatusTrail7.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmCancellationStatus
 * StatusTrail7.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmSettled
 * StatusTrail7.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmProprietary
 * ModificationProcessingStatus8Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmProprietary
 * Status23Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason32#mmStatusAndReason
 * StatusAndReason32.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason33#mmStatusAndReason
 * StatusAndReason33.mmStatusAndReason}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.StatusReason> statusReason;
	/**
	 * Specifies the reasons for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
	 * StatusReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#mmReason
	 * Blocked1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmProprietaryStatusReason
	 * InstructionStatusSearch3.mmProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmProprietaryRejectionReason
	 * PaymentStatusReasonCode3Choice.mmProprietaryRejectionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#mmReason
	 * PaymentStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryReason
	 * ProprietaryStatusAndReason1.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2#mmProprietaryReason
	 * ProprietaryStatusAndReason2.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice#mmCode
	 * DeliveryReturn1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice#mmProprietary
	 * DeliveryReturn1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice#mmCode
	 * DeliveryReturn2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice#mmProprietary
	 * DeliveryReturn2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmCancellationReasonInformation
	 * OriginalPaymentInstruction4.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmCancellationReasonInformation
	 * OriginalPaymentInstruction8.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#mmReversalReasonInformation
	 * OriginalPaymentInformation2.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmReversalReasonInformation
	 * PaymentTransaction35.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#mmReversalReasonInformation
	 * OriginalPaymentInstruction2.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmReversalReasonInformation
	 * PaymentTransaction42.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#mmReversalReasonInformation
	 * OriginalPaymentInstruction7.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#mmStatusReasonInformation
	 * OriginalGroupInformation1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmStatusReasonInformation
	 * PaymentTransactionInformation1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#mmStatusReasonInformation
	 * OriginalGroupInformation20.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmStatusReasonInformation
	 * PaymentTransactionInformation25.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#mmStatusReasonInformation
	 * OriginalPaymentInformation1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#mmReason
	 * StatusReasonInformation9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmStatusReasonInformation
	 * OriginalGroupHeader1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmStatusReasonInformation
	 * PaymentTransaction32.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#mmStatusReasonInformation
	 * OriginalPaymentInstruction1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmStatusReasonInformation
	 * PaymentTransaction46.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#mmStatusReasonInformation
	 * OriginalPaymentInstruction6.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmReversalReasonInformation
	 * PaymentTransaction36.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversalReasonInformation
	 * PaymentTransaction45.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmStatusReasonInformation
	 * PaymentTransactionInformation26.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmStatusReasonInformation
	 * PaymentTransaction33.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmStatusReasonInformation
	 * PaymentTransaction43.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#mmAmendmentReason
	 * MandateAmendment1.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment2#mmAmendmentReason
	 * MandateAmendment2.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmAmendmentReason
	 * MandateAmendment3.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation1#mmReturnReason
	 * ReturnReasonInformation1.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#mmReturnReasonInformation
	 * OriginalGroupInformation2.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation9#mmReason
	 * ReturnReasonInformation9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#mmReturnReasonInformation
	 * OriginalGroupInformation21.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmReturnReasonInformation
	 * OriginalGroupHeader2.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmReturnReasonInformation
	 * PaymentTransaction34.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmReturnReasonInformation
	 * PaymentTransaction44.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmStatusReasonInformation
	 * OriginalGroupInformation25.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmStatusReasonInformation
	 * PaymentTransactionInformation34.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#mmStatusReasonInformation
	 * OriginalPaymentInformation5.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmStatusReasonInformation
	 * PaymentTransaction41.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#mmStatusReasonInformation
	 * OriginalPaymentInstruction5.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmStatusReasonInformation
	 * PaymentTransaction49.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#mmStatusReasonInformation
	 * OriginalPaymentInstruction9.mmStatusReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus1#mmReason
	 * InRepairStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmCancelled
	 * IndividualOrderStatusAndReason1.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus2#mmReasonDetails
	 * InRepairStatus2.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmCancelled
	 * IndividualOrderStatusAndReason2.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmInRepair
	 * IndividualOrderStatusAndReason2.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmStatusReason
	 * MeetingInstructionGlobalStatus.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason1#mmRejected
	 * ReportStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#mmRejected
	 * TradeTransactionStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason2#mmRejected
	 * ReportStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmRejected
	 * TradeTransactionStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmStatusReasonInformation
	 * OriginalGroupInformation13.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#mmStatusReasonInformation
	 * OriginalGroupInformation17.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmStatusReasonInformation
	 * OriginalGroupInformation15.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#mmStatusReasonInformation
	 * OriginalGroupInformation19.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3#mmReturnReason
	 * ReturnReasonInformation3.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#mmReturnReasonInformation
	 * OriginalGroupInformation11.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#mmReturnReasonInformation
	 * OriginalGroupInformation18.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation4#mmReturnReason
	 * ReturnReasonInformation4.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation6#mmReturnReason
	 * ReturnReasonInformation6.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmStatusReasonInformation
	 * PaymentTransactionInformation15.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmStatusReasonInformation
	 * PaymentTransactionInformation22.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmStatusReasonInformation
	 * PaymentTransactionInformation12.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmStatusReasonInformation
	 * PaymentTransactionInformation19.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation7#mmReturnReason
	 * ReturnReasonInformation7.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#mmCancelled
	 * IndividualOrderStatusAndReason5.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#mmSettled
	 * IntraBalanceStatusAndReason1.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1#mmReason
	 * CollateralStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#mmSettled
	 * IntraPositionStatusType1.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#mmSettled
	 * IntraBalanceStatusType1.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3#mmProprietaryReason
	 * ProprietaryStatusAndReason3.mmProprietaryReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#mmReason
	 * PaymentStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmUnmatched
	 * TransferStatus1Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmInRepair
	 * TransferStatus1Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmFailedSettlement
	 * TransferStatus1Choice.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancellationPending
	 * TransferStatus1Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmReturnReasonInformation
	 * PaymentTransaction50.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmAmendmentReason
	 * MandateAmendment4.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#mmStatusReasonInformation
	 * OriginalPaymentInstruction12.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmReversalReasonInformation
	 * OriginalPaymentInstruction11.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmStatusReasonInformation
	 * PaymentTransaction52.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversalReasonInformation
	 * PaymentTransaction51.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmCancellationReasonInformation
	 * OriginalPaymentInstruction13.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmStatusReasonInformation
	 * PaymentTransaction57.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmReversalReasonInformation
	 * PaymentTransaction56.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmAcceptedWithException
	 * ReportItemStatus1Choice.mmAcceptedWithException}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#mmStatusReasonInformation
	 * OriginalPaymentInstruction14.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmStatusReasonInformation
	 * PaymentTransaction59.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatusReason
	 * CurrencyControlPackageStatus1.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#mmReason
	 * ValidationStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmStatusReason
	 * CurrencyControlRecordStatus1.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryReason
	 * ProprietaryStatusAndReason6.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#mmCode
	 * DeliveryReturn3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#mmProprietary
	 * DeliveryReturn3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmReversalReasonInformation
	 * OriginalPaymentInstruction16.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmStatusReasonInformation
	 * OriginalPaymentInstruction18.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmReturnReasonInformation
	 * PaymentTransaction65.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmStatusReasonInformation
	 * PaymentTransaction63.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversalReasonInformation
	 * PaymentTransaction60.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmStatusReasonInformation
	 * PaymentTransaction68.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmCancellationReasonInformation
	 * OriginalPaymentInstruction15.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmReversalReasonInformation
	 * PaymentTransaction64.mmReversalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#mmReason
	 * Blocked2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmUnmatched
	 * TransferStatus2Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmInRepair
	 * TransferStatus2Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmFailedSettlement
	 * TransferStatus2Choice.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancellationPending
	 * TransferStatus2Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status21Choice#mmPending
	 * Status21Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#mmStatusReasonInformation
	 * OriginalPaymentInstruction19.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmStatusReasonInformation
	 * PaymentTransaction69.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7#mmProprietaryReason
	 * ProprietaryStatusAndReason7.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice#mmCode
	 * DeliveryReturn4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice#mmProprietary
	 * DeliveryReturn4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmStatusReason
	 * AccountManagementStatusAndReason5.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmCancelled
	 * OrderStatus5Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmInRepair
	 * OrderStatus5Choice.mmInRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmEnabled
	 * AccountStatus2.mmEnabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmDisabled
	 * AccountStatus2.mmDisabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmPending
	 * AccountStatus2.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmPendingOpening
	 * AccountStatus2.mmPendingOpening}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmProforma
	 * AccountStatus2.mmProforma}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosed
	 * AccountStatus2.mmClosed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosurePending
	 * AccountStatus2.mmClosurePending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAccountStatus1#mmReason
	 * OtherAccountStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmCancelled
	 * OrderStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmCancelled
	 * OrderStatus4Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmInRepair
	 * OrderStatus4Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmStatusReasonInformation
	 * PaymentTransaction80.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmStatusReasonInformation
	 * OriginalGroupHeader7.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmReversalReasonInformation
	 * PaymentTransaction81.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmStatusReasonInformation
	 * OriginalPaymentInstruction23.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalReasonInformation
	 * OriginalPaymentInstruction21.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmAmendmentReason
	 * MandateAmendment5.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmStatusReasonInformation
	 * OriginalPaymentInstruction24.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmStatusReasonInformation
	 * OriginalGroupInformation28.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmReturnReasonInformation
	 * PaymentTransaction76.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmCancellationReasonInformation
	 * OriginalPaymentInstruction20.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmStatusReasonInformation
	 * PaymentTransaction83.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmReversalReasonInformation
	 * PaymentTransaction77.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmStatusReasonInformation
	 * PaymentTransaction82.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateSuspensionReason1#mmReason
	 * MandateSuspensionReason1.mmReason}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmStatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Blocked1.mmReason, com.tools20022.repository.msg.InstructionStatusSearch3.mmProprietaryStatusReason,
					com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmProprietaryRejectionReason, com.tools20022.repository.msg.PaymentStatus1.mmReason,
					com.tools20022.repository.msg.ProprietaryStatusAndReason1.mmProprietaryReason, com.tools20022.repository.msg.ProprietaryStatusAndReason2.mmProprietaryReason,
					com.tools20022.repository.choice.DeliveryReturn1Choice.mmCode, com.tools20022.repository.choice.DeliveryReturn1Choice.mmProprietary, com.tools20022.repository.choice.DeliveryReturn2Choice.mmCode,
					com.tools20022.repository.choice.DeliveryReturn2Choice.mmProprietary, com.tools20022.repository.msg.OriginalPaymentInstruction4.mmCancellationReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction8.mmCancellationReasonInformation, com.tools20022.repository.msg.OriginalPaymentInformation2.mmReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction35.mmReversalReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction2.mmReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction42.mmReversalReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction7.mmReversalReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation1.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation1.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation20.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation25.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation1.mmStatusReasonInformation, com.tools20022.repository.msg.StatusReasonInformation9.mmReason,
					com.tools20022.repository.msg.OriginalGroupHeader1.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction32.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction1.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction46.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction6.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction36.mmReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction45.mmReversalReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation26.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction33.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction43.mmStatusReasonInformation,
					com.tools20022.repository.msg.MandateAmendment1.mmAmendmentReason, com.tools20022.repository.msg.MandateAmendment2.mmAmendmentReason, com.tools20022.repository.msg.MandateAmendment3.mmAmendmentReason,
					com.tools20022.repository.msg.ReturnReasonInformation1.mmReturnReason, com.tools20022.repository.msg.OriginalGroupInformation2.mmReturnReasonInformation, com.tools20022.repository.msg.ReturnReasonInformation9.mmReason,
					com.tools20022.repository.msg.OriginalGroupInformation21.mmReturnReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader2.mmReturnReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction34.mmReturnReasonInformation, com.tools20022.repository.msg.PaymentTransaction44.mmReturnReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation25.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation34.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation5.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction41.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction5.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction49.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction9.mmStatusReasonInformation, com.tools20022.repository.msg.InRepairStatus1.mmReason, com.tools20022.repository.msg.IndividualOrderStatusAndReason1.mmCancelled,
					com.tools20022.repository.msg.InRepairStatus2.mmReasonDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.mmCancelled, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.mmInRepair,
					com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmStatusReason, com.tools20022.repository.msg.ReportStatusAndReason1.mmRejected, com.tools20022.repository.msg.TradeTransactionStatusAndReason1.mmRejected,
					com.tools20022.repository.msg.ReportStatusAndReason2.mmRejected, com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmRejected,
					com.tools20022.repository.msg.OriginalGroupInformation13.mmStatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation17.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation15.mmStatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation19.mmStatusReasonInformation,
					com.tools20022.repository.msg.ReturnReasonInformation3.mmReturnReason, com.tools20022.repository.msg.OriginalGroupInformation11.mmReturnReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation18.mmReturnReasonInformation, com.tools20022.repository.msg.ReturnReasonInformation4.mmReturnReason,
					com.tools20022.repository.msg.ReturnReasonInformation6.mmReturnReason, com.tools20022.repository.msg.PaymentTransactionInformation15.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation22.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation12.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation19.mmStatusReasonInformation, com.tools20022.repository.msg.ReturnReasonInformation7.mmReturnReason,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason5.mmCancelled, com.tools20022.repository.msg.IntraBalanceStatusAndReason1.mmSettled, com.tools20022.repository.msg.CollateralStatusReason1.mmReason,
					com.tools20022.repository.msg.IntraPositionStatusType1.mmSettled, com.tools20022.repository.msg.IntraBalanceStatusType1.mmSettled, com.tools20022.repository.msg.ProprietaryStatusAndReason3.mmProprietaryReason,
					com.tools20022.repository.msg.PaymentStatus2.mmReason, com.tools20022.repository.choice.TransferStatus1Choice.mmUnmatched, com.tools20022.repository.choice.TransferStatus1Choice.mmInRepair,
					com.tools20022.repository.choice.TransferStatus1Choice.mmFailedSettlement, com.tools20022.repository.choice.TransferStatus1Choice.mmCancellationPending,
					com.tools20022.repository.msg.PaymentTransaction50.mmReturnReasonInformation, com.tools20022.repository.msg.MandateAmendment4.mmAmendmentReason,
					com.tools20022.repository.msg.OriginalPaymentInstruction12.mmStatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction11.mmReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction52.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction51.mmReversalReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction13.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction57.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction56.mmReversalReasonInformation, com.tools20022.repository.choice.ReportItemStatus1Choice.mmAcceptedWithException,
					com.tools20022.repository.msg.OriginalPaymentInstruction14.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction59.mmStatusReasonInformation,
					com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmStatusReason, com.tools20022.repository.msg.ValidationStatusReason1.mmReason, com.tools20022.repository.msg.CurrencyControlRecordStatus1.mmStatusReason,
					com.tools20022.repository.msg.ProprietaryStatusAndReason6.mmProprietaryReason, com.tools20022.repository.choice.DeliveryReturn3Choice.mmCode, com.tools20022.repository.choice.DeliveryReturn3Choice.mmProprietary,
					com.tools20022.repository.msg.OriginalPaymentInstruction16.mmReversalReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction18.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction65.mmReturnReasonInformation, com.tools20022.repository.msg.PaymentTransaction63.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction60.mmReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction68.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction15.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction64.mmReversalReasonInformation,
					com.tools20022.repository.msg.Blocked2.mmReason, com.tools20022.repository.choice.TransferStatus2Choice.mmUnmatched, com.tools20022.repository.choice.TransferStatus2Choice.mmInRepair,
					com.tools20022.repository.choice.TransferStatus2Choice.mmFailedSettlement, com.tools20022.repository.choice.TransferStatus2Choice.mmCancellationPending, com.tools20022.repository.choice.Status21Choice.mmPending,
					com.tools20022.repository.msg.OriginalPaymentInstruction19.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction69.mmStatusReasonInformation,
					com.tools20022.repository.msg.ProprietaryStatusAndReason7.mmProprietaryReason, com.tools20022.repository.choice.DeliveryReturn4Choice.mmCode, com.tools20022.repository.choice.DeliveryReturn4Choice.mmProprietary,
					com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmStatusReason, com.tools20022.repository.choice.OrderStatus5Choice.mmCancelled, com.tools20022.repository.choice.OrderStatus5Choice.mmInRepair,
					com.tools20022.repository.msg.AccountStatus2.mmEnabled, com.tools20022.repository.msg.AccountStatus2.mmDisabled, com.tools20022.repository.msg.AccountStatus2.mmPending,
					com.tools20022.repository.msg.AccountStatus2.mmPendingOpening, com.tools20022.repository.msg.AccountStatus2.mmProforma, com.tools20022.repository.msg.AccountStatus2.mmClosed,
					com.tools20022.repository.msg.AccountStatus2.mmClosurePending, com.tools20022.repository.msg.OtherAccountStatus1.mmReason, com.tools20022.repository.choice.OrderStatus3Choice.mmCancelled,
					com.tools20022.repository.choice.OrderStatus4Choice.mmCancelled, com.tools20022.repository.choice.OrderStatus4Choice.mmInRepair, com.tools20022.repository.msg.PaymentTransaction80.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupHeader7.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction81.mmReversalReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction23.mmStatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction21.mmReversalReasonInformation,
					com.tools20022.repository.msg.MandateAmendment5.mmAmendmentReason, com.tools20022.repository.msg.OriginalPaymentInstruction24.mmStatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation28.mmStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction76.mmReturnReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction20.mmCancellationReasonInformation, com.tools20022.repository.msg.PaymentTransaction83.mmStatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction77.mmReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction82.mmStatusReasonInformation,
					com.tools20022.repository.msg.MandateSuspensionReason1.mmReason);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.mmStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	protected ISODateTime statusDateTime;
	/**
	 * Date and time at which the status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmStatusValueTime
	 * PaymentInstructionReference2Details.mmStatusValueTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#mmPaymentInstructionStatusDateTime
	 * InstructionStatusSearch2.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmPaymentInstructionStatusDateTime
	 * InstructionStatusSearch3.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails1#mmPaymentInstructionStatusDateTime
	 * PaymentStatusDetails1.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3#mmPaymentInstructionStatusDateTime
	 * PaymentStatusDetails3.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4#mmPaymentInstructionStatusDateTime
	 * PaymentStatusDetails4.mmPaymentInstructionStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#mmDateTime
	 * PaymentStatus1.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#mmStatusDate
	 * StatusTrail2.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#mmStatusDate
	 * StatusTrail3.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatusTime
	 * TradeData1.mmCurrentStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatusTime
	 * TradeData1.mmPreviousStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatusDateTime
	 * TradeData10.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmCurrentStatusDateTime
	 * TradeData8.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatusDateTime
	 * TradeData9.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmCurrentStatusTime
	 * TradeData2.mmCurrentStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmPreviousStatusTime
	 * TradeData2.mmPreviousStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatusDateTime
	 * TradeData7.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatusDateTime
	 * TradeData7.mmPreviousStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#mmDateTime
	 * CaseStatus.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#mmDateTime
	 * CaseStatus2.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusTime
	 * TradeStatus1.mmStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus2#mmChangeDateTime
	 * TransactionStatus2.mmChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus5#mmChangeDateTime
	 * TransactionStatus5.mmChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmStatusDate
	 * IntraBalanceCancellation2.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmStatusDate
	 * IntraBalanceMovement2.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmStatusDate
	 * IntraBalanceModification2.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#mmStatusDate
	 * IntraPositionModification2.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#mmDateTime
	 * PaymentStatus2.mmDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmCurrentStatusDateTime
	 * TradeData11.mmCurrentStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmStatusDate
	 * StatusTrail4.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmStatusDate
	 * StatusTrail5.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatusDateTime
	 * CurrencyControlGroupStatus1.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatusDateTime
	 * CurrencyControlPackageStatus1.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#mmClosureDate
	 * RegisteredContractJournal1.mmClosureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmStatusDateTime
	 * CurrencyControlRecordStatus1.mmStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmStatusDate
	 * StatusTrail6.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatusDate
	 * InvestmentAccount50.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmStatusDate
	 * StatusTrail7.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmStatusDate
	 * InvestmentAccount62.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatusDateTime
	 * TradeData14.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusDateTime
	 * TradeData12.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatusDateTime
	 * TradeData15.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatusDateTime
	 * TradeData15.mmPreviousStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatusDateTime
	 * TradeData16.mmCurrentStatusDateTime}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStatusDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.mmStatusValueTime, com.tools20022.repository.msg.InstructionStatusSearch2.mmPaymentInstructionStatusDateTime,
					com.tools20022.repository.msg.InstructionStatusSearch3.mmPaymentInstructionStatusDateTime, com.tools20022.repository.msg.PaymentStatusDetails1.mmPaymentInstructionStatusDateTime,
					com.tools20022.repository.msg.PaymentStatusDetails3.mmPaymentInstructionStatusDateTime, com.tools20022.repository.msg.PaymentStatusDetails4.mmPaymentInstructionStatusDateTime,
					com.tools20022.repository.msg.PaymentStatus1.mmDateTime, com.tools20022.repository.msg.StatusTrail2.mmStatusDate, com.tools20022.repository.msg.StatusTrail3.mmStatusDate,
					com.tools20022.repository.msg.TradeData1.mmCurrentStatusTime, com.tools20022.repository.msg.TradeData1.mmPreviousStatusTime, com.tools20022.repository.msg.TradeData10.mmCurrentStatusDateTime,
					com.tools20022.repository.msg.TradeData8.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData9.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData2.mmCurrentStatusTime,
					com.tools20022.repository.msg.TradeData2.mmPreviousStatusTime, com.tools20022.repository.msg.TradeData7.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData7.mmPreviousStatusDateTime,
					com.tools20022.repository.msg.CaseStatus.mmDateTime, com.tools20022.repository.msg.CaseStatus2.mmDateTime, com.tools20022.repository.msg.TradeStatus1.mmStatusTime,
					com.tools20022.repository.msg.TransactionStatus2.mmChangeDateTime, com.tools20022.repository.msg.TransactionStatus5.mmChangeDateTime, com.tools20022.repository.msg.IntraBalanceCancellation2.mmStatusDate,
					com.tools20022.repository.msg.IntraBalanceMovement2.mmStatusDate, com.tools20022.repository.msg.IntraBalanceModification2.mmStatusDate, com.tools20022.repository.msg.IntraPositionModification2.mmStatusDate,
					com.tools20022.repository.msg.PaymentStatus2.mmDateTime, com.tools20022.repository.msg.TradeData11.mmCurrentStatusDateTime, com.tools20022.repository.msg.StatusTrail4.mmStatusDate,
					com.tools20022.repository.msg.StatusTrail5.mmStatusDate, com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmStatusDateTime, com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmStatusDateTime,
					com.tools20022.repository.msg.RegisteredContractJournal1.mmClosureDate, com.tools20022.repository.msg.CurrencyControlRecordStatus1.mmStatusDateTime, com.tools20022.repository.msg.StatusTrail6.mmStatusDate,
					com.tools20022.repository.msg.InvestmentAccount50.mmStatusDate, com.tools20022.repository.msg.StatusTrail7.mmStatusDate, com.tools20022.repository.msg.InvestmentAccount62.mmStatusDate,
					com.tools20022.repository.msg.TradeData14.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData12.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData15.mmCurrentStatusDateTime,
					com.tools20022.repository.msg.TradeData15.mmPreviousStatusDateTime, com.tools20022.repository.msg.TradeData16.mmCurrentStatusDateTime);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriod validityTime;
	/**
	 * Period of time during which the status is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
	 * DateTimePeriod.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatusDetails1#mmValidityTime
	 * SystemStatusDetails1.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus1#mmValidityTime
	 * SystemStatus1.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1#mmDatePeriod
	 * IntraPositionQueryStatus1.mmDatePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus2#mmValidityTime
	 * SystemStatus2.mmValidityTime}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmValidityTime = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemStatusDetails1.mmValidityTime, com.tools20022.repository.msg.SystemStatus1.mmValidityTime,
					com.tools20022.repository.msg.IntraPositionQueryStatus1.mmDatePeriod, com.tools20022.repository.msg.SystemStatus2.mmValidityTime);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max350Text statusDescription;
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#mmAdditionalInformation
	 * StatusReasonInformation9.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3#mmAdditionalInformation
	 * UndertakingTermination3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRight1#mmAdditionalInformation
	 * CancellationRight1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1#mmAdditionalInformation
	 * CancellationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionInstructionProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionInstructionRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionCancellationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionCancellationRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1#mmAdditionalInformation
	 * CorporateActionAmendmentProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#mmAdditionalInformation
	 * CorporateActionAmendmentRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1#mmAdditionalInformation
	 * CorporateActionMovementProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#mmAdditionalInformation
	 * CorporateActionMovementRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2#mmAdditionalInformation
	 * CorporationActionMovementProcessingStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#mmAdditionalInformation
	 * CorporateActionMovementRejectionStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionInformationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1#mmAdditionalInformation
	 * CorporateActionInformationRejectedStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionCancellationProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionCancellationRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationInstructionProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationInstructionRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationCancellationProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationCancellationRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1#mmAdditionalStatusReasonInformation
	 * CancellationStatusInformation1.mmAdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmAdditionalInformation
	 * CollateralCancellationStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#mmDescription
	 * GenericValidationRuleIdentification1.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatus
	 * CurrencyControlGroupStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#mmValidationRule
	 * ValidationStatusReason1.mmValidationRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#mmAdditionalInformation
	 * ValidationStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmStatus
	 * CurrencyControlRecordStatus1.mmStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStatusDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.mmAdditionalInformation, com.tools20022.repository.msg.UndertakingTermination3.mmAdditionalInformation,
					com.tools20022.repository.msg.CancellationRight1.mmAdditionalInformation, com.tools20022.repository.msg.CancellationProcessingStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1.mmAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1.mmAdditionalInformation, com.tools20022.repository.msg.CancellationStatusInformation1.mmAdditionalStatusReasonInformation,
					com.tools20022.repository.msg.CollateralCancellationStatus1.mmAdditionalInformation, com.tools20022.repository.msg.GenericValidationRuleIdentification1.mmDescription,
					com.tools20022.repository.msg.CurrencyControlGroupStatus1.mmStatus, com.tools20022.repository.msg.ValidationStatusReason1.mmValidationRule, com.tools20022.repository.msg.ValidationStatusReason1.mmAdditionalInformation,
					com.tools20022.repository.msg.CurrencyControlRecordStatus1.mmStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected StatusCode instructionProcessingStatus;
	/**
	 * Status of the processing of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.StatusCode
	 * StatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmProcessingStatus
	 * MeetingInstructionGlobalStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmProcessingStatus
	 * MeetingInstructionStatusDetails.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus1#mmStatus
	 * InstructionProcessingStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus2Choice#mmProcessingStatus
	 * InstructionStatus2Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#mmInstructionStatus
	 * DetailedInstructionStatus1.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice#mmProcessingStatus
	 * InstructionStatus4Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmInstructionStatus
	 * DetailedInstructionStatus8.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmGlobalInstructionStatus
	 * InstructionStatus3Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmDetailedInstructionStatus
	 * InstructionStatus3Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmInstructionStatus
	 * InstructionTypeStatus1Choice.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#mmStatus
	 * TradeTransactionStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmStatus
	 * TradeTransactionStatusAndReason2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmCollateralStatusCode
	 * CollateralCancellationStatus1.mmCollateralStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmResponseType
	 * CollateralProposalResponseType1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmResponseType
	 * SubstitutionResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmResponseType
	 * InterestResponse1.mmResponseType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmStatus
	 * TradeLeg2.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmStatus
	 * TradeLeg5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1#mmStatus
	 * CollateralStatusReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLinkStatus1#mmStatus
	 * AccountLinkStatus1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmStatus
	 * TradeLeg8.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmInstructionStatus
	 * InstructionTypeStatus2Choice.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmGlobalInstructionStatus
	 * InstructionStatus5Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmDetailedInstructionStatus
	 * InstructionStatus5Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#mmProcessingStatus
	 * InstructionStatus6Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionStatus
	 * DetailedInstructionStatus11.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus3#mmStatus
	 * InstructionProcessingStatus3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatus
	 * CurrencyControlPackageStatus1.mmStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmProcessingStatus, com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmProcessingStatus,
					com.tools20022.repository.msg.InstructionProcessingStatus1.mmStatus, com.tools20022.repository.choice.InstructionStatus2Choice.mmProcessingStatus,
					com.tools20022.repository.msg.DetailedInstructionStatus1.mmInstructionStatus, com.tools20022.repository.choice.InstructionStatus4Choice.mmProcessingStatus,
					com.tools20022.repository.msg.DetailedInstructionStatus8.mmInstructionStatus, com.tools20022.repository.choice.InstructionStatus3Choice.mmGlobalInstructionStatus,
					com.tools20022.repository.choice.InstructionStatus3Choice.mmDetailedInstructionStatus, com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmInstructionStatus,
					com.tools20022.repository.msg.TradeTransactionStatusAndReason1.mmStatus, com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmStatus,
					com.tools20022.repository.msg.CollateralCancellationStatus1.mmCollateralStatusCode, com.tools20022.repository.msg.CollateralProposalResponseType1.mmResponseType,
					com.tools20022.repository.msg.SubstitutionResponse1.mmResponseType, com.tools20022.repository.msg.InterestResponse1.mmResponseType, com.tools20022.repository.msg.TradeLeg2.mmStatus,
					com.tools20022.repository.msg.TradeLeg5.mmStatus, com.tools20022.repository.msg.CollateralStatusReason1.mmStatus, com.tools20022.repository.msg.AccountLinkStatus1.mmStatus,
					com.tools20022.repository.msg.TradeLeg8.mmStatus, com.tools20022.repository.choice.InstructionTypeStatus2Choice.mmInstructionStatus, com.tools20022.repository.choice.InstructionStatus5Choice.mmGlobalInstructionStatus,
					com.tools20022.repository.choice.InstructionStatus5Choice.mmDetailedInstructionStatus, com.tools20022.repository.choice.InstructionStatus6Choice.mmProcessingStatus,
					com.tools20022.repository.msg.DetailedInstructionStatus11.mmInstructionStatus, com.tools20022.repository.msg.InstructionProcessingStatus3.mmStatus, com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}
	};
	protected InvestigationPartyRole partyRole;
	/**
	 * Role played by a party in the context of assigning a status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
	 * InvestigationPartyRole.mmStatus}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmObject();
		}
	};
	protected SecuritiesSettlementStatusCode settlementStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmSettlementStatus
	 * StatusTrail2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmSettlementStatus
	 * StatusTrail3.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#mmSettlementStatus
	 * StatusAndReason3.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#mmSettlementStatus
	 * StatusAndReason6.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#mmSettlementStatus
	 * StatusAndReason12.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#mmSettlementStatus
	 * StatusAndReason14.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmSettlementStatus
	 * Status2Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmSettlementStatus
	 * Status4Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#mmSettlementStatus
	 * Status9Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmSettlementStatus
	 * Status11Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice#mmCode
	 * SettlementStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice#mmProprietary
	 * SettlementStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmSettlementStatus
	 * Status1Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice#mmCode
	 * SettlementStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice#mmProprietary
	 * SettlementStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmSettlementStatus
	 * Status8Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice#mmCode
	 * SettlementStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice#mmProprietary
	 * SettlementStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmSettlementStatus
	 * Status3Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice#mmCode
	 * SettlementStatus6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice#mmProprietary
	 * SettlementStatus6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmSettlementStatus
	 * Status10Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1#mmSettlementStatus
	 * PendingStatusAndReason1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#mmSettlementStatus
	 * IntraBalanceStatusAndReason1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#mmSettlementStatus
	 * IntraPositionStatusType1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#mmSettlementStatus
	 * IntraBalanceStatusType1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmSettlementStatus
	 * Status15Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#mmSettlementStatus
	 * StatusAndReason19.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#mmSettlementStatus
	 * StatusAndReason20.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmSettlementStatus
	 * Status16Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmSettlementStatus
	 * StatusTrail4.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmSettlementStatus
	 * StatusTrail5.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmSettlementStatus
	 * StatusAndReason28.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettlementStatus
	 * StatusTrail6.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmSettlementStatus
	 * Status18Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementStatus
	 * Status19Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#mmCode
	 * SettlementStatus19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#mmProprietary
	 * SettlementStatus19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#mmSettlementStatus
	 * StatusAndReason29.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmSettlementStatus
	 * StatusTrail7.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmSettlementStatus
	 * Status22Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice#mmCode
	 * SettlementStatus25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice#mmProprietary
	 * SettlementStatus25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmSettlementStatus
	 * Status23Choice.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSettlementStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusTrail2.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail3.mmSettlementStatus,
					com.tools20022.repository.msg.StatusAndReason3.mmSettlementStatus, com.tools20022.repository.msg.StatusAndReason6.mmSettlementStatus, com.tools20022.repository.msg.StatusAndReason12.mmSettlementStatus,
					com.tools20022.repository.msg.StatusAndReason14.mmSettlementStatus, com.tools20022.repository.choice.Status2Choice.mmSettlementStatus, com.tools20022.repository.choice.Status4Choice.mmSettlementStatus,
					com.tools20022.repository.choice.Status9Choice.mmSettlementStatus, com.tools20022.repository.choice.Status11Choice.mmSettlementStatus, com.tools20022.repository.choice.SettlementStatus1Choice.mmCode,
					com.tools20022.repository.choice.SettlementStatus1Choice.mmProprietary, com.tools20022.repository.choice.Status1Choice.mmSettlementStatus, com.tools20022.repository.choice.SettlementStatus5Choice.mmCode,
					com.tools20022.repository.choice.SettlementStatus5Choice.mmProprietary, com.tools20022.repository.choice.Status8Choice.mmSettlementStatus, com.tools20022.repository.choice.SettlementStatus3Choice.mmCode,
					com.tools20022.repository.choice.SettlementStatus3Choice.mmProprietary, com.tools20022.repository.choice.Status3Choice.mmSettlementStatus, com.tools20022.repository.choice.SettlementStatus6Choice.mmCode,
					com.tools20022.repository.choice.SettlementStatus6Choice.mmProprietary, com.tools20022.repository.choice.Status10Choice.mmSettlementStatus, com.tools20022.repository.msg.PendingStatusAndReason1.mmSettlementStatus,
					com.tools20022.repository.msg.IntraBalanceStatusAndReason1.mmSettlementStatus, com.tools20022.repository.msg.IntraPositionStatusType1.mmSettlementStatus,
					com.tools20022.repository.msg.IntraBalanceStatusType1.mmSettlementStatus, com.tools20022.repository.choice.Status15Choice.mmSettlementStatus, com.tools20022.repository.msg.StatusAndReason19.mmSettlementStatus,
					com.tools20022.repository.msg.StatusAndReason20.mmSettlementStatus, com.tools20022.repository.choice.Status16Choice.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail4.mmSettlementStatus,
					com.tools20022.repository.msg.StatusTrail5.mmSettlementStatus, com.tools20022.repository.msg.StatusAndReason28.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail6.mmSettlementStatus,
					com.tools20022.repository.choice.Status18Choice.mmSettlementStatus, com.tools20022.repository.choice.Status19Choice.mmSettlementStatus, com.tools20022.repository.choice.SettlementStatus19Choice.mmCode,
					com.tools20022.repository.choice.SettlementStatus19Choice.mmProprietary, com.tools20022.repository.msg.StatusAndReason29.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail7.mmSettlementStatus,
					com.tools20022.repository.choice.Status22Choice.mmSettlementStatus, com.tools20022.repository.choice.SettlementStatus25Choice.mmCode, com.tools20022.repository.choice.SettlementStatus25Choice.mmProprietary,
					com.tools20022.repository.choice.Status23Choice.mmSettlementStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}
	};
	protected CancellationProcessingStatusCode cancellationProcessingStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice#mmCode
	 * CancellationProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice#mmProprietary
	 * CancellationProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmCancellationProcessingStatus
	 * Status1Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCancellationProcessingStatus
	 * Status8Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice#mmCode
	 * CancellationProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice#mmProprietary
	 * CancellationProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCancellationProcessingStatus
	 * Status3Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCancellationProcessingStatus
	 * Status10Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice#mmCode
	 * CancellationProcessingStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice#mmProprietary
	 * CancellationProcessingStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCancellationProcessingStatus
	 * Status19Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#mmCode
	 * CancellationProcessingStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#mmProprietary
	 * CancellationProcessingStatus7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice#mmCode
	 * CancellationProcessingStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice#mmProprietary
	 * CancellationProcessingStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCancellationProcessingStatus
	 * Status22Choice.mmCancellationProcessingStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCancellationProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationProcessingStatus1Choice.mmCode, com.tools20022.repository.choice.CancellationProcessingStatus1Choice.mmProprietary,
					com.tools20022.repository.choice.Status1Choice.mmCancellationProcessingStatus, com.tools20022.repository.choice.Status8Choice.mmCancellationProcessingStatus,
					com.tools20022.repository.choice.CancellationProcessingStatus2Choice.mmCode, com.tools20022.repository.choice.CancellationProcessingStatus2Choice.mmProprietary,
					com.tools20022.repository.choice.Status3Choice.mmCancellationProcessingStatus, com.tools20022.repository.choice.Status10Choice.mmCancellationProcessingStatus,
					com.tools20022.repository.choice.CancellationProcessingStatus3Choice.mmCode, com.tools20022.repository.choice.CancellationProcessingStatus3Choice.mmProprietary,
					com.tools20022.repository.choice.Status19Choice.mmCancellationProcessingStatus, com.tools20022.repository.choice.CancellationProcessingStatus7Choice.mmCode,
					com.tools20022.repository.choice.CancellationProcessingStatus7Choice.mmProprietary, com.tools20022.repository.choice.CancellationProcessingStatus8Choice.mmCode,
					com.tools20022.repository.choice.CancellationProcessingStatus8Choice.mmProprietary, com.tools20022.repository.choice.Status22Choice.mmCancellationProcessingStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}
	};
	protected InstructionProcessingStatusCode transactionProcessingStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmInstructionProcessingStatus
	 * Status2Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmInstructionProcessingStatus
	 * Status4Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#mmInstructionProcessingStatus
	 * Status9Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmInstructionProcessingStatus
	 * Status11Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice#mmCode
	 * InstructionProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice#mmProprietary
	 * InstructionProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmAccepted
	 * ReplacementProcessingStatus7Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmCompleted
	 * ReplacementProcessingStatus7Choice.mmCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmDenied
	 * ReplacementProcessingStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmInRepair
	 * ReplacementProcessingStatus7Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmPartialReplacementAccepted
	 * ReplacementProcessingStatus7Choice.mmPartialReplacementAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmPending
	 * ReplacementProcessingStatus7Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmReceivedAtIntermediary
	 * ReplacementProcessingStatus7Choice.mmReceivedAtIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmReceivedAtStockExchange
	 * ReplacementProcessingStatus7Choice.mmReceivedAtStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmRejected
	 * ReplacementProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmModificationRequested
	 * ReplacementProcessingStatus7Choice.mmModificationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmProprietaryStatus
	 * ReplacementProcessingStatus7Choice.mmProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice#mmGlobalInstructionStatus
	 * InstructionStatus1Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice#mmDetailedInstructionStatus
	 * InstructionStatus1Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmInstructionProcessingStatus
	 * Status1Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmRegistrationProcessingStatus
	 * Status1Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmReplacementProcessingStatus
	 * Status1Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmInstructionProcessingStatus
	 * Status8Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmRegistrationProcessingStatus
	 * Status8Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmReplacementProcessingStatus
	 * Status8Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice#mmCode
	 * InstructionProcessingStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice#mmProprietary
	 * InstructionProcessingStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmInstructionProcessingStatus
	 * Status3Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmRegistrationProcessingStatus
	 * Status3Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmReplacementProcessingStatus
	 * Status3Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmInstructionProcessingStatus
	 * Status10Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmRegistrationProcessingStatus
	 * Status10Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmReplacementProcessingStatus
	 * Status10Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1#mmProcessingStatus
	 * PendingStatusAndReason1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#mmProcessingStatus
	 * IntraBalanceStatusAndReason1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice#mmCode
	 * ProcessingStatus33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice#mmProprietary
	 * ProcessingStatus33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#mmProcessingStatus
	 * IntraPositionStatusType1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#mmProcessingStatus
	 * IntraBalanceStatusType1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice#mmCode
	 * ProcessingStatus30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice#mmProprietary
	 * ProcessingStatus30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmInstructionProcessingStatus
	 * Status15Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmProcessingStatus
	 * AdditionalInformation9.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmProcessingStatus
	 * AdditionalInformation10.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmInstructionProcessingStatus
	 * Status16Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmRejected
	 * ReportItemStatus1Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmProcessingStatus
	 * AdditionalInformation11.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInstructionProcessingStatus
	 * Status18Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#mmCode
	 * InstructionProcessingStatus23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#mmProprietary
	 * InstructionProcessingStatus23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInstructionProcessingStatus
	 * Status19Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRegistrationProcessingStatus
	 * Status19Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmReplacementProcessingStatus
	 * Status19Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmProcessingStatus
	 * AdditionalInformation12.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmInstructionProcessingStatus
	 * Status22Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmRegistrationProcessingStatus
	 * Status22Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmReplacementProcessingStatus
	 * Status22Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice#mmCode
	 * InstructionProcessingStatus26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice#mmProprietary
	 * InstructionProcessingStatus26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmInstructionProcessingStatus
	 * Status23Choice.mmInstructionProcessingStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransactionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status2Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status4Choice.mmInstructionProcessingStatus,
					com.tools20022.repository.choice.Status9Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status11Choice.mmInstructionProcessingStatus,
					com.tools20022.repository.choice.InstructionProcessingStatus2Choice.mmCode, com.tools20022.repository.choice.InstructionProcessingStatus2Choice.mmProprietary,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmAccepted, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmCompleted,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmDenied, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmInRepair,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmPartialReplacementAccepted, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmPending,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmReceivedAtIntermediary, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmReceivedAtStockExchange,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmRejected, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmModificationRequested,
					com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.mmProprietaryStatus, com.tools20022.repository.choice.InstructionStatus1Choice.mmGlobalInstructionStatus,
					com.tools20022.repository.choice.InstructionStatus1Choice.mmDetailedInstructionStatus, com.tools20022.repository.choice.Status1Choice.mmInstructionProcessingStatus,
					com.tools20022.repository.choice.Status1Choice.mmRegistrationProcessingStatus, com.tools20022.repository.choice.Status1Choice.mmReplacementProcessingStatus,
					com.tools20022.repository.choice.Status8Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status8Choice.mmRegistrationProcessingStatus,
					com.tools20022.repository.choice.Status8Choice.mmReplacementProcessingStatus, com.tools20022.repository.choice.InstructionProcessingStatus5Choice.mmCode,
					com.tools20022.repository.choice.InstructionProcessingStatus5Choice.mmProprietary, com.tools20022.repository.choice.Status3Choice.mmInstructionProcessingStatus,
					com.tools20022.repository.choice.Status3Choice.mmRegistrationProcessingStatus, com.tools20022.repository.choice.Status3Choice.mmReplacementProcessingStatus,
					com.tools20022.repository.choice.Status10Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status10Choice.mmRegistrationProcessingStatus,
					com.tools20022.repository.choice.Status10Choice.mmReplacementProcessingStatus, com.tools20022.repository.msg.PendingStatusAndReason1.mmProcessingStatus,
					com.tools20022.repository.msg.IntraBalanceStatusAndReason1.mmProcessingStatus, com.tools20022.repository.choice.ProcessingStatus33Choice.mmCode, com.tools20022.repository.choice.ProcessingStatus33Choice.mmProprietary,
					com.tools20022.repository.msg.IntraPositionStatusType1.mmProcessingStatus, com.tools20022.repository.msg.IntraBalanceStatusType1.mmProcessingStatus, com.tools20022.repository.choice.ProcessingStatus30Choice.mmCode,
					com.tools20022.repository.choice.ProcessingStatus30Choice.mmProprietary, com.tools20022.repository.choice.Status15Choice.mmInstructionProcessingStatus,
					com.tools20022.repository.msg.AdditionalInformation9.mmProcessingStatus, com.tools20022.repository.msg.AdditionalInformation10.mmProcessingStatus,
					com.tools20022.repository.choice.Status16Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.ReportItemStatus1Choice.mmRejected,
					com.tools20022.repository.msg.AdditionalInformation11.mmProcessingStatus, com.tools20022.repository.choice.Status18Choice.mmInstructionProcessingStatus,
					com.tools20022.repository.choice.InstructionProcessingStatus23Choice.mmCode, com.tools20022.repository.choice.InstructionProcessingStatus23Choice.mmProprietary,
					com.tools20022.repository.choice.Status19Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status19Choice.mmRegistrationProcessingStatus,
					com.tools20022.repository.choice.Status19Choice.mmReplacementProcessingStatus, com.tools20022.repository.msg.AdditionalInformation12.mmProcessingStatus,
					com.tools20022.repository.choice.Status22Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status22Choice.mmRegistrationProcessingStatus,
					com.tools20022.repository.choice.Status22Choice.mmReplacementProcessingStatus, com.tools20022.repository.choice.InstructionProcessingStatus26Choice.mmCode,
					com.tools20022.repository.choice.InstructionProcessingStatus26Choice.mmProprietary, com.tools20022.repository.choice.Status23Choice.mmInstructionProcessingStatus);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}
	};
	protected ModificationProcessingStatusCode modificationProcessingStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice#mmCode
	 * ModificationProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice#mmProprietary
	 * ModificationProcessingStatus1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmModificationProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ModificationProcessingStatus1Choice.mmCode, com.tools20022.repository.choice.ModificationProcessingStatus1Choice.mmProprietary);
			elementContext_lazy = () -> Status.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.DateTimePeriod.mmStatus, com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.InvestigationPartyRole.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProprietaryStatusAndReason1.mmProprietaryStatus, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmProprietary,
						com.tools20022.repository.msg.StatusTrail2.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail2.mmModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail2.mmCancellationStatus,
						com.tools20022.repository.msg.StatusTrail2.mmSettled, com.tools20022.repository.msg.ProprietaryStatusAndReason2.mmProprietaryStatus,
						com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmProprietary, com.tools20022.repository.msg.StatusTrail3.mmProcessingStatus,
						com.tools20022.repository.msg.StatusTrail3.mmModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail3.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail3.mmSettled,
						com.tools20022.repository.msg.StatusAndReason12.mmProcessingStatus, com.tools20022.repository.msg.StatusAndReason14.mmProcessingStatus, com.tools20022.repository.msg.StatusAndReason1.mmStatusAndReason,
						com.tools20022.repository.msg.StatusAndReason2.mmStatusAndReason, com.tools20022.repository.msg.StatusAndReason4.mmStatusAndReason, com.tools20022.repository.msg.StatusAndReason5.mmStatusAndReason,
						com.tools20022.repository.msg.StatusAndReason7.mmStatusAndReason, com.tools20022.repository.msg.StatusAndReason8.mmStatusAndReason, com.tools20022.repository.choice.Status9Choice.mmProprietary,
						com.tools20022.repository.msg.StatusAndReason9.mmStatusAndReason, com.tools20022.repository.choice.Status11Choice.mmProprietary, com.tools20022.repository.msg.StatusAndReason13.mmStatusAndReason,
						com.tools20022.repository.msg.StatusAndReason16.mmStatusAndReason, com.tools20022.repository.msg.StatusAndReason17.mmStatusAndReason,
						com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1.mmStatus, com.tools20022.repository.choice.ResponseStatus3Choice.mmRejected,
						com.tools20022.repository.choice.ResponseStatus3Choice.mmPending, com.tools20022.repository.choice.ResponseStatus4Choice.mmRejected, com.tools20022.repository.choice.ResponseStatus4Choice.mmPending,
						com.tools20022.repository.choice.StatusOrStatement5Choice.mmStatusAdvice, com.tools20022.repository.choice.StatusOrStatement6Choice.mmStatusAdvice, com.tools20022.repository.msg.IntraBalanceQueryStatus1.mmType,
						com.tools20022.repository.msg.ProprietaryStatusAndReason3.mmProprietaryStatus, com.tools20022.repository.msg.StatusAndReason18.mmStatusAndReason, com.tools20022.repository.choice.Status15Choice.mmProprietary,
						com.tools20022.repository.msg.StatusAndReason19.mmProcessingStatus, com.tools20022.repository.msg.StatusAndReason20.mmProcessingStatus, com.tools20022.repository.msg.StatusAndReason21.mmStatusAndReason,
						com.tools20022.repository.choice.Status16Choice.mmProprietary, com.tools20022.repository.msg.StatusAndReason25.mmStatusAndReason, com.tools20022.repository.msg.StatusTrail4.mmProcessingStatus,
						com.tools20022.repository.msg.StatusTrail4.mmModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail4.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail4.mmSettled,
						com.tools20022.repository.choice.ModificationProcessingStatus4Choice.mmProprietary, com.tools20022.repository.choice.ModificationProcessingStatus6Choice.mmProprietary,
						com.tools20022.repository.msg.StatusAndReason26.mmStatusAndReason, com.tools20022.repository.msg.StatusTrail5.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail5.mmModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail5.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail5.mmSettled, com.tools20022.repository.choice.ModificationProcessingStatus5Choice.mmProprietary,
						com.tools20022.repository.msg.GenericValidationRuleIdentification1.mmIdentification, com.tools20022.repository.msg.StatusAndReason27.mmStatusAndReason,
						com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmRecordStatus, com.tools20022.repository.choice.ResponseStatus6Choice.mmRejected, com.tools20022.repository.choice.ResponseStatus6Choice.mmPending,
						com.tools20022.repository.choice.StatusOrStatement7Choice.mmStatusAdvice, com.tools20022.repository.msg.StatusAndReason28.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail6.mmProcessingStatus,
						com.tools20022.repository.msg.StatusTrail6.mmModificationProcessingStatus, com.tools20022.repository.msg.StatusTrail6.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail6.mmSettled,
						com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmProprietary, com.tools20022.repository.msg.ProprietaryStatusAndReason6.mmProprietaryStatus,
						com.tools20022.repository.choice.Status18Choice.mmProprietary, com.tools20022.repository.msg.ProprietaryStatusAndReason7.mmProprietaryStatus, com.tools20022.repository.msg.StatusAndReason30.mmStatusAndReason,
						com.tools20022.repository.choice.ResponseStatus8Choice.mmRejected, com.tools20022.repository.choice.ResponseStatus8Choice.mmPending, com.tools20022.repository.msg.StatusAndReason29.mmProcessingStatus,
						com.tools20022.repository.choice.StatusOrStatement8Choice.mmStatusAdvice, com.tools20022.repository.msg.StatusTrail7.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail7.mmModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail7.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail7.mmSettled, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.mmProprietary,
						com.tools20022.repository.choice.Status23Choice.mmProprietary, com.tools20022.repository.msg.StatusAndReason32.mmStatusAndReason, com.tools20022.repository.msg.StatusAndReason33.mmStatusAndReason);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.mmStatusReason, com.tools20022.repository.entity.Status.mmStatusDateTime, com.tools20022.repository.entity.Status.mmValidityTime,
						com.tools20022.repository.entity.Status.mmStatusDescription, com.tools20022.repository.entity.Status.mmInstructionProcessingStatus, com.tools20022.repository.entity.Status.mmPartyRole,
						com.tools20022.repository.entity.Status.mmSettlementStatus, com.tools20022.repository.entity.Status.mmCancellationProcessingStatus, com.tools20022.repository.entity.Status.mmTransactionProcessingStatus,
						com.tools20022.repository.entity.Status.mmModificationProcessingStatus);
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

	public List<StatusReason> getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(List<com.tools20022.repository.entity.StatusReason> statusReason) {
		this.statusReason = statusReason;
	}

	public ISODateTime getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public DateTimePeriod getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(com.tools20022.repository.entity.DateTimePeriod validityTime) {
		this.validityTime = validityTime;
	}

	public Max350Text getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(Max350Text statusDescription) {
		this.statusDescription = statusDescription;
	}

	public StatusCode getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public void setInstructionProcessingStatus(StatusCode instructionProcessingStatus) {
		this.instructionProcessingStatus = instructionProcessingStatus;
	}

	public InvestigationPartyRole getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(com.tools20022.repository.entity.InvestigationPartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public SecuritiesSettlementStatusCode getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(SecuritiesSettlementStatusCode settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	public CancellationProcessingStatusCode getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public void setCancellationProcessingStatus(CancellationProcessingStatusCode cancellationProcessingStatus) {
		this.cancellationProcessingStatus = cancellationProcessingStatus;
	}

	public InstructionProcessingStatusCode getTransactionProcessingStatus() {
		return transactionProcessingStatus;
	}

	public void setTransactionProcessingStatus(InstructionProcessingStatusCode transactionProcessingStatus) {
		this.transactionProcessingStatus = transactionProcessingStatus;
	}

	public ModificationProcessingStatusCode getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public void setModificationProcessingStatus(ModificationProcessingStatusCode modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
	}
}