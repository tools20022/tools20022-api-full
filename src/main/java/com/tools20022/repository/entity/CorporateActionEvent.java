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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An event determined by a corporation's board of directors, that changes the
 * existing corporate capital structure or financial condition.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEvent" src="doc-files/CorporateActionEvent.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionEvent#Type
 * CorporateActionEvent.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MandatoryVoluntaryEventType
 * CorporateActionEvent.MandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnderlyingSecurity
 * CorporateActionEvent.UnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
 * CorporateActionEvent.CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ExchangeRate
 * CorporateActionEvent.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RegistrationDetails
 * CorporateActionEvent.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BasketOrIndexInformation
 * CorporateActionEvent.BasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Deadline
 * CorporateActionEvent.Deadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#AdditionalBusinessProcess
 * CorporateActionEvent.AdditionalBusinessProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingDate
 * CorporateActionEvent.TradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionCharge
 * CorporateActionEvent.CorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#PariPassuDate
 * CorporateActionEvent.PariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#InformationConditions
 * CorporateActionEvent.InformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FractionalQuantity
 * CorporateActionEvent.FractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EventProcessingType
 * CorporateActionEvent.EventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionStatus
 * CorporateActionEvent.CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#AnnouncementDate
 * CorporateActionEvent.AnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EffectiveDate
 * CorporateActionEvent.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FurtherDetailsAnnouncementDate
 * CorporateActionEvent.FurtherDetailsAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarginFixingDate
 * CorporateActionEvent.MarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ResultPublicationDate
 * CorporateActionEvent.ResultPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#UnconditionalDate
 * CorporateActionEvent.UnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#WhollyUnconditionalDate
 * CorporateActionEvent.WhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#LapsedDate
 * CorporateActionEvent.LapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BookClosurePeriod
 * CorporateActionEvent.BookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantity
 * CorporateActionEvent.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RestrictionIndicator
 * CorporateActionEvent.RestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EventStage
 * CorporateActionEvent.EventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#DocumentationLocation
 * CorporateActionEvent.DocumentationLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantitySought
 * CorporateActionEvent.SecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#PartialElectionIndicator
 * CorporateActionEvent.PartialElectionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPartyRole
 * CorporateActionEvent.CorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarketClaim
 * CorporateActionEvent.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BiddingConditions
 * CorporateActionEvent.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedClassAction
 * CorporateActionEvent.RelatedClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionEventRegistration
 * CorporateActionEvent.CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SuspensionPeriod
 * CorporateActionEvent.SuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Lottery
 * CorporateActionEvent.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#MarginType
 * CorporateActionEvent.MarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedMeeting
 * CorporateActionEvent.RelatedMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Services
 * CorporateActionEvent.Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Issuance
 * CorporateActionEvent.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesModification
 * CorporateActionEvent.SecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TradingPeriod
 * CorporateActionEvent.TradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TransactionTax
 * CorporateActionEvent.TransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ConsentType
 * CorporateActionEvent.ConsentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ProceedsDefinition
 * CorporateActionEvent.ProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CorporateEvent
 * Security.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedCorporateActionEvent
 * ContactPoint.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookClosureCorporateAction
 * DateTimePeriod.BookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedCorporateAction
 * DateTimePeriod.RelatedCorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CorporateActionEvent
 * Tax.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedEventForFractionalQuantity
 * SecuritiesQuantity.RelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionEvent
 * SecuritiesQuantity.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCorporateActionEvent
 * SecuritiesQuantity.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionEvent
 * CorporateActionStatus.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedCorporateActionEvent
 * CurrencyExchange.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEvent
 * CorporateActionEventRegistration.CorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#EventInformation
 * Issuance.EventInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CorporateAction
 * ProceedsDefinition.CorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#CorporateEvent
 * ClassAction.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#RelatedCorporateEvent
 * SecuritiesModification.RelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#Event
 * BiddingConditions.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionEvent
 * CorporateActionPrice.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#Event
 * CorporateActionServicing.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedCorporateActionEvent
 * Deadline.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#CorporateAction
 * CorporateActionFeesAndCharges.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#RelatedCorporateEvent
 * MarketClaim.RelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CorporateActionEvent
 * SuspensionPeriod.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#RelatedCorporateEvent
 * Lottery.RelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#CorporateEvent
 * Meeting.CorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#CorporateActionEvent
 * CorporateActionPartyRole.CorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance1#GeneralInformation
 * CorporateActionEventAndBalance1.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance2#GeneralInformation
 * CorporateActionEventAndBalance2.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance3#GeneralInformation
 * CorporateActionEventAndBalance3.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#GeneralInformation
 * CorporateActionEventAndBalance4.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5#GeneralInformation
 * CorporateActionEventAndBalance5.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance6#GeneralInformation
 * CorporateActionEventAndBalance6.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#GeneralInformation
 * CorporateActionEventAndBalance7.GeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8#GeneralInformation
 * CorporateActionEventAndBalance8.GeneralInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption3#RateDetails
 * SecuritiesOption3.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption8#RateDetails
 * SecuritiesOption8.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption18#RateDetails
 * SecuritiesOption18.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption20#RateDetails
 * SecuritiesOption20.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption26#RateDetails
 * SecuritiesOption26.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption31#RateDetails
 * SecuritiesOption31.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption35#RateDetails
 * SecuritiesOption35.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption36#RateDetails
 * SecuritiesOption36.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption4#RateDetails
 * SecuritiesOption4.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption10#RateDetails
 * SecuritiesOption10.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption13#RateDetails
 * SecuritiesOption13.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption17#RateDetails
 * SecuritiesOption17.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption24#RateDetails
 * SecuritiesOption24.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption29#RateDetails
 * SecuritiesOption29.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption33#RateDetails
 * SecuritiesOption33.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption38#RateDetails
 * SecuritiesOption38.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption37#RateDetails
 * SecuritiesOption37.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption39#RateDetails
 * SecuritiesOption39.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction3#DateDetails
 * CorporateAction3.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction3#PeriodDetails
 * CorporateAction3.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction3#RateAndAmountDetails
 * CorporateAction3.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption6#RateDetails
 * SecuritiesOption6.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction4#DateDetails
 * CorporateAction4.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction4#PeriodDetails
 * CorporateAction4.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction4#RateAndAmountDetails
 * CorporateAction4.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption12#RateDetails
 * SecuritiesOption12.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#DateDetails
 * CorporateAction5.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#PeriodDetails
 * CorporateAction5.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#RateAndAmountDetails
 * CorporateAction5.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption14#RateDetails
 * SecuritiesOption14.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction6#DateDetails
 * CorporateAction6.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction6#PeriodDetails
 * CorporateAction6.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6#RateAndAmountDetails
 * CorporateAction6.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption22#RateDetails
 * SecuritiesOption22.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction7#DateDetails
 * CorporateAction7.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction7#PeriodDetails
 * CorporateAction7.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction7#RateAndAmountDetails
 * CorporateAction7.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption25#RateDetails
 * SecuritiesOption25.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction8#DateDetails
 * CorporateAction8.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction8#PeriodDetails
 * CorporateAction8.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction8#RateAndAmountDetails
 * CorporateAction8.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption30#RateDetails
 * SecuritiesOption30.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction10#DateDetails
 * CorporateAction10.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#PeriodDetails
 * CorporateAction10.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#RateAndAmountDetails
 * CorporateAction10.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction11#DateDetails
 * CorporateAction11.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction11#PeriodDetails
 * CorporateAction11.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction11#RateAndAmountDetails
 * CorporateAction11.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#DateDetails
 * CorporateAction2.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#PeriodDetails
 * CorporateAction2.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#RateAndAmountDetails
 * CorporateAction2.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction13#DateDetails
 * CorporateAction13.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction12#DateDetails
 * CorporateAction12.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction12#PeriodDetails
 * CorporateAction12.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction12#RateAndAmountDetails
 * CorporateAction12.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction14#DateDetails
 * CorporateAction14.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption42#RateDetails
 * SecuritiesOption42.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption40#RateDetails
 * SecuritiesOption40.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction20#DateDetails
 * CorporateAction20.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction18#DateDetails
 * CorporateAction18.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction17#DateDetails
 * CorporateAction17.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction17#PeriodDetails
 * CorporateAction17.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction17#RateAndAmountDetails
 * CorporateAction17.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption48#RateDetails
 * SecuritiesOption48.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption45#RateDetails
 * SecuritiesOption45.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionSD12#EventStage
 * CorporateActionSD12.EventStage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction24#DateDetails
 * CorporateAction24.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction30#DateDetails
 * CorporateAction30.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction28#DateDetails
 * CorporateAction28.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction29#DateDetails
 * CorporateAction29.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction33#DateDetails
 * CorporateAction33.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction32#DateDetails
 * CorporateAction32.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction31#DateDetails
 * CorporateAction31.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#PeriodDetails
 * CorporateAction31.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#RateAndAmountDetails
 * CorporateAction31.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption49#RateDetails
 * SecuritiesOption49.RateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#GeneralInformation
 * CorporateActionEventAndBalance9.GeneralInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption50#RateDetails
 * SecuritiesOption50.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction34#DateDetails
 * CorporateAction34.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction35#DateDetails
 * CorporateAction35.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction36#DateDetails
 * CorporateAction36.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction38#DateDetails
 * CorporateAction38.DateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction40#DateDetails
 * CorporateAction40.DateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction40#PeriodDetails
 * CorporateAction40.PeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction40#RateAndAmountDetails
 * CorporateAction40.RateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption55#RateDetails
 * SecuritiesOption55.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption57#RateDetails
 * SecuritiesOption57.RateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance10#GeneralInformation
 * CorporateActionEventAndBalance10.GeneralInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption60#RateDetails
 * SecuritiesOption60.RateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption59#RateDetails
 * SecuritiesOption59.RateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#GeneralInformation
 * CorporateActionEventAndBalance11.GeneralInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption61#RateDetails
 * SecuritiesOption61.RateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance12#GeneralInformation
 * CorporateActionEventAndBalance12.GeneralInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption63#RateDetails
 * SecuritiesOption63.RateDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.VoluntaryCorporateAction
 * VoluntaryCorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandatoryCorporateAction
 * MandatoryCorporateAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} = List of 519 elements</li>
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
 * "CorporateActionEvent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition."
 * </li>
 * </ul>
 */
