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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
 * CorporateActionEvent.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMandatoryVoluntaryEventType
 * CorporateActionEvent.mmMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
 * CorporateActionEvent.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
 * CorporateActionEvent.mmCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
 * CorporateActionEvent.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
 * CorporateActionEvent.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
 * CorporateActionEvent.mmDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingDate
 * CorporateActionEvent.mmTradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
 * CorporateActionEvent.mmCorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPariPassuDate
 * CorporateActionEvent.mmPariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
 * CorporateActionEvent.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
 * CorporateActionEvent.mmFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventProcessingType
 * CorporateActionEvent.mmEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
 * CorporateActionEvent.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
 * CorporateActionEvent.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEffectiveDate
 * CorporateActionEvent.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFurtherDetailsAnnouncementDate
 * CorporateActionEvent.mmFurtherDetailsAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginFixingDate
 * CorporateActionEvent.mmMarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
 * CorporateActionEvent.mmResultPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnconditionalDate
 * CorporateActionEvent.mmUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmWhollyUnconditionalDate
 * CorporateActionEvent.mmWhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLapsedDate
 * CorporateActionEvent.mmLapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
 * CorporateActionEvent.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
 * CorporateActionEvent.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRestrictionIndicator
 * CorporateActionEvent.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
 * CorporateActionEvent.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDocumentationLocation
 * CorporateActionEvent.mmDocumentationLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPartialElectionIndicator
 * CorporateActionEvent.mmPartialElectionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPartyRole
 * CorporateActionEvent.mmCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarketClaim
 * CorporateActionEvent.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBiddingConditions
 * CorporateActionEvent.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedClassAction
 * CorporateActionEvent.mmRelatedClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionEventRegistration
 * CorporateActionEvent.mmCorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSuspensionPeriod
 * CorporateActionEvent.mmSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
 * CorporateActionEvent.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginType
 * CorporateActionEvent.mmMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedMeeting
 * CorporateActionEvent.mmRelatedMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmServices
 * CorporateActionEvent.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmIssuance
 * CorporateActionEvent.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesModification
 * CorporateActionEvent.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
 * CorporateActionEvent.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
 * CorporateActionEvent.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmConsentType
 * CorporateActionEvent.mmConsentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmProceedsDefinition
 * CorporateActionEvent.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTaxOnNonDistributedProceedsIndicator
 * CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
 * Security.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedCorporateActionEvent
 * ContactPoint.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
 * DateTimePeriod.mmBookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
 * DateTimePeriod.mmRelatedCorporateAction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
 * Tax.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
 * SecuritiesQuantity.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
 * CorporateActionStatus.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmEventInformation
 * Issuance.mmEventInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
 * ProceedsDefinition.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCorporateEvent
 * ClassAction.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
 * SecuritiesModification.mmRelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
 * BiddingConditions.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
 * CorporateActionPrice.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
 * CorporateActionServicing.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
 * Deadline.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
 * MarketClaim.mmRelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
 * SuspensionPeriod.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
 * Lottery.mmRelatedCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
 * Meeting.mmCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmCorporateActionEvent
 * CorporateActionPartyRole.mmCorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance1#mmGeneralInformation
 * CorporateActionEventAndBalance1.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance2#mmGeneralInformation
 * CorporateActionEventAndBalance2.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance3#mmGeneralInformation
 * CorporateActionEventAndBalance3.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmGeneralInformation
 * CorporateActionEventAndBalance4.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5#mmGeneralInformation
 * CorporateActionEventAndBalance5.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance6#mmGeneralInformation
 * CorporateActionEventAndBalance6.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmGeneralInformation
 * CorporateActionEventAndBalance7.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8#mmGeneralInformation
 * CorporateActionEventAndBalance8.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmRateDetails
 * SecuritiesOption3.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmRateDetails
 * SecuritiesOption8.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmRateDetails
 * SecuritiesOption18.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmRateDetails
 * SecuritiesOption20.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmRateDetails
 * SecuritiesOption26.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmRateDetails
 * SecuritiesOption31.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmRateDetails
 * SecuritiesOption35.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmRateDetails
 * SecuritiesOption36.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmRateDetails
 * SecuritiesOption4.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmRateDetails
 * SecuritiesOption10.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmRateDetails
 * SecuritiesOption13.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmRateDetails
 * SecuritiesOption17.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmRateDetails
 * SecuritiesOption24.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmRateDetails
 * SecuritiesOption29.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmRateDetails
 * SecuritiesOption33.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmRateDetails
 * SecuritiesOption38.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmRateDetails
 * SecuritiesOption37.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmRateDetails
 * SecuritiesOption39.mmRateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction3#mmDateDetails
 * CorporateAction3.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmPeriodDetails
 * CorporateAction3.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmRateAndAmountDetails
 * CorporateAction3.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmRateDetails
 * SecuritiesOption6.mmRateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction4#mmDateDetails
 * CorporateAction4.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmPeriodDetails
 * CorporateAction4.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmRateAndAmountDetails
 * CorporateAction4.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmRateDetails
 * SecuritiesOption12.mmRateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmDateDetails
 * CorporateAction5.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmPeriodDetails
 * CorporateAction5.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRateAndAmountDetails
 * CorporateAction5.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmRateDetails
 * SecuritiesOption14.mmRateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction6#mmDateDetails
 * CorporateAction6.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmPeriodDetails
 * CorporateAction6.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmRateAndAmountDetails
 * CorporateAction6.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmRateDetails
 * SecuritiesOption22.mmRateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction7#mmDateDetails
 * CorporateAction7.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmPeriodDetails
 * CorporateAction7.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmRateAndAmountDetails
 * CorporateAction7.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmRateDetails
 * SecuritiesOption25.mmRateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction8#mmDateDetails
 * CorporateAction8.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmPeriodDetails
 * CorporateAction8.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmRateAndAmountDetails
 * CorporateAction8.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmRateDetails
 * SecuritiesOption30.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmDateDetails
 * CorporateAction10.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmPeriodDetails
 * CorporateAction10.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmRateAndAmountDetails
 * CorporateAction10.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmDateDetails
 * CorporateAction11.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmPeriodDetails
 * CorporateAction11.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmRateAndAmountDetails
 * CorporateAction11.mmRateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#mmDateDetails
 * CorporateAction2.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPeriodDetails
 * CorporateAction2.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRateAndAmountDetails
 * CorporateAction2.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmDateDetails
 * CorporateAction13.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmDateDetails
 * CorporateAction12.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmPeriodDetails
 * CorporateAction12.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmRateAndAmountDetails
 * CorporateAction12.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction14#mmDateDetails
 * CorporateAction14.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmRateDetails
 * SecuritiesOption42.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmRateDetails
 * SecuritiesOption40.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction20#mmDateDetails
 * CorporateAction20.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction18#mmDateDetails
 * CorporateAction18.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmDateDetails
 * CorporateAction17.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmPeriodDetails
 * CorporateAction17.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmRateAndAmountDetails
 * CorporateAction17.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmRateDetails
 * SecuritiesOption48.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmRateDetails
 * SecuritiesOption45.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD12#mmEventStage
 * CorporateActionSD12.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction24#mmDateDetails
 * CorporateAction24.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction30#mmDateDetails
 * CorporateAction30.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction28#mmDateDetails
 * CorporateAction28.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction29#mmDateDetails
 * CorporateAction29.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmDateDetails
 * CorporateAction33.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmDateDetails
 * CorporateAction32.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmDateDetails
 * CorporateAction31.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmPeriodDetails
 * CorporateAction31.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmRateAndAmountDetails
 * CorporateAction31.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmRateDetails
 * SecuritiesOption49.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmGeneralInformation
 * CorporateActionEventAndBalance9.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmRateDetails
 * SecuritiesOption50.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmDateDetails
 * CorporateAction34.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction35#mmDateDetails
 * CorporateAction35.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmDateDetails
 * CorporateAction36.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction38#mmDateDetails
 * CorporateAction38.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmDateDetails
 * CorporateAction40.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmPeriodDetails
 * CorporateAction40.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmRateAndAmountDetails
 * CorporateAction40.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmRateDetails
 * SecuritiesOption55.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmRateDetails
 * SecuritiesOption57.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance10#mmGeneralInformation
 * CorporateActionEventAndBalance10.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmRateDetails
 * SecuritiesOption60.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmRateDetails
 * SecuritiesOption59.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmGeneralInformation
 * CorporateActionEventAndBalance11.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmRateDetails
 * SecuritiesOption61.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance12#mmGeneralInformation
 * CorporateActionEventAndBalance12.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmRateDetails
 * SecuritiesOption63.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmDateDetails
 * CorporateAction41.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmPeriodDetails
 * CorporateAction41.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRateAndAmountDetails
 * CorporateAction41.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmDateDetails
 * CorporateAction43.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmDateDetails
 * CorporateAction42.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmGeneralInformation
 * CorporateActionEventAndBalance13.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmRateDetails
 * SecuritiesOption64.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmRateDetails
 * SecuritiesOption65.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmDateDetails
 * CorporateAction44.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmDateDetails
 * CorporateAction45.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction46#mmDateDetails
 * CorporateAction46.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance14#mmGeneralInformation
 * CorporateActionEventAndBalance14.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction47#mmDateDetails
 * CorporateAction47.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmRateDetails
 * SecuritiesOption67.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction48#mmDateDetails
 * CorporateAction48.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction49#mmDateDetails
 * CorporateAction49.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmRateDetails
 * SecuritiesOption68.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmDateDetails
 * CorporateAction51.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmPeriodDetails
 * CorporateAction51.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmRateAndAmountDetails
 * CorporateAction51.mmRateAndAmountDetails}</li>
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
 * derivationComponent} = List of 599 elements</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEvent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CorporateActionEvent {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEventTypeV3Code type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType3Choice#mmCode
	 * CorporateActionEventType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType3Choice#mmProprietary
	 * CorporateActionEventType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#mmEventType
	 * CorporateActionGeneralInformation8.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType4Choice#mmCode
	 * CorporateActionEventType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType4Choice#mmProprietary
	 * CorporateActionEventType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#mmEventType
	 * CorporateActionGeneralInformation20.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#mmEventType
	 * CorporateActionGeneralInformation25.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#mmEventType
	 * CorporateActionGeneralInformation32.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType7Choice#mmCode
	 * CorporateActionEventType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType7Choice#mmProprietary
	 * CorporateActionEventType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#mmEventType
	 * CorporateActionGeneralInformation35.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType9Choice#mmCode
	 * CorporateActionEventType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType9Choice#mmProprietary
	 * CorporateActionEventType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#mmEventType
	 * CorporateActionGeneralInformation43.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType11Choice#mmCode
	 * CorporateActionEventType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType11Choice#mmProprietary
	 * CorporateActionEventType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType14Choice#mmCode
	 * CorporateActionEventType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType14Choice#mmProprietary
	 * CorporateActionEventType14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#mmEventType
	 * CorporateActionGeneralInformation53.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType13Choice#mmCode
	 * CorporateActionEventType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType13Choice#mmProprietary
	 * CorporateActionEventType13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#mmEventType
	 * CorporateActionGeneralInformation56.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType21Choice#mmCode
	 * CorporateActionEventType21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType21Choice#mmProprietary
	 * CorporateActionEventType21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#mmEventType
	 * CorporateActionGeneralInformation57.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#mmEventType
	 * CorporateActionGeneralInformation9.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#mmEventType
	 * CorporateActionGeneralInformation13.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#mmEventType
	 * CorporateActionGeneralInformation34.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#mmEventType
	 * CorporateActionGeneralInformation42.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmEventType
	 * CorporateActionGeneralInformation52.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType22Choice#mmCode
	 * CorporateActionEventType22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType22Choice#mmProprietary
	 * CorporateActionEventType22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#mmEventType
	 * CorporateActionGeneralInformation58.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#mmEventType
	 * CorporateActionGeneralInformation6.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#mmEventType
	 * CorporateActionGeneralInformation15.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#mmEventType
	 * CorporateActionGeneralInformation21.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#mmEventType
	 * CorporateActionGeneralInformation28.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#mmEventType
	 * CorporateActionGeneralInformation36.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#mmEventType
	 * CorporateActionGeneralInformation44.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#mmEventType
	 * CorporateActionGeneralInformation55.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#mmEventType
	 * CorporateActionGeneralInformation61.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7#mmEventType
	 * CorporateActionGeneralInformation7.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26#mmEventType
	 * CorporateActionGeneralInformation26.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33#mmEventType
	 * CorporateActionGeneralInformation33.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27#mmEventType
	 * CorporateActionGeneralInformation27.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41#mmEventType
	 * CorporateActionGeneralInformation41.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49#mmEventType
	 * CorporateActionGeneralInformation49.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68#mmEventType
	 * CorporateActionGeneralInformation68.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#mmEventType
	 * EventInformation1.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#mmEventType
	 * EventInformation2.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#mmEventType
	 * EventInformation3.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#mmEventType
	 * EventInformation4.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#mmEventType
	 * EventInformation5.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#mmEventType
	 * EventInformation6.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#mmEventType
	 * CorporateActionGeneralInformation4.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#mmEventType
	 * CorporateActionGeneralInformation16.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType5Choice#mmCode
	 * CorporateActionEventType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType5Choice#mmProprietary
	 * CorporateActionEventType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#mmEventType
	 * CorporateActionGeneralInformation24.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType6Choice#mmCode
	 * CorporateActionEventType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType6Choice#mmProprietary
	 * CorporateActionEventType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#mmEventType
	 * CorporateActionGeneralInformation29.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType8Choice#mmCode
	 * CorporateActionEventType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType8Choice#mmProprietary
	 * CorporateActionEventType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#mmEventType
	 * CorporateActionGeneralInformation39.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType10Choice#mmCode
	 * CorporateActionEventType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType10Choice#mmProprietary
	 * CorporateActionEventType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#mmEventType
	 * CorporateActionGeneralInformation47.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType12Choice#mmCode
	 * CorporateActionEventType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType12Choice#mmProprietary
	 * CorporateActionEventType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmEventType
	 * CorporateActionGeneralInformation50.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType27Choice#mmCode
	 * CorporateActionEventType27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType27Choice#mmProprietary
	 * CorporateActionEventType27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmEventType
	 * CorporateActionGeneralInformation62.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmEventType
	 * CorporateActionGeneralInformation3.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmEventType
	 * CorporateActionGeneralInformation17.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmEventType
	 * CorporateActionGeneralInformation23.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmEventType
	 * CorporateActionGeneralInformation30.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmEventType
	 * CorporateActionGeneralInformation38.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmEventType
	 * CorporateActionGeneralInformation46.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmEventType
	 * CorporateActionGeneralInformation54.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType28Choice#mmCode
	 * CorporateActionEventType28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType28Choice#mmProprietary
	 * CorporateActionEventType28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmEventType
	 * CorporateActionGeneralInformation64.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#mmEventType
	 * CorporateActionGeneralInformation63.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmEventType
	 * CorporateActionGeneralInformation11.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmEventType
	 * CorporateActionGeneralInformation19.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmEventType
	 * CorporateActionGeneralInformation22.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmEventType
	 * CorporateActionGeneralInformation31.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmEventType
	 * CorporateActionGeneralInformation37.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmEventType
	 * CorporateActionGeneralInformation45.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmEventType
	 * CorporateActionGeneralInformation51.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmEventType
	 * CorporateActionGeneralInformation67.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType16Choice#mmCode
	 * CorporateActionEventType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType16Choice#mmProprietary
	 * CorporateActionEventType16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType17Choice#mmCode
	 * CorporateActionEventType17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType17Choice#mmProprietary
	 * CorporateActionEventType17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmCorporateActionEventType
	 * IntraPositionMovementDetails1.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmCorporateActionEventType
	 * IntraPositionMovementDetails2.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmCorporateActionEventType
	 * IntraPositionMovementDetails5.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmCorporateActionEventType
	 * IntraPositionMovementDetails6.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmCorporateActionEventType
	 * IntraPositionMovementDetails7.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmCorporateActionEventType
	 * IntraPositionMovementDetails8.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmCorporateActionEventType
	 * IntraPositionMovementDetails9.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmCorporateActionEventType
	 * IntraPositionMovementDetails10.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1Choice#mmCode
	 * CorporateActionEventType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1Choice#mmProprietary
	 * CorporateActionEventType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent2Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2Choice#mmCode
	 * CorporateActionEventType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2Choice#mmProprietary
	 * CorporateActionEventType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent3Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent6Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent8Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType15Choice#mmCode
	 * CorporateActionEventType15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType15Choice#mmProprietary
	 * CorporateActionEventType15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent10Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType19Choice#mmCode
	 * CorporateActionEventType19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType19Choice#mmProprietary
	 * CorporateActionEventType19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent11Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent1Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent4Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent5Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent7Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent9Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent12Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction9#mmEventType
	 * CorporateAction9.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1CodeChoice#mmStructured
	 * CorporateActionEventType1CodeChoice.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType1CodeChoice#mmUnstructured
	 * CorporateActionEventType1CodeChoice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmCorporateActionEventType
	 * InvestmentFundTransaction2.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCorporateActionEventType
	 * InvestmentFundTransaction3.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmExtendedCorporateActionEventType
	 * InvestmentFundTransaction3.mmExtendedCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice#mmCode
	 * CorporateActionEventType2FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice#mmProprietary
	 * CorporateActionEventType2FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmEventType
	 * CorporateActionInformation2.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice#mmCode
	 * CorporateActionFrequencyType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice#mmProprietary
	 * CorporateActionFrequencyType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmEventType
	 * CorporateActionInformation1.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmEventType
	 * CorporateActionStandingInstructionGeneralInformation1.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14#mmEventType
	 * CorporateActionGeneralInformation14.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmCorporateActionEventType
	 * IntraPositionMovementDetails3.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmCorporateActionEventType
	 * IntraPositionMovementDetails4.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#mmEventType
	 * CorporateActionGeneralInformation12.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#mmEventType
	 * CorporateActionGeneralInformation5.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#mmEventType
	 * CorporateActionGeneralInformation71.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmEventType
	 * CorporateActionGeneralInformation69.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmEventType
	 * CorporateActionGeneralInformation70.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmEventType
	 * CorporateActionGeneralInformation78.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#mmEventType
	 * CorporateActionGeneralInformation77.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmEventType
	 * CorporateActionGeneralInformation76.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice#mmCorporateActionType
	 * TransactionType1Choice.mmCorporateActionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateAction1Choice#mmType
	 * CorporateAction1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateAction1Choice#mmProprietary
	 * CorporateAction1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmEventType
	 * CorporateActionGeneralInformation79.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmEventType
	 * CorporateActionGeneralInformation83.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmEventType
	 * CorporateActionGeneralInformation82.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent14Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType30Choice#mmCode
	 * CorporateActionEventType30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType30Choice#mmProprietary
	 * CorporateActionEventType30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice#mmCode
	 * CorporateActionEventType29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice#mmProprietary
	 * CorporateActionEventType29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmCorporateActionEventType
	 * IntraPositionMovementDetails11.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent13Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#mmEventType
	 * CorporateActionGeneralInformation89.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#mmEventType
	 * CorporateActionGeneralInformation88.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#mmEventType
	 * CorporateActionGeneralInformation86.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmEventType
	 * CorporateActionGeneralInformation91.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#mmEventType
	 * CorporateActionGeneralInformation87.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmEventType
	 * CorporateActionGeneralInformation84.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmEventType
	 * CorporateActionGeneralInformation85.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90#mmEventType
	 * CorporateActionGeneralInformation90.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType33Choice#mmCode
	 * CorporateActionEventType33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType33Choice#mmProprietary
	 * CorporateActionEventType33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType32Choice#mmCode
	 * CorporateActionEventType32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType32Choice#mmProprietary
	 * CorporateActionEventType32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType34Choice#mmCode
	 * CorporateActionEventType34Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType34Choice#mmProprietary
	 * CorporateActionEventType34Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType31Choice#mmCode
	 * CorporateActionEventType31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType31Choice#mmProprietary
	 * CorporateActionEventType31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#mmEventType
	 * EventInformation7.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#mmEventType
	 * CorporateActionGeneralInformation93.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmEventType
	 * CorporateActionGeneralInformation98.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmEventType
	 * CorporateActionGeneralInformation100.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#mmEventType
	 * CorporateActionGeneralInformation97.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#mmEventType
	 * CorporateActionGeneralInformation99.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#mmEventType
	 * CorporateActionGeneralInformation94.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmEventType
	 * CorporateActionGeneralInformation103.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType42Choice#mmCode
	 * CorporateActionEventType42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType42Choice#mmProprietary
	 * CorporateActionEventType42Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType35Choice#mmCode
	 * CorporateActionEventType35Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType35Choice#mmProprietary
	 * CorporateActionEventType35Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType41Choice#mmCode
	 * CorporateActionEventType41Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType41Choice#mmProprietary
	 * CorporateActionEventType41Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#mmEventType
	 * EventInformation8.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType36Choice#mmCode
	 * CorporateActionEventType36Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType36Choice#mmProprietary
	 * CorporateActionEventType36Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType46Choice#mmCode
	 * CorporateActionEventType46Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType46Choice#mmProprietary
	 * CorporateActionEventType46Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent16Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent15Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType48Choice#mmCode
	 * CorporateActionEventType48Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType48Choice#mmProprietary
	 * CorporateActionEventType48Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmCorporateActionEventType
	 * IntraPositionMovementDetails12.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104#mmEventType
	 * CorporateActionGeneralInformation104.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType50Choice#mmCode
	 * CorporateActionEventType50Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType50Choice#mmProprietary
	 * CorporateActionEventType50Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmEventType
	 * CorporateActionGeneralInformation109.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmEventType
	 * CorporateActionGeneralInformation111.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmEventType
	 * CorporateActionGeneralInformation112.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmEventType
	 * CorporateActionGeneralInformation110.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmEventType
	 * CorporateActionGeneralInformation105.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmEventType
	 * CorporateActionGeneralInformation107.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmEventType
	 * CorporateActionGeneralInformation106.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmEventType
	 * CorporateActionGeneralInformation108.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice#mmCode
	 * CorporateActionEventType51Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice#mmProprietary
	 * CorporateActionEventType51Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#mmCode
	 * CorporateActionEventType52Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice#mmProprietary
	 * CorporateActionEventType52Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice#mmCode
	 * CorporateActionEventType54Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice#mmProprietary
	 * CorporateActionEventType54Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmEventType
	 * EventInformation9.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice#mmCode
	 * CorporateActionEventType53Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice#mmProprietary
	 * CorporateActionEventType53Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmCorporateActionEventType
	 * IntraPositionMovementDetails13.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice#mmCode
	 * CorporateActionEventType56Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice#mmProprietary
	 * CorporateActionEventType56Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#mmEventType
	 * CorporateActionGeneralInformation114.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#mmEventType
	 * CorporateActionGeneralInformation120.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#mmEventType
	 * CorporateActionGeneralInformation115.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#mmEventType
	 * CorporateActionGeneralInformation118.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121#mmEventType
	 * CorporateActionGeneralInformation121.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#mmEventType
	 * CorporateActionGeneralInformation123.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmEventType
	 * CorporateActionGeneralInformation117.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmEventType
	 * CorporateActionGeneralInformation113.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType62Choice#mmCode
	 * CorporateActionEventType62Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType62Choice#mmProprietary
	 * CorporateActionEventType62Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType61Choice#mmCode
	 * CorporateActionEventType61Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType61Choice#mmProprietary
	 * CorporateActionEventType61Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#mmEventType
	 * EventInformation10.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmCorporateActionEventType
	 * IntraPositionMovementDetails14.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent20Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType71Choice#mmCode
	 * CorporateActionEventType71Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType71Choice#mmProprietary
	 * CorporateActionEventType71Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType69Choice#mmCode
	 * CorporateActionEventType69Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType69Choice#mmProprietary
	 * CorporateActionEventType69Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent21Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType57Choice#mmCode
	 * CorporateActionEventType57Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType57Choice#mmProprietary
	 * CorporateActionEventType57Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType58Choice#mmCode
	 * CorporateActionEventType58Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType58Choice#mmProprietary
	 * CorporateActionEventType58Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent22Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent22Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice#mmCode
	 * CorporateActionEventType73Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice#mmProprietary
	 * CorporateActionEventType73Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent23Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent23Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmCorporateActionEventType
	 * IntraPositionMovementDetails15.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmEventType
	 * CorporateActionGeneralInformation127.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmEventType
	 * CorporateActionGeneralInformation126.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmEventType
	 * CorporateActionGeneralInformation125.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmEventType
	 * CorporateActionGeneralInformation124.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmEventType
	 * CorporateActionGeneralInformation128.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice#mmCode
	 * CorporateActionEventType74Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice#mmProprietary
	 * CorporateActionEventType74Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice#mmCode
	 * CorporateActionEventType75Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice#mmProprietary
	 * CorporateActionEventType75Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice#mmCode
	 * CorporateActionEventType76Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice#mmProprietary
	 * CorporateActionEventType76Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmEventType
	 * EventInformation11.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation129#mmEventType
	 * CorporateActionGeneralInformation129.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType77Choice#mmCode
	 * CorporateActionEventType77Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType77Choice#mmProprietary
	 * CorporateActionEventType77Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation12#mmEventType
	 * EventInformation12.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130#mmEventType
	 * CorporateActionGeneralInformation130.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType78Choice#mmCode
	 * CorporateActionEventType78Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType78Choice#mmProprietary
	 * CorporateActionEventType78Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation131#mmEventType
	 * CorporateActionGeneralInformation131.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType79Choice#mmCode
	 * CorporateActionEventType79Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType79Choice#mmProprietary
	 * CorporateActionEventType79Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmEventType
	 * CorporateActionGeneralInformation132.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmEventType
	 * CorporateActionGeneralInformation134.mmEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType83Choice#mmCode
	 * CorporateActionEventType83Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType83Choice#mmProprietary
	 * CorporateActionEventType83Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails16#mmCorporateActionEventType
	 * IntraPositionMovementDetails16.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent24Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent24Choice.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent25Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent25Choice.mmCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionEventTypeV3Code> mmType = new MMBusinessAttribute<CorporateActionEvent, CorporateActionEventTypeV3Code>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventType3Choice.mmCode, CorporateActionEventType3Choice.mmProprietary, CorporateActionGeneralInformation8.mmEventType, CorporateActionEventType4Choice.mmCode,
					CorporateActionEventType4Choice.mmProprietary, CorporateActionGeneralInformation20.mmEventType, CorporateActionGeneralInformation25.mmEventType, CorporateActionGeneralInformation32.mmEventType,
					CorporateActionEventType7Choice.mmCode, CorporateActionEventType7Choice.mmProprietary, CorporateActionGeneralInformation35.mmEventType, CorporateActionEventType9Choice.mmCode,
					CorporateActionEventType9Choice.mmProprietary, CorporateActionGeneralInformation43.mmEventType, CorporateActionEventType11Choice.mmCode, CorporateActionEventType11Choice.mmProprietary,
					CorporateActionEventType14Choice.mmCode, CorporateActionEventType14Choice.mmProprietary, CorporateActionGeneralInformation53.mmEventType, CorporateActionEventType13Choice.mmCode,
					CorporateActionEventType13Choice.mmProprietary, CorporateActionGeneralInformation56.mmEventType, CorporateActionEventType21Choice.mmCode, CorporateActionEventType21Choice.mmProprietary,
					CorporateActionGeneralInformation57.mmEventType, CorporateActionGeneralInformation9.mmEventType, CorporateActionGeneralInformation13.mmEventType, CorporateActionGeneralInformation34.mmEventType,
					CorporateActionGeneralInformation42.mmEventType, CorporateActionGeneralInformation52.mmEventType, CorporateActionEventType22Choice.mmCode, CorporateActionEventType22Choice.mmProprietary,
					CorporateActionGeneralInformation58.mmEventType, CorporateActionGeneralInformation6.mmEventType, CorporateActionGeneralInformation15.mmEventType, CorporateActionGeneralInformation21.mmEventType,
					CorporateActionGeneralInformation28.mmEventType, CorporateActionGeneralInformation36.mmEventType, CorporateActionGeneralInformation44.mmEventType, CorporateActionGeneralInformation55.mmEventType,
					CorporateActionGeneralInformation61.mmEventType, CorporateActionGeneralInformation7.mmEventType, CorporateActionGeneralInformation26.mmEventType, CorporateActionGeneralInformation33.mmEventType,
					CorporateActionGeneralInformation27.mmEventType, CorporateActionGeneralInformation41.mmEventType, CorporateActionGeneralInformation49.mmEventType, CorporateActionGeneralInformation68.mmEventType,
					EventInformation1.mmEventType, EventInformation2.mmEventType, EventInformation3.mmEventType, EventInformation4.mmEventType, EventInformation5.mmEventType, EventInformation6.mmEventType,
					CorporateActionGeneralInformation4.mmEventType, CorporateActionGeneralInformation16.mmEventType, CorporateActionEventType5Choice.mmCode, CorporateActionEventType5Choice.mmProprietary,
					CorporateActionGeneralInformation24.mmEventType, CorporateActionEventType6Choice.mmCode, CorporateActionEventType6Choice.mmProprietary, CorporateActionGeneralInformation29.mmEventType,
					CorporateActionEventType8Choice.mmCode, CorporateActionEventType8Choice.mmProprietary, CorporateActionGeneralInformation39.mmEventType, CorporateActionEventType10Choice.mmCode,
					CorporateActionEventType10Choice.mmProprietary, CorporateActionGeneralInformation47.mmEventType, CorporateActionEventType12Choice.mmCode, CorporateActionEventType12Choice.mmProprietary,
					CorporateActionGeneralInformation50.mmEventType, CorporateActionEventType27Choice.mmCode, CorporateActionEventType27Choice.mmProprietary, CorporateActionGeneralInformation62.mmEventType,
					CorporateActionGeneralInformation3.mmEventType, CorporateActionGeneralInformation17.mmEventType, CorporateActionGeneralInformation23.mmEventType, CorporateActionGeneralInformation30.mmEventType,
					CorporateActionGeneralInformation38.mmEventType, CorporateActionGeneralInformation46.mmEventType, CorporateActionGeneralInformation54.mmEventType, CorporateActionEventType28Choice.mmCode,
					CorporateActionEventType28Choice.mmProprietary, CorporateActionGeneralInformation64.mmEventType, CorporateActionGeneralInformation63.mmEventType, CorporateActionGeneralInformation11.mmEventType,
					CorporateActionGeneralInformation19.mmEventType, CorporateActionGeneralInformation22.mmEventType, CorporateActionGeneralInformation31.mmEventType, CorporateActionGeneralInformation37.mmEventType,
					CorporateActionGeneralInformation45.mmEventType, CorporateActionGeneralInformation51.mmEventType, CorporateActionGeneralInformation67.mmEventType, CorporateActionEventType16Choice.mmCode,
					CorporateActionEventType16Choice.mmProprietary, CorporateActionEventType17Choice.mmCode, CorporateActionEventType17Choice.mmProprietary, IntraPositionMovementDetails1.mmCorporateActionEventType,
					IntraPositionMovementDetails2.mmCorporateActionEventType, IntraPositionMovementDetails5.mmCorporateActionEventType, IntraPositionMovementDetails6.mmCorporateActionEventType,
					IntraPositionMovementDetails7.mmCorporateActionEventType, IntraPositionMovementDetails8.mmCorporateActionEventType, IntraPositionMovementDetails9.mmCorporateActionEventType,
					IntraPositionMovementDetails10.mmCorporateActionEventType, CorporateActionEventType1Choice.mmCode, CorporateActionEventType1Choice.mmProprietary, SettlementOrCorporateActionEvent2Choice.mmCorporateActionEventType,
					CorporateActionEventType2Choice.mmCode, CorporateActionEventType2Choice.mmProprietary, SettlementOrCorporateActionEvent3Choice.mmCorporateActionEventType,
					SettlementOrCorporateActionEvent6Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent8Choice.mmCorporateActionEventType, CorporateActionEventType15Choice.mmCode,
					CorporateActionEventType15Choice.mmProprietary, SettlementOrCorporateActionEvent10Choice.mmCorporateActionEventType, CorporateActionEventType19Choice.mmCode, CorporateActionEventType19Choice.mmProprietary,
					SettlementOrCorporateActionEvent11Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent1Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent4Choice.mmCorporateActionEventType,
					SettlementOrCorporateActionEvent5Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent7Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent9Choice.mmCorporateActionEventType,
					SettlementOrCorporateActionEvent12Choice.mmCorporateActionEventType, CorporateAction9.mmEventType, CorporateActionEventType1CodeChoice.mmStructured, CorporateActionEventType1CodeChoice.mmUnstructured,
					InvestmentFundTransaction2.mmCorporateActionEventType, InvestmentFundTransaction3.mmCorporateActionEventType, InvestmentFundTransaction3.mmExtendedCorporateActionEventType, CorporateActionEventType2FormatChoice.mmCode,
					CorporateActionEventType2FormatChoice.mmProprietary, CorporateActionInformation2.mmEventType, CorporateActionFrequencyType1FormatChoice.mmCode, CorporateActionFrequencyType1FormatChoice.mmProprietary,
					CorporateActionInformation1.mmEventType, CorporateActionStandingInstructionGeneralInformation1.mmEventType, CorporateActionGeneralInformation14.mmEventType, IntraPositionMovementDetails3.mmCorporateActionEventType,
					IntraPositionMovementDetails4.mmCorporateActionEventType, CorporateActionGeneralInformation12.mmEventType, CorporateActionGeneralInformation5.mmEventType, CorporateActionGeneralInformation71.mmEventType,
					CorporateActionGeneralInformation69.mmEventType, CorporateActionGeneralInformation70.mmEventType, CorporateActionGeneralInformation78.mmEventType, CorporateActionGeneralInformation77.mmEventType,
					CorporateActionGeneralInformation76.mmEventType, TransactionType1Choice.mmCorporateActionType, CorporateAction1Choice.mmType, CorporateAction1Choice.mmProprietary, CorporateActionGeneralInformation79.mmEventType,
					CorporateActionGeneralInformation83.mmEventType, CorporateActionGeneralInformation82.mmEventType, SettlementOrCorporateActionEvent14Choice.mmCorporateActionEventType, CorporateActionEventType30Choice.mmCode,
					CorporateActionEventType30Choice.mmProprietary, CorporateActionEventType29Choice.mmCode, CorporateActionEventType29Choice.mmProprietary, IntraPositionMovementDetails11.mmCorporateActionEventType,
					SettlementOrCorporateActionEvent13Choice.mmCorporateActionEventType, CorporateActionGeneralInformation89.mmEventType, CorporateActionGeneralInformation88.mmEventType, CorporateActionGeneralInformation86.mmEventType,
					CorporateActionGeneralInformation91.mmEventType, CorporateActionGeneralInformation87.mmEventType, CorporateActionGeneralInformation84.mmEventType, CorporateActionGeneralInformation85.mmEventType,
					CorporateActionGeneralInformation90.mmEventType, CorporateActionEventType33Choice.mmCode, CorporateActionEventType33Choice.mmProprietary, CorporateActionEventType32Choice.mmCode,
					CorporateActionEventType32Choice.mmProprietary, CorporateActionEventType34Choice.mmCode, CorporateActionEventType34Choice.mmProprietary, CorporateActionEventType31Choice.mmCode,
					CorporateActionEventType31Choice.mmProprietary, EventInformation7.mmEventType, CorporateActionGeneralInformation93.mmEventType, CorporateActionGeneralInformation98.mmEventType,
					CorporateActionGeneralInformation100.mmEventType, CorporateActionGeneralInformation97.mmEventType, CorporateActionGeneralInformation99.mmEventType, CorporateActionGeneralInformation94.mmEventType,
					CorporateActionGeneralInformation103.mmEventType, CorporateActionEventType42Choice.mmCode, CorporateActionEventType42Choice.mmProprietary, CorporateActionEventType35Choice.mmCode,
					CorporateActionEventType35Choice.mmProprietary, CorporateActionEventType41Choice.mmCode, CorporateActionEventType41Choice.mmProprietary, EventInformation8.mmEventType, CorporateActionEventType36Choice.mmCode,
					CorporateActionEventType36Choice.mmProprietary, CorporateActionEventType46Choice.mmCode, CorporateActionEventType46Choice.mmProprietary, SettlementOrCorporateActionEvent16Choice.mmCorporateActionEventType,
					SettlementOrCorporateActionEvent15Choice.mmCorporateActionEventType, CorporateActionEventType48Choice.mmCode, CorporateActionEventType48Choice.mmProprietary, IntraPositionMovementDetails12.mmCorporateActionEventType,
					CorporateActionGeneralInformation104.mmEventType, CorporateActionEventType50Choice.mmCode, CorporateActionEventType50Choice.mmProprietary, CorporateActionGeneralInformation109.mmEventType,
					CorporateActionGeneralInformation111.mmEventType, CorporateActionGeneralInformation112.mmEventType, CorporateActionGeneralInformation110.mmEventType, CorporateActionGeneralInformation105.mmEventType,
					CorporateActionGeneralInformation107.mmEventType, CorporateActionGeneralInformation106.mmEventType, CorporateActionGeneralInformation108.mmEventType, CorporateActionEventType51Choice.mmCode,
					CorporateActionEventType51Choice.mmProprietary, CorporateActionEventType52Choice.mmCode, CorporateActionEventType52Choice.mmProprietary, CorporateActionEventType54Choice.mmCode,
					CorporateActionEventType54Choice.mmProprietary, EventInformation9.mmEventType, CorporateActionEventType53Choice.mmCode, CorporateActionEventType53Choice.mmProprietary,
					SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType, IntraPositionMovementDetails13.mmCorporateActionEventType,
					CorporateActionEventType56Choice.mmCode, CorporateActionEventType56Choice.mmProprietary, CorporateActionGeneralInformation114.mmEventType, CorporateActionGeneralInformation120.mmEventType,
					CorporateActionGeneralInformation115.mmEventType, CorporateActionGeneralInformation118.mmEventType, CorporateActionGeneralInformation121.mmEventType, CorporateActionGeneralInformation123.mmEventType,
					CorporateActionGeneralInformation117.mmEventType, CorporateActionGeneralInformation113.mmEventType, CorporateActionEventType62Choice.mmCode, CorporateActionEventType62Choice.mmProprietary,
					CorporateActionEventType61Choice.mmCode, CorporateActionEventType61Choice.mmProprietary, EventInformation10.mmEventType, IntraPositionMovementDetails14.mmCorporateActionEventType,
					SettlementOrCorporateActionEvent20Choice.mmCorporateActionEventType, CorporateActionEventType71Choice.mmCode, CorporateActionEventType71Choice.mmProprietary, CorporateActionEventType69Choice.mmCode,
					CorporateActionEventType69Choice.mmProprietary, SettlementOrCorporateActionEvent21Choice.mmCorporateActionEventType, CorporateActionEventType57Choice.mmCode, CorporateActionEventType57Choice.mmProprietary,
					CorporateActionEventType58Choice.mmCode, CorporateActionEventType58Choice.mmProprietary, SettlementOrCorporateActionEvent22Choice.mmCorporateActionEventType, CorporateActionEventType73Choice.mmCode,
					CorporateActionEventType73Choice.mmProprietary, SettlementOrCorporateActionEvent23Choice.mmCorporateActionEventType, IntraPositionMovementDetails15.mmCorporateActionEventType,
					CorporateActionGeneralInformation127.mmEventType, CorporateActionGeneralInformation126.mmEventType, CorporateActionGeneralInformation125.mmEventType, CorporateActionGeneralInformation124.mmEventType,
					CorporateActionGeneralInformation128.mmEventType, CorporateActionEventType74Choice.mmCode, CorporateActionEventType74Choice.mmProprietary, CorporateActionEventType75Choice.mmCode,
					CorporateActionEventType75Choice.mmProprietary, CorporateActionEventType76Choice.mmCode, CorporateActionEventType76Choice.mmProprietary, EventInformation11.mmEventType, CorporateActionGeneralInformation129.mmEventType,
					CorporateActionEventType77Choice.mmCode, CorporateActionEventType77Choice.mmProprietary, EventInformation12.mmEventType, CorporateActionGeneralInformation130.mmEventType, CorporateActionEventType78Choice.mmCode,
					CorporateActionEventType78Choice.mmProprietary, CorporateActionGeneralInformation131.mmEventType, CorporateActionEventType79Choice.mmCode, CorporateActionEventType79Choice.mmProprietary,
					CorporateActionGeneralInformation132.mmEventType, CorporateActionGeneralInformation134.mmEventType, CorporateActionEventType83Choice.mmCode, CorporateActionEventType83Choice.mmProprietary,
					IntraPositionMovementDetails16.mmCorporateActionEventType, SettlementOrCorporateActionEvent24Choice.mmCorporateActionEventType, SettlementOrCorporateActionEvent25Choice.mmCorporateActionEventType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}

		@Override
		public CorporateActionEventTypeV3Code getValue(CorporateActionEvent obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionEventTypeV3Code value) {
			obj.setType(value);
		}
	};
	protected CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice#mmCode
	 * CorporateActionMandatoryVoluntary1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice#mmProprietary
	 * CorporateActionMandatoryVoluntary1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation8.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice#mmCode
	 * CorporateActionMandatoryVoluntary2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice#mmProprietary
	 * CorporateActionMandatoryVoluntary2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation20.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation25.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation32.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation35.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation43.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation53.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation56.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation57.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#mmMandatoryVoluntaryEventType
	 * EventInformation1.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#mmMandatoryVoluntaryEventType
	 * EventInformation2.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#mmMandatoryVoluntaryEventType
	 * EventInformation3.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#mmMandatoryVoluntaryEventType
	 * EventInformation4.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#mmMandatoryVoluntaryEventType
	 * EventInformation5.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#mmMandatoryVoluntaryEventType
	 * EventInformation6.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation3.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation17.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation23.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation30.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation38.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation46.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation54.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation64.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation63.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation11.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation19.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation22.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation31.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation37.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation45.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation51.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation67.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice#mmCode
	 * CorporateActionMandatoryVoluntary1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice#mmProprietary
	 * CorporateActionMandatoryVoluntary1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmMandatoryVoluntaryEventType
	 * CorporateActionInformation2.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmMandatoryVoluntaryEventType
	 * CorporateActionInformation1.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation12.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation69.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation70.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation78.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation76.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation86.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation87.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation84.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation85.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice#mmCode
	 * CorporateActionMandatoryVoluntary3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice#mmProprietary
	 * CorporateActionMandatoryVoluntary3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#mmMandatoryVoluntaryEventType
	 * EventInformation7.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation93.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation100.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation99.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation103.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#mmMandatoryVoluntaryEventType
	 * EventInformation8.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice#mmCode
	 * CorporateActionMandatoryVoluntary4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice#mmProprietary
	 * CorporateActionMandatoryVoluntary4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation112.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation105.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation106.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation108.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmMandatoryVoluntaryEventType
	 * EventInformation9.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation120.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation123.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation117.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation113.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#mmMandatoryVoluntaryEventType
	 * EventInformation10.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation127.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation125.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation124.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation128.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmMandatoryVoluntaryEventType
	 * EventInformation11.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation129#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation129.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation12#mmMandatoryVoluntaryEventType
	 * EventInformation12.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation131#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation131.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation132.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformation134.mmMandatoryVoluntaryEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionMandatoryVoluntaryCode> mmMandatoryVoluntaryEventType = new MMBusinessAttribute<CorporateActionEvent, CorporateActionMandatoryVoluntaryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionMandatoryVoluntary1Choice.mmCode, CorporateActionMandatoryVoluntary1Choice.mmProprietary, CorporateActionGeneralInformation8.mmMandatoryVoluntaryEventType,
					CorporateActionMandatoryVoluntary2Choice.mmCode, CorporateActionMandatoryVoluntary2Choice.mmProprietary, CorporateActionGeneralInformation20.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation25.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation32.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation35.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation43.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation53.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation56.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation57.mmMandatoryVoluntaryEventType, EventInformation1.mmMandatoryVoluntaryEventType, EventInformation2.mmMandatoryVoluntaryEventType, EventInformation3.mmMandatoryVoluntaryEventType,
					EventInformation4.mmMandatoryVoluntaryEventType, EventInformation5.mmMandatoryVoluntaryEventType, EventInformation6.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation3.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation17.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation23.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation30.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation38.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation46.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation54.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation64.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation63.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation11.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation19.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation22.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation31.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation37.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation45.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation51.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation67.mmMandatoryVoluntaryEventType, CorporateActionMandatoryVoluntary1FormatChoice.mmCode, CorporateActionMandatoryVoluntary1FormatChoice.mmProprietary,
					CorporateActionInformation2.mmMandatoryVoluntaryEventType, CorporateActionInformation1.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation12.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation69.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation70.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation78.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation76.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation86.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation87.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation84.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation85.mmMandatoryVoluntaryEventType, CorporateActionMandatoryVoluntary3Choice.mmCode,
					CorporateActionMandatoryVoluntary3Choice.mmProprietary, EventInformation7.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation93.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation100.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation99.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation103.mmMandatoryVoluntaryEventType,
					EventInformation8.mmMandatoryVoluntaryEventType, CorporateActionMandatoryVoluntary4Choice.mmCode, CorporateActionMandatoryVoluntary4Choice.mmProprietary,
					CorporateActionGeneralInformation112.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation105.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation106.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation108.mmMandatoryVoluntaryEventType, EventInformation9.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation120.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation123.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation117.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation113.mmMandatoryVoluntaryEventType,
					EventInformation10.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation127.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation125.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation124.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation128.mmMandatoryVoluntaryEventType, EventInformation11.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation129.mmMandatoryVoluntaryEventType, EventInformation12.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation131.mmMandatoryVoluntaryEventType,
					CorporateActionGeneralInformation132.mmMandatoryVoluntaryEventType, CorporateActionGeneralInformation134.mmMandatoryVoluntaryEventType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}

		@Override
		public CorporateActionMandatoryVoluntaryCode getValue(CorporateActionEvent obj) {
			return obj.getMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionMandatoryVoluntaryCode value) {
			obj.setMandatoryVoluntaryEventType(value);
		}
	};
	protected Security underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation6.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation15.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation21.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation28.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation36.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation44.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation55.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation61.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance1#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance1.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance2#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance2.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance3#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance3.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance4.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance5.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance6#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance6.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance7.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance8.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmDateDetails
	 * SecuritiesOption3.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmDateDetails
	 * SecuritiesOption8.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmDateDetails
	 * SecuritiesOption18.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmDateDetails
	 * SecuritiesOption20.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmDateDetails
	 * SecuritiesOption26.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmDateDetails
	 * SecuritiesOption31.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmDateDetails
	 * SecuritiesOption35.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmDateDetails
	 * SecuritiesOption36.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation3.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmSecurityDetails
	 * SecuritiesOption4.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmDateDetails
	 * SecuritiesOption4.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation17.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmSecurityDetails
	 * SecuritiesOption10.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmDateDetails
	 * SecuritiesOption10.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation23.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmSecurityDetails
	 * SecuritiesOption13.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmDateDetails
	 * SecuritiesOption13.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation30.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmSecurityDetails
	 * SecuritiesOption17.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmDateDetails
	 * SecuritiesOption17.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation38.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmSecurityDetails
	 * SecuritiesOption24.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmDateDetails
	 * SecuritiesOption24.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation46.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmSecurityDetails
	 * SecuritiesOption29.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmDateDetails
	 * SecuritiesOption29.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation54.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmSecurityDetails
	 * SecuritiesOption33.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmDateDetails
	 * SecuritiesOption33.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmSecurityDetails
	 * SecuritiesOption38.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmDateDetails
	 * SecuritiesOption38.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation64.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmSecurityDetails
	 * SecuritiesOption37.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmDateDetails
	 * SecuritiesOption37.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmSecurityDetails
	 * SecuritiesOption39.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmDateDetails
	 * SecuritiesOption39.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation11.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmSecurityDetails
	 * SecuritiesOption6.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmDateDetails
	 * SecuritiesOption6.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation19.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmSecurityDetails
	 * SecuritiesOption12.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmDateDetails
	 * SecuritiesOption12.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation22.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmSecurityDetails
	 * SecuritiesOption14.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmDateDetails
	 * SecuritiesOption14.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation31.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmSecurityDetails
	 * SecuritiesOption22.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmDateDetails
	 * SecuritiesOption22.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation37.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmSecurityDetails
	 * SecuritiesOption25.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmDateDetails
	 * SecuritiesOption25.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation45.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmSecurityDetails
	 * SecuritiesOption30.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmDateDetails
	 * SecuritiesOption30.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation51.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation67.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmUnderlyingSecurity
	 * CorporateActionInformation2.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmOtherUnderlyingSecurity
	 * CorporateActionInformation2.mmOtherUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmUnderlyingSecurity
	 * CorporateActionInformation1.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmUnderlyingSecurity
	 * CorporateActionStandingInstructionGeneralInformation1.
	 * mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation5.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation71.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation69.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation70.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmDateDetails
	 * SecuritiesOption42.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmSecurityDetails
	 * SecuritiesOption40.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmDateDetails
	 * SecuritiesOption40.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation78.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation77.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation76.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmDateDetails
	 * SecuritiesOption48.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmSecurityDetails
	 * SecuritiesOption45.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmDateDetails
	 * SecuritiesOption45.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation88.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation84.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation85.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmSecurityDetails
	 * SecuritiesOption49.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmDateDetails
	 * SecuritiesOption49.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance9.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmDateDetails
	 * SecuritiesOption50.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation100.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation97.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation103.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmDateDetails
	 * SecuritiesOption55.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmSecurityDetails
	 * SecuritiesOption57.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmDateDetails
	 * SecuritiesOption57.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance10#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance10.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation105.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation107.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation106.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmDateDetails
	 * SecuritiesOption60.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmSecurityDetails
	 * SecuritiesOption59.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmDateDetails
	 * SecuritiesOption59.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance11.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation115.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation117.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation113.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmSecurityDetails
	 * SecuritiesOption61.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmDateDetails
	 * SecuritiesOption61.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance12#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance12.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmDateDetails
	 * SecuritiesOption63.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation125.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation128.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance13.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmSecurityDetails
	 * SecuritiesOption64.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmDateDetails
	 * SecuritiesOption64.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmDateDetails
	 * SecuritiesOption65.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance14#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance14.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmDateDetails
	 * SecuritiesOption67.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation132.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmSecurityDetails
	 * SecuritiesOption68.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmDateDetails
	 * SecuritiesOption68.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmUnderlyingSecurity
	 * CorporateActionGeneralInformation134.mmUnderlyingSecurity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security to which this instruction or event applies."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Security> mmUnderlyingSecurity = new MMBusinessAssociationEnd<CorporateActionEvent, Security>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation6.mmUnderlyingSecurity, CorporateActionGeneralInformation15.mmUnderlyingSecurity, CorporateActionGeneralInformation21.mmUnderlyingSecurity,
					CorporateActionGeneralInformation28.mmUnderlyingSecurity, CorporateActionGeneralInformation36.mmUnderlyingSecurity, CorporateActionGeneralInformation44.mmUnderlyingSecurity,
					CorporateActionGeneralInformation55.mmUnderlyingSecurity, CorporateActionGeneralInformation61.mmUnderlyingSecurity, CorporateActionEventAndBalance1.mmUnderlyingSecurity,
					CorporateActionEventAndBalance2.mmUnderlyingSecurity, CorporateActionEventAndBalance3.mmUnderlyingSecurity, CorporateActionEventAndBalance4.mmUnderlyingSecurity, CorporateActionEventAndBalance5.mmUnderlyingSecurity,
					CorporateActionEventAndBalance6.mmUnderlyingSecurity, CorporateActionEventAndBalance7.mmUnderlyingSecurity, CorporateActionEventAndBalance8.mmUnderlyingSecurity, SecuritiesOption3.mmDateDetails,
					SecuritiesOption8.mmDateDetails, SecuritiesOption18.mmDateDetails, SecuritiesOption20.mmDateDetails, SecuritiesOption26.mmDateDetails, SecuritiesOption31.mmDateDetails, SecuritiesOption35.mmDateDetails,
					SecuritiesOption36.mmDateDetails, CorporateActionGeneralInformation3.mmUnderlyingSecurity, SecuritiesOption4.mmSecurityDetails, SecuritiesOption4.mmDateDetails, CorporateActionGeneralInformation17.mmUnderlyingSecurity,
					SecuritiesOption10.mmSecurityDetails, SecuritiesOption10.mmDateDetails, CorporateActionGeneralInformation23.mmUnderlyingSecurity, SecuritiesOption13.mmSecurityDetails, SecuritiesOption13.mmDateDetails,
					CorporateActionGeneralInformation30.mmUnderlyingSecurity, SecuritiesOption17.mmSecurityDetails, SecuritiesOption17.mmDateDetails, CorporateActionGeneralInformation38.mmUnderlyingSecurity,
					SecuritiesOption24.mmSecurityDetails, SecuritiesOption24.mmDateDetails, CorporateActionGeneralInformation46.mmUnderlyingSecurity, SecuritiesOption29.mmSecurityDetails, SecuritiesOption29.mmDateDetails,
					CorporateActionGeneralInformation54.mmUnderlyingSecurity, SecuritiesOption33.mmSecurityDetails, SecuritiesOption33.mmDateDetails, SecuritiesOption38.mmSecurityDetails, SecuritiesOption38.mmDateDetails,
					CorporateActionGeneralInformation64.mmUnderlyingSecurity, SecuritiesOption37.mmSecurityDetails, SecuritiesOption37.mmDateDetails, SecuritiesOption39.mmSecurityDetails, SecuritiesOption39.mmDateDetails,
					CorporateActionGeneralInformation11.mmUnderlyingSecurity, SecuritiesOption6.mmSecurityDetails, SecuritiesOption6.mmDateDetails, CorporateActionGeneralInformation19.mmUnderlyingSecurity,
					SecuritiesOption12.mmSecurityDetails, SecuritiesOption12.mmDateDetails, CorporateActionGeneralInformation22.mmUnderlyingSecurity, SecuritiesOption14.mmSecurityDetails, SecuritiesOption14.mmDateDetails,
					CorporateActionGeneralInformation31.mmUnderlyingSecurity, SecuritiesOption22.mmSecurityDetails, SecuritiesOption22.mmDateDetails, CorporateActionGeneralInformation37.mmUnderlyingSecurity,
					SecuritiesOption25.mmSecurityDetails, SecuritiesOption25.mmDateDetails, CorporateActionGeneralInformation45.mmUnderlyingSecurity, SecuritiesOption30.mmSecurityDetails, SecuritiesOption30.mmDateDetails,
					CorporateActionGeneralInformation51.mmUnderlyingSecurity, CorporateActionGeneralInformation67.mmUnderlyingSecurity, CorporateActionInformation2.mmUnderlyingSecurity,
					CorporateActionInformation2.mmOtherUnderlyingSecurity, CorporateActionInformation1.mmUnderlyingSecurity, CorporateActionStandingInstructionGeneralInformation1.mmUnderlyingSecurity,
					CorporateActionGeneralInformation5.mmUnderlyingSecurity, CorporateActionGeneralInformation71.mmUnderlyingSecurity, CorporateActionGeneralInformation69.mmUnderlyingSecurity,
					CorporateActionGeneralInformation70.mmUnderlyingSecurity, SecuritiesOption42.mmDateDetails, SecuritiesOption40.mmSecurityDetails, SecuritiesOption40.mmDateDetails,
					CorporateActionGeneralInformation78.mmUnderlyingSecurity, CorporateActionGeneralInformation77.mmUnderlyingSecurity, CorporateActionGeneralInformation76.mmUnderlyingSecurity, SecuritiesOption48.mmDateDetails,
					SecuritiesOption45.mmSecurityDetails, SecuritiesOption45.mmDateDetails, CorporateActionGeneralInformation88.mmUnderlyingSecurity, CorporateActionGeneralInformation84.mmUnderlyingSecurity,
					CorporateActionGeneralInformation85.mmUnderlyingSecurity, SecuritiesOption49.mmSecurityDetails, SecuritiesOption49.mmDateDetails, CorporateActionEventAndBalance9.mmUnderlyingSecurity, SecuritiesOption50.mmDateDetails,
					CorporateActionGeneralInformation100.mmUnderlyingSecurity, CorporateActionGeneralInformation97.mmUnderlyingSecurity, CorporateActionGeneralInformation103.mmUnderlyingSecurity, SecuritiesOption55.mmDateDetails,
					SecuritiesOption57.mmSecurityDetails, SecuritiesOption57.mmDateDetails, CorporateActionEventAndBalance10.mmUnderlyingSecurity, CorporateActionGeneralInformation105.mmUnderlyingSecurity,
					CorporateActionGeneralInformation107.mmUnderlyingSecurity, CorporateActionGeneralInformation106.mmUnderlyingSecurity, SecuritiesOption60.mmDateDetails, SecuritiesOption59.mmSecurityDetails,
					SecuritiesOption59.mmDateDetails, CorporateActionEventAndBalance11.mmUnderlyingSecurity, CorporateActionGeneralInformation115.mmUnderlyingSecurity, CorporateActionGeneralInformation117.mmUnderlyingSecurity,
					CorporateActionGeneralInformation113.mmUnderlyingSecurity, SecuritiesOption61.mmSecurityDetails, SecuritiesOption61.mmDateDetails, CorporateActionEventAndBalance12.mmUnderlyingSecurity, SecuritiesOption63.mmDateDetails,
					CorporateActionGeneralInformation125.mmUnderlyingSecurity, CorporateActionGeneralInformation128.mmUnderlyingSecurity, CorporateActionEventAndBalance13.mmUnderlyingSecurity, SecuritiesOption64.mmSecurityDetails,
					SecuritiesOption64.mmDateDetails, SecuritiesOption65.mmDateDetails, CorporateActionEventAndBalance14.mmUnderlyingSecurity, SecuritiesOption67.mmDateDetails, CorporateActionGeneralInformation132.mmUnderlyingSecurity,
					SecuritiesOption68.mmSecurityDetails, SecuritiesOption68.mmDateDetails, CorporateActionGeneralInformation134.mmUnderlyingSecurity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(CorporateActionEvent obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Security value) {
			obj.setUnderlyingSecurity(value);
		}
	};
	protected List<CorporateActionPrice> corporateActionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
	 * CorporateActionPrice.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmPriceDetails
	 * CorporateActionOption5.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmPriceDetails
	 * CorporateActionOption13.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmPriceDetails
	 * CorporateActionOption25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmPriceDetails
	 * CorporateActionOption30.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmPriceDetails
	 * CorporateActionOption38.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmPriceDetails
	 * CorporateActionOption47.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmPriceDetails
	 * CorporateActionOption57.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmPriceDetails
	 * CorporateActionOption58.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmPriceDetails
	 * SecuritiesOption3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmPriceDetails
	 * CorporateActionOption4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmPriceDetails
	 * SecuritiesOption8.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmPriceDetails
	 * CorporateActionOption14.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmPriceDetails
	 * SecuritiesOption18.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmPriceDetails
	 * CashOption12.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmPriceDetails
	 * CorporateActionOption23.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmPriceDetails
	 * SecuritiesOption20.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmPriceDetails
	 * CashOption13.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmPriceDetails
	 * CorporateActionOption31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmPriceDetails
	 * SecuritiesOption26.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmPriceDetails
	 * CashOption18.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmPriceDetails
	 * CorporateActionOption37.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmPriceDetails
	 * SecuritiesOption31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmPriceDetails
	 * CashOption22.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmPriceDetails
	 * CorporateActionOption46.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmPriceDetails
	 * SecuritiesOption35.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmPriceDetails
	 * CashOption26.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmPriceDetails
	 * CorporateActionOption53.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmPriceDetails
	 * SecuritiesOption36.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmPriceDetails
	 * CashOption27.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmPriceDetails
	 * CorporateActionOption54.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmPriceDetails
	 * SecuritiesOption4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmPriceDetails
	 * CorporateActionOption10.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmPriceDetails
	 * SecuritiesOption10.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmPriceDetails
	 * CorporateActionOption15.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmPriceDetails
	 * SecuritiesOption13.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmPriceDetails
	 * CashOption11.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmPriceDetails
	 * CorporateActionOption20.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmPriceDetails
	 * SecuritiesOption17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmPriceDetails
	 * CashOption14.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmPriceDetails
	 * CorporateActionOption32.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmPriceDetails
	 * SecuritiesOption24.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmPriceDetails
	 * CashOption16.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmPriceDetails
	 * CorporateActionOption35.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmPriceDetails
	 * SecuritiesOption29.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmPriceDetails
	 * CashOption20.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmPriceDetails
	 * CorporateActionOption44.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmPriceDetails
	 * SecuritiesOption33.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmPriceDetails
	 * SecuritiesOption38.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmPriceDetails
	 * CashOption25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmPriceDetails
	 * CorporateActionOption52.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmPriceDetails
	 * SecuritiesOption37.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmPriceDetails
	 * SecuritiesOption39.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmPriceDetails
	 * CashOption28.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmPriceDetails
	 * CorporateActionOption55.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmPriceDetails
	 * CorporateAction3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmPriceDetails
	 * SecuritiesOption6.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmPriceDetails
	 * CorporateActionOption3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmPriceDetails
	 * CorporateAction4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmPriceDetails
	 * SecuritiesOption12.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmPriceDetails
	 * CorporateActionOption17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmPriceDetails
	 * CorporateAction5.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmPriceDetails
	 * SecuritiesOption14.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmPriceDetails
	 * CashOption10.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmPriceDetails
	 * CorporateActionOption19.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmPriceDetails
	 * CorporateAction6.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmPriceDetails
	 * SecuritiesOption22.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmPriceDetails
	 * CashOption15.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmPriceDetails
	 * CorporateActionOption34.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmPriceDetails
	 * CorporateAction7.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmPriceDetails
	 * SecuritiesOption25.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmPriceDetails
	 * CashOption17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmPriceDetails
	 * CorporateActionOption36.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmPriceDetails
	 * CorporateAction8.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmPriceDetails
	 * SecuritiesOption30.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmPriceDetails
	 * CashOption21.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmPriceDetails
	 * CorporateActionOption45.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmPriceDetails
	 * CorporateAction10.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmPriceDetails
	 * CashOption24.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmPriceDetails
	 * CorporateActionOption51.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmPriceDetails
	 * CorporateAction11.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmPriceDetails
	 * CashOption29.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmPriceDetails
	 * CorporateActionOption56.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPriceDetails
	 * CorporateAction2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmPriceDetails
	 * SecurityOption1.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmPriceDetails
	 * CorporateActionOption1.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmPriceDetails
	 * CorporateActionOption103.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmPriceDetails
	 * CorporateActionOption100.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmPriceDetails
	 * CorporateActionOption101.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmPriceDetails
	 * CorporateAction12.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmPriceDetails
	 * CorporateActionOption102.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmPriceDetails
	 * CashOption30.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmPriceDetails
	 * SecuritiesOption42.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmPriceDetails
	 * CashOption31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmPriceDetails
	 * SecuritiesOption40.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmPriceDetails
	 * CashOption32.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmPriceDetails
	 * CorporateActionOption110.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmPriceDetails
	 * CorporateActionOption108.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmPriceDetails
	 * CorporateActionOption107.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmPriceDetails
	 * CorporateActionOption106.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmPriceDetails
	 * CorporateAction17.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmPriceDetails
	 * CashOption36.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmPriceDetails
	 * CashOption35.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmPriceDetails
	 * CashOption38.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmPriceDetails
	 * SecuritiesOption48.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmPriceDetails
	 * SecuritiesOption45.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmPriceDetails
	 * CorporateActionOption111.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmPriceDetails
	 * CashOption39.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmPriceDetails
	 * CorporateActionOption113.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmPriceDetails
	 * CashOption41.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPriceDetails
	 * CorporateActionOption117.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmPriceDetails
	 * CorporateActionOption118.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmPriceDetails
	 * CorporateActionOption115.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmPriceDetails
	 * CorporateActionOption114.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmPriceDetails
	 * CorporateAction31.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmPriceDetails
	 * CashOption44.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmPriceDetails
	 * SecuritiesOption49.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmPriceDetails
	 * CashOption42.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmPriceDetails
	 * CashOption43.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmPriceDetails
	 * SecuritiesOption50.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmPriceDetails
	 * CorporateActionOption124.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmPriceDetails
	 * CorporateActionOption125.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmPriceDetails
	 * CorporateActionOption123.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmPriceDetails
	 * CorporateActionOption127.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmPriceDetails
	 * CorporateAction40.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmPriceDetails
	 * CashOption46.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmPriceDetails
	 * SecuritiesOption55.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmPriceDetails
	 * CashOption49.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmPriceDetails
	 * CashOption47.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmPriceDetails
	 * SecuritiesOption57.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPriceDetails
	 * CorporateActionOption132.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmPriceDetails
	 * CorporateActionOption130.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmPriceDetails
	 * CorporateActionOption131.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmPriceDetails
	 * CorporateActionOption129.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmPriceDetails
	 * CashOption52.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmPriceDetails
	 * SecuritiesOption60.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmPriceDetails
	 * CashOption51.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmPriceDetails
	 * SecuritiesOption59.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmPriceDetails
	 * CashOption50.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmPriceDetails
	 * CorporateActionOption134.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmPriceDetails
	 * CorporateActionOption136.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmPriceDetails
	 * CorporateActionOption135.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmPriceDetails
	 * CorporateActionOption133.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmPriceDetails
	 * CashOption53.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmPriceDetails
	 * SecuritiesOption61.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmPriceDetails
	 * SecuritiesOption63.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmPriceDetails
	 * CashOption54.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmPriceDetails
	 * CashOption55.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmPriceDetails
	 * CorporateActionOption140.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmPriceDetails
	 * CorporateAction41.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmPriceDetails
	 * CorporateActionOption138.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmPriceDetails
	 * CorporateActionOption142.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmPriceDetails
	 * CorporateActionOption139.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmPriceDetails
	 * CashOption56.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmPriceDetails
	 * CashOption57.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmPriceDetails
	 * SecuritiesOption64.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmPriceDetails
	 * SecuritiesOption65.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmPriceDetails
	 * CashOption58.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmPriceDetails
	 * CorporateActionOption146.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmPriceDetails
	 * CorporateActionOption147.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmPriceDetails
	 * SecuritiesOption67.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption60#mmPriceDetails
	 * CashOption60.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmPriceDetails
	 * CorporateActionOption148.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmPriceDetails
	 * SecuritiesOption68.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption61#mmPriceDetails
	 * CashOption61.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmPriceDetails
	 * CorporateAction51.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmPriceDetails
	 * CorporateActionOption150.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption63#mmPriceDetails
	 * CashOption63.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies prices related to a corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionPrice>> mmCorporateActionPrice = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionPrice>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption5.mmPriceDetails, CorporateActionOption13.mmPriceDetails, CorporateActionOption25.mmPriceDetails, CorporateActionOption30.mmPriceDetails,
					CorporateActionOption38.mmPriceDetails, CorporateActionOption47.mmPriceDetails, CorporateActionOption57.mmPriceDetails, CorporateActionOption58.mmPriceDetails, SecuritiesOption3.mmPriceDetails,
					CorporateActionOption4.mmPriceDetails, SecuritiesOption8.mmPriceDetails, CorporateActionOption14.mmPriceDetails, SecuritiesOption18.mmPriceDetails, CashOption12.mmPriceDetails, CorporateActionOption23.mmPriceDetails,
					SecuritiesOption20.mmPriceDetails, CashOption13.mmPriceDetails, CorporateActionOption31.mmPriceDetails, SecuritiesOption26.mmPriceDetails, CashOption18.mmPriceDetails, CorporateActionOption37.mmPriceDetails,
					SecuritiesOption31.mmPriceDetails, CashOption22.mmPriceDetails, CorporateActionOption46.mmPriceDetails, SecuritiesOption35.mmPriceDetails, CashOption26.mmPriceDetails, CorporateActionOption53.mmPriceDetails,
					SecuritiesOption36.mmPriceDetails, CashOption27.mmPriceDetails, CorporateActionOption54.mmPriceDetails, SecuritiesOption4.mmPriceDetails, CorporateActionOption10.mmPriceDetails, SecuritiesOption10.mmPriceDetails,
					CorporateActionOption15.mmPriceDetails, SecuritiesOption13.mmPriceDetails, CashOption11.mmPriceDetails, CorporateActionOption20.mmPriceDetails, SecuritiesOption17.mmPriceDetails, CashOption14.mmPriceDetails,
					CorporateActionOption32.mmPriceDetails, SecuritiesOption24.mmPriceDetails, CashOption16.mmPriceDetails, CorporateActionOption35.mmPriceDetails, SecuritiesOption29.mmPriceDetails, CashOption20.mmPriceDetails,
					CorporateActionOption44.mmPriceDetails, SecuritiesOption33.mmPriceDetails, SecuritiesOption38.mmPriceDetails, CashOption25.mmPriceDetails, CorporateActionOption52.mmPriceDetails, SecuritiesOption37.mmPriceDetails,
					SecuritiesOption39.mmPriceDetails, CashOption28.mmPriceDetails, CorporateActionOption55.mmPriceDetails, CorporateAction3.mmPriceDetails, SecuritiesOption6.mmPriceDetails, CorporateActionOption3.mmPriceDetails,
					CorporateAction4.mmPriceDetails, SecuritiesOption12.mmPriceDetails, CorporateActionOption17.mmPriceDetails, CorporateAction5.mmPriceDetails, SecuritiesOption14.mmPriceDetails, CashOption10.mmPriceDetails,
					CorporateActionOption19.mmPriceDetails, CorporateAction6.mmPriceDetails, SecuritiesOption22.mmPriceDetails, CashOption15.mmPriceDetails, CorporateActionOption34.mmPriceDetails, CorporateAction7.mmPriceDetails,
					SecuritiesOption25.mmPriceDetails, CashOption17.mmPriceDetails, CorporateActionOption36.mmPriceDetails, CorporateAction8.mmPriceDetails, SecuritiesOption30.mmPriceDetails, CashOption21.mmPriceDetails,
					CorporateActionOption45.mmPriceDetails, CorporateAction10.mmPriceDetails, CashOption24.mmPriceDetails, CorporateActionOption51.mmPriceDetails, CorporateAction11.mmPriceDetails, CashOption29.mmPriceDetails,
					CorporateActionOption56.mmPriceDetails, CorporateAction2.mmPriceDetails, SecurityOption1.mmPriceDetails, CorporateActionOption1.mmPriceDetails, CorporateActionOption103.mmPriceDetails,
					CorporateActionOption100.mmPriceDetails, CorporateActionOption101.mmPriceDetails, CorporateAction12.mmPriceDetails, CorporateActionOption102.mmPriceDetails, CashOption30.mmPriceDetails,
					SecuritiesOption42.mmPriceDetails, CashOption31.mmPriceDetails, SecuritiesOption40.mmPriceDetails, CashOption32.mmPriceDetails, CorporateActionOption110.mmPriceDetails, CorporateActionOption108.mmPriceDetails,
					CorporateActionOption107.mmPriceDetails, CorporateActionOption106.mmPriceDetails, CorporateAction17.mmPriceDetails, CashOption36.mmPriceDetails, CashOption35.mmPriceDetails, CashOption38.mmPriceDetails,
					SecuritiesOption48.mmPriceDetails, SecuritiesOption45.mmPriceDetails, CorporateActionOption111.mmPriceDetails, CashOption39.mmPriceDetails, CorporateActionOption113.mmPriceDetails, CashOption41.mmPriceDetails,
					CorporateActionOption117.mmPriceDetails, CorporateActionOption118.mmPriceDetails, CorporateActionOption115.mmPriceDetails, CorporateActionOption114.mmPriceDetails, CorporateAction31.mmPriceDetails,
					CashOption44.mmPriceDetails, SecuritiesOption49.mmPriceDetails, CashOption42.mmPriceDetails, CashOption43.mmPriceDetails, SecuritiesOption50.mmPriceDetails, CorporateActionOption124.mmPriceDetails,
					CorporateActionOption125.mmPriceDetails, CorporateActionOption123.mmPriceDetails, CorporateActionOption127.mmPriceDetails, CorporateAction40.mmPriceDetails, CashOption46.mmPriceDetails,
					SecuritiesOption55.mmPriceDetails, CashOption49.mmPriceDetails, CashOption47.mmPriceDetails, SecuritiesOption57.mmPriceDetails, CorporateActionOption132.mmPriceDetails, CorporateActionOption130.mmPriceDetails,
					CorporateActionOption131.mmPriceDetails, CorporateActionOption129.mmPriceDetails, CashOption52.mmPriceDetails, SecuritiesOption60.mmPriceDetails, CashOption51.mmPriceDetails, SecuritiesOption59.mmPriceDetails,
					CashOption50.mmPriceDetails, CorporateActionOption134.mmPriceDetails, CorporateActionOption136.mmPriceDetails, CorporateActionOption135.mmPriceDetails, CorporateActionOption133.mmPriceDetails,
					CashOption53.mmPriceDetails, SecuritiesOption61.mmPriceDetails, SecuritiesOption63.mmPriceDetails, CashOption54.mmPriceDetails, CashOption55.mmPriceDetails, CorporateActionOption140.mmPriceDetails,
					CorporateAction41.mmPriceDetails, CorporateActionOption138.mmPriceDetails, CorporateActionOption142.mmPriceDetails, CorporateActionOption139.mmPriceDetails, CashOption56.mmPriceDetails, CashOption57.mmPriceDetails,
					SecuritiesOption64.mmPriceDetails, SecuritiesOption65.mmPriceDetails, CashOption58.mmPriceDetails, CorporateActionOption146.mmPriceDetails, CorporateActionOption147.mmPriceDetails, SecuritiesOption67.mmPriceDetails,
					CashOption60.mmPriceDetails, CorporateActionOption148.mmPriceDetails, SecuritiesOption68.mmPriceDetails, CashOption61.mmPriceDetails, CorporateAction51.mmPriceDetails, CorporateActionOption150.mmPriceDetails,
					CashOption63.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public List<CorporateActionPrice> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionPrice();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionPrice> value) {
			obj.setCorporateActionPrice(value);
		}
	};
	protected List<CurrencyExchange> exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
	 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative8.
	 * mmForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative13.
	 * mmForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmForeignExchangeDetails
	 * CashOption2.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmForeignExchangeDetails
	 * CashOption9.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmForeignExchangeDetails
	 * CashOption12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmForeignExchangeDetails
	 * CashOption13.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmForeignExchangeDetails
	 * CashOption18.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmForeignExchangeDetails
	 * CashOption22.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmForeignExchangeDetails
	 * CashOption26.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmForeignExchangeDetails
	 * CashOption27.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmForeignExchangeDetails
	 * CashOption3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmForeignExchangeDetails
	 * CashOption6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmForeignExchangeDetails
	 * CashOption11.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmForeignExchangeDetails
	 * CashOption14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmForeignExchangeDetails
	 * CashOption16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmForeignExchangeDetails
	 * CashOption20.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmForeignExchangeDetails
	 * CashOption25.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmForeignExchangeDetails
	 * CashOption28.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmForeignExchangeDetails
	 * CashOption4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmForeignExchangeDetails
	 * CashOption8.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmForeignExchangeDetails
	 * CashOption10.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmForeignExchangeDetails
	 * CashOption15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmForeignExchangeDetails
	 * CashOption17.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmForeignExchangeDetails
	 * CashOption21.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate36.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmForeignExchangeDetails
	 * CashOption24.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate42.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmForeignExchangeDetails
	 * CashOption29.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmExchangeRate
	 * CorporateActionRate2.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#mmExchangeRate
	 * CashOption1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmForeignExchangeDetails
	 * CashOption30.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate44.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmForeignExchangeDetails
	 * CashOption31.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmForeignExchangeDetails
	 * CashOption32.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmForeignExchangeDetails
	 * CashOption36.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmForeignExchangeDetails
	 * CashOption35.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmForeignExchangeDetails
	 * CashOption38.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate57.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmForeignExchangeDetails
	 * CashOption39.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmForeignExchangeDetails
	 * CashOption41.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmForeignExchangeDetails
	 * CashOption44.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate68.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmForeignExchangeDetails
	 * CashOption42.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmForeignExchangeDetails
	 * CashOption43.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative32.
	 * mmForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmForeignExchangeDetails
	 * CashOption46.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate79.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmForeignExchangeDetails
	 * CashOption49.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmForeignExchangeDetails
	 * CashOption47.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmForeignExchangeInstructionsAdditionalInformation
	 * CorporateActionNarrative33.
	 * mmForeignExchangeInstructionsAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmForeignExchangeDetails
	 * CashOption52.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmForeignExchangeDetails
	 * CashOption51.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate80.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmForeignExchangeDetails
	 * CashOption50.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmForeignExchangeDetails
	 * CashOption53.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate83.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmForeignExchangeDetails
	 * CashOption54.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmForeignExchangeDetails
	 * CashOption55.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmForeignExchangeDetails
	 * CashOption56.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmForeignExchangeDetails
	 * CashOption57.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate87.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmForeignExchangeDetails
	 * CashOption58.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption60#mmForeignExchangeDetails
	 * CashOption60.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption61#mmForeignExchangeDetails
	 * CashOption61.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97#mmIssuerDeclaredExchangeRate
	 * CorporateActionRate97.mmIssuerDeclaredExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption63#mmForeignExchangeDetails
	 * CashOption63.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CurrencyExchange>> mmExchangeRate = new MMBusinessAssociationEnd<CorporateActionEvent, List<CurrencyExchange>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative8.mmForeignExchangeInstructionsAdditionalInformation, CorporateActionNarrative13.mmForeignExchangeInstructionsAdditionalInformation,
					CashOption2.mmForeignExchangeDetails, CashOption9.mmForeignExchangeDetails, CashOption12.mmForeignExchangeDetails, CashOption13.mmForeignExchangeDetails, CashOption18.mmForeignExchangeDetails,
					CashOption22.mmForeignExchangeDetails, CashOption26.mmForeignExchangeDetails, CashOption27.mmForeignExchangeDetails, CashOption3.mmForeignExchangeDetails, CashOption6.mmForeignExchangeDetails,
					CashOption11.mmForeignExchangeDetails, CashOption14.mmForeignExchangeDetails, CashOption16.mmForeignExchangeDetails, CashOption20.mmForeignExchangeDetails, CashOption25.mmForeignExchangeDetails,
					CashOption28.mmForeignExchangeDetails, CashOption4.mmForeignExchangeDetails, CashOption8.mmForeignExchangeDetails, CashOption10.mmForeignExchangeDetails, CashOption15.mmForeignExchangeDetails,
					CashOption17.mmForeignExchangeDetails, CashOption21.mmForeignExchangeDetails, CorporateActionRate36.mmIssuerDeclaredExchangeRate, CashOption24.mmForeignExchangeDetails,
					CorporateActionRate42.mmIssuerDeclaredExchangeRate, CashOption29.mmForeignExchangeDetails, CorporateActionRate2.mmExchangeRate, CashOption1.mmExchangeRate, CashOption30.mmForeignExchangeDetails,
					CorporateActionRate44.mmIssuerDeclaredExchangeRate, CashOption31.mmForeignExchangeDetails, CashOption32.mmForeignExchangeDetails, CashOption36.mmForeignExchangeDetails, CashOption35.mmForeignExchangeDetails,
					CashOption38.mmForeignExchangeDetails, CorporateActionRate57.mmIssuerDeclaredExchangeRate, CashOption39.mmForeignExchangeDetails, CashOption41.mmForeignExchangeDetails, CashOption44.mmForeignExchangeDetails,
					CorporateActionRate68.mmIssuerDeclaredExchangeRate, CashOption42.mmForeignExchangeDetails, CashOption43.mmForeignExchangeDetails, CorporateActionNarrative32.mmForeignExchangeInstructionsAdditionalInformation,
					CashOption46.mmForeignExchangeDetails, CorporateActionRate79.mmIssuerDeclaredExchangeRate, CashOption49.mmForeignExchangeDetails, CashOption47.mmForeignExchangeDetails,
					CorporateActionNarrative33.mmForeignExchangeInstructionsAdditionalInformation, CashOption52.mmForeignExchangeDetails, CashOption51.mmForeignExchangeDetails, CorporateActionRate80.mmIssuerDeclaredExchangeRate,
					CashOption50.mmForeignExchangeDetails, CashOption53.mmForeignExchangeDetails, CorporateActionRate83.mmIssuerDeclaredExchangeRate, CashOption54.mmForeignExchangeDetails, CashOption55.mmForeignExchangeDetails,
					CashOption56.mmForeignExchangeDetails, CashOption57.mmForeignExchangeDetails, CorporateActionRate87.mmIssuerDeclaredExchangeRate, CashOption58.mmForeignExchangeDetails, CashOption60.mmForeignExchangeDetails,
					CashOption61.mmForeignExchangeDetails, CorporateActionRate97.mmIssuerDeclaredExchangeRate, CashOption63.mmForeignExchangeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(CorporateActionEvent obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CurrencyExchange> value) {
			obj.setExchangeRate(value);
		}
	};
	protected Max350Text registrationDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7#mmRegistrationDetails
	 * CorporateActionNarrative7.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative12#mmRegistrationDetails
	 * CorporateActionNarrative12.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmRegistrationDetails
	 * CorporateActionNarrative21.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative23#mmRegistrationDetails
	 * CorporateActionNarrative23.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmRegistrationDetails
	 * CorporateActionNarrative4.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmRegistrationDetails
	 * CorporateActionNarrative14.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmRegistrationDetails
	 * CorporateActionNarrative6.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmRegistrationDetails
	 * CorporateActionNarrative16.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmRegistrationDetails
	 * CorporateActionNarrative11.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmRegistrationDetails
	 * CorporateActionNarrative17.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmRegistrationDetails
	 * CorporateActionNarrative2.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmRegistrationDetails
	 * CorporateActionAdditionalInformation1.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmRegistrationDetails
	 * CorporateActionNarrative27.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#mmRegistrationDetails
	 * CorporateActionNarrative30.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmRegistrationDetails
	 * CorporateActionNarrative28.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmRegistrationDetails
	 * CorporateActionNarrative37.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative34#mmRegistrationDetails
	 * CorporateActionNarrative34.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmRegistrationDetails
	 * CorporateActionNarrative41.mmRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, Max350Text> mmRegistrationDetails = new MMBusinessAttribute<CorporateActionEvent, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative7.mmRegistrationDetails, CorporateActionNarrative12.mmRegistrationDetails, CorporateActionNarrative21.mmRegistrationDetails,
					CorporateActionNarrative23.mmRegistrationDetails, CorporateActionNarrative4.mmRegistrationDetails, CorporateActionNarrative14.mmRegistrationDetails, CorporateActionNarrative6.mmRegistrationDetails,
					CorporateActionNarrative16.mmRegistrationDetails, CorporateActionNarrative11.mmRegistrationDetails, CorporateActionNarrative17.mmRegistrationDetails, CorporateActionNarrative2.mmRegistrationDetails,
					CorporateActionAdditionalInformation1.mmRegistrationDetails, CorporateActionNarrative27.mmRegistrationDetails, CorporateActionNarrative30.mmRegistrationDetails, CorporateActionNarrative28.mmRegistrationDetails,
					CorporateActionNarrative37.mmRegistrationDetails, CorporateActionNarrative34.mmRegistrationDetails, CorporateActionNarrative41.mmRegistrationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEvent obj) {
			return obj.getRegistrationDetails();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Max350Text value) {
			obj.setRegistrationDetails(value);
		}
	};
	protected Max350Text basketOrIndexInformation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7#mmBasketOrIndexInformation
	 * CorporateActionNarrative7.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative12#mmBasketOrIndexInformation
	 * CorporateActionNarrative12.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmBasketOrIndexInformation
	 * CorporateActionNarrative21.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative23#mmBasketOrIndexInformation
	 * CorporateActionNarrative23.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmBasketOrIndexInformation
	 * CorporateActionNarrative4.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmBasketOrIndexInformation
	 * CorporateActionNarrative14.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmBasketOrIndexInformation
	 * CorporateActionNarrative6.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmBasketOrIndexInformation
	 * CorporateActionNarrative16.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmBasketOrIndexInformation
	 * CorporateActionNarrative11.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmBasketOrIndexInformation
	 * CorporateActionNarrative17.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmBasketOrIndexInformation
	 * CorporateActionNarrative27.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmBasketOrIndexInformation
	 * CorporateActionNarrative28.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmBasketOrIndexInformation
	 * CorporateActionNarrative37.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmBasketOrIndexInformation
	 * CorporateActionNarrative41.mmBasketOrIndexInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, Max350Text> mmBasketOrIndexInformation = new MMBusinessAttribute<CorporateActionEvent, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative7.mmBasketOrIndexInformation, CorporateActionNarrative12.mmBasketOrIndexInformation, CorporateActionNarrative21.mmBasketOrIndexInformation,
					CorporateActionNarrative23.mmBasketOrIndexInformation, CorporateActionNarrative4.mmBasketOrIndexInformation, CorporateActionNarrative14.mmBasketOrIndexInformation, CorporateActionNarrative6.mmBasketOrIndexInformation,
					CorporateActionNarrative16.mmBasketOrIndexInformation, CorporateActionNarrative11.mmBasketOrIndexInformation, CorporateActionNarrative17.mmBasketOrIndexInformation, CorporateActionNarrative27.mmBasketOrIndexInformation,
					CorporateActionNarrative28.mmBasketOrIndexInformation, CorporateActionNarrative37.mmBasketOrIndexInformation, CorporateActionNarrative41.mmBasketOrIndexInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEvent obj) {
			return obj.getBasketOrIndexInformation();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Max350Text value) {
			obj.setBasketOrIndexInformation(value);
		}
	};
	protected Deadline deadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
	 * Deadline.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#mmDeadlineDateTime
	 * InstructedCorporateActionOption1.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#mmDeadlineType
	 * InstructedCorporateActionOption1.mmDeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#mmDeadlineDateTime
	 * InstructedCorporateActionOption2.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#mmDeadlineType
	 * InstructedCorporateActionOption2.mmDeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmDeadlineDateTime
	 * InstructedCorporateActionOption4.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmDeadlineType
	 * InstructedCorporateActionOption4.mmDeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmDeadlineDateTime
	 * InstructedCorporateActionOption5.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmDeadlineType
	 * InstructedCorporateActionOption5.mmDeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDeadlineDateTime
	 * InstructedCorporateActionOption6.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDeadlineType
	 * InstructedCorporateActionOption6.mmDeadlineType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#mmDeadlineDateTime
	 * InstructedCorporateActionOption7.mmDeadlineDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#mmDeadlineType
	 * InstructedCorporateActionOption7.mmDeadlineType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines related to a corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<Deadline>> mmDeadline = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<Deadline>>() {
		{
			derivation_lazy = () -> Arrays.asList(InstructedCorporateActionOption1.mmDeadlineDateTime, InstructedCorporateActionOption1.mmDeadlineType, InstructedCorporateActionOption2.mmDeadlineDateTime,
					InstructedCorporateActionOption2.mmDeadlineType, InstructedCorporateActionOption4.mmDeadlineDateTime, InstructedCorporateActionOption4.mmDeadlineType, InstructedCorporateActionOption5.mmDeadlineDateTime,
					InstructedCorporateActionOption5.mmDeadlineType, InstructedCorporateActionOption6.mmDeadlineDateTime, InstructedCorporateActionOption6.mmDeadlineType, InstructedCorporateActionOption7.mmDeadlineDateTime,
					InstructedCorporateActionOption7.mmDeadlineType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Deadline.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Deadline.mmObject();
		}

		@Override
		public Optional<Deadline> getValue(CorporateActionEvent obj) {
			return obj.getDeadline();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<Deadline> value) {
			obj.setDeadline(value.orElse(null));
		}
	};
	protected AdditionalBusinessProcessCode additionalBusinessProcess;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice#mmCode
	 * AdditionalBusinessProcessFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice#mmProprietary
	 * AdditionalBusinessProcessFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation4.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice#mmCode
	 * AdditionalBusinessProcessFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice#mmProprietary
	 * AdditionalBusinessProcessFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation16.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation24.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation29.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice#mmCode
	 * AdditionalBusinessProcessFormat7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice#mmProprietary
	 * AdditionalBusinessProcessFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation39.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice#mmCode
	 * AdditionalBusinessProcessFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice#mmProprietary
	 * AdditionalBusinessProcessFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation47.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation50.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation62.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice#mmCode
	 * AdditionalBusinessProcessFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice#mmProprietary
	 * AdditionalBusinessProcessFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation3.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice#mmCode
	 * AdditionalBusinessProcessFormat6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice#mmProprietary
	 * AdditionalBusinessProcessFormat6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation17.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation23.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation30.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation38.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation46.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation54.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation64.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice#mmCode
	 * AdditionalBusinessProcessFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice#mmProprietary
	 * AdditionalBusinessProcessFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmAdditionalBusinessProcessIndicator
	 * CorporateAction3.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice#mmCode
	 * AdditionalBusinessProcessFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice#mmProprietary
	 * AdditionalBusinessProcessFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmAdditionalBusinessProcessIndicator
	 * CorporateAction4.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAdditionalBusinessProcessIndicator
	 * CorporateAction5.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmAdditionalBusinessProcessIndicator
	 * CorporateAction6.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmAdditionalBusinessProcessIndicator
	 * CorporateAction7.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmAdditionalBusinessProcessIndicator
	 * CorporateAction8.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmAdditionalBusinessProcessIndicator
	 * CorporateAction10.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmAdditionalBusinessProcessIndicator
	 * CorporateAction11.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation69.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmAdditionalBusinessProcessIndicator
	 * CorporateAction12.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation78.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmAdditionalBusinessProcessIndicator
	 * CorporateAction17.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation79.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation83.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmAdditionalBusinessProcessIndicator
	 * CorporateActionGeneralInformation82.mmAdditionalBusinessProcessIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmAdditionalBusinessProcessIndicator
	 * CorporateAction33.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmAdditionalBusinessProcessIndicator
	 * CorporateAction32.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmAdditionalBusinessProcessIndicator
	 * CorporateAction31.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice#mmCode
	 * AdditionalBusinessProcessFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice#mmProprietary
	 * AdditionalBusinessProcessFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice#mmCode
	 * AdditionalBusinessProcessFormat11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice#mmProprietary
	 * AdditionalBusinessProcessFormat11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice#mmCode
	 * AdditionalBusinessProcessFormat9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice#mmProprietary
	 * AdditionalBusinessProcessFormat9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmAdditionalBusinessProcessIndicator
	 * CorporateAction36.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#mmAdditionalBusinessProcessIndicator
	 * CorporateAction38.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmAdditionalBusinessProcessIndicator
	 * CorporateAction40.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice#mmCode
	 * AdditionalBusinessProcessFormat12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice#mmProprietary
	 * AdditionalBusinessProcessFormat12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice#mmCode
	 * AdditionalBusinessProcessFormat14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice#mmProprietary
	 * AdditionalBusinessProcessFormat14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice#mmCode
	 * AdditionalBusinessProcessFormat13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice#mmProprietary
	 * AdditionalBusinessProcessFormat13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAdditionalBusinessProcessIndicator
	 * CorporateAction41.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmAdditionalBusinessProcessIndicator
	 * CorporateAction43.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmAdditionalBusinessProcessIndicator
	 * CorporateAction42.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat15Choice#mmCode
	 * AdditionalBusinessProcessFormat15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat15Choice#mmProprietary
	 * AdditionalBusinessProcessFormat15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmAdditionalBusinessProcessIndicator
	 * CorporateAction44.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction46#mmAdditionalBusinessProcessIndicator
	 * CorporateAction46.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction47#mmAdditionalBusinessProcessIndicator
	 * CorporateAction47.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction49#mmAdditionalBusinessProcessIndicator
	 * CorporateAction49.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmAdditionalBusinessProcessIndicator
	 * CorporateAction51.mmAdditionalBusinessProcessIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat16Choice#mmCode
	 * AdditionalBusinessProcessFormat16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat16Choice#mmProprietary
	 * AdditionalBusinessProcessFormat16Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, AdditionalBusinessProcessCode> mmAdditionalBusinessProcess = new MMBusinessAttribute<CorporateActionEvent, AdditionalBusinessProcessCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalBusinessProcessFormat3Choice.mmCode, AdditionalBusinessProcessFormat3Choice.mmProprietary, CorporateActionGeneralInformation4.mmAdditionalBusinessProcessIndicator,
					AdditionalBusinessProcessFormat5Choice.mmCode, AdditionalBusinessProcessFormat5Choice.mmProprietary, CorporateActionGeneralInformation16.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation24.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation29.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat7Choice.mmCode,
					AdditionalBusinessProcessFormat7Choice.mmProprietary, CorporateActionGeneralInformation39.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat8Choice.mmCode,
					AdditionalBusinessProcessFormat8Choice.mmProprietary, CorporateActionGeneralInformation47.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation50.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation62.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat2Choice.mmCode, AdditionalBusinessProcessFormat2Choice.mmProprietary,
					CorporateActionGeneralInformation3.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat6Choice.mmCode, AdditionalBusinessProcessFormat6Choice.mmProprietary,
					CorporateActionGeneralInformation17.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation23.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation30.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation38.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation46.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation54.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation64.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat1Choice.mmCode, AdditionalBusinessProcessFormat1Choice.mmProprietary,
					CorporateAction3.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat4Choice.mmCode, AdditionalBusinessProcessFormat4Choice.mmProprietary, CorporateAction4.mmAdditionalBusinessProcessIndicator,
					CorporateAction5.mmAdditionalBusinessProcessIndicator, CorporateAction6.mmAdditionalBusinessProcessIndicator, CorporateAction7.mmAdditionalBusinessProcessIndicator, CorporateAction8.mmAdditionalBusinessProcessIndicator,
					CorporateAction10.mmAdditionalBusinessProcessIndicator, CorporateAction11.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation69.mmAdditionalBusinessProcessIndicator,
					CorporateAction12.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation78.mmAdditionalBusinessProcessIndicator, CorporateAction17.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation79.mmAdditionalBusinessProcessIndicator, CorporateActionGeneralInformation83.mmAdditionalBusinessProcessIndicator,
					CorporateActionGeneralInformation82.mmAdditionalBusinessProcessIndicator, CorporateAction33.mmAdditionalBusinessProcessIndicator, CorporateAction32.mmAdditionalBusinessProcessIndicator,
					CorporateAction31.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat10Choice.mmCode, AdditionalBusinessProcessFormat10Choice.mmProprietary, AdditionalBusinessProcessFormat11Choice.mmCode,
					AdditionalBusinessProcessFormat11Choice.mmProprietary, AdditionalBusinessProcessFormat9Choice.mmCode, AdditionalBusinessProcessFormat9Choice.mmProprietary, CorporateAction36.mmAdditionalBusinessProcessIndicator,
					CorporateAction38.mmAdditionalBusinessProcessIndicator, CorporateAction40.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat12Choice.mmCode, AdditionalBusinessProcessFormat12Choice.mmProprietary,
					AdditionalBusinessProcessFormat14Choice.mmCode, AdditionalBusinessProcessFormat14Choice.mmProprietary, AdditionalBusinessProcessFormat13Choice.mmCode, AdditionalBusinessProcessFormat13Choice.mmProprietary,
					CorporateAction41.mmAdditionalBusinessProcessIndicator, CorporateAction43.mmAdditionalBusinessProcessIndicator, CorporateAction42.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat15Choice.mmCode,
					AdditionalBusinessProcessFormat15Choice.mmProprietary, CorporateAction44.mmAdditionalBusinessProcessIndicator, CorporateAction46.mmAdditionalBusinessProcessIndicator,
					CorporateAction47.mmAdditionalBusinessProcessIndicator, CorporateAction49.mmAdditionalBusinessProcessIndicator, CorporateAction51.mmAdditionalBusinessProcessIndicator, AdditionalBusinessProcessFormat16Choice.mmCode,
					AdditionalBusinessProcessFormat16Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}

		@Override
		public AdditionalBusinessProcessCode getValue(CorporateActionEvent obj) {
			return obj.getAdditionalBusinessProcess();
		}

		@Override
		public void setValue(CorporateActionEvent obj, AdditionalBusinessProcessCode value) {
			obj.setAdditionalBusinessProcess(value);
		}
	};
	protected ISODateTime tradingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmTradingDate
	 * CorporateActionDate6.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmTradingDate
	 * CorporateActionDate10.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmTradingDate
	 * CorporateActionDate18.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmTradingDate
	 * CorporateActionDate19.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmTradingDate
	 * CorporateActionDate46.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmTradingDate
	 * CorporateActionDate52.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmTradingDate
	 * CorporateActionDate60.mmTradingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate68#mmTradingDate
	 * CorporateActionDate68.mmTradingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the deal (rights) was agreed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmTradingDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmTradingDate, CorporateActionDate10.mmTradingDate, CorporateActionDate18.mmTradingDate, CorporateActionDate19.mmTradingDate, CorporateActionDate46.mmTradingDate,
					CorporateActionDate52.mmTradingDate, CorporateActionDate60.mmTradingDate, CorporateActionDate68.mmTradingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getTradingDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setTradingDate(value);
		}
	};
	protected CorporateActionFeesAndCharges corporateActionCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
	 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmChargesFees
	 * CorporateActionRate4.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmChargesFees
	 * CorporateActionRate10.mmChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmChargesFees
	 * RateDetails2.mmChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#mmChargesFees
	 * RateDetails4.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmChargesFees
	 * CorporateActionRate29.mmChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#mmChargesFees
	 * RateDetails7.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmChargesFees
	 * CorporateActionRate34.mmChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#mmChargesFees
	 * RateDetails9.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmChargesFees
	 * RateDetails11.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmChargesFees
	 * RateDetails12.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmChargesFees
	 * CorporateActionRate5.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmChargesFees
	 * CorporateActionRate12.mmChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#mmChargesFees
	 * RateDetails3.mmChargesFees}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#mmChargesFees
	 * RateDetails5.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmChargesFees
	 * CorporateActionRate28.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmChargesFees
	 * CorporateActionRate33.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmChargesFees
	 * RateDetails10.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmChargesFees
	 * RateDetails13.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmCharges
	 * CorporateActionRate1.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmCharges
	 * CorporateActionRate2.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmChargesFees
	 * RateDetails15.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmChargesFees
	 * CorporateActionRate48.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmChargesFees
	 * CorporateActionRate49.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmChargesFees
	 * RateDetails14.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmChargesFees
	 * CorporateActionRate58.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmChargesFees
	 * RateDetails18.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmChargesFees
	 * RateDetails21.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmChargesFees
	 * CorporateActionRate65.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmChargesFees
	 * RateDetails23.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmChargesFees
	 * CorporateActionRate69.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmChargesFees
	 * RateDetails22.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmChargesFees
	 * CorporateActionRate72.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmChargesFees
	 * RateDetails24.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmChargesFees
	 * RateDetails25.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmChargesFees
	 * CorporateActionRate77.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmChargesFees
	 * CorporateActionRate75.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmChargesFees
	 * RateDetails26.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmChargesFees
	 * RateDetails27.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmChargesFees
	 * RateDetails28.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmChargesFees
	 * RateDetails30.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmChargesFees
	 * RateDetails31.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmChargesFees
	 * RateDetails32.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate90#mmChargesFees
	 * CorporateActionRate90.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate89#mmChargesFees
	 * CorporateActionRate89.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate93#mmChargesFees
	 * CorporateActionRate93.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmChargesFees
	 * RateDetails33.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate95#mmChargesFees
	 * CorporateActionRate95.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmChargesFees
	 * RateDetails34.mmChargesFees}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges relative to a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<CorporateActionFeesAndCharges>> mmCorporateActionCharge = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<CorporateActionFeesAndCharges>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmChargesFees, CorporateActionRate10.mmChargesFees, RateDetails2.mmChargesFees, RateDetails4.mmChargesFees, CorporateActionRate29.mmChargesFees,
					RateDetails7.mmChargesFees, CorporateActionRate34.mmChargesFees, RateDetails9.mmChargesFees, RateDetails11.mmChargesFees, RateDetails12.mmChargesFees, CorporateActionRate5.mmChargesFees,
					CorporateActionRate12.mmChargesFees, RateDetails3.mmChargesFees, RateDetails5.mmChargesFees, CorporateActionRate28.mmChargesFees, CorporateActionRate33.mmChargesFees, RateDetails10.mmChargesFees,
					RateDetails13.mmChargesFees, CorporateActionRate1.mmCharges, CorporateActionRate2.mmCharges, RateDetails15.mmChargesFees, CorporateActionRate48.mmChargesFees, CorporateActionRate49.mmChargesFees,
					RateDetails14.mmChargesFees, CorporateActionRate58.mmChargesFees, RateDetails18.mmChargesFees, RateDetails21.mmChargesFees, CorporateActionRate65.mmChargesFees, RateDetails23.mmChargesFees,
					CorporateActionRate69.mmChargesFees, RateDetails22.mmChargesFees, CorporateActionRate72.mmChargesFees, RateDetails24.mmChargesFees, RateDetails25.mmChargesFees, CorporateActionRate77.mmChargesFees,
					CorporateActionRate75.mmChargesFees, RateDetails26.mmChargesFees, RateDetails27.mmChargesFees, RateDetails28.mmChargesFees, RateDetails30.mmChargesFees, RateDetails31.mmChargesFees, RateDetails32.mmChargesFees,
					CorporateActionRate90.mmChargesFees, CorporateActionRate89.mmChargesFees, CorporateActionRate93.mmChargesFees, RateDetails33.mmChargesFees, CorporateActionRate95.mmChargesFees, RateDetails34.mmChargesFees);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionFeesAndCharges.mmCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}

		@Override
		public Optional<CorporateActionFeesAndCharges> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionCharge();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<CorporateActionFeesAndCharges> value) {
			obj.setCorporateActionCharge(value.orElse(null));
		}
	};
	protected ISODateTime pariPassuDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmPariPassuDate
	 * SecurityDate1.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#mmPariPassuDate
	 * SecurityDate3.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#mmPariPassuDate
	 * SecurityDate6.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#mmPariPassuDate
	 * SecurityDate7.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#mmPariPassuDate
	 * SecurityDate2.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#mmPariPassuDate
	 * SecurityDate4.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#mmPariPassuDate
	 * SecurityDate5.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#mmPariPassuDate
	 * SecurityDate8.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#mmPariPassuDate
	 * SecurityDate9.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#mmPariPassuDate
	 * SecurityDate10.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmPariPassuDate
	 * CorporateActionDate3.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmPariPassuDate
	 * SecurityDate12.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmPariPassuDate
	 * SecurityDate11.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#mmPariPassuDate
	 * SecurityDate14.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#mmPariPassuDate
	 * SecurityDate13.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate15#mmPariPassuDate
	 * SecurityDate15.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate16#mmPariPassuDate
	 * SecurityDate16.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate17#mmPariPassuDate
	 * SecurityDate17.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18#mmPariPassuDate
	 * SecurityDate18.mmPariPassuDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmPariPassuDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityDate1.mmPariPassuDate, SecurityDate3.mmPariPassuDate, SecurityDate6.mmPariPassuDate, SecurityDate7.mmPariPassuDate, SecurityDate2.mmPariPassuDate, SecurityDate4.mmPariPassuDate,
					SecurityDate5.mmPariPassuDate, SecurityDate8.mmPariPassuDate, SecurityDate9.mmPariPassuDate, SecurityDate10.mmPariPassuDate, CorporateActionDate3.mmPariPassuDate, SecurityDate12.mmPariPassuDate,
					SecurityDate11.mmPariPassuDate, SecurityDate14.mmPariPassuDate, SecurityDate13.mmPariPassuDate, SecurityDate15.mmPariPassuDate, SecurityDate16.mmPariPassuDate, SecurityDate17.mmPariPassuDate,
					SecurityDate18.mmPariPassuDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getPariPassuDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setPariPassuDate(value);
		}
	};
	protected Max350Text informationConditions;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmInformationConditions
	 * CorporateActionNarrative4.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmInformationConditions
	 * CorporateActionNarrative14.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmInformationConditions
	 * CorporateActionNarrative5.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmInformationConditions
	 * CorporateActionNarrative6.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#mmInformationConditions
	 * CorporateActionNarrative15.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmInformationConditions
	 * CorporateActionNarrative16.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#mmInformationConditions
	 * CorporateActionNarrative20.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#mmInformationConditions
	 * CorporateActionNarrative22.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmInformationConditions
	 * CorporateActionNarrative11.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmInformationConditions
	 * CorporateActionNarrative17.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmInformationConditions
	 * CorporateActionNarrative1.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmInformationConditions
	 * CorporateActionNarrative2.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmInformationConditions
	 * CorporateActionNarrative9.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmInformationConditions
	 * CorporateActionNarrative27.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmInformationConditions
	 * CorporateActionNarrative28.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmInformationConditions
	 * CorporateActionNarrative29.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmInformationConditions
	 * CorporateActionNarrative37.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmInformationConditions
	 * CorporateActionNarrative41.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#mmInformationConditions
	 * CorporateActionNarrative36.mmInformationConditions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, Max350Text> mmInformationConditions = new MMBusinessAttribute<CorporateActionEvent, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative4.mmInformationConditions, CorporateActionNarrative14.mmInformationConditions, CorporateActionNarrative5.mmInformationConditions,
					CorporateActionNarrative6.mmInformationConditions, CorporateActionNarrative15.mmInformationConditions, CorporateActionNarrative16.mmInformationConditions, CorporateActionNarrative20.mmInformationConditions,
					CorporateActionNarrative22.mmInformationConditions, CorporateActionNarrative11.mmInformationConditions, CorporateActionNarrative17.mmInformationConditions, CorporateActionNarrative1.mmInformationConditions,
					CorporateActionNarrative2.mmInformationConditions, CorporateActionNarrative9.mmInformationConditions, CorporateActionNarrative27.mmInformationConditions, CorporateActionNarrative28.mmInformationConditions,
					CorporateActionNarrative29.mmInformationConditions, CorporateActionNarrative37.mmInformationConditions, CorporateActionNarrative41.mmInformationConditions, CorporateActionNarrative36.mmInformationConditions);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEvent obj) {
			return obj.getInformationConditions();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Max350Text value) {
			obj.setInformationConditions(value);
		}
	};
	protected List<SecuritiesQuantity> fractionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
	 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmFractionalQuantity
	 * CorporateActionGeneralInformation50.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmFractionalQuantity
	 * CorporateActionGeneralInformation62.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmFractionalQuantity
	 * CorporateActionGeneralInformation79.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmFractionalQuantity
	 * CorporateActionGeneralInformation83.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmFractionalQuantity
	 * CorporateActionGeneralInformation82.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#mmFractionalQuantity
	 * CorporateActionGeneralInformation89.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmFractionalQuantity
	 * CorporateActionGeneralInformation98.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmFractionalQuantity
	 * CorporateActionGeneralInformation111.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#mmFractionalQuantity
	 * CorporateActionGeneralInformation118.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmFractionalQuantity
	 * CorporateActionGeneralInformation126.mmFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130#mmFractionalQuantity
	 * CorporateActionGeneralInformation130.mmFractionalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fractional quantity resulting from an event which will be paid with cash in lieu. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>> mmFractionalQuantity = new MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation50.mmFractionalQuantity, CorporateActionGeneralInformation62.mmFractionalQuantity, CorporateActionGeneralInformation79.mmFractionalQuantity,
					CorporateActionGeneralInformation83.mmFractionalQuantity, CorporateActionGeneralInformation82.mmFractionalQuantity, CorporateActionGeneralInformation89.mmFractionalQuantity,
					CorporateActionGeneralInformation98.mmFractionalQuantity, CorporateActionGeneralInformation111.mmFractionalQuantity, CorporateActionGeneralInformation118.mmFractionalQuantity,
					CorporateActionGeneralInformation126.mmFractionalQuantity, CorporateActionGeneralInformation130.mmFractionalQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedEventForFractionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(CorporateActionEvent obj) {
			return obj.getFractionalQuantity();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<SecuritiesQuantity> value) {
			obj.setFractionalQuantity(value);
		}
	};
	protected CorporateActionEventProcessingTypeCode eventProcessingType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice#mmCode
	 * CorporateActionEventProcessingTypeChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice#mmProprietary
	 * CorporateActionEventProcessingTypeChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmEventProcessingType
	 * CorporateActionGeneralInformation3.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice#mmCode
	 * CorporateActionEventProcessingType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice#mmProprietary
	 * CorporateActionEventProcessingType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmEventProcessingType
	 * CorporateActionGeneralInformation17.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmEventProcessingType
	 * CorporateActionGeneralInformation23.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmEventProcessingType
	 * CorporateActionGeneralInformation30.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmEventProcessingType
	 * CorporateActionGeneralInformation38.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmEventProcessingType
	 * CorporateActionGeneralInformation46.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmEventProcessingType
	 * CorporateActionGeneralInformation54.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmEventProcessingType
	 * CorporateActionGeneralInformation64.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmEventProcessingType
	 * CorporateActionGeneralInformation11.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmEventProcessingType
	 * CorporateActionGeneralInformation19.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmEventProcessingType
	 * CorporateActionGeneralInformation22.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmEventProcessingType
	 * CorporateActionGeneralInformation31.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmEventProcessingType
	 * CorporateActionGeneralInformation37.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmEventProcessingType
	 * CorporateActionGeneralInformation45.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmEventProcessingType
	 * CorporateActionGeneralInformation51.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmEventProcessingType
	 * CorporateActionGeneralInformation67.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice#mmCode
	 * CorporateActionEventProcessingType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice#mmProprietary
	 * CorporateActionEventProcessingType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmEventProcessingType
	 * CorporateActionInformation2.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmEventProcessingType
	 * CorporateActionInformation1.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmEventProcessingType
	 * CorporateActionGeneralInformation69.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmEventProcessingType
	 * CorporateActionGeneralInformation70.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmEventProcessingType
	 * CorporateActionGeneralInformation78.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmEventProcessingType
	 * CorporateActionGeneralInformation76.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmEventProcessingType
	 * CorporateActionGeneralInformation84.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmEventProcessingType
	 * CorporateActionGeneralInformation85.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice#mmCode
	 * CorporateActionEventProcessingType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice#mmProprietary
	 * CorporateActionEventProcessingType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmEventProcessingType
	 * CorporateActionGeneralInformation100.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmEventProcessingType
	 * CorporateActionGeneralInformation103.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice#mmCode
	 * CorporateActionEventProcessingType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice#mmProprietary
	 * CorporateActionEventProcessingType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmEventProcessingType
	 * CorporateActionGeneralInformation105.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmEventProcessingType
	 * CorporateActionGeneralInformation106.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmEventProcessingType
	 * CorporateActionGeneralInformation117.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmEventProcessingType
	 * CorporateActionGeneralInformation113.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmEventProcessingType
	 * CorporateActionGeneralInformation125.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmEventProcessingType
	 * CorporateActionGeneralInformation128.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmEventProcessingType
	 * CorporateActionGeneralInformation132.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmEventProcessingType
	 * CorporateActionGeneralInformation134.mmEventProcessingType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of processing involved by a Corporate Action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionEventProcessingTypeCode> mmEventProcessingType = new MMBusinessAttribute<CorporateActionEvent, CorporateActionEventProcessingTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventProcessingTypeChoice.mmCode, CorporateActionEventProcessingTypeChoice.mmProprietary, CorporateActionGeneralInformation3.mmEventProcessingType,
					CorporateActionEventProcessingType1Choice.mmCode, CorporateActionEventProcessingType1Choice.mmProprietary, CorporateActionGeneralInformation17.mmEventProcessingType,
					CorporateActionGeneralInformation23.mmEventProcessingType, CorporateActionGeneralInformation30.mmEventProcessingType, CorporateActionGeneralInformation38.mmEventProcessingType,
					CorporateActionGeneralInformation46.mmEventProcessingType, CorporateActionGeneralInformation54.mmEventProcessingType, CorporateActionGeneralInformation64.mmEventProcessingType,
					CorporateActionGeneralInformation11.mmEventProcessingType, CorporateActionGeneralInformation19.mmEventProcessingType, CorporateActionGeneralInformation22.mmEventProcessingType,
					CorporateActionGeneralInformation31.mmEventProcessingType, CorporateActionGeneralInformation37.mmEventProcessingType, CorporateActionGeneralInformation45.mmEventProcessingType,
					CorporateActionGeneralInformation51.mmEventProcessingType, CorporateActionGeneralInformation67.mmEventProcessingType, CorporateActionEventProcessingType1FormatChoice.mmCode,
					CorporateActionEventProcessingType1FormatChoice.mmProprietary, CorporateActionInformation2.mmEventProcessingType, CorporateActionInformation1.mmEventProcessingType,
					CorporateActionGeneralInformation69.mmEventProcessingType, CorporateActionGeneralInformation70.mmEventProcessingType, CorporateActionGeneralInformation78.mmEventProcessingType,
					CorporateActionGeneralInformation76.mmEventProcessingType, CorporateActionGeneralInformation84.mmEventProcessingType, CorporateActionGeneralInformation85.mmEventProcessingType,
					CorporateActionEventProcessingType2Choice.mmCode, CorporateActionEventProcessingType2Choice.mmProprietary, CorporateActionGeneralInformation100.mmEventProcessingType,
					CorporateActionGeneralInformation103.mmEventProcessingType, CorporateActionEventProcessingType3Choice.mmCode, CorporateActionEventProcessingType3Choice.mmProprietary,
					CorporateActionGeneralInformation105.mmEventProcessingType, CorporateActionGeneralInformation106.mmEventProcessingType, CorporateActionGeneralInformation117.mmEventProcessingType,
					CorporateActionGeneralInformation113.mmEventProcessingType, CorporateActionGeneralInformation125.mmEventProcessingType, CorporateActionGeneralInformation128.mmEventProcessingType,
					CorporateActionGeneralInformation132.mmEventProcessingType, CorporateActionGeneralInformation134.mmEventProcessingType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}

		@Override
		public CorporateActionEventProcessingTypeCode getValue(CorporateActionEvent obj) {
			return obj.getEventProcessingType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionEventProcessingTypeCode value) {
			obj.setEventProcessingType(value);
		}
	};
	protected List<CorporateActionStatus> corporateActionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
	 * CorporateActionStatus.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#mmProcessingStatus
	 * CorporateActionNotification2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmProcessingStatus
	 * CorporateActionNotification3.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmProcessingStatus
	 * CorporateActionNotification1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmProcessingStatus
	 * CorporateActionNotification4.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmProcessingStatus
	 * CorporateActionNotification5.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmProcessingStatus
	 * CorporateActionNotification6.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action process."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionStatus>> mmCorporateActionStatus = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification2.mmProcessingStatus, CorporateActionNotification3.mmProcessingStatus, CorporateActionNotification1.mmProcessingStatus,
					CorporateActionNotification4.mmProcessingStatus, CorporateActionNotification5.mmProcessingStatus, CorporateActionNotification6.mmProcessingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionStatus.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionStatus.mmObject();
		}

		@Override
		public List<CorporateActionStatus> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionStatus();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionStatus> value) {
			obj.setCorporateActionStatus(value);
		}
	};
	protected ISODateTime announcementDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmAnnouncementDate
	 * CorporateActionDate1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmAnnouncementDate
	 * CorporateActionDate13.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmAnnouncementDate
	 * CorporateActionDate14.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmAnnouncementDate
	 * CorporateActionDate21.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmAnnouncementDate
	 * CorporateActionDate22.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmAnnouncementDate
	 * CorporateActionDate25.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmAnnouncementDate
	 * CorporateActionDate27.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmAnnouncementDate
	 * CorporateActionDate28.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAnnouncementDate
	 * MeetingNotice1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAnnouncementDate
	 * MeetingNotice2.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAnnouncementDate
	 * MeetingNotice3.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmAnnouncementDate
	 * CorporateActionNotification1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmAnnouncementDate
	 * Issuance1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1#mmWebServiceNotificationDate
	 * CorporateActionGeneralInformation32SD1.mmWebServiceNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1#mmPreviousWebServiceNotificationDate
	 * CorporateActionGeneralInformation32SD1.
	 * mmPreviousWebServiceNotificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAnnouncementDate
	 * MeetingNotice4.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmAnnouncementDate
	 * CorporateActionDate44.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmAnnouncementDate
	 * CorporateActionDate58.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance3#mmAnnouncementDate
	 * Issuance3.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmAnnouncementDate
	 * CorporateActionDate61.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmAnnouncementDate
	 * CorporateActionDate74.mmAnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmAnnouncementDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmAnnouncementDate, CorporateActionDate13.mmAnnouncementDate, CorporateActionDate14.mmAnnouncementDate, CorporateActionDate21.mmAnnouncementDate,
					CorporateActionDate22.mmAnnouncementDate, CorporateActionDate25.mmAnnouncementDate, CorporateActionDate27.mmAnnouncementDate, CorporateActionDate28.mmAnnouncementDate, MeetingNotice1.mmAnnouncementDate,
					MeetingNotice2.mmAnnouncementDate, MeetingNotice3.mmAnnouncementDate, CorporateActionNotification1.mmAnnouncementDate, Issuance1.mmAnnouncementDate, CorporateActionGeneralInformation32SD1.mmWebServiceNotificationDate,
					CorporateActionGeneralInformation32SD1.mmPreviousWebServiceNotificationDate, MeetingNotice4.mmAnnouncementDate, CorporateActionDate44.mmAnnouncementDate, CorporateActionDate58.mmAnnouncementDate,
					Issuance3.mmAnnouncementDate, CorporateActionDate61.mmAnnouncementDate, CorporateActionDate74.mmAnnouncementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setAnnouncementDate(value);
		}
	};
	protected ISODateTime effectiveDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmEffectiveDate
	 * CorporateActionDate1.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmEffectiveDate
	 * CorporateActionDate13.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmEffectiveDate
	 * CorporateActionDate14.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmEffectiveDate
	 * CorporateActionDate21.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmEffectiveDate
	 * CorporateActionDate22.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmEffectiveDate
	 * CorporateActionDate25.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEffectiveDate
	 * CorporateActionDate27.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmEffectiveDate
	 * CorporateActionDate28.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEffectiveDate
	 * CorporateActionDate2.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEffectiveDate
	 * CorporateActionDate44.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEffectiveDate
	 * CorporateActionDate58.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEffectiveDate
	 * CorporateActionDate61.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmEffectiveDate
	 * CorporateActionDate74.mmEffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event is officially effective from the issuer's perspective."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmEffectiveDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmEffectiveDate, CorporateActionDate13.mmEffectiveDate, CorporateActionDate14.mmEffectiveDate, CorporateActionDate21.mmEffectiveDate,
					CorporateActionDate22.mmEffectiveDate, CorporateActionDate25.mmEffectiveDate, CorporateActionDate27.mmEffectiveDate, CorporateActionDate28.mmEffectiveDate, CorporateActionDate2.mmEffectiveDate,
					CorporateActionDate44.mmEffectiveDate, CorporateActionDate58.mmEffectiveDate, CorporateActionDate61.mmEffectiveDate, CorporateActionDate74.mmEffectiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setEffectiveDate(value);
		}
	};
	protected ISODateTime furtherDetailsAnnouncementDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate1.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate13.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate14.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate21.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate22.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate25.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate27.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate28.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmFurtherDetailedAnnouncementDate
	 * CorporateActionNotification1.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate44.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate58.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate61.mmFurtherDetailedAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmFurtherDetailedAnnouncementDate
	 * CorporateActionDate74.mmFurtherDetailedAnnouncementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailsAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmFurtherDetailsAnnouncementDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmFurtherDetailedAnnouncementDate, CorporateActionDate13.mmFurtherDetailedAnnouncementDate, CorporateActionDate14.mmFurtherDetailedAnnouncementDate,
					CorporateActionDate21.mmFurtherDetailedAnnouncementDate, CorporateActionDate22.mmFurtherDetailedAnnouncementDate, CorporateActionDate25.mmFurtherDetailedAnnouncementDate,
					CorporateActionDate27.mmFurtherDetailedAnnouncementDate, CorporateActionDate28.mmFurtherDetailedAnnouncementDate, CorporateActionNotification1.mmFurtherDetailedAnnouncementDate,
					CorporateActionDate44.mmFurtherDetailedAnnouncementDate, CorporateActionDate58.mmFurtherDetailedAnnouncementDate, CorporateActionDate61.mmFurtherDetailedAnnouncementDate,
					CorporateActionDate74.mmFurtherDetailedAnnouncementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getFurtherDetailsAnnouncementDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setFurtherDetailsAnnouncementDate(value);
		}
	};
	protected ISODateTime marginFixingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmMarginFixingDate
	 * CorporateActionDate1.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmMarginFixingDate
	 * CorporateActionDate13.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmMarginFixingDate
	 * CorporateActionDate14.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmMarginFixingDate
	 * CorporateActionDate21.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmMarginFixingDate
	 * CorporateActionDate22.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmMarginFixingDate
	 * CorporateActionDate25.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmMarginFixingDate
	 * CorporateActionDate27.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmMarginFixingDate
	 * CorporateActionDate28.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMarginFixingDate
	 * CorporateActionDate2.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMarginFixingDate
	 * CorporateActionDate44.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmMarginFixingDate
	 * CorporateActionDate58.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmMarginFixingDate
	 * CorporateActionDate61.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmMarginFixingDate
	 * CorporateActionDate74.mmMarginFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined ."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmMarginFixingDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmMarginFixingDate, CorporateActionDate13.mmMarginFixingDate, CorporateActionDate14.mmMarginFixingDate, CorporateActionDate21.mmMarginFixingDate,
					CorporateActionDate22.mmMarginFixingDate, CorporateActionDate25.mmMarginFixingDate, CorporateActionDate27.mmMarginFixingDate, CorporateActionDate28.mmMarginFixingDate, CorporateActionDate2.mmMarginFixingDate,
					CorporateActionDate44.mmMarginFixingDate, CorporateActionDate58.mmMarginFixingDate, CorporateActionDate61.mmMarginFixingDate, CorporateActionDate74.mmMarginFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getMarginFixingDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setMarginFixingDate(value);
		}
	};
	protected ISODate resultPublicationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmResultsPublicationDate
	 * CorporateActionDate1.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmResultsPublicationDate
	 * CorporateActionDate13.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmResultsPublicationDate
	 * CorporateActionDate14.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmResultsPublicationDate
	 * CorporateActionDate21.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmResultsPublicationDate
	 * CorporateActionDate22.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmResultsPublicationDate
	 * CorporateActionDate25.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmResultsPublicationDate
	 * CorporateActionDate27.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmResultsPublicationDate
	 * CorporateActionDate28.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResultPublicationDate
	 * MeetingNotice1.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResultPublicationDate
	 * MeetingNotice2.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmResultPublicationDate
	 * MeetingNotice3.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmResultsPublicationDate
	 * CorporateActionDate2.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmResultPublicationDate
	 * MeetingNotice4.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmResultsPublicationDate
	 * CorporateActionDate44.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmResultsPublicationDate
	 * CorporateActionDate58.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmResultsPublicationDate
	 * CorporateActionDate61.mmResultsPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmResultsPublicationDate
	 * CorporateActionDate74.mmResultsPublicationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which results are published, eg, results of an offer, of a meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODate> mmResultPublicationDate = new MMBusinessAttribute<CorporateActionEvent, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmResultsPublicationDate, CorporateActionDate13.mmResultsPublicationDate, CorporateActionDate14.mmResultsPublicationDate,
					CorporateActionDate21.mmResultsPublicationDate, CorporateActionDate22.mmResultsPublicationDate, CorporateActionDate25.mmResultsPublicationDate, CorporateActionDate27.mmResultsPublicationDate,
					CorporateActionDate28.mmResultsPublicationDate, MeetingNotice1.mmResultPublicationDate, MeetingNotice2.mmResultPublicationDate, MeetingNotice3.mmResultPublicationDate, CorporateActionDate2.mmResultsPublicationDate,
					MeetingNotice4.mmResultPublicationDate, CorporateActionDate44.mmResultsPublicationDate, CorporateActionDate58.mmResultsPublicationDate, CorporateActionDate61.mmResultsPublicationDate,
					CorporateActionDate74.mmResultsPublicationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CorporateActionEvent obj) {
			return obj.getResultPublicationDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODate value) {
			obj.setResultPublicationDate(value);
		}
	};
	protected ISODateTime unconditionalDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmUnconditionalDate
	 * CorporateActionDate1.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmUnconditionalDate
	 * CorporateActionDate13.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmUnconditionalDate
	 * CorporateActionDate14.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmUnconditionalDate
	 * CorporateActionDate21.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmUnconditionalDate
	 * CorporateActionDate22.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmUnconditionalDate
	 * CorporateActionDate25.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmUnconditionalDate
	 * CorporateActionDate27.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmUnconditionalDate
	 * CorporateActionDate28.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmUnconditionalDate
	 * CorporateActionDate2.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmUnconditionalDate
	 * CorporateActionDate44.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmUnconditionalDate
	 * CorporateActionDate58.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmUnconditionalDate
	 * CorporateActionDate61.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmUnconditionalDate
	 * CorporateActionDate74.mmUnconditionalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmUnconditionalDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmUnconditionalDate, CorporateActionDate13.mmUnconditionalDate, CorporateActionDate14.mmUnconditionalDate, CorporateActionDate21.mmUnconditionalDate,
					CorporateActionDate22.mmUnconditionalDate, CorporateActionDate25.mmUnconditionalDate, CorporateActionDate27.mmUnconditionalDate, CorporateActionDate28.mmUnconditionalDate, CorporateActionDate2.mmUnconditionalDate,
					CorporateActionDate44.mmUnconditionalDate, CorporateActionDate58.mmUnconditionalDate, CorporateActionDate61.mmUnconditionalDate, CorporateActionDate74.mmUnconditionalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setUnconditionalDate(value);
		}
	};
	protected ISODateTime whollyUnconditionalDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmWhollyUnconditionalDate
	 * CorporateActionDate1.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmWhollyUnconditionalDate
	 * CorporateActionDate13.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmWhollyUnconditionalDate
	 * CorporateActionDate14.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmWhollyUnconditionalDate
	 * CorporateActionDate21.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmWhollyUnconditionalDate
	 * CorporateActionDate22.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmWhollyUnconditionalDate
	 * CorporateActionDate25.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmWhollyUnconditionalDate
	 * CorporateActionDate27.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmWhollyUnconditionalDate
	 * CorporateActionDate28.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmWhollyUnconditionalDate
	 * CorporateActionDate2.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmWhollyUnconditionalDate
	 * CorporateActionDate44.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmWhollyUnconditionalDate
	 * CorporateActionDate58.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmWhollyUnconditionalDate
	 * CorporateActionDate61.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmWhollyUnconditionalDate
	 * CorporateActionDate74.mmWhollyUnconditionalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmWhollyUnconditionalDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmWhollyUnconditionalDate, CorporateActionDate13.mmWhollyUnconditionalDate, CorporateActionDate14.mmWhollyUnconditionalDate,
					CorporateActionDate21.mmWhollyUnconditionalDate, CorporateActionDate22.mmWhollyUnconditionalDate, CorporateActionDate25.mmWhollyUnconditionalDate, CorporateActionDate27.mmWhollyUnconditionalDate,
					CorporateActionDate28.mmWhollyUnconditionalDate, CorporateActionDate2.mmWhollyUnconditionalDate, CorporateActionDate44.mmWhollyUnconditionalDate, CorporateActionDate58.mmWhollyUnconditionalDate,
					CorporateActionDate61.mmWhollyUnconditionalDate, CorporateActionDate74.mmWhollyUnconditionalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getWhollyUnconditionalDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setWhollyUnconditionalDate(value);
		}
	};
	protected ISODateTime lapsedDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmLapsedDate
	 * CorporateActionDate1.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmLapsedDate
	 * CorporateActionDate13.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmLapsedDate
	 * CorporateActionDate14.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmLapsedDate
	 * CorporateActionDate21.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmLapsedDate
	 * CorporateActionDate22.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmLapsedDate
	 * CorporateActionDate25.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLapsedDate
	 * CorporateActionDate27.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmLapsedDate
	 * CorporateActionDate28.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLapsedDate
	 * CorporateActionDate2.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLapsedDate
	 * CorporateActionDate44.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLapsedDate
	 * CorporateActionDate58.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLapsedDate
	 * CorporateActionDate61.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmLapsedDate
	 * CorporateActionDate74.mmLapsedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ISODateTime> mmLapsedDate = new MMBusinessAttribute<CorporateActionEvent, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmLapsedDate, CorporateActionDate13.mmLapsedDate, CorporateActionDate14.mmLapsedDate, CorporateActionDate21.mmLapsedDate, CorporateActionDate22.mmLapsedDate,
					CorporateActionDate25.mmLapsedDate, CorporateActionDate27.mmLapsedDate, CorporateActionDate28.mmLapsedDate, CorporateActionDate2.mmLapsedDate, CorporateActionDate44.mmLapsedDate, CorporateActionDate58.mmLapsedDate,
					CorporateActionDate61.mmLapsedDate, CorporateActionDate74.mmLapsedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEvent obj) {
			return obj.getLapsedDate();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ISODateTime value) {
			obj.setLapsedDate(value);
		}
	};
	protected DateTimePeriod bookClosurePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
	 * DateTimePeriod.mmBookClosureCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmBookClosurePeriod
	 * CorporateActionPeriod3.mmBookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmBookClosurePeriod
	 * CorporateActionPeriod6.mmBookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmBookClosurePeriod
	 * CorporateActionPeriod8.mmBookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmBookClosurePeriod
	 * CorporateActionPeriod10.mmBookClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmBookClosurePeriod
	 * CorporateActionPeriod14.mmBookClosurePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod> mmBookClosurePeriod = new MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmBookClosurePeriod, CorporateActionPeriod6.mmBookClosurePeriod, CorporateActionPeriod8.mmBookClosurePeriod, CorporateActionPeriod10.mmBookClosurePeriod,
					CorporateActionPeriod14.mmBookClosurePeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmBookClosureCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionEvent obj) {
			return obj.getBookClosurePeriod();
		}

		@Override
		public void setValue(CorporateActionEvent obj, DateTimePeriod value) {
			obj.setBookClosurePeriod(value);
		}
	};
	protected List<SecuritiesQuantity> securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
	 * SecuritiesQuantity.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmSecuritiesQuantity
	 * CorporateAction3.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmSecuritiesQuantity
	 * CorporateAction4.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmSecuritiesQuantity
	 * CorporateAction5.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmSecuritiesQuantity
	 * CorporateAction6.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmSecuritiesQuantity
	 * CorporateAction10.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmSecuritiesQuantity
	 * CorporateAction11.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmSecuritiesQuantity
	 * CorporateAction12.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmSecuritiesQuantity
	 * CorporateAction17.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmSecuritiesQuantity
	 * CorporateAction31.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmSecuritiesQuantity
	 * CorporateAction40.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmSecuritiesQuantity
	 * CorporateAction41.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmSecuritiesQuantity
	 * CorporateAction42.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction49#mmSecuritiesQuantity
	 * CorporateAction49.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmSecuritiesQuantity
	 * CorporateAction51.mmSecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>> mmSecuritiesQuantity = new MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction3.mmSecuritiesQuantity, CorporateAction4.mmSecuritiesQuantity, CorporateAction5.mmSecuritiesQuantity, CorporateAction6.mmSecuritiesQuantity,
					CorporateAction10.mmSecuritiesQuantity, CorporateAction11.mmSecuritiesQuantity, CorporateAction12.mmSecuritiesQuantity, CorporateAction17.mmSecuritiesQuantity, CorporateAction31.mmSecuritiesQuantity,
					CorporateAction40.mmSecuritiesQuantity, CorporateAction41.mmSecuritiesQuantity, CorporateAction42.mmSecuritiesQuantity, CorporateAction49.mmSecuritiesQuantity, CorporateAction51.mmSecuritiesQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(CorporateActionEvent obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<SecuritiesQuantity> value) {
			obj.setSecuritiesQuantity(value);
		}
	};
	protected YesNoIndicator restrictionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmRestrictionIndicator
	 * CorporateAction3.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmRestrictionIndicator
	 * CorporateAction4.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRestrictionIndicator
	 * CorporateAction5.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmRestrictionIndicator
	 * CorporateAction6.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmRestrictionIndicator
	 * CorporateAction7.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmRestrictionIndicator
	 * CorporateAction8.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmRestrictionIndicator
	 * CorporateAction10.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmRestrictionIndicator
	 * CorporateAction11.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRestrictionIndicator
	 * CorporateAction2.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmRestrictionIndicator
	 * CorporateAction12.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmRestrictionIndicator
	 * CorporateAction17.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmRestrictionIndicator
	 * CorporateAction31.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmRestrictionIndicator
	 * CorporateAction40.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRestrictionIndicator
	 * CorporateAction41.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmRestrictionIndicator
	 * CorporateAction51.mmRestrictionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, YesNoIndicator> mmRestrictionIndicator = new MMBusinessAttribute<CorporateActionEvent, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction3.mmRestrictionIndicator, CorporateAction4.mmRestrictionIndicator, CorporateAction5.mmRestrictionIndicator, CorporateAction6.mmRestrictionIndicator,
					CorporateAction7.mmRestrictionIndicator, CorporateAction8.mmRestrictionIndicator, CorporateAction10.mmRestrictionIndicator, CorporateAction11.mmRestrictionIndicator, CorporateAction2.mmRestrictionIndicator,
					CorporateAction12.mmRestrictionIndicator, CorporateAction17.mmRestrictionIndicator, CorporateAction31.mmRestrictionIndicator, CorporateAction40.mmRestrictionIndicator, CorporateAction41.mmRestrictionIndicator,
					CorporateAction51.mmRestrictionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionEvent obj) {
			return obj.getRestrictionIndicator();
		}

		@Override
		public void setValue(CorporateActionEvent obj, YesNoIndicator value) {
			obj.setRestrictionIndicator(value);
		}
	};
	protected CorporateActionEventStageCode eventStage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice#mmCode
	 * CorporateActionEventStageFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice#mmProprietary
	 * CorporateActionEventStageFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmEventStage
	 * CorporateAction3.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice#mmCode
	 * CorporateActionEventStageFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice#mmProprietary
	 * CorporateActionEventStageFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmEventStage
	 * CorporateAction4.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice#mmCode
	 * CorporateActionEventStageFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice#mmProprietary
	 * CorporateActionEventStageFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmEventStage
	 * CorporateAction5.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice#mmCode
	 * CorporateActionEventStageFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice#mmProprietary
	 * CorporateActionEventStageFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmEventStage
	 * CorporateAction6.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmEventStage
	 * CorporateAction7.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmEventStage
	 * CorporateAction8.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmEventStage
	 * CorporateAction10.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmEventStage
	 * CorporateAction11.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice#mmCode
	 * CorporateActionEventStage1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice#mmProprietary
	 * CorporateActionEventStage1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmEventStage
	 * CorporateAction2.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1Choice#mmCode
	 * CorporateActionEventStage1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1Choice#mmProprietary
	 * CorporateActionEventStage1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmCorporateActionEventStage
	 * Status1Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCorporateActionEventStage
	 * Status8Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage2Choice#mmCode
	 * CorporateActionEventStage2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage2Choice#mmProprietary
	 * CorporateActionEventStage2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCorporateActionEventStage
	 * Status3Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCorporateActionEventStage
	 * Status10Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmEventStage
	 * CorporateAction13.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmEventStage
	 * CorporateAction12.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice#mmCode
	 * CorporateActionEventStageFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice#mmProprietary
	 * CorporateActionEventStageFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice#mmCode
	 * CorporateActionEventStageFormat6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice#mmProprietary
	 * CorporateActionEventStageFormat6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction18#mmEventStage
	 * CorporateAction18.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmEventStage
	 * CorporateAction17.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice#mmCode
	 * CorporateActionEventStageFormat9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice#mmProprietary
	 * CorporateActionEventStageFormat9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice#mmCode
	 * CorporateActionEventStageFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice#mmProprietary
	 * CorporateActionEventStageFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction24#mmEventStage
	 * CorporateAction24.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction30#mmEventStage
	 * CorporateAction30.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction28#mmEventStage
	 * CorporateAction28.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction29#mmEventStage
	 * CorporateAction29.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice#mmCode
	 * CorporateActionEventStageFormat12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice#mmProprietary
	 * CorporateActionEventStageFormat12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice#mmCode
	 * CorporateActionEventStageFormat11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice#mmProprietary
	 * CorporateActionEventStageFormat11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCorporateActionEventStage
	 * Status19Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice#mmCode
	 * CorporateActionEventStage3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage3Choice#mmProprietary
	 * CorporateActionEventStage3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmEventStage
	 * CorporateAction33.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmEventStage
	 * CorporateAction32.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmEventStage
	 * CorporateAction31.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice#mmCode
	 * CorporateActionEventStageFormat14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice#mmProprietary
	 * CorporateActionEventStageFormat14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice#mmCode
	 * CorporateActionEventStageFormat13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice#mmProprietary
	 * CorporateActionEventStageFormat13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmEventStage
	 * CorporateAction34.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35#mmEventStage
	 * CorporateAction35.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmEventStage
	 * CorporateAction36.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#mmEventStage
	 * CorporateAction38.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmEventStage
	 * CorporateAction40.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice#mmCode
	 * CorporateActionEventStageFormat15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice#mmProprietary
	 * CorporateActionEventStageFormat15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice#mmCode
	 * CorporateActionEventStageFormat20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice#mmProprietary
	 * CorporateActionEventStageFormat20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCorporateActionEventStage
	 * Status22Choice.mmCorporateActionEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage4Choice#mmCode
	 * CorporateActionEventStage4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage4Choice#mmProprietary
	 * CorporateActionEventStage4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmEventStage
	 * CorporateAction41.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmEventStage
	 * CorporateAction43.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmEventStage
	 * CorporateAction42.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmEventStage
	 * CorporateAction44.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmEventStage
	 * CorporateAction45.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction46#mmEventStage
	 * CorporateAction46.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction47#mmEventStage
	 * CorporateAction47.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction48#mmEventStage
	 * CorporateAction48.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction49#mmEventStage
	 * CorporateAction49.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmEventStage
	 * CorporateAction51.mmEventStage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, CorporateActionEventStageCode> mmEventStage = new MMBusinessAttribute<CorporateActionEvent, CorporateActionEventStageCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventStageFormat1Choice.mmCode, CorporateActionEventStageFormat1Choice.mmProprietary, CorporateAction3.mmEventStage, CorporateActionEventStageFormat2Choice.mmCode,
					CorporateActionEventStageFormat2Choice.mmProprietary, CorporateAction4.mmEventStage, CorporateActionEventStageFormat3Choice.mmCode, CorporateActionEventStageFormat3Choice.mmProprietary, CorporateAction5.mmEventStage,
					CorporateActionEventStageFormat4Choice.mmCode, CorporateActionEventStageFormat4Choice.mmProprietary, CorporateAction6.mmEventStage, CorporateAction7.mmEventStage, CorporateAction8.mmEventStage,
					CorporateAction10.mmEventStage, CorporateAction11.mmEventStage, CorporateActionEventStage1FormatChoice.mmCode, CorporateActionEventStage1FormatChoice.mmProprietary, CorporateAction2.mmEventStage,
					CorporateActionEventStage1Choice.mmCode, CorporateActionEventStage1Choice.mmProprietary, Status1Choice.mmCorporateActionEventStage, Status8Choice.mmCorporateActionEventStage, CorporateActionEventStage2Choice.mmCode,
					CorporateActionEventStage2Choice.mmProprietary, Status3Choice.mmCorporateActionEventStage, Status10Choice.mmCorporateActionEventStage, CorporateAction13.mmEventStage, CorporateAction12.mmEventStage,
					CorporateActionEventStageFormat5Choice.mmCode, CorporateActionEventStageFormat5Choice.mmProprietary, CorporateActionEventStageFormat6Choice.mmCode, CorporateActionEventStageFormat6Choice.mmProprietary,
					CorporateAction18.mmEventStage, CorporateAction17.mmEventStage, CorporateActionEventStageFormat9Choice.mmCode, CorporateActionEventStageFormat9Choice.mmProprietary, CorporateActionEventStageFormat10Choice.mmCode,
					CorporateActionEventStageFormat10Choice.mmProprietary, CorporateAction24.mmEventStage, CorporateAction30.mmEventStage, CorporateAction28.mmEventStage, CorporateAction29.mmEventStage,
					CorporateActionEventStageFormat12Choice.mmCode, CorporateActionEventStageFormat12Choice.mmProprietary, CorporateActionEventStageFormat11Choice.mmCode, CorporateActionEventStageFormat11Choice.mmProprietary,
					Status19Choice.mmCorporateActionEventStage, CorporateActionEventStage3Choice.mmCode, CorporateActionEventStage3Choice.mmProprietary, CorporateAction33.mmEventStage, CorporateAction32.mmEventStage,
					CorporateAction31.mmEventStage, CorporateActionEventStageFormat14Choice.mmCode, CorporateActionEventStageFormat14Choice.mmProprietary, CorporateActionEventStageFormat13Choice.mmCode,
					CorporateActionEventStageFormat13Choice.mmProprietary, CorporateAction34.mmEventStage, CorporateAction35.mmEventStage, CorporateAction36.mmEventStage, CorporateAction38.mmEventStage, CorporateAction40.mmEventStage,
					CorporateActionEventStageFormat15Choice.mmCode, CorporateActionEventStageFormat15Choice.mmProprietary, CorporateActionEventStageFormat20Choice.mmCode, CorporateActionEventStageFormat20Choice.mmProprietary,
					Status22Choice.mmCorporateActionEventStage, CorporateActionEventStage4Choice.mmCode, CorporateActionEventStage4Choice.mmProprietary, CorporateAction41.mmEventStage, CorporateAction43.mmEventStage,
					CorporateAction42.mmEventStage, CorporateAction44.mmEventStage, CorporateAction45.mmEventStage, CorporateAction46.mmEventStage, CorporateAction47.mmEventStage, CorporateAction48.mmEventStage,
					CorporateAction49.mmEventStage, CorporateAction51.mmEventStage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}

		@Override
		public CorporateActionEventStageCode getValue(CorporateActionEvent obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionEventStageCode value) {
			obj.setEventStage(value);
		}
	};
	protected List<ContactPoint> documentationLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedCorporateActionEvent
	 * ContactPoint.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative24#mmURLAddress
	 * CorporateActionNarrative24.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25#mmURLAddress
	 * CorporateActionNarrative25.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#mmURLAddress
	 * CorporateActionNarrative26.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative39#mmURLAddress
	 * CorporateActionNarrative39.mmURLAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentationLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<ContactPoint>> mmDocumentationLocation = new MMBusinessAssociationEnd<CorporateActionEvent, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative24.mmURLAddress, CorporateActionNarrative25.mmURLAddress, CorporateActionNarrative26.mmURLAddress, CorporateActionNarrative39.mmURLAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(CorporateActionEvent obj) {
			return obj.getDocumentationLocation();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<ContactPoint> value) {
			obj.setDocumentationLocation(value);
		}
	};
	protected SecuritiesQuantity securitiesQuantitySought;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
	 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmSecuritiesQuantitySought
	 * CorporateAction2.mmSecuritiesQuantitySought}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, SecuritiesQuantity> mmSecuritiesQuantitySought = new MMBusinessAssociationEnd<CorporateActionEvent, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmSecuritiesQuantitySought);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(CorporateActionEvent obj) {
			return obj.getSecuritiesQuantitySought();
		}

		@Override
		public void setValue(CorporateActionEvent obj, SecuritiesQuantity value) {
			obj.setSecuritiesQuantitySought(value);
		}
	};
	protected YesNoIndicator partialElectionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPartialElectionIndicator
	 * CorporateAction2.mmPartialElectionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialElectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, YesNoIndicator> mmPartialElectionIndicator = new MMBusinessAttribute<CorporateActionEvent, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmPartialElectionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionEvent obj) {
			return obj.getPartialElectionIndicator();
		}

		@Override
		public void setValue(CorporateActionEvent obj, YesNoIndicator value) {
			obj.setPartialElectionIndicator(value);
		}
	};
	protected CorporateActionPartyRole corporateActionPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmCorporateActionEvent
	 * CorporateActionPartyRole.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party in the context of a corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, CorporateActionPartyRole> mmCorporateActionPartyRole = new MMBusinessAssociationEnd<CorporateActionEvent, CorporateActionPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionPartyRole.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPartyRole.mmObject();
		}

		@Override
		public CorporateActionPartyRole getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionPartyRole();
		}

		@Override
		public void setValue(CorporateActionEvent obj, CorporateActionPartyRole value) {
			obj.setCorporateActionPartyRole(value);
		}
	};
	protected List<MarketClaim> marketClaim;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarketClaim
	 * MarketClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
	 * MarketClaim.mmRelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market claim information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<MarketClaim>> mmMarketClaim = new MMBusinessAssociationEnd<CorporateActionEvent, List<MarketClaim>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			opposite_lazy = () -> MarketClaim.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarketClaim.mmObject();
		}

		@Override
		public List<MarketClaim> getValue(CorporateActionEvent obj) {
			return obj.getMarketClaim();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<MarketClaim> value) {
			obj.setMarketClaim(value);
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
	 * BiddingConditions.mmEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<BiddingConditions>> mmBiddingConditions = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<BiddingConditions>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BiddingConditions.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public Optional<BiddingConditions> getValue(CorporateActionEvent obj) {
			return obj.getBiddingConditions();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<BiddingConditions> value) {
			obj.setBiddingConditions(value.orElse(null));
		}
	};
	protected List<ClassAction> relatedClassAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClassAction
	 * ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCorporateEvent
	 * ClassAction.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClassAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying class action related to the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<ClassAction>> mmRelatedClassAction = new MMBusinessAssociationEnd<CorporateActionEvent, List<ClassAction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			opposite_lazy = () -> ClassAction.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClassAction.mmObject();
		}

		@Override
		public List<ClassAction> getValue(CorporateActionEvent obj) {
			return obj.getRelatedClassAction();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<ClassAction> value) {
			obj.setRelatedClassAction(value);
		}
	};
	protected List<CorporateActionEventRegistration> corporateActionEventRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
	 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official registration of the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionEventRegistration>> mmCorporateActionEventRegistration = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionEventRegistration>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEventRegistration.mmObject();
		}

		@Override
		public List<CorporateActionEventRegistration> getValue(CorporateActionEvent obj) {
			return obj.getCorporateActionEventRegistration();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionEventRegistration> value) {
			obj.setCorporateActionEventRegistration(value);
		}
	};
	protected SuspensionPeriod suspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
	 * SuspensionPeriod.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<SuspensionPeriod>> mmSuspensionPeriod = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<SuspensionPeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SuspensionPeriod.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}

		@Override
		public Optional<SuspensionPeriod> getValue(CorporateActionEvent obj) {
			return obj.getSuspensionPeriod();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<SuspensionPeriod> value) {
			obj.setSuspensionPeriod(value.orElse(null));
		}
	};
	protected Lottery lottery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Lottery Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
	 * Lottery.mmRelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Optional<Lottery>> mmLottery = new MMBusinessAssociationEnd<CorporateActionEvent, Optional<Lottery>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Lottery.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Lottery.mmObject();
		}

		@Override
		public Optional<Lottery> getValue(CorporateActionEvent obj) {
			return obj.getLottery();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Optional<Lottery> value) {
			obj.setLottery(value.orElse(null));
		}
	};
	protected RemarketingMarginTypeCode marginType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the margin type for a remarketing procedure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, RemarketingMarginTypeCode> mmMarginType = new MMBusinessAttribute<CorporateActionEvent, RemarketingMarginTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the margin type for a remarketing procedure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemarketingMarginTypeCode.mmObject();
		}

		@Override
		public RemarketingMarginTypeCode getValue(CorporateActionEvent obj) {
			return obj.getMarginType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, RemarketingMarginTypeCode value) {
			obj.setMarginType(value);
		}
	};
	protected List<Meeting> relatedMeeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
	 * Meeting.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the meeting  related to the corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<Meeting>> mmRelatedMeeting = new MMBusinessAssociationEnd<CorporateActionEvent, List<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> Meeting.mmCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public List<Meeting> getValue(CorporateActionEvent obj) {
			return obj.getRelatedMeeting();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<Meeting> value) {
			obj.setRelatedMeeting(value);
		}
	};
	protected List<CorporateActionServicing> services;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
	 * CorporateActionServicing.mmEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different services linked to a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionServicing>> mmServices = new MMBusinessAssociationEnd<CorporateActionEvent, List<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionServicing.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}

		@Override
		public List<CorporateActionServicing> getValue(CorporateActionEvent obj) {
			return obj.getServices();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<CorporateActionServicing> value) {
			obj.setServices(value);
		}
	};
	protected List<Issuance> issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmEventInformation
	 * Issuance.mmEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information specified when the corporate event relates to the issuance of securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<Issuance>> mmIssuance = new MMBusinessAssociationEnd<CorporateActionEvent, List<Issuance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			opposite_lazy = () -> Issuance.mmEventInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public List<Issuance> getValue(CorporateActionEvent obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<Issuance> value) {
			obj.setIssuance(value);
		}
	};
	protected List<SecuritiesModification> securitiesModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
	 * SecuritiesModification.mmRelatedCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the reference data of a security or of the organisation that issued it."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesModification>> mmSecuritiesModification = new MMBusinessAssociationEnd<CorporateActionEvent, List<SecuritiesModification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesModification.mmRelatedCorporateEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesModification.mmObject();
		}

		@Override
		public List<SecuritiesModification> getValue(CorporateActionEvent obj) {
			return obj.getSecuritiesModification();
		}

		@Override
		public void setValue(CorporateActionEvent obj, List<SecuritiesModification> value) {
			obj.setSecuritiesModification(value);
		}
	};
	protected DateTimePeriod tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
	 * DateTimePeriod.mmRelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmTradingPeriod
	 * SecuritiesOption4.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmTradingPeriod
	 * SecuritiesOption10.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmTradingPeriod
	 * SecuritiesOption13.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmTradingPeriod
	 * SecuritiesOption17.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmTradingPeriod
	 * SecuritiesOption24.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmTradingPeriod
	 * SecuritiesOption29.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmTradingPeriod
	 * SecuritiesOption33.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmTradingPeriod
	 * SecuritiesOption38.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmTradingPeriod
	 * SecuritiesOption37.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmTradingPeriod
	 * SecuritiesOption39.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmTradingPeriod
	 * FinancialInstrumentAttributes3.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmTradingPeriod
	 * SecuritiesOption6.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmTradingPeriod
	 * FinancialInstrumentAttributes12.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmTradingPeriod
	 * SecuritiesOption12.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmTradingPeriod
	 * FinancialInstrumentAttributes17.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmTradingPeriod
	 * SecuritiesOption14.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmTradingPeriod
	 * FinancialInstrumentAttributes25.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmTradingPeriod
	 * SecuritiesOption22.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmTradingPeriod
	 * SecuritiesOption25.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmTradingPeriod
	 * SecuritiesOption30.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmTradingPeriod
	 * FinancialInstrumentAttributes46.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmTradingPeriod
	 * FinancialInstrumentAttributes47.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmTradingPeriod
	 * SecurityOption1.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmTradingPeriod
	 * SecuritiesOption40.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmTradingPeriod
	 * SecuritiesOption45.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmTradingPeriod
	 * FinancialInstrumentAttributes68.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmTradingPeriod
	 * SecuritiesOption49.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmTradingPeriod
	 * FinancialInstrumentAttributes73.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmTradingPeriod
	 * SecuritiesOption57.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmTradingPeriod
	 * SecuritiesOption59.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmTradingPeriod
	 * SecuritiesOption61.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmTradingPeriod
	 * SecuritiesOption64.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmTradingPeriod
	 * FinancialInstrumentAttributes93.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmTradingPeriod
	 * SecuritiesOption68.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes94#mmTradingPeriod
	 * FinancialInstrumentAttributes94.mmTradingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a financial instrument is available for trading."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod> mmTradingPeriod = new MMBusinessAssociationEnd<CorporateActionEvent, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption4.mmTradingPeriod, SecuritiesOption10.mmTradingPeriod, SecuritiesOption13.mmTradingPeriod, SecuritiesOption17.mmTradingPeriod, SecuritiesOption24.mmTradingPeriod,
					SecuritiesOption29.mmTradingPeriod, SecuritiesOption33.mmTradingPeriod, SecuritiesOption38.mmTradingPeriod, SecuritiesOption37.mmTradingPeriod, SecuritiesOption39.mmTradingPeriod,
					FinancialInstrumentAttributes3.mmTradingPeriod, SecuritiesOption6.mmTradingPeriod, FinancialInstrumentAttributes12.mmTradingPeriod, SecuritiesOption12.mmTradingPeriod, FinancialInstrumentAttributes17.mmTradingPeriod,
					SecuritiesOption14.mmTradingPeriod, FinancialInstrumentAttributes25.mmTradingPeriod, SecuritiesOption22.mmTradingPeriod, SecuritiesOption25.mmTradingPeriod, SecuritiesOption30.mmTradingPeriod,
					FinancialInstrumentAttributes46.mmTradingPeriod, FinancialInstrumentAttributes47.mmTradingPeriod, SecurityOption1.mmTradingPeriod, SecuritiesOption40.mmTradingPeriod, SecuritiesOption45.mmTradingPeriod,
					FinancialInstrumentAttributes68.mmTradingPeriod, SecuritiesOption49.mmTradingPeriod, FinancialInstrumentAttributes73.mmTradingPeriod, SecuritiesOption57.mmTradingPeriod, SecuritiesOption59.mmTradingPeriod,
					SecuritiesOption61.mmTradingPeriod, SecuritiesOption64.mmTradingPeriod, FinancialInstrumentAttributes93.mmTradingPeriod, SecuritiesOption68.mmTradingPeriod, FinancialInstrumentAttributes94.mmTradingPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionEvent obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(CorporateActionEvent obj, DateTimePeriod value) {
			obj.setTradingPeriod(value);
		}
	};
	protected Tax transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
	 * Tax.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmFinancialTransactionTaxRate
	 * CorporateActionRate48.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmFinancialTransactionTaxRate
	 * CorporateActionRate49.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmFinancialTransactionTaxRate
	 * CorporateActionRate58.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmFinancialTransactionTaxRate
	 * CorporateActionRate65.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmFinancialTransactionTaxRate
	 * CorporateActionRate69.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmFinancialTransactionTaxRate
	 * CorporateActionRate72.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmFinancialTransactionTaxRate
	 * CorporateActionRate77.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmFinancialTransactionTaxRate
	 * CorporateActionRate75.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate90#mmFinancialTransactionTaxRate
	 * CorporateActionRate90.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate89#mmFinancialTransactionTaxRate
	 * CorporateActionRate89.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate93#mmFinancialTransactionTaxRate
	 * CorporateActionRate93.mmFinancialTransactionTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate95#mmFinancialTransactionTaxRate
	 * CorporateActionRate95.mmFinancialTransactionTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate of financial transactions related to an event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, Tax> mmTransactionTax = new MMBusinessAssociationEnd<CorporateActionEvent, Tax>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate48.mmFinancialTransactionTaxRate, CorporateActionRate49.mmFinancialTransactionTaxRate, CorporateActionRate58.mmFinancialTransactionTaxRate,
					CorporateActionRate65.mmFinancialTransactionTaxRate, CorporateActionRate69.mmFinancialTransactionTaxRate, CorporateActionRate72.mmFinancialTransactionTaxRate, CorporateActionRate77.mmFinancialTransactionTaxRate,
					CorporateActionRate75.mmFinancialTransactionTaxRate, CorporateActionRate90.mmFinancialTransactionTaxRate, CorporateActionRate89.mmFinancialTransactionTaxRate, CorporateActionRate93.mmFinancialTransactionTaxRate,
					CorporateActionRate95.mmFinancialTransactionTaxRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmCorporateActionEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(CorporateActionEvent obj) {
			return obj.getTransactionTax();
		}

		@Override
		public void setValue(CorporateActionEvent obj, Tax value) {
			obj.setTransactionTax(value);
		}
	};
	protected ConsentTypeCode consentType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmConsentType
	 * CorporateAction12.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat1Choice#mmCode
	 * ConsentTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat1Choice#mmProprietary
	 * ConsentTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmConsentType
	 * CorporateAction17.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat3Choice#mmCode
	 * ConsentTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat3Choice#mmProprietary
	 * ConsentTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmConsentType
	 * CorporateAction31.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#mmCode
	 * ConsentTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice#mmProprietary
	 * ConsentTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmConsentType
	 * CorporateAction40.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat5Choice#mmCode
	 * ConsentTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat5Choice#mmProprietary
	 * ConsentTypeFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmConsentType
	 * CorporateAction41.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmConsentType
	 * CorporateAction51.mmConsentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, ConsentTypeCode> mmConsentType = new MMBusinessAttribute<CorporateActionEvent, ConsentTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction12.mmConsentType, ConsentTypeFormat1Choice.mmCode, ConsentTypeFormat1Choice.mmProprietary, CorporateAction17.mmConsentType, ConsentTypeFormat3Choice.mmCode,
					ConsentTypeFormat3Choice.mmProprietary, CorporateAction31.mmConsentType, ConsentTypeFormat4Choice.mmCode, ConsentTypeFormat4Choice.mmProprietary, CorporateAction40.mmConsentType, ConsentTypeFormat5Choice.mmCode,
					ConsentTypeFormat5Choice.mmProprietary, CorporateAction41.mmConsentType, CorporateAction51.mmConsentType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}

		@Override
		public ConsentTypeCode getValue(CorporateActionEvent obj) {
			return obj.getConsentType();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ConsentTypeCode value) {
			obj.setConsentType(value);
		}
	};
	protected ProceedsDefinition proceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
	 * ProceedsDefinition.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the proceeds of a corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEvent, ProceedsDefinition> mmProceedsDefinition = new MMBusinessAssociationEnd<CorporateActionEvent, ProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProceedsDefinition.mmCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProceedsDefinition.mmObject();
		}

		@Override
		public ProceedsDefinition getValue(CorporateActionEvent obj) {
			return obj.getProceedsDefinition();
		}

		@Override
		public void setValue(CorporateActionEvent obj, ProceedsDefinition value) {
			obj.setProceedsDefinition(value);
		}
	};
	protected GenericIdentification taxOnNonDistributedProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmTaxOnNonDistributedProceedsIndicator
	 * CorporateAction41.mmTaxOnNonDistributedProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmTaxOnNonDistributedProceedsIndicator
	 * CorporateAction51.mmTaxOnNonDistributedProceedsIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnNonDistributedProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the tax regulation being attributed to the  non- distributed proceeds event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEvent, GenericIdentification> mmTaxOnNonDistributedProceedsIndicator = new MMBusinessAttribute<CorporateActionEvent, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction41.mmTaxOnNonDistributedProceedsIndicator, CorporateAction51.mmTaxOnNonDistributedProceedsIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxOnNonDistributedProceedsIndicator";
			definition = "Specifies the tax regulation being attributed to the  non- distributed proceeds event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(CorporateActionEvent obj) {
			return obj.getTaxOnNonDistributedProceedsIndicator();
		}

		@Override
		public void setValue(CorporateActionEvent obj, GenericIdentification value) {
			obj.setTaxOnNonDistributedProceedsIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmCorporateEvent, ContactPoint.mmRelatedCorporateActionEvent, DateTimePeriod.mmBookClosureCorporateAction, DateTimePeriod.mmRelatedCorporateAction,
						Tax.mmCorporateActionEvent, SecuritiesQuantity.mmRelatedEventForFractionalQuantity, SecuritiesQuantity.mmCorporateActionEvent, SecuritiesQuantity.mmRelatedCorporateActionEvent,
						CorporateActionStatus.mmCorporateActionEvent, CurrencyExchange.mmRelatedCorporateActionEvent, CorporateActionEventRegistration.mmCorporateActionEvent, Issuance.mmEventInformation,
						ProceedsDefinition.mmCorporateAction, ClassAction.mmCorporateEvent, SecuritiesModification.mmRelatedCorporateEvent, BiddingConditions.mmEvent, CorporateActionPrice.mmCorporateActionEvent,
						CorporateActionServicing.mmEvent, Deadline.mmRelatedCorporateActionEvent, CorporateActionFeesAndCharges.mmCorporateAction, MarketClaim.mmRelatedCorporateEvent, SuspensionPeriod.mmCorporateActionEvent,
						Lottery.mmRelatedCorporateEvent, Meeting.mmCorporateEvent, CorporateActionPartyRole.mmCorporateActionEvent);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionEventAndBalance1.mmGeneralInformation, CorporateActionEventAndBalance2.mmGeneralInformation, CorporateActionEventAndBalance3.mmGeneralInformation,
						CorporateActionEventAndBalance4.mmGeneralInformation, CorporateActionEventAndBalance5.mmGeneralInformation, CorporateActionEventAndBalance6.mmGeneralInformation, CorporateActionEventAndBalance7.mmGeneralInformation,
						CorporateActionEventAndBalance8.mmGeneralInformation, SecuritiesOption3.mmRateDetails, SecuritiesOption8.mmRateDetails, SecuritiesOption18.mmRateDetails, SecuritiesOption20.mmRateDetails,
						SecuritiesOption26.mmRateDetails, SecuritiesOption31.mmRateDetails, SecuritiesOption35.mmRateDetails, SecuritiesOption36.mmRateDetails, SecuritiesOption4.mmRateDetails, SecuritiesOption10.mmRateDetails,
						SecuritiesOption13.mmRateDetails, SecuritiesOption17.mmRateDetails, SecuritiesOption24.mmRateDetails, SecuritiesOption29.mmRateDetails, SecuritiesOption33.mmRateDetails, SecuritiesOption38.mmRateDetails,
						SecuritiesOption37.mmRateDetails, SecuritiesOption39.mmRateDetails, CorporateAction3.mmDateDetails, CorporateAction3.mmPeriodDetails, CorporateAction3.mmRateAndAmountDetails, SecuritiesOption6.mmRateDetails,
						CorporateAction4.mmDateDetails, CorporateAction4.mmPeriodDetails, CorporateAction4.mmRateAndAmountDetails, SecuritiesOption12.mmRateDetails, CorporateAction5.mmDateDetails, CorporateAction5.mmPeriodDetails,
						CorporateAction5.mmRateAndAmountDetails, SecuritiesOption14.mmRateDetails, CorporateAction6.mmDateDetails, CorporateAction6.mmPeriodDetails, CorporateAction6.mmRateAndAmountDetails, SecuritiesOption22.mmRateDetails,
						CorporateAction7.mmDateDetails, CorporateAction7.mmPeriodDetails, CorporateAction7.mmRateAndAmountDetails, SecuritiesOption25.mmRateDetails, CorporateAction8.mmDateDetails, CorporateAction8.mmPeriodDetails,
						CorporateAction8.mmRateAndAmountDetails, SecuritiesOption30.mmRateDetails, CorporateAction10.mmDateDetails, CorporateAction10.mmPeriodDetails, CorporateAction10.mmRateAndAmountDetails,
						CorporateAction11.mmDateDetails, CorporateAction11.mmPeriodDetails, CorporateAction11.mmRateAndAmountDetails, CorporateAction2.mmDateDetails, CorporateAction2.mmPeriodDetails,
						CorporateAction2.mmRateAndAmountDetails, CorporateAction13.mmDateDetails, CorporateAction12.mmDateDetails, CorporateAction12.mmPeriodDetails, CorporateAction12.mmRateAndAmountDetails,
						CorporateAction14.mmDateDetails, SecuritiesOption42.mmRateDetails, SecuritiesOption40.mmRateDetails, CorporateAction20.mmDateDetails, CorporateAction18.mmDateDetails, CorporateAction17.mmDateDetails,
						CorporateAction17.mmPeriodDetails, CorporateAction17.mmRateAndAmountDetails, SecuritiesOption48.mmRateDetails, SecuritiesOption45.mmRateDetails, CorporateActionSD12.mmEventStage, CorporateAction24.mmDateDetails,
						CorporateAction30.mmDateDetails, CorporateAction28.mmDateDetails, CorporateAction29.mmDateDetails, CorporateAction33.mmDateDetails, CorporateAction32.mmDateDetails, CorporateAction31.mmDateDetails,
						CorporateAction31.mmPeriodDetails, CorporateAction31.mmRateAndAmountDetails, SecuritiesOption49.mmRateDetails, CorporateActionEventAndBalance9.mmGeneralInformation, SecuritiesOption50.mmRateDetails,
						CorporateAction34.mmDateDetails, CorporateAction35.mmDateDetails, CorporateAction36.mmDateDetails, CorporateAction38.mmDateDetails, CorporateAction40.mmDateDetails, CorporateAction40.mmPeriodDetails,
						CorporateAction40.mmRateAndAmountDetails, SecuritiesOption55.mmRateDetails, SecuritiesOption57.mmRateDetails, CorporateActionEventAndBalance10.mmGeneralInformation, SecuritiesOption60.mmRateDetails,
						SecuritiesOption59.mmRateDetails, CorporateActionEventAndBalance11.mmGeneralInformation, SecuritiesOption61.mmRateDetails, CorporateActionEventAndBalance12.mmGeneralInformation, SecuritiesOption63.mmRateDetails,
						CorporateAction41.mmDateDetails, CorporateAction41.mmPeriodDetails, CorporateAction41.mmRateAndAmountDetails, CorporateAction43.mmDateDetails, CorporateAction42.mmDateDetails,
						CorporateActionEventAndBalance13.mmGeneralInformation, SecuritiesOption64.mmRateDetails, SecuritiesOption65.mmRateDetails, CorporateAction44.mmDateDetails, CorporateAction45.mmDateDetails,
						CorporateAction46.mmDateDetails, CorporateActionEventAndBalance14.mmGeneralInformation, CorporateAction47.mmDateDetails, SecuritiesOption67.mmRateDetails, CorporateAction48.mmDateDetails,
						CorporateAction49.mmDateDetails, SecuritiesOption68.mmRateDetails, CorporateAction51.mmDateDetails, CorporateAction51.mmPeriodDetails, CorporateAction51.mmRateAndAmountDetails);
				subType_lazy = () -> Arrays.asList(VoluntaryCorporateAction.mmObject(), MandatoryCorporateAction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmType, com.tools20022.repository.entity.CorporateActionEvent.mmMandatoryVoluntaryEventType,
						com.tools20022.repository.entity.CorporateActionEvent.mmUnderlyingSecurity, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.mmRegistrationDetails,
						com.tools20022.repository.entity.CorporateActionEvent.mmBasketOrIndexInformation, com.tools20022.repository.entity.CorporateActionEvent.mmDeadline,
						com.tools20022.repository.entity.CorporateActionEvent.mmAdditionalBusinessProcess, com.tools20022.repository.entity.CorporateActionEvent.mmTradingDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionCharge, com.tools20022.repository.entity.CorporateActionEvent.mmPariPassuDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmInformationConditions, com.tools20022.repository.entity.CorporateActionEvent.mmFractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmEventProcessingType, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionEvent.mmAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.mmEffectiveDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmFurtherDetailsAnnouncementDate, com.tools20022.repository.entity.CorporateActionEvent.mmMarginFixingDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmResultPublicationDate, com.tools20022.repository.entity.CorporateActionEvent.mmUnconditionalDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmWhollyUnconditionalDate, com.tools20022.repository.entity.CorporateActionEvent.mmLapsedDate,
						com.tools20022.repository.entity.CorporateActionEvent.mmBookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmRestrictionIndicator, com.tools20022.repository.entity.CorporateActionEvent.mmEventStage,
						com.tools20022.repository.entity.CorporateActionEvent.mmDocumentationLocation, com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantitySought,
						com.tools20022.repository.entity.CorporateActionEvent.mmPartialElectionIndicator, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPartyRole,
						com.tools20022.repository.entity.CorporateActionEvent.mmMarketClaim, com.tools20022.repository.entity.CorporateActionEvent.mmBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.mmRelatedClassAction, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionEventRegistration,
						com.tools20022.repository.entity.CorporateActionEvent.mmSuspensionPeriod, com.tools20022.repository.entity.CorporateActionEvent.mmLottery, com.tools20022.repository.entity.CorporateActionEvent.mmMarginType,
						com.tools20022.repository.entity.CorporateActionEvent.mmRelatedMeeting, com.tools20022.repository.entity.CorporateActionEvent.mmServices, com.tools20022.repository.entity.CorporateActionEvent.mmIssuance,
						com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesModification, com.tools20022.repository.entity.CorporateActionEvent.mmTradingPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax, com.tools20022.repository.entity.CorporateActionEvent.mmConsentType,
						com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator);
				derivationComponent_lazy = () -> ListBuilderForCorporateActionEvent_00.addElems(new ArrayList<>());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEvent.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventTypeV3Code getType() {
		return type;
	}

	public CorporateActionEvent setType(CorporateActionEventTypeV3Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CorporateActionMandatoryVoluntaryCode getMandatoryVoluntaryEventType() {
		return mandatoryVoluntaryEventType;
	}

	public CorporateActionEvent setMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType) {
		this.mandatoryVoluntaryEventType = Objects.requireNonNull(mandatoryVoluntaryEventType);
		return this;
	}

	public Security getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionEvent setUnderlyingSecurity(Security underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}

	public List<CorporateActionPrice> getCorporateActionPrice() {
		return corporateActionPrice == null ? corporateActionPrice = new ArrayList<>() : corporateActionPrice;
	}

	public CorporateActionEvent setCorporateActionPrice(List<CorporateActionPrice> corporateActionPrice) {
		this.corporateActionPrice = Objects.requireNonNull(corporateActionPrice);
		return this;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate == null ? exchangeRate = new ArrayList<>() : exchangeRate;
	}

	public CorporateActionEvent setExchangeRate(List<CurrencyExchange> exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Max350Text getRegistrationDetails() {
		return registrationDetails;
	}

	public CorporateActionEvent setRegistrationDetails(Max350Text registrationDetails) {
		this.registrationDetails = Objects.requireNonNull(registrationDetails);
		return this;
	}

	public Max350Text getBasketOrIndexInformation() {
		return basketOrIndexInformation;
	}

	public CorporateActionEvent setBasketOrIndexInformation(Max350Text basketOrIndexInformation) {
		this.basketOrIndexInformation = Objects.requireNonNull(basketOrIndexInformation);
		return this;
	}

	public Optional<Deadline> getDeadline() {
		return deadline == null ? Optional.empty() : Optional.of(deadline);
	}

	public CorporateActionEvent setDeadline(Deadline deadline) {
		this.deadline = deadline;
		return this;
	}

	public AdditionalBusinessProcessCode getAdditionalBusinessProcess() {
		return additionalBusinessProcess;
	}

	public CorporateActionEvent setAdditionalBusinessProcess(AdditionalBusinessProcessCode additionalBusinessProcess) {
		this.additionalBusinessProcess = Objects.requireNonNull(additionalBusinessProcess);
		return this;
	}

	public ISODateTime getTradingDate() {
		return tradingDate;
	}

	public CorporateActionEvent setTradingDate(ISODateTime tradingDate) {
		this.tradingDate = Objects.requireNonNull(tradingDate);
		return this;
	}

	public Optional<CorporateActionFeesAndCharges> getCorporateActionCharge() {
		return corporateActionCharge == null ? Optional.empty() : Optional.of(corporateActionCharge);
	}

	public CorporateActionEvent setCorporateActionCharge(CorporateActionFeesAndCharges corporateActionCharge) {
		this.corporateActionCharge = corporateActionCharge;
		return this;
	}

	public ISODateTime getPariPassuDate() {
		return pariPassuDate;
	}

	public CorporateActionEvent setPariPassuDate(ISODateTime pariPassuDate) {
		this.pariPassuDate = Objects.requireNonNull(pariPassuDate);
		return this;
	}

	public Max350Text getInformationConditions() {
		return informationConditions;
	}

	public CorporateActionEvent setInformationConditions(Max350Text informationConditions) {
		this.informationConditions = Objects.requireNonNull(informationConditions);
		return this;
	}

	public List<SecuritiesQuantity> getFractionalQuantity() {
		return fractionalQuantity == null ? fractionalQuantity = new ArrayList<>() : fractionalQuantity;
	}

	public CorporateActionEvent setFractionalQuantity(List<SecuritiesQuantity> fractionalQuantity) {
		this.fractionalQuantity = Objects.requireNonNull(fractionalQuantity);
		return this;
	}

	public CorporateActionEventProcessingTypeCode getEventProcessingType() {
		return eventProcessingType;
	}

	public CorporateActionEvent setEventProcessingType(CorporateActionEventProcessingTypeCode eventProcessingType) {
		this.eventProcessingType = Objects.requireNonNull(eventProcessingType);
		return this;
	}

	public List<CorporateActionStatus> getCorporateActionStatus() {
		return corporateActionStatus == null ? corporateActionStatus = new ArrayList<>() : corporateActionStatus;
	}

	public CorporateActionEvent setCorporateActionStatus(List<CorporateActionStatus> corporateActionStatus) {
		this.corporateActionStatus = Objects.requireNonNull(corporateActionStatus);
		return this;
	}

	public ISODateTime getAnnouncementDate() {
		return announcementDate;
	}

	public CorporateActionEvent setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = Objects.requireNonNull(announcementDate);
		return this;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public CorporateActionEvent setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = Objects.requireNonNull(effectiveDate);
		return this;
	}

	public ISODateTime getFurtherDetailsAnnouncementDate() {
		return furtherDetailsAnnouncementDate;
	}

	public CorporateActionEvent setFurtherDetailsAnnouncementDate(ISODateTime furtherDetailsAnnouncementDate) {
		this.furtherDetailsAnnouncementDate = Objects.requireNonNull(furtherDetailsAnnouncementDate);
		return this;
	}

	public ISODateTime getMarginFixingDate() {
		return marginFixingDate;
	}

	public CorporateActionEvent setMarginFixingDate(ISODateTime marginFixingDate) {
		this.marginFixingDate = Objects.requireNonNull(marginFixingDate);
		return this;
	}

	public ISODate getResultPublicationDate() {
		return resultPublicationDate;
	}

	public CorporateActionEvent setResultPublicationDate(ISODate resultPublicationDate) {
		this.resultPublicationDate = Objects.requireNonNull(resultPublicationDate);
		return this;
	}

	public ISODateTime getUnconditionalDate() {
		return unconditionalDate;
	}

	public CorporateActionEvent setUnconditionalDate(ISODateTime unconditionalDate) {
		this.unconditionalDate = Objects.requireNonNull(unconditionalDate);
		return this;
	}

	public ISODateTime getWhollyUnconditionalDate() {
		return whollyUnconditionalDate;
	}

	public CorporateActionEvent setWhollyUnconditionalDate(ISODateTime whollyUnconditionalDate) {
		this.whollyUnconditionalDate = Objects.requireNonNull(whollyUnconditionalDate);
		return this;
	}

	public ISODateTime getLapsedDate() {
		return lapsedDate;
	}

	public CorporateActionEvent setLapsedDate(ISODateTime lapsedDate) {
		this.lapsedDate = Objects.requireNonNull(lapsedDate);
		return this;
	}

	public DateTimePeriod getBookClosurePeriod() {
		return bookClosurePeriod;
	}

	public CorporateActionEvent setBookClosurePeriod(DateTimePeriod bookClosurePeriod) {
		this.bookClosurePeriod = Objects.requireNonNull(bookClosurePeriod);
		return this;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity == null ? securitiesQuantity = new ArrayList<>() : securitiesQuantity;
	}

	public CorporateActionEvent setSecuritiesQuantity(List<SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = Objects.requireNonNull(securitiesQuantity);
		return this;
	}

	public YesNoIndicator getRestrictionIndicator() {
		return restrictionIndicator;
	}

	public CorporateActionEvent setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = Objects.requireNonNull(restrictionIndicator);
		return this;
	}

	public CorporateActionEventStageCode getEventStage() {
		return eventStage;
	}

	public CorporateActionEvent setEventStage(CorporateActionEventStageCode eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public List<ContactPoint> getDocumentationLocation() {
		return documentationLocation == null ? documentationLocation = new ArrayList<>() : documentationLocation;
	}

	public CorporateActionEvent setDocumentationLocation(List<ContactPoint> documentationLocation) {
		this.documentationLocation = Objects.requireNonNull(documentationLocation);
		return this;
	}

	public SecuritiesQuantity getSecuritiesQuantitySought() {
		return securitiesQuantitySought;
	}

	public CorporateActionEvent setSecuritiesQuantitySought(SecuritiesQuantity securitiesQuantitySought) {
		this.securitiesQuantitySought = Objects.requireNonNull(securitiesQuantitySought);
		return this;
	}

	public YesNoIndicator getPartialElectionIndicator() {
		return partialElectionIndicator;
	}

	public CorporateActionEvent setPartialElectionIndicator(YesNoIndicator partialElectionIndicator) {
		this.partialElectionIndicator = Objects.requireNonNull(partialElectionIndicator);
		return this;
	}

	public CorporateActionPartyRole getCorporateActionPartyRole() {
		return corporateActionPartyRole;
	}

	public CorporateActionEvent setCorporateActionPartyRole(CorporateActionPartyRole corporateActionPartyRole) {
		this.corporateActionPartyRole = Objects.requireNonNull(corporateActionPartyRole);
		return this;
	}

	public List<MarketClaim> getMarketClaim() {
		return marketClaim == null ? marketClaim = new ArrayList<>() : marketClaim;
	}

	public CorporateActionEvent setMarketClaim(List<MarketClaim> marketClaim) {
		this.marketClaim = Objects.requireNonNull(marketClaim);
		return this;
	}

	public Optional<BiddingConditions> getBiddingConditions() {
		return biddingConditions == null ? Optional.empty() : Optional.of(biddingConditions);
	}

	public CorporateActionEvent setBiddingConditions(BiddingConditions biddingConditions) {
		this.biddingConditions = biddingConditions;
		return this;
	}

	public List<ClassAction> getRelatedClassAction() {
		return relatedClassAction == null ? relatedClassAction = new ArrayList<>() : relatedClassAction;
	}

	public CorporateActionEvent setRelatedClassAction(List<ClassAction> relatedClassAction) {
		this.relatedClassAction = Objects.requireNonNull(relatedClassAction);
		return this;
	}

	public List<CorporateActionEventRegistration> getCorporateActionEventRegistration() {
		return corporateActionEventRegistration == null ? corporateActionEventRegistration = new ArrayList<>() : corporateActionEventRegistration;
	}

	public CorporateActionEvent setCorporateActionEventRegistration(List<CorporateActionEventRegistration> corporateActionEventRegistration) {
		this.corporateActionEventRegistration = Objects.requireNonNull(corporateActionEventRegistration);
		return this;
	}

	public Optional<SuspensionPeriod> getSuspensionPeriod() {
		return suspensionPeriod == null ? Optional.empty() : Optional.of(suspensionPeriod);
	}

	public CorporateActionEvent setSuspensionPeriod(SuspensionPeriod suspensionPeriod) {
		this.suspensionPeriod = suspensionPeriod;
		return this;
	}

	public Optional<Lottery> getLottery() {
		return lottery == null ? Optional.empty() : Optional.of(lottery);
	}

	public CorporateActionEvent setLottery(Lottery lottery) {
		this.lottery = lottery;
		return this;
	}

	public RemarketingMarginTypeCode getMarginType() {
		return marginType;
	}

	public CorporateActionEvent setMarginType(RemarketingMarginTypeCode marginType) {
		this.marginType = Objects.requireNonNull(marginType);
		return this;
	}

	public List<Meeting> getRelatedMeeting() {
		return relatedMeeting == null ? relatedMeeting = new ArrayList<>() : relatedMeeting;
	}

	public CorporateActionEvent setRelatedMeeting(List<Meeting> relatedMeeting) {
		this.relatedMeeting = Objects.requireNonNull(relatedMeeting);
		return this;
	}

	public List<CorporateActionServicing> getServices() {
		return services == null ? services = new ArrayList<>() : services;
	}

	public CorporateActionEvent setServices(List<CorporateActionServicing> services) {
		this.services = Objects.requireNonNull(services);
		return this;
	}

	public List<Issuance> getIssuance() {
		return issuance == null ? issuance = new ArrayList<>() : issuance;
	}

	public CorporateActionEvent setIssuance(List<Issuance> issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public List<SecuritiesModification> getSecuritiesModification() {
		return securitiesModification == null ? securitiesModification = new ArrayList<>() : securitiesModification;
	}

	public CorporateActionEvent setSecuritiesModification(List<SecuritiesModification> securitiesModification) {
		this.securitiesModification = Objects.requireNonNull(securitiesModification);
		return this;
	}

	public DateTimePeriod getTradingPeriod() {
		return tradingPeriod;
	}

	public CorporateActionEvent setTradingPeriod(DateTimePeriod tradingPeriod) {
		this.tradingPeriod = Objects.requireNonNull(tradingPeriod);
		return this;
	}

	public Tax getTransactionTax() {
		return transactionTax;
	}

	public CorporateActionEvent setTransactionTax(Tax transactionTax) {
		this.transactionTax = Objects.requireNonNull(transactionTax);
		return this;
	}

	public ConsentTypeCode getConsentType() {
		return consentType;
	}

	public CorporateActionEvent setConsentType(ConsentTypeCode consentType) {
		this.consentType = Objects.requireNonNull(consentType);
		return this;
	}

	public ProceedsDefinition getProceedsDefinition() {
		return proceedsDefinition;
	}

	public CorporateActionEvent setProceedsDefinition(ProceedsDefinition proceedsDefinition) {
		this.proceedsDefinition = Objects.requireNonNull(proceedsDefinition);
		return this;
	}

	public GenericIdentification getTaxOnNonDistributedProceedsIndicator() {
		return taxOnNonDistributedProceedsIndicator;
	}

	public CorporateActionEvent setTaxOnNonDistributedProceedsIndicator(GenericIdentification taxOnNonDistributedProceedsIndicator) {
		this.taxOnNonDistributedProceedsIndicator = Objects.requireNonNull(taxOnNonDistributedProceedsIndicator);
		return this;
	}
}