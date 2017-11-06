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
import java.util.List;

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
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} = List of 519 elements</li>
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
 * "CorporateActionEvent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition."
 * </li>
 * </ul>
 */
public class CorporateActionEvent {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEventTypeV3Code type;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventType3Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType3Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation8.mmEventType, com.tools20022.repository.choice.CorporateActionEventType4Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType4Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation20.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation25.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation32.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType7Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType7Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation35.mmEventType, com.tools20022.repository.choice.CorporateActionEventType9Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType9Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation43.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType11Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType11Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType14Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType14Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation53.mmEventType, com.tools20022.repository.choice.CorporateActionEventType13Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType13Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation56.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType21Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType21Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation57.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation9.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation13.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation34.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation42.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation52.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType22Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType22Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation58.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation6.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation15.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation21.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation28.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation36.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation44.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation55.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation61.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation7.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation26.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation33.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation27.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation41.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation49.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation68.mmEventType, com.tools20022.repository.msg.EventInformation1.mmEventType,
					com.tools20022.repository.msg.EventInformation2.mmEventType, com.tools20022.repository.msg.EventInformation3.mmEventType, com.tools20022.repository.msg.EventInformation4.mmEventType,
					com.tools20022.repository.msg.EventInformation5.mmEventType, com.tools20022.repository.msg.EventInformation6.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation4.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation16.mmEventType, com.tools20022.repository.choice.CorporateActionEventType5Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType5Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation24.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType6Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType6Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation29.mmEventType, com.tools20022.repository.choice.CorporateActionEventType8Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType8Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation39.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType10Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType10Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation47.mmEventType, com.tools20022.repository.choice.CorporateActionEventType12Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType12Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation50.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType27Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType27Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation62.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation3.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation17.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation23.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation30.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation38.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation46.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation54.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType28Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType28Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation64.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation63.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation19.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation31.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation45.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation67.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType16Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType16Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType17Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType17Choice.mmProprietary,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails2.mmCorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails6.mmCorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails8.mmCorporateActionEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails10.mmCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType1Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType1Choice.mmProprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice.mmCorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType2Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType2Choice.mmProprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice.mmCorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType15Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType15Choice.mmProprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice.mmCorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType19Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType19Choice.mmProprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice.mmCorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice.mmCorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice.mmCorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice.mmCorporateActionEventType,
					com.tools20022.repository.msg.CorporateAction9.mmEventType, com.tools20022.repository.choice.CorporateActionEventType1CodeChoice.mmStructured,
					com.tools20022.repository.choice.CorporateActionEventType1CodeChoice.mmUnstructured, com.tools20022.repository.msg.InvestmentFundTransaction2.mmCorporateActionEventType,
					com.tools20022.repository.msg.InvestmentFundTransaction3.mmCorporateActionEventType, com.tools20022.repository.msg.InvestmentFundTransaction3.mmExtendedCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType2FormatChoice.mmCode, com.tools20022.repository.choice.CorporateActionEventType2FormatChoice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionInformation2.mmEventType, com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice.mmCode,
					com.tools20022.repository.choice.CorporateActionFrequencyType1FormatChoice.mmProprietary, com.tools20022.repository.msg.CorporateActionInformation1.mmEventType,
					com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation14.mmEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails3.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails4.mmCorporateActionEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation5.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation71.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation69.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation70.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation78.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation77.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation76.mmEventType,
					com.tools20022.repository.choice.TransactionType1Choice.mmCorporateActionType, com.tools20022.repository.choice.CorporateAction1Choice.mmType, com.tools20022.repository.choice.CorporateAction1Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation83.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.mmEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType30Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType30Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType29Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType29Choice.mmProprietary,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.mmCorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice.mmCorporateActionEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation89.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation88.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation86.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation91.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation87.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation84.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation85.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation90.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType33Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType33Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType32Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType32Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType34Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType34Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType31Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType31Choice.mmProprietary, com.tools20022.repository.msg.EventInformation7.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation93.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation100.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation97.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation99.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation94.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation103.mmEventType, com.tools20022.repository.choice.CorporateActionEventType42Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType42Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventType35Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType35Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventType41Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType41Choice.mmProprietary, com.tools20022.repository.msg.EventInformation8.mmEventType, com.tools20022.repository.choice.CorporateActionEventType36Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType36Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventType46Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType46Choice.mmProprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice.mmCorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType48Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType48Choice.mmProprietary, com.tools20022.repository.msg.IntraPositionMovementDetails12.mmCorporateActionEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation104.mmEventType, com.tools20022.repository.choice.CorporateActionEventType50Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType50Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation109.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation111.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation112.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation110.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation105.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation107.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation106.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation108.mmEventType, com.tools20022.repository.choice.CorporateActionEventType51Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType51Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventType52Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType52Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventType54Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType54Choice.mmProprietary, com.tools20022.repository.msg.EventInformation9.mmEventType, com.tools20022.repository.choice.CorporateActionEventType53Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType53Choice.mmProprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovementDetails13.mmCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType56Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType56Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation114.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation120.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation115.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation118.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation121.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation123.mmEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation113.mmEventType,
					com.tools20022.repository.choice.CorporateActionEventType62Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType62Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType61Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType61Choice.mmProprietary, com.tools20022.repository.msg.EventInformation10.mmEventType,
					com.tools20022.repository.msg.IntraPositionMovementDetails14.mmCorporateActionEventType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.mmCorporateActionEventType,
					com.tools20022.repository.choice.CorporateActionEventType71Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType71Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventType69Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventType69Choice.mmProprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice.mmCorporateActionEventType, com.tools20022.repository.choice.CorporateActionEventType57Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType57Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventType58Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventType58Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
		}
	};
	protected CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMandatoryVoluntaryEventType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice.mmCode, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation8.mmMandatoryVoluntaryEventType, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary2Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation20.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation25.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation32.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation35.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation43.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation53.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation56.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation57.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation1.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation2.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation3.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation4.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation5.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation6.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation3.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation17.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation23.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation30.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation38.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation46.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation54.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation64.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation63.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation19.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation31.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation45.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation67.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice.mmCode, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionInformation2.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionInformation1.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation12.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation69.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation70.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation78.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation76.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation86.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation87.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation84.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation85.mmMandatoryVoluntaryEventType, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary3Choice.mmProprietary, com.tools20022.repository.msg.EventInformation7.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation93.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation100.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation99.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation103.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation8.mmMandatoryVoluntaryEventType, com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionMandatoryVoluntary4Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation112.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation105.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation106.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation108.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.EventInformation9.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation120.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation123.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformation113.mmMandatoryVoluntaryEventType,
					com.tools20022.repository.msg.EventInformation10.mmMandatoryVoluntaryEventType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
		}
	};
	protected Security underlyingSecurity;
	/**
	 * Security to which this instruction or event applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmUnderlyingSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation6.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation15.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation21.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation28.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation36.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation44.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation55.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation61.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance1.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance2.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance3.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance5.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance6.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionEventAndBalance8.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption3.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption8.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption18.mmDateDetails,
					com.tools20022.repository.msg.SecuritiesOption20.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption26.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption31.mmDateDetails,
					com.tools20022.repository.msg.SecuritiesOption35.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption36.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation3.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption4.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption4.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation17.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption10.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption10.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation23.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption13.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption13.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation30.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption17.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption17.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation38.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption24.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption24.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation46.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption29.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption29.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation54.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption33.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption33.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption38.mmSecurityDetails,
					com.tools20022.repository.msg.SecuritiesOption38.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation64.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption37.mmSecurityDetails,
					com.tools20022.repository.msg.SecuritiesOption37.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption39.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption39.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption6.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption6.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation19.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption12.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption12.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption14.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption14.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation31.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption22.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption22.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption25.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption25.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation45.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption30.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption30.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation67.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionInformation2.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionInformation2.mmOtherUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionInformation1.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation5.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation71.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation70.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption42.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption40.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption40.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation77.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation76.mmUnderlyingSecurity, com.tools20022.repository.msg.SecuritiesOption48.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption45.mmSecurityDetails,
					com.tools20022.repository.msg.SecuritiesOption45.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation88.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation84.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation85.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption49.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption49.mmDateDetails, com.tools20022.repository.msg.CorporateActionEventAndBalance9.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption50.mmDateDetails, com.tools20022.repository.msg.CorporateActionGeneralInformation100.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation97.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation103.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption55.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption57.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption57.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionEventAndBalance10.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation105.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation107.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation106.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption60.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption59.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption59.mmDateDetails,
					com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation115.mmUnderlyingSecurity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.mmUnderlyingSecurity, com.tools20022.repository.msg.CorporateActionGeneralInformation113.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption61.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption61.mmDateDetails, com.tools20022.repository.msg.CorporateActionEventAndBalance12.mmUnderlyingSecurity,
					com.tools20022.repository.msg.SecuritiesOption63.mmDateDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security to which this instruction or event applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionPrice> corporateActionPrice;
	/**
	 * Specifies prices related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
	 * CorporateActionPrice.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption13.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption25.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption30.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption38.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption47.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption57.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption58.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption3.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption4.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption8.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption14.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption18.mmPriceDetails, com.tools20022.repository.msg.CashOption12.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption23.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption20.mmPriceDetails, com.tools20022.repository.msg.CashOption13.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption31.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption26.mmPriceDetails, com.tools20022.repository.msg.CashOption18.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption37.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption31.mmPriceDetails, com.tools20022.repository.msg.CashOption22.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption46.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption35.mmPriceDetails, com.tools20022.repository.msg.CashOption26.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption53.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption36.mmPriceDetails, com.tools20022.repository.msg.CashOption27.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption54.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption4.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption10.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption10.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption15.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption13.mmPriceDetails,
					com.tools20022.repository.msg.CashOption11.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption20.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption17.mmPriceDetails,
					com.tools20022.repository.msg.CashOption14.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption32.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption24.mmPriceDetails,
					com.tools20022.repository.msg.CashOption16.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption35.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption29.mmPriceDetails,
					com.tools20022.repository.msg.CashOption20.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption44.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption33.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption38.mmPriceDetails, com.tools20022.repository.msg.CashOption25.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption52.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption37.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption39.mmPriceDetails, com.tools20022.repository.msg.CashOption28.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption55.mmPriceDetails, com.tools20022.repository.msg.CorporateAction3.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption6.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption3.mmPriceDetails, com.tools20022.repository.msg.CorporateAction4.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption12.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption17.mmPriceDetails, com.tools20022.repository.msg.CorporateAction5.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption14.mmPriceDetails,
					com.tools20022.repository.msg.CashOption10.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption19.mmPriceDetails, com.tools20022.repository.msg.CorporateAction6.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption22.mmPriceDetails, com.tools20022.repository.msg.CashOption15.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption34.mmPriceDetails,
					com.tools20022.repository.msg.CorporateAction7.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption25.mmPriceDetails, com.tools20022.repository.msg.CashOption17.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption36.mmPriceDetails, com.tools20022.repository.msg.CorporateAction8.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption30.mmPriceDetails,
					com.tools20022.repository.msg.CashOption21.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption45.mmPriceDetails, com.tools20022.repository.msg.CorporateAction10.mmPriceDetails,
					com.tools20022.repository.msg.CashOption24.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption51.mmPriceDetails, com.tools20022.repository.msg.CorporateAction11.mmPriceDetails,
					com.tools20022.repository.msg.CashOption29.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption56.mmPriceDetails, com.tools20022.repository.msg.CorporateAction2.mmPriceDetails,
					com.tools20022.repository.msg.SecurityOption1.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption1.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption103.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption100.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption101.mmPriceDetails, com.tools20022.repository.msg.CorporateAction12.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption102.mmPriceDetails, com.tools20022.repository.msg.CashOption30.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption42.mmPriceDetails,
					com.tools20022.repository.msg.CashOption31.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption40.mmPriceDetails, com.tools20022.repository.msg.CashOption32.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption110.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption108.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption107.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption106.mmPriceDetails, com.tools20022.repository.msg.CorporateAction17.mmPriceDetails, com.tools20022.repository.msg.CashOption36.mmPriceDetails,
					com.tools20022.repository.msg.CashOption35.mmPriceDetails, com.tools20022.repository.msg.CashOption38.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption48.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption45.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption111.mmPriceDetails, com.tools20022.repository.msg.CashOption39.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption113.mmPriceDetails, com.tools20022.repository.msg.CashOption41.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption117.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption118.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption115.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption114.mmPriceDetails,
					com.tools20022.repository.msg.CorporateAction31.mmPriceDetails, com.tools20022.repository.msg.CashOption44.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption49.mmPriceDetails,
					com.tools20022.repository.msg.CashOption42.mmPriceDetails, com.tools20022.repository.msg.CashOption43.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption50.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption124.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption125.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption123.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption127.mmPriceDetails, com.tools20022.repository.msg.CorporateAction40.mmPriceDetails, com.tools20022.repository.msg.CashOption46.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption55.mmPriceDetails, com.tools20022.repository.msg.CashOption49.mmPriceDetails, com.tools20022.repository.msg.CashOption47.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption57.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption132.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption130.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption131.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption129.mmPriceDetails, com.tools20022.repository.msg.CashOption52.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption60.mmPriceDetails, com.tools20022.repository.msg.CashOption51.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption59.mmPriceDetails,
					com.tools20022.repository.msg.CashOption50.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption134.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption136.mmPriceDetails,
					com.tools20022.repository.msg.CorporateActionOption135.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption133.mmPriceDetails, com.tools20022.repository.msg.CashOption53.mmPriceDetails,
					com.tools20022.repository.msg.SecuritiesOption61.mmPriceDetails, com.tools20022.repository.msg.SecuritiesOption63.mmPriceDetails, com.tools20022.repository.msg.CashOption54.mmPriceDetails,
					com.tools20022.repository.msg.CashOption55.mmPriceDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPrice";
			definition = "Specifies prices related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate;
	/**
	 * Rate, specified by the issuer, when the paid amount is not in the same
	 * currency as the specified amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
	 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative8.mmForeignExchangeInstructionsAdditionalInformation,
					com.tools20022.repository.msg.CorporateActionNarrative13.mmForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CashOption2.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption9.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption12.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption13.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption18.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption22.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption26.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption27.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption3.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption6.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption11.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption14.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption16.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption20.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption25.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption28.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption4.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption8.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption10.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption15.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption17.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption21.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate36.mmIssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption24.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate42.mmIssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption29.mmForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate2.mmExchangeRate,
					com.tools20022.repository.msg.CashOption1.mmExchangeRate, com.tools20022.repository.msg.CashOption30.mmForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate44.mmIssuerDeclaredExchangeRate,
					com.tools20022.repository.msg.CashOption31.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption32.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption36.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption35.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption38.mmForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate57.mmIssuerDeclaredExchangeRate,
					com.tools20022.repository.msg.CashOption39.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption41.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption44.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate68.mmIssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption42.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption43.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionNarrative32.mmForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CashOption46.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionRate79.mmIssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption49.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption47.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CorporateActionNarrative33.mmForeignExchangeInstructionsAdditionalInformation, com.tools20022.repository.msg.CashOption52.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption51.mmForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate80.mmIssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption50.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption53.mmForeignExchangeDetails, com.tools20022.repository.msg.CorporateActionRate83.mmIssuerDeclaredExchangeRate, com.tools20022.repository.msg.CashOption54.mmForeignExchangeDetails,
					com.tools20022.repository.msg.CashOption55.mmForeignExchangeDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Rate, specified by the issuer, when the paid amount is not in the same currency as the specified amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected Max350Text registrationDetails;
	/**
	 * Provides information required for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	public static final MMBusinessAttribute mmRegistrationDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative7.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative12.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative21.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative23.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative4.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative14.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative6.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative16.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative11.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative17.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative2.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionAdditionalInformation1.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative27.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative30.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative28.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative37.mmRegistrationDetails,
					com.tools20022.repository.msg.CorporateActionNarrative34.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative41.mmRegistrationDetails);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text basketOrIndexInformation;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	public static final MMBusinessAttribute mmBasketOrIndexInformation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative7.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative12.mmBasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative21.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative23.mmBasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative4.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative14.mmBasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative6.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative16.mmBasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative11.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative17.mmBasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative27.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative28.mmBasketOrIndexInformation,
					com.tools20022.repository.msg.CorporateActionNarrative37.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative41.mmBasketOrIndexInformation);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Deadline deadline;
	/**
	 * Specifies the different deadlines related to a corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
	 * Deadline.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	public static final MMBusinessAssociationEnd mmDeadline = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedCorporateActionOption1.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption1.mmDeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption2.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption2.mmDeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption4.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption4.mmDeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption5.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption5.mmDeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption6.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption6.mmDeadlineType,
					com.tools20022.repository.msg.InstructedCorporateActionOption7.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption7.mmDeadlineType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines related to a corporate event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
		}
	};
	protected AdditionalBusinessProcessCode additionalBusinessProcess;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAdditionalBusinessProcess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat3Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation4.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat5Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation16.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation24.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation29.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat7Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation39.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat8Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation47.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation50.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation62.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat2Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation3.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat6Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation17.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation23.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation30.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation38.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation46.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation54.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation64.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction3.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat4Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction4.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction5.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction6.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction7.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction8.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction10.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction11.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction12.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction17.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateActionGeneralInformation83.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction33.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction32.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction31.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat10Choice.mmProprietary,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice.mmProprietary,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice.mmCode, com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction36.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction38.mmAdditionalBusinessProcessIndicator,
					com.tools20022.repository.msg.CorporateAction40.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice.mmProprietary, com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice.mmProprietary, com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice.mmCode,
					com.tools20022.repository.choice.AdditionalBusinessProcessFormat13Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalBusinessProcess";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalBusinessProcessCode.mmObject();
		}
	};
	protected ISODateTime tradingDate;
	/**
	 * Date/time at which the deal (rights) was agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTradingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.mmTradingDate, com.tools20022.repository.msg.CorporateActionDate10.mmTradingDate,
					com.tools20022.repository.msg.CorporateActionDate18.mmTradingDate, com.tools20022.repository.msg.CorporateActionDate19.mmTradingDate, com.tools20022.repository.msg.CorporateActionDate46.mmTradingDate,
					com.tools20022.repository.msg.CorporateActionDate52.mmTradingDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingDate";
			definition = "Date/time at which the deal (rights) was agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CorporateActionFeesAndCharges corporateActionCharge;
	/**
	 * Specifies the charges relative to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
	 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate10.mmChargesFees,
					com.tools20022.repository.msg.RateDetails2.mmChargesFees, com.tools20022.repository.msg.RateDetails4.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate29.mmChargesFees,
					com.tools20022.repository.msg.RateDetails7.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate34.mmChargesFees, com.tools20022.repository.msg.RateDetails9.mmChargesFees,
					com.tools20022.repository.msg.RateDetails11.mmChargesFees, com.tools20022.repository.msg.RateDetails12.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate5.mmChargesFees,
					com.tools20022.repository.msg.CorporateActionRate12.mmChargesFees, com.tools20022.repository.msg.RateDetails3.mmChargesFees, com.tools20022.repository.msg.RateDetails5.mmChargesFees,
					com.tools20022.repository.msg.CorporateActionRate28.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate33.mmChargesFees, com.tools20022.repository.msg.RateDetails10.mmChargesFees,
					com.tools20022.repository.msg.RateDetails13.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate1.mmCharges, com.tools20022.repository.msg.CorporateActionRate2.mmCharges,
					com.tools20022.repository.msg.RateDetails15.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate48.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate49.mmChargesFees,
					com.tools20022.repository.msg.RateDetails14.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate58.mmChargesFees, com.tools20022.repository.msg.RateDetails18.mmChargesFees,
					com.tools20022.repository.msg.RateDetails21.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate65.mmChargesFees, com.tools20022.repository.msg.RateDetails23.mmChargesFees,
					com.tools20022.repository.msg.CorporateActionRate69.mmChargesFees, com.tools20022.repository.msg.RateDetails22.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate72.mmChargesFees,
					com.tools20022.repository.msg.RateDetails24.mmChargesFees, com.tools20022.repository.msg.RateDetails25.mmChargesFees, com.tools20022.repository.msg.CorporateActionRate77.mmChargesFees,
					com.tools20022.repository.msg.CorporateActionRate75.mmChargesFees, com.tools20022.repository.msg.RateDetails26.mmChargesFees, com.tools20022.repository.msg.RateDetails27.mmChargesFees,
					com.tools20022.repository.msg.RateDetails28.mmChargesFees, com.tools20022.repository.msg.RateDetails30.mmChargesFees);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCharge";
			definition = "Specifies the charges relative to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
		}
	};
	protected ISODateTime pariPassuDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPariPassuDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate3.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate6.mmPariPassuDate,
					com.tools20022.repository.msg.SecurityDate7.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate2.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate4.mmPariPassuDate,
					com.tools20022.repository.msg.SecurityDate5.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate8.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate9.mmPariPassuDate,
					com.tools20022.repository.msg.SecurityDate10.mmPariPassuDate, com.tools20022.repository.msg.CorporateActionDate3.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate12.mmPariPassuDate,
					com.tools20022.repository.msg.SecurityDate11.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate14.mmPariPassuDate, com.tools20022.repository.msg.SecurityDate13.mmPariPassuDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PariPassuDate";
			definition = "Date on which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max350Text informationConditions;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	public static final MMBusinessAttribute mmInformationConditions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative4.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative14.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative5.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative6.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative15.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative16.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative20.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative22.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative11.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative17.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative1.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative2.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative9.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative27.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative28.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative29.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative37.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative41.mmInformationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative36.mmInformationConditions);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, eg, an offer is subject to 50% acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> fractionalQuantity;
	/**
	 * Fractional quantity resulting from an event which will be paid with cash
	 * in lieu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
	 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformation50.mmFractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation62.mmFractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation79.mmFractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation83.mmFractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation82.mmFractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation89.mmFractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation98.mmFractionalQuantity, com.tools20022.repository.msg.CorporateActionGeneralInformation111.mmFractionalQuantity,
					com.tools20022.repository.msg.CorporateActionGeneralInformation118.mmFractionalQuantity);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionalQuantity";
			definition = "Fractional quantity resulting from an event which will be paid with cash in lieu. ";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedEventForFractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionEventProcessingTypeCode eventProcessingType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEventProcessingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice.mmCode, com.tools20022.repository.choice.CorporateActionEventProcessingTypeChoice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation3.mmEventProcessingType, com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventProcessingType1Choice.mmProprietary, com.tools20022.repository.msg.CorporateActionGeneralInformation17.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation23.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation30.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation38.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation46.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation54.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation64.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation11.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation19.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation22.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation31.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation37.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation45.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation51.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation67.mmEventProcessingType,
					com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice.mmCode, com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionInformation2.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionInformation1.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation69.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation70.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation78.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation76.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation84.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation85.mmEventProcessingType,
					com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventProcessingType2Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation100.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation103.mmEventProcessingType,
					com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventProcessingType3Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateActionGeneralInformation105.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation106.mmEventProcessingType,
					com.tools20022.repository.msg.CorporateActionGeneralInformation117.mmEventProcessingType, com.tools20022.repository.msg.CorporateActionGeneralInformation113.mmEventProcessingType);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionStatus> corporateActionStatus;
	/**
	 * Status of the corporate action process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
	 * CorporateActionStatus.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotification2.mmProcessingStatus, com.tools20022.repository.msg.CorporateActionNotification3.mmProcessingStatus,
					com.tools20022.repository.msg.CorporateActionNotification1.mmProcessingStatus, com.tools20022.repository.msg.CorporateActionNotification4.mmProcessingStatus,
					com.tools20022.repository.msg.CorporateActionNotification5.mmProcessingStatus, com.tools20022.repository.msg.CorporateActionNotification6.mmProcessingStatus);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Status of the corporate action process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}
	};
	protected ISODateTime announcementDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAnnouncementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate13.mmAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate21.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate22.mmAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate27.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate28.mmAnnouncementDate,
					com.tools20022.repository.msg.MeetingNotice1.mmAnnouncementDate, com.tools20022.repository.msg.MeetingNotice2.mmAnnouncementDate, com.tools20022.repository.msg.MeetingNotice3.mmAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionNotification1.mmAnnouncementDate, com.tools20022.repository.msg.Issuance1.mmAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1.mmWebServiceNotificationDate, com.tools20022.repository.msg.CorporateActionGeneralInformation32SD1.mmPreviousWebServiceNotificationDate,
					com.tools20022.repository.msg.MeetingNotice4.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate44.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate58.mmAnnouncementDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur such as the issue of securities or an official meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime effectiveDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate13.mmEffectiveDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate21.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate22.mmEffectiveDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate27.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate28.mmEffectiveDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate44.mmEffectiveDate, com.tools20022.repository.msg.CorporateActionDate58.mmEffectiveDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime furtherDetailsAnnouncementDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmFurtherDetailsAnnouncementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmFurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate13.mmFurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmFurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate21.mmFurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate22.mmFurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate25.mmFurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate27.mmFurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate28.mmFurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionNotification1.mmFurtherDetailedAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate44.mmFurtherDetailedAnnouncementDate,
					com.tools20022.repository.msg.CorporateActionDate58.mmFurtherDetailedAnnouncementDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FurtherDetailsAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for instance exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime marginFixingDate;
	/**
	 * Date/time at which the margin rate will be determined .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMarginFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate13.mmMarginFixingDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate21.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate22.mmMarginFixingDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate27.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate28.mmMarginFixingDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate44.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate58.mmMarginFixingDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODate resultPublicationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmResultPublicationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate13.mmResultsPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate21.mmResultsPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate22.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate25.mmResultsPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate27.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate28.mmResultsPublicationDate,
					com.tools20022.repository.msg.MeetingNotice1.mmResultPublicationDate, com.tools20022.repository.msg.MeetingNotice2.mmResultPublicationDate, com.tools20022.repository.msg.MeetingNotice3.mmResultPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmResultsPublicationDate, com.tools20022.repository.msg.MeetingNotice4.mmResultPublicationDate,
					com.tools20022.repository.msg.CorporateActionDate44.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate58.mmResultsPublicationDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which results are published, eg, results of an offer, of a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODateTime unconditionalDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmUnconditionalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate13.mmUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate21.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate22.mmUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate27.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate28.mmUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate44.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate58.mmUnconditionalDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnconditionalDate";
			definition = "Date upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime whollyUnconditionalDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmWhollyUnconditionalDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmWhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate13.mmWhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmWhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate21.mmWhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate22.mmWhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate25.mmWhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate27.mmWhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate28.mmWhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmWhollyUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate44.mmWhollyUnconditionalDate,
					com.tools20022.repository.msg.CorporateActionDate58.mmWhollyUnconditionalDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime lapsedDate;
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmLapsedDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate13.mmLapsedDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate21.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate22.mmLapsedDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate27.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate28.mmLapsedDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate44.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate58.mmLapsedDate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriod bookClosurePeriod;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
	 * DateTimePeriod.mmBookClosureCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmBookClosurePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod3.mmBookClosurePeriod, com.tools20022.repository.msg.CorporateActionPeriod6.mmBookClosurePeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.mmBookClosurePeriod, com.tools20022.repository.msg.CorporateActionPeriod10.mmBookClosurePeriod);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosurePeriod";
			definition = "Period defining the last date on which shareholder registration will be accepted by the issuer and the date on which shareholder registration will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBookClosureCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * Provides information about securities quantity linked to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
	 * SecuritiesQuantity.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction3.mmSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction4.mmSecuritiesQuantity,
					com.tools20022.repository.msg.CorporateAction5.mmSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction6.mmSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction10.mmSecuritiesQuantity,
					com.tools20022.repository.msg.CorporateAction11.mmSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction12.mmSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction17.mmSecuritiesQuantity,
					com.tools20022.repository.msg.CorporateAction31.mmSecuritiesQuantity, com.tools20022.repository.msg.CorporateAction40.mmSecuritiesQuantity);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator restrictionIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRestrictionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction3.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction4.mmRestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction5.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction6.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction7.mmRestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction8.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction10.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction11.mmRestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction2.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction12.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction17.mmRestrictionIndicator,
					com.tools20022.repository.msg.CorporateAction31.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction40.mmRestrictionIndicator);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there are legal or other restrictions associated with a rights offer or other corporate event, for example, domicile, citizenship, residency, type of investor.\r\nYes = There are restrictions.\r\nNo = There are no restrictions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CorporateActionEventStageCode eventStage;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEventStage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStageFormat1Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction3.mmEventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat2Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction4.mmEventStage,
					com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction5.mmEventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat4Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction6.mmEventStage, com.tools20022.repository.msg.CorporateAction7.mmEventStage,
					com.tools20022.repository.msg.CorporateAction8.mmEventStage, com.tools20022.repository.msg.CorporateAction10.mmEventStage, com.tools20022.repository.msg.CorporateAction11.mmEventStage,
					com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice.mmCode, com.tools20022.repository.choice.CorporateActionEventStage1FormatChoice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction2.mmEventStage, com.tools20022.repository.choice.CorporateActionEventStage1Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStage1Choice.mmProprietary,
					com.tools20022.repository.choice.Status1Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.Status8Choice.mmCorporateActionEventStage,
					com.tools20022.repository.choice.CorporateActionEventStage2Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStage2Choice.mmProprietary,
					com.tools20022.repository.choice.Status3Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.Status10Choice.mmCorporateActionEventStage, com.tools20022.repository.msg.CorporateAction13.mmEventStage,
					com.tools20022.repository.msg.CorporateAction12.mmEventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat5Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat6Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction18.mmEventStage, com.tools20022.repository.msg.CorporateAction17.mmEventStage,
					com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStageFormat9Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStageFormat10Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction24.mmEventStage, com.tools20022.repository.msg.CorporateAction30.mmEventStage, com.tools20022.repository.msg.CorporateAction28.mmEventStage,
					com.tools20022.repository.msg.CorporateAction29.mmEventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat12Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat11Choice.mmProprietary, com.tools20022.repository.choice.Status19Choice.mmCorporateActionEventStage,
					com.tools20022.repository.choice.CorporateActionEventStage3Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStage3Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction33.mmEventStage,
					com.tools20022.repository.msg.CorporateAction32.mmEventStage, com.tools20022.repository.msg.CorporateAction31.mmEventStage, com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice.mmProprietary, com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction34.mmEventStage, com.tools20022.repository.msg.CorporateAction35.mmEventStage,
					com.tools20022.repository.msg.CorporateAction36.mmEventStage, com.tools20022.repository.msg.CorporateAction38.mmEventStage, com.tools20022.repository.msg.CorporateAction40.mmEventStage,
					com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice.mmProprietary,
					com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice.mmCode, com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice.mmProprietary,
					com.tools20022.repository.choice.Status22Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.CorporateActionEventStage4Choice.mmCode,
					com.tools20022.repository.choice.CorporateActionEventStage4Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStageCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> documentationLocation;
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
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedCorporateActionEvent
	 * ContactPoint.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	public static final MMBusinessAssociationEnd mmDocumentationLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative24.mmURLAddress, com.tools20022.repository.msg.CorporateActionNarrative25.mmURLAddress,
					com.tools20022.repository.msg.CorporateActionNarrative26.mmURLAddress, com.tools20022.repository.msg.CorporateActionNarrative39.mmURLAddress);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentationLocation";
			definition = "Information on where additional information published for the event, can be received. for instance the address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected SecuritiesQuantity securitiesQuantitySought;
	/**
	 * Quantity of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
	 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmSecuritiesQuantitySought
	 * CorporateAction2.mmSecuritiesQuantitySought}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantitySought = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction2.mmSecuritiesQuantitySought);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantitySought";
			definition = "Quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected YesNoIndicator partialElectionIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmPartialElectionIndicator
	 * CorporateAction2.mmPartialElectionIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPartialElectionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction2.mmPartialElectionIndicator);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialElectionIndicator";
			definition = "Specifies if the issuer will allow the agent to accept partial elections. It is to allow split voting over options. It allows the client to elect more than one option to be selected per designated holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CorporateActionPartyRole corporateActionPartyRole;
	/**
	 * Specifies the role played by a party in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmCorporateActionEvent
	 * CorporateActionPartyRole.mmCorporateActionEvent}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionPartyRole";
			definition = "Specifies the role played by a party in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MarketClaim> marketClaim;
	/**
	 * Market claim information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmRelatedCorporateEvent
	 * MarketClaim.mmRelatedCorporateEvent}</li>
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
	public static final MMBusinessAssociationEnd mmMarketClaim = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Market claim information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmRelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmObject();
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * Specifies the conditions under which securities can be acquired as part
	 * of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
	 * BiddingConditions.mmEvent}</li>
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
	public static final MMBusinessAssociationEnd mmBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ClassAction> relatedClassAction;
	/**
	 * Specifies the underlying class action related to the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCorporateEvent
	 * ClassAction.mmCorporateEvent}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedClassAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClassAction";
			definition = "Specifies the underlying class action related to the event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.mmCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEventRegistration> corporateActionEventRegistration;
	/**
	 * Official registration of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
	 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEventRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventRegistration";
			definition = "Official registration of the event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
		}
	};
	protected SuspensionPeriod suspensionPeriod;
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
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
	 * SuspensionPeriod.mmCorporateActionEvent}</li>
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
	public static final MMBusinessAssociationEnd mmSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspensionPeriod";
			definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected Lottery lottery;
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
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
	 * Lottery.mmRelatedCorporateEvent}</li>
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
	public static final MMBusinessAssociationEnd mmLottery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Organisation of draws for cash prizes on bonds (instead of coupon payments). Every issued bond (similar to a lottery ticket) has an equal opportunity at winning payments in the draws.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
		}
	};
	protected RemarketingMarginTypeCode marginType;
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
	public static final MMBusinessAttribute mmMarginType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginType";
			definition = "Specifies the margin type for a remarketing procedure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemarketingMarginTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Meeting> relatedMeeting;
	/**
	 * Provides information on the meeting related to the corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
	 * Meeting.mmCorporateEvent}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Provides information on the meeting  related to the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionServicing> services;
	/**
	 * Specifies the different services linked to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
	 * CorporateActionServicing.mmEvent}</li>
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
	public static final MMBusinessAssociationEnd mmServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Specifies the different services linked to a corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Issuance> issuance;
	/**
	 * Information specified when the corporate event relates to the issuance of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmEventInformation
	 * Issuance.mmEventInformation}</li>
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
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Information specified when the corporate event relates to the issuance of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmEventInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesModification> securitiesModification;
	/**
	 * Modification of the reference data of a security or of the organisation
	 * that issued it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
	 * SecuritiesModification.mmRelatedCorporateEvent}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesModification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Modification of the reference data of a security or of the organisation that issued it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmRelatedCorporateEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected DateTimePeriod tradingPeriod;
	/**
	 * Period during which a financial instrument is available for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
	 * DateTimePeriod.mmRelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTradingPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption4.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption10.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption13.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption17.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption24.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption29.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption33.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption38.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption37.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption39.mmTradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes3.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption6.mmTradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes12.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption12.mmTradingPeriod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption14.mmTradingPeriod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption22.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption25.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption30.mmTradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes46.mmTradingPeriod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.mmTradingPeriod, com.tools20022.repository.msg.SecurityOption1.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption40.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption45.mmTradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes68.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption49.mmTradingPeriod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption57.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption59.mmTradingPeriod,
					com.tools20022.repository.msg.SecuritiesOption61.mmTradingPeriod);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Tax transactionTax;
	/**
	 * Tax rate of financial transactions related to an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
	 * Tax.mmCorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTransactionTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate48.mmFinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate49.mmFinancialTransactionTaxRate,
					com.tools20022.repository.msg.CorporateActionRate58.mmFinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate65.mmFinancialTransactionTaxRate,
					com.tools20022.repository.msg.CorporateActionRate69.mmFinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate72.mmFinancialTransactionTaxRate,
					com.tools20022.repository.msg.CorporateActionRate77.mmFinancialTransactionTaxRate, com.tools20022.repository.msg.CorporateActionRate75.mmFinancialTransactionTaxRate);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax rate of financial transactions related to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCorporateActionEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected ConsentTypeCode consentType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmConsentType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction12.mmConsentType, com.tools20022.repository.choice.ConsentTypeFormat1Choice.mmCode,
					com.tools20022.repository.choice.ConsentTypeFormat1Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction17.mmConsentType, com.tools20022.repository.choice.ConsentTypeFormat3Choice.mmCode,
					com.tools20022.repository.choice.ConsentTypeFormat3Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction31.mmConsentType, com.tools20022.repository.choice.ConsentTypeFormat4Choice.mmCode,
					com.tools20022.repository.choice.ConsentTypeFormat4Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction40.mmConsentType, com.tools20022.repository.choice.ConsentTypeFormat5Choice.mmCode,
					com.tools20022.repository.choice.ConsentTypeFormat5Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentType";
			definition = "Corporate actions may be approved by shareholders without a meeting or a vote by means of execution of a consent by a majority of shareholders entitled to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsentTypeCode.mmObject();
		}
	};
	protected ProceedsDefinition proceedsDefinition;
	/**
	 * Specifies the proceeds of a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
	 * ProceedsDefinition.mmCorporateAction}</li>
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
	public static final MMBusinessAssociationEnd mmProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEvent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Specifies the proceeds of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEvent";
				definition = "An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCorporateEvent, com.tools20022.repository.entity.ContactPoint.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmBookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmRelatedCorporateAction, com.tools20022.repository.entity.Tax.mmCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEvent,
						com.tools20022.repository.entity.Issuance.mmEventInformation, com.tools20022.repository.entity.ProceedsDefinition.mmCorporateAction, com.tools20022.repository.entity.ClassAction.mmCorporateEvent,
						com.tools20022.repository.entity.SecuritiesModification.mmRelatedCorporateEvent, com.tools20022.repository.entity.BiddingConditions.mmEvent,
						com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent, com.tools20022.repository.entity.CorporateActionServicing.mmEvent,
						com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCorporateAction,
						com.tools20022.repository.entity.MarketClaim.mmRelatedCorporateEvent, com.tools20022.repository.entity.SuspensionPeriod.mmCorporateActionEvent, com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent,
						com.tools20022.repository.entity.Meeting.mmCorporateEvent, com.tools20022.repository.entity.CorporateActionPartyRole.mmCorporateActionEvent);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventAndBalance1.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance2.mmGeneralInformation,
						com.tools20022.repository.msg.CorporateActionEventAndBalance3.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmGeneralInformation,
						com.tools20022.repository.msg.CorporateActionEventAndBalance5.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance6.mmGeneralInformation,
						com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance8.mmGeneralInformation,
						com.tools20022.repository.msg.SecuritiesOption3.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption8.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption18.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption20.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption26.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption31.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption35.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption36.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption4.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption10.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption13.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption17.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption24.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption29.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption33.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption38.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption37.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption39.mmRateDetails,
						com.tools20022.repository.msg.CorporateAction3.mmDateDetails, com.tools20022.repository.msg.CorporateAction3.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction3.mmRateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption6.mmRateDetails, com.tools20022.repository.msg.CorporateAction4.mmDateDetails, com.tools20022.repository.msg.CorporateAction4.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction4.mmRateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption12.mmRateDetails, com.tools20022.repository.msg.CorporateAction5.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction5.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction5.mmRateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption14.mmRateDetails,
						com.tools20022.repository.msg.CorporateAction6.mmDateDetails, com.tools20022.repository.msg.CorporateAction6.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction6.mmRateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption22.mmRateDetails, com.tools20022.repository.msg.CorporateAction7.mmDateDetails, com.tools20022.repository.msg.CorporateAction7.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction7.mmRateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption25.mmRateDetails, com.tools20022.repository.msg.CorporateAction8.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction8.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction8.mmRateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption30.mmRateDetails,
						com.tools20022.repository.msg.CorporateAction10.mmDateDetails, com.tools20022.repository.msg.CorporateAction10.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction10.mmRateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction11.mmDateDetails, com.tools20022.repository.msg.CorporateAction11.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction11.mmRateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction2.mmDateDetails, com.tools20022.repository.msg.CorporateAction2.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction2.mmRateAndAmountDetails,
						com.tools20022.repository.msg.CorporateAction13.mmDateDetails, com.tools20022.repository.msg.CorporateAction12.mmDateDetails, com.tools20022.repository.msg.CorporateAction12.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction12.mmRateAndAmountDetails, com.tools20022.repository.msg.CorporateAction14.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption42.mmRateDetails,
						com.tools20022.repository.msg.SecuritiesOption40.mmRateDetails, com.tools20022.repository.msg.CorporateAction20.mmDateDetails, com.tools20022.repository.msg.CorporateAction18.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction17.mmDateDetails, com.tools20022.repository.msg.CorporateAction17.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction17.mmRateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption48.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption45.mmRateDetails, com.tools20022.repository.msg.CorporateActionSD12.mmEventStage,
						com.tools20022.repository.msg.CorporateAction24.mmDateDetails, com.tools20022.repository.msg.CorporateAction30.mmDateDetails, com.tools20022.repository.msg.CorporateAction28.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction29.mmDateDetails, com.tools20022.repository.msg.CorporateAction33.mmDateDetails, com.tools20022.repository.msg.CorporateAction32.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction31.mmDateDetails, com.tools20022.repository.msg.CorporateAction31.mmPeriodDetails, com.tools20022.repository.msg.CorporateAction31.mmRateAndAmountDetails,
						com.tools20022.repository.msg.SecuritiesOption49.mmRateDetails, com.tools20022.repository.msg.CorporateActionEventAndBalance9.mmGeneralInformation, com.tools20022.repository.msg.SecuritiesOption50.mmRateDetails,
						com.tools20022.repository.msg.CorporateAction34.mmDateDetails, com.tools20022.repository.msg.CorporateAction35.mmDateDetails, com.tools20022.repository.msg.CorporateAction36.mmDateDetails,
						com.tools20022.repository.msg.CorporateAction38.mmDateDetails, com.tools20022.repository.msg.CorporateAction40.mmDateDetails, com.tools20022.repository.msg.CorporateAction40.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction40.mmRateAndAmountDetails, com.tools20022.repository.msg.SecuritiesOption55.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption57.mmRateDetails,
						com.tools20022.repository.msg.CorporateActionEventAndBalance10.mmGeneralInformation, com.tools20022.repository.msg.SecuritiesOption60.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption59.mmRateDetails,
						com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmGeneralInformation, com.tools20022.repository.msg.SecuritiesOption61.mmRateDetails,
						com.tools20022.repository.msg.CorporateActionEventAndBalance12.mmGeneralInformation, com.tools20022.repository.msg.SecuritiesOption63.mmRateDetails);
				subType_lazy = () -> Arrays.asList(VoluntaryCorporateAction.mmObject(), MandatoryCorporateAction.mmObject());
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.CorporateActionEvent.mmType, com.tools20022.repository.entity.CorporateActionEvent.mmMandatoryVoluntaryEventType,
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
								com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition);
				derivationComponent_lazy = () -> ListBuilderForCorporateActionEvent_00.addElems(new ArrayList<>());
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventTypeV3Code getType() {
		return type;
	}

	public void setType(CorporateActionEventTypeV3Code type) {
		this.type = type;
	}

	public CorporateActionMandatoryVoluntaryCode getMandatoryVoluntaryEventType() {
		return mandatoryVoluntaryEventType;
	}

	public void setMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntaryCode mandatoryVoluntaryEventType) {
		this.mandatoryVoluntaryEventType = mandatoryVoluntaryEventType;
	}

	public Security getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public void setUnderlyingSecurity(com.tools20022.repository.entity.Security underlyingSecurity) {
		this.underlyingSecurity = underlyingSecurity;
	}

	public List<CorporateActionPrice> getCorporateActionPrice() {
		return corporateActionPrice;
	}

	public void setCorporateActionPrice(List<com.tools20022.repository.entity.CorporateActionPrice> corporateActionPrice) {
		this.corporateActionPrice = corporateActionPrice;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Max350Text getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(Max350Text registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	public Max350Text getBasketOrIndexInformation() {
		return basketOrIndexInformation;
	}

	public void setBasketOrIndexInformation(Max350Text basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
	}

	public Deadline getDeadline() {
		return deadline;
	}

	public void setDeadline(com.tools20022.repository.entity.Deadline deadline) {
		this.deadline = deadline;
	}

	public AdditionalBusinessProcessCode getAdditionalBusinessProcess() {
		return additionalBusinessProcess;
	}

	public void setAdditionalBusinessProcess(AdditionalBusinessProcessCode additionalBusinessProcess) {
		this.additionalBusinessProcess = additionalBusinessProcess;
	}

	public ISODateTime getTradingDate() {
		return tradingDate;
	}

	public void setTradingDate(ISODateTime tradingDate) {
		this.tradingDate = tradingDate;
	}

	public CorporateActionFeesAndCharges getCorporateActionCharge() {
		return corporateActionCharge;
	}

	public void setCorporateActionCharge(com.tools20022.repository.entity.CorporateActionFeesAndCharges corporateActionCharge) {
		this.corporateActionCharge = corporateActionCharge;
	}

	public ISODateTime getPariPassuDate() {
		return pariPassuDate;
	}

	public void setPariPassuDate(ISODateTime pariPassuDate) {
		this.pariPassuDate = pariPassuDate;
	}

	public Max350Text getInformationConditions() {
		return informationConditions;
	}

	public void setInformationConditions(Max350Text informationConditions) {
		this.informationConditions = informationConditions;
	}

	public List<SecuritiesQuantity> getFractionalQuantity() {
		return fractionalQuantity;
	}

	public void setFractionalQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> fractionalQuantity) {
		this.fractionalQuantity = fractionalQuantity;
	}

	public CorporateActionEventProcessingTypeCode getEventProcessingType() {
		return eventProcessingType;
	}

	public void setEventProcessingType(CorporateActionEventProcessingTypeCode eventProcessingType) {
		this.eventProcessingType = eventProcessingType;
	}

	public List<CorporateActionStatus> getCorporateActionStatus() {
		return corporateActionStatus;
	}

	public void setCorporateActionStatus(List<com.tools20022.repository.entity.CorporateActionStatus> corporateActionStatus) {
		this.corporateActionStatus = corporateActionStatus;
	}

	public ISODateTime getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(ISODateTime announcementDate) {
		this.announcementDate = announcementDate;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public ISODateTime getFurtherDetailsAnnouncementDate() {
		return furtherDetailsAnnouncementDate;
	}

	public void setFurtherDetailsAnnouncementDate(ISODateTime furtherDetailsAnnouncementDate) {
		this.furtherDetailsAnnouncementDate = furtherDetailsAnnouncementDate;
	}

	public ISODateTime getMarginFixingDate() {
		return marginFixingDate;
	}

	public void setMarginFixingDate(ISODateTime marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
	}

	public ISODate getResultPublicationDate() {
		return resultPublicationDate;
	}

	public void setResultPublicationDate(ISODate resultPublicationDate) {
		this.resultPublicationDate = resultPublicationDate;
	}

	public ISODateTime getUnconditionalDate() {
		return unconditionalDate;
	}

	public void setUnconditionalDate(ISODateTime unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
	}

	public ISODateTime getWhollyUnconditionalDate() {
		return whollyUnconditionalDate;
	}

	public void setWhollyUnconditionalDate(ISODateTime whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
	}

	public ISODateTime getLapsedDate() {
		return lapsedDate;
	}

	public void setLapsedDate(ISODateTime lapsedDate) {
		this.lapsedDate = lapsedDate;
	}

	public DateTimePeriod getBookClosurePeriod() {
		return bookClosurePeriod;
	}

	public void setBookClosurePeriod(com.tools20022.repository.entity.DateTimePeriod bookClosurePeriod) {
		this.bookClosurePeriod = bookClosurePeriod;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public YesNoIndicator getRestrictionIndicator() {
		return restrictionIndicator;
	}

	public void setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
	}

	public CorporateActionEventStageCode getEventStage() {
		return eventStage;
	}

	public void setEventStage(CorporateActionEventStageCode eventStage) {
		this.eventStage = eventStage;
	}

	public List<ContactPoint> getDocumentationLocation() {
		return documentationLocation;
	}

	public void setDocumentationLocation(List<com.tools20022.repository.entity.ContactPoint> documentationLocation) {
		this.documentationLocation = documentationLocation;
	}

	public SecuritiesQuantity getSecuritiesQuantitySought() {
		return securitiesQuantitySought;
	}

	public void setSecuritiesQuantitySought(com.tools20022.repository.entity.SecuritiesQuantity securitiesQuantitySought) {
		this.securitiesQuantitySought = securitiesQuantitySought;
	}

	public YesNoIndicator getPartialElectionIndicator() {
		return partialElectionIndicator;
	}

	public void setPartialElectionIndicator(YesNoIndicator partialElectionIndicator) {
		this.partialElectionIndicator = partialElectionIndicator;
	}

	public CorporateActionPartyRole getCorporateActionPartyRole() {
		return corporateActionPartyRole;
	}

	public void setCorporateActionPartyRole(com.tools20022.repository.entity.CorporateActionPartyRole corporateActionPartyRole) {
		this.corporateActionPartyRole = corporateActionPartyRole;
	}

	public List<MarketClaim> getMarketClaim() {
		return marketClaim;
	}

	public void setMarketClaim(List<com.tools20022.repository.entity.MarketClaim> marketClaim) {
		this.marketClaim = marketClaim;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public void setBiddingConditions(com.tools20022.repository.entity.BiddingConditions biddingConditions) {
		this.biddingConditions = biddingConditions;
	}

	public List<ClassAction> getRelatedClassAction() {
		return relatedClassAction;
	}

	public void setRelatedClassAction(List<com.tools20022.repository.entity.ClassAction> relatedClassAction) {
		this.relatedClassAction = relatedClassAction;
	}

	public List<CorporateActionEventRegistration> getCorporateActionEventRegistration() {
		return corporateActionEventRegistration;
	}

	public void setCorporateActionEventRegistration(List<com.tools20022.repository.entity.CorporateActionEventRegistration> corporateActionEventRegistration) {
		this.corporateActionEventRegistration = corporateActionEventRegistration;
	}

	public SuspensionPeriod getSuspensionPeriod() {
		return suspensionPeriod;
	}

	public void setSuspensionPeriod(com.tools20022.repository.entity.SuspensionPeriod suspensionPeriod) {
		this.suspensionPeriod = suspensionPeriod;
	}

	public Lottery getLottery() {
		return lottery;
	}

	public void setLottery(com.tools20022.repository.entity.Lottery lottery) {
		this.lottery = lottery;
	}

	public RemarketingMarginTypeCode getMarginType() {
		return marginType;
	}

	public void setMarginType(RemarketingMarginTypeCode marginType) {
		this.marginType = marginType;
	}

	public List<Meeting> getRelatedMeeting() {
		return relatedMeeting;
	}

	public void setRelatedMeeting(List<com.tools20022.repository.entity.Meeting> relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
	}

	public List<CorporateActionServicing> getServices() {
		return services;
	}

	public void setServices(List<com.tools20022.repository.entity.CorporateActionServicing> services) {
		this.services = services;
	}

	public List<Issuance> getIssuance() {
		return issuance;
	}

	public void setIssuance(List<com.tools20022.repository.entity.Issuance> issuance) {
		this.issuance = issuance;
	}

	public List<SecuritiesModification> getSecuritiesModification() {
		return securitiesModification;
	}

	public void setSecuritiesModification(List<com.tools20022.repository.entity.SecuritiesModification> securitiesModification) {
		this.securitiesModification = securitiesModification;
	}

	public DateTimePeriod getTradingPeriod() {
		return tradingPeriod;
	}

	public void setTradingPeriod(com.tools20022.repository.entity.DateTimePeriod tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
	}

	public Tax getTransactionTax() {
		return transactionTax;
	}

	public void setTransactionTax(com.tools20022.repository.entity.Tax transactionTax) {
		this.transactionTax = transactionTax;
	}

	public ConsentTypeCode getConsentType() {
		return consentType;
	}

	public void setConsentType(ConsentTypeCode consentType) {
		this.consentType = consentType;
	}

	public ProceedsDefinition getProceedsDefinition() {
		return proceedsDefinition;
	}

	public void setProceedsDefinition(com.tools20022.repository.entity.ProceedsDefinition proceedsDefinition) {
		this.proceedsDefinition = proceedsDefinition;
	}
}