public class CorporateActionEvent {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
	 * CorporateActionEventTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType3Choice#Code
	 * CorporateActionEventType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType3Choice#Proprietary
	 * CorporateActionEventType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#EventType
	 * CorporateActionGeneralInformation8.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType4Choice#Code
	 * CorporateActionEventType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType4Choice#Proprietary
	 * CorporateActionEventType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#EventType
	 * CorporateActionGeneralInformation20.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#EventType
	 * CorporateActionGeneralInformation25.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#EventType
	 * CorporateActionGeneralInformation32.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType7Choice#Code
	 * CorporateActionEventType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType7Choice#Proprietary
	 * CorporateActionEventType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#EventType
	 * CorporateActionGeneralInformation35.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType9Choice#Code
	 * CorporateActionEventType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType9Choice#Proprietary
	 * CorporateActionEventType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#EventType
	 * CorporateActionGeneralInformation43.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType11Choice#Code
	 * CorporateActionEventType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType11Choice#Proprietary
	 * CorporateActionEventType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType14Choice#Code
	 * CorporateActionEventType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType14Choice#Proprietary
	 * CorporateActionEventType14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#EventType
	 * CorporateActionGeneralInformation53.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType13Choice#Code
	 * CorporateActionEventType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType13Choice#Proprietary
	 * CorporateActionEventType13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#EventType
	 * CorporateActionGeneralInformation56.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType21Choice#Code
	 * CorporateActionEventType21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType21Choice#Proprietary
	 * CorporateActionEventType21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#EventType
	 * CorporateActionGeneralInformation57.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#EventType
	 * CorporateActionGeneralInformation9.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#EventType
	 * CorporateActionGeneralInformation13.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#EventType
	 * CorporateActionGeneralInformation34.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#EventType
	 * CorporateActionGeneralInformation42.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#EventType
	 * CorporateActionGeneralInformation52.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType22Choice#Code
	 * CorporateActionEventType22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType22Choice#Proprietary
	 * CorporateActionEventType22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#EventType
	 * CorporateActionGeneralInformation58.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#EventType
	 * CorporateActionGeneralInformation6.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#EventType
	 * CorporateActionGeneralInformation15.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#EventType
	 * CorporateActionGeneralInformation21.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#EventType
	 * CorporateActionGeneralInformation28.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#EventType
	 * CorporateActionGeneralInformation36.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#EventType
	 * CorporateActionGeneralInformation44.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#EventType
	 * CorporateActionGeneralInformation55.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#EventType
	 * CorporateActionGeneralInformation61.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7#EventType
	 * CorporateActionGeneralInformation7.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26#EventType
	 * CorporateActionGeneralInformation26.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33#EventType
	 * CorporateActionGeneralInformation33.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27#EventType
	 * CorporateActionGeneralInformation27.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41#EventType
	 * CorporateActionGeneralInformation41.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49#EventType
	 * CorporateActionGeneralInformation49.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68#EventType
	 * CorporateActionGeneralInformation68.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#EventType
	 * EventInformation1.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#EventType
	 * EventInformation2.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#EventType
	 * EventInformation3.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#EventType
	 * EventInformation4.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#EventType
	 * EventInformation5.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#EventType
	 * EventInformation6.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#EventType
	 * CorporateActionGeneralInformation4.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#EventType
	 * CorporateActionGeneralInformation16.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType5Choice#Code
	 * CorporateActionEventType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType5Choice#Proprietary
	 * CorporateActionEventType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#EventType
	 * CorporateActionGeneralInformation24.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType6Choice#Code
	 * CorporateActionEventType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType6Choice#Proprietary
	 * CorporateActionEventType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#EventType
	 * CorporateActionGeneralInformation29.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType8Choice#Code
	 * CorporateActionEventType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType8Choice#Proprietary
	 * CorporateActionEventType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#EventType
	 * CorporateActionGeneralInformation39.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType10Choice#Code
	 * CorporateActionEventType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType10Choice#Proprietary
	 * CorporateActionEventType10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#EventType
	 * CorporateActionGeneralInformation47.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType12Choice#Code
	 * CorporateActionEventType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType12Choice#Proprietary
	 * CorporateActionEventType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#EventType
	 * CorporateActionGeneralInformation50.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType27Choice#Code
	 * CorporateActionEventType27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType27Choice#Proprietary
	 * CorporateActionEventType27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#EventType
	 * CorporateActionGeneralInformation62.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#EventType
	 * CorporateActionGeneralInformation3.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#EventType
	 * CorporateActionGeneralInformation17.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#EventType
	 * CorporateActionGeneralInformation23.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#EventType
	 * CorporateActionGeneralInformation30.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#EventType
	 * CorporateActionGeneralInformation38.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#EventType
	 * CorporateActionGeneralInformation46.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#EventType
	 * CorporateActionGeneralInformation54.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType28Choice#Code
	 * CorporateActionEventType28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType28Choice#Proprietary
	 * CorporateActionEventType28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#EventType
	 * CorporateActionGeneralInformation64.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#EventType
	 * CorporateActionGeneralInformation63.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#EventType
	 * CorporateActionGeneralInformation11.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#EventType
	 * CorporateActionGeneralInformation19.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#EventType
	 * CorporateActionGeneralInformation22.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#EventType
	 * CorporateActionGeneralInformation31.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#EventType
	 * CorporateActionGeneralInformation37.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#EventType
	 * CorporateActionGeneralInformation45.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#EventType
	 * CorporateActionGeneralInformation51.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#EventType
	 * CorporateActionGeneralInformation67.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType16Choice#Code
	 * CorporateActionEventType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType16Choice#Proprietary
	 * CorporateActionEventType16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType17Choice#Code
	 * CorporateActionEventType17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType17Choice#Proprietary
	 * CorporateActionEventType17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#CorporateActionEventType
	 * IntraPositionMovementDetails1.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#CorporateActionEventType
	 * IntraPositionMovementDetails2.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#CorporateActionEventType
	 * IntraPositionMovementDetails5.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#CorporateActionEventType
	 * IntraPositionMovementDetails6.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#CorporateActionEventType
	 * IntraPositionMovementDetails7.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#CorporateActionEventType
	 * IntraPositionMovementDetails8.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#CorporateActionEventType
	 * IntraPositionMovementDetails9.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#CorporateActionEventType
	 * IntraPositionMovementDetails10.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1Choice#Code
	 * CorporateActionEventType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1Choice#Proprietary
	 * CorporateActionEventType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent2Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2Choice#Code
	 * CorporateActionEventType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2Choice#Proprietary
	 * CorporateActionEventType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent3Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent6Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent8Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType15Choice#Code
	 * CorporateActionEventType15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType15Choice#Proprietary
	 * CorporateActionEventType15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent10Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType19Choice#Code
	 * CorporateActionEventType19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType19Choice#Proprietary
	 * CorporateActionEventType19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent11Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent1Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent4Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent5Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent7Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent9Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent12Choice.CorporateActionEventType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction9#EventType
	 * CorporateAction9.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1CodeChoice#Structured
	 * CorporateActionEventType1CodeChoice.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1CodeChoice#Unstructured
	 * CorporateActionEventType1CodeChoice.Unstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#CorporateActionEventType
	 * InvestmentFundTransaction2.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#CorporateActionEventType
	 * InvestmentFundTransaction3.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#ExtendedCorporateActionEventType
	 * InvestmentFundTransaction3.ExtendedCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice#Code
	 * CorporateActionEventType2FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice#Proprietary
	 * CorporateActionEventType2FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#EventType
	 * CorporateActionInformation2.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice#Code
	 * CorporateActionFrequencyType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice#Proprietary
	 * CorporateActionFrequencyType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#EventType
	 * CorporateActionInformation1.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#EventType
	 * CorporateActionStandingInstructionGeneralInformation1.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14#EventType
	 * CorporateActionGeneralInformation14.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#CorporateActionEventType
	 * IntraPositionMovementDetails3.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#CorporateActionEventType
	 * IntraPositionMovementDetails4.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#EventType
	 * CorporateActionGeneralInformation12.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#EventType
	 * CorporateActionGeneralInformation5.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#EventType
	 * CorporateActionGeneralInformation71.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#EventType
	 * CorporateActionGeneralInformation69.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#EventType
	 * CorporateActionGeneralInformation70.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#EventType
	 * CorporateActionGeneralInformation78.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#EventType
	 * CorporateActionGeneralInformation77.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#EventType
	 * CorporateActionGeneralInformation76.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice#CorporateActionType
	 * TransactionType1Choice.CorporateActionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateAction1Choice#Type
	 * CorporateAction1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateAction1Choice#Proprietary
	 * CorporateAction1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#EventType
	 * CorporateActionGeneralInformation79.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#EventType
	 * CorporateActionGeneralInformation83.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#EventType
	 * CorporateActionGeneralInformation82.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent14Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType30Choice#Code
	 * CorporateActionEventType30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType30Choice#Proprietary
	 * CorporateActionEventType30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice#Code
	 * CorporateActionEventType29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice#Proprietary
	 * CorporateActionEventType29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#CorporateActionEventType
	 * IntraPositionMovementDetails11.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent13Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#EventType
	 * CorporateActionGeneralInformation89.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#EventType
	 * CorporateActionGeneralInformation88.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#EventType
	 * CorporateActionGeneralInformation86.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#EventType
	 * CorporateActionGeneralInformation91.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#EventType
	 * CorporateActionGeneralInformation87.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#EventType
	 * CorporateActionGeneralInformation84.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#EventType
	 * CorporateActionGeneralInformation85.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90#EventType
	 * CorporateActionGeneralInformation90.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType33Choice#Code
	 * CorporateActionEventType33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType33Choice#Proprietary
	 * CorporateActionEventType33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType32Choice#Code
	 * CorporateActionEventType32Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType32Choice#Proprietary
	 * CorporateActionEventType32Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType34Choice#Code
	 * CorporateActionEventType34Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType34Choice#Proprietary
	 * CorporateActionEventType34Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType31Choice#Code
	 * CorporateActionEventType31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType31Choice#Proprietary
	 * CorporateActionEventType31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#EventType
	 * EventInformation7.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#EventType
	 * CorporateActionGeneralInformation93.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#EventType
	 * CorporateActionGeneralInformation98.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#EventType
	 * CorporateActionGeneralInformation100.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#EventType
	 * CorporateActionGeneralInformation97.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#EventType
	 * CorporateActionGeneralInformation99.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#EventType
	 * CorporateActionGeneralInformation94.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#EventType
	 * CorporateActionGeneralInformation103.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType42Choice#Code
	 * CorporateActionEventType42Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType42Choice#Proprietary
	 * CorporateActionEventType42Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType35Choice#Code
	 * CorporateActionEventType35Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType35Choice#Proprietary
	 * CorporateActionEventType35Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType41Choice#Code
	 * CorporateActionEventType41Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType41Choice#Proprietary
	 * CorporateActionEventType41Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#EventType
	 * EventInformation8.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType36Choice#Code
	 * CorporateActionEventType36Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType36Choice#Proprietary
	 * CorporateActionEventType36Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType46Choice#Code
	 * CorporateActionEventType46Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType46Choice#Proprietary
	 * CorporateActionEventType46Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent16Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent15Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType48Choice#Code
	 * CorporateActionEventType48Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType48Choice#Proprietary
	 * CorporateActionEventType48Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#CorporateActionEventType
	 * IntraPositionMovementDetails12.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104#EventType
	 * CorporateActionGeneralInformation104.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType50Choice#Code
	 * CorporateActionEventType50Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType50Choice#Proprietary
	 * CorporateActionEventType50Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#EventType
	 * CorporateActionGeneralInformation109.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#EventType
	 * CorporateActionGeneralInformation111.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#EventType
	 * CorporateActionGeneralInformation112.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#EventType
	 * CorporateActionGeneralInformation110.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#EventType
	 * CorporateActionGeneralInformation105.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#EventType
	 * CorporateActionGeneralInformation107.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#EventType
	 * CorporateActionGeneralInformation106.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#EventType
	 * CorporateActionGeneralInformation108.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice#Code
	 * CorporateActionEventType51Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice#Proprietary
	 * CorporateActionEventType51Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#Code
	 * CorporateActionEventType52Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#Proprietary
	 * CorporateActionEventType52Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice#Code
	 * CorporateActionEventType54Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice#Proprietary
	 * CorporateActionEventType54Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#EventType
	 * EventInformation9.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice#Code
	 * CorporateActionEventType53Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice#Proprietary
	 * CorporateActionEventType53Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent19Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent17Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#CorporateActionEventType
	 * IntraPositionMovementDetails13.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice#Code
	 * CorporateActionEventType56Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice#Proprietary
	 * CorporateActionEventType56Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#EventType
	 * CorporateActionGeneralInformation114.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#EventType
	 * CorporateActionGeneralInformation120.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#EventType
	 * CorporateActionGeneralInformation115.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#EventType
	 * CorporateActionGeneralInformation118.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121#EventType
	 * CorporateActionGeneralInformation121.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#EventType
	 * CorporateActionGeneralInformation123.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#EventType
	 * CorporateActionGeneralInformation117.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#EventType
	 * CorporateActionGeneralInformation113.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType62Choice#Code
	 * CorporateActionEventType62Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType62Choice#Proprietary
	 * CorporateActionEventType62Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType61Choice#Code
	 * CorporateActionEventType61Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType61Choice#Proprietary
	 * CorporateActionEventType61Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#EventType
	 * EventInformation10.EventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#CorporateActionEventType
	 * IntraPositionMovementDetails14.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent20Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType71Choice#Code
	 * CorporateActionEventType71Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType71Choice#Proprietary
	 * CorporateActionEventType71Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType69Choice#Code
	 * CorporateActionEventType69Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType69Choice#Proprietary
	 * CorporateActionEventType69Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice#CorporateActionEventType
	 * SettlementOrCorporateActionEvent21Choice.CorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType57Choice#Code
	 * CorporateActionEventType57Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType57Choice#Proprietary
	 * CorporateActionEventType57Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType58Choice#Code
	 * CorporateActionEventType58Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType58Choice#Proprietary
	 * CorporateActionEventType58Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventType3Choice.Code, com.tools20022.repository.choice.CorporateActionEventType3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation8.EventType, com.tools20022.repository.choice.CorporateActionEventType4Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType4Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation20.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation25.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation32.EventType,
					com.tools20022.repository.choice.CorporateActionEventType7Choice.Code, com.tools20022.repository.choice.CorporateActionEventType7Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation35.EventType, com.tools20022.repository.choice.CorporateActionEventType9Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType9Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation43.EventType,
					com.tools20022.repository.choice.CorporateActionEventType11Choice.Code, com.tools20022.repository.choice.CorporateActionEventType11Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType14Choice.Code, com.tools20022.repository.choice.CorporateActionEventType14Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation53.EventType, com.tools20022.repository.choice.CorporateActionEventType13Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType13Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation56.EventType,
					com.tools20022.repository.choice.CorporateActionEventType21Choice.Code, com.tools20022.repository.choice.CorporateActionEventType21Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation57.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation9.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation13.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation34.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation42.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation52.EventType,
					com.tools20022.repository.choice.CorporateActionEventType22Choice.Code, com.tools20022.repository.choice.CorporateActionEventType22Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation58.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation6.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation15.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation21.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation28.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation36.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation44.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation55.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation61.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation7.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation26.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation33.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation27.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation41.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation49.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation68.EventType, com.tools20022.repository.msg.EventInformation1.EventType,
					com.tools20022.repository.msg.EventInformation2.EventType, com.tools20022.repository.msg.EventInformation3.EventType, com.tools20022.repository.msg.EventInformation4.EventType,
					com.tools20022.repository.msg.EventInformation5.EventType, com.tools20022.repository.msg.EventInformation6.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation4.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation16.EventType, com.tools20022.repository.choice.CorporateActionEventType5Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType5Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation24.EventType,
					com.tools20022.repository.choice.CorporateActionEventType6Choice.Code, com.tools20022.repository.choice.CorporateActionEventType6Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation29.EventType, com.tools20022.repository.choice.CorporateActionEventType8Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType8Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation39.EventType,
					com.tools20022.repository.choice.CorporateActionEventType10Choice.Code, com.tools20022.repository.choice.CorporateActionEventType10Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation47.EventType, com.tools20022.repository.choice.CorporateActionEventType12Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType12Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation50.EventType,
					com.tools20022.repository.choice.CorporateActionEventType27Choice.Code, com.tools20022.repository.choice.CorporateActionEventType27Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation62.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation3.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation17.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation23.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation30.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation38.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation46.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation54.EventType,
					com.tools20022.repository.choice.CorporateActionEventType28Choice.Code, com.tools20022.repository.choice.CorporateActionEventType28Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation64.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation63.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation19.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation31.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation45.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation67.EventType,
					com.tools20022.repository.choice.CorporateActionEventType16Choice.Code, com.tools20022.repository.choice.CorporateActionEventType16Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType17Choice.Code, com.tools20022.repository.choice.CorporateActionEventType17Choice.Proprietary,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails2.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails6.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails8.CorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails10.CorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType1Choice.Code, com.tools20022.repository.choice.CorporateActionEventType1Choice.Proprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice.CorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType2Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType2Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice.CorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice.CorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice.CorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType15Choice.Code, com.tools20022.repository.choice.CorporateActionEventType15Choice.Proprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice.CorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType19Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType19Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.CorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice.CorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice.CorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice.CorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice.CorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice.CorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice.CorporateActionEventType,
					com.tools20022.repository.msg.CorporateAction9.EventType, com.tools20022.repository.choice.CorporateActionEventType1CodeChoice.Structured,
					com.tools20022.repository.choice.CorporateActionEventType1CodeChoice.Unstructured, com.tools20022.repository.msg.InvestmentFundTransaction2.CorporateActionEventType,
					com.tools20022.repository.msg.InvestmentFundTransaction3.CorporateActionEventType, com.tools20022.repository.msg.InvestmentFundTransaction3.ExtendedCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType2FormatChoice.Code, com.tools20022.repository.choice.CorporateActionEventType2FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionInformation2.EventType, com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice.Code,
					com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateActionInformation1.EventType,
					com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation14.EventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails3.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails4.CorporateActionEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation5.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation71.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation69.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation70.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation78.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation77.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation76.EventType,
					com.tools20022.repository.choice.TransactionType1Choice.CorporateActionType, com.tools20022.repository.choice.CorporateAction1Choice.Type, com.tools20022.repository.choice.CorporateAction1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation83.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.EventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice.CorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType30Choice.Code, com.tools20022.repository.choice.CorporateActionEventType30Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType29Choice.Code, com.tools20022.repository.choice.CorporateActionEventType29Choice.Proprietary,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.CorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice.CorporateActionEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation89.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation88.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation86.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation91.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation87.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation84.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation85.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation90.EventType,
					com.tools20022.repository.choice.CorporateActionEventType33Choice.Code, com.tools20022.repository.choice.CorporateActionEventType33Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType32Choice.Code, com.tools20022.repository.choice.CorporateActionEventType32Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType34Choice.Code, com.tools20022.repository.choice.CorporateActionEventType34Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType31Choice.Code, com.tools20022.repository.choice.CorporateActionEventType31Choice.Proprietary, com.tools20022.repository.msg.EventInformation7.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation93.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation98.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation100.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation97.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation99.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation94.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation103.EventType, com.tools20022.repository.choice.CorporateActionEventType42Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType42Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventType35Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType35Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventType41Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType41Choice.Proprietary, com.tools20022.repository.msg.EventInformation8.EventType, com.tools20022.repository.choice.CorporateActionEventType36Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType36Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventType46Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType46Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice.CorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice.CorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType48Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType48Choice.Proprietary, com.tools20022.repository.msg.IntraPositionMovementDetails12.CorporateActionEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation104.EventType, com.tools20022.repository.choice.CorporateActionEventType50Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType50Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation109.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation111.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation112.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation110.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation105.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation107.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation106.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation108.EventType, com.tools20022.repository.choice.CorporateActionEventType51Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType51Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventType52Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType52Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventType54Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType54Choice.Proprietary, com.tools20022.repository.msg.EventInformation9.EventType, com.tools20022.repository.choice.CorporateActionEventType53Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType53Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice.CorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice.CorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails13.CorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType56Choice.Code, com.tools20022.repository.choice.CorporateActionEventType56Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation114.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation120.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation115.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation118.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation121.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation123.EventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.EventType, com.tools20022.repository.msg.CorporateActionGeneralInformation113.EventType,
					com.tools20022.repository.choice.CorporateActionEventType62Choice.Code, com.tools20022.repository.choice.CorporateActionEventType62Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType61Choice.Code, com.tools20022.repository.choice.CorporateActionEventType61Choice.Proprietary, com.tools20022.repository.msg.EventInformation10.EventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails14.CorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.CorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType71Choice.Code, com.tools20022.repository.choice.CorporateActionEventType71Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventType69Choice.Code, com.tools20022.repository.choice.CorporateActionEventType69Choice.Proprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice.CorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType57Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType57Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventType58Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventType58Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}
	};
	/**
	 * Specifies whether the event is mandatory, mandatory with options or
	 * voluntary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
	 * CorporateActionMandatoryVoluntaryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice#Code
	 * CorporateActionMandatoryVoluntary1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice#Proprietary
	 * CorporateActionMandatoryVoluntary1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation8.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice#Code
	 * CorporateActionMandatoryVoluntary2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice#Proprietary
	 * CorporateActionMandatoryVoluntary2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation20.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation25.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation32.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation35.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation43.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation53.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation56.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation57.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#MandatoryVoluntaryEventType
	 * EventInformation1.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#MandatoryVoluntaryEventType
	 * EventInformation2.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#MandatoryVoluntaryEventType
	 * EventInformation3.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#MandatoryVoluntaryEventType
	 * EventInformation4.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#MandatoryVoluntaryEventType
	 * EventInformation5.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#MandatoryVoluntaryEventType
	 * EventInformation6.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation3.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation17.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation23.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation30.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation38.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation46.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation54.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation64.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation63.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation11.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation19.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation22.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation31.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation37.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation45.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation51.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation67.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice#Code
	 * CorporateActionMandatoryVoluntary1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice#Proprietary
	 * CorporateActionMandatoryVoluntary1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#MandatoryVoluntaryEventType
	 * CorporateActionInformation2.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#MandatoryVoluntaryEventType
	 * CorporateActionInformation1.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation12.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation69.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation70.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation78.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation76.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation86.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation87.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation84.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation85.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice#Code
	 * CorporateActionMandatoryVoluntary3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice#Proprietary
	 * CorporateActionMandatoryVoluntary3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#MandatoryVoluntaryEventType
	 * EventInformation7.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation93.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation100.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation99.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation103.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#MandatoryVoluntaryEventType
	 * EventInformation8.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice#Code
	 * CorporateActionMandatoryVoluntary4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice#Proprietary
	 * CorporateActionMandatoryVoluntary4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation112.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation105.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation106.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation108.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#MandatoryVoluntaryEventType
	 * EventInformation9.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation120.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation123.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation117.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#MandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation113.MandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#MandatoryVoluntaryEventType
	 * EventInformation10.MandatoryVoluntaryEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MandatoryVoluntaryEventType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice.Code, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation8.MandatoryVoluntaryEventType, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice.Code,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation20.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation25.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation32.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation35.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation43.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation53.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation56.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation57.MandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation1.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation2.MandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation3.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation4.MandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation5.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation6.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation3.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation17.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation23.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation30.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation38.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation46.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation54.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation64.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation63.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation19.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation31.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation45.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation67.MandatoryVoluntaryEventType,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice.Code, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionInformation2.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionInformation1.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation69.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation70.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation78.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation76.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation86.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation87.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation84.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation85.MandatoryVoluntaryEventType, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice.Code,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice.Proprietary, com.tools20022.repository.msg.EventInformation7.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation93.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation100.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation99.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation103.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation8.MandatoryVoluntaryEventType, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice.Code,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation112.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation105.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation106.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation108.MandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation9.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation120.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation123.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.MandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation113.MandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation10.MandatoryVoluntaryEventType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}
	};
	/**
	 * Security to which this instruction or event applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#CorporateEvent
	 * Security.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#UnderlyingSecurity
	 * CorporateActionGeneralInformation6.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#UnderlyingSecurity
	 * CorporateActionGeneralInformation15.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#UnderlyingSecurity
	 * CorporateActionGeneralInformation21.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#UnderlyingSecurity
	 * CorporateActionGeneralInformation28.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#UnderlyingSecurity
	 * CorporateActionGeneralInformation36.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#UnderlyingSecurity
	 * CorporateActionGeneralInformation44.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#UnderlyingSecurity
	 * CorporateActionGeneralInformation55.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#UnderlyingSecurity
	 * CorporateActionGeneralInformation61.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance1#UnderlyingSecurity
	 * CorporateActionEventAndBalance1.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance2#UnderlyingSecurity
	 * CorporateActionEventAndBalance2.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance3#UnderlyingSecurity
	 * CorporateActionEventAndBalance3.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#UnderlyingSecurity
	 * CorporateActionEventAndBalance4.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5#UnderlyingSecurity
	 * CorporateActionEventAndBalance5.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance6#UnderlyingSecurity
	 * CorporateActionEventAndBalance6.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#UnderlyingSecurity
	 * CorporateActionEventAndBalance7.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8#UnderlyingSecurity
	 * CorporateActionEventAndBalance8.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#DateDetails
	 * SecuritiesOption3.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#DateDetails
	 * SecuritiesOption8.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#DateDetails
	 * SecuritiesOption18.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#DateDetails
	 * SecuritiesOption20.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#DateDetails
	 * SecuritiesOption26.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#DateDetails
	 * SecuritiesOption31.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#DateDetails
	 * SecuritiesOption35.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#DateDetails
	 * SecuritiesOption36.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#UnderlyingSecurity
	 * CorporateActionGeneralInformation3.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#SecurityDetails
	 * SecuritiesOption4.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#DateDetails
	 * SecuritiesOption4.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#UnderlyingSecurity
	 * CorporateActionGeneralInformation17.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#SecurityDetails
	 * SecuritiesOption10.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#DateDetails
	 * SecuritiesOption10.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#UnderlyingSecurity
	 * CorporateActionGeneralInformation23.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#SecurityDetails
	 * SecuritiesOption13.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#DateDetails
	 * SecuritiesOption13.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#UnderlyingSecurity
	 * CorporateActionGeneralInformation30.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#SecurityDetails
	 * SecuritiesOption17.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#DateDetails
	 * SecuritiesOption17.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#UnderlyingSecurity
	 * CorporateActionGeneralInformation38.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#SecurityDetails
	 * SecuritiesOption24.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#DateDetails
	 * SecuritiesOption24.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#UnderlyingSecurity
	 * CorporateActionGeneralInformation46.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#SecurityDetails
	 * SecuritiesOption29.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#DateDetails
	 * SecuritiesOption29.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#UnderlyingSecurity
	 * CorporateActionGeneralInformation54.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#SecurityDetails
	 * SecuritiesOption33.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#DateDetails
	 * SecuritiesOption33.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#SecurityDetails
	 * SecuritiesOption38.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#DateDetails
	 * SecuritiesOption38.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#UnderlyingSecurity
	 * CorporateActionGeneralInformation64.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#SecurityDetails
	 * SecuritiesOption37.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#DateDetails
	 * SecuritiesOption37.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#SecurityDetails
	 * SecuritiesOption39.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#DateDetails
	 * SecuritiesOption39.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#UnderlyingSecurity
	 * CorporateActionGeneralInformation11.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#SecurityDetails
	 * SecuritiesOption6.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#DateDetails
	 * SecuritiesOption6.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#UnderlyingSecurity
	 * CorporateActionGeneralInformation19.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#SecurityDetails
	 * SecuritiesOption12.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#DateDetails
	 * SecuritiesOption12.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#UnderlyingSecurity
	 * CorporateActionGeneralInformation22.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#SecurityDetails
	 * SecuritiesOption14.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#DateDetails
	 * SecuritiesOption14.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#UnderlyingSecurity
	 * CorporateActionGeneralInformation31.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#SecurityDetails
	 * SecuritiesOption22.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#DateDetails
	 * SecuritiesOption22.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#UnderlyingSecurity
	 * CorporateActionGeneralInformation37.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#SecurityDetails
	 * SecuritiesOption25.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#DateDetails
	 * SecuritiesOption25.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#UnderlyingSecurity
	 * CorporateActionGeneralInformation45.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#SecurityDetails
	 * SecuritiesOption30.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#DateDetails
	 * SecuritiesOption30.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#UnderlyingSecurity
	 * CorporateActionGeneralInformation51.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#UnderlyingSecurity
	 * CorporateActionGeneralInformation67.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#UnderlyingSecurity
	 * CorporateActionInformation2.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#OtherUnderlyingSecurity
	 * CorporateActionInformation2.OtherUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#UnderlyingSecurity
	 * CorporateActionInformation1.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#UnderlyingSecurity
	 * CorporateActionStandingInstructionGeneralInformation1.UnderlyingSecurity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#UnderlyingSecurity
	 * CorporateActionGeneralInformation5.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#UnderlyingSecurity
	 * CorporateActionGeneralInformation71.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#UnderlyingSecurity
	 * CorporateActionGeneralInformation69.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#UnderlyingSecurity
	 * CorporateActionGeneralInformation70.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#DateDetails
	 * SecuritiesOption42.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#SecurityDetails
	 * SecuritiesOption40.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#DateDetails
	 * SecuritiesOption40.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#UnderlyingSecurity
	 * CorporateActionGeneralInformation78.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#UnderlyingSecurity
	 * CorporateActionGeneralInformation77.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#UnderlyingSecurity
	 * CorporateActionGeneralInformation76.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#DateDetails
	 * SecuritiesOption48.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#SecurityDetails
	 * SecuritiesOption45.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#DateDetails
	 * SecuritiesOption45.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#UnderlyingSecurity
	 * CorporateActionGeneralInformation88.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#UnderlyingSecurity
	 * CorporateActionGeneralInformation84.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#UnderlyingSecurity
	 * CorporateActionGeneralInformation85.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#SecurityDetails
	 * SecuritiesOption49.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#DateDetails
	 * SecuritiesOption49.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#UnderlyingSecurity
	 * CorporateActionEventAndBalance9.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#DateDetails
	 * SecuritiesOption50.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#UnderlyingSecurity
	 * CorporateActionGeneralInformation100.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#UnderlyingSecurity
	 * CorporateActionGeneralInformation97.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#UnderlyingSecurity
	 * CorporateActionGeneralInformation103.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#DateDetails
	 * SecuritiesOption55.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#SecurityDetails
	 * SecuritiesOption57.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#DateDetails
	 * SecuritiesOption57.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance10#UnderlyingSecurity
	 * CorporateActionEventAndBalance10.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#UnderlyingSecurity
	 * CorporateActionGeneralInformation105.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#UnderlyingSecurity
	 * CorporateActionGeneralInformation107.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#UnderlyingSecurity
	 * CorporateActionGeneralInformation106.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#DateDetails
	 * SecuritiesOption60.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#SecurityDetails
	 * SecuritiesOption59.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#DateDetails
	 * SecuritiesOption59.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#UnderlyingSecurity
	 * CorporateActionEventAndBalance11.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#UnderlyingSecurity
	 * CorporateActionGeneralInformation115.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#UnderlyingSecurity
	 * CorporateActionGeneralInformation117.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#UnderlyingSecurity
	 * CorporateActionGeneralInformation113.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#SecurityDetails
	 * SecuritiesOption61.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#DateDetails
	 * SecuritiesOption61.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance12#UnderlyingSecurity
	 * CorporateActionEventAndBalance12.UnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#DateDetails
	 * SecuritiesOption63.DateDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security to which this instruction or event applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation6.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation15.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation21.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation28.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation36.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation44.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation55.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation61.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance1.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance2.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance3.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance4.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance5.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance6.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance7.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance8.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption3.DateDetails, com.tools20022.repository.msg.SecuritiesOption8.DateDetails, com.tools20022.repository.msg.SecuritiesOption18.DateDetails,
					com.tools20022.repository.msg.SecuritiesOption20.DateDetails, com.tools20022.repository.msg.SecuritiesOption26.DateDetails, com.tools20022.repository.msg.SecuritiesOption31.DateDetails,
					com.tools20022.repository.msg.SecuritiesOption35.DateDetails, com.tools20022.repository.msg.SecuritiesOption36.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation3.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption4.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption4.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation17.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption10.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption10.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation23.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption13.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption13.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation30.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption17.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption17.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation38.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption24.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption24.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation46.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption29.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption29.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation54.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption33.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption33.DateDetails, com.tools20022.repository.msg.SecuritiesOption38.SecurityDetails,
					com.tools20022.repository.msg.SecuritiesOption38.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation64.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption37.SecurityDetails,
					com.tools20022.repository.msg.SecuritiesOption37.DateDetails, com.tools20022.repository.msg.SecuritiesOption39.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption39.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption6.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption6.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation19.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption12.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption12.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption14.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption14.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation31.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption22.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption22.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption25.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption25.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation45.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption30.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption30.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation67.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionInformation2.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionInformation2.OtherUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionInformation1.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation5.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation71.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation70.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption42.DateDetails, com.tools20022.repository.msg.SecuritiesOption40.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption40.DateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation77.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation76.UnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption48.DateDetails, com.tools20022.repository.msg.SecuritiesOption45.SecurityDetails,
					com.tools20022.repository.msg.SecuritiesOption45.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation88.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation84.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation85.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption49.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption49.DateDetails, com.tools20022.repository.msg.CorporateActionEventAndBalance9.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption50.DateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation100.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation97.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation103.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption55.DateDetails, com.tools20022.repository.msg.SecuritiesOption57.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption57.DateDetails,
					com.tools20022.repository.msg.CorporateActionEventAndBalance10.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation105.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation107.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation106.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption60.DateDetails, com.tools20022.repository.msg.SecuritiesOption59.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption59.DateDetails,
					com.tools20022.repository.msg.CorporateActionEventAndBalance11.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation115.UnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.UnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation113.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption61.SecurityDetails, com.tools20022.repository.msg.SecuritiesOption61.DateDetails, com.tools20022.repository.msg.CorporateActionEventAndBalance12.UnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption63.DateDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies prices related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionEvent
	 * CorporateActionPrice.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#PriceDetails
	 * CorporateActionOption5.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#PriceDetails
	 * CorporateActionOption13.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#PriceDetails
	 * CorporateActionOption25.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#PriceDetails
	 * CorporateActionOption30.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#PriceDetails
	 * CorporateActionOption38.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#PriceDetails
	 * CorporateActionOption47.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#PriceDetails
	 * CorporateActionOption57.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#PriceDetails
	 * CorporateActionOption58.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#PriceDetails
	 * SecuritiesOption3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#PriceDetails
	 * CorporateActionOption4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#PriceDetails
	 * SecuritiesOption8.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#PriceDetails
	 * CorporateActionOption14.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#PriceDetails
	 * SecuritiesOption18.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#PriceDetails
	 * CashOption12.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#PriceDetails
	 * CorporateActionOption23.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#PriceDetails
	 * SecuritiesOption20.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#PriceDetails
	 * CashOption13.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#PriceDetails
	 * CorporateActionOption31.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#PriceDetails
	 * SecuritiesOption26.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#PriceDetails
	 * CashOption18.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#PriceDetails
	 * CorporateActionOption37.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#PriceDetails
	 * SecuritiesOption31.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#PriceDetails
	 * CashOption22.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#PriceDetails
	 * CorporateActionOption46.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#PriceDetails
	 * SecuritiesOption35.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#PriceDetails
	 * CashOption26.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#PriceDetails
	 * CorporateActionOption53.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#PriceDetails
	 * SecuritiesOption36.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#PriceDetails
	 * CashOption27.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#PriceDetails
	 * CorporateActionOption54.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#PriceDetails
	 * SecuritiesOption4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#PriceDetails
	 * CorporateActionOption10.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#PriceDetails
	 * SecuritiesOption10.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#PriceDetails
	 * CorporateActionOption15.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#PriceDetails
	 * SecuritiesOption13.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#PriceDetails
	 * CashOption11.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#PriceDetails
	 * CorporateActionOption20.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#PriceDetails
	 * SecuritiesOption17.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption14#PriceDetails
	 * CashOption14.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#PriceDetails
	 * CorporateActionOption32.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#PriceDetails
	 * SecuritiesOption24.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption16#PriceDetails
	 * CashOption16.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#PriceDetails
	 * CorporateActionOption35.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#PriceDetails
	 * SecuritiesOption29.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption20#PriceDetails
	 * CashOption20.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#PriceDetails
	 * CorporateActionOption44.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#PriceDetails
	 * SecuritiesOption33.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#PriceDetails
	 * SecuritiesOption38.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption25#PriceDetails
	 * CashOption25.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#PriceDetails
	 * CorporateActionOption52.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#PriceDetails
	 * SecuritiesOption37.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#PriceDetails
	 * SecuritiesOption39.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption28#PriceDetails
	 * CashOption28.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#PriceDetails
	 * CorporateActionOption55.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#PriceDetails
	 * CorporateAction3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#PriceDetails
	 * SecuritiesOption6.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#PriceDetails
	 * CorporateActionOption3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#PriceDetails
	 * CorporateAction4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#PriceDetails
	 * SecuritiesOption12.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#PriceDetails
	 * CorporateActionOption17.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#PriceDetails
	 * CorporateAction5.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#PriceDetails
	 * SecuritiesOption14.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption10#PriceDetails
	 * CashOption10.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#PriceDetails
	 * CorporateActionOption19.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#PriceDetails
	 * CorporateAction6.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#PriceDetails
	 * SecuritiesOption22.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption15#PriceDetails
	 * CashOption15.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#PriceDetails
	 * CorporateActionOption34.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#PriceDetails
	 * CorporateAction7.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#PriceDetails
	 * SecuritiesOption25.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption17#PriceDetails
	 * CashOption17.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#PriceDetails
	 * CorporateActionOption36.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#PriceDetails
	 * CorporateAction8.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#PriceDetails
	 * SecuritiesOption30.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption21#PriceDetails
	 * CashOption21.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#PriceDetails
	 * CorporateActionOption45.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#PriceDetails
	 * CorporateAction10.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption24#PriceDetails
	 * CashOption24.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#PriceDetails
	 * CorporateActionOption51.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#PriceDetails
	 * CorporateAction11.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption29#PriceDetails
	 * CashOption29.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#PriceDetails
	 * CorporateActionOption56.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#PriceDetails
	 * CorporateAction2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#PriceDetails
	 * SecurityOption1.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#PriceDetails
	 * CorporateActionOption1.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#PriceDetails
	 * CorporateActionOption103.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#PriceDetails
	 * CorporateActionOption100.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#PriceDetails
	 * CorporateActionOption101.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#PriceDetails
	 * CorporateAction12.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#PriceDetails
	 * CorporateActionOption102.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#PriceDetails
	 * CashOption30.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#PriceDetails
	 * SecuritiesOption42.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption31#PriceDetails
	 * CashOption31.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#PriceDetails
	 * SecuritiesOption40.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption32#PriceDetails
	 * CashOption32.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#PriceDetails
	 * CorporateActionOption110.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#PriceDetails
	 * CorporateActionOption108.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#PriceDetails
	 * CorporateActionOption107.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#PriceDetails
	 * CorporateActionOption106.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#PriceDetails
	 * CorporateAction17.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption36#PriceDetails
	 * CashOption36.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption35#PriceDetails
	 * CashOption35.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#PriceDetails
	 * CashOption38.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#PriceDetails
	 * SecuritiesOption48.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#PriceDetails
	 * SecuritiesOption45.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#PriceDetails
	 * CorporateActionOption111.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#PriceDetails
	 * CashOption39.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#PriceDetails
	 * CorporateActionOption113.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#PriceDetails
	 * CashOption41.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#PriceDetails
	 * CorporateActionOption117.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#PriceDetails
	 * CorporateActionOption118.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#PriceDetails
	 * CorporateActionOption115.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#PriceDetails
	 * CorporateActionOption114.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#PriceDetails
	 * CorporateAction31.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#PriceDetails
	 * CashOption44.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#PriceDetails
	 * SecuritiesOption49.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption42#PriceDetails
	 * CashOption42.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption43#PriceDetails
	 * CashOption43.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#PriceDetails
	 * SecuritiesOption50.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#PriceDetails
	 * CorporateActionOption124.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#PriceDetails
	 * CorporateActionOption125.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#PriceDetails
	 * CorporateActionOption123.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#PriceDetails
	 * CorporateActionOption127.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#PriceDetails
	 * CorporateAction40.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#PriceDetails
	 * CashOption46.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#PriceDetails
	 * SecuritiesOption55.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption49#PriceDetails
	 * CashOption49.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption47#PriceDetails
	 * CashOption47.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#PriceDetails
	 * SecuritiesOption57.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#PriceDetails
	 * CorporateActionOption132.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#PriceDetails
	 * CorporateActionOption130.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#PriceDetails
	 * CorporateActionOption131.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#PriceDetails
	 * CorporateActionOption129.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#PriceDetails
	 * CashOption52.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#PriceDetails
	 * SecuritiesOption60.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#PriceDetails
	 * CashOption51.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#PriceDetails
	 * SecuritiesOption59.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#PriceDetails
	 * CashOption50.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#PriceDetails
	 * CorporateActionOption134.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#PriceDetails
	 * CorporateActionOption136.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#PriceDetails
	 * CorporateActionOption135.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#PriceDetails
	 * CorporateActionOption133.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption53#PriceDetails
	 * CashOption53.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#PriceDetails
	 * SecuritiesOption61.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#PriceDetails
	 * SecuritiesOption63.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption54#PriceDetails
	 * CashOption54.PriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#PriceDetails
	 * CashOption55.PriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies prices related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.PriceDetails, com.tools20022.repository.msg.CorporateActionOption13.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption25.PriceDetails, com.tools20022.repository.msg.CorporateActionOption30.PriceDetails, com.tools20022.repository.msg.CorporateActionOption38.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption47.PriceDetails, com.tools20022.repository.msg.CorporateActionOption57.PriceDetails, com.tools20022.repository.msg.CorporateActionOption58.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption3.PriceDetails, com.tools20022.repository.msg.CorporateActionOption4.PriceDetails, com.tools20022.repository.msg.SecuritiesOption8.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption14.PriceDetails, com.tools20022.repository.msg.SecuritiesOption18.PriceDetails, com.tools20022.repository.msg.CashOption12.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption23.PriceDetails, com.tools20022.repository.msg.SecuritiesOption20.PriceDetails, com.tools20022.repository.msg.CashOption13.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption31.PriceDetails, com.tools20022.repository.msg.SecuritiesOption26.PriceDetails, com.tools20022.repository.msg.CashOption18.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption37.PriceDetails, com.tools20022.repository.msg.SecuritiesOption31.PriceDetails, com.tools20022.repository.msg.CashOption22.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption46.PriceDetails, com.tools20022.repository.msg.SecuritiesOption35.PriceDetails, com.tools20022.repository.msg.CashOption26.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption53.PriceDetails, com.tools20022.repository.msg.SecuritiesOption36.PriceDetails, com.tools20022.repository.msg.CashOption27.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption54.PriceDetails, com.tools20022.repository.msg.SecuritiesOption4.PriceDetails, com.tools20022.repository.msg.CorporateActionOption10.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption10.PriceDetails, com.tools20022.repository.msg.CorporateActionOption15.PriceDetails, com.tools20022.repository.msg.SecuritiesOption13.PriceDetails,
					com.tools20022.repository.msg.CashOption11.PriceDetails, com.tools20022.repository.msg.CorporateActionOption20.PriceDetails, com.tools20022.repository.msg.SecuritiesOption17.PriceDetails,
					com.tools20022.repository.msg.CashOption14.PriceDetails, com.tools20022.repository.msg.CorporateActionOption32.PriceDetails, com.tools20022.repository.msg.SecuritiesOption24.PriceDetails,
					com.tools20022.repository.msg.CashOption16.PriceDetails, com.tools20022.repository.msg.CorporateActionOption35.PriceDetails, com.tools20022.repository.msg.SecuritiesOption29.PriceDetails,
					com.tools20022.repository.msg.CashOption20.PriceDetails, com.tools20022.repository.msg.CorporateActionOption44.PriceDetails, com.tools20022.repository.msg.SecuritiesOption33.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption38.PriceDetails, com.tools20022.repository.msg.CashOption25.PriceDetails, com.tools20022.repository.msg.CorporateActionOption52.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption37.PriceDetails, com.tools20022.repository.msg.SecuritiesOption39.PriceDetails, com.tools20022.repository.msg.CashOption28.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption55.PriceDetails, com.tools20022.repository.msg.CorporateAction3.PriceDetails, com.tools20022.repository.msg.SecuritiesOption6.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption3.PriceDetails, com.tools20022.repository.msg.CorporateAction4.PriceDetails, com.tools20022.repository.msg.SecuritiesOption12.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption17.PriceDetails, com.tools20022.repository.msg.CorporateAction5.PriceDetails, com.tools20022.repository.msg.SecuritiesOption14.PriceDetails,
					com.tools20022.repository.msg.CashOption10.PriceDetails, com.tools20022.repository.msg.CorporateActionOption19.PriceDetails, com.tools20022.repository.msg.CorporateAction6.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption22.PriceDetails, com.tools20022.repository.msg.CashOption15.PriceDetails, com.tools20022.repository.msg.CorporateActionOption34.PriceDetails,
					com.tools20022.repository.msg.CorporateAction7.PriceDetails, com.tools20022.repository.msg.SecuritiesOption25.PriceDetails, com.tools20022.repository.msg.CashOption17.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption36.PriceDetails, com.tools20022.repository.msg.CorporateAction8.PriceDetails, com.tools20022.repository.msg.SecuritiesOption30.PriceDetails,
					com.tools20022.repository.msg.CashOption21.PriceDetails, com.tools20022.repository.msg.CorporateActionOption45.PriceDetails, com.tools20022.repository.msg.CorporateAction10.PriceDetails,
					com.tools20022.repository.msg.CashOption24.PriceDetails, com.tools20022.repository.msg.CorporateActionOption51.PriceDetails, com.tools20022.repository.msg.CorporateAction11.PriceDetails,
					com.tools20022.repository.msg.CashOption29.PriceDetails, com.tools20022.repository.msg.CorporateActionOption56.PriceDetails, com.tools20022.repository.msg.CorporateAction2.PriceDetails,
					com.tools20022.repository.msg.SecurityOption1.PriceDetails, com.tools20022.repository.msg.CorporateActionOption1.PriceDetails, com.tools20022.repository.msg.CorporateActionOption103.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption100.PriceDetails, com.tools20022.repository.msg.CorporateActionOption101.PriceDetails, com.tools20022.repository.msg.CorporateAction12.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption102.PriceDetails, com.tools20022.repository.msg.CashOption30.PriceDetails, com.tools20022.repository.msg.SecuritiesOption42.PriceDetails,
					com.tools20022.repository.msg.CashOption31.PriceDetails, com.tools20022.repository.msg.SecuritiesOption40.PriceDetails, com.tools20022.repository.msg.CashOption32.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption110.PriceDetails, com.tools20022.repository.msg.CorporateActionOption108.PriceDetails, com.tools20022.repository.msg.CorporateActionOption107.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption106.PriceDetails, com.tools20022.repository.msg.CorporateAction17.PriceDetails, com.tools20022.repository.msg.CashOption36.PriceDetails,
					com.tools20022.repository.msg.CashOption35.PriceDetails, com.tools20022.repository.msg.CashOption38.PriceDetails, com.tools20022.repository.msg.SecuritiesOption48.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption45.PriceDetails, com.tools20022.repository.msg.CorporateActionOption111.PriceDetails, com.tools20022.repository.msg.CashOption39.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption113.PriceDetails, com.tools20022.repository.msg.CashOption41.PriceDetails, com.tools20022.repository.msg.CorporateActionOption117.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption118.PriceDetails, com.tools20022.repository.msg.CorporateActionOption115.PriceDetails, com.tools20022.repository.msg.CorporateActionOption114.PriceDetails,
					com.tools20022.repository.msg.CorporateAction31.PriceDetails, com.tools20022.repository.msg.CashOption44.PriceDetails, com.tools20022.repository.msg.SecuritiesOption49.PriceDetails,
					com.tools20022.repository.msg.CashOption42.PriceDetails, com.tools20022.repository.msg.CashOption43.PriceDetails, com.tools20022.repository.msg.SecuritiesOption50.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption124.PriceDetails, com.tools20022.repository.msg.CorporateActionOption125.PriceDetails, com.tools20022.repository.msg.CorporateActionOption123.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption127.PriceDetails, com.tools20022.repository.msg.CorporateAction40.PriceDetails, com.tools20022.repository.msg.CashOption46.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption55.PriceDetails, com.tools20022.repository.msg.CashOption49.PriceDetails, com.tools20022.repository.msg.CashOption47.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption57.PriceDetails, com.tools20022.repository.msg.CorporateActionOption132.PriceDetails, com.tools20022.repository.msg.CorporateActionOption130.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption131.PriceDetails, com.tools20022.repository.msg.CorporateActionOption129.PriceDetails, com.tools20022.repository.msg.CashOption52.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption60.PriceDetails, com.tools20022.repository.msg.CashOption51.PriceDetails, com.tools20022.repository.msg.SecuritiesOption59.PriceDetails,
					com.tools20022.repository.msg.CashOption50.PriceDetails, com.tools20022.repository.msg.CorporateActionOption134.PriceDetails, com.tools20022.repository.msg.CorporateActionOption136.PriceDetails,
					com.tools20022.repository.msg.CorporateActionOption135.PriceDetails, com.tools20022.repository.msg.CorporateActionOption133.PriceDetails, com.tools20022.repository.msg.CashOption53.PriceDetails,
					com.tools20022.repository.msg.SecuritiesOption61.PriceDetails, com.tools20022.repository.msg.SecuritiesOption63.PriceDetails, com.tools20022.repository.msg.CashOption54.PriceDetails,
					com.tools20022.repository.msg.CashOption55.PriceDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate, specified by the issuer, when the paid amount is not in the same
	 * currency as the specified amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedCorporateActionEvent
	 * CurrencyExchange.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#ForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative8.
	 * ForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#ForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative13.
	 * ForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#ForeignExchangeDetails
	 * CashOption2.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#ForeignExchangeDetails
	 * CashOption9.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#ForeignExchangeDetails
	 * CashOption12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#ForeignExchangeDetails
	 * CashOption13.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#ForeignExchangeDetails
	 * CashOption18.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#ForeignExchangeDetails
	 * CashOption22.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#ForeignExchangeDetails
	 * CashOption26.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#ForeignExchangeDetails
	 * CashOption27.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#ForeignExchangeDetails
	 * CashOption3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#ForeignExchangeDetails
	 * CashOption6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#ForeignExchangeDetails
	 * CashOption11.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#ForeignExchangeDetails
	 * CashOption14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#ForeignExchangeDetails
	 * CashOption16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#ForeignExchangeDetails
	 * CashOption20.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#ForeignExchangeDetails
	 * CashOption25.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#ForeignExchangeDetails
	 * CashOption28.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#ForeignExchangeDetails
	 * CashOption4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#ForeignExchangeDetails
	 * CashOption8.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#ForeignExchangeDetails
	 * CashOption10.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#ForeignExchangeDetails
	 * CashOption15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#ForeignExchangeDetails
	 * CashOption17.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#ForeignExchangeDetails
	 * CashOption21.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#IssuerDeclaredExchangeRate
	 * CorporateActionRate36.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#ForeignExchangeDetails
	 * CashOption24.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#IssuerDeclaredExchangeRate
	 * CorporateActionRate42.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#ForeignExchangeDetails
	 * CashOption29.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#ExchangeRate
	 * CorporateActionRate2.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#ExchangeRate
	 * CashOption1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#ForeignExchangeDetails
	 * CashOption30.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#IssuerDeclaredExchangeRate
	 * CorporateActionRate44.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#ForeignExchangeDetails
	 * CashOption31.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#ForeignExchangeDetails
	 * CashOption32.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#ForeignExchangeDetails
	 * CashOption36.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#ForeignExchangeDetails
	 * CashOption35.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#ForeignExchangeDetails
	 * CashOption38.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#IssuerDeclaredExchangeRate
	 * CorporateActionRate57.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#ForeignExchangeDetails
	 * CashOption39.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#ForeignExchangeDetails
	 * CashOption41.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#ForeignExchangeDetails
	 * CashOption44.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#IssuerDeclaredExchangeRate
	 * CorporateActionRate68.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#ForeignExchangeDetails
	 * CashOption42.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#ForeignExchangeDetails
	 * CashOption43.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#ForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative32.
	 * ForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#ForeignExchangeDetails
	 * CashOption46.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#IssuerDeclaredExchangeRate
	 * CorporateActionRate79.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#ForeignExchangeDetails
	 * CashOption49.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#ForeignExchangeDetails
	 * CashOption47.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#ForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative33.
	 * ForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#ForeignExchangeDetails
	 * CashOption52.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#ForeignExchangeDetails
	 * CashOption51.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#IssuerDeclaredExchangeRate
	 * CorporateActionRate80.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#ForeignExchangeDetails
	 * CashOption50.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#ForeignExchangeDetails
	 * CashOption53.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#IssuerDeclaredExchangeRate
	 * CorporateActionRate83.IssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#ForeignExchangeDetails
	 * CashOption54.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#ForeignExchangeDetails
	 * CashOption55.ForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative8.ForeignExchangeInstructionsAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionNarrative13.ForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CashOption2.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption9.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption12.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption13.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption18.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption22.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption26.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption27.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption3.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption6.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption11.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption14.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption16.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption20.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption25.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption28.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption4.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption8.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption10.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption15.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption17.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption21.ForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate36.IssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption24.ForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate42.IssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption29.ForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate2.ExchangeRate,
					com.tools20022.repository.msg.CashOption1.ExchangeRate, com.tools20022.repository.msg.CashOption30.ForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate44.IssuerDeclaredExchangeRate,
					com.tools20022.repository.msg.CashOption31.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption32.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption36.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption35.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption38.ForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate57.IssuerDeclaredExchangeRate,
					com.tools20022.repository.msg.CashOption39.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption41.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption44.ForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate68.IssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption42.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption43.ForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionNarrative32.ForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CashOption46.ForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate79.IssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption49.ForeignExchangeDetails, com.tools20022.repository.msg.CashOption47.ForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionNarrative33.ForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CashOption52.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption51.ForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate80.IssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption50.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption53.ForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate83.IssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption54.ForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption55.ForeignExchangeDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides information required for the registration.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7#RegistrationDetails
	 * CorporateActionNarrative7.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative12#RegistrationDetails
	 * CorporateActionNarrative12.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#RegistrationDetails
	 * CorporateActionNarrative21.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative23#RegistrationDetails
	 * CorporateActionNarrative23.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#RegistrationDetails
	 * CorporateActionNarrative4.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#RegistrationDetails
	 * CorporateActionNarrative14.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#RegistrationDetails
	 * CorporateActionNarrative6.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#RegistrationDetails
	 * CorporateActionNarrative16.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#RegistrationDetails
	 * CorporateActionNarrative11.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#RegistrationDetails
	 * CorporateActionNarrative17.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#RegistrationDetails
	 * CorporateActionNarrative2.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#RegistrationDetails
	 * CorporateActionAdditionalInformation1.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#RegistrationDetails
	 * CorporateActionNarrative27.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#RegistrationDetails
	 * CorporateActionNarrative30.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#RegistrationDetails
	 * CorporateActionNarrative28.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#RegistrationDetails
	 * CorporateActionNarrative37.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative34#RegistrationDetails
	 * CorporateActionNarrative34.RegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#RegistrationDetails
	 * CorporateActionNarrative41.RegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative7.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative12.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative21.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative23.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative4.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative14.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative6.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative16.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative11.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative17.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative2.RegistrationDetails, com.tools20022.repository.msg.CorporateActionAdditionalInformation1.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative27.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative30.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative28.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative37.RegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative34.RegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative41.RegistrationDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Provides additional information on the basket or index underlying a
	 * security, for example a warrant.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7#BasketOrIndexInformation
	 * CorporateActionNarrative7.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative12#BasketOrIndexInformation
	 * CorporateActionNarrative12.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#BasketOrIndexInformation
	 * CorporateActionNarrative21.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative23#BasketOrIndexInformation
	 * CorporateActionNarrative23.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#BasketOrIndexInformation
	 * CorporateActionNarrative4.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#BasketOrIndexInformation
	 * CorporateActionNarrative14.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#BasketOrIndexInformation
	 * CorporateActionNarrative6.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#BasketOrIndexInformation
	 * CorporateActionNarrative16.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#BasketOrIndexInformation
	 * CorporateActionNarrative11.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#BasketOrIndexInformation
	 * CorporateActionNarrative17.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#BasketOrIndexInformation
	 * CorporateActionNarrative27.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#BasketOrIndexInformation
	 * CorporateActionNarrative28.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#BasketOrIndexInformation
	 * CorporateActionNarrative37.BasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#BasketOrIndexInformation
	 * CorporateActionNarrative41.BasketOrIndexInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BasketOrIndexInformation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative7.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative12.BasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative21.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative23.BasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative4.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative14.BasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative6.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative16.BasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative11.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative17.BasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative27.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative28.BasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative37.BasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative41.BasketOrIndexInformation);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the different deadlines related to a corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedCorporateActionEvent
	 * Deadline.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#DeadlineDateTime
	 * InstructedCorporateActionOption1.DeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#DeadlineType
	 * InstructedCorporateActionOption1.DeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#DeadlineDateTime
	 * InstructedCorporateActionOption2.DeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#DeadlineType
	 * InstructedCorporateActionOption2.DeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#DeadlineDateTime
	 * InstructedCorporateActionOption4.DeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#DeadlineType
	 * InstructedCorporateActionOption4.DeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#DeadlineDateTime
	 * InstructedCorporateActionOption5.DeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#DeadlineType
	 * InstructedCorporateActionOption5.DeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#DeadlineDateTime
	 * InstructedCorporateActionOption6.DeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#DeadlineType
	 * InstructedCorporateActionOption6.DeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#DeadlineDateTime
	 * InstructedCorporateActionOption7.DeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#DeadlineType
	 * InstructedCorporateActionOption7.DeadlineType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines related to a corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Deadline = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedCorporateActionOption1.DeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption1.DeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption2.DeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption2.DeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption4.DeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption4.DeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption5.DeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption5.DeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption6.DeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption6.DeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption7.DeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption7.DeadlineType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of the additional business process linked to a
	 * corporate action event such as a claim compensation or tax refund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice#Code
	 * AdditionalBusinessProcessFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice#Proprietary
	 * AdditionalBusinessProcessFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation4.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice#Code
	 * AdditionalBusinessProcessFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice#Proprietary
	 * AdditionalBusinessProcessFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation16.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation24.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation29.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice#Code
	 * AdditionalBusinessProcessFormat7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice#Proprietary
	 * AdditionalBusinessProcessFormat7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation39.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice#Code
	 * AdditionalBusinessProcessFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice#Proprietary
	 * AdditionalBusinessProcessFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation47.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation50.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation62.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice#Code
	 * AdditionalBusinessProcessFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice#Proprietary
	 * AdditionalBusinessProcessFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation3.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice#Code
	 * AdditionalBusinessProcessFormat6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice#Proprietary
	 * AdditionalBusinessProcessFormat6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation17.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation23.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation30.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation38.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation46.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation54.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation64.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice#Code
	 * AdditionalBusinessProcessFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice#Proprietary
	 * AdditionalBusinessProcessFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#AdditionalBusinessProcessIndicator
	 * CorporateAction3.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice#Code
	 * AdditionalBusinessProcessFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice#Proprietary
	 * AdditionalBusinessProcessFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#AdditionalBusinessProcessIndicator
	 * CorporateAction4.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#AdditionalBusinessProcessIndicator
	 * CorporateAction5.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#AdditionalBusinessProcessIndicator
	 * CorporateAction6.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#AdditionalBusinessProcessIndicator
	 * CorporateAction7.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#AdditionalBusinessProcessIndicator
	 * CorporateAction8.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#AdditionalBusinessProcessIndicator
	 * CorporateAction10.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#AdditionalBusinessProcessIndicator
	 * CorporateAction11.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation69.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#AdditionalBusinessProcessIndicator
	 * CorporateAction12.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation78.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#AdditionalBusinessProcessIndicator
	 * CorporateAction17.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation79.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation83.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#AdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation82.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#AdditionalBusinessProcessIndicator
	 * CorporateAction33.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#AdditionalBusinessProcessIndicator
	 * CorporateAction32.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#AdditionalBusinessProcessIndicator
	 * CorporateAction31.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice#Code
	 * AdditionalBusinessProcessFormat10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice#Proprietary
	 * AdditionalBusinessProcessFormat10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice#Code
	 * AdditionalBusinessProcessFormat11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice#Proprietary
	 * AdditionalBusinessProcessFormat11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice#Code
	 * AdditionalBusinessProcessFormat9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice#Proprietary
	 * AdditionalBusinessProcessFormat9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#AdditionalBusinessProcessIndicator
	 * CorporateAction36.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#AdditionalBusinessProcessIndicator
	 * CorporateAction38.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#AdditionalBusinessProcessIndicator
	 * CorporateAction40.AdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice#Code
	 * AdditionalBusinessProcessFormat12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice#Proprietary
	 * AdditionalBusinessProcessFormat12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice#Code
	 * AdditionalBusinessProcessFormat14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice#Proprietary
	 * AdditionalBusinessProcessFormat14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice#Code
	 * AdditionalBusinessProcessFormat13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice#Proprietary
	 * AdditionalBusinessProcessFormat13Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalBusinessProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation4.AdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation16.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation24.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation29.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation39.AdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation47.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation50.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation62.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation3.AdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation17.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation23.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation30.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation38.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation46.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation54.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation64.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.AdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateAction4.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction5.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction6.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction7.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction8.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction10.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction11.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction12.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction17.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation83.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction33.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction32.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction31.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice.Proprietary,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice.Proprietary,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice.Code, com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction36.AdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction38.AdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction40.AdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice.Proprietary, com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice.Proprietary, com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice.Code,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}
	};
	/**
	 * Date/time at which the deal (rights) was agreed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#TradingDate
	 * CorporateActionDate6.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#TradingDate
	 * CorporateActionDate10.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#TradingDate
	 * CorporateActionDate18.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#TradingDate
	 * CorporateActionDate19.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#TradingDate
	 * CorporateActionDate46.TradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#TradingDate
	 * CorporateActionDate52.TradingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.TradingDate, com.tools20022.repository.msg.CorporateActionDate10.TradingDate,
					com.tools20022.repository.msg.CorporateActionDate18.TradingDate, com.tools20022.repository.msg.CorporateActionDate19.TradingDate, com.tools20022.repository.msg.CorporateActionDate46.TradingDate,
					com.tools20022.repository.msg.CorporateActionDate52.TradingDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the charges relative to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#CorporateAction
	 * CorporateActionFeesAndCharges.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#ChargesFees
	 * CorporateActionRate4.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#ChargesFees
	 * CorporateActionRate10.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#ChargesFees
	 * RateDetails2.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#ChargesFees
	 * RateDetails4.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#ChargesFees
	 * CorporateActionRate29.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#ChargesFees
	 * RateDetails7.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#ChargesFees
	 * CorporateActionRate34.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#ChargesFees
	 * RateDetails9.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails11#ChargesFees
	 * RateDetails11.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails12#ChargesFees
	 * RateDetails12.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#ChargesFees
	 * CorporateActionRate5.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#ChargesFees
	 * CorporateActionRate12.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#ChargesFees
	 * RateDetails3.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#ChargesFees
	 * RateDetails5.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#ChargesFees
	 * CorporateActionRate28.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#ChargesFees
	 * CorporateActionRate33.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails10#ChargesFees
	 * RateDetails10.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails13#ChargesFees
	 * RateDetails13.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#Charges
	 * CorporateActionRate1.Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#Charges
	 * CorporateActionRate2.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails15#ChargesFees
	 * RateDetails15.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#ChargesFees
	 * CorporateActionRate48.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#ChargesFees
	 * CorporateActionRate49.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#ChargesFees
	 * RateDetails14.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#ChargesFees
	 * CorporateActionRate58.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails18#ChargesFees
	 * RateDetails18.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails21#ChargesFees
	 * RateDetails21.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#ChargesFees
	 * CorporateActionRate65.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails23#ChargesFees
	 * RateDetails23.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#ChargesFees
	 * CorporateActionRate69.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails22#ChargesFees
	 * RateDetails22.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#ChargesFees
	 * CorporateActionRate72.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails24#ChargesFees
	 * RateDetails24.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails25#ChargesFees
	 * RateDetails25.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#ChargesFees
	 * CorporateActionRate77.ChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#ChargesFees
	 * CorporateActionRate75.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails26#ChargesFees
	 * RateDetails26.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails27#ChargesFees
	 * RateDetails27.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#ChargesFees
	 * RateDetails28.ChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails30#ChargesFees
	 * RateDetails30.ChargesFees}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges relative to a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.ChargesFees, com.tools20022.repository.msg.CorporateActionRate10.ChargesFees, com.tools20022.repository.msg.RateDetails2.ChargesFees,
					com.tools20022.repository.msg.RateDetails4.ChargesFees, com.tools20022.repository.msg.CorporateActionRate29.ChargesFees, com.tools20022.repository.msg.RateDetails7.ChargesFees,
					com.tools20022.repository.msg.CorporateActionRate34.ChargesFees, com.tools20022.repository.msg.RateDetails9.ChargesFees, com.tools20022.repository.msg.RateDetails11.ChargesFees,
					com.tools20022.repository.msg.RateDetails12.ChargesFees, com.tools20022.repository.msg.CorporateActionRate5.ChargesFees, com.tools20022.repository.msg.CorporateActionRate12.ChargesFees,
					com.tools20022.repository.msg.RateDetails3.ChargesFees, com.tools20022.repository.msg.RateDetails5.ChargesFees, com.tools20022.repository.msg.CorporateActionRate28.ChargesFees,
					com.tools20022.repository.msg.CorporateActionRate33.ChargesFees, com.tools20022.repository.msg.RateDetails10.ChargesFees, com.tools20022.repository.msg.RateDetails13.ChargesFees,
					com.tools20022.repository.msg.CorporateActionRate1.Charges, com.tools20022.repository.msg.CorporateActionRate2.Charges, com.tools20022.repository.msg.RateDetails15.ChargesFees,
					com.tools20022.repository.msg.CorporateActionRate48.ChargesFees, com.tools20022.repository.msg.CorporateActionRate49.ChargesFees, com.tools20022.repository.msg.RateDetails14.ChargesFees,
					com.tools20022.repository.msg.CorporateActionRate58.ChargesFees, com.tools20022.repository.msg.RateDetails18.ChargesFees, com.tools20022.repository.msg.RateDetails21.ChargesFees,
					com.tools20022.repository.msg.CorporateActionRate65.ChargesFees, com.tools20022.repository.msg.RateDetails23.ChargesFees, com.tools20022.repository.msg.CorporateActionRate69.ChargesFees,
					com.tools20022.repository.msg.RateDetails22.ChargesFees, com.tools20022.repository.msg.CorporateActionRate72.ChargesFees, com.tools20022.repository.msg.RateDetails24.ChargesFees,
					com.tools20022.repository.msg.RateDetails25.ChargesFees, com.tools20022.repository.msg.CorporateActionRate77.ChargesFees, com.tools20022.repository.msg.CorporateActionRate75.ChargesFees,
					com.tools20022.repository.msg.RateDetails26.ChargesFees, com.tools20022.repository.msg.RateDetails27.ChargesFees, com.tools20022.repository.msg.RateDetails28.ChargesFees,
					com.tools20022.repository.msg.RateDetails30.ChargesFees);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which security will assimilate, become fungible, or have the same
	 * rights to dividends as the parent issue.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#PariPassuDate
	 * SecurityDate1.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#PariPassuDate
	 * SecurityDate3.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#PariPassuDate
	 * SecurityDate6.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#PariPassuDate
	 * SecurityDate7.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#PariPassuDate
	 * SecurityDate2.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#PariPassuDate
	 * SecurityDate4.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#PariPassuDate
	 * SecurityDate5.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#PariPassuDate
	 * SecurityDate8.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#PariPassuDate
	 * SecurityDate9.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#PariPassuDate
	 * SecurityDate10.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#PariPassuDate
	 * CorporateActionDate3.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#PariPassuDate
	 * SecurityDate12.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#PariPassuDate
	 * SecurityDate11.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#PariPassuDate
	 * SecurityDate14.PariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#PariPassuDate
	 * SecurityDate13.PariPassuDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PariPassuDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.PariPassuDate, com.tools20022.repository.msg.SecurityDate3.PariPassuDate, com.tools20022.repository.msg.SecurityDate6.PariPassuDate,
					com.tools20022.repository.msg.SecurityDate7.PariPassuDate, com.tools20022.repository.msg.SecurityDate2.PariPassuDate, com.tools20022.repository.msg.SecurityDate4.PariPassuDate,
					com.tools20022.repository.msg.SecurityDate5.PariPassuDate, com.tools20022.repository.msg.SecurityDate8.PariPassuDate, com.tools20022.repository.msg.SecurityDate9.PariPassuDate,
					com.tools20022.repository.msg.SecurityDate10.PariPassuDate, com.tools20022.repository.msg.CorporateActionDate3.PariPassuDate, com.tools20022.repository.msg.SecurityDate12.PariPassuDate,
					com.tools20022.repository.msg.SecurityDate11.PariPassuDate, com.tools20022.repository.msg.SecurityDate14.PariPassuDate, com.tools20022.repository.msg.SecurityDate13.PariPassuDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Provides conditional information related to the event, eg, an offer is
	 * subject to 50% acceptance, the offeror allows the securities holder to
	 * set some conditions.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#InformationConditions
	 * CorporateActionNarrative4.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#InformationConditions
	 * CorporateActionNarrative14.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#InformationConditions
	 * CorporateActionNarrative5.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#InformationConditions
	 * CorporateActionNarrative6.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#InformationConditions
	 * CorporateActionNarrative15.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#InformationConditions
	 * CorporateActionNarrative16.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#InformationConditions
	 * CorporateActionNarrative20.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#InformationConditions
	 * CorporateActionNarrative22.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#InformationConditions
	 * CorporateActionNarrative11.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#InformationConditions
	 * CorporateActionNarrative17.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#InformationConditions
	 * CorporateActionNarrative1.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#InformationConditions
	 * CorporateActionNarrative2.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#InformationConditions
	 * CorporateActionNarrative9.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#InformationConditions
	 * CorporateActionNarrative27.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#InformationConditions
	 * CorporateActionNarrative28.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#InformationConditions
	 * CorporateActionNarrative29.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#InformationConditions
	 * CorporateActionNarrative37.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#InformationConditions
	 * CorporateActionNarrative41.InformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#InformationConditions
	 * CorporateActionNarrative36.InformationConditions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InformationConditions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative4.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative14.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative5.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative6.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative15.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative16.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative20.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative22.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative11.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative17.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative1.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative2.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative9.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative27.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative28.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative29.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative37.InformationConditions, com.tools20022.repository.msg.CorporateActionNarrative41.InformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative36.InformationConditions);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Fractional quantity resulting from an event which will be paid with cash
	 * in lieu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedEventForFractionalQuantity
	 * SecuritiesQuantity.RelatedEventForFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#FractionalQuantity
	 * CorporateActionGeneralInformation50.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#FractionalQuantity
	 * CorporateActionGeneralInformation62.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#FractionalQuantity
	 * CorporateActionGeneralInformation79.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#FractionalQuantity
	 * CorporateActionGeneralInformation83.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#FractionalQuantity
	 * CorporateActionGeneralInformation82.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#FractionalQuantity
	 * CorporateActionGeneralInformation89.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#FractionalQuantity
	 * CorporateActionGeneralInformation98.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#FractionalQuantity
	 * CorporateActionGeneralInformation111.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#FractionalQuantity
	 * CorporateActionGeneralInformation118.FractionalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fractional quantity resulting from an event which will be paid with cash in lieu. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FractionalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation50.FractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation62.FractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.FractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation83.FractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.FractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation89.FractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation98.FractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation111.FractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation118.FractionalQuantity);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of processing involved by a Corporate Action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
	 * CorporateActionEventProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice#Code
	 * CorporateActionEventProcessingTypeChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice#Proprietary
	 * CorporateActionEventProcessingTypeChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#EventProcessingType
	 * CorporateActionGeneralInformation3.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice#Code
	 * CorporateActionEventProcessingType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice#Proprietary
	 * CorporateActionEventProcessingType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#EventProcessingType
	 * CorporateActionGeneralInformation17.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#EventProcessingType
	 * CorporateActionGeneralInformation23.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#EventProcessingType
	 * CorporateActionGeneralInformation30.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#EventProcessingType
	 * CorporateActionGeneralInformation38.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#EventProcessingType
	 * CorporateActionGeneralInformation46.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#EventProcessingType
	 * CorporateActionGeneralInformation54.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#EventProcessingType
	 * CorporateActionGeneralInformation64.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#EventProcessingType
	 * CorporateActionGeneralInformation11.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#EventProcessingType
	 * CorporateActionGeneralInformation19.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#EventProcessingType
	 * CorporateActionGeneralInformation22.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#EventProcessingType
	 * CorporateActionGeneralInformation31.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#EventProcessingType
	 * CorporateActionGeneralInformation37.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#EventProcessingType
	 * CorporateActionGeneralInformation45.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#EventProcessingType
	 * CorporateActionGeneralInformation51.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#EventProcessingType
	 * CorporateActionGeneralInformation67.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice#Code
	 * CorporateActionEventProcessingType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice#Proprietary
	 * CorporateActionEventProcessingType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#EventProcessingType
	 * CorporateActionInformation2.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#EventProcessingType
	 * CorporateActionInformation1.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#EventProcessingType
	 * CorporateActionGeneralInformation69.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#EventProcessingType
	 * CorporateActionGeneralInformation70.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#EventProcessingType
	 * CorporateActionGeneralInformation78.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#EventProcessingType
	 * CorporateActionGeneralInformation76.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#EventProcessingType
	 * CorporateActionGeneralInformation84.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#EventProcessingType
	 * CorporateActionGeneralInformation85.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice#Code
	 * CorporateActionEventProcessingType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice#Proprietary
	 * CorporateActionEventProcessingType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#EventProcessingType
	 * CorporateActionGeneralInformation100.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#EventProcessingType
	 * CorporateActionGeneralInformation103.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice#Code
	 * CorporateActionEventProcessingType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice#Proprietary
	 * CorporateActionEventProcessingType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#EventProcessingType
	 * CorporateActionGeneralInformation105.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#EventProcessingType
	 * CorporateActionGeneralInformation106.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#EventProcessingType
	 * CorporateActionGeneralInformation117.EventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#EventProcessingType
	 * CorporateActionGeneralInformation113.EventProcessingType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of processing involved by a Corporate Action."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventProcessingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation3.EventProcessingType, com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice.Proprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation17.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation23.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation30.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation38.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation46.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation54.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation64.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation19.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation31.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation45.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation67.EventProcessingType,
					com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionInformation2.EventProcessingType, com.tools20022.repository.msg.CorporateActionInformation1.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation70.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation76.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation84.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation85.EventProcessingType,
					com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation100.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation103.EventProcessingType,
					com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation105.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation106.EventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.EventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation113.EventProcessingType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}
	};
	/**
	 * Status of the corporate action process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionEvent
	 * CorporateActionStatus.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#ProcessingStatus
	 * CorporateActionNotification2.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#ProcessingStatus
	 * CorporateActionNotification3.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#ProcessingStatus
	 * CorporateActionNotification1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#ProcessingStatus
	 * CorporateActionNotification4.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#ProcessingStatus
	 * CorporateActionNotification5.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#ProcessingStatus
	 * CorporateActionNotification6.ProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotification2.ProcessingStatus, com.tools20022.repository.msg.CorporateActionNotification3.ProcessingStatus,
					com.tools20022.repository.msg.CorporateActionNotification1.ProcessingStatus, com.tools20022.repository.msg.CorporateActionNotification4.ProcessingStatus,
					com.tools20022.repository.msg.CorporateActionNotification5.ProcessingStatus, com.tools20022.repository.msg.CorporateActionNotification6.ProcessingStatus);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur such as the issue of securities or an official meeting.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#AnnouncementDate
	 * CorporateActionDate1.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#AnnouncementDate
	 * CorporateActionDate13.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#AnnouncementDate
	 * CorporateActionDate14.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#AnnouncementDate
	 * CorporateActionDate21.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#AnnouncementDate
	 * CorporateActionDate22.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#AnnouncementDate
	 * CorporateActionDate25.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#AnnouncementDate
	 * CorporateActionDate27.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#AnnouncementDate
	 * CorporateActionDate28.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AnnouncementDate
	 * MeetingNotice1.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AnnouncementDate
	 * MeetingNotice2.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AnnouncementDate
	 * MeetingNotice3.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#AnnouncementDate
	 * CorporateActionNotification1.AnnouncementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#AnnouncementDate
	 * Issuance1.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1#WebServiceNotificationDate
	 * CorporateActionGeneralInformation32SD1.WebServiceNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1#PreviousWebServiceNotificationDate
	 * CorporateActionGeneralInformation32SD1.PreviousWebServiceNotificationDate
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AnnouncementDate
	 * MeetingNotice4.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#AnnouncementDate
	 * CorporateActionDate44.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#AnnouncementDate
	 * CorporateActionDate58.AnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AnnouncementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate13.AnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate14.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate21.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate22.AnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate25.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate27.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate28.AnnouncementDate,
					com.tools20022.repository.msg.MeetingNotice1.AnnouncementDate, com.tools20022.repository.msg.MeetingNotice2.AnnouncementDate, com.tools20022.repository.msg.MeetingNotice3.AnnouncementDate,
					com.tools20022.repository.msg.CorporateActionNotification1.AnnouncementDate, com.tools20022.repository.msg.Issuance1.AnnouncementDate,
					com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1.WebServiceNotificationDate, com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1.PreviousWebServiceNotificationDate,
					com.tools20022.repository.msg.MeetingNotice4.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate44.AnnouncementDate, com.tools20022.repository.msg.CorporateActionDate58.AnnouncementDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which an event is officially effective from the issuer's
	 * perspective.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#EffectiveDate
	 * CorporateActionDate1.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#EffectiveDate
	 * CorporateActionDate13.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#EffectiveDate
	 * CorporateActionDate14.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#EffectiveDate
	 * CorporateActionDate21.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#EffectiveDate
	 * CorporateActionDate22.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#EffectiveDate
	 * CorporateActionDate25.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#EffectiveDate
	 * CorporateActionDate27.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#EffectiveDate
	 * CorporateActionDate28.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#EffectiveDate
	 * CorporateActionDate2.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#EffectiveDate
	 * CorporateActionDate44.EffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#EffectiveDate
	 * CorporateActionDate58.EffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event is officially effective from the issuer's perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate13.EffectiveDate,
					com.tools20022.repository.msg.CorporateActionDate14.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate21.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate22.EffectiveDate,
					com.tools20022.repository.msg.CorporateActionDate25.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate27.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate28.EffectiveDate,
					com.tools20022.repository.msg.CorporateActionDate2.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate44.EffectiveDate, com.tools20022.repository.msg.CorporateActionDate58.EffectiveDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which additional information on the event will be announced,
	 * for instance exchange ratio announcement date.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#FurtherDetailedAnnouncementDate
	 * CorporateActionDate1.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#FurtherDetailedAnnouncementDate
	 * CorporateActionDate13.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#FurtherDetailedAnnouncementDate
	 * CorporateActionDate14.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#FurtherDetailedAnnouncementDate
	 * CorporateActionDate21.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#FurtherDetailedAnnouncementDate
	 * CorporateActionDate22.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#FurtherDetailedAnnouncementDate
	 * CorporateActionDate25.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#FurtherDetailedAnnouncementDate
	 * CorporateActionDate27.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#FurtherDetailedAnnouncementDate
	 * CorporateActionDate28.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#FurtherDetailedAnnouncementDate
	 * CorporateActionNotification1.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#FurtherDetailedAnnouncementDate
	 * CorporateActionDate44.FurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#FurtherDetailedAnnouncementDate
	 * CorporateActionDate58.FurtherDetailedAnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailsAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FurtherDetailsAnnouncementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.FurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate13.FurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate14.FurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate21.FurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate22.FurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate25.FurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate27.FurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate28.FurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionNotification1.FurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate44.FurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate58.FurtherDetailedAnnouncementDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the margin rate will be determined .
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#MarginFixingDate
	 * CorporateActionDate1.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#MarginFixingDate
	 * CorporateActionDate13.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#MarginFixingDate
	 * CorporateActionDate14.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#MarginFixingDate
	 * CorporateActionDate21.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#MarginFixingDate
	 * CorporateActionDate22.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#MarginFixingDate
	 * CorporateActionDate25.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#MarginFixingDate
	 * CorporateActionDate27.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#MarginFixingDate
	 * CorporateActionDate28.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#MarginFixingDate
	 * CorporateActionDate2.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#MarginFixingDate
	 * CorporateActionDate44.MarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#MarginFixingDate
	 * CorporateActionDate58.MarginFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate13.MarginFixingDate,
					com.tools20022.repository.msg.CorporateActionDate14.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate21.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate22.MarginFixingDate,
					com.tools20022.repository.msg.CorporateActionDate25.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate27.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate28.MarginFixingDate,
					com.tools20022.repository.msg.CorporateActionDate2.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate44.MarginFixingDate, com.tools20022.repository.msg.CorporateActionDate58.MarginFixingDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which results are published, eg, results of an offer, of a
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#ResultsPublicationDate
	 * CorporateActionDate1.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#ResultsPublicationDate
	 * CorporateActionDate13.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#ResultsPublicationDate
	 * CorporateActionDate14.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#ResultsPublicationDate
	 * CorporateActionDate21.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#ResultsPublicationDate
	 * CorporateActionDate22.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#ResultsPublicationDate
	 * CorporateActionDate25.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#ResultsPublicationDate
	 * CorporateActionDate27.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#ResultsPublicationDate
	 * CorporateActionDate28.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ResultPublicationDate
	 * MeetingNotice1.ResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ResultPublicationDate
	 * MeetingNotice2.ResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#ResultPublicationDate
	 * MeetingNotice3.ResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#ResultsPublicationDate
	 * CorporateActionDate2.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#ResultPublicationDate
	 * MeetingNotice4.ResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#ResultsPublicationDate
	 * CorporateActionDate44.ResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#ResultsPublicationDate
	 * CorporateActionDate58.ResultsPublicationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which results are published, eg, results of an offer, of a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResultPublicationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.ResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate13.ResultsPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate14.ResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate21.ResultsPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate22.ResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate25.ResultsPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate27.ResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate28.ResultsPublicationDate, com.tools20022.repository.msg.MeetingNotice1.ResultPublicationDate,
					com.tools20022.repository.msg.MeetingNotice2.ResultPublicationDate, com.tools20022.repository.msg.MeetingNotice3.ResultPublicationDate, com.tools20022.repository.msg.CorporateActionDate2.ResultsPublicationDate,
					com.tools20022.repository.msg.MeetingNotice4.ResultPublicationDate, com.tools20022.repository.msg.CorporateActionDate44.ResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate58.ResultsPublicationDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date upon which the terms of the take-over become unconditional as to
	 * acceptances.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#UnconditionalDate
	 * CorporateActionDate1.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#UnconditionalDate
	 * CorporateActionDate13.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#UnconditionalDate
	 * CorporateActionDate14.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#UnconditionalDate
	 * CorporateActionDate21.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#UnconditionalDate
	 * CorporateActionDate22.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#UnconditionalDate
	 * CorporateActionDate25.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#UnconditionalDate
	 * CorporateActionDate27.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#UnconditionalDate
	 * CorporateActionDate28.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#UnconditionalDate
	 * CorporateActionDate2.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#UnconditionalDate
	 * CorporateActionDate44.UnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#UnconditionalDate
	 * CorporateActionDate58.UnconditionalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnconditionalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate13.UnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate14.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate21.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate22.UnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate25.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate27.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate28.UnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate2.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate44.UnconditionalDate, com.tools20022.repository.msg.CorporateActionDate58.UnconditionalDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which all conditions, including regulatory, legal etc. pertaining
	 * to the take-over, have been met.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#WhollyUnconditionalDate
	 * CorporateActionDate1.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#WhollyUnconditionalDate
	 * CorporateActionDate13.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#WhollyUnconditionalDate
	 * CorporateActionDate14.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#WhollyUnconditionalDate
	 * CorporateActionDate21.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#WhollyUnconditionalDate
	 * CorporateActionDate22.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#WhollyUnconditionalDate
	 * CorporateActionDate25.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#WhollyUnconditionalDate
	 * CorporateActionDate27.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#WhollyUnconditionalDate
	 * CorporateActionDate28.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#WhollyUnconditionalDate
	 * CorporateActionDate2.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#WhollyUnconditionalDate
	 * CorporateActionDate44.WhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#WhollyUnconditionalDate
	 * CorporateActionDate58.WhollyUnconditionalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WhollyUnconditionalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.WhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate13.WhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate14.WhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate21.WhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate22.WhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate25.WhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate27.WhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate28.WhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate2.WhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate44.WhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate58.WhollyUnconditionalDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#LapsedDate
	 * CorporateActionDate1.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#LapsedDate
	 * CorporateActionDate13.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#LapsedDate
	 * CorporateActionDate14.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#LapsedDate
	 * CorporateActionDate21.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#LapsedDate
	 * CorporateActionDate22.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#LapsedDate
	 * CorporateActionDate25.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#LapsedDate
	 * CorporateActionDate27.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#LapsedDate
	 * CorporateActionDate28.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#LapsedDate
	 * CorporateActionDate2.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#LapsedDate
	 * CorporateActionDate44.LapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#LapsedDate
	 * CorporateActionDate58.LapsedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LapsedDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.LapsedDate, com.tools20022.repository.msg.CorporateActionDate13.LapsedDate,
					com.tools20022.repository.msg.CorporateActionDate14.LapsedDate, com.tools20022.repository.msg.CorporateActionDate21.LapsedDate, com.tools20022.repository.msg.CorporateActionDate22.LapsedDate,
					com.tools20022.repository.msg.CorporateActionDate25.LapsedDate, com.tools20022.repository.msg.CorporateActionDate27.LapsedDate, com.tools20022.repository.msg.CorporateActionDate28.LapsedDate,
					com.tools20022.repository.msg.CorporateActionDate2.LapsedDate, com.tools20022.repository.msg.CorporateActionDate44.LapsedDate, com.tools20022.repository.msg.CorporateActionDate58.LapsedDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period defining the last date on which shareholder registration will be
	 * accepted by the issuer and the date on which shareholder registration
	 * will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookClosureCorporateAction
	 * DateTimePeriod.BookClosureCorporateAction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#BookClosurePeriod
	 * CorporateActionPeriod3.BookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#BookClosurePeriod
	 * CorporateActionPeriod6.BookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#BookClosurePeriod
	 * CorporateActionPeriod8.BookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#BookClosurePeriod
	 * CorporateActionPeriod10.BookClosurePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BookClosurePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod3.BookClosurePeriod, com.tools20022.repository.msg.CorporateActionPeriod6.BookClosurePeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.BookClosurePeriod, com.tools20022.repository.msg.CorporateActionPeriod10.BookClosurePeriod);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionEvent
	 * SecuritiesQuantity.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#SecuritiesQuantity
	 * CorporateAction3.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#SecuritiesQuantity
	 * CorporateAction4.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#SecuritiesQuantity
	 * CorporateAction5.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#SecuritiesQuantity
	 * CorporateAction6.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#SecuritiesQuantity
	 * CorporateAction10.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#SecuritiesQuantity
	 * CorporateAction11.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#SecuritiesQuantity
	 * CorporateAction12.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#SecuritiesQuantity
	 * CorporateAction17.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#SecuritiesQuantity
	 * CorporateAction31.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#SecuritiesQuantity
	 * CorporateAction40.SecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction3.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction4.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateAction5.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction6.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction10.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateAction11.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction12.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction17.SecuritiesQuantity,
					com.tools20022.repository.msg.CorporateAction31.SecuritiesQuantity, com.tools20022.repository.msg.CorporateAction40.SecuritiesQuantity);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether there are legal or other restrictions associated with a
	 * rights offer or other corporate event, for example, domicile,
	 * citizenship, residency, type of investor.<br>
	 * Yes = There are restrictions.<br>
	 * No = There are no restrictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#RestrictionIndicator
	 * CorporateAction3.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#RestrictionIndicator
	 * CorporateAction4.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#RestrictionIndicator
	 * CorporateAction5.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#RestrictionIndicator
	 * CorporateAction6.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#RestrictionIndicator
	 * CorporateAction7.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#RestrictionIndicator
	 * CorporateAction8.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#RestrictionIndicator
	 * CorporateAction10.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#RestrictionIndicator
	 * CorporateAction11.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#RestrictionIndicator
	 * CorporateAction2.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#RestrictionIndicator
	 * CorporateAction12.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#RestrictionIndicator
	 * CorporateAction17.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#RestrictionIndicator
	 * CorporateAction31.RestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#RestrictionIndicator
	 * CorporateAction40.RestrictionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RestrictionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction3.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction4.RestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction5.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction6.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction7.RestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction8.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction10.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction11.RestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction2.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction12.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction17.RestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction31.RestrictionIndicator, com.tools20022.repository.msg.CorporateAction40.RestrictionIndicator);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
	 * CorporateActionEventStageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice#Code
	 * CorporateActionEventStageFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice#Proprietary
	 * CorporateActionEventStageFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#EventStage
	 * CorporateAction3.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice#Code
	 * CorporateActionEventStageFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice#Proprietary
	 * CorporateActionEventStageFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#EventStage
	 * CorporateAction4.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice#Code
	 * CorporateActionEventStageFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice#Proprietary
	 * CorporateActionEventStageFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#EventStage
	 * CorporateAction5.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice#Code
	 * CorporateActionEventStageFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice#Proprietary
	 * CorporateActionEventStageFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#EventStage
	 * CorporateAction6.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#EventStage
	 * CorporateAction7.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#EventStage
	 * CorporateAction8.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#EventStage
	 * CorporateAction10.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#EventStage
	 * CorporateAction11.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice#Code
	 * CorporateActionEventStage1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice#Proprietary
	 * CorporateActionEventStage1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#EventStage
	 * CorporateAction2.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1Choice#Code
	 * CorporateActionEventStage1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1Choice#Proprietary
	 * CorporateActionEventStage1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#CorporateActionEventStage
	 * Status1Choice.CorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#CorporateActionEventStage
	 * Status8Choice.CorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage2Choice#Code
	 * CorporateActionEventStage2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage2Choice#Proprietary
	 * CorporateActionEventStage2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#CorporateActionEventStage
	 * Status3Choice.CorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#CorporateActionEventStage
	 * Status10Choice.CorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#EventStage
	 * CorporateAction13.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#EventStage
	 * CorporateAction12.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice#Code
	 * CorporateActionEventStageFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice#Proprietary
	 * CorporateActionEventStageFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice#Code
	 * CorporateActionEventStageFormat6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice#Proprietary
	 * CorporateActionEventStageFormat6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction18#EventStage
	 * CorporateAction18.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#EventStage
	 * CorporateAction17.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice#Code
	 * CorporateActionEventStageFormat9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice#Proprietary
	 * CorporateActionEventStageFormat9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice#Code
	 * CorporateActionEventStageFormat10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice#Proprietary
	 * CorporateActionEventStageFormat10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction24#EventStage
	 * CorporateAction24.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction30#EventStage
	 * CorporateAction30.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction28#EventStage
	 * CorporateAction28.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction29#EventStage
	 * CorporateAction29.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice#Code
	 * CorporateActionEventStageFormat12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice#Proprietary
	 * CorporateActionEventStageFormat12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice#Code
	 * CorporateActionEventStageFormat11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice#Proprietary
	 * CorporateActionEventStageFormat11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#CorporateActionEventStage
	 * Status19Choice.CorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice#Code
	 * CorporateActionEventStage3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice#Proprietary
	 * CorporateActionEventStage3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#EventStage
	 * CorporateAction33.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#EventStage
	 * CorporateAction32.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#EventStage
	 * CorporateAction31.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice#Code
	 * CorporateActionEventStageFormat14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice#Proprietary
	 * CorporateActionEventStageFormat14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice#Code
	 * CorporateActionEventStageFormat13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice#Proprietary
	 * CorporateActionEventStageFormat13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34#EventStage
	 * CorporateAction34.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35#EventStage
	 * CorporateAction35.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#EventStage
	 * CorporateAction36.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#EventStage
	 * CorporateAction38.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#EventStage
	 * CorporateAction40.EventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice#Code
	 * CorporateActionEventStageFormat15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice#Proprietary
	 * CorporateActionEventStageFormat15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice#Code
	 * CorporateActionEventStageFormat20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice#Proprietary
	 * CorporateActionEventStageFormat20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#CorporateActionEventStage
	 * Status22Choice.CorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage4Choice#Code
	 * CorporateActionEventStage4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage4Choice#Proprietary
	 * CorporateActionEventStage4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventStage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice.Code, com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.EventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice.Proprietary, com.tools20022.repository.msg.CorporateAction4.EventStage,
					com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice.Code, com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction5.EventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateAction6.EventStage, com.tools20022.repository.msg.CorporateAction7.EventStage,
					com.tools20022.repository.msg.CorporateAction8.EventStage, com.tools20022.repository.msg.CorporateAction10.EventStage, com.tools20022.repository.msg.CorporateAction11.EventStage,
					com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice.Code, com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateAction2.EventStage, com.tools20022.repository.choice.CorporateActionEventStage1Choice.Code, com.tools20022.repository.choice.CorporateActionEventStage1Choice.Proprietary,
					com.tools20022.repository.choice.Status1Choice.CorporateActionEventStage, com.tools20022.repository.choice.Status8Choice.CorporateActionEventStage, com.tools20022.repository.choice.CorporateActionEventStage2Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStage2Choice.Proprietary, com.tools20022.repository.choice.Status3Choice.CorporateActionEventStage,
					com.tools20022.repository.choice.Status10Choice.CorporateActionEventStage, com.tools20022.repository.msg.CorporateAction13.EventStage, com.tools20022.repository.msg.CorporateAction12.EventStage,
					com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice.Code, com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice.Code, com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction18.EventStage, com.tools20022.repository.msg.CorporateAction17.EventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice.Proprietary, com.tools20022.repository.msg.CorporateAction24.EventStage, com.tools20022.repository.msg.CorporateAction30.EventStage,
					com.tools20022.repository.msg.CorporateAction28.EventStage, com.tools20022.repository.msg.CorporateAction29.EventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice.Proprietary, com.tools20022.repository.choice.Status19Choice.CorporateActionEventStage,
					com.tools20022.repository.choice.CorporateActionEventStage3Choice.Code, com.tools20022.repository.choice.CorporateActionEventStage3Choice.Proprietary, com.tools20022.repository.msg.CorporateAction33.EventStage,
					com.tools20022.repository.msg.CorporateAction32.EventStage, com.tools20022.repository.msg.CorporateAction31.EventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice.Proprietary, com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice.Proprietary, com.tools20022.repository.msg.CorporateAction34.EventStage, com.tools20022.repository.msg.CorporateAction35.EventStage,
					com.tools20022.repository.msg.CorporateAction36.EventStage, com.tools20022.repository.msg.CorporateAction38.EventStage, com.tools20022.repository.msg.CorporateAction40.EventStage,
					com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice.Code, com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice.Code, com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice.Proprietary,
					com.tools20022.repository.choice.Status22Choice.CorporateActionEventStage, com.tools20022.repository.choice.CorporateActionEventStage4Choice.Code,
					com.tools20022.repository.choice.CorporateActionEventStage4Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}
	};
	/**
	 * Information on where additional information published for the event, can
	 * be received. for instance the address for the Universal Resource Locator
	 * (URL), eg, used over the www (HTTP) service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedCorporateActionEvent
	 * ContactPoint.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative24#URLAddress
	 * CorporateActionNarrative24.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25#URLAddress
	 * CorporateActionNarrative25.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#URLAddress
	 * CorporateActionNarrative26.URLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative39#URLAddress
	 * CorporateActionNarrative39.URLAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DocumentationLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative24.URLAddress, com.tools20022.repository.msg.CorporateActionNarrative25.URLAddress,
					com.tools20022.repository.msg.CorporateActionNarrative26.URLAddress, com.tools20022.repository.msg.CorporateActionNarrative39.URLAddress);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCorporateActionEvent
	 * SecuritiesQuantity.RelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#SecuritiesQuantitySought
	 * CorporateAction2.SecuritiesQuantitySought}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantitySought = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction2.SecuritiesQuantitySought);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies if the issuer will allow the agent to accept partial elections.
	 * It is to allow split voting over options. It allows the client to elect
	 * more than one option to be selected per designated holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#PartialElectionIndicator
	 * CorporateAction2.PartialElectionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialElectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialElectionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction2.PartialElectionIndicator);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#CorporateActionEvent
	 * CorporateActionPartyRole.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party in the context of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market claim information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#RelatedCorporateEvent
	 * MarketClaim.RelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarketClaim
	 * MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market claim information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarketClaim = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the conditions under which securities can be acquired as part
	 * of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#Event
	 * BiddingConditions.Event}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the underlying class action related to the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#CorporateEvent
	 * ClassAction.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClassAction
	 * ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClassAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying class action related to the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedClassAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			type_lazy = () -> ClassAction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Official registration of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#CorporateActionEvent
	 * CorporateActionEventRegistration.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official registration of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEventRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which an action will be accepted and
	 * the date on which the suspension will be released and normal processing
	 * will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CorporateActionEvent
	 * SuspensionPeriod.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisation of draws for cash prizes on bonds (instead of coupon
	 * payments). Every issued bond (similar to a lottery ticket) has an equal
	 * opportunity at winning payments in the draws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#RelatedCorporateEvent
	 * Lottery.RelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Lottery Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Lottery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the margin type for a remarketing procedure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode
	 * RemarketingMarginTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the margin type for a remarketing procedure."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the margin type for a remarketing procedure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RemarketingMarginTypeCode.mmObject();
		}
	};
	/**
	 * Provides information on the meeting related to the corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#CorporateEvent
	 * Meeting.CorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the meeting  related to the corporate event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			type_lazy = () -> Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.CorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different services linked to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#Event
	 * CorporateActionServicing.Event}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different services linked to a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information specified when the corporate event relates to the issuance of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#EventInformation
	 * Issuance.EventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information specified when the corporate event relates to the issuance of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.EventInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Modification of the reference data of a security or of the organisation
	 * that issued it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#RelatedCorporateEvent
	 * SecuritiesModification.RelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the reference data of a security or of the organisation that issued it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesModification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which a financial instrument is available for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedCorporateAction
	 * DateTimePeriod.RelatedCorporateAction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#TradingPeriod
	 * SecuritiesOption4.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#TradingPeriod
	 * SecuritiesOption10.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#TradingPeriod
	 * SecuritiesOption13.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#TradingPeriod
	 * SecuritiesOption17.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#TradingPeriod
	 * SecuritiesOption24.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#TradingPeriod
	 * SecuritiesOption29.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#TradingPeriod
	 * SecuritiesOption33.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#TradingPeriod
	 * SecuritiesOption38.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#TradingPeriod
	 * SecuritiesOption37.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#TradingPeriod
	 * SecuritiesOption39.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#TradingPeriod
	 * FinancialInstrumentAttributes3.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#TradingPeriod
	 * SecuritiesOption6.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#TradingPeriod
	 * FinancialInstrumentAttributes12.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#TradingPeriod
	 * SecuritiesOption12.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#TradingPeriod
	 * FinancialInstrumentAttributes17.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#TradingPeriod
	 * SecuritiesOption14.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#TradingPeriod
	 * FinancialInstrumentAttributes25.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#TradingPeriod
	 * SecuritiesOption22.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#TradingPeriod
	 * SecuritiesOption25.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#TradingPeriod
	 * SecuritiesOption30.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#TradingPeriod
	 * FinancialInstrumentAttributes46.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#TradingPeriod
	 * FinancialInstrumentAttributes47.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#TradingPeriod
	 * SecurityOption1.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#TradingPeriod
	 * SecuritiesOption40.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#TradingPeriod
	 * SecuritiesOption45.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#TradingPeriod
	 * FinancialInstrumentAttributes68.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#TradingPeriod
	 * SecuritiesOption49.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#TradingPeriod
	 * FinancialInstrumentAttributes73.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#TradingPeriod
	 * SecuritiesOption57.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#TradingPeriod
	 * SecuritiesOption59.TradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#TradingPeriod
	 * SecuritiesOption61.TradingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a financial instrument is available for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption4.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption10.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption13.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption17.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption24.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption29.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption33.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption38.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption37.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption39.TradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes3.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption6.TradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes12.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption12.TradingPeriod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption14.TradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes25.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption22.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption25.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption30.TradingPeriod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.TradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes47.TradingPeriod, com.tools20022.repository.msg.SecurityOption1.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption40.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption45.TradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes68.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption49.TradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes73.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption57.TradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption59.TradingPeriod, com.tools20022.repository.msg.SecuritiesOption61.TradingPeriod);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax rate of financial transactions related to an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#CorporateActionEvent
	 * Tax.CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#FinancialTransactionTaxRate
	 * CorporateActionRate48.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#FinancialTransactionTaxRate
	 * CorporateActionRate49.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#FinancialTransactionTaxRate
	 * CorporateActionRate58.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#FinancialTransactionTaxRate
	 * CorporateActionRate65.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#FinancialTransactionTaxRate
	 * CorporateActionRate69.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#FinancialTransactionTaxRate
	 * CorporateActionRate72.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#FinancialTransactionTaxRate
	 * CorporateActionRate77.FinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#FinancialTransactionTaxRate
	 * CorporateActionRate75.FinancialTransactionTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate of financial transactions related to an event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate48.FinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate49.FinancialTransactionTaxRate,
					com.tools20022.repository.msg.CorporateActionRate58.FinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate65.FinancialTransactionTaxRate,
					com.tools20022.repository.msg.CorporateActionRate69.FinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate72.FinancialTransactionTaxRate,
					com.tools20022.repository.msg.CorporateActionRate77.FinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate75.FinancialTransactionTaxRate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.CorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate actions may be approved by shareholders without a meeting or a
	 * vote by means of execution of a consent by a majority of shareholders
	 * entitled to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConsentTypeCode
	 * ConsentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#ConsentType
	 * CorporateAction12.ConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat1Choice#Code
	 * ConsentTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat1Choice#Proprietary
	 * ConsentTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#ConsentType
	 * CorporateAction17.ConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat3Choice#Code
	 * ConsentTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat3Choice#Proprietary
	 * ConsentTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#ConsentType
	 * CorporateAction31.ConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#Code
	 * ConsentTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#Proprietary
	 * ConsentTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#ConsentType
	 * CorporateAction40.ConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat5Choice#Code
	 * ConsentTypeFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat5Choice#Proprietary
	 * ConsentTypeFormat5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConsentType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction12.ConsentType, com.tools20022.repository.choice.ConsentTypeFormat1Choice.Code,
					com.tools20022.repository.choice.ConsentTypeFormat1Choice.Proprietary, com.tools20022.repository.msg.CorporateAction17.ConsentType, com.tools20022.repository.choice.ConsentTypeFormat3Choice.Code,
					com.tools20022.repository.choice.ConsentTypeFormat3Choice.Proprietary, com.tools20022.repository.msg.CorporateAction31.ConsentType, com.tools20022.repository.choice.ConsentTypeFormat4Choice.Code,
					com.tools20022.repository.choice.ConsentTypeFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateAction40.ConsentType, com.tools20022.repository.choice.ConsentTypeFormat5Choice.Code,
					com.tools20022.repository.choice.ConsentTypeFormat5Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the proceeds of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#CorporateAction
	 * ProceedsDefinition.CorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the proceeds of a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.CorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CorporateEvent, com.tools20022.repository.entity.ContactPoint.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction, com.tools20022.repository.entity.Tax.CorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionEventRegistration.CorporateActionEvent,
						com.tools20022.repository.entity.Issuance.EventInformation, com.tools20022.repository.entity.ProceedsDefinition.CorporateAction, com.tools20022.repository.entity.ClassAction.CorporateEvent,
						com.tools20022.repository.entity.SecuritiesModification.RelatedCorporateEvent, com.tools20022.repository.entity.BiddingConditions.Event, com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent,
						com.tools20022.repository.entity.CorporateActionServicing.Event, com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction,
						com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent, com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent, com.tools20022.repository.entity.Lottery.RelatedCorporateEvent,
						com.tools20022.repository.entity.Meeting.CorporateEvent, com.tools20022.repository.entity.CorporateActionPartyRole.CorporateActionEvent);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventAndBalance1.GeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance2.GeneralInformation,
						com.tools20022.repository.msg.CorporateActionEventAndBalance3.GeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance4.GeneralInformation,
						com.tools20022.repository.msg.CorporateActionEventAndBalance5.GeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance6.GeneralInformation,
						com.tools20022.repository.msg.CorporateActionEventAndBalance7.GeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance8.GeneralInformation,
						com.tools20022.repository.msg.SecuritiesOption3.RateDetails, com.tools20022.repository.msg.SecuritiesOption8.RateDetails, com.tools20022.repository.msg.SecuritiesOption18.RateDetails,
						com.tools20022.repository.msg.SecuritiesOption20.RateDetails, com.tools20022.repository.msg.SecuritiesOption26.RateDetails, com.tools20022.repository.msg.SecuritiesOption31.RateDetails,
						com.tools20022.repository.msg.SecuritiesOption35.RateDetails, com.tools20022.repository.msg.SecuritiesOption36.RateDetails, com.tools20022.repository.msg.SecuritiesOption4.RateDetails,
						com.tools20022.repository.msg.SecuritiesOption10.RateDetails, com.tools20022.repository.msg.SecuritiesOption13.RateDetails, com.tools20022.repository.msg.SecuritiesOption17.RateDetails,
						com.tools20022.repository.msg.SecuritiesOption24.RateDetails, com.tools20022.repository.msg.SecuritiesOption29.RateDetails, com.tools20022.repository.msg.SecuritiesOption33.RateDetails,
						com.tools20022.repository.msg.SecuritiesOption38.RateDetails, com.tools20022.repository.msg.SecuritiesOption37.RateDetails, com.tools20022.repository.msg.SecuritiesOption39.RateDetails,
						com.tools20022.repository.msg.CorporateAction3.DateDetails, com.tools20022.repository.msg.CorporateAction3.PeriodDetails, com.tools20022.repository.msg.CorporateAction3.RateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption6.RateDetails, com.tools20022.repository.msg.CorporateAction4.DateDetails, com.tools20022.repository.msg.CorporateAction4.PeriodDetails,
						com.tools20022.repository.msg.CorporateAction4.RateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption12.RateDetails, com.tools20022.repository.msg.CorporateAction5.DateDetails,
						com.tools20022.repository.msg.CorporateAction5.PeriodDetails, com.tools20022.repository.msg.CorporateAction5.RateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption14.RateDetails,
						com.tools20022.repository.msg.CorporateAction6.DateDetails, com.tools20022.repository.msg.CorporateAction6.PeriodDetails, com.tools20022.repository.msg.CorporateAction6.RateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption22.RateDetails, com.tools20022.repository.msg.CorporateAction7.DateDetails, com.tools20022.repository.msg.CorporateAction7.PeriodDetails,
						com.tools20022.repository.msg.CorporateAction7.RateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption25.RateDetails, com.tools20022.repository.msg.CorporateAction8.DateDetails,
						com.tools20022.repository.msg.CorporateAction8.PeriodDetails, com.tools20022.repository.msg.CorporateAction8.RateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption30.RateDetails,
						com.tools20022.repository.msg.CorporateAction10.DateDetails, com.tools20022.repository.msg.CorporateAction10.PeriodDetails, com.tools20022.repository.msg.CorporateAction10.RateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction11.DateDetails, com.tools20022.repository.msg.CorporateAction11.PeriodDetails, com.tools20022.repository.msg.CorporateAction11.RateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction2.DateDetails, com.tools20022.repository.msg.CorporateAction2.PeriodDetails, com.tools20022.repository.msg.CorporateAction2.RateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction13.DateDetails, com.tools20022.repository.msg.CorporateAction12.DateDetails, com.tools20022.repository.msg.CorporateAction12.PeriodDetails,
						com.tools20022.repository.msg.CorporateAction12.RateAndAmountDetails, com.tools20022.repository.msg.CorporateAction14.DateDetails, com.tools20022.repository.msg.SecuritiesOption42.RateDetails,
						com.tools20022.repository.msg.SecuritiesOption40.RateDetails, com.tools20022.repository.msg.CorporateAction20.DateDetails, com.tools20022.repository.msg.CorporateAction18.DateDetails,
						com.tools20022.repository.msg.CorporateAction17.DateDetails, com.tools20022.repository.msg.CorporateAction17.PeriodDetails, com.tools20022.repository.msg.CorporateAction17.RateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption48.RateDetails, com.tools20022.repository.msg.SecuritiesOption45.RateDetails, com.tools20022.repository.msg.CorporateActionSD12.EventStage,
						com.tools20022.repository.msg.CorporateAction24.DateDetails, com.tools20022.repository.msg.CorporateAction30.DateDetails, com.tools20022.repository.msg.CorporateAction28.DateDetails,
						com.tools20022.repository.msg.CorporateAction29.DateDetails, com.tools20022.repository.msg.CorporateAction33.DateDetails, com.tools20022.repository.msg.CorporateAction32.DateDetails,
						com.tools20022.repository.msg.CorporateAction31.DateDetails, com.tools20022.repository.msg.CorporateAction31.PeriodDetails, com.tools20022.repository.msg.CorporateAction31.RateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption49.RateDetails, com.tools20022.repository.msg.CorporateActionEventAndBalance9.GeneralInformation, com.tools20022.repository.msg.SecuritiesOption50.RateDetails,
						com.tools20022.repository.msg.CorporateAction34.DateDetails, com.tools20022.repository.msg.CorporateAction35.DateDetails, com.tools20022.repository.msg.CorporateAction36.DateDetails,
						com.tools20022.repository.msg.CorporateAction38.DateDetails, com.tools20022.repository.msg.CorporateAction40.DateDetails, com.tools20022.repository.msg.CorporateAction40.PeriodDetails,
						com.tools20022.repository.msg.CorporateAction40.RateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption55.RateDetails, com.tools20022.repository.msg.SecuritiesOption57.RateDetails,
						com.tools20022.repository.msg.CorporateActionEventAndBalance10.GeneralInformation, com.tools20022.repository.msg.SecuritiesOption60.RateDetails, com.tools20022.repository.msg.SecuritiesOption59.RateDetails,
						com.tools20022.repository.msg.CorporateActionEventAndBalance11.GeneralInformation, com.tools20022.repository.msg.SecuritiesOption61.RateDetails,
						com.tools20022.repository.msg.CorporateActionEventAndBalance12.GeneralInformation, com.tools20022.repository.msg.SecuritiesOption63.RateDetails);
				subType_lazy = () -> Arrays.asList(VoluntaryCorporateAction.mmObject(), MandatoryCorporateAction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.Type, com.tools20022.repository.entity.CorporateActionEvent.MandatoryVoluntaryEventType,
						com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.RegistrationDetails,
						com.tools20022.repository.entity.CorporateActionEvent.BasketOrIndexInformation, com.tools20022.repository.entity.CorporateActionEvent.Deadline,
						com.tools20022.repository.entity.CorporateActionEvent.AdditionalBusinessProcess, com.tools20022.repository.entity.CorporateActionEvent.TradingDate,
						com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge, com.tools20022.repository.entity.CorporateActionEvent.PariPassuDate,
						com.tools20022.repository.entity.CorporateActionEvent.InformationConditions, com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.EventProcessingType, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionEvent.AnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.EffectiveDate,
						com.tools20022.repository.entity.CorporateActionEvent.FurtherDetailsAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.MarginFixingDate,
						com.tools20022.repository.entity.CorporateActionEvent.ResultPublicationDate, com.tools20022.repository.entity.CorporateActionEvent.UnconditionalDate,
						com.tools20022.repository.entity.CorporateActionEvent.WhollyUnconditionalDate, com.tools20022.repository.entity.CorporateActionEvent.LapsedDate,
						com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.RestrictionIndicator, com.tools20022.repository.entity.CorporateActionEvent.EventStage,
						com.tools20022.repository.entity.CorporateActionEvent.DocumentationLocation, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought,
						com.tools20022.repository.entity.CorporateActionEvent.PartialElectionIndicator, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPartyRole,
						com.tools20022.repository.entity.CorporateActionEvent.MarketClaim, com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions, com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction,
						com.tools20022.repository.entity.CorporateActionEvent.CorporateActionEventRegistration, com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.Lottery, com.tools20022.repository.entity.CorporateActionEvent.MarginType, com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting,
						com.tools20022.repository.entity.CorporateActionEvent.Services, com.tools20022.repository.entity.CorporateActionEvent.Issuance, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesModification,
						com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod, com.tools20022.repository.entity.CorporateActionEvent.TransactionTax, com.tools20022.repository.entity.CorporateActionEvent.ConsentType,
						com.tools20022.repository.entity.CorporateActionEvent.ProceedsDefinition);
				derivationComponent_lazy = () -> ListBuilderForCorporateActionEvent_00.addElems(new ArrayList<>());
			}
		});
		return mmObject_lazy.get();
	}
}